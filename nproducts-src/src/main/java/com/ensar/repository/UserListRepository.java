package com.ensar.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.ensar.models.UserList;

@Repository
public interface UserListRepository extends JpaRepository<UserList, String> {

}
