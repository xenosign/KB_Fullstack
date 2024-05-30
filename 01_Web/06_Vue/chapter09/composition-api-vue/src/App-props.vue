<template>
  <div>
    <PropsChild :msg="msg" />
  </div>
</template>

<script setup>
import { ref, reactive, computed } from 'vue';
import PropsChild from './components/PropsChild.vue';

const msg = ref('props 로 전달 될 메세지');

const totalClicked = ref(0);
const count = ref(2);
const double = computed(function () {
  totalClicked.value++;
  return count.value * 2;
});

function increment() {
  count.value++;
  // totalClicked.value++;
}

function decrement() {
  count.value--;
  // totalClicked.value++;
}
</script>
