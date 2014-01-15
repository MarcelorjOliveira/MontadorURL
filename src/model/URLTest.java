package model;

import static org.junit.Assert.*;

import org.junit.Test;

public class URLTest {

	@Test
	public void testaURLHTTP(){
		MontadorURL url = new MontadorURL("http://www.google.com/mail/user=fulano");
		assertEquals("http", url.getProtocolo());
		assertEquals("www", url.getHost());
		assertEquals("google.com", url.getDominio());
		assertEquals("mail", url.getPath());
		assertEquals("user=fulano", url.getParametros());
	}
	
	/*
	@Test
	public void testaURLSSH(){
		MontadorURL ssh = new MontadorURL("ssh://fulano%senha@git.com/");
		assertEquals("ssh", ssh.getProtocolo());
		assertEquals("fulano", ssh.getUsuario());
		assertEquals("senha", ssh.getSenha());
		assertEquals("git.com", ssh.getDominio());
	}
	*/

}
