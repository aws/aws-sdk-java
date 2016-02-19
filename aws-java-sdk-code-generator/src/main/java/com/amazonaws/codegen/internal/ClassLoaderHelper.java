/*
 * Copyright (c) 2016. Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 * http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.codegen.internal;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

public enum ClassLoaderHelper {
    ;
    /**
     * If classesFirst is false, retrieves the resource via the context class loader of the current
     * thread, and if not found, via the class loaders of the optionally specified classes in the
     * order of their specification, and if not found, from the class loader of
     * {@link ClassLoaderHelper} as the last resort.
     * <p>
     * If classesFirst is true, retrieves the resource via the optionally specified classes in the
     * order of their specification, and if not found, via the context class loader of the current
     * thread, and if not found, from the class loader of {@link ClassLoaderHelper} as the last
     * resort.
     *
     * @param resource
     *            resource to be loaded
     * @param classesFirst
     *            true if the class loaders of the optionally specified classes take precedence over
     *            the context class loader of the current thread; false if the opposite is true.
     * @param classes
     *            class loader providers
     * @return the resource loaded as an URL or null if not found.
     */
    public static URL getResource(String resource, boolean classesFirst,
                                  Class<?>... classes) {
        URL url;
        if (classesFirst) {
            url = getResourceViaClasses(resource, classes);
            if (url == null) {
                url = getResourceViaContext(resource);
            }
        } else {
            url = getResourceViaContext(resource);
            if (url == null) {
                url = getResourceViaClasses(resource, classes);
            }
        }
        return url == null ? ClassLoaderHelper.class.getResource(resource)
                : url;
    }

    private static URL getResourceViaClasses(String resource, Class<?>[] classes) {
        if (classes != null) {
            for (Class<?> c : classes) {
                URL url = c.getResource(resource);
                if (url != null)
                    return url;
            }
        }
        return null;
    }

    private static URL getResourceViaContext(String resource) {
        ClassLoader loader = Thread.currentThread().getContextClassLoader();
        return loader == null ? null : loader.getResource(resource);
    }

    /**
     * Retrieves the resource as an input stream via the context class loader of the current thread,
     * and if not found, via the class loaders of the optionally specified classes in the order of
     * their specification, and if not found, from the class loader of {@link ClassLoaderHelper} as
     * the last resort.
     *
     * @param resource
     *            resource to be loaded
     * @param classes
     *            class loader providers
     * @return the resource loaded as an input stream or null if not found.
     */
    public static InputStream getResourceAsStream(String resource,
                                                  Class<?>... classes) {
        return getResourceAsStream(resource, false, classes);
    }

    /**
     * If classesFirst is false, retrieves the resource as an input stream via the context class
     * loader of the current thread, and if not found, via the class loaders of the optionally
     * specified classes in the order of their specification, and if not found, from the class
     * loader of {@link ClassLoaderHelper} as the last resort.
     * <p>
     * If classesFirst is true, retrieves the resource as an input stream via the optionally
     * specified classes in the order of their specification, and if not found, via the context
     * class loader of the current thread, and if not found, from the class loader of
     * {@link ClassLoaderHelper} as the last resort.
     *
     * @param resource
     *            resource to be loaded
     * @param classesFirst
     *            true if the class loaders of the optionally specified classes take precedence over
     *            the context class loader of the current thread; false if the opposite is true.
     * @param classes
     *            class loader providers
     * @return the resource loaded as an input stream or null if not found.
     */
    public static InputStream getResourceAsStream(String resource,
                                                  boolean classesFirst, Class<?>... classes) {
        URL url = getResource(resource, classesFirst, classes);
        try {
            return url != null ? url.openStream() : null;
        } catch (IOException e) {
            return null;
        }
    }
}