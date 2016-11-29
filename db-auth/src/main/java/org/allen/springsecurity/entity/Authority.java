package org.allen.springsecurity.entity;

/**
 * Created by allen on 16/11/29.
 */
public class Authority extends BaseEntity {

    private String authority;
    private String desc;
    private Integer status;

    public String getAuthority() {
        return authority;
    }

    public void setAuthority(String authority) {
        this.authority = authority;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}
