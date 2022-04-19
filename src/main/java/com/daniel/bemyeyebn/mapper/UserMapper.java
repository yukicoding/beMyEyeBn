package com.daniel.bemyeyebn.mapper;

import com.daniel.bemyeyebn.model.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper {
    User getAllUser();
}
