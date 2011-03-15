/*
 * Copyright 2010-2011 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Describe Network Acls Result
 */
public class DescribeNetworkAclsResult {

    private java.util.List<NetworkAcl> networkAcls;

    /**
     * Returns the value of the NetworkAcls property for this object.
     *
     * @return The value of the NetworkAcls property for this object.
     */
    public java.util.List<NetworkAcl> getNetworkAcls() {
        if (networkAcls == null) {
            networkAcls = new java.util.ArrayList<NetworkAcl>();
        }
        return networkAcls;
    }
    
    /**
     * Sets the value of the NetworkAcls property for this object.
     *
     * @param networkAcls The new value for the NetworkAcls property for this object.
     */
    public void setNetworkAcls(java.util.Collection<NetworkAcl> networkAcls) {
        java.util.List<NetworkAcl> networkAclsCopy = new java.util.ArrayList<NetworkAcl>();
        if (networkAcls != null) {
            networkAclsCopy.addAll(networkAcls);
        }
        this.networkAcls = networkAclsCopy;
    }
    
    /**
     * Sets the value of the NetworkAcls property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param networkAcls The new value for the NetworkAcls property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeNetworkAclsResult withNetworkAcls(NetworkAcl... networkAcls) {
        for (NetworkAcl value : networkAcls) {
            getNetworkAcls().add(value);
        }
        return this;
    }
    
    /**
     * Sets the value of the NetworkAcls property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param networkAcls The new value for the NetworkAcls property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeNetworkAclsResult withNetworkAcls(java.util.Collection<NetworkAcl> networkAcls) {
        java.util.List<NetworkAcl> networkAclsCopy = new java.util.ArrayList<NetworkAcl>();
        if (networkAcls != null) {
            networkAclsCopy.addAll(networkAcls);
        }
        this.networkAcls = networkAclsCopy;

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
        sb.append("NetworkAcls: " + networkAcls + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    