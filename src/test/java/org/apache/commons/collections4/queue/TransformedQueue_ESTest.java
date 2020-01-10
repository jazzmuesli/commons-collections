/*
 * This file was automatically generated by EvoSuite
 * Wed Oct 16 06:10:50 GMT 2019
 */

package org.apache.commons.collections4.queue;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Queue;
import org.apache.commons.collections4.Transformer;
import org.apache.commons.collections4.queue.TransformedQueue;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class TransformedQueue_ESTest extends TransformedQueue_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      // Undeclared exception!
      try { 
        TransformedQueue.transformedQueue((Queue<Object>) null, (Transformer<? super Object, ?>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // Collection must not be null.
         //
         verifyException("org.apache.commons.collections4.collection.AbstractCollectionDecorator", e);
      }
  }
}