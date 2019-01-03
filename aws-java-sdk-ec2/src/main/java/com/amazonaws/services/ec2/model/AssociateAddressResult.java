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
public class AssociateAddressResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * [EC2-VPC] The ID that represents the association of the Elastic IP address with an instance.
     * </p>
     */
    private String associationId;

    /**
     * <p>
     * [EC2-VPC] The ID that represents the association of the Elastic IP address with an instance.
     * </p>
     * 
     * @param associationId
     *        [EC2-VPC] The ID that represents the association of the Elastic IP address with an instance.
     */

    public void setAssociationId(String associationId) {
        this.associationId = associationId;
    }

    /**
     * <p>
     * [EC2-VPC] The ID that represents the association of the Elastic IP address with an instance.
     * </p>
     * 
     * @return [EC2-VPC] The ID that represents the association of the Elastic IP address with an instance.
     */

    public String getAssociationId() {
        return this.associationId;
    }

    /**
     * <p>
     * [EC2-VPC] The ID that represents the association of the Elastic IP address with an instance.
     * </p>
     * 
     * @param associationId
     *        [EC2-VPC] The ID that represents the association of the Elastic IP address with an instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssociateAddressResult withAssociationId(String associationId) {
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

        if (obj instanceof AssociateAddressResult == false)
            return false;
        AssociateAddressResult other = (AssociateAddressResult) obj;
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

        hashCode = prime * hashCode + ((getAssociationId() == null) ? 0 : getAssociationId().hashCode());
        return hashCode;
    }

    @Override
    public AssociateAddressResult clone() {
        try {
            return (AssociateAddressResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
