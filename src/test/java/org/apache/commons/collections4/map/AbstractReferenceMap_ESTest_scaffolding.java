/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Wed Oct 16 05:38:32 GMT 2019
 */

package org.apache.commons.collections4.map;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

import static org.evosuite.shaded.org.mockito.Mockito.*;
@EvoSuiteClassExclude
public class AbstractReferenceMap_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "org.apache.commons.collections4.map.AbstractReferenceMap"; 
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
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(AbstractReferenceMap_ESTest_scaffolding.class.getClassLoader() ,
      "org.apache.commons.collections4.MapIterator",
      "org.apache.commons.collections4.map.AbstractReferenceMap$SoftRef",
      "org.apache.commons.collections4.keyvalue.AbstractMapEntry",
      "org.apache.commons.collections4.keyvalue.AbstractKeyValue",
      "org.apache.commons.collections4.map.AbstractReferenceMap$ReferenceMapIterator",
      "org.apache.commons.collections4.KeyValue",
      "org.apache.commons.collections4.map.AbstractHashedMap$EntrySet",
      "org.apache.commons.collections4.Get",
      "org.apache.commons.collections4.map.ReferenceMap",
      "org.apache.commons.collections4.map.AbstractReferenceMap$ReferenceKeySetIterator",
      "org.apache.commons.collections4.map.AbstractReferenceMap$ReferenceKeySet",
      "org.apache.commons.collections4.map.AbstractHashedMap$Values",
      "org.apache.commons.collections4.map.AbstractReferenceMap$WeakRef",
      "org.apache.commons.collections4.map.AbstractHashedMap$ValuesIterator",
      "org.apache.commons.collections4.keyvalue.DefaultMapEntry",
      "org.apache.commons.collections4.map.AbstractReferenceMap",
      "org.apache.commons.collections4.map.AbstractReferenceMap$ReferenceEntrySetIterator",
      "org.apache.commons.collections4.map.ReferenceIdentityMap",
      "org.apache.commons.collections4.map.AbstractHashedMap",
      "org.apache.commons.collections4.map.AbstractHashedMap$KeySetIterator",
      "org.apache.commons.collections4.map.AbstractReferenceMap$ReferenceEntrySet",
      "org.apache.commons.collections4.map.AbstractReferenceMap$ReferenceEntry",
      "org.apache.commons.collections4.Put",
      "org.apache.commons.collections4.map.AbstractReferenceMap$ReferenceStrength",
      "org.apache.commons.collections4.map.AbstractHashedMap$HashIterator",
      "org.apache.commons.collections4.IterableMap",
      "org.apache.commons.collections4.map.AbstractHashedMap$EntrySetIterator",
      "org.apache.commons.collections4.map.AbstractReferenceMap$ReferenceValues",
      "org.apache.commons.collections4.map.AbstractHashedMap$HashEntry",
      "org.apache.commons.collections4.map.AbstractHashedMap$KeySet",
      "org.apache.commons.collections4.IterableGet",
      "org.apache.commons.collections4.map.AbstractReferenceMap$ReferenceValuesIterator",
      "org.apache.commons.collections4.map.AbstractReferenceMap$ReferenceBaseIterator"
    );
  } 
  private static void initMocksToAvoidTimeoutsInTheTests() throws ClassNotFoundException { 
    mock(Class.forName("java.lang.ref.PhantomReference", false, AbstractReferenceMap_ESTest_scaffolding.class.getClassLoader()));
  }

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(AbstractReferenceMap_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "org.apache.commons.collections4.map.AbstractHashedMap",
      "org.apache.commons.collections4.map.AbstractReferenceMap",
      "org.apache.commons.collections4.map.AbstractHashedMap$HashEntry",
      "org.apache.commons.collections4.map.AbstractReferenceMap$ReferenceEntry",
      "org.apache.commons.collections4.map.AbstractReferenceMap$ReferenceBaseIterator",
      "org.apache.commons.collections4.map.AbstractReferenceMap$ReferenceMapIterator",
      "org.apache.commons.collections4.map.AbstractHashedMap$EntrySet",
      "org.apache.commons.collections4.map.AbstractReferenceMap$ReferenceEntrySet",
      "org.apache.commons.collections4.map.AbstractHashedMap$KeySet",
      "org.apache.commons.collections4.map.AbstractReferenceMap$ReferenceKeySet",
      "org.apache.commons.collections4.map.AbstractHashedMap$Values",
      "org.apache.commons.collections4.map.AbstractReferenceMap$ReferenceValues",
      "org.apache.commons.collections4.map.AbstractReferenceMap$SoftRef",
      "org.apache.commons.collections4.map.AbstractReferenceMap$WeakRef",
      "org.apache.commons.collections4.map.AbstractReferenceMap$ReferenceEntrySetIterator",
      "org.apache.commons.collections4.map.AbstractReferenceMap$ReferenceKeySetIterator",
      "org.apache.commons.collections4.map.AbstractReferenceMap$ReferenceValuesIterator",
      "org.apache.commons.collections4.map.AbstractReferenceMap$ReferenceStrength",
      "org.apache.commons.collections4.map.ReferenceMap",
      "org.apache.commons.collections4.map.ReferenceIdentityMap",
      "org.apache.commons.collections4.iterators.AbstractEmptyIterator",
      "org.apache.commons.collections4.iterators.AbstractEmptyMapIterator",
      "org.apache.commons.collections4.iterators.EmptyMapIterator",
      "org.apache.commons.collections4.iterators.EmptyIterator",
      "org.apache.commons.collections4.keyvalue.AbstractKeyValue",
      "org.apache.commons.collections4.keyvalue.AbstractMapEntry",
      "org.apache.commons.collections4.keyvalue.DefaultMapEntry"
    );
  }
}
