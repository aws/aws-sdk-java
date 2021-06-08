/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
public class GetAssociatedEnclaveCertificateIamRolesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements
        Serializable, Cloneable {

    /**
     * <p>
     * Information about the associated IAM roles.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<AssociatedRole> associatedRoles;

    /**
     * <p>
     * Information about the associated IAM roles.
     * </p>
     * 
     * @return Information about the associated IAM roles.
     */

    public java.util.List<AssociatedRole> getAssociatedRoles() {
        if (associatedRoles == null) {
            associatedRoles = new com.amazonaws.internal.SdkInternalList<AssociatedRole>();
        }
        return associatedRoles;
    }

    /**
     * <p>
     * Information about the associated IAM roles.
     * </p>
     * 
     * @param associatedRoles
     *        Information about the associated IAM roles.
     */

    public void setAssociatedRoles(java.util.Collection<AssociatedRole> associatedRoles) {
        if (associatedRoles == null) {
            this.associatedRoles = null;
            return;
        }

        this.associatedRoles = new com.amazonaws.internal.SdkInternalList<AssociatedRole>(associatedRoles);
    }

    /**
     * <p>
     * Information about the associated IAM roles.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAssociatedRoles(java.util.Collection)} or {@link #withAssociatedRoles(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param associatedRoles
     *        Information about the associated IAM roles.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAssociatedEnclaveCertificateIamRolesResult withAssociatedRoles(AssociatedRole... associatedRoles) {
        if (this.associatedRoles == null) {
            setAssociatedRoles(new com.amazonaws.internal.SdkInternalList<AssociatedRole>(associatedRoles.length));
        }
        for (AssociatedRole ele : associatedRoles) {
            this.associatedRoles.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Information about the associated IAM roles.
     * </p>
     * 
     * @param associatedRoles
     *        Information about the associated IAM roles.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAssociatedEnclaveCertificateIamRolesResult withAssociatedRoles(java.util.Collection<AssociatedRole> associatedRoles) {
        setAssociatedRoles(associatedRoles);
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
        if (getAssociatedRoles() != null)
            sb.append("AssociatedRoles: ").append(getAssociatedRoles());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetAssociatedEnclaveCertificateIamRolesResult == false)
            return false;
        GetAssociatedEnclaveCertificateIamRolesResult other = (GetAssociatedEnclaveCertificateIamRolesResult) obj;
        if (other.getAssociatedRoles() == null ^ this.getAssociatedRoles() == null)
            return false;
        if (other.getAssociatedRoles() != null && other.getAssociatedRoles().equals(this.getAssociatedRoles()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAssociatedRoles() == null) ? 0 : getAssociatedRoles().hashCode());
        return hashCode;
    }

    @Override
    public GetAssociatedEnclaveCertificateIamRolesResult clone() {
        try {
            return (GetAssociatedEnclaveCertificateIamRolesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
