package com.thaylaluiza.course.entities;

import java.io.Serializable;
import java.util.Objects;


    public class User implements Serializable {
        private Long id;
        private String nome;
        private String email;
        private String phone;
        private String password;

        public User() {

        }

        public User(Long id, String email, String nome, String phone, String password) {
            this.id = id;
            this.email = email;
            this.nome = nome;
            this.phone = phone;
            this.password = password;
        }


        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getPhone() {
            return phone;
        }

        public void setPhone(String phone) {
            this.phone = phone;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }

        @Override
        public boolean equals(Object o) {
            if (o == null || getClass() != o.getClass()) return false;
            com.thaylaluiza.course.entities.User user = (com.thaylaluiza.course.entities.User) o;
            return Objects.equals(id, user.id);
        }

        @Override
        public int hashCode() {
            return Objects.hashCode(id);
        }
    }


