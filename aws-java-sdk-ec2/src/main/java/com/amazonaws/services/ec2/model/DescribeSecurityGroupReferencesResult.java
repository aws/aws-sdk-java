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
public class DescribeSecurityGroupReferencesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * Information about the VPCs with the referencing security groups.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<SecurityGroupReference> securityGroupReferenceSet;

    /**
     * <p>
     * Information about the VPCs with the referencing security groups.
     * </p>
     * 
     * @return Information about the VPCs with the referencing security groups.
     */

    public java.util.List<SecurityGroupReference> getSecurityGroupReferenceSet() {
        if (securityGroupReferenceSet == null) {
            securityGroupReferenceSet = new com.amazonaws.internal.SdkInternalList<SecurityGroupReference>();
        }
        return securityGroupReferenceSet;
    }

    /**
     * <p>
     * Information about the VPCs with the referencing security groups.
     * </p>
     * 
     * @param securityGroupReferenceSet
     *        Information about the VPCs with the referencing security groups.
     */

    public void setSecurityGroupReferenceSet(java.util.Collection<SecurityGroupReference> securityGroupReferenceSet) {
        if (securityGroupReferenceSet == null) {
            this.securityGroupReferenceSet = null;
            return;
        }

        this.securityGroupReferenceSet = new com.amazonaws.internal.SdkInternalList<SecurityGroupReference>(securityGroupReferenceSet);
    }

    /**
     * <p>
     * Information about the VPCs with the referencing security groups.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSecurityGroupReferenceSet(java.util.Collection)} or
     * {@link #withSecurityGroupReferenceSet(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param securityGroupReferenceSet
     *        Information about the VPCs with the referencing security groups.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeSecurityGroupReferencesResult withSecurityGroupReferenceSet(SecurityGroupReference... securityGroupReferenceSet) {
        if (this.securityGroupReferenceSet == null) {
            setSecurityGroupReferenceSet(new com.amazonaws.internal.SdkInternalList<SecurityGroupReference>(securityGroupReferenceSet.length));
        }
        for (SecurityGroupReference ele : securityGroupReferenceSet) {
            this.securityGroupReferenceSet.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Information about the VPCs with the referencing security groups.
     * </p>
     * 
     * @param securityGroupReferenceSet
     *        Information about the VPCs with the referencing security groups.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeSecurityGroupReferencesResult withSecurityGroupReferenceSet(java.util.Collection<SecurityGroupReference> securityGroupReferenceSet) {
        setSecurityGroupReferenceSet(securityGroupReferenceSet);
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
        if (getSecurityGroupReferenceSet() != null)
            sb.append("SecurityGroupReferenceSet: ").append(getSecurityGroupReferenceSet());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeSecurityGroupReferencesResult == false)
            return false;
        DescribeSecurityGroupReferencesResult other = (DescribeSecurityGroupReferencesResult) obj;
        if (other.getSecurityGroupReferenceSet() == null ^ this.getSecurityGroupReferenceSet() == null)
            return false;
        if (other.getSecurityGroupReferenceSet() != null && other.getSecurityGroupReferenceSet().equals(this.getSecurityGroupReferenceSet()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSecurityGroupReferenceSet() == null) ? 0 : getSecurityGroupReferenceSet().hashCode());
        return hashCode;
    }

    @Override
    public DescribeSecurityGroupReferencesResult clone() {
        try {
            return (DescribeSecurityGroupReferencesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
