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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Describes a resource statement.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/ResourceStatementRequest" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ResourceStatementRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The resources.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> resources;
    /**
     * <p>
     * The resource types.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> resourceTypes;

    /**
     * <p>
     * The resources.
     * </p>
     * 
     * @return The resources.
     */

    public java.util.List<String> getResources() {
        if (resources == null) {
            resources = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return resources;
    }

    /**
     * <p>
     * The resources.
     * </p>
     * 
     * @param resources
     *        The resources.
     */

    public void setResources(java.util.Collection<String> resources) {
        if (resources == null) {
            this.resources = null;
            return;
        }

        this.resources = new com.amazonaws.internal.SdkInternalList<String>(resources);
    }

    /**
     * <p>
     * The resources.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setResources(java.util.Collection)} or {@link #withResources(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param resources
     *        The resources.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceStatementRequest withResources(String... resources) {
        if (this.resources == null) {
            setResources(new com.amazonaws.internal.SdkInternalList<String>(resources.length));
        }
        for (String ele : resources) {
            this.resources.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The resources.
     * </p>
     * 
     * @param resources
     *        The resources.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceStatementRequest withResources(java.util.Collection<String> resources) {
        setResources(resources);
        return this;
    }

    /**
     * <p>
     * The resource types.
     * </p>
     * 
     * @return The resource types.
     */

    public java.util.List<String> getResourceTypes() {
        if (resourceTypes == null) {
            resourceTypes = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return resourceTypes;
    }

    /**
     * <p>
     * The resource types.
     * </p>
     * 
     * @param resourceTypes
     *        The resource types.
     */

    public void setResourceTypes(java.util.Collection<String> resourceTypes) {
        if (resourceTypes == null) {
            this.resourceTypes = null;
            return;
        }

        this.resourceTypes = new com.amazonaws.internal.SdkInternalList<String>(resourceTypes);
    }

    /**
     * <p>
     * The resource types.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setResourceTypes(java.util.Collection)} or {@link #withResourceTypes(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param resourceTypes
     *        The resource types.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceStatementRequest withResourceTypes(String... resourceTypes) {
        if (this.resourceTypes == null) {
            setResourceTypes(new com.amazonaws.internal.SdkInternalList<String>(resourceTypes.length));
        }
        for (String ele : resourceTypes) {
            this.resourceTypes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The resource types.
     * </p>
     * 
     * @param resourceTypes
     *        The resource types.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceStatementRequest withResourceTypes(java.util.Collection<String> resourceTypes) {
        setResourceTypes(resourceTypes);
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
        if (getResources() != null)
            sb.append("Resources: ").append(getResources()).append(",");
        if (getResourceTypes() != null)
            sb.append("ResourceTypes: ").append(getResourceTypes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ResourceStatementRequest == false)
            return false;
        ResourceStatementRequest other = (ResourceStatementRequest) obj;
        if (other.getResources() == null ^ this.getResources() == null)
            return false;
        if (other.getResources() != null && other.getResources().equals(this.getResources()) == false)
            return false;
        if (other.getResourceTypes() == null ^ this.getResourceTypes() == null)
            return false;
        if (other.getResourceTypes() != null && other.getResourceTypes().equals(this.getResourceTypes()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getResources() == null) ? 0 : getResources().hashCode());
        hashCode = prime * hashCode + ((getResourceTypes() == null) ? 0 : getResourceTypes().hashCode());
        return hashCode;
    }

    @Override
    public ResourceStatementRequest clone() {
        try {
            return (ResourceStatementRequest) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
