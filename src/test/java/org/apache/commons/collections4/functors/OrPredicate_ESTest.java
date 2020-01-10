/*
 * This file was automatically generated by EvoSuite
 * Wed Oct 16 06:02:41 GMT 2019
 */

package org.apache.commons.collections4.functors;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.lang.reflect.Array;
import java.util.Comparator;
import org.apache.commons.collections4.Equator;
import org.apache.commons.collections4.Predicate;
import org.apache.commons.collections4.functors.AnyPredicate;
import org.apache.commons.collections4.functors.ComparatorPredicate;
import org.apache.commons.collections4.functors.EqualPredicate;
import org.apache.commons.collections4.functors.ExceptionPredicate;
import org.apache.commons.collections4.functors.FalsePredicate;
import org.apache.commons.collections4.functors.NonePredicate;
import org.apache.commons.collections4.functors.NullPredicate;
import org.apache.commons.collections4.functors.OrPredicate;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class OrPredicate_ESTest extends OrPredicate_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Predicate<Object> predicate0 = ExceptionPredicate.exceptionPredicate();
      OrPredicate<Object> orPredicate0 = new OrPredicate<Object>(predicate0, predicate0);
      Integer integer0 = new Integer((-1008));
      // Undeclared exception!
      try { 
        orPredicate0.evaluate(integer0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // ExceptionPredicate invoked
         //
         verifyException("org.apache.commons.collections4.functors.ExceptionPredicate", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Predicate<Object>[] predicateArray0 = (Predicate<Object>[]) Array.newInstance(Predicate.class, 2);
      NonePredicate<Object> nonePredicate0 = new NonePredicate<Object>(predicateArray0);
      predicateArray0[0] = (Predicate<Object>) nonePredicate0;
      AnyPredicate<Object> anyPredicate0 = new AnyPredicate<Object>(predicateArray0);
      Equator<Object> equator0 = (Equator<Object>) mock(Equator.class, new ViolatedAssumptionAnswer());
      EqualPredicate<Object> equalPredicate0 = new EqualPredicate<Object>(anyPredicate0, equator0);
      OrPredicate<Predicate<Object>> orPredicate0 = new OrPredicate<Predicate<Object>>(nonePredicate0, equalPredicate0);
      // Undeclared exception!
      orPredicate0.evaluate(predicateArray0[1]);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Predicate<Object> predicate0 = NullPredicate.nullPredicate();
      OrPredicate<Predicate<Object>> orPredicate0 = new OrPredicate<Predicate<Object>>(predicate0, (Predicate<? super Predicate<Object>>) null);
      // Undeclared exception!
      try { 
        orPredicate0.evaluate(predicate0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.collections4.functors.OrPredicate", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Predicate<Object> predicate0 = EqualPredicate.equalPredicate((Object) "'5");
      OrPredicate<String> orPredicate0 = new OrPredicate<String>(predicate0, predicate0);
      boolean boolean0 = orPredicate0.evaluate("'5");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Predicate<Object> predicate0 = FalsePredicate.falsePredicate();
      OrPredicate<Object> orPredicate0 = new OrPredicate<Object>(predicate0, predicate0);
      boolean boolean0 = orPredicate0.evaluate(orPredicate0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(2).when(comparator0).compare(any() , any());
      ComparatorPredicate.Criterion comparatorPredicate_Criterion0 = ComparatorPredicate.Criterion.GREATER;
      ComparatorPredicate<Object> comparatorPredicate0 = new ComparatorPredicate<Object>("-", comparator0, comparatorPredicate_Criterion0);
      Comparator<String> comparator1 = (Comparator<String>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(2).when(comparator1).compare(anyString() , anyString());
      Predicate<String> predicate0 = ComparatorPredicate.comparatorPredicate("25B!BY;Lx@r&.1Vaez", comparator1);
      OrPredicate<Object> orPredicate0 = new OrPredicate<Object>(comparatorPredicate0, comparatorPredicate0);
      OrPredicate<String> orPredicate1 = new OrPredicate<String>(predicate0, orPredicate0);
      boolean boolean0 = orPredicate1.evaluate("25B!BY;Lx@r&.1Vaez");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Predicate<Object> predicate0 = FalsePredicate.falsePredicate();
      OrPredicate<Object> orPredicate0 = new OrPredicate<Object>(predicate0, predicate0);
      // Undeclared exception!
      try { 
        OrPredicate.orPredicate((Predicate<? super Predicate<Object>>) orPredicate0, (Predicate<? super Predicate<Object>>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // Predicate must not be null
         //
         verifyException("org.apache.commons.collections4.functors.OrPredicate", e);
      }
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      // Undeclared exception!
      try { 
        OrPredicate.orPredicate((Predicate<? super Integer>) null, (Predicate<? super Integer>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // Predicate must not be null
         //
         verifyException("org.apache.commons.collections4.functors.OrPredicate", e);
      }
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      ComparatorPredicate.Criterion comparatorPredicate_Criterion0 = ComparatorPredicate.Criterion.GREATER;
      ComparatorPredicate<Object> comparatorPredicate0 = new ComparatorPredicate<Object>("-", comparator0, comparatorPredicate_Criterion0);
      Comparator<String> comparator1 = (Comparator<String>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      Predicate<String> predicate0 = ComparatorPredicate.comparatorPredicate("25B!BY;Lx@r&.1Vaez", comparator1);
      OrPredicate<Object> orPredicate0 = new OrPredicate<Object>(comparatorPredicate0, comparatorPredicate0);
      OrPredicate<String> orPredicate1 = new OrPredicate<String>(predicate0, orPredicate0);
      Predicate<? super String>[] predicateArray0 = orPredicate1.getPredicates();
      assertEquals(2, predicateArray0.length);
  }

  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      ComparatorPredicate.Criterion comparatorPredicate_Criterion0 = ComparatorPredicate.Criterion.GREATER;
      ComparatorPredicate<Object> comparatorPredicate0 = new ComparatorPredicate<Object>("-", comparator0, comparatorPredicate_Criterion0);
      OrPredicate<Object> orPredicate0 = new OrPredicate<Object>(comparatorPredicate0, comparatorPredicate0);
      Predicate<Object> predicate0 = OrPredicate.orPredicate((Predicate<? super Object>) comparatorPredicate0, (Predicate<? super Object>) orPredicate0);
      assertNotNull(predicate0);
  }
}
