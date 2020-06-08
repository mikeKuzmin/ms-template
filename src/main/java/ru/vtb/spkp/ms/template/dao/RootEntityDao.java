package ru.vtb.spkp.ms.template.dao;

import org.springframework.data.repository.PagingAndSortingRepository;
import ru.vtb.spkp.ms.template.entity.RootEntity;

import java.util.List;

public interface RootEntityDao extends PagingAndSortingRepository<RootEntity, Integer> {

    List<RootEntity> findByName(String name);
}
