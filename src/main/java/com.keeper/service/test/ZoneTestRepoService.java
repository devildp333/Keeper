package com.keeper.service.test;

/*
 * Created by @GoodforGod on 5.04.2017.
 */

import com.keeper.model.test.ZoneTest;
import com.keeper.repo.test.ZoneTestRepository;
import com.keeper.service.impl.ModelRepoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

/**
 * Default Comment
 */
@Service
public class ZoneTestRepoService extends ModelRepoService<ZoneTest> implements IZoneTestService {

    private final ZoneTestRepository repository;

    @Autowired
    public ZoneTestRepoService(ZoneTestRepository repository) {
        this.repository = repository;
        this.primeRepository = repository;
    }

    @Override
    public ZoneTest getEmpty() {
        return ZoneTest.EMPTY;
    }

    @Override
    public List<ZoneTest> getByCountry(String country) {
        return (country != null && !country.isEmpty())
                ? repository.findByCountry(country)
                : Collections.emptyList();
    }

    @Override
    public List<ZoneTest> getByCity(String city) {
        return (city != null && !city.isEmpty())
                ? repository.findByCity(city)
                : Collections.emptyList();
    }
}
