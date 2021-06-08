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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/network-firewall-2020-11-12/UpdateFirewallPolicy"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateFirewallPolicyRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

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
     * The Amazon Resource Name (ARN) of the firewall policy.
     * </p>
     * <p>
     * You must specify the ARN or the name, and you can specify both.
     * </p>
     */
    private String firewallPolicyArn;
    /**
     * <p>
     * The descriptive name of the firewall policy. You can't change the name of a firewall policy after you create it.
     * </p>
     * <p>
     * You must specify the ARN or the name, and you can specify both.
     * </p>
     */
    private String firewallPolicyName;
    /**
     * <p>
     * The updated firewall policy to use for the firewall.
     * </p>
     */
    private FirewallPolicy firewallPolicy;
    /**
     * <p>
     * A description of the firewall policy.
     * </p>
     */
    private String description;
    /**
     * <p>
     * Indicates whether you want Network Firewall to just check the validity of the request, rather than run the
     * request.
     * </p>
     * <p>
     * If set to <code>TRUE</code>, Network Firewall checks whether the request can run successfully, but doesn't
     * actually make the requested changes. The call returns the value that the request would return if you ran it with
     * dry run set to <code>FALSE</code>, but doesn't make additions or changes to your resources. This option allows
     * you to make sure that you have the required permissions to run the request and that your request parameters are
     * valid.
     * </p>
     * <p>
     * If set to <code>FALSE</code>, Network Firewall makes the requested changes to your resources.
     * </p>
     */
    private Boolean dryRun;

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

    public UpdateFirewallPolicyRequest withUpdateToken(String updateToken) {
        setUpdateToken(updateToken);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the firewall policy.
     * </p>
     * <p>
     * You must specify the ARN or the name, and you can specify both.
     * </p>
     * 
     * @param firewallPolicyArn
     *        The Amazon Resource Name (ARN) of the firewall policy.</p>
     *        <p>
     *        You must specify the ARN or the name, and you can specify both.
     */

    public void setFirewallPolicyArn(String firewallPolicyArn) {
        this.firewallPolicyArn = firewallPolicyArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the firewall policy.
     * </p>
     * <p>
     * You must specify the ARN or the name, and you can specify both.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the firewall policy.</p>
     *         <p>
     *         You must specify the ARN or the name, and you can specify both.
     */

    public String getFirewallPolicyArn() {
        return this.firewallPolicyArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the firewall policy.
     * </p>
     * <p>
     * You must specify the ARN or the name, and you can specify both.
     * </p>
     * 
     * @param firewallPolicyArn
     *        The Amazon Resource Name (ARN) of the firewall policy.</p>
     *        <p>
     *        You must specify the ARN or the name, and you can specify both.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateFirewallPolicyRequest withFirewallPolicyArn(String firewallPolicyArn) {
        setFirewallPolicyArn(firewallPolicyArn);
        return this;
    }

    /**
     * <p>
     * The descriptive name of the firewall policy. You can't change the name of a firewall policy after you create it.
     * </p>
     * <p>
     * You must specify the ARN or the name, and you can specify both.
     * </p>
     * 
     * @param firewallPolicyName
     *        The descriptive name of the firewall policy. You can't change the name of a firewall policy after you
     *        create it.</p>
     *        <p>
     *        You must specify the ARN or the name, and you can specify both.
     */

    public void setFirewallPolicyName(String firewallPolicyName) {
        this.firewallPolicyName = firewallPolicyName;
    }

    /**
     * <p>
     * The descriptive name of the firewall policy. You can't change the name of a firewall policy after you create it.
     * </p>
     * <p>
     * You must specify the ARN or the name, and you can specify both.
     * </p>
     * 
     * @return The descriptive name of the firewall policy. You can't change the name of a firewall policy after you
     *         create it.</p>
     *         <p>
     *         You must specify the ARN or the name, and you can specify both.
     */

    public String getFirewallPolicyName() {
        return this.firewallPolicyName;
    }

    /**
     * <p>
     * The descriptive name of the firewall policy. You can't change the name of a firewall policy after you create it.
     * </p>
     * <p>
     * You must specify the ARN or the name, and you can specify both.
     * </p>
     * 
     * @param firewallPolicyName
     *        The descriptive name of the firewall policy. You can't change the name of a firewall policy after you
     *        create it.</p>
     *        <p>
     *        You must specify the ARN or the name, and you can specify both.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateFirewallPolicyRequest withFirewallPolicyName(String firewallPolicyName) {
        setFirewallPolicyName(firewallPolicyName);
        return this;
    }

    /**
     * <p>
     * The updated firewall policy to use for the firewall.
     * </p>
     * 
     * @param firewallPolicy
     *        The updated firewall policy to use for the firewall.
     */

    public void setFirewallPolicy(FirewallPolicy firewallPolicy) {
        this.firewallPolicy = firewallPolicy;
    }

    /**
     * <p>
     * The updated firewall policy to use for the firewall.
     * </p>
     * 
     * @return The updated firewall policy to use for the firewall.
     */

    public FirewallPolicy getFirewallPolicy() {
        return this.firewallPolicy;
    }

    /**
     * <p>
     * The updated firewall policy to use for the firewall.
     * </p>
     * 
     * @param firewallPolicy
     *        The updated firewall policy to use for the firewall.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateFirewallPolicyRequest withFirewallPolicy(FirewallPolicy firewallPolicy) {
        setFirewallPolicy(firewallPolicy);
        return this;
    }

    /**
     * <p>
     * A description of the firewall policy.
     * </p>
     * 
     * @param description
     *        A description of the firewall policy.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description of the firewall policy.
     * </p>
     * 
     * @return A description of the firewall policy.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A description of the firewall policy.
     * </p>
     * 
     * @param description
     *        A description of the firewall policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateFirewallPolicyRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * Indicates whether you want Network Firewall to just check the validity of the request, rather than run the
     * request.
     * </p>
     * <p>
     * If set to <code>TRUE</code>, Network Firewall checks whether the request can run successfully, but doesn't
     * actually make the requested changes. The call returns the value that the request would return if you ran it with
     * dry run set to <code>FALSE</code>, but doesn't make additions or changes to your resources. This option allows
     * you to make sure that you have the required permissions to run the request and that your request parameters are
     * valid.
     * </p>
     * <p>
     * If set to <code>FALSE</code>, Network Firewall makes the requested changes to your resources.
     * </p>
     * 
     * @param dryRun
     *        Indicates whether you want Network Firewall to just check the validity of the request, rather than run the
     *        request. </p>
     *        <p>
     *        If set to <code>TRUE</code>, Network Firewall checks whether the request can run successfully, but doesn't
     *        actually make the requested changes. The call returns the value that the request would return if you ran
     *        it with dry run set to <code>FALSE</code>, but doesn't make additions or changes to your resources. This
     *        option allows you to make sure that you have the required permissions to run the request and that your
     *        request parameters are valid.
     *        </p>
     *        <p>
     *        If set to <code>FALSE</code>, Network Firewall makes the requested changes to your resources.
     */

    public void setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
    }

    /**
     * <p>
     * Indicates whether you want Network Firewall to just check the validity of the request, rather than run the
     * request.
     * </p>
     * <p>
     * If set to <code>TRUE</code>, Network Firewall checks whether the request can run successfully, but doesn't
     * actually make the requested changes. The call returns the value that the request would return if you ran it with
     * dry run set to <code>FALSE</code>, but doesn't make additions or changes to your resources. This option allows
     * you to make sure that you have the required permissions to run the request and that your request parameters are
     * valid.
     * </p>
     * <p>
     * If set to <code>FALSE</code>, Network Firewall makes the requested changes to your resources.
     * </p>
     * 
     * @return Indicates whether you want Network Firewall to just check the validity of the request, rather than run
     *         the request. </p>
     *         <p>
     *         If set to <code>TRUE</code>, Network Firewall checks whether the request can run successfully, but
     *         doesn't actually make the requested changes. The call returns the value that the request would return if
     *         you ran it with dry run set to <code>FALSE</code>, but doesn't make additions or changes to your
     *         resources. This option allows you to make sure that you have the required permissions to run the request
     *         and that your request parameters are valid.
     *         </p>
     *         <p>
     *         If set to <code>FALSE</code>, Network Firewall makes the requested changes to your resources.
     */

    public Boolean getDryRun() {
        return this.dryRun;
    }

    /**
     * <p>
     * Indicates whether you want Network Firewall to just check the validity of the request, rather than run the
     * request.
     * </p>
     * <p>
     * If set to <code>TRUE</code>, Network Firewall checks whether the request can run successfully, but doesn't
     * actually make the requested changes. The call returns the value that the request would return if you ran it with
     * dry run set to <code>FALSE</code>, but doesn't make additions or changes to your resources. This option allows
     * you to make sure that you have the required permissions to run the request and that your request parameters are
     * valid.
     * </p>
     * <p>
     * If set to <code>FALSE</code>, Network Firewall makes the requested changes to your resources.
     * </p>
     * 
     * @param dryRun
     *        Indicates whether you want Network Firewall to just check the validity of the request, rather than run the
     *        request. </p>
     *        <p>
     *        If set to <code>TRUE</code>, Network Firewall checks whether the request can run successfully, but doesn't
     *        actually make the requested changes. The call returns the value that the request would return if you ran
     *        it with dry run set to <code>FALSE</code>, but doesn't make additions or changes to your resources. This
     *        option allows you to make sure that you have the required permissions to run the request and that your
     *        request parameters are valid.
     *        </p>
     *        <p>
     *        If set to <code>FALSE</code>, Network Firewall makes the requested changes to your resources.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateFirewallPolicyRequest withDryRun(Boolean dryRun) {
        setDryRun(dryRun);
        return this;
    }

    /**
     * <p>
     * Indicates whether you want Network Firewall to just check the validity of the request, rather than run the
     * request.
     * </p>
     * <p>
     * If set to <code>TRUE</code>, Network Firewall checks whether the request can run successfully, but doesn't
     * actually make the requested changes. The call returns the value that the request would return if you ran it with
     * dry run set to <code>FALSE</code>, but doesn't make additions or changes to your resources. This option allows
     * you to make sure that you have the required permissions to run the request and that your request parameters are
     * valid.
     * </p>
     * <p>
     * If set to <code>FALSE</code>, Network Firewall makes the requested changes to your resources.
     * </p>
     * 
     * @return Indicates whether you want Network Firewall to just check the validity of the request, rather than run
     *         the request. </p>
     *         <p>
     *         If set to <code>TRUE</code>, Network Firewall checks whether the request can run successfully, but
     *         doesn't actually make the requested changes. The call returns the value that the request would return if
     *         you ran it with dry run set to <code>FALSE</code>, but doesn't make additions or changes to your
     *         resources. This option allows you to make sure that you have the required permissions to run the request
     *         and that your request parameters are valid.
     *         </p>
     *         <p>
     *         If set to <code>FALSE</code>, Network Firewall makes the requested changes to your resources.
     */

    public Boolean isDryRun() {
        return this.dryRun;
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
        if (getFirewallPolicyArn() != null)
            sb.append("FirewallPolicyArn: ").append(getFirewallPolicyArn()).append(",");
        if (getFirewallPolicyName() != null)
            sb.append("FirewallPolicyName: ").append(getFirewallPolicyName()).append(",");
        if (getFirewallPolicy() != null)
            sb.append("FirewallPolicy: ").append(getFirewallPolicy()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getDryRun() != null)
            sb.append("DryRun: ").append(getDryRun());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateFirewallPolicyRequest == false)
            return false;
        UpdateFirewallPolicyRequest other = (UpdateFirewallPolicyRequest) obj;
        if (other.getUpdateToken() == null ^ this.getUpdateToken() == null)
            return false;
        if (other.getUpdateToken() != null && other.getUpdateToken().equals(this.getUpdateToken()) == false)
            return false;
        if (other.getFirewallPolicyArn() == null ^ this.getFirewallPolicyArn() == null)
            return false;
        if (other.getFirewallPolicyArn() != null && other.getFirewallPolicyArn().equals(this.getFirewallPolicyArn()) == false)
            return false;
        if (other.getFirewallPolicyName() == null ^ this.getFirewallPolicyName() == null)
            return false;
        if (other.getFirewallPolicyName() != null && other.getFirewallPolicyName().equals(this.getFirewallPolicyName()) == false)
            return false;
        if (other.getFirewallPolicy() == null ^ this.getFirewallPolicy() == null)
            return false;
        if (other.getFirewallPolicy() != null && other.getFirewallPolicy().equals(this.getFirewallPolicy()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getDryRun() == null ^ this.getDryRun() == null)
            return false;
        if (other.getDryRun() != null && other.getDryRun().equals(this.getDryRun()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getUpdateToken() == null) ? 0 : getUpdateToken().hashCode());
        hashCode = prime * hashCode + ((getFirewallPolicyArn() == null) ? 0 : getFirewallPolicyArn().hashCode());
        hashCode = prime * hashCode + ((getFirewallPolicyName() == null) ? 0 : getFirewallPolicyName().hashCode());
        hashCode = prime * hashCode + ((getFirewallPolicy() == null) ? 0 : getFirewallPolicy().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getDryRun() == null) ? 0 : getDryRun().hashCode());
        return hashCode;
    }

    @Override
    public UpdateFirewallPolicyRequest clone() {
        return (UpdateFirewallPolicyRequest) super.clone();
    }

}
