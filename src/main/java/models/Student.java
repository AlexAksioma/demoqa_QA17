package models;

import lombok.*;

@Getter
@Setter
@ToString
@Builder
@AllArgsConstructor

public class Student {

        private String firstName;
        private String lastName;
        private String email;
        private String gender;
        private String phone;
        private String birthday;
        private String subject;
        private String hobbies;
        private String address;
        private String state;
        private String city;

}
