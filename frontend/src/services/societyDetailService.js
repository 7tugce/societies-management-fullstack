import axios from "axios"

export default class SocietyDetailService{
    getSocieties(id){
        return(
            axios.get("http://localhost:8080/api/societies/getDetails?id=" +id)
        )
    }
}