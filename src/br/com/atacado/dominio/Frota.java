package br.com.atacado.dominio;

import java.time.LocalDate;
import java.util.ArrayList;

public class Frota extends BaseTransporte {

    ArrayList<Veiculo> veiculos;
    public Frota(int codigo, String descricao, LocalDate dataInsert) {
        super(codigo, descricao, dataInsert);
    }

    public Frota() {
    }
    
}
