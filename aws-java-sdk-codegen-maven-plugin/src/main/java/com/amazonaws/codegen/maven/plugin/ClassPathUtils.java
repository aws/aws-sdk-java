/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights
 * Reserved.
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
package com.amazonaws.codegen.maven.plugin;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import java.net.URL;
import java.net.URLClassLoader;

/**
 * The ClassPathUtils can add file to classpath at runtime.
 */
public class ClassPathUtils {
    private static final Class[] ADD_URL_PARAMETER_TYPES = new Class[] { URL.class };

    public static void addFile(String fileLocation) throws IOException {
        addFile(new File(fileLocation));
    }

    public static void addFile(File file) throws IOException {
        addURL(file.toURI().toURL());
    }

    public static void addURL(URL url) throws IOException {
        URLClassLoader urlClassLoader = (URLClassLoader) ClassLoader.getSystemClassLoader();
        Class urlClassLoaderClass = URLClassLoader.class;

        try {
            Method method = urlClassLoaderClass.getDeclaredMethod("addURL", ADD_URL_PARAMETER_TYPES);
            method.setAccessible(true);
            method.invoke(urlClassLoader, new Object[] { url });
        } catch (Throwable t) {
            t.printStackTrace();
            throw new IOException(
                    "Error, could not add URL to system classloader");
        }

    }
}
