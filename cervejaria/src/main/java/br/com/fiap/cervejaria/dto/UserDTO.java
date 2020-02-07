package br.com.fiap.cervejaria.dto;

import br.com.fiap.cervejaria.entity.User;

import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.util.Date;

public class UserDTO {

    private Integer id;
    private String username;
    private ZonedDateTime createDate;
    private ZonedDateTime updateDate;

    public UserDTO(){}

    public UserDTO(User user){
        this.id = user.getId();
        this.username = user.getUsername();
        this.createDate = convertToZonedDateTime(user.getCreateDate());
        this.updateDate = convertToZonedDateTime(user.getUpdateDate());
    }

    private ZonedDateTime convertToZonedDateTime(Date date){
        return ZonedDateTime.ofInstant(date.toInstant(), ZoneOffset.systemDefault());
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public ZonedDateTime getCreateDate() {
        return createDate;
    }

    public void setCreateDate(ZonedDateTime createDate) {
        this.createDate = createDate;
    }

    public ZonedDateTime getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(ZonedDateTime updateDate) {
        this.updateDate = updateDate;
    }
}
