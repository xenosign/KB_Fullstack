<template>
  <div>
    <input type="text" v-model="name" />
    <button v-on:click="$emit('nameChange', { name })">이름 전달!!</button>
  </div>
</template>

<script>
export default {
  name: 'SendNameComponent',
  data() {
    return {
      name: '',
    };
  },
};
</script>

<style lang="scss" scoped></style>
