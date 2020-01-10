/*
 * This file was automatically generated by EvoSuite
 * Wed Oct 16 06:25:06 GMT 2019
 */

package org.apache.commons.collections4.functors;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.commons.collections4.Factory;
import org.apache.commons.collections4.functors.ExceptionFactory;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class ExceptionFactory_ESTest extends ExceptionFactory_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Factory<String> factory0 = ExceptionFactory.exceptionFactory();
      assertNotNull(factory0);
  }
}
