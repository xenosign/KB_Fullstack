import { createRouter, createWebHistory } from 'vue-router';
import Home from '@/pages/Home.vue';
import Login from '@/pages/Login.vue';
import Todo from '@/pages/Todo.vue';

const router = createRouter({
  history: createWebHistory(import.meta.env.BASE_URL),
  routes: [
    {
      path: '/',
      name: 'home',
      component: Home,
    },
    {
      path: '/login',
      name: 'login',
      component: Login,
    },
    {
      path: '/todo',
      name: 'todo',
      component: Todo,
      meta: { requiresAuth: true },
    },
  ],
});

router.beforeEach((to, from, next) => {
  console.log(to.matched[0].path);
  if (to.matched[0].path === '/todo') {
    if (localStorage.getItem('auth') !== 'true') {
      alert('로그인이 필요합니다!');
      next({ name: 'login' });
    } else {
      next();
    }
  } else {
    next();
  }

  // if (to.matched.some((item) => item.meta.requiresAuth)) {
  //   if (localStorage.getItem('auth') !== 'true') {
  //     alert('로그인이 필요합니다!');
  //     next({ name: 'login' });
  //   } else {
  //     next();
  //   }
  // } else {
  //   next();
  // }
});

export default router;
