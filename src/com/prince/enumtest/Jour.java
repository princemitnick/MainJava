package com.prince.enumtest;

public enum Jour {
    LUNDI("2e jour de la semaine"),
    MARDI("3e jour de la semaine"),
    MERCREDI("4e jour de la semaine"),
    JEUDI("5e jour de la semaine"),
    VENDREDI("6e jour de la semaine"),
    SAMEDI("7e jour de la semaine"),
    DIMANCHE("1er jour de la semaine");

    private String desc;

    Jour(String desc) {
        this.desc = desc;
    }

    public String getDesc() {
        return desc;
    }

}
