package aulas.oo.part01.paradigma.exemplo001;

public class Carro {

  private Integer qtdpessoas = 0;
  private final Integer capacidade;
  private final String marca;
  private final String modelo;
  private final Integer ano;
  private final String variante;

  public Carro(Integer capacidade, String marca, String modelo, Integer ano, String variante){
    this.capacidade = capacidade;
    this.marca = marca;
    this.modelo = modelo;
    this.ano = ano;
    this.variante = variante;
  }

  public Integer getQtdPessoas() {return qtdpessoas;}
  public Integer getCapacidade() {return capacidade;}
  public String getMarca() {return marca;}
  public String getModelo() {return modelo;}
  public Integer getAno() {return ano;}
  public String getVariante() {return variante;}

  public String entrarPessoa() {
    if (qtdpessoas < capacidade) {
      qtdpessoas = getQtdPessoas() + 1;
      return "Entrou uma pessoa, agora tem: " + getQtdPessoas();
    } else {
      return "Carro cheio!";
    }
  }

  public String sairPessoa() {
    if (qtdpessoas > 0) {
      qtdpessoas = getQtdPessoas() - 1;
      return "Saiu uma pessoa, agora tem: " + getQtdPessoas();
    } else {
      return "Carro vazio!";
    }
  }

}
