/*
 * This file was automatically generated by EvoSuite
 * Wed Oct 16 06:05:46 GMT 2019
 */

package org.apache.commons.collections4.iterators;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Iterator;
import java.util.function.Consumer;
import org.apache.commons.collections4.iterators.IteratorIterable;
import org.apache.commons.collections4.iterators.LoopingListIterator;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class IteratorIterable_ESTest extends IteratorIterable_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      IteratorIterable<Object> iteratorIterable0 = null;
      try {
        iteratorIterable0 = new IteratorIterable<Object>((Iterator<?>) null, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // Iterator must not be null
         //
         verifyException("org.apache.commons.collections4.iterators.ListIteratorWrapper", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Iterator<Integer> iterator0 = (Iterator<Integer>) mock(Iterator.class, new ViolatedAssumptionAnswer());
      IteratorIterable<Integer> iteratorIterable0 = new IteratorIterable<Integer>(iterator0, false);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Iterator<LoopingListIterator<Object>> iterator0 = (Iterator<LoopingListIterator<Object>>) mock(Iterator.class, new ViolatedAssumptionAnswer());
      IteratorIterable<LoopingListIterator<Object>> iteratorIterable0 = new IteratorIterable<LoopingListIterator<Object>>(iterator0, true);
      Iterator<LoopingListIterator<Object>> iterator1 = iteratorIterable0.iterator();
      IteratorIterable<Object> iteratorIterable1 = new IteratorIterable<Object>(iterator1);
      Iterator<Object> iterator2 = iteratorIterable1.iterator();
      assertNotNull(iterator2);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Iterator<LoopingListIterator<Object>> iterator0 = (Iterator<LoopingListIterator<Object>>) mock(Iterator.class, new ViolatedAssumptionAnswer());
      doReturn(true, false).when(iterator0).hasNext();
      doReturn((Object) null).when(iterator0).next();
      IteratorIterable<LoopingListIterator<Object>> iteratorIterable0 = new IteratorIterable<LoopingListIterator<Object>>(iterator0, true);
      Consumer<Object> consumer0 = (Consumer<Object>) mock(Consumer.class, new ViolatedAssumptionAnswer());
      iteratorIterable0.forEach(consumer0);
  }
}
