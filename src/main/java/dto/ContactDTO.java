package dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Setter
@Getter
@ToString
@Builder
public class  ContactDTO
{
    //  "contacts": [
//    {
//        "id": "string",
//            "name": "string",
//            "lastName": "string",
//            "email": "string",
//            "phone": "403561601468045",
//            "address": "string",
//            "description": "string"
//    }
//  ]
    List<ContactDTO> contacts;
    String id;
    String name;
    String lastName;
    String email;
    String phone;
    String address;
    String description;

}
