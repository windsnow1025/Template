import { AppBar, IconButton, Typography, Menu, MenuItem } from "@mui/material";
import AuthDiv from "./AuthDiv";
import ThemeSelect from "./ThemeSelect";
import React, { useState } from "react";
import HomeIcon from '@mui/icons-material/Home';
import MenuIcon from '@mui/icons-material/Menu';
import Link from 'next/link';

const HeaderAppBar = ({ title, useAuthDiv = true, systemTheme, setSystemTheme }) => {
  const [anchorEl, setAnchorEl] = useState(null);

  const handleMenuOpen = (event) => {
    setAnchorEl(event.currentTarget);
  };

  const handleMenuClose = () => {
    setAnchorEl(null);
  };

  return (
    <AppBar position="static" color="secondary">
      <div className="flex-around p-2">
        <IconButton aria-label="menu" onClick={handleMenuOpen}>
          <MenuIcon fontSize="large" />
        </IconButton>
        <Menu
          anchorEl={anchorEl}
          open={Boolean(anchorEl)}
          onClose={handleMenuClose}
        >
          <MenuItem component={Link} href="/page1" onClick={handleMenuClose}>Page1</MenuItem>
          <MenuItem component={Link} href="/page2" onClick={handleMenuClose}>Page2</MenuItem>
          <MenuItem component={Link} href="/page3" onClick={handleMenuClose}>Page3</MenuItem>
        </Menu>
        <Typography variant="h4" className="grow">
          {title}
        </Typography>
        {useAuthDiv &&
          <div className="m-1">
            <AuthDiv />
          </div>
        }
        <div className="m-1">
          <ThemeSelect
            systemTheme={systemTheme}
            setSystemTheme={setSystemTheme}
          />
        </div>
      </div>
    </AppBar>
  );
};

export default HeaderAppBar;