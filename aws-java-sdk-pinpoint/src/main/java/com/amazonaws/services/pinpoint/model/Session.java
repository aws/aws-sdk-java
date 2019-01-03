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
package com.amazonaws.services.pinpoint.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * Information about a session.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/Session" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Session implements Serializable, Cloneable, StructuredPojo {

    /** The duration of the session, in milliseconds. */
    private Integer duration;
    /** A unique identifier for the session. */
    private String id;
    /** The date and time when the session began. */
    private String startTimestamp;
    /** The date and time when the session ended. */
    private String stopTimestamp;

    /**
     * The duration of the session, in milliseconds.
     * 
     * @param duration
     *        The duration of the session, in milliseconds.
     */

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    /**
     * The duration of the session, in milliseconds.
     * 
     * @return The duration of the session, in milliseconds.
     */

    public Integer getDuration() {
        return this.duration;
    }

    /**
     * The duration of the session, in milliseconds.
     * 
     * @param duration
     *        The duration of the session, in milliseconds.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Session withDuration(Integer duration) {
        setDuration(duration);
        return this;
    }

    /**
     * A unique identifier for the session.
     * 
     * @param id
     *        A unique identifier for the session.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * A unique identifier for the session.
     * 
     * @return A unique identifier for the session.
     */

    public String getId() {
        return this.id;
    }

    /**
     * A unique identifier for the session.
     * 
     * @param id
     *        A unique identifier for the session.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Session withId(String id) {
        setId(id);
        return this;
    }

    /**
     * The date and time when the session began.
     * 
     * @param startTimestamp
     *        The date and time when the session began.
     */

    public void setStartTimestamp(String startTimestamp) {
        this.startTimestamp = startTimestamp;
    }

    /**
     * The date and time when the session began.
     * 
     * @return The date and time when the session began.
     */

    public String getStartTimestamp() {
        return this.startTimestamp;
    }

    /**
     * The date and time when the session began.
     * 
     * @param startTimestamp
     *        The date and time when the session began.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Session withStartTimestamp(String startTimestamp) {
        setStartTimestamp(startTimestamp);
        return this;
    }

    /**
     * The date and time when the session ended.
     * 
     * @param stopTimestamp
     *        The date and time when the session ended.
     */

    public void setStopTimestamp(String stopTimestamp) {
        this.stopTimestamp = stopTimestamp;
    }

    /**
     * The date and time when the session ended.
     * 
     * @return The date and time when the session ended.
     */

    public String getStopTimestamp() {
        return this.stopTimestamp;
    }

    /**
     * The date and time when the session ended.
     * 
     * @param stopTimestamp
     *        The date and time when the session ended.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Session withStopTimestamp(String stopTimestamp) {
        setStopTimestamp(stopTimestamp);
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
        if (getDuration() != null)
            sb.append("Duration: ").append(getDuration()).append(",");
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getStartTimestamp() != null)
            sb.append("StartTimestamp: ").append(getStartTimestamp()).append(",");
        if (getStopTimestamp() != null)
            sb.append("StopTimestamp: ").append(getStopTimestamp());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Session == false)
            return false;
        Session other = (Session) obj;
        if (other.getDuration() == null ^ this.getDuration() == null)
            return false;
        if (other.getDuration() != null && other.getDuration().equals(this.getDuration()) == false)
            return false;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getStartTimestamp() == null ^ this.getStartTimestamp() == null)
            return false;
        if (other.getStartTimestamp() != null && other.getStartTimestamp().equals(this.getStartTimestamp()) == false)
            return false;
        if (other.getStopTimestamp() == null ^ this.getStopTimestamp() == null)
            return false;
        if (other.getStopTimestamp() != null && other.getStopTimestamp().equals(this.getStopTimestamp()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDuration() == null) ? 0 : getDuration().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getStartTimestamp() == null) ? 0 : getStartTimestamp().hashCode());
        hashCode = prime * hashCode + ((getStopTimestamp() == null) ? 0 : getStopTimestamp().hashCode());
        return hashCode;
    }

    @Override
    public Session clone() {
        try {
            return (Session) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.pinpoint.model.transform.SessionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
