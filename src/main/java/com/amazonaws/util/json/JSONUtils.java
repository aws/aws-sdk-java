/*
 * Copyright 2013-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.util.json;

import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.LinkedList;
import java.util.List;

import com.amazonaws.AmazonClientException;

public class JSONUtils {
    
	/**
     * Load a JSON string into an instantiated object. All the public fields of the object will
     * be set by the values in the JSON string associated with the field name.<br>
     * Because of the naming convention in Java, the first letter of the field name will be capitalized 
     * for another look-up in the JSON, if the original field name is not found.
     * @param clazz
     * 			Class of the object which the JSON string would be loaded into.
     * @param source
     * 			JSON string.
     * @return 
     * 			An instantiated object of the given Class
     * @throws JSONException
     */
    public static <T> T toObject (Class<T> clazz, String source) throws JSONException {
    	JSONObject jsonObect = new JSONObject(source);
    	try {
			return toObject(clazz, jsonObect);
		} catch (Exception e) {
			throw new JSONException(e);
		}
    }
    
    private static <T> T toObject(Class<T> clazz, JSONObject jsonObject) throws JSONException, IllegalArgumentException, IllegalAccessException {
    	T newObject;
    	try {
    		newObject = createInstance(clazz);
    	} catch (Exception e){
    		throw new AmazonClientException("Failed to instantiate class", e);
    	}
    	for (Field objectField : clazz.getFields()) {
    		String fieldName = objectField.getName();
    		Class<?> fieldType = objectField.getType();
    		Object fieldValue;
    		try {
    			fieldValue = parseField(jsonObject, fieldType, fieldName);
    		} catch (Exception e) {
    			fieldValue = parseField(jsonObject, fieldType, fieldName.substring(0, 1).toUpperCase() + fieldName.substring(1));
    		}
    		objectField.set(newObject, fieldValue);
    	}
    	return newObject;
    }
    
    /**
     * Get the value associated with a key, and parse it according to the provided Class.
     */
    private static Object parseField(JSONObject jsonObject, Class<?> clazz, String key) throws JSONException, IllegalArgumentException, IllegalAccessException {
		// Boolean
		if (clazz.equals(Boolean.class) || clazz.equals(boolean.class))
			return jsonObject.getBoolean(key);
		// Double
		else if (clazz.equals(Double.class) || clazz.equals(double.class))
			return jsonObject.getDouble(key);
		// Integer
		else if (clazz.equals(Integer.class) || clazz.equals(int.class))
			return jsonObject.getInt(key);
		// Long
		else if (clazz.equals(Long.class) || clazz.equals(long.class))
			return jsonObject.getLong(key);
		// String
		else if (clazz.equals(String.class))
			return jsonObject.getString(key);
		// Char
		else if (clazz.equals(Character.class) || clazz.equals(char.class))
			return jsonObject.getString(key).charAt(0);
		// Array
		else if (clazz.isArray()) {
			Class<?> componentType = clazz.getComponentType();
			JSONArray jsonArray = jsonObject.getJSONArray(key);
			Object array = Array.newInstance(componentType, jsonArray.length());
			for (int i = 0; i < jsonArray.length(); i++) {
				Array.set(array, i, parseField(jsonArray, componentType, i));
			}
			return array;
		}
		// Handled as a nested Class object
		else {
			JSONObject nestedObject = jsonObject.getJSONObject(key);
			return toObject(clazz, nestedObject);
		}
    }
    
    /**
     * Get the value associated with an index, and parse it according to the provided Class.
     */
    private static Object parseField(JSONArray jsonArray, Class<?> clazz, int index) throws JSONException, IllegalArgumentException, IllegalAccessException {
		// Boolean
		if (clazz.equals(Boolean.class) || clazz.equals(boolean.class))
			return jsonArray.getBoolean(index);
		// Double
		else if (clazz.equals(Double.class) || clazz.equals(double.class))
			return jsonArray.getDouble(index);
		// Integer
		else if (clazz.equals(Integer.class) || clazz.equals(int.class))
			return jsonArray.getInt(index);
		// Long
		else if (clazz.equals(Long.class) || clazz.equals(long.class))
			return jsonArray.getLong(index);
		// String
		else if (clazz.equals(String.class))
			return jsonArray.getString(index);
		// Char
		else if (clazz.equals(Character.class) || clazz.equals(char.class))
			return jsonArray.getString(index).charAt(0);
		// Array
		else if (clazz.isArray()) {
			Class<?> componentType = clazz.getComponentType();
			JSONArray nestedJSONArray = jsonArray.getJSONArray(index);
			List<Object> list = new LinkedList<Object>();
			for (int i = 0; i < jsonArray.length(); i++) {
				list.add(parseField(nestedJSONArray, componentType, i));
			}
			return list.toArray();
		}
		// Handled as a nested Class object
		else {
			JSONObject nestedObject = jsonArray.getJSONObject(index);
			return toObject(clazz, nestedObject);
		}  	
    }
    
	private static <T> T createInstance(Class<T> clazz)
			throws IllegalArgumentException, InstantiationException,
			IllegalAccessException, InvocationTargetException,
			SecurityException, NoSuchMethodException {
        T instanceToReturn = null;
        Class< ? > enclosingClass = clazz.getEnclosingClass();

        if (enclosingClass != null) {
            Object instanceOfEnclosingClass = createInstance(enclosingClass);

            Constructor<T> ctor = clazz.getConstructor(enclosingClass);

            if (ctor != null) {
        		instanceToReturn = ctor.newInstance(instanceOfEnclosingClass);
            }
        } else {
            instanceToReturn = clazz.newInstance();
        }
        
        return instanceToReturn;
    }
}
