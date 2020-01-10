/*
 * This file was automatically generated by EvoSuite
 * Wed Oct 16 06:17:02 GMT 2019
 */

package org.apache.commons.collections4.functors;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.HashMap;
import java.util.Map;
import org.apache.commons.collections4.Transformer;
import org.apache.commons.collections4.functors.MapTransformer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class MapTransformer_ESTest extends MapTransformer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Transformer<Object, Object> transformer0 = MapTransformer.mapTransformer((Map<? super Object, ?>) null);
      assertNotNull(transformer0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      HashMap<Object, Object> hashMap0 = new HashMap<Object, Object>();
      Transformer<String, Object> transformer0 = MapTransformer.mapTransformer((Map<? super String, ?>) hashMap0);
      assertNotNull(transformer0);
  }
}
