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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Describes the time period for a Scheduled Instance to start its first schedule. The time period must span less than
 * one day.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/SlotDateTimeRangeRequest" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SlotDateTimeRangeRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The earliest date and time, in UTC, for the Scheduled Instance to start.
     * </p>
     */
    private java.util.Date earliestTime;
    /**
     * <p>
     * The latest date and time, in UTC, for the Scheduled Instance to start. This value must be later than or equal to
     * the earliest date and at most three months in the future.
     * </p>
     */
    private java.util.Date latestTime;

    /**
     * <p>
     * The earliest date and time, in UTC, for the Scheduled Instance to start.
     * </p>
     * 
     * @param earliestTime
     *        The earliest date and time, in UTC, for the Scheduled Instance to start.
     */

    public void setEarliestTime(java.util.Date earliestTime) {
        this.earliestTime = earliestTime;
    }

    /**
     * <p>
     * The earliest date and time, in UTC, for the Scheduled Instance to start.
     * </p>
     * 
     * @return The earliest date and time, in UTC, for the Scheduled Instance to start.
     */

    public java.util.Date getEarliestTime() {
        return this.earliestTime;
    }

    /**
     * <p>
     * The earliest date and time, in UTC, for the Scheduled Instance to start.
     * </p>
     * 
     * @param earliestTime
     *        The earliest date and time, in UTC, for the Scheduled Instance to start.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SlotDateTimeRangeRequest withEarliestTime(java.util.Date earliestTime) {
        setEarliestTime(earliestTime);
        return this;
    }

    /**
     * <p>
     * The latest date and time, in UTC, for the Scheduled Instance to start. This value must be later than or equal to
     * the earliest date and at most three months in the future.
     * </p>
     * 
     * @param latestTime
     *        The latest date and time, in UTC, for the Scheduled Instance to start. This value must be later than or
     *        equal to the earliest date and at most three months in the future.
     */

    public void setLatestTime(java.util.Date latestTime) {
        this.latestTime = latestTime;
    }

    /**
     * <p>
     * The latest date and time, in UTC, for the Scheduled Instance to start. This value must be later than or equal to
     * the earliest date and at most three months in the future.
     * </p>
     * 
     * @return The latest date and time, in UTC, for the Scheduled Instance to start. This value must be later than or
     *         equal to the earliest date and at most three months in the future.
     */

    public java.util.Date getLatestTime() {
        return this.latestTime;
    }

    /**
     * <p>
     * The latest date and time, in UTC, for the Scheduled Instance to start. This value must be later than or equal to
     * the earliest date and at most three months in the future.
     * </p>
     * 
     * @param latestTime
     *        The latest date and time, in UTC, for the Scheduled Instance to start. This value must be later than or
     *        equal to the earliest date and at most three months in the future.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SlotDateTimeRangeRequest withLatestTime(java.util.Date latestTime) {
        setLatestTime(latestTime);
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
        if (getEarliestTime() != null)
            sb.append("EarliestTime: ").append(getEarliestTime()).append(",");
        if (getLatestTime() != null)
            sb.append("LatestTime: ").append(getLatestTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SlotDateTimeRangeRequest == false)
            return false;
        SlotDateTimeRangeRequest other = (SlotDateTimeRangeRequest) obj;
        if (other.getEarliestTime() == null ^ this.getEarliestTime() == null)
            return false;
        if (other.getEarliestTime() != null && other.getEarliestTime().equals(this.getEarliestTime()) == false)
            return false;
        if (other.getLatestTime() == null ^ this.getLatestTime() == null)
            return false;
        if (other.getLatestTime() != null && other.getLatestTime().equals(this.getLatestTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEarliestTime() == null) ? 0 : getEarliestTime().hashCode());
        hashCode = prime * hashCode + ((getLatestTime() == null) ? 0 : getLatestTime().hashCode());
        return hashCode;
    }

    @Override
    public SlotDateTimeRangeRequest clone() {
        try {
            return (SlotDateTimeRangeRequest) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
