/*
 * This file was automatically generated by EvoSuite
 * Wed Oct 16 05:58:58 GMT 2019
 */

package org.apache.commons.collections4.list;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import org.apache.commons.collections4.list.GrowthList;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class GrowthList_ESTest extends GrowthList_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      GrowthList<String> growthList0 = new GrowthList<String>();
      growthList0.addAll(1, (Collection<? extends String>) growthList0);
      String string0 = growthList0.set(635, "");
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      GrowthList<String> growthList0 = new GrowthList<String>(0);
      String string0 = growthList0.set(0, "9HSVz!y");
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
      GrowthList<Integer> growthList0 = new GrowthList<Integer>(linkedList0);
      Integer integer0 = new Integer(2452);
      growthList0.set(1, integer0);
      boolean boolean0 = growthList0.addAll(3804, (Collection<? extends Integer>) linkedList0);
      assertEquals(7608, linkedList0.size());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      GrowthList<Integer> growthList0 = new GrowthList<Integer>(1187);
      GrowthList<Object> growthList1 = new GrowthList<Object>(1824);
      growthList1.add(1, (Object) null);
      growthList1.add(1187, (Object) growthList0);
      assertFalse(growthList1.contains(1));
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      GrowthList<String> growthList0 = new GrowthList<String>();
      growthList0.add(0, "");
      assertTrue(growthList0.contains(""));
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
      GrowthList<Integer> growthList0 = new GrowthList<Integer>(linkedList0);
      Integer integer0 = new Integer((-891));
      // Undeclared exception!
      try { 
        growthList0.set((-1), integer0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: -1, Size: 0
         //
         verifyException("java.util.LinkedList", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      GrowthList<Object> growthList0 = new GrowthList<Object>();
      // Undeclared exception!
      try { 
        growthList0.set((-2968), growthList0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      // Undeclared exception!
      try { 
        GrowthList.growthList((List<Object>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // Collection must not be null.
         //
         verifyException("org.apache.commons.collections4.collection.AbstractCollectionDecorator", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      GrowthList<Integer> growthList0 = new GrowthList<Integer>(0);
      // Undeclared exception!
      try { 
        growthList0.addAll(0, (Collection<? extends Integer>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      GrowthList<Object> growthList0 = new GrowthList<Object>();
      GrowthList<String> growthList1 = new GrowthList<String>();
      // Undeclared exception!
      try { 
        growthList0.addAll((-1014), (Collection<?>) growthList1);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: -1014, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      GrowthList<String> growthList0 = null;
      try {
        growthList0 = new GrowthList<String>((List<String>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // Collection must not be null.
         //
         verifyException("org.apache.commons.collections4.collection.AbstractCollectionDecorator", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      GrowthList<Integer> growthList0 = null;
      try {
        growthList0 = new GrowthList<Integer>((-1903));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal Capacity: -1903
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      GrowthList<String> growthList0 = new GrowthList<String>();
      GrowthList<Object> growthList1 = new GrowthList<Object>();
      boolean boolean0 = growthList1.addAll(0, (Collection<?>) growthList0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      LinkedList<String> linkedList0 = new LinkedList<String>();
      linkedList0.add("org.apache.commons.collectioNs4.list.GrowthList");
      GrowthList<String> growthList0 = new GrowthList<String>(linkedList0);
      growthList0.set(0, "org.apache.commons.collectioNs4.list.GrowthList");
      assertEquals(1, linkedList0.size());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      GrowthList<Object> growthList0 = new GrowthList<Object>();
      LinkedList<String> linkedList0 = new LinkedList<String>();
      boolean boolean0 = growthList0.addAll(3764, (Collection<?>) linkedList0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      GrowthList<Object> growthList0 = GrowthList.growthList((List<Object>) linkedList0);
      // Undeclared exception!
      try { 
        growthList0.add((-3825), (Object) linkedList0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: -3825, Size: 0
         //
         verifyException("java.util.LinkedList", e);
      }
  }
}
