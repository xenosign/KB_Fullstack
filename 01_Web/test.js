const tetzObj = {
  name: '이효석',
  hobbies: ['Lol', 'Tekken', 'Bicycle'],
};

const strTetzObj = JSON.stringify(tetzObj);
console.log(typeof strTetzObj);
console.log(strTetzObj);
console.log(strTetzObj.name);

console.log('----------------------------');

const objTetzBack = JSON.parse(strTetzObj);
console.log(typeof objTetzBack);
console.log(objTetzBack);
console.log(objTetzBack.name);
