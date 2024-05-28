<template>
  <div>
    <h2>{{ todo }}</h2>
    <hr />
  </div>
</template>

<script>
export default {
  name: 'TodoProps',
  props: ['todo'],
};
</script>

<style lang="scss" scoped></style>
