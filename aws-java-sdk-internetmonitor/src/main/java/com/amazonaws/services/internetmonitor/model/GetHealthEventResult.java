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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/internetmonitor-2021-06-03/GetHealthEvent" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetHealthEventResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the event.
     * </p>
     */
    private String eventArn;
    /**
     * <p>
     * The internally-generated identifier of a health event.
     * </p>
     */
    private String eventId;
    /**
     * <p>
     * The time when a health event started.
     * </p>
     */
    private java.util.Date startedAt;
    /**
     * <p>
     * The time when a health event was resolved. If the health event is still active, the end time is not set.
     * </p>
     */
    private java.util.Date endedAt;
    /**
     * <p>
     * The time when a health event was created.
     * </p>
     */
    private java.util.Date createdAt;
    /**
     * <p>
     * The time when a health event was last updated or recalculated.
     * </p>
     */
    private java.util.Date lastUpdatedAt;
    /**
     * <p>
     * The locations affected by a health event.
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
     * The type of impairment of a specific health event.
     * </p>
     */
    private String impactType;
    /**
     * <p>
     * The threshold percentage for a health score that determines, along with other configuration information, when
     * Internet Monitor creates a health event when there's an internet issue that affects your application end users.
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

    public GetHealthEventResult withEventArn(String eventArn) {
        setEventArn(eventArn);
        return this;
    }

    /**
     * <p>
     * The internally-generated identifier of a health event.
     * </p>
     * 
     * @param eventId
     *        The internally-generated identifier of a health event.
     */

    public void setEventId(String eventId) {
        this.eventId = eventId;
    }

    /**
     * <p>
     * The internally-generated identifier of a health event.
     * </p>
     * 
     * @return The internally-generated identifier of a health event.
     */

    public String getEventId() {
        return this.eventId;
    }

    /**
     * <p>
     * The internally-generated identifier of a health event.
     * </p>
     * 
     * @param eventId
     *        The internally-generated identifier of a health event.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetHealthEventResult withEventId(String eventId) {
        setEventId(eventId);
        return this;
    }

    /**
     * <p>
     * The time when a health event started.
     * </p>
     * 
     * @param startedAt
     *        The time when a health event started.
     */

    public void setStartedAt(java.util.Date startedAt) {
        this.startedAt = startedAt;
    }

    /**
     * <p>
     * The time when a health event started.
     * </p>
     * 
     * @return The time when a health event started.
     */

    public java.util.Date getStartedAt() {
        return this.startedAt;
    }

    /**
     * <p>
     * The time when a health event started.
     * </p>
     * 
     * @param startedAt
     *        The time when a health event started.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetHealthEventResult withStartedAt(java.util.Date startedAt) {
        setStartedAt(startedAt);
        return this;
    }

    /**
     * <p>
     * The time when a health event was resolved. If the health event is still active, the end time is not set.
     * </p>
     * 
     * @param endedAt
     *        The time when a health event was resolved. If the health event is still active, the end time is not set.
     */

    public void setEndedAt(java.util.Date endedAt) {
        this.endedAt = endedAt;
    }

    /**
     * <p>
     * The time when a health event was resolved. If the health event is still active, the end time is not set.
     * </p>
     * 
     * @return The time when a health event was resolved. If the health event is still active, the end time is not set.
     */

    public java.util.Date getEndedAt() {
        return this.endedAt;
    }

    /**
     * <p>
     * The time when a health event was resolved. If the health event is still active, the end time is not set.
     * </p>
     * 
     * @param endedAt
     *        The time when a health event was resolved. If the health event is still active, the end time is not set.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetHealthEventResult withEndedAt(java.util.Date endedAt) {
        setEndedAt(endedAt);
        return this;
    }

    /**
     * <p>
     * The time when a health event was created.
     * </p>
     * 
     * @param createdAt
     *        The time when a health event was created.
     */

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * The time when a health event was created.
     * </p>
     * 
     * @return The time when a health event was created.
     */

    public java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    /**
     * <p>
     * The time when a health event was created.
     * </p>
     * 
     * @param createdAt
     *        The time when a health event was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetHealthEventResult withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
        return this;
    }

    /**
     * <p>
     * The time when a health event was last updated or recalculated.
     * </p>
     * 
     * @param lastUpdatedAt
     *        The time when a health event was last updated or recalculated.
     */

    public void setLastUpdatedAt(java.util.Date lastUpdatedAt) {
        this.lastUpdatedAt = lastUpdatedAt;
    }

    /**
     * <p>
     * The time when a health event was last updated or recalculated.
     * </p>
     * 
     * @return The time when a health event was last updated or recalculated.
     */

    public java.util.Date getLastUpdatedAt() {
        return this.lastUpdatedAt;
    }

    /**
     * <p>
     * The time when a health event was last updated or recalculated.
     * </p>
     * 
     * @param lastUpdatedAt
     *        The time when a health event was last updated or recalculated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetHealthEventResult withLastUpdatedAt(java.util.Date lastUpdatedAt) {
        setLastUpdatedAt(lastUpdatedAt);
        return this;
    }

    /**
     * <p>
     * The locations affected by a health event.
     * </p>
     * 
     * @return The locations affected by a health event.
     */

    public java.util.List<ImpactedLocation> getImpactedLocations() {
        return impactedLocations;
    }

    /**
     * <p>
     * The locations affected by a health event.
     * </p>
     * 
     * @param impactedLocations
     *        The locations affected by a health event.
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
     * The locations affected by a health event.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setImpactedLocations(java.util.Collection)} or {@link #withImpactedLocations(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param impactedLocations
     *        The locations affected by a health event.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetHealthEventResult withImpactedLocations(ImpactedLocation... impactedLocations) {
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
     * The locations affected by a health event.
     * </p>
     * 
     * @param impactedLocations
     *        The locations affected by a health event.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetHealthEventResult withImpactedLocations(java.util.Collection<ImpactedLocation> impactedLocations) {
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

    public GetHealthEventResult withStatus(String status) {
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

    public GetHealthEventResult withStatus(HealthEventStatus status) {
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

    public GetHealthEventResult withPercentOfTotalTrafficImpacted(Double percentOfTotalTrafficImpacted) {
        setPercentOfTotalTrafficImpacted(percentOfTotalTrafficImpacted);
        return this;
    }

    /**
     * <p>
     * The type of impairment of a specific health event.
     * </p>
     * 
     * @param impactType
     *        The type of impairment of a specific health event.
     * @see HealthEventImpactType
     */

    public void setImpactType(String impactType) {
        this.impactType = impactType;
    }

    /**
     * <p>
     * The type of impairment of a specific health event.
     * </p>
     * 
     * @return The type of impairment of a specific health event.
     * @see HealthEventImpactType
     */

    public String getImpactType() {
        return this.impactType;
    }

    /**
     * <p>
     * The type of impairment of a specific health event.
     * </p>
     * 
     * @param impactType
     *        The type of impairment of a specific health event.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see HealthEventImpactType
     */

    public GetHealthEventResult withImpactType(String impactType) {
        setImpactType(impactType);
        return this;
    }

    /**
     * <p>
     * The type of impairment of a specific health event.
     * </p>
     * 
     * @param impactType
     *        The type of impairment of a specific health event.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see HealthEventImpactType
     */

    public GetHealthEventResult withImpactType(HealthEventImpactType impactType) {
        this.impactType = impactType.toString();
        return this;
    }

    /**
     * <p>
     * The threshold percentage for a health score that determines, along with other configuration information, when
     * Internet Monitor creates a health event when there's an internet issue that affects your application end users.
     * </p>
     * 
     * @param healthScoreThreshold
     *        The threshold percentage for a health score that determines, along with other configuration information,
     *        when Internet Monitor creates a health event when there's an internet issue that affects your application
     *        end users.
     */

    public void setHealthScoreThreshold(Double healthScoreThreshold) {
        this.healthScoreThreshold = healthScoreThreshold;
    }

    /**
     * <p>
     * The threshold percentage for a health score that determines, along with other configuration information, when
     * Internet Monitor creates a health event when there's an internet issue that affects your application end users.
     * </p>
     * 
     * @return The threshold percentage for a health score that determines, along with other configuration information,
     *         when Internet Monitor creates a health event when there's an internet issue that affects your application
     *         end users.
     */

    public Double getHealthScoreThreshold() {
        return this.healthScoreThreshold;
    }

    /**
     * <p>
     * The threshold percentage for a health score that determines, along with other configuration information, when
     * Internet Monitor creates a health event when there's an internet issue that affects your application end users.
     * </p>
     * 
     * @param healthScoreThreshold
     *        The threshold percentage for a health score that determines, along with other configuration information,
     *        when Internet Monitor creates a health event when there's an internet issue that affects your application
     *        end users.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetHealthEventResult withHealthScoreThreshold(Double healthScoreThreshold) {
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

        if (obj instanceof GetHealthEventResult == false)
            return false;
        GetHealthEventResult other = (GetHealthEventResult) obj;
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
    public GetHealthEventResult clone() {
        try {
            return (GetHealthEventResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
