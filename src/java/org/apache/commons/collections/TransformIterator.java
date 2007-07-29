/*
 * $Header: /home/jerenkrantz/tmp/commons/commons-convert/cvs/home/cvs/jakarta-commons//collections/src/java/org/apache/commons/collections/Attic/TransformIterator.java,v 1.3 2002/03/13 05:40:31 mas Exp $
 * $Revision: 1.3 $
 * $Date: 2002/03/13 05:40:31 $
 *
 * ====================================================================
 *
 * The Apache Software License, Version 1.1
 *
 * Copyright (c) 1999-2002 The Apache Software Foundation.  All rights
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

import java.util.Enumeration;
import java.util.Iterator;

/** A Proxy {@link Iterator Iterator} which uses a {@link Transformer Transformer} instance to 
  * transform the contents of the {@link Iterator Iterator} into some other form
  *
  * @author <a href="mailto:jstrachan@apache.org">James Strachan</a>
  */

public class TransformIterator extends ProxyIterator {
    
    /** Holds value of property transformer. */
    private Transformer transformer;
    
    
    public TransformIterator() {
    }
    
    public TransformIterator( Iterator iterator ) {
        super( iterator );
    }

    public TransformIterator( Iterator iterator, Transformer transformer ) {
        super( iterator );
        this.transformer = transformer;
    }

    // Iterator interface
    //-------------------------------------------------------------------------
    public Object next() {
        return transform( super.next() );
    }

    // Properties
    //-------------------------------------------------------------------------
    /** Getter for property transformer.
     * @return Value of property transformer.
     */
    public Transformer getTransformer() {
        return transformer;
    }
    /** Setter for property transformer.
     * @param transformer New value of property transformer.
     */
    public void setTransformer(Transformer transformer) {
        this.transformer = transformer;
    }
    
    // Implementation methods
    //-------------------------------------------------------------------------
    protected Object transform( Object source ) {
        Transformer transformer = getTransformer();
        if ( transformer != null ) {
            return transformer.transform( source );
        }
        return source;
    }
}