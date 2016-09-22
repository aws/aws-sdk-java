/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.directconnect.model;

import java.io.Serializable;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Container for the parameters to the DescribeConnectionsOnInterconnect operation.
 * </p>
 */
public class DescribeConnectionsOnInterconnectRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * ID of the interconnect on which a list of connection is provisioned.
     * </p>
     * <p>
     * Example: dxcon-abc123
     * </p>
     * <p>
     * Default: None
     * </p>
     */
    private String interconnectId;

    /**
     * <p>
     * ID of the interconnect on which a list of connection is provisioned.
     * </p>
     * <p>
     * Example: dxcon-abc123
     * </p>
     * <p>
     * Default: None
     * </p>
     * 
     * @param interconnectId
     *        ID of the interconnect on which a list of connection is provisioned.</p>
     *        <p>
     *        Example: dxcon-abc123
     *        </p>
     *        <p>
     *        Default: None
     */

    public void setInterconnectId(String interconnectId) {
        this.interconnectId = interconnectId;
    }

    /**
     * <p>
     * ID of the interconnect on which a list of connection is provisioned.
     * </p>
     * <p>
     * Example: dxcon-abc123
     * </p>
     * <p>
     * Default: None
     * </p>
     * 
     * @return ID of the interconnect on which a list of connection is provisioned.</p>
     *         <p>
     *         Example: dxcon-abc123
     *         </p>
     *         <p>
     *         Default: None
     */

    public String getInterconnectId() {
        return this.interconnectId;
    }

    /**
     * <p>
     * ID of the interconnect on which a list of connection is provisioned.
     * </p>
     * <p>
     * Example: dxcon-abc123
     * </p>
     * <p>
     * Default: None
     * </p>
     * 
     * @param interconnectId
     *        ID of the interconnect on which a list of connection is provisioned.</p>
     *        <p>
     *        Example: dxcon-abc123
     *        </p>
     *        <p>
     *        Default: None
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeConnectionsOnInterconnectRequest withInterconnectId(String interconnectId) {
        setInterconnectId(interconnectId);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getInterconnectId() != null)
            sb.append("InterconnectId: " + getInterconnectId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeConnectionsOnInterconnectRequest == false)
            return false;
        DescribeConnectionsOnInterconnectRequest other = (DescribeConnectionsOnInterconnectRequest) obj;
        if (other.getInterconnectId() == null ^ this.getInterconnectId() == null)
            return false;
        if (other.getInterconnectId() != null && other.getInterconnectId().equals(this.getInterconnectId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInterconnectId() == null) ? 0 : getInterconnectId().hashCode());
        return hashCode;
    }

    @Override
    public DescribeConnectionsOnInterconnectRequest clone() {
        return (DescribeConnectionsOnInterconnectRequest) super.clone();
    }
}
