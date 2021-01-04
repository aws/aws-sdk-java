/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.costexplorer.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ce-2017-10-25/UpdateAnomalySubscription" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateAnomalySubscriptionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A cost anomaly subscription Amazon Resource Name (ARN).
     * </p>
     */
    private String subscriptionArn;
    /**
     * <p>
     * The update to the threshold value for receiving notifications.
     * </p>
     */
    private Double threshold;
    /**
     * <p>
     * The update to the frequency value at which subscribers will receive notifications.
     * </p>
     */
    private String frequency;
    /**
     * <p>
     * A list of cost anomaly monitor ARNs.
     * </p>
     */
    private java.util.List<String> monitorArnList;
    /**
     * <p>
     * The update to the subscriber list.
     * </p>
     */
    private java.util.List<Subscriber> subscribers;
    /**
     * <p>
     * The subscription's new name.
     * </p>
     */
    private String subscriptionName;

    /**
     * <p>
     * A cost anomaly subscription Amazon Resource Name (ARN).
     * </p>
     * 
     * @param subscriptionArn
     *        A cost anomaly subscription Amazon Resource Name (ARN).
     */

    public void setSubscriptionArn(String subscriptionArn) {
        this.subscriptionArn = subscriptionArn;
    }

    /**
     * <p>
     * A cost anomaly subscription Amazon Resource Name (ARN).
     * </p>
     * 
     * @return A cost anomaly subscription Amazon Resource Name (ARN).
     */

    public String getSubscriptionArn() {
        return this.subscriptionArn;
    }

    /**
     * <p>
     * A cost anomaly subscription Amazon Resource Name (ARN).
     * </p>
     * 
     * @param subscriptionArn
     *        A cost anomaly subscription Amazon Resource Name (ARN).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateAnomalySubscriptionRequest withSubscriptionArn(String subscriptionArn) {
        setSubscriptionArn(subscriptionArn);
        return this;
    }

    /**
     * <p>
     * The update to the threshold value for receiving notifications.
     * </p>
     * 
     * @param threshold
     *        The update to the threshold value for receiving notifications.
     */

    public void setThreshold(Double threshold) {
        this.threshold = threshold;
    }

    /**
     * <p>
     * The update to the threshold value for receiving notifications.
     * </p>
     * 
     * @return The update to the threshold value for receiving notifications.
     */

    public Double getThreshold() {
        return this.threshold;
    }

    /**
     * <p>
     * The update to the threshold value for receiving notifications.
     * </p>
     * 
     * @param threshold
     *        The update to the threshold value for receiving notifications.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateAnomalySubscriptionRequest withThreshold(Double threshold) {
        setThreshold(threshold);
        return this;
    }

    /**
     * <p>
     * The update to the frequency value at which subscribers will receive notifications.
     * </p>
     * 
     * @param frequency
     *        The update to the frequency value at which subscribers will receive notifications.
     * @see AnomalySubscriptionFrequency
     */

    public void setFrequency(String frequency) {
        this.frequency = frequency;
    }

    /**
     * <p>
     * The update to the frequency value at which subscribers will receive notifications.
     * </p>
     * 
     * @return The update to the frequency value at which subscribers will receive notifications.
     * @see AnomalySubscriptionFrequency
     */

    public String getFrequency() {
        return this.frequency;
    }

    /**
     * <p>
     * The update to the frequency value at which subscribers will receive notifications.
     * </p>
     * 
     * @param frequency
     *        The update to the frequency value at which subscribers will receive notifications.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AnomalySubscriptionFrequency
     */

    public UpdateAnomalySubscriptionRequest withFrequency(String frequency) {
        setFrequency(frequency);
        return this;
    }

    /**
     * <p>
     * The update to the frequency value at which subscribers will receive notifications.
     * </p>
     * 
     * @param frequency
     *        The update to the frequency value at which subscribers will receive notifications.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AnomalySubscriptionFrequency
     */

    public UpdateAnomalySubscriptionRequest withFrequency(AnomalySubscriptionFrequency frequency) {
        this.frequency = frequency.toString();
        return this;
    }

    /**
     * <p>
     * A list of cost anomaly monitor ARNs.
     * </p>
     * 
     * @return A list of cost anomaly monitor ARNs.
     */

    public java.util.List<String> getMonitorArnList() {
        return monitorArnList;
    }

    /**
     * <p>
     * A list of cost anomaly monitor ARNs.
     * </p>
     * 
     * @param monitorArnList
     *        A list of cost anomaly monitor ARNs.
     */

    public void setMonitorArnList(java.util.Collection<String> monitorArnList) {
        if (monitorArnList == null) {
            this.monitorArnList = null;
            return;
        }

        this.monitorArnList = new java.util.ArrayList<String>(monitorArnList);
    }

    /**
     * <p>
     * A list of cost anomaly monitor ARNs.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setMonitorArnList(java.util.Collection)} or {@link #withMonitorArnList(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param monitorArnList
     *        A list of cost anomaly monitor ARNs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateAnomalySubscriptionRequest withMonitorArnList(String... monitorArnList) {
        if (this.monitorArnList == null) {
            setMonitorArnList(new java.util.ArrayList<String>(monitorArnList.length));
        }
        for (String ele : monitorArnList) {
            this.monitorArnList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of cost anomaly monitor ARNs.
     * </p>
     * 
     * @param monitorArnList
     *        A list of cost anomaly monitor ARNs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateAnomalySubscriptionRequest withMonitorArnList(java.util.Collection<String> monitorArnList) {
        setMonitorArnList(monitorArnList);
        return this;
    }

    /**
     * <p>
     * The update to the subscriber list.
     * </p>
     * 
     * @return The update to the subscriber list.
     */

    public java.util.List<Subscriber> getSubscribers() {
        return subscribers;
    }

    /**
     * <p>
     * The update to the subscriber list.
     * </p>
     * 
     * @param subscribers
     *        The update to the subscriber list.
     */

    public void setSubscribers(java.util.Collection<Subscriber> subscribers) {
        if (subscribers == null) {
            this.subscribers = null;
            return;
        }

        this.subscribers = new java.util.ArrayList<Subscriber>(subscribers);
    }

    /**
     * <p>
     * The update to the subscriber list.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSubscribers(java.util.Collection)} or {@link #withSubscribers(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param subscribers
     *        The update to the subscriber list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateAnomalySubscriptionRequest withSubscribers(Subscriber... subscribers) {
        if (this.subscribers == null) {
            setSubscribers(new java.util.ArrayList<Subscriber>(subscribers.length));
        }
        for (Subscriber ele : subscribers) {
            this.subscribers.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The update to the subscriber list.
     * </p>
     * 
     * @param subscribers
     *        The update to the subscriber list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateAnomalySubscriptionRequest withSubscribers(java.util.Collection<Subscriber> subscribers) {
        setSubscribers(subscribers);
        return this;
    }

    /**
     * <p>
     * The subscription's new name.
     * </p>
     * 
     * @param subscriptionName
     *        The subscription's new name.
     */

    public void setSubscriptionName(String subscriptionName) {
        this.subscriptionName = subscriptionName;
    }

    /**
     * <p>
     * The subscription's new name.
     * </p>
     * 
     * @return The subscription's new name.
     */

    public String getSubscriptionName() {
        return this.subscriptionName;
    }

    /**
     * <p>
     * The subscription's new name.
     * </p>
     * 
     * @param subscriptionName
     *        The subscription's new name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateAnomalySubscriptionRequest withSubscriptionName(String subscriptionName) {
        setSubscriptionName(subscriptionName);
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
        if (getSubscriptionArn() != null)
            sb.append("SubscriptionArn: ").append(getSubscriptionArn()).append(",");
        if (getThreshold() != null)
            sb.append("Threshold: ").append(getThreshold()).append(",");
        if (getFrequency() != null)
            sb.append("Frequency: ").append(getFrequency()).append(",");
        if (getMonitorArnList() != null)
            sb.append("MonitorArnList: ").append(getMonitorArnList()).append(",");
        if (getSubscribers() != null)
            sb.append("Subscribers: ").append(getSubscribers()).append(",");
        if (getSubscriptionName() != null)
            sb.append("SubscriptionName: ").append(getSubscriptionName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateAnomalySubscriptionRequest == false)
            return false;
        UpdateAnomalySubscriptionRequest other = (UpdateAnomalySubscriptionRequest) obj;
        if (other.getSubscriptionArn() == null ^ this.getSubscriptionArn() == null)
            return false;
        if (other.getSubscriptionArn() != null && other.getSubscriptionArn().equals(this.getSubscriptionArn()) == false)
            return false;
        if (other.getThreshold() == null ^ this.getThreshold() == null)
            return false;
        if (other.getThreshold() != null && other.getThreshold().equals(this.getThreshold()) == false)
            return false;
        if (other.getFrequency() == null ^ this.getFrequency() == null)
            return false;
        if (other.getFrequency() != null && other.getFrequency().equals(this.getFrequency()) == false)
            return false;
        if (other.getMonitorArnList() == null ^ this.getMonitorArnList() == null)
            return false;
        if (other.getMonitorArnList() != null && other.getMonitorArnList().equals(this.getMonitorArnList()) == false)
            return false;
        if (other.getSubscribers() == null ^ this.getSubscribers() == null)
            return false;
        if (other.getSubscribers() != null && other.getSubscribers().equals(this.getSubscribers()) == false)
            return false;
        if (other.getSubscriptionName() == null ^ this.getSubscriptionName() == null)
            return false;
        if (other.getSubscriptionName() != null && other.getSubscriptionName().equals(this.getSubscriptionName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSubscriptionArn() == null) ? 0 : getSubscriptionArn().hashCode());
        hashCode = prime * hashCode + ((getThreshold() == null) ? 0 : getThreshold().hashCode());
        hashCode = prime * hashCode + ((getFrequency() == null) ? 0 : getFrequency().hashCode());
        hashCode = prime * hashCode + ((getMonitorArnList() == null) ? 0 : getMonitorArnList().hashCode());
        hashCode = prime * hashCode + ((getSubscribers() == null) ? 0 : getSubscribers().hashCode());
        hashCode = prime * hashCode + ((getSubscriptionName() == null) ? 0 : getSubscriptionName().hashCode());
        return hashCode;
    }

    @Override
    public UpdateAnomalySubscriptionRequest clone() {
        return (UpdateAnomalySubscriptionRequest) super.clone();
    }

}
