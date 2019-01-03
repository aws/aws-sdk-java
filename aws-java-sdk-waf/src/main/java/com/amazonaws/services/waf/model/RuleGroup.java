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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A collection of predefined rules that you can add to a web ACL.
 * </p>
 * <p>
 * Rule groups are subject to the following limits:
 * </p>
 * <ul>
 * <li>
 * <p>
 * Three rule groups per account. You can request an increase to this limit by contacting customer support.
 * </p>
 * </li>
 * <li>
 * <p>
 * One rule group per web ACL.
 * </p>
 * </li>
 * <li>
 * <p>
 * Ten rules per rule group.
 * </p>
 * </li>
 * </ul>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-regional-2016-11-28/RuleGroup" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RuleGroup implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A unique identifier for a <code>RuleGroup</code>. You use <code>RuleGroupId</code> to get more information about
     * a <code>RuleGroup</code> (see <a>GetRuleGroup</a>), update a <code>RuleGroup</code> (see <a>UpdateRuleGroup</a>),
     * insert a <code>RuleGroup</code> into a <code>WebACL</code> or delete a one from a <code>WebACL</code> (see
     * <a>UpdateWebACL</a>), or delete a <code>RuleGroup</code> from AWS WAF (see <a>DeleteRuleGroup</a>).
     * </p>
     * <p>
     * <code>RuleGroupId</code> is returned by <a>CreateRuleGroup</a> and by <a>ListRuleGroups</a>.
     * </p>
     */
    private String ruleGroupId;
    /**
     * <p>
     * The friendly name or description for the <code>RuleGroup</code>. You can't change the name of a
     * <code>RuleGroup</code> after you create it.
     * </p>
     */
    private String name;
    /**
     * <p>
     * A friendly name or description for the metrics for this <code>RuleGroup</code>. The name can contain only
     * alphanumeric characters (A-Z, a-z, 0-9); the name can't contain whitespace. You can't change the name of the
     * metric after you create the <code>RuleGroup</code>.
     * </p>
     */
    private String metricName;

    /**
     * <p>
     * A unique identifier for a <code>RuleGroup</code>. You use <code>RuleGroupId</code> to get more information about
     * a <code>RuleGroup</code> (see <a>GetRuleGroup</a>), update a <code>RuleGroup</code> (see <a>UpdateRuleGroup</a>),
     * insert a <code>RuleGroup</code> into a <code>WebACL</code> or delete a one from a <code>WebACL</code> (see
     * <a>UpdateWebACL</a>), or delete a <code>RuleGroup</code> from AWS WAF (see <a>DeleteRuleGroup</a>).
     * </p>
     * <p>
     * <code>RuleGroupId</code> is returned by <a>CreateRuleGroup</a> and by <a>ListRuleGroups</a>.
     * </p>
     * 
     * @param ruleGroupId
     *        A unique identifier for a <code>RuleGroup</code>. You use <code>RuleGroupId</code> to get more information
     *        about a <code>RuleGroup</code> (see <a>GetRuleGroup</a>), update a <code>RuleGroup</code> (see
     *        <a>UpdateRuleGroup</a>), insert a <code>RuleGroup</code> into a <code>WebACL</code> or delete a one from a
     *        <code>WebACL</code> (see <a>UpdateWebACL</a>), or delete a <code>RuleGroup</code> from AWS WAF (see
     *        <a>DeleteRuleGroup</a>).</p>
     *        <p>
     *        <code>RuleGroupId</code> is returned by <a>CreateRuleGroup</a> and by <a>ListRuleGroups</a>.
     */

    public void setRuleGroupId(String ruleGroupId) {
        this.ruleGroupId = ruleGroupId;
    }

    /**
     * <p>
     * A unique identifier for a <code>RuleGroup</code>. You use <code>RuleGroupId</code> to get more information about
     * a <code>RuleGroup</code> (see <a>GetRuleGroup</a>), update a <code>RuleGroup</code> (see <a>UpdateRuleGroup</a>),
     * insert a <code>RuleGroup</code> into a <code>WebACL</code> or delete a one from a <code>WebACL</code> (see
     * <a>UpdateWebACL</a>), or delete a <code>RuleGroup</code> from AWS WAF (see <a>DeleteRuleGroup</a>).
     * </p>
     * <p>
     * <code>RuleGroupId</code> is returned by <a>CreateRuleGroup</a> and by <a>ListRuleGroups</a>.
     * </p>
     * 
     * @return A unique identifier for a <code>RuleGroup</code>. You use <code>RuleGroupId</code> to get more
     *         information about a <code>RuleGroup</code> (see <a>GetRuleGroup</a>), update a <code>RuleGroup</code>
     *         (see <a>UpdateRuleGroup</a>), insert a <code>RuleGroup</code> into a <code>WebACL</code> or delete a one
     *         from a <code>WebACL</code> (see <a>UpdateWebACL</a>), or delete a <code>RuleGroup</code> from AWS WAF
     *         (see <a>DeleteRuleGroup</a>).</p>
     *         <p>
     *         <code>RuleGroupId</code> is returned by <a>CreateRuleGroup</a> and by <a>ListRuleGroups</a>.
     */

    public String getRuleGroupId() {
        return this.ruleGroupId;
    }

    /**
     * <p>
     * A unique identifier for a <code>RuleGroup</code>. You use <code>RuleGroupId</code> to get more information about
     * a <code>RuleGroup</code> (see <a>GetRuleGroup</a>), update a <code>RuleGroup</code> (see <a>UpdateRuleGroup</a>),
     * insert a <code>RuleGroup</code> into a <code>WebACL</code> or delete a one from a <code>WebACL</code> (see
     * <a>UpdateWebACL</a>), or delete a <code>RuleGroup</code> from AWS WAF (see <a>DeleteRuleGroup</a>).
     * </p>
     * <p>
     * <code>RuleGroupId</code> is returned by <a>CreateRuleGroup</a> and by <a>ListRuleGroups</a>.
     * </p>
     * 
     * @param ruleGroupId
     *        A unique identifier for a <code>RuleGroup</code>. You use <code>RuleGroupId</code> to get more information
     *        about a <code>RuleGroup</code> (see <a>GetRuleGroup</a>), update a <code>RuleGroup</code> (see
     *        <a>UpdateRuleGroup</a>), insert a <code>RuleGroup</code> into a <code>WebACL</code> or delete a one from a
     *        <code>WebACL</code> (see <a>UpdateWebACL</a>), or delete a <code>RuleGroup</code> from AWS WAF (see
     *        <a>DeleteRuleGroup</a>).</p>
     *        <p>
     *        <code>RuleGroupId</code> is returned by <a>CreateRuleGroup</a> and by <a>ListRuleGroups</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RuleGroup withRuleGroupId(String ruleGroupId) {
        setRuleGroupId(ruleGroupId);
        return this;
    }

    /**
     * <p>
     * The friendly name or description for the <code>RuleGroup</code>. You can't change the name of a
     * <code>RuleGroup</code> after you create it.
     * </p>
     * 
     * @param name
     *        The friendly name or description for the <code>RuleGroup</code>. You can't change the name of a
     *        <code>RuleGroup</code> after you create it.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The friendly name or description for the <code>RuleGroup</code>. You can't change the name of a
     * <code>RuleGroup</code> after you create it.
     * </p>
     * 
     * @return The friendly name or description for the <code>RuleGroup</code>. You can't change the name of a
     *         <code>RuleGroup</code> after you create it.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The friendly name or description for the <code>RuleGroup</code>. You can't change the name of a
     * <code>RuleGroup</code> after you create it.
     * </p>
     * 
     * @param name
     *        The friendly name or description for the <code>RuleGroup</code>. You can't change the name of a
     *        <code>RuleGroup</code> after you create it.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RuleGroup withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * A friendly name or description for the metrics for this <code>RuleGroup</code>. The name can contain only
     * alphanumeric characters (A-Z, a-z, 0-9); the name can't contain whitespace. You can't change the name of the
     * metric after you create the <code>RuleGroup</code>.
     * </p>
     * 
     * @param metricName
     *        A friendly name or description for the metrics for this <code>RuleGroup</code>. The name can contain only
     *        alphanumeric characters (A-Z, a-z, 0-9); the name can't contain whitespace. You can't change the name of
     *        the metric after you create the <code>RuleGroup</code>.
     */

    public void setMetricName(String metricName) {
        this.metricName = metricName;
    }

    /**
     * <p>
     * A friendly name or description for the metrics for this <code>RuleGroup</code>. The name can contain only
     * alphanumeric characters (A-Z, a-z, 0-9); the name can't contain whitespace. You can't change the name of the
     * metric after you create the <code>RuleGroup</code>.
     * </p>
     * 
     * @return A friendly name or description for the metrics for this <code>RuleGroup</code>. The name can contain only
     *         alphanumeric characters (A-Z, a-z, 0-9); the name can't contain whitespace. You can't change the name of
     *         the metric after you create the <code>RuleGroup</code>.
     */

    public String getMetricName() {
        return this.metricName;
    }

    /**
     * <p>
     * A friendly name or description for the metrics for this <code>RuleGroup</code>. The name can contain only
     * alphanumeric characters (A-Z, a-z, 0-9); the name can't contain whitespace. You can't change the name of the
     * metric after you create the <code>RuleGroup</code>.
     * </p>
     * 
     * @param metricName
     *        A friendly name or description for the metrics for this <code>RuleGroup</code>. The name can contain only
     *        alphanumeric characters (A-Z, a-z, 0-9); the name can't contain whitespace. You can't change the name of
     *        the metric after you create the <code>RuleGroup</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RuleGroup withMetricName(String metricName) {
        setMetricName(metricName);
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getMetricName() != null)
            sb.append("MetricName: ").append(getMetricName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RuleGroup == false)
            return false;
        RuleGroup other = (RuleGroup) obj;
        if (other.getRuleGroupId() == null ^ this.getRuleGroupId() == null)
            return false;
        if (other.getRuleGroupId() != null && other.getRuleGroupId().equals(this.getRuleGroupId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getMetricName() == null ^ this.getMetricName() == null)
            return false;
        if (other.getMetricName() != null && other.getMetricName().equals(this.getMetricName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRuleGroupId() == null) ? 0 : getRuleGroupId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getMetricName() == null) ? 0 : getMetricName().hashCode());
        return hashCode;
    }

    @Override
    public RuleGroup clone() {
        try {
            return (RuleGroup) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.waf.model.waf_regional.transform.RuleGroupMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
