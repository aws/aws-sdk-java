/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.ecs.model;

import java.io.Serializable;

/**
 * <p>
 * Describes the resources available for a container instance.
 * </p>
 */
public class Resource implements Serializable, Cloneable {

    /**
     * The name of the resource, such as <code>CPU</code>,
     * <code>MEMORY</code>, <code>PORTS</code>, or a user-defined resource.
     */
    private String name;

    /**
     * The type of the resource, such as <code>INTEGER</code>,
     * <code>DOUBLE</code>, <code>LONG</code>, or <code>STRINGSET</code>.
     */
    private String type;

    /**
     * When the <code>doubleValue</code> type is set, the value of the
     * resource must be a double precision floating-point type.
     */
    private Double doubleValue;

    /**
     * When the <code>longValue</code> type is set, the value of the resource
     * must be an extended precision floating-point type.
     */
    private Long longValue;

    /**
     * When the <code>integerValue</code> type is set, the value of the
     * resource must be an integer.
     */
    private Integer integerValue;

    /**
     * When the <code>stringSetValue</code> type is set, the value of the
     * resource must be a string type.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> stringSetValue;

    /**
     * The name of the resource, such as <code>CPU</code>,
     * <code>MEMORY</code>, <code>PORTS</code>, or a user-defined resource.
     *
     * @return The name of the resource, such as <code>CPU</code>,
     *         <code>MEMORY</code>, <code>PORTS</code>, or a user-defined resource.
     */
    public String getName() {
        return name;
    }
    
    /**
     * The name of the resource, such as <code>CPU</code>,
     * <code>MEMORY</code>, <code>PORTS</code>, or a user-defined resource.
     *
     * @param name The name of the resource, such as <code>CPU</code>,
     *         <code>MEMORY</code>, <code>PORTS</code>, or a user-defined resource.
     */
    public void setName(String name) {
        this.name = name;
    }
    
    /**
     * The name of the resource, such as <code>CPU</code>,
     * <code>MEMORY</code>, <code>PORTS</code>, or a user-defined resource.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param name The name of the resource, such as <code>CPU</code>,
     *         <code>MEMORY</code>, <code>PORTS</code>, or a user-defined resource.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Resource withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * The type of the resource, such as <code>INTEGER</code>,
     * <code>DOUBLE</code>, <code>LONG</code>, or <code>STRINGSET</code>.
     *
     * @return The type of the resource, such as <code>INTEGER</code>,
     *         <code>DOUBLE</code>, <code>LONG</code>, or <code>STRINGSET</code>.
     */
    public String getType() {
        return type;
    }
    
    /**
     * The type of the resource, such as <code>INTEGER</code>,
     * <code>DOUBLE</code>, <code>LONG</code>, or <code>STRINGSET</code>.
     *
     * @param type The type of the resource, such as <code>INTEGER</code>,
     *         <code>DOUBLE</code>, <code>LONG</code>, or <code>STRINGSET</code>.
     */
    public void setType(String type) {
        this.type = type;
    }
    
    /**
     * The type of the resource, such as <code>INTEGER</code>,
     * <code>DOUBLE</code>, <code>LONG</code>, or <code>STRINGSET</code>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param type The type of the resource, such as <code>INTEGER</code>,
     *         <code>DOUBLE</code>, <code>LONG</code>, or <code>STRINGSET</code>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Resource withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * When the <code>doubleValue</code> type is set, the value of the
     * resource must be a double precision floating-point type.
     *
     * @return When the <code>doubleValue</code> type is set, the value of the
     *         resource must be a double precision floating-point type.
     */
    public Double getDoubleValue() {
        return doubleValue;
    }
    
    /**
     * When the <code>doubleValue</code> type is set, the value of the
     * resource must be a double precision floating-point type.
     *
     * @param doubleValue When the <code>doubleValue</code> type is set, the value of the
     *         resource must be a double precision floating-point type.
     */
    public void setDoubleValue(Double doubleValue) {
        this.doubleValue = doubleValue;
    }
    
    /**
     * When the <code>doubleValue</code> type is set, the value of the
     * resource must be a double precision floating-point type.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param doubleValue When the <code>doubleValue</code> type is set, the value of the
     *         resource must be a double precision floating-point type.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Resource withDoubleValue(Double doubleValue) {
        this.doubleValue = doubleValue;
        return this;
    }

    /**
     * When the <code>longValue</code> type is set, the value of the resource
     * must be an extended precision floating-point type.
     *
     * @return When the <code>longValue</code> type is set, the value of the resource
     *         must be an extended precision floating-point type.
     */
    public Long getLongValue() {
        return longValue;
    }
    
    /**
     * When the <code>longValue</code> type is set, the value of the resource
     * must be an extended precision floating-point type.
     *
     * @param longValue When the <code>longValue</code> type is set, the value of the resource
     *         must be an extended precision floating-point type.
     */
    public void setLongValue(Long longValue) {
        this.longValue = longValue;
    }
    
    /**
     * When the <code>longValue</code> type is set, the value of the resource
     * must be an extended precision floating-point type.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param longValue When the <code>longValue</code> type is set, the value of the resource
     *         must be an extended precision floating-point type.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Resource withLongValue(Long longValue) {
        this.longValue = longValue;
        return this;
    }

    /**
     * When the <code>integerValue</code> type is set, the value of the
     * resource must be an integer.
     *
     * @return When the <code>integerValue</code> type is set, the value of the
     *         resource must be an integer.
     */
    public Integer getIntegerValue() {
        return integerValue;
    }
    
    /**
     * When the <code>integerValue</code> type is set, the value of the
     * resource must be an integer.
     *
     * @param integerValue When the <code>integerValue</code> type is set, the value of the
     *         resource must be an integer.
     */
    public void setIntegerValue(Integer integerValue) {
        this.integerValue = integerValue;
    }
    
    /**
     * When the <code>integerValue</code> type is set, the value of the
     * resource must be an integer.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param integerValue When the <code>integerValue</code> type is set, the value of the
     *         resource must be an integer.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Resource withIntegerValue(Integer integerValue) {
        this.integerValue = integerValue;
        return this;
    }

    /**
     * When the <code>stringSetValue</code> type is set, the value of the
     * resource must be a string type.
     *
     * @return When the <code>stringSetValue</code> type is set, the value of the
     *         resource must be a string type.
     */
    public java.util.List<String> getStringSetValue() {
        if (stringSetValue == null) {
              stringSetValue = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              stringSetValue.setAutoConstruct(true);
        }
        return stringSetValue;
    }
    
    /**
     * When the <code>stringSetValue</code> type is set, the value of the
     * resource must be a string type.
     *
     * @param stringSetValue When the <code>stringSetValue</code> type is set, the value of the
     *         resource must be a string type.
     */
    public void setStringSetValue(java.util.Collection<String> stringSetValue) {
        if (stringSetValue == null) {
            this.stringSetValue = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> stringSetValueCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(stringSetValue.size());
        stringSetValueCopy.addAll(stringSetValue);
        this.stringSetValue = stringSetValueCopy;
    }
    
    /**
     * When the <code>stringSetValue</code> type is set, the value of the
     * resource must be a string type.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param stringSetValue When the <code>stringSetValue</code> type is set, the value of the
     *         resource must be a string type.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Resource withStringSetValue(String... stringSetValue) {
        if (getStringSetValue() == null) setStringSetValue(new java.util.ArrayList<String>(stringSetValue.length));
        for (String value : stringSetValue) {
            getStringSetValue().add(value);
        }
        return this;
    }
    
    /**
     * When the <code>stringSetValue</code> type is set, the value of the
     * resource must be a string type.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param stringSetValue When the <code>stringSetValue</code> type is set, the value of the
     *         resource must be a string type.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Resource withStringSetValue(java.util.Collection<String> stringSetValue) {
        if (stringSetValue == null) {
            this.stringSetValue = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> stringSetValueCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(stringSetValue.size());
            stringSetValueCopy.addAll(stringSetValue);
            this.stringSetValue = stringSetValueCopy;
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
        if (getType() != null) sb.append("Type: " + getType() + ",");
        if (getDoubleValue() != null) sb.append("DoubleValue: " + getDoubleValue() + ",");
        if (getLongValue() != null) sb.append("LongValue: " + getLongValue() + ",");
        if (getIntegerValue() != null) sb.append("IntegerValue: " + getIntegerValue() + ",");
        if (getStringSetValue() != null) sb.append("StringSetValue: " + getStringSetValue() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode()); 
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode()); 
        hashCode = prime * hashCode + ((getDoubleValue() == null) ? 0 : getDoubleValue().hashCode()); 
        hashCode = prime * hashCode + ((getLongValue() == null) ? 0 : getLongValue().hashCode()); 
        hashCode = prime * hashCode + ((getIntegerValue() == null) ? 0 : getIntegerValue().hashCode()); 
        hashCode = prime * hashCode + ((getStringSetValue() == null) ? 0 : getStringSetValue().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof Resource == false) return false;
        Resource other = (Resource)obj;
        
        if (other.getName() == null ^ this.getName() == null) return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false) return false; 
        if (other.getType() == null ^ this.getType() == null) return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false) return false; 
        if (other.getDoubleValue() == null ^ this.getDoubleValue() == null) return false;
        if (other.getDoubleValue() != null && other.getDoubleValue().equals(this.getDoubleValue()) == false) return false; 
        if (other.getLongValue() == null ^ this.getLongValue() == null) return false;
        if (other.getLongValue() != null && other.getLongValue().equals(this.getLongValue()) == false) return false; 
        if (other.getIntegerValue() == null ^ this.getIntegerValue() == null) return false;
        if (other.getIntegerValue() != null && other.getIntegerValue().equals(this.getIntegerValue()) == false) return false; 
        if (other.getStringSetValue() == null ^ this.getStringSetValue() == null) return false;
        if (other.getStringSetValue() != null && other.getStringSetValue().equals(this.getStringSetValue()) == false) return false; 
        return true;
    }
    
    @Override
    public Resource clone() {
        try {
            return (Resource) super.clone();
        
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                    + "even though we're Cloneable!",
                    e);
        }
        
    }

}
    