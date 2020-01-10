/*
 * This file was automatically generated by EvoSuite
 * Wed Oct 16 05:56:29 GMT 2019
 */

package org.apache.commons.collections4.iterators;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.NoSuchElementException;
import java.util.function.Consumer;
import org.apache.commons.collections4.iterators.ObjectArrayIterator;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ObjectArrayIterator_ESTest extends ObjectArrayIterator_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      String[] stringArray0 = new String[7];
      ObjectArrayIterator<String> objectArrayIterator0 = new ObjectArrayIterator<String>(stringArray0);
      Consumer<String> consumer0 = (Consumer<String>) mock(Consumer.class, new ViolatedAssumptionAnswer());
      objectArrayIterator0.forEachRemaining(consumer0);
      objectArrayIterator0.reset();
      assertTrue(objectArrayIterator0.hasNext());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Integer[] integerArray0 = new Integer[7];
      Integer integer0 = new Integer(0);
      integerArray0[0] = integer0;
      integerArray0[1] = integerArray0[0];
      String[] stringArray0 = new String[2];
      ObjectArrayIterator<String> objectArrayIterator0 = new ObjectArrayIterator<String>(stringArray0, (int) integerArray0[1]);
      objectArrayIterator0.next();
      int int0 = objectArrayIterator0.getStartIndex();
      assertEquals(2, objectArrayIterator0.getEndIndex());
      assertTrue(objectArrayIterator0.hasNext());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Integer[] integerArray0 = new Integer[0];
      ObjectArrayIterator<Integer> objectArrayIterator0 = new ObjectArrayIterator<Integer>(integerArray0);
      objectArrayIterator0.index = 1349;
      // Undeclared exception!
      try { 
        objectArrayIterator0.next();
        fail("Expecting exception: NoSuchElementException");
      
      } catch(NoSuchElementException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.collections4.iterators.ObjectArrayIterator", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      String[] stringArray0 = new String[2];
      stringArray0[0] = "";
      ObjectArrayIterator<String> objectArrayIterator0 = new ObjectArrayIterator<String>(stringArray0);
      objectArrayIterator0.next();
      assertTrue(objectArrayIterator0.hasNext());
      assertEquals(2, objectArrayIterator0.getEndIndex());
      assertEquals(0, objectArrayIterator0.getStartIndex());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      String[] stringArray0 = new String[1];
      ObjectArrayIterator<String> objectArrayIterator0 = new ObjectArrayIterator<String>(stringArray0);
      boolean boolean0 = objectArrayIterator0.hasNext();
      assertEquals(0, objectArrayIterator0.getStartIndex());
      assertEquals(1, objectArrayIterator0.getEndIndex());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Object[] objectArray0 = new Object[5];
      ObjectArrayIterator<Object> objectArrayIterator0 = new ObjectArrayIterator<Object>(objectArray0, 0, 0);
      boolean boolean0 = objectArrayIterator0.hasNext();
      assertEquals(0, objectArrayIterator0.getStartIndex());
      assertEquals(0, objectArrayIterator0.getEndIndex());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      int int0 = 1;
      String[] stringArray0 = new String[2];
      ObjectArrayIterator<String> objectArrayIterator0 = new ObjectArrayIterator<String>(stringArray0, int0);
      int int1 = objectArrayIterator0.getStartIndex();
      assertEquals(2, objectArrayIterator0.getEndIndex());
      assertEquals(1, int1);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Object[] objectArray0 = new Object[6];
      ObjectArrayIterator<Object> objectArrayIterator0 = new ObjectArrayIterator<Object>(objectArray0, 0, 0);
      int int0 = objectArrayIterator0.getEndIndex();
      assertEquals(0, int0);
      assertEquals(0, objectArrayIterator0.getStartIndex());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Object[] objectArray0 = new Object[0];
      ObjectArrayIterator<Object> objectArrayIterator0 = new ObjectArrayIterator<Object>(objectArray0);
      Object[] objectArray1 = objectArrayIterator0.getArray();
      assertFalse(objectArrayIterator0.hasNext());
      assertNotNull(objectArray1);
      assertEquals(0, objectArrayIterator0.getStartIndex());
      assertEquals(0, objectArrayIterator0.getEndIndex());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      String[] stringArray0 = new String[1];
      ObjectArrayIterator<String> objectArrayIterator0 = new ObjectArrayIterator<String>(stringArray0);
      objectArrayIterator0.index = (-1606);
      // Undeclared exception!
      try { 
        objectArrayIterator0.next();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ObjectArrayIterator<String> objectArrayIterator0 = null;
      try {
        objectArrayIterator0 = new ObjectArrayIterator<String>((String[]) null, 0, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.collections4.iterators.ObjectArrayIterator", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ObjectArrayIterator<Object> objectArrayIterator0 = null;
      try {
        objectArrayIterator0 = new ObjectArrayIterator<Object>((Object[]) null, 1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.collections4.iterators.ObjectArrayIterator", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Integer[] integerArray0 = new Integer[6];
      ObjectArrayIterator<Integer> objectArrayIterator0 = null;
      try {
        objectArrayIterator0 = new ObjectArrayIterator<Integer>(integerArray0, 70, 0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Start index must not be greater than the array length
         //
         verifyException("org.apache.commons.collections4.iterators.ObjectArrayIterator", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ObjectArrayIterator<Object> objectArrayIterator0 = null;
      try {
        objectArrayIterator0 = new ObjectArrayIterator<Object>((Object[]) null, (-2098), (-2098));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Start index must not be less than zero
         //
         verifyException("org.apache.commons.collections4.iterators.ObjectArrayIterator", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      int int0 = 0;
      String[] stringArray0 = new String[5];
      ObjectArrayIterator<String> objectArrayIterator0 = null;
      try {
        objectArrayIterator0 = new ObjectArrayIterator<String>(stringArray0, int0, (-2913));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // End index must not be less than start index
         //
         verifyException("org.apache.commons.collections4.iterators.ObjectArrayIterator", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      String[] stringArray0 = new String[0];
      ObjectArrayIterator<String> objectArrayIterator0 = null;
      try {
        objectArrayIterator0 = new ObjectArrayIterator<String>(stringArray0, 1);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Start index must not be greater than the array length
         //
         verifyException("org.apache.commons.collections4.iterators.ObjectArrayIterator", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Object[] objectArray0 = new Object[7];
      ObjectArrayIterator<Object> objectArrayIterator0 = null;
      try {
        objectArrayIterator0 = new ObjectArrayIterator<Object>(objectArray0, 1, 2224);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // End index must not be greater than the array length
         //
         verifyException("org.apache.commons.collections4.iterators.ObjectArrayIterator", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Object[] objectArray0 = new Object[2];
      ObjectArrayIterator<Object> objectArrayIterator0 = new ObjectArrayIterator<Object>(objectArray0);
      Object[] objectArray1 = objectArrayIterator0.getArray();
      assertEquals(2, objectArrayIterator0.getEndIndex());
      assertEquals(0, objectArrayIterator0.getStartIndex());
      assertNotNull(objectArray1);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      String[] stringArray0 = new String[8];
      ObjectArrayIterator<String> objectArrayIterator0 = new ObjectArrayIterator<String>(stringArray0);
      int int0 = objectArrayIterator0.getEndIndex();
      assertEquals(0, objectArrayIterator0.getStartIndex());
      assertEquals(8, int0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      String[] stringArray0 = new String[1];
      ObjectArrayIterator<Object> objectArrayIterator0 = new ObjectArrayIterator<Object>(stringArray0, 0);
      // Undeclared exception!
      try { 
        objectArrayIterator0.remove();
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // remove() method is not supported for an ObjectArrayIterator
         //
         verifyException("org.apache.commons.collections4.iterators.ObjectArrayIterator", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ObjectArrayIterator<Object> objectArrayIterator0 = null;
      try {
        objectArrayIterator0 = new ObjectArrayIterator<Object>((Object[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.collections4.iterators.ObjectArrayIterator", e);
      }
  }
}
