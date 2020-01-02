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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An object that contains information about the Deliverability dashboard subscription for a verified domain that you
 * use to send email and currently has an active Deliverability dashboard subscription. If a Deliverability dashboard
 * subscription is active for a domain, you gain access to reputation, inbox placement, and other metrics for the
 * domain.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-email-2018-07-26/DomainDeliverabilityTrackingOption"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DomainDeliverabilityTrackingOption implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A verified domain that’s associated with your AWS account and currently has an active Deliverability dashboard
     * subscription.
     * </p>
     */
    private String domain;
    /**
     * <p>
     * The date, in Unix time format, when you enabled the Deliverability dashboard for the domain.
     * </p>
     */
    private java.util.Date subscriptionStartDate;
    /**
     * <p>
     * An object that contains information about the inbox placement data settings for the domain.
     * </p>
     */
    private InboxPlacementTrackingOption inboxPlacementTrackingOption;

    /**
     * <p>
     * A verified domain that’s associated with your AWS account and currently has an active Deliverability dashboard
     * subscription.
     * </p>
     * 
     * @param domain
     *        A verified domain that’s associated with your AWS account and currently has an active Deliverability
     *        dashboard subscription.
     */

    public void setDomain(String domain) {
        this.domain = domain;
    }

    /**
     * <p>
     * A verified domain that’s associated with your AWS account and currently has an active Deliverability dashboard
     * subscription.
     * </p>
     * 
     * @return A verified domain that’s associated with your AWS account and currently has an active Deliverability
     *         dashboard subscription.
     */

    public String getDomain() {
        return this.domain;
    }

    /**
     * <p>
     * A verified domain that’s associated with your AWS account and currently has an active Deliverability dashboard
     * subscription.
     * </p>
     * 
     * @param domain
     *        A verified domain that’s associated with your AWS account and currently has an active Deliverability
     *        dashboard subscription.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DomainDeliverabilityTrackingOption withDomain(String domain) {
        setDomain(domain);
        return this;
    }

    /**
     * <p>
     * The date, in Unix time format, when you enabled the Deliverability dashboard for the domain.
     * </p>
     * 
     * @param subscriptionStartDate
     *        The date, in Unix time format, when you enabled the Deliverability dashboard for the domain.
     */

    public void setSubscriptionStartDate(java.util.Date subscriptionStartDate) {
        this.subscriptionStartDate = subscriptionStartDate;
    }

    /**
     * <p>
     * The date, in Unix time format, when you enabled the Deliverability dashboard for the domain.
     * </p>
     * 
     * @return The date, in Unix time format, when you enabled the Deliverability dashboard for the domain.
     */

    public java.util.Date getSubscriptionStartDate() {
        return this.subscriptionStartDate;
    }

    /**
     * <p>
     * The date, in Unix time format, when you enabled the Deliverability dashboard for the domain.
     * </p>
     * 
     * @param subscriptionStartDate
     *        The date, in Unix time format, when you enabled the Deliverability dashboard for the domain.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DomainDeliverabilityTrackingOption withSubscriptionStartDate(java.util.Date subscriptionStartDate) {
        setSubscriptionStartDate(subscriptionStartDate);
        return this;
    }

    /**
     * <p>
     * An object that contains information about the inbox placement data settings for the domain.
     * </p>
     * 
     * @param inboxPlacementTrackingOption
     *        An object that contains information about the inbox placement data settings for the domain.
     */

    public void setInboxPlacementTrackingOption(InboxPlacementTrackingOption inboxPlacementTrackingOption) {
        this.inboxPlacementTrackingOption = inboxPlacementTrackingOption;
    }

    /**
     * <p>
     * An object that contains information about the inbox placement data settings for the domain.
     * </p>
     * 
     * @return An object that contains information about the inbox placement data settings for the domain.
     */

    public InboxPlacementTrackingOption getInboxPlacementTrackingOption() {
        return this.inboxPlacementTrackingOption;
    }

    /**
     * <p>
     * An object that contains information about the inbox placement data settings for the domain.
     * </p>
     * 
     * @param inboxPlacementTrackingOption
     *        An object that contains information about the inbox placement data settings for the domain.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DomainDeliverabilityTrackingOption withInboxPlacementTrackingOption(InboxPlacementTrackingOption inboxPlacementTrackingOption) {
        setInboxPlacementTrackingOption(inboxPlacementTrackingOption);
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
        if (getDomain() != null)
            sb.append("Domain: ").append(getDomain()).append(",");
        if (getSubscriptionStartDate() != null)
            sb.append("SubscriptionStartDate: ").append(getSubscriptionStartDate()).append(",");
        if (getInboxPlacementTrackingOption() != null)
            sb.append("InboxPlacementTrackingOption: ").append(getInboxPlacementTrackingOption());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DomainDeliverabilityTrackingOption == false)
            return false;
        DomainDeliverabilityTrackingOption other = (DomainDeliverabilityTrackingOption) obj;
        if (other.getDomain() == null ^ this.getDomain() == null)
            return false;
        if (other.getDomain() != null && other.getDomain().equals(this.getDomain()) == false)
            return false;
        if (other.getSubscriptionStartDate() == null ^ this.getSubscriptionStartDate() == null)
            return false;
        if (other.getSubscriptionStartDate() != null && other.getSubscriptionStartDate().equals(this.getSubscriptionStartDate()) == false)
            return false;
        if (other.getInboxPlacementTrackingOption() == null ^ this.getInboxPlacementTrackingOption() == null)
            return false;
        if (other.getInboxPlacementTrackingOption() != null && other.getInboxPlacementTrackingOption().equals(this.getInboxPlacementTrackingOption()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDomain() == null) ? 0 : getDomain().hashCode());
        hashCode = prime * hashCode + ((getSubscriptionStartDate() == null) ? 0 : getSubscriptionStartDate().hashCode());
        hashCode = prime * hashCode + ((getInboxPlacementTrackingOption() == null) ? 0 : getInboxPlacementTrackingOption().hashCode());
        return hashCode;
    }

    @Override
    public DomainDeliverabilityTrackingOption clone() {
        try {
            return (DomainDeliverabilityTrackingOption) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.pinpointemail.model.transform.DomainDeliverabilityTrackingOptionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
