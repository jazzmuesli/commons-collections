/*
 * This file was automatically generated by EvoSuite
 * Wed Oct 16 06:14:37 GMT 2019
 */

package org.apache.commons.collections4.sequence;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.collections4.sequence.CommandVisitor;
import org.apache.commons.collections4.sequence.DeleteCommand;
import org.apache.commons.collections4.sequence.EditScript;
import org.apache.commons.collections4.sequence.InsertCommand;
import org.apache.commons.collections4.sequence.KeepCommand;
import org.apache.commons.collections4.sequence.ReplacementsFinder;
import org.apache.commons.collections4.sequence.ReplacementsHandler;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class EditScript_ESTest extends EditScript_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      EditScript<String> editScript0 = new EditScript<String>();
      ReplacementsHandler<String> replacementsHandler0 = (ReplacementsHandler<String>) mock(ReplacementsHandler.class, new ViolatedAssumptionAnswer());
      ReplacementsFinder<String> replacementsFinder0 = new ReplacementsFinder<String>(replacementsHandler0);
      InsertCommand<String> insertCommand0 = new InsertCommand<String>("+!s<_;k)seJkB\u0007x");
      editScript0.append(insertCommand0);
      editScript0.visit(replacementsFinder0);
      assertEquals(1, editScript0.getModifications());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      EditScript<KeepCommand<Integer>> editScript0 = new EditScript<KeepCommand<Integer>>();
      KeepCommand<Integer> keepCommand0 = new KeepCommand<Integer>((Integer) null);
      InsertCommand<KeepCommand<Integer>> insertCommand0 = new InsertCommand<KeepCommand<Integer>>(keepCommand0);
      editScript0.append(insertCommand0);
      int int0 = editScript0.getModifications();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      EditScript<KeepCommand<Object>> editScript0 = new EditScript<KeepCommand<Object>>();
      KeepCommand<Object> keepCommand0 = (KeepCommand<Object>) mock(KeepCommand.class, new ViolatedAssumptionAnswer());
      KeepCommand<KeepCommand<Object>> keepCommand1 = new KeepCommand<KeepCommand<Object>>(keepCommand0);
      editScript0.append(keepCommand1);
      int int0 = editScript0.getLCSLength();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      EditScript<String> editScript0 = new EditScript<String>();
      InsertCommand<String> insertCommand0 = new InsertCommand<String>("");
      editScript0.append(insertCommand0);
      // Undeclared exception!
      try { 
        editScript0.visit((CommandVisitor<String>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.collections4.sequence.InsertCommand", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      EditScript<Object> editScript0 = new EditScript<Object>();
      editScript0.append((DeleteCommand<Object>) null);
      assertEquals(1, editScript0.getModifications());
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      EditScript<KeepCommand<Object>> editScript0 = new EditScript<KeepCommand<Object>>();
      int int0 = editScript0.getLCSLength();
      assertEquals(0, editScript0.getModifications());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      EditScript<Object> editScript0 = new EditScript<Object>();
      int int0 = editScript0.getModifications();
      assertEquals(0, editScript0.getLCSLength());
      assertEquals(0, int0);
  }
}
