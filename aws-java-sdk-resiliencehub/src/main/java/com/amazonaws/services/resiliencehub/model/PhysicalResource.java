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
 * Defines a physical resource. A physical resource is a resource that exists in your account. It can be identified
 * using an Amazon Resource Name (ARN) or a Resilience Hub-native identifier.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resiliencehub-2020-04-30/PhysicalResource" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PhysicalResource implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The application components that belong to this resource.
     * </p>
     */
    private java.util.List<AppComponent> appComponents;
    /**
     * <p>
     * The logical identifier of the resource.
     * </p>
     */
    private LogicalResourceId logicalResourceId;
    /**
     * <p>
     * The physical identifier of the resource.
     * </p>
     */
    private PhysicalResourceId physicalResourceId;
    /**
     * <p>
     * The name of the resource.
     * </p>
     */
    private String resourceName;
    /**
     * <p>
     * The type of resource.
     * </p>
     */
    private String resourceType;

    /**
     * <p>
     * The application components that belong to this resource.
     * </p>
     * 
     * @return The application components that belong to this resource.
     */

    public java.util.List<AppComponent> getAppComponents() {
        return appComponents;
    }

    /**
     * <p>
     * The application components that belong to this resource.
     * </p>
     * 
     * @param appComponents
     *        The application components that belong to this resource.
     */

    public void setAppComponents(java.util.Collection<AppComponent> appComponents) {
        if (appComponents == null) {
            this.appComponents = null;
            return;
        }

        this.appComponents = new java.util.ArrayList<AppComponent>(appComponents);
    }

    /**
     * <p>
     * The application components that belong to this resource.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAppComponents(java.util.Collection)} or {@link #withAppComponents(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param appComponents
     *        The application components that belong to this resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PhysicalResource withAppComponents(AppComponent... appComponents) {
        if (this.appComponents == null) {
            setAppComponents(new java.util.ArrayList<AppComponent>(appComponents.length));
        }
        for (AppComponent ele : appComponents) {
            this.appComponents.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The application components that belong to this resource.
     * </p>
     * 
     * @param appComponents
     *        The application components that belong to this resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PhysicalResource withAppComponents(java.util.Collection<AppComponent> appComponents) {
        setAppComponents(appComponents);
        return this;
    }

    /**
     * <p>
     * The logical identifier of the resource.
     * </p>
     * 
     * @param logicalResourceId
     *        The logical identifier of the resource.
     */

    public void setLogicalResourceId(LogicalResourceId logicalResourceId) {
        this.logicalResourceId = logicalResourceId;
    }

    /**
     * <p>
     * The logical identifier of the resource.
     * </p>
     * 
     * @return The logical identifier of the resource.
     */

    public LogicalResourceId getLogicalResourceId() {
        return this.logicalResourceId;
    }

    /**
     * <p>
     * The logical identifier of the resource.
     * </p>
     * 
     * @param logicalResourceId
     *        The logical identifier of the resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PhysicalResource withLogicalResourceId(LogicalResourceId logicalResourceId) {
        setLogicalResourceId(logicalResourceId);
        return this;
    }

    /**
     * <p>
     * The physical identifier of the resource.
     * </p>
     * 
     * @param physicalResourceId
     *        The physical identifier of the resource.
     */

    public void setPhysicalResourceId(PhysicalResourceId physicalResourceId) {
        this.physicalResourceId = physicalResourceId;
    }

    /**
     * <p>
     * The physical identifier of the resource.
     * </p>
     * 
     * @return The physical identifier of the resource.
     */

    public PhysicalResourceId getPhysicalResourceId() {
        return this.physicalResourceId;
    }

    /**
     * <p>
     * The physical identifier of the resource.
     * </p>
     * 
     * @param physicalResourceId
     *        The physical identifier of the resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PhysicalResource withPhysicalResourceId(PhysicalResourceId physicalResourceId) {
        setPhysicalResourceId(physicalResourceId);
        return this;
    }

    /**
     * <p>
     * The name of the resource.
     * </p>
     * 
     * @param resourceName
     *        The name of the resource.
     */

    public void setResourceName(String resourceName) {
        this.resourceName = resourceName;
    }

    /**
     * <p>
     * The name of the resource.
     * </p>
     * 
     * @return The name of the resource.
     */

    public String getResourceName() {
        return this.resourceName;
    }

    /**
     * <p>
     * The name of the resource.
     * </p>
     * 
     * @param resourceName
     *        The name of the resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PhysicalResource withResourceName(String resourceName) {
        setResourceName(resourceName);
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

    public PhysicalResource withResourceType(String resourceType) {
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
        if (getAppComponents() != null)
            sb.append("AppComponents: ").append(getAppComponents()).append(",");
        if (getLogicalResourceId() != null)
            sb.append("LogicalResourceId: ").append(getLogicalResourceId()).append(",");
        if (getPhysicalResourceId() != null)
            sb.append("PhysicalResourceId: ").append(getPhysicalResourceId()).append(",");
        if (getResourceName() != null)
            sb.append("ResourceName: ").append(getResourceName()).append(",");
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

        if (obj instanceof PhysicalResource == false)
            return false;
        PhysicalResource other = (PhysicalResource) obj;
        if (other.getAppComponents() == null ^ this.getAppComponents() == null)
            return false;
        if (other.getAppComponents() != null && other.getAppComponents().equals(this.getAppComponents()) == false)
            return false;
        if (other.getLogicalResourceId() == null ^ this.getLogicalResourceId() == null)
            return false;
        if (other.getLogicalResourceId() != null && other.getLogicalResourceId().equals(this.getLogicalResourceId()) == false)
            return false;
        if (other.getPhysicalResourceId() == null ^ this.getPhysicalResourceId() == null)
            return false;
        if (other.getPhysicalResourceId() != null && other.getPhysicalResourceId().equals(this.getPhysicalResourceId()) == false)
            return false;
        if (other.getResourceName() == null ^ this.getResourceName() == null)
            return false;
        if (other.getResourceName() != null && other.getResourceName().equals(this.getResourceName()) == false)
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

        hashCode = prime * hashCode + ((getAppComponents() == null) ? 0 : getAppComponents().hashCode());
        hashCode = prime * hashCode + ((getLogicalResourceId() == null) ? 0 : getLogicalResourceId().hashCode());
        hashCode = prime * hashCode + ((getPhysicalResourceId() == null) ? 0 : getPhysicalResourceId().hashCode());
        hashCode = prime * hashCode + ((getResourceName() == null) ? 0 : getResourceName().hashCode());
        hashCode = prime * hashCode + ((getResourceType() == null) ? 0 : getResourceType().hashCode());
        return hashCode;
    }

    @Override
    public PhysicalResource clone() {
        try {
            return (PhysicalResource) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.resiliencehub.model.transform.PhysicalResourceMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
