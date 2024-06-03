<template>
  <div>
    <nav>
      <!-- 각각 페이지로 이동하기 위한 router-link 설정 -->
      <router-link to="/">홈페이지</router-link>
      &nbsp;
      <router-link to="/login">로그인</router-link>
      &nbsp;
      <router-link to="/todo">Todolist</router-link>
    </nav>
    <!-- route 에 의해 매칭된 컴포넌트가 출력될 위치를 지정하는 router-view -->
    <router-view />
  </div>
</template>

<script setup></script>
