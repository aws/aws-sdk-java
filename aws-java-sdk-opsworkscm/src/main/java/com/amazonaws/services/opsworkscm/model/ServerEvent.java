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
package com.amazonaws.services.opsworkscm.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An event that is related to the server, such as the start of maintenance or backup.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opsworkscm-2016-11-01/ServerEvent" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ServerEvent implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The time when the event occurred.
     * </p>
     */
    private java.util.Date createdAt;
    /**
     * <p>
     * The name of the server on or for which the event occurred.
     * </p>
     */
    private String serverName;
    /**
     * <p>
     * A human-readable informational or status message.
     * </p>
     */
    private String message;
    /**
     * <p>
     * The Amazon S3 URL of the event's log file.
     * </p>
     */
    private String logUrl;

    /**
     * <p>
     * The time when the event occurred.
     * </p>
     * 
     * @param createdAt
     *        The time when the event occurred.
     */

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * The time when the event occurred.
     * </p>
     * 
     * @return The time when the event occurred.
     */

    public java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    /**
     * <p>
     * The time when the event occurred.
     * </p>
     * 
     * @param createdAt
     *        The time when the event occurred.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServerEvent withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
        return this;
    }

    /**
     * <p>
     * The name of the server on or for which the event occurred.
     * </p>
     * 
     * @param serverName
     *        The name of the server on or for which the event occurred.
     */

    public void setServerName(String serverName) {
        this.serverName = serverName;
    }

    /**
     * <p>
     * The name of the server on or for which the event occurred.
     * </p>
     * 
     * @return The name of the server on or for which the event occurred.
     */

    public String getServerName() {
        return this.serverName;
    }

    /**
     * <p>
     * The name of the server on or for which the event occurred.
     * </p>
     * 
     * @param serverName
     *        The name of the server on or for which the event occurred.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServerEvent withServerName(String serverName) {
        setServerName(serverName);
        return this;
    }

    /**
     * <p>
     * A human-readable informational or status message.
     * </p>
     * 
     * @param message
     *        A human-readable informational or status message.
     */

    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * <p>
     * A human-readable informational or status message.
     * </p>
     * 
     * @return A human-readable informational or status message.
     */

    public String getMessage() {
        return this.message;
    }

    /**
     * <p>
     * A human-readable informational or status message.
     * </p>
     * 
     * @param message
     *        A human-readable informational or status message.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServerEvent withMessage(String message) {
        setMessage(message);
        return this;
    }

    /**
     * <p>
     * The Amazon S3 URL of the event's log file.
     * </p>
     * 
     * @param logUrl
     *        The Amazon S3 URL of the event's log file.
     */

    public void setLogUrl(String logUrl) {
        this.logUrl = logUrl;
    }

    /**
     * <p>
     * The Amazon S3 URL of the event's log file.
     * </p>
     * 
     * @return The Amazon S3 URL of the event's log file.
     */

    public String getLogUrl() {
        return this.logUrl;
    }

    /**
     * <p>
     * The Amazon S3 URL of the event's log file.
     * </p>
     * 
     * @param logUrl
     *        The Amazon S3 URL of the event's log file.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServerEvent withLogUrl(String logUrl) {
        setLogUrl(logUrl);
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
        if (getCreatedAt() != null)
            sb.append("CreatedAt: ").append(getCreatedAt()).append(",");
        if (getServerName() != null)
            sb.append("ServerName: ").append(getServerName()).append(",");
        if (getMessage() != null)
            sb.append("Message: ").append(getMessage()).append(",");
        if (getLogUrl() != null)
            sb.append("LogUrl: ").append(getLogUrl());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ServerEvent == false)
            return false;
        ServerEvent other = (ServerEvent) obj;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        if (other.getServerName() == null ^ this.getServerName() == null)
            return false;
        if (other.getServerName() != null && other.getServerName().equals(this.getServerName()) == false)
            return false;
        if (other.getMessage() == null ^ this.getMessage() == null)
            return false;
        if (other.getMessage() != null && other.getMessage().equals(this.getMessage()) == false)
            return false;
        if (other.getLogUrl() == null ^ this.getLogUrl() == null)
            return false;
        if (other.getLogUrl() != null && other.getLogUrl().equals(this.getLogUrl()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getServerName() == null) ? 0 : getServerName().hashCode());
        hashCode = prime * hashCode + ((getMessage() == null) ? 0 : getMessage().hashCode());
        hashCode = prime * hashCode + ((getLogUrl() == null) ? 0 : getLogUrl().hashCode());
        return hashCode;
    }

    @Override
    public ServerEvent clone() {
        try {
            return (ServerEvent) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.opsworkscm.model.transform.ServerEventMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
