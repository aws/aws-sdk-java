/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Portions copyright 2006-2009 James Murty. Please see LICENSE.txt
 * for applicable license terms and NOTICE.txt for applicable notices.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.util;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.jar.JarFile;

/**
 * Classes related utilities.
 */
public enum Classes {
    ;
    /**
     * Returns the class of the immediate subclass of the given parent class for
     * the given object instance; or null if such immediate subclass cannot be
     * uniquely identified for the given object instance.
     * 
     * @param parentClass
     *            the parent class. The child class is {@link Object} if and
     *            only if the parent class is null.
     * @param instance
     *            the given object instance
     */
    public static Class<?> childClassOf(Class<?> parentClass,
            Object instance) {
        if (instance == null || instance == Object.class)
            return null;
        if (parentClass != null) {
            if (parentClass.isInterface()) {
                // child of an interface class is not injective (ie one-to-one)
                return null;
            }
        }
        Class<?> childClass = instance.getClass();
        while (true) {
            Class<?> parent = childClass.getSuperclass();
            if (parent == parentClass)
                return childClass;
            if (parent == null)
                return null;
            childClass = parent;
        }
    }

    /**
     * Returns the jar file from which the given class is loaded; or null
     * if no such jar file can be located.
     */
    public static JarFile jarFileOf(Class<?> klass) {
        URL url = klass.getResource(
            "/" + klass.getName().replace('.', '/') + ".class");
        if (url == null)
            return null;
        String s = url.getFile();
        int beginIndex = s.indexOf("file:") + "file:".length();
        int endIndex = s.indexOf(".jar!");
        if (endIndex == -1)
            return null;
        endIndex += ".jar".length();
        String f = s.substring(beginIndex, endIndex);
        File file = new File(f);
        try {
            return file.exists() ? new JarFile(file) : null;
        } catch (IOException e) {
            throw new IllegalStateException(e);
        }
    }
}
