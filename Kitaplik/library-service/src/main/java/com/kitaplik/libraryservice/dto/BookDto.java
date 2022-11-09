package com.kitaplik.libraryservice.dto;

import com.kitaplik.bookservice.dto.BookIdDto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BookDto {
    private BookIdDto id;
    private String title;
    private Integer bookYear;
    private String author;
    private String pressName;

}