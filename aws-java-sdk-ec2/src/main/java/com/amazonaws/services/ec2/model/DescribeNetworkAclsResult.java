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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;

/**
 * 
 */
public class DescribeNetworkAclsResult implements Serializable {

    /**
     * Information about one or more network ACLs.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<NetworkAcl> networkAcls;

    /**
     * Information about one or more network ACLs.
     *
     * @return Information about one or more network ACLs.
     */
    public java.util.List<NetworkAcl> getNetworkAcls() {
        if (networkAcls == null) {
              networkAcls = new com.amazonaws.internal.ListWithAutoConstructFlag<NetworkAcl>();
              networkAcls.setAutoConstruct(true);
        }
        return networkAcls;
    }
    
    /**
     * Information about one or more network ACLs.
     *
     * @param networkAcls Information about one or more network ACLs.
     */
    public void setNetworkAcls(java.util.Collection<NetworkAcl> networkAcls) {
        if (networkAcls == null) {
            this.networkAcls = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<NetworkAcl> networkAclsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<NetworkAcl>(networkAcls.size());
        networkAclsCopy.addAll(networkAcls);
        this.networkAcls = networkAclsCopy;
    }
    
    /**
     * Information about one or more network ACLs.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param networkAcls Information about one or more network ACLs.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeNetworkAclsResult withNetworkAcls(NetworkAcl... networkAcls) {
        if (getNetworkAcls() == null) setNetworkAcls(new java.util.ArrayList<NetworkAcl>(networkAcls.length));
        for (NetworkAcl value : networkAcls) {
            getNetworkAcls().add(value);
        }
        return this;
    }
    
    /**
     * Information about one or more network ACLs.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param networkAcls Information about one or more network ACLs.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeNetworkAclsResult withNetworkAcls(java.util.Collection<NetworkAcl> networkAcls) {
        if (networkAcls == null) {
            this.networkAcls = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<NetworkAcl> networkAclsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<NetworkAcl>(networkAcls.size());
            networkAclsCopy.addAll(networkAcls);
            this.networkAcls = networkAclsCopy;
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
        if (getNetworkAcls() != null) sb.append("NetworkAcls: " + getNetworkAcls() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getNetworkAcls() == null) ? 0 : getNetworkAcls().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DescribeNetworkAclsResult == false) return false;
        DescribeNetworkAclsResult other = (DescribeNetworkAclsResult)obj;
        
        if (other.getNetworkAcls() == null ^ this.getNetworkAcls() == null) return false;
        if (other.getNetworkAcls() != null && other.getNetworkAcls().equals(this.getNetworkAcls()) == false) return false; 
        return true;
    }
    
}
    