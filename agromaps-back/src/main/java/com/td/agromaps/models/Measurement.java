package com.td.agromaps.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

@Table(name = "measurements")
@Entity
public class Measurement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Integer id;

    @Size(max = 300, min = 1)
    @Column
    private String gps;

    @Size(max = 30, min = 1)
    @Column
    private String parameter;

    @Column
    private LocalDateTime time;

    @ManyToOne
    @JoinColumn(name = "field_id", referencedColumnName = "id")
    private Field field;

    @OneToMany(mappedBy = "measurement")
    private List<Data> data;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getGps() {
        return gps;
    }

    public void setGps(String gps) {
        this.gps = gps;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }

    public Field getField_owner() {
        return field;
    }

    public void setField_owner(Field field) {
        this.field = field;
    }

    public String getParameter() {
        return parameter;
    }

    public void setParameter(String parameter) {
        this.parameter = parameter;
    }

    public Field getField() {
        return field;
    }

    public void setField(Field field) {
        this.field = field;
    }

    public List<Data> getData() {
        return data;
    }

    public void setData(List<Data> data) {
        this.data = data;
    }
}
