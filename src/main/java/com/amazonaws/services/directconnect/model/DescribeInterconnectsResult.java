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
package com.amazonaws.services.directconnect.model;

import java.io.Serializable;


/**
 * <p>
 * A structure containing a list of interconnects.
 * </p>
 */
public class DescribeInterconnectsResult implements Serializable {

    /**
     * A list of interconnects.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<Interconnect> interconnects;

    /**
     * A list of interconnects.
     *
     * @return A list of interconnects.
     */
    public java.util.List<Interconnect> getInterconnects() {
        if (interconnects == null) {
              interconnects = new com.amazonaws.internal.ListWithAutoConstructFlag<Interconnect>();
              interconnects.setAutoConstruct(true);
        }
        return interconnects;
    }
    
    /**
     * A list of interconnects.
     *
     * @param interconnects A list of interconnects.
     */
    public void setInterconnects(java.util.Collection<Interconnect> interconnects) {
        if (interconnects == null) {
            this.interconnects = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<Interconnect> interconnectsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<Interconnect>(interconnects.size());
        interconnectsCopy.addAll(interconnects);
        this.interconnects = interconnectsCopy;
    }
    
    /**
     * A list of interconnects.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param interconnects A list of interconnects.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeInterconnectsResult withInterconnects(Interconnect... interconnects) {
        if (getInterconnects() == null) setInterconnects(new java.util.ArrayList<Interconnect>(interconnects.length));
        for (Interconnect value : interconnects) {
            getInterconnects().add(value);
        }
        return this;
    }
    
    /**
     * A list of interconnects.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param interconnects A list of interconnects.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeInterconnectsResult withInterconnects(java.util.Collection<Interconnect> interconnects) {
        if (interconnects == null) {
            this.interconnects = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<Interconnect> interconnectsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<Interconnect>(interconnects.size());
            interconnectsCopy.addAll(interconnects);
            this.interconnects = interconnectsCopy;
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
        if (getInterconnects() != null) sb.append("Interconnects: " + getInterconnects() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getInterconnects() == null) ? 0 : getInterconnects().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DescribeInterconnectsResult == false) return false;
        DescribeInterconnectsResult other = (DescribeInterconnectsResult)obj;
        
        if (other.getInterconnects() == null ^ this.getInterconnects() == null) return false;
        if (other.getInterconnects() != null && other.getInterconnects().equals(this.getInterconnects()) == false) return false; 
        return true;
    }
    
}
    