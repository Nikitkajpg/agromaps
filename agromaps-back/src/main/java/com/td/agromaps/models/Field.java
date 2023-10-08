package com.td.agromaps.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Table(name = "fields")
@Entity
public class Field {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Integer id;

    @Column
    @NotNull
    @NotEmpty
    @Size(max = 100, min = 1)
    private String name;

    @Column
    @NotNull
    @NotEmpty
    @Size(max = 300, min = 1)
    private String address;

    @Column(name = "area")
    @Lob
    private Byte[] imageData;

    @ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    private User owner;

    @OneToMany(mappedBy = "field")
    private List<Measurement> measurements;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Byte[] getImageData() {
        return imageData;
    }

    public void setImageData(Byte[] imageData) {
        this.imageData = imageData;
    }

    public User getOwner() {
        return owner;
    }

    public void setOwner(User owner) {
        this.owner = owner;
    }

    public List<Measurement> getMeasurements() {
        return measurements;
    }

    public void setMeasurements(List<Measurement> measurements) {
        this.measurements = measurements;
    }
}
