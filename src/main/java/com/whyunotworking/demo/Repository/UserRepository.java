package com.whyunotworking.demo.Repository;

import com.whyunotworking.demo.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository <User, Long>{

}
