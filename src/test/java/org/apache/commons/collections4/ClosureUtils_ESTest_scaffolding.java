/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Wed Oct 16 06:05:49 GMT 2019
 */

package org.apache.commons.collections4;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

import static org.evosuite.shaded.org.mockito.Mockito.*;
@EvoSuiteClassExclude
public class ClosureUtils_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "org.apache.commons.collections4.ClosureUtils"; 
    org.evosuite.runtime.GuiSupport.initialize(); 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfThreads = 100; 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfIterationsPerLoop = 10000; 
    org.evosuite.runtime.RuntimeSettings.mockSystemIn = true; 
    org.evosuite.runtime.RuntimeSettings.sandboxMode = org.evosuite.runtime.sandbox.Sandbox.SandboxMode.RECOMMENDED; 
    org.evosuite.runtime.sandbox.Sandbox.initializeSecurityManagerForSUT(); 
    org.evosuite.runtime.classhandling.JDKClassResetter.init();
    setSystemProperties();
    initializeClasses();
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
    try { initMocksToAvoidTimeoutsInTheTests(); } catch(ClassNotFoundException e) {} 
  } 

  @AfterClass 
  public static void clearEvoSuiteFramework(){ 
    Sandbox.resetDefaultSecurityManager(); 
    java.lang.System.setProperties((java.util.Properties) defaultProperties.clone()); 
  } 

  @Before 
  public void initTestCase(){ 
    threadStopper.storeCurrentThreads();
    threadStopper.startRecordingTime();
    org.evosuite.runtime.jvm.ShutdownHookHandler.getInstance().initHandler(); 
    org.evosuite.runtime.sandbox.Sandbox.goingToExecuteSUTCode(); 
    setSystemProperties(); 
    org.evosuite.runtime.GuiSupport.setHeadless(); 
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
    org.evosuite.runtime.agent.InstrumentingAgent.activate(); 
  } 

  @After 
  public void doneWithTestCase(){ 
    threadStopper.killAndJoinClientThreads();
    org.evosuite.runtime.jvm.ShutdownHookHandler.getInstance().safeExecuteAddedHooks(); 
    org.evosuite.runtime.classhandling.JDKClassResetter.reset(); 
    resetClasses(); 
    org.evosuite.runtime.sandbox.Sandbox.doneWithExecutingSUTCode(); 
    org.evosuite.runtime.agent.InstrumentingAgent.deactivate(); 
    org.evosuite.runtime.GuiSupport.restoreHeadlessMode(); 
  } 

  public static void setSystemProperties() {
 
    java.lang.System.setProperties((java.util.Properties) defaultProperties.clone()); 
    java.lang.System.setProperty("file.encoding", "ANSI_X3.4-1968"); 
    java.lang.System.setProperty("java.awt.headless", "true"); 
    java.lang.System.setProperty("java.io.tmpdir", "/tmp"); 
    java.lang.System.setProperty("user.country", "US"); 
    java.lang.System.setProperty("user.dir", "/projects/commons-collections"); 
    java.lang.System.setProperty("user.home", "/root"); 
    java.lang.System.setProperty("user.language", "en"); 
    java.lang.System.setProperty("user.name", "root"); 
    java.lang.System.setProperty("user.timezone", "Etc/UTC"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(ClosureUtils_ESTest_scaffolding.class.getClassLoader() ,
      "org.apache.commons.collections4.functors.UniquePredicate",
      "org.apache.commons.collections4.Predicate",
      "org.apache.commons.collections4.functors.ExceptionPredicate",
      "org.apache.commons.collections4.functors.NullIsFalsePredicate",
      "org.apache.commons.collections4.ClosureUtilsTest$MockClosure",
      "org.apache.commons.collections4.functors.EqualPredicate",
      "org.apache.commons.collections4.functors.NullPredicate",
      "org.apache.commons.collections4.functors.IfClosure",
      "org.apache.commons.collections4.Closure",
      "org.apache.commons.collections4.functors.TransformerClosure",
      "org.apache.commons.collections4.ClosureUtilsTest$MockTransformer",
      "org.apache.commons.collections4.functors.OnePredicate",
      "org.apache.commons.collections4.functors.NotNullPredicate",
      "org.apache.commons.collections4.functors.AbstractQuantifierPredicate",
      "org.apache.commons.collections4.functors.WhileClosure",
      "org.apache.commons.collections4.functors.TransformerPredicate",
      "org.apache.commons.collections4.functors.ExceptionClosure",
      "org.apache.commons.collections4.functors.FalsePredicate",
      "org.apache.commons.collections4.ClosureUtils",
      "org.apache.commons.collections4.functors.ForClosure",
      "org.apache.commons.collections4.functors.OrPredicate",
      "org.apache.commons.collections4.FunctorException",
      "org.apache.commons.collections4.functors.FunctorUtils",
      "org.apache.commons.collections4.functors.PredicateDecorator",
      "org.apache.commons.collections4.functors.AndPredicate",
      "org.apache.commons.collections4.functors.ChainedClosure",
      "org.apache.commons.collections4.Transformer",
      "org.apache.commons.collections4.functors.SwitchClosure",
      "org.apache.commons.collections4.functors.NOPClosure",
      "org.apache.commons.collections4.functors.InvokerTransformer",
      "org.apache.commons.collections4.functors.TransformedPredicate",
      "org.apache.commons.collections4.ClosureUtilsTest",
      "org.apache.commons.collections4.functors.NullIsExceptionPredicate"
    );
  } 
  private static void initMocksToAvoidTimeoutsInTheTests() throws ClassNotFoundException { 
    mock(Class.forName("org.apache.commons.collections4.Predicate", false, ClosureUtils_ESTest_scaffolding.class.getClassLoader()));
    mock(Class.forName("org.apache.commons.collections4.Transformer", false, ClosureUtils_ESTest_scaffolding.class.getClassLoader()));
  }

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(ClosureUtils_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "org.apache.commons.collections4.ClosureUtils",
      "org.apache.commons.collections4.functors.ExceptionClosure",
      "org.apache.commons.collections4.functors.NOPClosure",
      "org.apache.commons.collections4.functors.NullPredicate",
      "org.apache.commons.collections4.functors.InvokerTransformer",
      "org.apache.commons.collections4.functors.TransformerClosure",
      "org.apache.commons.collections4.functors.IfClosure",
      "org.apache.commons.collections4.functors.SwitchClosure",
      "org.apache.commons.collections4.functors.WhileClosure",
      "org.apache.commons.collections4.functors.ForClosure",
      "org.apache.commons.collections4.functors.ChainedClosure",
      "org.apache.commons.collections4.functors.FunctorUtils"
    );
  }
}
