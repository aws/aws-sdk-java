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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * High-level information about a <a>Rule</a>, returned by operations like <a>DescribeManagedRuleGroup</a>. This
 * provides information like the ID, that you can use to retrieve and manage a <code>RuleGroup</code>, and the ARN, that
 * you provide to the <a>RuleGroupReferenceStatement</a> to use the rule group in a <a>Rule</a>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wafv2-2019-07-29/RuleSummary" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RuleSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the rule.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The action that WAF should take on a web request when it matches a rule's statement. Settings at the web ACL
     * level can override the rule action setting.
     * </p>
     */
    private RuleAction action;

    /**
     * <p>
     * The name of the rule.
     * </p>
     * 
     * @param name
     *        The name of the rule.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the rule.
     * </p>
     * 
     * @return The name of the rule.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the rule.
     * </p>
     * 
     * @param name
     *        The name of the rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RuleSummary withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The action that WAF should take on a web request when it matches a rule's statement. Settings at the web ACL
     * level can override the rule action setting.
     * </p>
     * 
     * @param action
     *        The action that WAF should take on a web request when it matches a rule's statement. Settings at the web
     *        ACL level can override the rule action setting.
     */

    public void setAction(RuleAction action) {
        this.action = action;
    }

    /**
     * <p>
     * The action that WAF should take on a web request when it matches a rule's statement. Settings at the web ACL
     * level can override the rule action setting.
     * </p>
     * 
     * @return The action that WAF should take on a web request when it matches a rule's statement. Settings at the web
     *         ACL level can override the rule action setting.
     */

    public RuleAction getAction() {
        return this.action;
    }

    /**
     * <p>
     * The action that WAF should take on a web request when it matches a rule's statement. Settings at the web ACL
     * level can override the rule action setting.
     * </p>
     * 
     * @param action
     *        The action that WAF should take on a web request when it matches a rule's statement. Settings at the web
     *        ACL level can override the rule action setting.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RuleSummary withAction(RuleAction action) {
        setAction(action);
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getAction() != null)
            sb.append("Action: ").append(getAction());
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
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
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

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getAction() == null) ? 0 : getAction().hashCode());
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
        com.amazonaws.services.wafv2.model.transform.RuleSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
