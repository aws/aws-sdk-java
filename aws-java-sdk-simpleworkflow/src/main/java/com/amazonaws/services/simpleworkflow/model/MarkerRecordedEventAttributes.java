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
package com.amazonaws.services.simpleworkflow.model;

import java.io.Serializable;

/**
 * <p>
 * Provides details of the <code>MarkerRecorded</code> event.
 * </p>
 */
public class MarkerRecordedEventAttributes implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the marker.
     * </p>
     */
    private String markerName;
    /**
     * <p>
     * Details of the marker (if any).
     * </p>
     */
    private String details;
    /**
     * <p>
     * The ID of the <code>DecisionTaskCompleted</code> event corresponding to the decision task that resulted in the
     * <code>RecordMarker</code> decision that requested this marker. This information can be useful for diagnosing
     * problems by tracing back the chain of events leading up to this event.
     * </p>
     */
    private Long decisionTaskCompletedEventId;

    /**
     * <p>
     * The name of the marker.
     * </p>
     * 
     * @param markerName
     *        The name of the marker.
     */

    public void setMarkerName(String markerName) {
        this.markerName = markerName;
    }

    /**
     * <p>
     * The name of the marker.
     * </p>
     * 
     * @return The name of the marker.
     */

    public String getMarkerName() {
        return this.markerName;
    }

    /**
     * <p>
     * The name of the marker.
     * </p>
     * 
     * @param markerName
     *        The name of the marker.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MarkerRecordedEventAttributes withMarkerName(String markerName) {
        setMarkerName(markerName);
        return this;
    }

    /**
     * <p>
     * Details of the marker (if any).
     * </p>
     * 
     * @param details
     *        Details of the marker (if any).
     */

    public void setDetails(String details) {
        this.details = details;
    }

    /**
     * <p>
     * Details of the marker (if any).
     * </p>
     * 
     * @return Details of the marker (if any).
     */

    public String getDetails() {
        return this.details;
    }

    /**
     * <p>
     * Details of the marker (if any).
     * </p>
     * 
     * @param details
     *        Details of the marker (if any).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MarkerRecordedEventAttributes withDetails(String details) {
        setDetails(details);
        return this;
    }

    /**
     * <p>
     * The ID of the <code>DecisionTaskCompleted</code> event corresponding to the decision task that resulted in the
     * <code>RecordMarker</code> decision that requested this marker. This information can be useful for diagnosing
     * problems by tracing back the chain of events leading up to this event.
     * </p>
     * 
     * @param decisionTaskCompletedEventId
     *        The ID of the <code>DecisionTaskCompleted</code> event corresponding to the decision task that resulted in
     *        the <code>RecordMarker</code> decision that requested this marker. This information can be useful for
     *        diagnosing problems by tracing back the chain of events leading up to this event.
     */

    public void setDecisionTaskCompletedEventId(Long decisionTaskCompletedEventId) {
        this.decisionTaskCompletedEventId = decisionTaskCompletedEventId;
    }

    /**
     * <p>
     * The ID of the <code>DecisionTaskCompleted</code> event corresponding to the decision task that resulted in the
     * <code>RecordMarker</code> decision that requested this marker. This information can be useful for diagnosing
     * problems by tracing back the chain of events leading up to this event.
     * </p>
     * 
     * @return The ID of the <code>DecisionTaskCompleted</code> event corresponding to the decision task that resulted
     *         in the <code>RecordMarker</code> decision that requested this marker. This information can be useful for
     *         diagnosing problems by tracing back the chain of events leading up to this event.
     */

    public Long getDecisionTaskCompletedEventId() {
        return this.decisionTaskCompletedEventId;
    }

    /**
     * <p>
     * The ID of the <code>DecisionTaskCompleted</code> event corresponding to the decision task that resulted in the
     * <code>RecordMarker</code> decision that requested this marker. This information can be useful for diagnosing
     * problems by tracing back the chain of events leading up to this event.
     * </p>
     * 
     * @param decisionTaskCompletedEventId
     *        The ID of the <code>DecisionTaskCompleted</code> event corresponding to the decision task that resulted in
     *        the <code>RecordMarker</code> decision that requested this marker. This information can be useful for
     *        diagnosing problems by tracing back the chain of events leading up to this event.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MarkerRecordedEventAttributes withDecisionTaskCompletedEventId(Long decisionTaskCompletedEventId) {
        setDecisionTaskCompletedEventId(decisionTaskCompletedEventId);
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
        if (getMarkerName() != null)
            sb.append("MarkerName: " + getMarkerName() + ",");
        if (getDetails() != null)
            sb.append("Details: " + getDetails() + ",");
        if (getDecisionTaskCompletedEventId() != null)
            sb.append("DecisionTaskCompletedEventId: " + getDecisionTaskCompletedEventId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MarkerRecordedEventAttributes == false)
            return false;
        MarkerRecordedEventAttributes other = (MarkerRecordedEventAttributes) obj;
        if (other.getMarkerName() == null ^ this.getMarkerName() == null)
            return false;
        if (other.getMarkerName() != null && other.getMarkerName().equals(this.getMarkerName()) == false)
            return false;
        if (other.getDetails() == null ^ this.getDetails() == null)
            return false;
        if (other.getDetails() != null && other.getDetails().equals(this.getDetails()) == false)
            return false;
        if (other.getDecisionTaskCompletedEventId() == null ^ this.getDecisionTaskCompletedEventId() == null)
            return false;
        if (other.getDecisionTaskCompletedEventId() != null && other.getDecisionTaskCompletedEventId().equals(this.getDecisionTaskCompletedEventId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMarkerName() == null) ? 0 : getMarkerName().hashCode());
        hashCode = prime * hashCode + ((getDetails() == null) ? 0 : getDetails().hashCode());
        hashCode = prime * hashCode + ((getDecisionTaskCompletedEventId() == null) ? 0 : getDecisionTaskCompletedEventId().hashCode());
        return hashCode;
    }

    @Override
    public MarkerRecordedEventAttributes clone() {
        try {
            return (MarkerRecordedEventAttributes) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
