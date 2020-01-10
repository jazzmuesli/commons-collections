/*
 * This file was automatically generated by EvoSuite
 * Wed Oct 16 06:23:10 GMT 2019
 */

package org.apache.commons.collections4.queue;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Queue;
import org.apache.commons.collections4.Predicate;
import org.apache.commons.collections4.queue.PredicatedQueue;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class PredicatedQueue_ESTest extends PredicatedQueue_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Predicate<Integer> predicate0 = (Predicate<Integer>) mock(Predicate.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        PredicatedQueue.predicatedQueue((Queue<Integer>) null, (Predicate<? super Integer>) predicate0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // Collection must not be null.
         //
         verifyException("org.apache.commons.collections4.collection.AbstractCollectionDecorator", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Predicate<Object> predicate0 = (Predicate<Object>) mock(Predicate.class, new ViolatedAssumptionAnswer());
      PredicatedQueue<Object> predicatedQueue0 = null;
      try {
        predicatedQueue0 = new PredicatedQueue<Object>((Queue<Object>) null, predicate0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // Collection must not be null.
         //
         verifyException("org.apache.commons.collections4.collection.AbstractCollectionDecorator", e);
      }
  }
}
