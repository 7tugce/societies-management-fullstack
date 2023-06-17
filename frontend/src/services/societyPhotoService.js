import axios from "axios"

export default class SocietyPhotoService{
    getSocieties(id){
        return(
            axios.get("http://localhost:8080/api/societyImagesController/getImages?id=" +id)
        )
    }
}