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
package com.amazonaws.services.route53recoveryreadiness.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The result of a successful Rule request, with status for an individual rule.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-recovery-readiness-2019-12-02/RuleResult"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RuleResult implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The time the resource was last checked for readiness, in ISO-8601 format, UTC.
     * </p>
     */
    private java.util.Date lastCheckedTimestamp;
    /**
     * <p>
     * Details about the resource's readiness.
     * </p>
     */
    private java.util.List<Message> messages;
    /**
     * <p>
     * The readiness at rule level.
     * </p>
     */
    private String readiness;
    /**
     * <p>
     * The identifier of the rule.
     * </p>
     */
    private String ruleId;

    /**
     * <p>
     * The time the resource was last checked for readiness, in ISO-8601 format, UTC.
     * </p>
     * 
     * @param lastCheckedTimestamp
     *        The time the resource was last checked for readiness, in ISO-8601 format, UTC.
     */

    public void setLastCheckedTimestamp(java.util.Date lastCheckedTimestamp) {
        this.lastCheckedTimestamp = lastCheckedTimestamp;
    }

    /**
     * <p>
     * The time the resource was last checked for readiness, in ISO-8601 format, UTC.
     * </p>
     * 
     * @return The time the resource was last checked for readiness, in ISO-8601 format, UTC.
     */

    public java.util.Date getLastCheckedTimestamp() {
        return this.lastCheckedTimestamp;
    }

    /**
     * <p>
     * The time the resource was last checked for readiness, in ISO-8601 format, UTC.
     * </p>
     * 
     * @param lastCheckedTimestamp
     *        The time the resource was last checked for readiness, in ISO-8601 format, UTC.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RuleResult withLastCheckedTimestamp(java.util.Date lastCheckedTimestamp) {
        setLastCheckedTimestamp(lastCheckedTimestamp);
        return this;
    }

    /**
     * <p>
     * Details about the resource's readiness.
     * </p>
     * 
     * @return Details about the resource's readiness.
     */

    public java.util.List<Message> getMessages() {
        return messages;
    }

    /**
     * <p>
     * Details about the resource's readiness.
     * </p>
     * 
     * @param messages
     *        Details about the resource's readiness.
     */

    public void setMessages(java.util.Collection<Message> messages) {
        if (messages == null) {
            this.messages = null;
            return;
        }

        this.messages = new java.util.ArrayList<Message>(messages);
    }

    /**
     * <p>
     * Details about the resource's readiness.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setMessages(java.util.Collection)} or {@link #withMessages(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param messages
     *        Details about the resource's readiness.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RuleResult withMessages(Message... messages) {
        if (this.messages == null) {
            setMessages(new java.util.ArrayList<Message>(messages.length));
        }
        for (Message ele : messages) {
            this.messages.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Details about the resource's readiness.
     * </p>
     * 
     * @param messages
     *        Details about the resource's readiness.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RuleResult withMessages(java.util.Collection<Message> messages) {
        setMessages(messages);
        return this;
    }

    /**
     * <p>
     * The readiness at rule level.
     * </p>
     * 
     * @param readiness
     *        The readiness at rule level.
     * @see Readiness
     */

    public void setReadiness(String readiness) {
        this.readiness = readiness;
    }

    /**
     * <p>
     * The readiness at rule level.
     * </p>
     * 
     * @return The readiness at rule level.
     * @see Readiness
     */

    public String getReadiness() {
        return this.readiness;
    }

    /**
     * <p>
     * The readiness at rule level.
     * </p>
     * 
     * @param readiness
     *        The readiness at rule level.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Readiness
     */

    public RuleResult withReadiness(String readiness) {
        setReadiness(readiness);
        return this;
    }

    /**
     * <p>
     * The readiness at rule level.
     * </p>
     * 
     * @param readiness
     *        The readiness at rule level.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Readiness
     */

    public RuleResult withReadiness(Readiness readiness) {
        this.readiness = readiness.toString();
        return this;
    }

    /**
     * <p>
     * The identifier of the rule.
     * </p>
     * 
     * @param ruleId
     *        The identifier of the rule.
     */

    public void setRuleId(String ruleId) {
        this.ruleId = ruleId;
    }

    /**
     * <p>
     * The identifier of the rule.
     * </p>
     * 
     * @return The identifier of the rule.
     */

    public String getRuleId() {
        return this.ruleId;
    }

    /**
     * <p>
     * The identifier of the rule.
     * </p>
     * 
     * @param ruleId
     *        The identifier of the rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RuleResult withRuleId(String ruleId) {
        setRuleId(ruleId);
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
        if (getLastCheckedTimestamp() != null)
            sb.append("LastCheckedTimestamp: ").append(getLastCheckedTimestamp()).append(",");
        if (getMessages() != null)
            sb.append("Messages: ").append(getMessages()).append(",");
        if (getReadiness() != null)
            sb.append("Readiness: ").append(getReadiness()).append(",");
        if (getRuleId() != null)
            sb.append("RuleId: ").append(getRuleId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RuleResult == false)
            return false;
        RuleResult other = (RuleResult) obj;
        if (other.getLastCheckedTimestamp() == null ^ this.getLastCheckedTimestamp() == null)
            return false;
        if (other.getLastCheckedTimestamp() != null && other.getLastCheckedTimestamp().equals(this.getLastCheckedTimestamp()) == false)
            return false;
        if (other.getMessages() == null ^ this.getMessages() == null)
            return false;
        if (other.getMessages() != null && other.getMessages().equals(this.getMessages()) == false)
            return false;
        if (other.getReadiness() == null ^ this.getReadiness() == null)
            return false;
        if (other.getReadiness() != null && other.getReadiness().equals(this.getReadiness()) == false)
            return false;
        if (other.getRuleId() == null ^ this.getRuleId() == null)
            return false;
        if (other.getRuleId() != null && other.getRuleId().equals(this.getRuleId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLastCheckedTimestamp() == null) ? 0 : getLastCheckedTimestamp().hashCode());
        hashCode = prime * hashCode + ((getMessages() == null) ? 0 : getMessages().hashCode());
        hashCode = prime * hashCode + ((getReadiness() == null) ? 0 : getReadiness().hashCode());
        hashCode = prime * hashCode + ((getRuleId() == null) ? 0 : getRuleId().hashCode());
        return hashCode;
    }

    @Override
    public RuleResult clone() {
        try {
            return (RuleResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.route53recoveryreadiness.model.transform.RuleResultMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
