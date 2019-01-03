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
 * Describes the destination of a record.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/DestinationInfo" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DestinationInfo implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ID of the resource created at the destination.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The destination service of the record.
     * </p>
     */
    private String service;

    /**
     * <p>
     * The ID of the resource created at the destination.
     * </p>
     * 
     * @param id
     *        The ID of the resource created at the destination.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The ID of the resource created at the destination.
     * </p>
     * 
     * @return The ID of the resource created at the destination.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The ID of the resource created at the destination.
     * </p>
     * 
     * @param id
     *        The ID of the resource created at the destination.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DestinationInfo withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The destination service of the record.
     * </p>
     * 
     * @param service
     *        The destination service of the record.
     */

    public void setService(String service) {
        this.service = service;
    }

    /**
     * <p>
     * The destination service of the record.
     * </p>
     * 
     * @return The destination service of the record.
     */

    public String getService() {
        return this.service;
    }

    /**
     * <p>
     * The destination service of the record.
     * </p>
     * 
     * @param service
     *        The destination service of the record.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DestinationInfo withService(String service) {
        setService(service);
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
        if (getService() != null)
            sb.append("Service: ").append(getService());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DestinationInfo == false)
            return false;
        DestinationInfo other = (DestinationInfo) obj;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getService() == null ^ this.getService() == null)
            return false;
        if (other.getService() != null && other.getService().equals(this.getService()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getService() == null) ? 0 : getService().hashCode());
        return hashCode;
    }

    @Override
    public DestinationInfo clone() {
        try {
            return (DestinationInfo) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lightsail.model.transform.DestinationInfoMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
