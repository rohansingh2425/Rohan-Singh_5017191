package com.bookstore.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BookDTO {
    private Long id;

    @NotNull(message = "Title is required")
    @Size(min = 2, max = 100, message = "Title must be between 2 and 100 characters")
    private String title;

    @NotNull(message = "Author is required")
    @Size(min = 2, max = 100, message = "Author must be between 2 and 100 characters")
    private String author;

    @Min(value = 0, message = "Price must be a positive number")
    private String price;

    @NotNull(message = "ISBN is required")
    @Size(min = 10, max = 13, message = "ISBN must be between 10 and 13 characters")
    private String isbn;
}
