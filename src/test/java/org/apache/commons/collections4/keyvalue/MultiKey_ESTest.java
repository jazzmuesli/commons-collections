/*
 * This file was automatically generated by EvoSuite
 * Wed Oct 16 05:57:50 GMT 2019
 */

package org.apache.commons.collections4.keyvalue;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.lang.reflect.Array;
import org.apache.commons.collections4.keyvalue.MultiKey;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class MultiKey_ESTest extends MultiKey_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Object[] objectArray0 = new Object[0];
      MultiKey<Object> multiKey0 = new MultiKey<Object>(objectArray0, false);
      int int0 = multiKey0.size();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Object object0 = new Object();
      Integer integer0 = new Integer(0);
      MultiKey<Object> multiKey0 = new MultiKey<Object>((Object) null, object0, integer0, "", "");
      Object object1 = multiKey0.getKey(0);
      assertNull(object1);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      MultiKey<Object>[] multiKeyArray0 = (MultiKey<Object>[]) Array.newInstance(MultiKey.class, 7);
      MultiKey<Object> multiKey0 = new MultiKey<Object>((Object[]) multiKeyArray0, true);
      assertEquals(7, multiKey0.size());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      MultiKey<Object> multiKey0 = null;
      try {
        multiKey0 = new MultiKey<Object>((Object[]) null, false);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The array of keys must not be null
         //
         verifyException("org.apache.commons.collections4.keyvalue.MultiKey", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Object[] objectArray0 = new Object[0];
      MultiKey<Object> multiKey0 = new MultiKey<Object>(objectArray0, false);
      Object[] objectArray1 = multiKey0.getKeys();
      assertNotSame(objectArray0, objectArray1);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Integer integer0 = new Integer(1);
      MultiKey<Integer> multiKey0 = new MultiKey<Integer>(integer0, integer0);
      Object[] objectArray0 = new Object[20];
      objectArray0[4] = (Object) multiKey0;
      MultiKey<Object> multiKey1 = new MultiKey<Object>(objectArray0);
      boolean boolean0 = multiKey1.equals(objectArray0[4]);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      MultiKey<MultiKey<String>> multiKey0 = new MultiKey<MultiKey<String>>((MultiKey<String>) null, (MultiKey<String>) null, (MultiKey<String>) null, (MultiKey<String>) null);
      boolean boolean0 = multiKey0.equals(multiKey0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Integer integer0 = new Integer((-148));
      MultiKey<Integer> multiKey0 = new MultiKey<Integer>(integer0, integer0, integer0, integer0, integer0);
      boolean boolean0 = multiKey0.equals(integer0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      MultiKey<Object> multiKey0 = new MultiKey<Object>((Object) null, "p", (Object) null, (Object) null);
      MultiKey<MultiKey<Object>> multiKey1 = new MultiKey<MultiKey<Object>>(multiKey0, multiKey0);
      // Undeclared exception!
      try { 
        multiKey1.getKey((-146));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -146
         //
         verifyException("org.apache.commons.collections4.keyvalue.MultiKey", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      MultiKey<String> multiKey0 = new MultiKey<String>("p", "MultiKey[null, p, null, null]", "'!2ggs%Ni7");
      assertEquals(3, multiKey0.size());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Integer integer0 = new Integer((-148));
      MultiKey<Integer> multiKey0 = new MultiKey<Integer>(integer0, integer0, integer0, integer0, integer0);
      int int0 = multiKey0.size();
      assertEquals(5, int0);
  }
}