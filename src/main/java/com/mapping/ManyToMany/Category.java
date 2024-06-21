package com.mapping.ManyToMany;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Entity
@Table(name ="Category")

public class Category {

    @Id
    private  int cid;
    private  String title;

    @ManyToMany
    private List<Product> product = new ArrayList<>();
}
