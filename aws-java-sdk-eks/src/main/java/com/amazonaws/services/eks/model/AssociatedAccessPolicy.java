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
package com.amazonaws.services.eks.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An access policy association.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eks-2017-11-01/AssociatedAccessPolicy" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AssociatedAccessPolicy implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ARN of the <code>AccessPolicy</code>.
     * </p>
     */
    private String policyArn;
    /**
     * <p>
     * The scope of the access policy.
     * </p>
     */
    private AccessScope accessScope;
    /**
     * <p>
     * The date and time the <code>AccessPolicy</code> was associated with an <code>AccessEntry</code>.
     * </p>
     */
    private java.util.Date associatedAt;
    /**
     * <p>
     * The Unix epoch timestamp for the last modification to the object.
     * </p>
     */
    private java.util.Date modifiedAt;

    /**
     * <p>
     * The ARN of the <code>AccessPolicy</code>.
     * </p>
     * 
     * @param policyArn
     *        The ARN of the <code>AccessPolicy</code>.
     */

    public void setPolicyArn(String policyArn) {
        this.policyArn = policyArn;
    }

    /**
     * <p>
     * The ARN of the <code>AccessPolicy</code>.
     * </p>
     * 
     * @return The ARN of the <code>AccessPolicy</code>.
     */

    public String getPolicyArn() {
        return this.policyArn;
    }

    /**
     * <p>
     * The ARN of the <code>AccessPolicy</code>.
     * </p>
     * 
     * @param policyArn
     *        The ARN of the <code>AccessPolicy</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssociatedAccessPolicy withPolicyArn(String policyArn) {
        setPolicyArn(policyArn);
        return this;
    }

    /**
     * <p>
     * The scope of the access policy.
     * </p>
     * 
     * @param accessScope
     *        The scope of the access policy.
     */

    public void setAccessScope(AccessScope accessScope) {
        this.accessScope = accessScope;
    }

    /**
     * <p>
     * The scope of the access policy.
     * </p>
     * 
     * @return The scope of the access policy.
     */

    public AccessScope getAccessScope() {
        return this.accessScope;
    }

    /**
     * <p>
     * The scope of the access policy.
     * </p>
     * 
     * @param accessScope
     *        The scope of the access policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssociatedAccessPolicy withAccessScope(AccessScope accessScope) {
        setAccessScope(accessScope);
        return this;
    }

    /**
     * <p>
     * The date and time the <code>AccessPolicy</code> was associated with an <code>AccessEntry</code>.
     * </p>
     * 
     * @param associatedAt
     *        The date and time the <code>AccessPolicy</code> was associated with an <code>AccessEntry</code>.
     */

    public void setAssociatedAt(java.util.Date associatedAt) {
        this.associatedAt = associatedAt;
    }

    /**
     * <p>
     * The date and time the <code>AccessPolicy</code> was associated with an <code>AccessEntry</code>.
     * </p>
     * 
     * @return The date and time the <code>AccessPolicy</code> was associated with an <code>AccessEntry</code>.
     */

    public java.util.Date getAssociatedAt() {
        return this.associatedAt;
    }

    /**
     * <p>
     * The date and time the <code>AccessPolicy</code> was associated with an <code>AccessEntry</code>.
     * </p>
     * 
     * @param associatedAt
     *        The date and time the <code>AccessPolicy</code> was associated with an <code>AccessEntry</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssociatedAccessPolicy withAssociatedAt(java.util.Date associatedAt) {
        setAssociatedAt(associatedAt);
        return this;
    }

    /**
     * <p>
     * The Unix epoch timestamp for the last modification to the object.
     * </p>
     * 
     * @param modifiedAt
     *        The Unix epoch timestamp for the last modification to the object.
     */

    public void setModifiedAt(java.util.Date modifiedAt) {
        this.modifiedAt = modifiedAt;
    }

    /**
     * <p>
     * The Unix epoch timestamp for the last modification to the object.
     * </p>
     * 
     * @return The Unix epoch timestamp for the last modification to the object.
     */

    public java.util.Date getModifiedAt() {
        return this.modifiedAt;
    }

    /**
     * <p>
     * The Unix epoch timestamp for the last modification to the object.
     * </p>
     * 
     * @param modifiedAt
     *        The Unix epoch timestamp for the last modification to the object.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssociatedAccessPolicy withModifiedAt(java.util.Date modifiedAt) {
        setModifiedAt(modifiedAt);
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
        if (getPolicyArn() != null)
            sb.append("PolicyArn: ").append(getPolicyArn()).append(",");
        if (getAccessScope() != null)
            sb.append("AccessScope: ").append(getAccessScope()).append(",");
        if (getAssociatedAt() != null)
            sb.append("AssociatedAt: ").append(getAssociatedAt()).append(",");
        if (getModifiedAt() != null)
            sb.append("ModifiedAt: ").append(getModifiedAt());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AssociatedAccessPolicy == false)
            return false;
        AssociatedAccessPolicy other = (AssociatedAccessPolicy) obj;
        if (other.getPolicyArn() == null ^ this.getPolicyArn() == null)
            return false;
        if (other.getPolicyArn() != null && other.getPolicyArn().equals(this.getPolicyArn()) == false)
            return false;
        if (other.getAccessScope() == null ^ this.getAccessScope() == null)
            return false;
        if (other.getAccessScope() != null && other.getAccessScope().equals(this.getAccessScope()) == false)
            return false;
        if (other.getAssociatedAt() == null ^ this.getAssociatedAt() == null)
            return false;
        if (other.getAssociatedAt() != null && other.getAssociatedAt().equals(this.getAssociatedAt()) == false)
            return false;
        if (other.getModifiedAt() == null ^ this.getModifiedAt() == null)
            return false;
        if (other.getModifiedAt() != null && other.getModifiedAt().equals(this.getModifiedAt()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPolicyArn() == null) ? 0 : getPolicyArn().hashCode());
        hashCode = prime * hashCode + ((getAccessScope() == null) ? 0 : getAccessScope().hashCode());
        hashCode = prime * hashCode + ((getAssociatedAt() == null) ? 0 : getAssociatedAt().hashCode());
        hashCode = prime * hashCode + ((getModifiedAt() == null) ? 0 : getModifiedAt().hashCode());
        return hashCode;
    }

    @Override
    public AssociatedAccessPolicy clone() {
        try {
            return (AssociatedAccessPolicy) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.eks.model.transform.AssociatedAccessPolicyMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
