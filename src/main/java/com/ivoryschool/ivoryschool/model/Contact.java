package com.ivoryschool.ivoryschool.model;

import lombok.Data;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Data
public class Contact {
     @NotBlank(message = "Name must not be blank")
     @Size(min = 3,message = "Name must be at least 3 characters long")
     private String name;
     @NotBlank(message = "Email must not be blank")
     @Email(message = "Provide a valid email")
     private String email;
     @NotBlank(message = "Subject must not be blank")
     @Size(min = 3,message = "Subject must be at least 3 characters long")
     private String subject;
     @NotBlank(message = "Mobile number must not be blank")
     @Pattern(regexp="^$|[0 - 9]]",message = "Mobile must at least be 10 digits")
     private String mobileNum;
     @NotBlank(message = "Message must not be blank")
     @Size(min = 3,message = "Message must be at least 5 characters long")
     private String message;




}
