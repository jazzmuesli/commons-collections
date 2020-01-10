/*
 * This file was automatically generated by EvoSuite
 * Wed Oct 16 05:47:50 GMT 2019
 */

package org.apache.commons.collections4.functors;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Comparator;
import org.apache.commons.collections4.functors.ComparatorPredicate;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ComparatorPredicate_ESTest extends ComparatorPredicate_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Integer integer0 = new Integer(0);
      Comparator<Integer> comparator0 = (Comparator<Integer>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(comparator0).compare(anyInt() , anyInt());
      ComparatorPredicate.Criterion comparatorPredicate_Criterion0 = ComparatorPredicate.Criterion.LESS_OR_EQUAL;
      ComparatorPredicate<Integer> comparatorPredicate0 = new ComparatorPredicate<Integer>(integer0, comparator0, comparatorPredicate_Criterion0);
      boolean boolean0 = comparatorPredicate0.evaluate(integer0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Integer integer0 = new Integer(5);
      Comparator<Integer> comparator0 = (Comparator<Integer>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(comparator0).compare(anyInt() , anyInt());
      ComparatorPredicate.Criterion comparatorPredicate_Criterion0 = ComparatorPredicate.Criterion.GREATER_OR_EQUAL;
      ComparatorPredicate<Integer> comparatorPredicate0 = new ComparatorPredicate<Integer>(integer0, comparator0, comparatorPredicate_Criterion0);
      boolean boolean0 = comparatorPredicate0.evaluate(integer0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(2).when(comparator0).compare(any() , any());
      ComparatorPredicate.Criterion comparatorPredicate_Criterion0 = ComparatorPredicate.Criterion.LESS;
      ComparatorPredicate<Object> comparatorPredicate0 = new ComparatorPredicate<Object>("73h*z;", comparator0, comparatorPredicate_Criterion0);
      boolean boolean0 = comparatorPredicate0.evaluate("LESS_OR_EQUAL");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Comparator<String> comparator0 = (Comparator<String>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(comparator0).compare(anyString() , anyString());
      ComparatorPredicate.Criterion comparatorPredicate_Criterion0 = ComparatorPredicate.Criterion.GREATER;
      ComparatorPredicate<String> comparatorPredicate0 = new ComparatorPredicate<String>("", comparator0, comparatorPredicate_Criterion0);
      boolean boolean0 = comparatorPredicate0.evaluate("~");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      ComparatorPredicate.Criterion comparatorPredicate_Criterion0 = ComparatorPredicate.Criterion.EQUAL;
      Integer integer0 = new Integer(0);
      Comparator<Integer> comparator0 = (Comparator<Integer>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(79).when(comparator0).compare(anyInt() , anyInt());
      ComparatorPredicate<Integer> comparatorPredicate0 = new ComparatorPredicate<Integer>(integer0, comparator0, comparatorPredicate_Criterion0);
      boolean boolean0 = comparatorPredicate0.evaluate(integer0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      ComparatorPredicate.Criterion comparatorPredicate_Criterion0 = ComparatorPredicate.Criterion.EQUAL;
      ComparatorPredicate<String> comparatorPredicate0 = new ComparatorPredicate<String>("w-v_0XWiXPe", (Comparator<String>) null, comparatorPredicate_Criterion0);
      // Undeclared exception!
      try { 
        comparatorPredicate0.evaluate("");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.collections4.functors.ComparatorPredicate", e);
      }
  }
}
