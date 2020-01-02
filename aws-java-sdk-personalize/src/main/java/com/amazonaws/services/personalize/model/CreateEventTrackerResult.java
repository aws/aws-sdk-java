/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.personalize.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/personalize-2018-05-22/CreateEventTracker" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateEventTrackerResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The ARN of the event tracker.
     * </p>
     */
    private String eventTrackerArn;
    /**
     * <p>
     * The ID of the event tracker. Include this ID in requests to the <a
     * href="https://docs.aws.amazon.com/personalize/latest/dg/API_UBS_PutEvents.html">PutEvents</a> API.
     * </p>
     */
    private String trackingId;

    /**
     * <p>
     * The ARN of the event tracker.
     * </p>
     * 
     * @param eventTrackerArn
     *        The ARN of the event tracker.
     */

    public void setEventTrackerArn(String eventTrackerArn) {
        this.eventTrackerArn = eventTrackerArn;
    }

    /**
     * <p>
     * The ARN of the event tracker.
     * </p>
     * 
     * @return The ARN of the event tracker.
     */

    public String getEventTrackerArn() {
        return this.eventTrackerArn;
    }

    /**
     * <p>
     * The ARN of the event tracker.
     * </p>
     * 
     * @param eventTrackerArn
     *        The ARN of the event tracker.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateEventTrackerResult withEventTrackerArn(String eventTrackerArn) {
        setEventTrackerArn(eventTrackerArn);
        return this;
    }

    /**
     * <p>
     * The ID of the event tracker. Include this ID in requests to the <a
     * href="https://docs.aws.amazon.com/personalize/latest/dg/API_UBS_PutEvents.html">PutEvents</a> API.
     * </p>
     * 
     * @param trackingId
     *        The ID of the event tracker. Include this ID in requests to the <a
     *        href="https://docs.aws.amazon.com/personalize/latest/dg/API_UBS_PutEvents.html">PutEvents</a> API.
     */

    public void setTrackingId(String trackingId) {
        this.trackingId = trackingId;
    }

    /**
     * <p>
     * The ID of the event tracker. Include this ID in requests to the <a
     * href="https://docs.aws.amazon.com/personalize/latest/dg/API_UBS_PutEvents.html">PutEvents</a> API.
     * </p>
     * 
     * @return The ID of the event tracker. Include this ID in requests to the <a
     *         href="https://docs.aws.amazon.com/personalize/latest/dg/API_UBS_PutEvents.html">PutEvents</a> API.
     */

    public String getTrackingId() {
        return this.trackingId;
    }

    /**
     * <p>
     * The ID of the event tracker. Include this ID in requests to the <a
     * href="https://docs.aws.amazon.com/personalize/latest/dg/API_UBS_PutEvents.html">PutEvents</a> API.
     * </p>
     * 
     * @param trackingId
     *        The ID of the event tracker. Include this ID in requests to the <a
     *        href="https://docs.aws.amazon.com/personalize/latest/dg/API_UBS_PutEvents.html">PutEvents</a> API.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateEventTrackerResult withTrackingId(String trackingId) {
        setTrackingId(trackingId);
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
        if (getEventTrackerArn() != null)
            sb.append("EventTrackerArn: ").append(getEventTrackerArn()).append(",");
        if (getTrackingId() != null)
            sb.append("TrackingId: ").append(getTrackingId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateEventTrackerResult == false)
            return false;
        CreateEventTrackerResult other = (CreateEventTrackerResult) obj;
        if (other.getEventTrackerArn() == null ^ this.getEventTrackerArn() == null)
            return false;
        if (other.getEventTrackerArn() != null && other.getEventTrackerArn().equals(this.getEventTrackerArn()) == false)
            return false;
        if (other.getTrackingId() == null ^ this.getTrackingId() == null)
            return false;
        if (other.getTrackingId() != null && other.getTrackingId().equals(this.getTrackingId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEventTrackerArn() == null) ? 0 : getEventTrackerArn().hashCode());
        hashCode = prime * hashCode + ((getTrackingId() == null) ? 0 : getTrackingId().hashCode());
        return hashCode;
    }

    @Override
    public CreateEventTrackerResult clone() {
        try {
            return (CreateEventTrackerResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
