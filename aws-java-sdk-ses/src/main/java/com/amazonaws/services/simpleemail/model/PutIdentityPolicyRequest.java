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
package com.amazonaws.services.simpleemail.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Represents a request to add or update a sending authorization policy for an identity. Sending authorization is an
 * Amazon SES feature that enables you to authorize other senders to use your identities. For information, see the <a
 * href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/sending-authorization.html">Amazon SES Developer
 * Guide</a>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/email-2010-12-01/PutIdentityPolicy" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PutIdentityPolicyRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The identity that the policy will apply to. You can specify an identity by using its name or by using its Amazon
     * Resource Name (ARN). Examples: <code>user@example.com</code>, <code>example.com</code>,
     * <code>arn:aws:ses:us-east-1:123456789012:identity/example.com</code>.
     * </p>
     * <p>
     * To successfully call this API, you must own the identity.
     * </p>
     */
    private String identity;
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
     * The text of the policy in JSON format. The policy cannot exceed 4 KB.
     * </p>
     * <p>
     * For information about the syntax of sending authorization policies, see the <a
     * href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/sending-authorization-policies.html">Amazon SES
     * Developer Guide</a>.
     * </p>
     */
    private String policy;

    /**
     * <p>
     * The identity that the policy will apply to. You can specify an identity by using its name or by using its Amazon
     * Resource Name (ARN). Examples: <code>user@example.com</code>, <code>example.com</code>,
     * <code>arn:aws:ses:us-east-1:123456789012:identity/example.com</code>.
     * </p>
     * <p>
     * To successfully call this API, you must own the identity.
     * </p>
     * 
     * @param identity
     *        The identity that the policy will apply to. You can specify an identity by using its name or by using its
     *        Amazon Resource Name (ARN). Examples: <code>user@example.com</code>, <code>example.com</code>,
     *        <code>arn:aws:ses:us-east-1:123456789012:identity/example.com</code>.</p>
     *        <p>
     *        To successfully call this API, you must own the identity.
     */

    public void setIdentity(String identity) {
        this.identity = identity;
    }

    /**
     * <p>
     * The identity that the policy will apply to. You can specify an identity by using its name or by using its Amazon
     * Resource Name (ARN). Examples: <code>user@example.com</code>, <code>example.com</code>,
     * <code>arn:aws:ses:us-east-1:123456789012:identity/example.com</code>.
     * </p>
     * <p>
     * To successfully call this API, you must own the identity.
     * </p>
     * 
     * @return The identity that the policy will apply to. You can specify an identity by using its name or by using its
     *         Amazon Resource Name (ARN). Examples: <code>user@example.com</code>, <code>example.com</code>,
     *         <code>arn:aws:ses:us-east-1:123456789012:identity/example.com</code>.</p>
     *         <p>
     *         To successfully call this API, you must own the identity.
     */

    public String getIdentity() {
        return this.identity;
    }

    /**
     * <p>
     * The identity that the policy will apply to. You can specify an identity by using its name or by using its Amazon
     * Resource Name (ARN). Examples: <code>user@example.com</code>, <code>example.com</code>,
     * <code>arn:aws:ses:us-east-1:123456789012:identity/example.com</code>.
     * </p>
     * <p>
     * To successfully call this API, you must own the identity.
     * </p>
     * 
     * @param identity
     *        The identity that the policy will apply to. You can specify an identity by using its name or by using its
     *        Amazon Resource Name (ARN). Examples: <code>user@example.com</code>, <code>example.com</code>,
     *        <code>arn:aws:ses:us-east-1:123456789012:identity/example.com</code>.</p>
     *        <p>
     *        To successfully call this API, you must own the identity.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutIdentityPolicyRequest withIdentity(String identity) {
        setIdentity(identity);
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

    public PutIdentityPolicyRequest withPolicyName(String policyName) {
        setPolicyName(policyName);
        return this;
    }

    /**
     * <p>
     * The text of the policy in JSON format. The policy cannot exceed 4 KB.
     * </p>
     * <p>
     * For information about the syntax of sending authorization policies, see the <a
     * href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/sending-authorization-policies.html">Amazon SES
     * Developer Guide</a>.
     * </p>
     * 
     * @param policy
     *        The text of the policy in JSON format. The policy cannot exceed 4 KB.</p>
     *        <p>
     *        For information about the syntax of sending authorization policies, see the <a
     *        href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/sending-authorization-policies.html">Amazon SES
     *        Developer Guide</a>.
     */

    public void setPolicy(String policy) {
        this.policy = policy;
    }

    /**
     * <p>
     * The text of the policy in JSON format. The policy cannot exceed 4 KB.
     * </p>
     * <p>
     * For information about the syntax of sending authorization policies, see the <a
     * href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/sending-authorization-policies.html">Amazon SES
     * Developer Guide</a>.
     * </p>
     * 
     * @return The text of the policy in JSON format. The policy cannot exceed 4 KB.</p>
     *         <p>
     *         For information about the syntax of sending authorization policies, see the <a
     *         href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/sending-authorization-policies.html">Amazon
     *         SES Developer Guide</a>.
     */

    public String getPolicy() {
        return this.policy;
    }

    /**
     * <p>
     * The text of the policy in JSON format. The policy cannot exceed 4 KB.
     * </p>
     * <p>
     * For information about the syntax of sending authorization policies, see the <a
     * href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/sending-authorization-policies.html">Amazon SES
     * Developer Guide</a>.
     * </p>
     * 
     * @param policy
     *        The text of the policy in JSON format. The policy cannot exceed 4 KB.</p>
     *        <p>
     *        For information about the syntax of sending authorization policies, see the <a
     *        href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/sending-authorization-policies.html">Amazon SES
     *        Developer Guide</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutIdentityPolicyRequest withPolicy(String policy) {
        setPolicy(policy);
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
        if (getIdentity() != null)
            sb.append("Identity: ").append(getIdentity()).append(",");
        if (getPolicyName() != null)
            sb.append("PolicyName: ").append(getPolicyName()).append(",");
        if (getPolicy() != null)
            sb.append("Policy: ").append(getPolicy());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutIdentityPolicyRequest == false)
            return false;
        PutIdentityPolicyRequest other = (PutIdentityPolicyRequest) obj;
        if (other.getIdentity() == null ^ this.getIdentity() == null)
            return false;
        if (other.getIdentity() != null && other.getIdentity().equals(this.getIdentity()) == false)
            return false;
        if (other.getPolicyName() == null ^ this.getPolicyName() == null)
            return false;
        if (other.getPolicyName() != null && other.getPolicyName().equals(this.getPolicyName()) == false)
            return false;
        if (other.getPolicy() == null ^ this.getPolicy() == null)
            return false;
        if (other.getPolicy() != null && other.getPolicy().equals(this.getPolicy()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIdentity() == null) ? 0 : getIdentity().hashCode());
        hashCode = prime * hashCode + ((getPolicyName() == null) ? 0 : getPolicyName().hashCode());
        hashCode = prime * hashCode + ((getPolicy() == null) ? 0 : getPolicy().hashCode());
        return hashCode;
    }

    @Override
    public PutIdentityPolicyRequest clone() {
        return (PutIdentityPolicyRequest) super.clone();
    }

}
