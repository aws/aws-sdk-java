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
package com.amazonaws.services.shield.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about the AWS Shield Advanced subscription for an account.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/shield-2016-06-02/Subscription" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Subscription implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The start time of the subscription, in Unix time in seconds. For more information see <a
     * href="http://docs.aws.amazon.com/cli/latest/userguide/cli-using-param.html#parameter-types">timestamp</a>.
     * </p>
     */
    private java.util.Date startTime;
    /**
     * <p>
     * The date and time your subscription will end.
     * </p>
     */
    private java.util.Date endTime;
    /**
     * <p>
     * The length, in seconds, of the AWS Shield Advanced subscription for the account.
     * </p>
     */
    private Long timeCommitmentInSeconds;
    /**
     * <p>
     * If <code>ENABLED</code>, the subscription will be automatically renewed at the end of the existing subscription
     * period.
     * </p>
     * <p>
     * When you initally create a subscription, <code>AutoRenew</code> is set to <code>ENABLED</code>. You can change
     * this by submitting an <code>UpdateSubscription</code> request. If the <code>UpdateSubscription</code> request
     * does not included a value for <code>AutoRenew</code>, the existing value for <code>AutoRenew</code> remains
     * unchanged.
     * </p>
     */
    private String autoRenew;
    /**
     * <p>
     * Specifies how many protections of a given type you can create.
     * </p>
     */
    private java.util.List<Limit> limits;

    /**
     * <p>
     * The start time of the subscription, in Unix time in seconds. For more information see <a
     * href="http://docs.aws.amazon.com/cli/latest/userguide/cli-using-param.html#parameter-types">timestamp</a>.
     * </p>
     * 
     * @param startTime
     *        The start time of the subscription, in Unix time in seconds. For more information see <a
     *        href="http://docs.aws.amazon.com/cli/latest/userguide/cli-using-param.html#parameter-types">timestamp</a>.
     */

    public void setStartTime(java.util.Date startTime) {
        this.startTime = startTime;
    }

    /**
     * <p>
     * The start time of the subscription, in Unix time in seconds. For more information see <a
     * href="http://docs.aws.amazon.com/cli/latest/userguide/cli-using-param.html#parameter-types">timestamp</a>.
     * </p>
     * 
     * @return The start time of the subscription, in Unix time in seconds. For more information see <a
     *         href="http://docs.aws.amazon.com/cli/latest/userguide/cli-using-param.html#parameter-types"
     *         >timestamp</a>.
     */

    public java.util.Date getStartTime() {
        return this.startTime;
    }

    /**
     * <p>
     * The start time of the subscription, in Unix time in seconds. For more information see <a
     * href="http://docs.aws.amazon.com/cli/latest/userguide/cli-using-param.html#parameter-types">timestamp</a>.
     * </p>
     * 
     * @param startTime
     *        The start time of the subscription, in Unix time in seconds. For more information see <a
     *        href="http://docs.aws.amazon.com/cli/latest/userguide/cli-using-param.html#parameter-types">timestamp</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Subscription withStartTime(java.util.Date startTime) {
        setStartTime(startTime);
        return this;
    }

    /**
     * <p>
     * The date and time your subscription will end.
     * </p>
     * 
     * @param endTime
     *        The date and time your subscription will end.
     */

    public void setEndTime(java.util.Date endTime) {
        this.endTime = endTime;
    }

    /**
     * <p>
     * The date and time your subscription will end.
     * </p>
     * 
     * @return The date and time your subscription will end.
     */

    public java.util.Date getEndTime() {
        return this.endTime;
    }

    /**
     * <p>
     * The date and time your subscription will end.
     * </p>
     * 
     * @param endTime
     *        The date and time your subscription will end.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Subscription withEndTime(java.util.Date endTime) {
        setEndTime(endTime);
        return this;
    }

    /**
     * <p>
     * The length, in seconds, of the AWS Shield Advanced subscription for the account.
     * </p>
     * 
     * @param timeCommitmentInSeconds
     *        The length, in seconds, of the AWS Shield Advanced subscription for the account.
     */

    public void setTimeCommitmentInSeconds(Long timeCommitmentInSeconds) {
        this.timeCommitmentInSeconds = timeCommitmentInSeconds;
    }

    /**
     * <p>
     * The length, in seconds, of the AWS Shield Advanced subscription for the account.
     * </p>
     * 
     * @return The length, in seconds, of the AWS Shield Advanced subscription for the account.
     */

    public Long getTimeCommitmentInSeconds() {
        return this.timeCommitmentInSeconds;
    }

    /**
     * <p>
     * The length, in seconds, of the AWS Shield Advanced subscription for the account.
     * </p>
     * 
     * @param timeCommitmentInSeconds
     *        The length, in seconds, of the AWS Shield Advanced subscription for the account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Subscription withTimeCommitmentInSeconds(Long timeCommitmentInSeconds) {
        setTimeCommitmentInSeconds(timeCommitmentInSeconds);
        return this;
    }

    /**
     * <p>
     * If <code>ENABLED</code>, the subscription will be automatically renewed at the end of the existing subscription
     * period.
     * </p>
     * <p>
     * When you initally create a subscription, <code>AutoRenew</code> is set to <code>ENABLED</code>. You can change
     * this by submitting an <code>UpdateSubscription</code> request. If the <code>UpdateSubscription</code> request
     * does not included a value for <code>AutoRenew</code>, the existing value for <code>AutoRenew</code> remains
     * unchanged.
     * </p>
     * 
     * @param autoRenew
     *        If <code>ENABLED</code>, the subscription will be automatically renewed at the end of the existing
     *        subscription period.</p>
     *        <p>
     *        When you initally create a subscription, <code>AutoRenew</code> is set to <code>ENABLED</code>. You can
     *        change this by submitting an <code>UpdateSubscription</code> request. If the
     *        <code>UpdateSubscription</code> request does not included a value for <code>AutoRenew</code>, the existing
     *        value for <code>AutoRenew</code> remains unchanged.
     * @see AutoRenew
     */

    public void setAutoRenew(String autoRenew) {
        this.autoRenew = autoRenew;
    }

    /**
     * <p>
     * If <code>ENABLED</code>, the subscription will be automatically renewed at the end of the existing subscription
     * period.
     * </p>
     * <p>
     * When you initally create a subscription, <code>AutoRenew</code> is set to <code>ENABLED</code>. You can change
     * this by submitting an <code>UpdateSubscription</code> request. If the <code>UpdateSubscription</code> request
     * does not included a value for <code>AutoRenew</code>, the existing value for <code>AutoRenew</code> remains
     * unchanged.
     * </p>
     * 
     * @return If <code>ENABLED</code>, the subscription will be automatically renewed at the end of the existing
     *         subscription period.</p>
     *         <p>
     *         When you initally create a subscription, <code>AutoRenew</code> is set to <code>ENABLED</code>. You can
     *         change this by submitting an <code>UpdateSubscription</code> request. If the
     *         <code>UpdateSubscription</code> request does not included a value for <code>AutoRenew</code>, the
     *         existing value for <code>AutoRenew</code> remains unchanged.
     * @see AutoRenew
     */

    public String getAutoRenew() {
        return this.autoRenew;
    }

    /**
     * <p>
     * If <code>ENABLED</code>, the subscription will be automatically renewed at the end of the existing subscription
     * period.
     * </p>
     * <p>
     * When you initally create a subscription, <code>AutoRenew</code> is set to <code>ENABLED</code>. You can change
     * this by submitting an <code>UpdateSubscription</code> request. If the <code>UpdateSubscription</code> request
     * does not included a value for <code>AutoRenew</code>, the existing value for <code>AutoRenew</code> remains
     * unchanged.
     * </p>
     * 
     * @param autoRenew
     *        If <code>ENABLED</code>, the subscription will be automatically renewed at the end of the existing
     *        subscription period.</p>
     *        <p>
     *        When you initally create a subscription, <code>AutoRenew</code> is set to <code>ENABLED</code>. You can
     *        change this by submitting an <code>UpdateSubscription</code> request. If the
     *        <code>UpdateSubscription</code> request does not included a value for <code>AutoRenew</code>, the existing
     *        value for <code>AutoRenew</code> remains unchanged.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AutoRenew
     */

    public Subscription withAutoRenew(String autoRenew) {
        setAutoRenew(autoRenew);
        return this;
    }

    /**
     * <p>
     * If <code>ENABLED</code>, the subscription will be automatically renewed at the end of the existing subscription
     * period.
     * </p>
     * <p>
     * When you initally create a subscription, <code>AutoRenew</code> is set to <code>ENABLED</code>. You can change
     * this by submitting an <code>UpdateSubscription</code> request. If the <code>UpdateSubscription</code> request
     * does not included a value for <code>AutoRenew</code>, the existing value for <code>AutoRenew</code> remains
     * unchanged.
     * </p>
     * 
     * @param autoRenew
     *        If <code>ENABLED</code>, the subscription will be automatically renewed at the end of the existing
     *        subscription period.</p>
     *        <p>
     *        When you initally create a subscription, <code>AutoRenew</code> is set to <code>ENABLED</code>. You can
     *        change this by submitting an <code>UpdateSubscription</code> request. If the
     *        <code>UpdateSubscription</code> request does not included a value for <code>AutoRenew</code>, the existing
     *        value for <code>AutoRenew</code> remains unchanged.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AutoRenew
     */

    public Subscription withAutoRenew(AutoRenew autoRenew) {
        this.autoRenew = autoRenew.toString();
        return this;
    }

    /**
     * <p>
     * Specifies how many protections of a given type you can create.
     * </p>
     * 
     * @return Specifies how many protections of a given type you can create.
     */

    public java.util.List<Limit> getLimits() {
        return limits;
    }

    /**
     * <p>
     * Specifies how many protections of a given type you can create.
     * </p>
     * 
     * @param limits
     *        Specifies how many protections of a given type you can create.
     */

    public void setLimits(java.util.Collection<Limit> limits) {
        if (limits == null) {
            this.limits = null;
            return;
        }

        this.limits = new java.util.ArrayList<Limit>(limits);
    }

    /**
     * <p>
     * Specifies how many protections of a given type you can create.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setLimits(java.util.Collection)} or {@link #withLimits(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param limits
     *        Specifies how many protections of a given type you can create.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Subscription withLimits(Limit... limits) {
        if (this.limits == null) {
            setLimits(new java.util.ArrayList<Limit>(limits.length));
        }
        for (Limit ele : limits) {
            this.limits.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Specifies how many protections of a given type you can create.
     * </p>
     * 
     * @param limits
     *        Specifies how many protections of a given type you can create.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Subscription withLimits(java.util.Collection<Limit> limits) {
        setLimits(limits);
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
        if (getStartTime() != null)
            sb.append("StartTime: ").append(getStartTime()).append(",");
        if (getEndTime() != null)
            sb.append("EndTime: ").append(getEndTime()).append(",");
        if (getTimeCommitmentInSeconds() != null)
            sb.append("TimeCommitmentInSeconds: ").append(getTimeCommitmentInSeconds()).append(",");
        if (getAutoRenew() != null)
            sb.append("AutoRenew: ").append(getAutoRenew()).append(",");
        if (getLimits() != null)
            sb.append("Limits: ").append(getLimits());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Subscription == false)
            return false;
        Subscription other = (Subscription) obj;
        if (other.getStartTime() == null ^ this.getStartTime() == null)
            return false;
        if (other.getStartTime() != null && other.getStartTime().equals(this.getStartTime()) == false)
            return false;
        if (other.getEndTime() == null ^ this.getEndTime() == null)
            return false;
        if (other.getEndTime() != null && other.getEndTime().equals(this.getEndTime()) == false)
            return false;
        if (other.getTimeCommitmentInSeconds() == null ^ this.getTimeCommitmentInSeconds() == null)
            return false;
        if (other.getTimeCommitmentInSeconds() != null && other.getTimeCommitmentInSeconds().equals(this.getTimeCommitmentInSeconds()) == false)
            return false;
        if (other.getAutoRenew() == null ^ this.getAutoRenew() == null)
            return false;
        if (other.getAutoRenew() != null && other.getAutoRenew().equals(this.getAutoRenew()) == false)
            return false;
        if (other.getLimits() == null ^ this.getLimits() == null)
            return false;
        if (other.getLimits() != null && other.getLimits().equals(this.getLimits()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        hashCode = prime * hashCode + ((getEndTime() == null) ? 0 : getEndTime().hashCode());
        hashCode = prime * hashCode + ((getTimeCommitmentInSeconds() == null) ? 0 : getTimeCommitmentInSeconds().hashCode());
        hashCode = prime * hashCode + ((getAutoRenew() == null) ? 0 : getAutoRenew().hashCode());
        hashCode = prime * hashCode + ((getLimits() == null) ? 0 : getLimits().hashCode());
        return hashCode;
    }

    @Override
    public Subscription clone() {
        try {
            return (Subscription) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.shield.model.transform.SubscriptionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
