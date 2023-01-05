/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.resourceexplorer2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A structure that describes a property of a resource.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resource-explorer-2-2022-07-28/ResourceProperty"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ResourceProperty implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The date and time that the information about this resource property was last updated.
     * </p>
     */
    private java.util.Date lastReportedAt;
    /**
     * <p>
     * The name of this property of the resource.
     * </p>
     */
    private String name;

    /**
     * <p>
     * The date and time that the information about this resource property was last updated.
     * </p>
     * 
     * @param lastReportedAt
     *        The date and time that the information about this resource property was last updated.
     */

    public void setLastReportedAt(java.util.Date lastReportedAt) {
        this.lastReportedAt = lastReportedAt;
    }

    /**
     * <p>
     * The date and time that the information about this resource property was last updated.
     * </p>
     * 
     * @return The date and time that the information about this resource property was last updated.
     */

    public java.util.Date getLastReportedAt() {
        return this.lastReportedAt;
    }

    /**
     * <p>
     * The date and time that the information about this resource property was last updated.
     * </p>
     * 
     * @param lastReportedAt
     *        The date and time that the information about this resource property was last updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceProperty withLastReportedAt(java.util.Date lastReportedAt) {
        setLastReportedAt(lastReportedAt);
        return this;
    }

    /**
     * <p>
     * The name of this property of the resource.
     * </p>
     * 
     * @param name
     *        The name of this property of the resource.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of this property of the resource.
     * </p>
     * 
     * @return The name of this property of the resource.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of this property of the resource.
     * </p>
     * 
     * @param name
     *        The name of this property of the resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceProperty withName(String name) {
        setName(name);
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
        if (getLastReportedAt() != null)
            sb.append("LastReportedAt: ").append(getLastReportedAt()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ResourceProperty == false)
            return false;
        ResourceProperty other = (ResourceProperty) obj;
        if (other.getLastReportedAt() == null ^ this.getLastReportedAt() == null)
            return false;
        if (other.getLastReportedAt() != null && other.getLastReportedAt().equals(this.getLastReportedAt()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLastReportedAt() == null) ? 0 : getLastReportedAt().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        return hashCode;
    }

    @Override
    public ResourceProperty clone() {
        try {
            return (ResourceProperty) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.resourceexplorer2.model.transform.ResourcePropertyMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
