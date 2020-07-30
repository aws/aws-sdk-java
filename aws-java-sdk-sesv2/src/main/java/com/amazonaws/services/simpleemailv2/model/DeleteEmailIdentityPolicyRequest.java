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
package com.amazonaws.services.simpleemailv2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Represents a request to delete a sending authorization policy for an identity. Sending authorization is an Amazon SES
 * feature that enables you to authorize other senders to use your identities. For information, see the <a href=
 * "https://docs.aws.amazon.com/ses/latest/DeveloperGuide/sending-authorization-identity-owner-tasks-management.html"
 * >Amazon SES Developer Guide</a>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sesv2-2019-09-27/DeleteEmailIdentityPolicy" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteEmailIdentityPolicyRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The email identity for which you want to delete a policy.
     * </p>
     */
    private String emailIdentity;
    /**
     * <p>
     * The name of the policy.
     * </p>
     * <p>
     * The policy name cannot exceed 64 characters and can only include alphanumeric characters, dashes, and
     * underscores.
     * </p>
     */
    private String policyName;

    /**
     * <p>
     * The email identity for which you want to delete a policy.
     * </p>
     * 
     * @param emailIdentity
     *        The email identity for which you want to delete a policy.
     */

    public void setEmailIdentity(String emailIdentity) {
        this.emailIdentity = emailIdentity;
    }

    /**
     * <p>
     * The email identity for which you want to delete a policy.
     * </p>
     * 
     * @return The email identity for which you want to delete a policy.
     */

    public String getEmailIdentity() {
        return this.emailIdentity;
    }

    /**
     * <p>
     * The email identity for which you want to delete a policy.
     * </p>
     * 
     * @param emailIdentity
     *        The email identity for which you want to delete a policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteEmailIdentityPolicyRequest withEmailIdentity(String emailIdentity) {
        setEmailIdentity(emailIdentity);
        return this;
    }

    /**
     * <p>
     * The name of the policy.
     * </p>
     * <p>
     * The policy name cannot exceed 64 characters and can only include alphanumeric characters, dashes, and
     * underscores.
     * </p>
     * 
     * @param policyName
     *        The name of the policy.</p>
     *        <p>
     *        The policy name cannot exceed 64 characters and can only include alphanumeric characters, dashes, and
     *        underscores.
     */

    public void setPolicyName(String policyName) {
        this.policyName = policyName;
    }

    /**
     * <p>
     * The name of the policy.
     * </p>
     * <p>
     * The policy name cannot exceed 64 characters and can only include alphanumeric characters, dashes, and
     * underscores.
     * </p>
     * 
     * @return The name of the policy.</p>
     *         <p>
     *         The policy name cannot exceed 64 characters and can only include alphanumeric characters, dashes, and
     *         underscores.
     */

    public String getPolicyName() {
        return this.policyName;
    }

    /**
     * <p>
     * The name of the policy.
     * </p>
     * <p>
     * The policy name cannot exceed 64 characters and can only include alphanumeric characters, dashes, and
     * underscores.
     * </p>
     * 
     * @param policyName
     *        The name of the policy.</p>
     *        <p>
     *        The policy name cannot exceed 64 characters and can only include alphanumeric characters, dashes, and
     *        underscores.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteEmailIdentityPolicyRequest withPolicyName(String policyName) {
        setPolicyName(policyName);
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
        if (getEmailIdentity() != null)
            sb.append("EmailIdentity: ").append(getEmailIdentity()).append(",");
        if (getPolicyName() != null)
            sb.append("PolicyName: ").append(getPolicyName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteEmailIdentityPolicyRequest == false)
            return false;
        DeleteEmailIdentityPolicyRequest other = (DeleteEmailIdentityPolicyRequest) obj;
        if (other.getEmailIdentity() == null ^ this.getEmailIdentity() == null)
            return false;
        if (other.getEmailIdentity() != null && other.getEmailIdentity().equals(this.getEmailIdentity()) == false)
            return false;
        if (other.getPolicyName() == null ^ this.getPolicyName() == null)
            return false;
        if (other.getPolicyName() != null && other.getPolicyName().equals(this.getPolicyName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEmailIdentity() == null) ? 0 : getEmailIdentity().hashCode());
        hashCode = prime * hashCode + ((getPolicyName() == null) ? 0 : getPolicyName().hashCode());
        return hashCode;
    }

    @Override
    public DeleteEmailIdentityPolicyRequest clone() {
        return (DeleteEmailIdentityPolicyRequest) super.clone();
    }

}
