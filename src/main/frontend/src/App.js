import React,{useState,useEffect} from 'react';
import logo from './logo.svg';
import './App.css';
import axios from 'axios';

const UserProfiles = () =>{
    const fetchUserProfiles =() => {
        axios.get("https://192.168.0.108.:1111/api/v1/user-profile").then(res => {
            console.log(res);
        });
    };
    useEffect(() => {
            fetchUserProfiles();
    },[])
    
    return <h1>Hello</h1>
}


function App() {
  return (
    <div className="App">
      <UserProfiles/>
    </div>
  );
}

export default App;
