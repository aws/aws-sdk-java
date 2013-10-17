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
 * 
 * </p>
 */
public class DescribeVpcsResult implements Serializable {

    /**
     * 
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<Vpc> vpcs;

    /**
     * 
     *
     * @return 
     */
    public java.util.List<Vpc> getVpcs() {
        if (vpcs == null) {
              vpcs = new com.amazonaws.internal.ListWithAutoConstructFlag<Vpc>();
              vpcs.setAutoConstruct(true);
        }
        return vpcs;
    }
    
    /**
     * 
     *
     * @param vpcs 
     */
    public void setVpcs(java.util.Collection<Vpc> vpcs) {
        if (vpcs == null) {
            this.vpcs = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<Vpc> vpcsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<Vpc>(vpcs.size());
        vpcsCopy.addAll(vpcs);
        this.vpcs = vpcsCopy;
    }
    
    /**
     * 
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param vpcs 
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeVpcsResult withVpcs(Vpc... vpcs) {
        if (getVpcs() == null) setVpcs(new java.util.ArrayList<Vpc>(vpcs.length));
        for (Vpc value : vpcs) {
            getVpcs().add(value);
        }
        return this;
    }
    
    /**
     * 
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param vpcs 
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeVpcsResult withVpcs(java.util.Collection<Vpc> vpcs) {
        if (vpcs == null) {
            this.vpcs = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<Vpc> vpcsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<Vpc>(vpcs.size());
            vpcsCopy.addAll(vpcs);
            this.vpcs = vpcsCopy;
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
        if (getVpcs() != null) sb.append("Vpcs: " + getVpcs() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getVpcs() == null) ? 0 : getVpcs().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DescribeVpcsResult == false) return false;
        DescribeVpcsResult other = (DescribeVpcsResult)obj;
        
        if (other.getVpcs() == null ^ this.getVpcs() == null) return false;
        if (other.getVpcs() != null && other.getVpcs().equals(this.getVpcs()) == false) return false; 
        return true;
    }
    
}
    