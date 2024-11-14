package com.datajpa.spring_data_jpa.ModelDTO;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.util.Locale;

public class Student {
    @NotNull
    @Max(value=100)
    @NotBlank
    private String studentName;

    @Min(value=0, message="price must be greater than 0")
    private double coursePrice;

    private Locale.Category category;

}
