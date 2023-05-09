package ai.megaworks.spring_boot_template.common.exception.dto;

public enum ErrorCode {
    INVALID_INPUT_VALUE(400, "E001", "err.invalid.input.value"),
    INVALID_TYPE_VALUE(400, "E002", "err.invalid.type.value"),
    ENTITY_NOT_FOUND(400, "E003", "err.entity.not.found"),
    UNAUTHORIZED(401, "E004", "err.unauthorized"),
    JWT_EXPIRED(401, "E005", "err.unauthorized"),
    ACCESS_DENIED(403, "E006", "err.access.denied"),
    NOT_FOUND(404, "E010", "err.page.not.found"),
    METHOD_NOT_ALLOWED(405, "E011", "err.method.not.allowed"),
    REQUIRE_USER_JOIN(412, "E012", "err.user.notexists"),
    UNPROCESSABLE_ENTITY(422, "E020", "err.unprocessable.entity"),
    INTERNAL_SERVER_ERROR(500, "E999", "err.internal.server"),
    BUSINESS_CUSTOM_MESSAGE(400, "B001", ""),
    DUPLICATE_INPUT_INVALID(400, "B002", "err.duplicate.input.value"),
    DB_CONSTRAINT_DELETE(400, "B003", "err.duplicate.input.value");

    private final int status;
    private final String code;
    private final String message;

    private ErrorCode(final int status, final String code, final String message) {
        this.status = status;
        this.code = code;
        this.message = message;
    }

    public int getStatus() {
        return this.status;
    }

    public String getCode() {
        return this.code;
    }

    public String getMessage() {
        return this.message;
    }
}