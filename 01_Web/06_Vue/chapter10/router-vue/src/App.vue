<script setup></script>

<template>
  <div>
    <nav>
      <router-link to="/">홈페이지</router-link>
      &nbsp;
      <RouterLink to="/about">라우터란!?</RouterLink>
    </nav>
    <RouterView />
  </div>
</template>
