/*
 * This file was automatically generated by EvoSuite
 * Wed Oct 16 06:19:27 GMT 2019
 */

package org.apache.commons.collections4.iterators;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ListIterator;
import org.apache.commons.collections4.ResettableListIterator;
import org.apache.commons.collections4.iterators.EmptyListIterator;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class EmptyListIterator_ESTest extends EmptyListIterator_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ListIterator<Object> listIterator0 = EmptyListIterator.emptyListIterator();
      assertFalse(listIterator0.hasNext());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ResettableListIterator<String> resettableListIterator0 = EmptyListIterator.resettableEmptyListIterator();
      assertFalse(resettableListIterator0.hasNext());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      EmptyListIterator<Object> emptyListIterator0 = new EmptyListIterator<Object>();
  }
}
