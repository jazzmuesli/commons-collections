/*
 * This file was automatically generated by EvoSuite
 * Wed Oct 16 06:21:56 GMT 2019
 */

package org.apache.commons.collections4.trie;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.HashMap;
import org.apache.commons.collections4.trie.PatriciaTrie;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class PatriciaTrie_ESTest extends PatriciaTrie_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      PatriciaTrie<Integer> patriciaTrie0 = new PatriciaTrie<Integer>();
      patriciaTrie0.incrementSize();
      PatriciaTrie<Integer> patriciaTrie1 = null;
      try {
        patriciaTrie1 = new PatriciaTrie<Integer>(patriciaTrie0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.collections4.trie.AbstractPatriciaTrie", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      hashMap0.put((String) null, (String) null);
      PatriciaTrie<String> patriciaTrie0 = null;
      try {
        patriciaTrie0 = new PatriciaTrie<String>(hashMap0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // Key cannot be null
         //
         verifyException("org.apache.commons.collections4.trie.AbstractPatriciaTrie", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      PatriciaTrie<Integer> patriciaTrie0 = new PatriciaTrie<Integer>();
      PatriciaTrie<Integer> patriciaTrie1 = new PatriciaTrie<Integer>(patriciaTrie0);
      assertTrue(patriciaTrie1.equals((Object)patriciaTrie0));
  }
}