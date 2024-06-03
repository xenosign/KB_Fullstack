import { createRouter, createWebHistory } from 'vue-router';
// 라우터에 매칭 시키기 위한 컴포넌트 import
import Home from '@/pages/Home.vue';
import Login from '@/pages/Login.vue';
import Todo from '@/pages/Todo.vue';

// createRouter 기능을 활용하여 라우터 설정
const router = createRouter({
  // 현재 주소 값(localhost:5173)을 기준으로 라우팅 하겠다는 선언
  history: createWebHistory(import.meta.env.BASE_URL),
  // 각각 주소에 따라 어떤 컴포넌트로 라우팅 할 것인지 결정하는 routes 설정
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
      // Auth 여부를 확인 후, 인가 된 사용자만 해당 주소로 접근 시키겠다는 옵션 값 설정
      meta: { requiresAuth: true },
    },
  ],
});

// beforeEach 를 이용하여 주소에 대한 요청을 router 가 처리하기 전에
// 원하는 동작을 실행시켜주는 형태의 코드
// beforeEach 는 실제로 테스트 등 다양한 상황에서 실제 작업 수행 전에 무언가를 해야할 때 많이 사용 됩니다

// to 는 요청이 들어온 주소의 목적지, from 은 요청이 들어온 주소가 어디서 왔는지
// next 는 해당 요청을 통과시켜주는 기능
router.beforeEach((to, from, next) => {
  // to.matched 는 위의 라우트(routes)에서 미리 설정한 주소로 들어온 요청을 배열로 모아주는 역할
  // some 은 특정 배열에 조건에 맞는 요소가 하나라도 있으면 true 를 반환하는 배열 함수
  // (item) => item.meta.requiresAuth 구문을 통해 라우트(routes) 에서 설정한 값 중에서
  // requiresAuth 옵션을 준 라우터가 있는지 확인
  // 현재 우리는 /todo 주소에 requiresAuth 를 주었기 때문에 해당 if 문은 true 를 리턴
  if (to.matched.some((item) => item.meta.requiresAuth)) {
    // requiresAuth 옵션이 있는 경우이므로 로그인 과정을 통해 localStorage 의 auth 가 저장 되었는지
    // 확인하는 코드, 실제로는 !== 조건이므로 auth 가 저장 되어 있지 않으면 if 구문이 실행
    if (localStorage.getItem('auth') !== 'true') {
      // 로그인이 안된 상태이므로, alert 으로 로그인이 필요하다고 알려주기
      alert('로그인이 필요합니다!');
      // next 에 router 이름을 전달해서 login 페이지로 이동 시켜버리기
      next({ name: 'login' });
    } else {
      // auth 가 존재하는 상황이므로, 로그인이 된 상황 -> 원래 목적지인 /todo 로 이동 시킨다
      next();
    }
  } else {
    // requiresAuth 로 설정된 주소가 아닌 경우이므로, 굳이 auth 여부를 체크할 필요가 없으므로
    // 바로 이동 시킨다
    next();
  }
});

// router.beforeEach((to, from, next) => {
//   console.log(to.matched[0].path);
//   if (to.matched[0].path === '/todo') {
//     if (localStorage.getItem('auth') !== 'true') {
//       alert('로그인이 필요합니다!');
//       next({ name: 'login' });
//     } else {
//       next();
//     }
//   } else {
//     next();
//   }
// });

export default router;
