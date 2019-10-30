package com.javalearning.jpa.join.dto;

import com.javalearning.jpa.join.entity.Customer;
import lombok.*;

@Data
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class OrderRequest {
    private Customer customer;

}
