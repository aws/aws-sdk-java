/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.cloudfront.model;

/**
 * Method
 */
public enum Method {
    
    GET("GET"),
    HEAD("HEAD"),
    POST("POST"),
    PUT("PUT"),
    PATCH("PATCH"),
    OPTIONS("OPTIONS"),
    DELETE("DELETE");

    private String value;

    private Method(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return this.value;
    }

    /**
     * Use this in place of valueOf.
     *
     * @param value
     *            real value
     * @return Method corresponding to the value
     */
    public static Method fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        
        } else if ("GET".equals(value)) {
            return Method.GET;
        } else if ("HEAD".equals(value)) {
            return Method.HEAD;
        } else if ("POST".equals(value)) {
            return Method.POST;
        } else if ("PUT".equals(value)) {
            return Method.PUT;
        } else if ("PATCH".equals(value)) {
            return Method.PATCH;
        } else if ("OPTIONS".equals(value)) {
            return Method.OPTIONS;
        } else if ("DELETE".equals(value)) {
            return Method.DELETE;
        } else {
            throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
        }
    }
}
    