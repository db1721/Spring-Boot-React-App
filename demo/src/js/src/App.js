import logo from './logo.svg';
import './App.css';
import { getAllUsers } from './Users'

function App() {
  getAllUsers().then(res => res.json().then(users => {
    console.log(users);
  } ));
  return (
    <h1>Hello World Spring Boot & React</h1>
  );
};

export default App;
