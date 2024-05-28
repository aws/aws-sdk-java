/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.outposts.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The summary of the capacity task.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/outposts-2019-12-03/CapacityTaskSummary" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CapacityTaskSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ID of the specified capacity task.
     * </p>
     */
    private String capacityTaskId;
    /**
     * <p>
     * The ID of the Outpost associated with the specified capacity task.
     * </p>
     */
    private String outpostId;
    /**
     * <p>
     * The ID of the Amazon Web Services Outposts order of the host associated with the capacity task.
     * </p>
     */
    private String orderId;
    /**
     * <p>
     * The status of the capacity task.
     * </p>
     */
    private String capacityTaskStatus;
    /**
     * <p>
     * The date that the specified capacity task was created.
     * </p>
     */
    private java.util.Date creationDate;
    /**
     * <p>
     * The date that the specified capacity task successfully ran.
     * </p>
     */
    private java.util.Date completionDate;
    /**
     * <p>
     * The date that the specified capacity was last modified.
     * </p>
     */
    private java.util.Date lastModifiedDate;

    /**
     * <p>
     * The ID of the specified capacity task.
     * </p>
     * 
     * @param capacityTaskId
     *        The ID of the specified capacity task.
     */

    public void setCapacityTaskId(String capacityTaskId) {
        this.capacityTaskId = capacityTaskId;
    }

    /**
     * <p>
     * The ID of the specified capacity task.
     * </p>
     * 
     * @return The ID of the specified capacity task.
     */

    public String getCapacityTaskId() {
        return this.capacityTaskId;
    }

    /**
     * <p>
     * The ID of the specified capacity task.
     * </p>
     * 
     * @param capacityTaskId
     *        The ID of the specified capacity task.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CapacityTaskSummary withCapacityTaskId(String capacityTaskId) {
        setCapacityTaskId(capacityTaskId);
        return this;
    }

    /**
     * <p>
     * The ID of the Outpost associated with the specified capacity task.
     * </p>
     * 
     * @param outpostId
     *        The ID of the Outpost associated with the specified capacity task.
     */

    public void setOutpostId(String outpostId) {
        this.outpostId = outpostId;
    }

    /**
     * <p>
     * The ID of the Outpost associated with the specified capacity task.
     * </p>
     * 
     * @return The ID of the Outpost associated with the specified capacity task.
     */

    public String getOutpostId() {
        return this.outpostId;
    }

    /**
     * <p>
     * The ID of the Outpost associated with the specified capacity task.
     * </p>
     * 
     * @param outpostId
     *        The ID of the Outpost associated with the specified capacity task.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CapacityTaskSummary withOutpostId(String outpostId) {
        setOutpostId(outpostId);
        return this;
    }

    /**
     * <p>
     * The ID of the Amazon Web Services Outposts order of the host associated with the capacity task.
     * </p>
     * 
     * @param orderId
     *        The ID of the Amazon Web Services Outposts order of the host associated with the capacity task.
     */

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    /**
     * <p>
     * The ID of the Amazon Web Services Outposts order of the host associated with the capacity task.
     * </p>
     * 
     * @return The ID of the Amazon Web Services Outposts order of the host associated with the capacity task.
     */

    public String getOrderId() {
        return this.orderId;
    }

    /**
     * <p>
     * The ID of the Amazon Web Services Outposts order of the host associated with the capacity task.
     * </p>
     * 
     * @param orderId
     *        The ID of the Amazon Web Services Outposts order of the host associated with the capacity task.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CapacityTaskSummary withOrderId(String orderId) {
        setOrderId(orderId);
        return this;
    }

    /**
     * <p>
     * The status of the capacity task.
     * </p>
     * 
     * @param capacityTaskStatus
     *        The status of the capacity task.
     * @see CapacityTaskStatus
     */

    public void setCapacityTaskStatus(String capacityTaskStatus) {
        this.capacityTaskStatus = capacityTaskStatus;
    }

    /**
     * <p>
     * The status of the capacity task.
     * </p>
     * 
     * @return The status of the capacity task.
     * @see CapacityTaskStatus
     */

    public String getCapacityTaskStatus() {
        return this.capacityTaskStatus;
    }

    /**
     * <p>
     * The status of the capacity task.
     * </p>
     * 
     * @param capacityTaskStatus
     *        The status of the capacity task.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CapacityTaskStatus
     */

    public CapacityTaskSummary withCapacityTaskStatus(String capacityTaskStatus) {
        setCapacityTaskStatus(capacityTaskStatus);
        return this;
    }

    /**
     * <p>
     * The status of the capacity task.
     * </p>
     * 
     * @param capacityTaskStatus
     *        The status of the capacity task.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CapacityTaskStatus
     */

    public CapacityTaskSummary withCapacityTaskStatus(CapacityTaskStatus capacityTaskStatus) {
        this.capacityTaskStatus = capacityTaskStatus.toString();
        return this;
    }

    /**
     * <p>
     * The date that the specified capacity task was created.
     * </p>
     * 
     * @param creationDate
     *        The date that the specified capacity task was created.
     */

    public void setCreationDate(java.util.Date creationDate) {
        this.creationDate = creationDate;
    }

    /**
     * <p>
     * The date that the specified capacity task was created.
     * </p>
     * 
     * @return The date that the specified capacity task was created.
     */

    public java.util.Date getCreationDate() {
        return this.creationDate;
    }

    /**
     * <p>
     * The date that the specified capacity task was created.
     * </p>
     * 
     * @param creationDate
     *        The date that the specified capacity task was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CapacityTaskSummary withCreationDate(java.util.Date creationDate) {
        setCreationDate(creationDate);
        return this;
    }

    /**
     * <p>
     * The date that the specified capacity task successfully ran.
     * </p>
     * 
     * @param completionDate
     *        The date that the specified capacity task successfully ran.
     */

    public void setCompletionDate(java.util.Date completionDate) {
        this.completionDate = completionDate;
    }

    /**
     * <p>
     * The date that the specified capacity task successfully ran.
     * </p>
     * 
     * @return The date that the specified capacity task successfully ran.
     */

    public java.util.Date getCompletionDate() {
        return this.completionDate;
    }

    /**
     * <p>
     * The date that the specified capacity task successfully ran.
     * </p>
     * 
     * @param completionDate
     *        The date that the specified capacity task successfully ran.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CapacityTaskSummary withCompletionDate(java.util.Date completionDate) {
        setCompletionDate(completionDate);
        return this;
    }

    /**
     * <p>
     * The date that the specified capacity was last modified.
     * </p>
     * 
     * @param lastModifiedDate
     *        The date that the specified capacity was last modified.
     */

    public void setLastModifiedDate(java.util.Date lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    /**
     * <p>
     * The date that the specified capacity was last modified.
     * </p>
     * 
     * @return The date that the specified capacity was last modified.
     */

    public java.util.Date getLastModifiedDate() {
        return this.lastModifiedDate;
    }

    /**
     * <p>
     * The date that the specified capacity was last modified.
     * </p>
     * 
     * @param lastModifiedDate
     *        The date that the specified capacity was last modified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CapacityTaskSummary withLastModifiedDate(java.util.Date lastModifiedDate) {
        setLastModifiedDate(lastModifiedDate);
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
        if (getCapacityTaskId() != null)
            sb.append("CapacityTaskId: ").append(getCapacityTaskId()).append(",");
        if (getOutpostId() != null)
            sb.append("OutpostId: ").append(getOutpostId()).append(",");
        if (getOrderId() != null)
            sb.append("OrderId: ").append(getOrderId()).append(",");
        if (getCapacityTaskStatus() != null)
            sb.append("CapacityTaskStatus: ").append(getCapacityTaskStatus()).append(",");
        if (getCreationDate() != null)
            sb.append("CreationDate: ").append(getCreationDate()).append(",");
        if (getCompletionDate() != null)
            sb.append("CompletionDate: ").append(getCompletionDate()).append(",");
        if (getLastModifiedDate() != null)
            sb.append("LastModifiedDate: ").append(getLastModifiedDate());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CapacityTaskSummary == false)
            return false;
        CapacityTaskSummary other = (CapacityTaskSummary) obj;
        if (other.getCapacityTaskId() == null ^ this.getCapacityTaskId() == null)
            return false;
        if (other.getCapacityTaskId() != null && other.getCapacityTaskId().equals(this.getCapacityTaskId()) == false)
            return false;
        if (other.getOutpostId() == null ^ this.getOutpostId() == null)
            return false;
        if (other.getOutpostId() != null && other.getOutpostId().equals(this.getOutpostId()) == false)
            return false;
        if (other.getOrderId() == null ^ this.getOrderId() == null)
            return false;
        if (other.getOrderId() != null && other.getOrderId().equals(this.getOrderId()) == false)
            return false;
        if (other.getCapacityTaskStatus() == null ^ this.getCapacityTaskStatus() == null)
            return false;
        if (other.getCapacityTaskStatus() != null && other.getCapacityTaskStatus().equals(this.getCapacityTaskStatus()) == false)
            return false;
        if (other.getCreationDate() == null ^ this.getCreationDate() == null)
            return false;
        if (other.getCreationDate() != null && other.getCreationDate().equals(this.getCreationDate()) == false)
            return false;
        if (other.getCompletionDate() == null ^ this.getCompletionDate() == null)
            return false;
        if (other.getCompletionDate() != null && other.getCompletionDate().equals(this.getCompletionDate()) == false)
            return false;
        if (other.getLastModifiedDate() == null ^ this.getLastModifiedDate() == null)
            return false;
        if (other.getLastModifiedDate() != null && other.getLastModifiedDate().equals(this.getLastModifiedDate()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCapacityTaskId() == null) ? 0 : getCapacityTaskId().hashCode());
        hashCode = prime * hashCode + ((getOutpostId() == null) ? 0 : getOutpostId().hashCode());
        hashCode = prime * hashCode + ((getOrderId() == null) ? 0 : getOrderId().hashCode());
        hashCode = prime * hashCode + ((getCapacityTaskStatus() == null) ? 0 : getCapacityTaskStatus().hashCode());
        hashCode = prime * hashCode + ((getCreationDate() == null) ? 0 : getCreationDate().hashCode());
        hashCode = prime * hashCode + ((getCompletionDate() == null) ? 0 : getCompletionDate().hashCode());
        hashCode = prime * hashCode + ((getLastModifiedDate() == null) ? 0 : getLastModifiedDate().hashCode());
        return hashCode;
    }

    @Override
    public CapacityTaskSummary clone() {
        try {
            return (CapacityTaskSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.outposts.model.transform.CapacityTaskSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
