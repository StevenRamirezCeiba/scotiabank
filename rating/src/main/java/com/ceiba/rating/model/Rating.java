package com.ceiba.rating.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Rating implements Serializable {

    private Long id;
    private Long bookId;
    private Stars stars;
}