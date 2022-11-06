package com.ivoryschool.ivoryschool.service;


import com.ivoryschool.ivoryschool.controller.ContactController;
import com.ivoryschool.ivoryschool.model.Contact;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class ContactService {
    //Create a logger object


    public boolean saveMessageDetails(Contact contact){
        boolean isSaved = true;
        //Needs database
        log.info(contact.toString());
        return isSaved;
    }

}
