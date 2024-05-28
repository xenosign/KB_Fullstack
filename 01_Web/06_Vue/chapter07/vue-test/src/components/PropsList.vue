<template>
  <div>
    <h1>{{ siteName }}</h1>
    <a v-bind:href="siteUrl">{{ siteName }} 링크</a>
    <h2>방문 여부 : {{ visited }}</h2>
  </div>
</template>

<script>
export default {
  name: 'PropsList',
  props: ['siteName', 'siteUrl', 'visited'],
};
</script>

<style lang="scss" scoped></style>
