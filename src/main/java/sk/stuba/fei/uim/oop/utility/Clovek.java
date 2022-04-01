package sk.stuba.fei.uim.oop.utility;

import lombok.Getter;
import lombok.Setter;
import sk.stuba.fei.uim.oop.Person;

import java.util.List;

@Getter
public class Clovek {
    private String meno;
    @Setter
    private String adresa;
    private double vyska;
    private double vaha;
    private int vek;
    private List<Person> kamarati;
}
