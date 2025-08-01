import React from 'react';
import './App.css';
import picture from './picture.jpg';


function App() {
  const office = {
    name: "DBS",
    rent: 50000,
    address: "Chennai",
    image: picture,
  };

  const rentColor = office.rent < 60000 ? 'red' : 'green';

  return (
    <div className="App">
      <h1>Office Space , at Affordable Range</h1>
      <img src={office.image} alt="Office" className="office-image" />
      <h2>Name: {office.name}</h2> 
      <p style={{ color: rentColor, fontWeight: 'bold' }}>Rent: Rs. {office.rent}</p>
      <p><strong>Address:</strong> {office.address}</p>
    </div>
  );
}

export default App;
