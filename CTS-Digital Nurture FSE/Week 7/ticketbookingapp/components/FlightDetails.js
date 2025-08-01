import React from 'react';

const flights = [
  { id: 1, flight: 'IndiGo 6E 203', time: '10:30 AM', destination: 'Mumbai' },
  { id: 2, flight: 'Air India AI 101', time: '12:00 PM', destination: 'Delhi' },
  { id: 3, flight: 'SpiceJet SG 412', time: '02:45 PM', destination: 'Chennai' },
];

function FlightDetails() {
  return (
    <div style={{ marginTop: '20px' }}>
      <h3>Flight Details</h3>
      <ul style={{ listStyleType: 'none', padding: 0 }}>
        {flights.map(f => (
          <li key={f.id}>
            ✈️ {f.flight} – {f.time} – {f.destination}
          </li>
        ))}
      </ul>
    </div>
  );
}

export default FlightDetails;
