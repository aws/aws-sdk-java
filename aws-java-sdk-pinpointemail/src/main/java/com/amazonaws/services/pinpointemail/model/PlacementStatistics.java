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
 * An object that contains inbox placement data for an email provider.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-email-2018-07-26/PlacementStatistics" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PlacementStatistics implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The percentage of emails that arrived in recipients' inboxes during the predictive inbox placement test.
     * </p>
     */
    private Double inboxPercentage;
    /**
     * <p>
     * The percentage of emails that arrived in recipients' spam or junk mail folders during the predictive inbox
     * placement test.
     * </p>
     */
    private Double spamPercentage;
    /**
     * <p>
     * The percentage of emails that didn't arrive in recipients' inboxes at all during the predictive inbox placement
     * test.
     * </p>
     */
    private Double missingPercentage;
    /**
     * <p>
     * The percentage of emails that were authenticated by using Sender Policy Framework (SPF) during the predictive
     * inbox placement test.
     * </p>
     */
    private Double spfPercentage;
    /**
     * <p>
     * The percentage of emails that were authenticated by using DomainKeys Identified Mail (DKIM) during the predictive
     * inbox placement test.
     * </p>
     */
    private Double dkimPercentage;

    /**
     * <p>
     * The percentage of emails that arrived in recipients' inboxes during the predictive inbox placement test.
     * </p>
     * 
     * @param inboxPercentage
     *        The percentage of emails that arrived in recipients' inboxes during the predictive inbox placement test.
     */

    public void setInboxPercentage(Double inboxPercentage) {
        this.inboxPercentage = inboxPercentage;
    }

    /**
     * <p>
     * The percentage of emails that arrived in recipients' inboxes during the predictive inbox placement test.
     * </p>
     * 
     * @return The percentage of emails that arrived in recipients' inboxes during the predictive inbox placement test.
     */

    public Double getInboxPercentage() {
        return this.inboxPercentage;
    }

    /**
     * <p>
     * The percentage of emails that arrived in recipients' inboxes during the predictive inbox placement test.
     * </p>
     * 
     * @param inboxPercentage
     *        The percentage of emails that arrived in recipients' inboxes during the predictive inbox placement test.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PlacementStatistics withInboxPercentage(Double inboxPercentage) {
        setInboxPercentage(inboxPercentage);
        return this;
    }

    /**
     * <p>
     * The percentage of emails that arrived in recipients' spam or junk mail folders during the predictive inbox
     * placement test.
     * </p>
     * 
     * @param spamPercentage
     *        The percentage of emails that arrived in recipients' spam or junk mail folders during the predictive inbox
     *        placement test.
     */

    public void setSpamPercentage(Double spamPercentage) {
        this.spamPercentage = spamPercentage;
    }

    /**
     * <p>
     * The percentage of emails that arrived in recipients' spam or junk mail folders during the predictive inbox
     * placement test.
     * </p>
     * 
     * @return The percentage of emails that arrived in recipients' spam or junk mail folders during the predictive
     *         inbox placement test.
     */

    public Double getSpamPercentage() {
        return this.spamPercentage;
    }

    /**
     * <p>
     * The percentage of emails that arrived in recipients' spam or junk mail folders during the predictive inbox
     * placement test.
     * </p>
     * 
     * @param spamPercentage
     *        The percentage of emails that arrived in recipients' spam or junk mail folders during the predictive inbox
     *        placement test.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PlacementStatistics withSpamPercentage(Double spamPercentage) {
        setSpamPercentage(spamPercentage);
        return this;
    }

    /**
     * <p>
     * The percentage of emails that didn't arrive in recipients' inboxes at all during the predictive inbox placement
     * test.
     * </p>
     * 
     * @param missingPercentage
     *        The percentage of emails that didn't arrive in recipients' inboxes at all during the predictive inbox
     *        placement test.
     */

    public void setMissingPercentage(Double missingPercentage) {
        this.missingPercentage = missingPercentage;
    }

    /**
     * <p>
     * The percentage of emails that didn't arrive in recipients' inboxes at all during the predictive inbox placement
     * test.
     * </p>
     * 
     * @return The percentage of emails that didn't arrive in recipients' inboxes at all during the predictive inbox
     *         placement test.
     */

    public Double getMissingPercentage() {
        return this.missingPercentage;
    }

    /**
     * <p>
     * The percentage of emails that didn't arrive in recipients' inboxes at all during the predictive inbox placement
     * test.
     * </p>
     * 
     * @param missingPercentage
     *        The percentage of emails that didn't arrive in recipients' inboxes at all during the predictive inbox
     *        placement test.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PlacementStatistics withMissingPercentage(Double missingPercentage) {
        setMissingPercentage(missingPercentage);
        return this;
    }

    /**
     * <p>
     * The percentage of emails that were authenticated by using Sender Policy Framework (SPF) during the predictive
     * inbox placement test.
     * </p>
     * 
     * @param spfPercentage
     *        The percentage of emails that were authenticated by using Sender Policy Framework (SPF) during the
     *        predictive inbox placement test.
     */

    public void setSpfPercentage(Double spfPercentage) {
        this.spfPercentage = spfPercentage;
    }

    /**
     * <p>
     * The percentage of emails that were authenticated by using Sender Policy Framework (SPF) during the predictive
     * inbox placement test.
     * </p>
     * 
     * @return The percentage of emails that were authenticated by using Sender Policy Framework (SPF) during the
     *         predictive inbox placement test.
     */

    public Double getSpfPercentage() {
        return this.spfPercentage;
    }

    /**
     * <p>
     * The percentage of emails that were authenticated by using Sender Policy Framework (SPF) during the predictive
     * inbox placement test.
     * </p>
     * 
     * @param spfPercentage
     *        The percentage of emails that were authenticated by using Sender Policy Framework (SPF) during the
     *        predictive inbox placement test.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PlacementStatistics withSpfPercentage(Double spfPercentage) {
        setSpfPercentage(spfPercentage);
        return this;
    }

    /**
     * <p>
     * The percentage of emails that were authenticated by using DomainKeys Identified Mail (DKIM) during the predictive
     * inbox placement test.
     * </p>
     * 
     * @param dkimPercentage
     *        The percentage of emails that were authenticated by using DomainKeys Identified Mail (DKIM) during the
     *        predictive inbox placement test.
     */

    public void setDkimPercentage(Double dkimPercentage) {
        this.dkimPercentage = dkimPercentage;
    }

    /**
     * <p>
     * The percentage of emails that were authenticated by using DomainKeys Identified Mail (DKIM) during the predictive
     * inbox placement test.
     * </p>
     * 
     * @return The percentage of emails that were authenticated by using DomainKeys Identified Mail (DKIM) during the
     *         predictive inbox placement test.
     */

    public Double getDkimPercentage() {
        return this.dkimPercentage;
    }

    /**
     * <p>
     * The percentage of emails that were authenticated by using DomainKeys Identified Mail (DKIM) during the predictive
     * inbox placement test.
     * </p>
     * 
     * @param dkimPercentage
     *        The percentage of emails that were authenticated by using DomainKeys Identified Mail (DKIM) during the
     *        predictive inbox placement test.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PlacementStatistics withDkimPercentage(Double dkimPercentage) {
        setDkimPercentage(dkimPercentage);
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
        if (getInboxPercentage() != null)
            sb.append("InboxPercentage: ").append(getInboxPercentage()).append(",");
        if (getSpamPercentage() != null)
            sb.append("SpamPercentage: ").append(getSpamPercentage()).append(",");
        if (getMissingPercentage() != null)
            sb.append("MissingPercentage: ").append(getMissingPercentage()).append(",");
        if (getSpfPercentage() != null)
            sb.append("SpfPercentage: ").append(getSpfPercentage()).append(",");
        if (getDkimPercentage() != null)
            sb.append("DkimPercentage: ").append(getDkimPercentage());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PlacementStatistics == false)
            return false;
        PlacementStatistics other = (PlacementStatistics) obj;
        if (other.getInboxPercentage() == null ^ this.getInboxPercentage() == null)
            return false;
        if (other.getInboxPercentage() != null && other.getInboxPercentage().equals(this.getInboxPercentage()) == false)
            return false;
        if (other.getSpamPercentage() == null ^ this.getSpamPercentage() == null)
            return false;
        if (other.getSpamPercentage() != null && other.getSpamPercentage().equals(this.getSpamPercentage()) == false)
            return false;
        if (other.getMissingPercentage() == null ^ this.getMissingPercentage() == null)
            return false;
        if (other.getMissingPercentage() != null && other.getMissingPercentage().equals(this.getMissingPercentage()) == false)
            return false;
        if (other.getSpfPercentage() == null ^ this.getSpfPercentage() == null)
            return false;
        if (other.getSpfPercentage() != null && other.getSpfPercentage().equals(this.getSpfPercentage()) == false)
            return false;
        if (other.getDkimPercentage() == null ^ this.getDkimPercentage() == null)
            return false;
        if (other.getDkimPercentage() != null && other.getDkimPercentage().equals(this.getDkimPercentage()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInboxPercentage() == null) ? 0 : getInboxPercentage().hashCode());
        hashCode = prime * hashCode + ((getSpamPercentage() == null) ? 0 : getSpamPercentage().hashCode());
        hashCode = prime * hashCode + ((getMissingPercentage() == null) ? 0 : getMissingPercentage().hashCode());
        hashCode = prime * hashCode + ((getSpfPercentage() == null) ? 0 : getSpfPercentage().hashCode());
        hashCode = prime * hashCode + ((getDkimPercentage() == null) ? 0 : getDkimPercentage().hashCode());
        return hashCode;
    }

    @Override
    public PlacementStatistics clone() {
        try {
            return (PlacementStatistics) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.pinpointemail.model.transform.PlacementStatisticsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
