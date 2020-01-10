/*
 * This file was automatically generated by EvoSuite
 * Wed Oct 16 06:23:14 GMT 2019
 */

package org.apache.commons.collections4.map;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.InputStream;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import org.apache.commons.collections4.map.AbstractHashedMap;
import org.apache.commons.collections4.map.HashedMap;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class HashedMap_ESTest extends HashedMap_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      int int0 = 1;
      HashedMap<HashedMap<Object, Integer>, HashedMap<String, Integer>> hashedMap0 = new HashedMap<HashedMap<Object, Integer>, HashedMap<String, Integer>>(1, 800.5F);
      AbstractHashedMap.KeySet<HashedMap<Object, Integer>> abstractHashedMap_KeySet0 = new AbstractHashedMap.KeySet<HashedMap<Object, Integer>>(hashedMap0);
      LinkedList<Locale.LanguageRange> linkedList0 = new LinkedList<Locale.LanguageRange>();
      HashedMap<String, Integer> hashedMap1 = new HashedMap<String, Integer>(1, 1);
      Set<String> set0 = hashedMap1.keySet();
      Locale.FilteringMode locale_FilteringMode0 = Locale.FilteringMode.REJECT_EXTENDED_RANGES;
      List<String> list0 = Locale.filterTags((List<Locale.LanguageRange>) linkedList0, (Collection<String>) set0, locale_FilteringMode0);
      abstractHashedMap_KeySet0.removeAll(list0);
      BiConsumer<Object, Object> biConsumer0 = (BiConsumer<Object, Object>) mock(BiConsumer.class, new ViolatedAssumptionAnswer());
      hashedMap0.forEach(biConsumer0);
      hashedMap0.modCount = 0;
      hashedMap0.createEntrySetIterator();
      hashedMap0.keySet = abstractHashedMap_KeySet0;
      hashedMap0.clone();
      int int1 = 1073741824;
      HashedMap<Integer, String> hashedMap2 = new HashedMap<Integer, String>(1073741824, 1073741824);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      HashedMap<Object, Object> hashedMap0 = new HashedMap<Object, Object>();
      hashedMap0.size = 0;
      HashedMap<Object, Object> hashedMap1 = hashedMap0.clone();
      hashedMap1.mapIterator();
      HashedMap<String, Integer> hashedMap2 = new HashedMap<String, Integer>(2574);
      HashedMap<String, Integer> hashedMap3 = hashedMap2.clone();
      Integer integer0 = new Integer((-3119));
      hashedMap3.putIfAbsent("(uCK4+7P>JW]#P", integer0);
      HashedMap<String, Integer> hashedMap4 = new HashedMap<String, Integer>(hashedMap3);
      hashedMap4.clone();
      HashedMap<Object, Integer> hashedMap5 = null;
      try {
        hashedMap5 = new HashedMap<Object, Integer>(2574, 0.0F);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Load factor must be greater than 0
         //
         verifyException("org.apache.commons.collections4.map.AbstractHashedMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      HashedMap<HashedMap<Object, Object>, Object> hashedMap0 = new HashedMap<HashedMap<Object, Object>, Object>();
      HashedMap<Object, Object> hashedMap1 = new HashedMap<Object, Object>();
      hashedMap0.addMapping(0, 0, hashedMap1, hashedMap1);
      hashedMap0.data = null;
      hashedMap0.threshold = 0;
      // Undeclared exception!
      try { 
        hashedMap0.clone();
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
      Map<String, String> map0 = null;
      HashedMap<String, String> hashedMap0 = null;
      try {
        hashedMap0 = new HashedMap<String, String>((Map<? extends String, ? extends String>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.collections4.map.AbstractHashedMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      HashedMap<Object, String> hashedMap0 = new HashedMap<Object, String>();
      hashedMap0.keySet();
      HashedMap<Integer, String> hashedMap1 = new HashedMap<Integer, String>();
      HashedMap<Integer, String> hashedMap2 = hashedMap1.clone();
      AbstractHashedMap.KeySet<Integer> abstractHashedMap_KeySet0 = new AbstractHashedMap.KeySet<Integer>(hashedMap2);
      hashedMap2.keySet = abstractHashedMap_KeySet0;
      HashedMap<InputStream, InputStream> hashedMap3 = new HashedMap<InputStream, InputStream>();
      HashedMap<InputStream, InputStream> hashedMap4 = hashedMap3.clone();
      assertTrue(hashedMap4.equals((Object)hashedMap3));
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      float float0 = (-1058.0F);
      HashedMap<Object, String> hashedMap0 = null;
      try {
        hashedMap0 = new HashedMap<Object, String>(44, (-1058.0F));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Load factor must be greater than 0
         //
         verifyException("org.apache.commons.collections4.map.AbstractHashedMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      int int0 = (-1319);
      HashedMap<Object, Object> hashedMap0 = null;
      try {
        hashedMap0 = new HashedMap<Object, Object>((-1319));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Initial capacity must be a non negative number
         //
         verifyException("org.apache.commons.collections4.map.AbstractHashedMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      HashedMap<String, String> hashedMap0 = new HashedMap<String, String>(4, 2260.0F);
      HashedMap<String, String> hashedMap1 = hashedMap0.clone();
      HashedMap<String, Object> hashedMap2 = new HashedMap<String, Object>(hashedMap1);
      assertTrue(hashedMap2.isEmpty());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      HashedMap<String, HashedMap<InputStream, Object>> hashedMap0 = new HashedMap<String, HashedMap<InputStream, Object>>();
      HashedMap<String, HashedMap<InputStream, Object>> hashedMap1 = hashedMap0.clone();
      assertTrue(hashedMap1.equals((Object)hashedMap0));
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      HashedMap<String, Integer> hashedMap0 = new HashedMap<String, Integer>(1);
      assertTrue(hashedMap0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      HashedMap<Integer, Integer> hashedMap0 = new HashedMap<Integer, Integer>();
      assertTrue(hashedMap0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      AbstractHashedMap<Object, String> abstractHashedMap0 = new AbstractHashedMap<Object, String>();
      Object object0 = AbstractHashedMap.NULL;
      // Undeclared exception!
      try { 
        abstractHashedMap0.put(object0, "");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.collections4.map.AbstractHashedMap", e);
      }
  }
}
