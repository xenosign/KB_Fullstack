const arr = [10, 20, 30, 40];
const [a1, a2, a3] = arr;
console.log(a1, a2, a3);

const p1 = { name: '홍길동', age: 20, gender: 'M' };
const { name: n, age: a, gender } = p1;
console.log(n, a, gender);
