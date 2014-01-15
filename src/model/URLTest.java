package model;

import static org.junit.Assert.*;

import org.junit.Test;

public class URLTest {

	@Test
	public void testaURLHTTP(){
		MontadorURL url = new MontadorURL("http://www.google.com/mail/user=fulano");
		assertEquals(url.getProtocolo(), "http");
		assertEquals(url.getHost(), "www");
		assertEquals(url.getDominio(), "google.com");
		assertEquals(url.getPath(), "mail");
		assertEquals(url.getParametros(), "user=fulano");
	}
	
	@Test
	public void testaURLSSH(){
		MontadorURL ssh = new MontadorURL("ssh://fulano%senha@git.com/");
		assertEquals(ssh.getProtocolo(), "ssh");
		assertEquals(ssh.getUsuario(), "fulano");
		assertEquals(ssh.getSenha(), "senha");
		assertEquals(ssh.getDominio(), "git.com");
	}

}
