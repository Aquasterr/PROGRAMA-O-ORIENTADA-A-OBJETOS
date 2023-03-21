package herancafuncionario;

public class TestaHeranca {

    public static void main(String[] args) {
        Gerente g = new Gerente("Jose", 500, 2000, 999);

    Funcionario[] set = new Funcionario[3];
    set[0] = g;
    set[1] = new Funcionario("Antonieta", 1000, 123);
    
    set[2] = new Funcionario("Aurio", 1220, 414);
    
        for (int i = 0; i < set.length; i++) {
            System.out.println(set[i].getNome() + "" + set[i].getSalario());
        }

//        Funcionario f = new Funcionario();
//        this.nome = "Daniel";
//        this.codfunc = 123;
//        this.sal = 1000;
//        
//        Gerente g = new Gerente();
//        Gerente
//        g.nome = "Jose";
//        g.codfunc = 999;
//        g.sal = 2000;
//        g.bonus = 500;
    }
    
}
