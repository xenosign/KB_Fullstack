const promise = new Promise((res, rej) => {
  res('first!');
});

promise
  .then((msg) => {
    console.log(msg);
    return 'second';
  })
  .then((msg) => {
    console.log(msg);
    return 'third';
  })
  .then((msg) => {
    console.log(msg);
  })
  .catch((err) => {
    console.log(err);
  });
