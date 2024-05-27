function foodReport(name, age, ...args) {
  console.log(`${name}, ${age}`);
  console.log(args);
}
foodReport('이몽룡', 20, '짜장면', '냉면', '불고기');
foodReport('홍길동', 16, '초밥');
