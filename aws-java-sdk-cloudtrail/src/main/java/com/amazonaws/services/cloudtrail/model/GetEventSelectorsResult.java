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
package com.amazonaws.services.cloudtrail.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudtrail-2013-11-01/GetEventSelectors" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetEventSelectorsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The specified trail ARN that has the event selectors.
     * </p>
     */
    private String trailARN;
    /**
     * <p>
     * The event selectors that are configured for the trail.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<EventSelector> eventSelectors;
    /**
     * <p>
     * The advanced event selectors that are configured for the trail.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<AdvancedEventSelector> advancedEventSelectors;

    /**
     * <p>
     * The specified trail ARN that has the event selectors.
     * </p>
     * 
     * @param trailARN
     *        The specified trail ARN that has the event selectors.
     */

    public void setTrailARN(String trailARN) {
        this.trailARN = trailARN;
    }

    /**
     * <p>
     * The specified trail ARN that has the event selectors.
     * </p>
     * 
     * @return The specified trail ARN that has the event selectors.
     */

    public String getTrailARN() {
        return this.trailARN;
    }

    /**
     * <p>
     * The specified trail ARN that has the event selectors.
     * </p>
     * 
     * @param trailARN
     *        The specified trail ARN that has the event selectors.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetEventSelectorsResult withTrailARN(String trailARN) {
        setTrailARN(trailARN);
        return this;
    }

    /**
     * <p>
     * The event selectors that are configured for the trail.
     * </p>
     * 
     * @return The event selectors that are configured for the trail.
     */

    public java.util.List<EventSelector> getEventSelectors() {
        if (eventSelectors == null) {
            eventSelectors = new com.amazonaws.internal.SdkInternalList<EventSelector>();
        }
        return eventSelectors;
    }

    /**
     * <p>
     * The event selectors that are configured for the trail.
     * </p>
     * 
     * @param eventSelectors
     *        The event selectors that are configured for the trail.
     */

    public void setEventSelectors(java.util.Collection<EventSelector> eventSelectors) {
        if (eventSelectors == null) {
            this.eventSelectors = null;
            return;
        }

        this.eventSelectors = new com.amazonaws.internal.SdkInternalList<EventSelector>(eventSelectors);
    }

    /**
     * <p>
     * The event selectors that are configured for the trail.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEventSelectors(java.util.Collection)} or {@link #withEventSelectors(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param eventSelectors
     *        The event selectors that are configured for the trail.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetEventSelectorsResult withEventSelectors(EventSelector... eventSelectors) {
        if (this.eventSelectors == null) {
            setEventSelectors(new com.amazonaws.internal.SdkInternalList<EventSelector>(eventSelectors.length));
        }
        for (EventSelector ele : eventSelectors) {
            this.eventSelectors.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The event selectors that are configured for the trail.
     * </p>
     * 
     * @param eventSelectors
     *        The event selectors that are configured for the trail.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetEventSelectorsResult withEventSelectors(java.util.Collection<EventSelector> eventSelectors) {
        setEventSelectors(eventSelectors);
        return this;
    }

    /**
     * <p>
     * The advanced event selectors that are configured for the trail.
     * </p>
     * 
     * @return The advanced event selectors that are configured for the trail.
     */

    public java.util.List<AdvancedEventSelector> getAdvancedEventSelectors() {
        if (advancedEventSelectors == null) {
            advancedEventSelectors = new com.amazonaws.internal.SdkInternalList<AdvancedEventSelector>();
        }
        return advancedEventSelectors;
    }

    /**
     * <p>
     * The advanced event selectors that are configured for the trail.
     * </p>
     * 
     * @param advancedEventSelectors
     *        The advanced event selectors that are configured for the trail.
     */

    public void setAdvancedEventSelectors(java.util.Collection<AdvancedEventSelector> advancedEventSelectors) {
        if (advancedEventSelectors == null) {
            this.advancedEventSelectors = null;
            return;
        }

        this.advancedEventSelectors = new com.amazonaws.internal.SdkInternalList<AdvancedEventSelector>(advancedEventSelectors);
    }

    /**
     * <p>
     * The advanced event selectors that are configured for the trail.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAdvancedEventSelectors(java.util.Collection)} or
     * {@link #withAdvancedEventSelectors(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param advancedEventSelectors
     *        The advanced event selectors that are configured for the trail.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetEventSelectorsResult withAdvancedEventSelectors(AdvancedEventSelector... advancedEventSelectors) {
        if (this.advancedEventSelectors == null) {
            setAdvancedEventSelectors(new com.amazonaws.internal.SdkInternalList<AdvancedEventSelector>(advancedEventSelectors.length));
        }
        for (AdvancedEventSelector ele : advancedEventSelectors) {
            this.advancedEventSelectors.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The advanced event selectors that are configured for the trail.
     * </p>
     * 
     * @param advancedEventSelectors
     *        The advanced event selectors that are configured for the trail.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetEventSelectorsResult withAdvancedEventSelectors(java.util.Collection<AdvancedEventSelector> advancedEventSelectors) {
        setAdvancedEventSelectors(advancedEventSelectors);
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
        if (getTrailARN() != null)
            sb.append("TrailARN: ").append(getTrailARN()).append(",");
        if (getEventSelectors() != null)
            sb.append("EventSelectors: ").append(getEventSelectors()).append(",");
        if (getAdvancedEventSelectors() != null)
            sb.append("AdvancedEventSelectors: ").append(getAdvancedEventSelectors());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetEventSelectorsResult == false)
            return false;
        GetEventSelectorsResult other = (GetEventSelectorsResult) obj;
        if (other.getTrailARN() == null ^ this.getTrailARN() == null)
            return false;
        if (other.getTrailARN() != null && other.getTrailARN().equals(this.getTrailARN()) == false)
            return false;
        if (other.getEventSelectors() == null ^ this.getEventSelectors() == null)
            return false;
        if (other.getEventSelectors() != null && other.getEventSelectors().equals(this.getEventSelectors()) == false)
            return false;
        if (other.getAdvancedEventSelectors() == null ^ this.getAdvancedEventSelectors() == null)
            return false;
        if (other.getAdvancedEventSelectors() != null && other.getAdvancedEventSelectors().equals(this.getAdvancedEventSelectors()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTrailARN() == null) ? 0 : getTrailARN().hashCode());
        hashCode = prime * hashCode + ((getEventSelectors() == null) ? 0 : getEventSelectors().hashCode());
        hashCode = prime * hashCode + ((getAdvancedEventSelectors() == null) ? 0 : getAdvancedEventSelectors().hashCode());
        return hashCode;
    }

    @Override
    public GetEventSelectorsResult clone() {
        try {
            return (GetEventSelectorsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
