/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.elasticache.model;

import java.io.Serializable;


/**
 * <p>
 * Represents a single occurrence of something interesting within the system. Some examples of events are creating a cache cluster, adding or removing a
 * cache node, or rebooting a node.
 * </p>
 */
public class Event implements Serializable {

    /**
     * The identifier for the source of the event. For example, if the event
     * occurred at the cache cluster level, the identifier would be the name
     * of the cache cluster.
     */
    private String sourceIdentifier;

    /**
     * Specifies the origin of this event - a cache cluster, a parameter
     * group, a security group, etc.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>cache-cluster, cache-parameter-group, cache-security-group, cache-subnet-group
     */
    private String sourceType;

    /**
     * The text of the event.
     */
    private String message;

    /**
     * The date and time when the event occurred.
     */
    private java.util.Date date;

    /**
     * Default constructor for a new Event object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public Event() {}
    
    /**
     * The identifier for the source of the event. For example, if the event
     * occurred at the cache cluster level, the identifier would be the name
     * of the cache cluster.
     *
     * @return The identifier for the source of the event. For example, if the event
     *         occurred at the cache cluster level, the identifier would be the name
     *         of the cache cluster.
     */
    public String getSourceIdentifier() {
        return sourceIdentifier;
    }
    
    /**
     * The identifier for the source of the event. For example, if the event
     * occurred at the cache cluster level, the identifier would be the name
     * of the cache cluster.
     *
     * @param sourceIdentifier The identifier for the source of the event. For example, if the event
     *         occurred at the cache cluster level, the identifier would be the name
     *         of the cache cluster.
     */
    public void setSourceIdentifier(String sourceIdentifier) {
        this.sourceIdentifier = sourceIdentifier;
    }
    
    /**
     * The identifier for the source of the event. For example, if the event
     * occurred at the cache cluster level, the identifier would be the name
     * of the cache cluster.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param sourceIdentifier The identifier for the source of the event. For example, if the event
     *         occurred at the cache cluster level, the identifier would be the name
     *         of the cache cluster.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Event withSourceIdentifier(String sourceIdentifier) {
        this.sourceIdentifier = sourceIdentifier;
        return this;
    }

    /**
     * Specifies the origin of this event - a cache cluster, a parameter
     * group, a security group, etc.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>cache-cluster, cache-parameter-group, cache-security-group, cache-subnet-group
     *
     * @return Specifies the origin of this event - a cache cluster, a parameter
     *         group, a security group, etc.
     *
     * @see SourceType
     */
    public String getSourceType() {
        return sourceType;
    }
    
    /**
     * Specifies the origin of this event - a cache cluster, a parameter
     * group, a security group, etc.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>cache-cluster, cache-parameter-group, cache-security-group, cache-subnet-group
     *
     * @param sourceType Specifies the origin of this event - a cache cluster, a parameter
     *         group, a security group, etc.
     *
     * @see SourceType
     */
    public void setSourceType(String sourceType) {
        this.sourceType = sourceType;
    }
    
    /**
     * Specifies the origin of this event - a cache cluster, a parameter
     * group, a security group, etc.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>cache-cluster, cache-parameter-group, cache-security-group, cache-subnet-group
     *
     * @param sourceType Specifies the origin of this event - a cache cluster, a parameter
     *         group, a security group, etc.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     *
     * @see SourceType
     */
    public Event withSourceType(String sourceType) {
        this.sourceType = sourceType;
        return this;
    }

    /**
     * Specifies the origin of this event - a cache cluster, a parameter
     * group, a security group, etc.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>cache-cluster, cache-parameter-group, cache-security-group, cache-subnet-group
     *
     * @param sourceType Specifies the origin of this event - a cache cluster, a parameter
     *         group, a security group, etc.
     *
     * @see SourceType
     */
    public void setSourceType(SourceType sourceType) {
        this.sourceType = sourceType.toString();
    }
    
    /**
     * Specifies the origin of this event - a cache cluster, a parameter
     * group, a security group, etc.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>cache-cluster, cache-parameter-group, cache-security-group, cache-subnet-group
     *
     * @param sourceType Specifies the origin of this event - a cache cluster, a parameter
     *         group, a security group, etc.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     *
     * @see SourceType
     */
    public Event withSourceType(SourceType sourceType) {
        this.sourceType = sourceType.toString();
        return this;
    }

    /**
     * The text of the event.
     *
     * @return The text of the event.
     */
    public String getMessage() {
        return message;
    }
    
    /**
     * The text of the event.
     *
     * @param message The text of the event.
     */
    public void setMessage(String message) {
        this.message = message;
    }
    
    /**
     * The text of the event.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param message The text of the event.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Event withMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * The date and time when the event occurred.
     *
     * @return The date and time when the event occurred.
     */
    public java.util.Date getDate() {
        return date;
    }
    
    /**
     * The date and time when the event occurred.
     *
     * @param date The date and time when the event occurred.
     */
    public void setDate(java.util.Date date) {
        this.date = date;
    }
    
    /**
     * The date and time when the event occurred.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param date The date and time when the event occurred.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Event withDate(java.util.Date date) {
        this.date = date;
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getSourceIdentifier() != null) sb.append("SourceIdentifier: " + getSourceIdentifier() + ",");
        if (getSourceType() != null) sb.append("SourceType: " + getSourceType() + ",");
        if (getMessage() != null) sb.append("Message: " + getMessage() + ",");
        if (getDate() != null) sb.append("Date: " + getDate() );
        sb.append("}");
        return sb.toString();
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
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof Event == false) return false;
        Event other = (Event)obj;
        
        if (other.getSourceIdentifier() == null ^ this.getSourceIdentifier() == null) return false;
        if (other.getSourceIdentifier() != null && other.getSourceIdentifier().equals(this.getSourceIdentifier()) == false) return false; 
        if (other.getSourceType() == null ^ this.getSourceType() == null) return false;
        if (other.getSourceType() != null && other.getSourceType().equals(this.getSourceType()) == false) return false; 
        if (other.getMessage() == null ^ this.getMessage() == null) return false;
        if (other.getMessage() != null && other.getMessage().equals(this.getMessage()) == false) return false; 
        if (other.getDate() == null ^ this.getDate() == null) return false;
        if (other.getDate() != null && other.getDate().equals(this.getDate()) == false) return false; 
        return true;
    }
    
}
    