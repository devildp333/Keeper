package com.keeper.service;

/*
 * Created by @GoodforGod on 6.04.2017.
 */

import com.keeper.entity.dao.ZoneTest;

import java.util.List;

/**
 * Default Comment
 */
public interface IZoneTestService {// extends IModelService<ZoneTest> {
    List<ZoneTest> getByCountry(String country);

    List<ZoneTest> getByCity(String city);
}
