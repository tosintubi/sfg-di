package org.tommot.sfgdi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;


@Profile({"postgres","default"}) // Default profile is MySql Connection
@Service("dbService")
public class PostgreSqlDBService  implements DatabaseService{
    @Override
    public String Connect() {
        return "Connected to PostgreSql Database";
    }

    @Override
    public String CloseConnection() {
        return "PostgreSql Database Connection Closed";
    }
}
