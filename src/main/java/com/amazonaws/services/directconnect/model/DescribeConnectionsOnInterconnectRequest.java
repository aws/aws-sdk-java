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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.directconnect.AmazonDirectConnect#describeConnectionsOnInterconnect(DescribeConnectionsOnInterconnectRequest) DescribeConnectionsOnInterconnect operation}.
 * <p>
 * Return a list of connections that have been provisioned on the given interconnect.
 * </p>
 *
 * @see com.amazonaws.services.directconnect.AmazonDirectConnect#describeConnectionsOnInterconnect(DescribeConnectionsOnInterconnectRequest)
 */
public class DescribeConnectionsOnInterconnectRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * ID of the interconnect on which a list of connection is provisioned.
     * <p>Example: dxcon-abc123 <p>Default: None
     */
    private String interconnectId;

    /**
     * ID of the interconnect on which a list of connection is provisioned.
     * <p>Example: dxcon-abc123 <p>Default: None
     *
     * @return ID of the interconnect on which a list of connection is provisioned.
     *         <p>Example: dxcon-abc123 <p>Default: None
     */
    public String getInterconnectId() {
        return interconnectId;
    }
    
    /**
     * ID of the interconnect on which a list of connection is provisioned.
     * <p>Example: dxcon-abc123 <p>Default: None
     *
     * @param interconnectId ID of the interconnect on which a list of connection is provisioned.
     *         <p>Example: dxcon-abc123 <p>Default: None
     */
    public void setInterconnectId(String interconnectId) {
        this.interconnectId = interconnectId;
    }
    
    /**
     * ID of the interconnect on which a list of connection is provisioned.
     * <p>Example: dxcon-abc123 <p>Default: None
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param interconnectId ID of the interconnect on which a list of connection is provisioned.
     *         <p>Example: dxcon-abc123 <p>Default: None
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeConnectionsOnInterconnectRequest withInterconnectId(String interconnectId) {
        this.interconnectId = interconnectId;
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
        if (getInterconnectId() != null) sb.append("InterconnectId: " + getInterconnectId() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getInterconnectId() == null) ? 0 : getInterconnectId().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DescribeConnectionsOnInterconnectRequest == false) return false;
        DescribeConnectionsOnInterconnectRequest other = (DescribeConnectionsOnInterconnectRequest)obj;
        
        if (other.getInterconnectId() == null ^ this.getInterconnectId() == null) return false;
        if (other.getInterconnectId() != null && other.getInterconnectId().equals(this.getInterconnectId()) == false) return false; 
        return true;
    }
    
}
    