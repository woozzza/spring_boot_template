package ai.megaworks.spring_boot_template.common.domain;

import java.util.Arrays;

public enum Role {
    ANONYMOUS("ROLE_ANONYMOUS", "손님"), USER("ROLE_USER", "일반 사용자"), EMPLOYEE("ROLE_EMPLOYEE",
            "내부 사용자"), ADMIN("ROLE_ADMIN", "시스템 관리자");

    private final String key;
    private final String title;

    public static Role findByKey(String key) {
        return (Role) Arrays.stream(values()).filter((c) -> {
            return c.getKey().equals(key);
        }).findAny().orElse(null);
    }

    public String getKey() {
        return this.key;
    }

    public String getTitle() {
        return this.title;
    }

    private Role(final String key, final String title) {
        this.key = key;
        this.title = title;
    }
}