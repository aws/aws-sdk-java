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
package com.amazonaws.services.ec2.model;

/**
 * Filter
 */
public class Filter {
        
    private String name;

    private java.util.List<String> values;

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
    public Filter withName(String name) {
        this.name = name;
        return this;
    }
    
    
    /**
     * Returns the value of the Values property for this object.
     *
     * @return The value of the Values property for this object.
     */
    public java.util.List<String> getValues() {
        if (values == null) {
            values = new java.util.ArrayList<String>();
        }
        return values;
    }
    
    /**
     * Sets the value of the Values property for this object.
     *
     * @param values The new value for the Values property for this object.
     */
    public void setValues(java.util.Collection<String> values) {
        java.util.List<String> valuesCopy = new java.util.ArrayList<String>();
        if (values != null) {
            valuesCopy.addAll(values);
        }
        this.values = valuesCopy;
    }
    
    /**
     * Sets the value of the Values property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param values The new value for the Values property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public Filter withValues(String... values) {
        for (String value : values) {
            getValues().add(value);
        }
        return this;
    }
    
    /**
     * Sets the value of the Values property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param values The new value for the Values property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public Filter withValues(java.util.Collection<String> values) {
        java.util.List<String> valuesCopy = new java.util.ArrayList<String>();
        if (values != null) {
            valuesCopy.addAll(values);
        }
        this.values = valuesCopy;

        return this;
    }
    
}
    