package ai.megaworks.spring_boot_template.common.exception;

import ai.megaworks.spring_boot_template.common.exception.dto.ErrorCode;

public class BusinessException extends RuntimeException {
    private String customMessage;
    private ErrorCode errorCode;

    public BusinessException(ErrorCode errorCode, String customMessage) {
        super(customMessage);
        this.errorCode = errorCode;
        this.customMessage = customMessage;
    }

    public BusinessException(String message, ErrorCode errorCode) {
        super(message);
        this.errorCode = errorCode;
    }

    public BusinessException(ErrorCode errorCode) {
        super(errorCode.getMessage());
        this.errorCode = errorCode;
    }

    public ErrorCode getErrorCode() {
        return this.errorCode;
    }

    public String getCustomMessage() {
        return this.customMessage;
    }
}