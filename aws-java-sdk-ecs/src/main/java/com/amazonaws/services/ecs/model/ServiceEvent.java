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
package com.amazonaws.services.ecs.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Details on an event associated with a service.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecs-2014-11-13/ServiceEvent" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ServiceEvent implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ID string of the event.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The Unix timestamp for when the event was triggered.
     * </p>
     */
    private java.util.Date createdAt;
    /**
     * <p>
     * The event message.
     * </p>
     */
    private String message;

    /**
     * <p>
     * The ID string of the event.
     * </p>
     * 
     * @param id
     *        The ID string of the event.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The ID string of the event.
     * </p>
     * 
     * @return The ID string of the event.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The ID string of the event.
     * </p>
     * 
     * @param id
     *        The ID string of the event.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServiceEvent withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The Unix timestamp for when the event was triggered.
     * </p>
     * 
     * @param createdAt
     *        The Unix timestamp for when the event was triggered.
     */

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * The Unix timestamp for when the event was triggered.
     * </p>
     * 
     * @return The Unix timestamp for when the event was triggered.
     */

    public java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    /**
     * <p>
     * The Unix timestamp for when the event was triggered.
     * </p>
     * 
     * @param createdAt
     *        The Unix timestamp for when the event was triggered.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServiceEvent withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
        return this;
    }

    /**
     * <p>
     * The event message.
     * </p>
     * 
     * @param message
     *        The event message.
     */

    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * <p>
     * The event message.
     * </p>
     * 
     * @return The event message.
     */

    public String getMessage() {
        return this.message;
    }

    /**
     * <p>
     * The event message.
     * </p>
     * 
     * @param message
     *        The event message.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServiceEvent withMessage(String message) {
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
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getCreatedAt() != null)
            sb.append("CreatedAt: ").append(getCreatedAt()).append(",");
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

        if (obj instanceof ServiceEvent == false)
            return false;
        ServiceEvent other = (ServiceEvent) obj;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null && other.getCreatedAt().equals(this.getCreatedAt()) == false)
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

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getMessage() == null) ? 0 : getMessage().hashCode());
        return hashCode;
    }

    @Override
    public ServiceEvent clone() {
        try {
            return (ServiceEvent) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.ecs.model.transform.ServiceEventMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
