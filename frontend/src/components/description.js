import { Grid, Typography } from "@mui/material";
import React, { useEffect, useState } from "react";
import { useParams } from "react-router-dom";
import SocietyDetailService from "../services/societyDetailService";

export default function Description() {
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
      <Grid containerSpacing={2}>
        <Typography
          sx={{
            fontWeight: "bold",
            fontSize: 35,
            fontFamily: "sans-serif",
            textAlign: "center",
            lineHeight: 3,
          }}
        >
          {societies.societyName}
        </Typography>
        <Typography
          sx={{
            direction: "ltr",
            textIndent: 50,
            textAlign: "left",
            fontSize: 20,
          }}
        >
          <p>{societies.societyDescription}</p>
        </Typography>
      </Grid>
    </>
  );
}
