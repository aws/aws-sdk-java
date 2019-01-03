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
package com.amazonaws.services.clouddirectory.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains the <code>PolicyType</code>, <code>PolicyId</code>, and the <code>ObjectIdentifier</code> to which it is
 * attached. For more information, see <a href=
 * "https://docs.aws.amazon.com/clouddirectory/latest/developerguide/key_concepts_directory.html#key_concepts_policies"
 * >Policies</a>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/clouddirectory-2017-01-11/PolicyAttachment" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PolicyAttachment implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ID of <code>PolicyAttachment</code>.
     * </p>
     */
    private String policyId;
    /**
     * <p>
     * The <code>ObjectIdentifier</code> that is associated with <code>PolicyAttachment</code>.
     * </p>
     */
    private String objectIdentifier;
    /**
     * <p>
     * The type of policy that can be associated with <code>PolicyAttachment</code>.
     * </p>
     */
    private String policyType;

    /**
     * <p>
     * The ID of <code>PolicyAttachment</code>.
     * </p>
     * 
     * @param policyId
     *        The ID of <code>PolicyAttachment</code>.
     */

    public void setPolicyId(String policyId) {
        this.policyId = policyId;
    }

    /**
     * <p>
     * The ID of <code>PolicyAttachment</code>.
     * </p>
     * 
     * @return The ID of <code>PolicyAttachment</code>.
     */

    public String getPolicyId() {
        return this.policyId;
    }

    /**
     * <p>
     * The ID of <code>PolicyAttachment</code>.
     * </p>
     * 
     * @param policyId
     *        The ID of <code>PolicyAttachment</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PolicyAttachment withPolicyId(String policyId) {
        setPolicyId(policyId);
        return this;
    }

    /**
     * <p>
     * The <code>ObjectIdentifier</code> that is associated with <code>PolicyAttachment</code>.
     * </p>
     * 
     * @param objectIdentifier
     *        The <code>ObjectIdentifier</code> that is associated with <code>PolicyAttachment</code>.
     */

    public void setObjectIdentifier(String objectIdentifier) {
        this.objectIdentifier = objectIdentifier;
    }

    /**
     * <p>
     * The <code>ObjectIdentifier</code> that is associated with <code>PolicyAttachment</code>.
     * </p>
     * 
     * @return The <code>ObjectIdentifier</code> that is associated with <code>PolicyAttachment</code>.
     */

    public String getObjectIdentifier() {
        return this.objectIdentifier;
    }

    /**
     * <p>
     * The <code>ObjectIdentifier</code> that is associated with <code>PolicyAttachment</code>.
     * </p>
     * 
     * @param objectIdentifier
     *        The <code>ObjectIdentifier</code> that is associated with <code>PolicyAttachment</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PolicyAttachment withObjectIdentifier(String objectIdentifier) {
        setObjectIdentifier(objectIdentifier);
        return this;
    }

    /**
     * <p>
     * The type of policy that can be associated with <code>PolicyAttachment</code>.
     * </p>
     * 
     * @param policyType
     *        The type of policy that can be associated with <code>PolicyAttachment</code>.
     */

    public void setPolicyType(String policyType) {
        this.policyType = policyType;
    }

    /**
     * <p>
     * The type of policy that can be associated with <code>PolicyAttachment</code>.
     * </p>
     * 
     * @return The type of policy that can be associated with <code>PolicyAttachment</code>.
     */

    public String getPolicyType() {
        return this.policyType;
    }

    /**
     * <p>
     * The type of policy that can be associated with <code>PolicyAttachment</code>.
     * </p>
     * 
     * @param policyType
     *        The type of policy that can be associated with <code>PolicyAttachment</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PolicyAttachment withPolicyType(String policyType) {
        setPolicyType(policyType);
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
        if (getPolicyId() != null)
            sb.append("PolicyId: ").append(getPolicyId()).append(",");
        if (getObjectIdentifier() != null)
            sb.append("ObjectIdentifier: ").append(getObjectIdentifier()).append(",");
        if (getPolicyType() != null)
            sb.append("PolicyType: ").append(getPolicyType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PolicyAttachment == false)
            return false;
        PolicyAttachment other = (PolicyAttachment) obj;
        if (other.getPolicyId() == null ^ this.getPolicyId() == null)
            return false;
        if (other.getPolicyId() != null && other.getPolicyId().equals(this.getPolicyId()) == false)
            return false;
        if (other.getObjectIdentifier() == null ^ this.getObjectIdentifier() == null)
            return false;
        if (other.getObjectIdentifier() != null && other.getObjectIdentifier().equals(this.getObjectIdentifier()) == false)
            return false;
        if (other.getPolicyType() == null ^ this.getPolicyType() == null)
            return false;
        if (other.getPolicyType() != null && other.getPolicyType().equals(this.getPolicyType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPolicyId() == null) ? 0 : getPolicyId().hashCode());
        hashCode = prime * hashCode + ((getObjectIdentifier() == null) ? 0 : getObjectIdentifier().hashCode());
        hashCode = prime * hashCode + ((getPolicyType() == null) ? 0 : getPolicyType().hashCode());
        return hashCode;
    }

    @Override
    public PolicyAttachment clone() {
        try {
            return (PolicyAttachment) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.clouddirectory.model.transform.PolicyAttachmentMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
