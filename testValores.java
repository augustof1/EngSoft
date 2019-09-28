package atividade1;

import junit.framework.TestCase;

public class testValores extends TestCase {
private Valores v;

protected void setUp() throws Exception{

super.setUp();
v = new Valores();
v.ins(5);
v.ins(12);
v.ins(1);
v.ins(30);
v.ins(152);
v.ins(6);

}

public void testlns() {
assertEquals(false,v.ins(-8));
assertEquals(false,v.ins(2));
v.ins(3);
assertEquals(9,v.size());
v.ins(4);
assertEquals(10,v.size());
v.ins(5);
assertEquals(10,v.size());
assertEquals(false,v.ins(11));
}

public void testDel() {

assertEquals(5,v.del(0));
assertEquals(1,v.del(2));
assertEquals(152,v.del(4));
assertEquals(6,v.del(5));
v.ins(1);
v.ins(5);
v.ins(152);
v.ins(6);
}

public void testMean() {
assertTrue(Math.round(34.3) == Math.round(v.mean()));
}

public void testGreater() {
assertEquals(152, v.greater());
}

public void testLower() {
assertEquals(0, v.lower());
}



}

