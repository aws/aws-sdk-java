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
package com.amazonaws.services.devopsguru.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about the resource that is being monitored, including the name of the resource, the type of resource, and
 * whether or not permission is given to DevOps Guru to access that resource.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devops-guru-2020-12-01/MonitoredResourceIdentifier"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MonitoredResourceIdentifier implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the resource being monitored.
     * </p>
     */
    private String monitoredResourceName;
    /**
     * <p>
     * The type of resource being monitored.
     * </p>
     */
    private String type;
    /**
     * <p>
     * The permission status of a resource.
     * </p>
     */
    private String resourcePermission;
    /**
     * <p>
     * The time at which DevOps Guru last updated this resource.
     * </p>
     */
    private java.util.Date lastUpdated;

    private ResourceCollection resourceCollection;

    /**
     * <p>
     * The name of the resource being monitored.
     * </p>
     * 
     * @param monitoredResourceName
     *        The name of the resource being monitored.
     */

    public void setMonitoredResourceName(String monitoredResourceName) {
        this.monitoredResourceName = monitoredResourceName;
    }

    /**
     * <p>
     * The name of the resource being monitored.
     * </p>
     * 
     * @return The name of the resource being monitored.
     */

    public String getMonitoredResourceName() {
        return this.monitoredResourceName;
    }

    /**
     * <p>
     * The name of the resource being monitored.
     * </p>
     * 
     * @param monitoredResourceName
     *        The name of the resource being monitored.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MonitoredResourceIdentifier withMonitoredResourceName(String monitoredResourceName) {
        setMonitoredResourceName(monitoredResourceName);
        return this;
    }

    /**
     * <p>
     * The type of resource being monitored.
     * </p>
     * 
     * @param type
     *        The type of resource being monitored.
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of resource being monitored.
     * </p>
     * 
     * @return The type of resource being monitored.
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of resource being monitored.
     * </p>
     * 
     * @param type
     *        The type of resource being monitored.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MonitoredResourceIdentifier withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The permission status of a resource.
     * </p>
     * 
     * @param resourcePermission
     *        The permission status of a resource.
     * @see ResourcePermission
     */

    public void setResourcePermission(String resourcePermission) {
        this.resourcePermission = resourcePermission;
    }

    /**
     * <p>
     * The permission status of a resource.
     * </p>
     * 
     * @return The permission status of a resource.
     * @see ResourcePermission
     */

    public String getResourcePermission() {
        return this.resourcePermission;
    }

    /**
     * <p>
     * The permission status of a resource.
     * </p>
     * 
     * @param resourcePermission
     *        The permission status of a resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResourcePermission
     */

    public MonitoredResourceIdentifier withResourcePermission(String resourcePermission) {
        setResourcePermission(resourcePermission);
        return this;
    }

    /**
     * <p>
     * The permission status of a resource.
     * </p>
     * 
     * @param resourcePermission
     *        The permission status of a resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResourcePermission
     */

    public MonitoredResourceIdentifier withResourcePermission(ResourcePermission resourcePermission) {
        this.resourcePermission = resourcePermission.toString();
        return this;
    }

    /**
     * <p>
     * The time at which DevOps Guru last updated this resource.
     * </p>
     * 
     * @param lastUpdated
     *        The time at which DevOps Guru last updated this resource.
     */

    public void setLastUpdated(java.util.Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    /**
     * <p>
     * The time at which DevOps Guru last updated this resource.
     * </p>
     * 
     * @return The time at which DevOps Guru last updated this resource.
     */

    public java.util.Date getLastUpdated() {
        return this.lastUpdated;
    }

    /**
     * <p>
     * The time at which DevOps Guru last updated this resource.
     * </p>
     * 
     * @param lastUpdated
     *        The time at which DevOps Guru last updated this resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MonitoredResourceIdentifier withLastUpdated(java.util.Date lastUpdated) {
        setLastUpdated(lastUpdated);
        return this;
    }

    /**
     * @param resourceCollection
     */

    public void setResourceCollection(ResourceCollection resourceCollection) {
        this.resourceCollection = resourceCollection;
    }

    /**
     * @return
     */

    public ResourceCollection getResourceCollection() {
        return this.resourceCollection;
    }

    /**
     * @param resourceCollection
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MonitoredResourceIdentifier withResourceCollection(ResourceCollection resourceCollection) {
        setResourceCollection(resourceCollection);
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
        if (getMonitoredResourceName() != null)
            sb.append("MonitoredResourceName: ").append(getMonitoredResourceName()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getResourcePermission() != null)
            sb.append("ResourcePermission: ").append(getResourcePermission()).append(",");
        if (getLastUpdated() != null)
            sb.append("LastUpdated: ").append(getLastUpdated()).append(",");
        if (getResourceCollection() != null)
            sb.append("ResourceCollection: ").append(getResourceCollection());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MonitoredResourceIdentifier == false)
            return false;
        MonitoredResourceIdentifier other = (MonitoredResourceIdentifier) obj;
        if (other.getMonitoredResourceName() == null ^ this.getMonitoredResourceName() == null)
            return false;
        if (other.getMonitoredResourceName() != null && other.getMonitoredResourceName().equals(this.getMonitoredResourceName()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getResourcePermission() == null ^ this.getResourcePermission() == null)
            return false;
        if (other.getResourcePermission() != null && other.getResourcePermission().equals(this.getResourcePermission()) == false)
            return false;
        if (other.getLastUpdated() == null ^ this.getLastUpdated() == null)
            return false;
        if (other.getLastUpdated() != null && other.getLastUpdated().equals(this.getLastUpdated()) == false)
            return false;
        if (other.getResourceCollection() == null ^ this.getResourceCollection() == null)
            return false;
        if (other.getResourceCollection() != null && other.getResourceCollection().equals(this.getResourceCollection()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMonitoredResourceName() == null) ? 0 : getMonitoredResourceName().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getResourcePermission() == null) ? 0 : getResourcePermission().hashCode());
        hashCode = prime * hashCode + ((getLastUpdated() == null) ? 0 : getLastUpdated().hashCode());
        hashCode = prime * hashCode + ((getResourceCollection() == null) ? 0 : getResourceCollection().hashCode());
        return hashCode;
    }

    @Override
    public MonitoredResourceIdentifier clone() {
        try {
            return (MonitoredResourceIdentifier) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.devopsguru.model.transform.MonitoredResourceIdentifierMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
