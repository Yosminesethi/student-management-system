import { useState } from "react";

function App() {
    const [student, setStudent] = useState({})

    const getStudent = async () =>{
      const response = await fetch("http://localhost:8080/student");
      const data = await response.json();

      setStudent(data);
    };

 return (
    <div>
        <h1>Student Management System</h1>

        <h2>Id : {student.id}</h2>
        <h2>Name : {student.name}</h2>
        <h2>Course : {student.course}</h2>

        <button onClick={getStudent}>get student</button>
    </div>
 );
}

export default App;