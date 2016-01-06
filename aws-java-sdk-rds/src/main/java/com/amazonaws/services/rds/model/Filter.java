/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.rds.model;

import java.io.Serializable;

/**
 * 
 */
public class Filter implements Serializable, Cloneable {

    /**
     * This parameter is not currently supported.
     */
    private String name;

    /**
     * This parameter is not currently supported.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> values;

    /**
     * This parameter is not currently supported.
     *
     * @return This parameter is not currently supported.
     */
    public String getName() {
        return name;
    }
    
    /**
     * This parameter is not currently supported.
     *
     * @param name This parameter is not currently supported.
     */
    public void setName(String name) {
        this.name = name;
    }
    
    /**
     * This parameter is not currently supported.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param name This parameter is not currently supported.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Filter withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * This parameter is not currently supported.
     *
     * @return This parameter is not currently supported.
     */
    public java.util.List<String> getValues() {
        if (values == null) {
              values = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              values.setAutoConstruct(true);
        }
        return values;
    }
    
    /**
     * This parameter is not currently supported.
     *
     * @param values This parameter is not currently supported.
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
     * This parameter is not currently supported.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setValues(java.util.Collection)} or {@link
     * #withValues(java.util.Collection)} if you want to override the
     * existing values.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param values This parameter is not currently supported.
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
     * This parameter is not currently supported.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param values This parameter is not currently supported.
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
    
    @Override
    public Filter clone() {
        try {
            return (Filter) super.clone();
        
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                    + "even though we're Cloneable!",
                    e);
        }
        
    }

}
    