package com.example.finsearver.model;

import lombok.Data;
import java.util.List;

@Data
public class User {
    private int id;
    private String name;
    private List<Integer> follows;
}