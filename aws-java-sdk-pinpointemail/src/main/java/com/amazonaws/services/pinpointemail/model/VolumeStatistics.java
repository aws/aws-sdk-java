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
 * An object that contains information about the amount of email that was delivered to recipients.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-email-2018-07-26/VolumeStatistics" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class VolumeStatistics implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The total number of emails that arrived in recipients' inboxes.
     * </p>
     */
    private Long inboxRawCount;
    /**
     * <p>
     * The total number of emails that arrived in recipients' spam or junk mail folders.
     * </p>
     */
    private Long spamRawCount;
    /**
     * <p>
     * An estimate of the percentage of emails sent from the current domain that will arrive in recipients' inboxes.
     * </p>
     */
    private Long projectedInbox;
    /**
     * <p>
     * An estimate of the percentage of emails sent from the current domain that will arrive in recipients' spam or junk
     * mail folders.
     * </p>
     */
    private Long projectedSpam;

    /**
     * <p>
     * The total number of emails that arrived in recipients' inboxes.
     * </p>
     * 
     * @param inboxRawCount
     *        The total number of emails that arrived in recipients' inboxes.
     */

    public void setInboxRawCount(Long inboxRawCount) {
        this.inboxRawCount = inboxRawCount;
    }

    /**
     * <p>
     * The total number of emails that arrived in recipients' inboxes.
     * </p>
     * 
     * @return The total number of emails that arrived in recipients' inboxes.
     */

    public Long getInboxRawCount() {
        return this.inboxRawCount;
    }

    /**
     * <p>
     * The total number of emails that arrived in recipients' inboxes.
     * </p>
     * 
     * @param inboxRawCount
     *        The total number of emails that arrived in recipients' inboxes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VolumeStatistics withInboxRawCount(Long inboxRawCount) {
        setInboxRawCount(inboxRawCount);
        return this;
    }

    /**
     * <p>
     * The total number of emails that arrived in recipients' spam or junk mail folders.
     * </p>
     * 
     * @param spamRawCount
     *        The total number of emails that arrived in recipients' spam or junk mail folders.
     */

    public void setSpamRawCount(Long spamRawCount) {
        this.spamRawCount = spamRawCount;
    }

    /**
     * <p>
     * The total number of emails that arrived in recipients' spam or junk mail folders.
     * </p>
     * 
     * @return The total number of emails that arrived in recipients' spam or junk mail folders.
     */

    public Long getSpamRawCount() {
        return this.spamRawCount;
    }

    /**
     * <p>
     * The total number of emails that arrived in recipients' spam or junk mail folders.
     * </p>
     * 
     * @param spamRawCount
     *        The total number of emails that arrived in recipients' spam or junk mail folders.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VolumeStatistics withSpamRawCount(Long spamRawCount) {
        setSpamRawCount(spamRawCount);
        return this;
    }

    /**
     * <p>
     * An estimate of the percentage of emails sent from the current domain that will arrive in recipients' inboxes.
     * </p>
     * 
     * @param projectedInbox
     *        An estimate of the percentage of emails sent from the current domain that will arrive in recipients'
     *        inboxes.
     */

    public void setProjectedInbox(Long projectedInbox) {
        this.projectedInbox = projectedInbox;
    }

    /**
     * <p>
     * An estimate of the percentage of emails sent from the current domain that will arrive in recipients' inboxes.
     * </p>
     * 
     * @return An estimate of the percentage of emails sent from the current domain that will arrive in recipients'
     *         inboxes.
     */

    public Long getProjectedInbox() {
        return this.projectedInbox;
    }

    /**
     * <p>
     * An estimate of the percentage of emails sent from the current domain that will arrive in recipients' inboxes.
     * </p>
     * 
     * @param projectedInbox
     *        An estimate of the percentage of emails sent from the current domain that will arrive in recipients'
     *        inboxes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VolumeStatistics withProjectedInbox(Long projectedInbox) {
        setProjectedInbox(projectedInbox);
        return this;
    }

    /**
     * <p>
     * An estimate of the percentage of emails sent from the current domain that will arrive in recipients' spam or junk
     * mail folders.
     * </p>
     * 
     * @param projectedSpam
     *        An estimate of the percentage of emails sent from the current domain that will arrive in recipients' spam
     *        or junk mail folders.
     */

    public void setProjectedSpam(Long projectedSpam) {
        this.projectedSpam = projectedSpam;
    }

    /**
     * <p>
     * An estimate of the percentage of emails sent from the current domain that will arrive in recipients' spam or junk
     * mail folders.
     * </p>
     * 
     * @return An estimate of the percentage of emails sent from the current domain that will arrive in recipients' spam
     *         or junk mail folders.
     */

    public Long getProjectedSpam() {
        return this.projectedSpam;
    }

    /**
     * <p>
     * An estimate of the percentage of emails sent from the current domain that will arrive in recipients' spam or junk
     * mail folders.
     * </p>
     * 
     * @param projectedSpam
     *        An estimate of the percentage of emails sent from the current domain that will arrive in recipients' spam
     *        or junk mail folders.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VolumeStatistics withProjectedSpam(Long projectedSpam) {
        setProjectedSpam(projectedSpam);
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
        if (getInboxRawCount() != null)
            sb.append("InboxRawCount: ").append(getInboxRawCount()).append(",");
        if (getSpamRawCount() != null)
            sb.append("SpamRawCount: ").append(getSpamRawCount()).append(",");
        if (getProjectedInbox() != null)
            sb.append("ProjectedInbox: ").append(getProjectedInbox()).append(",");
        if (getProjectedSpam() != null)
            sb.append("ProjectedSpam: ").append(getProjectedSpam());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof VolumeStatistics == false)
            return false;
        VolumeStatistics other = (VolumeStatistics) obj;
        if (other.getInboxRawCount() == null ^ this.getInboxRawCount() == null)
            return false;
        if (other.getInboxRawCount() != null && other.getInboxRawCount().equals(this.getInboxRawCount()) == false)
            return false;
        if (other.getSpamRawCount() == null ^ this.getSpamRawCount() == null)
            return false;
        if (other.getSpamRawCount() != null && other.getSpamRawCount().equals(this.getSpamRawCount()) == false)
            return false;
        if (other.getProjectedInbox() == null ^ this.getProjectedInbox() == null)
            return false;
        if (other.getProjectedInbox() != null && other.getProjectedInbox().equals(this.getProjectedInbox()) == false)
            return false;
        if (other.getProjectedSpam() == null ^ this.getProjectedSpam() == null)
            return false;
        if (other.getProjectedSpam() != null && other.getProjectedSpam().equals(this.getProjectedSpam()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInboxRawCount() == null) ? 0 : getInboxRawCount().hashCode());
        hashCode = prime * hashCode + ((getSpamRawCount() == null) ? 0 : getSpamRawCount().hashCode());
        hashCode = prime * hashCode + ((getProjectedInbox() == null) ? 0 : getProjectedInbox().hashCode());
        hashCode = prime * hashCode + ((getProjectedSpam() == null) ? 0 : getProjectedSpam().hashCode());
        return hashCode;
    }

    @Override
    public VolumeStatistics clone() {
        try {
            return (VolumeStatistics) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.pinpointemail.model.transform.VolumeStatisticsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
