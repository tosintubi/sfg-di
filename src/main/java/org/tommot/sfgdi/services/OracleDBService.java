package org.tommot.sfgdi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile({"oracle","default"})
@Service("dbService")
public class OracleDBService implements DatabaseService {
    @Override
    public String Connect() {
        return "Connected to Oracle Enterprise 12c Database";
    }

    @Override
    public String CloseConnection() {
        return "Oracle 12c Database Connection Closed";
    }
}
