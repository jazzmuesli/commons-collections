/*
 * This file was automatically generated by EvoSuite
 * Wed Oct 16 06:25:18 GMT 2019
 */

package org.apache.commons.collections4.iterators;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.collections4.iterators.EmptyMapIterator;
import org.apache.commons.collections4.iterators.EmptyOrderedMapIterator;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class AbstractEmptyMapIterator_ESTest extends AbstractEmptyMapIterator_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      EmptyOrderedMapIterator<Integer, Object> emptyOrderedMapIterator0 = new EmptyOrderedMapIterator<Integer, Object>();
      // Undeclared exception!
      try { 
        emptyOrderedMapIterator0.setValue("gjs");
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Iterator contains no elements
         //
         verifyException("org.apache.commons.collections4.iterators.AbstractEmptyMapIterator", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      EmptyMapIterator<Object, String> emptyMapIterator0 = new EmptyMapIterator<Object, String>();
      // Undeclared exception!
      try { 
        emptyMapIterator0.getKey();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Iterator contains no elements
         //
         verifyException("org.apache.commons.collections4.iterators.AbstractEmptyMapIterator", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      EmptyMapIterator<Object, Object> emptyMapIterator0 = new EmptyMapIterator<Object, Object>();
      // Undeclared exception!
      try { 
        emptyMapIterator0.getValue();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Iterator contains no elements
         //
         verifyException("org.apache.commons.collections4.iterators.AbstractEmptyMapIterator", e);
      }
  }
}
