/*
 * This file was automatically generated by EvoSuite
 * Wed Oct 16 06:25:27 GMT 2019
 */

package org.apache.commons.collections4.sequence;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.collections4.sequence.CommandVisitor;
import org.apache.commons.collections4.sequence.KeepCommand;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class KeepCommand_ESTest extends KeepCommand_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      KeepCommand<Object> keepCommand0 = new KeepCommand<Object>("^\"Jx");
      // Undeclared exception!
      try { 
        keepCommand0.accept((CommandVisitor<Object>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.collections4.sequence.KeepCommand", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      KeepCommand<String> keepCommand0 = new KeepCommand<String>("^\"Jx");
      CommandVisitor<String> commandVisitor0 = (CommandVisitor<String>) mock(CommandVisitor.class, new ViolatedAssumptionAnswer());
      keepCommand0.accept(commandVisitor0);
  }
}
