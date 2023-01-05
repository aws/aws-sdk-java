/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.securityhub.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Provides details about rules in a rule group. A rule identifies web requests that you want to allow, block, or count.
 * Each rule includes one top-level Statement that AWS WAF uses to identify matching web requests, and parameters that
 * govern how AWS WAF handles them.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/AwsWafv2RulesDetails" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsWafv2RulesDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The action that WAF should take on a web request when it matches the rule statement. Settings at the web ACL
     * level can override the rule action setting.
     * </p>
     */
    private AwsWafv2RulesActionDetails action;
    /**
     * <p>
     * The name of the rule.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The action to use in the place of the action that results from the rule group evaluation.
     * </p>
     */
    private String overrideAction;
    /**
     * <p>
     * If you define more than one Rule in a WebACL, WAF evaluates each request against the Rules in order based on the
     * value of <code>Priority</code>. WAF processes rules with lower priority first. The priorities don't need to be
     * consecutive, but they must all be different.
     * </p>
     */
    private Integer priority;
    /**
     * <p>
     * Defines and enables Amazon CloudWatch metrics and web request sample collection.
     * </p>
     */
    private AwsWafv2VisibilityConfigDetails visibilityConfig;

    /**
     * <p>
     * The action that WAF should take on a web request when it matches the rule statement. Settings at the web ACL
     * level can override the rule action setting.
     * </p>
     * 
     * @param action
     *        The action that WAF should take on a web request when it matches the rule statement. Settings at the web
     *        ACL level can override the rule action setting.
     */

    public void setAction(AwsWafv2RulesActionDetails action) {
        this.action = action;
    }

    /**
     * <p>
     * The action that WAF should take on a web request when it matches the rule statement. Settings at the web ACL
     * level can override the rule action setting.
     * </p>
     * 
     * @return The action that WAF should take on a web request when it matches the rule statement. Settings at the web
     *         ACL level can override the rule action setting.
     */

    public AwsWafv2RulesActionDetails getAction() {
        return this.action;
    }

    /**
     * <p>
     * The action that WAF should take on a web request when it matches the rule statement. Settings at the web ACL
     * level can override the rule action setting.
     * </p>
     * 
     * @param action
     *        The action that WAF should take on a web request when it matches the rule statement. Settings at the web
     *        ACL level can override the rule action setting.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsWafv2RulesDetails withAction(AwsWafv2RulesActionDetails action) {
        setAction(action);
        return this;
    }

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

    public AwsWafv2RulesDetails withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The action to use in the place of the action that results from the rule group evaluation.
     * </p>
     * 
     * @param overrideAction
     *        The action to use in the place of the action that results from the rule group evaluation.
     */

    public void setOverrideAction(String overrideAction) {
        this.overrideAction = overrideAction;
    }

    /**
     * <p>
     * The action to use in the place of the action that results from the rule group evaluation.
     * </p>
     * 
     * @return The action to use in the place of the action that results from the rule group evaluation.
     */

    public String getOverrideAction() {
        return this.overrideAction;
    }

    /**
     * <p>
     * The action to use in the place of the action that results from the rule group evaluation.
     * </p>
     * 
     * @param overrideAction
     *        The action to use in the place of the action that results from the rule group evaluation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsWafv2RulesDetails withOverrideAction(String overrideAction) {
        setOverrideAction(overrideAction);
        return this;
    }

    /**
     * <p>
     * If you define more than one Rule in a WebACL, WAF evaluates each request against the Rules in order based on the
     * value of <code>Priority</code>. WAF processes rules with lower priority first. The priorities don't need to be
     * consecutive, but they must all be different.
     * </p>
     * 
     * @param priority
     *        If you define more than one Rule in a WebACL, WAF evaluates each request against the Rules in order based
     *        on the value of <code>Priority</code>. WAF processes rules with lower priority first. The priorities don't
     *        need to be consecutive, but they must all be different.
     */

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    /**
     * <p>
     * If you define more than one Rule in a WebACL, WAF evaluates each request against the Rules in order based on the
     * value of <code>Priority</code>. WAF processes rules with lower priority first. The priorities don't need to be
     * consecutive, but they must all be different.
     * </p>
     * 
     * @return If you define more than one Rule in a WebACL, WAF evaluates each request against the Rules in order based
     *         on the value of <code>Priority</code>. WAF processes rules with lower priority first. The priorities
     *         don't need to be consecutive, but they must all be different.
     */

    public Integer getPriority() {
        return this.priority;
    }

    /**
     * <p>
     * If you define more than one Rule in a WebACL, WAF evaluates each request against the Rules in order based on the
     * value of <code>Priority</code>. WAF processes rules with lower priority first. The priorities don't need to be
     * consecutive, but they must all be different.
     * </p>
     * 
     * @param priority
     *        If you define more than one Rule in a WebACL, WAF evaluates each request against the Rules in order based
     *        on the value of <code>Priority</code>. WAF processes rules with lower priority first. The priorities don't
     *        need to be consecutive, but they must all be different.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsWafv2RulesDetails withPriority(Integer priority) {
        setPriority(priority);
        return this;
    }

    /**
     * <p>
     * Defines and enables Amazon CloudWatch metrics and web request sample collection.
     * </p>
     * 
     * @param visibilityConfig
     *        Defines and enables Amazon CloudWatch metrics and web request sample collection.
     */

    public void setVisibilityConfig(AwsWafv2VisibilityConfigDetails visibilityConfig) {
        this.visibilityConfig = visibilityConfig;
    }

    /**
     * <p>
     * Defines and enables Amazon CloudWatch metrics and web request sample collection.
     * </p>
     * 
     * @return Defines and enables Amazon CloudWatch metrics and web request sample collection.
     */

    public AwsWafv2VisibilityConfigDetails getVisibilityConfig() {
        return this.visibilityConfig;
    }

    /**
     * <p>
     * Defines and enables Amazon CloudWatch metrics and web request sample collection.
     * </p>
     * 
     * @param visibilityConfig
     *        Defines and enables Amazon CloudWatch metrics and web request sample collection.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsWafv2RulesDetails withVisibilityConfig(AwsWafv2VisibilityConfigDetails visibilityConfig) {
        setVisibilityConfig(visibilityConfig);
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
        if (getAction() != null)
            sb.append("Action: ").append(getAction()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getOverrideAction() != null)
            sb.append("OverrideAction: ").append(getOverrideAction()).append(",");
        if (getPriority() != null)
            sb.append("Priority: ").append(getPriority()).append(",");
        if (getVisibilityConfig() != null)
            sb.append("VisibilityConfig: ").append(getVisibilityConfig());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AwsWafv2RulesDetails == false)
            return false;
        AwsWafv2RulesDetails other = (AwsWafv2RulesDetails) obj;
        if (other.getAction() == null ^ this.getAction() == null)
            return false;
        if (other.getAction() != null && other.getAction().equals(this.getAction()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getOverrideAction() == null ^ this.getOverrideAction() == null)
            return false;
        if (other.getOverrideAction() != null && other.getOverrideAction().equals(this.getOverrideAction()) == false)
            return false;
        if (other.getPriority() == null ^ this.getPriority() == null)
            return false;
        if (other.getPriority() != null && other.getPriority().equals(this.getPriority()) == false)
            return false;
        if (other.getVisibilityConfig() == null ^ this.getVisibilityConfig() == null)
            return false;
        if (other.getVisibilityConfig() != null && other.getVisibilityConfig().equals(this.getVisibilityConfig()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAction() == null) ? 0 : getAction().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getOverrideAction() == null) ? 0 : getOverrideAction().hashCode());
        hashCode = prime * hashCode + ((getPriority() == null) ? 0 : getPriority().hashCode());
        hashCode = prime * hashCode + ((getVisibilityConfig() == null) ? 0 : getVisibilityConfig().hashCode());
        return hashCode;
    }

    @Override
    public AwsWafv2RulesDetails clone() {
        try {
            return (AwsWafv2RulesDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.AwsWafv2RulesDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
