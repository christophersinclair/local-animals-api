package com.upendiproject.localanimalapi.service.impl;

import com.upendiproject.localanimalapi.dao.IDGeneratorDao;
import com.upendiproject.localanimalapi.service.IDGeneratorService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.concurrent.ThreadLocalRandom;

@Service
public class IDGeneratorServiceImpl implements IDGeneratorService {

    private static final Logger logger = LoggerFactory.getLogger(IDGeneratorServiceImpl.class);

    @Autowired
    private IDGeneratorDao idGeneratorDao;

    @Override
    public Long generate() {
        Long idCandidate = randomLong();
        while(idExists(idCandidate)) {
            idCandidate = randomLong();
        }
        return idCandidate;

    }

    private boolean idExists(Long id) {
        return idGeneratorDao.idExists(id);
    }

    private Long randomLong() {
        Long idCandidate = ThreadLocalRandom.current().nextLong(0, 1000000000);
        return idCandidate;
    }
}
