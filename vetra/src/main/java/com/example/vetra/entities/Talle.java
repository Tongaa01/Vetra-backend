package com.example.vetra.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "talles")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Talle extends Base {
    private String talle;
}