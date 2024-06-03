import { createRouter, createWebHistory } from 'vue-router';
import Home from '@/pages/Home.vue';
import Dynamic from '@/pages/Dynamic.vue';
import NotFound from '@/pages/NotFound.vue';

const router = createRouter({
  history: createWebHistory(import.meta.env.BASE_URL),
  routes: [
    {
      path: '/',
      name: 'home',
      component: Home,
    },
    {
      path: '/about',
      name: 'about',
      component: () => import('@/pages/About.vue'),
    },
    {
      path: '/dynamic/:mood',
      name: 'dynamic',
      component: Dynamic,
      props: true,
    },
    {
      path: '/:pathMatch(.*)*',
      name: 'notFound',
      component: NotFound,
    },
  ],
});

export default router;
