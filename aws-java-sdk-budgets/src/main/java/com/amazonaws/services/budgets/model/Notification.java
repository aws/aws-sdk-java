/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

/**
 * Notification model. Each budget may contain multiple notifications with different settings.
 */
public class Notification implements Serializable, Cloneable {

    private String notificationType;

    private String comparisonOperator;

    private Double threshold;

    /**
     * @param notificationType
     * @see NotificationType
     */

    public void setNotificationType(String notificationType) {
        this.notificationType = notificationType;
    }

    /**
     * @return
     * @see NotificationType
     */

    public String getNotificationType() {
        return this.notificationType;
    }

    /**
     * @param notificationType
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see NotificationType
     */

    public Notification withNotificationType(String notificationType) {
        setNotificationType(notificationType);
        return this;
    }

    /**
     * @param notificationType
     * @see NotificationType
     */

    public void setNotificationType(NotificationType notificationType) {
        this.notificationType = notificationType.toString();
    }

    /**
     * @param notificationType
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see NotificationType
     */

    public Notification withNotificationType(NotificationType notificationType) {
        setNotificationType(notificationType);
        return this;
    }

    /**
     * @param comparisonOperator
     * @see ComparisonOperator
     */

    public void setComparisonOperator(String comparisonOperator) {
        this.comparisonOperator = comparisonOperator;
    }

    /**
     * @return
     * @see ComparisonOperator
     */

    public String getComparisonOperator() {
        return this.comparisonOperator;
    }

    /**
     * @param comparisonOperator
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ComparisonOperator
     */

    public Notification withComparisonOperator(String comparisonOperator) {
        setComparisonOperator(comparisonOperator);
        return this;
    }

    /**
     * @param comparisonOperator
     * @see ComparisonOperator
     */

    public void setComparisonOperator(ComparisonOperator comparisonOperator) {
        this.comparisonOperator = comparisonOperator.toString();
    }

    /**
     * @param comparisonOperator
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ComparisonOperator
     */

    public Notification withComparisonOperator(ComparisonOperator comparisonOperator) {
        setComparisonOperator(comparisonOperator);
        return this;
    }

    /**
     * @param threshold
     */

    public void setThreshold(Double threshold) {
        this.threshold = threshold;
    }

    /**
     * @return
     */

    public Double getThreshold() {
        return this.threshold;
    }

    /**
     * @param threshold
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Notification withThreshold(Double threshold) {
        setThreshold(threshold);
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
            sb.append("NotificationType: " + getNotificationType() + ",");
        if (getComparisonOperator() != null)
            sb.append("ComparisonOperator: " + getComparisonOperator() + ",");
        if (getThreshold() != null)
            sb.append("Threshold: " + getThreshold());
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
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNotificationType() == null) ? 0 : getNotificationType().hashCode());
        hashCode = prime * hashCode + ((getComparisonOperator() == null) ? 0 : getComparisonOperator().hashCode());
        hashCode = prime * hashCode + ((getThreshold() == null) ? 0 : getThreshold().hashCode());
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
}
