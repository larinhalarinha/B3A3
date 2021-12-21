import java.io.*;
import java.util.Scanner;

public class Pessoa{ 
    private String nome;
    private String pai;
    private String mae;

    public Pessoa(String n, String m, String p){ 
        this.nome = n;
        this.pai = p;
        this.mae = m; 
    }

    public Pessoa(String n){
        this.nome = n;
    }

    //
    public String getNome() {
        return this.nome;
    }
    public void setNome(String n) {
        this.nome = n;
    }

    //
    public String getPai() {
        return this.pai;
    }
    public void setPai(String p) {
        this.pai = p;
    }

    //
    public String getMae() {
        return this.mae;
    }
    public void setMae(String m) {
        this.mae = m;
    }


    public void Irmaos(Pessoa a) {
		if(this.pai == a.pai || this.mae == a.mae){
			System.out.println("irmãos");
		} else {
			System.out.println("não são irmãos");
		}
	}

    public void Antecessor(Pessoa a) {
		if(a.nome == this.pai || a.nome == this.mae) {
			System.out.println("são parentes");
		} else {
			System.out.println("não são parentes");
		}
	}
	
    public static void main(String args[]) throws IOException {
        Pessoa obj = new Pessoa();

        Scanner ler = new Scanner(System.in);
        String endereco = ler.nextLine();
        BufferedReader leitura = new BufferedReader(new FileReader(endereco));


        String x = leitura.readLine();
        String y = leitura.readLine();

        leitura.close();
        ler.close();


    }

}