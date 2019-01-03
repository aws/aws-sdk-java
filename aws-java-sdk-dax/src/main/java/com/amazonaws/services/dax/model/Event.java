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
package com.amazonaws.services.dax.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Represents a single occurrence of something interesting within the system. Some examples of events are creating a DAX
 * cluster, adding or removing a node, or rebooting a node.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dax-2017-04-19/Event" target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Event implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The source of the event. For example, if the event occurred at the node level, the source would be the node ID.
     * </p>
     */
    private String sourceName;
    /**
     * <p>
     * Specifies the origin of this event - a cluster, a parameter group, a node ID, etc.
     * </p>
     */
    private String sourceType;
    /**
     * <p>
     * A user-defined message associated with the event.
     * </p>
     */
    private String message;
    /**
     * <p>
     * The date and time when the event occurred.
     * </p>
     */
    private java.util.Date date;

    /**
     * <p>
     * The source of the event. For example, if the event occurred at the node level, the source would be the node ID.
     * </p>
     * 
     * @param sourceName
     *        The source of the event. For example, if the event occurred at the node level, the source would be the
     *        node ID.
     */

    public void setSourceName(String sourceName) {
        this.sourceName = sourceName;
    }

    /**
     * <p>
     * The source of the event. For example, if the event occurred at the node level, the source would be the node ID.
     * </p>
     * 
     * @return The source of the event. For example, if the event occurred at the node level, the source would be the
     *         node ID.
     */

    public String getSourceName() {
        return this.sourceName;
    }

    /**
     * <p>
     * The source of the event. For example, if the event occurred at the node level, the source would be the node ID.
     * </p>
     * 
     * @param sourceName
     *        The source of the event. For example, if the event occurred at the node level, the source would be the
     *        node ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Event withSourceName(String sourceName) {
        setSourceName(sourceName);
        return this;
    }

    /**
     * <p>
     * Specifies the origin of this event - a cluster, a parameter group, a node ID, etc.
     * </p>
     * 
     * @param sourceType
     *        Specifies the origin of this event - a cluster, a parameter group, a node ID, etc.
     * @see SourceType
     */

    public void setSourceType(String sourceType) {
        this.sourceType = sourceType;
    }

    /**
     * <p>
     * Specifies the origin of this event - a cluster, a parameter group, a node ID, etc.
     * </p>
     * 
     * @return Specifies the origin of this event - a cluster, a parameter group, a node ID, etc.
     * @see SourceType
     */

    public String getSourceType() {
        return this.sourceType;
    }

    /**
     * <p>
     * Specifies the origin of this event - a cluster, a parameter group, a node ID, etc.
     * </p>
     * 
     * @param sourceType
     *        Specifies the origin of this event - a cluster, a parameter group, a node ID, etc.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SourceType
     */

    public Event withSourceType(String sourceType) {
        setSourceType(sourceType);
        return this;
    }

    /**
     * <p>
     * Specifies the origin of this event - a cluster, a parameter group, a node ID, etc.
     * </p>
     * 
     * @param sourceType
     *        Specifies the origin of this event - a cluster, a parameter group, a node ID, etc.
     * @see SourceType
     */

    public void setSourceType(SourceType sourceType) {
        withSourceType(sourceType);
    }

    /**
     * <p>
     * Specifies the origin of this event - a cluster, a parameter group, a node ID, etc.
     * </p>
     * 
     * @param sourceType
     *        Specifies the origin of this event - a cluster, a parameter group, a node ID, etc.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SourceType
     */

    public Event withSourceType(SourceType sourceType) {
        this.sourceType = sourceType.toString();
        return this;
    }

    /**
     * <p>
     * A user-defined message associated with the event.
     * </p>
     * 
     * @param message
     *        A user-defined message associated with the event.
     */

    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * <p>
     * A user-defined message associated with the event.
     * </p>
     * 
     * @return A user-defined message associated with the event.
     */

    public String getMessage() {
        return this.message;
    }

    /**
     * <p>
     * A user-defined message associated with the event.
     * </p>
     * 
     * @param message
     *        A user-defined message associated with the event.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Event withMessage(String message) {
        setMessage(message);
        return this;
    }

    /**
     * <p>
     * The date and time when the event occurred.
     * </p>
     * 
     * @param date
     *        The date and time when the event occurred.
     */

    public void setDate(java.util.Date date) {
        this.date = date;
    }

    /**
     * <p>
     * The date and time when the event occurred.
     * </p>
     * 
     * @return The date and time when the event occurred.
     */

    public java.util.Date getDate() {
        return this.date;
    }

    /**
     * <p>
     * The date and time when the event occurred.
     * </p>
     * 
     * @param date
     *        The date and time when the event occurred.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Event withDate(java.util.Date date) {
        setDate(date);
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
        if (getSourceName() != null)
            sb.append("SourceName: ").append(getSourceName()).append(",");
        if (getSourceType() != null)
            sb.append("SourceType: ").append(getSourceType()).append(",");
        if (getMessage() != null)
            sb.append("Message: ").append(getMessage()).append(",");
        if (getDate() != null)
            sb.append("Date: ").append(getDate());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Event == false)
            return false;
        Event other = (Event) obj;
        if (other.getSourceName() == null ^ this.getSourceName() == null)
            return false;
        if (other.getSourceName() != null && other.getSourceName().equals(this.getSourceName()) == false)
            return false;
        if (other.getSourceType() == null ^ this.getSourceType() == null)
            return false;
        if (other.getSourceType() != null && other.getSourceType().equals(this.getSourceType()) == false)
            return false;
        if (other.getMessage() == null ^ this.getMessage() == null)
            return false;
        if (other.getMessage() != null && other.getMessage().equals(this.getMessage()) == false)
            return false;
        if (other.getDate() == null ^ this.getDate() == null)
            return false;
        if (other.getDate() != null && other.getDate().equals(this.getDate()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSourceName() == null) ? 0 : getSourceName().hashCode());
        hashCode = prime * hashCode + ((getSourceType() == null) ? 0 : getSourceType().hashCode());
        hashCode = prime * hashCode + ((getMessage() == null) ? 0 : getMessage().hashCode());
        hashCode = prime * hashCode + ((getDate() == null) ? 0 : getDate().hashCode());
        return hashCode;
    }

    @Override
    public Event clone() {
        try {
            return (Event) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.dax.model.transform.EventMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
