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
package com.amazonaws.services.simpleemail.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Contains information about the reputation settings for a configuration set.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/email-2010-12-01/ReputationOptions" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ReputationOptions implements Serializable, Cloneable {

    /**
     * <p>
     * Describes whether email sending is enabled or disabled for the configuration set. If the value is
     * <code>true</code>, then Amazon SES will send emails that use the configuration set. If the value is
     * <code>false</code>, Amazon SES will not send emails that use the configuration set. The default value is
     * <code>true</code>. You can change this setting using <a>UpdateConfigurationSetSendingEnabled</a>.
     * </p>
     */
    private Boolean sendingEnabled;
    /**
     * <p>
     * Describes whether or not Amazon SES publishes reputation metrics for the configuration set, such as bounce and
     * complaint rates, to Amazon CloudWatch.
     * </p>
     * <p>
     * If the value is <code>true</code>, reputation metrics are published. If the value is <code>false</code>,
     * reputation metrics are not published. The default value is <code>false</code>.
     * </p>
     */
    private Boolean reputationMetricsEnabled;
    /**
     * <p>
     * The date and time at which the reputation metrics for the configuration set were last reset. Resetting these
     * metrics is known as a <i>fresh start</i>.
     * </p>
     * <p>
     * When you disable email sending for a configuration set using <a>UpdateConfigurationSetSendingEnabled</a> and
     * later re-enable it, the reputation metrics for the configuration set (but not for the entire Amazon SES account)
     * are reset.
     * </p>
     * <p>
     * If email sending for the configuration set has never been disabled and later re-enabled, the value of this
     * attribute is <code>null</code>.
     * </p>
     */
    private java.util.Date lastFreshStart;

    /**
     * <p>
     * Describes whether email sending is enabled or disabled for the configuration set. If the value is
     * <code>true</code>, then Amazon SES will send emails that use the configuration set. If the value is
     * <code>false</code>, Amazon SES will not send emails that use the configuration set. The default value is
     * <code>true</code>. You can change this setting using <a>UpdateConfigurationSetSendingEnabled</a>.
     * </p>
     * 
     * @param sendingEnabled
     *        Describes whether email sending is enabled or disabled for the configuration set. If the value is
     *        <code>true</code>, then Amazon SES will send emails that use the configuration set. If the value is
     *        <code>false</code>, Amazon SES will not send emails that use the configuration set. The default value is
     *        <code>true</code>. You can change this setting using <a>UpdateConfigurationSetSendingEnabled</a>.
     */

    public void setSendingEnabled(Boolean sendingEnabled) {
        this.sendingEnabled = sendingEnabled;
    }

    /**
     * <p>
     * Describes whether email sending is enabled or disabled for the configuration set. If the value is
     * <code>true</code>, then Amazon SES will send emails that use the configuration set. If the value is
     * <code>false</code>, Amazon SES will not send emails that use the configuration set. The default value is
     * <code>true</code>. You can change this setting using <a>UpdateConfigurationSetSendingEnabled</a>.
     * </p>
     * 
     * @return Describes whether email sending is enabled or disabled for the configuration set. If the value is
     *         <code>true</code>, then Amazon SES will send emails that use the configuration set. If the value is
     *         <code>false</code>, Amazon SES will not send emails that use the configuration set. The default value is
     *         <code>true</code>. You can change this setting using <a>UpdateConfigurationSetSendingEnabled</a>.
     */

    public Boolean getSendingEnabled() {
        return this.sendingEnabled;
    }

    /**
     * <p>
     * Describes whether email sending is enabled or disabled for the configuration set. If the value is
     * <code>true</code>, then Amazon SES will send emails that use the configuration set. If the value is
     * <code>false</code>, Amazon SES will not send emails that use the configuration set. The default value is
     * <code>true</code>. You can change this setting using <a>UpdateConfigurationSetSendingEnabled</a>.
     * </p>
     * 
     * @param sendingEnabled
     *        Describes whether email sending is enabled or disabled for the configuration set. If the value is
     *        <code>true</code>, then Amazon SES will send emails that use the configuration set. If the value is
     *        <code>false</code>, Amazon SES will not send emails that use the configuration set. The default value is
     *        <code>true</code>. You can change this setting using <a>UpdateConfigurationSetSendingEnabled</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReputationOptions withSendingEnabled(Boolean sendingEnabled) {
        setSendingEnabled(sendingEnabled);
        return this;
    }

    /**
     * <p>
     * Describes whether email sending is enabled or disabled for the configuration set. If the value is
     * <code>true</code>, then Amazon SES will send emails that use the configuration set. If the value is
     * <code>false</code>, Amazon SES will not send emails that use the configuration set. The default value is
     * <code>true</code>. You can change this setting using <a>UpdateConfigurationSetSendingEnabled</a>.
     * </p>
     * 
     * @return Describes whether email sending is enabled or disabled for the configuration set. If the value is
     *         <code>true</code>, then Amazon SES will send emails that use the configuration set. If the value is
     *         <code>false</code>, Amazon SES will not send emails that use the configuration set. The default value is
     *         <code>true</code>. You can change this setting using <a>UpdateConfigurationSetSendingEnabled</a>.
     */

    public Boolean isSendingEnabled() {
        return this.sendingEnabled;
    }

    /**
     * <p>
     * Describes whether or not Amazon SES publishes reputation metrics for the configuration set, such as bounce and
     * complaint rates, to Amazon CloudWatch.
     * </p>
     * <p>
     * If the value is <code>true</code>, reputation metrics are published. If the value is <code>false</code>,
     * reputation metrics are not published. The default value is <code>false</code>.
     * </p>
     * 
     * @param reputationMetricsEnabled
     *        Describes whether or not Amazon SES publishes reputation metrics for the configuration set, such as bounce
     *        and complaint rates, to Amazon CloudWatch.</p>
     *        <p>
     *        If the value is <code>true</code>, reputation metrics are published. If the value is <code>false</code>,
     *        reputation metrics are not published. The default value is <code>false</code>.
     */

    public void setReputationMetricsEnabled(Boolean reputationMetricsEnabled) {
        this.reputationMetricsEnabled = reputationMetricsEnabled;
    }

    /**
     * <p>
     * Describes whether or not Amazon SES publishes reputation metrics for the configuration set, such as bounce and
     * complaint rates, to Amazon CloudWatch.
     * </p>
     * <p>
     * If the value is <code>true</code>, reputation metrics are published. If the value is <code>false</code>,
     * reputation metrics are not published. The default value is <code>false</code>.
     * </p>
     * 
     * @return Describes whether or not Amazon SES publishes reputation metrics for the configuration set, such as
     *         bounce and complaint rates, to Amazon CloudWatch.</p>
     *         <p>
     *         If the value is <code>true</code>, reputation metrics are published. If the value is <code>false</code>,
     *         reputation metrics are not published. The default value is <code>false</code>.
     */

    public Boolean getReputationMetricsEnabled() {
        return this.reputationMetricsEnabled;
    }

    /**
     * <p>
     * Describes whether or not Amazon SES publishes reputation metrics for the configuration set, such as bounce and
     * complaint rates, to Amazon CloudWatch.
     * </p>
     * <p>
     * If the value is <code>true</code>, reputation metrics are published. If the value is <code>false</code>,
     * reputation metrics are not published. The default value is <code>false</code>.
     * </p>
     * 
     * @param reputationMetricsEnabled
     *        Describes whether or not Amazon SES publishes reputation metrics for the configuration set, such as bounce
     *        and complaint rates, to Amazon CloudWatch.</p>
     *        <p>
     *        If the value is <code>true</code>, reputation metrics are published. If the value is <code>false</code>,
     *        reputation metrics are not published. The default value is <code>false</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReputationOptions withReputationMetricsEnabled(Boolean reputationMetricsEnabled) {
        setReputationMetricsEnabled(reputationMetricsEnabled);
        return this;
    }

    /**
     * <p>
     * Describes whether or not Amazon SES publishes reputation metrics for the configuration set, such as bounce and
     * complaint rates, to Amazon CloudWatch.
     * </p>
     * <p>
     * If the value is <code>true</code>, reputation metrics are published. If the value is <code>false</code>,
     * reputation metrics are not published. The default value is <code>false</code>.
     * </p>
     * 
     * @return Describes whether or not Amazon SES publishes reputation metrics for the configuration set, such as
     *         bounce and complaint rates, to Amazon CloudWatch.</p>
     *         <p>
     *         If the value is <code>true</code>, reputation metrics are published. If the value is <code>false</code>,
     *         reputation metrics are not published. The default value is <code>false</code>.
     */

    public Boolean isReputationMetricsEnabled() {
        return this.reputationMetricsEnabled;
    }

    /**
     * <p>
     * The date and time at which the reputation metrics for the configuration set were last reset. Resetting these
     * metrics is known as a <i>fresh start</i>.
     * </p>
     * <p>
     * When you disable email sending for a configuration set using <a>UpdateConfigurationSetSendingEnabled</a> and
     * later re-enable it, the reputation metrics for the configuration set (but not for the entire Amazon SES account)
     * are reset.
     * </p>
     * <p>
     * If email sending for the configuration set has never been disabled and later re-enabled, the value of this
     * attribute is <code>null</code>.
     * </p>
     * 
     * @param lastFreshStart
     *        The date and time at which the reputation metrics for the configuration set were last reset. Resetting
     *        these metrics is known as a <i>fresh start</i>.</p>
     *        <p>
     *        When you disable email sending for a configuration set using <a>UpdateConfigurationSetSendingEnabled</a>
     *        and later re-enable it, the reputation metrics for the configuration set (but not for the entire Amazon
     *        SES account) are reset.
     *        </p>
     *        <p>
     *        If email sending for the configuration set has never been disabled and later re-enabled, the value of this
     *        attribute is <code>null</code>.
     */

    public void setLastFreshStart(java.util.Date lastFreshStart) {
        this.lastFreshStart = lastFreshStart;
    }

    /**
     * <p>
     * The date and time at which the reputation metrics for the configuration set were last reset. Resetting these
     * metrics is known as a <i>fresh start</i>.
     * </p>
     * <p>
     * When you disable email sending for a configuration set using <a>UpdateConfigurationSetSendingEnabled</a> and
     * later re-enable it, the reputation metrics for the configuration set (but not for the entire Amazon SES account)
     * are reset.
     * </p>
     * <p>
     * If email sending for the configuration set has never been disabled and later re-enabled, the value of this
     * attribute is <code>null</code>.
     * </p>
     * 
     * @return The date and time at which the reputation metrics for the configuration set were last reset. Resetting
     *         these metrics is known as a <i>fresh start</i>.</p>
     *         <p>
     *         When you disable email sending for a configuration set using <a>UpdateConfigurationSetSendingEnabled</a>
     *         and later re-enable it, the reputation metrics for the configuration set (but not for the entire Amazon
     *         SES account) are reset.
     *         </p>
     *         <p>
     *         If email sending for the configuration set has never been disabled and later re-enabled, the value of
     *         this attribute is <code>null</code>.
     */

    public java.util.Date getLastFreshStart() {
        return this.lastFreshStart;
    }

    /**
     * <p>
     * The date and time at which the reputation metrics for the configuration set were last reset. Resetting these
     * metrics is known as a <i>fresh start</i>.
     * </p>
     * <p>
     * When you disable email sending for a configuration set using <a>UpdateConfigurationSetSendingEnabled</a> and
     * later re-enable it, the reputation metrics for the configuration set (but not for the entire Amazon SES account)
     * are reset.
     * </p>
     * <p>
     * If email sending for the configuration set has never been disabled and later re-enabled, the value of this
     * attribute is <code>null</code>.
     * </p>
     * 
     * @param lastFreshStart
     *        The date and time at which the reputation metrics for the configuration set were last reset. Resetting
     *        these metrics is known as a <i>fresh start</i>.</p>
     *        <p>
     *        When you disable email sending for a configuration set using <a>UpdateConfigurationSetSendingEnabled</a>
     *        and later re-enable it, the reputation metrics for the configuration set (but not for the entire Amazon
     *        SES account) are reset.
     *        </p>
     *        <p>
     *        If email sending for the configuration set has never been disabled and later re-enabled, the value of this
     *        attribute is <code>null</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReputationOptions withLastFreshStart(java.util.Date lastFreshStart) {
        setLastFreshStart(lastFreshStart);
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
        if (getSendingEnabled() != null)
            sb.append("SendingEnabled: ").append(getSendingEnabled()).append(",");
        if (getReputationMetricsEnabled() != null)
            sb.append("ReputationMetricsEnabled: ").append(getReputationMetricsEnabled()).append(",");
        if (getLastFreshStart() != null)
            sb.append("LastFreshStart: ").append(getLastFreshStart());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ReputationOptions == false)
            return false;
        ReputationOptions other = (ReputationOptions) obj;
        if (other.getSendingEnabled() == null ^ this.getSendingEnabled() == null)
            return false;
        if (other.getSendingEnabled() != null && other.getSendingEnabled().equals(this.getSendingEnabled()) == false)
            return false;
        if (other.getReputationMetricsEnabled() == null ^ this.getReputationMetricsEnabled() == null)
            return false;
        if (other.getReputationMetricsEnabled() != null && other.getReputationMetricsEnabled().equals(this.getReputationMetricsEnabled()) == false)
            return false;
        if (other.getLastFreshStart() == null ^ this.getLastFreshStart() == null)
            return false;
        if (other.getLastFreshStart() != null && other.getLastFreshStart().equals(this.getLastFreshStart()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSendingEnabled() == null) ? 0 : getSendingEnabled().hashCode());
        hashCode = prime * hashCode + ((getReputationMetricsEnabled() == null) ? 0 : getReputationMetricsEnabled().hashCode());
        hashCode = prime * hashCode + ((getLastFreshStart() == null) ? 0 : getLastFreshStart().hashCode());
        return hashCode;
    }

    @Override
    public ReputationOptions clone() {
        try {
            return (ReputationOptions) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
