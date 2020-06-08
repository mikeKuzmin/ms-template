package ru.vtb.spkp.ms.template.test;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureJdbc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import ru.vtb.spkp.ms.template.Application;
import ru.vtb.spkp.ms.template.dao.RootEntityDao;
import ru.vtb.spkp.ms.template.entity.OneToManyObj;
import ru.vtb.spkp.ms.template.entity.RootEntity;

import java.time.LocalDate;
import java.time.LocalDateTime;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
@AutoConfigureJdbc
public class ServiceTest {

    @Autowired
    private RootEntityDao rootEntityDao;

    @Test
    public void test01() {
        OneToManyObj oneToManyObj = new OneToManyObj();
        oneToManyObj.setObjGroup(2);
        oneToManyObj.setVolume(200);
        oneToManyObj.getObjTypes().add(1);
        oneToManyObj.getObjTypes().add(2);
        oneToManyObj.setExpirationDate(LocalDate.now().plusDays(10));

        RootEntity rootEntity = new RootEntity();
        rootEntity.setName("Имя сущности");
        rootEntity.getOneToManyObjs().add(oneToManyObj);
        rootEntity.setSomeDate(LocalDateTime.now());
        rootEntityDao.save(rootEntity);

        Assert.assertEquals(rootEntityDao.findByName(rootEntity.getName()).get(0).getName(), rootEntity.getName());

    }

}
