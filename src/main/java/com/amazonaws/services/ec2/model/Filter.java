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
 * <p>
 * The Filter data type.
 * </p>
 */
public class Filter {

    /**
     * Specifies the name of the filter.
     */
    private String name;

    /**
     * Contains one or more values for the filter.
     */
    private java.util.List<String> values;

    /**
     * Default constructor for a new Filter object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public Filter() {}
    
    /**
     * Constructs a new Filter object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param name Specifies the name of the filter.
     * @param values Contains one or more values for the filter.
     */
    public Filter(String name, java.util.List<String> values) {
        this.name = name;
        this.values = values;
    }
    
    /**
     * Specifies the name of the filter.
     *
     * @return Specifies the name of the filter.
     */
    public String getName() {
        return name;
    }
    
    /**
     * Specifies the name of the filter.
     *
     * @param name Specifies the name of the filter.
     */
    public void setName(String name) {
        this.name = name;
    }
    
    /**
     * Specifies the name of the filter.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param name Specifies the name of the filter.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public Filter withName(String name) {
        this.name = name;
        return this;
    }
    
    
    /**
     * Contains one or more values for the filter.
     *
     * @return Contains one or more values for the filter.
     */
    public java.util.List<String> getValues() {
        if (values == null) {
            values = new java.util.ArrayList<String>();
        }
        return values;
    }
    
    /**
     * Contains one or more values for the filter.
     *
     * @param values Contains one or more values for the filter.
     */
    public void setValues(java.util.Collection<String> values) {
        java.util.List<String> valuesCopy = new java.util.ArrayList<String>();
        if (values != null) {
            valuesCopy.addAll(values);
        }
        this.values = valuesCopy;
    }
    
    /**
     * Contains one or more values for the filter.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param values Contains one or more values for the filter.
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
     * Contains one or more values for the filter.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param values Contains one or more values for the filter.
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
        sb.append("Values: " + values + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    