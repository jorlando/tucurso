package tucurso

class Student {

    String name
    String email

    static constraints = {
        name nullable: false, blank: false
        email nullable: false, blank: false
    }
}
