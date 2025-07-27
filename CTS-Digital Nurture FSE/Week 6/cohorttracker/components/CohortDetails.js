import React from 'react';
import styles from './CohortDetails.module.css';

function CohortDetails(props) {
  return (
    <div className={styles.box}>
      <h3 style={{ color: props.status === 'ongoing' ? 'green' : 'blue' }}>
        {props.name} ({props.status})
      </h3>
      <dl>
        <dt>Start Date:</dt>
        <dd>{props.startDate}</dd>
        <dt>End Date:</dt>
        <dd>{props.endDate}</dd>
      </dl>
    </div>
  );
}

export default CohortDetails;
