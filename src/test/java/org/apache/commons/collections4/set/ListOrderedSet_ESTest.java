/*
 * This file was automatically generated by EvoSuite
 * Wed Oct 16 05:43:23 GMT 2019
 */

package org.apache.commons.collections4.set;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.function.Predicate;
import org.apache.commons.collections4.OrderedIterator;
import org.apache.commons.collections4.set.ListOrderedSet;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ListOrderedSet_ESTest extends ListOrderedSet_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ListOrderedSet<Object> listOrderedSet0 = new ListOrderedSet<Object>();
      LinkedList<String> linkedList0 = new LinkedList<String>();
      ListOrderedSet<String> listOrderedSet1 = ListOrderedSet.listOrderedSet((List<String>) linkedList0);
      linkedList0.add("");
      linkedList0.add("Vf>RkWt(");
      boolean boolean0 = listOrderedSet0.addAll((Collection<?>) listOrderedSet1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      LinkedList<String> linkedList0 = new LinkedList<String>();
      ListOrderedSet<String> listOrderedSet0 = ListOrderedSet.listOrderedSet((List<String>) linkedList0);
      Object[] objectArray0 = new Object[0];
      Object[] objectArray1 = listOrderedSet0.toArray(objectArray0);
      assertEquals(0, objectArray1.length);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
      Integer integer0 = new Integer((-4089));
      linkedList0.add(integer0);
      ListOrderedSet<Integer> listOrderedSet0 = ListOrderedSet.listOrderedSet((List<Integer>) linkedList0);
      Object[] objectArray0 = listOrderedSet0.toArray();
      assertEquals(1, objectArray0.length);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      LinkedList<String> linkedList0 = new LinkedList<String>();
      linkedList0.add((String) null);
      ListOrderedSet<String> listOrderedSet0 = ListOrderedSet.listOrderedSet((List<String>) linkedList0);
      String string0 = listOrderedSet0.remove(0);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      LinkedList<String> linkedList0 = new LinkedList<String>();
      ListOrderedSet<String> listOrderedSet0 = ListOrderedSet.listOrderedSet((List<String>) linkedList0);
      linkedList0.add("L!4MTnn@n$F&^b.1Pc");
      String string0 = listOrderedSet0.remove(0);
      assertFalse(linkedList0.contains(string0));
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      ListOrderedSet<Object> listOrderedSet0 = ListOrderedSet.listOrderedSet((List<Object>) linkedList0);
      linkedList0.add((Object) null);
      int int0 = listOrderedSet0.indexOf((Object) null);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ListOrderedSet<Object> listOrderedSet0 = new ListOrderedSet<Object>();
      String[] stringArray0 = new String[8];
      boolean boolean0 = listOrderedSet0.add((Object) stringArray0[0]);
      assertTrue(boolean0);
      
      listOrderedSet0.add(0, (Object) "org.apache.commons.collections4.set.AbstractSetDecorator");
      int int0 = listOrderedSet0.indexOf((Object) null);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      LinkedList<String> linkedList0 = new LinkedList<String>();
      linkedList0.add("Equator must not be null.");
      ListOrderedSet<String> listOrderedSet0 = ListOrderedSet.listOrderedSet((List<String>) linkedList0);
      String string0 = listOrderedSet0.get(0);
      assertEquals("Equator must not be null.", string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
      ListOrderedSet<Integer> listOrderedSet0 = ListOrderedSet.listOrderedSet((List<Integer>) linkedList0);
      LinkedList<Object> linkedList1 = new LinkedList<Object>();
      ListOrderedSet<Object> listOrderedSet1 = ListOrderedSet.listOrderedSet((List<Object>) linkedList1);
      boolean boolean0 = listOrderedSet1.addAll((Collection<?>) listOrderedSet0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ListOrderedSet<Integer> listOrderedSet0 = new ListOrderedSet<Integer>();
      LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
      Integer integer0 = new Integer(898);
      linkedList0.add(integer0);
      boolean boolean0 = listOrderedSet0.addAll(0, (Collection<? extends Integer>) linkedList0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
      ListOrderedSet<Integer> listOrderedSet0 = ListOrderedSet.listOrderedSet((List<Integer>) linkedList0);
      // Undeclared exception!
      try { 
        listOrderedSet0.toArray((Object[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.LinkedList", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
      Integer integer0 = new Integer((-1009));
      linkedList0.push(integer0);
      ListOrderedSet<Integer> listOrderedSet0 = ListOrderedSet.listOrderedSet((List<Integer>) linkedList0);
      String[] stringArray0 = new String[1];
      // Undeclared exception!
      try { 
        listOrderedSet0.toArray(stringArray0);
        fail("Expecting exception: ArrayStoreException");
      
      } catch(ArrayStoreException e) {
         //
         // java.lang.Integer
         //
         verifyException("java.util.LinkedList", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ListOrderedSet<String> listOrderedSet0 = new ListOrderedSet<String>();
      // Undeclared exception!
      try { 
        listOrderedSet0.retainAll((Collection<?>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Objects", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      ListOrderedSet<Object> listOrderedSet0 = ListOrderedSet.listOrderedSet((List<Object>) linkedList0);
      listOrderedSet0.add((Object) linkedList0);
      LinkedList<String> linkedList1 = new LinkedList<String>();
      ListOrderedSet<String> listOrderedSet1 = ListOrderedSet.listOrderedSet((List<String>) linkedList1);
      // Undeclared exception!
      try { 
        listOrderedSet1.removeAll(listOrderedSet0);
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ListOrderedSet<Object> listOrderedSet0 = new ListOrderedSet<Object>();
      // Undeclared exception!
      try { 
        listOrderedSet0.removeAll((Collection<?>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.collections4.set.ListOrderedSet", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ListOrderedSet<Object> listOrderedSet0 = new ListOrderedSet<Object>();
      listOrderedSet0.add((Object) listOrderedSet0);
      // Undeclared exception!
      try { 
        listOrderedSet0.remove(0);
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      LinkedHashSet<Object> linkedHashSet0 = new LinkedHashSet<Object>();
      ListOrderedSet<Object> listOrderedSet0 = new ListOrderedSet<Object>(linkedHashSet0);
      // Undeclared exception!
      try { 
        listOrderedSet0.remove(0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      // Undeclared exception!
      try { 
        ListOrderedSet.listOrderedSet((Set<Integer>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // Collection must not be null.
         //
         verifyException("org.apache.commons.collections4.collection.AbstractCollectionDecorator", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      linkedList0.add((Object) linkedList0);
      // Undeclared exception!
      try { 
        ListOrderedSet.listOrderedSet((List<Object>) linkedList0);
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      ListOrderedSet<Object> listOrderedSet0 = ListOrderedSet.listOrderedSet((List<Object>) linkedList0);
      ListOrderedSet<Object> listOrderedSet1 = ListOrderedSet.listOrderedSet((Set<Object>) listOrderedSet0);
      // Undeclared exception!
      try { 
        listOrderedSet1.get((-1));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      ListOrderedSet<Object> listOrderedSet0 = ListOrderedSet.listOrderedSet((List<Object>) linkedList0);
      Object object0 = new Object();
      linkedList0.add(object0);
      // Undeclared exception!
      try { 
        listOrderedSet0.addAll((Collection<?>) linkedList0);
        fail("Expecting exception: ConcurrentModificationException");
      
      } catch(ConcurrentModificationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.LinkedList$ListItr", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      ListOrderedSet<Object> listOrderedSet0 = new ListOrderedSet<Object>();
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      ListOrderedSet<Object> listOrderedSet1 = ListOrderedSet.listOrderedSet((Set<Object>) listOrderedSet0, (List<Object>) linkedList0);
      listOrderedSet1.add((Object) listOrderedSet0);
      // Undeclared exception!
      try { 
        listOrderedSet1.addAll((Collection<?>) linkedList0);
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      ListOrderedSet<String> listOrderedSet0 = new ListOrderedSet<String>();
      // Undeclared exception!
      try { 
        listOrderedSet0.addAll((Collection<? extends String>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.collections4.set.ListOrderedSet", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      LinkedHashSet<Object> linkedHashSet0 = new LinkedHashSet<Object>();
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      ListOrderedSet<Object> listOrderedSet0 = ListOrderedSet.listOrderedSet((Set<Object>) linkedHashSet0, (List<Object>) linkedList0);
      ListOrderedSet<Object> listOrderedSet1 = ListOrderedSet.listOrderedSet((Set<Object>) listOrderedSet0);
      linkedList0.add((Object) listOrderedSet0);
      // Undeclared exception!
      try { 
        listOrderedSet1.addAll((-1421), (Collection<?>) listOrderedSet0);
        fail("Expecting exception: ConcurrentModificationException");
      
      } catch(ConcurrentModificationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.LinkedList$ListItr", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      ListOrderedSet<Integer> listOrderedSet0 = new ListOrderedSet<Integer>();
      // Undeclared exception!
      try { 
        listOrderedSet0.addAll(0, (Collection<? extends Integer>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.collections4.set.ListOrderedSet", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      ListOrderedSet<Integer> listOrderedSet0 = new ListOrderedSet<Integer>();
      Integer integer0 = new Integer(1);
      // Undeclared exception!
      try { 
        listOrderedSet0.add(1, integer0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 1, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      ListOrderedSet<String> listOrderedSet0 = null;
      try {
        listOrderedSet0 = new ListOrderedSet<String>((Set<String>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // Collection must not be null.
         //
         verifyException("org.apache.commons.collections4.collection.AbstractCollectionDecorator", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      LinkedList<String> linkedList0 = new LinkedList<String>();
      linkedList0.add("Equator must not be null.");
      ListOrderedSet<String> listOrderedSet0 = ListOrderedSet.listOrderedSet((List<String>) linkedList0);
      listOrderedSet0.remove((Object) "Equator must not be null.");
      assertFalse(linkedList0.contains("Equator must not be null."));
      assertEquals(0, linkedList0.size());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      ListOrderedSet<Object> listOrderedSet0 = new ListOrderedSet<Object>();
      Object object0 = new Object();
      boolean boolean0 = listOrderedSet0.add(object0);
      assertTrue(boolean0);
      
      boolean boolean1 = listOrderedSet0.add(object0);
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      LinkedHashSet<Object> linkedHashSet0 = new LinkedHashSet<Object>();
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      ListOrderedSet<Object> listOrderedSet0 = new ListOrderedSet<Object>(linkedHashSet0, linkedList0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      ListOrderedSet<Object> listOrderedSet0 = ListOrderedSet.listOrderedSet((List<Object>) linkedList0);
      OrderedIterator<Object> orderedIterator0 = listOrderedSet0.iterator();
      assertFalse(orderedIterator0.hasPrevious());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
      ListOrderedSet<Integer> listOrderedSet0 = ListOrderedSet.listOrderedSet((List<Integer>) linkedList0);
      Object[] objectArray0 = listOrderedSet0.toArray();
      assertEquals(0, objectArray0.length);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      linkedList0.add((Object) "org.apache.commons.collections4.list.AbstractSerializableListDecorator");
      ListOrderedSet<Object> listOrderedSet0 = ListOrderedSet.listOrderedSet((List<Object>) linkedList0);
      boolean boolean0 = listOrderedSet0.addAll((-3238), (Collection<?>) linkedList0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      ListOrderedSet<Object> listOrderedSet0 = new ListOrderedSet<Object>();
      String[] stringArray0 = new String[8];
      listOrderedSet0.add((Object) stringArray0[0]);
      listOrderedSet0.add(0, (Object) stringArray0[4]);
      assertFalse(listOrderedSet0.contains(0));
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      LinkedHashSet<Object> linkedHashSet0 = new LinkedHashSet<Object>();
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      ListOrderedSet<Object> listOrderedSet0 = ListOrderedSet.listOrderedSet((Set<Object>) linkedHashSet0, (List<Object>) linkedList0);
      boolean boolean0 = listOrderedSet0.retainAll(linkedList0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      ListOrderedSet<Object> listOrderedSet0 = new ListOrderedSet<Object>();
      ListOrderedSet<String> listOrderedSet1 = new ListOrderedSet<String>();
      String[] stringArray0 = new String[8];
      boolean boolean0 = listOrderedSet0.add((Object) stringArray0[0]);
      boolean boolean1 = listOrderedSet0.retainAll(listOrderedSet1);
      assertTrue(boolean1 == boolean0);
      assertTrue(boolean1);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      ListOrderedSet<Object> listOrderedSet0 = new ListOrderedSet<Object>();
      boolean boolean0 = listOrderedSet0.removeAll(listOrderedSet0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
      ListOrderedSet<String> listOrderedSet0 = ListOrderedSet.listOrderedSet((Set<String>) linkedHashSet0);
      Predicate<String> predicate0 = Predicate.isEqual((Object) linkedHashSet0);
      boolean boolean0 = linkedHashSet0.add("org.apache.commons.collections4.set.ListOrderedSet$1");
      Predicate<String> predicate1 = predicate0.negate();
      boolean boolean1 = listOrderedSet0.removeIf(predicate1);
      assertTrue(boolean1 == boolean0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      ListOrderedSet<Object> listOrderedSet0 = ListOrderedSet.listOrderedSet((List<Object>) linkedList0);
      boolean boolean0 = listOrderedSet0.removeIf((Predicate<? super Object>) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      LinkedHashSet<Object> linkedHashSet0 = new LinkedHashSet<Object>();
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      ListOrderedSet<Object> listOrderedSet0 = ListOrderedSet.listOrderedSet((Set<Object>) linkedHashSet0, (List<Object>) linkedList0);
      Predicate<Object> predicate0 = Predicate.isEqual((Object) linkedList0);
      boolean boolean0 = listOrderedSet0.removeIf(predicate0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      ListOrderedSet<Object> listOrderedSet0 = new ListOrderedSet<Object>();
      Object object0 = new Object();
      listOrderedSet0.add(object0);
      // Undeclared exception!
      try { 
        listOrderedSet0.removeAll(listOrderedSet0);
        fail("Expecting exception: ConcurrentModificationException");
      
      } catch(ConcurrentModificationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.ArrayList$Itr", e);
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      ListOrderedSet<Object> listOrderedSet0 = ListOrderedSet.listOrderedSet((List<Object>) linkedList0);
      boolean boolean0 = listOrderedSet0.remove((Object) linkedList0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      LinkedHashSet<Integer> linkedHashSet0 = new LinkedHashSet<Integer>();
      ListOrderedSet<Integer> listOrderedSet0 = null;
      try {
        listOrderedSet0 = new ListOrderedSet<Integer>(linkedHashSet0, (List<Integer>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // List must not be null
         //
         verifyException("org.apache.commons.collections4.set.ListOrderedSet", e);
      }
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      // Undeclared exception!
      try { 
        ListOrderedSet.listOrderedSet((List<String>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // List must not be null
         //
         verifyException("org.apache.commons.collections4.set.ListOrderedSet", e);
      }
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      ListOrderedSet<Integer> listOrderedSet0 = new ListOrderedSet<Integer>();
      LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
      Integer integer0 = new Integer((-882));
      linkedList0.add(integer0);
      // Undeclared exception!
      try { 
        ListOrderedSet.listOrderedSet((Set<Integer>) listOrderedSet0, (List<Integer>) linkedList0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Set and List must be empty
         //
         verifyException("org.apache.commons.collections4.set.ListOrderedSet", e);
      }
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      Integer integer0 = new Integer((-837));
      linkedList0.add((Object) integer0);
      ListOrderedSet<Object> listOrderedSet0 = ListOrderedSet.listOrderedSet((List<Object>) linkedList0);
      // Undeclared exception!
      try { 
        ListOrderedSet.listOrderedSet((Set<Object>) listOrderedSet0, (List<Object>) linkedList0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Set and List must be empty
         //
         verifyException("org.apache.commons.collections4.set.ListOrderedSet", e);
      }
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      ListOrderedSet<Integer> listOrderedSet0 = new ListOrderedSet<Integer>();
      // Undeclared exception!
      try { 
        ListOrderedSet.listOrderedSet((Set<Integer>) listOrderedSet0, (List<Integer>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // List must not be null
         //
         verifyException("org.apache.commons.collections4.set.ListOrderedSet", e);
      }
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
      // Undeclared exception!
      try { 
        ListOrderedSet.listOrderedSet((Set<Integer>) null, (List<Integer>) linkedList0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // Set must not be null
         //
         verifyException("org.apache.commons.collections4.set.ListOrderedSet", e);
      }
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      ListOrderedSet<Object> listOrderedSet0 = ListOrderedSet.listOrderedSet((List<Object>) linkedList0);
      // Undeclared exception!
      try { 
        listOrderedSet0.get(657);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 657, Size: 0
         //
         verifyException("java.util.LinkedList", e);
      }
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      LinkedList<String> linkedList0 = new LinkedList<String>();
      ListOrderedSet<String> listOrderedSet0 = ListOrderedSet.listOrderedSet((List<String>) linkedList0);
      listOrderedSet0.clear();
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      LinkedList<String> linkedList0 = new LinkedList<String>();
      ListOrderedSet<String> listOrderedSet0 = ListOrderedSet.listOrderedSet((List<String>) linkedList0);
      List<String> list0 = listOrderedSet0.asList();
      ListOrderedSet<String> listOrderedSet1 = ListOrderedSet.listOrderedSet(list0);
      // Undeclared exception!
      try { 
        listOrderedSet1.add("List must not be null");
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.collections4.list.UnmodifiableList", e);
      }
  }
}
