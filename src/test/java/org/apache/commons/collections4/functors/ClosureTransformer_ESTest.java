/*
 * This file was automatically generated by EvoSuite
 * Wed Oct 16 06:14:41 GMT 2019
 */

package org.apache.commons.collections4.functors;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.collections4.Closure;
import org.apache.commons.collections4.Transformer;
import org.apache.commons.collections4.functors.ClosureTransformer;
import org.apache.commons.collections4.functors.ExceptionClosure;
import org.apache.commons.collections4.functors.NOPClosure;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class ClosureTransformer_ESTest extends ClosureTransformer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Closure<Object> closure0 = NOPClosure.nopClosure();
      ClosureTransformer<String> closureTransformer0 = new ClosureTransformer<String>(closure0);
      String string0 = closureTransformer0.transform((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Closure<Object> closure0 = NOPClosure.nopClosure();
      ClosureTransformer<Object> closureTransformer0 = new ClosureTransformer<Object>(closure0);
      Object object0 = closureTransformer0.transform(closure0);
      assertNotNull(object0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ClosureTransformer<Closure<Object>> closureTransformer0 = new ClosureTransformer<Closure<Object>>((Closure<? super Closure<Object>>) null);
      Closure<? super Closure<Object>> closure0 = closureTransformer0.getClosure();
      assertNull(closure0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      ClosureTransformer<Object> closureTransformer0 = new ClosureTransformer<Object>((Closure<? super Object>) null);
      // Undeclared exception!
      try { 
        closureTransformer0.transform("org.apache.commons.collections4.functors.NullIsFalsePredicate");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.collections4.functors.ClosureTransformer", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      // Undeclared exception!
      try { 
        ClosureTransformer.closureTransformer((Closure<? super String>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // Closure must not be null
         //
         verifyException("org.apache.commons.collections4.functors.ClosureTransformer", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Closure<Object> closure0 = ExceptionClosure.exceptionClosure();
      Transformer<Object, Object> transformer0 = ClosureTransformer.closureTransformer((Closure<? super Object>) closure0);
      assertNotNull(transformer0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Closure<Object> closure0 = ExceptionClosure.exceptionClosure();
      ClosureTransformer<Integer> closureTransformer0 = new ClosureTransformer<Integer>(closure0);
      Integer integer0 = new Integer(1473);
      // Undeclared exception!
      try { 
        closureTransformer0.transform(integer0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // ExceptionClosure invoked
         //
         verifyException("org.apache.commons.collections4.functors.ExceptionClosure", e);
      }
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      Closure<Object> closure0 = ExceptionClosure.exceptionClosure();
      ClosureTransformer<Object> closureTransformer0 = new ClosureTransformer<Object>(closure0);
      Closure<? super Object> closure1 = closureTransformer0.getClosure();
      assertNotNull(closure1);
  }
}