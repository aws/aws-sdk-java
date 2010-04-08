/*
 * Copyright 2010 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.elasticmapreduce.model;

/**
 * <p>
 * </p>
 */
public class KeyValue {

    /**
     * The key that is paired with a value in a KeyValue pair.
     */
    private String key;

    /**
     * The value paired with a key in a KeyValue pair.
     */
    private String value;

    /**
     * The key that is paired with a value in a KeyValue pair.
     *
     * @return The key that is paired with a value in a KeyValue pair.
     */
    public String getKey() {
        return key;
    }
    
    /**
     * The key that is paired with a value in a KeyValue pair.
     *
     * @param key The key that is paired with a value in a KeyValue pair.
     */
    public void setKey(String key) {
        this.key = key;
    }
    
    /**
     * The key that is paired with a value in a KeyValue pair.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param key The key that is paired with a value in a KeyValue pair.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public KeyValue withKey(String key) {
        this.key = key;
        return this;
    }
    
    
    /**
     * The value paired with a key in a KeyValue pair.
     *
     * @return The value paired with a key in a KeyValue pair.
     */
    public String getValue() {
        return value;
    }
    
    /**
     * The value paired with a key in a KeyValue pair.
     *
     * @param value The value paired with a key in a KeyValue pair.
     */
    public void setValue(String value) {
        this.value = value;
    }
    
    /**
     * The value paired with a key in a KeyValue pair.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param value The value paired with a key in a KeyValue pair.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public KeyValue withValue(String value) {
        this.value = value;
        return this;
    }
    
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        
        sb.append("Key: " + key + ", ");
        sb.append("Value: " + value + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    