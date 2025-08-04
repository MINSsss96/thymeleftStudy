package com.example.thymeleftTest.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data

public class Product {
    private String name;
    private int price;
    private int stock;


}
