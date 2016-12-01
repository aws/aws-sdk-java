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
package com.amazonaws.services.opsworkscm.model;

import java.io.Serializable;

/**
 * 
 */
public class DescribeNodeAssociationStatusResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    private String nodeAssociationStatus;

    /**
     * @param nodeAssociationStatus
     * @see NodeAssociationStatus
     */

    public void setNodeAssociationStatus(String nodeAssociationStatus) {
        this.nodeAssociationStatus = nodeAssociationStatus;
    }

    /**
     * @return
     * @see NodeAssociationStatus
     */

    public String getNodeAssociationStatus() {
        return this.nodeAssociationStatus;
    }

    /**
     * @param nodeAssociationStatus
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see NodeAssociationStatus
     */

    public DescribeNodeAssociationStatusResult withNodeAssociationStatus(String nodeAssociationStatus) {
        setNodeAssociationStatus(nodeAssociationStatus);
        return this;
    }

    /**
     * @param nodeAssociationStatus
     * @see NodeAssociationStatus
     */

    public void setNodeAssociationStatus(NodeAssociationStatus nodeAssociationStatus) {
        this.nodeAssociationStatus = nodeAssociationStatus.toString();
    }

    /**
     * @param nodeAssociationStatus
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see NodeAssociationStatus
     */

    public DescribeNodeAssociationStatusResult withNodeAssociationStatus(NodeAssociationStatus nodeAssociationStatus) {
        setNodeAssociationStatus(nodeAssociationStatus);
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
        if (getNodeAssociationStatus() != null)
            sb.append("NodeAssociationStatus: " + getNodeAssociationStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeNodeAssociationStatusResult == false)
            return false;
        DescribeNodeAssociationStatusResult other = (DescribeNodeAssociationStatusResult) obj;
        if (other.getNodeAssociationStatus() == null ^ this.getNodeAssociationStatus() == null)
            return false;
        if (other.getNodeAssociationStatus() != null && other.getNodeAssociationStatus().equals(this.getNodeAssociationStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNodeAssociationStatus() == null) ? 0 : getNodeAssociationStatus().hashCode());
        return hashCode;
    }

    @Override
    public DescribeNodeAssociationStatusResult clone() {
        try {
            return (DescribeNodeAssociationStatusResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
