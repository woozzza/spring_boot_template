package ai.megaworks.spring_boot_template.common.util;

import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.Locale;

@Component
public class MessageUtil {
    @Resource(name = "") // TODO
    private MessageSource messageSource;

    public String getMessage(String code) {
        return this.getMessage(code, new Object[0]);
    }

    public String getMessage(String code, Object[] args) {
        return this.getMessage(code, args, LocaleContextHolder.getLocale());
    }

    public String getMessage(String code, Object[] args, Locale locale) {
        return this.messageSource.getMessage(code, args, locale);
    }
}