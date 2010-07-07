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
 * A key-value pair.
 * </p>
 */
public class KeyValue {

    /**
     * The unique identifier of a key-value pair.
     */
    private String key;

    /**
     * The value part of the identified key.
     */
    private String value;

    /**
     * The unique identifier of a key-value pair.
     *
     * @return The unique identifier of a key-value pair.
     */
    public String getKey() {
        return key;
    }
    
    /**
     * The unique identifier of a key-value pair.
     *
     * @param key The unique identifier of a key-value pair.
     */
    public void setKey(String key) {
        this.key = key;
    }
    
    /**
     * The unique identifier of a key-value pair.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param key The unique identifier of a key-value pair.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public KeyValue withKey(String key) {
        this.key = key;
        return this;
    }
    
    
    /**
     * The value part of the identified key.
     *
     * @return The value part of the identified key.
     */
    public String getValue() {
        return value;
    }
    
    /**
     * The value part of the identified key.
     *
     * @param value The value part of the identified key.
     */
    public void setValue(String value) {
        this.value = value;
    }
    
    /**
     * The value part of the identified key.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param value The value part of the identified key.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public KeyValue withValue(String value) {
        this.value = value;
        return this;
    }
    
    
    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
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
    