/*
 * This file was automatically generated by EvoSuite
 * Wed Oct 16 05:55:58 GMT 2019
 */

package org.apache.commons.collections4.functors;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.lang.reflect.Array;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import org.apache.commons.collections4.Equator;
import org.apache.commons.collections4.Factory;
import org.apache.commons.collections4.Predicate;
import org.apache.commons.collections4.Transformer;
import org.apache.commons.collections4.functors.AndPredicate;
import org.apache.commons.collections4.functors.ChainedTransformer;
import org.apache.commons.collections4.functors.ConstantTransformer;
import org.apache.commons.collections4.functors.DefaultEquator;
import org.apache.commons.collections4.functors.EqualPredicate;
import org.apache.commons.collections4.functors.ExceptionFactory;
import org.apache.commons.collections4.functors.ExceptionTransformer;
import org.apache.commons.collections4.functors.FactoryTransformer;
import org.apache.commons.collections4.functors.IdentityPredicate;
import org.apache.commons.collections4.functors.IfTransformer;
import org.apache.commons.collections4.functors.InstanceofPredicate;
import org.apache.commons.collections4.functors.InvokerTransformer;
import org.apache.commons.collections4.functors.MapTransformer;
import org.apache.commons.collections4.functors.NonePredicate;
import org.apache.commons.collections4.functors.NotNullPredicate;
import org.apache.commons.collections4.functors.NotPredicate;
import org.apache.commons.collections4.functors.NullIsExceptionPredicate;
import org.apache.commons.collections4.functors.NullPredicate;
import org.apache.commons.collections4.functors.OnePredicate;
import org.apache.commons.collections4.functors.PredicateTransformer;
import org.apache.commons.collections4.functors.TransformerPredicate;
import org.apache.commons.collections4.functors.TruePredicate;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class IfTransformer_ESTest extends IfTransformer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Factory<Boolean> factory0 = ExceptionFactory.exceptionFactory();
      Transformer<Object, Boolean> transformer0 = FactoryTransformer.factoryTransformer((Factory<? extends Boolean>) factory0);
      TransformerPredicate<Object> transformerPredicate0 = new TransformerPredicate<Object>(transformer0);
      Transformer<String, String> transformer1 = InvokerTransformer.invokerTransformer("Transformer collection must not be null");
      Transformer<String, Object> transformer2 = IfTransformer.ifTransformer((Predicate<? super String>) transformerPredicate0, (Transformer<? super String, ?>) transformer0, (Transformer<? super String, ?>) transformer1);
      assertNotNull(transformer2);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      LinkedList<Predicate<Object>> linkedList0 = new LinkedList<Predicate<Object>>();
      Predicate<Object> predicate0 = NonePredicate.nonePredicate((Collection<? extends Predicate<? super Object>>) linkedList0);
      HashMap<Object, Transformer<Object, String>> hashMap0 = new HashMap<Object, Transformer<Object, String>>();
      Transformer<Boolean, Transformer<Object, String>> transformer0 = MapTransformer.mapTransformer((Map<? super Boolean, ? extends Transformer<Object, String>>) hashMap0);
      IfTransformer<Boolean, Transformer<Object, String>> ifTransformer0 = new IfTransformer<Boolean, Transformer<Object, String>>(predicate0, transformer0, transformer0);
      PredicateTransformer<String> predicateTransformer0 = new PredicateTransformer<String>(predicate0);
      Boolean boolean0 = predicateTransformer0.transform("T$B!64Af>rNR[34");
      Transformer<Object, String> transformer1 = ifTransformer0.transform(boolean0);
      assertNull(transformer1);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      DefaultEquator<Object> defaultEquator0 = DefaultEquator.defaultEquator();
      Predicate<Object> predicate0 = EqualPredicate.equalPredicate((Object) "xuM)", (Equator<Object>) defaultEquator0);
      AndPredicate<Object> andPredicate0 = new AndPredicate<Object>(predicate0, predicate0);
      Transformer<Object, String> transformer0 = ConstantTransformer.constantTransformer((String) null);
      IfTransformer<Object, String> ifTransformer0 = new IfTransformer<Object, String>(andPredicate0, transformer0, transformer0);
      Transformer<? super Object, ? extends String> transformer1 = ifTransformer0.getTrueTransformer();
      assertNotNull(transformer1);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      IfTransformer<Transformer<Object, String>, Transformer<Object, String>> ifTransformer0 = new IfTransformer<Transformer<Object, String>, Transformer<Object, String>>((Predicate<? super Transformer<Object, String>>) null, (Transformer<? super Transformer<Object, String>, ? extends Transformer<Object, String>>) null, (Transformer<? super Transformer<Object, String>, ? extends Transformer<Object, String>>) null);
      Predicate<? super Transformer<Object, String>> predicate0 = ifTransformer0.getPredicate();
      assertNull(predicate0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      EqualPredicate<Object> equalPredicate0 = new EqualPredicate<Object>((Object) null);
      Integer integer0 = new Integer((-1599));
      ConstantTransformer<String, Integer> constantTransformer0 = new ConstantTransformer<String, Integer>(integer0);
      IfTransformer<String, Object> ifTransformer0 = new IfTransformer<String, Object>(equalPredicate0, constantTransformer0, (Transformer<? super String, ?>) null);
      Transformer<? super String, ?> transformer0 = ifTransformer0.getFalseTransformer();
      assertNull(transformer0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Predicate<Object> predicate0 = TruePredicate.truePredicate();
      NotPredicate<Object> notPredicate0 = new NotPredicate<Object>(predicate0);
      Transformer<Object, Boolean> transformer0 = ExceptionTransformer.exceptionTransformer();
      IfTransformer<String, Boolean> ifTransformer0 = new IfTransformer<String, Boolean>(notPredicate0, transformer0, transformer0);
      // Undeclared exception!
      try { 
        ifTransformer0.transform("Predicate must not be null");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // ExceptionTransformer invoked
         //
         verifyException("org.apache.commons.collections4.functors.ExceptionTransformer", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Predicate<Object>[] predicateArray0 = (Predicate<Object>[]) Array.newInstance(Predicate.class, 4);
      NonePredicate<Object> nonePredicate0 = new NonePredicate<Object>(predicateArray0);
      predicateArray0[0] = (Predicate<Object>) nonePredicate0;
      Predicate<Object> predicate0 = EqualPredicate.equalPredicate((Object) nonePredicate0);
      NotPredicate<Object> notPredicate0 = new NotPredicate<Object>(nonePredicate0);
      IfTransformer<Boolean, Object> ifTransformer0 = new IfTransformer<Boolean, Object>(notPredicate0, (Transformer<? super Boolean, ?>) null, (Transformer<? super Boolean, ?>) null);
      PredicateTransformer<String> predicateTransformer0 = new PredicateTransformer<String>(predicate0);
      Boolean boolean0 = predicateTransformer0.transform("org.apache.commons.collections4.functors.AllPredicate");
      // Undeclared exception!
      ifTransformer0.transform(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Predicate<Object> predicate0 = NullPredicate.nullPredicate();
      NullIsExceptionPredicate<Object> nullIsExceptionPredicate0 = new NullIsExceptionPredicate<Object>(predicate0);
      IfTransformer<Integer, Object> ifTransformer0 = new IfTransformer<Integer, Object>(nullIsExceptionPredicate0, (Transformer<? super Integer, ?>) null, (Transformer<? super Integer, ?>) null);
      Integer integer0 = new Integer((-151));
      // Undeclared exception!
      try { 
        ifTransformer0.transform(integer0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.collections4.functors.IfTransformer", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      IdentityPredicate<Object> identityPredicate0 = new IdentityPredicate<Object>((Object) null);
      NotPredicate<Object> notPredicate0 = new NotPredicate<Object>(identityPredicate0);
      LinkedList<Transformer<Object, String>> linkedList0 = new LinkedList<Transformer<Object, String>>();
      Transformer<Object, Object> transformer0 = ChainedTransformer.chainedTransformer((Collection<? extends Transformer<? super Object, ?>>) linkedList0);
      IfTransformer<String, Object> ifTransformer0 = new IfTransformer<String, Object>(notPredicate0, transformer0, transformer0);
      Object object0 = ifTransformer0.transform("7Y/00xo>!o/U *");
      assertEquals("7Y/00xo>!o/U *", object0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      DefaultEquator<Object> defaultEquator0 = DefaultEquator.defaultEquator();
      Predicate<Object> predicate0 = EqualPredicate.equalPredicate((Object) "xuM)", (Equator<Object>) defaultEquator0);
      NotPredicate<Object> notPredicate0 = new NotPredicate<Object>(predicate0);
      AndPredicate<Object> andPredicate0 = new AndPredicate<Object>(notPredicate0, predicate0);
      Transformer<Object, String> transformer0 = ConstantTransformer.constantTransformer((String) null);
      Transformer<Object, Object> transformer1 = IfTransformer.ifTransformer((Predicate<? super Object>) andPredicate0, (Transformer<? super Object, ?>) transformer0);
      ConstantTransformer<Object, Integer> constantTransformer0 = new ConstantTransformer<Object, Integer>((Integer) (-1));
      IfTransformer<String, Object> ifTransformer0 = new IfTransformer<String, Object>(andPredicate0, transformer1, constantTransformer0);
      Object object0 = ifTransformer0.transform("org.apache.commons.collections4.functors.TransformerPredicate");
      assertEquals((-1), object0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Class<Boolean> class0 = Boolean.class;
      Predicate<Object> predicate0 = InstanceofPredicate.instanceOfPredicate(class0);
      // Undeclared exception!
      try { 
        IfTransformer.ifTransformer((Predicate<? super Integer>) predicate0, (Transformer<? super Integer, ? extends Integer>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // Transformer must not be null
         //
         verifyException("org.apache.commons.collections4.functors.IfTransformer", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Transformer<Object, Integer> transformer0 = MapTransformer.mapTransformer((Map<? super Object, ? extends Integer>) null);
      // Undeclared exception!
      try { 
        IfTransformer.ifTransformer((Predicate<? super Integer>) null, (Transformer<? super Integer, ? extends Integer>) transformer0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // Predicate must not be null
         //
         verifyException("org.apache.commons.collections4.functors.IfTransformer", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Predicate<Object> predicate0 = NotNullPredicate.notNullPredicate();
      // Undeclared exception!
      try { 
        IfTransformer.ifTransformer((Predicate<? super Predicate<Object>>) predicate0, (Transformer<? super Predicate<Object>, ? extends Integer>) null, (Transformer<? super Predicate<Object>, ? extends Integer>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // Transformers must not be null
         //
         verifyException("org.apache.commons.collections4.functors.IfTransformer", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Class<String>[] classArray0 = (Class<String>[]) Array.newInstance(Class.class, 9);
      InvokerTransformer<Integer, Integer> invokerTransformer0 = new InvokerTransformer<Integer, Integer>("org.apache.commons.collections4.functors.OnePredicate", classArray0, classArray0);
      // Undeclared exception!
      try { 
        IfTransformer.ifTransformer((Predicate<? super Integer>) null, (Transformer<? super Integer, ?>) invokerTransformer0, (Transformer<? super Integer, ?>) invokerTransformer0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // Predicate must not be null
         //
         verifyException("org.apache.commons.collections4.functors.IfTransformer", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      LinkedList<Predicate<Object>> linkedList0 = new LinkedList<Predicate<Object>>();
      Predicate<Object> predicate0 = OnePredicate.onePredicate((Collection<? extends Predicate<? super Object>>) linkedList0);
      Transformer<Object, Boolean> transformer0 = ConstantTransformer.nullTransformer();
      // Undeclared exception!
      try { 
        IfTransformer.ifTransformer((Predicate<? super Predicate<Object>>) predicate0, (Transformer<? super Predicate<Object>, ?>) transformer0, (Transformer<? super Predicate<Object>, ?>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // Transformers must not be null
         //
         verifyException("org.apache.commons.collections4.functors.IfTransformer", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      DefaultEquator<Object> defaultEquator0 = DefaultEquator.defaultEquator();
      Predicate<Object> predicate0 = EqualPredicate.equalPredicate((Object) "xuM)", (Equator<Object>) defaultEquator0);
      AndPredicate<Object> andPredicate0 = new AndPredicate<Object>(predicate0, predicate0);
      Transformer<Object, String> transformer0 = ConstantTransformer.constantTransformer((String) null);
      Transformer<Object, Object> transformer1 = IfTransformer.ifTransformer((Predicate<? super Object>) andPredicate0, (Transformer<? super Object, ?>) transformer0);
      ConstantTransformer<Object, Integer> constantTransformer0 = new ConstantTransformer<Object, Integer>((Integer) (-1));
      IfTransformer<String, Object> ifTransformer0 = new IfTransformer<String, Object>(andPredicate0, transformer1, constantTransformer0);
      Transformer<? super String, ?> transformer2 = ifTransformer0.getFalseTransformer();
      assertNotNull(transformer2);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      LinkedList<Predicate<Object>> linkedList0 = new LinkedList<Predicate<Object>>();
      Predicate<Object> predicate0 = OnePredicate.onePredicate((Collection<? extends Predicate<? super Object>>) linkedList0);
      IfTransformer<Predicate<Object>, Boolean> ifTransformer0 = new IfTransformer<Predicate<Object>, Boolean>(predicate0, (Transformer<? super Predicate<Object>, ? extends Boolean>) null, (Transformer<? super Predicate<Object>, ? extends Boolean>) null);
      Transformer<? super Predicate<Object>, ? extends Boolean> transformer0 = ifTransformer0.getTrueTransformer();
      assertNull(transformer0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Class<Object>[] classArray0 = (Class<Object>[]) Array.newInstance(Class.class, 3);
      InvokerTransformer<Object, String> invokerTransformer0 = new InvokerTransformer<Object, String>((String) null, classArray0, classArray0);
      IdentityPredicate<Transformer<Object, String>> identityPredicate0 = new IdentityPredicate<Transformer<Object, String>>(invokerTransformer0);
      IfTransformer<Transformer<Object, String>, String> ifTransformer0 = new IfTransformer<Transformer<Object, String>, String>(identityPredicate0, invokerTransformer0, invokerTransformer0);
      Predicate<? super Transformer<Object, String>> predicate0 = ifTransformer0.getPredicate();
      assertNotNull(predicate0);
  }
}
