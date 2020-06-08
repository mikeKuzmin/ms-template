package ru.vtb.spkp.ms.template.entity;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.Id;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class RootEntity {

    @Id
    @EqualsAndHashCode.Include
    private Integer id;
    private String name;
    private LocalDateTime someDate;
    private Set<OneToManyObj> oneToManyObjs = new HashSet<>();

}
