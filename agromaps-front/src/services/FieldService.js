import axios from "axios";

class FieldService {
    getFields() {
        return axios.get('http://localhost:8080/fields');
    }
}

export default new FieldService()