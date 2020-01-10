/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Wed Oct 16 06:17:24 GMT 2019
 */

package org.apache.commons.collections4.multimap;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

import static org.evosuite.shaded.org.mockito.Mockito.*;
@EvoSuiteClassExclude
public class ArrayListValuedHashMap_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "org.apache.commons.collections4.multimap.ArrayListValuedHashMap"; 
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
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(ArrayListValuedHashMap_ESTest_scaffolding.class.getClassLoader() ,
      "org.apache.commons.collections4.MapIterator",
      "org.apache.commons.collections4.iterators.IteratorChain",
      "org.apache.commons.collections4.multimap.AbstractMultiValuedMap$EntryValues",
      "org.apache.commons.collections4.sequence.CommandVisitor",
      "org.apache.commons.collections4.multiset.AbstractMultiSet$EntrySet",
      "org.apache.commons.collections4.IteratorUtils",
      "org.apache.commons.collections4.iterators.EmptyListIterator",
      "org.apache.commons.collections4.multimap.AbstractMultiValuedMap$Values",
      "org.apache.commons.collections4.multimap.AbstractMultiValuedMap$AsMap$AsMapEntrySetIterator",
      "org.apache.commons.collections4.multimap.AbstractMultiValuedMap$KeysMultiSet",
      "org.apache.commons.collections4.iterators.AbstractEmptyMapIterator",
      "org.apache.commons.collections4.Equator",
      "org.apache.commons.collections4.iterators.AbstractEmptyIterator",
      "org.apache.commons.collections4.multiset.AbstractMultiSetDecorator",
      "org.apache.commons.collections4.multimap.AbstractMultiValuedMap",
      "org.apache.commons.collections4.multimap.ArrayListValuedHashMap",
      "org.apache.commons.collections4.MultiSet$Entry",
      "org.apache.commons.collections4.iterators.EmptyOrderedMapIterator",
      "org.apache.commons.collections4.multimap.AbstractMultiValuedMap$AsMap",
      "org.apache.commons.collections4.ListValuedMap",
      "org.apache.commons.collections4.ListUtils",
      "org.apache.commons.collections4.iterators.LazyIteratorChain",
      "org.apache.commons.collections4.Unmodifiable",
      "org.apache.commons.collections4.iterators.AbstractIteratorDecorator",
      "org.apache.commons.collections4.multimap.AbstractListValuedMap",
      "org.apache.commons.collections4.MultiValuedMap",
      "org.apache.commons.collections4.Transformer",
      "org.apache.commons.collections4.multimap.AbstractMultiValuedMap$KeysMultiSet$MapEntryTransformer",
      "org.apache.commons.collections4.multiset.UnmodifiableMultiSet",
      "org.apache.commons.collections4.ResettableIterator",
      "org.apache.commons.collections4.OrderedMapIterator",
      "org.apache.commons.collections4.iterators.EmptyIterator",
      "org.apache.commons.collections4.multimap.AbstractListValuedMap$ValuesListIterator",
      "org.apache.commons.collections4.multimap.AbstractMultiValuedMap$WrappedCollection",
      "org.apache.commons.collections4.collection.AbstractCollectionDecorator",
      "org.apache.commons.collections4.multimap.AbstractMultiValuedMap$AsMap$AsMapEntrySet",
      "org.apache.commons.collections4.multimap.AbstractListValuedMap$WrappedList",
      "org.apache.commons.collections4.iterators.EmptyMapIterator",
      "org.apache.commons.collections4.iterators.EmptyOrderedIterator",
      "org.apache.commons.collections4.ResettableListIterator",
      "org.apache.commons.collections4.iterators.TransformIterator",
      "org.apache.commons.collections4.multiset.AbstractMultiSet",
      "org.apache.commons.collections4.OrderedIterator",
      "org.apache.commons.collections4.iterators.AbstractUntypedIteratorDecorator",
      "org.apache.commons.collections4.MultiSet",
      "org.apache.commons.collections4.multimap.AbstractMultiValuedMap$EntryValues$1"
    );
  } 
  private static void initMocksToAvoidTimeoutsInTheTests() throws ClassNotFoundException { 
    mock(Class.forName("java.io.ObjectOutputStream", false, ArrayListValuedHashMap_ESTest_scaffolding.class.getClassLoader()));
  }

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(ArrayListValuedHashMap_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "org.apache.commons.collections4.multimap.AbstractMultiValuedMap",
      "org.apache.commons.collections4.multimap.AbstractListValuedMap",
      "org.apache.commons.collections4.multimap.ArrayListValuedHashMap",
      "org.apache.commons.collections4.multiset.AbstractMultiSet",
      "org.apache.commons.collections4.multimap.AbstractMultiValuedMap$KeysMultiSet",
      "org.apache.commons.collections4.collection.AbstractCollectionDecorator",
      "org.apache.commons.collections4.multiset.AbstractMultiSetDecorator",
      "org.apache.commons.collections4.multiset.UnmodifiableMultiSet",
      "org.apache.commons.collections4.multimap.AbstractMultiValuedMap$Values",
      "org.apache.commons.collections4.multimap.AbstractMultiValuedMap$EntryValues",
      "org.apache.commons.collections4.multimap.AbstractMultiValuedMap$WrappedCollection",
      "org.apache.commons.collections4.multimap.AbstractListValuedMap$WrappedList",
      "org.apache.commons.collections4.iterators.LazyIteratorChain",
      "org.apache.commons.collections4.multimap.AbstractMultiValuedMap$EntryValues$1",
      "org.apache.commons.collections4.iterators.AbstractEmptyIterator",
      "org.apache.commons.collections4.iterators.EmptyIterator",
      "org.apache.commons.collections4.multimap.AbstractMultiValuedMap$AsMap",
      "org.apache.commons.collections4.ListUtils",
      "org.apache.commons.collections4.iterators.IteratorChain",
      "org.apache.commons.collections4.iterators.AbstractEmptyMapIterator",
      "org.apache.commons.collections4.iterators.EmptyMapIterator",
      "org.apache.commons.collections4.multimap.AbstractMultiValuedMap$MultiValuedMapIterator",
      "org.apache.commons.collections4.iterators.TransformIterator",
      "org.apache.commons.collections4.multimap.AbstractMultiValuedMap$ValuesIterator",
      "org.apache.commons.collections4.keyvalue.AbstractKeyValue",
      "org.apache.commons.collections4.keyvalue.AbstractMapEntry",
      "org.apache.commons.collections4.multimap.AbstractMultiValuedMap$MultiValuedMapEntry",
      "org.apache.commons.collections4.multimap.AbstractMultiValuedMap$AsMap$AsMapEntrySet",
      "org.apache.commons.collections4.iterators.AbstractUntypedIteratorDecorator",
      "org.apache.commons.collections4.iterators.AbstractIteratorDecorator",
      "org.apache.commons.collections4.multimap.AbstractMultiValuedMap$AsMap$AsMapEntrySetIterator",
      "org.apache.commons.collections4.multiset.AbstractMultiSet$EntrySet",
      "org.apache.commons.collections4.multimap.AbstractMultiValuedMap$KeysMultiSet$MapEntryTransformer",
      "org.apache.commons.collections4.iterators.EmptyListIterator",
      "org.apache.commons.collections4.iterators.EmptyOrderedIterator",
      "org.apache.commons.collections4.iterators.EmptyOrderedMapIterator",
      "org.apache.commons.collections4.IteratorUtils",
      "org.apache.commons.collections4.multiset.AbstractMultiSet$AbstractEntry",
      "org.apache.commons.collections4.multimap.AbstractMultiValuedMap$KeysMultiSet$MapEntryTransformer$1",
      "org.apache.commons.collections4.multiset.AbstractMultiSet$MultiSetIterator"
    );
  }
}