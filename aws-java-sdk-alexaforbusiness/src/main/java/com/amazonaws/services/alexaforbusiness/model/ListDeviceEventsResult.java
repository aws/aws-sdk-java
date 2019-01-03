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
package com.amazonaws.services.alexaforbusiness.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/ListDeviceEvents" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListDeviceEventsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The device events requested for the device ARN.
     * </p>
     */
    private java.util.List<DeviceEvent> deviceEvents;
    /**
     * <p>
     * The token returned to indicate that there is more data available.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The device events requested for the device ARN.
     * </p>
     * 
     * @return The device events requested for the device ARN.
     */

    public java.util.List<DeviceEvent> getDeviceEvents() {
        return deviceEvents;
    }

    /**
     * <p>
     * The device events requested for the device ARN.
     * </p>
     * 
     * @param deviceEvents
     *        The device events requested for the device ARN.
     */

    public void setDeviceEvents(java.util.Collection<DeviceEvent> deviceEvents) {
        if (deviceEvents == null) {
            this.deviceEvents = null;
            return;
        }

        this.deviceEvents = new java.util.ArrayList<DeviceEvent>(deviceEvents);
    }

    /**
     * <p>
     * The device events requested for the device ARN.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDeviceEvents(java.util.Collection)} or {@link #withDeviceEvents(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param deviceEvents
     *        The device events requested for the device ARN.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDeviceEventsResult withDeviceEvents(DeviceEvent... deviceEvents) {
        if (this.deviceEvents == null) {
            setDeviceEvents(new java.util.ArrayList<DeviceEvent>(deviceEvents.length));
        }
        for (DeviceEvent ele : deviceEvents) {
            this.deviceEvents.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The device events requested for the device ARN.
     * </p>
     * 
     * @param deviceEvents
     *        The device events requested for the device ARN.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDeviceEventsResult withDeviceEvents(java.util.Collection<DeviceEvent> deviceEvents) {
        setDeviceEvents(deviceEvents);
        return this;
    }

    /**
     * <p>
     * The token returned to indicate that there is more data available.
     * </p>
     * 
     * @param nextToken
     *        The token returned to indicate that there is more data available.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token returned to indicate that there is more data available.
     * </p>
     * 
     * @return The token returned to indicate that there is more data available.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token returned to indicate that there is more data available.
     * </p>
     * 
     * @param nextToken
     *        The token returned to indicate that there is more data available.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDeviceEventsResult withNextToken(String nextToken) {
        setNextToken(nextToken);
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
        if (getDeviceEvents() != null)
            sb.append("DeviceEvents: ").append(getDeviceEvents()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListDeviceEventsResult == false)
            return false;
        ListDeviceEventsResult other = (ListDeviceEventsResult) obj;
        if (other.getDeviceEvents() == null ^ this.getDeviceEvents() == null)
            return false;
        if (other.getDeviceEvents() != null && other.getDeviceEvents().equals(this.getDeviceEvents()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDeviceEvents() == null) ? 0 : getDeviceEvents().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListDeviceEventsResult clone() {
        try {
            return (ListDeviceEventsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
