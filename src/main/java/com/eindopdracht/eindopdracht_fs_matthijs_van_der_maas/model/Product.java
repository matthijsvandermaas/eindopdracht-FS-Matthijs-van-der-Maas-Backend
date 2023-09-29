package com.eindopdracht.eindopdracht_fs_matthijs_van_der_maas.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

@Entity
@Table(name="Product")
public class Product {
    @Id
    @GeneratedValue
    private Long id;

    @NotBlank
    @Pattern(regexp = "^abAB$")
    private String Name_Product;

    @NotBlank
    @Pattern(regexp = "^abAB$")
    private String Name_Producer;
    @NotBlank
    @Pattern(regexp = "[-+]?[0-9]*\\.?[0-9]+([eE][-+]?[0-9]+)?")
    @Max(15)
    private Number Percentage;

    @NotBlank
    @Pattern(regexp = "^abAB$")
    private String Color;

    @NotBlank
    @Pattern(regexp = "^abAB$")
    private String Tast;

    @NotBlank
    @Pattern(regexp = "[-+]?[0-9]*\\.?[0-9]+([eE][-+]?[0-9]+)?")
    @Max(1000)
    private Number Volume;

    @NotBlank
    @Pattern(regexp = "^abAB$")
    private String Location_Producent;


    public Long getId() {
        return null;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName_Product() {
        return Name_Product;
    }

    public void setName_Product(String name_Product) {
        Name_Product = name_Product;
    }

    public String getName_Producer() {
        return Name_Producer;
    }

    public void setName_Producer(String name_Producer) {
        Name_Producer = name_Producer;
    }

    public Number getPercentage() {
        return Percentage;
    }

    public void setPercentage(Number percentage) {
        Percentage = percentage;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        Color = color;
    }

    public String getTast() {
        return Tast;
    }

    public void setTast(String tast) {
        Tast = tast;
    }

    public Number getVolume() {
        return Volume;
    }

    public void setVolume(Number volume) {
        Volume = volume;
    }

    public String getLocation_Producent() {
        return Location_Producent;
    }

    public void setLocation_Producent(String location_Producent) {
        Location_Producent = location_Producent;
    }


}
