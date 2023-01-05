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
package com.amazonaws.services.connect.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A list of <code>ActionTypes</code> associated with a rule.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/RuleSummary" target="_top">AWS API
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
     * A unique identifier for the rule.
     * </p>
     */
    private String ruleId;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the rule.
     * </p>
     */
    private String ruleArn;
    /**
     * <p>
     * The name of the event source.
     * </p>
     */
    private String eventSourceName;
    /**
     * <p>
     * The publish status of the rule.
     * </p>
     */
    private String publishStatus;
    /**
     * <p>
     * A list of ActionTypes associated with a rule.
     * </p>
     */
    private java.util.List<ActionSummary> actionSummaries;
    /**
     * <p>
     * The timestamp for when the rule was created.
     * </p>
     */
    private java.util.Date createdTime;
    /**
     * <p>
     * The timestamp for when the rule was last updated.
     * </p>
     */
    private java.util.Date lastUpdatedTime;

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
     * A unique identifier for the rule.
     * </p>
     * 
     * @param ruleId
     *        A unique identifier for the rule.
     */

    public void setRuleId(String ruleId) {
        this.ruleId = ruleId;
    }

    /**
     * <p>
     * A unique identifier for the rule.
     * </p>
     * 
     * @return A unique identifier for the rule.
     */

    public String getRuleId() {
        return this.ruleId;
    }

    /**
     * <p>
     * A unique identifier for the rule.
     * </p>
     * 
     * @param ruleId
     *        A unique identifier for the rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RuleSummary withRuleId(String ruleId) {
        setRuleId(ruleId);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the rule.
     * </p>
     * 
     * @param ruleArn
     *        The Amazon Resource Name (ARN) of the rule.
     */

    public void setRuleArn(String ruleArn) {
        this.ruleArn = ruleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the rule.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the rule.
     */

    public String getRuleArn() {
        return this.ruleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the rule.
     * </p>
     * 
     * @param ruleArn
     *        The Amazon Resource Name (ARN) of the rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RuleSummary withRuleArn(String ruleArn) {
        setRuleArn(ruleArn);
        return this;
    }

    /**
     * <p>
     * The name of the event source.
     * </p>
     * 
     * @param eventSourceName
     *        The name of the event source.
     * @see EventSourceName
     */

    public void setEventSourceName(String eventSourceName) {
        this.eventSourceName = eventSourceName;
    }

    /**
     * <p>
     * The name of the event source.
     * </p>
     * 
     * @return The name of the event source.
     * @see EventSourceName
     */

    public String getEventSourceName() {
        return this.eventSourceName;
    }

    /**
     * <p>
     * The name of the event source.
     * </p>
     * 
     * @param eventSourceName
     *        The name of the event source.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EventSourceName
     */

    public RuleSummary withEventSourceName(String eventSourceName) {
        setEventSourceName(eventSourceName);
        return this;
    }

    /**
     * <p>
     * The name of the event source.
     * </p>
     * 
     * @param eventSourceName
     *        The name of the event source.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EventSourceName
     */

    public RuleSummary withEventSourceName(EventSourceName eventSourceName) {
        this.eventSourceName = eventSourceName.toString();
        return this;
    }

    /**
     * <p>
     * The publish status of the rule.
     * </p>
     * 
     * @param publishStatus
     *        The publish status of the rule.
     * @see RulePublishStatus
     */

    public void setPublishStatus(String publishStatus) {
        this.publishStatus = publishStatus;
    }

    /**
     * <p>
     * The publish status of the rule.
     * </p>
     * 
     * @return The publish status of the rule.
     * @see RulePublishStatus
     */

    public String getPublishStatus() {
        return this.publishStatus;
    }

    /**
     * <p>
     * The publish status of the rule.
     * </p>
     * 
     * @param publishStatus
     *        The publish status of the rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RulePublishStatus
     */

    public RuleSummary withPublishStatus(String publishStatus) {
        setPublishStatus(publishStatus);
        return this;
    }

    /**
     * <p>
     * The publish status of the rule.
     * </p>
     * 
     * @param publishStatus
     *        The publish status of the rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RulePublishStatus
     */

    public RuleSummary withPublishStatus(RulePublishStatus publishStatus) {
        this.publishStatus = publishStatus.toString();
        return this;
    }

    /**
     * <p>
     * A list of ActionTypes associated with a rule.
     * </p>
     * 
     * @return A list of ActionTypes associated with a rule.
     */

    public java.util.List<ActionSummary> getActionSummaries() {
        return actionSummaries;
    }

    /**
     * <p>
     * A list of ActionTypes associated with a rule.
     * </p>
     * 
     * @param actionSummaries
     *        A list of ActionTypes associated with a rule.
     */

    public void setActionSummaries(java.util.Collection<ActionSummary> actionSummaries) {
        if (actionSummaries == null) {
            this.actionSummaries = null;
            return;
        }

        this.actionSummaries = new java.util.ArrayList<ActionSummary>(actionSummaries);
    }

    /**
     * <p>
     * A list of ActionTypes associated with a rule.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setActionSummaries(java.util.Collection)} or {@link #withActionSummaries(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param actionSummaries
     *        A list of ActionTypes associated with a rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RuleSummary withActionSummaries(ActionSummary... actionSummaries) {
        if (this.actionSummaries == null) {
            setActionSummaries(new java.util.ArrayList<ActionSummary>(actionSummaries.length));
        }
        for (ActionSummary ele : actionSummaries) {
            this.actionSummaries.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of ActionTypes associated with a rule.
     * </p>
     * 
     * @param actionSummaries
     *        A list of ActionTypes associated with a rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RuleSummary withActionSummaries(java.util.Collection<ActionSummary> actionSummaries) {
        setActionSummaries(actionSummaries);
        return this;
    }

    /**
     * <p>
     * The timestamp for when the rule was created.
     * </p>
     * 
     * @param createdTime
     *        The timestamp for when the rule was created.
     */

    public void setCreatedTime(java.util.Date createdTime) {
        this.createdTime = createdTime;
    }

    /**
     * <p>
     * The timestamp for when the rule was created.
     * </p>
     * 
     * @return The timestamp for when the rule was created.
     */

    public java.util.Date getCreatedTime() {
        return this.createdTime;
    }

    /**
     * <p>
     * The timestamp for when the rule was created.
     * </p>
     * 
     * @param createdTime
     *        The timestamp for when the rule was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RuleSummary withCreatedTime(java.util.Date createdTime) {
        setCreatedTime(createdTime);
        return this;
    }

    /**
     * <p>
     * The timestamp for when the rule was last updated.
     * </p>
     * 
     * @param lastUpdatedTime
     *        The timestamp for when the rule was last updated.
     */

    public void setLastUpdatedTime(java.util.Date lastUpdatedTime) {
        this.lastUpdatedTime = lastUpdatedTime;
    }

    /**
     * <p>
     * The timestamp for when the rule was last updated.
     * </p>
     * 
     * @return The timestamp for when the rule was last updated.
     */

    public java.util.Date getLastUpdatedTime() {
        return this.lastUpdatedTime;
    }

    /**
     * <p>
     * The timestamp for when the rule was last updated.
     * </p>
     * 
     * @param lastUpdatedTime
     *        The timestamp for when the rule was last updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RuleSummary withLastUpdatedTime(java.util.Date lastUpdatedTime) {
        setLastUpdatedTime(lastUpdatedTime);
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
        if (getRuleId() != null)
            sb.append("RuleId: ").append(getRuleId()).append(",");
        if (getRuleArn() != null)
            sb.append("RuleArn: ").append(getRuleArn()).append(",");
        if (getEventSourceName() != null)
            sb.append("EventSourceName: ").append(getEventSourceName()).append(",");
        if (getPublishStatus() != null)
            sb.append("PublishStatus: ").append(getPublishStatus()).append(",");
        if (getActionSummaries() != null)
            sb.append("ActionSummaries: ").append(getActionSummaries()).append(",");
        if (getCreatedTime() != null)
            sb.append("CreatedTime: ").append(getCreatedTime()).append(",");
        if (getLastUpdatedTime() != null)
            sb.append("LastUpdatedTime: ").append(getLastUpdatedTime());
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
        if (other.getRuleId() == null ^ this.getRuleId() == null)
            return false;
        if (other.getRuleId() != null && other.getRuleId().equals(this.getRuleId()) == false)
            return false;
        if (other.getRuleArn() == null ^ this.getRuleArn() == null)
            return false;
        if (other.getRuleArn() != null && other.getRuleArn().equals(this.getRuleArn()) == false)
            return false;
        if (other.getEventSourceName() == null ^ this.getEventSourceName() == null)
            return false;
        if (other.getEventSourceName() != null && other.getEventSourceName().equals(this.getEventSourceName()) == false)
            return false;
        if (other.getPublishStatus() == null ^ this.getPublishStatus() == null)
            return false;
        if (other.getPublishStatus() != null && other.getPublishStatus().equals(this.getPublishStatus()) == false)
            return false;
        if (other.getActionSummaries() == null ^ this.getActionSummaries() == null)
            return false;
        if (other.getActionSummaries() != null && other.getActionSummaries().equals(this.getActionSummaries()) == false)
            return false;
        if (other.getCreatedTime() == null ^ this.getCreatedTime() == null)
            return false;
        if (other.getCreatedTime() != null && other.getCreatedTime().equals(this.getCreatedTime()) == false)
            return false;
        if (other.getLastUpdatedTime() == null ^ this.getLastUpdatedTime() == null)
            return false;
        if (other.getLastUpdatedTime() != null && other.getLastUpdatedTime().equals(this.getLastUpdatedTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getRuleId() == null) ? 0 : getRuleId().hashCode());
        hashCode = prime * hashCode + ((getRuleArn() == null) ? 0 : getRuleArn().hashCode());
        hashCode = prime * hashCode + ((getEventSourceName() == null) ? 0 : getEventSourceName().hashCode());
        hashCode = prime * hashCode + ((getPublishStatus() == null) ? 0 : getPublishStatus().hashCode());
        hashCode = prime * hashCode + ((getActionSummaries() == null) ? 0 : getActionSummaries().hashCode());
        hashCode = prime * hashCode + ((getCreatedTime() == null) ? 0 : getCreatedTime().hashCode());
        hashCode = prime * hashCode + ((getLastUpdatedTime() == null) ? 0 : getLastUpdatedTime().hashCode());
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
        com.amazonaws.services.connect.model.transform.RuleSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
