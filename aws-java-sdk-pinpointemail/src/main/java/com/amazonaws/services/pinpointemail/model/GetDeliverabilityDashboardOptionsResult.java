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
package com.amazonaws.services.pinpointemail.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * An object that shows the status of the Deliverability dashboard for your Amazon Pinpoint account.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-email-2018-07-26/GetDeliverabilityDashboardOptions"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetDeliverabilityDashboardOptionsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * Specifies whether the Deliverability dashboard is enabled for your Amazon Pinpoint account. If this value is
     * <code>true</code>, the dashboard is enabled.
     * </p>
     */
    private Boolean dashboardEnabled;
    /**
     * <p>
     * The date, in Unix time format, when your current subscription to the Deliverability dashboard is scheduled to
     * expire, if your subscription is scheduled to expire at the end of the current calendar month. This value is null
     * if you have an active subscription that isn’t due to expire at the end of the month.
     * </p>
     */
    private java.util.Date subscriptionExpiryDate;
    /**
     * <p>
     * The current status of your Deliverability dashboard subscription. If this value is
     * <code>PENDING_EXPIRATION</code>, your subscription is scheduled to expire at the end of the current calendar
     * month.
     * </p>
     */
    private String accountStatus;
    /**
     * <p>
     * An array of objects, one for each verified domain that you use to send email and currently has an active
     * Deliverability dashboard subscription that isn’t scheduled to expire at the end of the current calendar month.
     * </p>
     */
    private java.util.List<DomainDeliverabilityTrackingOption> activeSubscribedDomains;
    /**
     * <p>
     * An array of objects, one for each verified domain that you use to send email and currently has an active
     * Deliverability dashboard subscription that's scheduled to expire at the end of the current calendar month.
     * </p>
     */
    private java.util.List<DomainDeliverabilityTrackingOption> pendingExpirationSubscribedDomains;

    /**
     * <p>
     * Specifies whether the Deliverability dashboard is enabled for your Amazon Pinpoint account. If this value is
     * <code>true</code>, the dashboard is enabled.
     * </p>
     * 
     * @param dashboardEnabled
     *        Specifies whether the Deliverability dashboard is enabled for your Amazon Pinpoint account. If this value
     *        is <code>true</code>, the dashboard is enabled.
     */

    public void setDashboardEnabled(Boolean dashboardEnabled) {
        this.dashboardEnabled = dashboardEnabled;
    }

    /**
     * <p>
     * Specifies whether the Deliverability dashboard is enabled for your Amazon Pinpoint account. If this value is
     * <code>true</code>, the dashboard is enabled.
     * </p>
     * 
     * @return Specifies whether the Deliverability dashboard is enabled for your Amazon Pinpoint account. If this value
     *         is <code>true</code>, the dashboard is enabled.
     */

    public Boolean getDashboardEnabled() {
        return this.dashboardEnabled;
    }

    /**
     * <p>
     * Specifies whether the Deliverability dashboard is enabled for your Amazon Pinpoint account. If this value is
     * <code>true</code>, the dashboard is enabled.
     * </p>
     * 
     * @param dashboardEnabled
     *        Specifies whether the Deliverability dashboard is enabled for your Amazon Pinpoint account. If this value
     *        is <code>true</code>, the dashboard is enabled.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDeliverabilityDashboardOptionsResult withDashboardEnabled(Boolean dashboardEnabled) {
        setDashboardEnabled(dashboardEnabled);
        return this;
    }

    /**
     * <p>
     * Specifies whether the Deliverability dashboard is enabled for your Amazon Pinpoint account. If this value is
     * <code>true</code>, the dashboard is enabled.
     * </p>
     * 
     * @return Specifies whether the Deliverability dashboard is enabled for your Amazon Pinpoint account. If this value
     *         is <code>true</code>, the dashboard is enabled.
     */

    public Boolean isDashboardEnabled() {
        return this.dashboardEnabled;
    }

    /**
     * <p>
     * The date, in Unix time format, when your current subscription to the Deliverability dashboard is scheduled to
     * expire, if your subscription is scheduled to expire at the end of the current calendar month. This value is null
     * if you have an active subscription that isn’t due to expire at the end of the month.
     * </p>
     * 
     * @param subscriptionExpiryDate
     *        The date, in Unix time format, when your current subscription to the Deliverability dashboard is scheduled
     *        to expire, if your subscription is scheduled to expire at the end of the current calendar month. This
     *        value is null if you have an active subscription that isn’t due to expire at the end of the month.
     */

    public void setSubscriptionExpiryDate(java.util.Date subscriptionExpiryDate) {
        this.subscriptionExpiryDate = subscriptionExpiryDate;
    }

    /**
     * <p>
     * The date, in Unix time format, when your current subscription to the Deliverability dashboard is scheduled to
     * expire, if your subscription is scheduled to expire at the end of the current calendar month. This value is null
     * if you have an active subscription that isn’t due to expire at the end of the month.
     * </p>
     * 
     * @return The date, in Unix time format, when your current subscription to the Deliverability dashboard is
     *         scheduled to expire, if your subscription is scheduled to expire at the end of the current calendar
     *         month. This value is null if you have an active subscription that isn’t due to expire at the end of the
     *         month.
     */

    public java.util.Date getSubscriptionExpiryDate() {
        return this.subscriptionExpiryDate;
    }

    /**
     * <p>
     * The date, in Unix time format, when your current subscription to the Deliverability dashboard is scheduled to
     * expire, if your subscription is scheduled to expire at the end of the current calendar month. This value is null
     * if you have an active subscription that isn’t due to expire at the end of the month.
     * </p>
     * 
     * @param subscriptionExpiryDate
     *        The date, in Unix time format, when your current subscription to the Deliverability dashboard is scheduled
     *        to expire, if your subscription is scheduled to expire at the end of the current calendar month. This
     *        value is null if you have an active subscription that isn’t due to expire at the end of the month.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDeliverabilityDashboardOptionsResult withSubscriptionExpiryDate(java.util.Date subscriptionExpiryDate) {
        setSubscriptionExpiryDate(subscriptionExpiryDate);
        return this;
    }

    /**
     * <p>
     * The current status of your Deliverability dashboard subscription. If this value is
     * <code>PENDING_EXPIRATION</code>, your subscription is scheduled to expire at the end of the current calendar
     * month.
     * </p>
     * 
     * @param accountStatus
     *        The current status of your Deliverability dashboard subscription. If this value is
     *        <code>PENDING_EXPIRATION</code>, your subscription is scheduled to expire at the end of the current
     *        calendar month.
     * @see DeliverabilityDashboardAccountStatus
     */

    public void setAccountStatus(String accountStatus) {
        this.accountStatus = accountStatus;
    }

    /**
     * <p>
     * The current status of your Deliverability dashboard subscription. If this value is
     * <code>PENDING_EXPIRATION</code>, your subscription is scheduled to expire at the end of the current calendar
     * month.
     * </p>
     * 
     * @return The current status of your Deliverability dashboard subscription. If this value is
     *         <code>PENDING_EXPIRATION</code>, your subscription is scheduled to expire at the end of the current
     *         calendar month.
     * @see DeliverabilityDashboardAccountStatus
     */

    public String getAccountStatus() {
        return this.accountStatus;
    }

    /**
     * <p>
     * The current status of your Deliverability dashboard subscription. If this value is
     * <code>PENDING_EXPIRATION</code>, your subscription is scheduled to expire at the end of the current calendar
     * month.
     * </p>
     * 
     * @param accountStatus
     *        The current status of your Deliverability dashboard subscription. If this value is
     *        <code>PENDING_EXPIRATION</code>, your subscription is scheduled to expire at the end of the current
     *        calendar month.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DeliverabilityDashboardAccountStatus
     */

    public GetDeliverabilityDashboardOptionsResult withAccountStatus(String accountStatus) {
        setAccountStatus(accountStatus);
        return this;
    }

    /**
     * <p>
     * The current status of your Deliverability dashboard subscription. If this value is
     * <code>PENDING_EXPIRATION</code>, your subscription is scheduled to expire at the end of the current calendar
     * month.
     * </p>
     * 
     * @param accountStatus
     *        The current status of your Deliverability dashboard subscription. If this value is
     *        <code>PENDING_EXPIRATION</code>, your subscription is scheduled to expire at the end of the current
     *        calendar month.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DeliverabilityDashboardAccountStatus
     */

    public GetDeliverabilityDashboardOptionsResult withAccountStatus(DeliverabilityDashboardAccountStatus accountStatus) {
        this.accountStatus = accountStatus.toString();
        return this;
    }

    /**
     * <p>
     * An array of objects, one for each verified domain that you use to send email and currently has an active
     * Deliverability dashboard subscription that isn’t scheduled to expire at the end of the current calendar month.
     * </p>
     * 
     * @return An array of objects, one for each verified domain that you use to send email and currently has an active
     *         Deliverability dashboard subscription that isn’t scheduled to expire at the end of the current calendar
     *         month.
     */

    public java.util.List<DomainDeliverabilityTrackingOption> getActiveSubscribedDomains() {
        return activeSubscribedDomains;
    }

    /**
     * <p>
     * An array of objects, one for each verified domain that you use to send email and currently has an active
     * Deliverability dashboard subscription that isn’t scheduled to expire at the end of the current calendar month.
     * </p>
     * 
     * @param activeSubscribedDomains
     *        An array of objects, one for each verified domain that you use to send email and currently has an active
     *        Deliverability dashboard subscription that isn’t scheduled to expire at the end of the current calendar
     *        month.
     */

    public void setActiveSubscribedDomains(java.util.Collection<DomainDeliverabilityTrackingOption> activeSubscribedDomains) {
        if (activeSubscribedDomains == null) {
            this.activeSubscribedDomains = null;
            return;
        }

        this.activeSubscribedDomains = new java.util.ArrayList<DomainDeliverabilityTrackingOption>(activeSubscribedDomains);
    }

    /**
     * <p>
     * An array of objects, one for each verified domain that you use to send email and currently has an active
     * Deliverability dashboard subscription that isn’t scheduled to expire at the end of the current calendar month.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setActiveSubscribedDomains(java.util.Collection)} or
     * {@link #withActiveSubscribedDomains(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param activeSubscribedDomains
     *        An array of objects, one for each verified domain that you use to send email and currently has an active
     *        Deliverability dashboard subscription that isn’t scheduled to expire at the end of the current calendar
     *        month.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDeliverabilityDashboardOptionsResult withActiveSubscribedDomains(DomainDeliverabilityTrackingOption... activeSubscribedDomains) {
        if (this.activeSubscribedDomains == null) {
            setActiveSubscribedDomains(new java.util.ArrayList<DomainDeliverabilityTrackingOption>(activeSubscribedDomains.length));
        }
        for (DomainDeliverabilityTrackingOption ele : activeSubscribedDomains) {
            this.activeSubscribedDomains.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of objects, one for each verified domain that you use to send email and currently has an active
     * Deliverability dashboard subscription that isn’t scheduled to expire at the end of the current calendar month.
     * </p>
     * 
     * @param activeSubscribedDomains
     *        An array of objects, one for each verified domain that you use to send email and currently has an active
     *        Deliverability dashboard subscription that isn’t scheduled to expire at the end of the current calendar
     *        month.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDeliverabilityDashboardOptionsResult withActiveSubscribedDomains(java.util.Collection<DomainDeliverabilityTrackingOption> activeSubscribedDomains) {
        setActiveSubscribedDomains(activeSubscribedDomains);
        return this;
    }

    /**
     * <p>
     * An array of objects, one for each verified domain that you use to send email and currently has an active
     * Deliverability dashboard subscription that's scheduled to expire at the end of the current calendar month.
     * </p>
     * 
     * @return An array of objects, one for each verified domain that you use to send email and currently has an active
     *         Deliverability dashboard subscription that's scheduled to expire at the end of the current calendar
     *         month.
     */

    public java.util.List<DomainDeliverabilityTrackingOption> getPendingExpirationSubscribedDomains() {
        return pendingExpirationSubscribedDomains;
    }

    /**
     * <p>
     * An array of objects, one for each verified domain that you use to send email and currently has an active
     * Deliverability dashboard subscription that's scheduled to expire at the end of the current calendar month.
     * </p>
     * 
     * @param pendingExpirationSubscribedDomains
     *        An array of objects, one for each verified domain that you use to send email and currently has an active
     *        Deliverability dashboard subscription that's scheduled to expire at the end of the current calendar month.
     */

    public void setPendingExpirationSubscribedDomains(java.util.Collection<DomainDeliverabilityTrackingOption> pendingExpirationSubscribedDomains) {
        if (pendingExpirationSubscribedDomains == null) {
            this.pendingExpirationSubscribedDomains = null;
            return;
        }

        this.pendingExpirationSubscribedDomains = new java.util.ArrayList<DomainDeliverabilityTrackingOption>(pendingExpirationSubscribedDomains);
    }

    /**
     * <p>
     * An array of objects, one for each verified domain that you use to send email and currently has an active
     * Deliverability dashboard subscription that's scheduled to expire at the end of the current calendar month.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPendingExpirationSubscribedDomains(java.util.Collection)} or
     * {@link #withPendingExpirationSubscribedDomains(java.util.Collection)} if you want to override the existing
     * values.
     * </p>
     * 
     * @param pendingExpirationSubscribedDomains
     *        An array of objects, one for each verified domain that you use to send email and currently has an active
     *        Deliverability dashboard subscription that's scheduled to expire at the end of the current calendar month.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDeliverabilityDashboardOptionsResult withPendingExpirationSubscribedDomains(
            DomainDeliverabilityTrackingOption... pendingExpirationSubscribedDomains) {
        if (this.pendingExpirationSubscribedDomains == null) {
            setPendingExpirationSubscribedDomains(new java.util.ArrayList<DomainDeliverabilityTrackingOption>(pendingExpirationSubscribedDomains.length));
        }
        for (DomainDeliverabilityTrackingOption ele : pendingExpirationSubscribedDomains) {
            this.pendingExpirationSubscribedDomains.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of objects, one for each verified domain that you use to send email and currently has an active
     * Deliverability dashboard subscription that's scheduled to expire at the end of the current calendar month.
     * </p>
     * 
     * @param pendingExpirationSubscribedDomains
     *        An array of objects, one for each verified domain that you use to send email and currently has an active
     *        Deliverability dashboard subscription that's scheduled to expire at the end of the current calendar month.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDeliverabilityDashboardOptionsResult withPendingExpirationSubscribedDomains(
            java.util.Collection<DomainDeliverabilityTrackingOption> pendingExpirationSubscribedDomains) {
        setPendingExpirationSubscribedDomains(pendingExpirationSubscribedDomains);
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
        if (getDashboardEnabled() != null)
            sb.append("DashboardEnabled: ").append(getDashboardEnabled()).append(",");
        if (getSubscriptionExpiryDate() != null)
            sb.append("SubscriptionExpiryDate: ").append(getSubscriptionExpiryDate()).append(",");
        if (getAccountStatus() != null)
            sb.append("AccountStatus: ").append(getAccountStatus()).append(",");
        if (getActiveSubscribedDomains() != null)
            sb.append("ActiveSubscribedDomains: ").append(getActiveSubscribedDomains()).append(",");
        if (getPendingExpirationSubscribedDomains() != null)
            sb.append("PendingExpirationSubscribedDomains: ").append(getPendingExpirationSubscribedDomains());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetDeliverabilityDashboardOptionsResult == false)
            return false;
        GetDeliverabilityDashboardOptionsResult other = (GetDeliverabilityDashboardOptionsResult) obj;
        if (other.getDashboardEnabled() == null ^ this.getDashboardEnabled() == null)
            return false;
        if (other.getDashboardEnabled() != null && other.getDashboardEnabled().equals(this.getDashboardEnabled()) == false)
            return false;
        if (other.getSubscriptionExpiryDate() == null ^ this.getSubscriptionExpiryDate() == null)
            return false;
        if (other.getSubscriptionExpiryDate() != null && other.getSubscriptionExpiryDate().equals(this.getSubscriptionExpiryDate()) == false)
            return false;
        if (other.getAccountStatus() == null ^ this.getAccountStatus() == null)
            return false;
        if (other.getAccountStatus() != null && other.getAccountStatus().equals(this.getAccountStatus()) == false)
            return false;
        if (other.getActiveSubscribedDomains() == null ^ this.getActiveSubscribedDomains() == null)
            return false;
        if (other.getActiveSubscribedDomains() != null && other.getActiveSubscribedDomains().equals(this.getActiveSubscribedDomains()) == false)
            return false;
        if (other.getPendingExpirationSubscribedDomains() == null ^ this.getPendingExpirationSubscribedDomains() == null)
            return false;
        if (other.getPendingExpirationSubscribedDomains() != null
                && other.getPendingExpirationSubscribedDomains().equals(this.getPendingExpirationSubscribedDomains()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDashboardEnabled() == null) ? 0 : getDashboardEnabled().hashCode());
        hashCode = prime * hashCode + ((getSubscriptionExpiryDate() == null) ? 0 : getSubscriptionExpiryDate().hashCode());
        hashCode = prime * hashCode + ((getAccountStatus() == null) ? 0 : getAccountStatus().hashCode());
        hashCode = prime * hashCode + ((getActiveSubscribedDomains() == null) ? 0 : getActiveSubscribedDomains().hashCode());
        hashCode = prime * hashCode + ((getPendingExpirationSubscribedDomains() == null) ? 0 : getPendingExpirationSubscribedDomains().hashCode());
        return hashCode;
    }

    @Override
    public GetDeliverabilityDashboardOptionsResult clone() {
        try {
            return (GetDeliverabilityDashboardOptionsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
