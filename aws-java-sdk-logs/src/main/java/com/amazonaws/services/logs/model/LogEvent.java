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
package com.amazonaws.services.logs.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * This structure contains the information for one sample log event that is associated with an anomaly found by a log
 * anomaly detector.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/logs-2014-03-28/LogEvent" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LogEvent implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The time stamp of the log event.
     * </p>
     */
    private Long timestamp;
    /**
     * <p>
     * The message content of the log event.
     * </p>
     */
    private String message;

    /**
     * <p>
     * The time stamp of the log event.
     * </p>
     * 
     * @param timestamp
     *        The time stamp of the log event.
     */

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    /**
     * <p>
     * The time stamp of the log event.
     * </p>
     * 
     * @return The time stamp of the log event.
     */

    public Long getTimestamp() {
        return this.timestamp;
    }

    /**
     * <p>
     * The time stamp of the log event.
     * </p>
     * 
     * @param timestamp
     *        The time stamp of the log event.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LogEvent withTimestamp(Long timestamp) {
        setTimestamp(timestamp);
        return this;
    }

    /**
     * <p>
     * The message content of the log event.
     * </p>
     * 
     * @param message
     *        The message content of the log event.
     */

    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * <p>
     * The message content of the log event.
     * </p>
     * 
     * @return The message content of the log event.
     */

    public String getMessage() {
        return this.message;
    }

    /**
     * <p>
     * The message content of the log event.
     * </p>
     * 
     * @param message
     *        The message content of the log event.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LogEvent withMessage(String message) {
        setMessage(message);
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
        if (getTimestamp() != null)
            sb.append("Timestamp: ").append(getTimestamp()).append(",");
        if (getMessage() != null)
            sb.append("Message: ").append(getMessage());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LogEvent == false)
            return false;
        LogEvent other = (LogEvent) obj;
        if (other.getTimestamp() == null ^ this.getTimestamp() == null)
            return false;
        if (other.getTimestamp() != null && other.getTimestamp().equals(this.getTimestamp()) == false)
            return false;
        if (other.getMessage() == null ^ this.getMessage() == null)
            return false;
        if (other.getMessage() != null && other.getMessage().equals(this.getMessage()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTimestamp() == null) ? 0 : getTimestamp().hashCode());
        hashCode = prime * hashCode + ((getMessage() == null) ? 0 : getMessage().hashCode());
        return hashCode;
    }

    @Override
    public LogEvent clone() {
        try {
            return (LogEvent) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.logs.model.transform.LogEventMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
