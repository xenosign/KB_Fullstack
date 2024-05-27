setInterval(() => {
  try {
    const rand = parseInt(Math.random() * 10);
    console.log(`생성된 수는 ${rand}`);

    if (rand > 5) return console.log('아싸 로또 사자!');

    throw new Error('망했어요...');
  } catch (error) {
    console.log(error);
  }
}, 2000);

// try {
//   // 에러가 예상되는 작업 코드
// } catch (error) {
//   // 에러 처리 코드
// }
