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
 * Filters to determine which monitored resources you want to retrieve. You can filter by resource type or resource
 * permission status.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devops-guru-2020-12-01/ListMonitoredResourcesFilters"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListMonitoredResourcesFilters implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The permission status of a resource.
     * </p>
     */
    private String resourcePermission;
    /**
     * <p>
     * The type of resource that you wish to retrieve, such as log groups.
     * </p>
     */
    private java.util.List<String> resourceTypeFilters;

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

    public ListMonitoredResourcesFilters withResourcePermission(String resourcePermission) {
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

    public ListMonitoredResourcesFilters withResourcePermission(ResourcePermission resourcePermission) {
        this.resourcePermission = resourcePermission.toString();
        return this;
    }

    /**
     * <p>
     * The type of resource that you wish to retrieve, such as log groups.
     * </p>
     * 
     * @return The type of resource that you wish to retrieve, such as log groups.
     * @see ResourceTypeFilter
     */

    public java.util.List<String> getResourceTypeFilters() {
        return resourceTypeFilters;
    }

    /**
     * <p>
     * The type of resource that you wish to retrieve, such as log groups.
     * </p>
     * 
     * @param resourceTypeFilters
     *        The type of resource that you wish to retrieve, such as log groups.
     * @see ResourceTypeFilter
     */

    public void setResourceTypeFilters(java.util.Collection<String> resourceTypeFilters) {
        if (resourceTypeFilters == null) {
            this.resourceTypeFilters = null;
            return;
        }

        this.resourceTypeFilters = new java.util.ArrayList<String>(resourceTypeFilters);
    }

    /**
     * <p>
     * The type of resource that you wish to retrieve, such as log groups.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setResourceTypeFilters(java.util.Collection)} or {@link #withResourceTypeFilters(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param resourceTypeFilters
     *        The type of resource that you wish to retrieve, such as log groups.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResourceTypeFilter
     */

    public ListMonitoredResourcesFilters withResourceTypeFilters(String... resourceTypeFilters) {
        if (this.resourceTypeFilters == null) {
            setResourceTypeFilters(new java.util.ArrayList<String>(resourceTypeFilters.length));
        }
        for (String ele : resourceTypeFilters) {
            this.resourceTypeFilters.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The type of resource that you wish to retrieve, such as log groups.
     * </p>
     * 
     * @param resourceTypeFilters
     *        The type of resource that you wish to retrieve, such as log groups.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResourceTypeFilter
     */

    public ListMonitoredResourcesFilters withResourceTypeFilters(java.util.Collection<String> resourceTypeFilters) {
        setResourceTypeFilters(resourceTypeFilters);
        return this;
    }

    /**
     * <p>
     * The type of resource that you wish to retrieve, such as log groups.
     * </p>
     * 
     * @param resourceTypeFilters
     *        The type of resource that you wish to retrieve, such as log groups.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResourceTypeFilter
     */

    public ListMonitoredResourcesFilters withResourceTypeFilters(ResourceTypeFilter... resourceTypeFilters) {
        java.util.ArrayList<String> resourceTypeFiltersCopy = new java.util.ArrayList<String>(resourceTypeFilters.length);
        for (ResourceTypeFilter value : resourceTypeFilters) {
            resourceTypeFiltersCopy.add(value.toString());
        }
        if (getResourceTypeFilters() == null) {
            setResourceTypeFilters(resourceTypeFiltersCopy);
        } else {
            getResourceTypeFilters().addAll(resourceTypeFiltersCopy);
        }
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
        if (getResourcePermission() != null)
            sb.append("ResourcePermission: ").append(getResourcePermission()).append(",");
        if (getResourceTypeFilters() != null)
            sb.append("ResourceTypeFilters: ").append(getResourceTypeFilters());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListMonitoredResourcesFilters == false)
            return false;
        ListMonitoredResourcesFilters other = (ListMonitoredResourcesFilters) obj;
        if (other.getResourcePermission() == null ^ this.getResourcePermission() == null)
            return false;
        if (other.getResourcePermission() != null && other.getResourcePermission().equals(this.getResourcePermission()) == false)
            return false;
        if (other.getResourceTypeFilters() == null ^ this.getResourceTypeFilters() == null)
            return false;
        if (other.getResourceTypeFilters() != null && other.getResourceTypeFilters().equals(this.getResourceTypeFilters()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getResourcePermission() == null) ? 0 : getResourcePermission().hashCode());
        hashCode = prime * hashCode + ((getResourceTypeFilters() == null) ? 0 : getResourceTypeFilters().hashCode());
        return hashCode;
    }

    @Override
    public ListMonitoredResourcesFilters clone() {
        try {
            return (ListMonitoredResourcesFilters) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.devopsguru.model.transform.ListMonitoredResourcesFiltersMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
