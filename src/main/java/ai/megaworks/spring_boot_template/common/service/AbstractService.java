package ai.megaworks.spring_boot_template.common.service;


import ai.megaworks.spring_boot_template.common.util.MessageUtil;
import com.mysql.cj.MessageBuilder;

import javax.annotation.Resource;

public abstract class AbstractService  {
    @Resource(name = "messageUtil")
    protected MessageUtil messageUtil;

    protected String getMessage(String code) {
        return this.messageUtil.getMessage(code);
    }

    protected String getMessage(String code, Object[] args) {
        return this.messageUtil.getMessage(code, args);
    }

}