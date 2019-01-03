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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-regional-2016-11-28/UpdateRuleGroup" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateRuleGroupRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The <code>RuleGroupId</code> of the <a>RuleGroup</a> that you want to update. <code>RuleGroupId</code> is
     * returned by <a>CreateRuleGroup</a> and by <a>ListRuleGroups</a>.
     * </p>
     */
    private String ruleGroupId;
    /**
     * <p>
     * An array of <code>RuleGroupUpdate</code> objects that you want to insert into or delete from a <a>RuleGroup</a>.
     * </p>
     * <p>
     * You can only insert <code>REGULAR</code> rules into a rule group.
     * </p>
     * <p>
     * <code>ActivatedRule|OverrideAction</code> applies only when updating or adding a <code>RuleGroup</code> to a
     * <code>WebACL</code>. In this case you do not use <code>ActivatedRule|Action</code>. For all other update
     * requests, <code>ActivatedRule|Action</code> is used instead of <code>ActivatedRule|OverrideAction</code>.
     * </p>
     */
    private java.util.List<RuleGroupUpdate> updates;
    /**
     * <p>
     * The value returned by the most recent call to <a>GetChangeToken</a>.
     * </p>
     */
    private String changeToken;

    /**
     * <p>
     * The <code>RuleGroupId</code> of the <a>RuleGroup</a> that you want to update. <code>RuleGroupId</code> is
     * returned by <a>CreateRuleGroup</a> and by <a>ListRuleGroups</a>.
     * </p>
     * 
     * @param ruleGroupId
     *        The <code>RuleGroupId</code> of the <a>RuleGroup</a> that you want to update. <code>RuleGroupId</code> is
     *        returned by <a>CreateRuleGroup</a> and by <a>ListRuleGroups</a>.
     */

    public void setRuleGroupId(String ruleGroupId) {
        this.ruleGroupId = ruleGroupId;
    }

    /**
     * <p>
     * The <code>RuleGroupId</code> of the <a>RuleGroup</a> that you want to update. <code>RuleGroupId</code> is
     * returned by <a>CreateRuleGroup</a> and by <a>ListRuleGroups</a>.
     * </p>
     * 
     * @return The <code>RuleGroupId</code> of the <a>RuleGroup</a> that you want to update. <code>RuleGroupId</code> is
     *         returned by <a>CreateRuleGroup</a> and by <a>ListRuleGroups</a>.
     */

    public String getRuleGroupId() {
        return this.ruleGroupId;
    }

    /**
     * <p>
     * The <code>RuleGroupId</code> of the <a>RuleGroup</a> that you want to update. <code>RuleGroupId</code> is
     * returned by <a>CreateRuleGroup</a> and by <a>ListRuleGroups</a>.
     * </p>
     * 
     * @param ruleGroupId
     *        The <code>RuleGroupId</code> of the <a>RuleGroup</a> that you want to update. <code>RuleGroupId</code> is
     *        returned by <a>CreateRuleGroup</a> and by <a>ListRuleGroups</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateRuleGroupRequest withRuleGroupId(String ruleGroupId) {
        setRuleGroupId(ruleGroupId);
        return this;
    }

    /**
     * <p>
     * An array of <code>RuleGroupUpdate</code> objects that you want to insert into or delete from a <a>RuleGroup</a>.
     * </p>
     * <p>
     * You can only insert <code>REGULAR</code> rules into a rule group.
     * </p>
     * <p>
     * <code>ActivatedRule|OverrideAction</code> applies only when updating or adding a <code>RuleGroup</code> to a
     * <code>WebACL</code>. In this case you do not use <code>ActivatedRule|Action</code>. For all other update
     * requests, <code>ActivatedRule|Action</code> is used instead of <code>ActivatedRule|OverrideAction</code>.
     * </p>
     * 
     * @return An array of <code>RuleGroupUpdate</code> objects that you want to insert into or delete from a
     *         <a>RuleGroup</a>.</p>
     *         <p>
     *         You can only insert <code>REGULAR</code> rules into a rule group.
     *         </p>
     *         <p>
     *         <code>ActivatedRule|OverrideAction</code> applies only when updating or adding a <code>RuleGroup</code>
     *         to a <code>WebACL</code>. In this case you do not use <code>ActivatedRule|Action</code>. For all other
     *         update requests, <code>ActivatedRule|Action</code> is used instead of
     *         <code>ActivatedRule|OverrideAction</code>.
     */

    public java.util.List<RuleGroupUpdate> getUpdates() {
        return updates;
    }

    /**
     * <p>
     * An array of <code>RuleGroupUpdate</code> objects that you want to insert into or delete from a <a>RuleGroup</a>.
     * </p>
     * <p>
     * You can only insert <code>REGULAR</code> rules into a rule group.
     * </p>
     * <p>
     * <code>ActivatedRule|OverrideAction</code> applies only when updating or adding a <code>RuleGroup</code> to a
     * <code>WebACL</code>. In this case you do not use <code>ActivatedRule|Action</code>. For all other update
     * requests, <code>ActivatedRule|Action</code> is used instead of <code>ActivatedRule|OverrideAction</code>.
     * </p>
     * 
     * @param updates
     *        An array of <code>RuleGroupUpdate</code> objects that you want to insert into or delete from a
     *        <a>RuleGroup</a>.</p>
     *        <p>
     *        You can only insert <code>REGULAR</code> rules into a rule group.
     *        </p>
     *        <p>
     *        <code>ActivatedRule|OverrideAction</code> applies only when updating or adding a <code>RuleGroup</code> to
     *        a <code>WebACL</code>. In this case you do not use <code>ActivatedRule|Action</code>. For all other update
     *        requests, <code>ActivatedRule|Action</code> is used instead of <code>ActivatedRule|OverrideAction</code>.
     */

    public void setUpdates(java.util.Collection<RuleGroupUpdate> updates) {
        if (updates == null) {
            this.updates = null;
            return;
        }

        this.updates = new java.util.ArrayList<RuleGroupUpdate>(updates);
    }

    /**
     * <p>
     * An array of <code>RuleGroupUpdate</code> objects that you want to insert into or delete from a <a>RuleGroup</a>.
     * </p>
     * <p>
     * You can only insert <code>REGULAR</code> rules into a rule group.
     * </p>
     * <p>
     * <code>ActivatedRule|OverrideAction</code> applies only when updating or adding a <code>RuleGroup</code> to a
     * <code>WebACL</code>. In this case you do not use <code>ActivatedRule|Action</code>. For all other update
     * requests, <code>ActivatedRule|Action</code> is used instead of <code>ActivatedRule|OverrideAction</code>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setUpdates(java.util.Collection)} or {@link #withUpdates(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param updates
     *        An array of <code>RuleGroupUpdate</code> objects that you want to insert into or delete from a
     *        <a>RuleGroup</a>.</p>
     *        <p>
     *        You can only insert <code>REGULAR</code> rules into a rule group.
     *        </p>
     *        <p>
     *        <code>ActivatedRule|OverrideAction</code> applies only when updating or adding a <code>RuleGroup</code> to
     *        a <code>WebACL</code>. In this case you do not use <code>ActivatedRule|Action</code>. For all other update
     *        requests, <code>ActivatedRule|Action</code> is used instead of <code>ActivatedRule|OverrideAction</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateRuleGroupRequest withUpdates(RuleGroupUpdate... updates) {
        if (this.updates == null) {
            setUpdates(new java.util.ArrayList<RuleGroupUpdate>(updates.length));
        }
        for (RuleGroupUpdate ele : updates) {
            this.updates.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of <code>RuleGroupUpdate</code> objects that you want to insert into or delete from a <a>RuleGroup</a>.
     * </p>
     * <p>
     * You can only insert <code>REGULAR</code> rules into a rule group.
     * </p>
     * <p>
     * <code>ActivatedRule|OverrideAction</code> applies only when updating or adding a <code>RuleGroup</code> to a
     * <code>WebACL</code>. In this case you do not use <code>ActivatedRule|Action</code>. For all other update
     * requests, <code>ActivatedRule|Action</code> is used instead of <code>ActivatedRule|OverrideAction</code>.
     * </p>
     * 
     * @param updates
     *        An array of <code>RuleGroupUpdate</code> objects that you want to insert into or delete from a
     *        <a>RuleGroup</a>.</p>
     *        <p>
     *        You can only insert <code>REGULAR</code> rules into a rule group.
     *        </p>
     *        <p>
     *        <code>ActivatedRule|OverrideAction</code> applies only when updating or adding a <code>RuleGroup</code> to
     *        a <code>WebACL</code>. In this case you do not use <code>ActivatedRule|Action</code>. For all other update
     *        requests, <code>ActivatedRule|Action</code> is used instead of <code>ActivatedRule|OverrideAction</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateRuleGroupRequest withUpdates(java.util.Collection<RuleGroupUpdate> updates) {
        setUpdates(updates);
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

    public UpdateRuleGroupRequest withChangeToken(String changeToken) {
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
        if (getUpdates() != null)
            sb.append("Updates: ").append(getUpdates()).append(",");
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

        if (obj instanceof UpdateRuleGroupRequest == false)
            return false;
        UpdateRuleGroupRequest other = (UpdateRuleGroupRequest) obj;
        if (other.getRuleGroupId() == null ^ this.getRuleGroupId() == null)
            return false;
        if (other.getRuleGroupId() != null && other.getRuleGroupId().equals(this.getRuleGroupId()) == false)
            return false;
        if (other.getUpdates() == null ^ this.getUpdates() == null)
            return false;
        if (other.getUpdates() != null && other.getUpdates().equals(this.getUpdates()) == false)
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
        hashCode = prime * hashCode + ((getUpdates() == null) ? 0 : getUpdates().hashCode());
        hashCode = prime * hashCode + ((getChangeToken() == null) ? 0 : getChangeToken().hashCode());
        return hashCode;
    }

    @Override
    public UpdateRuleGroupRequest clone() {
        return (UpdateRuleGroupRequest) super.clone();
    }

}
