/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.mediatailor.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A complex type that contains settings that determine how and when that MediaTailor places prefetched ads into
 * upcoming ad breaks.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediatailor-2018-04-23/PrefetchConsumption" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PrefetchConsumption implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * If you only want MediaTailor to insert prefetched ads into avails (ad breaks) that match specific dynamic
     * variables, such as <code>scte.event_id</code>, set the avail matching criteria.
     * </p>
     */
    private java.util.List<AvailMatchingCriteria> availMatchingCriteria;
    /**
     * <p>
     * The time when MediaTailor no longer considers the prefetched ads for use in an ad break. MediaTailor
     * automatically deletes prefetch schedules no less than seven days after the end time. If you'd like to manually
     * delete the prefetch schedule, you can call <code>DeletePrefetchSchedule</code>.
     * </p>
     */
    private java.util.Date endTime;
    /**
     * <p>
     * The time when prefetched ads are considered for use in an ad break. If you don't specify <code>StartTime</code>,
     * the prefetched ads are available after MediaTailor retrives them from the ad decision server.
     * </p>
     */
    private java.util.Date startTime;

    /**
     * <p>
     * If you only want MediaTailor to insert prefetched ads into avails (ad breaks) that match specific dynamic
     * variables, such as <code>scte.event_id</code>, set the avail matching criteria.
     * </p>
     * 
     * @return If you only want MediaTailor to insert prefetched ads into avails (ad breaks) that match specific dynamic
     *         variables, such as <code>scte.event_id</code>, set the avail matching criteria.
     */

    public java.util.List<AvailMatchingCriteria> getAvailMatchingCriteria() {
        return availMatchingCriteria;
    }

    /**
     * <p>
     * If you only want MediaTailor to insert prefetched ads into avails (ad breaks) that match specific dynamic
     * variables, such as <code>scte.event_id</code>, set the avail matching criteria.
     * </p>
     * 
     * @param availMatchingCriteria
     *        If you only want MediaTailor to insert prefetched ads into avails (ad breaks) that match specific dynamic
     *        variables, such as <code>scte.event_id</code>, set the avail matching criteria.
     */

    public void setAvailMatchingCriteria(java.util.Collection<AvailMatchingCriteria> availMatchingCriteria) {
        if (availMatchingCriteria == null) {
            this.availMatchingCriteria = null;
            return;
        }

        this.availMatchingCriteria = new java.util.ArrayList<AvailMatchingCriteria>(availMatchingCriteria);
    }

    /**
     * <p>
     * If you only want MediaTailor to insert prefetched ads into avails (ad breaks) that match specific dynamic
     * variables, such as <code>scte.event_id</code>, set the avail matching criteria.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAvailMatchingCriteria(java.util.Collection)} or
     * {@link #withAvailMatchingCriteria(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param availMatchingCriteria
     *        If you only want MediaTailor to insert prefetched ads into avails (ad breaks) that match specific dynamic
     *        variables, such as <code>scte.event_id</code>, set the avail matching criteria.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PrefetchConsumption withAvailMatchingCriteria(AvailMatchingCriteria... availMatchingCriteria) {
        if (this.availMatchingCriteria == null) {
            setAvailMatchingCriteria(new java.util.ArrayList<AvailMatchingCriteria>(availMatchingCriteria.length));
        }
        for (AvailMatchingCriteria ele : availMatchingCriteria) {
            this.availMatchingCriteria.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * If you only want MediaTailor to insert prefetched ads into avails (ad breaks) that match specific dynamic
     * variables, such as <code>scte.event_id</code>, set the avail matching criteria.
     * </p>
     * 
     * @param availMatchingCriteria
     *        If you only want MediaTailor to insert prefetched ads into avails (ad breaks) that match specific dynamic
     *        variables, such as <code>scte.event_id</code>, set the avail matching criteria.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PrefetchConsumption withAvailMatchingCriteria(java.util.Collection<AvailMatchingCriteria> availMatchingCriteria) {
        setAvailMatchingCriteria(availMatchingCriteria);
        return this;
    }

    /**
     * <p>
     * The time when MediaTailor no longer considers the prefetched ads for use in an ad break. MediaTailor
     * automatically deletes prefetch schedules no less than seven days after the end time. If you'd like to manually
     * delete the prefetch schedule, you can call <code>DeletePrefetchSchedule</code>.
     * </p>
     * 
     * @param endTime
     *        The time when MediaTailor no longer considers the prefetched ads for use in an ad break. MediaTailor
     *        automatically deletes prefetch schedules no less than seven days after the end time. If you'd like to
     *        manually delete the prefetch schedule, you can call <code>DeletePrefetchSchedule</code>.
     */

    public void setEndTime(java.util.Date endTime) {
        this.endTime = endTime;
    }

    /**
     * <p>
     * The time when MediaTailor no longer considers the prefetched ads for use in an ad break. MediaTailor
     * automatically deletes prefetch schedules no less than seven days after the end time. If you'd like to manually
     * delete the prefetch schedule, you can call <code>DeletePrefetchSchedule</code>.
     * </p>
     * 
     * @return The time when MediaTailor no longer considers the prefetched ads for use in an ad break. MediaTailor
     *         automatically deletes prefetch schedules no less than seven days after the end time. If you'd like to
     *         manually delete the prefetch schedule, you can call <code>DeletePrefetchSchedule</code>.
     */

    public java.util.Date getEndTime() {
        return this.endTime;
    }

    /**
     * <p>
     * The time when MediaTailor no longer considers the prefetched ads for use in an ad break. MediaTailor
     * automatically deletes prefetch schedules no less than seven days after the end time. If you'd like to manually
     * delete the prefetch schedule, you can call <code>DeletePrefetchSchedule</code>.
     * </p>
     * 
     * @param endTime
     *        The time when MediaTailor no longer considers the prefetched ads for use in an ad break. MediaTailor
     *        automatically deletes prefetch schedules no less than seven days after the end time. If you'd like to
     *        manually delete the prefetch schedule, you can call <code>DeletePrefetchSchedule</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PrefetchConsumption withEndTime(java.util.Date endTime) {
        setEndTime(endTime);
        return this;
    }

    /**
     * <p>
     * The time when prefetched ads are considered for use in an ad break. If you don't specify <code>StartTime</code>,
     * the prefetched ads are available after MediaTailor retrives them from the ad decision server.
     * </p>
     * 
     * @param startTime
     *        The time when prefetched ads are considered for use in an ad break. If you don't specify
     *        <code>StartTime</code>, the prefetched ads are available after MediaTailor retrives them from the ad
     *        decision server.
     */

    public void setStartTime(java.util.Date startTime) {
        this.startTime = startTime;
    }

    /**
     * <p>
     * The time when prefetched ads are considered for use in an ad break. If you don't specify <code>StartTime</code>,
     * the prefetched ads are available after MediaTailor retrives them from the ad decision server.
     * </p>
     * 
     * @return The time when prefetched ads are considered for use in an ad break. If you don't specify
     *         <code>StartTime</code>, the prefetched ads are available after MediaTailor retrives them from the ad
     *         decision server.
     */

    public java.util.Date getStartTime() {
        return this.startTime;
    }

    /**
     * <p>
     * The time when prefetched ads are considered for use in an ad break. If you don't specify <code>StartTime</code>,
     * the prefetched ads are available after MediaTailor retrives them from the ad decision server.
     * </p>
     * 
     * @param startTime
     *        The time when prefetched ads are considered for use in an ad break. If you don't specify
     *        <code>StartTime</code>, the prefetched ads are available after MediaTailor retrives them from the ad
     *        decision server.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PrefetchConsumption withStartTime(java.util.Date startTime) {
        setStartTime(startTime);
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
        if (getAvailMatchingCriteria() != null)
            sb.append("AvailMatchingCriteria: ").append(getAvailMatchingCriteria()).append(",");
        if (getEndTime() != null)
            sb.append("EndTime: ").append(getEndTime()).append(",");
        if (getStartTime() != null)
            sb.append("StartTime: ").append(getStartTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PrefetchConsumption == false)
            return false;
        PrefetchConsumption other = (PrefetchConsumption) obj;
        if (other.getAvailMatchingCriteria() == null ^ this.getAvailMatchingCriteria() == null)
            return false;
        if (other.getAvailMatchingCriteria() != null && other.getAvailMatchingCriteria().equals(this.getAvailMatchingCriteria()) == false)
            return false;
        if (other.getEndTime() == null ^ this.getEndTime() == null)
            return false;
        if (other.getEndTime() != null && other.getEndTime().equals(this.getEndTime()) == false)
            return false;
        if (other.getStartTime() == null ^ this.getStartTime() == null)
            return false;
        if (other.getStartTime() != null && other.getStartTime().equals(this.getStartTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAvailMatchingCriteria() == null) ? 0 : getAvailMatchingCriteria().hashCode());
        hashCode = prime * hashCode + ((getEndTime() == null) ? 0 : getEndTime().hashCode());
        hashCode = prime * hashCode + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        return hashCode;
    }

    @Override
    public PrefetchConsumption clone() {
        try {
            return (PrefetchConsumption) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mediatailor.model.transform.PrefetchConsumptionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
