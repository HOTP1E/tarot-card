package com.tarot.demo.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

@NoArgsConstructor
@Data
public class UserDTO {

    private String name;
    private Timestamp lastEntry;

}
