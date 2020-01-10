/*
 * This file was automatically generated by EvoSuite
 * Wed Oct 16 05:48:45 GMT 2019
 */

package org.apache.commons.collections4.keyvalue;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.AbstractMap;
import java.util.Map;
import org.apache.commons.collections4.KeyValue;
import org.apache.commons.collections4.keyvalue.DefaultKeyValue;
import org.apache.commons.collections4.keyvalue.DefaultMapEntry;
import org.apache.commons.collections4.keyvalue.UnmodifiableMapEntry;
import org.apache.commons.collections4.map.SingletonMap;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class DefaultKeyValue_ESTest extends DefaultKeyValue_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Integer integer0 = new Integer(0);
      SingletonMap<Integer, Integer> singletonMap0 = new SingletonMap<Integer, Integer>(integer0, integer0);
      UnmodifiableMapEntry<Integer, Integer> unmodifiableMapEntry0 = new UnmodifiableMapEntry<Integer, Integer>(singletonMap0);
      DefaultKeyValue<Object, Object> defaultKeyValue0 = new DefaultKeyValue<Object, Object>((KeyValue<?, ?>) unmodifiableMapEntry0);
      defaultKeyValue0.hashCode();
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      DefaultKeyValue<String, Integer> defaultKeyValue0 = new DefaultKeyValue<String, Integer>();
      DefaultKeyValue<Object, String> defaultKeyValue1 = new DefaultKeyValue<Object, String>(defaultKeyValue0, "");
      String string0 = defaultKeyValue1.setValue((String) null);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Integer integer0 = new Integer(0);
      AbstractMap.SimpleEntry<Integer, String> abstractMap_SimpleEntry0 = new AbstractMap.SimpleEntry<Integer, String>(integer0, (String) null);
      DefaultKeyValue<Object, String> defaultKeyValue0 = new DefaultKeyValue<Object, String>(abstractMap_SimpleEntry0);
      // Undeclared exception!
      try { 
        defaultKeyValue0.setKey(defaultKeyValue0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // DefaultKeyValue may not contain itself as a key.
         //
         verifyException("org.apache.commons.collections4.keyvalue.DefaultKeyValue", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      DefaultKeyValue<String, DefaultKeyValue<Object, Object>> defaultKeyValue0 = new DefaultKeyValue<String, DefaultKeyValue<Object, Object>>();
      Integer integer0 = new Integer(1639);
      DefaultKeyValue<Object, Integer> defaultKeyValue1 = new DefaultKeyValue<Object, Integer>(defaultKeyValue0, integer0);
      Object object0 = defaultKeyValue1.setKey(defaultKeyValue0);
      DefaultKeyValue<Object, Object> defaultKeyValue2 = new DefaultKeyValue<Object, Object>(defaultKeyValue0);
      defaultKeyValue2.setValue(defaultKeyValue0);
      defaultKeyValue0.setValue(defaultKeyValue2);
      // Undeclared exception!
      try { 
        defaultKeyValue2.equals(object0);
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      DefaultKeyValue<String, Integer> defaultKeyValue0 = null;
      try {
        defaultKeyValue0 = new DefaultKeyValue<String, Integer>((KeyValue<? extends String, ? extends Integer>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.collections4.keyvalue.DefaultKeyValue", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      DefaultKeyValue<DefaultKeyValue<String, Integer>, DefaultKeyValue<String, Object>> defaultKeyValue0 = null;
      try {
        defaultKeyValue0 = new DefaultKeyValue<DefaultKeyValue<String, Integer>, DefaultKeyValue<String, Object>>((Map.Entry<? extends DefaultKeyValue<String, Integer>, ? extends DefaultKeyValue<String, Object>>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.collections4.keyvalue.DefaultKeyValue", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Integer integer0 = new Integer(584);
      DefaultKeyValue<Integer, String> defaultKeyValue0 = new DefaultKeyValue<Integer, String>(integer0, "");
      boolean boolean0 = defaultKeyValue0.equals((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      AbstractMap.SimpleEntry<Object, String> abstractMap_SimpleEntry0 = new AbstractMap.SimpleEntry<Object, String>((Object) null, "cG/nEav*LHy5ss3U");
      DefaultKeyValue<Object, Object> defaultKeyValue0 = new DefaultKeyValue<Object, Object>(abstractMap_SimpleEntry0);
      defaultKeyValue0.hashCode();
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      DefaultKeyValue<String, Integer> defaultKeyValue0 = new DefaultKeyValue<String, Integer>();
      defaultKeyValue0.setKey(";Lh");
      defaultKeyValue0.hashCode();
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Integer integer0 = new Integer((-911));
      DefaultMapEntry<String, Integer> defaultMapEntry0 = new DefaultMapEntry<String, Integer>((String) null, integer0);
      DefaultKeyValue<String, Integer> defaultKeyValue0 = new DefaultKeyValue<String, Integer>((Map.Entry<? extends String, ? extends Integer>) defaultMapEntry0);
      DefaultKeyValue<Object, Integer> defaultKeyValue1 = new DefaultKeyValue<Object, Integer>((Map.Entry<?, ? extends Integer>) defaultMapEntry0);
      boolean boolean0 = defaultKeyValue0.equals(defaultKeyValue1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      DefaultKeyValue<String, Integer> defaultKeyValue0 = new DefaultKeyValue<String, Integer>();
      Integer integer0 = new Integer(584);
      defaultKeyValue0.setValue(integer0);
      DefaultKeyValue<DefaultKeyValue<Object, Object>, Object> defaultKeyValue1 = new DefaultKeyValue<DefaultKeyValue<Object, Object>, Object>();
      boolean boolean0 = defaultKeyValue1.equals(defaultKeyValue0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Integer integer0 = new Integer(0);
      DefaultKeyValue<Integer, String> defaultKeyValue0 = new DefaultKeyValue<Integer, String>(integer0, "![Y#Y${=@y$Z-");
      Map.Entry<Integer, String> map_Entry0 = defaultKeyValue0.toMapEntry();
      DefaultKeyValue<Object, Object> defaultKeyValue1 = new DefaultKeyValue<Object, Object>(map_Entry0);
      defaultKeyValue1.setKey("![Y#Y${=@y$Z-");
      DefaultKeyValue<Object, String> defaultKeyValue2 = new DefaultKeyValue<Object, String>("![Y#Y${=@y$Z-", "");
      boolean boolean0 = defaultKeyValue1.equals(defaultKeyValue2);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      DefaultKeyValue<Integer, String> defaultKeyValue0 = new DefaultKeyValue<Integer, String>();
      Integer integer0 = new Integer(0);
      Map.Entry<Integer, String> map_Entry0 = defaultKeyValue0.toMapEntry();
      DefaultKeyValue<Integer, Integer> defaultKeyValue1 = new DefaultKeyValue<Integer, Integer>(integer0, integer0);
      DefaultKeyValue<Object, String> defaultKeyValue2 = new DefaultKeyValue<Object, String>(map_Entry0);
      boolean boolean0 = defaultKeyValue2.equals(defaultKeyValue1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      DefaultKeyValue<String, Object> defaultKeyValue0 = new DefaultKeyValue<String, Object>();
      DefaultKeyValue<Integer, DefaultKeyValue<Integer, Object>> defaultKeyValue1 = new DefaultKeyValue<Integer, DefaultKeyValue<Integer, Object>>();
      boolean boolean0 = defaultKeyValue1.equals(defaultKeyValue0);
      assertTrue(boolean0);
  }
}
