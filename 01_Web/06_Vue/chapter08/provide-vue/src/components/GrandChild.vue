<template>
  <div>
    <h1>드디어 도착한 props 의 내용은!?</h1>
    <h2>{{ drilling }}</h2>
  </div>
</template>

<script>
export default {
  name: 'GrandChild',
  props: ['drilling'],
};
</script>

<style lang="scss" scoped></style>
