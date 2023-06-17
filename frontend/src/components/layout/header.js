import { AppBar, Link, TextField, Toolbar } from "@mui/material";

export default function Header() {
  return (
    <AppBar position="sticky" bgcolor="#79113e">
      <Toolbar bgcolor="#79113e">
        <img
          src="https://res.cloudinary.com/dirtkkfqn/image/upload/c_scale,w_225/v1671020125/163291663714_rbxl5c.png"
          alt="FÜ LOGO"
        />

        <Link
          variant="h6"
          margin="2rem"
          noWrap
          color="inherit"
          underline="hover"
          href="https://www.firat.edu.tr/tr"
          fontSize="1em"
        >
          FÜ Anasayfa
        </Link>

        <TextField
          placeholder="🔍 Arama metni "
          sx={{
            right: 30,
            left: 30,
            width: { sm: 300, md: 600 },
          }}
        />
      </Toolbar>
    </AppBar>
  );
}
