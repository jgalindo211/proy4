package com.kswaughs.web.beans;

public class UserResp {
	 
    private String status;
 
    private String id;
 
    private String message;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("UserResp [status=");
        builder.append(status);
        builder.append(", id=");
        builder.append(id);
        builder.append(", message=");
        builder.append(message);
        builder.append("]");
        return builder.toString();
    }
}