/*
 * This file was automatically generated by EvoSuite
 * Wed Oct 16 06:13:26 GMT 2019
 */

package org.apache.commons.collections4.properties;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import java.util.Enumeration;
import java.util.Set;
import java.util.function.BiFunction;
import org.apache.commons.collections4.properties.SortedProperties;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class SortedProperties_ESTest extends SortedProperties_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      SortedProperties sortedProperties0 = new SortedProperties();
      Set<Object> set0 = sortedProperties0.keySet();
      BiFunction<Object, Object, String> biFunction0 = (BiFunction<Object, Object, String>) mock(BiFunction.class, new ViolatedAssumptionAnswer());
      doReturn("1XEEFPRbh").when(biFunction0).apply(any() , any());
      sortedProperties0.compute(set0, biFunction0);
      Enumeration<Object> enumeration0 = sortedProperties0.keys();
      assertNotNull(enumeration0);
  }
}