/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights
 * Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.services.inspector.model;

import java.io.Serializable;

/**
 * 
 */
public class DescribeResourceGroupResult implements Serializable, Cloneable {

    /**
     * <p>
     * Information about the resource group.
     * </p>
     */
    private ResourceGroup resourceGroup;

    /**
     * <p>
     * Information about the resource group.
     * </p>
     * 
     * @param resourceGroup
     *        Information about the resource group.
     */
    public void setResourceGroup(ResourceGroup resourceGroup) {
        this.resourceGroup = resourceGroup;
    }

    /**
     * <p>
     * Information about the resource group.
     * </p>
     * 
     * @return Information about the resource group.
     */
    public ResourceGroup getResourceGroup() {
        return this.resourceGroup;
    }

    /**
     * <p>
     * Information about the resource group.
     * </p>
     * 
     * @param resourceGroup
     *        Information about the resource group.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public DescribeResourceGroupResult withResourceGroup(
            ResourceGroup resourceGroup) {
        setResourceGroup(resourceGroup);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getResourceGroup() != null)
            sb.append("ResourceGroup: " + getResourceGroup());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeResourceGroupResult == false)
            return false;
        DescribeResourceGroupResult other = (DescribeResourceGroupResult) obj;
        if (other.getResourceGroup() == null ^ this.getResourceGroup() == null)
            return false;
        if (other.getResourceGroup() != null
                && other.getResourceGroup().equals(this.getResourceGroup()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getResourceGroup() == null) ? 0 : getResourceGroup()
                        .hashCode());
        return hashCode;
    }

    @Override
    public DescribeResourceGroupResult clone() {
        try {
            return (DescribeResourceGroupResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}