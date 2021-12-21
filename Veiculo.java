import java.io.*;
import java.util.Scanner;

public class Veiculo {
	private String marca;
	private int rodas;
	private String modelo;
	private int veloat = 0;
	
	public Veiculo(int v, int r, String m, String marca) { 
	    this.veloat = v;
	    this.rodas = r;
	    this.modelo = m;
	    this.marca = marca;
	}
	
	public void aceleracao(int v) {
		this.veloat += v;
	}
	
	public void desaceleracao(int v) {
		this.veloat -= v;
	}
	
	public int Getveloat() {
		return(this.veloat);
	}
	public void Setveloat(int v) {
		this.veloat = v;
	}

	
	public int GetRodas() {
		return(this.rodas);
	}
	public void SetRodas(int r) {
		this.rodas = r;
	}

	
	public String GetMarca() {
		return(this.marca);
	}
	public void SetMarca(String m) {
		this.marca = m;
	}

	
	public String GetModelo() {
		return(this.modelo);
	}
	public void SetModelo(String m) {
		this.modelo = m;
	}

	public void infos() {
		System.out.println(this.veloat);
		System.out.println(this.rodas);
		System.out.println(this.modelo);
		System.out.println(this.marca);
	}


    public static void main(String args[]) throws IOException {
        Questao2 obj = new Pessoa();

        Scanner ler = new Scanner(System.in);
        String endereco = ler.nextLine();
        BufferedReader leitura = new BufferedReader(new FileReader(endereco));

        String x = leitura.readLine(); 
        String y = leitura.readLine(); 
		String z = leitura.readLine(); 
        String u = leitura.readLine();
		obj.rodas = Integer.parseInt(c);
		obj.veloat = Integer.parseInt(d);

        leitura.close();
        ler.close();


    }
}
