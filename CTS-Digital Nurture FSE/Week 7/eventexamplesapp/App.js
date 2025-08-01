import React, { useState } from 'react';
import CurrencyConvertor from './CurrencyConvertor';
import './App.css';

function App() {
  const [count, setCount] = useState(1);

  const increment = () => {
    setCount(prev => prev + 1);
    sayHello();
  };

  const decrement = () => {
    setCount(prev => prev - 1);
  };

  const sayHello = () => {
    console.log("Hello! This is a static message.");
  };

  const sayWelcome = (msg) => {
    alert(`You said: ${msg}`);
  };

  const handleClick = () => {
    alert("I was clicked");
  };

  return (
    <div className="App">
      <h3>{count}</h3>
      <button onClick={increment}>Increment</button>
      <button onClick={decrement}>Decrement</button>
      <br /><br />
      <button onClick={() => sayWelcome("Welcome")}>Say welcome</button>
      <br /><br />
      <button onClick={handleClick}>Click on me</button>

      <hr />

      <CurrencyConvertor />
    </div>
  );
}

export default App;
