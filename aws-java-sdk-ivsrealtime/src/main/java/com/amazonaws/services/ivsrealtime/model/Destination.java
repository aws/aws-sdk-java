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
package com.amazonaws.services.ivsrealtime.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Object specifying the status of a Destination.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivs-realtime-2020-07-14/Destination" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Destination implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Configuration used to create this destination.
     * </p>
     */
    private DestinationConfiguration configuration;
    /**
     * <p>
     * Optional details regarding the status of the destination.
     * </p>
     */
    private DestinationDetail detail;
    /**
     * <p>
     * UTC time of the destination end. This is an ISO 8601 timestamp; <i>note that this is returned as a string</i>.
     * </p>
     */
    private java.util.Date endTime;
    /**
     * <p>
     * Unique identifier for this destination, assigned by IVS.
     * </p>
     */
    private String id;
    /**
     * <p>
     * UTC time of the destination start. This is an ISO 8601 timestamp; <i>note that this is returned as a string</i>.
     * </p>
     */
    private java.util.Date startTime;
    /**
     * <p>
     * State of the Composition Destination.
     * </p>
     */
    private String state;

    /**
     * <p>
     * Configuration used to create this destination.
     * </p>
     * 
     * @param configuration
     *        Configuration used to create this destination.
     */

    public void setConfiguration(DestinationConfiguration configuration) {
        this.configuration = configuration;
    }

    /**
     * <p>
     * Configuration used to create this destination.
     * </p>
     * 
     * @return Configuration used to create this destination.
     */

    public DestinationConfiguration getConfiguration() {
        return this.configuration;
    }

    /**
     * <p>
     * Configuration used to create this destination.
     * </p>
     * 
     * @param configuration
     *        Configuration used to create this destination.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Destination withConfiguration(DestinationConfiguration configuration) {
        setConfiguration(configuration);
        return this;
    }

    /**
     * <p>
     * Optional details regarding the status of the destination.
     * </p>
     * 
     * @param detail
     *        Optional details regarding the status of the destination.
     */

    public void setDetail(DestinationDetail detail) {
        this.detail = detail;
    }

    /**
     * <p>
     * Optional details regarding the status of the destination.
     * </p>
     * 
     * @return Optional details regarding the status of the destination.
     */

    public DestinationDetail getDetail() {
        return this.detail;
    }

    /**
     * <p>
     * Optional details regarding the status of the destination.
     * </p>
     * 
     * @param detail
     *        Optional details regarding the status of the destination.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Destination withDetail(DestinationDetail detail) {
        setDetail(detail);
        return this;
    }

    /**
     * <p>
     * UTC time of the destination end. This is an ISO 8601 timestamp; <i>note that this is returned as a string</i>.
     * </p>
     * 
     * @param endTime
     *        UTC time of the destination end. This is an ISO 8601 timestamp; <i>note that this is returned as a
     *        string</i>.
     */

    public void setEndTime(java.util.Date endTime) {
        this.endTime = endTime;
    }

    /**
     * <p>
     * UTC time of the destination end. This is an ISO 8601 timestamp; <i>note that this is returned as a string</i>.
     * </p>
     * 
     * @return UTC time of the destination end. This is an ISO 8601 timestamp; <i>note that this is returned as a
     *         string</i>.
     */

    public java.util.Date getEndTime() {
        return this.endTime;
    }

    /**
     * <p>
     * UTC time of the destination end. This is an ISO 8601 timestamp; <i>note that this is returned as a string</i>.
     * </p>
     * 
     * @param endTime
     *        UTC time of the destination end. This is an ISO 8601 timestamp; <i>note that this is returned as a
     *        string</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Destination withEndTime(java.util.Date endTime) {
        setEndTime(endTime);
        return this;
    }

    /**
     * <p>
     * Unique identifier for this destination, assigned by IVS.
     * </p>
     * 
     * @param id
     *        Unique identifier for this destination, assigned by IVS.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * Unique identifier for this destination, assigned by IVS.
     * </p>
     * 
     * @return Unique identifier for this destination, assigned by IVS.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * Unique identifier for this destination, assigned by IVS.
     * </p>
     * 
     * @param id
     *        Unique identifier for this destination, assigned by IVS.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Destination withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * UTC time of the destination start. This is an ISO 8601 timestamp; <i>note that this is returned as a string</i>.
     * </p>
     * 
     * @param startTime
     *        UTC time of the destination start. This is an ISO 8601 timestamp; <i>note that this is returned as a
     *        string</i>.
     */

    public void setStartTime(java.util.Date startTime) {
        this.startTime = startTime;
    }

    /**
     * <p>
     * UTC time of the destination start. This is an ISO 8601 timestamp; <i>note that this is returned as a string</i>.
     * </p>
     * 
     * @return UTC time of the destination start. This is an ISO 8601 timestamp; <i>note that this is returned as a
     *         string</i>.
     */

    public java.util.Date getStartTime() {
        return this.startTime;
    }

    /**
     * <p>
     * UTC time of the destination start. This is an ISO 8601 timestamp; <i>note that this is returned as a string</i>.
     * </p>
     * 
     * @param startTime
     *        UTC time of the destination start. This is an ISO 8601 timestamp; <i>note that this is returned as a
     *        string</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Destination withStartTime(java.util.Date startTime) {
        setStartTime(startTime);
        return this;
    }

    /**
     * <p>
     * State of the Composition Destination.
     * </p>
     * 
     * @param state
     *        State of the Composition Destination.
     * @see DestinationState
     */

    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * State of the Composition Destination.
     * </p>
     * 
     * @return State of the Composition Destination.
     * @see DestinationState
     */

    public String getState() {
        return this.state;
    }

    /**
     * <p>
     * State of the Composition Destination.
     * </p>
     * 
     * @param state
     *        State of the Composition Destination.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DestinationState
     */

    public Destination withState(String state) {
        setState(state);
        return this;
    }

    /**
     * <p>
     * State of the Composition Destination.
     * </p>
     * 
     * @param state
     *        State of the Composition Destination.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DestinationState
     */

    public Destination withState(DestinationState state) {
        this.state = state.toString();
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
        if (getConfiguration() != null)
            sb.append("Configuration: ").append(getConfiguration()).append(",");
        if (getDetail() != null)
            sb.append("Detail: ").append(getDetail()).append(",");
        if (getEndTime() != null)
            sb.append("EndTime: ").append(getEndTime()).append(",");
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getStartTime() != null)
            sb.append("StartTime: ").append(getStartTime()).append(",");
        if (getState() != null)
            sb.append("State: ").append(getState());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Destination == false)
            return false;
        Destination other = (Destination) obj;
        if (other.getConfiguration() == null ^ this.getConfiguration() == null)
            return false;
        if (other.getConfiguration() != null && other.getConfiguration().equals(this.getConfiguration()) == false)
            return false;
        if (other.getDetail() == null ^ this.getDetail() == null)
            return false;
        if (other.getDetail() != null && other.getDetail().equals(this.getDetail()) == false)
            return false;
        if (other.getEndTime() == null ^ this.getEndTime() == null)
            return false;
        if (other.getEndTime() != null && other.getEndTime().equals(this.getEndTime()) == false)
            return false;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getStartTime() == null ^ this.getStartTime() == null)
            return false;
        if (other.getStartTime() != null && other.getStartTime().equals(this.getStartTime()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getConfiguration() == null) ? 0 : getConfiguration().hashCode());
        hashCode = prime * hashCode + ((getDetail() == null) ? 0 : getDetail().hashCode());
        hashCode = prime * hashCode + ((getEndTime() == null) ? 0 : getEndTime().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        return hashCode;
    }

    @Override
    public Destination clone() {
        try {
            return (Destination) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.ivsrealtime.model.transform.DestinationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
