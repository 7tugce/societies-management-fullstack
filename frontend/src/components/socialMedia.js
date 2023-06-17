import { Grid, Typography } from "@mui/material";
import React, { useEffect, useState } from "react";
import { Link, useParams } from "react-router-dom";
import SocietyDetailService from "../services/societyDetailService";
import EmailIcon from "@mui/icons-material/Email";
import WebIcon from "@mui/icons-material/Web";
import YouTubeIcon from "@mui/icons-material/YouTube";
import LinkedInIcon from "@mui/icons-material/LinkedIn";
import TwitterIcon from "@mui/icons-material/Twitter";
import InstagramIcon from "@mui/icons-material/Instagram";
import { Label, Message } from "semantic-ui-react";
import { Toast, ToastBody, ToastHeader } from "reactstrap";

export default function SocialMedia() {
  let { id } = useParams();
  const [societies, setSocieties] = useState([]);
  useEffect(() => {
    let societyDetailService = new SocietyDetailService();
    societyDetailService
      .getSocieties(id)
      .then((result) => setSocieties(result.data));
  }, []);



  return (
    <>
    
      <Typography
        sx={{ fontWeight: "bold", textAlign: "center", fontSize: 18 }}
      >
        Sosyal Medya Hesaplarımız
      </Typography>
      <br></br>
      <Typography
        sx={{
          fontWeight: "bold",
          fontFamily: "sans-serif",
          textAlign: "center",
        }}
      >
        <Link href={societies.societyMail} underline="none">
          <EmailIcon /> Mail
        </Link>
        <br></br>
        <Link href={societies.societyWebsite} underline="none">
          <WebIcon /> Website
        </Link>
        <br></br>
        <Link href={societies.societyYoutube} underline="none">
          <YouTubeIcon /> YouTube
        </Link>
        <br></br>
        <Link href={societies.societyLinkedIn} underline="none">
          <LinkedInIcon /> LinkedIn
        </Link>
        <br></br>
        <Link href={societies.societyTwitter} underline="none">
          <TwitterIcon /> Twitter
        </Link>
        <br></br>
        <Link href={societies.societyInstagram} underline="none">
          <InstagramIcon />
          Instagram
        </Link>
        <br></br>
      </Typography>
    
      <div className="p-3 bg-success my-2 rounded">
    <Toast>
      <ToastHeader>
        Şimdiki üye sayımız
      </ToastHeader>
      <ToastBody>
         {societies.societyMembers}
      </ToastBody>
    </Toast>
  </div>
    </>  
  );
}
