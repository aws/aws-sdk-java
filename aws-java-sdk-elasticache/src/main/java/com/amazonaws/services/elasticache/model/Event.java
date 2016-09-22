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
package com.amazonaws.services.elasticache.model;

import java.io.Serializable;

/**
 * <p>
 * Represents a single occurrence of something interesting within the system. Some examples of events are creating a
 * cache cluster, adding or removing a cache node, or rebooting a node.
 * </p>
 */
public class Event implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier for the source of the event. For example, if the event occurred at the cache cluster level, the
     * identifier would be the name of the cache cluster.
     * </p>
     */
    private String sourceIdentifier;
    /**
     * <p>
     * Specifies the origin of this event - a cache cluster, a parameter group, a security group, etc.
     * </p>
     */
    private String sourceType;
    /**
     * <p>
     * The text of the event.
     * </p>
     */
    private String message;
    /**
     * <p>
     * The date and time when the event occurred.
     * </p>
     */
    private java.util.Date dateValue;

    /**
     * <p>
     * The identifier for the source of the event. For example, if the event occurred at the cache cluster level, the
     * identifier would be the name of the cache cluster.
     * </p>
     * 
     * @param sourceIdentifier
     *        The identifier for the source of the event. For example, if the event occurred at the cache cluster level,
     *        the identifier would be the name of the cache cluster.
     */

    public void setSourceIdentifier(String sourceIdentifier) {
        this.sourceIdentifier = sourceIdentifier;
    }

    /**
     * <p>
     * The identifier for the source of the event. For example, if the event occurred at the cache cluster level, the
     * identifier would be the name of the cache cluster.
     * </p>
     * 
     * @return The identifier for the source of the event. For example, if the event occurred at the cache cluster
     *         level, the identifier would be the name of the cache cluster.
     */

    public String getSourceIdentifier() {
        return this.sourceIdentifier;
    }

    /**
     * <p>
     * The identifier for the source of the event. For example, if the event occurred at the cache cluster level, the
     * identifier would be the name of the cache cluster.
     * </p>
     * 
     * @param sourceIdentifier
     *        The identifier for the source of the event. For example, if the event occurred at the cache cluster level,
     *        the identifier would be the name of the cache cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Event withSourceIdentifier(String sourceIdentifier) {
        setSourceIdentifier(sourceIdentifier);
        return this;
    }

    /**
     * <p>
     * Specifies the origin of this event - a cache cluster, a parameter group, a security group, etc.
     * </p>
     * 
     * @param sourceType
     *        Specifies the origin of this event - a cache cluster, a parameter group, a security group, etc.
     * @see SourceType
     */

    public void setSourceType(String sourceType) {
        this.sourceType = sourceType;
    }

    /**
     * <p>
     * Specifies the origin of this event - a cache cluster, a parameter group, a security group, etc.
     * </p>
     * 
     * @return Specifies the origin of this event - a cache cluster, a parameter group, a security group, etc.
     * @see SourceType
     */

    public String getSourceType() {
        return this.sourceType;
    }

    /**
     * <p>
     * Specifies the origin of this event - a cache cluster, a parameter group, a security group, etc.
     * </p>
     * 
     * @param sourceType
     *        Specifies the origin of this event - a cache cluster, a parameter group, a security group, etc.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SourceType
     */

    public Event withSourceType(String sourceType) {
        setSourceType(sourceType);
        return this;
    }

    /**
     * <p>
     * Specifies the origin of this event - a cache cluster, a parameter group, a security group, etc.
     * </p>
     * 
     * @param sourceType
     *        Specifies the origin of this event - a cache cluster, a parameter group, a security group, etc.
     * @see SourceType
     */

    public void setSourceType(SourceType sourceType) {
        this.sourceType = sourceType.toString();
    }

    /**
     * <p>
     * Specifies the origin of this event - a cache cluster, a parameter group, a security group, etc.
     * </p>
     * 
     * @param sourceType
     *        Specifies the origin of this event - a cache cluster, a parameter group, a security group, etc.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SourceType
     */

    public Event withSourceType(SourceType sourceType) {
        setSourceType(sourceType);
        return this;
    }

    /**
     * <p>
     * The text of the event.
     * </p>
     * 
     * @param message
     *        The text of the event.
     */

    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * <p>
     * The text of the event.
     * </p>
     * 
     * @return The text of the event.
     */

    public String getMessage() {
        return this.message;
    }

    /**
     * <p>
     * The text of the event.
     * </p>
     * 
     * @param message
     *        The text of the event.
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
     * @param dateValue
     *        The date and time when the event occurred.
     */

    public void setDate(java.util.Date dateValue) {
        this.dateValue = dateValue;
    }

    /**
     * <p>
     * The date and time when the event occurred.
     * </p>
     * 
     * @return The date and time when the event occurred.
     */

    public java.util.Date getDate() {
        return this.dateValue;
    }

    /**
     * <p>
     * The date and time when the event occurred.
     * </p>
     * 
     * @param dateValue
     *        The date and time when the event occurred.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Event withDate(java.util.Date dateValue) {
        setDate(dateValue);
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
        if (getSourceIdentifier() != null)
            sb.append("SourceIdentifier: " + getSourceIdentifier() + ",");
        if (getSourceType() != null)
            sb.append("SourceType: " + getSourceType() + ",");
        if (getMessage() != null)
            sb.append("Message: " + getMessage() + ",");
        if (getDate() != null)
            sb.append("Date: " + getDate());
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
        if (other.getSourceIdentifier() == null ^ this.getSourceIdentifier() == null)
            return false;
        if (other.getSourceIdentifier() != null && other.getSourceIdentifier().equals(this.getSourceIdentifier()) == false)
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

        hashCode = prime * hashCode + ((getSourceIdentifier() == null) ? 0 : getSourceIdentifier().hashCode());
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
}
