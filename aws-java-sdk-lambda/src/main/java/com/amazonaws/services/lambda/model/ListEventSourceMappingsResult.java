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
package com.amazonaws.services.lambda.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/ListEventSourceMappings" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListEventSourceMappingsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A pagination token that's returned when the response doesn't contain all event source mappings.
     * </p>
     */
    private String nextMarker;
    /**
     * <p>
     * A list of event source mappings.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<EventSourceMappingConfiguration> eventSourceMappings;

    /**
     * <p>
     * A pagination token that's returned when the response doesn't contain all event source mappings.
     * </p>
     * 
     * @param nextMarker
     *        A pagination token that's returned when the response doesn't contain all event source mappings.
     */

    public void setNextMarker(String nextMarker) {
        this.nextMarker = nextMarker;
    }

    /**
     * <p>
     * A pagination token that's returned when the response doesn't contain all event source mappings.
     * </p>
     * 
     * @return A pagination token that's returned when the response doesn't contain all event source mappings.
     */

    public String getNextMarker() {
        return this.nextMarker;
    }

    /**
     * <p>
     * A pagination token that's returned when the response doesn't contain all event source mappings.
     * </p>
     * 
     * @param nextMarker
     *        A pagination token that's returned when the response doesn't contain all event source mappings.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListEventSourceMappingsResult withNextMarker(String nextMarker) {
        setNextMarker(nextMarker);
        return this;
    }

    /**
     * <p>
     * A list of event source mappings.
     * </p>
     * 
     * @return A list of event source mappings.
     */

    public java.util.List<EventSourceMappingConfiguration> getEventSourceMappings() {
        if (eventSourceMappings == null) {
            eventSourceMappings = new com.amazonaws.internal.SdkInternalList<EventSourceMappingConfiguration>();
        }
        return eventSourceMappings;
    }

    /**
     * <p>
     * A list of event source mappings.
     * </p>
     * 
     * @param eventSourceMappings
     *        A list of event source mappings.
     */

    public void setEventSourceMappings(java.util.Collection<EventSourceMappingConfiguration> eventSourceMappings) {
        if (eventSourceMappings == null) {
            this.eventSourceMappings = null;
            return;
        }

        this.eventSourceMappings = new com.amazonaws.internal.SdkInternalList<EventSourceMappingConfiguration>(eventSourceMappings);
    }

    /**
     * <p>
     * A list of event source mappings.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEventSourceMappings(java.util.Collection)} or {@link #withEventSourceMappings(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param eventSourceMappings
     *        A list of event source mappings.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListEventSourceMappingsResult withEventSourceMappings(EventSourceMappingConfiguration... eventSourceMappings) {
        if (this.eventSourceMappings == null) {
            setEventSourceMappings(new com.amazonaws.internal.SdkInternalList<EventSourceMappingConfiguration>(eventSourceMappings.length));
        }
        for (EventSourceMappingConfiguration ele : eventSourceMappings) {
            this.eventSourceMappings.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of event source mappings.
     * </p>
     * 
     * @param eventSourceMappings
     *        A list of event source mappings.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListEventSourceMappingsResult withEventSourceMappings(java.util.Collection<EventSourceMappingConfiguration> eventSourceMappings) {
        setEventSourceMappings(eventSourceMappings);
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
        if (getNextMarker() != null)
            sb.append("NextMarker: ").append(getNextMarker()).append(",");
        if (getEventSourceMappings() != null)
            sb.append("EventSourceMappings: ").append(getEventSourceMappings());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListEventSourceMappingsResult == false)
            return false;
        ListEventSourceMappingsResult other = (ListEventSourceMappingsResult) obj;
        if (other.getNextMarker() == null ^ this.getNextMarker() == null)
            return false;
        if (other.getNextMarker() != null && other.getNextMarker().equals(this.getNextMarker()) == false)
            return false;
        if (other.getEventSourceMappings() == null ^ this.getEventSourceMappings() == null)
            return false;
        if (other.getEventSourceMappings() != null && other.getEventSourceMappings().equals(this.getEventSourceMappings()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextMarker() == null) ? 0 : getNextMarker().hashCode());
        hashCode = prime * hashCode + ((getEventSourceMappings() == null) ? 0 : getEventSourceMappings().hashCode());
        return hashCode;
    }

    @Override
    public ListEventSourceMappingsResult clone() {
        try {
            return (ListEventSourceMappingsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
