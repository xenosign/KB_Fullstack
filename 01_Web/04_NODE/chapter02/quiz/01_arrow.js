// const getTriangle = function (base, height) {
//   return (base * height) / 2;
// };

// const getTriangleArrow = (base, height) => (base * height) / 2;

// const testFunc = (a, b) => {
//   b = a;
// };
// const testFunc2 = (a, b) => (b = a);

// console.log('testFunc : ', testFunc(1, 2));
// console.log('testFunc2 : ', testFunc2(1, 2));

// console.log('삼각형의 면적:' + getTriangle(5, 2));

const arrowObj = {
  name: '이효석',
  eat: () => {
    console.log(`${this.name} 이 밥을 먹습니다!`);
  },
  showThis: () => {
    console.log(this);
  },
};

const normalObj = {
  name: '이효석',
  eat: function () {
    console.log(`${this.name} 이 밥을 먹습니다!`);
  },
  showThis: function () {
    console.log(this);
  },
};

normalObj.eat();
arrowObj.eat();

normalObj.showThis();
arrowObj.showThis();
