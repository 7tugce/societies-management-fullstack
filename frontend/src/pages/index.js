import { BrowserRouter, Route,Routes } from "react-router-dom";
import Home from "./home"
import Admin from "./admin"
import Detail from "./detail"
import Apply from "./apply"
import Login from "./login"
import NotFound from "./404"

export default function Root(){
    return (
        <div>
            <BrowserRouter>
                <Routes>
                    <Route element={<Home/>} path="/"></Route>
                    <Route element={<Detail/>} path="/detail/:id"></Route>
                    <Route element={<Apply/>} path="/apply"></Route>
                    <Route element={<Admin/>} path="/admin"></Route>
                    <Route element={<Login/>} path="/login"></Route>
                    <Route element={<NotFound/>} path="*"></Route>
                </Routes>
            </BrowserRouter>
        </div>
    )
}