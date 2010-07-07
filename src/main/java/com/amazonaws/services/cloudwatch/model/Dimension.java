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
package com.amazonaws.services.cloudwatch.model;

/**
 * Dimension
 */
public class Dimension {

    private String name;

    private String value;

    /**
     * Returns the value of the Name property for this object.
     *
     * @return The value of the Name property for this object.
     */
    public String getName() {
        return name;
    }
    
    /**
     * Sets the value of the Name property for this object.
     *
     * @param name The new value for the Name property for this object.
     */
    public void setName(String name) {
        this.name = name;
    }
    
    /**
     * Sets the value of the Name property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param name The new value for the Name property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public Dimension withName(String name) {
        this.name = name;
        return this;
    }
    
    
    /**
     * Returns the value of the Value property for this object.
     *
     * @return The value of the Value property for this object.
     */
    public String getValue() {
        return value;
    }
    
    /**
     * Sets the value of the Value property for this object.
     *
     * @param value The new value for the Value property for this object.
     */
    public void setValue(String value) {
        this.value = value;
    }
    
    /**
     * Sets the value of the Value property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param value The new value for the Value property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public Dimension withValue(String value) {
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
        sb.append("Name: " + name + ", ");
        sb.append("Value: " + value + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    