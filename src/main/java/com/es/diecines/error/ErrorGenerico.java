package com.es.diecines.error;

public class ErrorGenerico {
    private String msg;
    private String uri;

    public ErrorGenerico(String msg, String uri){
        this.msg = msg;
        this.uri = uri;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }

    @Override
    public String toString() {
        return msg + "\n" + uri;
    }
}
