package ru.vtb.spkp.ms.template.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.vtb.spkp.ms.template.dao.RootEntityDao;
import ru.vtb.spkp.ms.template.entity.RootEntity;

@Service
@RequiredArgsConstructor
public class RootEntityService {

    private final RootEntityDao rootEntityDao;

    public RootEntity findById(Integer id) {
        return rootEntityDao.findById(id).orElseThrow(() -> new RuntimeException(String.valueOf(id)));
    }

    public RootEntity save(RootEntity rootEntity) {
        return rootEntityDao.save(rootEntity);
    }
}
