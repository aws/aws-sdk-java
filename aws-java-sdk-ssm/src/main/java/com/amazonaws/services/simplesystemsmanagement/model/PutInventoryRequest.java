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
package com.amazonaws.services.simplesystemsmanagement.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/PutInventory" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PutInventoryRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * One or more instance IDs where you want to add or update inventory items.
     * </p>
     */
    private String instanceId;
    /**
     * <p>
     * The inventory items that you want to add or update on instances.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<InventoryItem> items;

    /**
     * <p>
     * One or more instance IDs where you want to add or update inventory items.
     * </p>
     * 
     * @param instanceId
     *        One or more instance IDs where you want to add or update inventory items.
     */

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    /**
     * <p>
     * One or more instance IDs where you want to add or update inventory items.
     * </p>
     * 
     * @return One or more instance IDs where you want to add or update inventory items.
     */

    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * <p>
     * One or more instance IDs where you want to add or update inventory items.
     * </p>
     * 
     * @param instanceId
     *        One or more instance IDs where you want to add or update inventory items.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutInventoryRequest withInstanceId(String instanceId) {
        setInstanceId(instanceId);
        return this;
    }

    /**
     * <p>
     * The inventory items that you want to add or update on instances.
     * </p>
     * 
     * @return The inventory items that you want to add or update on instances.
     */

    public java.util.List<InventoryItem> getItems() {
        if (items == null) {
            items = new com.amazonaws.internal.SdkInternalList<InventoryItem>();
        }
        return items;
    }

    /**
     * <p>
     * The inventory items that you want to add or update on instances.
     * </p>
     * 
     * @param items
     *        The inventory items that you want to add or update on instances.
     */

    public void setItems(java.util.Collection<InventoryItem> items) {
        if (items == null) {
            this.items = null;
            return;
        }

        this.items = new com.amazonaws.internal.SdkInternalList<InventoryItem>(items);
    }

    /**
     * <p>
     * The inventory items that you want to add or update on instances.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setItems(java.util.Collection)} or {@link #withItems(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param items
     *        The inventory items that you want to add or update on instances.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutInventoryRequest withItems(InventoryItem... items) {
        if (this.items == null) {
            setItems(new com.amazonaws.internal.SdkInternalList<InventoryItem>(items.length));
        }
        for (InventoryItem ele : items) {
            this.items.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The inventory items that you want to add or update on instances.
     * </p>
     * 
     * @param items
     *        The inventory items that you want to add or update on instances.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutInventoryRequest withItems(java.util.Collection<InventoryItem> items) {
        setItems(items);
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
        if (getInstanceId() != null)
            sb.append("InstanceId: ").append(getInstanceId()).append(",");
        if (getItems() != null)
            sb.append("Items: ").append(getItems());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutInventoryRequest == false)
            return false;
        PutInventoryRequest other = (PutInventoryRequest) obj;
        if (other.getInstanceId() == null ^ this.getInstanceId() == null)
            return false;
        if (other.getInstanceId() != null && other.getInstanceId().equals(this.getInstanceId()) == false)
            return false;
        if (other.getItems() == null ^ this.getItems() == null)
            return false;
        if (other.getItems() != null && other.getItems().equals(this.getItems()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInstanceId() == null) ? 0 : getInstanceId().hashCode());
        hashCode = prime * hashCode + ((getItems() == null) ? 0 : getItems().hashCode());
        return hashCode;
    }

    @Override
    public PutInventoryRequest clone() {
        return (PutInventoryRequest) super.clone();
    }

}
