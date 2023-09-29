package com.eindopdracht.eindopdracht_fs_matthijs_van_der_maas.dto;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.validation.constraints.*;

import javax.annotation.processing.Generated;

public class ProductDto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    @Size(min = 1, max = 128)
    public String Name_Product;

    @NotBlank
    @Size(min = 1, max = 128)
    public String Name_Producer;
    @NotNull
    @Positive
    @Min(1)//TODO moet double worden
    @Max(14)//TODO moet double worden
    public double Percentage;
    @NotBlank
    @Email
    public String Email;

    @Size(min = 1, max = 128)
    public String Color;

    @Size(min = 1, max = 128)
    public String Tast;
    @NotNull
    @Positive
    @Min(1)//TODO moet double worden
    @Max(14)//TODO moet double worden
    public double Volume;
    @NotBlank
    @Size(min = 1, max = 128)
    public String Location_Producer;
}
