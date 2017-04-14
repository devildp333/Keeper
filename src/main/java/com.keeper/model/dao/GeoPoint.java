package com.keeper.model.dao;

/*
 * Created by GoodforGod on 19.03.2017.
 *
 * Updated by AlexVasil on 22.03.2017.
 *
 * Updated by AlexVasil on 26.03.2017.
 *
 */

import com.keeper.util.dao.DatabaseResolver;

import javax.persistence.*;

@Entity
@Table(name = DatabaseResolver.TABLE_GEOPOINTS, schema = DatabaseResolver.SCHEMA)
public class GeoPoint {

    public static final GeoPoint EMPTY = new GeoPoint();

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true, nullable = false)           private Long id;
    @Column(name = "latitude")                                      private String latitude;
    @Column(name = "longitude")                                     private String longitude;
    @Column(name = "radius")                                        private Integer radius;
    @Column(name = "info")                                          private String info;

    //    The MapsId annotation ask Hibernate to copy the identifier from another associated entity
//    @MapsId
//    @OneToOne(mappedBy = "geopoint", cascade = CascadeType.ALL,
//            fetch = FetchType.LAZY, optional = false)
//    private Task task;

    private GeoPoint() {}

    public GeoPoint(String latitude, String longitude, Integer radius) {
        this.latitude = latitude;
        this.longitude = longitude;
        this.radius = radius;
    }

    public GeoPoint(String latitude, String longitude, Integer radius, String info) {
        this(latitude, longitude, radius);
        this.info = info;
    }

    //<editor-fold desc="GetterAndSetter">

    public Long getId() {
        return id;
    }

    public String getLatitude() {
        return latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public Integer getRadius() {
        return radius;
    }

    public void setRadius(Integer radius) {
        this.radius = radius;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

//    public Task getTask() {
//        return task;
//    }
//
//    public void setTask(Task task) {
//        this.task = task;
//    }

    //</editor-fold>
}
