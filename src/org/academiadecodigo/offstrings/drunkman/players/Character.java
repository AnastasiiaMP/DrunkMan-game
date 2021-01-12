package org.academiadecodigo.offstrings.drunkman.players;

public enum Character {

    BENNY("Benny"),
    PAULINHO("Paulinho"),
    ROLO("Rolo-Demon");

    private String name;

    Character(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}
