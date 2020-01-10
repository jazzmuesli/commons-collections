/*
 * This file was automatically generated by EvoSuite
 * Wed Oct 16 06:16:38 GMT 2019
 */

package org.apache.commons.collections4.functors;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.commons.collections4.Factory;
import org.apache.commons.collections4.functors.ConstantFactory;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class ConstantFactory_ESTest extends ConstantFactory_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ConstantFactory<Object> constantFactory0 = new ConstantFactory<Object>((Object) null);
      Object object0 = constantFactory0.getConstant();
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ConstantFactory<String> constantFactory0 = new ConstantFactory<String>("hX17:");
      String string0 = constantFactory0.create();
      assertEquals("hX17:", string0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Factory<Object> factory0 = ConstantFactory.constantFactory((Object) null);
      assertNotNull(factory0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Factory<Object> factory0 = ConstantFactory.constantFactory((Object) "OS{a7T1 b9t*9");
      assertNotNull(factory0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      ConstantFactory<String> constantFactory0 = new ConstantFactory<String>("OS{a7T1 b9t*9");
      String string0 = constantFactory0.getConstant();
      assertEquals("OS{a7T1 b9t*9", string0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      ConstantFactory<Integer> constantFactory0 = new ConstantFactory<Integer>((Integer) null);
      Integer integer0 = constantFactory0.create();
      assertNull(integer0);
  }
}
