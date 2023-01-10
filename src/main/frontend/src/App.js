import React, {useEffect, useState} from "react";
import {Routes, Route, Link, Switch} from "react-router-dom";
import axios from "axios";
import Home from "./pages/Home"
import About from "./pages/About";


const App = () => {
  return (
    <div className="App">
      <nav>
        <Link to="/">성유물 등록</Link> |   
        <Link to="/about">성유물 리스트</Link>
      </nav>
        <Routes>
          <Route path="/" element={<Home/>}/>
          <Route path="/about" element = {<About/>}/>
        </Routes>
    </div>
  );
}

export default App;