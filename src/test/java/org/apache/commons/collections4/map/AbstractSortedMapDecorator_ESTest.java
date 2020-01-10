/*
 * This file was automatically generated by EvoSuite
 * Wed Oct 16 06:10:14 GMT 2019
 */

package org.apache.commons.collections4.map;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Comparator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;
import org.apache.commons.collections4.OrderedMapIterator;
import org.apache.commons.collections4.map.AbstractSortedMapDecorator;
import org.apache.commons.collections4.map.FixedSizeSortedMap;
import org.apache.commons.collections4.map.UnmodifiableSortedMap;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class AbstractSortedMapDecorator_ESTest extends AbstractSortedMapDecorator_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      AbstractSortedMapDecorator.SortedMapIterator<Object, String> abstractSortedMapDecorator_SortedMapIterator0 = null;
      try {
        abstractSortedMapDecorator_SortedMapIterator0 = new AbstractSortedMapDecorator.SortedMapIterator<Object, String>((Set<Map.Entry<Object, String>>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.collections4.map.EntrySetToMapIteratorAdapter", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      TreeMap<String, Integer> treeMap0 = new TreeMap<String, Integer>();
      FixedSizeSortedMap<String, Integer> fixedSizeSortedMap0 = new FixedSizeSortedMap<String, Integer>(treeMap0);
      SortedMap<String, Integer> sortedMap0 = fixedSizeSortedMap0.tailMap("");
      assertEquals(0, sortedMap0.size());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      TreeMap<String, Object> treeMap0 = new TreeMap<String, Object>();
      FixedSizeSortedMap<String, Object> fixedSizeSortedMap0 = FixedSizeSortedMap.fixedSizeSortedMap((SortedMap<String, Object>) treeMap0);
      SortedMap<String, Object> sortedMap0 = fixedSizeSortedMap0.subMap("`_vAT'LQ>-[g", "org.apache.commons.collections4.map.AbstractIterableMap");
      assertEquals(0, sortedMap0.size());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      TreeMap<String, String> treeMap0 = new TreeMap<String, String>();
      treeMap0.put("oC ,w(CEa]ee6$e<`DB", "oC ,w(CEa]ee6$e<`DB");
      FixedSizeSortedMap<String, String> fixedSizeSortedMap0 = new FixedSizeSortedMap<String, String>(treeMap0);
      String string0 = fixedSizeSortedMap0.lastKey();
      assertEquals("oC ,w(CEa]ee6$e<`DB", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      TreeMap<Object, Integer> treeMap0 = new TreeMap<Object, Integer>();
      FixedSizeSortedMap<Object, Integer> fixedSizeSortedMap0 = new FixedSizeSortedMap<Object, Integer>(treeMap0);
      Integer integer0 = new Integer(0);
      SortedMap<Object, Integer> sortedMap0 = fixedSizeSortedMap0.headMap(integer0);
      assertTrue(sortedMap0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      TreeMap<Object, String> treeMap0 = new TreeMap<Object, String>();
      treeMap0.put("1`)SRl", "%=f %ibVes(");
      FixedSizeSortedMap<Object, String> fixedSizeSortedMap0 = new FixedSizeSortedMap<Object, String>(treeMap0);
      SortedMap<Object, String> sortedMap0 = fixedSizeSortedMap0.headMap("i~|b*~%'Y>!pcNal");
      assertEquals(1, sortedMap0.size());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      TreeMap<Object, Integer> treeMap0 = new TreeMap<Object, Integer>();
      FixedSizeSortedMap<Object, Integer> fixedSizeSortedMap0 = FixedSizeSortedMap.fixedSizeSortedMap((SortedMap<Object, Integer>) treeMap0);
      Integer integer0 = new Integer((-1344));
      treeMap0.put("oAxUAnW", integer0);
      Object object0 = fixedSizeSortedMap0.firstKey();
      assertEquals("oAxUAnW", object0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      TreeMap<String, String> treeMap0 = new TreeMap<String, String>(comparator0);
      FixedSizeSortedMap<String, String> fixedSizeSortedMap0 = new FixedSizeSortedMap<String, String>(treeMap0);
      FixedSizeSortedMap<String, String> fixedSizeSortedMap1 = new FixedSizeSortedMap<String, String>(fixedSizeSortedMap0);
      SortedMap<String, String> sortedMap0 = fixedSizeSortedMap1.decorated();
      assertTrue(sortedMap0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      TreeMap<String, Integer> treeMap0 = new TreeMap<String, Integer>();
      Integer integer0 = new Integer((-2814));
      treeMap0.put("", integer0);
      FixedSizeSortedMap<String, Integer> fixedSizeSortedMap0 = new FixedSizeSortedMap<String, Integer>(treeMap0);
      SortedMap<String, Object> sortedMap0 = UnmodifiableSortedMap.unmodifiableSortedMap((SortedMap<String, ?>) fixedSizeSortedMap0);
      FixedSizeSortedMap<String, Object> fixedSizeSortedMap1 = new FixedSizeSortedMap<String, Object>(sortedMap0);
      SortedMap<String, Object> sortedMap1 = fixedSizeSortedMap1.decorated();
      assertSame(sortedMap0, sortedMap1);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      TreeMap<Object, Integer> treeMap0 = new TreeMap<Object, Integer>();
      FixedSizeSortedMap<Object, Integer> fixedSizeSortedMap0 = new FixedSizeSortedMap<Object, Integer>(treeMap0);
      // Undeclared exception!
      try { 
        fixedSizeSortedMap0.tailMap(treeMap0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.util.TreeMap cannot be cast to java.lang.Comparable
         //
         verifyException("java.util.TreeMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      TreeMap<Object, String> treeMap0 = new TreeMap<Object, String>();
      FixedSizeSortedMap<Object, String> fixedSizeSortedMap0 = new FixedSizeSortedMap<Object, String>(treeMap0);
      // Undeclared exception!
      try { 
        fixedSizeSortedMap0.subMap("-/8Bzp<", (Object) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      TreeMap<Integer, String> treeMap0 = new TreeMap<Integer, String>();
      FixedSizeSortedMap<Integer, String> fixedSizeSortedMap0 = FixedSizeSortedMap.fixedSizeSortedMap((SortedMap<Integer, String>) treeMap0);
      Integer integer0 = new Integer(1);
      SortedMap<Integer, Object> sortedMap0 = UnmodifiableSortedMap.unmodifiableSortedMap((SortedMap<Integer, ?>) fixedSizeSortedMap0);
      FixedSizeSortedMap<Integer, Object> fixedSizeSortedMap1 = FixedSizeSortedMap.fixedSizeSortedMap(sortedMap0);
      Integer integer1 = new Integer(0);
      // Undeclared exception!
      try { 
        fixedSizeSortedMap1.subMap(integer0, integer1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // fromKey > toKey
         //
         verifyException("java.util.TreeMap$NavigableSubMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      TreeMap<Object, Object> treeMap0 = new TreeMap<Object, Object>();
      FixedSizeSortedMap<Object, Object> fixedSizeSortedMap0 = new FixedSizeSortedMap<Object, Object>(treeMap0);
      Set<Object> set0 = fixedSizeSortedMap0.keySet();
      Integer integer0 = new Integer((-2979));
      // Undeclared exception!
      try { 
        fixedSizeSortedMap0.subMap(set0, integer0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // org.apache.commons.collections4.set.UnmodifiableSet cannot be cast to java.lang.Comparable
         //
         verifyException("java.util.TreeMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      TreeMap<Integer, Object> treeMap0 = new TreeMap<Integer, Object>();
      FixedSizeSortedMap<Integer, Object> fixedSizeSortedMap0 = FixedSizeSortedMap.fixedSizeSortedMap((SortedMap<Integer, Object>) treeMap0);
      // Undeclared exception!
      try { 
        fixedSizeSortedMap0.previousKey((Integer) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.TreeMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      TreeMap<String, Integer> treeMap0 = new TreeMap<String, Integer>();
      FixedSizeSortedMap<String, Integer> fixedSizeSortedMap0 = FixedSizeSortedMap.fixedSizeSortedMap((SortedMap<String, Integer>) treeMap0);
      SortedMap<String, Integer> sortedMap0 = fixedSizeSortedMap0.tailMap("org.apache.commons.collections4.map.AbstractSortedMapDecorator");
      FixedSizeSortedMap<String, Integer> fixedSizeSortedMap1 = FixedSizeSortedMap.fixedSizeSortedMap(sortedMap0);
      // Undeclared exception!
      try { 
        fixedSizeSortedMap1.previousKey("");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // toKey out of range
         //
         verifyException("java.util.TreeMap$AscendingSubMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      TreeMap<Object, String> treeMap0 = new TreeMap<Object, String>();
      FixedSizeSortedMap<Object, String> fixedSizeSortedMap0 = FixedSizeSortedMap.fixedSizeSortedMap((SortedMap<Object, String>) treeMap0);
      // Undeclared exception!
      try { 
        fixedSizeSortedMap0.previousKey(treeMap0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.util.TreeMap cannot be cast to java.lang.Comparable
         //
         verifyException("java.util.TreeMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      TreeMap<String, String> treeMap0 = new TreeMap<String, String>();
      FixedSizeSortedMap<String, String> fixedSizeSortedMap0 = FixedSizeSortedMap.fixedSizeSortedMap((SortedMap<String, String>) treeMap0);
      // Undeclared exception!
      try { 
        fixedSizeSortedMap0.nextKey("{~H!-nolk{ECR#xR&B");
        fail("Expecting exception: NoSuchElementException");
      
      } catch(NoSuchElementException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.TreeMap$NavigableSubMap$SubMapIterator", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      TreeMap<String, String> treeMap0 = new TreeMap<String, String>();
      SortedMap<String, Object> sortedMap0 = UnmodifiableSortedMap.unmodifiableSortedMap((SortedMap<String, ?>) treeMap0);
      FixedSizeSortedMap<String, Object> fixedSizeSortedMap0 = new FixedSizeSortedMap<String, Object>(sortedMap0);
      // Undeclared exception!
      try { 
        fixedSizeSortedMap0.nextKey((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.TreeMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      TreeMap<Object, TreeMap<String, String>> treeMap0 = new TreeMap<Object, TreeMap<String, String>>();
      FixedSizeSortedMap<Object, TreeMap<String, String>> fixedSizeSortedMap0 = FixedSizeSortedMap.fixedSizeSortedMap((SortedMap<Object, TreeMap<String, String>>) treeMap0);
      // Undeclared exception!
      try { 
        fixedSizeSortedMap0.nextKey(treeMap0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.util.TreeMap cannot be cast to java.lang.Comparable
         //
         verifyException("java.util.TreeMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      TreeMap<Object, String> treeMap0 = new TreeMap<Object, String>();
      FixedSizeSortedMap<Object, String> fixedSizeSortedMap0 = new FixedSizeSortedMap<Object, String>(treeMap0);
      // Undeclared exception!
      try { 
        fixedSizeSortedMap0.headMap((Object) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.TreeMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      TreeMap<Object, Object> treeMap0 = new TreeMap<Object, Object>();
      FixedSizeSortedMap<Object, Object> fixedSizeSortedMap0 = new FixedSizeSortedMap<Object, Object>(treeMap0);
      // Undeclared exception!
      try { 
        fixedSizeSortedMap0.headMap(treeMap0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.util.TreeMap cannot be cast to java.lang.Comparable
         //
         verifyException("java.util.TreeMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      TreeMap<Integer, String> treeMap0 = new TreeMap<Integer, String>();
      FixedSizeSortedMap<Integer, String> fixedSizeSortedMap0 = new FixedSizeSortedMap<Integer, String>(treeMap0);
      SortedMap<Integer, Object> sortedMap0 = UnmodifiableSortedMap.unmodifiableSortedMap((SortedMap<Integer, ?>) fixedSizeSortedMap0);
      FixedSizeSortedMap<Integer, Object> fixedSizeSortedMap1 = new FixedSizeSortedMap<Integer, Object>(sortedMap0);
      // Undeclared exception!
      try { 
        fixedSizeSortedMap1.lastKey();
        fail("Expecting exception: NoSuchElementException");
      
      } catch(NoSuchElementException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.TreeMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      TreeMap<Integer, Object> treeMap0 = new TreeMap<Integer, Object>();
      Integer integer0 = new Integer(1);
      treeMap0.put(integer0, "");
      FixedSizeSortedMap<Integer, Object> fixedSizeSortedMap0 = FixedSizeSortedMap.fixedSizeSortedMap((SortedMap<Integer, Object>) treeMap0);
      Integer integer1 = fixedSizeSortedMap0.nextKey(integer0);
      assertNull(integer1);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      TreeMap<Integer, String> treeMap0 = new TreeMap<Integer, String>();
      FixedSizeSortedMap<Integer, String> fixedSizeSortedMap0 = FixedSizeSortedMap.fixedSizeSortedMap((SortedMap<Integer, String>) treeMap0);
      Integer integer0 = new Integer(0);
      Integer integer1 = fixedSizeSortedMap0.previousKey(integer0);
      assertNull(integer1);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      TreeMap<Object, Object> treeMap0 = new TreeMap<Object, Object>();
      FixedSizeSortedMap<Object, Object> fixedSizeSortedMap0 = FixedSizeSortedMap.fixedSizeSortedMap((SortedMap<Object, Object>) treeMap0);
      OrderedMapIterator<Object, Object> orderedMapIterator0 = fixedSizeSortedMap0.mapIterator();
      assertFalse(orderedMapIterator0.hasPrevious());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      TreeMap<Object, TreeMap<Object, Integer>> treeMap0 = new TreeMap<Object, TreeMap<Object, Integer>>();
      FixedSizeSortedMap<Object, TreeMap<Object, Integer>> fixedSizeSortedMap0 = FixedSizeSortedMap.fixedSizeSortedMap((SortedMap<Object, TreeMap<Object, Integer>>) treeMap0);
      Comparator<? super Object> comparator0 = fixedSizeSortedMap0.comparator();
      assertNull(comparator0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      TreeMap<Integer, Object> treeMap0 = new TreeMap<Integer, Object>();
      Integer integer0 = new Integer(1);
      treeMap0.put(integer0, "");
      FixedSizeSortedMap<Integer, Object> fixedSizeSortedMap0 = FixedSizeSortedMap.fixedSizeSortedMap((SortedMap<Integer, Object>) treeMap0);
      Integer integer1 = new Integer(3772);
      Integer integer2 = fixedSizeSortedMap0.previousKey(integer1);
      assertEquals(1, (int)integer2);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      TreeMap<Object, Object> treeMap0 = new TreeMap<Object, Object>();
      FixedSizeSortedMap<Object, Object> fixedSizeSortedMap0 = FixedSizeSortedMap.fixedSizeSortedMap((SortedMap<Object, Object>) treeMap0);
      // Undeclared exception!
      try { 
        fixedSizeSortedMap0.firstKey();
        fail("Expecting exception: NoSuchElementException");
      
      } catch(NoSuchElementException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.TreeMap", e);
      }
  }
}