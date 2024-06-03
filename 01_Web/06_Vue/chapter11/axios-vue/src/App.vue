<template>
  <div>
    <nav>
      <router-link to="/">홈페이지</router-link>
      &nbsp;
      <router-link to="/login">로그인</router-link>
      &nbsp;
      <router-link to="/todo">Todolist</router-link>
    </nav>
    <router-view />
  </div>
</template>

<script setup></script>
