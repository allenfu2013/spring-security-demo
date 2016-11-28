package org.allen.springsecurity.server.model;

import java.util.Date;
import java.util.List;

public class User {

    private Long id;
    private String email;
    private String password;
    private List<String> rights;
    private Date createdAt;

    public User() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public List<String> getRights() {
        return rights;
    }

    public void setRights(List<String> rights) {
        this.rights = rights;
    }

}
