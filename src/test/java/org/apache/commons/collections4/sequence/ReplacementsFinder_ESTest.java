/*
 * This file was automatically generated by EvoSuite
 * Wed Oct 16 06:01:07 GMT 2019
 */

package org.apache.commons.collections4.sequence;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.collections4.sequence.ReplacementsFinder;
import org.apache.commons.collections4.sequence.ReplacementsHandler;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class ReplacementsFinder_ESTest extends ReplacementsFinder_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ReplacementsHandler<String> replacementsHandler0 = (ReplacementsHandler<String>) mock(ReplacementsHandler.class, new ViolatedAssumptionAnswer());
      ReplacementsFinder<String> replacementsFinder0 = new ReplacementsFinder<String>(replacementsHandler0);
      ReplacementsFinder<Object> replacementsFinder1 = new ReplacementsFinder<Object>((ReplacementsHandler<Object>) null);
      Object object0 = new Object();
      replacementsFinder1.visitInsertCommand(object0);
      // Undeclared exception!
      try { 
        replacementsFinder1.visitKeepCommand(replacementsFinder0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.collections4.sequence.ReplacementsFinder", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ReplacementsHandler<Object> replacementsHandler0 = (ReplacementsHandler<Object>) mock(ReplacementsHandler.class, new ViolatedAssumptionAnswer());
      ReplacementsFinder<Object> replacementsFinder0 = new ReplacementsFinder<Object>(replacementsHandler0);
      replacementsFinder0.visitInsertCommand("N)|m8u.~55|V+3L");
      replacementsFinder0.visitKeepCommand(replacementsFinder0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ReplacementsHandler<Object> replacementsHandler0 = (ReplacementsHandler<Object>) mock(ReplacementsHandler.class, new ViolatedAssumptionAnswer());
      ReplacementsFinder<Object> replacementsFinder0 = new ReplacementsFinder<Object>(replacementsHandler0);
      replacementsFinder0.visitKeepCommand(replacementsFinder0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      ReplacementsHandler<Object> replacementsHandler0 = (ReplacementsHandler<Object>) mock(ReplacementsHandler.class, new ViolatedAssumptionAnswer());
      ReplacementsFinder<Object> replacementsFinder0 = new ReplacementsFinder<Object>(replacementsHandler0);
      Object object0 = new Object();
      replacementsFinder0.visitDeleteCommand(object0);
      replacementsFinder0.visitKeepCommand("N)|m8u.~55|V+3L");
  }
}
