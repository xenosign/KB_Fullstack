// setInterval(() => {
//   try {
//     const rand = parseInt(Math.random() * 10);
//     console.log(`생성된 수는 ${rand}`);

//     if (rand > 5) return console.log('아싸 로또 사자!');

//     throw new Error('아... 망했어요');
//   } catch (error) {
//     console.log(error);
//   }
// }, 2000);

const promise = new Promise((resolve, reject) => {
  setTimeout(() => {
    //0 ~ 10 사이의 난수 발생
    let num = parseInt(Math.random() * 10);
    if (num >= 5) {
      reject(num);
    }
    resolve(num);
  }, 1000);
});

async function asyncFunc() {
  try {
    const result = await new promise();
    console.log('무사 통과! 생성된 숫자 :', result);
  } catch (error) {
    console.log('Error 발생! 생성된 숫자 :', error);
  }
}

console.log('## Promise 객체 생성!');

// promise
//   .then((result) => {
//     console.log('무사 통과! 생성된 숫자 :', result);
//   })
//   .catch((error) => {
//     console.log('Error 발생! 생성된 숫자 :', error);
//   });
// console.log('## Promise 객체 생성!');
