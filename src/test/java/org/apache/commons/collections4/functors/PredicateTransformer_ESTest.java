/*
 * This file was automatically generated by EvoSuite
 * Wed Oct 16 06:12:55 GMT 2019
 */

package org.apache.commons.collections4.functors;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.collections4.Predicate;
import org.apache.commons.collections4.Transformer;
import org.apache.commons.collections4.functors.PredicateTransformer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class PredicateTransformer_ESTest extends PredicateTransformer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Predicate<Object> predicate0 = (Predicate<Object>) mock(Predicate.class, new ViolatedAssumptionAnswer());
      doReturn(true).when(predicate0).evaluate(any());
      PredicateTransformer<Object> predicateTransformer0 = new PredicateTransformer<Object>(predicate0);
      Boolean boolean0 = predicateTransformer0.transform("*U");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Predicate<String> predicate0 = (Predicate<String>) mock(Predicate.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(predicate0).evaluate(anyString());
      PredicateTransformer<String> predicateTransformer0 = new PredicateTransformer<String>(predicate0);
      Boolean boolean0 = predicateTransformer0.transform("n*x");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      PredicateTransformer<Integer> predicateTransformer0 = new PredicateTransformer<Integer>((Predicate<? super Integer>) null);
      Predicate<? super Integer> predicate0 = predicateTransformer0.getPredicate();
      assertNull(predicate0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      // Undeclared exception!
      try { 
        PredicateTransformer.predicateTransformer((Predicate<? super Object>) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Predicate must not be null
         //
         verifyException("org.apache.commons.collections4.functors.PredicateTransformer", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Predicate<Object> predicate0 = (Predicate<Object>) mock(Predicate.class, new ViolatedAssumptionAnswer());
      Transformer<Object, Boolean> transformer0 = PredicateTransformer.predicateTransformer((Predicate<? super Object>) predicate0);
      assertNotNull(transformer0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      PredicateTransformer<String> predicateTransformer0 = new PredicateTransformer<String>((Predicate<? super String>) null);
      // Undeclared exception!
      try { 
        predicateTransformer0.transform("WyFSs+<!`,{%~");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.collections4.functors.PredicateTransformer", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Predicate<Integer> predicate0 = (Predicate<Integer>) mock(Predicate.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(predicate0).toString();
      PredicateTransformer<Integer> predicateTransformer0 = new PredicateTransformer<Integer>(predicate0);
      Predicate<? super Integer> predicate1 = predicateTransformer0.getPredicate();
      assertNotNull(predicate1);
  }
}
