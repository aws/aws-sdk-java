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
 * Either a count, remaining count, or a version number in a delete inventory summary.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/InventoryDeletionSummaryItem" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InventoryDeletionSummaryItem implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The inventory type version.
     * </p>
     */
    private String version;
    /**
     * <p>
     * A count of the number of deleted items.
     * </p>
     */
    private Integer count;
    /**
     * <p>
     * The remaining number of items to delete.
     * </p>
     */
    private Integer remainingCount;

    /**
     * <p>
     * The inventory type version.
     * </p>
     * 
     * @param version
     *        The inventory type version.
     */

    public void setVersion(String version) {
        this.version = version;
    }

    /**
     * <p>
     * The inventory type version.
     * </p>
     * 
     * @return The inventory type version.
     */

    public String getVersion() {
        return this.version;
    }

    /**
     * <p>
     * The inventory type version.
     * </p>
     * 
     * @param version
     *        The inventory type version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InventoryDeletionSummaryItem withVersion(String version) {
        setVersion(version);
        return this;
    }

    /**
     * <p>
     * A count of the number of deleted items.
     * </p>
     * 
     * @param count
     *        A count of the number of deleted items.
     */

    public void setCount(Integer count) {
        this.count = count;
    }

    /**
     * <p>
     * A count of the number of deleted items.
     * </p>
     * 
     * @return A count of the number of deleted items.
     */

    public Integer getCount() {
        return this.count;
    }

    /**
     * <p>
     * A count of the number of deleted items.
     * </p>
     * 
     * @param count
     *        A count of the number of deleted items.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InventoryDeletionSummaryItem withCount(Integer count) {
        setCount(count);
        return this;
    }

    /**
     * <p>
     * The remaining number of items to delete.
     * </p>
     * 
     * @param remainingCount
     *        The remaining number of items to delete.
     */

    public void setRemainingCount(Integer remainingCount) {
        this.remainingCount = remainingCount;
    }

    /**
     * <p>
     * The remaining number of items to delete.
     * </p>
     * 
     * @return The remaining number of items to delete.
     */

    public Integer getRemainingCount() {
        return this.remainingCount;
    }

    /**
     * <p>
     * The remaining number of items to delete.
     * </p>
     * 
     * @param remainingCount
     *        The remaining number of items to delete.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InventoryDeletionSummaryItem withRemainingCount(Integer remainingCount) {
        setRemainingCount(remainingCount);
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
        if (getVersion() != null)
            sb.append("Version: ").append(getVersion()).append(",");
        if (getCount() != null)
            sb.append("Count: ").append(getCount()).append(",");
        if (getRemainingCount() != null)
            sb.append("RemainingCount: ").append(getRemainingCount());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof InventoryDeletionSummaryItem == false)
            return false;
        InventoryDeletionSummaryItem other = (InventoryDeletionSummaryItem) obj;
        if (other.getVersion() == null ^ this.getVersion() == null)
            return false;
        if (other.getVersion() != null && other.getVersion().equals(this.getVersion()) == false)
            return false;
        if (other.getCount() == null ^ this.getCount() == null)
            return false;
        if (other.getCount() != null && other.getCount().equals(this.getCount()) == false)
            return false;
        if (other.getRemainingCount() == null ^ this.getRemainingCount() == null)
            return false;
        if (other.getRemainingCount() != null && other.getRemainingCount().equals(this.getRemainingCount()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getVersion() == null) ? 0 : getVersion().hashCode());
        hashCode = prime * hashCode + ((getCount() == null) ? 0 : getCount().hashCode());
        hashCode = prime * hashCode + ((getRemainingCount() == null) ? 0 : getRemainingCount().hashCode());
        return hashCode;
    }

    @Override
    public InventoryDeletionSummaryItem clone() {
        try {
            return (InventoryDeletionSummaryItem) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.simplesystemsmanagement.model.transform.InventoryDeletionSummaryItemMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
