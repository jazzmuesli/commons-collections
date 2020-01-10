/*
 * This file was automatically generated by EvoSuite
 * Wed Oct 16 05:52:03 GMT 2019
 */

package org.apache.commons.collections4.keyvalue;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.AbstractMap;
import org.apache.commons.collections4.keyvalue.DefaultKeyValue;
import org.apache.commons.collections4.keyvalue.DefaultMapEntry;
import org.apache.commons.collections4.keyvalue.UnmodifiableMapEntry;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class AbstractMapEntry_ESTest extends AbstractMapEntry_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Integer integer0 = new Integer(0);
      UnmodifiableMapEntry<Object, Object> unmodifiableMapEntry0 = new UnmodifiableMapEntry<Object, Object>(integer0, integer0);
      DefaultKeyValue<Integer, String> defaultKeyValue0 = new DefaultKeyValue<Integer, String>(integer0, "");
      UnmodifiableMapEntry<Integer, String> unmodifiableMapEntry1 = new UnmodifiableMapEntry<Integer, String>(defaultKeyValue0);
      unmodifiableMapEntry1.hashCode();
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      UnmodifiableMapEntry<String, String> unmodifiableMapEntry0 = new UnmodifiableMapEntry<String, String>("", "");
      boolean boolean0 = unmodifiableMapEntry0.equals(unmodifiableMapEntry0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Integer integer0 = new Integer((-585));
      DefaultMapEntry<Integer, AbstractMap.SimpleEntry<String, Integer>> defaultMapEntry0 = new DefaultMapEntry<Integer, AbstractMap.SimpleEntry<String, Integer>>(integer0, (AbstractMap.SimpleEntry<String, Integer>) null);
      AbstractMap.SimpleEntry<String, Integer> abstractMap_SimpleEntry0 = defaultMapEntry0.setValue((AbstractMap.SimpleEntry<String, Integer>) null);
      assertNull(abstractMap_SimpleEntry0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Integer integer0 = new Integer((-577));
      UnmodifiableMapEntry<Integer, String> unmodifiableMapEntry0 = new UnmodifiableMapEntry<Integer, String>(integer0, "");
      // Undeclared exception!
      try { 
        unmodifiableMapEntry0.setValue("");
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // setValue() is not supported
         //
         verifyException("org.apache.commons.collections4.keyvalue.UnmodifiableMapEntry", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      DefaultMapEntry<String, String> defaultMapEntry0 = new DefaultMapEntry<String, String>((String) null, "");
      defaultMapEntry0.setValue((String) null);
      defaultMapEntry0.hashCode();
  }
}
