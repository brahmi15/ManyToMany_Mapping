package com.mapping.ManyToMany;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Entity
@Table(name ="Product")

public class Product {

    @Id
    private int pid;
    private String productName;

    @ManyToMany(mappedBy = "product",cascade = CascadeType.ALL)
    private List<Category> category = new ArrayList<>();
}
