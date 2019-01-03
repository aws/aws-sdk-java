/*
 * Copyright 2011-2019 Amazon Technologies, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at:
 *
 *    http://aws.amazon.com/apache2.0
 *
 * This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES
 * OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and
 * limitations under the License.
 */
package com.amazonaws.util;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

public enum ClassLoaderHelper {
    ;
    /**
     * Retrieves the resource via the context class loader of the current
     * thread, and if not found, via the class loaders of the optionally
     * specified classes in the order of their specification, and if not
     * found, from the class loader of {@link ClassLoaderHelper} as the last
     * resort.
     * 
     * @param resource
     *            resource to be loaded
     * @param classes class loader providers
     * @return the resource loaded as an URL or null if not found.
     */
    public static URL getResource(String resource, Class<?> ... classes) {
        return getResource(resource, false, classes);
    }

    /**
     * If classesFirst is false, retrieves the resource via the context class
     * loader of the current thread, and if not found, via the class loaders of
     * the optionally specified classes in the order of their specification, and
     * if not found, from the class loader of {@link ClassLoaderHelper} as the
     * last resort.
     * <p>
     * If classesFirst is true, retrieves the resource via the optionally
     * specified classes in the order of their specification, and if not found,
     * via the context class loader of the current thread, and if not found,
     * from the class loader of {@link ClassLoaderHelper} as the last resort.
     * 
     * @param resource
     *            resource to be loaded
     * @param classesFirst
     *            true if the class loaders of the optionally specified classes
     *            take precedence over the context class loader of the current
     *            thread; false if the opposite is true.
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
        return url == null ? ClassLoaderHelper.class.getResource(resource) : url;
    }

    private static URL getResourceViaClasses(String resource, Class<?>[] classes) {
        if (classes != null) {
            for (Class<?> c: classes) {
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

    private static Class<?> loadClassViaClasses(String fqcn, Class<?>[] classes) {
        if (classes != null) {
            for (Class<?> c: classes) {
                ClassLoader loader = c.getClassLoader();
                if (loader != null) {
                    try {
                        return loader.loadClass(fqcn);
                    } catch (ClassNotFoundException e) {
                        // move on to try the next class loader
                    }
                }
            }
        }
        return null;
    }

    private static Class<?> loadClassViaContext(String fqcn) {
        ClassLoader loader = Thread.currentThread().getContextClassLoader();
        try {
            return loader == null ? null : loader.loadClass(fqcn);
        } catch (ClassNotFoundException e) {
        }
        return null;
    }

    /**
     * Loads the class via the optionally specified classes in the order of
     * their specification, and if not found, via the context class loader of
     * the current thread, and if not found, from the caller class loader as the
     * last resort.
     * 
     * @param fqcn
     *            fully qualified class name of the target class to be loaded
     * @param classes
     *            class loader providers
     * @return the class loaded; never null
     * 
     * @throws ClassNotFoundException
     *             if failed to load the class
     */
    public static Class<?> loadClass(String fqcn, Class<?>... classes)
            throws ClassNotFoundException {
        return loadClass(fqcn, true, classes);
    }

    /**
     * If classesFirst is false, loads the class via the context class
     * loader of the current thread, and if not found, via the class loaders of
     * the optionally specified classes in the order of their specification, and
     * if not found, from the caller class loader as the
     * last resort.
     * <p>
     * If classesFirst is true, loads the class via the optionally
     * specified classes in the order of their specification, and if not found,
     * via the context class loader of the current thread, and if not found,
     * from the caller class loader as the last resort.
     * 
     * @param fqcn
     *            fully qualified class name of the target class to be loaded
     * @param classesFirst
     *            true if the class loaders of the optionally specified classes
     *            take precedence over the context class loader of the current
     *            thread; false if the opposite is true.
     * @param classes
     *            class loader providers
     * @return the class loaded; never null
     * 
     * @throws ClassNotFoundException if failed to load the class
     */
    public static Class<?> loadClass(String fqcn, boolean classesFirst,
            Class<?>... classes) throws ClassNotFoundException {
        Class<?> target = null;
        if (classesFirst) {
            target = loadClassViaClasses(fqcn, classes);
            if (target == null) {
                target = loadClassViaContext(fqcn);
            }
        } else {
            target = loadClassViaContext(fqcn);
            if (target == null) {
                target = loadClassViaClasses(fqcn, classes);
            }
        }
        return target == null ? Class.forName(fqcn) : target;
    }

    /**
     * Retrieves the resource as an input stream via
     * the context class loader of the current thread, and if not found, via the
     * class loaders of the optionally specified classes in the order of their
     * specification, and if not found, from the class loader of
     * {@link ClassLoaderHelper} as the last resort.
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
     * If classesFirst is false, retrieves the resource as an input stream via
     * the context class loader of the current thread, and if not found, via the
     * class loaders of the optionally specified classes in the order of their
     * specification, and if not found, from the class loader of
     * {@link ClassLoaderHelper} as the last resort.
     * <p>
     * If classesFirst is true, retrieves the resource as an input stream via
     * the optionally specified classes in the order of their specification, and
     * if not found, via the context class loader of the current thread, and if
     * not found, from the class loader of {@link ClassLoaderHelper} as the last
     * resort.
     * 
     * @param resource
     *            resource to be loaded
     * @param classesFirst
     *            true if the class loaders of the optionally specified classes
     *            take precedence over the context class loader of the current
     *            thread; false if the opposite is true.
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
