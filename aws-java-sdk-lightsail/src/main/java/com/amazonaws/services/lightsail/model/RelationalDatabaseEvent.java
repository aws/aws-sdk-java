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
package com.amazonaws.services.lightsail.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes an event for a database.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/RelationalDatabaseEvent" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RelationalDatabaseEvent implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The database that the database event relates to.
     * </p>
     */
    private String resource;
    /**
     * <p>
     * The timestamp when the database event was created.
     * </p>
     */
    private java.util.Date createdAt;
    /**
     * <p>
     * The message of the database event.
     * </p>
     */
    private String message;
    /**
     * <p>
     * The category that the database event belongs to.
     * </p>
     */
    private java.util.List<String> eventCategories;

    /**
     * <p>
     * The database that the database event relates to.
     * </p>
     * 
     * @param resource
     *        The database that the database event relates to.
     */

    public void setResource(String resource) {
        this.resource = resource;
    }

    /**
     * <p>
     * The database that the database event relates to.
     * </p>
     * 
     * @return The database that the database event relates to.
     */

    public String getResource() {
        return this.resource;
    }

    /**
     * <p>
     * The database that the database event relates to.
     * </p>
     * 
     * @param resource
     *        The database that the database event relates to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RelationalDatabaseEvent withResource(String resource) {
        setResource(resource);
        return this;
    }

    /**
     * <p>
     * The timestamp when the database event was created.
     * </p>
     * 
     * @param createdAt
     *        The timestamp when the database event was created.
     */

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * The timestamp when the database event was created.
     * </p>
     * 
     * @return The timestamp when the database event was created.
     */

    public java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    /**
     * <p>
     * The timestamp when the database event was created.
     * </p>
     * 
     * @param createdAt
     *        The timestamp when the database event was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RelationalDatabaseEvent withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
        return this;
    }

    /**
     * <p>
     * The message of the database event.
     * </p>
     * 
     * @param message
     *        The message of the database event.
     */

    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * <p>
     * The message of the database event.
     * </p>
     * 
     * @return The message of the database event.
     */

    public String getMessage() {
        return this.message;
    }

    /**
     * <p>
     * The message of the database event.
     * </p>
     * 
     * @param message
     *        The message of the database event.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RelationalDatabaseEvent withMessage(String message) {
        setMessage(message);
        return this;
    }

    /**
     * <p>
     * The category that the database event belongs to.
     * </p>
     * 
     * @return The category that the database event belongs to.
     */

    public java.util.List<String> getEventCategories() {
        return eventCategories;
    }

    /**
     * <p>
     * The category that the database event belongs to.
     * </p>
     * 
     * @param eventCategories
     *        The category that the database event belongs to.
     */

    public void setEventCategories(java.util.Collection<String> eventCategories) {
        if (eventCategories == null) {
            this.eventCategories = null;
            return;
        }

        this.eventCategories = new java.util.ArrayList<String>(eventCategories);
    }

    /**
     * <p>
     * The category that the database event belongs to.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEventCategories(java.util.Collection)} or {@link #withEventCategories(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param eventCategories
     *        The category that the database event belongs to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RelationalDatabaseEvent withEventCategories(String... eventCategories) {
        if (this.eventCategories == null) {
            setEventCategories(new java.util.ArrayList<String>(eventCategories.length));
        }
        for (String ele : eventCategories) {
            this.eventCategories.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The category that the database event belongs to.
     * </p>
     * 
     * @param eventCategories
     *        The category that the database event belongs to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RelationalDatabaseEvent withEventCategories(java.util.Collection<String> eventCategories) {
        setEventCategories(eventCategories);
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
        if (getResource() != null)
            sb.append("Resource: ").append(getResource()).append(",");
        if (getCreatedAt() != null)
            sb.append("CreatedAt: ").append(getCreatedAt()).append(",");
        if (getMessage() != null)
            sb.append("Message: ").append(getMessage()).append(",");
        if (getEventCategories() != null)
            sb.append("EventCategories: ").append(getEventCategories());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RelationalDatabaseEvent == false)
            return false;
        RelationalDatabaseEvent other = (RelationalDatabaseEvent) obj;
        if (other.getResource() == null ^ this.getResource() == null)
            return false;
        if (other.getResource() != null && other.getResource().equals(this.getResource()) == false)
            return false;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        if (other.getMessage() == null ^ this.getMessage() == null)
            return false;
        if (other.getMessage() != null && other.getMessage().equals(this.getMessage()) == false)
            return false;
        if (other.getEventCategories() == null ^ this.getEventCategories() == null)
            return false;
        if (other.getEventCategories() != null && other.getEventCategories().equals(this.getEventCategories()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getResource() == null) ? 0 : getResource().hashCode());
        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getMessage() == null) ? 0 : getMessage().hashCode());
        hashCode = prime * hashCode + ((getEventCategories() == null) ? 0 : getEventCategories().hashCode());
        return hashCode;
    }

    @Override
    public RelationalDatabaseEvent clone() {
        try {
            return (RelationalDatabaseEvent) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lightsail.model.transform.RelationalDatabaseEventMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
