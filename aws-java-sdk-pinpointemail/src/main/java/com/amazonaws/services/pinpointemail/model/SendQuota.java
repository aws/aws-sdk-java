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
 * An object that contains information about the per-day and per-second sending limits for your Amazon Pinpoint account
 * in the current AWS Region.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-email-2018-07-26/SendQuota" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SendQuota implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The maximum number of emails that you can send in the current AWS Region over a 24-hour period. This value is
     * also called your <i>sending quota</i>.
     * </p>
     */
    private Double max24HourSend;
    /**
     * <p>
     * The maximum number of emails that you can send per second in the current AWS Region. This value is also called
     * your <i>maximum sending rate</i> or your <i>maximum TPS (transactions per second) rate</i>.
     * </p>
     */
    private Double maxSendRate;
    /**
     * <p>
     * The number of emails sent from your Amazon Pinpoint account in the current AWS Region over the past 24 hours.
     * </p>
     */
    private Double sentLast24Hours;

    /**
     * <p>
     * The maximum number of emails that you can send in the current AWS Region over a 24-hour period. This value is
     * also called your <i>sending quota</i>.
     * </p>
     * 
     * @param max24HourSend
     *        The maximum number of emails that you can send in the current AWS Region over a 24-hour period. This value
     *        is also called your <i>sending quota</i>.
     */

    public void setMax24HourSend(Double max24HourSend) {
        this.max24HourSend = max24HourSend;
    }

    /**
     * <p>
     * The maximum number of emails that you can send in the current AWS Region over a 24-hour period. This value is
     * also called your <i>sending quota</i>.
     * </p>
     * 
     * @return The maximum number of emails that you can send in the current AWS Region over a 24-hour period. This
     *         value is also called your <i>sending quota</i>.
     */

    public Double getMax24HourSend() {
        return this.max24HourSend;
    }

    /**
     * <p>
     * The maximum number of emails that you can send in the current AWS Region over a 24-hour period. This value is
     * also called your <i>sending quota</i>.
     * </p>
     * 
     * @param max24HourSend
     *        The maximum number of emails that you can send in the current AWS Region over a 24-hour period. This value
     *        is also called your <i>sending quota</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SendQuota withMax24HourSend(Double max24HourSend) {
        setMax24HourSend(max24HourSend);
        return this;
    }

    /**
     * <p>
     * The maximum number of emails that you can send per second in the current AWS Region. This value is also called
     * your <i>maximum sending rate</i> or your <i>maximum TPS (transactions per second) rate</i>.
     * </p>
     * 
     * @param maxSendRate
     *        The maximum number of emails that you can send per second in the current AWS Region. This value is also
     *        called your <i>maximum sending rate</i> or your <i>maximum TPS (transactions per second) rate</i>.
     */

    public void setMaxSendRate(Double maxSendRate) {
        this.maxSendRate = maxSendRate;
    }

    /**
     * <p>
     * The maximum number of emails that you can send per second in the current AWS Region. This value is also called
     * your <i>maximum sending rate</i> or your <i>maximum TPS (transactions per second) rate</i>.
     * </p>
     * 
     * @return The maximum number of emails that you can send per second in the current AWS Region. This value is also
     *         called your <i>maximum sending rate</i> or your <i>maximum TPS (transactions per second) rate</i>.
     */

    public Double getMaxSendRate() {
        return this.maxSendRate;
    }

    /**
     * <p>
     * The maximum number of emails that you can send per second in the current AWS Region. This value is also called
     * your <i>maximum sending rate</i> or your <i>maximum TPS (transactions per second) rate</i>.
     * </p>
     * 
     * @param maxSendRate
     *        The maximum number of emails that you can send per second in the current AWS Region. This value is also
     *        called your <i>maximum sending rate</i> or your <i>maximum TPS (transactions per second) rate</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SendQuota withMaxSendRate(Double maxSendRate) {
        setMaxSendRate(maxSendRate);
        return this;
    }

    /**
     * <p>
     * The number of emails sent from your Amazon Pinpoint account in the current AWS Region over the past 24 hours.
     * </p>
     * 
     * @param sentLast24Hours
     *        The number of emails sent from your Amazon Pinpoint account in the current AWS Region over the past 24
     *        hours.
     */

    public void setSentLast24Hours(Double sentLast24Hours) {
        this.sentLast24Hours = sentLast24Hours;
    }

    /**
     * <p>
     * The number of emails sent from your Amazon Pinpoint account in the current AWS Region over the past 24 hours.
     * </p>
     * 
     * @return The number of emails sent from your Amazon Pinpoint account in the current AWS Region over the past 24
     *         hours.
     */

    public Double getSentLast24Hours() {
        return this.sentLast24Hours;
    }

    /**
     * <p>
     * The number of emails sent from your Amazon Pinpoint account in the current AWS Region over the past 24 hours.
     * </p>
     * 
     * @param sentLast24Hours
     *        The number of emails sent from your Amazon Pinpoint account in the current AWS Region over the past 24
     *        hours.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SendQuota withSentLast24Hours(Double sentLast24Hours) {
        setSentLast24Hours(sentLast24Hours);
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
        if (getMax24HourSend() != null)
            sb.append("Max24HourSend: ").append(getMax24HourSend()).append(",");
        if (getMaxSendRate() != null)
            sb.append("MaxSendRate: ").append(getMaxSendRate()).append(",");
        if (getSentLast24Hours() != null)
            sb.append("SentLast24Hours: ").append(getSentLast24Hours());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SendQuota == false)
            return false;
        SendQuota other = (SendQuota) obj;
        if (other.getMax24HourSend() == null ^ this.getMax24HourSend() == null)
            return false;
        if (other.getMax24HourSend() != null && other.getMax24HourSend().equals(this.getMax24HourSend()) == false)
            return false;
        if (other.getMaxSendRate() == null ^ this.getMaxSendRate() == null)
            return false;
        if (other.getMaxSendRate() != null && other.getMaxSendRate().equals(this.getMaxSendRate()) == false)
            return false;
        if (other.getSentLast24Hours() == null ^ this.getSentLast24Hours() == null)
            return false;
        if (other.getSentLast24Hours() != null && other.getSentLast24Hours().equals(this.getSentLast24Hours()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMax24HourSend() == null) ? 0 : getMax24HourSend().hashCode());
        hashCode = prime * hashCode + ((getMaxSendRate() == null) ? 0 : getMaxSendRate().hashCode());
        hashCode = prime * hashCode + ((getSentLast24Hours() == null) ? 0 : getSentLast24Hours().hashCode());
        return hashCode;
    }

    @Override
    public SendQuota clone() {
        try {
            return (SendQuota) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.pinpointemail.model.transform.SendQuotaMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
