<script setup>
import ParentSlot from './components/ParentSlot.vue';
import ParentFancyPhotoBox from './components/ParentFancyPhotoBox.vue';
import ParentScopedSlot from './components/ParentScopedSlot.vue';
</script>

<template>
  <div>
    <!-- <ParentSlot /> -->
    <!-- <ParentFancyPhotoBox /> -->
    <ParentScopedSlot />
  </div>
</template>

<script>
export default {
  name: 'App',
  components: {
    ParentSlot,
    ParentFancyPhotoBox,
    ParentScopedSlot,
  },
};
</script>

<style scoped></style>
