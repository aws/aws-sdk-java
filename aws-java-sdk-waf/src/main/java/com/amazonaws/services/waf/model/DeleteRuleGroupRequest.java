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
package com.amazonaws.services.waf.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-regional-2016-11-28/DeleteRuleGroup" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteRuleGroupRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The <code>RuleGroupId</code> of the <a>RuleGroup</a> that you want to delete. <code>RuleGroupId</code> is
     * returned by <a>CreateRuleGroup</a> and by <a>ListRuleGroups</a>.
     * </p>
     */
    private String ruleGroupId;
    /**
     * <p>
     * The value returned by the most recent call to <a>GetChangeToken</a>.
     * </p>
     */
    private String changeToken;

    /**
     * <p>
     * The <code>RuleGroupId</code> of the <a>RuleGroup</a> that you want to delete. <code>RuleGroupId</code> is
     * returned by <a>CreateRuleGroup</a> and by <a>ListRuleGroups</a>.
     * </p>
     * 
     * @param ruleGroupId
     *        The <code>RuleGroupId</code> of the <a>RuleGroup</a> that you want to delete. <code>RuleGroupId</code> is
     *        returned by <a>CreateRuleGroup</a> and by <a>ListRuleGroups</a>.
     */

    public void setRuleGroupId(String ruleGroupId) {
        this.ruleGroupId = ruleGroupId;
    }

    /**
     * <p>
     * The <code>RuleGroupId</code> of the <a>RuleGroup</a> that you want to delete. <code>RuleGroupId</code> is
     * returned by <a>CreateRuleGroup</a> and by <a>ListRuleGroups</a>.
     * </p>
     * 
     * @return The <code>RuleGroupId</code> of the <a>RuleGroup</a> that you want to delete. <code>RuleGroupId</code> is
     *         returned by <a>CreateRuleGroup</a> and by <a>ListRuleGroups</a>.
     */

    public String getRuleGroupId() {
        return this.ruleGroupId;
    }

    /**
     * <p>
     * The <code>RuleGroupId</code> of the <a>RuleGroup</a> that you want to delete. <code>RuleGroupId</code> is
     * returned by <a>CreateRuleGroup</a> and by <a>ListRuleGroups</a>.
     * </p>
     * 
     * @param ruleGroupId
     *        The <code>RuleGroupId</code> of the <a>RuleGroup</a> that you want to delete. <code>RuleGroupId</code> is
     *        returned by <a>CreateRuleGroup</a> and by <a>ListRuleGroups</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteRuleGroupRequest withRuleGroupId(String ruleGroupId) {
        setRuleGroupId(ruleGroupId);
        return this;
    }

    /**
     * <p>
     * The value returned by the most recent call to <a>GetChangeToken</a>.
     * </p>
     * 
     * @param changeToken
     *        The value returned by the most recent call to <a>GetChangeToken</a>.
     */

    public void setChangeToken(String changeToken) {
        this.changeToken = changeToken;
    }

    /**
     * <p>
     * The value returned by the most recent call to <a>GetChangeToken</a>.
     * </p>
     * 
     * @return The value returned by the most recent call to <a>GetChangeToken</a>.
     */

    public String getChangeToken() {
        return this.changeToken;
    }

    /**
     * <p>
     * The value returned by the most recent call to <a>GetChangeToken</a>.
     * </p>
     * 
     * @param changeToken
     *        The value returned by the most recent call to <a>GetChangeToken</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteRuleGroupRequest withChangeToken(String changeToken) {
        setChangeToken(changeToken);
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
        if (getRuleGroupId() != null)
            sb.append("RuleGroupId: ").append(getRuleGroupId()).append(",");
        if (getChangeToken() != null)
            sb.append("ChangeToken: ").append(getChangeToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteRuleGroupRequest == false)
            return false;
        DeleteRuleGroupRequest other = (DeleteRuleGroupRequest) obj;
        if (other.getRuleGroupId() == null ^ this.getRuleGroupId() == null)
            return false;
        if (other.getRuleGroupId() != null && other.getRuleGroupId().equals(this.getRuleGroupId()) == false)
            return false;
        if (other.getChangeToken() == null ^ this.getChangeToken() == null)
            return false;
        if (other.getChangeToken() != null && other.getChangeToken().equals(this.getChangeToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRuleGroupId() == null) ? 0 : getRuleGroupId().hashCode());
        hashCode = prime * hashCode + ((getChangeToken() == null) ? 0 : getChangeToken().hashCode());
        return hashCode;
    }

    @Override
    public DeleteRuleGroupRequest clone() {
        return (DeleteRuleGroupRequest) super.clone();
    }

}
