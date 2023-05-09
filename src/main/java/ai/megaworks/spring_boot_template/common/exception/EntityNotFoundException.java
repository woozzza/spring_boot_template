package ai.megaworks.spring_boot_template.common.exception;

import ai.megaworks.spring_boot_template.common.exception.dto.ErrorCode;

public class EntityNotFoundException extends BusinessException {
    public EntityNotFoundException(String message) {
        super(message, ErrorCode.ENTITY_NOT_FOUND);
    }
}