/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.ecs.model;

import java.io.Serializable;

/**
 * <p>
 * Details on an event associated with a service.
 * </p>
 */
public class ServiceEvent implements Serializable, Cloneable {

    /**
     * The ID string of the event.
     */
    private String id;

    /**
     * The Unix time in seconds and milliseconds when the event was
     * triggered.
     */
    private java.util.Date createdAt;

    /**
     * The event message.
     */
    private String message;

    /**
     * The ID string of the event.
     *
     * @return The ID string of the event.
     */
    public String getId() {
        return id;
    }
    
    /**
     * The ID string of the event.
     *
     * @param id The ID string of the event.
     */
    public void setId(String id) {
        this.id = id;
    }
    
    /**
     * The ID string of the event.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param id The ID string of the event.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ServiceEvent withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * The Unix time in seconds and milliseconds when the event was
     * triggered.
     *
     * @return The Unix time in seconds and milliseconds when the event was
     *         triggered.
     */
    public java.util.Date getCreatedAt() {
        return createdAt;
    }
    
    /**
     * The Unix time in seconds and milliseconds when the event was
     * triggered.
     *
     * @param createdAt The Unix time in seconds and milliseconds when the event was
     *         triggered.
     */
    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }
    
    /**
     * The Unix time in seconds and milliseconds when the event was
     * triggered.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param createdAt The Unix time in seconds and milliseconds when the event was
     *         triggered.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ServiceEvent withCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * The event message.
     *
     * @return The event message.
     */
    public String getMessage() {
        return message;
    }
    
    /**
     * The event message.
     *
     * @param message The event message.
     */
    public void setMessage(String message) {
        this.message = message;
    }
    
    /**
     * The event message.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param message The event message.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ServiceEvent withMessage(String message) {
        this.message = message;
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
        if (getId() != null) sb.append("Id: " + getId() + ",");
        if (getCreatedAt() != null) sb.append("CreatedAt: " + getCreatedAt() + ",");
        if (getMessage() != null) sb.append("Message: " + getMessage() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode()); 
        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode()); 
        hashCode = prime * hashCode + ((getMessage() == null) ? 0 : getMessage().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ServiceEvent == false) return false;
        ServiceEvent other = (ServiceEvent)obj;
        
        if (other.getId() == null ^ this.getId() == null) return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false) return false; 
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null) return false;
        if (other.getCreatedAt() != null && other.getCreatedAt().equals(this.getCreatedAt()) == false) return false; 
        if (other.getMessage() == null ^ this.getMessage() == null) return false;
        if (other.getMessage() != null && other.getMessage().equals(this.getMessage()) == false) return false; 
        return true;
    }
    
    @Override
    public ServiceEvent clone() {
        try {
            return (ServiceEvent) super.clone();
        
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                    + "even though we're Cloneable!",
                    e);
        }
        
    }

}
    