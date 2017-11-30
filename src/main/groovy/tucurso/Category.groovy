package tucurso

public enum Category {
    MUSIC("musica"),
    EDUCATION("educacion"),
    SPORT("deporte")

    private final String description

    Category(String descrip) {
        this.description = descrip;
    }
}