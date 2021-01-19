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
package com.amazonaws.services.chime.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The SIP rule details, including name, triggers, and target applications. An AWS account can have multiple SIP rules.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/SipRule" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SipRule implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The SIP rule ID.
     * </p>
     */
    private String sipRuleId;
    /**
     * <p>
     * The name of the SIP rule.
     * </p>
     */
    private String name;
    /**
     * <p>
     * Indicates whether the SIP rule is enabled or disabled. You must disable a rule before you can delete it.
     * </p>
     */
    private Boolean disabled;
    /**
     * <p>
     * The type of trigger assigned to the SIP rule in <code>TriggerValue</code>, currently
     * <code>RequestUriHostname</code> or <code>ToPhoneNumber</code>.
     * </p>
     */
    private String triggerType;
    /**
     * <p>
     * If <code>TriggerType</code> is <code>RequestUriHostname</code>, then the value can be the outbound host name of
     * the Amazon Chime Voice Connector. If <code>TriggerType</code> is <code>ToPhoneNumber</code>, then the value can
     * be a customer-owned phone number in E164 format. <code>SipRule</code> is triggered when a SIP rule requests host
     * name or <code>ToPhoneNumber</code> matches in the incoming SIP request.
     * </p>
     */
    private String triggerValue;
    /**
     * <p>
     * Target SIP media application and other details, such as priority and AWS Region, to be specified in the SIP rule.
     * Only one SIP rule per AWS Region can be provided.
     * </p>
     */
    private java.util.List<SipRuleTargetApplication> targetApplications;
    /**
     * <p>
     * The time at which the SIP rule was created, in ISO 8601 format.
     * </p>
     */
    private java.util.Date createdTimestamp;
    /**
     * <p>
     * The time at which the SIP rule was last updated, in ISO 8601 format.
     * </p>
     */
    private java.util.Date updatedTimestamp;

    /**
     * <p>
     * The SIP rule ID.
     * </p>
     * 
     * @param sipRuleId
     *        The SIP rule ID.
     */

    public void setSipRuleId(String sipRuleId) {
        this.sipRuleId = sipRuleId;
    }

    /**
     * <p>
     * The SIP rule ID.
     * </p>
     * 
     * @return The SIP rule ID.
     */

    public String getSipRuleId() {
        return this.sipRuleId;
    }

    /**
     * <p>
     * The SIP rule ID.
     * </p>
     * 
     * @param sipRuleId
     *        The SIP rule ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SipRule withSipRuleId(String sipRuleId) {
        setSipRuleId(sipRuleId);
        return this;
    }

    /**
     * <p>
     * The name of the SIP rule.
     * </p>
     * 
     * @param name
     *        The name of the SIP rule.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the SIP rule.
     * </p>
     * 
     * @return The name of the SIP rule.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the SIP rule.
     * </p>
     * 
     * @param name
     *        The name of the SIP rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SipRule withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * Indicates whether the SIP rule is enabled or disabled. You must disable a rule before you can delete it.
     * </p>
     * 
     * @param disabled
     *        Indicates whether the SIP rule is enabled or disabled. You must disable a rule before you can delete it.
     */

    public void setDisabled(Boolean disabled) {
        this.disabled = disabled;
    }

    /**
     * <p>
     * Indicates whether the SIP rule is enabled or disabled. You must disable a rule before you can delete it.
     * </p>
     * 
     * @return Indicates whether the SIP rule is enabled or disabled. You must disable a rule before you can delete it.
     */

    public Boolean getDisabled() {
        return this.disabled;
    }

    /**
     * <p>
     * Indicates whether the SIP rule is enabled or disabled. You must disable a rule before you can delete it.
     * </p>
     * 
     * @param disabled
     *        Indicates whether the SIP rule is enabled or disabled. You must disable a rule before you can delete it.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SipRule withDisabled(Boolean disabled) {
        setDisabled(disabled);
        return this;
    }

    /**
     * <p>
     * Indicates whether the SIP rule is enabled or disabled. You must disable a rule before you can delete it.
     * </p>
     * 
     * @return Indicates whether the SIP rule is enabled or disabled. You must disable a rule before you can delete it.
     */

    public Boolean isDisabled() {
        return this.disabled;
    }

    /**
     * <p>
     * The type of trigger assigned to the SIP rule in <code>TriggerValue</code>, currently
     * <code>RequestUriHostname</code> or <code>ToPhoneNumber</code>.
     * </p>
     * 
     * @param triggerType
     *        The type of trigger assigned to the SIP rule in <code>TriggerValue</code>, currently
     *        <code>RequestUriHostname</code> or <code>ToPhoneNumber</code>.
     * @see SipRuleTriggerType
     */

    public void setTriggerType(String triggerType) {
        this.triggerType = triggerType;
    }

    /**
     * <p>
     * The type of trigger assigned to the SIP rule in <code>TriggerValue</code>, currently
     * <code>RequestUriHostname</code> or <code>ToPhoneNumber</code>.
     * </p>
     * 
     * @return The type of trigger assigned to the SIP rule in <code>TriggerValue</code>, currently
     *         <code>RequestUriHostname</code> or <code>ToPhoneNumber</code>.
     * @see SipRuleTriggerType
     */

    public String getTriggerType() {
        return this.triggerType;
    }

    /**
     * <p>
     * The type of trigger assigned to the SIP rule in <code>TriggerValue</code>, currently
     * <code>RequestUriHostname</code> or <code>ToPhoneNumber</code>.
     * </p>
     * 
     * @param triggerType
     *        The type of trigger assigned to the SIP rule in <code>TriggerValue</code>, currently
     *        <code>RequestUriHostname</code> or <code>ToPhoneNumber</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SipRuleTriggerType
     */

    public SipRule withTriggerType(String triggerType) {
        setTriggerType(triggerType);
        return this;
    }

    /**
     * <p>
     * The type of trigger assigned to the SIP rule in <code>TriggerValue</code>, currently
     * <code>RequestUriHostname</code> or <code>ToPhoneNumber</code>.
     * </p>
     * 
     * @param triggerType
     *        The type of trigger assigned to the SIP rule in <code>TriggerValue</code>, currently
     *        <code>RequestUriHostname</code> or <code>ToPhoneNumber</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SipRuleTriggerType
     */

    public SipRule withTriggerType(SipRuleTriggerType triggerType) {
        this.triggerType = triggerType.toString();
        return this;
    }

    /**
     * <p>
     * If <code>TriggerType</code> is <code>RequestUriHostname</code>, then the value can be the outbound host name of
     * the Amazon Chime Voice Connector. If <code>TriggerType</code> is <code>ToPhoneNumber</code>, then the value can
     * be a customer-owned phone number in E164 format. <code>SipRule</code> is triggered when a SIP rule requests host
     * name or <code>ToPhoneNumber</code> matches in the incoming SIP request.
     * </p>
     * 
     * @param triggerValue
     *        If <code>TriggerType</code> is <code>RequestUriHostname</code>, then the value can be the outbound host
     *        name of the Amazon Chime Voice Connector. If <code>TriggerType</code> is <code>ToPhoneNumber</code>, then
     *        the value can be a customer-owned phone number in E164 format. <code>SipRule</code> is triggered when a
     *        SIP rule requests host name or <code>ToPhoneNumber</code> matches in the incoming SIP request.
     */

    public void setTriggerValue(String triggerValue) {
        this.triggerValue = triggerValue;
    }

    /**
     * <p>
     * If <code>TriggerType</code> is <code>RequestUriHostname</code>, then the value can be the outbound host name of
     * the Amazon Chime Voice Connector. If <code>TriggerType</code> is <code>ToPhoneNumber</code>, then the value can
     * be a customer-owned phone number in E164 format. <code>SipRule</code> is triggered when a SIP rule requests host
     * name or <code>ToPhoneNumber</code> matches in the incoming SIP request.
     * </p>
     * 
     * @return If <code>TriggerType</code> is <code>RequestUriHostname</code>, then the value can be the outbound host
     *         name of the Amazon Chime Voice Connector. If <code>TriggerType</code> is <code>ToPhoneNumber</code>, then
     *         the value can be a customer-owned phone number in E164 format. <code>SipRule</code> is triggered when a
     *         SIP rule requests host name or <code>ToPhoneNumber</code> matches in the incoming SIP request.
     */

    public String getTriggerValue() {
        return this.triggerValue;
    }

    /**
     * <p>
     * If <code>TriggerType</code> is <code>RequestUriHostname</code>, then the value can be the outbound host name of
     * the Amazon Chime Voice Connector. If <code>TriggerType</code> is <code>ToPhoneNumber</code>, then the value can
     * be a customer-owned phone number in E164 format. <code>SipRule</code> is triggered when a SIP rule requests host
     * name or <code>ToPhoneNumber</code> matches in the incoming SIP request.
     * </p>
     * 
     * @param triggerValue
     *        If <code>TriggerType</code> is <code>RequestUriHostname</code>, then the value can be the outbound host
     *        name of the Amazon Chime Voice Connector. If <code>TriggerType</code> is <code>ToPhoneNumber</code>, then
     *        the value can be a customer-owned phone number in E164 format. <code>SipRule</code> is triggered when a
     *        SIP rule requests host name or <code>ToPhoneNumber</code> matches in the incoming SIP request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SipRule withTriggerValue(String triggerValue) {
        setTriggerValue(triggerValue);
        return this;
    }

    /**
     * <p>
     * Target SIP media application and other details, such as priority and AWS Region, to be specified in the SIP rule.
     * Only one SIP rule per AWS Region can be provided.
     * </p>
     * 
     * @return Target SIP media application and other details, such as priority and AWS Region, to be specified in the
     *         SIP rule. Only one SIP rule per AWS Region can be provided.
     */

    public java.util.List<SipRuleTargetApplication> getTargetApplications() {
        return targetApplications;
    }

    /**
     * <p>
     * Target SIP media application and other details, such as priority and AWS Region, to be specified in the SIP rule.
     * Only one SIP rule per AWS Region can be provided.
     * </p>
     * 
     * @param targetApplications
     *        Target SIP media application and other details, such as priority and AWS Region, to be specified in the
     *        SIP rule. Only one SIP rule per AWS Region can be provided.
     */

    public void setTargetApplications(java.util.Collection<SipRuleTargetApplication> targetApplications) {
        if (targetApplications == null) {
            this.targetApplications = null;
            return;
        }

        this.targetApplications = new java.util.ArrayList<SipRuleTargetApplication>(targetApplications);
    }

    /**
     * <p>
     * Target SIP media application and other details, such as priority and AWS Region, to be specified in the SIP rule.
     * Only one SIP rule per AWS Region can be provided.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTargetApplications(java.util.Collection)} or {@link #withTargetApplications(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param targetApplications
     *        Target SIP media application and other details, such as priority and AWS Region, to be specified in the
     *        SIP rule. Only one SIP rule per AWS Region can be provided.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SipRule withTargetApplications(SipRuleTargetApplication... targetApplications) {
        if (this.targetApplications == null) {
            setTargetApplications(new java.util.ArrayList<SipRuleTargetApplication>(targetApplications.length));
        }
        for (SipRuleTargetApplication ele : targetApplications) {
            this.targetApplications.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Target SIP media application and other details, such as priority and AWS Region, to be specified in the SIP rule.
     * Only one SIP rule per AWS Region can be provided.
     * </p>
     * 
     * @param targetApplications
     *        Target SIP media application and other details, such as priority and AWS Region, to be specified in the
     *        SIP rule. Only one SIP rule per AWS Region can be provided.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SipRule withTargetApplications(java.util.Collection<SipRuleTargetApplication> targetApplications) {
        setTargetApplications(targetApplications);
        return this;
    }

    /**
     * <p>
     * The time at which the SIP rule was created, in ISO 8601 format.
     * </p>
     * 
     * @param createdTimestamp
     *        The time at which the SIP rule was created, in ISO 8601 format.
     */

    public void setCreatedTimestamp(java.util.Date createdTimestamp) {
        this.createdTimestamp = createdTimestamp;
    }

    /**
     * <p>
     * The time at which the SIP rule was created, in ISO 8601 format.
     * </p>
     * 
     * @return The time at which the SIP rule was created, in ISO 8601 format.
     */

    public java.util.Date getCreatedTimestamp() {
        return this.createdTimestamp;
    }

    /**
     * <p>
     * The time at which the SIP rule was created, in ISO 8601 format.
     * </p>
     * 
     * @param createdTimestamp
     *        The time at which the SIP rule was created, in ISO 8601 format.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SipRule withCreatedTimestamp(java.util.Date createdTimestamp) {
        setCreatedTimestamp(createdTimestamp);
        return this;
    }

    /**
     * <p>
     * The time at which the SIP rule was last updated, in ISO 8601 format.
     * </p>
     * 
     * @param updatedTimestamp
     *        The time at which the SIP rule was last updated, in ISO 8601 format.
     */

    public void setUpdatedTimestamp(java.util.Date updatedTimestamp) {
        this.updatedTimestamp = updatedTimestamp;
    }

    /**
     * <p>
     * The time at which the SIP rule was last updated, in ISO 8601 format.
     * </p>
     * 
     * @return The time at which the SIP rule was last updated, in ISO 8601 format.
     */

    public java.util.Date getUpdatedTimestamp() {
        return this.updatedTimestamp;
    }

    /**
     * <p>
     * The time at which the SIP rule was last updated, in ISO 8601 format.
     * </p>
     * 
     * @param updatedTimestamp
     *        The time at which the SIP rule was last updated, in ISO 8601 format.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SipRule withUpdatedTimestamp(java.util.Date updatedTimestamp) {
        setUpdatedTimestamp(updatedTimestamp);
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
        if (getSipRuleId() != null)
            sb.append("SipRuleId: ").append(getSipRuleId()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getDisabled() != null)
            sb.append("Disabled: ").append(getDisabled()).append(",");
        if (getTriggerType() != null)
            sb.append("TriggerType: ").append(getTriggerType()).append(",");
        if (getTriggerValue() != null)
            sb.append("TriggerValue: ").append(getTriggerValue()).append(",");
        if (getTargetApplications() != null)
            sb.append("TargetApplications: ").append(getTargetApplications()).append(",");
        if (getCreatedTimestamp() != null)
            sb.append("CreatedTimestamp: ").append(getCreatedTimestamp()).append(",");
        if (getUpdatedTimestamp() != null)
            sb.append("UpdatedTimestamp: ").append(getUpdatedTimestamp());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SipRule == false)
            return false;
        SipRule other = (SipRule) obj;
        if (other.getSipRuleId() == null ^ this.getSipRuleId() == null)
            return false;
        if (other.getSipRuleId() != null && other.getSipRuleId().equals(this.getSipRuleId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDisabled() == null ^ this.getDisabled() == null)
            return false;
        if (other.getDisabled() != null && other.getDisabled().equals(this.getDisabled()) == false)
            return false;
        if (other.getTriggerType() == null ^ this.getTriggerType() == null)
            return false;
        if (other.getTriggerType() != null && other.getTriggerType().equals(this.getTriggerType()) == false)
            return false;
        if (other.getTriggerValue() == null ^ this.getTriggerValue() == null)
            return false;
        if (other.getTriggerValue() != null && other.getTriggerValue().equals(this.getTriggerValue()) == false)
            return false;
        if (other.getTargetApplications() == null ^ this.getTargetApplications() == null)
            return false;
        if (other.getTargetApplications() != null && other.getTargetApplications().equals(this.getTargetApplications()) == false)
            return false;
        if (other.getCreatedTimestamp() == null ^ this.getCreatedTimestamp() == null)
            return false;
        if (other.getCreatedTimestamp() != null && other.getCreatedTimestamp().equals(this.getCreatedTimestamp()) == false)
            return false;
        if (other.getUpdatedTimestamp() == null ^ this.getUpdatedTimestamp() == null)
            return false;
        if (other.getUpdatedTimestamp() != null && other.getUpdatedTimestamp().equals(this.getUpdatedTimestamp()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSipRuleId() == null) ? 0 : getSipRuleId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDisabled() == null) ? 0 : getDisabled().hashCode());
        hashCode = prime * hashCode + ((getTriggerType() == null) ? 0 : getTriggerType().hashCode());
        hashCode = prime * hashCode + ((getTriggerValue() == null) ? 0 : getTriggerValue().hashCode());
        hashCode = prime * hashCode + ((getTargetApplications() == null) ? 0 : getTargetApplications().hashCode());
        hashCode = prime * hashCode + ((getCreatedTimestamp() == null) ? 0 : getCreatedTimestamp().hashCode());
        hashCode = prime * hashCode + ((getUpdatedTimestamp() == null) ? 0 : getUpdatedTimestamp().hashCode());
        return hashCode;
    }

    @Override
    public SipRule clone() {
        try {
            return (SipRule) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.chime.model.transform.SipRuleMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
