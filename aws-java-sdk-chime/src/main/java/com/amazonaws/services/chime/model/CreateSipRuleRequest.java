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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/CreateSipRule" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateSipRuleRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the SIP rule.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The type of trigger assigned to the SIP rule in <code>TriggerValue</code>, currently
     * <code>RequestUriHostname</code> or <code>ToPhoneNumber</code>.
     * </p>
     */
    private String triggerType;
    /**
     * <p>
     * If <code>TriggerType</code> is <code>RequestUriHostname</code>, the value can be the outbound host name of an
     * Amazon Chime Voice Connector. If <code>TriggerType</code> is <code>ToPhoneNumber</code>, the value can be a
     * customer-owned phone number in the E164 format. The <code>SipMediaApplication</code> specified in the
     * <code>SipRule</code> is triggered if the request URI in an incoming SIP request matches the
     * <code>RequestUriHostname</code>, or if the <code>To</code> header in the incoming SIP request matches the
     * <code>ToPhoneNumber</code> value.
     * </p>
     */
    private String triggerValue;
    /**
     * <p>
     * Enables or disables a rule. You must disable rules before you can delete them.
     * </p>
     */
    private Boolean disabled;
    /**
     * <p>
     * List of SIP media applications with priority and AWS Region. Only one SIP application per AWS Region can be used.
     * </p>
     */
    private java.util.List<SipRuleTargetApplication> targetApplications;

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

    public CreateSipRuleRequest withName(String name) {
        setName(name);
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

    public CreateSipRuleRequest withTriggerType(String triggerType) {
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

    public CreateSipRuleRequest withTriggerType(SipRuleTriggerType triggerType) {
        this.triggerType = triggerType.toString();
        return this;
    }

    /**
     * <p>
     * If <code>TriggerType</code> is <code>RequestUriHostname</code>, the value can be the outbound host name of an
     * Amazon Chime Voice Connector. If <code>TriggerType</code> is <code>ToPhoneNumber</code>, the value can be a
     * customer-owned phone number in the E164 format. The <code>SipMediaApplication</code> specified in the
     * <code>SipRule</code> is triggered if the request URI in an incoming SIP request matches the
     * <code>RequestUriHostname</code>, or if the <code>To</code> header in the incoming SIP request matches the
     * <code>ToPhoneNumber</code> value.
     * </p>
     * 
     * @param triggerValue
     *        If <code>TriggerType</code> is <code>RequestUriHostname</code>, the value can be the outbound host name of
     *        an Amazon Chime Voice Connector. If <code>TriggerType</code> is <code>ToPhoneNumber</code>, the value can
     *        be a customer-owned phone number in the E164 format. The <code>SipMediaApplication</code> specified in the
     *        <code>SipRule</code> is triggered if the request URI in an incoming SIP request matches the
     *        <code>RequestUriHostname</code>, or if the <code>To</code> header in the incoming SIP request matches the
     *        <code>ToPhoneNumber</code> value.
     */

    public void setTriggerValue(String triggerValue) {
        this.triggerValue = triggerValue;
    }

    /**
     * <p>
     * If <code>TriggerType</code> is <code>RequestUriHostname</code>, the value can be the outbound host name of an
     * Amazon Chime Voice Connector. If <code>TriggerType</code> is <code>ToPhoneNumber</code>, the value can be a
     * customer-owned phone number in the E164 format. The <code>SipMediaApplication</code> specified in the
     * <code>SipRule</code> is triggered if the request URI in an incoming SIP request matches the
     * <code>RequestUriHostname</code>, or if the <code>To</code> header in the incoming SIP request matches the
     * <code>ToPhoneNumber</code> value.
     * </p>
     * 
     * @return If <code>TriggerType</code> is <code>RequestUriHostname</code>, the value can be the outbound host name
     *         of an Amazon Chime Voice Connector. If <code>TriggerType</code> is <code>ToPhoneNumber</code>, the value
     *         can be a customer-owned phone number in the E164 format. The <code>SipMediaApplication</code> specified
     *         in the <code>SipRule</code> is triggered if the request URI in an incoming SIP request matches the
     *         <code>RequestUriHostname</code>, or if the <code>To</code> header in the incoming SIP request matches the
     *         <code>ToPhoneNumber</code> value.
     */

    public String getTriggerValue() {
        return this.triggerValue;
    }

    /**
     * <p>
     * If <code>TriggerType</code> is <code>RequestUriHostname</code>, the value can be the outbound host name of an
     * Amazon Chime Voice Connector. If <code>TriggerType</code> is <code>ToPhoneNumber</code>, the value can be a
     * customer-owned phone number in the E164 format. The <code>SipMediaApplication</code> specified in the
     * <code>SipRule</code> is triggered if the request URI in an incoming SIP request matches the
     * <code>RequestUriHostname</code>, or if the <code>To</code> header in the incoming SIP request matches the
     * <code>ToPhoneNumber</code> value.
     * </p>
     * 
     * @param triggerValue
     *        If <code>TriggerType</code> is <code>RequestUriHostname</code>, the value can be the outbound host name of
     *        an Amazon Chime Voice Connector. If <code>TriggerType</code> is <code>ToPhoneNumber</code>, the value can
     *        be a customer-owned phone number in the E164 format. The <code>SipMediaApplication</code> specified in the
     *        <code>SipRule</code> is triggered if the request URI in an incoming SIP request matches the
     *        <code>RequestUriHostname</code>, or if the <code>To</code> header in the incoming SIP request matches the
     *        <code>ToPhoneNumber</code> value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSipRuleRequest withTriggerValue(String triggerValue) {
        setTriggerValue(triggerValue);
        return this;
    }

    /**
     * <p>
     * Enables or disables a rule. You must disable rules before you can delete them.
     * </p>
     * 
     * @param disabled
     *        Enables or disables a rule. You must disable rules before you can delete them.
     */

    public void setDisabled(Boolean disabled) {
        this.disabled = disabled;
    }

    /**
     * <p>
     * Enables or disables a rule. You must disable rules before you can delete them.
     * </p>
     * 
     * @return Enables or disables a rule. You must disable rules before you can delete them.
     */

    public Boolean getDisabled() {
        return this.disabled;
    }

    /**
     * <p>
     * Enables or disables a rule. You must disable rules before you can delete them.
     * </p>
     * 
     * @param disabled
     *        Enables or disables a rule. You must disable rules before you can delete them.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSipRuleRequest withDisabled(Boolean disabled) {
        setDisabled(disabled);
        return this;
    }

    /**
     * <p>
     * Enables or disables a rule. You must disable rules before you can delete them.
     * </p>
     * 
     * @return Enables or disables a rule. You must disable rules before you can delete them.
     */

    public Boolean isDisabled() {
        return this.disabled;
    }

    /**
     * <p>
     * List of SIP media applications with priority and AWS Region. Only one SIP application per AWS Region can be used.
     * </p>
     * 
     * @return List of SIP media applications with priority and AWS Region. Only one SIP application per AWS Region can
     *         be used.
     */

    public java.util.List<SipRuleTargetApplication> getTargetApplications() {
        return targetApplications;
    }

    /**
     * <p>
     * List of SIP media applications with priority and AWS Region. Only one SIP application per AWS Region can be used.
     * </p>
     * 
     * @param targetApplications
     *        List of SIP media applications with priority and AWS Region. Only one SIP application per AWS Region can
     *        be used.
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
     * List of SIP media applications with priority and AWS Region. Only one SIP application per AWS Region can be used.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTargetApplications(java.util.Collection)} or {@link #withTargetApplications(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param targetApplications
     *        List of SIP media applications with priority and AWS Region. Only one SIP application per AWS Region can
     *        be used.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSipRuleRequest withTargetApplications(SipRuleTargetApplication... targetApplications) {
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
     * List of SIP media applications with priority and AWS Region. Only one SIP application per AWS Region can be used.
     * </p>
     * 
     * @param targetApplications
     *        List of SIP media applications with priority and AWS Region. Only one SIP application per AWS Region can
     *        be used.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSipRuleRequest withTargetApplications(java.util.Collection<SipRuleTargetApplication> targetApplications) {
        setTargetApplications(targetApplications);
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
        if (getTriggerType() != null)
            sb.append("TriggerType: ").append(getTriggerType()).append(",");
        if (getTriggerValue() != null)
            sb.append("TriggerValue: ").append(getTriggerValue()).append(",");
        if (getDisabled() != null)
            sb.append("Disabled: ").append(getDisabled()).append(",");
        if (getTargetApplications() != null)
            sb.append("TargetApplications: ").append(getTargetApplications());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateSipRuleRequest == false)
            return false;
        CreateSipRuleRequest other = (CreateSipRuleRequest) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getTriggerType() == null ^ this.getTriggerType() == null)
            return false;
        if (other.getTriggerType() != null && other.getTriggerType().equals(this.getTriggerType()) == false)
            return false;
        if (other.getTriggerValue() == null ^ this.getTriggerValue() == null)
            return false;
        if (other.getTriggerValue() != null && other.getTriggerValue().equals(this.getTriggerValue()) == false)
            return false;
        if (other.getDisabled() == null ^ this.getDisabled() == null)
            return false;
        if (other.getDisabled() != null && other.getDisabled().equals(this.getDisabled()) == false)
            return false;
        if (other.getTargetApplications() == null ^ this.getTargetApplications() == null)
            return false;
        if (other.getTargetApplications() != null && other.getTargetApplications().equals(this.getTargetApplications()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getTriggerType() == null) ? 0 : getTriggerType().hashCode());
        hashCode = prime * hashCode + ((getTriggerValue() == null) ? 0 : getTriggerValue().hashCode());
        hashCode = prime * hashCode + ((getDisabled() == null) ? 0 : getDisabled().hashCode());
        hashCode = prime * hashCode + ((getTargetApplications() == null) ? 0 : getTargetApplications().hashCode());
        return hashCode;
    }

    @Override
    public CreateSipRuleRequest clone() {
        return (CreateSipRuleRequest) super.clone();
    }

}
