
import React from "react";

const OddEvenPlayers = ({ list }) => {
  const odd = list.filter((_, i) => i % 2 !== 0);
  const even = list.filter((_, i) => i % 2 === 0);

  return (
    <div>
      <h3>Odd Players</h3>
      <ul>
        {odd.map((item, idx) => (
          <li key={idx}>{item.name}</li>
        ))}
      </ul>

      <h3>Even Players</h3>
      <ul>
        {even.map((item, idx) => (
          <li key={idx}>{item.name}</li>
        ))}
      </ul>
    </div>
  );
  };

export default OddEvenPlayers;

