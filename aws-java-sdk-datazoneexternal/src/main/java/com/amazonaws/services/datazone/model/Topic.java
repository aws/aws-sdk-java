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
package com.amazonaws.services.datazone.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The topic of the notification.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/Topic" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Topic implements Serializable, Cloneable, StructuredPojo {

    private NotificationResource resource;
    /**
     * <p>
     * The role of the resource mentioned in a notification.
     * </p>
     */
    private String role;
    /**
     * <p>
     * The subject of the resource mentioned in a notification.
     * </p>
     */
    private String subject;

    /**
     * @param resource
     */

    public void setResource(NotificationResource resource) {
        this.resource = resource;
    }

    /**
     * @return
     */

    public NotificationResource getResource() {
        return this.resource;
    }

    /**
     * @param resource
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Topic withResource(NotificationResource resource) {
        setResource(resource);
        return this;
    }

    /**
     * <p>
     * The role of the resource mentioned in a notification.
     * </p>
     * 
     * @param role
     *        The role of the resource mentioned in a notification.
     * @see NotificationRole
     */

    public void setRole(String role) {
        this.role = role;
    }

    /**
     * <p>
     * The role of the resource mentioned in a notification.
     * </p>
     * 
     * @return The role of the resource mentioned in a notification.
     * @see NotificationRole
     */

    public String getRole() {
        return this.role;
    }

    /**
     * <p>
     * The role of the resource mentioned in a notification.
     * </p>
     * 
     * @param role
     *        The role of the resource mentioned in a notification.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see NotificationRole
     */

    public Topic withRole(String role) {
        setRole(role);
        return this;
    }

    /**
     * <p>
     * The role of the resource mentioned in a notification.
     * </p>
     * 
     * @param role
     *        The role of the resource mentioned in a notification.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see NotificationRole
     */

    public Topic withRole(NotificationRole role) {
        this.role = role.toString();
        return this;
    }

    /**
     * <p>
     * The subject of the resource mentioned in a notification.
     * </p>
     * 
     * @param subject
     *        The subject of the resource mentioned in a notification.
     */

    public void setSubject(String subject) {
        this.subject = subject;
    }

    /**
     * <p>
     * The subject of the resource mentioned in a notification.
     * </p>
     * 
     * @return The subject of the resource mentioned in a notification.
     */

    public String getSubject() {
        return this.subject;
    }

    /**
     * <p>
     * The subject of the resource mentioned in a notification.
     * </p>
     * 
     * @param subject
     *        The subject of the resource mentioned in a notification.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Topic withSubject(String subject) {
        setSubject(subject);
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
        if (getRole() != null)
            sb.append("Role: ").append(getRole()).append(",");
        if (getSubject() != null)
            sb.append("Subject: ").append(getSubject());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Topic == false)
            return false;
        Topic other = (Topic) obj;
        if (other.getResource() == null ^ this.getResource() == null)
            return false;
        if (other.getResource() != null && other.getResource().equals(this.getResource()) == false)
            return false;
        if (other.getRole() == null ^ this.getRole() == null)
            return false;
        if (other.getRole() != null && other.getRole().equals(this.getRole()) == false)
            return false;
        if (other.getSubject() == null ^ this.getSubject() == null)
            return false;
        if (other.getSubject() != null && other.getSubject().equals(this.getSubject()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getResource() == null) ? 0 : getResource().hashCode());
        hashCode = prime * hashCode + ((getRole() == null) ? 0 : getRole().hashCode());
        hashCode = prime * hashCode + ((getSubject() == null) ? 0 : getSubject().hashCode());
        return hashCode;
    }

    @Override
    public Topic clone() {
        try {
            return (Topic) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.datazone.model.transform.TopicMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
