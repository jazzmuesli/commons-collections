/*
 * $Header: /home/jerenkrantz/tmp/commons/commons-convert/cvs/home/cvs/jakarta-commons//collections/src/test/org/apache/commons/collections/Attic/TestList.java,v 1.2 2001/04/20 16:54:04 rwaldhoff Exp $
 * $Revision: 1.2 $
 * $Date: 2001/04/20 16:54:04 $
 *
 * ====================================================================
 *
 * The Apache Software License, Version 1.1
 *
 * Copyright (c) 1999-2001 The Apache Software Foundation.  All rights
 * reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions
 * are met:
 *
 * 1. Redistributions of source code must retain the above copyright
 *    notice, this list of conditions and the following disclaimer.
 *
 * 2. Redistributions in binary form must reproduce the above copyright
 *    notice, this list of conditions and the following disclaimer in
 *    the documentation and/or other materials provided with the
 *    distribution.
 *
 * 3. The end-user documentation included with the redistribution, if
 *    any, must include the following acknowlegement:
 *       "This product includes software developed by the
 *        Apache Software Foundation (http://www.apache.org/)."
 *    Alternately, this acknowlegement may appear in the software itself,
 *    if and wherever such third-party acknowlegements normally appear.
 *
 * 4. The names "The Jakarta Project", "Commons", and "Apache Software
 *    Foundation" must not be used to endorse or promote products derived
 *    from this software without prior written permission. For written
 *    permission, please contact apache@apache.org.
 *
 * 5. Products derived from this software may not be called "Apache"
 *    nor may "Apache" appear in their names without prior written
 *    permission of the Apache Group.
 *
 * THIS SOFTWARE IS PROVIDED ``AS IS'' AND ANY EXPRESSED OR IMPLIED
 * WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES
 * OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED.  IN NO EVENT SHALL THE APACHE SOFTWARE FOUNDATION OR
 * ITS CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL,
 * SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT
 * LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF
 * USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
 * ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY,
 * OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT
 * OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF
 * SUCH DAMAGE.
 * ====================================================================
 *
 * This software consists of voluntary contributions made by many
 * individuals on behalf of the Apache Software Foundation.  For more
 * information on the Apache Software Foundation, please see
 * <http://www.apache.org/>.
 *
 */

package org.apache.commons.collections;

import junit.framework.*;
import java.util.List;
import java.util.Collection;

/**
 * Tests base {@link java.util.List} methods and contracts.
 * <p>
 * To use, simply extend this class, and implement
 * the {@link #makeList} method.
 * <p>
 * If your {@link List} fails one of these tests by design,
 * you may still use this base set of cases.  Simply override the
 * test case (method) your {@link List} fails.
 *
 * @author Rodney Waldhoff
 * @version $Id: TestList.java,v 1.2 2001/04/20 16:54:04 rwaldhoff Exp $
 */
public abstract class TestList extends TestCollection {
    public TestList(String testName) {
        super(testName);
    }

    /**
     * Return a new, empty {@link List} to used for testing.
     */
    public abstract List makeList();

    public Collection makeCollection() {
        return makeList();
    }

    /*

    // optional operation
    public void testListAddByIndex() {
        // XXX finish me
    }

    // optional operation
    public void testListAdd() {
        // XXX finish me
    }

    // optional operation
    public void testListAddAll() {
        // XXX finish me
    }

    // optional operation
    public void testListClear() {
        // XXX finish me
    }

    public void testListContains() {
        // XXX finish me
        // is this any different from Collection.contains?
    }

    public void testListContainsAll() {
        // XXX finish me
        // is this any different from Collection.containsAll?
    }

    public void testListEquals() {
        // XXX finish me
    }

    public void testListGetByIndex() {
        // XXX finish me
    }

    public void testListHashCode() {
        // XXX finish me
    }

    public void testListIndexOf() {
        // XXX finish me
    }

    public void testListIsEmpty() {
        // XXX finish me
        // is this any different from Collection.isEmpty?
    }

    public void testListIterator() {
        // XXX finish me
        // is this any different from Collection.iterator?
    }

    public void testListLastIndexOf() {
        // XXX finish me
    }

    public void testListListIterator() {
        // XXX finish me
    }

    public void testListListIteratorByIndex() {
        // XXX finish me
    }

    // optional operation
    public void testListRemoveByIndex() {
        // XXX finish me
    }

    // optional operation
    public void testListRemoveByValue() {
        // XXX finish me
    }

    // optional operation
    public void testListRemoveAll() {
        // XXX finish me
        // is this any different from Collection.removeAll?
    }

    // optional operation
    public void testListRetainAll() {
        // XXX finish me
        // is this any different from Collection.retainAll?
    }

    // optional operation
    public void testListSet() {
        // XXX finish me
    }

    // size() same as Collection.size() ?

    public void testListSubList() {
        // XXX finish me
    }

    // toArray() same as Collection.toArray() ?
    // toArray(Object[]) same as Collection.toArray(Object[]) ?

    */
}
