/*
 * Copyright 2010-2014 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.cloudsearchdomain.model;

import java.io.Serializable;

/**
 * <p>
 * A container for facet information.
 * </p>
 */
public class Bucket implements Serializable {

    /**
     * The facet value being counted.
     */
    private String value;

    /**
     * The number of hits that contain the facet value in the specified facet
     * field.
     */
    private Long count;

    /**
     * The facet value being counted.
     *
     * @return The facet value being counted.
     */
    public String getValue() {
        return value;
    }
    
    /**
     * The facet value being counted.
     *
     * @param value The facet value being counted.
     */
    public void setValue(String value) {
        this.value = value;
    }
    
    /**
     * The facet value being counted.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param value The facet value being counted.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Bucket withValue(String value) {
        this.value = value;
        return this;
    }

    /**
     * The number of hits that contain the facet value in the specified facet
     * field.
     *
     * @return The number of hits that contain the facet value in the specified facet
     *         field.
     */
    public Long getCount() {
        return count;
    }
    
    /**
     * The number of hits that contain the facet value in the specified facet
     * field.
     *
     * @param count The number of hits that contain the facet value in the specified facet
     *         field.
     */
    public void setCount(Long count) {
        this.count = count;
    }
    
    /**
     * The number of hits that contain the facet value in the specified facet
     * field.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param count The number of hits that contain the facet value in the specified facet
     *         field.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Bucket withCount(Long count) {
        this.count = count;
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
        if (getValue() != null) sb.append("Value: " + getValue() + ",");
        if (getCount() != null) sb.append("Count: " + getCount() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getValue() == null) ? 0 : getValue().hashCode()); 
        hashCode = prime * hashCode + ((getCount() == null) ? 0 : getCount().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof Bucket == false) return false;
        Bucket other = (Bucket)obj;
        
        if (other.getValue() == null ^ this.getValue() == null) return false;
        if (other.getValue() != null && other.getValue().equals(this.getValue()) == false) return false; 
        if (other.getCount() == null ^ this.getCount() == null) return false;
        if (other.getCount() != null && other.getCount().equals(this.getCount()) == false) return false; 
        return true;
    }
    
}
    