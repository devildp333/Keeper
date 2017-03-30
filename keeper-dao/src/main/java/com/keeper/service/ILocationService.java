package com.keeper.service;

/*
 * Created by GoodforGod on 23.03.2017.
 *
 * Updated by AlexVasil on 26.03.2017.
 *
 */

import com.keeper.entity.GeoPoint;
import com.keeper.entity.Location;
import com.keeper.entity.Route;
import com.keeper.entity.User;

import java.util.List;

/**
 * Default Comment
 */
public interface ILocationService {

    //<editor-fold desc="Location">

    Location addLocation(Long userId, Location location);

    Location getLocation(Long userId);

    List<Location> getAllLocations();

    Location updateLocation(Location location);

    void removeLocation(Long userId);
    Location removeLocation(Location location);
    //</editor-fold>

    //<editor-fold desc="Coordinates">

    List<GeoPoint> addGeoPoints(Long userId, List<GeoPoint> geoPoints);

    List<GeoPoint> getGeoPoints(Long userId, List<Long> geoPointsIds);

    List<GeoPoint> getAllGeoPoints();

    List<GeoPoint> updateGeoPoints(Long userId, List<GeoPoint> geoPoints);

    void removeGeoPoints(Long userId, List<Long> geoPointsIds);
    //</editor-fold>

    //<editor-fold desc="Routes">

    Route addRoutes(Long userId, Route route);
    Route addRoutes(User user, Route route);
    List<Route> addRoutes(Long userId, List<Route> routes);
    List<Route> addRoutes(User user, List<Route> routes);

    Route getRoutes(Long userId, Long routeId);
    Route getRoutes(User user, Long routeId);
    List<Route> getRoutes(Long userId, List<Long> routeIds);
    List<Route> getRoutes(User user, List<Long> routeIds);

    List<Route> getAllRoutes();

    Route updateRoute(Long userId, Long routeId);
    Route updateRoute(User user, Long routeId);
    List<Route> updateRoute(Long userId, List<Long> routeIds);
    List<Route> updateRoute(User user, List<Long> routeIds);

    void removeRoute(Long userId, Long routeId);
    void removeRoute(User user, Long routeId);
    void removeRoutes(Long userId, List<Long> routeIds);
    void removeRoutes(User user, List<Long> routeIds);
    //</editor-fold>
}