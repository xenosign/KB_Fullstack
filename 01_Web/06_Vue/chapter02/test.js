// const outerObj = {
//   nestedObj: {
//     nestedNestedObj: {
//       nestedNestedNestedObj: {
//         nestedNestedNestedNestedObj: {
//           nestedNestedNestedNestedNestedObj: {
//             sayHello: function () {
//               console.log(this);
//             },
//           },
//         },
//       },
//     },
//   },
// };

// outerObj.nestedObj.sayHello();

// const outerObj = {
//   name: '이효석',
//   sayHello: function () {
//     console.log(this.name);
//   },
//   nestedObj: {
//     name: '고테츠',
//     sayHello: function () {
//       console.log(this.name);
//     },
//   },
// };

// const teztObj = {
//   name: '이효석',
//   isOld: true,
//   condition: 'good',
// };

// for (let key in teztObj) {
//   console.log(`key 값은 ${key} 이고, value 는 ${teztObj[key]} 입니다!`);
// }

// for (let 키를받을변수 in 키를확인할객체) {
//   console.log(키를받을변수);
// }

const arr = [1, 2, 3, 4];

for (let val in arr) {
  console.log(val);
}

// console.log(obj['name'], obj['isOld'], obj['condition']);

// function getKeyValue(obj, key) {
//   if (key in obj) {
//     console.log(obj.key);
//   }
// }

// getKeyValue(obj, 'name');

let student = {};
student.이름 = '홍길동';
student.취미 = '악기';
student.특기 = '프로그래밍';
student.장래희망 = '생명공학과';

student.toString = function () {
  for (let key in this) {
    if (key != 'toString') {
      console.log(key + '\t' + this[key]);
    }
  }
};

student.toString();
