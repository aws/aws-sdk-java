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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceResult;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AssociateIpamByoasnResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The ASN and BYOIP CIDR association.
     * </p>
     */
    private AsnAssociation asnAssociation;

    /**
     * <p>
     * The ASN and BYOIP CIDR association.
     * </p>
     * 
     * @param asnAssociation
     *        The ASN and BYOIP CIDR association.
     */

    public void setAsnAssociation(AsnAssociation asnAssociation) {
        this.asnAssociation = asnAssociation;
    }

    /**
     * <p>
     * The ASN and BYOIP CIDR association.
     * </p>
     * 
     * @return The ASN and BYOIP CIDR association.
     */

    public AsnAssociation getAsnAssociation() {
        return this.asnAssociation;
    }

    /**
     * <p>
     * The ASN and BYOIP CIDR association.
     * </p>
     * 
     * @param asnAssociation
     *        The ASN and BYOIP CIDR association.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssociateIpamByoasnResult withAsnAssociation(AsnAssociation asnAssociation) {
        setAsnAssociation(asnAssociation);
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
        if (getAsnAssociation() != null)
            sb.append("AsnAssociation: ").append(getAsnAssociation());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AssociateIpamByoasnResult == false)
            return false;
        AssociateIpamByoasnResult other = (AssociateIpamByoasnResult) obj;
        if (other.getAsnAssociation() == null ^ this.getAsnAssociation() == null)
            return false;
        if (other.getAsnAssociation() != null && other.getAsnAssociation().equals(this.getAsnAssociation()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAsnAssociation() == null) ? 0 : getAsnAssociation().hashCode());
        return hashCode;
    }

    @Override
    public AssociateIpamByoasnResult clone() {
        try {
            return (AssociateIpamByoasnResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
