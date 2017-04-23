package com.keeper.service.impl;

import com.keeper.model.dao.GeoPoint;
import com.keeper.repo.GeoPointRepository;
import com.keeper.service.IGeoPointService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

/**
 * Created by AlexVasil on 29.03.2017.
 *
 * @author AlexVasil
 *
 */
@Service
public class GeoPointService extends ModelRepoService<GeoPoint> implements IGeoPointService {

    private static final Logger LOGGER = LoggerFactory.getLogger(GeoPointService.class);

    private final GeoPointRepository repository;

    @Autowired
    public GeoPointService(GeoPointRepository repository) {
        this.repository = repository;
        this.primeRepository = repository;
    }

    @Override
    public GeoPoint getEmpty() {
        return GeoPoint.EMPTY;
    }

    @Override
    public List<GeoPoint> getEmptyList() {
        return Collections.emptyList();
    }

}