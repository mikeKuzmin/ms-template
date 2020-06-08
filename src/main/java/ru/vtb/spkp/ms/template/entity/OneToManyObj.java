package ru.vtb.spkp.ms.template.entity;

import lombok.Data;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Data
public class OneToManyObj {

    /**
     * Id другой сущности вместо ссылки. Many-To-One справочник
     */
    private Integer objGroup;
    /**
     * Set<Id> другой сущности вместо ссылки. Many-To-Many справочник
     */
    private Set<Integer> objTypes = new HashSet<>();
    private Integer volume;
    private LocalDate expirationDate;

}
