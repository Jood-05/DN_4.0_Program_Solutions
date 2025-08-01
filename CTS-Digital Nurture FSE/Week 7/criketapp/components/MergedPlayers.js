import React from "react";

const MergedPlayers = () => {
  const T20Players = [
    { name: "Rishabh" },
    { name: "Shreyas" },
    { name: "Gill" }
  ];

  const RanjiTrophyPlayers = [
    { name: "Prithvi" },
    { name: "Sarfaraz" },
    { name: "Ruturaj" }
  ];

  const merged = [...T20Players, ...RanjiTrophyPlayers];

  return (
    <div>
      <h3>List of Indian Players Merged:</h3>
      <ul>
        {merged.map((player, idx) => (
          <li key={idx}>{player.name}</li>
        ))}
      </ul>
    </div>
  );
};

export default MergedPlayers;


