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
package com.amazonaws.services.wafv2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wafv2-2019-07-29/DeleteFirewallManagerRuleGroups"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteFirewallManagerRuleGroupsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the web ACL.
     * </p>
     */
    private String webACLArn;
    /**
     * <p>
     * A token used for optimistic locking. AWS WAF returns a token to your get and list requests, to mark the state of
     * the entity at the time of the request. To make changes to the entity associated with the token, you provide the
     * token to operations like update and delete. AWS WAF uses the token to ensure that no changes have been made to
     * the entity since you last retrieved it. If a change has been made, the update fails with a
     * <code>WAFOptimisticLockException</code>. If this happens, perform another get, and use the new token returned by
     * that operation.
     * </p>
     */
    private String webACLLockToken;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the web ACL.
     * </p>
     * 
     * @param webACLArn
     *        The Amazon Resource Name (ARN) of the web ACL.
     */

    public void setWebACLArn(String webACLArn) {
        this.webACLArn = webACLArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the web ACL.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the web ACL.
     */

    public String getWebACLArn() {
        return this.webACLArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the web ACL.
     * </p>
     * 
     * @param webACLArn
     *        The Amazon Resource Name (ARN) of the web ACL.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteFirewallManagerRuleGroupsRequest withWebACLArn(String webACLArn) {
        setWebACLArn(webACLArn);
        return this;
    }

    /**
     * <p>
     * A token used for optimistic locking. AWS WAF returns a token to your get and list requests, to mark the state of
     * the entity at the time of the request. To make changes to the entity associated with the token, you provide the
     * token to operations like update and delete. AWS WAF uses the token to ensure that no changes have been made to
     * the entity since you last retrieved it. If a change has been made, the update fails with a
     * <code>WAFOptimisticLockException</code>. If this happens, perform another get, and use the new token returned by
     * that operation.
     * </p>
     * 
     * @param webACLLockToken
     *        A token used for optimistic locking. AWS WAF returns a token to your get and list requests, to mark the
     *        state of the entity at the time of the request. To make changes to the entity associated with the token,
     *        you provide the token to operations like update and delete. AWS WAF uses the token to ensure that no
     *        changes have been made to the entity since you last retrieved it. If a change has been made, the update
     *        fails with a <code>WAFOptimisticLockException</code>. If this happens, perform another get, and use the
     *        new token returned by that operation.
     */

    public void setWebACLLockToken(String webACLLockToken) {
        this.webACLLockToken = webACLLockToken;
    }

    /**
     * <p>
     * A token used for optimistic locking. AWS WAF returns a token to your get and list requests, to mark the state of
     * the entity at the time of the request. To make changes to the entity associated with the token, you provide the
     * token to operations like update and delete. AWS WAF uses the token to ensure that no changes have been made to
     * the entity since you last retrieved it. If a change has been made, the update fails with a
     * <code>WAFOptimisticLockException</code>. If this happens, perform another get, and use the new token returned by
     * that operation.
     * </p>
     * 
     * @return A token used for optimistic locking. AWS WAF returns a token to your get and list requests, to mark the
     *         state of the entity at the time of the request. To make changes to the entity associated with the token,
     *         you provide the token to operations like update and delete. AWS WAF uses the token to ensure that no
     *         changes have been made to the entity since you last retrieved it. If a change has been made, the update
     *         fails with a <code>WAFOptimisticLockException</code>. If this happens, perform another get, and use the
     *         new token returned by that operation.
     */

    public String getWebACLLockToken() {
        return this.webACLLockToken;
    }

    /**
     * <p>
     * A token used for optimistic locking. AWS WAF returns a token to your get and list requests, to mark the state of
     * the entity at the time of the request. To make changes to the entity associated with the token, you provide the
     * token to operations like update and delete. AWS WAF uses the token to ensure that no changes have been made to
     * the entity since you last retrieved it. If a change has been made, the update fails with a
     * <code>WAFOptimisticLockException</code>. If this happens, perform another get, and use the new token returned by
     * that operation.
     * </p>
     * 
     * @param webACLLockToken
     *        A token used for optimistic locking. AWS WAF returns a token to your get and list requests, to mark the
     *        state of the entity at the time of the request. To make changes to the entity associated with the token,
     *        you provide the token to operations like update and delete. AWS WAF uses the token to ensure that no
     *        changes have been made to the entity since you last retrieved it. If a change has been made, the update
     *        fails with a <code>WAFOptimisticLockException</code>. If this happens, perform another get, and use the
     *        new token returned by that operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteFirewallManagerRuleGroupsRequest withWebACLLockToken(String webACLLockToken) {
        setWebACLLockToken(webACLLockToken);
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
        if (getWebACLArn() != null)
            sb.append("WebACLArn: ").append(getWebACLArn()).append(",");
        if (getWebACLLockToken() != null)
            sb.append("WebACLLockToken: ").append(getWebACLLockToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteFirewallManagerRuleGroupsRequest == false)
            return false;
        DeleteFirewallManagerRuleGroupsRequest other = (DeleteFirewallManagerRuleGroupsRequest) obj;
        if (other.getWebACLArn() == null ^ this.getWebACLArn() == null)
            return false;
        if (other.getWebACLArn() != null && other.getWebACLArn().equals(this.getWebACLArn()) == false)
            return false;
        if (other.getWebACLLockToken() == null ^ this.getWebACLLockToken() == null)
            return false;
        if (other.getWebACLLockToken() != null && other.getWebACLLockToken().equals(this.getWebACLLockToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getWebACLArn() == null) ? 0 : getWebACLArn().hashCode());
        hashCode = prime * hashCode + ((getWebACLLockToken() == null) ? 0 : getWebACLLockToken().hashCode());
        return hashCode;
    }

    @Override
    public DeleteFirewallManagerRuleGroupsRequest clone() {
        return (DeleteFirewallManagerRuleGroupsRequest) super.clone();
    }

}
