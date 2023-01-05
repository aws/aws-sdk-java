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
package com.amazonaws.services.costexplorer.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The cost allocation tag status. The status of a key can either be active or inactive.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ce-2017-10-25/CostAllocationTagStatusEntry" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CostAllocationTagStatusEntry implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The key for the cost allocation tag.
     * </p>
     */
    private String tagKey;
    /**
     * <p>
     * The status of a cost allocation tag.
     * </p>
     */
    private String status;

    /**
     * <p>
     * The key for the cost allocation tag.
     * </p>
     * 
     * @param tagKey
     *        The key for the cost allocation tag.
     */

    public void setTagKey(String tagKey) {
        this.tagKey = tagKey;
    }

    /**
     * <p>
     * The key for the cost allocation tag.
     * </p>
     * 
     * @return The key for the cost allocation tag.
     */

    public String getTagKey() {
        return this.tagKey;
    }

    /**
     * <p>
     * The key for the cost allocation tag.
     * </p>
     * 
     * @param tagKey
     *        The key for the cost allocation tag.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CostAllocationTagStatusEntry withTagKey(String tagKey) {
        setTagKey(tagKey);
        return this;
    }

    /**
     * <p>
     * The status of a cost allocation tag.
     * </p>
     * 
     * @param status
     *        The status of a cost allocation tag.
     * @see CostAllocationTagStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of a cost allocation tag.
     * </p>
     * 
     * @return The status of a cost allocation tag.
     * @see CostAllocationTagStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of a cost allocation tag.
     * </p>
     * 
     * @param status
     *        The status of a cost allocation tag.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CostAllocationTagStatus
     */

    public CostAllocationTagStatusEntry withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of a cost allocation tag.
     * </p>
     * 
     * @param status
     *        The status of a cost allocation tag.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CostAllocationTagStatus
     */

    public CostAllocationTagStatusEntry withStatus(CostAllocationTagStatus status) {
        this.status = status.toString();
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
        if (getTagKey() != null)
            sb.append("TagKey: ").append(getTagKey()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CostAllocationTagStatusEntry == false)
            return false;
        CostAllocationTagStatusEntry other = (CostAllocationTagStatusEntry) obj;
        if (other.getTagKey() == null ^ this.getTagKey() == null)
            return false;
        if (other.getTagKey() != null && other.getTagKey().equals(this.getTagKey()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTagKey() == null) ? 0 : getTagKey().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public CostAllocationTagStatusEntry clone() {
        try {
            return (CostAllocationTagStatusEntry) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.costexplorer.model.transform.CostAllocationTagStatusEntryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
