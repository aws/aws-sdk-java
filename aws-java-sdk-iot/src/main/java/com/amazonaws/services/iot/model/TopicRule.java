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
package com.amazonaws.services.iot.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes a rule.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TopicRule implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the rule.
     * </p>
     */
    private String ruleName;
    /**
     * <p>
     * The SQL statement used to query the topic. When using a SQL query with multiple lines, be sure to escape the
     * newline characters.
     * </p>
     */
    private String sql;
    /**
     * <p>
     * The description of the rule.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The date and time the rule was created.
     * </p>
     */
    private java.util.Date createdAt;
    /**
     * <p>
     * The actions associated with the rule.
     * </p>
     */
    private java.util.List<Action> actions;
    /**
     * <p>
     * Specifies whether the rule is disabled.
     * </p>
     */
    private Boolean ruleDisabled;
    /**
     * <p>
     * The version of the SQL rules engine to use when evaluating the rule.
     * </p>
     */
    private String awsIotSqlVersion;
    /**
     * <p>
     * The action to perform when an error occurs.
     * </p>
     */
    private Action errorAction;

    /**
     * <p>
     * The name of the rule.
     * </p>
     * 
     * @param ruleName
     *        The name of the rule.
     */

    public void setRuleName(String ruleName) {
        this.ruleName = ruleName;
    }

    /**
     * <p>
     * The name of the rule.
     * </p>
     * 
     * @return The name of the rule.
     */

    public String getRuleName() {
        return this.ruleName;
    }

    /**
     * <p>
     * The name of the rule.
     * </p>
     * 
     * @param ruleName
     *        The name of the rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TopicRule withRuleName(String ruleName) {
        setRuleName(ruleName);
        return this;
    }

    /**
     * <p>
     * The SQL statement used to query the topic. When using a SQL query with multiple lines, be sure to escape the
     * newline characters.
     * </p>
     * 
     * @param sql
     *        The SQL statement used to query the topic. When using a SQL query with multiple lines, be sure to escape
     *        the newline characters.
     */

    public void setSql(String sql) {
        this.sql = sql;
    }

    /**
     * <p>
     * The SQL statement used to query the topic. When using a SQL query with multiple lines, be sure to escape the
     * newline characters.
     * </p>
     * 
     * @return The SQL statement used to query the topic. When using a SQL query with multiple lines, be sure to escape
     *         the newline characters.
     */

    public String getSql() {
        return this.sql;
    }

    /**
     * <p>
     * The SQL statement used to query the topic. When using a SQL query with multiple lines, be sure to escape the
     * newline characters.
     * </p>
     * 
     * @param sql
     *        The SQL statement used to query the topic. When using a SQL query with multiple lines, be sure to escape
     *        the newline characters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TopicRule withSql(String sql) {
        setSql(sql);
        return this;
    }

    /**
     * <p>
     * The description of the rule.
     * </p>
     * 
     * @param description
     *        The description of the rule.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the rule.
     * </p>
     * 
     * @return The description of the rule.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the rule.
     * </p>
     * 
     * @param description
     *        The description of the rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TopicRule withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The date and time the rule was created.
     * </p>
     * 
     * @param createdAt
     *        The date and time the rule was created.
     */

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * The date and time the rule was created.
     * </p>
     * 
     * @return The date and time the rule was created.
     */

    public java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    /**
     * <p>
     * The date and time the rule was created.
     * </p>
     * 
     * @param createdAt
     *        The date and time the rule was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TopicRule withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
        return this;
    }

    /**
     * <p>
     * The actions associated with the rule.
     * </p>
     * 
     * @return The actions associated with the rule.
     */

    public java.util.List<Action> getActions() {
        return actions;
    }

    /**
     * <p>
     * The actions associated with the rule.
     * </p>
     * 
     * @param actions
     *        The actions associated with the rule.
     */

    public void setActions(java.util.Collection<Action> actions) {
        if (actions == null) {
            this.actions = null;
            return;
        }

        this.actions = new java.util.ArrayList<Action>(actions);
    }

    /**
     * <p>
     * The actions associated with the rule.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setActions(java.util.Collection)} or {@link #withActions(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param actions
     *        The actions associated with the rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TopicRule withActions(Action... actions) {
        if (this.actions == null) {
            setActions(new java.util.ArrayList<Action>(actions.length));
        }
        for (Action ele : actions) {
            this.actions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The actions associated with the rule.
     * </p>
     * 
     * @param actions
     *        The actions associated with the rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TopicRule withActions(java.util.Collection<Action> actions) {
        setActions(actions);
        return this;
    }

    /**
     * <p>
     * Specifies whether the rule is disabled.
     * </p>
     * 
     * @param ruleDisabled
     *        Specifies whether the rule is disabled.
     */

    public void setRuleDisabled(Boolean ruleDisabled) {
        this.ruleDisabled = ruleDisabled;
    }

    /**
     * <p>
     * Specifies whether the rule is disabled.
     * </p>
     * 
     * @return Specifies whether the rule is disabled.
     */

    public Boolean getRuleDisabled() {
        return this.ruleDisabled;
    }

    /**
     * <p>
     * Specifies whether the rule is disabled.
     * </p>
     * 
     * @param ruleDisabled
     *        Specifies whether the rule is disabled.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TopicRule withRuleDisabled(Boolean ruleDisabled) {
        setRuleDisabled(ruleDisabled);
        return this;
    }

    /**
     * <p>
     * Specifies whether the rule is disabled.
     * </p>
     * 
     * @return Specifies whether the rule is disabled.
     */

    public Boolean isRuleDisabled() {
        return this.ruleDisabled;
    }

    /**
     * <p>
     * The version of the SQL rules engine to use when evaluating the rule.
     * </p>
     * 
     * @param awsIotSqlVersion
     *        The version of the SQL rules engine to use when evaluating the rule.
     */

    public void setAwsIotSqlVersion(String awsIotSqlVersion) {
        this.awsIotSqlVersion = awsIotSqlVersion;
    }

    /**
     * <p>
     * The version of the SQL rules engine to use when evaluating the rule.
     * </p>
     * 
     * @return The version of the SQL rules engine to use when evaluating the rule.
     */

    public String getAwsIotSqlVersion() {
        return this.awsIotSqlVersion;
    }

    /**
     * <p>
     * The version of the SQL rules engine to use when evaluating the rule.
     * </p>
     * 
     * @param awsIotSqlVersion
     *        The version of the SQL rules engine to use when evaluating the rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TopicRule withAwsIotSqlVersion(String awsIotSqlVersion) {
        setAwsIotSqlVersion(awsIotSqlVersion);
        return this;
    }

    /**
     * <p>
     * The action to perform when an error occurs.
     * </p>
     * 
     * @param errorAction
     *        The action to perform when an error occurs.
     */

    public void setErrorAction(Action errorAction) {
        this.errorAction = errorAction;
    }

    /**
     * <p>
     * The action to perform when an error occurs.
     * </p>
     * 
     * @return The action to perform when an error occurs.
     */

    public Action getErrorAction() {
        return this.errorAction;
    }

    /**
     * <p>
     * The action to perform when an error occurs.
     * </p>
     * 
     * @param errorAction
     *        The action to perform when an error occurs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TopicRule withErrorAction(Action errorAction) {
        setErrorAction(errorAction);
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
        if (getRuleName() != null)
            sb.append("RuleName: ").append(getRuleName()).append(",");
        if (getSql() != null)
            sb.append("Sql: ").append(getSql()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getCreatedAt() != null)
            sb.append("CreatedAt: ").append(getCreatedAt()).append(",");
        if (getActions() != null)
            sb.append("Actions: ").append(getActions()).append(",");
        if (getRuleDisabled() != null)
            sb.append("RuleDisabled: ").append(getRuleDisabled()).append(",");
        if (getAwsIotSqlVersion() != null)
            sb.append("AwsIotSqlVersion: ").append(getAwsIotSqlVersion()).append(",");
        if (getErrorAction() != null)
            sb.append("ErrorAction: ").append(getErrorAction());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TopicRule == false)
            return false;
        TopicRule other = (TopicRule) obj;
        if (other.getRuleName() == null ^ this.getRuleName() == null)
            return false;
        if (other.getRuleName() != null && other.getRuleName().equals(this.getRuleName()) == false)
            return false;
        if (other.getSql() == null ^ this.getSql() == null)
            return false;
        if (other.getSql() != null && other.getSql().equals(this.getSql()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        if (other.getActions() == null ^ this.getActions() == null)
            return false;
        if (other.getActions() != null && other.getActions().equals(this.getActions()) == false)
            return false;
        if (other.getRuleDisabled() == null ^ this.getRuleDisabled() == null)
            return false;
        if (other.getRuleDisabled() != null && other.getRuleDisabled().equals(this.getRuleDisabled()) == false)
            return false;
        if (other.getAwsIotSqlVersion() == null ^ this.getAwsIotSqlVersion() == null)
            return false;
        if (other.getAwsIotSqlVersion() != null && other.getAwsIotSqlVersion().equals(this.getAwsIotSqlVersion()) == false)
            return false;
        if (other.getErrorAction() == null ^ this.getErrorAction() == null)
            return false;
        if (other.getErrorAction() != null && other.getErrorAction().equals(this.getErrorAction()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRuleName() == null) ? 0 : getRuleName().hashCode());
        hashCode = prime * hashCode + ((getSql() == null) ? 0 : getSql().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getActions() == null) ? 0 : getActions().hashCode());
        hashCode = prime * hashCode + ((getRuleDisabled() == null) ? 0 : getRuleDisabled().hashCode());
        hashCode = prime * hashCode + ((getAwsIotSqlVersion() == null) ? 0 : getAwsIotSqlVersion().hashCode());
        hashCode = prime * hashCode + ((getErrorAction() == null) ? 0 : getErrorAction().hashCode());
        return hashCode;
    }

    @Override
    public TopicRule clone() {
        try {
            return (TopicRule) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iot.model.transform.TopicRuleMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
