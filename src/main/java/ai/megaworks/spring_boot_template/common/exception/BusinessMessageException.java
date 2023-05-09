package ai.megaworks.spring_boot_template.common.exception;

import ai.megaworks.spring_boot_template.common.exception.dto.ErrorCode;

public class BusinessMessageException extends BusinessException {
    public BusinessMessageException(String customMessage) {
        super(ErrorCode.BUSINESS_CUSTOM_MESSAGE, customMessage);
    }
}