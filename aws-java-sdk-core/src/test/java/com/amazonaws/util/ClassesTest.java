/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights
 * Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is
 * distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either
 * express or implied. See the License for the specific language
 * governing
 * permissions and limitations under the License.
 */
package com.amazonaws.util;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;

import java.io.IOException;
import java.util.jar.Attributes;
import java.util.jar.JarFile;
import java.util.jar.Manifest;

import org.joda.time.DateTimeZone;
import org.junit.Test;

public class ClassesTest {
    private static final boolean VERBOSE = false;
    @Test
    public void basics() {
        // super class of ClassesTest is Object
        assertSame(getClass(), Classes.childClassOf(Object.class, this));
        // super class of Object is null
        assertSame(Object.class, Classes.childClassOf(null, this));
        // not reflexive
        assertNull(Classes.childClassOf(ClassesTest.class, this));
    }
    
    @Test
    public void jarFileOf() throws IOException {
        JarFile jf = Classes.jarFileOf(DateTimeZone.class);
        Manifest mf = jf.getManifest();
        Attributes attrs = mf.getMainAttributes();
        String name = attrs.getValue("Bundle-Name");
        String version = attrs.getValue("Bundle-Version");
        if (VERBOSE) {
            System.out.println(name);
            System.out.println(version);
        }
        assertNotNull(name);
        assertNotNull(version);
    }
}
