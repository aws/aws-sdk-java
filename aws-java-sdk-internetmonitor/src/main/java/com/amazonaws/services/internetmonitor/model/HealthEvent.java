/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.internetmonitor.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about a health event created in a monitor in Amazon CloudWatch Internet Monitor.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/internetmonitor-2021-06-03/HealthEvent" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class HealthEvent implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the event.
     * </p>
     */
    private String eventArn;
    /**
     * <p>
     * The internally-generated identifier of a specific network traffic impairment health event.
     * </p>
     */
    private String eventId;
    /**
     * <p>
     * When a health event started.
     * </p>
     */
    private java.util.Date startedAt;
    /**
     * <p>
     * The time when a health event ended. If the health event is still active, then the end time is not set.
     * </p>
     */
    private java.util.Date endedAt;
    /**
     * <p>
     * When the health event was created.
     * </p>
     */
    private java.util.Date createdAt;
    /**
     * <p>
     * When the health event was last updated.
     * </p>
     */
    private java.util.Date lastUpdatedAt;
    /**
     * <p>
     * The locations impacted by the health event.
     * </p>
     */
    private java.util.List<ImpactedLocation> impactedLocations;
    /**
     * <p>
     * The status of a health event.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The impact on total traffic that a health event has, in increased latency or reduced availability. This is the
     * percentage of how much latency has increased or availability has decreased during the event, compared to what is
     * typical for traffic from this client location to the Amazon Web Services location using this client network.
     * </p>
     */
    private Double percentOfTotalTrafficImpacted;
    /**
     * <p>
     * The type of impairment for a health event.
     * </p>
     */
    private String impactType;
    /**
     * <p>
     * The value of the threshold percentage for performance or availability that was configured when Amazon CloudWatch
     * Internet Monitor created the health event.
     * </p>
     */
    private Double healthScoreThreshold;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the event.
     * </p>
     * 
     * @param eventArn
     *        The Amazon Resource Name (ARN) of the event.
     */

    public void setEventArn(String eventArn) {
        this.eventArn = eventArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the event.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the event.
     */

    public String getEventArn() {
        return this.eventArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the event.
     * </p>
     * 
     * @param eventArn
     *        The Amazon Resource Name (ARN) of the event.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HealthEvent withEventArn(String eventArn) {
        setEventArn(eventArn);
        return this;
    }

    /**
     * <p>
     * The internally-generated identifier of a specific network traffic impairment health event.
     * </p>
     * 
     * @param eventId
     *        The internally-generated identifier of a specific network traffic impairment health event.
     */

    public void setEventId(String eventId) {
        this.eventId = eventId;
    }

    /**
     * <p>
     * The internally-generated identifier of a specific network traffic impairment health event.
     * </p>
     * 
     * @return The internally-generated identifier of a specific network traffic impairment health event.
     */

    public String getEventId() {
        return this.eventId;
    }

    /**
     * <p>
     * The internally-generated identifier of a specific network traffic impairment health event.
     * </p>
     * 
     * @param eventId
     *        The internally-generated identifier of a specific network traffic impairment health event.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HealthEvent withEventId(String eventId) {
        setEventId(eventId);
        return this;
    }

    /**
     * <p>
     * When a health event started.
     * </p>
     * 
     * @param startedAt
     *        When a health event started.
     */

    public void setStartedAt(java.util.Date startedAt) {
        this.startedAt = startedAt;
    }

    /**
     * <p>
     * When a health event started.
     * </p>
     * 
     * @return When a health event started.
     */

    public java.util.Date getStartedAt() {
        return this.startedAt;
    }

    /**
     * <p>
     * When a health event started.
     * </p>
     * 
     * @param startedAt
     *        When a health event started.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HealthEvent withStartedAt(java.util.Date startedAt) {
        setStartedAt(startedAt);
        return this;
    }

    /**
     * <p>
     * The time when a health event ended. If the health event is still active, then the end time is not set.
     * </p>
     * 
     * @param endedAt
     *        The time when a health event ended. If the health event is still active, then the end time is not set.
     */

    public void setEndedAt(java.util.Date endedAt) {
        this.endedAt = endedAt;
    }

    /**
     * <p>
     * The time when a health event ended. If the health event is still active, then the end time is not set.
     * </p>
     * 
     * @return The time when a health event ended. If the health event is still active, then the end time is not set.
     */

    public java.util.Date getEndedAt() {
        return this.endedAt;
    }

    /**
     * <p>
     * The time when a health event ended. If the health event is still active, then the end time is not set.
     * </p>
     * 
     * @param endedAt
     *        The time when a health event ended. If the health event is still active, then the end time is not set.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HealthEvent withEndedAt(java.util.Date endedAt) {
        setEndedAt(endedAt);
        return this;
    }

    /**
     * <p>
     * When the health event was created.
     * </p>
     * 
     * @param createdAt
     *        When the health event was created.
     */

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * When the health event was created.
     * </p>
     * 
     * @return When the health event was created.
     */

    public java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    /**
     * <p>
     * When the health event was created.
     * </p>
     * 
     * @param createdAt
     *        When the health event was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HealthEvent withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
        return this;
    }

    /**
     * <p>
     * When the health event was last updated.
     * </p>
     * 
     * @param lastUpdatedAt
     *        When the health event was last updated.
     */

    public void setLastUpdatedAt(java.util.Date lastUpdatedAt) {
        this.lastUpdatedAt = lastUpdatedAt;
    }

    /**
     * <p>
     * When the health event was last updated.
     * </p>
     * 
     * @return When the health event was last updated.
     */

    public java.util.Date getLastUpdatedAt() {
        return this.lastUpdatedAt;
    }

    /**
     * <p>
     * When the health event was last updated.
     * </p>
     * 
     * @param lastUpdatedAt
     *        When the health event was last updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HealthEvent withLastUpdatedAt(java.util.Date lastUpdatedAt) {
        setLastUpdatedAt(lastUpdatedAt);
        return this;
    }

    /**
     * <p>
     * The locations impacted by the health event.
     * </p>
     * 
     * @return The locations impacted by the health event.
     */

    public java.util.List<ImpactedLocation> getImpactedLocations() {
        return impactedLocations;
    }

    /**
     * <p>
     * The locations impacted by the health event.
     * </p>
     * 
     * @param impactedLocations
     *        The locations impacted by the health event.
     */

    public void setImpactedLocations(java.util.Collection<ImpactedLocation> impactedLocations) {
        if (impactedLocations == null) {
            this.impactedLocations = null;
            return;
        }

        this.impactedLocations = new java.util.ArrayList<ImpactedLocation>(impactedLocations);
    }

    /**
     * <p>
     * The locations impacted by the health event.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setImpactedLocations(java.util.Collection)} or {@link #withImpactedLocations(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param impactedLocations
     *        The locations impacted by the health event.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HealthEvent withImpactedLocations(ImpactedLocation... impactedLocations) {
        if (this.impactedLocations == null) {
            setImpactedLocations(new java.util.ArrayList<ImpactedLocation>(impactedLocations.length));
        }
        for (ImpactedLocation ele : impactedLocations) {
            this.impactedLocations.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The locations impacted by the health event.
     * </p>
     * 
     * @param impactedLocations
     *        The locations impacted by the health event.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HealthEvent withImpactedLocations(java.util.Collection<ImpactedLocation> impactedLocations) {
        setImpactedLocations(impactedLocations);
        return this;
    }

    /**
     * <p>
     * The status of a health event.
     * </p>
     * 
     * @param status
     *        The status of a health event.
     * @see HealthEventStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of a health event.
     * </p>
     * 
     * @return The status of a health event.
     * @see HealthEventStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of a health event.
     * </p>
     * 
     * @param status
     *        The status of a health event.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see HealthEventStatus
     */

    public HealthEvent withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of a health event.
     * </p>
     * 
     * @param status
     *        The status of a health event.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see HealthEventStatus
     */

    public HealthEvent withStatus(HealthEventStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The impact on total traffic that a health event has, in increased latency or reduced availability. This is the
     * percentage of how much latency has increased or availability has decreased during the event, compared to what is
     * typical for traffic from this client location to the Amazon Web Services location using this client network.
     * </p>
     * 
     * @param percentOfTotalTrafficImpacted
     *        The impact on total traffic that a health event has, in increased latency or reduced availability. This is
     *        the percentage of how much latency has increased or availability has decreased during the event, compared
     *        to what is typical for traffic from this client location to the Amazon Web Services location using this
     *        client network.
     */

    public void setPercentOfTotalTrafficImpacted(Double percentOfTotalTrafficImpacted) {
        this.percentOfTotalTrafficImpacted = percentOfTotalTrafficImpacted;
    }

    /**
     * <p>
     * The impact on total traffic that a health event has, in increased latency or reduced availability. This is the
     * percentage of how much latency has increased or availability has decreased during the event, compared to what is
     * typical for traffic from this client location to the Amazon Web Services location using this client network.
     * </p>
     * 
     * @return The impact on total traffic that a health event has, in increased latency or reduced availability. This
     *         is the percentage of how much latency has increased or availability has decreased during the event,
     *         compared to what is typical for traffic from this client location to the Amazon Web Services location
     *         using this client network.
     */

    public Double getPercentOfTotalTrafficImpacted() {
        return this.percentOfTotalTrafficImpacted;
    }

    /**
     * <p>
     * The impact on total traffic that a health event has, in increased latency or reduced availability. This is the
     * percentage of how much latency has increased or availability has decreased during the event, compared to what is
     * typical for traffic from this client location to the Amazon Web Services location using this client network.
     * </p>
     * 
     * @param percentOfTotalTrafficImpacted
     *        The impact on total traffic that a health event has, in increased latency or reduced availability. This is
     *        the percentage of how much latency has increased or availability has decreased during the event, compared
     *        to what is typical for traffic from this client location to the Amazon Web Services location using this
     *        client network.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HealthEvent withPercentOfTotalTrafficImpacted(Double percentOfTotalTrafficImpacted) {
        setPercentOfTotalTrafficImpacted(percentOfTotalTrafficImpacted);
        return this;
    }

    /**
     * <p>
     * The type of impairment for a health event.
     * </p>
     * 
     * @param impactType
     *        The type of impairment for a health event.
     * @see HealthEventImpactType
     */

    public void setImpactType(String impactType) {
        this.impactType = impactType;
    }

    /**
     * <p>
     * The type of impairment for a health event.
     * </p>
     * 
     * @return The type of impairment for a health event.
     * @see HealthEventImpactType
     */

    public String getImpactType() {
        return this.impactType;
    }

    /**
     * <p>
     * The type of impairment for a health event.
     * </p>
     * 
     * @param impactType
     *        The type of impairment for a health event.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see HealthEventImpactType
     */

    public HealthEvent withImpactType(String impactType) {
        setImpactType(impactType);
        return this;
    }

    /**
     * <p>
     * The type of impairment for a health event.
     * </p>
     * 
     * @param impactType
     *        The type of impairment for a health event.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see HealthEventImpactType
     */

    public HealthEvent withImpactType(HealthEventImpactType impactType) {
        this.impactType = impactType.toString();
        return this;
    }

    /**
     * <p>
     * The value of the threshold percentage for performance or availability that was configured when Amazon CloudWatch
     * Internet Monitor created the health event.
     * </p>
     * 
     * @param healthScoreThreshold
     *        The value of the threshold percentage for performance or availability that was configured when Amazon
     *        CloudWatch Internet Monitor created the health event.
     */

    public void setHealthScoreThreshold(Double healthScoreThreshold) {
        this.healthScoreThreshold = healthScoreThreshold;
    }

    /**
     * <p>
     * The value of the threshold percentage for performance or availability that was configured when Amazon CloudWatch
     * Internet Monitor created the health event.
     * </p>
     * 
     * @return The value of the threshold percentage for performance or availability that was configured when Amazon
     *         CloudWatch Internet Monitor created the health event.
     */

    public Double getHealthScoreThreshold() {
        return this.healthScoreThreshold;
    }

    /**
     * <p>
     * The value of the threshold percentage for performance or availability that was configured when Amazon CloudWatch
     * Internet Monitor created the health event.
     * </p>
     * 
     * @param healthScoreThreshold
     *        The value of the threshold percentage for performance or availability that was configured when Amazon
     *        CloudWatch Internet Monitor created the health event.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HealthEvent withHealthScoreThreshold(Double healthScoreThreshold) {
        setHealthScoreThreshold(healthScoreThreshold);
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
        if (getEventArn() != null)
            sb.append("EventArn: ").append(getEventArn()).append(",");
        if (getEventId() != null)
            sb.append("EventId: ").append(getEventId()).append(",");
        if (getStartedAt() != null)
            sb.append("StartedAt: ").append(getStartedAt()).append(",");
        if (getEndedAt() != null)
            sb.append("EndedAt: ").append(getEndedAt()).append(",");
        if (getCreatedAt() != null)
            sb.append("CreatedAt: ").append(getCreatedAt()).append(",");
        if (getLastUpdatedAt() != null)
            sb.append("LastUpdatedAt: ").append(getLastUpdatedAt()).append(",");
        if (getImpactedLocations() != null)
            sb.append("ImpactedLocations: ").append(getImpactedLocations()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getPercentOfTotalTrafficImpacted() != null)
            sb.append("PercentOfTotalTrafficImpacted: ").append(getPercentOfTotalTrafficImpacted()).append(",");
        if (getImpactType() != null)
            sb.append("ImpactType: ").append(getImpactType()).append(",");
        if (getHealthScoreThreshold() != null)
            sb.append("HealthScoreThreshold: ").append(getHealthScoreThreshold());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof HealthEvent == false)
            return false;
        HealthEvent other = (HealthEvent) obj;
        if (other.getEventArn() == null ^ this.getEventArn() == null)
            return false;
        if (other.getEventArn() != null && other.getEventArn().equals(this.getEventArn()) == false)
            return false;
        if (other.getEventId() == null ^ this.getEventId() == null)
            return false;
        if (other.getEventId() != null && other.getEventId().equals(this.getEventId()) == false)
            return false;
        if (other.getStartedAt() == null ^ this.getStartedAt() == null)
            return false;
        if (other.getStartedAt() != null && other.getStartedAt().equals(this.getStartedAt()) == false)
            return false;
        if (other.getEndedAt() == null ^ this.getEndedAt() == null)
            return false;
        if (other.getEndedAt() != null && other.getEndedAt().equals(this.getEndedAt()) == false)
            return false;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        if (other.getLastUpdatedAt() == null ^ this.getLastUpdatedAt() == null)
            return false;
        if (other.getLastUpdatedAt() != null && other.getLastUpdatedAt().equals(this.getLastUpdatedAt()) == false)
            return false;
        if (other.getImpactedLocations() == null ^ this.getImpactedLocations() == null)
            return false;
        if (other.getImpactedLocations() != null && other.getImpactedLocations().equals(this.getImpactedLocations()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getPercentOfTotalTrafficImpacted() == null ^ this.getPercentOfTotalTrafficImpacted() == null)
            return false;
        if (other.getPercentOfTotalTrafficImpacted() != null
                && other.getPercentOfTotalTrafficImpacted().equals(this.getPercentOfTotalTrafficImpacted()) == false)
            return false;
        if (other.getImpactType() == null ^ this.getImpactType() == null)
            return false;
        if (other.getImpactType() != null && other.getImpactType().equals(this.getImpactType()) == false)
            return false;
        if (other.getHealthScoreThreshold() == null ^ this.getHealthScoreThreshold() == null)
            return false;
        if (other.getHealthScoreThreshold() != null && other.getHealthScoreThreshold().equals(this.getHealthScoreThreshold()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEventArn() == null) ? 0 : getEventArn().hashCode());
        hashCode = prime * hashCode + ((getEventId() == null) ? 0 : getEventId().hashCode());
        hashCode = prime * hashCode + ((getStartedAt() == null) ? 0 : getStartedAt().hashCode());
        hashCode = prime * hashCode + ((getEndedAt() == null) ? 0 : getEndedAt().hashCode());
        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getLastUpdatedAt() == null) ? 0 : getLastUpdatedAt().hashCode());
        hashCode = prime * hashCode + ((getImpactedLocations() == null) ? 0 : getImpactedLocations().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getPercentOfTotalTrafficImpacted() == null) ? 0 : getPercentOfTotalTrafficImpacted().hashCode());
        hashCode = prime * hashCode + ((getImpactType() == null) ? 0 : getImpactType().hashCode());
        hashCode = prime * hashCode + ((getHealthScoreThreshold() == null) ? 0 : getHealthScoreThreshold().hashCode());
        return hashCode;
    }

    @Override
    public HealthEvent clone() {
        try {
            return (HealthEvent) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.internetmonitor.model.transform.HealthEventMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
