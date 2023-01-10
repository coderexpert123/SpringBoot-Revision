package com.nishant.dao;

import org.springframework.data.repository.CrudRepository;

import com.nishant.entities.User;

public interface UserRepossitery extends CrudRepository<User,Integer> {

}
