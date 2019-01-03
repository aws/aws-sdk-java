/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceResult;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DisassociateClientVpnTargetNetworkResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * The ID of the target network association.
     * </p>
     */
    private String associationId;
    /**
     * <p>
     * The current state of the target network association.
     * </p>
     */
    private AssociationStatus status;

    /**
     * <p>
     * The ID of the target network association.
     * </p>
     * 
     * @param associationId
     *        The ID of the target network association.
     */

    public void setAssociationId(String associationId) {
        this.associationId = associationId;
    }

    /**
     * <p>
     * The ID of the target network association.
     * </p>
     * 
     * @return The ID of the target network association.
     */

    public String getAssociationId() {
        return this.associationId;
    }

    /**
     * <p>
     * The ID of the target network association.
     * </p>
     * 
     * @param associationId
     *        The ID of the target network association.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DisassociateClientVpnTargetNetworkResult withAssociationId(String associationId) {
        setAssociationId(associationId);
        return this;
    }

    /**
     * <p>
     * The current state of the target network association.
     * </p>
     * 
     * @param status
     *        The current state of the target network association.
     */

    public void setStatus(AssociationStatus status) {
        this.status = status;
    }

    /**
     * <p>
     * The current state of the target network association.
     * </p>
     * 
     * @return The current state of the target network association.
     */

    public AssociationStatus getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The current state of the target network association.
     * </p>
     * 
     * @param status
     *        The current state of the target network association.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DisassociateClientVpnTargetNetworkResult withStatus(AssociationStatus status) {
        setStatus(status);
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getAssociationId() != null)
            sb.append("AssociationId: ").append(getAssociationId()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DisassociateClientVpnTargetNetworkResult == false)
            return false;
        DisassociateClientVpnTargetNetworkResult other = (DisassociateClientVpnTargetNetworkResult) obj;
        if (other.getAssociationId() == null ^ this.getAssociationId() == null)
            return false;
        if (other.getAssociationId() != null && other.getAssociationId().equals(this.getAssociationId()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAssociationId() == null) ? 0 : getAssociationId().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public DisassociateClientVpnTargetNetworkResult clone() {
        try {
            return (DisassociateClientVpnTargetNetworkResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
