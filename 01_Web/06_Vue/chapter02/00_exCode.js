function program() {
  const random = Math.random();
  if (random > 0.5) {
    // Error 가 예상되는 작업
    const someResult = doSomething();

    if (someResult === 'Error') {
      alert('404, 에러 발생!! 비상!!!!!!');
    }
  }
}

program();
