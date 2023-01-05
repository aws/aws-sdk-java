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
package com.amazonaws.services.resiliencehub.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Defines a resource that is not supported by Resilience Hub.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resiliencehub-2020-04-30/UnsupportedResource" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UnsupportedResource implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The logical resource identifier for the unsupported resource.
     * </p>
     */
    private LogicalResourceId logicalResourceId;
    /**
     * <p>
     * The physical resource identifier for the unsupported resource.
     * </p>
     */
    private PhysicalResourceId physicalResourceId;
    /**
     * <p>
     * The type of resource.
     * </p>
     */
    private String resourceType;

    /**
     * <p>
     * The logical resource identifier for the unsupported resource.
     * </p>
     * 
     * @param logicalResourceId
     *        The logical resource identifier for the unsupported resource.
     */

    public void setLogicalResourceId(LogicalResourceId logicalResourceId) {
        this.logicalResourceId = logicalResourceId;
    }

    /**
     * <p>
     * The logical resource identifier for the unsupported resource.
     * </p>
     * 
     * @return The logical resource identifier for the unsupported resource.
     */

    public LogicalResourceId getLogicalResourceId() {
        return this.logicalResourceId;
    }

    /**
     * <p>
     * The logical resource identifier for the unsupported resource.
     * </p>
     * 
     * @param logicalResourceId
     *        The logical resource identifier for the unsupported resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UnsupportedResource withLogicalResourceId(LogicalResourceId logicalResourceId) {
        setLogicalResourceId(logicalResourceId);
        return this;
    }

    /**
     * <p>
     * The physical resource identifier for the unsupported resource.
     * </p>
     * 
     * @param physicalResourceId
     *        The physical resource identifier for the unsupported resource.
     */

    public void setPhysicalResourceId(PhysicalResourceId physicalResourceId) {
        this.physicalResourceId = physicalResourceId;
    }

    /**
     * <p>
     * The physical resource identifier for the unsupported resource.
     * </p>
     * 
     * @return The physical resource identifier for the unsupported resource.
     */

    public PhysicalResourceId getPhysicalResourceId() {
        return this.physicalResourceId;
    }

    /**
     * <p>
     * The physical resource identifier for the unsupported resource.
     * </p>
     * 
     * @param physicalResourceId
     *        The physical resource identifier for the unsupported resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UnsupportedResource withPhysicalResourceId(PhysicalResourceId physicalResourceId) {
        setPhysicalResourceId(physicalResourceId);
        return this;
    }

    /**
     * <p>
     * The type of resource.
     * </p>
     * 
     * @param resourceType
     *        The type of resource.
     */

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * <p>
     * The type of resource.
     * </p>
     * 
     * @return The type of resource.
     */

    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * <p>
     * The type of resource.
     * </p>
     * 
     * @param resourceType
     *        The type of resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UnsupportedResource withResourceType(String resourceType) {
        setResourceType(resourceType);
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
        if (getLogicalResourceId() != null)
            sb.append("LogicalResourceId: ").append(getLogicalResourceId()).append(",");
        if (getPhysicalResourceId() != null)
            sb.append("PhysicalResourceId: ").append(getPhysicalResourceId()).append(",");
        if (getResourceType() != null)
            sb.append("ResourceType: ").append(getResourceType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UnsupportedResource == false)
            return false;
        UnsupportedResource other = (UnsupportedResource) obj;
        if (other.getLogicalResourceId() == null ^ this.getLogicalResourceId() == null)
            return false;
        if (other.getLogicalResourceId() != null && other.getLogicalResourceId().equals(this.getLogicalResourceId()) == false)
            return false;
        if (other.getPhysicalResourceId() == null ^ this.getPhysicalResourceId() == null)
            return false;
        if (other.getPhysicalResourceId() != null && other.getPhysicalResourceId().equals(this.getPhysicalResourceId()) == false)
            return false;
        if (other.getResourceType() == null ^ this.getResourceType() == null)
            return false;
        if (other.getResourceType() != null && other.getResourceType().equals(this.getResourceType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLogicalResourceId() == null) ? 0 : getLogicalResourceId().hashCode());
        hashCode = prime * hashCode + ((getPhysicalResourceId() == null) ? 0 : getPhysicalResourceId().hashCode());
        hashCode = prime * hashCode + ((getResourceType() == null) ? 0 : getResourceType().hashCode());
        return hashCode;
    }

    @Override
    public UnsupportedResource clone() {
        try {
            return (UnsupportedResource) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.resiliencehub.model.transform.UnsupportedResourceMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
