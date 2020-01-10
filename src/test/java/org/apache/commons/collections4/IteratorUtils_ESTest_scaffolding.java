/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Wed Oct 16 05:23:39 GMT 2019
 */

package org.apache.commons.collections4;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class IteratorUtils_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "org.apache.commons.collections4.IteratorUtils"; 
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
  } 

  @Before 
  public void initTestCase(){ 
    threadStopper.storeCurrentThreads();
    threadStopper.startRecordingTime();
    org.evosuite.runtime.jvm.ShutdownHookHandler.getInstance().initHandler(); 
    org.evosuite.runtime.sandbox.Sandbox.goingToExecuteSUTCode(); 
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
 
    /*No java.lang.System property to set*/
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(IteratorUtils_ESTest_scaffolding.class.getClassLoader() ,
      "org.apache.commons.collections4.IteratorUtils",
      "org.apache.commons.collections4.iterators.EmptyListIterator",
      "org.apache.commons.collections4.iterators.FilterIterator",
      "org.apache.commons.collections4.ClosureUtilsTest$MockClosure",
      "org.apache.commons.collections4.functors.InstanceofPredicate",
      "org.apache.commons.collections4.Equator",
      "org.apache.commons.collections4.functors.NullPredicate",
      "org.apache.commons.collections4.functors.EqualPredicate",
      "org.apache.commons.collections4.functors.IdentityPredicate",
      "org.apache.commons.collections4.iterators.UnmodifiableMapIterator",
      "org.apache.commons.collections4.functors.ComparatorPredicate",
      "org.apache.commons.collections4.iterators.SkippingIterator",
      "org.apache.commons.collections4.functors.OnePredicate",
      "org.apache.commons.collections4.iterators.EmptyOrderedMapIterator",
      "org.apache.commons.collections4.IterableUtils$7$1",
      "org.apache.commons.collections4.iterators.FilterListIterator",
      "org.apache.commons.collections4.iterators.IteratorIterable$1",
      "org.apache.commons.collections4.functors.TransformerPredicate",
      "org.apache.commons.collections4.iterators.SingletonListIterator",
      "org.apache.commons.collections4.iterators.ArrayIterator",
      "org.apache.commons.collections4.iterators.LazyIteratorChain",
      "org.apache.commons.collections4.functors.PredicateDecorator",
      "org.apache.commons.collections4.iterators.LoopingListIterator",
      "org.apache.commons.collections4.iterators.AbstractOrderedMapIteratorDecorator",
      "org.apache.commons.collections4.Transformer",
      "org.apache.commons.collections4.iterators.CollatingIterator",
      "org.apache.commons.collections4.iterators.ObjectArrayListIterator",
      "org.apache.commons.collections4.iterators.UnmodifiableIterator",
      "org.apache.commons.collections4.iterators.PushbackIterator",
      "org.apache.commons.collections4.OrderedMapIterator",
      "org.apache.commons.collections4.iterators.EmptyIterator",
      "org.apache.commons.collections4.IterableUtils$1",
      "org.apache.commons.collections4.ClosureUtilsTest",
      "org.apache.commons.collections4.iterators.EmptyMapIterator",
      "org.apache.commons.collections4.iterators.ObjectArrayIterator",
      "org.apache.commons.collections4.iterators.PeekingIterator",
      "org.apache.commons.collections4.IterableUtils$7",
      "org.apache.commons.collections4.iterators.EmptyOrderedIterator",
      "org.apache.commons.collections4.iterators.TransformIterator",
      "org.apache.commons.collections4.iterators.SingletonIterator",
      "org.apache.commons.collections4.MapIterator",
      "org.apache.commons.collections4.iterators.IteratorChain",
      "org.apache.commons.collections4.functors.UniquePredicate",
      "org.apache.commons.collections4.functors.ComparatorPredicate$Criterion",
      "org.apache.commons.collections4.Predicate",
      "org.apache.commons.collections4.iterators.AbstractEmptyMapIterator",
      "org.apache.commons.collections4.iterators.ZippingIterator",
      "org.apache.commons.collections4.iterators.UnmodifiableListIterator",
      "org.apache.commons.collections4.Closure",
      "org.apache.commons.collections4.iterators.AbstractEmptyIterator",
      "org.apache.commons.collections4.iterators.BoundedIterator",
      "org.apache.commons.collections4.ClosureUtilsTest$MockTransformer",
      "org.apache.commons.collections4.CollectionUtils",
      "org.apache.commons.collections4.iterators.LoopingIterator",
      "org.apache.commons.collections4.iterators.EntrySetMapIterator",
      "org.apache.commons.collections4.iterators.IteratorEnumeration",
      "org.apache.commons.collections4.IterableUtils",
      "org.apache.commons.collections4.functors.NotNullPredicate",
      "org.apache.commons.collections4.iterators.ListIteratorWrapper",
      "org.apache.commons.collections4.functors.AbstractQuantifierPredicate",
      "org.apache.commons.collections4.functors.DefaultEquator",
      "org.apache.commons.collections4.FunctorException",
      "org.apache.commons.collections4.functors.StringValueTransformer",
      "org.apache.commons.collections4.iterators.IteratorIterable",
      "org.apache.commons.collections4.iterators.AbstractIteratorDecorator",
      "org.apache.commons.collections4.Unmodifiable",
      "org.apache.commons.collections4.iterators.ObjectGraphIterator",
      "org.apache.commons.collections4.iterators.ArrayListIterator",
      "org.apache.commons.collections4.functors.FunctorUtils",
      "org.apache.commons.collections4.iterators.AbstractMapIteratorDecorator",
      "org.apache.commons.collections4.FluentIterable",
      "org.apache.commons.collections4.iterators.ReverseListIterator",
      "org.apache.commons.collections4.ResettableIterator",
      "org.apache.commons.collections4.functors.AllPredicate",
      "org.apache.commons.collections4.comparators.ComparableComparator",
      "org.apache.commons.collections4.TransformerUtils",
      "org.apache.commons.collections4.iterators.EnumerationIterator",
      "org.apache.commons.collections4.ComparatorUtils",
      "org.apache.commons.collections4.ResettableListIterator",
      "org.apache.commons.collections4.OrderedIterator",
      "org.apache.commons.collections4.iterators.NodeListIterator",
      "org.apache.commons.collections4.iterators.AbstractUntypedIteratorDecorator"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(IteratorUtils_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "org.apache.commons.collections4.iterators.AbstractEmptyIterator",
      "org.apache.commons.collections4.iterators.EmptyIterator",
      "org.apache.commons.collections4.iterators.EmptyListIterator",
      "org.apache.commons.collections4.iterators.EmptyOrderedIterator",
      "org.apache.commons.collections4.iterators.AbstractEmptyMapIterator",
      "org.apache.commons.collections4.iterators.EmptyMapIterator",
      "org.apache.commons.collections4.iterators.EmptyOrderedMapIterator",
      "org.apache.commons.collections4.IteratorUtils",
      "org.apache.commons.collections4.comparators.ComparableComparator",
      "org.apache.commons.collections4.ComparatorUtils",
      "org.apache.commons.collections4.functors.NullPredicate",
      "org.apache.commons.collections4.functors.StringValueTransformer",
      "org.hsqldb.jdbc.JDBCDriver",
      "org.apache.commons.collections4.iterators.ArrayIterator",
      "org.apache.commons.collections4.iterators.ObjectArrayIterator",
      "org.apache.commons.collections4.iterators.ObjectArrayListIterator",
      "org.apache.commons.collections4.iterators.ArrayListIterator",
      "org.apache.commons.collections4.iterators.UnmodifiableMapIterator",
      "org.apache.commons.collections4.iterators.UnmodifiableOrderedMapIterator",
      "org.apache.commons.collections4.iterators.ObjectGraphIterator",
      "org.apache.commons.collections4.iterators.SingletonIterator",
      "org.apache.commons.collections4.functors.ComparatorPredicate",
      "org.apache.commons.collections4.iterators.FilterListIterator",
      "org.apache.commons.collections4.iterators.EntrySetMapIterator",
      "org.apache.commons.collections4.iterators.PeekingIterator",
      "org.apache.commons.collections4.TransformerUtils",
      "org.apache.commons.collections4.iterators.IteratorChain",
      "org.apache.commons.collections4.iterators.CollatingIterator",
      "org.apache.commons.collections4.iterators.IteratorEnumeration",
      "org.apache.commons.collections4.iterators.EnumerationIterator",
      "org.apache.commons.collections4.iterators.BoundedIterator",
      "org.apache.commons.collections4.iterators.PushbackIterator",
      "org.apache.commons.collections4.iterators.ReverseListIterator",
      "org.apache.commons.collections4.functors.EqualPredicate",
      "org.apache.commons.collections4.iterators.SingletonListIterator",
      "org.apache.commons.collections4.iterators.TransformIterator",
      "org.apache.commons.collections4.functors.AbstractQuantifierPredicate",
      "org.apache.commons.collections4.functors.AllPredicate",
      "org.apache.commons.collections4.functors.FunctorUtils",
      "org.apache.commons.collections4.functors.TruePredicate",
      "org.apache.commons.collections4.iterators.AbstractOrderedMapIteratorDecorator",
      "org.apache.commons.collections4.iterators.AbstractMapIteratorDecorator",
      "org.apache.commons.collections4.CollectionUtils",
      "org.apache.commons.collections4.iterators.AbstractUntypedIteratorDecorator",
      "org.apache.commons.collections4.iterators.AbstractIteratorDecorator",
      "org.apache.commons.collections4.iterators.SkippingIterator",
      "org.apache.commons.collections4.iterators.ListIteratorWrapper",
      "org.apache.commons.collections4.iterators.UnmodifiableListIterator",
      "org.apache.commons.collections4.iterators.LoopingIterator",
      "org.apache.commons.collections4.iterators.ZippingIterator",
      "org.apache.commons.collections4.FluentIterable",
      "org.apache.commons.collections4.IterableUtils$1",
      "org.apache.commons.collections4.IterableUtils",
      "org.apache.commons.collections4.IterableUtils$7",
      "org.apache.commons.collections4.iterators.LazyIteratorChain",
      "org.apache.commons.collections4.IterableUtils$7$1",
      "org.apache.commons.collections4.ClosureUtilsTest$MockClosure",
      "org.apache.commons.collections4.iterators.LoopingListIterator",
      "org.apache.commons.collections4.functors.TransformerPredicate",
      "org.apache.commons.collections4.iterators.FilterIterator",
      "org.apache.commons.collections4.FunctorException",
      "org.apache.commons.collections4.functors.InstanceofPredicate",
      "org.apache.commons.collections4.functors.NullIsExceptionPredicate",
      "org.apache.commons.collections4.iterators.NodeListIterator",
      "org.apache.commons.collections4.iterators.IteratorIterable",
      "org.apache.commons.collections4.iterators.IteratorIterable$1",
      "org.apache.commons.collections4.functors.DefaultEquator",
      "org.apache.commons.collections4.iterators.UnmodifiableIterator",
      "org.apache.commons.collections4.functors.OnePredicate",
      "org.apache.commons.collections4.functors.UniquePredicate",
      "org.apache.commons.collections4.map.EntrySetToMapIteratorAdapter",
      "org.apache.commons.collections4.functors.IdentityPredicate",
      "org.apache.commons.collections4.functors.NonePredicate",
      "org.apache.commons.collections4.functors.AndPredicate",
      "org.apache.commons.collections4.functors.NotNullPredicate",
      "org.apache.commons.collections4.functors.AnyPredicate",
      "org.apache.commons.collections4.functors.FalsePredicate",
      "org.apache.commons.collections4.functors.NullIsTruePredicate",
      "org.apache.commons.collections4.functors.NullIsFalsePredicate",
      "org.apache.commons.collections4.functors.OrPredicate",
      "org.apache.commons.collections4.ClosureUtilsTest$MockTransformer"
    );
  }
}
