/*
 * This file was automatically generated by EvoSuite
 * Wed Oct 16 06:12:51 GMT 2019
 */

package org.apache.commons.collections4.multiset;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Map;
import java.util.Set;
import org.apache.commons.collections4.MultiSet;
import org.apache.commons.collections4.Predicate;
import org.apache.commons.collections4.multiset.AbstractMapMultiSet;
import org.apache.commons.collections4.multiset.HashMultiSet;
import org.apache.commons.collections4.multiset.PredicatedMultiSet;
import org.apache.commons.collections4.multiset.SynchronizedMultiSet;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class SynchronizedMultiSet_ESTest extends SynchronizedMultiSet_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      HashMultiSet<Integer> hashMultiSet0 = new HashMultiSet<Integer>();
      Set<Integer> set0 = hashMultiSet0.createUniqueSet();
      Integer integer0 = new Integer(0);
      SynchronizedMultiSet.SynchronizedSet<Integer> synchronizedMultiSet_SynchronizedSet0 = new SynchronizedMultiSet.SynchronizedSet<Integer>(set0, integer0);
      assertFalse(synchronizedMultiSet_SynchronizedSet0.contains(integer0));
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      HashMultiSet<Integer> hashMultiSet0 = new HashMultiSet<Integer>();
      SynchronizedMultiSet<Integer> synchronizedMultiSet0 = new SynchronizedMultiSet<Integer>(hashMultiSet0, hashMultiSet0);
      Integer integer0 = new Integer(0);
      hashMultiSet0.add(integer0);
      synchronizedMultiSet0.setCount(integer0, 1);
      assertFalse(hashMultiSet0.isEmpty());
      assertEquals(1, hashMultiSet0.size());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      HashMultiSet<Object> hashMultiSet0 = new HashMultiSet<Object>();
      Integer integer0 = new Integer(0);
      hashMultiSet0.add((Object) integer0);
      SynchronizedMultiSet<Object> synchronizedMultiSet0 = new SynchronizedMultiSet<Object>(hashMultiSet0);
      int int0 = synchronizedMultiSet0.getCount(integer0);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      HashMultiSet<Integer> hashMultiSet0 = new HashMultiSet<Integer>();
      SynchronizedMultiSet<Integer> synchronizedMultiSet0 = new SynchronizedMultiSet<Integer>(hashMultiSet0);
      MultiSet<Integer> multiSet0 = synchronizedMultiSet0.decorated();
      assertNotNull(multiSet0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      HashMultiSet<Integer> hashMultiSet0 = new HashMultiSet<Integer>();
      SynchronizedMultiSet<Integer> synchronizedMultiSet0 = new SynchronizedMultiSet<Integer>(hashMultiSet0);
      Integer integer0 = new Integer(1349);
      synchronizedMultiSet0.setCount(integer0, 1349);
      int int0 = synchronizedMultiSet0.add(integer0, 0);
      assertEquals(1349, hashMultiSet0.size());
      assertEquals(1349, int0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      // Undeclared exception!
      try { 
        SynchronizedMultiSet.synchronizedMultiSet((MultiSet<Object>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // Collection must not be null.
         //
         verifyException("org.apache.commons.collections4.collection.SynchronizedCollection", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      HashMultiSet<HashMultiSet<Object>> hashMultiSet0 = new HashMultiSet<HashMultiSet<Object>>();
      SynchronizedMultiSet<HashMultiSet<Object>> synchronizedMultiSet0 = SynchronizedMultiSet.synchronizedMultiSet((MultiSet<HashMultiSet<Object>>) hashMultiSet0);
      // Undeclared exception!
      try { 
        synchronizedMultiSet0.remove((Object) hashMultiSet0, (-117));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Occurrences must not be negative.
         //
         verifyException("org.apache.commons.collections4.multiset.AbstractMapMultiSet", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      HashMultiSet<Object> hashMultiSet0 = new HashMultiSet<Object>();
      SynchronizedMultiSet<Object> synchronizedMultiSet0 = SynchronizedMultiSet.synchronizedMultiSet((MultiSet<Object>) hashMultiSet0);
      hashMultiSet0.setMap((Map<Object, AbstractMapMultiSet.MutableInteger>) null);
      // Undeclared exception!
      try { 
        synchronizedMultiSet0.getCount(synchronizedMultiSet0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.collections4.multiset.AbstractMapMultiSet", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      HashMultiSet<String> hashMultiSet0 = new HashMultiSet<String>();
      SynchronizedMultiSet<String> synchronizedMultiSet0 = new SynchronizedMultiSet<String>(hashMultiSet0, "i*Uo\u0004~");
      // Undeclared exception!
      try { 
        synchronizedMultiSet0.add((String) null, (-3817));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Occurrences must not be negative.
         //
         verifyException("org.apache.commons.collections4.multiset.AbstractMapMultiSet", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      HashMultiSet<SynchronizedMultiSet<Object>> hashMultiSet0 = new HashMultiSet<SynchronizedMultiSet<Object>>();
      SynchronizedMultiSet<SynchronizedMultiSet<Object>> synchronizedMultiSet0 = new SynchronizedMultiSet<SynchronizedMultiSet<Object>>(hashMultiSet0);
      SynchronizedMultiSet<String> synchronizedMultiSet1 = null;
      try {
        synchronizedMultiSet1 = new SynchronizedMultiSet<String>((MultiSet<String>) null, synchronizedMultiSet0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // Collection must not be null.
         //
         verifyException("org.apache.commons.collections4.collection.SynchronizedCollection", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      SynchronizedMultiSet<String> synchronizedMultiSet0 = null;
      try {
        synchronizedMultiSet0 = new SynchronizedMultiSet<String>((MultiSet<String>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // Collection must not be null.
         //
         verifyException("org.apache.commons.collections4.collection.SynchronizedCollection", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      HashMultiSet<AbstractMapMultiSet.MultiSetEntry<String>> hashMultiSet0 = new HashMultiSet<AbstractMapMultiSet.MultiSetEntry<String>>();
      SynchronizedMultiSet<AbstractMapMultiSet.MultiSetEntry<String>> synchronizedMultiSet0 = new SynchronizedMultiSet<AbstractMapMultiSet.MultiSetEntry<String>>(hashMultiSet0);
      synchronizedMultiSet0.hashCode();
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      HashMultiSet<Integer> hashMultiSet0 = new HashMultiSet<Integer>();
      SynchronizedMultiSet<Integer> synchronizedMultiSet0 = new SynchronizedMultiSet<Integer>(hashMultiSet0, hashMultiSet0);
      boolean boolean0 = synchronizedMultiSet0.equals(synchronizedMultiSet0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      HashMultiSet<Object> hashMultiSet0 = new HashMultiSet<Object>();
      SynchronizedMultiSet<Object> synchronizedMultiSet0 = new SynchronizedMultiSet<Object>(hashMultiSet0);
      boolean boolean0 = synchronizedMultiSet0.equals("");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Integer integer0 = new Integer(0);
      HashMultiSet<String> hashMultiSet0 = new HashMultiSet<String>();
      SynchronizedMultiSet<String> synchronizedMultiSet0 = SynchronizedMultiSet.synchronizedMultiSet((MultiSet<String>) hashMultiSet0);
      int int0 = synchronizedMultiSet0.remove((Object) integer0, 0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      HashMultiSet<Object> hashMultiSet0 = new HashMultiSet<Object>();
      SynchronizedMultiSet<Object> synchronizedMultiSet0 = new SynchronizedMultiSet<Object>(hashMultiSet0);
      Set<MultiSet.Entry<Object>> set0 = (Set<MultiSet.Entry<Object>>)synchronizedMultiSet0.entrySet();
      assertEquals(0, set0.size());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      HashMultiSet<Integer> hashMultiSet0 = new HashMultiSet<Integer>();
      Predicate<Object> predicate0 = (Predicate<Object>) mock(Predicate.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(predicate0).toString();
      doReturn(false).when(predicate0).evaluate(any());
      PredicatedMultiSet<Integer> predicatedMultiSet0 = new PredicatedMultiSet<Integer>(hashMultiSet0, predicate0);
      SynchronizedMultiSet<Integer> synchronizedMultiSet0 = new SynchronizedMultiSet<Integer>(predicatedMultiSet0);
      // Undeclared exception!
      try { 
        synchronizedMultiSet0.setCount((Integer) null, 2);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Cannot add Object 'null' - Predicate 'null' rejected it
         //
         verifyException("org.apache.commons.collections4.collection.PredicatedCollection", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      HashMultiSet<Object> hashMultiSet0 = new HashMultiSet<Object>();
      SynchronizedMultiSet<Object> synchronizedMultiSet0 = new SynchronizedMultiSet<Object>(hashMultiSet0);
      HashMultiSet<Integer> hashMultiSet1 = new HashMultiSet<Integer>();
      SynchronizedMultiSet<Integer> synchronizedMultiSet1 = new SynchronizedMultiSet<Integer>(hashMultiSet1, hashMultiSet1);
      int int0 = synchronizedMultiSet0.getCount(synchronizedMultiSet1);
      assertFalse(synchronizedMultiSet1.contains(int0));
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      HashMultiSet<String> hashMultiSet0 = new HashMultiSet<String>();
      SynchronizedMultiSet<String> synchronizedMultiSet0 = SynchronizedMultiSet.synchronizedMultiSet((MultiSet<String>) hashMultiSet0);
      Set<String> set0 = synchronizedMultiSet0.uniqueSet();
      assertEquals(0, set0.size());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      HashMultiSet<Integer> hashMultiSet0 = new HashMultiSet<Integer>();
      SynchronizedMultiSet<Integer> synchronizedMultiSet0 = new SynchronizedMultiSet<Integer>(hashMultiSet0, hashMultiSet0);
      Integer integer0 = new Integer(0);
      synchronizedMultiSet0.add(integer0, 0);
      assertFalse(synchronizedMultiSet0.contains(0));
  }
}
