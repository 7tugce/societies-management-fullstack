import axios from "axios"

export default class SocietyService{
    getSocieties(){
        return(
            axios.get("http://localhost:8080/api/societies/get")
        )
    }
}