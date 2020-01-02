/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.applicationinsights.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/application-insights-2018-11-25/UpdateComponent"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateComponentRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the resource group.
     * </p>
     */
    private String resourceGroupName;
    /**
     * <p>
     * The name of the component.
     * </p>
     */
    private String componentName;
    /**
     * <p>
     * The new name of the component.
     * </p>
     */
    private String newComponentName;
    /**
     * <p>
     * The list of resource ARNs that belong to the component.
     * </p>
     */
    private java.util.List<String> resourceList;

    /**
     * <p>
     * The name of the resource group.
     * </p>
     * 
     * @param resourceGroupName
     *        The name of the resource group.
     */

    public void setResourceGroupName(String resourceGroupName) {
        this.resourceGroupName = resourceGroupName;
    }

    /**
     * <p>
     * The name of the resource group.
     * </p>
     * 
     * @return The name of the resource group.
     */

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * <p>
     * The name of the resource group.
     * </p>
     * 
     * @param resourceGroupName
     *        The name of the resource group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateComponentRequest withResourceGroupName(String resourceGroupName) {
        setResourceGroupName(resourceGroupName);
        return this;
    }

    /**
     * <p>
     * The name of the component.
     * </p>
     * 
     * @param componentName
     *        The name of the component.
     */

    public void setComponentName(String componentName) {
        this.componentName = componentName;
    }

    /**
     * <p>
     * The name of the component.
     * </p>
     * 
     * @return The name of the component.
     */

    public String getComponentName() {
        return this.componentName;
    }

    /**
     * <p>
     * The name of the component.
     * </p>
     * 
     * @param componentName
     *        The name of the component.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateComponentRequest withComponentName(String componentName) {
        setComponentName(componentName);
        return this;
    }

    /**
     * <p>
     * The new name of the component.
     * </p>
     * 
     * @param newComponentName
     *        The new name of the component.
     */

    public void setNewComponentName(String newComponentName) {
        this.newComponentName = newComponentName;
    }

    /**
     * <p>
     * The new name of the component.
     * </p>
     * 
     * @return The new name of the component.
     */

    public String getNewComponentName() {
        return this.newComponentName;
    }

    /**
     * <p>
     * The new name of the component.
     * </p>
     * 
     * @param newComponentName
     *        The new name of the component.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateComponentRequest withNewComponentName(String newComponentName) {
        setNewComponentName(newComponentName);
        return this;
    }

    /**
     * <p>
     * The list of resource ARNs that belong to the component.
     * </p>
     * 
     * @return The list of resource ARNs that belong to the component.
     */

    public java.util.List<String> getResourceList() {
        return resourceList;
    }

    /**
     * <p>
     * The list of resource ARNs that belong to the component.
     * </p>
     * 
     * @param resourceList
     *        The list of resource ARNs that belong to the component.
     */

    public void setResourceList(java.util.Collection<String> resourceList) {
        if (resourceList == null) {
            this.resourceList = null;
            return;
        }

        this.resourceList = new java.util.ArrayList<String>(resourceList);
    }

    /**
     * <p>
     * The list of resource ARNs that belong to the component.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setResourceList(java.util.Collection)} or {@link #withResourceList(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param resourceList
     *        The list of resource ARNs that belong to the component.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateComponentRequest withResourceList(String... resourceList) {
        if (this.resourceList == null) {
            setResourceList(new java.util.ArrayList<String>(resourceList.length));
        }
        for (String ele : resourceList) {
            this.resourceList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of resource ARNs that belong to the component.
     * </p>
     * 
     * @param resourceList
     *        The list of resource ARNs that belong to the component.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateComponentRequest withResourceList(java.util.Collection<String> resourceList) {
        setResourceList(resourceList);
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
        if (getResourceGroupName() != null)
            sb.append("ResourceGroupName: ").append(getResourceGroupName()).append(",");
        if (getComponentName() != null)
            sb.append("ComponentName: ").append(getComponentName()).append(",");
        if (getNewComponentName() != null)
            sb.append("NewComponentName: ").append(getNewComponentName()).append(",");
        if (getResourceList() != null)
            sb.append("ResourceList: ").append(getResourceList());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateComponentRequest == false)
            return false;
        UpdateComponentRequest other = (UpdateComponentRequest) obj;
        if (other.getResourceGroupName() == null ^ this.getResourceGroupName() == null)
            return false;
        if (other.getResourceGroupName() != null && other.getResourceGroupName().equals(this.getResourceGroupName()) == false)
            return false;
        if (other.getComponentName() == null ^ this.getComponentName() == null)
            return false;
        if (other.getComponentName() != null && other.getComponentName().equals(this.getComponentName()) == false)
            return false;
        if (other.getNewComponentName() == null ^ this.getNewComponentName() == null)
            return false;
        if (other.getNewComponentName() != null && other.getNewComponentName().equals(this.getNewComponentName()) == false)
            return false;
        if (other.getResourceList() == null ^ this.getResourceList() == null)
            return false;
        if (other.getResourceList() != null && other.getResourceList().equals(this.getResourceList()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getResourceGroupName() == null) ? 0 : getResourceGroupName().hashCode());
        hashCode = prime * hashCode + ((getComponentName() == null) ? 0 : getComponentName().hashCode());
        hashCode = prime * hashCode + ((getNewComponentName() == null) ? 0 : getNewComponentName().hashCode());
        hashCode = prime * hashCode + ((getResourceList() == null) ? 0 : getResourceList().hashCode());
        return hashCode;
    }

    @Override
    public UpdateComponentRequest clone() {
        return (UpdateComponentRequest) super.clone();
    }

}
