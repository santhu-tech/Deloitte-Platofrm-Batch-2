package com.springdatabase.EcomDB.Category.Model;

import lombok.*;
import org.springframework.http.HttpStatus;

@Data
@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ErrorMessage {
    private HttpStatus status;
    private String messgae;


}
