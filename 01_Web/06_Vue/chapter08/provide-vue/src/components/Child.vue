<template>
  <div>
    <GrandChild :drilling="drilling" />
  </div>
</template>

<script>
import GrandChild from './GrandChild.vue';

export default {
  name: 'Child',
  components: { GrandChild },
  props: ['drilling'],
};
</script>
