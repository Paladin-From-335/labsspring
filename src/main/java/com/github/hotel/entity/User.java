package com.github.hotel.entity;

import com.github.hotel.payload.UserRole;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "users")
@NoArgsConstructor
@Data // data includes getters, setters, toString, equals and hashcode
public class User {
    @Id
    @Column(columnDefinition = "BIGINT", nullable = false, name = "id")
    private long id;

    @Column(columnDefinition = "VARCHAR", nullable = false, name = "phone")
    private String phone;

    @Column(columnDefinition = "VARCHAR", nullable = false, name = "password")
    private String password;

    @Column(columnDefinition = "VARCHAR", nullable = false, name = "firstname")
    private String firstname;

    @Column(columnDefinition = "VARCHAR", nullable = false, name = "lastname")
    private String lastname;

    @Column(columnDefinition = "VARCHAR", nullable = false, name = "role")
    private UserRole role;

    public User(String phone, String password, String firstname, String lastname, UserRole role) {
        this.phone = phone;
        this.password = password;
        this.firstname = firstname;
        this.lastname = lastname;
        this.role = role;
    }
}
