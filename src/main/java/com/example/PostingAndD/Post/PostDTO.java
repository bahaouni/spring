package com.example.PostingAndD.Post;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
@Data
@NoArgsConstructor
@AllArgsConstructor

public class PostDTO {
    private String Name;
    private String description;
    private String photo;
    private BigDecimal startingPrice;

    // constructors, getters, setters, etc.
}
