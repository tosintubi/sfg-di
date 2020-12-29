package org.tommot.sfgdi.controllers;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.tommot.sfgdi.services.DatabaseService;

@Controller
public class DatabaseController {
    private final DatabaseService databaseService;

    public DatabaseController(@Qualifier("dbService") DatabaseService databaseService) {
        this.databaseService = databaseService;
    }

    public String Connect(){
        return databaseService.Connect();
    }

    public String Disconnect(){
        return databaseService.CloseConnection();
    }
}
