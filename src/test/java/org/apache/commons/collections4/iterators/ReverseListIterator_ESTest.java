/*
 * This file was automatically generated by EvoSuite
 * Wed Oct 16 06:02:04 GMT 2019
 */

package org.apache.commons.collections4.iterators;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.ConcurrentModificationException;
import java.util.LinkedList;
import java.util.List;
import java.util.NoSuchElementException;
import org.apache.commons.collections4.iterators.ReverseListIterator;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ReverseListIterator_ESTest extends ReverseListIterator_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      LinkedList<String> linkedList0 = new LinkedList<String>();
      ReverseListIterator<String> reverseListIterator0 = new ReverseListIterator<String>(linkedList0);
      reverseListIterator0.add("");
      reverseListIterator0.reset();
      int int0 = reverseListIterator0.previousIndex();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
      ReverseListIterator<Integer> reverseListIterator0 = new ReverseListIterator<Integer>(linkedList0);
      reverseListIterator0.add((Integer) null);
      Integer integer0 = reverseListIterator0.previous();
      reverseListIterator0.set(integer0);
      assertFalse(reverseListIterator0.hasPrevious());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
      ReverseListIterator<Integer> reverseListIterator0 = new ReverseListIterator<Integer>(linkedList0);
      Integer integer0 = new Integer((-1));
      reverseListIterator0.add(integer0);
      Integer integer1 = reverseListIterator0.previous();
      assertEquals((-1), (int)integer1);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
      Integer integer0 = new Integer(2078);
      linkedList0.offerFirst(integer0);
      ReverseListIterator<Integer> reverseListIterator0 = new ReverseListIterator<Integer>(linkedList0);
      int int0 = reverseListIterator0.nextIndex();
      assertFalse(linkedList0.contains(int0));
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      LinkedList<String> linkedList0 = new LinkedList<String>();
      linkedList0.add("");
      linkedList0.add("");
      ReverseListIterator<String> reverseListIterator0 = new ReverseListIterator<String>(linkedList0);
      int int0 = reverseListIterator0.nextIndex();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      linkedList0.addLast((Object) null);
      ReverseListIterator<Object> reverseListIterator0 = new ReverseListIterator<Object>(linkedList0);
      Object object0 = reverseListIterator0.next();
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      LinkedList<String> linkedList0 = new LinkedList<String>();
      ReverseListIterator<String> reverseListIterator0 = new ReverseListIterator<String>(linkedList0);
      reverseListIterator0.add("Cannot add to list until next() or previous() called");
      boolean boolean0 = reverseListIterator0.hasPrevious();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      LinkedList<String> linkedList0 = new LinkedList<String>();
      linkedList0.offerLast("1>p\"AoQqN7)Q");
      ReverseListIterator<String> reverseListIterator0 = new ReverseListIterator<String>(linkedList0);
      boolean boolean0 = reverseListIterator0.hasNext();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      LinkedList<String> linkedList0 = new LinkedList<String>();
      ReverseListIterator<String> reverseListIterator0 = new ReverseListIterator<String>(linkedList0);
      linkedList0.add("");
      // Undeclared exception!
      try { 
        reverseListIterator0.remove();
        fail("Expecting exception: ConcurrentModificationException");
      
      } catch(ConcurrentModificationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.LinkedList$ListItr", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
      ReverseListIterator<Integer> reverseListIterator0 = new ReverseListIterator<Integer>(linkedList0);
      // Undeclared exception!
      try { 
        reverseListIterator0.remove();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.LinkedList$ListItr", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      LinkedList<String> linkedList0 = new LinkedList<String>();
      ReverseListIterator<String> reverseListIterator0 = new ReverseListIterator<String>(linkedList0);
      linkedList0.add("");
      // Undeclared exception!
      try { 
        reverseListIterator0.previous();
        fail("Expecting exception: ConcurrentModificationException");
      
      } catch(ConcurrentModificationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.LinkedList$ListItr", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      ReverseListIterator<Object> reverseListIterator0 = new ReverseListIterator<Object>(linkedList0);
      linkedList0.offer(reverseListIterator0);
      // Undeclared exception!
      try { 
        reverseListIterator0.next();
        fail("Expecting exception: ConcurrentModificationException");
      
      } catch(ConcurrentModificationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.LinkedList$ListItr", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
      ReverseListIterator<Integer> reverseListIterator0 = new ReverseListIterator<Integer>(linkedList0);
      Integer integer0 = new Integer(0);
      linkedList0.add(0, integer0);
      // Undeclared exception!
      try { 
        reverseListIterator0.add(integer0);
        fail("Expecting exception: ConcurrentModificationException");
      
      } catch(ConcurrentModificationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.LinkedList$ListItr", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      LinkedList<String> linkedList0 = new LinkedList<String>();
      ReverseListIterator<String> reverseListIterator0 = new ReverseListIterator<String>(linkedList0);
      reverseListIterator0.add("");
      // Undeclared exception!
      try { 
        reverseListIterator0.add("1>p\"AoQqN7)Q");
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Cannot add to list until next() or previous() called
         //
         verifyException("org.apache.commons.collections4.iterators.ReverseListIterator", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      ReverseListIterator<Object> reverseListIterator0 = new ReverseListIterator<Object>(linkedList0);
      Integer integer0 = new Integer(0);
      reverseListIterator0.add(integer0);
      // Undeclared exception!
      try { 
        reverseListIterator0.set((Object) null);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Cannot set to list until next() or previous() called
         //
         verifyException("org.apache.commons.collections4.iterators.ReverseListIterator", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      LinkedList<String> linkedList0 = new LinkedList<String>();
      ReverseListIterator<String> reverseListIterator0 = new ReverseListIterator<String>(linkedList0);
      // Undeclared exception!
      try { 
        reverseListIterator0.set("I!V3Yi0/HC%s~L]*zC$x");
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.LinkedList$ListItr", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
      ReverseListIterator<Integer> reverseListIterator0 = new ReverseListIterator<Integer>(linkedList0);
      Integer integer0 = new Integer((-1));
      reverseListIterator0.add(integer0);
      // Undeclared exception!
      try { 
        reverseListIterator0.remove();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Cannot remove from list until next() or previous() called
         //
         verifyException("org.apache.commons.collections4.iterators.ReverseListIterator", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      LinkedList<String> linkedList0 = new LinkedList<String>();
      ReverseListIterator<String> reverseListIterator0 = new ReverseListIterator<String>(linkedList0);
      reverseListIterator0.add("");
      reverseListIterator0.reset();
      reverseListIterator0.next();
      reverseListIterator0.remove();
      assertFalse(reverseListIterator0.hasNext());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ReverseListIterator<Integer> reverseListIterator0 = null;
      try {
        reverseListIterator0 = new ReverseListIterator<Integer>((List<Integer>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // List must not be null.
         //
         verifyException("org.apache.commons.collections4.iterators.ReverseListIterator", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      LinkedList<String> linkedList0 = new LinkedList<String>();
      ReverseListIterator<String> reverseListIterator0 = new ReverseListIterator<String>(linkedList0);
      // Undeclared exception!
      try { 
        reverseListIterator0.previous();
        fail("Expecting exception: NoSuchElementException");
      
      } catch(NoSuchElementException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.LinkedList$ListItr", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
      ReverseListIterator<Integer> reverseListIterator0 = new ReverseListIterator<Integer>(linkedList0);
      int int0 = reverseListIterator0.nextIndex();
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      LinkedList<String> linkedList0 = new LinkedList<String>();
      ReverseListIterator<String> reverseListIterator0 = new ReverseListIterator<String>(linkedList0);
      int int0 = reverseListIterator0.previousIndex();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      LinkedList<String> linkedList0 = new LinkedList<String>();
      ReverseListIterator<String> reverseListIterator0 = new ReverseListIterator<String>(linkedList0);
      // Undeclared exception!
      try { 
        reverseListIterator0.next();
        fail("Expecting exception: NoSuchElementException");
      
      } catch(NoSuchElementException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.LinkedList$ListItr", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      LinkedList<String> linkedList0 = new LinkedList<String>();
      ReverseListIterator<String> reverseListIterator0 = new ReverseListIterator<String>(linkedList0);
      boolean boolean0 = reverseListIterator0.hasPrevious();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      LinkedList<String> linkedList0 = new LinkedList<String>();
      ReverseListIterator<String> reverseListIterator0 = new ReverseListIterator<String>(linkedList0);
      boolean boolean0 = reverseListIterator0.hasNext();
      assertFalse(boolean0);
  }
}
