package aulas.oo.part01.paradigma.exemplo001;

public class ExemploMetodos {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();

        Carro carroPopular = new Carro(5,"Chevrolet","Celta",2010,"1.0");
        Carro SUV = new Carro(7,"Volkswagem","Tiguan",2019,"ConfortLine");

        System.out.println(pessoa.falarMeuProprioNome());
        // Olá, meu nome é Marco

        System.out.println(pessoa.andar());

        System.out.println(carroPopular.getQtdPessoas());
        System.out.println(carroPopular.getCapacidade());

        System.out.println(SUV.getQtdPessoas());
        System.out.println(SUV.getCapacidade());
        System.out.println(SUV.getMarca());
        System.out.println(SUV.getModelo());
        System.out.println(SUV.getVariante());
        System.out.println(SUV.getAno());

        for (int i = 0; i<=7; i++){
            System.out.println(carroPopular.entrarPessoa());
        }
        for (int i = 0; i<=7; i++){
            System.out.println(carroPopular.sairPessoa());
        }




    }
}
