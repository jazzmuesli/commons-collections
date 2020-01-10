/*
 * This file was automatically generated by EvoSuite
 * Wed Oct 16 06:24:41 GMT 2019
 */

package org.apache.commons.collections4;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.collections4.Bag;
import org.apache.commons.collections4.BagUtils;
import org.apache.commons.collections4.Predicate;
import org.apache.commons.collections4.SortedBag;
import org.apache.commons.collections4.Transformer;
import org.apache.commons.collections4.bag.CollectionSortedBag;
import org.apache.commons.collections4.bag.PredicatedSortedBag;
import org.apache.commons.collections4.bag.SynchronizedSortedBag;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class BagUtils_ESTest extends BagUtils_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      // Undeclared exception!
      try { 
        BagUtils.unmodifiableSortedBag((SortedBag<SynchronizedSortedBag<String>>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // Collection must not be null.
         //
         verifyException("org.apache.commons.collections4.collection.AbstractCollectionDecorator", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      // Undeclared exception!
      try { 
        BagUtils.unmodifiableBag((Bag<? extends String>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // Collection must not be null.
         //
         verifyException("org.apache.commons.collections4.collection.AbstractCollectionDecorator", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      // Undeclared exception!
      try { 
        BagUtils.transformingSortedBag((SortedBag<String>) null, (Transformer<? super String, ? extends String>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // Collection must not be null.
         //
         verifyException("org.apache.commons.collections4.collection.AbstractCollectionDecorator", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Transformer<Object, CollectionSortedBag<Integer>> transformer0 = (Transformer<Object, CollectionSortedBag<Integer>>) mock(Transformer.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        BagUtils.transformingBag((Bag<CollectionSortedBag<Integer>>) null, (Transformer<? super CollectionSortedBag<Integer>, ? extends CollectionSortedBag<Integer>>) transformer0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // Collection must not be null.
         //
         verifyException("org.apache.commons.collections4.collection.AbstractCollectionDecorator", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      // Undeclared exception!
      try { 
        BagUtils.synchronizedSortedBag((SortedBag<Object>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // Collection must not be null.
         //
         verifyException("org.apache.commons.collections4.collection.SynchronizedCollection", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      // Undeclared exception!
      try { 
        BagUtils.synchronizedBag((Bag<Integer>) null);
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
      SortedBag<Integer> sortedBag0 = BagUtils.emptySortedBag();
      // Undeclared exception!
      try { 
        BagUtils.predicatedSortedBag(sortedBag0, (Predicate<? super Integer>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // Predicate must not be null.
         //
         verifyException("org.apache.commons.collections4.collection.PredicatedCollection", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      // Undeclared exception!
      try { 
        BagUtils.collectionBag((Bag<SynchronizedSortedBag<String>>) null);
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
      SortedBag<String> sortedBag0 = BagUtils.emptySortedBag();
      Transformer<String, String> transformer0 = (Transformer<String, String>) mock(Transformer.class, new ViolatedAssumptionAnswer());
      SortedBag<String> sortedBag1 = BagUtils.transformingSortedBag(sortedBag0, (Transformer<? super String, ? extends String>) transformer0);
      assertTrue(sortedBag1.equals((Object)sortedBag0));
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      SortedBag<String> sortedBag0 = BagUtils.emptySortedBag();
      Predicate<String> predicate0 = (Predicate<String>) mock(Predicate.class, new ViolatedAssumptionAnswer());
      SortedBag<String> sortedBag1 = BagUtils.predicatedSortedBag((SortedBag<String>) sortedBag0, (Predicate<String>) predicate0);
      assertEquals(0, sortedBag1.size());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Bag<String> bag0 = BagUtils.emptyBag();
      Bag<Object> bag1 = BagUtils.unmodifiableBag((Bag<?>) bag0);
      Bag<Object> bag2 = BagUtils.synchronizedBag(bag1);
      assertTrue(bag2.equals((Object)bag1));
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Bag<String> bag0 = BagUtils.emptyBag();
      Predicate<String> predicate0 = (Predicate<String>) mock(Predicate.class, new ViolatedAssumptionAnswer());
      Bag<String> bag1 = BagUtils.predicatedBag((Bag<String>) bag0, (Predicate<String>) predicate0);
      Bag<String> bag2 = BagUtils.collectionBag((Bag<String>) bag1);
      assertEquals(0, bag2.size());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      SortedBag<String> sortedBag0 = BagUtils.emptySortedBag();
      // Undeclared exception!
      try { 
        BagUtils.predicatedBag((Bag<String>) sortedBag0, (Predicate<? super String>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // Predicate must not be null.
         //
         verifyException("org.apache.commons.collections4.collection.PredicatedCollection", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      SortedBag<Object> sortedBag0 = BagUtils.emptySortedBag();
      SortedBag<Object> sortedBag1 = BagUtils.unmodifiableSortedBag(sortedBag0);
      assertSame(sortedBag0, sortedBag1);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      SortedBag<String> sortedBag0 = BagUtils.emptySortedBag();
      SortedBag<String> sortedBag1 = BagUtils.synchronizedSortedBag(sortedBag0);
      assertEquals(0, sortedBag1.size());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      SortedBag<Object> sortedBag0 = BagUtils.emptySortedBag();
      Transformer<Object, Object> transformer0 = (Transformer<Object, Object>) mock(Transformer.class, new ViolatedAssumptionAnswer());
      Bag<Object> bag0 = BagUtils.transformingBag((Bag<Object>) sortedBag0, (Transformer<? super Object, ?>) transformer0);
      assertEquals(0, bag0.size());
  }
}
