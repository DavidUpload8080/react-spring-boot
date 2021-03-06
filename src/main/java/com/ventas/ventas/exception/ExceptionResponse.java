package com.ventas.ventas.exception;

import java.util.Date;

public class ExceptionResponse {
    /*
        "timestamp": "2021-01-09T12:56:35.525+00:00",
            "status": 400,
            "error": "Bad Request",
            "message": "",
            "path": "/api/clientes/"
    */
    private Date timestamp;
    private String message;
    private String details;

    public ExceptionResponse(Date timestamp, String message, String details) {
        this.timestamp = timestamp;
        this.message = message;
        this.details = details;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }
}
