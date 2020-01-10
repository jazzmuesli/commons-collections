/*
 * This file was automatically generated by EvoSuite
 * Wed Oct 16 06:05:49 GMT 2019
 */

package org.apache.commons.collections4;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.lang.reflect.Array;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.Map;
import org.apache.commons.collections4.Closure;
import org.apache.commons.collections4.ClosureUtils;
import org.apache.commons.collections4.ClosureUtilsTest;
import org.apache.commons.collections4.Predicate;
import org.apache.commons.collections4.Transformer;
import org.apache.commons.collections4.functors.AndPredicate;
import org.apache.commons.collections4.functors.EqualPredicate;
import org.apache.commons.collections4.functors.ExceptionPredicate;
import org.apache.commons.collections4.functors.FalsePredicate;
import org.apache.commons.collections4.functors.NullIsExceptionPredicate;
import org.apache.commons.collections4.functors.NullPredicate;
import org.apache.commons.collections4.functors.OnePredicate;
import org.apache.commons.collections4.functors.OrPredicate;
import org.apache.commons.collections4.functors.TransformedPredicate;
import org.apache.commons.collections4.functors.TransformerPredicate;
import org.apache.commons.collections4.functors.UniquePredicate;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ClosureUtils_ESTest extends ClosureUtils_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Predicate<Object> predicate0 = (Predicate<Object>) mock(Predicate.class, new ViolatedAssumptionAnswer());
      Closure<Object> closure0 = ClosureUtils.invokerClosure("'nqKP|moQx2U,v+@");
      Transformer<Object, Object> transformer0 = (Transformer<Object, Object>) mock(Transformer.class, new ViolatedAssumptionAnswer());
      Closure<Object> closure1 = ClosureUtils.asClosure((Transformer<? super Object, ?>) transformer0);
      Closure<Object> closure2 = ClosureUtils.ifClosure((Predicate<? super Object>) predicate0, (Closure<? super Object>) closure0, (Closure<? super Object>) closure1);
      assertFalse(closure2.equals((Object)closure1));
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Predicate<Object> predicate0 = (Predicate<Object>) mock(Predicate.class, new ViolatedAssumptionAnswer());
      Closure<Object> closure0 = ClosureUtils.invokerClosure("");
      Predicate<Object>[] predicateArray0 = (Predicate<Object>[]) Array.newInstance(Predicate.class, 1);
      predicateArray0[0] = predicate0;
      Closure<Object>[] closureArray0 = (Closure<Object>[]) Array.newInstance(Closure.class, 1);
      closureArray0[0] = closure0;
      Closure<EqualPredicate<String>> closure1 = ClosureUtils.switchClosure((Predicate<? super EqualPredicate<String>>[]) predicateArray0, (Closure<? super EqualPredicate<String>>[]) closureArray0, (Closure<? super EqualPredicate<String>>) closure0);
      assertNotNull(closure1);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Closure<Object>[] closureArray0 = (Closure<Object>[]) Array.newInstance(Closure.class, 3);
      Transformer<Object, Object> transformer0 = (Transformer<Object, Object>) mock(Transformer.class, new ViolatedAssumptionAnswer());
      Closure<Object> closure0 = ClosureUtils.asClosure((Transformer<? super Object, ?>) transformer0);
      closureArray0[0] = closure0;
      closureArray0[1] = closure0;
      Predicate<Object> predicate0 = (Predicate<Object>) mock(Predicate.class, new ViolatedAssumptionAnswer());
      Predicate<Object>[] predicateArray0 = (Predicate<Object>[]) Array.newInstance(Predicate.class, 4);
      predicateArray0[0] = predicate0;
      predicateArray0[1] = predicate0;
      predicateArray0[2] = predicate0;
      predicateArray0[3] = predicate0;
      Closure<Object>[] closureArray1 = (Closure<Object>[]) Array.newInstance(Closure.class, 4);
      closureArray1[0] = closure0;
      closureArray1[1] = closureArray0[0];
      closureArray1[2] = closureArray0[1];
      closureArray1[3] = closure0;
      Closure<String> closure1 = ClosureUtils.switchClosure((Predicate<? super String>[]) predicateArray0, (Closure<? super String>[]) closureArray1);
      assertNotNull(closure1);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Closure<Object> closure0 = ClosureUtils.invokerClosure("24J\"Jen'?70O&Gh']'");
      Closure<Object>[] closureArray0 = (Closure<Object>[]) Array.newInstance(Closure.class, 1);
      closureArray0[0] = closure0;
      Closure<Object> closure1 = ClosureUtils.chainedClosure((Closure<? super Object>[]) closureArray0);
      assertFalse(closure1.equals((Object)closure0));
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Predicate<Object> predicate0 = (Predicate<Object>) mock(Predicate.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        ClosureUtils.whileClosure((Predicate<? super Integer>) predicate0, (Closure<? super Integer>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // Closure must not be null
         //
         verifyException("org.apache.commons.collections4.functors.WhileClosure", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Predicate<Object> predicate0 = (Predicate<Object>) mock(Predicate.class, new ViolatedAssumptionAnswer());
      Closure<Object> closure0 = ClosureUtils.nopClosure();
      Predicate<Object> predicate1 = (Predicate<Object>) mock(Predicate.class, new ViolatedAssumptionAnswer());
      Predicate<Object>[] predicateArray0 = (Predicate<Object>[]) Array.newInstance(Predicate.class, 5);
      predicateArray0[0] = predicate1;
      predicateArray0[1] = predicate0;
      predicateArray0[2] = predicate1;
      predicateArray0[3] = predicate1;
      predicateArray0[4] = predicate0;
      Closure<Object>[] closureArray0 = (Closure<Object>[]) Array.newInstance(Closure.class, 3);
      closureArray0[0] = closure0;
      closureArray0[1] = closure0;
      closureArray0[2] = closureArray0[0];
      // Undeclared exception!
      try { 
        ClosureUtils.switchClosure((Predicate<? super UniquePredicate<FalsePredicate>>[]) predicateArray0, (Closure<? super UniquePredicate<FalsePredicate>>[]) closureArray0, (Closure<? super UniquePredicate<FalsePredicate>>) closureArray0[1]);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The predicate and closure arrays must be the same size
         //
         verifyException("org.apache.commons.collections4.functors.SwitchClosure", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Predicate<Object> predicate0 = (Predicate<Object>) mock(Predicate.class, new ViolatedAssumptionAnswer());
      Closure<Object> closure0 = ClosureUtils.nopClosure();
      Predicate<Object>[] predicateArray0 = (Predicate<Object>[]) Array.newInstance(Predicate.class, 8);
      predicateArray0[0] = predicate0;
      predicateArray0[1] = predicate0;
      predicateArray0[2] = predicate0;
      predicateArray0[3] = predicate0;
      predicateArray0[4] = predicate0;
      predicateArray0[5] = predicate0;
      predicateArray0[6] = predicate0;
      predicateArray0[7] = predicate0;
      Closure<Object>[] closureArray0 = (Closure<Object>[]) Array.newInstance(Closure.class, 9);
      closureArray0[0] = closure0;
      closureArray0[1] = closure0;
      closureArray0[2] = closure0;
      closureArray0[3] = closure0;
      closureArray0[4] = closure0;
      closureArray0[5] = closure0;
      closureArray0[6] = closure0;
      closureArray0[7] = closure0;
      closureArray0[8] = closure0;
      // Undeclared exception!
      try { 
        ClosureUtils.switchClosure((Predicate<? super AbstractMap.SimpleEntry<AbstractMap.SimpleImmutableEntry, TransformedPredicate>>[]) predicateArray0, (Closure<? super AbstractMap.SimpleEntry<AbstractMap.SimpleImmutableEntry, TransformedPredicate>>[]) closureArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The predicate and closure arrays must be the same size
         //
         verifyException("org.apache.commons.collections4.functors.SwitchClosure", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Class<String>[] classArray0 = (Class<String>[]) Array.newInstance(Class.class, 9);
      // Undeclared exception!
      try { 
        ClosureUtils.invokerClosure((String) null, (Class<?>[]) classArray0, (Object[]) classArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // The method to invoke must not be null
         //
         verifyException("org.apache.commons.collections4.functors.InvokerTransformer", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Class<Object>[] classArray0 = (Class<Object>[]) Array.newInstance(Class.class, 0);
      // Undeclared exception!
      try { 
        ClosureUtils.invokerClosure("R?meJ_V,", (Class<?>[]) classArray0, (Object[]) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The parameter types must match the arguments
         //
         verifyException("org.apache.commons.collections4.functors.InvokerTransformer", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      // Undeclared exception!
      try { 
        ClosureUtils.invokerClosure((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // The method to invoke must not be null
         //
         verifyException("org.apache.commons.collections4.functors.InvokerTransformer", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Predicate<Object> predicate0 = (Predicate<Object>) mock(Predicate.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        ClosureUtils.ifClosure((Predicate<? super Integer>) predicate0, (Closure<? super Integer>) null, (Closure<? super Integer>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // Closures must not be null
         //
         verifyException("org.apache.commons.collections4.functors.IfClosure", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Closure<Object> closure0 = ClosureUtils.invokerClosure("24J\"Jen'?70O&Gh']'");
      // Undeclared exception!
      try { 
        ClosureUtils.ifClosure((Predicate<? super Object>) null, (Closure<? super Object>) closure0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // Predicate must not be null
         //
         verifyException("org.apache.commons.collections4.functors.IfClosure", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      // Undeclared exception!
      try { 
        ClosureUtils.doWhileClosure((Closure<? super Object>) null, (Predicate<? super Object>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // Predicate must not be null
         //
         verifyException("org.apache.commons.collections4.functors.WhileClosure", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      // Undeclared exception!
      try { 
        ClosureUtils.switchMapClosure((Map<? extends OnePredicate<Object>, Closure<OnePredicate<Object>>>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // The object and closure map must not be null
         //
         verifyException("org.apache.commons.collections4.ClosureUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Closure<Object> closure0 = ClosureUtils.nopClosure();
      Predicate<Object>[] predicateArray0 = (Predicate<Object>[]) Array.newInstance(Predicate.class, 5);
      Closure<Object>[] closureArray0 = (Closure<Object>[]) Array.newInstance(Closure.class, 3);
      // Undeclared exception!
      try { 
        ClosureUtils.switchClosure((Predicate<? super UniquePredicate<FalsePredicate>>[]) predicateArray0, (Closure<? super UniquePredicate<FalsePredicate>>[]) closureArray0, (Closure<? super UniquePredicate<FalsePredicate>>) closure0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // The predicate array must not contain a null predicate, index 0 was null
         //
         verifyException("org.apache.commons.collections4.functors.FunctorUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Closure<Object> closure0 = ClosureUtils.invokerClosure("'nqKP|moQx2U,v+@");
      Predicate<Object> predicate0 = (Predicate<Object>) mock(Predicate.class, new ViolatedAssumptionAnswer());
      Closure<NullPredicate<AndPredicate>> closure1 = ClosureUtils.ifClosure((Predicate<? super NullPredicate<AndPredicate>>) predicate0, (Closure<? super NullPredicate<AndPredicate>>) closure0);
      assertNotNull(closure1);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Closure<Object>[] closureArray0 = (Closure<Object>[]) Array.newInstance(Closure.class, 2);
      // Undeclared exception!
      try { 
        ClosureUtils.chainedClosure((Closure<? super Object>[]) closureArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // The closure array must not contain a null closure, index 0 was null
         //
         verifyException("org.apache.commons.collections4.functors.FunctorUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      // Undeclared exception!
      try { 
        ClosureUtils.chainedClosure((Collection<? extends Closure<? super OrPredicate<Object>>>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // Closure collection must not be null
         //
         verifyException("org.apache.commons.collections4.functors.ChainedClosure", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Closure<Object> closure0 = ClosureUtils.invokerClosure("'nqKP|moQx2U,v+@");
      Closure<OnePredicate<ClosureUtilsTest.MockClosure>> closure1 = ClosureUtils.forClosure(0, (Closure<? super OnePredicate<ClosureUtilsTest.MockClosure>>) closure0);
      assertNotNull(closure1);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Predicate<Object>[] predicateArray0 = (Predicate<Object>[]) Array.newInstance(Predicate.class, 8);
      Closure<Object>[] closureArray0 = (Closure<Object>[]) Array.newInstance(Closure.class, 9);
      // Undeclared exception!
      try { 
        ClosureUtils.switchClosure((Predicate<? super AbstractMap.SimpleEntry<AbstractMap.SimpleImmutableEntry, TransformedPredicate>>[]) predicateArray0, (Closure<? super AbstractMap.SimpleEntry<AbstractMap.SimpleImmutableEntry, TransformedPredicate>>[]) closureArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // The predicate array must not contain a null predicate, index 0 was null
         //
         verifyException("org.apache.commons.collections4.functors.FunctorUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Closure<OnePredicate<EqualPredicate>> closure0 = ClosureUtils.exceptionClosure();
      assertNotNull(closure0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Predicate<Object> predicate0 = (Predicate<Object>) mock(Predicate.class, new ViolatedAssumptionAnswer());
      Closure<Object> closure0 = ClosureUtils.nopClosure();
      Closure<TransformerPredicate<OrPredicate>> closure1 = ClosureUtils.whileClosure((Predicate<? super TransformerPredicate<OrPredicate>>) predicate0, (Closure<? super TransformerPredicate<OrPredicate>>) closure0);
      assertNotNull(closure1);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      // Undeclared exception!
      try { 
        ClosureUtils.switchClosure((Map<Predicate<Integer>, Closure<Integer>>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // The predicate and closure map must not be null
         //
         verifyException("org.apache.commons.collections4.functors.SwitchClosure", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Class<Integer>[] classArray0 = (Class<Integer>[]) Array.newInstance(Class.class, 7);
      Closure<Object> closure0 = ClosureUtils.invokerClosure("", (Class<?>[]) classArray0, (Object[]) classArray0);
      assertNotNull(closure0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Closure<Object> closure0 = ClosureUtils.invokerClosure("");
      Predicate<Object> predicate0 = (Predicate<Object>) mock(Predicate.class, new ViolatedAssumptionAnswer());
      Closure<ExceptionPredicate<NullIsExceptionPredicate>> closure1 = ClosureUtils.doWhileClosure((Closure<? super ExceptionPredicate<NullIsExceptionPredicate>>) closure0, (Predicate<? super ExceptionPredicate<NullIsExceptionPredicate>>) predicate0);
      assertNotNull(closure1);
  }
}
