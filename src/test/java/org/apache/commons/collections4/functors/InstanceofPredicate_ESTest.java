/*
 * This file was automatically generated by EvoSuite
 * Wed Oct 16 06:14:10 GMT 2019
 */

package org.apache.commons.collections4.functors;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.collections4.Predicate;
import org.apache.commons.collections4.functors.InstanceofPredicate;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class InstanceofPredicate_ESTest extends InstanceofPredicate_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      InstanceofPredicate instanceofPredicate0 = new InstanceofPredicate((Class<?>) null);
      Class<?> class0 = instanceofPredicate0.getType();
      assertNull(class0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Class<String> class0 = String.class;
      InstanceofPredicate instanceofPredicate0 = new InstanceofPredicate(class0);
      boolean boolean0 = instanceofPredicate0.evaluate(class0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Class<Object> class0 = Object.class;
      InstanceofPredicate instanceofPredicate0 = new InstanceofPredicate((Class<?>) null);
      // Undeclared exception!
      try { 
        instanceofPredicate0.evaluate(class0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.collections4.functors.InstanceofPredicate", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      // Undeclared exception!
      try { 
        InstanceofPredicate.instanceOfPredicate((Class<?>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // The type to check instanceof must not be null
         //
         verifyException("org.apache.commons.collections4.functors.InstanceofPredicate", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Class<Object> class0 = Object.class;
      Predicate<Object> predicate0 = InstanceofPredicate.instanceOfPredicate(class0);
      assertNotNull(predicate0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Class<Object> class0 = Object.class;
      InstanceofPredicate instanceofPredicate0 = new InstanceofPredicate(class0);
      boolean boolean0 = instanceofPredicate0.evaluate(class0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Class<Object> class0 = Object.class;
      InstanceofPredicate instanceofPredicate0 = new InstanceofPredicate(class0);
      Class<?> class1 = instanceofPredicate0.getType();
      assertEquals(1, class1.getModifiers());
  }
}
