import * as React from "react";
import CssBaseline from "@mui/material/CssBaseline";
import { createTheme, ThemeProvider } from "@mui/material/styles";
import Footer from "./footer";
import Header from "./header";

const theme = createTheme({
  palette: {
    primary: {
       main: "#79113e",
       
      },
    
  },
  typography: {
    fontFamily: "Montserrat,sans-serif",
  },
  
});

export default function Layout(props) {
  return (
    <ThemeProvider theme={theme}>
      <CssBaseline bgcolor="#79113e" />
      <Header />
      <main>{props.children}</main>

      {/* Footer */}
      <Footer />
      {/* End footer */}
    </ThemeProvider>
  );
}
