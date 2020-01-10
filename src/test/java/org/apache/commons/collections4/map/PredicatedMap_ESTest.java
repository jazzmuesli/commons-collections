/*
 * This file was automatically generated by EvoSuite
 * Wed Oct 16 05:53:51 GMT 2019
 */

package org.apache.commons.collections4.map;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.lang.reflect.Array;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import org.apache.commons.collections4.Predicate;
import org.apache.commons.collections4.Transformer;
import org.apache.commons.collections4.functors.AllPredicate;
import org.apache.commons.collections4.functors.AndPredicate;
import org.apache.commons.collections4.functors.ComparatorPredicate;
import org.apache.commons.collections4.functors.ConstantTransformer;
import org.apache.commons.collections4.functors.EqualPredicate;
import org.apache.commons.collections4.functors.ExceptionPredicate;
import org.apache.commons.collections4.functors.FalsePredicate;
import org.apache.commons.collections4.functors.IdentityPredicate;
import org.apache.commons.collections4.functors.InstanceofPredicate;
import org.apache.commons.collections4.functors.NonePredicate;
import org.apache.commons.collections4.functors.NullIsExceptionPredicate;
import org.apache.commons.collections4.functors.NullIsFalsePredicate;
import org.apache.commons.collections4.functors.NullIsTruePredicate;
import org.apache.commons.collections4.functors.OrPredicate;
import org.apache.commons.collections4.functors.PredicateTransformer;
import org.apache.commons.collections4.functors.TransformerPredicate;
import org.apache.commons.collections4.functors.TruePredicate;
import org.apache.commons.collections4.functors.UniquePredicate;
import org.apache.commons.collections4.map.PredicatedMap;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class PredicatedMap_ESTest extends PredicatedMap_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Predicate<Object> predicate0 = TruePredicate.truePredicate();
      AndPredicate<Object> andPredicate0 = new AndPredicate<Object>(predicate0, predicate0);
      Integer integer0 = new Integer(0);
      HashMap<String, Transformer<Object, Integer>> hashMap0 = new HashMap<String, Transformer<Object, Integer>>();
      PredicatedMap<String, Transformer<Object, Integer>> predicatedMap0 = new PredicatedMap<String, Transformer<Object, Integer>>(hashMap0, andPredicate0, andPredicate0);
      ConstantTransformer<Object, Integer> constantTransformer0 = new ConstantTransformer<Object, Integer>(integer0);
      predicatedMap0.validate("A Object should equal itself", constantTransformer0);
      assertEquals(0, predicatedMap0.size());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      HashMap<AbstractMap.SimpleEntry<Object, Boolean>, Predicate<Object>> hashMap0 = new HashMap<AbstractMap.SimpleEntry<Object, Boolean>, Predicate<Object>>();
      Predicate<Object> predicate0 = TruePredicate.truePredicate();
      AndPredicate<Object> andPredicate0 = new AndPredicate<Object>(predicate0, predicate0);
      NullIsTruePredicate<Object> nullIsTruePredicate0 = new NullIsTruePredicate<Object>(andPredicate0);
      PredicatedMap<AbstractMap.SimpleEntry<Object, Boolean>, Predicate<Object>> predicatedMap0 = new PredicatedMap<AbstractMap.SimpleEntry<Object, Boolean>, Predicate<Object>>(hashMap0, nullIsTruePredicate0, predicate0);
      PredicateTransformer<Integer> predicateTransformer0 = new PredicateTransformer<Integer>(predicate0);
      Integer integer0 = new Integer(0);
      Boolean boolean0 = predicateTransformer0.transform(integer0);
      AbstractMap.SimpleImmutableEntry<Object, Boolean> abstractMap_SimpleImmutableEntry0 = new AbstractMap.SimpleImmutableEntry<Object, Boolean>((Object) null, boolean0);
      AbstractMap.SimpleEntry<Object, Boolean> abstractMap_SimpleEntry0 = new AbstractMap.SimpleEntry<Object, Boolean>(abstractMap_SimpleImmutableEntry0);
      hashMap0.put(abstractMap_SimpleEntry0, nullIsTruePredicate0);
      predicatedMap0.put(abstractMap_SimpleEntry0, andPredicate0);
      assertEquals(1, predicatedMap0.size());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Class<Object> class0 = Object.class;
      InstanceofPredicate instanceofPredicate0 = new InstanceofPredicate(class0);
      HashMap<Predicate<Object>, Object> hashMap0 = new HashMap<Predicate<Object>, Object>();
      HashMap<Predicate<Object>, Boolean> hashMap1 = new HashMap<Predicate<Object>, Boolean>();
      PredicateTransformer<Integer> predicateTransformer0 = new PredicateTransformer<Integer>(instanceofPredicate0);
      Integer integer0 = new Integer((-3184));
      Boolean boolean0 = predicateTransformer0.transform(integer0);
      hashMap1.putIfAbsent(instanceofPredicate0, boolean0);
      hashMap0.putAll(hashMap1);
      PredicatedMap<Predicate<Object>, Object> predicatedMap0 = PredicatedMap.predicatedMap((Map<Predicate<Object>, Object>) hashMap0, (Predicate<? super Predicate<Object>>) instanceofPredicate0, (Predicate<? super Object>) instanceofPredicate0);
      assertFalse(predicatedMap0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      UniquePredicate<Object> uniquePredicate0 = new UniquePredicate<Object>();
      NullIsFalsePredicate<Object> nullIsFalsePredicate0 = new NullIsFalsePredicate<Object>(uniquePredicate0);
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      PredicatedMap<String, Object> predicatedMap0 = new PredicatedMap<String, Object>(hashMap0, nullIsFalsePredicate0, nullIsFalsePredicate0);
      boolean boolean0 = predicatedMap0.isSetValueChecking();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      HashMap<Object, Integer> hashMap0 = new HashMap<Object, Integer>();
      PredicatedMap<Object, Integer> predicatedMap0 = new PredicatedMap<Object, Integer>(hashMap0, (Predicate<? super Object>) null, (Predicate<? super Integer>) null);
      boolean boolean0 = predicatedMap0.isSetValueChecking();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      HashMap<Boolean, Transformer<Object, Integer>> hashMap0 = new HashMap<Boolean, Transformer<Object, Integer>>();
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(comparator0).compare(any() , any());
      Predicate<Object> predicate0 = ComparatorPredicate.comparatorPredicate((Object) hashMap0, comparator0);
      HashMap<String, Transformer<Object, Integer>> hashMap1 = new HashMap<String, Transformer<Object, Integer>>();
      PredicatedMap<String, Transformer<Object, Integer>> predicatedMap0 = PredicatedMap.predicatedMap((Map<String, Transformer<Object, Integer>>) hashMap1, (Predicate<? super String>) predicate0, (Predicate<? super Transformer<Object, Integer>>) predicate0);
      Transformer<Object, Integer> transformer0 = predicatedMap0.checkSetValue((Transformer<Object, Integer>) null);
      assertNull(transformer0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      HashMap<Object, Predicate<Object>> hashMap0 = new HashMap<Object, Predicate<Object>>();
      Predicate<Object> predicate0 = ExceptionPredicate.exceptionPredicate();
      PredicatedMap<Object, Predicate<Object>> predicatedMap0 = new PredicatedMap<Object, Predicate<Object>>(hashMap0, predicate0, predicate0);
      // Undeclared exception!
      try { 
        predicatedMap0.validate((Object) null, predicate0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // ExceptionPredicate invoked
         //
         verifyException("org.apache.commons.collections4.functors.ExceptionPredicate", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      HashMap<Object, Object> hashMap0 = new HashMap<Object, Object>();
      Predicate<Object>[] predicateArray0 = (Predicate<Object>[]) Array.newInstance(Predicate.class, 3);
      NonePredicate<Object> nonePredicate0 = new NonePredicate<Object>(predicateArray0);
      predicateArray0[0] = (Predicate<Object>) nonePredicate0;
      PredicatedMap<Object, Object> predicatedMap0 = PredicatedMap.predicatedMap((Map<Object, Object>) hashMap0, (Predicate<? super Object>) nonePredicate0, (Predicate<? super Object>) nonePredicate0);
      // Undeclared exception!
      predicatedMap0.validate(predicateArray0[0], predicateArray0[0]);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      HashMap<String, AbstractMap.SimpleEntry<Object, Object>> hashMap0 = new HashMap<String, AbstractMap.SimpleEntry<Object, Object>>(0);
      NullIsFalsePredicate<String> nullIsFalsePredicate0 = new NullIsFalsePredicate<String>((Predicate<? super String>) null);
      PredicatedMap<String, AbstractMap.SimpleEntry<Object, Object>> predicatedMap0 = new PredicatedMap<String, AbstractMap.SimpleEntry<Object, Object>>(hashMap0, nullIsFalsePredicate0, (Predicate<? super AbstractMap.SimpleEntry<Object, Object>>) null);
      AbstractMap.SimpleEntry<Object, Object> abstractMap_SimpleEntry0 = new AbstractMap.SimpleEntry<Object, Object>(predicatedMap0, hashMap0);
      // Undeclared exception!
      try { 
        predicatedMap0.validate("#-m`&,R0", abstractMap_SimpleEntry0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.collections4.functors.NullIsFalsePredicate", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      HashMap<Integer, String> hashMap0 = new HashMap<Integer, String>();
      Integer integer0 = new Integer(0);
      Predicate<Object> predicate0 = EqualPredicate.equalPredicate((Object) integer0);
      PredicatedMap<Integer, String> predicatedMap0 = new PredicatedMap<Integer, String>(hashMap0, predicate0, predicate0);
      // Undeclared exception!
      try { 
        predicatedMap0.validate(integer0, "");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Cannot add value - Predicate rejected it
         //
         verifyException("org.apache.commons.collections4.map.PredicatedMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Predicate<Object> predicate0 = TruePredicate.truePredicate();
      AndPredicate<Object> andPredicate0 = new AndPredicate<Object>(predicate0, predicate0);
      OrPredicate<Object> orPredicate0 = new OrPredicate<Object>(andPredicate0, andPredicate0);
      Transformer<Object, Boolean> transformer0 = ConstantTransformer.nullTransformer();
      Predicate<Object> predicate1 = TransformerPredicate.transformerPredicate((Transformer<? super Object, Boolean>) transformer0);
      PredicateTransformer<Integer> predicateTransformer0 = new PredicateTransformer<Integer>(andPredicate0);
      Integer integer0 = new Integer((-1514));
      Boolean boolean0 = predicateTransformer0.transform(integer0);
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      ComparatorPredicate.Criterion comparatorPredicate_Criterion0 = ComparatorPredicate.Criterion.GREATER_OR_EQUAL;
      ComparatorPredicate<Object> comparatorPredicate0 = new ComparatorPredicate<Object>(orPredicate0, comparator0, comparatorPredicate_Criterion0);
      HashMap<Integer, Boolean> hashMap0 = new HashMap<Integer, Boolean>();
      PredicatedMap<Integer, Boolean> predicatedMap0 = PredicatedMap.predicatedMap((Map<Integer, Boolean>) hashMap0, (Predicate<? super Integer>) orPredicate0, (Predicate<? super Boolean>) orPredicate0);
      PredicatedMap<Integer, Boolean> predicatedMap1 = new PredicatedMap<Integer, Boolean>(predicatedMap0, predicate1, comparatorPredicate0);
      // Undeclared exception!
      try { 
        predicatedMap1.put(integer0, boolean0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Transformer must return an instanceof Boolean, it was a null object
         //
         verifyException("org.apache.commons.collections4.functors.TransformerPredicate", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      HashMap<String, Predicate<Object>> hashMap0 = new HashMap<String, Predicate<Object>>(2485, 2485);
      Predicate<Object>[] predicateArray0 = (Predicate<Object>[]) Array.newInstance(Predicate.class, 8);
      Predicate<Object> predicate0 = FalsePredicate.falsePredicate();
      predicateArray0[0] = predicate0;
      AllPredicate<Object> allPredicate0 = new AllPredicate<Object>(predicateArray0);
      predicateArray0[1] = (Predicate<Object>) allPredicate0;
      predicateArray0[2] = (Predicate<Object>) allPredicate0;
      predicateArray0[3] = predicateArray0[0];
      NonePredicate<Object> nonePredicate0 = new NonePredicate<Object>(predicateArray0);
      predicateArray0[4] = (Predicate<Object>) nonePredicate0;
      OrPredicate<Object> orPredicate0 = new OrPredicate<Object>(predicateArray0[4], predicateArray0[4]);
      PredicatedMap<String, Predicate<Object>> predicatedMap0 = PredicatedMap.predicatedMap((Map<String, Predicate<Object>>) hashMap0, (Predicate<? super String>) orPredicate0, (Predicate<? super Predicate<Object>>) predicateArray0[4]);
      // Undeclared exception!
      predicatedMap0.put("", predicateArray0[1]);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      HashMap<Object, Integer> hashMap0 = new HashMap<Object, Integer>();
      AllPredicate<Object> allPredicate0 = new AllPredicate<Object>((Predicate<? super Object>[]) null);
      PredicatedMap<Object, Integer> predicatedMap0 = new PredicatedMap<Object, Integer>(hashMap0, allPredicate0, allPredicate0);
      Integer integer0 = new Integer(0);
      // Undeclared exception!
      try { 
        predicatedMap0.put((Object) null, integer0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Class<Object> class0 = Object.class;
      InstanceofPredicate instanceofPredicate0 = new InstanceofPredicate(class0);
      HashMap<Predicate<Object>, Boolean> hashMap0 = new HashMap<Predicate<Object>, Boolean>();
      PredicateTransformer<Integer> predicateTransformer0 = new PredicateTransformer<Integer>(instanceofPredicate0);
      Integer integer0 = new Integer((-3184));
      Boolean boolean0 = predicateTransformer0.transform(integer0);
      hashMap0.putIfAbsent(instanceofPredicate0, boolean0);
      // Undeclared exception!
      try { 
        Map<Predicate<Object>,Boolean> hashMap02 = (Map<Predicate<Object>,Boolean>) hashMap0;
		PredicatedMap.predicatedMap(hashMap02, ExceptionPredicate.exceptionPredicate(), ExceptionPredicate.exceptionPredicate());
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // ExceptionPredicate invoked
         //
         verifyException("org.apache.commons.collections4.functors.ExceptionPredicate", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      // Undeclared exception!
      try { 
        PredicatedMap.predicatedMap((Map<Predicate<Object>, String>) null, (Predicate<? super Predicate<Object>>) null, (Predicate<? super String>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // Map must not be null.
         //
         verifyException("org.apache.commons.collections4.map.AbstractMapDecorator", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      HashMap<Object, String> hashMap0 = new HashMap<Object, String>(1);
      Predicate<Object> predicate0 = ExceptionPredicate.exceptionPredicate();
      PredicatedMap<Object, String> predicatedMap0 = new PredicatedMap<Object, String>(hashMap0, predicate0, predicate0);
      // Undeclared exception!
      try { 
        predicatedMap0.checkSetValue("");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // ExceptionPredicate invoked
         //
         verifyException("org.apache.commons.collections4.functors.ExceptionPredicate", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      LinkedList<Predicate<Object>> linkedList0 = new LinkedList<Predicate<Object>>();
      Predicate<Object> predicate0 = AllPredicate.allPredicate((Collection<? extends Predicate<? super Object>>) linkedList0);
      HashMap<Integer, Object> hashMap0 = new HashMap<Integer, Object>();
      PredicatedMap<Integer, Object> predicatedMap0 = PredicatedMap.predicatedMap((Map<Integer, Object>) hashMap0, (Predicate<? super Integer>) predicate0, (Predicate<? super Object>) null);
      // Undeclared exception!
      try { 
        predicatedMap0.checkSetValue((Object) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.collections4.map.PredicatedMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      HashMap<Object, Integer> hashMap0 = new HashMap<Object, Integer>();
      Predicate<Object> predicate0 = ExceptionPredicate.exceptionPredicate();
      PredicatedMap<Object, Integer> predicatedMap0 = new PredicatedMap<Object, Integer>(hashMap0, predicate0, predicate0);
      Predicate<Object>[] predicateArray0 = (Predicate<Object>[]) Array.newInstance(Predicate.class, 2);
      Integer integer0 = new Integer((-1523));
      hashMap0.put(predicatedMap0, integer0);
      NonePredicate<Object> nonePredicate0 = new NonePredicate<Object>(predicateArray0);
      PredicatedMap<Object, Integer> predicatedMap1 = null;
      try {
        predicatedMap1 = new PredicatedMap<Object, Integer>(predicatedMap0, predicate0, nonePredicate0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // ExceptionPredicate invoked
         //
         verifyException("org.apache.commons.collections4.functors.ExceptionPredicate", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      HashMap<HashMap<String, Integer>, Object> hashMap0 = new HashMap<HashMap<String, Integer>, Object>();
      NullIsExceptionPredicate<Object> nullIsExceptionPredicate0 = new NullIsExceptionPredicate<Object>((Predicate<? super Object>) null);
      HashMap<String, Integer> hashMap1 = new HashMap<String, Integer>();
      Predicate<AbstractMap.SimpleImmutableEntry<Predicate, AbstractMap.SimpleEntry>> predicate0 = NullIsFalsePredicate.nullIsFalsePredicate((Predicate<? super AbstractMap.SimpleImmutableEntry<Predicate, AbstractMap.SimpleEntry>>) nullIsExceptionPredicate0);
      hashMap0.put(hashMap1, predicate0);
      PredicatedMap<HashMap<String, Integer>, Object> predicatedMap0 = null;
      try {
        predicatedMap0 = new PredicatedMap<HashMap<String, Integer>, Object>(hashMap0, nullIsExceptionPredicate0, nullIsExceptionPredicate0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.collections4.functors.NullIsExceptionPredicate", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      ComparatorPredicate.Criterion comparatorPredicate_Criterion0 = ComparatorPredicate.Criterion.LESS_OR_EQUAL;
      Predicate<Object> predicate0 = ComparatorPredicate.comparatorPredicate((Object) null, comparator0, (ComparatorPredicate.Criterion) comparatorPredicate_Criterion0);
      NullIsTruePredicate<Object> nullIsTruePredicate0 = new NullIsTruePredicate<Object>(predicate0);
      PredicatedMap<Object, HashMap<String, Integer>> predicatedMap0 = null;
      try {
        predicatedMap0 = new PredicatedMap<Object, HashMap<String, Integer>>((Map<Object, HashMap<String, Integer>>) null, nullIsTruePredicate0, nullIsTruePredicate0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // Map must not be null.
         //
         verifyException("org.apache.commons.collections4.map.AbstractMapDecorator", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      HashMap<Integer, HashMap<Integer, Integer>> hashMap0 = new HashMap<Integer, HashMap<Integer, Integer>>();
      HashMap<Integer, Integer> hashMap1 = new HashMap<Integer, Integer>();
      hashMap0.put((Integer) null, hashMap1);
      EqualPredicate<Object> equalPredicate0 = new EqualPredicate<Object>(hashMap0);
      PredicatedMap<Integer, HashMap<Integer, Integer>> predicatedMap0 = null;
      try {
        predicatedMap0 = new PredicatedMap<Integer, HashMap<Integer, Integer>>(hashMap0, (Predicate<? super Integer>) null, equalPredicate0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Cannot add value - Predicate rejected it
         //
         verifyException("org.apache.commons.collections4.map.PredicatedMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      HashMap<Object, Integer> hashMap0 = new HashMap<Object, Integer>();
      Integer integer0 = new Integer(0);
      hashMap0.put((Object) null, integer0);
      PredicatedMap<Object, Integer> predicatedMap0 = new PredicatedMap<Object, Integer>(hashMap0, (Predicate<? super Object>) null, (Predicate<? super Integer>) null);
      predicatedMap0.putAll(hashMap0);
      assertFalse(predicatedMap0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      HashMap<AbstractMap.SimpleImmutableEntry<Object, Object>, Transformer<Integer, String>> hashMap0 = new HashMap<AbstractMap.SimpleImmutableEntry<Object, Object>, Transformer<Integer, String>>();
      Class<Object> class0 = Object.class;
      Predicate<Object> predicate0 = InstanceofPredicate.instanceOfPredicate(class0);
      PredicatedMap<AbstractMap.SimpleImmutableEntry<Object, Object>, Transformer<Integer, String>> predicatedMap0 = new PredicatedMap<AbstractMap.SimpleImmutableEntry<Object, Object>, Transformer<Integer, String>>(hashMap0, predicate0, predicate0);
      predicatedMap0.putAll(predicatedMap0);
      assertTrue(predicatedMap0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      HashMap<Boolean, AbstractMap.SimpleEntry<String, Object>> hashMap0 = new HashMap<Boolean, AbstractMap.SimpleEntry<String, Object>>();
      Class<Boolean> class0 = Boolean.class;
      Predicate<Object> predicate0 = InstanceofPredicate.instanceOfPredicate(class0);
      PredicatedMap<Boolean, AbstractMap.SimpleEntry<String, Object>> predicatedMap0 = PredicatedMap.predicatedMap((Map<Boolean, AbstractMap.SimpleEntry<String, Object>>) hashMap0, (Predicate<? super Boolean>) predicate0, (Predicate<? super AbstractMap.SimpleEntry<String, Object>>) null);
      PredicatedMap<Boolean, AbstractMap.SimpleEntry<String, Object>> predicatedMap1 = PredicatedMap.predicatedMap((Map<Boolean, AbstractMap.SimpleEntry<String, Object>>) predicatedMap0, (Predicate<? super Boolean>) predicate0, (Predicate<? super AbstractMap.SimpleEntry<String, Object>>) predicate0);
      AbstractMap.SimpleEntry<String, Object> abstractMap_SimpleEntry0 = new AbstractMap.SimpleEntry<String, Object>("k`m4)t", predicatedMap0);
      // Undeclared exception!
      try { 
        predicatedMap1.checkSetValue(abstractMap_SimpleEntry0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Cannot set value - Predicate rejected it
         //
         verifyException("org.apache.commons.collections4.map.PredicatedMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Class<Object> class0 = Object.class;
      Predicate<Object> predicate0 = InstanceofPredicate.instanceOfPredicate(class0);
      HashMap<String, AbstractMap.SimpleEntry<String, String>> hashMap0 = new HashMap<String, AbstractMap.SimpleEntry<String, String>>();
      PredicatedMap<String, AbstractMap.SimpleEntry<String, String>> predicatedMap0 = PredicatedMap.predicatedMap((Map<String, AbstractMap.SimpleEntry<String, String>>) hashMap0, (Predicate<? super String>) predicate0, (Predicate<? super AbstractMap.SimpleEntry<String, String>>) predicate0);
      AbstractMap.SimpleEntry<String, String> abstractMap_SimpleEntry0 = new AbstractMap.SimpleEntry<String, String>("P[KR{Xd[", "P[KR{Xd[");
      AbstractMap.SimpleEntry<String, String> abstractMap_SimpleEntry1 = predicatedMap0.checkSetValue(abstractMap_SimpleEntry0);
      assertSame(abstractMap_SimpleEntry0, abstractMap_SimpleEntry1);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      HashMap<Object, String> hashMap0 = new HashMap<Object, String>();
      IdentityPredicate<Object> identityPredicate0 = new IdentityPredicate<Object>(hashMap0);
      HashMap<AbstractMap.SimpleImmutableEntry<String, Object>, String> hashMap1 = new HashMap<AbstractMap.SimpleImmutableEntry<String, Object>, String>();
      PredicatedMap<AbstractMap.SimpleImmutableEntry<String, Object>, String> predicatedMap0 = PredicatedMap.predicatedMap((Map<AbstractMap.SimpleImmutableEntry<String, Object>, String>) hashMap1, (Predicate<? super AbstractMap.SimpleImmutableEntry<String, Object>>) null, (Predicate<? super String>) identityPredicate0);
      AbstractMap.SimpleImmutableEntry<String, String> abstractMap_SimpleImmutableEntry0 = new AbstractMap.SimpleImmutableEntry<String, String>("", "");
      AbstractMap.SimpleEntry<String, Object> abstractMap_SimpleEntry0 = new AbstractMap.SimpleEntry<String, Object>(abstractMap_SimpleImmutableEntry0);
      AbstractMap.SimpleImmutableEntry<String, Object> abstractMap_SimpleImmutableEntry1 = new AbstractMap.SimpleImmutableEntry<String, Object>(abstractMap_SimpleEntry0);
      // Undeclared exception!
      try { 
        predicatedMap0.put(abstractMap_SimpleImmutableEntry1, "He");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Cannot add value - Predicate rejected it
         //
         verifyException("org.apache.commons.collections4.map.PredicatedMap", e);
      }
  }
}
