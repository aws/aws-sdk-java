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
package com.amazonaws.services.pinpointemail.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An object that contains inbox placement data for email sent from one of your email domains to a specific email
 * provider.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-email-2018-07-26/DomainIspPlacement" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DomainIspPlacement implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the email provider that the inbox placement data applies to.
     * </p>
     */
    private String ispName;
    /**
     * <p>
     * The total number of messages that were sent from the selected domain to the specified email provider that arrived
     * in recipients' inboxes.
     * </p>
     */
    private Long inboxRawCount;
    /**
     * <p>
     * The total number of messages that were sent from the selected domain to the specified email provider that arrived
     * in recipients' spam or junk mail folders.
     * </p>
     */
    private Long spamRawCount;
    /**
     * <p>
     * The percentage of messages that were sent from the selected domain to the specified email provider that arrived
     * in recipients' inboxes.
     * </p>
     */
    private Double inboxPercentage;
    /**
     * <p>
     * The percentage of messages that were sent from the selected domain to the specified email provider that arrived
     * in recipients' spam or junk mail folders.
     * </p>
     */
    private Double spamPercentage;

    /**
     * <p>
     * The name of the email provider that the inbox placement data applies to.
     * </p>
     * 
     * @param ispName
     *        The name of the email provider that the inbox placement data applies to.
     */

    public void setIspName(String ispName) {
        this.ispName = ispName;
    }

    /**
     * <p>
     * The name of the email provider that the inbox placement data applies to.
     * </p>
     * 
     * @return The name of the email provider that the inbox placement data applies to.
     */

    public String getIspName() {
        return this.ispName;
    }

    /**
     * <p>
     * The name of the email provider that the inbox placement data applies to.
     * </p>
     * 
     * @param ispName
     *        The name of the email provider that the inbox placement data applies to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DomainIspPlacement withIspName(String ispName) {
        setIspName(ispName);
        return this;
    }

    /**
     * <p>
     * The total number of messages that were sent from the selected domain to the specified email provider that arrived
     * in recipients' inboxes.
     * </p>
     * 
     * @param inboxRawCount
     *        The total number of messages that were sent from the selected domain to the specified email provider that
     *        arrived in recipients' inboxes.
     */

    public void setInboxRawCount(Long inboxRawCount) {
        this.inboxRawCount = inboxRawCount;
    }

    /**
     * <p>
     * The total number of messages that were sent from the selected domain to the specified email provider that arrived
     * in recipients' inboxes.
     * </p>
     * 
     * @return The total number of messages that were sent from the selected domain to the specified email provider that
     *         arrived in recipients' inboxes.
     */

    public Long getInboxRawCount() {
        return this.inboxRawCount;
    }

    /**
     * <p>
     * The total number of messages that were sent from the selected domain to the specified email provider that arrived
     * in recipients' inboxes.
     * </p>
     * 
     * @param inboxRawCount
     *        The total number of messages that were sent from the selected domain to the specified email provider that
     *        arrived in recipients' inboxes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DomainIspPlacement withInboxRawCount(Long inboxRawCount) {
        setInboxRawCount(inboxRawCount);
        return this;
    }

    /**
     * <p>
     * The total number of messages that were sent from the selected domain to the specified email provider that arrived
     * in recipients' spam or junk mail folders.
     * </p>
     * 
     * @param spamRawCount
     *        The total number of messages that were sent from the selected domain to the specified email provider that
     *        arrived in recipients' spam or junk mail folders.
     */

    public void setSpamRawCount(Long spamRawCount) {
        this.spamRawCount = spamRawCount;
    }

    /**
     * <p>
     * The total number of messages that were sent from the selected domain to the specified email provider that arrived
     * in recipients' spam or junk mail folders.
     * </p>
     * 
     * @return The total number of messages that were sent from the selected domain to the specified email provider that
     *         arrived in recipients' spam or junk mail folders.
     */

    public Long getSpamRawCount() {
        return this.spamRawCount;
    }

    /**
     * <p>
     * The total number of messages that were sent from the selected domain to the specified email provider that arrived
     * in recipients' spam or junk mail folders.
     * </p>
     * 
     * @param spamRawCount
     *        The total number of messages that were sent from the selected domain to the specified email provider that
     *        arrived in recipients' spam or junk mail folders.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DomainIspPlacement withSpamRawCount(Long spamRawCount) {
        setSpamRawCount(spamRawCount);
        return this;
    }

    /**
     * <p>
     * The percentage of messages that were sent from the selected domain to the specified email provider that arrived
     * in recipients' inboxes.
     * </p>
     * 
     * @param inboxPercentage
     *        The percentage of messages that were sent from the selected domain to the specified email provider that
     *        arrived in recipients' inboxes.
     */

    public void setInboxPercentage(Double inboxPercentage) {
        this.inboxPercentage = inboxPercentage;
    }

    /**
     * <p>
     * The percentage of messages that were sent from the selected domain to the specified email provider that arrived
     * in recipients' inboxes.
     * </p>
     * 
     * @return The percentage of messages that were sent from the selected domain to the specified email provider that
     *         arrived in recipients' inboxes.
     */

    public Double getInboxPercentage() {
        return this.inboxPercentage;
    }

    /**
     * <p>
     * The percentage of messages that were sent from the selected domain to the specified email provider that arrived
     * in recipients' inboxes.
     * </p>
     * 
     * @param inboxPercentage
     *        The percentage of messages that were sent from the selected domain to the specified email provider that
     *        arrived in recipients' inboxes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DomainIspPlacement withInboxPercentage(Double inboxPercentage) {
        setInboxPercentage(inboxPercentage);
        return this;
    }

    /**
     * <p>
     * The percentage of messages that were sent from the selected domain to the specified email provider that arrived
     * in recipients' spam or junk mail folders.
     * </p>
     * 
     * @param spamPercentage
     *        The percentage of messages that were sent from the selected domain to the specified email provider that
     *        arrived in recipients' spam or junk mail folders.
     */

    public void setSpamPercentage(Double spamPercentage) {
        this.spamPercentage = spamPercentage;
    }

    /**
     * <p>
     * The percentage of messages that were sent from the selected domain to the specified email provider that arrived
     * in recipients' spam or junk mail folders.
     * </p>
     * 
     * @return The percentage of messages that were sent from the selected domain to the specified email provider that
     *         arrived in recipients' spam or junk mail folders.
     */

    public Double getSpamPercentage() {
        return this.spamPercentage;
    }

    /**
     * <p>
     * The percentage of messages that were sent from the selected domain to the specified email provider that arrived
     * in recipients' spam or junk mail folders.
     * </p>
     * 
     * @param spamPercentage
     *        The percentage of messages that were sent from the selected domain to the specified email provider that
     *        arrived in recipients' spam or junk mail folders.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DomainIspPlacement withSpamPercentage(Double spamPercentage) {
        setSpamPercentage(spamPercentage);
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
        if (getIspName() != null)
            sb.append("IspName: ").append(getIspName()).append(",");
        if (getInboxRawCount() != null)
            sb.append("InboxRawCount: ").append(getInboxRawCount()).append(",");
        if (getSpamRawCount() != null)
            sb.append("SpamRawCount: ").append(getSpamRawCount()).append(",");
        if (getInboxPercentage() != null)
            sb.append("InboxPercentage: ").append(getInboxPercentage()).append(",");
        if (getSpamPercentage() != null)
            sb.append("SpamPercentage: ").append(getSpamPercentage());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DomainIspPlacement == false)
            return false;
        DomainIspPlacement other = (DomainIspPlacement) obj;
        if (other.getIspName() == null ^ this.getIspName() == null)
            return false;
        if (other.getIspName() != null && other.getIspName().equals(this.getIspName()) == false)
            return false;
        if (other.getInboxRawCount() == null ^ this.getInboxRawCount() == null)
            return false;
        if (other.getInboxRawCount() != null && other.getInboxRawCount().equals(this.getInboxRawCount()) == false)
            return false;
        if (other.getSpamRawCount() == null ^ this.getSpamRawCount() == null)
            return false;
        if (other.getSpamRawCount() != null && other.getSpamRawCount().equals(this.getSpamRawCount()) == false)
            return false;
        if (other.getInboxPercentage() == null ^ this.getInboxPercentage() == null)
            return false;
        if (other.getInboxPercentage() != null && other.getInboxPercentage().equals(this.getInboxPercentage()) == false)
            return false;
        if (other.getSpamPercentage() == null ^ this.getSpamPercentage() == null)
            return false;
        if (other.getSpamPercentage() != null && other.getSpamPercentage().equals(this.getSpamPercentage()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIspName() == null) ? 0 : getIspName().hashCode());
        hashCode = prime * hashCode + ((getInboxRawCount() == null) ? 0 : getInboxRawCount().hashCode());
        hashCode = prime * hashCode + ((getSpamRawCount() == null) ? 0 : getSpamRawCount().hashCode());
        hashCode = prime * hashCode + ((getInboxPercentage() == null) ? 0 : getInboxPercentage().hashCode());
        hashCode = prime * hashCode + ((getSpamPercentage() == null) ? 0 : getSpamPercentage().hashCode());
        return hashCode;
    }

    @Override
    public DomainIspPlacement clone() {
        try {
            return (DomainIspPlacement) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.pinpointemail.model.transform.DomainIspPlacementMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
