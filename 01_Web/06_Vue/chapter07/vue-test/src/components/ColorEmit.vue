<template>
  <div>
    <input type="text" v-model.trim="color" />
    <button v-on:click="$emit('colorChange', { color })">색상 전달</button>
  </div>
</template>

<script>
export default {
  name: 'ColorEmit',
  data() {
    return {
      color: '',
    };
  },
};
</script>

<style lang="scss" scoped></style>
