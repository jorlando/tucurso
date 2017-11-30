package tucurso

class Price {

    enum Currency {
        ARS,
        USS,
    }

    BigDecimal amount
    Currency currency

}