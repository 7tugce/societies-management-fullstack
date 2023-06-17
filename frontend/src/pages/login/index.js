import { Link } from "@mui/material";
import React, { useState } from "react";
import { Navigate, useNavigate } from "react-router-dom";
import "./style.css";

export default function () {
  const [buttonClick, setButtonClick] = useState("Hoş Geldiniz");
  const [isMouseOver, setMouseOver] = useState(false);
 const navigate = useNavigate();
  function handleLinkClick() {
   
  };

  function handleMouseOver() {
    setMouseOver(true);
  }

  function handleMouseOut() {
    setMouseOver(false);
  }

  return (
    <div>
      <a href="/">
        <button className="btn" navigate="/">
          Geri dön
        </button>
      </a>
      <h1>{buttonClick}</h1>
      <form className="form">
        <input type="email" placeholder="E-mailiniz"></input>
        <input type="password" placeholder="Şifreniz"></input>
        
           <button 
            style={{ backgroundColor: isMouseOver ? "#7efff5" : "white" }}
            onMouseOver={handleMouseOver}
            onMouseOut={handleMouseOut}
            onClick={()=>navigate("/")}
          >
            Giriş Yap
          </button> 
          
       
          
        
      </form>
    </div>
  );
}
