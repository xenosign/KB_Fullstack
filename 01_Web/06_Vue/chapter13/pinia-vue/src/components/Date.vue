<template>
  <div>
    <h1>Date</h1>
    <h1>{{ dateMsg }}</h1>
    <button @click="getYear">년도 출력</button>
    <button @click="getMonth">월 출력</button>
    <button @click="getDate">일자 출력</button>
  </div>
</template>

<script setup>
import { computed } from 'vue';
import { useDateStore } from '@/stores/date';

const dateStore = useDateStore();
const { getYear, getMonth, getDate } = dateStore;

const dateMsg = computed(() => dateStore.dateMsg);
</script>
