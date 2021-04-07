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
package com.amazonaws.services.storagegateway.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes a bandwidth rate limit interval for a gateway. A bandwidth rate limit schedule consists of one or more
 * bandwidth rate limit intervals. A bandwidth rate limit interval defines a period of time on one or more days of the
 * week, during which bandwidth rate limits are specified for uploading, downloading, or both.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/storagegateway-2013-06-30/BandwidthRateLimitInterval"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BandwidthRateLimitInterval implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The hour of the day to start the bandwidth rate limit interval.
     * </p>
     */
    private Integer startHourOfDay;
    /**
     * <p>
     * The minute of the hour to start the bandwidth rate limit interval. The interval begins at the start of that
     * minute. To begin an interval exactly at the start of the hour, use the value <code>0</code>.
     * </p>
     */
    private Integer startMinuteOfHour;
    /**
     * <p>
     * The hour of the day to end the bandwidth rate limit interval.
     * </p>
     */
    private Integer endHourOfDay;
    /**
     * <p>
     * The minute of the hour to end the bandwidth rate limit interval.
     * </p>
     * <important>
     * <p>
     * The bandwidth rate limit interval ends at the end of the minute. To end an interval at the end of an hour, use
     * the value <code>59</code>.
     * </p>
     * </important>
     */
    private Integer endMinuteOfHour;
    /**
     * <p>
     * The days of the week component of the bandwidth rate limit interval, represented as ordinal numbers from 0 to 6,
     * where 0 represents Sunday and 6 represents Saturday.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Integer> daysOfWeek;
    /**
     * <p>
     * The average upload rate limit component of the bandwidth rate limit interval, in bits per second. This field does
     * not appear in the response if the upload rate limit is not set.
     * </p>
     */
    private Long averageUploadRateLimitInBitsPerSec;
    /**
     * <p>
     * The average download rate limit component of the bandwidth rate limit interval, in bits per second. This field
     * does not appear in the response if the download rate limit is not set.
     * </p>
     */
    private Long averageDownloadRateLimitInBitsPerSec;

    /**
     * <p>
     * The hour of the day to start the bandwidth rate limit interval.
     * </p>
     * 
     * @param startHourOfDay
     *        The hour of the day to start the bandwidth rate limit interval.
     */

    public void setStartHourOfDay(Integer startHourOfDay) {
        this.startHourOfDay = startHourOfDay;
    }

    /**
     * <p>
     * The hour of the day to start the bandwidth rate limit interval.
     * </p>
     * 
     * @return The hour of the day to start the bandwidth rate limit interval.
     */

    public Integer getStartHourOfDay() {
        return this.startHourOfDay;
    }

    /**
     * <p>
     * The hour of the day to start the bandwidth rate limit interval.
     * </p>
     * 
     * @param startHourOfDay
     *        The hour of the day to start the bandwidth rate limit interval.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BandwidthRateLimitInterval withStartHourOfDay(Integer startHourOfDay) {
        setStartHourOfDay(startHourOfDay);
        return this;
    }

    /**
     * <p>
     * The minute of the hour to start the bandwidth rate limit interval. The interval begins at the start of that
     * minute. To begin an interval exactly at the start of the hour, use the value <code>0</code>.
     * </p>
     * 
     * @param startMinuteOfHour
     *        The minute of the hour to start the bandwidth rate limit interval. The interval begins at the start of
     *        that minute. To begin an interval exactly at the start of the hour, use the value <code>0</code>.
     */

    public void setStartMinuteOfHour(Integer startMinuteOfHour) {
        this.startMinuteOfHour = startMinuteOfHour;
    }

    /**
     * <p>
     * The minute of the hour to start the bandwidth rate limit interval. The interval begins at the start of that
     * minute. To begin an interval exactly at the start of the hour, use the value <code>0</code>.
     * </p>
     * 
     * @return The minute of the hour to start the bandwidth rate limit interval. The interval begins at the start of
     *         that minute. To begin an interval exactly at the start of the hour, use the value <code>0</code>.
     */

    public Integer getStartMinuteOfHour() {
        return this.startMinuteOfHour;
    }

    /**
     * <p>
     * The minute of the hour to start the bandwidth rate limit interval. The interval begins at the start of that
     * minute. To begin an interval exactly at the start of the hour, use the value <code>0</code>.
     * </p>
     * 
     * @param startMinuteOfHour
     *        The minute of the hour to start the bandwidth rate limit interval. The interval begins at the start of
     *        that minute. To begin an interval exactly at the start of the hour, use the value <code>0</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BandwidthRateLimitInterval withStartMinuteOfHour(Integer startMinuteOfHour) {
        setStartMinuteOfHour(startMinuteOfHour);
        return this;
    }

    /**
     * <p>
     * The hour of the day to end the bandwidth rate limit interval.
     * </p>
     * 
     * @param endHourOfDay
     *        The hour of the day to end the bandwidth rate limit interval.
     */

    public void setEndHourOfDay(Integer endHourOfDay) {
        this.endHourOfDay = endHourOfDay;
    }

    /**
     * <p>
     * The hour of the day to end the bandwidth rate limit interval.
     * </p>
     * 
     * @return The hour of the day to end the bandwidth rate limit interval.
     */

    public Integer getEndHourOfDay() {
        return this.endHourOfDay;
    }

    /**
     * <p>
     * The hour of the day to end the bandwidth rate limit interval.
     * </p>
     * 
     * @param endHourOfDay
     *        The hour of the day to end the bandwidth rate limit interval.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BandwidthRateLimitInterval withEndHourOfDay(Integer endHourOfDay) {
        setEndHourOfDay(endHourOfDay);
        return this;
    }

    /**
     * <p>
     * The minute of the hour to end the bandwidth rate limit interval.
     * </p>
     * <important>
     * <p>
     * The bandwidth rate limit interval ends at the end of the minute. To end an interval at the end of an hour, use
     * the value <code>59</code>.
     * </p>
     * </important>
     * 
     * @param endMinuteOfHour
     *        The minute of the hour to end the bandwidth rate limit interval. </p> <important>
     *        <p>
     *        The bandwidth rate limit interval ends at the end of the minute. To end an interval at the end of an hour,
     *        use the value <code>59</code>.
     *        </p>
     */

    public void setEndMinuteOfHour(Integer endMinuteOfHour) {
        this.endMinuteOfHour = endMinuteOfHour;
    }

    /**
     * <p>
     * The minute of the hour to end the bandwidth rate limit interval.
     * </p>
     * <important>
     * <p>
     * The bandwidth rate limit interval ends at the end of the minute. To end an interval at the end of an hour, use
     * the value <code>59</code>.
     * </p>
     * </important>
     * 
     * @return The minute of the hour to end the bandwidth rate limit interval. </p> <important>
     *         <p>
     *         The bandwidth rate limit interval ends at the end of the minute. To end an interval at the end of an
     *         hour, use the value <code>59</code>.
     *         </p>
     */

    public Integer getEndMinuteOfHour() {
        return this.endMinuteOfHour;
    }

    /**
     * <p>
     * The minute of the hour to end the bandwidth rate limit interval.
     * </p>
     * <important>
     * <p>
     * The bandwidth rate limit interval ends at the end of the minute. To end an interval at the end of an hour, use
     * the value <code>59</code>.
     * </p>
     * </important>
     * 
     * @param endMinuteOfHour
     *        The minute of the hour to end the bandwidth rate limit interval. </p> <important>
     *        <p>
     *        The bandwidth rate limit interval ends at the end of the minute. To end an interval at the end of an hour,
     *        use the value <code>59</code>.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BandwidthRateLimitInterval withEndMinuteOfHour(Integer endMinuteOfHour) {
        setEndMinuteOfHour(endMinuteOfHour);
        return this;
    }

    /**
     * <p>
     * The days of the week component of the bandwidth rate limit interval, represented as ordinal numbers from 0 to 6,
     * where 0 represents Sunday and 6 represents Saturday.
     * </p>
     * 
     * @return The days of the week component of the bandwidth rate limit interval, represented as ordinal numbers from
     *         0 to 6, where 0 represents Sunday and 6 represents Saturday.
     */

    public java.util.List<Integer> getDaysOfWeek() {
        if (daysOfWeek == null) {
            daysOfWeek = new com.amazonaws.internal.SdkInternalList<Integer>();
        }
        return daysOfWeek;
    }

    /**
     * <p>
     * The days of the week component of the bandwidth rate limit interval, represented as ordinal numbers from 0 to 6,
     * where 0 represents Sunday and 6 represents Saturday.
     * </p>
     * 
     * @param daysOfWeek
     *        The days of the week component of the bandwidth rate limit interval, represented as ordinal numbers from 0
     *        to 6, where 0 represents Sunday and 6 represents Saturday.
     */

    public void setDaysOfWeek(java.util.Collection<Integer> daysOfWeek) {
        if (daysOfWeek == null) {
            this.daysOfWeek = null;
            return;
        }

        this.daysOfWeek = new com.amazonaws.internal.SdkInternalList<Integer>(daysOfWeek);
    }

    /**
     * <p>
     * The days of the week component of the bandwidth rate limit interval, represented as ordinal numbers from 0 to 6,
     * where 0 represents Sunday and 6 represents Saturday.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDaysOfWeek(java.util.Collection)} or {@link #withDaysOfWeek(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param daysOfWeek
     *        The days of the week component of the bandwidth rate limit interval, represented as ordinal numbers from 0
     *        to 6, where 0 represents Sunday and 6 represents Saturday.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BandwidthRateLimitInterval withDaysOfWeek(Integer... daysOfWeek) {
        if (this.daysOfWeek == null) {
            setDaysOfWeek(new com.amazonaws.internal.SdkInternalList<Integer>(daysOfWeek.length));
        }
        for (Integer ele : daysOfWeek) {
            this.daysOfWeek.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The days of the week component of the bandwidth rate limit interval, represented as ordinal numbers from 0 to 6,
     * where 0 represents Sunday and 6 represents Saturday.
     * </p>
     * 
     * @param daysOfWeek
     *        The days of the week component of the bandwidth rate limit interval, represented as ordinal numbers from 0
     *        to 6, where 0 represents Sunday and 6 represents Saturday.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BandwidthRateLimitInterval withDaysOfWeek(java.util.Collection<Integer> daysOfWeek) {
        setDaysOfWeek(daysOfWeek);
        return this;
    }

    /**
     * <p>
     * The average upload rate limit component of the bandwidth rate limit interval, in bits per second. This field does
     * not appear in the response if the upload rate limit is not set.
     * </p>
     * 
     * @param averageUploadRateLimitInBitsPerSec
     *        The average upload rate limit component of the bandwidth rate limit interval, in bits per second. This
     *        field does not appear in the response if the upload rate limit is not set.
     */

    public void setAverageUploadRateLimitInBitsPerSec(Long averageUploadRateLimitInBitsPerSec) {
        this.averageUploadRateLimitInBitsPerSec = averageUploadRateLimitInBitsPerSec;
    }

    /**
     * <p>
     * The average upload rate limit component of the bandwidth rate limit interval, in bits per second. This field does
     * not appear in the response if the upload rate limit is not set.
     * </p>
     * 
     * @return The average upload rate limit component of the bandwidth rate limit interval, in bits per second. This
     *         field does not appear in the response if the upload rate limit is not set.
     */

    public Long getAverageUploadRateLimitInBitsPerSec() {
        return this.averageUploadRateLimitInBitsPerSec;
    }

    /**
     * <p>
     * The average upload rate limit component of the bandwidth rate limit interval, in bits per second. This field does
     * not appear in the response if the upload rate limit is not set.
     * </p>
     * 
     * @param averageUploadRateLimitInBitsPerSec
     *        The average upload rate limit component of the bandwidth rate limit interval, in bits per second. This
     *        field does not appear in the response if the upload rate limit is not set.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BandwidthRateLimitInterval withAverageUploadRateLimitInBitsPerSec(Long averageUploadRateLimitInBitsPerSec) {
        setAverageUploadRateLimitInBitsPerSec(averageUploadRateLimitInBitsPerSec);
        return this;
    }

    /**
     * <p>
     * The average download rate limit component of the bandwidth rate limit interval, in bits per second. This field
     * does not appear in the response if the download rate limit is not set.
     * </p>
     * 
     * @param averageDownloadRateLimitInBitsPerSec
     *        The average download rate limit component of the bandwidth rate limit interval, in bits per second. This
     *        field does not appear in the response if the download rate limit is not set.
     */

    public void setAverageDownloadRateLimitInBitsPerSec(Long averageDownloadRateLimitInBitsPerSec) {
        this.averageDownloadRateLimitInBitsPerSec = averageDownloadRateLimitInBitsPerSec;
    }

    /**
     * <p>
     * The average download rate limit component of the bandwidth rate limit interval, in bits per second. This field
     * does not appear in the response if the download rate limit is not set.
     * </p>
     * 
     * @return The average download rate limit component of the bandwidth rate limit interval, in bits per second. This
     *         field does not appear in the response if the download rate limit is not set.
     */

    public Long getAverageDownloadRateLimitInBitsPerSec() {
        return this.averageDownloadRateLimitInBitsPerSec;
    }

    /**
     * <p>
     * The average download rate limit component of the bandwidth rate limit interval, in bits per second. This field
     * does not appear in the response if the download rate limit is not set.
     * </p>
     * 
     * @param averageDownloadRateLimitInBitsPerSec
     *        The average download rate limit component of the bandwidth rate limit interval, in bits per second. This
     *        field does not appear in the response if the download rate limit is not set.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BandwidthRateLimitInterval withAverageDownloadRateLimitInBitsPerSec(Long averageDownloadRateLimitInBitsPerSec) {
        setAverageDownloadRateLimitInBitsPerSec(averageDownloadRateLimitInBitsPerSec);
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
        if (getStartHourOfDay() != null)
            sb.append("StartHourOfDay: ").append(getStartHourOfDay()).append(",");
        if (getStartMinuteOfHour() != null)
            sb.append("StartMinuteOfHour: ").append(getStartMinuteOfHour()).append(",");
        if (getEndHourOfDay() != null)
            sb.append("EndHourOfDay: ").append(getEndHourOfDay()).append(",");
        if (getEndMinuteOfHour() != null)
            sb.append("EndMinuteOfHour: ").append(getEndMinuteOfHour()).append(",");
        if (getDaysOfWeek() != null)
            sb.append("DaysOfWeek: ").append(getDaysOfWeek()).append(",");
        if (getAverageUploadRateLimitInBitsPerSec() != null)
            sb.append("AverageUploadRateLimitInBitsPerSec: ").append(getAverageUploadRateLimitInBitsPerSec()).append(",");
        if (getAverageDownloadRateLimitInBitsPerSec() != null)
            sb.append("AverageDownloadRateLimitInBitsPerSec: ").append(getAverageDownloadRateLimitInBitsPerSec());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BandwidthRateLimitInterval == false)
            return false;
        BandwidthRateLimitInterval other = (BandwidthRateLimitInterval) obj;
        if (other.getStartHourOfDay() == null ^ this.getStartHourOfDay() == null)
            return false;
        if (other.getStartHourOfDay() != null && other.getStartHourOfDay().equals(this.getStartHourOfDay()) == false)
            return false;
        if (other.getStartMinuteOfHour() == null ^ this.getStartMinuteOfHour() == null)
            return false;
        if (other.getStartMinuteOfHour() != null && other.getStartMinuteOfHour().equals(this.getStartMinuteOfHour()) == false)
            return false;
        if (other.getEndHourOfDay() == null ^ this.getEndHourOfDay() == null)
            return false;
        if (other.getEndHourOfDay() != null && other.getEndHourOfDay().equals(this.getEndHourOfDay()) == false)
            return false;
        if (other.getEndMinuteOfHour() == null ^ this.getEndMinuteOfHour() == null)
            return false;
        if (other.getEndMinuteOfHour() != null && other.getEndMinuteOfHour().equals(this.getEndMinuteOfHour()) == false)
            return false;
        if (other.getDaysOfWeek() == null ^ this.getDaysOfWeek() == null)
            return false;
        if (other.getDaysOfWeek() != null && other.getDaysOfWeek().equals(this.getDaysOfWeek()) == false)
            return false;
        if (other.getAverageUploadRateLimitInBitsPerSec() == null ^ this.getAverageUploadRateLimitInBitsPerSec() == null)
            return false;
        if (other.getAverageUploadRateLimitInBitsPerSec() != null
                && other.getAverageUploadRateLimitInBitsPerSec().equals(this.getAverageUploadRateLimitInBitsPerSec()) == false)
            return false;
        if (other.getAverageDownloadRateLimitInBitsPerSec() == null ^ this.getAverageDownloadRateLimitInBitsPerSec() == null)
            return false;
        if (other.getAverageDownloadRateLimitInBitsPerSec() != null
                && other.getAverageDownloadRateLimitInBitsPerSec().equals(this.getAverageDownloadRateLimitInBitsPerSec()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStartHourOfDay() == null) ? 0 : getStartHourOfDay().hashCode());
        hashCode = prime * hashCode + ((getStartMinuteOfHour() == null) ? 0 : getStartMinuteOfHour().hashCode());
        hashCode = prime * hashCode + ((getEndHourOfDay() == null) ? 0 : getEndHourOfDay().hashCode());
        hashCode = prime * hashCode + ((getEndMinuteOfHour() == null) ? 0 : getEndMinuteOfHour().hashCode());
        hashCode = prime * hashCode + ((getDaysOfWeek() == null) ? 0 : getDaysOfWeek().hashCode());
        hashCode = prime * hashCode + ((getAverageUploadRateLimitInBitsPerSec() == null) ? 0 : getAverageUploadRateLimitInBitsPerSec().hashCode());
        hashCode = prime * hashCode + ((getAverageDownloadRateLimitInBitsPerSec() == null) ? 0 : getAverageDownloadRateLimitInBitsPerSec().hashCode());
        return hashCode;
    }

    @Override
    public BandwidthRateLimitInterval clone() {
        try {
            return (BandwidthRateLimitInterval) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.storagegateway.model.transform.BandwidthRateLimitIntervalMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
