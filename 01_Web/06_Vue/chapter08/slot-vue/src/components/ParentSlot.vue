<template>
  <div>
    <ChildSlot>
      <h1>장동민 마멋</h1>
      <img
        src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcROkwH8TUwcWI7NzFSSJuTA38CLeBVzi5qY3Q&s"
        alt="장동민마멋"
      />
    </ChildSlot>
  </div>
</template>

<script>
import ChildSlot from './ChildSlot.vue';

export default {
  name: 'ParentSlot',
  components: { ChildSlot },
};
</script>

<style lang="scss" scoped></style>
