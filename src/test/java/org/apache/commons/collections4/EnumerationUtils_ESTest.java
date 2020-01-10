/*
 * This file was automatically generated by EvoSuite
 * Wed Oct 16 06:05:13 GMT 2019
 */

package org.apache.commons.collections4;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Enumeration;
import java.util.List;
import java.util.StringTokenizer;
import org.apache.commons.collections4.EnumerationUtils;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class EnumerationUtils_ESTest extends EnumerationUtils_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      StringTokenizer stringTokenizer0 = new StringTokenizer("Q^$t8$&g0Qc02^", "Q^$t8$&g0Qc02^");
      List<String> list0 = EnumerationUtils.toList(stringTokenizer0);
      assertTrue(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      StringTokenizer stringTokenizer0 = new StringTokenizer("Q^$t8$&g0Qc02^", "Q^$t8$&g0Qc02^");
      List<Object> list0 = EnumerationUtils.toList((Enumeration<?>) stringTokenizer0);
      assertFalse(list0.contains("Q^$t8$&g0Qc02^"));
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Enumeration<String> enumeration0 = (Enumeration<String>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(true).when(enumeration0).hasMoreElements();
      doReturn((Object) null).when(enumeration0).nextElement();
      String string0 = EnumerationUtils.get(enumeration0, 0);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      // Undeclared exception!
      try { 
        EnumerationUtils.toList((StringTokenizer) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.collections4.EnumerationUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      // Undeclared exception!
      try { 
        EnumerationUtils.toList((Enumeration<?>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.collections4.iterators.EnumerationIterator", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      // Undeclared exception!
      try { 
        EnumerationUtils.get((Enumeration<Integer>) null, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.collections4.EnumerationUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      StringTokenizer stringTokenizer0 = new StringTokenizer("Entry does not exist: ");
      List<String> list0 = EnumerationUtils.toList(stringTokenizer0);
      assertFalse(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      StringTokenizer stringTokenizer0 = new StringTokenizer("Entry does not exist: ");
      Object object0 = EnumerationUtils.get((Enumeration<Object>) stringTokenizer0, 1);
      assertEquals(2, stringTokenizer0.countTokens());
      assertEquals("does", object0);
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      StringTokenizer stringTokenizer0 = new StringTokenizer("H.TZPq");
      // Undeclared exception!
      try { 
        EnumerationUtils.get((Enumeration<Object>) stringTokenizer0, 17);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Entry does not exist: 16
         //
         verifyException("org.apache.commons.collections4.EnumerationUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      Enumeration<Integer> enumeration0 = (Enumeration<Integer>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(true, false).when(enumeration0).hasMoreElements();
      doReturn((Object) null).when(enumeration0).nextElement();
      List<Integer> list0 = EnumerationUtils.toList((Enumeration<? extends Integer>) enumeration0);
      assertEquals(1, list0.size());
  }
}
