package org.example;

//Criado para conseguir fazer e testar os dados estatisticos, baseado no cenario 1
public enum TipoItem { //tipo de item e seu peso utilizando o enum
    CELULAR(0.7),
    GELADEIRA(50),
    AIRFRYER(3.5),
    CADEIRA(5.0),
    LUMINARIA(0.8),
    LAVADORADEROUPA(15),
    PLAYSTATION5(3.9),
    NINTENDOSWITCH(0.3);

    public double pesoEmKg;

    TipoItem(double pesoEmKg) {
        this.pesoEmKg = pesoEmKg;
    }

    public double getPesoEmKg() {
        return this.pesoEmKg; //CORRETO?
    }
}
