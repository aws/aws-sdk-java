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
package com.amazonaws.services.frauddetector.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Data about the stored events.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/frauddetector-2019-11-15/IngestedEventStatistics"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class IngestedEventStatistics implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The number of stored events.
     * </p>
     */
    private Long numberOfEvents;
    /**
     * <p>
     * The total size of the stored events.
     * </p>
     */
    private Long eventDataSizeInBytes;
    /**
     * <p>
     * The oldest stored event.
     * </p>
     */
    private String leastRecentEvent;
    /**
     * <p>
     * The newest stored event.
     * </p>
     */
    private String mostRecentEvent;
    /**
     * <p>
     * Timestamp of when the stored event was last updated.
     * </p>
     */
    private String lastUpdatedTime;

    /**
     * <p>
     * The number of stored events.
     * </p>
     * 
     * @param numberOfEvents
     *        The number of stored events.
     */

    public void setNumberOfEvents(Long numberOfEvents) {
        this.numberOfEvents = numberOfEvents;
    }

    /**
     * <p>
     * The number of stored events.
     * </p>
     * 
     * @return The number of stored events.
     */

    public Long getNumberOfEvents() {
        return this.numberOfEvents;
    }

    /**
     * <p>
     * The number of stored events.
     * </p>
     * 
     * @param numberOfEvents
     *        The number of stored events.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IngestedEventStatistics withNumberOfEvents(Long numberOfEvents) {
        setNumberOfEvents(numberOfEvents);
        return this;
    }

    /**
     * <p>
     * The total size of the stored events.
     * </p>
     * 
     * @param eventDataSizeInBytes
     *        The total size of the stored events.
     */

    public void setEventDataSizeInBytes(Long eventDataSizeInBytes) {
        this.eventDataSizeInBytes = eventDataSizeInBytes;
    }

    /**
     * <p>
     * The total size of the stored events.
     * </p>
     * 
     * @return The total size of the stored events.
     */

    public Long getEventDataSizeInBytes() {
        return this.eventDataSizeInBytes;
    }

    /**
     * <p>
     * The total size of the stored events.
     * </p>
     * 
     * @param eventDataSizeInBytes
     *        The total size of the stored events.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IngestedEventStatistics withEventDataSizeInBytes(Long eventDataSizeInBytes) {
        setEventDataSizeInBytes(eventDataSizeInBytes);
        return this;
    }

    /**
     * <p>
     * The oldest stored event.
     * </p>
     * 
     * @param leastRecentEvent
     *        The oldest stored event.
     */

    public void setLeastRecentEvent(String leastRecentEvent) {
        this.leastRecentEvent = leastRecentEvent;
    }

    /**
     * <p>
     * The oldest stored event.
     * </p>
     * 
     * @return The oldest stored event.
     */

    public String getLeastRecentEvent() {
        return this.leastRecentEvent;
    }

    /**
     * <p>
     * The oldest stored event.
     * </p>
     * 
     * @param leastRecentEvent
     *        The oldest stored event.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IngestedEventStatistics withLeastRecentEvent(String leastRecentEvent) {
        setLeastRecentEvent(leastRecentEvent);
        return this;
    }

    /**
     * <p>
     * The newest stored event.
     * </p>
     * 
     * @param mostRecentEvent
     *        The newest stored event.
     */

    public void setMostRecentEvent(String mostRecentEvent) {
        this.mostRecentEvent = mostRecentEvent;
    }

    /**
     * <p>
     * The newest stored event.
     * </p>
     * 
     * @return The newest stored event.
     */

    public String getMostRecentEvent() {
        return this.mostRecentEvent;
    }

    /**
     * <p>
     * The newest stored event.
     * </p>
     * 
     * @param mostRecentEvent
     *        The newest stored event.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IngestedEventStatistics withMostRecentEvent(String mostRecentEvent) {
        setMostRecentEvent(mostRecentEvent);
        return this;
    }

    /**
     * <p>
     * Timestamp of when the stored event was last updated.
     * </p>
     * 
     * @param lastUpdatedTime
     *        Timestamp of when the stored event was last updated.
     */

    public void setLastUpdatedTime(String lastUpdatedTime) {
        this.lastUpdatedTime = lastUpdatedTime;
    }

    /**
     * <p>
     * Timestamp of when the stored event was last updated.
     * </p>
     * 
     * @return Timestamp of when the stored event was last updated.
     */

    public String getLastUpdatedTime() {
        return this.lastUpdatedTime;
    }

    /**
     * <p>
     * Timestamp of when the stored event was last updated.
     * </p>
     * 
     * @param lastUpdatedTime
     *        Timestamp of when the stored event was last updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IngestedEventStatistics withLastUpdatedTime(String lastUpdatedTime) {
        setLastUpdatedTime(lastUpdatedTime);
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
        if (getNumberOfEvents() != null)
            sb.append("NumberOfEvents: ").append(getNumberOfEvents()).append(",");
        if (getEventDataSizeInBytes() != null)
            sb.append("EventDataSizeInBytes: ").append(getEventDataSizeInBytes()).append(",");
        if (getLeastRecentEvent() != null)
            sb.append("LeastRecentEvent: ").append(getLeastRecentEvent()).append(",");
        if (getMostRecentEvent() != null)
            sb.append("MostRecentEvent: ").append(getMostRecentEvent()).append(",");
        if (getLastUpdatedTime() != null)
            sb.append("LastUpdatedTime: ").append(getLastUpdatedTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof IngestedEventStatistics == false)
            return false;
        IngestedEventStatistics other = (IngestedEventStatistics) obj;
        if (other.getNumberOfEvents() == null ^ this.getNumberOfEvents() == null)
            return false;
        if (other.getNumberOfEvents() != null && other.getNumberOfEvents().equals(this.getNumberOfEvents()) == false)
            return false;
        if (other.getEventDataSizeInBytes() == null ^ this.getEventDataSizeInBytes() == null)
            return false;
        if (other.getEventDataSizeInBytes() != null && other.getEventDataSizeInBytes().equals(this.getEventDataSizeInBytes()) == false)
            return false;
        if (other.getLeastRecentEvent() == null ^ this.getLeastRecentEvent() == null)
            return false;
        if (other.getLeastRecentEvent() != null && other.getLeastRecentEvent().equals(this.getLeastRecentEvent()) == false)
            return false;
        if (other.getMostRecentEvent() == null ^ this.getMostRecentEvent() == null)
            return false;
        if (other.getMostRecentEvent() != null && other.getMostRecentEvent().equals(this.getMostRecentEvent()) == false)
            return false;
        if (other.getLastUpdatedTime() == null ^ this.getLastUpdatedTime() == null)
            return false;
        if (other.getLastUpdatedTime() != null && other.getLastUpdatedTime().equals(this.getLastUpdatedTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNumberOfEvents() == null) ? 0 : getNumberOfEvents().hashCode());
        hashCode = prime * hashCode + ((getEventDataSizeInBytes() == null) ? 0 : getEventDataSizeInBytes().hashCode());
        hashCode = prime * hashCode + ((getLeastRecentEvent() == null) ? 0 : getLeastRecentEvent().hashCode());
        hashCode = prime * hashCode + ((getMostRecentEvent() == null) ? 0 : getMostRecentEvent().hashCode());
        hashCode = prime * hashCode + ((getLastUpdatedTime() == null) ? 0 : getLastUpdatedTime().hashCode());
        return hashCode;
    }

    @Override
    public IngestedEventStatistics clone() {
        try {
            return (IngestedEventStatistics) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.frauddetector.model.transform.IngestedEventStatisticsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
