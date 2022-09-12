package com.example.demo.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;

    private String name;

    private String description;

   private String imageUrl;

//     // public Integer getId()
//     {
//         return id;
//     }

//     public void setId( Integer id )
//     {
//         this.id = id;
//     }

//     public String getName()
//     {
//         return name;
//     }

//     public void setName( String name )
//     {
//         this.name = name;
//     }

//     public String getDescription()
//     {
//         return description;
//     }

//     public void setDescription( String description )
//     {
//         this.description = description;
//     }

//     public String getImageUrl()
//     {
//         return imageUrl;
//     }

//     public void setImageUrl( String imageUrl )
//     {
//         this.imageUrl = imageUrl;
//     }
}

