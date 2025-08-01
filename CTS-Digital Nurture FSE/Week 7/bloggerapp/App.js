import React, { useState } from 'react';
import CourseDetails from './components/CourseDetails';
import BookDetails from './components/BookDetails';
import BlogDetails from './components/BlogDetails';

function App() {
  const [showCourses, setShowCourses] = useState(true);
  const [showBooks, setShowBooks] = useState(true);
  const [showBlogs, setShowBlogs] = useState(true);

  return (
    <div style={{ display: 'flex', justifyContent: 'space-around', padding: '50px' }}>
      {/* Conditional rendering with && */}
      {showCourses && <CourseDetails />}

      {/* Conditional rendering with ternary */}
      {showBooks ? <BookDetails /> : <p>Books are hidden</p>}

      {/* Conditional rendering with variable assignment */}
      {(() => {
        if (showBlogs) {
          return <BlogDetails />;
        } else {
          return <p>No blogs to show</p>;
        }
      })()}
    </div>
  );
}

export default App;
