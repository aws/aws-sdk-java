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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about the delete operation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/InventoryDeletionSummary" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InventoryDeletionSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The total number of items to delete. This count does not change during the delete operation.
     * </p>
     */
    private Integer totalCount;
    /**
     * <p>
     * Remaining number of items to delete.
     * </p>
     */
    private Integer remainingCount;
    /**
     * <p>
     * A list of counts and versions for deleted items.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<InventoryDeletionSummaryItem> summaryItems;

    /**
     * <p>
     * The total number of items to delete. This count does not change during the delete operation.
     * </p>
     * 
     * @param totalCount
     *        The total number of items to delete. This count does not change during the delete operation.
     */

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    /**
     * <p>
     * The total number of items to delete. This count does not change during the delete operation.
     * </p>
     * 
     * @return The total number of items to delete. This count does not change during the delete operation.
     */

    public Integer getTotalCount() {
        return this.totalCount;
    }

    /**
     * <p>
     * The total number of items to delete. This count does not change during the delete operation.
     * </p>
     * 
     * @param totalCount
     *        The total number of items to delete. This count does not change during the delete operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InventoryDeletionSummary withTotalCount(Integer totalCount) {
        setTotalCount(totalCount);
        return this;
    }

    /**
     * <p>
     * Remaining number of items to delete.
     * </p>
     * 
     * @param remainingCount
     *        Remaining number of items to delete.
     */

    public void setRemainingCount(Integer remainingCount) {
        this.remainingCount = remainingCount;
    }

    /**
     * <p>
     * Remaining number of items to delete.
     * </p>
     * 
     * @return Remaining number of items to delete.
     */

    public Integer getRemainingCount() {
        return this.remainingCount;
    }

    /**
     * <p>
     * Remaining number of items to delete.
     * </p>
     * 
     * @param remainingCount
     *        Remaining number of items to delete.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InventoryDeletionSummary withRemainingCount(Integer remainingCount) {
        setRemainingCount(remainingCount);
        return this;
    }

    /**
     * <p>
     * A list of counts and versions for deleted items.
     * </p>
     * 
     * @return A list of counts and versions for deleted items.
     */

    public java.util.List<InventoryDeletionSummaryItem> getSummaryItems() {
        if (summaryItems == null) {
            summaryItems = new com.amazonaws.internal.SdkInternalList<InventoryDeletionSummaryItem>();
        }
        return summaryItems;
    }

    /**
     * <p>
     * A list of counts and versions for deleted items.
     * </p>
     * 
     * @param summaryItems
     *        A list of counts and versions for deleted items.
     */

    public void setSummaryItems(java.util.Collection<InventoryDeletionSummaryItem> summaryItems) {
        if (summaryItems == null) {
            this.summaryItems = null;
            return;
        }

        this.summaryItems = new com.amazonaws.internal.SdkInternalList<InventoryDeletionSummaryItem>(summaryItems);
    }

    /**
     * <p>
     * A list of counts and versions for deleted items.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSummaryItems(java.util.Collection)} or {@link #withSummaryItems(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param summaryItems
     *        A list of counts and versions for deleted items.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InventoryDeletionSummary withSummaryItems(InventoryDeletionSummaryItem... summaryItems) {
        if (this.summaryItems == null) {
            setSummaryItems(new com.amazonaws.internal.SdkInternalList<InventoryDeletionSummaryItem>(summaryItems.length));
        }
        for (InventoryDeletionSummaryItem ele : summaryItems) {
            this.summaryItems.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of counts and versions for deleted items.
     * </p>
     * 
     * @param summaryItems
     *        A list of counts and versions for deleted items.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InventoryDeletionSummary withSummaryItems(java.util.Collection<InventoryDeletionSummaryItem> summaryItems) {
        setSummaryItems(summaryItems);
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
        if (getTotalCount() != null)
            sb.append("TotalCount: ").append(getTotalCount()).append(",");
        if (getRemainingCount() != null)
            sb.append("RemainingCount: ").append(getRemainingCount()).append(",");
        if (getSummaryItems() != null)
            sb.append("SummaryItems: ").append(getSummaryItems());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof InventoryDeletionSummary == false)
            return false;
        InventoryDeletionSummary other = (InventoryDeletionSummary) obj;
        if (other.getTotalCount() == null ^ this.getTotalCount() == null)
            return false;
        if (other.getTotalCount() != null && other.getTotalCount().equals(this.getTotalCount()) == false)
            return false;
        if (other.getRemainingCount() == null ^ this.getRemainingCount() == null)
            return false;
        if (other.getRemainingCount() != null && other.getRemainingCount().equals(this.getRemainingCount()) == false)
            return false;
        if (other.getSummaryItems() == null ^ this.getSummaryItems() == null)
            return false;
        if (other.getSummaryItems() != null && other.getSummaryItems().equals(this.getSummaryItems()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTotalCount() == null) ? 0 : getTotalCount().hashCode());
        hashCode = prime * hashCode + ((getRemainingCount() == null) ? 0 : getRemainingCount().hashCode());
        hashCode = prime * hashCode + ((getSummaryItems() == null) ? 0 : getSummaryItems().hashCode());
        return hashCode;
    }

    @Override
    public InventoryDeletionSummary clone() {
        try {
            return (InventoryDeletionSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.simplesystemsmanagement.model.transform.InventoryDeletionSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
