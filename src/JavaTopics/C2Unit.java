package JavaTopics;

import org.junit.jupiter.api.Test;
import org.testng.Assert;

public class C2Unit
{
@Test
public void start()
{
	Assert.assertEquals(C2.m5(), "test");
	System.out.println("test123");
}

@Test
public void s2()
{
	C2 c = new C2();
	c.m1(100);
	c.m2();

}
}
