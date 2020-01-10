/*
 * This file was automatically generated by EvoSuite
 * Wed Oct 16 06:10:06 GMT 2019
 */

package org.apache.commons.collections4.map;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.InputStream;
import java.io.PipedInputStream;
import java.util.Map;
import java.util.function.BiConsumer;
import org.apache.commons.collections4.map.AbstractHashedMap;
import org.apache.commons.collections4.map.CaseInsensitiveMap;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class CaseInsensitiveMap_ESTest extends CaseInsensitiveMap_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      CaseInsensitiveMap<String, Object> caseInsensitiveMap0 = new CaseInsensitiveMap<String, Object>(1073741824, 1073741824);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      CaseInsensitiveMap<String, Object> caseInsensitiveMap0 = new CaseInsensitiveMap<String, Object>();
      CaseInsensitiveMap<Object, Object> caseInsensitiveMap1 = new CaseInsensitiveMap<Object, Object>(0, 2154.4106F);
      caseInsensitiveMap1.clone();
      int int0 = 403;
      CaseInsensitiveMap<Object, String> caseInsensitiveMap2 = new CaseInsensitiveMap<Object, String>(403);
      CaseInsensitiveMap<Object, String> caseInsensitiveMap3 = caseInsensitiveMap2.clone();
      caseInsensitiveMap3.convertKey(caseInsensitiveMap0);
      CaseInsensitiveMap<String, Integer> caseInsensitiveMap4 = new CaseInsensitiveMap<String, Integer>(1073741824);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      int int0 = 0;
      CaseInsensitiveMap<Object, Object> caseInsensitiveMap0 = new CaseInsensitiveMap<Object, Object>(0);
      CaseInsensitiveMap<String, Object> caseInsensitiveMap1 = null;
      try {
        caseInsensitiveMap1 = new CaseInsensitiveMap<String, Object>((Map<? extends String, ?>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.collections4.map.AbstractHashedMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      int int0 = 0;
      CaseInsensitiveMap<Object, CaseInsensitiveMap<Integer, Object>> caseInsensitiveMap0 = new CaseInsensitiveMap<Object, CaseInsensitiveMap<Integer, Object>>(0);
      AbstractHashedMap.HashEntry<Object, CaseInsensitiveMap<Integer, Object>> abstractHashedMap_HashEntry0 = null;
      int int1 = 0;
      CaseInsensitiveMap<Object, String> caseInsensitiveMap1 = null;
      try {
        caseInsensitiveMap1 = new CaseInsensitiveMap<Object, String>((-3146));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Initial capacity must be a non negative number
         //
         verifyException("org.apache.commons.collections4.map.AbstractHashedMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      CaseInsensitiveMap<Integer, Object> caseInsensitiveMap0 = new CaseInsensitiveMap<Integer, Object>();
      caseInsensitiveMap0.createValuesIterator();
      CaseInsensitiveMap<Integer, Object> caseInsensitiveMap1 = caseInsensitiveMap0.clone();
      CaseInsensitiveMap<Object, Object> caseInsensitiveMap2 = new CaseInsensitiveMap<Object, Object>(caseInsensitiveMap0);
      caseInsensitiveMap2.convertKey("");
      CaseInsensitiveMap<CaseInsensitiveMap<Object, Integer>, String> caseInsensitiveMap3 = new CaseInsensitiveMap<CaseInsensitiveMap<Object, Integer>, String>(2769);
      CaseInsensitiveMap<CaseInsensitiveMap<Object, Integer>, String> caseInsensitiveMap4 = caseInsensitiveMap3.clone();
      Object object0 = caseInsensitiveMap4.convertKey((Object) null);
      CaseInsensitiveMap<Object, String> caseInsensitiveMap5 = new CaseInsensitiveMap<Object, String>(caseInsensitiveMap3);
      CaseInsensitiveMap<Object, String> caseInsensitiveMap6 = caseInsensitiveMap5.clone();
      AbstractHashedMap<String, String> abstractHashedMap0 = new AbstractHashedMap<String, String>(2769, 2769, (-384));
      abstractHashedMap0.put("", "");
      caseInsensitiveMap3.ensureCapacity(0);
      CaseInsensitiveMap<String, Object> caseInsensitiveMap7 = new CaseInsensitiveMap<String, Object>(abstractHashedMap0);
      CaseInsensitiveMap<String, Object> caseInsensitiveMap8 = caseInsensitiveMap7.clone();
      caseInsensitiveMap8.clone();
      caseInsensitiveMap6.convertKey(caseInsensitiveMap3);
      caseInsensitiveMap7.clone();
      Object object1 = caseInsensitiveMap1.convertKey((Object) null);
      assertSame(object1, object0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      CaseInsensitiveMap<Object, InputStream> caseInsensitiveMap0 = new CaseInsensitiveMap<Object, InputStream>(5);
      Object object0 = caseInsensitiveMap0.convertKey((Object) null);
      CaseInsensitiveMap<Object, Object> caseInsensitiveMap1 = new CaseInsensitiveMap<Object, Object>(1605, 1605);
      Object object1 = caseInsensitiveMap1.convertKey((Object) null);
      assertSame(object1, object0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      CaseInsensitiveMap<InputStream, Object> caseInsensitiveMap0 = new CaseInsensitiveMap<InputStream, Object>();
      CaseInsensitiveMap<PipedInputStream, CaseInsensitiveMap<InputStream, String>> caseInsensitiveMap1 = new CaseInsensitiveMap<PipedInputStream, CaseInsensitiveMap<InputStream, String>>(1691);
      Object object0 = caseInsensitiveMap1.convertKey(caseInsensitiveMap0);
      assertNotNull(object0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      CaseInsensitiveMap<String, Object> caseInsensitiveMap0 = new CaseInsensitiveMap<String, Object>(1835, 3201.0F);
      assertEquals(0, caseInsensitiveMap0.size());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      CaseInsensitiveMap<Integer, String> caseInsensitiveMap0 = new CaseInsensitiveMap<Integer, String>();
      CaseInsensitiveMap<Integer, String> caseInsensitiveMap1 = caseInsensitiveMap0.clone();
      CaseInsensitiveMap<Integer, String> caseInsensitiveMap2 = new CaseInsensitiveMap<Integer, String>(caseInsensitiveMap1);
      assertTrue(caseInsensitiveMap2.equals((Object)caseInsensitiveMap1));
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      CaseInsensitiveMap<String, CaseInsensitiveMap<Object, String>> caseInsensitiveMap0 = new CaseInsensitiveMap<String, CaseInsensitiveMap<Object, String>>();
      CaseInsensitiveMap<Integer, Object> caseInsensitiveMap1 = new CaseInsensitiveMap<Integer, Object>(0);
      CaseInsensitiveMap<Integer, Object> caseInsensitiveMap2 = caseInsensitiveMap1.clone();
      assertEquals(0, caseInsensitiveMap2.size());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      CaseInsensitiveMap<Integer, Integer> caseInsensitiveMap0 = null;
      try {
        caseInsensitiveMap0 = new CaseInsensitiveMap<Integer, Integer>((-1679), 1347.9912F);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Initial capacity must be a non negative number
         //
         verifyException("org.apache.commons.collections4.map.AbstractHashedMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      CaseInsensitiveMap<String, InputStream> caseInsensitiveMap0 = new CaseInsensitiveMap<String, InputStream>();
      assertEquals(0, caseInsensitiveMap0.size());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      CaseInsensitiveMap<Object, String> caseInsensitiveMap0 = new CaseInsensitiveMap<Object, String>();
      CaseInsensitiveMap<Object, Object> caseInsensitiveMap1 = new CaseInsensitiveMap<Object, Object>(caseInsensitiveMap0);
      caseInsensitiveMap0.remove((Object) caseInsensitiveMap1, (Object) caseInsensitiveMap0);
      caseInsensitiveMap0.remove((Object) "uHW");
      caseInsensitiveMap1.convertKey((Object) null);
      CaseInsensitiveMap<Integer, Object> caseInsensitiveMap2 = new CaseInsensitiveMap<Integer, Object>(0);
      CaseInsensitiveMap<Integer, Object> caseInsensitiveMap3 = caseInsensitiveMap2.clone();
      assertTrue(caseInsensitiveMap3.equals((Object)caseInsensitiveMap2));
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      CaseInsensitiveMap<Object, Object> caseInsensitiveMap0 = new CaseInsensitiveMap<Object, Object>(53, 53);
      assertEquals(0, caseInsensitiveMap0.size());
  }
}
