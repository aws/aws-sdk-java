/*
 * Copyright 2013-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

    /** <p/> */
    private java.util.List<DeviceEvent> deviceEvents;
    /** <p/> */
    private String nextToken;

    /**
     * <p/>
     * 
     * @return
     */

    public java.util.List<DeviceEvent> getDeviceEvents() {
        return deviceEvents;
    }

    /**
     * <p/>
     * 
     * @param deviceEvents
     */

    public void setDeviceEvents(java.util.Collection<DeviceEvent> deviceEvents) {
        if (deviceEvents == null) {
            this.deviceEvents = null;
            return;
        }

        this.deviceEvents = new java.util.ArrayList<DeviceEvent>(deviceEvents);
    }

    /**
     * <p/>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDeviceEvents(java.util.Collection)} or {@link #withDeviceEvents(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param deviceEvents
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
     * <p/>
     * 
     * @param deviceEvents
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDeviceEventsResult withDeviceEvents(java.util.Collection<DeviceEvent> deviceEvents) {
        setDeviceEvents(deviceEvents);
        return this;
    }

    /**
     * <p/>
     * 
     * @param nextToken
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p/>
     * 
     * @return
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p/>
     * 
     * @param nextToken
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDeviceEventsResult withNextToken(String nextToken) {
        setNextToken(nextToken);
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
