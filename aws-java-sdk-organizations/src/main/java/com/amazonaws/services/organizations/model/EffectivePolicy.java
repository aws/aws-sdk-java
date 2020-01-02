/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.organizations.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains rules to be applied to the affected accounts. The effective policy is the aggregation of any policies the
 * account inherits, plus any policy directly attached to the account.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/organizations-2016-11-28/EffectivePolicy" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EffectivePolicy implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The text content of the policy.
     * </p>
     */
    private String policyContent;
    /**
     * <p>
     * The time of the last update to this policy.
     * </p>
     */
    private java.util.Date lastUpdatedTimestamp;
    /**
     * <p>
     * The account ID of the policy target.
     * </p>
     */
    private String targetId;
    /**
     * <p>
     * The policy type.
     * </p>
     */
    private String policyType;

    /**
     * <p>
     * The text content of the policy.
     * </p>
     * 
     * @param policyContent
     *        The text content of the policy.
     */

    public void setPolicyContent(String policyContent) {
        this.policyContent = policyContent;
    }

    /**
     * <p>
     * The text content of the policy.
     * </p>
     * 
     * @return The text content of the policy.
     */

    public String getPolicyContent() {
        return this.policyContent;
    }

    /**
     * <p>
     * The text content of the policy.
     * </p>
     * 
     * @param policyContent
     *        The text content of the policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EffectivePolicy withPolicyContent(String policyContent) {
        setPolicyContent(policyContent);
        return this;
    }

    /**
     * <p>
     * The time of the last update to this policy.
     * </p>
     * 
     * @param lastUpdatedTimestamp
     *        The time of the last update to this policy.
     */

    public void setLastUpdatedTimestamp(java.util.Date lastUpdatedTimestamp) {
        this.lastUpdatedTimestamp = lastUpdatedTimestamp;
    }

    /**
     * <p>
     * The time of the last update to this policy.
     * </p>
     * 
     * @return The time of the last update to this policy.
     */

    public java.util.Date getLastUpdatedTimestamp() {
        return this.lastUpdatedTimestamp;
    }

    /**
     * <p>
     * The time of the last update to this policy.
     * </p>
     * 
     * @param lastUpdatedTimestamp
     *        The time of the last update to this policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EffectivePolicy withLastUpdatedTimestamp(java.util.Date lastUpdatedTimestamp) {
        setLastUpdatedTimestamp(lastUpdatedTimestamp);
        return this;
    }

    /**
     * <p>
     * The account ID of the policy target.
     * </p>
     * 
     * @param targetId
     *        The account ID of the policy target.
     */

    public void setTargetId(String targetId) {
        this.targetId = targetId;
    }

    /**
     * <p>
     * The account ID of the policy target.
     * </p>
     * 
     * @return The account ID of the policy target.
     */

    public String getTargetId() {
        return this.targetId;
    }

    /**
     * <p>
     * The account ID of the policy target.
     * </p>
     * 
     * @param targetId
     *        The account ID of the policy target.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EffectivePolicy withTargetId(String targetId) {
        setTargetId(targetId);
        return this;
    }

    /**
     * <p>
     * The policy type.
     * </p>
     * 
     * @param policyType
     *        The policy type.
     * @see EffectivePolicyType
     */

    public void setPolicyType(String policyType) {
        this.policyType = policyType;
    }

    /**
     * <p>
     * The policy type.
     * </p>
     * 
     * @return The policy type.
     * @see EffectivePolicyType
     */

    public String getPolicyType() {
        return this.policyType;
    }

    /**
     * <p>
     * The policy type.
     * </p>
     * 
     * @param policyType
     *        The policy type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EffectivePolicyType
     */

    public EffectivePolicy withPolicyType(String policyType) {
        setPolicyType(policyType);
        return this;
    }

    /**
     * <p>
     * The policy type.
     * </p>
     * 
     * @param policyType
     *        The policy type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EffectivePolicyType
     */

    public EffectivePolicy withPolicyType(EffectivePolicyType policyType) {
        this.policyType = policyType.toString();
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
        if (getPolicyContent() != null)
            sb.append("PolicyContent: ").append(getPolicyContent()).append(",");
        if (getLastUpdatedTimestamp() != null)
            sb.append("LastUpdatedTimestamp: ").append(getLastUpdatedTimestamp()).append(",");
        if (getTargetId() != null)
            sb.append("TargetId: ").append(getTargetId()).append(",");
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

        if (obj instanceof EffectivePolicy == false)
            return false;
        EffectivePolicy other = (EffectivePolicy) obj;
        if (other.getPolicyContent() == null ^ this.getPolicyContent() == null)
            return false;
        if (other.getPolicyContent() != null && other.getPolicyContent().equals(this.getPolicyContent()) == false)
            return false;
        if (other.getLastUpdatedTimestamp() == null ^ this.getLastUpdatedTimestamp() == null)
            return false;
        if (other.getLastUpdatedTimestamp() != null && other.getLastUpdatedTimestamp().equals(this.getLastUpdatedTimestamp()) == false)
            return false;
        if (other.getTargetId() == null ^ this.getTargetId() == null)
            return false;
        if (other.getTargetId() != null && other.getTargetId().equals(this.getTargetId()) == false)
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

        hashCode = prime * hashCode + ((getPolicyContent() == null) ? 0 : getPolicyContent().hashCode());
        hashCode = prime * hashCode + ((getLastUpdatedTimestamp() == null) ? 0 : getLastUpdatedTimestamp().hashCode());
        hashCode = prime * hashCode + ((getTargetId() == null) ? 0 : getTargetId().hashCode());
        hashCode = prime * hashCode + ((getPolicyType() == null) ? 0 : getPolicyType().hashCode());
        return hashCode;
    }

    @Override
    public EffectivePolicy clone() {
        try {
            return (EffectivePolicy) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.organizations.model.transform.EffectivePolicyMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
