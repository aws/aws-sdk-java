/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.eksauth.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Amazon EKS Pod Identity associations provide the ability to manage credentials for your applications, similar to the
 * way that Amazon EC2 instance profiles provide credentials to Amazon EC2 instances.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eks-auth-2023-11-26/PodIdentityAssociation" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PodIdentityAssociation implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the EKS Pod Identity association.
     * </p>
     */
    private String associationArn;
    /**
     * <p>
     * The ID of the association.
     * </p>
     */
    private String associationId;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the EKS Pod Identity association.
     * </p>
     * 
     * @param associationArn
     *        The Amazon Resource Name (ARN) of the EKS Pod Identity association.
     */

    public void setAssociationArn(String associationArn) {
        this.associationArn = associationArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the EKS Pod Identity association.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the EKS Pod Identity association.
     */

    public String getAssociationArn() {
        return this.associationArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the EKS Pod Identity association.
     * </p>
     * 
     * @param associationArn
     *        The Amazon Resource Name (ARN) of the EKS Pod Identity association.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PodIdentityAssociation withAssociationArn(String associationArn) {
        setAssociationArn(associationArn);
        return this;
    }

    /**
     * <p>
     * The ID of the association.
     * </p>
     * 
     * @param associationId
     *        The ID of the association.
     */

    public void setAssociationId(String associationId) {
        this.associationId = associationId;
    }

    /**
     * <p>
     * The ID of the association.
     * </p>
     * 
     * @return The ID of the association.
     */

    public String getAssociationId() {
        return this.associationId;
    }

    /**
     * <p>
     * The ID of the association.
     * </p>
     * 
     * @param associationId
     *        The ID of the association.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PodIdentityAssociation withAssociationId(String associationId) {
        setAssociationId(associationId);
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
        if (getAssociationArn() != null)
            sb.append("AssociationArn: ").append(getAssociationArn()).append(",");
        if (getAssociationId() != null)
            sb.append("AssociationId: ").append(getAssociationId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PodIdentityAssociation == false)
            return false;
        PodIdentityAssociation other = (PodIdentityAssociation) obj;
        if (other.getAssociationArn() == null ^ this.getAssociationArn() == null)
            return false;
        if (other.getAssociationArn() != null && other.getAssociationArn().equals(this.getAssociationArn()) == false)
            return false;
        if (other.getAssociationId() == null ^ this.getAssociationId() == null)
            return false;
        if (other.getAssociationId() != null && other.getAssociationId().equals(this.getAssociationId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAssociationArn() == null) ? 0 : getAssociationArn().hashCode());
        hashCode = prime * hashCode + ((getAssociationId() == null) ? 0 : getAssociationId().hashCode());
        return hashCode;
    }

    @Override
    public PodIdentityAssociation clone() {
        try {
            return (PodIdentityAssociation) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.eksauth.model.transform.PodIdentityAssociationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
