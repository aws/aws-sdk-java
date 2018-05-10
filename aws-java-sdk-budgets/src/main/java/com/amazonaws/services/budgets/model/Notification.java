/*
 * Copyright 2013-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.budgets.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A notification associated with a budget. A budget can have up to five notifications.
 * </p>
 * <p>
 * Each notification must have at least one subscriber. A notification can have one SNS subscriber and up to ten email
 * subscribers, for a total of 11 subscribers.
 * </p>
 * <p>
 * For example, if you have a budget for 200 dollars and you want to be notified when you go over 160 dollars, create a
 * notification with the following parameters:
 * </p>
 * <ul>
 * <li>
 * <p>
 * A notificationType of <code>ACTUAL</code>
 * </p>
 * </li>
 * <li>
 * <p>
 * A comparisonOperator of <code>GREATER_THAN</code>
 * </p>
 * </li>
 * <li>
 * <p>
 * A notification threshold of <code>80</code>
 * </p>
 * </li>
 * </ul>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Notification implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Whether the notification is for how much you have spent (<code>ACTUAL</code>) or for how much you are forecasted
     * to spend (<code>FORECASTED</code>).
     * </p>
     */
    private String notificationType;
    /**
     * <p>
     * The comparison used for this notification.
     * </p>
     */
    private String comparisonOperator;
    /**
     * <p>
     * The threshold associated with a notification. Thresholds are always a percentage.
     * </p>
     */
    private Double threshold;
    /**
     * <p>
     * The type of threshold for a notification. For <code>ACTUAL</code> thresholds, AWS notifies you when you go over
     * the threshold, and for <code>FORECASTED</code> thresholds AWS notifies you when you are forecasted to go over the
     * threshold.
     * </p>
     */
    private String thresholdType;

    /**
     * <p>
     * Whether the notification is for how much you have spent (<code>ACTUAL</code>) or for how much you are forecasted
     * to spend (<code>FORECASTED</code>).
     * </p>
     * 
     * @param notificationType
     *        Whether the notification is for how much you have spent (<code>ACTUAL</code>) or for how much you are
     *        forecasted to spend (<code>FORECASTED</code>).
     * @see NotificationType
     */

    public void setNotificationType(String notificationType) {
        this.notificationType = notificationType;
    }

    /**
     * <p>
     * Whether the notification is for how much you have spent (<code>ACTUAL</code>) or for how much you are forecasted
     * to spend (<code>FORECASTED</code>).
     * </p>
     * 
     * @return Whether the notification is for how much you have spent (<code>ACTUAL</code>) or for how much you are
     *         forecasted to spend (<code>FORECASTED</code>).
     * @see NotificationType
     */

    public String getNotificationType() {
        return this.notificationType;
    }

    /**
     * <p>
     * Whether the notification is for how much you have spent (<code>ACTUAL</code>) or for how much you are forecasted
     * to spend (<code>FORECASTED</code>).
     * </p>
     * 
     * @param notificationType
     *        Whether the notification is for how much you have spent (<code>ACTUAL</code>) or for how much you are
     *        forecasted to spend (<code>FORECASTED</code>).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see NotificationType
     */

    public Notification withNotificationType(String notificationType) {
        setNotificationType(notificationType);
        return this;
    }

    /**
     * <p>
     * Whether the notification is for how much you have spent (<code>ACTUAL</code>) or for how much you are forecasted
     * to spend (<code>FORECASTED</code>).
     * </p>
     * 
     * @param notificationType
     *        Whether the notification is for how much you have spent (<code>ACTUAL</code>) or for how much you are
     *        forecasted to spend (<code>FORECASTED</code>).
     * @see NotificationType
     */

    public void setNotificationType(NotificationType notificationType) {
        withNotificationType(notificationType);
    }

    /**
     * <p>
     * Whether the notification is for how much you have spent (<code>ACTUAL</code>) or for how much you are forecasted
     * to spend (<code>FORECASTED</code>).
     * </p>
     * 
     * @param notificationType
     *        Whether the notification is for how much you have spent (<code>ACTUAL</code>) or for how much you are
     *        forecasted to spend (<code>FORECASTED</code>).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see NotificationType
     */

    public Notification withNotificationType(NotificationType notificationType) {
        this.notificationType = notificationType.toString();
        return this;
    }

    /**
     * <p>
     * The comparison used for this notification.
     * </p>
     * 
     * @param comparisonOperator
     *        The comparison used for this notification.
     * @see ComparisonOperator
     */

    public void setComparisonOperator(String comparisonOperator) {
        this.comparisonOperator = comparisonOperator;
    }

    /**
     * <p>
     * The comparison used for this notification.
     * </p>
     * 
     * @return The comparison used for this notification.
     * @see ComparisonOperator
     */

    public String getComparisonOperator() {
        return this.comparisonOperator;
    }

    /**
     * <p>
     * The comparison used for this notification.
     * </p>
     * 
     * @param comparisonOperator
     *        The comparison used for this notification.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ComparisonOperator
     */

    public Notification withComparisonOperator(String comparisonOperator) {
        setComparisonOperator(comparisonOperator);
        return this;
    }

    /**
     * <p>
     * The comparison used for this notification.
     * </p>
     * 
     * @param comparisonOperator
     *        The comparison used for this notification.
     * @see ComparisonOperator
     */

    public void setComparisonOperator(ComparisonOperator comparisonOperator) {
        withComparisonOperator(comparisonOperator);
    }

    /**
     * <p>
     * The comparison used for this notification.
     * </p>
     * 
     * @param comparisonOperator
     *        The comparison used for this notification.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ComparisonOperator
     */

    public Notification withComparisonOperator(ComparisonOperator comparisonOperator) {
        this.comparisonOperator = comparisonOperator.toString();
        return this;
    }

    /**
     * <p>
     * The threshold associated with a notification. Thresholds are always a percentage.
     * </p>
     * 
     * @param threshold
     *        The threshold associated with a notification. Thresholds are always a percentage.
     */

    public void setThreshold(Double threshold) {
        this.threshold = threshold;
    }

    /**
     * <p>
     * The threshold associated with a notification. Thresholds are always a percentage.
     * </p>
     * 
     * @return The threshold associated with a notification. Thresholds are always a percentage.
     */

    public Double getThreshold() {
        return this.threshold;
    }

    /**
     * <p>
     * The threshold associated with a notification. Thresholds are always a percentage.
     * </p>
     * 
     * @param threshold
     *        The threshold associated with a notification. Thresholds are always a percentage.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Notification withThreshold(Double threshold) {
        setThreshold(threshold);
        return this;
    }

    /**
     * <p>
     * The type of threshold for a notification. For <code>ACTUAL</code> thresholds, AWS notifies you when you go over
     * the threshold, and for <code>FORECASTED</code> thresholds AWS notifies you when you are forecasted to go over the
     * threshold.
     * </p>
     * 
     * @param thresholdType
     *        The type of threshold for a notification. For <code>ACTUAL</code> thresholds, AWS notifies you when you go
     *        over the threshold, and for <code>FORECASTED</code> thresholds AWS notifies you when you are forecasted to
     *        go over the threshold.
     * @see ThresholdType
     */

    public void setThresholdType(String thresholdType) {
        this.thresholdType = thresholdType;
    }

    /**
     * <p>
     * The type of threshold for a notification. For <code>ACTUAL</code> thresholds, AWS notifies you when you go over
     * the threshold, and for <code>FORECASTED</code> thresholds AWS notifies you when you are forecasted to go over the
     * threshold.
     * </p>
     * 
     * @return The type of threshold for a notification. For <code>ACTUAL</code> thresholds, AWS notifies you when you
     *         go over the threshold, and for <code>FORECASTED</code> thresholds AWS notifies you when you are
     *         forecasted to go over the threshold.
     * @see ThresholdType
     */

    public String getThresholdType() {
        return this.thresholdType;
    }

    /**
     * <p>
     * The type of threshold for a notification. For <code>ACTUAL</code> thresholds, AWS notifies you when you go over
     * the threshold, and for <code>FORECASTED</code> thresholds AWS notifies you when you are forecasted to go over the
     * threshold.
     * </p>
     * 
     * @param thresholdType
     *        The type of threshold for a notification. For <code>ACTUAL</code> thresholds, AWS notifies you when you go
     *        over the threshold, and for <code>FORECASTED</code> thresholds AWS notifies you when you are forecasted to
     *        go over the threshold.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ThresholdType
     */

    public Notification withThresholdType(String thresholdType) {
        setThresholdType(thresholdType);
        return this;
    }

    /**
     * <p>
     * The type of threshold for a notification. For <code>ACTUAL</code> thresholds, AWS notifies you when you go over
     * the threshold, and for <code>FORECASTED</code> thresholds AWS notifies you when you are forecasted to go over the
     * threshold.
     * </p>
     * 
     * @param thresholdType
     *        The type of threshold for a notification. For <code>ACTUAL</code> thresholds, AWS notifies you when you go
     *        over the threshold, and for <code>FORECASTED</code> thresholds AWS notifies you when you are forecasted to
     *        go over the threshold.
     * @see ThresholdType
     */

    public void setThresholdType(ThresholdType thresholdType) {
        withThresholdType(thresholdType);
    }

    /**
     * <p>
     * The type of threshold for a notification. For <code>ACTUAL</code> thresholds, AWS notifies you when you go over
     * the threshold, and for <code>FORECASTED</code> thresholds AWS notifies you when you are forecasted to go over the
     * threshold.
     * </p>
     * 
     * @param thresholdType
     *        The type of threshold for a notification. For <code>ACTUAL</code> thresholds, AWS notifies you when you go
     *        over the threshold, and for <code>FORECASTED</code> thresholds AWS notifies you when you are forecasted to
     *        go over the threshold.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ThresholdType
     */

    public Notification withThresholdType(ThresholdType thresholdType) {
        this.thresholdType = thresholdType.toString();
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getNotificationType() != null)
            sb.append("NotificationType: ").append(getNotificationType()).append(",");
        if (getComparisonOperator() != null)
            sb.append("ComparisonOperator: ").append(getComparisonOperator()).append(",");
        if (getThreshold() != null)
            sb.append("Threshold: ").append(getThreshold()).append(",");
        if (getThresholdType() != null)
            sb.append("ThresholdType: ").append(getThresholdType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Notification == false)
            return false;
        Notification other = (Notification) obj;
        if (other.getNotificationType() == null ^ this.getNotificationType() == null)
            return false;
        if (other.getNotificationType() != null && other.getNotificationType().equals(this.getNotificationType()) == false)
            return false;
        if (other.getComparisonOperator() == null ^ this.getComparisonOperator() == null)
            return false;
        if (other.getComparisonOperator() != null && other.getComparisonOperator().equals(this.getComparisonOperator()) == false)
            return false;
        if (other.getThreshold() == null ^ this.getThreshold() == null)
            return false;
        if (other.getThreshold() != null && other.getThreshold().equals(this.getThreshold()) == false)
            return false;
        if (other.getThresholdType() == null ^ this.getThresholdType() == null)
            return false;
        if (other.getThresholdType() != null && other.getThresholdType().equals(this.getThresholdType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNotificationType() == null) ? 0 : getNotificationType().hashCode());
        hashCode = prime * hashCode + ((getComparisonOperator() == null) ? 0 : getComparisonOperator().hashCode());
        hashCode = prime * hashCode + ((getThreshold() == null) ? 0 : getThreshold().hashCode());
        hashCode = prime * hashCode + ((getThresholdType() == null) ? 0 : getThresholdType().hashCode());
        return hashCode;
    }

    @Override
    public Notification clone() {
        try {
            return (Notification) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.budgets.model.transform.NotificationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
