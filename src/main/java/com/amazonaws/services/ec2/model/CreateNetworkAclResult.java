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
 * Create Network Acl Result
 */
public class CreateNetworkAclResult {

    private NetworkAcl networkAcl;

    /**
     * Returns the value of the NetworkAcl property for this object.
     *
     * @return The value of the NetworkAcl property for this object.
     */
    public NetworkAcl getNetworkAcl() {
        return networkAcl;
    }
    
    /**
     * Sets the value of the NetworkAcl property for this object.
     *
     * @param networkAcl The new value for the NetworkAcl property for this object.
     */
    public void setNetworkAcl(NetworkAcl networkAcl) {
        this.networkAcl = networkAcl;
    }
    
    /**
     * Sets the value of the NetworkAcl property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param networkAcl The new value for the NetworkAcl property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public CreateNetworkAclResult withNetworkAcl(NetworkAcl networkAcl) {
        this.networkAcl = networkAcl;
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
        sb.append("NetworkAcl: " + networkAcl + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    