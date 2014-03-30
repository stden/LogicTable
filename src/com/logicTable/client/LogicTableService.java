package com.logicTable.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

@RemoteServiceRelativePath("LogicTableService")
public interface LogicTableService extends RemoteService {
    // Sample interface method of remote interface
    String getMessage(String msg);

    /**
     * Utility/Convenience class.
     * Use LogicTableService.App.getInstance() to access static instance of LogicTableServiceAsync
     */
    public static class App {
        private static LogicTableServiceAsync ourInstance = GWT.create(LogicTableService.class);

        public static synchronized LogicTableServiceAsync getInstance() {
            return ourInstance;
        }
    }
}
