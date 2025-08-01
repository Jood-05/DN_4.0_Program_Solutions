import React, { useState } from 'react';

function CurrencyConvertor() {
  const [amount, setAmount] = useState('');
  const [currency, setCurrency] = useState('Euro');

  const handleSubmit = (e) => {
    e.preventDefault();
    let result = 0;

    if (currency === 'Euro') {
      result = amount * 80; // Example: 1 Euro = 80 INR
    }

    alert(`Converting to ${currency} Amount is ${result}`);
  };

  return (
    <div>
      <h2 style={{ color: 'green' }}>Currency Convertor!!!</h2>
      <form onSubmit={handleSubmit}>
        <label>Amount: </label>
        <input
          type="number"
          value={amount}
          onChange={(e) => setAmount(e.target.value)}
        />
        <br /><br />
        <label>Currency: </label>
        <select value={currency} onChange={(e) => setCurrency(e.target.value)}>
          <option>Euro</option>
        </select>
        <br /><br />
        <button type="submit">Submit</button>
      </form>
    </div>
  );
}

export default CurrencyConvertor;
