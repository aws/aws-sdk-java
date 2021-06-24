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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wafv2-2019-07-29/DeleteFirewallManagerRuleGroups"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteFirewallManagerRuleGroupsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * A token used for optimistic locking. WAF returns a token to your get and list requests, to mark the state of the
     * entity at the time of the request. To make changes to the entity associated with the token, you provide the token
     * to operations like update and delete. WAF uses the token to ensure that no changes have been made to the entity
     * since you last retrieved it. If a change has been made, the update fails with a
     * <code>WAFOptimisticLockException</code>. If this happens, perform another get, and use the new token returned by
     * that operation.
     * </p>
     */
    private String nextWebACLLockToken;

    /**
     * <p>
     * A token used for optimistic locking. WAF returns a token to your get and list requests, to mark the state of the
     * entity at the time of the request. To make changes to the entity associated with the token, you provide the token
     * to operations like update and delete. WAF uses the token to ensure that no changes have been made to the entity
     * since you last retrieved it. If a change has been made, the update fails with a
     * <code>WAFOptimisticLockException</code>. If this happens, perform another get, and use the new token returned by
     * that operation.
     * </p>
     * 
     * @param nextWebACLLockToken
     *        A token used for optimistic locking. WAF returns a token to your get and list requests, to mark the state
     *        of the entity at the time of the request. To make changes to the entity associated with the token, you
     *        provide the token to operations like update and delete. WAF uses the token to ensure that no changes have
     *        been made to the entity since you last retrieved it. If a change has been made, the update fails with a
     *        <code>WAFOptimisticLockException</code>. If this happens, perform another get, and use the new token
     *        returned by that operation.
     */

    public void setNextWebACLLockToken(String nextWebACLLockToken) {
        this.nextWebACLLockToken = nextWebACLLockToken;
    }

    /**
     * <p>
     * A token used for optimistic locking. WAF returns a token to your get and list requests, to mark the state of the
     * entity at the time of the request. To make changes to the entity associated with the token, you provide the token
     * to operations like update and delete. WAF uses the token to ensure that no changes have been made to the entity
     * since you last retrieved it. If a change has been made, the update fails with a
     * <code>WAFOptimisticLockException</code>. If this happens, perform another get, and use the new token returned by
     * that operation.
     * </p>
     * 
     * @return A token used for optimistic locking. WAF returns a token to your get and list requests, to mark the state
     *         of the entity at the time of the request. To make changes to the entity associated with the token, you
     *         provide the token to operations like update and delete. WAF uses the token to ensure that no changes have
     *         been made to the entity since you last retrieved it. If a change has been made, the update fails with a
     *         <code>WAFOptimisticLockException</code>. If this happens, perform another get, and use the new token
     *         returned by that operation.
     */

    public String getNextWebACLLockToken() {
        return this.nextWebACLLockToken;
    }

    /**
     * <p>
     * A token used for optimistic locking. WAF returns a token to your get and list requests, to mark the state of the
     * entity at the time of the request. To make changes to the entity associated with the token, you provide the token
     * to operations like update and delete. WAF uses the token to ensure that no changes have been made to the entity
     * since you last retrieved it. If a change has been made, the update fails with a
     * <code>WAFOptimisticLockException</code>. If this happens, perform another get, and use the new token returned by
     * that operation.
     * </p>
     * 
     * @param nextWebACLLockToken
     *        A token used for optimistic locking. WAF returns a token to your get and list requests, to mark the state
     *        of the entity at the time of the request. To make changes to the entity associated with the token, you
     *        provide the token to operations like update and delete. WAF uses the token to ensure that no changes have
     *        been made to the entity since you last retrieved it. If a change has been made, the update fails with a
     *        <code>WAFOptimisticLockException</code>. If this happens, perform another get, and use the new token
     *        returned by that operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteFirewallManagerRuleGroupsResult withNextWebACLLockToken(String nextWebACLLockToken) {
        setNextWebACLLockToken(nextWebACLLockToken);
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
        if (getNextWebACLLockToken() != null)
            sb.append("NextWebACLLockToken: ").append(getNextWebACLLockToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteFirewallManagerRuleGroupsResult == false)
            return false;
        DeleteFirewallManagerRuleGroupsResult other = (DeleteFirewallManagerRuleGroupsResult) obj;
        if (other.getNextWebACLLockToken() == null ^ this.getNextWebACLLockToken() == null)
            return false;
        if (other.getNextWebACLLockToken() != null && other.getNextWebACLLockToken().equals(this.getNextWebACLLockToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextWebACLLockToken() == null) ? 0 : getNextWebACLLockToken().hashCode());
        return hashCode;
    }

    @Override
    public DeleteFirewallManagerRuleGroupsResult clone() {
        try {
            return (DeleteFirewallManagerRuleGroupsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
