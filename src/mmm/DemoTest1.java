package mmm;

import static org.junit.Assert.*;

import org.junit.Test;

public class DemoTest1 {
	Demo str = new Demo();
	@Test
	public void test1() {
		assertEquals("一个字母变小写",str.smallString("A"),"a");
	}
	@Test
	public void test2() {
		assertEquals("一个字母变小写",str.smallString("a"),"a");
	}
	@Test
	public void test3() {
		assertEquals("一个字母变小写",str.smallString(""),"");
	}
	@Test
	public void test4() {
		assertEquals("一个字母变小写",str.smallString(""),"a");
	}
	@Test
	public void test5() {
		assertEquals("一个字母变小写",str.smallString("A"),"");
	}
	@Test
	public void test6() {
		assertEquals("一个字母变小写",str.smallString("A"),"A");
	}
	@Test
	public void test7() {
		assertEquals("一个字母变小写",str.smallString("HELLO"),"HEllo");
	}
	@Test
	public void test8() {
		assertEquals("一个字母变小写",str.smallString("HELLO"),"hello");
	}
	@Test
	public void test9() {
		assertEquals("一个字母变小写",str.smallString("HELL0"),"hello");
	}
	@Test
	public void test10() {
		assertEquals("一个字母变小写",str.smallString("Cc"),"cc");
	}

}
