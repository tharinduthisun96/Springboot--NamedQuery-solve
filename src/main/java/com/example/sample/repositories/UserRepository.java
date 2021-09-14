package com.example.sample.repositories;

import com.example.sample.domains.User;
import com.example.sample.dtos.UserNameDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, String> {

    @Query(value = "SELECT new com.example.sample.dtos.UserNameDto(u.first_name, u.last_Name) FROM User u WHERE u.id = :id")
    UserNameDto findUserNameDtoById_Named(String id);
    //SELECT u.first_name, u.last_Name FROM User u WHERE id = :id


    @Query(nativeQuery = true)
    UserNameDto findUserNameById(@Param("id") String id);

}
