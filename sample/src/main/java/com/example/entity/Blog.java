package com.example.entity;

import java.io.Serializable;
import java.sql.*;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import javax.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * Note: auto-generated by jpa-entity-generator
 */
@Data
@ToString
@Builder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "com.example.entity.Blog")
@Table(name = "blog")
public class Blog implements Serializable {

  @Id
  @GeneratedValue
  @Column(name = "\"id\"", nullable = false)
  private int id;
  @Nullable
  @Column(name = "\"name\"", nullable = true)
  private String name;
  @Column(name = "\"active\"", nullable = true)
  private boolean active;
  @Nonnull
  @Column(name = "\"created_at\"", nullable = false)
  private Timestamp createdAt;
}