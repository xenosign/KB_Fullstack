const tetzObj = {
  name: '이효석',
  isOld: true,
  sayHello: function () {
    console.log(this.name);
  },
  nestedObj: {
    name: '방시혁',
    isOld: true,
    sayHello: function () {
      console.log(this.name);
    },
  },
};

// tetzObj.sayHello();
// tetzObj.nestedObj.sayHello();

// getKeyValue(obj, 'name');

// function getKeyValue(obj, key) {
//   console.log(obj[key]);
// }

const obj = {
  name: '이효석',
  isOld: true,
  condition: 'good',
};

for (let key in obj) {
  console.log(`key 값은 ${key} 이고, value ${obj[key]} 입니다`);
}
