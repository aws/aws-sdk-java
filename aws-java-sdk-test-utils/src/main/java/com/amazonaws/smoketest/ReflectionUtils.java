/*
 * Copyright 2011-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.smoketest;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.UUID;

import org.apache.commons.logging.LogFactory;

/**
 * Utility methods for doing reflection.
 */
public final class ReflectionUtils {

    private static final Random RANDOM = new Random();

    public static <T> Class<T> loadClass(Class<?> base, String name) {
        return loadClass(base.getClassLoader(), name);
    }

    public static <T> Class<T> loadClass(ClassLoader classloader, String name) {
        try {
            @SuppressWarnings("unchecked")
            Class<T> loaded = (Class<T>)classloader.loadClass(name);
            return loaded;
        } catch (ClassNotFoundException exception) {
            throw new IllegalStateException(
                    "Cannot find class " + name,
                    exception);
        }
    }

    public static <T> T newInstance(Class<T> clazz, Object... params) {
        Constructor<T> constructor = findConstructor(clazz, params);

        try {

            return constructor.newInstance(params);

        } catch (InstantiationException ex) {
            throw new IllegalStateException(
                    "Could not invoke " + constructor.toGenericString(),
                    ex);

        } catch (IllegalAccessException ex) {
            throw new IllegalStateException(
                    "Could not invoke " + constructor.toGenericString(),
                    ex);

        } catch (InvocationTargetException ex) {
            if (ex.getCause() instanceof RuntimeException) {
                throw (RuntimeException) ex.getCause();
            }
            throw new IllegalStateException(
                    "Unexpected checked exception thrown from "
                    + constructor.toGenericString(),
                    ex);
        }
    }

    private static <T> Constructor<T> findConstructor(
            Class<T> clazz,
            Object[] params) {

        for (Constructor<?> constructor : clazz.getConstructors()) {
            Class<?>[] paramTypes = constructor.getParameterTypes();
            if (matches(paramTypes, params)) {
                @SuppressWarnings("unchecked")
                Constructor<T> rval = (Constructor<T>) constructor;
                return rval;
            }
        }

        throw new IllegalStateException(
                "No appropriate constructor found for "
                + clazz.getCanonicalName());
    }

    private static boolean matches(Class<?>[] paramTypes, Object[] params) {
        if (paramTypes.length != params.length) {
            return false;
        }

        for (int i = 0; i < params.length; ++i) {
            if (!paramTypes[i].isAssignableFrom(params[i].getClass())) {
                return false;
            }
        }

        return true;
    }

    /**
     * Evaluates the given path expression on the given object and returns the
     * object found.
     *
     * @param target the object to reflect on
     * @param path the path to evaluate
     * @return the result of evaluating the path against the given object
     */
    public static Object getByPath(Object target, List<String> path) {
        Object obj = target;

        for (String field : path) {
            if (obj == null) {
                return null;
            }
            obj = evaluate(obj, trimType(field));
        }

        return obj;
    }

    /**
     * Evaluates the given path expression and returns the list of all matching
     * objects. If the path expression does not contain any wildcards, this
     * will return a list of at most one item. If the path contains one or more
     * wildcards, the returned list will include the full set of values
     * obtained by evaluating the expression with all legal value for the
     * given wildcard.
     *
     * @param target the object to evaluate the expression against
     * @param path the path expression to evaluate
     * @return the list of matching values
     */
    public static List<Object> getAllByPath(Object target, List<String> path) {
        List<Object> results = new LinkedList<Object>();

        // TODO: Can we unroll this and do it iteratively?
        getAllByPath(target, path, 0, results);

        return results;
    }

    private static void getAllByPath(
            Object target,
            List<String> path,
            int depth,
            List<Object> results) {

        if (target == null) {
            return;
        }

        if (depth == path.size()) {
            results.add(target);
            return;
        }

        String field = trimType(path.get(depth));

        if (field.equals("*")) {

            if (!(target instanceof Iterable)) {
                throw new IllegalStateException(
                        "Cannot evaluate '*' on object " + target);
            }

            Iterable<?> collection = (Iterable<?>) target;
            for (Object obj : collection) {
                getAllByPath(obj, path, depth + 1, results);
            }

        } else {
            Object obj = evaluate(target, field);
            getAllByPath(obj, path, depth + 1, results);
        }
    }

    private static String trimType(String field) {
        int index = field.indexOf(':');
        if (index == -1) {
            return field;
        }
        return field.substring(0, index);
    }

    /**
     * Uses reflection to evaluate a single element of a path expression on
     * the given object. If the object is a list and the expression is a
     * number, this returns the expression'th element of the list. Otherwise,
     * this looks for a method named "get${expression}" and returns the result
     * of calling it.
     *
     * @param target the object to evaluate the expression against
     * @param expression the expression to evaluate
     * @return the result of evaluating the expression
     */
    private static Object evaluate(Object target, String expression) {
        try {
            if (target instanceof List) {

                List<?> list = (List<?>) target;

                int index = Integer.parseInt(expression);
                if (index < 0) {
                    index += list.size();
                }

                return list.get(index);

            } else {

                Method getter = findAccessor(target, expression);
                if (getter == null) {
                    return null;
                }

                return getter.invoke(target);

            }
        } catch (IllegalAccessException exception) {
            throw new IllegalStateException("BOOM", exception);

        } catch (InvocationTargetException exception) {
            if (exception.getCause() instanceof RuntimeException) {
                throw (RuntimeException) exception.getCause();
            }
            throw new RuntimeException("BOOM", exception);
        }
    }

    /**
     * Sets the value of the attribute at the given path in the target object,
     * creating any intermediate values (using the default constructor for the
     * type) if need be.
     *
     * @param target the object to modify
     * @param value the value to add
     * @param path the path into the target object at which to add the value
     */
    public static void setByPath(
            Object target,
            Object value,
            List<String> path) {

        Object obj = target;
        Iterator<String> iter = path.iterator();

        while (iter.hasNext()) {

            String field = iter.next();
            if (iter.hasNext()) {
                obj = digIn(obj, field);
            } else {
                setValue(obj, trimType(field), value);
            }

        }
    }

    /**
     * Uses reflection to dig into a chain of objects in preparation for
     * setting a value somewhere within the tree. Gets the value of the given
     * property of the target object and, if it is null, creates a new instance
     * of the appropriate type and sets it on the target object. Returns the
     * gotten or created value.
     *
     * @param target the target object to reflect on
     * @param field the field to dig into
     * @return the gotten or created value
     */
    private static Object digIn(Object target, String field) {
        if (target instanceof List) {

            // The 'field' will tell us what type of objects belong in the list.
            @SuppressWarnings("unchecked")
            List<Object> list = (List<Object>) target;
            return digInList(list, field);

        } else if (target instanceof Map) {

            // The 'field' will tell us what type of objects belong in the map.
            @SuppressWarnings("unchecked")
            Map<String, Object> map = (Map<String, Object>) target;
            return digInMap(map, field);

        } else {
            return digInObject(target, field);
        }
    }

    private static Object digInList(List<Object> target, String field) {
        int index = field.indexOf(':');
        if (index == -1) {
            throw new IllegalStateException("Invalid path expression: cannot "
                    + "evaluate '" + field + "' on a List");
        }

        String offset = field.substring(0, index);
        String type = field.substring(index + 1);

        if (offset.equals("*")) {
            throw new UnsupportedOperationException(
                    "What does this even mean?");
        }

        int intOffset = Integer.parseInt(offset);
        if (intOffset < 0) {
            // Offset from the end of the list
            intOffset += target.size();
            if (intOffset < 0) {
                throw new IndexOutOfBoundsException(
                        Integer.toString(intOffset));
            }
        }

        if (intOffset < target.size()) {
            return target.get(intOffset);
        }

        // Extend with default instances if need be.
        while (intOffset > target.size()) {
            target.add(createDefaultInstance(type));
        }

        Object result = createDefaultInstance(type);
        target.add(result);

        return result;
    }

    private static Object digInMap(Map<String, Object> target, String field) {
        int index = field.indexOf(':');
        if (index == -1) {
            throw new IllegalStateException("Invalid path expression: cannot "
                    + "evaluate '" + field + "' on a List");
        }

        String member = field.substring(0, index);
        String type = field.substring(index + 1);

        Object result = target.get(member);
        if (result != null) {
            return result;
        }

        result = createDefaultInstance(type);
        target.put(member, result);

        return result;
    }

    public static Object createDefaultInstance(String type) {
        try {

            return ReflectionUtils.class.getClassLoader()
                .loadClass(type)
                .newInstance();

        } catch (Exception e) {
            throw new IllegalStateException("BOOM", e);
        }
    }

    private static Object digInObject(Object target, String field) {
        Method getter = findAccessor(target, field);
        if (getter == null) {
            throw new IllegalStateException(
                    "No accessor found for '"
                    + field + "' found in class "
                    + target.getClass().getName());
        }

        try {

            Object obj = getter.invoke(target);
            if (obj == null) {
                obj = getter.getReturnType().newInstance();
                Method setter =
                        findMethod(target, "set" + field, obj.getClass());
                setter.invoke(target, obj);
            }

            return obj;

        } catch (InstantiationException exception) {
            throw new IllegalStateException(
                    "Unable to create a new instance",
                    exception);

        } catch (IllegalAccessException exception) {
            throw new IllegalStateException(
                    "Unable to access getter, setter, or constructor",
                    exception);

        } catch (InvocationTargetException exception) {
            if (exception.getCause() instanceof RuntimeException) {
                throw (RuntimeException) exception.getCause();
            }
            throw new IllegalStateException(
                    "Checked exception thrown from getter or setter method",
                    exception);
        }
    }

    /**
     * Uses reflection to set the value of the given property on the target
     * object.
     *
     * @param target the object to reflect on
     * @param field the name of the property to set
     * @param value the new value of the property
     */
    private static void setValue(Object target, String field, Object value) {
        // TODO: Should we do this for all numbers, not just '0'?
        if ("0".equals(field)) {

            if (!(target instanceof Collection)) {
                throw new IllegalArgumentException(
                        "Cannot evaluate '0' on object " + target);
            }

            @SuppressWarnings("unchecked")
            Collection<Object> collection = (Collection<Object>) target;
            collection.add(value);

        } else {

            Method setter = findMethod(target, "set" + field, value.getClass());

            try {
                setter.invoke(target, value);

            } catch (IllegalAccessException exception) {
                throw new IllegalStateException(
                        "Unable to access setter method",
                        exception);

            } catch(InvocationTargetException exception) {
                if (exception.getCause() instanceof RuntimeException) {
                    throw (RuntimeException) exception.getCause();
                }
                throw new IllegalStateException(
                        "Checked exception thrown from setter method",
                        exception);
            }
        }
    }

    /**
     * Returns the accessor method for the specified member property.
     * For example, if the member property is "Foo", this method looks
     * for a "getFoo()" method and an "isFoo()" method.
     *
     * If no accessor is found, this method throws an IllegalStateException.
     *
     * @param target the object to reflect on
     * @param propertyName the name of the property to search for
     * @return the accessor method
     * @throws IllegalStateException if no matching method is found
     */
    public static Method findAccessor(Object target, String propertyName) {

        propertyName = propertyName.substring(0, 1).toUpperCase()
                     + propertyName.substring(1);

        try {
            return target.getClass().getMethod("get" + propertyName);
        } catch (NoSuchMethodException nsme) {
        }

        try {
            return target.getClass().getMethod("is" + propertyName);
        } catch (NoSuchMethodException nsme) {
        }

        LogFactory.getLog(ReflectionUtils.class).warn(
                "No accessor for property '"
                + propertyName + "' " + "found in class "
                + target.getClass().getName());

        return null;
    }

    /**
     * Finds a method of the given name that will accept a parameter of the
     * given type. If more than one method matches, returns the first such
     * method found.
     *
     * @param target the object to reflect on
     * @param name the name of the method to search for
     * @param parameterType the type of the parameter to be passed
     * @return the matching method
     * @throws IllegalStateException if no matching method is found
     */
    public static Method findMethod(
            Object target,
            String name,
            Class<?> parameterType) {

        for (Method method : target.getClass().getMethods()) {
            if (!method.getName().equals(name)) {
                continue;
            }

            Class<?>[] parameters = method.getParameterTypes();
            if (parameters.length != 1) {
                continue;
            }

            if (parameters[0].isAssignableFrom(parameterType)) {
                return method;
            }
        }

        throw new IllegalStateException(
                "No method '" + name + "(" + parameterType + ") on type "
                + target.getClass());
    }

    public static Class<?> getParameterTypes(Object target, List<String> path) {

        Object obj = target;
        Iterator<String> iter = path.iterator();

        while (iter.hasNext()) {

            String field = iter.next();
            if (iter.hasNext()) {
                obj = digIn(obj, field);
            } else {
                return findAccessor(obj, field).getReturnType();
            }
        }
        return null;
    }

    public static void setField(Object instance, Field field, Object arg) {
        try {
            field.set(instance, arg);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }

    public static <T> Object getField(T instance, Field field) {
        try {
            return field.get(instance);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }

    public static <T> T newInstanceWithAllFieldsSet(Class<T> clz) {
        List<RandomSupplier<?>> emptyRandomSuppliers = new ArrayList<RandomSupplier<?>>();
        return newInstanceWithAllFieldsSet(clz, emptyRandomSuppliers);
    }

    public static <T> T newInstanceWithAllFieldsSet(Class<T> clz, RandomSupplier<?>...suppliers) {
        return newInstanceWithAllFieldsSet(clz, Arrays.asList(suppliers));
    }

    public static <T> T newInstanceWithAllFieldsSet(Class<T> clz, List<RandomSupplier<?>> suppliers) {
        T instance = newInstance(clz);
        for(Field field: clz.getDeclaredFields()) {
            if (Modifier.isStatic(field.getModifiers())) {
                continue;
            }

            final Class<?> type = field.getType();
            field.setAccessible(true);

            RandomSupplier<?> supplier = findSupplier(suppliers, type);
            if (supplier != null) {
                setField(instance, field, supplier.getNext());
            } else if (type.isAssignableFrom(int.class) || type.isAssignableFrom(Integer.class)) {
                setField(instance, field, Math.abs(RANDOM.nextInt()));
            } else if (type.isAssignableFrom(long.class) || type.isAssignableFrom(Long.class)) {
                setField(instance, field, Math.abs(RANDOM.nextLong()));
            } else if (type.isAssignableFrom(Boolean.class) || type.isAssignableFrom(boolean.class)) {
                Object bool = getField(instance, field);
                if (bool == null) {
                    setField(instance, field, RANDOM.nextBoolean());
                } else {
                    setField(instance, field, !Boolean.valueOf(bool.toString()));
                }
            } else if (type.isAssignableFrom(String.class)) {
                setField(instance, field, UUID.randomUUID().toString());
            } else {
                throw new RuntimeException(String.format("Could not set value for type %s no supplier available.", type));
            }
        }
        return instance;
    }

    private static RandomSupplier<?> findSupplier(List<RandomSupplier<?>> suppliers, Class<?> type) {
        for (RandomSupplier<?> supplier : suppliers) {
            if (type.isAssignableFrom(supplier.targetClass())) {
                return supplier;
            }
        }
        return null;
    }

    public interface RandomSupplier<T> {
        T getNext();
        Class<? super T> targetClass();
    }

    private ReflectionUtils() {
    }
}
