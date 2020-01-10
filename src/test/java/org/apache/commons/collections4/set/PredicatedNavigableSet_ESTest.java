/*
 * This file was automatically generated by EvoSuite
 * Wed Oct 16 06:18:36 GMT 2019
 */

package org.apache.commons.collections4.set;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.NavigableSet;
import org.apache.commons.collections4.Predicate;
import org.apache.commons.collections4.set.PredicatedNavigableSet;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class PredicatedNavigableSet_ESTest extends PredicatedNavigableSet_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Predicate<Object> predicate0 = (Predicate<Object>) mock(Predicate.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        PredicatedNavigableSet.predicatedNavigableSet((NavigableSet<String>) null, (Predicate<? super String>) predicate0);
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
      PredicatedNavigableSet<String> predicatedNavigableSet0 = null;
      try {
        predicatedNavigableSet0 = new PredicatedNavigableSet<String>((NavigableSet<String>) null, predicate0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // Collection must not be null.
         //
         verifyException("org.apache.commons.collections4.collection.AbstractCollectionDecorator", e);
      }
  }
}
