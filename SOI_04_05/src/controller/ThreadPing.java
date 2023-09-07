package controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class ThreadPing extends Thread {

	private int iteração;
	
	public ThreadPing(int iteração) {
		this.iteração = iteração;
	}

	@Override
	public void run() {
		ping();
	}
	
	private void ping() {
			switch(iteração) {
			case 0:
				try {
					Process p = Runtime.getRuntime().exec("ping -4 -c 10 www.google.com.br");
					InputStream fluxo = p.getInputStream();
					InputStreamReader leitor = new InputStreamReader(fluxo);
					BufferedReader buffer = new BufferedReader(leitor);
					String linha = buffer.readLine();
					String ping = "";
					
					while(linha != null) {
						if(linha.contains("time=")) {
							String[]vlinha3 = linha.split("time=");
							System.out.println("Google - tempo#"+vlinha3[1]);
						}
						if(linha.contains("avg")) {
							String[]vlinha = linha.split("/");
							ping = vlinha[4];
						}
				linha = buffer.readLine();	
				}
					System.out.println("O tempo médio por ping para www.google.com.br é "+ping);
					buffer.close();
					leitor.close();
					fluxo.close();
			}catch(IOException e){
				e.printStackTrace();
			}
				break;
			case 1:
				try {
					Process p = Runtime.getRuntime().exec("ping -4 -c 10 www.uol.com.br");
					InputStream fluxo = p.getInputStream();
					InputStreamReader leitor = new InputStreamReader(fluxo);
					BufferedReader buffer = new BufferedReader(leitor);
					String linha = buffer.readLine();
					String ping = "";
					
					while(linha != null) {
						if(linha.contains("time=")) {
							String[]vlinha3 = linha.split("time=");
							System.out.println("Uol - tempo#"+vlinha3[1]);
						}
						if(linha.contains("avg")) {
							String[]vlinha = linha.split("/");
							ping = vlinha[4];
						}
				linha = buffer.readLine();	
				}
					System.out.println("O tempo médio por ping para www.uol.com.br é "+ping);
					buffer.close();
					leitor.close();
					fluxo.close();
			}catch(IOException e){
				e.printStackTrace();
			}
				break;
			case 2:
				try {
					Process p = Runtime.getRuntime().exec("ping -4 -c 10 www.terra.com.br");
					InputStream fluxo = p.getInputStream();
					InputStreamReader leitor = new InputStreamReader(fluxo);
					BufferedReader buffer = new BufferedReader(leitor);
					String linha = buffer.readLine();
					String ping = "";
					
					while(linha != null) {
						if(linha.contains("time=")) {
							String[]vlinha3 = linha.split("time=");
							System.out.println("Terra - tempo#"+vlinha3[1]);
						}
						if(linha.contains("avg")) {
							String[]vlinha = linha.split("/");
							ping = vlinha[4];
						}
				linha = buffer.readLine();	
				}
					System.out.println("O tempo médio por ping para www.terra.com.br é "+ping);
					buffer.close();
					leitor.close();
					fluxo.close();
			}catch(IOException e){
				e.printStackTrace();
			}
			}
	}
	
}
