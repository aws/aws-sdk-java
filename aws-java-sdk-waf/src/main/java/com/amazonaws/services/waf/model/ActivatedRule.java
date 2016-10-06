/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

/**
 * <p>
 * The <code>ActivatedRule</code> object in an <a>UpdateWebACL</a> request specifies a <code>Rule</code> that you want
 * to insert or delete, the priority of the <code>Rule</code> in the <code>WebACL</code>, and the action that you want
 * AWS WAF to take when a web request matches the <code>Rule</code> (<code>ALLOW</code>, <code>BLOCK</code>, or
 * <code>COUNT</code>).
 * </p>
 * <p>
 * To specify whether to insert or delete a <code>Rule</code>, use the <code>Action</code> parameter in the
 * <a>WebACLUpdate</a> data type.
 * </p>
 */
public class ActivatedRule implements Serializable, Cloneable {

    /**
     * <p>
     * Specifies the order in which the <code>Rules</code> in a <code>WebACL</code> are evaluated. Rules with a lower
     * value for <code>Priority</code> are evaluated before <code>Rules</code> with a higher value. The value must be a
     * unique integer. If you add multiple <code>Rules</code> to a <code>WebACL</code>, the values don't need to be
     * consecutive.
     * </p>
     */
    private Integer priority;
    /**
     * <p>
     * The <code>RuleId</code> for a <code>Rule</code>. You use <code>RuleId</code> to get more information about a
     * <code>Rule</code> (see <a>GetRule</a>), update a <code>Rule</code> (see <a>UpdateRule</a>), insert a
     * <code>Rule</code> into a <code>WebACL</code> or delete a one from a <code>WebACL</code> (see
     * <a>UpdateWebACL</a>), or delete a <code>Rule</code> from AWS WAF (see <a>DeleteRule</a>).
     * </p>
     * <p>
     * <code>RuleId</code> is returned by <a>CreateRule</a> and by <a>ListRules</a>.
     * </p>
     */
    private String ruleId;
    /**
     * <p>
     * Specifies the action that CloudFront or AWS WAF takes when a web request matches the conditions in the
     * <code>Rule</code>. Valid values for <code>Action</code> include the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ALLOW</code>: CloudFront responds with the requested object.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>BLOCK</code>: CloudFront responds with an HTTP 403 (Forbidden) status code.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>COUNT</code>: AWS WAF increments a counter of requests that match the conditions in the rule and then
     * continues to inspect the web request based on the remaining rules in the web ACL.
     * </p>
     * </li>
     * </ul>
     */
    private WafAction action;

    /**
     * <p>
     * Specifies the order in which the <code>Rules</code> in a <code>WebACL</code> are evaluated. Rules with a lower
     * value for <code>Priority</code> are evaluated before <code>Rules</code> with a higher value. The value must be a
     * unique integer. If you add multiple <code>Rules</code> to a <code>WebACL</code>, the values don't need to be
     * consecutive.
     * </p>
     * 
     * @param priority
     *        Specifies the order in which the <code>Rules</code> in a <code>WebACL</code> are evaluated. Rules with a
     *        lower value for <code>Priority</code> are evaluated before <code>Rules</code> with a higher value. The
     *        value must be a unique integer. If you add multiple <code>Rules</code> to a <code>WebACL</code>, the
     *        values don't need to be consecutive.
     */

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    /**
     * <p>
     * Specifies the order in which the <code>Rules</code> in a <code>WebACL</code> are evaluated. Rules with a lower
     * value for <code>Priority</code> are evaluated before <code>Rules</code> with a higher value. The value must be a
     * unique integer. If you add multiple <code>Rules</code> to a <code>WebACL</code>, the values don't need to be
     * consecutive.
     * </p>
     * 
     * @return Specifies the order in which the <code>Rules</code> in a <code>WebACL</code> are evaluated. Rules with a
     *         lower value for <code>Priority</code> are evaluated before <code>Rules</code> with a higher value. The
     *         value must be a unique integer. If you add multiple <code>Rules</code> to a <code>WebACL</code>, the
     *         values don't need to be consecutive.
     */

    public Integer getPriority() {
        return this.priority;
    }

    /**
     * <p>
     * Specifies the order in which the <code>Rules</code> in a <code>WebACL</code> are evaluated. Rules with a lower
     * value for <code>Priority</code> are evaluated before <code>Rules</code> with a higher value. The value must be a
     * unique integer. If you add multiple <code>Rules</code> to a <code>WebACL</code>, the values don't need to be
     * consecutive.
     * </p>
     * 
     * @param priority
     *        Specifies the order in which the <code>Rules</code> in a <code>WebACL</code> are evaluated. Rules with a
     *        lower value for <code>Priority</code> are evaluated before <code>Rules</code> with a higher value. The
     *        value must be a unique integer. If you add multiple <code>Rules</code> to a <code>WebACL</code>, the
     *        values don't need to be consecutive.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ActivatedRule withPriority(Integer priority) {
        setPriority(priority);
        return this;
    }

    /**
     * <p>
     * The <code>RuleId</code> for a <code>Rule</code>. You use <code>RuleId</code> to get more information about a
     * <code>Rule</code> (see <a>GetRule</a>), update a <code>Rule</code> (see <a>UpdateRule</a>), insert a
     * <code>Rule</code> into a <code>WebACL</code> or delete a one from a <code>WebACL</code> (see
     * <a>UpdateWebACL</a>), or delete a <code>Rule</code> from AWS WAF (see <a>DeleteRule</a>).
     * </p>
     * <p>
     * <code>RuleId</code> is returned by <a>CreateRule</a> and by <a>ListRules</a>.
     * </p>
     * 
     * @param ruleId
     *        The <code>RuleId</code> for a <code>Rule</code>. You use <code>RuleId</code> to get more information about
     *        a <code>Rule</code> (see <a>GetRule</a>), update a <code>Rule</code> (see <a>UpdateRule</a>), insert a
     *        <code>Rule</code> into a <code>WebACL</code> or delete a one from a <code>WebACL</code> (see
     *        <a>UpdateWebACL</a>), or delete a <code>Rule</code> from AWS WAF (see <a>DeleteRule</a>).</p>
     *        <p>
     *        <code>RuleId</code> is returned by <a>CreateRule</a> and by <a>ListRules</a>.
     */

    public void setRuleId(String ruleId) {
        this.ruleId = ruleId;
    }

    /**
     * <p>
     * The <code>RuleId</code> for a <code>Rule</code>. You use <code>RuleId</code> to get more information about a
     * <code>Rule</code> (see <a>GetRule</a>), update a <code>Rule</code> (see <a>UpdateRule</a>), insert a
     * <code>Rule</code> into a <code>WebACL</code> or delete a one from a <code>WebACL</code> (see
     * <a>UpdateWebACL</a>), or delete a <code>Rule</code> from AWS WAF (see <a>DeleteRule</a>).
     * </p>
     * <p>
     * <code>RuleId</code> is returned by <a>CreateRule</a> and by <a>ListRules</a>.
     * </p>
     * 
     * @return The <code>RuleId</code> for a <code>Rule</code>. You use <code>RuleId</code> to get more information
     *         about a <code>Rule</code> (see <a>GetRule</a>), update a <code>Rule</code> (see <a>UpdateRule</a>),
     *         insert a <code>Rule</code> into a <code>WebACL</code> or delete a one from a <code>WebACL</code> (see
     *         <a>UpdateWebACL</a>), or delete a <code>Rule</code> from AWS WAF (see <a>DeleteRule</a>).</p>
     *         <p>
     *         <code>RuleId</code> is returned by <a>CreateRule</a> and by <a>ListRules</a>.
     */

    public String getRuleId() {
        return this.ruleId;
    }

    /**
     * <p>
     * The <code>RuleId</code> for a <code>Rule</code>. You use <code>RuleId</code> to get more information about a
     * <code>Rule</code> (see <a>GetRule</a>), update a <code>Rule</code> (see <a>UpdateRule</a>), insert a
     * <code>Rule</code> into a <code>WebACL</code> or delete a one from a <code>WebACL</code> (see
     * <a>UpdateWebACL</a>), or delete a <code>Rule</code> from AWS WAF (see <a>DeleteRule</a>).
     * </p>
     * <p>
     * <code>RuleId</code> is returned by <a>CreateRule</a> and by <a>ListRules</a>.
     * </p>
     * 
     * @param ruleId
     *        The <code>RuleId</code> for a <code>Rule</code>. You use <code>RuleId</code> to get more information about
     *        a <code>Rule</code> (see <a>GetRule</a>), update a <code>Rule</code> (see <a>UpdateRule</a>), insert a
     *        <code>Rule</code> into a <code>WebACL</code> or delete a one from a <code>WebACL</code> (see
     *        <a>UpdateWebACL</a>), or delete a <code>Rule</code> from AWS WAF (see <a>DeleteRule</a>).</p>
     *        <p>
     *        <code>RuleId</code> is returned by <a>CreateRule</a> and by <a>ListRules</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ActivatedRule withRuleId(String ruleId) {
        setRuleId(ruleId);
        return this;
    }

    /**
     * <p>
     * Specifies the action that CloudFront or AWS WAF takes when a web request matches the conditions in the
     * <code>Rule</code>. Valid values for <code>Action</code> include the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ALLOW</code>: CloudFront responds with the requested object.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>BLOCK</code>: CloudFront responds with an HTTP 403 (Forbidden) status code.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>COUNT</code>: AWS WAF increments a counter of requests that match the conditions in the rule and then
     * continues to inspect the web request based on the remaining rules in the web ACL.
     * </p>
     * </li>
     * </ul>
     * 
     * @param action
     *        Specifies the action that CloudFront or AWS WAF takes when a web request matches the conditions in the
     *        <code>Rule</code>. Valid values for <code>Action</code> include the following:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ALLOW</code>: CloudFront responds with the requested object.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>BLOCK</code>: CloudFront responds with an HTTP 403 (Forbidden) status code.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>COUNT</code>: AWS WAF increments a counter of requests that match the conditions in the rule and
     *        then continues to inspect the web request based on the remaining rules in the web ACL.
     *        </p>
     *        </li>
     */

    public void setAction(WafAction action) {
        this.action = action;
    }

    /**
     * <p>
     * Specifies the action that CloudFront or AWS WAF takes when a web request matches the conditions in the
     * <code>Rule</code>. Valid values for <code>Action</code> include the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ALLOW</code>: CloudFront responds with the requested object.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>BLOCK</code>: CloudFront responds with an HTTP 403 (Forbidden) status code.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>COUNT</code>: AWS WAF increments a counter of requests that match the conditions in the rule and then
     * continues to inspect the web request based on the remaining rules in the web ACL.
     * </p>
     * </li>
     * </ul>
     * 
     * @return Specifies the action that CloudFront or AWS WAF takes when a web request matches the conditions in the
     *         <code>Rule</code>. Valid values for <code>Action</code> include the following:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>ALLOW</code>: CloudFront responds with the requested object.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>BLOCK</code>: CloudFront responds with an HTTP 403 (Forbidden) status code.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>COUNT</code>: AWS WAF increments a counter of requests that match the conditions in the rule and
     *         then continues to inspect the web request based on the remaining rules in the web ACL.
     *         </p>
     *         </li>
     */

    public WafAction getAction() {
        return this.action;
    }

    /**
     * <p>
     * Specifies the action that CloudFront or AWS WAF takes when a web request matches the conditions in the
     * <code>Rule</code>. Valid values for <code>Action</code> include the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ALLOW</code>: CloudFront responds with the requested object.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>BLOCK</code>: CloudFront responds with an HTTP 403 (Forbidden) status code.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>COUNT</code>: AWS WAF increments a counter of requests that match the conditions in the rule and then
     * continues to inspect the web request based on the remaining rules in the web ACL.
     * </p>
     * </li>
     * </ul>
     * 
     * @param action
     *        Specifies the action that CloudFront or AWS WAF takes when a web request matches the conditions in the
     *        <code>Rule</code>. Valid values for <code>Action</code> include the following:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ALLOW</code>: CloudFront responds with the requested object.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>BLOCK</code>: CloudFront responds with an HTTP 403 (Forbidden) status code.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>COUNT</code>: AWS WAF increments a counter of requests that match the conditions in the rule and
     *        then continues to inspect the web request based on the remaining rules in the web ACL.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ActivatedRule withAction(WafAction action) {
        setAction(action);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getPriority() != null)
            sb.append("Priority: " + getPriority() + ",");
        if (getRuleId() != null)
            sb.append("RuleId: " + getRuleId() + ",");
        if (getAction() != null)
            sb.append("Action: " + getAction());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ActivatedRule == false)
            return false;
        ActivatedRule other = (ActivatedRule) obj;
        if (other.getPriority() == null ^ this.getPriority() == null)
            return false;
        if (other.getPriority() != null && other.getPriority().equals(this.getPriority()) == false)
            return false;
        if (other.getRuleId() == null ^ this.getRuleId() == null)
            return false;
        if (other.getRuleId() != null && other.getRuleId().equals(this.getRuleId()) == false)
            return false;
        if (other.getAction() == null ^ this.getAction() == null)
            return false;
        if (other.getAction() != null && other.getAction().equals(this.getAction()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPriority() == null) ? 0 : getPriority().hashCode());
        hashCode = prime * hashCode + ((getRuleId() == null) ? 0 : getRuleId().hashCode());
        hashCode = prime * hashCode + ((getAction() == null) ? 0 : getAction().hashCode());
        return hashCode;
    }

    @Override
    public ActivatedRule clone() {
        try {
            return (ActivatedRule) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
