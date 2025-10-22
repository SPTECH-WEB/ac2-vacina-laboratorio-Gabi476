package sptech.school;
import school.sptech.exception.VacinaNaoEncontradaException;
import sptech.school.exception.ArgumentoInvalidoException;
import sptech.school.exception.VacinaInvalidaException;

import java.time.LocalDate;
import java.util.List;
import java.util.ArrayList;

public class Laboratorio {
    private String nome;
    private List<Vacina> vacinas;

    public Laboratorio(){
        this.vacinas = new ArrayList<>();
    }

    public void adicionarVacina(Vacina vacina){
        if (vacina == null) {
            throw new VacinaInvalidaException();
        } else if (vacina.getCodigo() == null || vacina.getCodigo().isEmpty()) {
            throw new VacinaInvalidaException();
        } else if (vacina.getNome() == null || vacina.getNome().isEmpty()) {
            throw new VacinaInvalidaException();
        } else if (vacina.getTipo() == null || vacina.getTipo().isEmpty()) {
            throw new VacinaInvalidaException();
        } else if (vacina.getPreco() == null || vacina.getPreco() < 0) {
            throw new VacinaInvalidaException();
        } else if (vacina.getEficacia() < 0 && vacina.getEficacia() > 5) {
            throw new VacinaInvalidaException();
        } else if (vacina.getDataLancamento() == null) {
            throw new VacinaInvalidaException();
        } else {
            vacinas.add(vacina);
        }
    }

    public void buscarVacinaPorCodigo(String codigo) {
        for(int i=0; i<vacinas.size(); i++) {
            if (codigo == null || codigo.isEmpty() || codigo.isBlank()) {
                throw new ArgumentoInvalidoException();
            }else if(!codigo.equals(vacinas.get(i).getCodigo())){
                throw new VacinaNaoEncontradaException();
            }else{
                vacinas.get(i).getCodigo();
            }
        }
    }

    public void removerVacinaPorCodigo(String codigo){
        for(int i=0; i<vacinas.size(); i++){
            if(codigo == null || codigo.isEmpty()|| codigo.isBlank() ){
                throw new ArgumentoInvalidoException();
            }else if(!codigo.equals(vacinas.get(i).getCodigo())){
                throw new VacinaNaoEncontradaException();
            }else{
                vacinas.remove(i);
            }
        }
    }

    public void buscarVacinaComMelhorEficacia(){
        for(int i=0; i<vacinas.size(); i++){
            if(vacinas.isEmpty()){
                throw new VacinaNaoEncontradaException();
            }else{
               vacinas.get(i);
            }
        }
    }

    public List<Vacina> buscarVacinaPorPeriodo(LocalDate dataInicio, LocalDate dataFim){
        for(int i = 0; i<vacinas.size(); i++){
            if(dataInicio == null || dataFim == null){
                throw new VacinaNaoEncontradaException();
            }
        }
        return vacinas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
