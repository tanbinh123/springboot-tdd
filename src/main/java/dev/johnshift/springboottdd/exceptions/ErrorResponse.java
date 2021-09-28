package dev.johnshift.springboottdd.exceptions;

import java.util.Date;
import lombok.Getter;
import lombok.Setter;
import org.springframework.http.HttpStatus;

/** . */
@Getter
@Setter
public class ErrorResponse {

  private HttpStatus status;
  private String error;
  private String info;
  private Date timestamp;

  public ErrorResponse() {
    timestamp = new Date();
  }

  public ErrorResponse(HttpStatus status) {
    this();
    this.status = status;
  }


  /** . */
  public ErrorResponse(HttpStatus status, Throwable ex) {
    this();
    this.status = status;
    this.error = ex.getMessage();
  }

  /** . */
  public ErrorResponse(HttpStatus status, String info, Throwable ex) {
    this();
    this.status = status;
    this.error = ex.getMessage();
    this.info = info;
  }
}