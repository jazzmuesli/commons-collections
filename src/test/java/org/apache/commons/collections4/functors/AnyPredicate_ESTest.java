/*
 * This file was automatically generated by EvoSuite
 * Wed Oct 16 05:56:41 GMT 2019
 */

package org.apache.commons.collections4.functors;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.lang.reflect.Array;
import java.util.Collection;
import java.util.LinkedList;
import org.apache.commons.collections4.Predicate;
import org.apache.commons.collections4.Transformer;
import org.apache.commons.collections4.functors.AllPredicate;
import org.apache.commons.collections4.functors.AndPredicate;
import org.apache.commons.collections4.functors.AnyPredicate;
import org.apache.commons.collections4.functors.ComparatorPredicate;
import org.apache.commons.collections4.functors.ExceptionTransformer;
import org.apache.commons.collections4.functors.IdentityPredicate;
import org.apache.commons.collections4.functors.InstanceofPredicate;
import org.apache.commons.collections4.functors.NonePredicate;
import org.apache.commons.collections4.functors.NotNullPredicate;
import org.apache.commons.collections4.functors.NotPredicate;
import org.apache.commons.collections4.functors.NullIsExceptionPredicate;
import org.apache.commons.collections4.functors.NullIsFalsePredicate;
import org.apache.commons.collections4.functors.NullIsTruePredicate;
import org.apache.commons.collections4.functors.NullPredicate;
import org.apache.commons.collections4.functors.OnePredicate;
import org.apache.commons.collections4.functors.TransformedPredicate;
import org.apache.commons.collections4.functors.TransformerPredicate;
import org.apache.commons.collections4.functors.TruePredicate;
import org.apache.commons.collections4.functors.UniquePredicate;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class AnyPredicate_ESTest extends AnyPredicate_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Predicate<Object>[] predicateArray0 = (Predicate<Object>[]) Array.newInstance(Predicate.class, 3);
      Transformer<Object, Boolean> transformer0 = ExceptionTransformer.exceptionTransformer();
      Predicate<Object> predicate0 = TransformerPredicate.transformerPredicate((Transformer<? super Object, Boolean>) transformer0);
      predicateArray0[0] = predicate0;
      AnyPredicate<Integer> anyPredicate0 = new AnyPredicate<Integer>(predicateArray0);
      Integer integer0 = new Integer(571);
      // Undeclared exception!
      try { 
        anyPredicate0.evaluate(integer0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // ExceptionTransformer invoked
         //
         verifyException("org.apache.commons.collections4.functors.ExceptionTransformer", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Predicate<Object>[] predicateArray0 = (Predicate<Object>[]) Array.newInstance(Predicate.class, 8);
      Object object0 = new Object();
      IdentityPredicate<Object> identityPredicate0 = new IdentityPredicate<Object>(object0);
      AndPredicate<Object> andPredicate0 = new AndPredicate<Object>(identityPredicate0, identityPredicate0);
      predicateArray0[0] = (Predicate<Object>) andPredicate0;
      NonePredicate<Object> nonePredicate0 = new NonePredicate<Object>(predicateArray0);
      predicateArray0[1] = (Predicate<Object>) nonePredicate0;
      AnyPredicate<NullPredicate<String>> anyPredicate0 = new AnyPredicate<NullPredicate<String>>(predicateArray0);
      NullPredicate<String> nullPredicate0 = (NullPredicate<String>) mock(NullPredicate.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      anyPredicate0.evaluate(nullPredicate0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Predicate<Object>[] predicateArray0 = (Predicate<Object>[]) Array.newInstance(Predicate.class, 2);
      OnePredicate<Object> onePredicate0 = new OnePredicate<Object>(predicateArray0);
      predicateArray0[0] = (Predicate<Object>) onePredicate0;
      AnyPredicate<ComparatorPredicate<InstanceofPredicate>> anyPredicate0 = new AnyPredicate<ComparatorPredicate<InstanceofPredicate>>(predicateArray0);
      AnyPredicate<Object> anyPredicate1 = new AnyPredicate<Object>(predicateArray0);
      // Undeclared exception!
      anyPredicate1.evaluate(anyPredicate0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Predicate<Object>[] predicateArray0 = (Predicate<Object>[]) Array.newInstance(Predicate.class, 4);
      AnyPredicate<ComparatorPredicate<Object>> anyPredicate0 = new AnyPredicate<ComparatorPredicate<Object>>(predicateArray0);
      // Undeclared exception!
      try { 
        anyPredicate0.evaluate((ComparatorPredicate<Object>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.collections4.functors.AnyPredicate", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Predicate<Object>[] predicateArray0 = (Predicate<Object>[]) Array.newInstance(Predicate.class, 3);
      // Undeclared exception!
      try { 
        AnyPredicate.anyPredicate((Predicate<? super NotPredicate<NotNullPredicate>>[]) predicateArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // The predicate array must not contain a null predicate, index 0 was null
         //
         verifyException("org.apache.commons.collections4.functors.FunctorUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      LinkedList<InstanceofPredicate> linkedList0 = new LinkedList<InstanceofPredicate>();
      linkedList0.offerFirst((InstanceofPredicate) null);
      // Undeclared exception!
      try { 
        AnyPredicate.anyPredicate((Collection<? extends Predicate<? super TransformedPredicate<NullIsTruePredicate>>>) linkedList0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // The predicate collection must not contain a null predicate, index 0 was null
         //
         verifyException("org.apache.commons.collections4.functors.FunctorUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Predicate<Object>[] predicateArray0 = (Predicate<Object>[]) Array.newInstance(Predicate.class, 9);
      Predicate<Object> predicate0 = UniquePredicate.uniquePredicate();
      predicateArray0[0] = predicate0;
      AnyPredicate<OnePredicate<Object>> anyPredicate0 = new AnyPredicate<OnePredicate<Object>>(predicateArray0);
      OnePredicate<Object> onePredicate0 = new OnePredicate<Object>(predicateArray0);
      boolean boolean0 = anyPredicate0.evaluate(onePredicate0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Predicate<Object>[] predicateArray0 = (Predicate<Object>[]) Array.newInstance(Predicate.class, 1);
      LinkedList<InstanceofPredicate> linkedList0 = new LinkedList<InstanceofPredicate>();
      Predicate<Object> predicate0 = AnyPredicate.anyPredicate((Collection<? extends Predicate<? super Object>>) linkedList0);
      predicateArray0[0] = predicate0;
      AnyPredicate<Integer> anyPredicate0 = new AnyPredicate<Integer>(predicateArray0);
      Integer integer0 = new Integer((-1876));
      boolean boolean0 = anyPredicate0.evaluate(integer0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      LinkedList<InstanceofPredicate> linkedList0 = new LinkedList<InstanceofPredicate>();
      Class<Integer> class0 = Integer.class;
      InstanceofPredicate instanceofPredicate0 = new InstanceofPredicate(class0);
      linkedList0.add(instanceofPredicate0);
      linkedList0.add(instanceofPredicate0);
      Predicate<AnyPredicate<NonePredicate<Boolean>>> predicate0 = AnyPredicate.anyPredicate((Collection<? extends Predicate<? super AnyPredicate<NonePredicate<Boolean>>>>) linkedList0);
      assertNotNull(predicate0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      LinkedList<InstanceofPredicate> linkedList0 = new LinkedList<InstanceofPredicate>();
      Class<Object> class0 = Object.class;
      InstanceofPredicate instanceofPredicate0 = new InstanceofPredicate(class0);
      linkedList0.add(instanceofPredicate0);
      Predicate<AllPredicate<OnePredicate>> predicate0 = AnyPredicate.anyPredicate((Collection<? extends Predicate<? super AllPredicate<OnePredicate>>>) linkedList0);
      assertNotNull(predicate0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Predicate<Object>[] predicateArray0 = (Predicate<Object>[]) Array.newInstance(Predicate.class, 1);
      LinkedList<InstanceofPredicate> linkedList0 = new LinkedList<InstanceofPredicate>();
      Predicate<Object> predicate0 = AnyPredicate.anyPredicate((Collection<? extends Predicate<? super Object>>) linkedList0);
      predicateArray0[0] = predicate0;
      Predicate<TruePredicate<NullIsExceptionPredicate>> predicate1 = AnyPredicate.anyPredicate((Predicate<? super TruePredicate<NullIsExceptionPredicate>>[]) predicateArray0);
      assertNotNull(predicate1);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Predicate<Object>[] predicateArray0 = (Predicate<Object>[]) Array.newInstance(Predicate.class, 0);
      Predicate<TruePredicate<Object>> predicate0 = AnyPredicate.anyPredicate((Predicate<? super TruePredicate<Object>>[]) predicateArray0);
      assertNotNull(predicate0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Predicate<Object>[] predicateArray0 = (Predicate<Object>[]) Array.newInstance(Predicate.class, 9);
      Predicate<Object> predicate0 = UniquePredicate.uniquePredicate();
      predicateArray0[0] = predicate0;
      Class<Integer> class0 = Integer.class;
      InstanceofPredicate instanceofPredicate0 = new InstanceofPredicate(class0);
      predicateArray0[1] = (Predicate<Object>) instanceofPredicate0;
      predicateArray0[2] = predicateArray0[1];
      predicateArray0[3] = predicateArray0[0];
      predicateArray0[4] = predicate0;
      NullIsFalsePredicate<Object> nullIsFalsePredicate0 = new NullIsFalsePredicate<Object>(predicateArray0[0]);
      predicateArray0[5] = (Predicate<Object>) nullIsFalsePredicate0;
      predicateArray0[6] = (Predicate<Object>) nullIsFalsePredicate0;
      predicateArray0[7] = predicateArray0[6];
      predicateArray0[8] = predicateArray0[2];
      Predicate<NullIsTruePredicate<NotNullPredicate>> predicate1 = AnyPredicate.anyPredicate((Predicate<? super NullIsTruePredicate<NotNullPredicate>>[]) predicateArray0);
      assertNotNull(predicate1);
  }
}
