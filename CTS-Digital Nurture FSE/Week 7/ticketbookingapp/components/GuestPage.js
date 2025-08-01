import React from 'react';
import FlightDetails from './FlightDetails';

function GuestPage({ onLogin }) {
  return (
    <div>
      <h1>Please sign up.</h1>
      <button onClick={onLogin}>Login</button>
      <FlightDetails />
    </div>
  );
}

export default GuestPage;
