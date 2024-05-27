const aClassArr = [
  { id: 1, name: '김연지' },
  { id: 2, name: '최호진' },
  { id: 3, name: '김이수' },
  { id: 4, name: '정지희' },
  { id: 5, name: '최현수' },
  { id: 6, name: '문준일' },
  { id: 7, name: '이예지' },
  { id: 8, name: '김서연' },
  { id: 9, name: '공연정' },
  { id: 10, name: '나건우' },
  { id: 11, name: '박소해' },
  { id: 12, name: '이승아' },
  { id: 13, name: '최규찬' },
  { id: 14, name: '임준수' },
  { id: 15, name: '최민준' },
  { id: 16, name: '권오현' },
  { id: 17, name: '박혜원' },
  { id: 18, name: '김연비' },
  { id: 19, name: '김시완' },
  { id: 20, name: '이태웅' },
  { id: 21, name: '김동준' },
];

function findIndex(arr, name) {
  let index = -1;
  for (let i = 0; i < arr.length; i++) {
    if (arr[i].name === name) index = i;
  }
  return index;
}

function addProperty(arr) {
  for (let i = 0; i < arr.length; i++) {
    arr[i].condition = 'good';
  }
}

// console.log(findIndex(aClassArr, '김시완'));

// addProperty(aClassArr);
// console.log(aClassArr);

// const findedIndex = aClassArr.findIndex(function (student, index) {
//   console.log(student, index);
//   return student.name === '김시완';
// });

// const findedIndex2 = aClassArr.findIndex(
//   (student) => student.name === '김시완'
// );

// console.log(findedIndex, findedIndex2);

// aClassArr.배열함수(function (각각의배열) {
//   return 원하는조건;
// })

// aClassArr.배열함수((각각의배열) => 원하는조건);

// const overIdTenStudents = aClassArr.filter(function (student) {
//   return student.id >= 10;
// });

// console.log(overIdTenStudents);

// const addedAClassArr = aClassArr.map(function (student) {
//   return {
//     ...student,
//     condition: 'good',
//   };
// });

const sumId = aClassArr.reduce(function (acc, cur, index) {
  return (acc += cur.name);
}, '');

console.log(sumId);

// console.log(sumId);

// aClassArr.reduce(function (합계, 각각의배열, ))

// aClassArr.map(function (각각의배열, 배열인덱스) {
//   return 원하는배열의값;
// });

// aClassArr.배열함수((각각의배열, 배열인덱스) => 원하는조건);

// aClassArr.배열함수(function (각각의배열, 배열인덱스) {
//   return 원하는조건;
// });

// aClassArr.reduce(function (합계, 각각의배열, 배열인덱스) {
//   return 합계에대한처리;
// });

const obj = {
  name: 'lhs',
  eat: function () {
    console.log(obj.name);
  },
};

obj.eat();
