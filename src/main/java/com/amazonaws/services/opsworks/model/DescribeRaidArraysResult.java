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
package com.amazonaws.services.opsworks.model;

import java.io.Serializable;


/**
 * <p>
 * Contains the response to a <code>DescribeRaidArrays</code> request.
 * </p>
 */
public class DescribeRaidArraysResult implements Serializable {

    /**
     * A <code>RaidArrays</code> object that describes the specified RAID
     * arrays.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<RaidArray> raidArrays;

    /**
     * A <code>RaidArrays</code> object that describes the specified RAID
     * arrays.
     *
     * @return A <code>RaidArrays</code> object that describes the specified RAID
     *         arrays.
     */
    public java.util.List<RaidArray> getRaidArrays() {
        if (raidArrays == null) {
              raidArrays = new com.amazonaws.internal.ListWithAutoConstructFlag<RaidArray>();
              raidArrays.setAutoConstruct(true);
        }
        return raidArrays;
    }
    
    /**
     * A <code>RaidArrays</code> object that describes the specified RAID
     * arrays.
     *
     * @param raidArrays A <code>RaidArrays</code> object that describes the specified RAID
     *         arrays.
     */
    public void setRaidArrays(java.util.Collection<RaidArray> raidArrays) {
        if (raidArrays == null) {
            this.raidArrays = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<RaidArray> raidArraysCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<RaidArray>(raidArrays.size());
        raidArraysCopy.addAll(raidArrays);
        this.raidArrays = raidArraysCopy;
    }
    
    /**
     * A <code>RaidArrays</code> object that describes the specified RAID
     * arrays.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param raidArrays A <code>RaidArrays</code> object that describes the specified RAID
     *         arrays.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeRaidArraysResult withRaidArrays(RaidArray... raidArrays) {
        if (getRaidArrays() == null) setRaidArrays(new java.util.ArrayList<RaidArray>(raidArrays.length));
        for (RaidArray value : raidArrays) {
            getRaidArrays().add(value);
        }
        return this;
    }
    
    /**
     * A <code>RaidArrays</code> object that describes the specified RAID
     * arrays.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param raidArrays A <code>RaidArrays</code> object that describes the specified RAID
     *         arrays.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeRaidArraysResult withRaidArrays(java.util.Collection<RaidArray> raidArrays) {
        if (raidArrays == null) {
            this.raidArrays = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<RaidArray> raidArraysCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<RaidArray>(raidArrays.size());
            raidArraysCopy.addAll(raidArrays);
            this.raidArrays = raidArraysCopy;
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
        if (getRaidArrays() != null) sb.append("RaidArrays: " + getRaidArrays() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getRaidArrays() == null) ? 0 : getRaidArrays().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DescribeRaidArraysResult == false) return false;
        DescribeRaidArraysResult other = (DescribeRaidArraysResult)obj;
        
        if (other.getRaidArrays() == null ^ this.getRaidArrays() == null) return false;
        if (other.getRaidArrays() != null && other.getRaidArrays().equals(this.getRaidArrays()) == false) return false; 
        return true;
    }
    
}
    