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
 * Contains the identifier and the friendly name or description of the <code>Rule</code>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-regional-2016-11-28/RuleSummary" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RuleSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A unique identifier for a <code>Rule</code>. You use <code>RuleId</code> to get more information about a
     * <code>Rule</code> (see <a>GetRule</a>), update a <code>Rule</code> (see <a>UpdateRule</a>), insert a
     * <code>Rule</code> into a <code>WebACL</code> or delete one from a <code>WebACL</code> (see <a>UpdateWebACL</a>),
     * or delete a <code>Rule</code> from AWS WAF (see <a>DeleteRule</a>).
     * </p>
     * <p>
     * <code>RuleId</code> is returned by <a>CreateRule</a> and by <a>ListRules</a>.
     * </p>
     */
    private String ruleId;
    /**
     * <p>
     * A friendly name or description of the <a>Rule</a>. You can't change the name of a <code>Rule</code> after you
     * create it.
     * </p>
     */
    private String name;

    /**
     * <p>
     * A unique identifier for a <code>Rule</code>. You use <code>RuleId</code> to get more information about a
     * <code>Rule</code> (see <a>GetRule</a>), update a <code>Rule</code> (see <a>UpdateRule</a>), insert a
     * <code>Rule</code> into a <code>WebACL</code> or delete one from a <code>WebACL</code> (see <a>UpdateWebACL</a>),
     * or delete a <code>Rule</code> from AWS WAF (see <a>DeleteRule</a>).
     * </p>
     * <p>
     * <code>RuleId</code> is returned by <a>CreateRule</a> and by <a>ListRules</a>.
     * </p>
     * 
     * @param ruleId
     *        A unique identifier for a <code>Rule</code>. You use <code>RuleId</code> to get more information about a
     *        <code>Rule</code> (see <a>GetRule</a>), update a <code>Rule</code> (see <a>UpdateRule</a>), insert a
     *        <code>Rule</code> into a <code>WebACL</code> or delete one from a <code>WebACL</code> (see
     *        <a>UpdateWebACL</a>), or delete a <code>Rule</code> from AWS WAF (see <a>DeleteRule</a>).</p>
     *        <p>
     *        <code>RuleId</code> is returned by <a>CreateRule</a> and by <a>ListRules</a>.
     */

    public void setRuleId(String ruleId) {
        this.ruleId = ruleId;
    }

    /**
     * <p>
     * A unique identifier for a <code>Rule</code>. You use <code>RuleId</code> to get more information about a
     * <code>Rule</code> (see <a>GetRule</a>), update a <code>Rule</code> (see <a>UpdateRule</a>), insert a
     * <code>Rule</code> into a <code>WebACL</code> or delete one from a <code>WebACL</code> (see <a>UpdateWebACL</a>),
     * or delete a <code>Rule</code> from AWS WAF (see <a>DeleteRule</a>).
     * </p>
     * <p>
     * <code>RuleId</code> is returned by <a>CreateRule</a> and by <a>ListRules</a>.
     * </p>
     * 
     * @return A unique identifier for a <code>Rule</code>. You use <code>RuleId</code> to get more information about a
     *         <code>Rule</code> (see <a>GetRule</a>), update a <code>Rule</code> (see <a>UpdateRule</a>), insert a
     *         <code>Rule</code> into a <code>WebACL</code> or delete one from a <code>WebACL</code> (see
     *         <a>UpdateWebACL</a>), or delete a <code>Rule</code> from AWS WAF (see <a>DeleteRule</a>).</p>
     *         <p>
     *         <code>RuleId</code> is returned by <a>CreateRule</a> and by <a>ListRules</a>.
     */

    public String getRuleId() {
        return this.ruleId;
    }

    /**
     * <p>
     * A unique identifier for a <code>Rule</code>. You use <code>RuleId</code> to get more information about a
     * <code>Rule</code> (see <a>GetRule</a>), update a <code>Rule</code> (see <a>UpdateRule</a>), insert a
     * <code>Rule</code> into a <code>WebACL</code> or delete one from a <code>WebACL</code> (see <a>UpdateWebACL</a>),
     * or delete a <code>Rule</code> from AWS WAF (see <a>DeleteRule</a>).
     * </p>
     * <p>
     * <code>RuleId</code> is returned by <a>CreateRule</a> and by <a>ListRules</a>.
     * </p>
     * 
     * @param ruleId
     *        A unique identifier for a <code>Rule</code>. You use <code>RuleId</code> to get more information about a
     *        <code>Rule</code> (see <a>GetRule</a>), update a <code>Rule</code> (see <a>UpdateRule</a>), insert a
     *        <code>Rule</code> into a <code>WebACL</code> or delete one from a <code>WebACL</code> (see
     *        <a>UpdateWebACL</a>), or delete a <code>Rule</code> from AWS WAF (see <a>DeleteRule</a>).</p>
     *        <p>
     *        <code>RuleId</code> is returned by <a>CreateRule</a> and by <a>ListRules</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RuleSummary withRuleId(String ruleId) {
        setRuleId(ruleId);
        return this;
    }

    /**
     * <p>
     * A friendly name or description of the <a>Rule</a>. You can't change the name of a <code>Rule</code> after you
     * create it.
     * </p>
     * 
     * @param name
     *        A friendly name or description of the <a>Rule</a>. You can't change the name of a <code>Rule</code> after
     *        you create it.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * A friendly name or description of the <a>Rule</a>. You can't change the name of a <code>Rule</code> after you
     * create it.
     * </p>
     * 
     * @return A friendly name or description of the <a>Rule</a>. You can't change the name of a <code>Rule</code> after
     *         you create it.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * A friendly name or description of the <a>Rule</a>. You can't change the name of a <code>Rule</code> after you
     * create it.
     * </p>
     * 
     * @param name
     *        A friendly name or description of the <a>Rule</a>. You can't change the name of a <code>Rule</code> after
     *        you create it.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RuleSummary withName(String name) {
        setName(name);
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
        if (getRuleId() != null)
            sb.append("RuleId: ").append(getRuleId()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RuleSummary == false)
            return false;
        RuleSummary other = (RuleSummary) obj;
        if (other.getRuleId() == null ^ this.getRuleId() == null)
            return false;
        if (other.getRuleId() != null && other.getRuleId().equals(this.getRuleId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRuleId() == null) ? 0 : getRuleId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        return hashCode;
    }

    @Override
    public RuleSummary clone() {
        try {
            return (RuleSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.waf.model.waf_regional.transform.RuleSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
