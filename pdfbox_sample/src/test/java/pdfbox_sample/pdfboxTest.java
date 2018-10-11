package pdfbox_sample;
import static org.junit.Assert.*;

import org.junit.*;
public class pdfboxTest {

	@Test
	public void testfuc(){
		String s ="somansa zzang zzang1";
		assertTrue(s.equals("somansa zzang zzang"));
	}

	@Test
	public void testfuc2(){
		String s ="somansa zzang zzang";
		assertTrue(s.equals("somansa zzang zzang man"));
	}
}
