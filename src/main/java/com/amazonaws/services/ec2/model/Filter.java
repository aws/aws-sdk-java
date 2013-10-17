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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;


/**
 * <p>
 * A filter used to limit results when describing tags. Multiple values can be specified per filter. A tag must match at least one of the specified
 * values for it to be returned from an operation.
 * </p>
 * <p>
 * Wildcards can be included in filter values; <code>*</code> specifies that zero or more characters must match, and <code>?</code> specifies that
 * exactly one character must match. Use a backslash to escape special characters. For example, a filter value of <code>\*amazon\?\\</code> specifies
 * the literal string <code>*amazon?\</code> .
 * 
 * </p>
 */
public class Filter implements Serializable {

    /**
     * Specifies the name of the filter.
     */
    private String name;

    /**
     * Contains one or more values for the filter.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> values;

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
        setName(name);
        setValues(values);
    }

    /**
     * Constructs a new Filter object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param name Specifies the name of the filter.
     */
    public Filter(String name) {
        setName(name);
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
              values = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              values.setAutoConstruct(true);
        }
        return values;
    }
    
    /**
     * Contains one or more values for the filter.
     *
     * @param values Contains one or more values for the filter.
     */
    public void setValues(java.util.Collection<String> values) {
        if (values == null) {
            this.values = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> valuesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(values.size());
        valuesCopy.addAll(values);
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
        if (getValues() == null) setValues(new java.util.ArrayList<String>(values.length));
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
        if (values == null) {
            this.values = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> valuesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(values.size());
            valuesCopy.addAll(values);
            this.values = valuesCopy;
        }

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
        if (getName() != null) sb.append("Name: " + getName() + ",");
        if (getValues() != null) sb.append("Values: " + getValues() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode()); 
        hashCode = prime * hashCode + ((getValues() == null) ? 0 : getValues().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof Filter == false) return false;
        Filter other = (Filter)obj;
        
        if (other.getName() == null ^ this.getName() == null) return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false) return false; 
        if (other.getValues() == null ^ this.getValues() == null) return false;
        if (other.getValues() != null && other.getValues().equals(this.getValues()) == false) return false; 
        return true;
    }
    
}
    