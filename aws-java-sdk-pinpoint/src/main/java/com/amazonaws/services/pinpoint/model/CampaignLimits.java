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
package com.amazonaws.services.pinpoint.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Specifies limits on the messages that a campaign can send.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/CampaignLimits" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CampaignLimits implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The maximum number of messages that a campaign can send to a single endpoint during a 24-hour period. The maximum
     * value is 100.
     * </p>
     */
    private Integer daily;
    /**
     * <p>
     * The maximum amount of time, in seconds, that a campaign can attempt to deliver a message after the scheduled
     * start time for the campaign. The minimum value is 60 seconds.
     * </p>
     */
    private Integer maximumDuration;
    /**
     * <p>
     * The maximum number of messages that a campaign can send each second. The minimum value is 50. The maximum value
     * is 20,000.
     * </p>
     */
    private Integer messagesPerSecond;
    /**
     * <p>
     * The maximum number of messages that a campaign can send to a single endpoint during the course of the campaign.
     * The maximum value is 100.
     * </p>
     */
    private Integer total;

    /**
     * <p>
     * The maximum number of messages that a campaign can send to a single endpoint during a 24-hour period. The maximum
     * value is 100.
     * </p>
     * 
     * @param daily
     *        The maximum number of messages that a campaign can send to a single endpoint during a 24-hour period. The
     *        maximum value is 100.
     */

    public void setDaily(Integer daily) {
        this.daily = daily;
    }

    /**
     * <p>
     * The maximum number of messages that a campaign can send to a single endpoint during a 24-hour period. The maximum
     * value is 100.
     * </p>
     * 
     * @return The maximum number of messages that a campaign can send to a single endpoint during a 24-hour period. The
     *         maximum value is 100.
     */

    public Integer getDaily() {
        return this.daily;
    }

    /**
     * <p>
     * The maximum number of messages that a campaign can send to a single endpoint during a 24-hour period. The maximum
     * value is 100.
     * </p>
     * 
     * @param daily
     *        The maximum number of messages that a campaign can send to a single endpoint during a 24-hour period. The
     *        maximum value is 100.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CampaignLimits withDaily(Integer daily) {
        setDaily(daily);
        return this;
    }

    /**
     * <p>
     * The maximum amount of time, in seconds, that a campaign can attempt to deliver a message after the scheduled
     * start time for the campaign. The minimum value is 60 seconds.
     * </p>
     * 
     * @param maximumDuration
     *        The maximum amount of time, in seconds, that a campaign can attempt to deliver a message after the
     *        scheduled start time for the campaign. The minimum value is 60 seconds.
     */

    public void setMaximumDuration(Integer maximumDuration) {
        this.maximumDuration = maximumDuration;
    }

    /**
     * <p>
     * The maximum amount of time, in seconds, that a campaign can attempt to deliver a message after the scheduled
     * start time for the campaign. The minimum value is 60 seconds.
     * </p>
     * 
     * @return The maximum amount of time, in seconds, that a campaign can attempt to deliver a message after the
     *         scheduled start time for the campaign. The minimum value is 60 seconds.
     */

    public Integer getMaximumDuration() {
        return this.maximumDuration;
    }

    /**
     * <p>
     * The maximum amount of time, in seconds, that a campaign can attempt to deliver a message after the scheduled
     * start time for the campaign. The minimum value is 60 seconds.
     * </p>
     * 
     * @param maximumDuration
     *        The maximum amount of time, in seconds, that a campaign can attempt to deliver a message after the
     *        scheduled start time for the campaign. The minimum value is 60 seconds.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CampaignLimits withMaximumDuration(Integer maximumDuration) {
        setMaximumDuration(maximumDuration);
        return this;
    }

    /**
     * <p>
     * The maximum number of messages that a campaign can send each second. The minimum value is 50. The maximum value
     * is 20,000.
     * </p>
     * 
     * @param messagesPerSecond
     *        The maximum number of messages that a campaign can send each second. The minimum value is 50. The maximum
     *        value is 20,000.
     */

    public void setMessagesPerSecond(Integer messagesPerSecond) {
        this.messagesPerSecond = messagesPerSecond;
    }

    /**
     * <p>
     * The maximum number of messages that a campaign can send each second. The minimum value is 50. The maximum value
     * is 20,000.
     * </p>
     * 
     * @return The maximum number of messages that a campaign can send each second. The minimum value is 50. The maximum
     *         value is 20,000.
     */

    public Integer getMessagesPerSecond() {
        return this.messagesPerSecond;
    }

    /**
     * <p>
     * The maximum number of messages that a campaign can send each second. The minimum value is 50. The maximum value
     * is 20,000.
     * </p>
     * 
     * @param messagesPerSecond
     *        The maximum number of messages that a campaign can send each second. The minimum value is 50. The maximum
     *        value is 20,000.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CampaignLimits withMessagesPerSecond(Integer messagesPerSecond) {
        setMessagesPerSecond(messagesPerSecond);
        return this;
    }

    /**
     * <p>
     * The maximum number of messages that a campaign can send to a single endpoint during the course of the campaign.
     * The maximum value is 100.
     * </p>
     * 
     * @param total
     *        The maximum number of messages that a campaign can send to a single endpoint during the course of the
     *        campaign. The maximum value is 100.
     */

    public void setTotal(Integer total) {
        this.total = total;
    }

    /**
     * <p>
     * The maximum number of messages that a campaign can send to a single endpoint during the course of the campaign.
     * The maximum value is 100.
     * </p>
     * 
     * @return The maximum number of messages that a campaign can send to a single endpoint during the course of the
     *         campaign. The maximum value is 100.
     */

    public Integer getTotal() {
        return this.total;
    }

    /**
     * <p>
     * The maximum number of messages that a campaign can send to a single endpoint during the course of the campaign.
     * The maximum value is 100.
     * </p>
     * 
     * @param total
     *        The maximum number of messages that a campaign can send to a single endpoint during the course of the
     *        campaign. The maximum value is 100.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CampaignLimits withTotal(Integer total) {
        setTotal(total);
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
        if (getDaily() != null)
            sb.append("Daily: ").append(getDaily()).append(",");
        if (getMaximumDuration() != null)
            sb.append("MaximumDuration: ").append(getMaximumDuration()).append(",");
        if (getMessagesPerSecond() != null)
            sb.append("MessagesPerSecond: ").append(getMessagesPerSecond()).append(",");
        if (getTotal() != null)
            sb.append("Total: ").append(getTotal());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CampaignLimits == false)
            return false;
        CampaignLimits other = (CampaignLimits) obj;
        if (other.getDaily() == null ^ this.getDaily() == null)
            return false;
        if (other.getDaily() != null && other.getDaily().equals(this.getDaily()) == false)
            return false;
        if (other.getMaximumDuration() == null ^ this.getMaximumDuration() == null)
            return false;
        if (other.getMaximumDuration() != null && other.getMaximumDuration().equals(this.getMaximumDuration()) == false)
            return false;
        if (other.getMessagesPerSecond() == null ^ this.getMessagesPerSecond() == null)
            return false;
        if (other.getMessagesPerSecond() != null && other.getMessagesPerSecond().equals(this.getMessagesPerSecond()) == false)
            return false;
        if (other.getTotal() == null ^ this.getTotal() == null)
            return false;
        if (other.getTotal() != null && other.getTotal().equals(this.getTotal()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDaily() == null) ? 0 : getDaily().hashCode());
        hashCode = prime * hashCode + ((getMaximumDuration() == null) ? 0 : getMaximumDuration().hashCode());
        hashCode = prime * hashCode + ((getMessagesPerSecond() == null) ? 0 : getMessagesPerSecond().hashCode());
        hashCode = prime * hashCode + ((getTotal() == null) ? 0 : getTotal().hashCode());
        return hashCode;
    }

    @Override
    public CampaignLimits clone() {
        try {
            return (CampaignLimits) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.pinpoint.model.transform.CampaignLimitsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
