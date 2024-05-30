<template>
  <div>
    <input type="text" v-model.number="inputNum" />
    <button @click="checkAnswer">정답 확인!</button>
  </div>
</template>

<script setup>
import { ref, defineProps, defindEmits } from 'vue';

const props = defineProps({
  rand: {
    type: Number,
    required: true,
  },
});

const inputNum = ref(0);

const emit = defindEmits(['send-msg']);

function checkAnswer() {
  let msg = '';

  if (props.rand === inputNum.value) {
    msg = '정답입니다!';
  } else if (props.rand > inputNum.value) {
    msg = 'UP';
  } else {
    msg = 'DOWN';
  }
  emit('send-msg', msg);
}
</script>
