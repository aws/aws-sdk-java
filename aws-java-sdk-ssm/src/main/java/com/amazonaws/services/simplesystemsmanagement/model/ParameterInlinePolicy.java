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
package com.amazonaws.services.simplesystemsmanagement.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * One or more policies assigned to a parameter.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/ParameterInlinePolicy" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ParameterInlinePolicy implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The JSON text of the policy.
     * </p>
     */
    private String policyText;
    /**
     * <p>
     * The type of policy. Parameter Store supports the following policy types: Expiration, ExpirationNotification, and
     * NoChangeNotification.
     * </p>
     */
    private String policyType;
    /**
     * <p>
     * The status of the policy. Policies report the following statuses: Pending (the policy has not been enforced or
     * applied yet), Finished (the policy was applied), Failed (the policy was not applied), or InProgress (the policy
     * is being applied now).
     * </p>
     */
    private String policyStatus;

    /**
     * <p>
     * The JSON text of the policy.
     * </p>
     * 
     * @param policyText
     *        The JSON text of the policy.
     */

    public void setPolicyText(String policyText) {
        this.policyText = policyText;
    }

    /**
     * <p>
     * The JSON text of the policy.
     * </p>
     * 
     * @return The JSON text of the policy.
     */

    public String getPolicyText() {
        return this.policyText;
    }

    /**
     * <p>
     * The JSON text of the policy.
     * </p>
     * 
     * @param policyText
     *        The JSON text of the policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ParameterInlinePolicy withPolicyText(String policyText) {
        setPolicyText(policyText);
        return this;
    }

    /**
     * <p>
     * The type of policy. Parameter Store supports the following policy types: Expiration, ExpirationNotification, and
     * NoChangeNotification.
     * </p>
     * 
     * @param policyType
     *        The type of policy. Parameter Store supports the following policy types: Expiration,
     *        ExpirationNotification, and NoChangeNotification.
     */

    public void setPolicyType(String policyType) {
        this.policyType = policyType;
    }

    /**
     * <p>
     * The type of policy. Parameter Store supports the following policy types: Expiration, ExpirationNotification, and
     * NoChangeNotification.
     * </p>
     * 
     * @return The type of policy. Parameter Store supports the following policy types: Expiration,
     *         ExpirationNotification, and NoChangeNotification.
     */

    public String getPolicyType() {
        return this.policyType;
    }

    /**
     * <p>
     * The type of policy. Parameter Store supports the following policy types: Expiration, ExpirationNotification, and
     * NoChangeNotification.
     * </p>
     * 
     * @param policyType
     *        The type of policy. Parameter Store supports the following policy types: Expiration,
     *        ExpirationNotification, and NoChangeNotification.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ParameterInlinePolicy withPolicyType(String policyType) {
        setPolicyType(policyType);
        return this;
    }

    /**
     * <p>
     * The status of the policy. Policies report the following statuses: Pending (the policy has not been enforced or
     * applied yet), Finished (the policy was applied), Failed (the policy was not applied), or InProgress (the policy
     * is being applied now).
     * </p>
     * 
     * @param policyStatus
     *        The status of the policy. Policies report the following statuses: Pending (the policy has not been
     *        enforced or applied yet), Finished (the policy was applied), Failed (the policy was not applied), or
     *        InProgress (the policy is being applied now).
     */

    public void setPolicyStatus(String policyStatus) {
        this.policyStatus = policyStatus;
    }

    /**
     * <p>
     * The status of the policy. Policies report the following statuses: Pending (the policy has not been enforced or
     * applied yet), Finished (the policy was applied), Failed (the policy was not applied), or InProgress (the policy
     * is being applied now).
     * </p>
     * 
     * @return The status of the policy. Policies report the following statuses: Pending (the policy has not been
     *         enforced or applied yet), Finished (the policy was applied), Failed (the policy was not applied), or
     *         InProgress (the policy is being applied now).
     */

    public String getPolicyStatus() {
        return this.policyStatus;
    }

    /**
     * <p>
     * The status of the policy. Policies report the following statuses: Pending (the policy has not been enforced or
     * applied yet), Finished (the policy was applied), Failed (the policy was not applied), or InProgress (the policy
     * is being applied now).
     * </p>
     * 
     * @param policyStatus
     *        The status of the policy. Policies report the following statuses: Pending (the policy has not been
     *        enforced or applied yet), Finished (the policy was applied), Failed (the policy was not applied), or
     *        InProgress (the policy is being applied now).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ParameterInlinePolicy withPolicyStatus(String policyStatus) {
        setPolicyStatus(policyStatus);
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
        if (getPolicyText() != null)
            sb.append("PolicyText: ").append(getPolicyText()).append(",");
        if (getPolicyType() != null)
            sb.append("PolicyType: ").append(getPolicyType()).append(",");
        if (getPolicyStatus() != null)
            sb.append("PolicyStatus: ").append(getPolicyStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ParameterInlinePolicy == false)
            return false;
        ParameterInlinePolicy other = (ParameterInlinePolicy) obj;
        if (other.getPolicyText() == null ^ this.getPolicyText() == null)
            return false;
        if (other.getPolicyText() != null && other.getPolicyText().equals(this.getPolicyText()) == false)
            return false;
        if (other.getPolicyType() == null ^ this.getPolicyType() == null)
            return false;
        if (other.getPolicyType() != null && other.getPolicyType().equals(this.getPolicyType()) == false)
            return false;
        if (other.getPolicyStatus() == null ^ this.getPolicyStatus() == null)
            return false;
        if (other.getPolicyStatus() != null && other.getPolicyStatus().equals(this.getPolicyStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPolicyText() == null) ? 0 : getPolicyText().hashCode());
        hashCode = prime * hashCode + ((getPolicyType() == null) ? 0 : getPolicyType().hashCode());
        hashCode = prime * hashCode + ((getPolicyStatus() == null) ? 0 : getPolicyStatus().hashCode());
        return hashCode;
    }

    @Override
    public ParameterInlinePolicy clone() {
        try {
            return (ParameterInlinePolicy) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.simplesystemsmanagement.model.transform.ParameterInlinePolicyMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
