import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ClasseTeste {

    @Test
    public void teste1(){
        double result=0, esperado = 0;
        assertEquals(result,esperado);
    }

    @Test
    public void teste2(){
        float square = 2*2;
        float rectangle = 3*2;
        float delta = 2;

        assertEquals(square, rectangle, delta);
    }

    @Test
    public void test3(){
        int value = 0;
        assertNotEquals(0, value, "O resultado não pode ser 0");
    }

    @Test
    public void test4(){
       assertTrue(5>4);
       assertTrue(null==null);
    }

    @Test
    public void test5(){
        assertFalse(5>6);
    }

    @Test
    public void test6(){
        Object dog = new Object();
        assertNotNull(dog);
    }

    @Test
    public void test7(){
        Object cat =null;
        assertNull(cat);
    }

    @Test
    public void test8(){
      String str1 = "India";
        String str2 = "India";
        assertSame(str1,str2);
    }

    @Test
    public void test9(){
        String str1 = "india";
        String str2 = "India";
        assertNotSame(str1,str2);
    }

    @Test
     void givenMultipleAssertion_whenAssertiongAll_theOK(){
        Object obj = null;
        assertAll(
                "heading",
                () -> assertEquals(4,2*2,"4 is 2 times 2"),
                () -> assertEquals("java", "JAVA".toLowerCase()),
                () -> assertNull(obj,"obj is null")
        );
    }

}
