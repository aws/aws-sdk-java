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
 * The details of the resource mentioned in a notification.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/NotificationResource" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class NotificationResource implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ID of the resource mentioned in a notification.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The name of the resource mentioned in a notification.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The type of the resource mentioned in a notification.
     * </p>
     */
    private String type;

    /**
     * <p>
     * The ID of the resource mentioned in a notification.
     * </p>
     * 
     * @param id
     *        The ID of the resource mentioned in a notification.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The ID of the resource mentioned in a notification.
     * </p>
     * 
     * @return The ID of the resource mentioned in a notification.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The ID of the resource mentioned in a notification.
     * </p>
     * 
     * @param id
     *        The ID of the resource mentioned in a notification.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NotificationResource withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The name of the resource mentioned in a notification.
     * </p>
     * 
     * @param name
     *        The name of the resource mentioned in a notification.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the resource mentioned in a notification.
     * </p>
     * 
     * @return The name of the resource mentioned in a notification.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the resource mentioned in a notification.
     * </p>
     * 
     * @param name
     *        The name of the resource mentioned in a notification.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NotificationResource withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The type of the resource mentioned in a notification.
     * </p>
     * 
     * @param type
     *        The type of the resource mentioned in a notification.
     * @see NotificationResourceType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of the resource mentioned in a notification.
     * </p>
     * 
     * @return The type of the resource mentioned in a notification.
     * @see NotificationResourceType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of the resource mentioned in a notification.
     * </p>
     * 
     * @param type
     *        The type of the resource mentioned in a notification.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see NotificationResourceType
     */

    public NotificationResource withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The type of the resource mentioned in a notification.
     * </p>
     * 
     * @param type
     *        The type of the resource mentioned in a notification.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see NotificationResourceType
     */

    public NotificationResource withType(NotificationResourceType type) {
        this.type = type.toString();
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof NotificationResource == false)
            return false;
        NotificationResource other = (NotificationResource) obj;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        return hashCode;
    }

    @Override
    public NotificationResource clone() {
        try {
            return (NotificationResource) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.datazone.model.transform.NotificationResourceMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
