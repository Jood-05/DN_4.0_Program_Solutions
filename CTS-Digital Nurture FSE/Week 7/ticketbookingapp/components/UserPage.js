import React from 'react';
import FlightDetails from './FlightDetails';

function UserPage({ onLogout }) {
  return (
    <div>
      <h1>Welcome back</h1>
      <button onClick={onLogout}>Logout</button>
      <FlightDetails />
      <h2>You can now book tickets!</h2>
      <button>Book Ticket</button>
    </div>
  );
}

export default UserPage;
