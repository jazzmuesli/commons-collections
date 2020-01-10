/*
 * This file was automatically generated by EvoSuite
 * Wed Oct 16 05:58:56 GMT 2019
 */

package org.apache.commons.collections4.iterators;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Iterator;
import org.apache.commons.collections4.iterators.PushbackIterator;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class PushbackIterator_ESTest extends PushbackIterator_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Iterator<String> iterator0 = (Iterator<String>) mock(Iterator.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null).when(iterator0).next();
      PushbackIterator<String> pushbackIterator0 = PushbackIterator.pushbackIterator((Iterator<? extends String>) iterator0);
      String string0 = pushbackIterator0.next();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Iterator<Object> iterator0 = (Iterator<Object>) mock(Iterator.class, new ViolatedAssumptionAnswer());
      PushbackIterator<Object> pushbackIterator0 = PushbackIterator.pushbackIterator((Iterator<?>) iterator0);
      // Undeclared exception!
      try { 
        pushbackIterator0.pushback((Object) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.ArrayDeque", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      PushbackIterator<Integer> pushbackIterator0 = new PushbackIterator<Integer>((Iterator<? extends Integer>) null);
      // Undeclared exception!
      try { 
        pushbackIterator0.next();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.collections4.iterators.PushbackIterator", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      PushbackIterator<String> pushbackIterator0 = new PushbackIterator<String>((Iterator<? extends String>) null);
      // Undeclared exception!
      try { 
        pushbackIterator0.hasNext();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.collections4.iterators.PushbackIterator", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Iterator<String> iterator0 = (Iterator<String>) mock(Iterator.class, new ViolatedAssumptionAnswer());
      PushbackIterator<String> pushbackIterator0 = new PushbackIterator<String>(iterator0);
      pushbackIterator0.pushback("Nk)JR");
      String string0 = pushbackIterator0.next();
      assertEquals("Nk)JR", string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Iterator<String> iterator0 = (Iterator<String>) mock(Iterator.class, new ViolatedAssumptionAnswer());
      PushbackIterator<String> pushbackIterator0 = new PushbackIterator<String>(iterator0);
      pushbackIterator0.pushback("Nk)JR");
      PushbackIterator<String> pushbackIterator1 = new PushbackIterator<String>(pushbackIterator0);
      boolean boolean0 = pushbackIterator1.hasNext();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Iterator<String> iterator0 = (Iterator<String>) mock(Iterator.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(iterator0).hasNext();
      PushbackIterator<String> pushbackIterator0 = new PushbackIterator<String>(iterator0);
      boolean boolean0 = pushbackIterator0.hasNext();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Iterator<String> iterator0 = (Iterator<String>) mock(Iterator.class, new ViolatedAssumptionAnswer());
      PushbackIterator<String> pushbackIterator0 = new PushbackIterator<String>(iterator0);
      PushbackIterator<String> pushbackIterator1 = PushbackIterator.pushbackIterator((Iterator<? extends String>) pushbackIterator0);
      assertSame(pushbackIterator1, pushbackIterator0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      // Undeclared exception!
      try { 
        PushbackIterator.pushbackIterator((Iterator<?>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // Iterator must not be null
         //
         verifyException("org.apache.commons.collections4.iterators.PushbackIterator", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Iterator<String> iterator0 = (Iterator<String>) mock(Iterator.class, new ViolatedAssumptionAnswer());
      PushbackIterator<String> pushbackIterator0 = new PushbackIterator<String>(iterator0);
      pushbackIterator0.pushback("Nk)JR");
      boolean boolean0 = pushbackIterator0.hasNext();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Iterator<String> iterator0 = (Iterator<String>) mock(Iterator.class, new ViolatedAssumptionAnswer());
      PushbackIterator<String> pushbackIterator0 = PushbackIterator.pushbackIterator((Iterator<? extends String>) iterator0);
      PushbackIterator<Object> pushbackIterator1 = new PushbackIterator<Object>(pushbackIterator0);
      // Undeclared exception!
      try { 
        pushbackIterator1.remove();
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.collections4.iterators.PushbackIterator", e);
      }
  }
}
