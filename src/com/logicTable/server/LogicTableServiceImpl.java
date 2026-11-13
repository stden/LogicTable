package com.logicTable.server;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;
import com.logicTable.client.LogicTableService;

public class LogicTableServiceImpl extends RemoteServiceServlet implements LogicTableService {
    // Implementation of sample interface method
    public String getMessage(String msg) {
        return "Client said: \"" + msg + "\"<br>Server answered: \"Hi!\"";
    }
}