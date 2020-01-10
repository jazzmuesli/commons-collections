/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Wed Oct 16 06:11:57 GMT 2019
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
public class FluentIterable_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "org.apache.commons.collections4.FluentIterable"; 
    org.evosuite.runtime.GuiSupport.initialize(); 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfThreads = 100; 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfIterationsPerLoop = 10000; 
    org.evosuite.runtime.RuntimeSettings.mockSystemIn = true; 
    org.evosuite.runtime.RuntimeSettings.sandboxMode = org.evosuite.runtime.sandbox.Sandbox.SandboxMode.OFF; 
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
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(FluentIterable_ESTest_scaffolding.class.getClassLoader() ,
      "org.apache.commons.collections4.IteratorUtils",
      "org.apache.commons.collections4.iterators.EmptyListIterator",
      "org.apache.commons.collections4.iterators.FilterIterator",
      "org.apache.commons.collections4.Equator",
      "org.apache.commons.collections4.functors.EqualPredicate",
      "org.apache.commons.collections4.iterators.SkippingIterator",
      "org.apache.commons.collections4.iterators.EmptyOrderedMapIterator",
      "org.apache.commons.collections4.iterators.IteratorIterable$1",
      "org.apache.commons.collections4.IterableUtils$7$1",
      "org.apache.commons.collections4.IterableUtils$UnmodifiableIterable",
      "org.apache.commons.collections4.iterators.LazyIteratorChain",
      "org.apache.commons.collections4.iterators.UniqueFilterIterator",
      "org.apache.commons.collections4.IterableUtils$10",
      "org.apache.commons.collections4.Transformer",
      "org.apache.commons.collections4.iterators.CollatingIterator",
      "org.apache.commons.collections4.IterableUtils$13",
      "org.apache.commons.collections4.iterators.UnmodifiableIterator",
      "org.apache.commons.collections4.IterableUtils$11",
      "org.apache.commons.collections4.IterableUtils$12",
      "org.apache.commons.collections4.OrderedMapIterator",
      "org.apache.commons.collections4.iterators.EmptyIterator",
      "org.apache.commons.collections4.IterableUtils$1",
      "org.apache.commons.collections4.IterableUtils$3",
      "org.apache.commons.collections4.IterableUtils$2",
      "org.apache.commons.collections4.IterableUtils$5",
      "org.apache.commons.collections4.iterators.EmptyMapIterator",
      "org.apache.commons.collections4.IterableUtils$4",
      "org.apache.commons.collections4.IterableUtils$7",
      "org.apache.commons.collections4.iterators.EmptyOrderedIterator",
      "org.apache.commons.collections4.IterableUtils$6",
      "org.apache.commons.collections4.iterators.TransformIterator",
      "org.apache.commons.collections4.iterators.SingletonIterator",
      "org.apache.commons.collections4.MapIterator",
      "org.apache.commons.collections4.functors.UniquePredicate",
      "org.apache.commons.collections4.Predicate",
      "org.apache.commons.collections4.IterableUtils$9",
      "org.apache.commons.collections4.IterableUtils$8",
      "org.apache.commons.collections4.iterators.AbstractEmptyMapIterator",
      "org.apache.commons.collections4.iterators.ZippingIterator",
      "org.apache.commons.collections4.Closure",
      "org.apache.commons.collections4.iterators.AbstractEmptyIterator",
      "org.apache.commons.collections4.CollectionUtils",
      "org.apache.commons.collections4.iterators.BoundedIterator",
      "org.apache.commons.collections4.IterableUtils",
      "org.apache.commons.collections4.Factory",
      "org.apache.commons.collections4.IterableUtils$2$1",
      "org.apache.commons.collections4.iterators.IteratorIterable",
      "org.apache.commons.collections4.functors.StringValueTransformer",
      "org.apache.commons.collections4.Unmodifiable",
      "org.apache.commons.collections4.iterators.AbstractIteratorDecorator",
      "org.apache.commons.collections4.FluentIterable",
      "org.apache.commons.collections4.iterators.ReverseListIterator",
      "org.apache.commons.collections4.ResettableIterator",
      "org.apache.commons.collections4.comparators.ComparableComparator",
      "org.apache.commons.collections4.TransformerUtils",
      "org.apache.commons.collections4.ComparatorUtils",
      "org.apache.commons.collections4.ResettableListIterator",
      "org.apache.commons.collections4.OrderedIterator",
      "org.apache.commons.collections4.iterators.AbstractUntypedIteratorDecorator"
    );
  } 
  private static void initMocksToAvoidTimeoutsInTheTests() throws ClassNotFoundException { 
    mock(Class.forName("java.util.Comparator", false, FluentIterable_ESTest_scaffolding.class.getClassLoader()));
    mock(Class.forName("org.apache.commons.collections4.Predicate", false, FluentIterable_ESTest_scaffolding.class.getClassLoader()));
    mock(Class.forName("org.apache.commons.collections4.Transformer", false, FluentIterable_ESTest_scaffolding.class.getClassLoader()));
  }

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(FluentIterable_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "org.apache.commons.collections4.FluentIterable",
      "org.apache.commons.collections4.IterableUtils$1",
      "org.apache.commons.collections4.IterableUtils",
      "org.apache.commons.collections4.iterators.AbstractEmptyIterator",
      "org.apache.commons.collections4.iterators.EmptyIterator",
      "org.apache.commons.collections4.iterators.EmptyListIterator",
      "org.apache.commons.collections4.iterators.EmptyOrderedIterator",
      "org.apache.commons.collections4.iterators.AbstractEmptyMapIterator",
      "org.apache.commons.collections4.iterators.EmptyMapIterator",
      "org.apache.commons.collections4.iterators.EmptyOrderedMapIterator",
      "org.apache.commons.collections4.functors.NullPredicate",
      "org.apache.commons.collections4.functors.StringValueTransformer",
      "org.apache.commons.collections4.CollectionUtils",
      "org.apache.commons.collections4.IteratorUtils",
      "org.apache.commons.collections4.TransformerUtils",
      "org.apache.commons.collections4.IterableUtils$9",
      "org.apache.commons.collections4.iterators.AbstractUntypedIteratorDecorator",
      "org.apache.commons.collections4.iterators.AbstractIteratorDecorator",
      "org.apache.commons.collections4.iterators.SkippingIterator",
      "org.apache.commons.collections4.IterableUtils$2",
      "org.apache.commons.collections4.iterators.LazyIteratorChain",
      "org.apache.commons.collections4.IterableUtils$2$1",
      "org.apache.commons.collections4.IterableUtils$7",
      "org.apache.commons.collections4.IterableUtils$7$1",
      "org.apache.commons.collections4.IterableUtils$11",
      "org.apache.commons.collections4.iterators.FilterIterator",
      "org.apache.commons.collections4.iterators.UniqueFilterIterator",
      "org.apache.commons.collections4.functors.UniquePredicate",
      "org.apache.commons.collections4.IterableUtils$8",
      "org.apache.commons.collections4.iterators.ReverseListIterator",
      "org.apache.commons.collections4.IterableUtils$3",
      "org.apache.commons.collections4.comparators.ComparableComparator",
      "org.apache.commons.collections4.ComparatorUtils",
      "org.apache.commons.collections4.iterators.CollatingIterator",
      "org.apache.commons.collections4.iterators.SingletonIterator",
      "org.apache.commons.collections4.iterators.IteratorIterable",
      "org.apache.commons.collections4.iterators.IteratorIterable$1",
      "org.apache.commons.collections4.IterableUtils$UnmodifiableIterable",
      "org.apache.commons.collections4.iterators.UnmodifiableIterator",
      "org.apache.commons.collections4.IterableUtils$10",
      "org.apache.commons.collections4.iterators.TransformIterator",
      "org.apache.commons.collections4.IterableUtils$13",
      "org.apache.commons.collections4.IterableUtils$12",
      "org.apache.commons.collections4.iterators.ZippingIterator",
      "org.apache.commons.collections4.IterableUtils$5",
      "org.apache.commons.collections4.IterableUtils$4",
      "org.apache.commons.collections4.IterableUtils$6",
      "org.apache.commons.collections4.iterators.BoundedIterator",
      "org.apache.commons.collections4.iterators.IteratorEnumeration",
      "org.apache.commons.collections4.functors.EqualPredicate"
    );
  }
}