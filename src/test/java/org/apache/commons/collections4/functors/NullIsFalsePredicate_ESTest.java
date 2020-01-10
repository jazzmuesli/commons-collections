/*
 * This file was automatically generated by EvoSuite
 * Wed Oct 16 06:07:44 GMT 2019
 */

package org.apache.commons.collections4.functors;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.lang.reflect.Array;
import org.apache.commons.collections4.Predicate;
import org.apache.commons.collections4.functors.AllPredicate;
import org.apache.commons.collections4.functors.NullIsFalsePredicate;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class NullIsFalsePredicate_ESTest extends NullIsFalsePredicate_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Predicate<Object>[] predicateArray0 = (Predicate<Object>[]) Array.newInstance(Predicate.class, 0);
      Predicate<Object> predicate0 = AllPredicate.allPredicate((Predicate<? super Object>[]) predicateArray0);
      AllPredicate<Object> allPredicate0 = new AllPredicate<Object>(predicateArray0);
      NullIsFalsePredicate<Predicate<Object>> nullIsFalsePredicate0 = new NullIsFalsePredicate<Predicate<Object>>(predicate0);
      boolean boolean0 = nullIsFalsePredicate0.evaluate(allPredicate0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Predicate<Object>[] predicateArray0 = (Predicate<Object>[]) Array.newInstance(Predicate.class, 1);
      AllPredicate<Object> allPredicate0 = new AllPredicate<Object>(predicateArray0);
      predicateArray0[0] = (Predicate<Object>) allPredicate0;
      NullIsFalsePredicate<Integer> nullIsFalsePredicate0 = new NullIsFalsePredicate<Integer>(allPredicate0);
      Integer integer0 = new Integer(2111);
      // Undeclared exception!
      try { 
        nullIsFalsePredicate0.evaluate(integer0);
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      NullIsFalsePredicate<Predicate<Object>> nullIsFalsePredicate0 = new NullIsFalsePredicate<Predicate<Object>>((Predicate<? super Predicate<Object>>) null);
      boolean boolean0 = nullIsFalsePredicate0.evaluate((Predicate<Object>) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      AllPredicate<Object> allPredicate0 = new AllPredicate<Object>((Predicate<? super Object>[]) null);
      NullIsFalsePredicate<Integer> nullIsFalsePredicate0 = new NullIsFalsePredicate<Integer>(allPredicate0);
      Integer integer0 = new Integer((-544));
      // Undeclared exception!
      try { 
        nullIsFalsePredicate0.evaluate(integer0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      // Undeclared exception!
      try { 
        NullIsFalsePredicate.nullIsFalsePredicate((Predicate<? super Object>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // Predicate must not be null
         //
         verifyException("org.apache.commons.collections4.functors.NullIsFalsePredicate", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      AllPredicate<Object> allPredicate0 = new AllPredicate<Object>((Predicate<? super Object>[]) null);
      Predicate<Object> predicate0 = NullIsFalsePredicate.nullIsFalsePredicate((Predicate<? super Object>) allPredicate0);
      assertNotNull(predicate0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      AllPredicate<Object> allPredicate0 = new AllPredicate<Object>((Predicate<? super Object>[]) null);
      NullIsFalsePredicate<Predicate<Object>> nullIsFalsePredicate0 = new NullIsFalsePredicate<Predicate<Object>>(allPredicate0);
      Predicate<? super Predicate<Object>>[] predicateArray0 = nullIsFalsePredicate0.getPredicates();
      assertEquals(1, predicateArray0.length);
  }
}