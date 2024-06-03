<template>
  <div>
    <h1>오늘의 기분은!? {{ msg }}</h1>
    <img :src="imgSrc" :alt="msg" />
  </div>
</template>

<script setup>
import { ref, computed, watch } from 'vue';
import { useRoute } from 'vue-router';

const currentRoute = useRoute();
const mood = ref(currentRoute.params.mood);

watch(
  () => currentRoute.params.mood,
  (newMood) => (mood.value = newMood)
);

const msg = computed(() =>
  mood.value === 'happy' ? '행복합니다' : '씐납니다!'
);

const imgSrc = computed(() =>
  mood.value === 'happy'
    ? 'https://i.pinimg.com/564x/a3/a3/52/a3a352efb5a5829ca7007d86369a0d59.jpg'
    : 'https://lh3.googleusercontent.com/proxy/Zp-FTIpS7lMJdfsxDxSFLRgJ3suEUpunRoFHR-yLXgaqSd5LI5lqan4NR2XgBaFF9lGj4tNLCG8rUsYSQs3gU-AAjMYkflLs0UUk'
);
</script>
