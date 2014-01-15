package model;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class MontadorURL {

	private URL urlProcessada;
	
	public MontadorURL(String url){
		try {
			urlProcessada = new URL(url);
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	public String getProtocolo() {
		return urlProcessada.getProtocol();
	}

	public String getHost() {
		Scanner scanner = new Scanner(urlProcessada.getHost());
		scanner.useDelimiter("\\.");
		String host = scanner.next();
		return host;
	}

	public String getDominio() {
		Scanner scanner = new Scanner(urlProcessada.getHost());
		scanner.useDelimiter("\\.");
		scanner.next();
		String dominio = scanner.next();
		return dominio;
	}

	public String getPath() {
		Scanner scanner = new Scanner(urlProcessada.getPath());
		scanner.useDelimiter("/");
		String path = scanner.next();
		return path;
	}

	public String getParametros() {
		return urlProcessada.getPath();
	}

	public String getUsuario() {
		return null;
	}

	public String getSenha() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
