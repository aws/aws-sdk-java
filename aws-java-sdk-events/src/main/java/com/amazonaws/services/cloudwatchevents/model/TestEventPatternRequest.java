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
package com.amazonaws.services.cloudwatchevents.model;

import java.io.Serializable;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Container for the parameters to the <a>TestEventPattern</a> operation.
 * </p>
 */
public class TestEventPatternRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The event pattern you want to test.
     * </p>
     */
    private String eventPattern;
    /**
     * <p>
     * The event in the JSON format to test against the event pattern.
     * </p>
     */
    private String event;

    /**
     * <p>
     * The event pattern you want to test.
     * </p>
     * 
     * @param eventPattern
     *        The event pattern you want to test.
     */

    public void setEventPattern(String eventPattern) {
        this.eventPattern = eventPattern;
    }

    /**
     * <p>
     * The event pattern you want to test.
     * </p>
     * 
     * @return The event pattern you want to test.
     */

    public String getEventPattern() {
        return this.eventPattern;
    }

    /**
     * <p>
     * The event pattern you want to test.
     * </p>
     * 
     * @param eventPattern
     *        The event pattern you want to test.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TestEventPatternRequest withEventPattern(String eventPattern) {
        setEventPattern(eventPattern);
        return this;
    }

    /**
     * <p>
     * The event in the JSON format to test against the event pattern.
     * </p>
     * 
     * @param event
     *        The event in the JSON format to test against the event pattern.
     */

    public void setEvent(String event) {
        this.event = event;
    }

    /**
     * <p>
     * The event in the JSON format to test against the event pattern.
     * </p>
     * 
     * @return The event in the JSON format to test against the event pattern.
     */

    public String getEvent() {
        return this.event;
    }

    /**
     * <p>
     * The event in the JSON format to test against the event pattern.
     * </p>
     * 
     * @param event
     *        The event in the JSON format to test against the event pattern.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TestEventPatternRequest withEvent(String event) {
        setEvent(event);
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
        if (getEventPattern() != null)
            sb.append("EventPattern: " + getEventPattern() + ",");
        if (getEvent() != null)
            sb.append("Event: " + getEvent());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TestEventPatternRequest == false)
            return false;
        TestEventPatternRequest other = (TestEventPatternRequest) obj;
        if (other.getEventPattern() == null ^ this.getEventPattern() == null)
            return false;
        if (other.getEventPattern() != null && other.getEventPattern().equals(this.getEventPattern()) == false)
            return false;
        if (other.getEvent() == null ^ this.getEvent() == null)
            return false;
        if (other.getEvent() != null && other.getEvent().equals(this.getEvent()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEventPattern() == null) ? 0 : getEventPattern().hashCode());
        hashCode = prime * hashCode + ((getEvent() == null) ? 0 : getEvent().hashCode());
        return hashCode;
    }

    @Override
    public TestEventPatternRequest clone() {
        return (TestEventPatternRequest) super.clone();
    }
}
