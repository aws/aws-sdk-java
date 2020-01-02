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
package com.amazonaws.services.simpleemailv2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Enable or disable the Deliverability dashboard. When you enable the Deliverability dashboard, you gain access to
 * reputation, deliverability, and other metrics for the domains that you use to send email using Amazon SES API v2. You
 * also gain the ability to perform predictive inbox placement tests.
 * </p>
 * <p>
 * When you use the Deliverability dashboard, you pay a monthly subscription charge, in addition to any other fees that
 * you accrue by using Amazon SES and other AWS services. For more information about the features and cost of a
 * Deliverability dashboard subscription, see <a href="http://aws.amazon.com/pinpoint/pricing/">Amazon Pinpoint
 * Pricing</a>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sesv2-2019-09-27/PutDeliverabilityDashboardOption"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PutDeliverabilityDashboardOptionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Specifies whether to enable the Deliverability dashboard. To enable the dashboard, set this value to
     * <code>true</code>.
     * </p>
     */
    private Boolean dashboardEnabled;
    /**
     * <p>
     * An array of objects, one for each verified domain that you use to send email and enabled the Deliverability
     * dashboard for.
     * </p>
     */
    private java.util.List<DomainDeliverabilityTrackingOption> subscribedDomains;

    /**
     * <p>
     * Specifies whether to enable the Deliverability dashboard. To enable the dashboard, set this value to
     * <code>true</code>.
     * </p>
     * 
     * @param dashboardEnabled
     *        Specifies whether to enable the Deliverability dashboard. To enable the dashboard, set this value to
     *        <code>true</code>.
     */

    public void setDashboardEnabled(Boolean dashboardEnabled) {
        this.dashboardEnabled = dashboardEnabled;
    }

    /**
     * <p>
     * Specifies whether to enable the Deliverability dashboard. To enable the dashboard, set this value to
     * <code>true</code>.
     * </p>
     * 
     * @return Specifies whether to enable the Deliverability dashboard. To enable the dashboard, set this value to
     *         <code>true</code>.
     */

    public Boolean getDashboardEnabled() {
        return this.dashboardEnabled;
    }

    /**
     * <p>
     * Specifies whether to enable the Deliverability dashboard. To enable the dashboard, set this value to
     * <code>true</code>.
     * </p>
     * 
     * @param dashboardEnabled
     *        Specifies whether to enable the Deliverability dashboard. To enable the dashboard, set this value to
     *        <code>true</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutDeliverabilityDashboardOptionRequest withDashboardEnabled(Boolean dashboardEnabled) {
        setDashboardEnabled(dashboardEnabled);
        return this;
    }

    /**
     * <p>
     * Specifies whether to enable the Deliverability dashboard. To enable the dashboard, set this value to
     * <code>true</code>.
     * </p>
     * 
     * @return Specifies whether to enable the Deliverability dashboard. To enable the dashboard, set this value to
     *         <code>true</code>.
     */

    public Boolean isDashboardEnabled() {
        return this.dashboardEnabled;
    }

    /**
     * <p>
     * An array of objects, one for each verified domain that you use to send email and enabled the Deliverability
     * dashboard for.
     * </p>
     * 
     * @return An array of objects, one for each verified domain that you use to send email and enabled the
     *         Deliverability dashboard for.
     */

    public java.util.List<DomainDeliverabilityTrackingOption> getSubscribedDomains() {
        return subscribedDomains;
    }

    /**
     * <p>
     * An array of objects, one for each verified domain that you use to send email and enabled the Deliverability
     * dashboard for.
     * </p>
     * 
     * @param subscribedDomains
     *        An array of objects, one for each verified domain that you use to send email and enabled the
     *        Deliverability dashboard for.
     */

    public void setSubscribedDomains(java.util.Collection<DomainDeliverabilityTrackingOption> subscribedDomains) {
        if (subscribedDomains == null) {
            this.subscribedDomains = null;
            return;
        }

        this.subscribedDomains = new java.util.ArrayList<DomainDeliverabilityTrackingOption>(subscribedDomains);
    }

    /**
     * <p>
     * An array of objects, one for each verified domain that you use to send email and enabled the Deliverability
     * dashboard for.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSubscribedDomains(java.util.Collection)} or {@link #withSubscribedDomains(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param subscribedDomains
     *        An array of objects, one for each verified domain that you use to send email and enabled the
     *        Deliverability dashboard for.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutDeliverabilityDashboardOptionRequest withSubscribedDomains(DomainDeliverabilityTrackingOption... subscribedDomains) {
        if (this.subscribedDomains == null) {
            setSubscribedDomains(new java.util.ArrayList<DomainDeliverabilityTrackingOption>(subscribedDomains.length));
        }
        for (DomainDeliverabilityTrackingOption ele : subscribedDomains) {
            this.subscribedDomains.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of objects, one for each verified domain that you use to send email and enabled the Deliverability
     * dashboard for.
     * </p>
     * 
     * @param subscribedDomains
     *        An array of objects, one for each verified domain that you use to send email and enabled the
     *        Deliverability dashboard for.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutDeliverabilityDashboardOptionRequest withSubscribedDomains(java.util.Collection<DomainDeliverabilityTrackingOption> subscribedDomains) {
        setSubscribedDomains(subscribedDomains);
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
        if (getSubscribedDomains() != null)
            sb.append("SubscribedDomains: ").append(getSubscribedDomains());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutDeliverabilityDashboardOptionRequest == false)
            return false;
        PutDeliverabilityDashboardOptionRequest other = (PutDeliverabilityDashboardOptionRequest) obj;
        if (other.getDashboardEnabled() == null ^ this.getDashboardEnabled() == null)
            return false;
        if (other.getDashboardEnabled() != null && other.getDashboardEnabled().equals(this.getDashboardEnabled()) == false)
            return false;
        if (other.getSubscribedDomains() == null ^ this.getSubscribedDomains() == null)
            return false;
        if (other.getSubscribedDomains() != null && other.getSubscribedDomains().equals(this.getSubscribedDomains()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDashboardEnabled() == null) ? 0 : getDashboardEnabled().hashCode());
        hashCode = prime * hashCode + ((getSubscribedDomains() == null) ? 0 : getSubscribedDomains().hashCode());
        return hashCode;
    }

    @Override
    public PutDeliverabilityDashboardOptionRequest clone() {
        return (PutDeliverabilityDashboardOptionRequest) super.clone();
    }

}
