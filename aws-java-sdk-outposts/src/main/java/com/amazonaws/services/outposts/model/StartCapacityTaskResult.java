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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/outposts-2019-12-03/StartCapacityTask" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StartCapacityTaskResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * ID of the capacity task that you want to start.
     * </p>
     */
    private String capacityTaskId;
    /**
     * <p>
     * ID of the Outpost associated with the capacity task.
     * </p>
     */
    private String outpostId;
    /**
     * <p>
     * ID of the Amazon Web Services Outposts order of the host associated with the capacity task.
     * </p>
     */
    private String orderId;
    /**
     * <p>
     * List of the instance pools requested in the specified capacity task.
     * </p>
     */
    private java.util.List<InstanceTypeCapacity> requestedInstancePools;
    /**
     * <p>
     * Results of the dry run showing if the specified capacity task is above or below the available instance capacity.
     * </p>
     */
    private Boolean dryRun;
    /**
     * <p>
     * Status of the specified capacity task.
     * </p>
     */
    private String capacityTaskStatus;
    /**
     * <p>
     * Reason that the specified capacity task failed.
     * </p>
     */
    private CapacityTaskFailure failed;
    /**
     * <p>
     * Date that the specified capacity task was created.
     * </p>
     */
    private java.util.Date creationDate;
    /**
     * <p>
     * Date that the specified capacity task ran successfully.
     * </p>
     */
    private java.util.Date completionDate;
    /**
     * <p>
     * Date that the specified capacity task was last modified.
     * </p>
     */
    private java.util.Date lastModifiedDate;

    /**
     * <p>
     * ID of the capacity task that you want to start.
     * </p>
     * 
     * @param capacityTaskId
     *        ID of the capacity task that you want to start.
     */

    public void setCapacityTaskId(String capacityTaskId) {
        this.capacityTaskId = capacityTaskId;
    }

    /**
     * <p>
     * ID of the capacity task that you want to start.
     * </p>
     * 
     * @return ID of the capacity task that you want to start.
     */

    public String getCapacityTaskId() {
        return this.capacityTaskId;
    }

    /**
     * <p>
     * ID of the capacity task that you want to start.
     * </p>
     * 
     * @param capacityTaskId
     *        ID of the capacity task that you want to start.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartCapacityTaskResult withCapacityTaskId(String capacityTaskId) {
        setCapacityTaskId(capacityTaskId);
        return this;
    }

    /**
     * <p>
     * ID of the Outpost associated with the capacity task.
     * </p>
     * 
     * @param outpostId
     *        ID of the Outpost associated with the capacity task.
     */

    public void setOutpostId(String outpostId) {
        this.outpostId = outpostId;
    }

    /**
     * <p>
     * ID of the Outpost associated with the capacity task.
     * </p>
     * 
     * @return ID of the Outpost associated with the capacity task.
     */

    public String getOutpostId() {
        return this.outpostId;
    }

    /**
     * <p>
     * ID of the Outpost associated with the capacity task.
     * </p>
     * 
     * @param outpostId
     *        ID of the Outpost associated with the capacity task.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartCapacityTaskResult withOutpostId(String outpostId) {
        setOutpostId(outpostId);
        return this;
    }

    /**
     * <p>
     * ID of the Amazon Web Services Outposts order of the host associated with the capacity task.
     * </p>
     * 
     * @param orderId
     *        ID of the Amazon Web Services Outposts order of the host associated with the capacity task.
     */

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    /**
     * <p>
     * ID of the Amazon Web Services Outposts order of the host associated with the capacity task.
     * </p>
     * 
     * @return ID of the Amazon Web Services Outposts order of the host associated with the capacity task.
     */

    public String getOrderId() {
        return this.orderId;
    }

    /**
     * <p>
     * ID of the Amazon Web Services Outposts order of the host associated with the capacity task.
     * </p>
     * 
     * @param orderId
     *        ID of the Amazon Web Services Outposts order of the host associated with the capacity task.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartCapacityTaskResult withOrderId(String orderId) {
        setOrderId(orderId);
        return this;
    }

    /**
     * <p>
     * List of the instance pools requested in the specified capacity task.
     * </p>
     * 
     * @return List of the instance pools requested in the specified capacity task.
     */

    public java.util.List<InstanceTypeCapacity> getRequestedInstancePools() {
        return requestedInstancePools;
    }

    /**
     * <p>
     * List of the instance pools requested in the specified capacity task.
     * </p>
     * 
     * @param requestedInstancePools
     *        List of the instance pools requested in the specified capacity task.
     */

    public void setRequestedInstancePools(java.util.Collection<InstanceTypeCapacity> requestedInstancePools) {
        if (requestedInstancePools == null) {
            this.requestedInstancePools = null;
            return;
        }

        this.requestedInstancePools = new java.util.ArrayList<InstanceTypeCapacity>(requestedInstancePools);
    }

    /**
     * <p>
     * List of the instance pools requested in the specified capacity task.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRequestedInstancePools(java.util.Collection)} or
     * {@link #withRequestedInstancePools(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param requestedInstancePools
     *        List of the instance pools requested in the specified capacity task.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartCapacityTaskResult withRequestedInstancePools(InstanceTypeCapacity... requestedInstancePools) {
        if (this.requestedInstancePools == null) {
            setRequestedInstancePools(new java.util.ArrayList<InstanceTypeCapacity>(requestedInstancePools.length));
        }
        for (InstanceTypeCapacity ele : requestedInstancePools) {
            this.requestedInstancePools.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * List of the instance pools requested in the specified capacity task.
     * </p>
     * 
     * @param requestedInstancePools
     *        List of the instance pools requested in the specified capacity task.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartCapacityTaskResult withRequestedInstancePools(java.util.Collection<InstanceTypeCapacity> requestedInstancePools) {
        setRequestedInstancePools(requestedInstancePools);
        return this;
    }

    /**
     * <p>
     * Results of the dry run showing if the specified capacity task is above or below the available instance capacity.
     * </p>
     * 
     * @param dryRun
     *        Results of the dry run showing if the specified capacity task is above or below the available instance
     *        capacity.
     */

    public void setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
    }

    /**
     * <p>
     * Results of the dry run showing if the specified capacity task is above or below the available instance capacity.
     * </p>
     * 
     * @return Results of the dry run showing if the specified capacity task is above or below the available instance
     *         capacity.
     */

    public Boolean getDryRun() {
        return this.dryRun;
    }

    /**
     * <p>
     * Results of the dry run showing if the specified capacity task is above or below the available instance capacity.
     * </p>
     * 
     * @param dryRun
     *        Results of the dry run showing if the specified capacity task is above or below the available instance
     *        capacity.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartCapacityTaskResult withDryRun(Boolean dryRun) {
        setDryRun(dryRun);
        return this;
    }

    /**
     * <p>
     * Results of the dry run showing if the specified capacity task is above or below the available instance capacity.
     * </p>
     * 
     * @return Results of the dry run showing if the specified capacity task is above or below the available instance
     *         capacity.
     */

    public Boolean isDryRun() {
        return this.dryRun;
    }

    /**
     * <p>
     * Status of the specified capacity task.
     * </p>
     * 
     * @param capacityTaskStatus
     *        Status of the specified capacity task.
     * @see CapacityTaskStatus
     */

    public void setCapacityTaskStatus(String capacityTaskStatus) {
        this.capacityTaskStatus = capacityTaskStatus;
    }

    /**
     * <p>
     * Status of the specified capacity task.
     * </p>
     * 
     * @return Status of the specified capacity task.
     * @see CapacityTaskStatus
     */

    public String getCapacityTaskStatus() {
        return this.capacityTaskStatus;
    }

    /**
     * <p>
     * Status of the specified capacity task.
     * </p>
     * 
     * @param capacityTaskStatus
     *        Status of the specified capacity task.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CapacityTaskStatus
     */

    public StartCapacityTaskResult withCapacityTaskStatus(String capacityTaskStatus) {
        setCapacityTaskStatus(capacityTaskStatus);
        return this;
    }

    /**
     * <p>
     * Status of the specified capacity task.
     * </p>
     * 
     * @param capacityTaskStatus
     *        Status of the specified capacity task.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CapacityTaskStatus
     */

    public StartCapacityTaskResult withCapacityTaskStatus(CapacityTaskStatus capacityTaskStatus) {
        this.capacityTaskStatus = capacityTaskStatus.toString();
        return this;
    }

    /**
     * <p>
     * Reason that the specified capacity task failed.
     * </p>
     * 
     * @param failed
     *        Reason that the specified capacity task failed.
     */

    public void setFailed(CapacityTaskFailure failed) {
        this.failed = failed;
    }

    /**
     * <p>
     * Reason that the specified capacity task failed.
     * </p>
     * 
     * @return Reason that the specified capacity task failed.
     */

    public CapacityTaskFailure getFailed() {
        return this.failed;
    }

    /**
     * <p>
     * Reason that the specified capacity task failed.
     * </p>
     * 
     * @param failed
     *        Reason that the specified capacity task failed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartCapacityTaskResult withFailed(CapacityTaskFailure failed) {
        setFailed(failed);
        return this;
    }

    /**
     * <p>
     * Date that the specified capacity task was created.
     * </p>
     * 
     * @param creationDate
     *        Date that the specified capacity task was created.
     */

    public void setCreationDate(java.util.Date creationDate) {
        this.creationDate = creationDate;
    }

    /**
     * <p>
     * Date that the specified capacity task was created.
     * </p>
     * 
     * @return Date that the specified capacity task was created.
     */

    public java.util.Date getCreationDate() {
        return this.creationDate;
    }

    /**
     * <p>
     * Date that the specified capacity task was created.
     * </p>
     * 
     * @param creationDate
     *        Date that the specified capacity task was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartCapacityTaskResult withCreationDate(java.util.Date creationDate) {
        setCreationDate(creationDate);
        return this;
    }

    /**
     * <p>
     * Date that the specified capacity task ran successfully.
     * </p>
     * 
     * @param completionDate
     *        Date that the specified capacity task ran successfully.
     */

    public void setCompletionDate(java.util.Date completionDate) {
        this.completionDate = completionDate;
    }

    /**
     * <p>
     * Date that the specified capacity task ran successfully.
     * </p>
     * 
     * @return Date that the specified capacity task ran successfully.
     */

    public java.util.Date getCompletionDate() {
        return this.completionDate;
    }

    /**
     * <p>
     * Date that the specified capacity task ran successfully.
     * </p>
     * 
     * @param completionDate
     *        Date that the specified capacity task ran successfully.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartCapacityTaskResult withCompletionDate(java.util.Date completionDate) {
        setCompletionDate(completionDate);
        return this;
    }

    /**
     * <p>
     * Date that the specified capacity task was last modified.
     * </p>
     * 
     * @param lastModifiedDate
     *        Date that the specified capacity task was last modified.
     */

    public void setLastModifiedDate(java.util.Date lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    /**
     * <p>
     * Date that the specified capacity task was last modified.
     * </p>
     * 
     * @return Date that the specified capacity task was last modified.
     */

    public java.util.Date getLastModifiedDate() {
        return this.lastModifiedDate;
    }

    /**
     * <p>
     * Date that the specified capacity task was last modified.
     * </p>
     * 
     * @param lastModifiedDate
     *        Date that the specified capacity task was last modified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartCapacityTaskResult withLastModifiedDate(java.util.Date lastModifiedDate) {
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
        if (getRequestedInstancePools() != null)
            sb.append("RequestedInstancePools: ").append(getRequestedInstancePools()).append(",");
        if (getDryRun() != null)
            sb.append("DryRun: ").append(getDryRun()).append(",");
        if (getCapacityTaskStatus() != null)
            sb.append("CapacityTaskStatus: ").append(getCapacityTaskStatus()).append(",");
        if (getFailed() != null)
            sb.append("Failed: ").append(getFailed()).append(",");
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

        if (obj instanceof StartCapacityTaskResult == false)
            return false;
        StartCapacityTaskResult other = (StartCapacityTaskResult) obj;
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
        if (other.getRequestedInstancePools() == null ^ this.getRequestedInstancePools() == null)
            return false;
        if (other.getRequestedInstancePools() != null && other.getRequestedInstancePools().equals(this.getRequestedInstancePools()) == false)
            return false;
        if (other.getDryRun() == null ^ this.getDryRun() == null)
            return false;
        if (other.getDryRun() != null && other.getDryRun().equals(this.getDryRun()) == false)
            return false;
        if (other.getCapacityTaskStatus() == null ^ this.getCapacityTaskStatus() == null)
            return false;
        if (other.getCapacityTaskStatus() != null && other.getCapacityTaskStatus().equals(this.getCapacityTaskStatus()) == false)
            return false;
        if (other.getFailed() == null ^ this.getFailed() == null)
            return false;
        if (other.getFailed() != null && other.getFailed().equals(this.getFailed()) == false)
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
        hashCode = prime * hashCode + ((getRequestedInstancePools() == null) ? 0 : getRequestedInstancePools().hashCode());
        hashCode = prime * hashCode + ((getDryRun() == null) ? 0 : getDryRun().hashCode());
        hashCode = prime * hashCode + ((getCapacityTaskStatus() == null) ? 0 : getCapacityTaskStatus().hashCode());
        hashCode = prime * hashCode + ((getFailed() == null) ? 0 : getFailed().hashCode());
        hashCode = prime * hashCode + ((getCreationDate() == null) ? 0 : getCreationDate().hashCode());
        hashCode = prime * hashCode + ((getCompletionDate() == null) ? 0 : getCompletionDate().hashCode());
        hashCode = prime * hashCode + ((getLastModifiedDate() == null) ? 0 : getLastModifiedDate().hashCode());
        return hashCode;
    }

    @Override
    public StartCapacityTaskResult clone() {
        try {
            return (StartCapacityTaskResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
