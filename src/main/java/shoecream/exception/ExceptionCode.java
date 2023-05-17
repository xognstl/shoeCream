package shoecream.exception;

import lombok.Getter;

public enum ExceptionCode {
    DATA_NOT_FOUND(404,"Not Found"),
    DATA_EXISTS(409,"Already Exists"),
    INTERNAL_SERVER_ERR(500,"Internal Server Error");

    @Getter
    private int status;

    @Getter
    private String msg;

    ExceptionCode(int status,String msg){
        this.status = status;
        this.msg = msg;
    }
}
