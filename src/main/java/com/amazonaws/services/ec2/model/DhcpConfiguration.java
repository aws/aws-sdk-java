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
 * The DhcpConfiguration data type
 * </p>
 */
public class DhcpConfiguration implements Serializable {

    /**
     * Contains the name of a DHCP option.
     */
    private String key;

    /**
     * Contains a set of values for a DHCP option.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> values;

    /**
     * Contains the name of a DHCP option.
     *
     * @return Contains the name of a DHCP option.
     */
    public String getKey() {
        return key;
    }
    
    /**
     * Contains the name of a DHCP option.
     *
     * @param key Contains the name of a DHCP option.
     */
    public void setKey(String key) {
        this.key = key;
    }
    
    /**
     * Contains the name of a DHCP option.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param key Contains the name of a DHCP option.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DhcpConfiguration withKey(String key) {
        this.key = key;
        return this;
    }

    /**
     * Contains a set of values for a DHCP option.
     *
     * @return Contains a set of values for a DHCP option.
     */
    public java.util.List<String> getValues() {
        if (values == null) {
              values = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              values.setAutoConstruct(true);
        }
        return values;
    }
    
    /**
     * Contains a set of values for a DHCP option.
     *
     * @param values Contains a set of values for a DHCP option.
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
     * Contains a set of values for a DHCP option.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param values Contains a set of values for a DHCP option.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DhcpConfiguration withValues(String... values) {
        if (getValues() == null) setValues(new java.util.ArrayList<String>(values.length));
        for (String value : values) {
            getValues().add(value);
        }
        return this;
    }
    
    /**
     * Contains a set of values for a DHCP option.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param values Contains a set of values for a DHCP option.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DhcpConfiguration withValues(java.util.Collection<String> values) {
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
        if (getKey() != null) sb.append("Key: " + getKey() + ",");
        if (getValues() != null) sb.append("Values: " + getValues() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getKey() == null) ? 0 : getKey().hashCode()); 
        hashCode = prime * hashCode + ((getValues() == null) ? 0 : getValues().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DhcpConfiguration == false) return false;
        DhcpConfiguration other = (DhcpConfiguration)obj;
        
        if (other.getKey() == null ^ this.getKey() == null) return false;
        if (other.getKey() != null && other.getKey().equals(this.getKey()) == false) return false; 
        if (other.getValues() == null ^ this.getValues() == null) return false;
        if (other.getValues() != null && other.getValues().equals(this.getValues()) == false) return false; 
        return true;
    }
    
}
    