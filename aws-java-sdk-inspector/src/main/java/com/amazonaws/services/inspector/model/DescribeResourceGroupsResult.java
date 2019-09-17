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
package com.amazonaws.services.inspector.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/inspector-2016-02-16/DescribeResourceGroups" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeResourceGroupsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Information about a resource group.
     * </p>
     */
    private java.util.List<ResourceGroup> resourceGroups;
    /**
     * <p>
     * Resource group details that cannot be described. An error code is provided for each failed item.
     * </p>
     */
    private java.util.Map<String, FailedItemDetails> failedItems;

    /**
     * <p>
     * Information about a resource group.
     * </p>
     * 
     * @return Information about a resource group.
     */

    public java.util.List<ResourceGroup> getResourceGroups() {
        return resourceGroups;
    }

    /**
     * <p>
     * Information about a resource group.
     * </p>
     * 
     * @param resourceGroups
     *        Information about a resource group.
     */

    public void setResourceGroups(java.util.Collection<ResourceGroup> resourceGroups) {
        if (resourceGroups == null) {
            this.resourceGroups = null;
            return;
        }

        this.resourceGroups = new java.util.ArrayList<ResourceGroup>(resourceGroups);
    }

    /**
     * <p>
     * Information about a resource group.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setResourceGroups(java.util.Collection)} or {@link #withResourceGroups(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param resourceGroups
     *        Information about a resource group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeResourceGroupsResult withResourceGroups(ResourceGroup... resourceGroups) {
        if (this.resourceGroups == null) {
            setResourceGroups(new java.util.ArrayList<ResourceGroup>(resourceGroups.length));
        }
        for (ResourceGroup ele : resourceGroups) {
            this.resourceGroups.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Information about a resource group.
     * </p>
     * 
     * @param resourceGroups
     *        Information about a resource group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeResourceGroupsResult withResourceGroups(java.util.Collection<ResourceGroup> resourceGroups) {
        setResourceGroups(resourceGroups);
        return this;
    }

    /**
     * <p>
     * Resource group details that cannot be described. An error code is provided for each failed item.
     * </p>
     * 
     * @return Resource group details that cannot be described. An error code is provided for each failed item.
     */

    public java.util.Map<String, FailedItemDetails> getFailedItems() {
        return failedItems;
    }

    /**
     * <p>
     * Resource group details that cannot be described. An error code is provided for each failed item.
     * </p>
     * 
     * @param failedItems
     *        Resource group details that cannot be described. An error code is provided for each failed item.
     */

    public void setFailedItems(java.util.Map<String, FailedItemDetails> failedItems) {
        this.failedItems = failedItems;
    }

    /**
     * <p>
     * Resource group details that cannot be described. An error code is provided for each failed item.
     * </p>
     * 
     * @param failedItems
     *        Resource group details that cannot be described. An error code is provided for each failed item.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeResourceGroupsResult withFailedItems(java.util.Map<String, FailedItemDetails> failedItems) {
        setFailedItems(failedItems);
        return this;
    }

    public DescribeResourceGroupsResult addFailedItemsEntry(String key, FailedItemDetails value) {
        if (null == this.failedItems) {
            this.failedItems = new java.util.HashMap<String, FailedItemDetails>();
        }
        if (this.failedItems.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.failedItems.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into FailedItems.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeResourceGroupsResult clearFailedItemsEntries() {
        this.failedItems = null;
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
        if (getResourceGroups() != null)
            sb.append("ResourceGroups: ").append(getResourceGroups()).append(",");
        if (getFailedItems() != null)
            sb.append("FailedItems: ").append(getFailedItems());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeResourceGroupsResult == false)
            return false;
        DescribeResourceGroupsResult other = (DescribeResourceGroupsResult) obj;
        if (other.getResourceGroups() == null ^ this.getResourceGroups() == null)
            return false;
        if (other.getResourceGroups() != null && other.getResourceGroups().equals(this.getResourceGroups()) == false)
            return false;
        if (other.getFailedItems() == null ^ this.getFailedItems() == null)
            return false;
        if (other.getFailedItems() != null && other.getFailedItems().equals(this.getFailedItems()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getResourceGroups() == null) ? 0 : getResourceGroups().hashCode());
        hashCode = prime * hashCode + ((getFailedItems() == null) ? 0 : getFailedItems().hashCode());
        return hashCode;
    }

    @Override
    public DescribeResourceGroupsResult clone() {
        try {
            return (DescribeResourceGroupsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
