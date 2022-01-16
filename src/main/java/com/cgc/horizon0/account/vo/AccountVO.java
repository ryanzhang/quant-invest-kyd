package com.cgc.horizon0.account.vo;

/**
 * Created by IntelliJ IDEA.
 * Project : horizon0-account
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 14/10/21
 * Time: 13.48
 */
public class AccountVO {
    public Long id;

    public String loginId;

    public String loginName;

    public String status;

    public String type;

    public AccountVO(Long id, String loginId, String loginName, String status, String type) {
        this.id = id;
        this.loginId = loginId;
        this.loginName = loginName;
        this.status = status;
        this.type = type;
    }
}
