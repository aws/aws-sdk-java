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
package com.amazonaws.services.networkfirewall.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/network-firewall-2020-11-12/DescribeFirewallPolicy"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeFirewallPolicyResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A token used for optimistic locking. Network Firewall returns a token to your requests that access the firewall
     * policy. The token marks the state of the policy resource at the time of the request.
     * </p>
     * <p>
     * To make changes to the policy, you provide the token in your request. Network Firewall uses the token to ensure
     * that the policy hasn't changed since you last retrieved it. If it has changed, the operation fails with an
     * <code>InvalidTokenException</code>. If this happens, retrieve the firewall policy again to get a current copy of
     * it with current token. Reapply your changes as needed, then try the operation again using the new token.
     * </p>
     */
    private String updateToken;
    /**
     * <p>
     * The high-level properties of a firewall policy. This, along with the <a>FirewallPolicy</a>, define the policy.
     * You can retrieve all objects for a firewall policy by calling <a>DescribeFirewallPolicy</a>.
     * </p>
     */
    private FirewallPolicyResponse firewallPolicyResponse;
    /**
     * <p>
     * The policy for the specified firewall policy.
     * </p>
     */
    private FirewallPolicy firewallPolicy;

    /**
     * <p>
     * A token used for optimistic locking. Network Firewall returns a token to your requests that access the firewall
     * policy. The token marks the state of the policy resource at the time of the request.
     * </p>
     * <p>
     * To make changes to the policy, you provide the token in your request. Network Firewall uses the token to ensure
     * that the policy hasn't changed since you last retrieved it. If it has changed, the operation fails with an
     * <code>InvalidTokenException</code>. If this happens, retrieve the firewall policy again to get a current copy of
     * it with current token. Reapply your changes as needed, then try the operation again using the new token.
     * </p>
     * 
     * @param updateToken
     *        A token used for optimistic locking. Network Firewall returns a token to your requests that access the
     *        firewall policy. The token marks the state of the policy resource at the time of the request. </p>
     *        <p>
     *        To make changes to the policy, you provide the token in your request. Network Firewall uses the token to
     *        ensure that the policy hasn't changed since you last retrieved it. If it has changed, the operation fails
     *        with an <code>InvalidTokenException</code>. If this happens, retrieve the firewall policy again to get a
     *        current copy of it with current token. Reapply your changes as needed, then try the operation again using
     *        the new token.
     */

    public void setUpdateToken(String updateToken) {
        this.updateToken = updateToken;
    }

    /**
     * <p>
     * A token used for optimistic locking. Network Firewall returns a token to your requests that access the firewall
     * policy. The token marks the state of the policy resource at the time of the request.
     * </p>
     * <p>
     * To make changes to the policy, you provide the token in your request. Network Firewall uses the token to ensure
     * that the policy hasn't changed since you last retrieved it. If it has changed, the operation fails with an
     * <code>InvalidTokenException</code>. If this happens, retrieve the firewall policy again to get a current copy of
     * it with current token. Reapply your changes as needed, then try the operation again using the new token.
     * </p>
     * 
     * @return A token used for optimistic locking. Network Firewall returns a token to your requests that access the
     *         firewall policy. The token marks the state of the policy resource at the time of the request. </p>
     *         <p>
     *         To make changes to the policy, you provide the token in your request. Network Firewall uses the token to
     *         ensure that the policy hasn't changed since you last retrieved it. If it has changed, the operation fails
     *         with an <code>InvalidTokenException</code>. If this happens, retrieve the firewall policy again to get a
     *         current copy of it with current token. Reapply your changes as needed, then try the operation again using
     *         the new token.
     */

    public String getUpdateToken() {
        return this.updateToken;
    }

    /**
     * <p>
     * A token used for optimistic locking. Network Firewall returns a token to your requests that access the firewall
     * policy. The token marks the state of the policy resource at the time of the request.
     * </p>
     * <p>
     * To make changes to the policy, you provide the token in your request. Network Firewall uses the token to ensure
     * that the policy hasn't changed since you last retrieved it. If it has changed, the operation fails with an
     * <code>InvalidTokenException</code>. If this happens, retrieve the firewall policy again to get a current copy of
     * it with current token. Reapply your changes as needed, then try the operation again using the new token.
     * </p>
     * 
     * @param updateToken
     *        A token used for optimistic locking. Network Firewall returns a token to your requests that access the
     *        firewall policy. The token marks the state of the policy resource at the time of the request. </p>
     *        <p>
     *        To make changes to the policy, you provide the token in your request. Network Firewall uses the token to
     *        ensure that the policy hasn't changed since you last retrieved it. If it has changed, the operation fails
     *        with an <code>InvalidTokenException</code>. If this happens, retrieve the firewall policy again to get a
     *        current copy of it with current token. Reapply your changes as needed, then try the operation again using
     *        the new token.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeFirewallPolicyResult withUpdateToken(String updateToken) {
        setUpdateToken(updateToken);
        return this;
    }

    /**
     * <p>
     * The high-level properties of a firewall policy. This, along with the <a>FirewallPolicy</a>, define the policy.
     * You can retrieve all objects for a firewall policy by calling <a>DescribeFirewallPolicy</a>.
     * </p>
     * 
     * @param firewallPolicyResponse
     *        The high-level properties of a firewall policy. This, along with the <a>FirewallPolicy</a>, define the
     *        policy. You can retrieve all objects for a firewall policy by calling <a>DescribeFirewallPolicy</a>.
     */

    public void setFirewallPolicyResponse(FirewallPolicyResponse firewallPolicyResponse) {
        this.firewallPolicyResponse = firewallPolicyResponse;
    }

    /**
     * <p>
     * The high-level properties of a firewall policy. This, along with the <a>FirewallPolicy</a>, define the policy.
     * You can retrieve all objects for a firewall policy by calling <a>DescribeFirewallPolicy</a>.
     * </p>
     * 
     * @return The high-level properties of a firewall policy. This, along with the <a>FirewallPolicy</a>, define the
     *         policy. You can retrieve all objects for a firewall policy by calling <a>DescribeFirewallPolicy</a>.
     */

    public FirewallPolicyResponse getFirewallPolicyResponse() {
        return this.firewallPolicyResponse;
    }

    /**
     * <p>
     * The high-level properties of a firewall policy. This, along with the <a>FirewallPolicy</a>, define the policy.
     * You can retrieve all objects for a firewall policy by calling <a>DescribeFirewallPolicy</a>.
     * </p>
     * 
     * @param firewallPolicyResponse
     *        The high-level properties of a firewall policy. This, along with the <a>FirewallPolicy</a>, define the
     *        policy. You can retrieve all objects for a firewall policy by calling <a>DescribeFirewallPolicy</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeFirewallPolicyResult withFirewallPolicyResponse(FirewallPolicyResponse firewallPolicyResponse) {
        setFirewallPolicyResponse(firewallPolicyResponse);
        return this;
    }

    /**
     * <p>
     * The policy for the specified firewall policy.
     * </p>
     * 
     * @param firewallPolicy
     *        The policy for the specified firewall policy.
     */

    public void setFirewallPolicy(FirewallPolicy firewallPolicy) {
        this.firewallPolicy = firewallPolicy;
    }

    /**
     * <p>
     * The policy for the specified firewall policy.
     * </p>
     * 
     * @return The policy for the specified firewall policy.
     */

    public FirewallPolicy getFirewallPolicy() {
        return this.firewallPolicy;
    }

    /**
     * <p>
     * The policy for the specified firewall policy.
     * </p>
     * 
     * @param firewallPolicy
     *        The policy for the specified firewall policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeFirewallPolicyResult withFirewallPolicy(FirewallPolicy firewallPolicy) {
        setFirewallPolicy(firewallPolicy);
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
        if (getUpdateToken() != null)
            sb.append("UpdateToken: ").append(getUpdateToken()).append(",");
        if (getFirewallPolicyResponse() != null)
            sb.append("FirewallPolicyResponse: ").append(getFirewallPolicyResponse()).append(",");
        if (getFirewallPolicy() != null)
            sb.append("FirewallPolicy: ").append(getFirewallPolicy());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeFirewallPolicyResult == false)
            return false;
        DescribeFirewallPolicyResult other = (DescribeFirewallPolicyResult) obj;
        if (other.getUpdateToken() == null ^ this.getUpdateToken() == null)
            return false;
        if (other.getUpdateToken() != null && other.getUpdateToken().equals(this.getUpdateToken()) == false)
            return false;
        if (other.getFirewallPolicyResponse() == null ^ this.getFirewallPolicyResponse() == null)
            return false;
        if (other.getFirewallPolicyResponse() != null && other.getFirewallPolicyResponse().equals(this.getFirewallPolicyResponse()) == false)
            return false;
        if (other.getFirewallPolicy() == null ^ this.getFirewallPolicy() == null)
            return false;
        if (other.getFirewallPolicy() != null && other.getFirewallPolicy().equals(this.getFirewallPolicy()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getUpdateToken() == null) ? 0 : getUpdateToken().hashCode());
        hashCode = prime * hashCode + ((getFirewallPolicyResponse() == null) ? 0 : getFirewallPolicyResponse().hashCode());
        hashCode = prime * hashCode + ((getFirewallPolicy() == null) ? 0 : getFirewallPolicy().hashCode());
        return hashCode;
    }

    @Override
    public DescribeFirewallPolicyResult clone() {
        try {
            return (DescribeFirewallPolicyResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
