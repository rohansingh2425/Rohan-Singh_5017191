package com.bookstore.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.springframework.hateoas.RepresentationModel;

@Data
@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
public class CustomerDTO extends RepresentationModel<CustomerDTO>
{
    private Long id;
    private String name;
    private String email;
    private String address;
}
