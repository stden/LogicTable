package com.logicTable.client;

import com.google.gwt.user.client.rpc.AsyncCallback;

public interface LogicTableServiceAsync {
    void getMessage(String msg, AsyncCallback<String> async);
}
