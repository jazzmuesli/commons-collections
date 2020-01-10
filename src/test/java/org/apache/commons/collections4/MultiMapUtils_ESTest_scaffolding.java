/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Wed Oct 16 05:51:24 GMT 2019
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
public class MultiMapUtils_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "org.apache.commons.collections4.MultiMapUtils"; 
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
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(MultiMapUtils_ESTest_scaffolding.class.getClassLoader() ,
      "org.apache.commons.collections4.keyvalue.AbstractMapEntry",
      "org.apache.commons.collections4.bag.PredicatedSortedBag",
      "org.apache.commons.collections4.IteratorUtils",
      "org.apache.commons.collections4.iterators.EmptyListIterator",
      "org.apache.commons.collections4.KeyValue",
      "org.apache.commons.collections4.bag.SynchronizedBag",
      "org.apache.commons.collections4.multimap.HashSetValuedHashMap",
      "org.apache.commons.collections4.multimap.AbstractMultiValuedMap$MultiValuedMapEntry",
      "org.apache.commons.collections4.multimap.AbstractMultiValuedMap",
      "org.apache.commons.collections4.bag.TransformedBag",
      "org.apache.commons.collections4.iterators.EmptyOrderedMapIterator",
      "org.apache.commons.collections4.bag.PredicatedBag",
      "org.apache.commons.collections4.iterators.LazyIteratorChain",
      "org.apache.commons.collections4.SetValuedMap",
      "org.apache.commons.collections4.multimap.AbstractListValuedMap",
      "org.apache.commons.collections4.collection.TransformedCollection",
      "org.apache.commons.collections4.MultiValuedMap",
      "org.apache.commons.collections4.Transformer",
      "org.apache.commons.collections4.bag.CollectionBag",
      "org.apache.commons.collections4.iterators.UnmodifiableIterator",
      "org.apache.commons.collections4.bag.UnmodifiableBag",
      "org.apache.commons.collections4.OrderedMapIterator",
      "org.apache.commons.collections4.iterators.EmptyIterator",
      "org.apache.commons.collections4.multimap.AbstractMultiValuedMap$WrappedCollection",
      "org.apache.commons.collections4.collection.AbstractCollectionDecorator",
      "org.apache.commons.collections4.collection.SynchronizedCollection",
      "org.apache.commons.collections4.multimap.AbstractSetValuedMap$WrappedSet",
      "org.apache.commons.collections4.multimap.TransformedMultiValuedMap",
      "org.apache.commons.collections4.bag.TreeBag",
      "org.apache.commons.collections4.iterators.EmptyMapIterator",
      "org.apache.commons.collections4.iterators.EmptyOrderedIterator",
      "org.apache.commons.collections4.bag.AbstractMapBag",
      "org.apache.commons.collections4.iterators.TransformIterator",
      "org.apache.commons.collections4.bag.TransformedSortedBag",
      "org.apache.commons.collections4.bag.HashBag",
      "org.apache.commons.collections4.MapIterator",
      "org.apache.commons.collections4.MultiMapUtils",
      "org.apache.commons.collections4.keyvalue.AbstractKeyValue",
      "org.apache.commons.collections4.multimap.AbstractMultiValuedMap$EntryValues",
      "org.apache.commons.collections4.Predicate",
      "org.apache.commons.collections4.bag.AbstractSortedBagDecorator",
      "org.apache.commons.collections4.bag.CollectionSortedBag",
      "org.apache.commons.collections4.iterators.AbstractEmptyMapIterator",
      "org.apache.commons.collections4.CollectionUtils",
      "org.apache.commons.collections4.iterators.AbstractEmptyIterator",
      "org.apache.commons.collections4.multimap.ArrayListValuedHashMap",
      "org.apache.commons.collections4.bag.SynchronizedSortedBag",
      "org.apache.commons.collections4.multimap.AbstractSetValuedMap",
      "org.apache.commons.collections4.ListValuedMap",
      "org.apache.commons.collections4.bag.UnmodifiableSortedBag",
      "org.apache.commons.collections4.multimap.UnmodifiableMultiValuedMap",
      "org.apache.commons.collections4.Unmodifiable",
      "org.apache.commons.collections4.SortedBag",
      "org.apache.commons.collections4.collection.PredicatedCollection",
      "org.apache.commons.collections4.collection.UnmodifiableCollection",
      "org.apache.commons.collections4.ResettableIterator",
      "org.apache.commons.collections4.multimap.AbstractListValuedMap$ValuesListIterator",
      "org.apache.commons.collections4.multimap.AbstractListValuedMap$WrappedList",
      "org.apache.commons.collections4.multimap.AbstractMultiValuedMapDecorator",
      "org.apache.commons.collections4.ResettableListIterator",
      "org.apache.commons.collections4.Bag",
      "org.apache.commons.collections4.OrderedIterator",
      "org.apache.commons.collections4.multimap.AbstractMultiValuedMap$ValuesIterator",
      "org.apache.commons.collections4.MultiSet",
      "org.apache.commons.collections4.bag.AbstractBagDecorator",
      "org.apache.commons.collections4.multimap.AbstractMultiValuedMap$EntryValues$1"
    );
  } 
  private static void initMocksToAvoidTimeoutsInTheTests() throws ClassNotFoundException { 
    mock(Class.forName("org.apache.commons.collections4.Transformer", false, MultiMapUtils_ESTest_scaffolding.class.getClassLoader()));
  }

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(MultiMapUtils_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "org.apache.commons.collections4.multimap.AbstractMultiValuedMap",
      "org.apache.commons.collections4.multimap.AbstractListValuedMap",
      "org.apache.commons.collections4.multimap.ArrayListValuedHashMap",
      "org.apache.commons.collections4.multimap.AbstractMultiValuedMapDecorator",
      "org.apache.commons.collections4.multimap.UnmodifiableMultiValuedMap",
      "org.apache.commons.collections4.MultiMapUtils",
      "org.apache.commons.collections4.multimap.AbstractSetValuedMap",
      "org.apache.commons.collections4.multimap.HashSetValuedHashMap",
      "org.apache.commons.collections4.iterators.AbstractEmptyIterator",
      "org.apache.commons.collections4.iterators.AbstractEmptyMapIterator",
      "org.apache.commons.collections4.iterators.EmptyMapIterator",
      "org.apache.commons.collections4.multimap.TransformedMultiValuedMap",
      "org.apache.commons.collections4.multiset.AbstractMultiSet",
      "org.apache.commons.collections4.multimap.AbstractMultiValuedMap$KeysMultiSet",
      "org.apache.commons.collections4.collection.AbstractCollectionDecorator",
      "org.apache.commons.collections4.multiset.AbstractMultiSetDecorator",
      "org.apache.commons.collections4.multiset.UnmodifiableMultiSet",
      "org.apache.commons.collections4.bag.AbstractMapBag",
      "org.apache.commons.collections4.bag.HashBag",
      "org.apache.commons.collections4.bag.AbstractMapBag$MutableInteger",
      "org.apache.commons.collections4.multimap.AbstractMultiValuedMap$WrappedCollection",
      "org.apache.commons.collections4.multimap.AbstractSetValuedMap$WrappedSet",
      "org.apache.commons.collections4.CollectionUtils",
      "org.apache.commons.collections4.multimap.AbstractListValuedMap$WrappedList",
      "org.apache.commons.collections4.collection.UnmodifiableCollection",
      "org.apache.commons.collections4.multimap.AbstractMultiValuedMap$EntryValues",
      "org.apache.commons.collections4.iterators.LazyIteratorChain",
      "org.apache.commons.collections4.multimap.AbstractMultiValuedMap$EntryValues$1",
      "org.apache.commons.collections4.iterators.EmptyIterator",
      "org.apache.commons.collections4.iterators.EmptyListIterator",
      "org.apache.commons.collections4.iterators.EmptyOrderedIterator",
      "org.apache.commons.collections4.iterators.EmptyOrderedMapIterator",
      "org.apache.commons.collections4.IteratorUtils",
      "org.apache.commons.collections4.iterators.UnmodifiableIterator",
      "org.apache.commons.collections4.bag.TreeBag",
      "org.apache.commons.collections4.collection.TransformedCollection",
      "org.apache.commons.collections4.bag.TransformedBag",
      "org.apache.commons.collections4.bag.TransformedSortedBag",
      "org.apache.commons.collections4.multimap.AbstractMultiValuedMap$Values",
      "org.apache.commons.collections4.collection.SynchronizedCollection",
      "org.apache.commons.collections4.bag.SynchronizedBag",
      "org.apache.commons.collections4.bag.SynchronizedSortedBag",
      "org.apache.commons.collections4.set.AbstractSetDecorator",
      "org.apache.commons.collections4.set.AbstractSerializableSetDecorator",
      "org.apache.commons.collections4.set.UnmodifiableSet",
      "org.apache.commons.collections4.bag.AbstractBagDecorator",
      "org.apache.commons.collections4.bag.AbstractSortedBagDecorator",
      "org.apache.commons.collections4.bag.UnmodifiableSortedBag",
      "org.apache.commons.collections4.bag.CollectionSortedBag",
      "org.apache.commons.collections4.functors.IdentityPredicate",
      "org.apache.commons.collections4.functors.NullPredicate",
      "org.apache.commons.collections4.collection.PredicatedCollection",
      "org.apache.commons.collections4.bag.PredicatedBag",
      "org.apache.commons.collections4.bag.PredicatedSortedBag",
      "org.apache.commons.collections4.iterators.IteratorChain",
      "org.apache.commons.collections4.functors.InstanceofPredicate",
      "org.apache.commons.collections4.functors.NullIsExceptionPredicate",
      "org.apache.commons.collections4.functors.NotPredicate",
      "org.apache.commons.collections4.functors.NullIsFalsePredicate",
      "org.apache.commons.collections4.functors.AbstractQuantifierPredicate",
      "org.apache.commons.collections4.functors.OnePredicate",
      "org.apache.commons.collections4.bag.CollectionBag",
      "org.apache.commons.collections4.bag.AbstractMapBag$BagIterator",
      "org.apache.commons.collections4.multimap.AbstractMultiValuedMap$AsMap",
      "org.apache.commons.collections4.set.AbstractSortedSetDecorator",
      "org.apache.commons.collections4.set.UnmodifiableSortedSet",
      "org.apache.commons.collections4.SetUtils",
      "org.apache.commons.collections4.bag.SynchronizedBag$SynchronizedBagSet",
      "org.apache.commons.collections4.ClosureUtilsTest$MockTransformer",
      "org.apache.commons.collections4.functors.FunctorUtils",
      "org.apache.commons.collections4.functors.DefaultEquator",
      "org.apache.commons.collections4.functors.EqualPredicate",
      "org.apache.commons.collections4.functors.OrPredicate",
      "org.apache.commons.collections4.functors.FalsePredicate",
      "org.apache.commons.collections4.functors.UniquePredicate",
      "org.apache.commons.collections4.functors.NullIsTruePredicate",
      "org.apache.commons.collections4.functors.NotNullPredicate",
      "org.apache.commons.collections4.functors.ComparatorPredicate",
      "org.apache.commons.collections4.ListUtils",
      "org.apache.commons.collections4.functors.AllPredicate",
      "org.apache.commons.collections4.functors.TruePredicate",
      "org.apache.commons.collections4.functors.AndPredicate",
      "org.apache.commons.collections4.functors.AnyPredicate",
      "org.apache.commons.collections4.iterators.TransformIterator",
      "org.apache.commons.collections4.multimap.AbstractMultiValuedMap$ValuesIterator",
      "org.apache.commons.collections4.keyvalue.AbstractKeyValue",
      "org.apache.commons.collections4.keyvalue.AbstractMapEntry",
      "org.apache.commons.collections4.multimap.AbstractMultiValuedMap$MultiValuedMapEntry",
      "org.apache.commons.collections4.functors.TransformerPredicate",
      "org.apache.commons.collections4.functors.NonePredicate",
      "org.apache.commons.collections4.bag.UnmodifiableBag",
      "org.apache.commons.collections4.functors.ExceptionPredicate",
      "org.apache.commons.collections4.FunctorException",
      "org.apache.commons.collections4.functors.TransformedPredicate",
      "org.apache.commons.collections4.multiset.AbstractMultiSet$MultiSetIterator",
      "org.apache.commons.collections4.multiset.AbstractMultiSet$EntrySet",
      "org.apache.commons.collections4.multimap.AbstractMultiValuedMap$KeysMultiSet$MapEntryTransformer",
      "org.apache.commons.collections4.iterators.UnmodifiableMapIterator"
    );
  }
}