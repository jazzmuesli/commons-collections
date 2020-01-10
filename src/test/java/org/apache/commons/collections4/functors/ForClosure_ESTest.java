/*
 * This file was automatically generated by EvoSuite
 * Wed Oct 16 06:04:26 GMT 2019
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
import org.apache.commons.collections4.Closure;
import org.apache.commons.collections4.Predicate;
import org.apache.commons.collections4.Transformer;
import org.apache.commons.collections4.functors.AnyPredicate;
import org.apache.commons.collections4.functors.ChainedClosure;
import org.apache.commons.collections4.functors.ChainedTransformer;
import org.apache.commons.collections4.functors.ExceptionClosure;
import org.apache.commons.collections4.functors.ForClosure;
import org.apache.commons.collections4.functors.IdentityPredicate;
import org.apache.commons.collections4.functors.InvokerTransformer;
import org.apache.commons.collections4.functors.NOPClosure;
import org.apache.commons.collections4.functors.OnePredicate;
import org.apache.commons.collections4.functors.StringValueTransformer;
import org.apache.commons.collections4.functors.SwitchClosure;
import org.apache.commons.collections4.functors.TransformerClosure;
import org.apache.commons.collections4.functors.TransformerPredicate;
import org.apache.commons.collections4.functors.WhileClosure;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ForClosure_ESTest extends ForClosure_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Predicate<Object>[] predicateArray0 = (Predicate<Object>[]) Array.newInstance(Predicate.class, 1);
      AnyPredicate<Object> anyPredicate0 = new AnyPredicate<Object>(predicateArray0);
      predicateArray0[0] = (Predicate<Object>) anyPredicate0;
      Predicate<Integer> predicate0 = OnePredicate.onePredicate((Predicate<? super Integer>[]) predicateArray0);
      Closure<Object>[] closureArray0 = (Closure<Object>[]) Array.newInstance(Closure.class, 0);
      Closure<Object> closure0 = ChainedClosure.chainedClosure((Closure<? super Object>[]) closureArray0);
      Closure<Integer> closure1 = WhileClosure.whileClosure((Predicate<? super Integer>) predicate0, (Closure<? super Integer>) closure0, true);
      ForClosure.forClosure(5210, (Closure<? super Integer>) closure1);
      ForClosure<Integer> forClosure0 = new ForClosure<Integer>(5210, closure0);
      ForClosure<Predicate<Object>> forClosure1 = new ForClosure<Predicate<Object>>(5210, closure0);
      int int0 = (-1095);
      ForClosure.forClosure((-1095), (Closure<? super Predicate<Object>>) closure0);
      Class<String>[] classArray0 = (Class<String>[]) Array.newInstance(Class.class, 1);
      Class<String> class0 = String.class;
      classArray0[0] = class0;
      Transformer<Object, Boolean> transformer0 = InvokerTransformer.invokerTransformer("h2a}DHCIuP2}Ku", (Class<?>[]) classArray0, (Object[]) predicateArray0);
      Predicate<Object> predicate1 = TransformerPredicate.transformerPredicate((Transformer<? super Object, Boolean>) transformer0);
      forClosure1.execute(predicate1);
      Integer integer0 = new Integer(5210);
      // Undeclared exception!
      forClosure0.execute(integer0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      int int0 = 519;
      ForClosure<Object> forClosure0 = new ForClosure<Object>(519, (Closure<? super Object>) null);
      ForClosure.forClosure(1, (Closure<? super Object>) null);
      ForClosure.forClosure(1, (Closure<? super Object>) forClosure0);
      // Undeclared exception!
      try { 
        forClosure0.execute((Object) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Transformer<Object, Boolean> transformer0 = InvokerTransformer.invokerTransformer("JPX6L!^SH1FJ3m~P1l+");
      TransformerClosure<Object> transformerClosure0 = new TransformerClosure<Object>(transformer0);
      ForClosure<Closure<Boolean>> forClosure0 = new ForClosure<Closure<Boolean>>(0, transformerClosure0);
      int int0 = forClosure0.getCount();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Closure<Object>[] closureArray0 = (Closure<Object>[]) Array.newInstance(Closure.class, 0);
      Closure<Object> closure0 = ChainedClosure.chainedClosure((Closure<? super Object>[]) closureArray0);
      ForClosure<Predicate<String>> forClosure0 = new ForClosure<Predicate<String>>(2346, closure0);
      int int0 = forClosure0.getCount();
      assertEquals(2346, int0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ForClosure<Closure<Object>> forClosure0 = new ForClosure<Closure<Object>>((-3347), (Closure<? super Closure<Object>>) null);
      int int0 = forClosure0.getCount();
      assertEquals((-3347), int0);
      
      ForClosure<String> forClosure1 = new ForClosure<String>((-1365), (Closure<? super String>) null);
      forClosure1.execute("G=t.|7");
      assertEquals((-1365), forClosure1.getCount());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Closure<Object> closure0 = NOPClosure.nopClosure();
      ForClosure<Object> forClosure0 = new ForClosure<Object>((-486), closure0);
      forClosure0.getClosure();
      assertEquals((-486), forClosure0.getCount());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      LinkedList<Transformer<Object, Integer>> linkedList0 = new LinkedList<Transformer<Object, Integer>>();
      Transformer<Object, Object> transformer0 = ChainedTransformer.chainedTransformer((Collection<? extends Transformer<? super Object, ?>>) linkedList0);
      TransformerClosure<String> transformerClosure0 = new TransformerClosure<String>(transformer0);
      ForClosure<String> forClosure0 = new ForClosure<String>((-1260), transformerClosure0);
      forClosure0.execute("9bR^L$G");
      assertEquals((-1260), forClosure0.getCount());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Closure<Object> closure0 = ExceptionClosure.exceptionClosure();
      ForClosure.forClosure(0, (Closure<? super Predicate<Object>>) closure0);
      Closure<Boolean> closure1 = ForClosure.forClosure(0, (Closure<? super Boolean>) closure0);
      assertNotNull(closure1);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      LinkedList<Closure<Object>> linkedList0 = new LinkedList<Closure<Object>>();
      Closure<Object> closure0 = ChainedClosure.chainedClosure((Collection<? extends Closure<? super Object>>) linkedList0);
      Closure<Object> closure1 = ForClosure.forClosure((-11), (Closure<? super Object>) closure0);
      ForClosure<String> forClosure0 = new ForClosure<String>((-11), closure1);
      forClosure0.getClosure();
      assertEquals((-11), forClosure0.getCount());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      int int0 = 2455;
      Closure<Object> closure0 = ExceptionClosure.exceptionClosure();
      ForClosure<Object> forClosure0 = new ForClosure<Object>(2455, closure0);
      forClosure0.getClosure();
      Object object0 = new Object();
      // Undeclared exception!
      try { 
        forClosure0.execute(object0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // ExceptionClosure invoked
         //
         verifyException("org.apache.commons.collections4.functors.ExceptionClosure", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      LinkedList<Predicate<Object>> linkedList0 = new LinkedList<Predicate<Object>>();
      Predicate<Object> predicate0 = OnePredicate.onePredicate((Collection<? extends Predicate<? super Object>>) linkedList0);
      HashMap<Predicate<Object>, Closure<Object>> hashMap0 = new HashMap<Predicate<Object>, Closure<Object>>();
      Closure<Object> closure0 = SwitchClosure.switchClosure((Map<Predicate<Object>, Closure<Object>>) hashMap0);
      Closure<Object> closure1 = WhileClosure.whileClosure((Predicate<? super Object>) predicate0, (Closure<? super Object>) closure0, false);
      ForClosure<String> forClosure0 = new ForClosure<String>(1, closure1);
      Closure<Predicate<String>> closure2 = ForClosure.forClosure(1, (Closure<? super Predicate<String>>) closure1);
      assertNotNull(closure2);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Closure<Object> closure0 = NOPClosure.nopClosure();
      ForClosure<Boolean> forClosure0 = new ForClosure<Boolean>(6, closure0);
      int int0 = forClosure0.getCount();
      assertEquals(6, int0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ForClosure<Boolean> forClosure0 = new ForClosure<Boolean>(4, (Closure<? super Boolean>) null);
      forClosure0.getClosure();
      assertEquals(4, forClosure0.getCount());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ForClosure<Integer> forClosure0 = new ForClosure<Integer>(0, (Closure<? super Integer>) null);
      Integer integer0 = new Integer(0);
      forClosure0.execute(integer0);
      assertEquals(0, forClosure0.getCount());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Closure<Object> closure0 = ExceptionClosure.exceptionClosure();
      ForClosure<Object> forClosure0 = new ForClosure<Object>(1528, closure0);
      // Undeclared exception!
      try { 
        forClosure0.execute(closure0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // ExceptionClosure invoked
         //
         verifyException("org.apache.commons.collections4.functors.ExceptionClosure", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      HashMap<Predicate<Object>, Closure<Object>> hashMap0 = new HashMap<Predicate<Object>, Closure<Object>>();
      Closure<Object> closure0 = SwitchClosure.switchClosure((Map<Predicate<Object>, Closure<Object>>) hashMap0);
      Closure<Predicate<Object>> closure1 = ForClosure.forClosure(3336, (Closure<? super Predicate<Object>>) closure0);
      assertNotNull(closure1);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ForClosure.forClosure(1, (Closure<? super Predicate<Closure>>) null);
      ForClosure.forClosure(1, (Closure<? super Closure<Closure<Object>>>) null);
      Closure<Object> closure0 = ForClosure.forClosure(1, (Closure<? super Object>) null);
      assertNotNull(closure0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Closure<Object> closure0 = NOPClosure.nopClosure();
      Object object0 = new Object();
      Closure<Object> closure1 = ForClosure.forClosure(7, (Closure<? super Object>) closure0);
      Closure<Object> closure2 = ForClosure.forClosure(1, (Closure<? super Object>) closure0);
      ForClosure.forClosure(1, (Closure<? super Predicate<Integer>>) closure2);
      Closure<Object> closure3 = ForClosure.forClosure(7, (Closure<? super Object>) closure2);
      assertNotSame(closure3, closure1);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ExceptionClosure.exceptionClosure();
      Object object0 = new Object();
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      HashMap<Predicate<Object>, Closure<Object>> hashMap0 = new HashMap<Predicate<Object>, Closure<Object>>();
      Closure<Object> closure0 = SwitchClosure.switchClosure((Map<Predicate<Object>, Closure<Object>>) hashMap0);
      IdentityPredicate.identityPredicate((String) null);
      ForClosure<Integer> forClosure0 = new ForClosure<Integer>(0, closure0);
      Closure<Object> closure1 = ForClosure.forClosure(0, (Closure<? super Object>) closure0);
      Closure<String> closure2 = ForClosure.forClosure(0, (Closure<? super String>) closure0);
      ForClosure<Object> forClosure1 = new ForClosure<Object>(0, closure1);
      forClosure1.getCount();
      forClosure0.getClosure();
      forClosure1.getCount();
      forClosure1.execute(closure1);
      ForClosure<String> forClosure2 = new ForClosure<String>(1918, closure0);
      forClosure2.execute((String) null);
      int int0 = forClosure2.getCount();
      assertEquals(1918, int0);
      
      Transformer<Object, String> transformer0 = StringValueTransformer.stringValueTransformer();
      TransformerClosure<Object> transformerClosure0 = new TransformerClosure<Object>(transformer0);
      ForClosure.forClosure(0, (Closure<? super Object>) transformerClosure0);
      Closure<String> closure3 = ForClosure.forClosure(0, (Closure<? super String>) transformerClosure0);
      assertSame(closure3, closure2);
  }
}
