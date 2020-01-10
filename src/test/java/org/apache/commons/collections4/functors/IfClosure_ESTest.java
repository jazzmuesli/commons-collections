/*
 * This file was automatically generated by EvoSuite
 * Wed Oct 16 06:03:11 GMT 2019
 */

package org.apache.commons.collections4.functors;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.collections4.Closure;
import org.apache.commons.collections4.Predicate;
import org.apache.commons.collections4.functors.IfClosure;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class IfClosure_ESTest extends IfClosure_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Predicate<String> predicate0 = (Predicate<String>) mock(Predicate.class, new ViolatedAssumptionAnswer());
      IfClosure<String> ifClosure0 = new IfClosure<String>(predicate0, (Closure<? super String>) null);
      Closure<? super String> closure0 = ifClosure0.getTrueClosure();
      assertNull(closure0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Predicate<Object> predicate0 = (Predicate<Object>) mock(Predicate.class, new ViolatedAssumptionAnswer());
      Closure<Object> closure0 = (Closure<Object>) mock(Closure.class, new ViolatedAssumptionAnswer());
      IfClosure<Object> ifClosure0 = new IfClosure<Object>(predicate0, closure0);
      IfClosure<String> ifClosure1 = new IfClosure<String>((Predicate<? super String>) null, ifClosure0, ifClosure0);
      Predicate<? super String> predicate1 = ifClosure1.getPredicate();
      assertNull(predicate1);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Predicate<Object> predicate0 = (Predicate<Object>) mock(Predicate.class, new ViolatedAssumptionAnswer());
      IfClosure<Object> ifClosure0 = new IfClosure<Object>(predicate0, (Closure<? super Object>) null, (Closure<? super Object>) null);
      Closure<? super Object> closure0 = ifClosure0.getFalseClosure();
      assertNull(closure0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Predicate<Object> predicate0 = (Predicate<Object>) mock(Predicate.class, new ViolatedAssumptionAnswer());
      Closure<Object> closure0 = (Closure<Object>) mock(Closure.class, new ViolatedAssumptionAnswer());
      IfClosure<Object> ifClosure0 = new IfClosure<Object>(predicate0, closure0);
      // Undeclared exception!
      try { 
        IfClosure.ifClosure((Predicate<? super String>) null, (Closure<? super String>) ifClosure0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // Predicate must not be null
         //
         verifyException("org.apache.commons.collections4.functors.IfClosure", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Predicate<Object> predicate0 = (Predicate<Object>) mock(Predicate.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(predicate0).evaluate(any());
      IfClosure<Object> ifClosure0 = new IfClosure<Object>(predicate0, (Closure<? super Object>) null, (Closure<? super Object>) null);
      // Undeclared exception!
      try { 
        ifClosure0.execute(ifClosure0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.collections4.functors.IfClosure", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Predicate<Object> predicate0 = (Predicate<Object>) mock(Predicate.class, new ViolatedAssumptionAnswer());
      Closure<Object> closure0 = (Closure<Object>) mock(Closure.class, new ViolatedAssumptionAnswer());
      Closure<Object> closure1 = IfClosure.ifClosure((Predicate<? super Object>) predicate0, (Closure<? super Object>) closure0);
      IfClosure<Object> ifClosure0 = new IfClosure<Object>(predicate0, closure1);
      Closure<Object> closure2 = IfClosure.ifClosure((Predicate<? super Object>) predicate0, (Closure<? super Object>) ifClosure0, (Closure<? super Object>) closure1);
      assertFalse(closure2.equals((Object)closure0));
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Predicate<Object> predicate0 = (Predicate<Object>) mock(Predicate.class, new ViolatedAssumptionAnswer());
      doReturn(true, true).when(predicate0).evaluate(any());
      Closure<Object> closure0 = (Closure<Object>) mock(Closure.class, new ViolatedAssumptionAnswer());
      Closure<Object> closure1 = IfClosure.ifClosure((Predicate<? super Object>) predicate0, (Closure<? super Object>) closure0);
      IfClosure<Object> ifClosure0 = new IfClosure<Object>(predicate0, closure1);
      IfClosure<Integer> ifClosure1 = new IfClosure<Integer>(predicate0, closure1, closure1);
      ifClosure0.execute(ifClosure1);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Predicate<Object> predicate0 = (Predicate<Object>) mock(Predicate.class, new ViolatedAssumptionAnswer());
      IfClosure<Object> ifClosure0 = new IfClosure<Object>(predicate0, (Closure<? super Object>) null);
      // Undeclared exception!
      try { 
        IfClosure.ifClosure((Predicate<? super Object>) predicate0, (Closure<? super Object>) ifClosure0, (Closure<? super Object>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // Closures must not be null
         //
         verifyException("org.apache.commons.collections4.functors.IfClosure", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Predicate<Object> predicate0 = (Predicate<Object>) mock(Predicate.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        IfClosure.ifClosure((Predicate<? super Object>) predicate0, (Closure<? super Object>) null, (Closure<? super Object>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // Closures must not be null
         //
         verifyException("org.apache.commons.collections4.functors.IfClosure", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Closure<Object> closure0 = (Closure<Object>) mock(Closure.class, new ViolatedAssumptionAnswer());
      IfClosure<Object> ifClosure0 = new IfClosure<Object>((Predicate<? super Object>) null, closure0, closure0);
      // Undeclared exception!
      try { 
        IfClosure.ifClosure((Predicate<? super Object>) null, (Closure<? super Object>) ifClosure0, (Closure<? super Object>) ifClosure0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // Predicate must not be null
         //
         verifyException("org.apache.commons.collections4.functors.IfClosure", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Predicate<Object> predicate0 = (Predicate<Object>) mock(Predicate.class, new ViolatedAssumptionAnswer());
      Closure<Object> closure0 = (Closure<Object>) mock(Closure.class, new ViolatedAssumptionAnswer());
      Closure<Object> closure1 = IfClosure.ifClosure((Predicate<? super Object>) predicate0, (Closure<? super Object>) closure0);
      IfClosure<Integer> ifClosure0 = new IfClosure<Integer>(predicate0, closure1, closure1);
      Closure<? super Integer> closure2 = ifClosure0.getFalseClosure();
      assertNotNull(closure2);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Predicate<Object> predicate0 = (Predicate<Object>) mock(Predicate.class, new ViolatedAssumptionAnswer());
      doReturn("FS[R\"Ft*`gRA*?").when(predicate0).toString();
      Closure<Object> closure0 = (Closure<Object>) mock(Closure.class, new ViolatedAssumptionAnswer());
      Closure<Object> closure1 = IfClosure.ifClosure((Predicate<? super Object>) predicate0, (Closure<? super Object>) closure0);
      IfClosure<Object> ifClosure0 = new IfClosure<Object>(predicate0, closure1);
      Predicate<? super Object> predicate1 = ifClosure0.getPredicate();
      assertNotNull(predicate1);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Predicate<Object> predicate0 = (Predicate<Object>) mock(Predicate.class, new ViolatedAssumptionAnswer());
      Closure<Object> closure0 = (Closure<Object>) mock(Closure.class, new ViolatedAssumptionAnswer());
      Closure<Object> closure1 = IfClosure.ifClosure((Predicate<? super Object>) predicate0, (Closure<? super Object>) closure0);
      IfClosure<Object> ifClosure0 = new IfClosure<Object>(predicate0, closure1);
      Closure<? super Object> closure2 = ifClosure0.getTrueClosure();
      assertNotNull(closure2);
  }
}
