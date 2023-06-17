import {
  Grid,
  ImageList,
  ImageListItem,
  ImageListItemBar,
  Typography,
} from "@mui/material";
import React, { useEffect, useState } from "react";
import { useParams } from "react-router-dom";
import { UncontrolledCarousel } from "reactstrap";
import SocietyPhotoService from "../services/societyPhotoService";

export default function Photo() {
  let { id } = useParams();
  const [societyImages, setSocietyImages] = useState([]);
  const [societies, setSocieties] = useState([]);
  useEffect(() => {
    let societyPhotoService = new SocietyPhotoService();
    societyPhotoService
      .getSocieties(id)
      .then((result) => setSocietyImages(result.data));
  }, []);
  return (
    <>
      <ImageList variant="masonry" cols={3} gap={8}>
        {societyImages.map((item) => (
          <ImageListItem>
            <img
              src={`${item.imageUrl}?w=248&fit=crop&auto=format`}
              srcSet={`${item.imageUrl}?w=248&fit=crop&auto=format&dpr=2 2x`}
              loading="lazy"
            />
            <ImageListItemBar position="below" />
          </ImageListItem>
        ))}
      </ImageList>

     
    </>
  );
}
