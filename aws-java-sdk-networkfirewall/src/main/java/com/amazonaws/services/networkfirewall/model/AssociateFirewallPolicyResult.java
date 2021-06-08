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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/network-firewall-2020-11-12/AssociateFirewallPolicy"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AssociateFirewallPolicyResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the firewall.
     * </p>
     */
    private String firewallArn;
    /**
     * <p>
     * The descriptive name of the firewall. You can't change the name of a firewall after you create it.
     * </p>
     */
    private String firewallName;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the firewall policy.
     * </p>
     */
    private String firewallPolicyArn;
    /**
     * <p>
     * An optional token that you can use for optimistic locking. Network Firewall returns a token to your requests that
     * access the firewall. The token marks the state of the firewall resource at the time of the request.
     * </p>
     * <p>
     * To make an unconditional change to the firewall, omit the token in your update request. Without the token,
     * Network Firewall performs your updates regardless of whether the firewall has changed since you last retrieved
     * it.
     * </p>
     * <p>
     * To make a conditional change to the firewall, provide the token in your update request. Network Firewall uses the
     * token to ensure that the firewall hasn't changed since you last retrieved it. If it has changed, the operation
     * fails with an <code>InvalidTokenException</code>. If this happens, retrieve the firewall again to get a current
     * copy of it with a new token. Reapply your changes as needed, then try the operation again using the new token.
     * </p>
     */
    private String updateToken;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the firewall.
     * </p>
     * 
     * @param firewallArn
     *        The Amazon Resource Name (ARN) of the firewall.
     */

    public void setFirewallArn(String firewallArn) {
        this.firewallArn = firewallArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the firewall.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the firewall.
     */

    public String getFirewallArn() {
        return this.firewallArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the firewall.
     * </p>
     * 
     * @param firewallArn
     *        The Amazon Resource Name (ARN) of the firewall.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssociateFirewallPolicyResult withFirewallArn(String firewallArn) {
        setFirewallArn(firewallArn);
        return this;
    }

    /**
     * <p>
     * The descriptive name of the firewall. You can't change the name of a firewall after you create it.
     * </p>
     * 
     * @param firewallName
     *        The descriptive name of the firewall. You can't change the name of a firewall after you create it.
     */

    public void setFirewallName(String firewallName) {
        this.firewallName = firewallName;
    }

    /**
     * <p>
     * The descriptive name of the firewall. You can't change the name of a firewall after you create it.
     * </p>
     * 
     * @return The descriptive name of the firewall. You can't change the name of a firewall after you create it.
     */

    public String getFirewallName() {
        return this.firewallName;
    }

    /**
     * <p>
     * The descriptive name of the firewall. You can't change the name of a firewall after you create it.
     * </p>
     * 
     * @param firewallName
     *        The descriptive name of the firewall. You can't change the name of a firewall after you create it.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssociateFirewallPolicyResult withFirewallName(String firewallName) {
        setFirewallName(firewallName);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the firewall policy.
     * </p>
     * 
     * @param firewallPolicyArn
     *        The Amazon Resource Name (ARN) of the firewall policy.
     */

    public void setFirewallPolicyArn(String firewallPolicyArn) {
        this.firewallPolicyArn = firewallPolicyArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the firewall policy.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the firewall policy.
     */

    public String getFirewallPolicyArn() {
        return this.firewallPolicyArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the firewall policy.
     * </p>
     * 
     * @param firewallPolicyArn
     *        The Amazon Resource Name (ARN) of the firewall policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssociateFirewallPolicyResult withFirewallPolicyArn(String firewallPolicyArn) {
        setFirewallPolicyArn(firewallPolicyArn);
        return this;
    }

    /**
     * <p>
     * An optional token that you can use for optimistic locking. Network Firewall returns a token to your requests that
     * access the firewall. The token marks the state of the firewall resource at the time of the request.
     * </p>
     * <p>
     * To make an unconditional change to the firewall, omit the token in your update request. Without the token,
     * Network Firewall performs your updates regardless of whether the firewall has changed since you last retrieved
     * it.
     * </p>
     * <p>
     * To make a conditional change to the firewall, provide the token in your update request. Network Firewall uses the
     * token to ensure that the firewall hasn't changed since you last retrieved it. If it has changed, the operation
     * fails with an <code>InvalidTokenException</code>. If this happens, retrieve the firewall again to get a current
     * copy of it with a new token. Reapply your changes as needed, then try the operation again using the new token.
     * </p>
     * 
     * @param updateToken
     *        An optional token that you can use for optimistic locking. Network Firewall returns a token to your
     *        requests that access the firewall. The token marks the state of the firewall resource at the time of the
     *        request. </p>
     *        <p>
     *        To make an unconditional change to the firewall, omit the token in your update request. Without the token,
     *        Network Firewall performs your updates regardless of whether the firewall has changed since you last
     *        retrieved it.
     *        </p>
     *        <p>
     *        To make a conditional change to the firewall, provide the token in your update request. Network Firewall
     *        uses the token to ensure that the firewall hasn't changed since you last retrieved it. If it has changed,
     *        the operation fails with an <code>InvalidTokenException</code>. If this happens, retrieve the firewall
     *        again to get a current copy of it with a new token. Reapply your changes as needed, then try the operation
     *        again using the new token.
     */

    public void setUpdateToken(String updateToken) {
        this.updateToken = updateToken;
    }

    /**
     * <p>
     * An optional token that you can use for optimistic locking. Network Firewall returns a token to your requests that
     * access the firewall. The token marks the state of the firewall resource at the time of the request.
     * </p>
     * <p>
     * To make an unconditional change to the firewall, omit the token in your update request. Without the token,
     * Network Firewall performs your updates regardless of whether the firewall has changed since you last retrieved
     * it.
     * </p>
     * <p>
     * To make a conditional change to the firewall, provide the token in your update request. Network Firewall uses the
     * token to ensure that the firewall hasn't changed since you last retrieved it. If it has changed, the operation
     * fails with an <code>InvalidTokenException</code>. If this happens, retrieve the firewall again to get a current
     * copy of it with a new token. Reapply your changes as needed, then try the operation again using the new token.
     * </p>
     * 
     * @return An optional token that you can use for optimistic locking. Network Firewall returns a token to your
     *         requests that access the firewall. The token marks the state of the firewall resource at the time of the
     *         request. </p>
     *         <p>
     *         To make an unconditional change to the firewall, omit the token in your update request. Without the
     *         token, Network Firewall performs your updates regardless of whether the firewall has changed since you
     *         last retrieved it.
     *         </p>
     *         <p>
     *         To make a conditional change to the firewall, provide the token in your update request. Network Firewall
     *         uses the token to ensure that the firewall hasn't changed since you last retrieved it. If it has changed,
     *         the operation fails with an <code>InvalidTokenException</code>. If this happens, retrieve the firewall
     *         again to get a current copy of it with a new token. Reapply your changes as needed, then try the
     *         operation again using the new token.
     */

    public String getUpdateToken() {
        return this.updateToken;
    }

    /**
     * <p>
     * An optional token that you can use for optimistic locking. Network Firewall returns a token to your requests that
     * access the firewall. The token marks the state of the firewall resource at the time of the request.
     * </p>
     * <p>
     * To make an unconditional change to the firewall, omit the token in your update request. Without the token,
     * Network Firewall performs your updates regardless of whether the firewall has changed since you last retrieved
     * it.
     * </p>
     * <p>
     * To make a conditional change to the firewall, provide the token in your update request. Network Firewall uses the
     * token to ensure that the firewall hasn't changed since you last retrieved it. If it has changed, the operation
     * fails with an <code>InvalidTokenException</code>. If this happens, retrieve the firewall again to get a current
     * copy of it with a new token. Reapply your changes as needed, then try the operation again using the new token.
     * </p>
     * 
     * @param updateToken
     *        An optional token that you can use for optimistic locking. Network Firewall returns a token to your
     *        requests that access the firewall. The token marks the state of the firewall resource at the time of the
     *        request. </p>
     *        <p>
     *        To make an unconditional change to the firewall, omit the token in your update request. Without the token,
     *        Network Firewall performs your updates regardless of whether the firewall has changed since you last
     *        retrieved it.
     *        </p>
     *        <p>
     *        To make a conditional change to the firewall, provide the token in your update request. Network Firewall
     *        uses the token to ensure that the firewall hasn't changed since you last retrieved it. If it has changed,
     *        the operation fails with an <code>InvalidTokenException</code>. If this happens, retrieve the firewall
     *        again to get a current copy of it with a new token. Reapply your changes as needed, then try the operation
     *        again using the new token.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssociateFirewallPolicyResult withUpdateToken(String updateToken) {
        setUpdateToken(updateToken);
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
        if (getFirewallArn() != null)
            sb.append("FirewallArn: ").append(getFirewallArn()).append(",");
        if (getFirewallName() != null)
            sb.append("FirewallName: ").append(getFirewallName()).append(",");
        if (getFirewallPolicyArn() != null)
            sb.append("FirewallPolicyArn: ").append(getFirewallPolicyArn()).append(",");
        if (getUpdateToken() != null)
            sb.append("UpdateToken: ").append(getUpdateToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AssociateFirewallPolicyResult == false)
            return false;
        AssociateFirewallPolicyResult other = (AssociateFirewallPolicyResult) obj;
        if (other.getFirewallArn() == null ^ this.getFirewallArn() == null)
            return false;
        if (other.getFirewallArn() != null && other.getFirewallArn().equals(this.getFirewallArn()) == false)
            return false;
        if (other.getFirewallName() == null ^ this.getFirewallName() == null)
            return false;
        if (other.getFirewallName() != null && other.getFirewallName().equals(this.getFirewallName()) == false)
            return false;
        if (other.getFirewallPolicyArn() == null ^ this.getFirewallPolicyArn() == null)
            return false;
        if (other.getFirewallPolicyArn() != null && other.getFirewallPolicyArn().equals(this.getFirewallPolicyArn()) == false)
            return false;
        if (other.getUpdateToken() == null ^ this.getUpdateToken() == null)
            return false;
        if (other.getUpdateToken() != null && other.getUpdateToken().equals(this.getUpdateToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFirewallArn() == null) ? 0 : getFirewallArn().hashCode());
        hashCode = prime * hashCode + ((getFirewallName() == null) ? 0 : getFirewallName().hashCode());
        hashCode = prime * hashCode + ((getFirewallPolicyArn() == null) ? 0 : getFirewallPolicyArn().hashCode());
        hashCode = prime * hashCode + ((getUpdateToken() == null) ? 0 : getUpdateToken().hashCode());
        return hashCode;
    }

    @Override
    public AssociateFirewallPolicyResult clone() {
        try {
            return (AssociateFirewallPolicyResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
