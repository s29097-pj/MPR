package org.example.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Data
public class Pizza {
    private String name;
    private double price;
    private boolean isAvailable;
}
