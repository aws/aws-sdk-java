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
 * Represents sending statistics data. Each <code>SendDataPoint</code> contains statistics for a 15-minute period of
 * sending activity.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/email-2010-12-01/SendDataPoint" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SendDataPoint implements Serializable, Cloneable {

    /**
     * <p>
     * Time of the data point.
     * </p>
     */
    private java.util.Date timestamp;
    /**
     * <p>
     * Number of emails that have been sent.
     * </p>
     */
    private Long deliveryAttempts;
    /**
     * <p>
     * Number of emails that have bounced.
     * </p>
     */
    private Long bounces;
    /**
     * <p>
     * Number of unwanted emails that were rejected by recipients.
     * </p>
     */
    private Long complaints;
    /**
     * <p>
     * Number of emails rejected by Amazon SES.
     * </p>
     */
    private Long rejects;

    /**
     * <p>
     * Time of the data point.
     * </p>
     * 
     * @param timestamp
     *        Time of the data point.
     */

    public void setTimestamp(java.util.Date timestamp) {
        this.timestamp = timestamp;
    }

    /**
     * <p>
     * Time of the data point.
     * </p>
     * 
     * @return Time of the data point.
     */

    public java.util.Date getTimestamp() {
        return this.timestamp;
    }

    /**
     * <p>
     * Time of the data point.
     * </p>
     * 
     * @param timestamp
     *        Time of the data point.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SendDataPoint withTimestamp(java.util.Date timestamp) {
        setTimestamp(timestamp);
        return this;
    }

    /**
     * <p>
     * Number of emails that have been sent.
     * </p>
     * 
     * @param deliveryAttempts
     *        Number of emails that have been sent.
     */

    public void setDeliveryAttempts(Long deliveryAttempts) {
        this.deliveryAttempts = deliveryAttempts;
    }

    /**
     * <p>
     * Number of emails that have been sent.
     * </p>
     * 
     * @return Number of emails that have been sent.
     */

    public Long getDeliveryAttempts() {
        return this.deliveryAttempts;
    }

    /**
     * <p>
     * Number of emails that have been sent.
     * </p>
     * 
     * @param deliveryAttempts
     *        Number of emails that have been sent.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SendDataPoint withDeliveryAttempts(Long deliveryAttempts) {
        setDeliveryAttempts(deliveryAttempts);
        return this;
    }

    /**
     * <p>
     * Number of emails that have bounced.
     * </p>
     * 
     * @param bounces
     *        Number of emails that have bounced.
     */

    public void setBounces(Long bounces) {
        this.bounces = bounces;
    }

    /**
     * <p>
     * Number of emails that have bounced.
     * </p>
     * 
     * @return Number of emails that have bounced.
     */

    public Long getBounces() {
        return this.bounces;
    }

    /**
     * <p>
     * Number of emails that have bounced.
     * </p>
     * 
     * @param bounces
     *        Number of emails that have bounced.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SendDataPoint withBounces(Long bounces) {
        setBounces(bounces);
        return this;
    }

    /**
     * <p>
     * Number of unwanted emails that were rejected by recipients.
     * </p>
     * 
     * @param complaints
     *        Number of unwanted emails that were rejected by recipients.
     */

    public void setComplaints(Long complaints) {
        this.complaints = complaints;
    }

    /**
     * <p>
     * Number of unwanted emails that were rejected by recipients.
     * </p>
     * 
     * @return Number of unwanted emails that were rejected by recipients.
     */

    public Long getComplaints() {
        return this.complaints;
    }

    /**
     * <p>
     * Number of unwanted emails that were rejected by recipients.
     * </p>
     * 
     * @param complaints
     *        Number of unwanted emails that were rejected by recipients.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SendDataPoint withComplaints(Long complaints) {
        setComplaints(complaints);
        return this;
    }

    /**
     * <p>
     * Number of emails rejected by Amazon SES.
     * </p>
     * 
     * @param rejects
     *        Number of emails rejected by Amazon SES.
     */

    public void setRejects(Long rejects) {
        this.rejects = rejects;
    }

    /**
     * <p>
     * Number of emails rejected by Amazon SES.
     * </p>
     * 
     * @return Number of emails rejected by Amazon SES.
     */

    public Long getRejects() {
        return this.rejects;
    }

    /**
     * <p>
     * Number of emails rejected by Amazon SES.
     * </p>
     * 
     * @param rejects
     *        Number of emails rejected by Amazon SES.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SendDataPoint withRejects(Long rejects) {
        setRejects(rejects);
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
        if (getTimestamp() != null)
            sb.append("Timestamp: ").append(getTimestamp()).append(",");
        if (getDeliveryAttempts() != null)
            sb.append("DeliveryAttempts: ").append(getDeliveryAttempts()).append(",");
        if (getBounces() != null)
            sb.append("Bounces: ").append(getBounces()).append(",");
        if (getComplaints() != null)
            sb.append("Complaints: ").append(getComplaints()).append(",");
        if (getRejects() != null)
            sb.append("Rejects: ").append(getRejects());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SendDataPoint == false)
            return false;
        SendDataPoint other = (SendDataPoint) obj;
        if (other.getTimestamp() == null ^ this.getTimestamp() == null)
            return false;
        if (other.getTimestamp() != null && other.getTimestamp().equals(this.getTimestamp()) == false)
            return false;
        if (other.getDeliveryAttempts() == null ^ this.getDeliveryAttempts() == null)
            return false;
        if (other.getDeliveryAttempts() != null && other.getDeliveryAttempts().equals(this.getDeliveryAttempts()) == false)
            return false;
        if (other.getBounces() == null ^ this.getBounces() == null)
            return false;
        if (other.getBounces() != null && other.getBounces().equals(this.getBounces()) == false)
            return false;
        if (other.getComplaints() == null ^ this.getComplaints() == null)
            return false;
        if (other.getComplaints() != null && other.getComplaints().equals(this.getComplaints()) == false)
            return false;
        if (other.getRejects() == null ^ this.getRejects() == null)
            return false;
        if (other.getRejects() != null && other.getRejects().equals(this.getRejects()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTimestamp() == null) ? 0 : getTimestamp().hashCode());
        hashCode = prime * hashCode + ((getDeliveryAttempts() == null) ? 0 : getDeliveryAttempts().hashCode());
        hashCode = prime * hashCode + ((getBounces() == null) ? 0 : getBounces().hashCode());
        hashCode = prime * hashCode + ((getComplaints() == null) ? 0 : getComplaints().hashCode());
        hashCode = prime * hashCode + ((getRejects() == null) ? 0 : getRejects().hashCode());
        return hashCode;
    }

    @Override
    public SendDataPoint clone() {
        try {
            return (SendDataPoint) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
