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
package com.amazonaws.services.chimesdkvoice.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/SipRule" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SipRule implements Serializable, Cloneable, StructuredPojo {

    private String sipRuleId;

    private String name;

    private Boolean disabled;

    private String triggerType;

    private String triggerValue;

    private java.util.List<SipRuleTargetApplication> targetApplications;

    private java.util.Date createdTimestamp;

    private java.util.Date updatedTimestamp;

    /**
     * @param sipRuleId
     */

    public void setSipRuleId(String sipRuleId) {
        this.sipRuleId = sipRuleId;
    }

    /**
     * @return
     */

    public String getSipRuleId() {
        return this.sipRuleId;
    }

    /**
     * @param sipRuleId
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SipRule withSipRuleId(String sipRuleId) {
        setSipRuleId(sipRuleId);
        return this;
    }

    /**
     * @param name
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return
     */

    public String getName() {
        return this.name;
    }

    /**
     * @param name
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SipRule withName(String name) {
        setName(name);
        return this;
    }

    /**
     * @param disabled
     */

    public void setDisabled(Boolean disabled) {
        this.disabled = disabled;
    }

    /**
     * @return
     */

    public Boolean getDisabled() {
        return this.disabled;
    }

    /**
     * @param disabled
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SipRule withDisabled(Boolean disabled) {
        setDisabled(disabled);
        return this;
    }

    /**
     * @return
     */

    public Boolean isDisabled() {
        return this.disabled;
    }

    /**
     * @param triggerType
     * @see SipRuleTriggerType
     */

    public void setTriggerType(String triggerType) {
        this.triggerType = triggerType;
    }

    /**
     * @return
     * @see SipRuleTriggerType
     */

    public String getTriggerType() {
        return this.triggerType;
    }

    /**
     * @param triggerType
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SipRuleTriggerType
     */

    public SipRule withTriggerType(String triggerType) {
        setTriggerType(triggerType);
        return this;
    }

    /**
     * @param triggerType
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SipRuleTriggerType
     */

    public SipRule withTriggerType(SipRuleTriggerType triggerType) {
        this.triggerType = triggerType.toString();
        return this;
    }

    /**
     * @param triggerValue
     */

    public void setTriggerValue(String triggerValue) {
        this.triggerValue = triggerValue;
    }

    /**
     * @return
     */

    public String getTriggerValue() {
        return this.triggerValue;
    }

    /**
     * @param triggerValue
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SipRule withTriggerValue(String triggerValue) {
        setTriggerValue(triggerValue);
        return this;
    }

    /**
     * @return
     */

    public java.util.List<SipRuleTargetApplication> getTargetApplications() {
        return targetApplications;
    }

    /**
     * @param targetApplications
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
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTargetApplications(java.util.Collection)} or {@link #withTargetApplications(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param targetApplications
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
     * @param targetApplications
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SipRule withTargetApplications(java.util.Collection<SipRuleTargetApplication> targetApplications) {
        setTargetApplications(targetApplications);
        return this;
    }

    /**
     * @param createdTimestamp
     */

    public void setCreatedTimestamp(java.util.Date createdTimestamp) {
        this.createdTimestamp = createdTimestamp;
    }

    /**
     * @return
     */

    public java.util.Date getCreatedTimestamp() {
        return this.createdTimestamp;
    }

    /**
     * @param createdTimestamp
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SipRule withCreatedTimestamp(java.util.Date createdTimestamp) {
        setCreatedTimestamp(createdTimestamp);
        return this;
    }

    /**
     * @param updatedTimestamp
     */

    public void setUpdatedTimestamp(java.util.Date updatedTimestamp) {
        this.updatedTimestamp = updatedTimestamp;
    }

    /**
     * @return
     */

    public java.util.Date getUpdatedTimestamp() {
        return this.updatedTimestamp;
    }

    /**
     * @param updatedTimestamp
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
        com.amazonaws.services.chimesdkvoice.model.transform.SipRuleMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
