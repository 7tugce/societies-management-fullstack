import { Button, Grid } from "@mui/material";
import * as React from "react";
import Description from "../../components/description";
import Photo from "../../components/foto";
import Layout from "../../components/layout";
import SocialMedia from "../../components/socialMedia";
import SocietyService from "../../services/societyService";

export default function Detail() {
  const [societies, setSocieties] = React.useState([]);

  React.useEffect(() => {
    let societyService = new SocietyService();
    societyService.getSocieties().then((result) => setSocieties(result.data));
  });

  return (
    <Layout>
      <Description />
      <Photo />
      <SocialMedia />
      <Grid container spacing={4}>
        <Grid item xs={6}>
          <a href="/">
            <button className="btn" navigate="/">
              Geri dön
            </button>
          </a>
        </Grid>
        <Grid item xs={6}>
          <a href="/apply">
            <button className="btn" navigate="/apply">
              Başvur
            </button>
          </a>
        </Grid>
      </Grid>
    </Layout>
  );
}
