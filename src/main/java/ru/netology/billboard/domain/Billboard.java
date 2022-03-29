package ru.netology.billboard.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class Billboard {
    private int id;
    private String nameOfMovie;
}
