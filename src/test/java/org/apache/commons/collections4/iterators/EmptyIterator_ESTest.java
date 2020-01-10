/*
 * This file was automatically generated by EvoSuite
 * Wed Oct 16 06:18:33 GMT 2019
 */

package org.apache.commons.collections4.iterators;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Iterator;
import org.apache.commons.collections4.ResettableIterator;
import org.apache.commons.collections4.iterators.EmptyIterator;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class EmptyIterator_ESTest extends EmptyIterator_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      EmptyIterator<String> emptyIterator0 = new EmptyIterator<String>();
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ResettableIterator<Object> resettableIterator0 = EmptyIterator.resettableEmptyIterator();
      assertNotNull(resettableIterator0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Iterator<Integer> iterator0 = EmptyIterator.emptyIterator();
      assertNotNull(iterator0);
  }
}
