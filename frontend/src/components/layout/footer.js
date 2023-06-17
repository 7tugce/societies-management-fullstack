import { Box, Button, Link, Typography } from "@mui/material";

export default function Footer() {
  return (
    <Box sx={{ bgcolor: "#79113e", p: 6 }} component="footer">
      <Typography variant="h6" align="center" gutterBottom></Typography>
      <Typography
        variant="subtitle1"
        align="center"
        color="text.secondary"
        component="p"
      ></Typography>
      <Typography variant="body2" color="text.secondary" align="center">
        {"Copyright © "}
        <Link color="inherit" href="https://www.firat.edu.tr/" >
          Fırat Üniversitesi
        </Link>{" "}
        {new Date().getFullYear()}
        {""}
      </Typography>
      
    </Box>
  );
}
