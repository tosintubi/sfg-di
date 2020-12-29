package org.tommot.sfgdi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;


@Profile({"mysql","idefault"}) // Default profile is MySql Connection
@Service("dbService")
public class MySqlDBService  implements DatabaseService{
    @Override
    public String Connect() {
        return "Connected to MySql 7.5.23 Database";
    }

    @Override
    public String CloseConnection() {
        return "MySql 7.5.23 Database Connection Closed";
    }
}
