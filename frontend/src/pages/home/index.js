import {
  Box,
  Button,
  Card,
  CardActions,
  CardContent,
  CardMedia,
  Container,
  Grid,
  Pagination,
  Stack,
  Typography,
} from "@mui/material";
import { useEffect, useState } from "react";
import { Link } from "react-router-dom";
import Description from "../../components/description";
import Layout from "../../components/layout";
import SocietyService from "../../services/societyService";

export default function () {
  const [societies, setSocieties] = useState([]);

  useEffect(() => {
    let societyService = new SocietyService();
    societyService.getSocieties().then((result) => setSocieties(result.data));
  });

  return (
    <Layout>
      {/* <Pagination count={10} variant="outlined" color="secondary" />{" "} */}
      <Box
        sx={{
          pt: 8,
          pb: 6,
        }}
      >
        <Container maxWidth="sm">
          <Typography
            component="h1"
            variant="h2"
            align="center"
            color="text.primary"
            gutterBottom
          >
            Kulüplerimiz
          </Typography>
          <Typography
            variant="h5"
            align="center"
            color="text.secondary"
            paragraph
          >
            Fırat Üniversitesi Kulüpleri
          </Typography>
          <Stack
            sx={{ pt: 4 }}
            direction="row"
            spacing={2}
            justifyContent="center"
          >
            <Button bgcolor="#79113e" variant="contained" href="/login">
              ÖĞRENCİ GİRİŞİ
            </Button>
            <Button bgcolor="#79113e" variant="outlined" href="/admin">
              YÖNETİCİ GİRİŞİ
            </Button>
          </Stack>
        </Container>
      </Box>
      <Container sx={{ py: 8 }} maxWidth="md">
        {/* End hero unit */}
        <Grid container spacing={4}>
          {societies.map((society) => (
            <Grid item key={society.id} xs={12} sm={6} md={4}>
              <Card
                sx={{
                  height: "100%",
                  display: "flex",
                  flexDirection: "column",
                }}
              >
                <CardMedia
                  component="img"
                  image={society.societyLogoImageUrl}
                  alt="klüp logosu"
                  width="300px"
                  height="300px"
                />
                <CardContent sx={{ flexGrow: 1 }}>
                  <Typography>{society.societyNameAbbreviation}</Typography>
                  <Typography>{society.societyName}</Typography>
                </CardContent>
                <CardActions>
                  <Link to={`/detail/${society.id}`}>Görüntüle</Link>
                  <Button size="small" href="/apply">
                    Başvur
                  </Button>
                </CardActions>
              </Card>
            </Grid>
          ))}
        </Grid>
      </Container>{" "}
    </Layout>
  );
}
