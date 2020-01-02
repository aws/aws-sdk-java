/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * <note>
 * <p>
 * This is the latest version of <b>AWS WAF</b>, named AWS WAFV2, released in November, 2019. For information, including
 * how to migrate your AWS WAF resources from the prior release, see the <a
 * href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html">AWS WAF Developer Guide</a>.
 * </p>
 * </note>
 * <p>
 * A single rule, which you can use in a <a>WebACL</a> or <a>RuleGroup</a> to identify web requests that you want to
 * allow, block, or count. Each rule includes one top-level <a>Statement</a> that AWS WAF uses to identify matching web
 * requests, and parameters that govern how AWS WAF handles them.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wafv2-2019-07-29/Rule" target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Rule implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A friendly name of the rule. You can't change the name of a <code>Rule</code> after you create it.
     * </p>
     */
    private String name;
    /**
     * <p>
     * If you define more than one <code>Rule</code> in a <code>WebACL</code>, AWS WAF evaluates each request against
     * the <code>Rules</code> in order based on the value of <code>Priority</code>. AWS WAF processes rules with lower
     * priority first. The priorities don't need to be consecutive, but they must all be different.
     * </p>
     */
    private Integer priority;
    /**
     * <p>
     * The AWS WAF processing statement for the rule, for example <a>ByteMatchStatement</a> or
     * <a>SizeConstraintStatement</a>.
     * </p>
     */
    private Statement statement;
    /**
     * <p>
     * The action that AWS WAF should take on a web request when it matches the rule's statement. Settings at the web
     * ACL level can override the rule action setting.
     * </p>
     */
    private RuleAction action;
    /**
     * <p>
     * The action to use to override the rule's <code>Action</code> setting. You can use no override action, in which
     * case the rule action is in effect, or count action, in which case, if the rule matches a web request, it only
     * counts the match.
     * </p>
     */
    private OverrideAction overrideAction;
    /**
     * <p>
     * Defines and enables Amazon CloudWatch metrics and web request sample collection.
     * </p>
     */
    private VisibilityConfig visibilityConfig;

    /**
     * <p>
     * A friendly name of the rule. You can't change the name of a <code>Rule</code> after you create it.
     * </p>
     * 
     * @param name
     *        A friendly name of the rule. You can't change the name of a <code>Rule</code> after you create it.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * A friendly name of the rule. You can't change the name of a <code>Rule</code> after you create it.
     * </p>
     * 
     * @return A friendly name of the rule. You can't change the name of a <code>Rule</code> after you create it.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * A friendly name of the rule. You can't change the name of a <code>Rule</code> after you create it.
     * </p>
     * 
     * @param name
     *        A friendly name of the rule. You can't change the name of a <code>Rule</code> after you create it.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Rule withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * If you define more than one <code>Rule</code> in a <code>WebACL</code>, AWS WAF evaluates each request against
     * the <code>Rules</code> in order based on the value of <code>Priority</code>. AWS WAF processes rules with lower
     * priority first. The priorities don't need to be consecutive, but they must all be different.
     * </p>
     * 
     * @param priority
     *        If you define more than one <code>Rule</code> in a <code>WebACL</code>, AWS WAF evaluates each request
     *        against the <code>Rules</code> in order based on the value of <code>Priority</code>. AWS WAF processes
     *        rules with lower priority first. The priorities don't need to be consecutive, but they must all be
     *        different.
     */

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    /**
     * <p>
     * If you define more than one <code>Rule</code> in a <code>WebACL</code>, AWS WAF evaluates each request against
     * the <code>Rules</code> in order based on the value of <code>Priority</code>. AWS WAF processes rules with lower
     * priority first. The priorities don't need to be consecutive, but they must all be different.
     * </p>
     * 
     * @return If you define more than one <code>Rule</code> in a <code>WebACL</code>, AWS WAF evaluates each request
     *         against the <code>Rules</code> in order based on the value of <code>Priority</code>. AWS WAF processes
     *         rules with lower priority first. The priorities don't need to be consecutive, but they must all be
     *         different.
     */

    public Integer getPriority() {
        return this.priority;
    }

    /**
     * <p>
     * If you define more than one <code>Rule</code> in a <code>WebACL</code>, AWS WAF evaluates each request against
     * the <code>Rules</code> in order based on the value of <code>Priority</code>. AWS WAF processes rules with lower
     * priority first. The priorities don't need to be consecutive, but they must all be different.
     * </p>
     * 
     * @param priority
     *        If you define more than one <code>Rule</code> in a <code>WebACL</code>, AWS WAF evaluates each request
     *        against the <code>Rules</code> in order based on the value of <code>Priority</code>. AWS WAF processes
     *        rules with lower priority first. The priorities don't need to be consecutive, but they must all be
     *        different.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Rule withPriority(Integer priority) {
        setPriority(priority);
        return this;
    }

    /**
     * <p>
     * The AWS WAF processing statement for the rule, for example <a>ByteMatchStatement</a> or
     * <a>SizeConstraintStatement</a>.
     * </p>
     * 
     * @param statement
     *        The AWS WAF processing statement for the rule, for example <a>ByteMatchStatement</a> or
     *        <a>SizeConstraintStatement</a>.
     */

    public void setStatement(Statement statement) {
        this.statement = statement;
    }

    /**
     * <p>
     * The AWS WAF processing statement for the rule, for example <a>ByteMatchStatement</a> or
     * <a>SizeConstraintStatement</a>.
     * </p>
     * 
     * @return The AWS WAF processing statement for the rule, for example <a>ByteMatchStatement</a> or
     *         <a>SizeConstraintStatement</a>.
     */

    public Statement getStatement() {
        return this.statement;
    }

    /**
     * <p>
     * The AWS WAF processing statement for the rule, for example <a>ByteMatchStatement</a> or
     * <a>SizeConstraintStatement</a>.
     * </p>
     * 
     * @param statement
     *        The AWS WAF processing statement for the rule, for example <a>ByteMatchStatement</a> or
     *        <a>SizeConstraintStatement</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Rule withStatement(Statement statement) {
        setStatement(statement);
        return this;
    }

    /**
     * <p>
     * The action that AWS WAF should take on a web request when it matches the rule's statement. Settings at the web
     * ACL level can override the rule action setting.
     * </p>
     * 
     * @param action
     *        The action that AWS WAF should take on a web request when it matches the rule's statement. Settings at the
     *        web ACL level can override the rule action setting.
     */

    public void setAction(RuleAction action) {
        this.action = action;
    }

    /**
     * <p>
     * The action that AWS WAF should take on a web request when it matches the rule's statement. Settings at the web
     * ACL level can override the rule action setting.
     * </p>
     * 
     * @return The action that AWS WAF should take on a web request when it matches the rule's statement. Settings at
     *         the web ACL level can override the rule action setting.
     */

    public RuleAction getAction() {
        return this.action;
    }

    /**
     * <p>
     * The action that AWS WAF should take on a web request when it matches the rule's statement. Settings at the web
     * ACL level can override the rule action setting.
     * </p>
     * 
     * @param action
     *        The action that AWS WAF should take on a web request when it matches the rule's statement. Settings at the
     *        web ACL level can override the rule action setting.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Rule withAction(RuleAction action) {
        setAction(action);
        return this;
    }

    /**
     * <p>
     * The action to use to override the rule's <code>Action</code> setting. You can use no override action, in which
     * case the rule action is in effect, or count action, in which case, if the rule matches a web request, it only
     * counts the match.
     * </p>
     * 
     * @param overrideAction
     *        The action to use to override the rule's <code>Action</code> setting. You can use no override action, in
     *        which case the rule action is in effect, or count action, in which case, if the rule matches a web
     *        request, it only counts the match.
     */

    public void setOverrideAction(OverrideAction overrideAction) {
        this.overrideAction = overrideAction;
    }

    /**
     * <p>
     * The action to use to override the rule's <code>Action</code> setting. You can use no override action, in which
     * case the rule action is in effect, or count action, in which case, if the rule matches a web request, it only
     * counts the match.
     * </p>
     * 
     * @return The action to use to override the rule's <code>Action</code> setting. You can use no override action, in
     *         which case the rule action is in effect, or count action, in which case, if the rule matches a web
     *         request, it only counts the match.
     */

    public OverrideAction getOverrideAction() {
        return this.overrideAction;
    }

    /**
     * <p>
     * The action to use to override the rule's <code>Action</code> setting. You can use no override action, in which
     * case the rule action is in effect, or count action, in which case, if the rule matches a web request, it only
     * counts the match.
     * </p>
     * 
     * @param overrideAction
     *        The action to use to override the rule's <code>Action</code> setting. You can use no override action, in
     *        which case the rule action is in effect, or count action, in which case, if the rule matches a web
     *        request, it only counts the match.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Rule withOverrideAction(OverrideAction overrideAction) {
        setOverrideAction(overrideAction);
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

    public void setVisibilityConfig(VisibilityConfig visibilityConfig) {
        this.visibilityConfig = visibilityConfig;
    }

    /**
     * <p>
     * Defines and enables Amazon CloudWatch metrics and web request sample collection.
     * </p>
     * 
     * @return Defines and enables Amazon CloudWatch metrics and web request sample collection.
     */

    public VisibilityConfig getVisibilityConfig() {
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

    public Rule withVisibilityConfig(VisibilityConfig visibilityConfig) {
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getPriority() != null)
            sb.append("Priority: ").append(getPriority()).append(",");
        if (getStatement() != null)
            sb.append("Statement: ").append(getStatement()).append(",");
        if (getAction() != null)
            sb.append("Action: ").append(getAction()).append(",");
        if (getOverrideAction() != null)
            sb.append("OverrideAction: ").append(getOverrideAction()).append(",");
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

        if (obj instanceof Rule == false)
            return false;
        Rule other = (Rule) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getPriority() == null ^ this.getPriority() == null)
            return false;
        if (other.getPriority() != null && other.getPriority().equals(this.getPriority()) == false)
            return false;
        if (other.getStatement() == null ^ this.getStatement() == null)
            return false;
        if (other.getStatement() != null && other.getStatement().equals(this.getStatement()) == false)
            return false;
        if (other.getAction() == null ^ this.getAction() == null)
            return false;
        if (other.getAction() != null && other.getAction().equals(this.getAction()) == false)
            return false;
        if (other.getOverrideAction() == null ^ this.getOverrideAction() == null)
            return false;
        if (other.getOverrideAction() != null && other.getOverrideAction().equals(this.getOverrideAction()) == false)
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

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getPriority() == null) ? 0 : getPriority().hashCode());
        hashCode = prime * hashCode + ((getStatement() == null) ? 0 : getStatement().hashCode());
        hashCode = prime * hashCode + ((getAction() == null) ? 0 : getAction().hashCode());
        hashCode = prime * hashCode + ((getOverrideAction() == null) ? 0 : getOverrideAction().hashCode());
        hashCode = prime * hashCode + ((getVisibilityConfig() == null) ? 0 : getVisibilityConfig().hashCode());
        return hashCode;
    }

    @Override
    public Rule clone() {
        try {
            return (Rule) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.wafv2.model.transform.RuleMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
