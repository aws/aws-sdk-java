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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Status and billing information about the warm pool.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/WarmPoolStatus" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class WarmPoolStatus implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The status of the warm pool.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>InUse</code>: The warm pool is in use for the training job.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Available</code>: The warm pool is available to reuse for a matching training job.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Reused</code>: The warm pool moved to a matching training job for reuse.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Terminated</code>: The warm pool is no longer available. Warm pools are unavailable if they are terminated
     * by a user, terminated for a patch update, or terminated for exceeding the specified
     * <code>KeepAlivePeriodInSeconds</code>.
     * </p>
     * </li>
     * </ul>
     */
    private String status;
    /**
     * <p>
     * The billable time in seconds used by the warm pool. Billable time refers to the absolute wall-clock time.
     * </p>
     * <p>
     * Multiply <code>ResourceRetainedBillableTimeInSeconds</code> by the number of instances (
     * <code>InstanceCount</code>) in your training cluster to get the total compute time SageMaker bills you if you run
     * warm pool training. The formula is as follows: <code>ResourceRetainedBillableTimeInSeconds * InstanceCount</code>
     * .
     * </p>
     */
    private Integer resourceRetainedBillableTimeInSeconds;
    /**
     * <p>
     * The name of the matching training job that reused the warm pool.
     * </p>
     */
    private String reusedByJob;

    /**
     * <p>
     * The status of the warm pool.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>InUse</code>: The warm pool is in use for the training job.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Available</code>: The warm pool is available to reuse for a matching training job.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Reused</code>: The warm pool moved to a matching training job for reuse.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Terminated</code>: The warm pool is no longer available. Warm pools are unavailable if they are terminated
     * by a user, terminated for a patch update, or terminated for exceeding the specified
     * <code>KeepAlivePeriodInSeconds</code>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        The status of the warm pool.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>InUse</code>: The warm pool is in use for the training job.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Available</code>: The warm pool is available to reuse for a matching training job.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Reused</code>: The warm pool moved to a matching training job for reuse.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Terminated</code>: The warm pool is no longer available. Warm pools are unavailable if they are
     *        terminated by a user, terminated for a patch update, or terminated for exceeding the specified
     *        <code>KeepAlivePeriodInSeconds</code>.
     *        </p>
     *        </li>
     * @see WarmPoolResourceStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the warm pool.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>InUse</code>: The warm pool is in use for the training job.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Available</code>: The warm pool is available to reuse for a matching training job.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Reused</code>: The warm pool moved to a matching training job for reuse.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Terminated</code>: The warm pool is no longer available. Warm pools are unavailable if they are terminated
     * by a user, terminated for a patch update, or terminated for exceeding the specified
     * <code>KeepAlivePeriodInSeconds</code>.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The status of the warm pool.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>InUse</code>: The warm pool is in use for the training job.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Available</code>: The warm pool is available to reuse for a matching training job.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Reused</code>: The warm pool moved to a matching training job for reuse.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Terminated</code>: The warm pool is no longer available. Warm pools are unavailable if they are
     *         terminated by a user, terminated for a patch update, or terminated for exceeding the specified
     *         <code>KeepAlivePeriodInSeconds</code>.
     *         </p>
     *         </li>
     * @see WarmPoolResourceStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the warm pool.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>InUse</code>: The warm pool is in use for the training job.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Available</code>: The warm pool is available to reuse for a matching training job.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Reused</code>: The warm pool moved to a matching training job for reuse.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Terminated</code>: The warm pool is no longer available. Warm pools are unavailable if they are terminated
     * by a user, terminated for a patch update, or terminated for exceeding the specified
     * <code>KeepAlivePeriodInSeconds</code>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        The status of the warm pool.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>InUse</code>: The warm pool is in use for the training job.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Available</code>: The warm pool is available to reuse for a matching training job.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Reused</code>: The warm pool moved to a matching training job for reuse.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Terminated</code>: The warm pool is no longer available. Warm pools are unavailable if they are
     *        terminated by a user, terminated for a patch update, or terminated for exceeding the specified
     *        <code>KeepAlivePeriodInSeconds</code>.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see WarmPoolResourceStatus
     */

    public WarmPoolStatus withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the warm pool.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>InUse</code>: The warm pool is in use for the training job.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Available</code>: The warm pool is available to reuse for a matching training job.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Reused</code>: The warm pool moved to a matching training job for reuse.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Terminated</code>: The warm pool is no longer available. Warm pools are unavailable if they are terminated
     * by a user, terminated for a patch update, or terminated for exceeding the specified
     * <code>KeepAlivePeriodInSeconds</code>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        The status of the warm pool.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>InUse</code>: The warm pool is in use for the training job.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Available</code>: The warm pool is available to reuse for a matching training job.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Reused</code>: The warm pool moved to a matching training job for reuse.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Terminated</code>: The warm pool is no longer available. Warm pools are unavailable if they are
     *        terminated by a user, terminated for a patch update, or terminated for exceeding the specified
     *        <code>KeepAlivePeriodInSeconds</code>.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see WarmPoolResourceStatus
     */

    public WarmPoolStatus withStatus(WarmPoolResourceStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The billable time in seconds used by the warm pool. Billable time refers to the absolute wall-clock time.
     * </p>
     * <p>
     * Multiply <code>ResourceRetainedBillableTimeInSeconds</code> by the number of instances (
     * <code>InstanceCount</code>) in your training cluster to get the total compute time SageMaker bills you if you run
     * warm pool training. The formula is as follows: <code>ResourceRetainedBillableTimeInSeconds * InstanceCount</code>
     * .
     * </p>
     * 
     * @param resourceRetainedBillableTimeInSeconds
     *        The billable time in seconds used by the warm pool. Billable time refers to the absolute wall-clock
     *        time.</p>
     *        <p>
     *        Multiply <code>ResourceRetainedBillableTimeInSeconds</code> by the number of instances (
     *        <code>InstanceCount</code>) in your training cluster to get the total compute time SageMaker bills you if
     *        you run warm pool training. The formula is as follows:
     *        <code>ResourceRetainedBillableTimeInSeconds * InstanceCount</code>.
     */

    public void setResourceRetainedBillableTimeInSeconds(Integer resourceRetainedBillableTimeInSeconds) {
        this.resourceRetainedBillableTimeInSeconds = resourceRetainedBillableTimeInSeconds;
    }

    /**
     * <p>
     * The billable time in seconds used by the warm pool. Billable time refers to the absolute wall-clock time.
     * </p>
     * <p>
     * Multiply <code>ResourceRetainedBillableTimeInSeconds</code> by the number of instances (
     * <code>InstanceCount</code>) in your training cluster to get the total compute time SageMaker bills you if you run
     * warm pool training. The formula is as follows: <code>ResourceRetainedBillableTimeInSeconds * InstanceCount</code>
     * .
     * </p>
     * 
     * @return The billable time in seconds used by the warm pool. Billable time refers to the absolute wall-clock
     *         time.</p>
     *         <p>
     *         Multiply <code>ResourceRetainedBillableTimeInSeconds</code> by the number of instances (
     *         <code>InstanceCount</code>) in your training cluster to get the total compute time SageMaker bills you if
     *         you run warm pool training. The formula is as follows:
     *         <code>ResourceRetainedBillableTimeInSeconds * InstanceCount</code>.
     */

    public Integer getResourceRetainedBillableTimeInSeconds() {
        return this.resourceRetainedBillableTimeInSeconds;
    }

    /**
     * <p>
     * The billable time in seconds used by the warm pool. Billable time refers to the absolute wall-clock time.
     * </p>
     * <p>
     * Multiply <code>ResourceRetainedBillableTimeInSeconds</code> by the number of instances (
     * <code>InstanceCount</code>) in your training cluster to get the total compute time SageMaker bills you if you run
     * warm pool training. The formula is as follows: <code>ResourceRetainedBillableTimeInSeconds * InstanceCount</code>
     * .
     * </p>
     * 
     * @param resourceRetainedBillableTimeInSeconds
     *        The billable time in seconds used by the warm pool. Billable time refers to the absolute wall-clock
     *        time.</p>
     *        <p>
     *        Multiply <code>ResourceRetainedBillableTimeInSeconds</code> by the number of instances (
     *        <code>InstanceCount</code>) in your training cluster to get the total compute time SageMaker bills you if
     *        you run warm pool training. The formula is as follows:
     *        <code>ResourceRetainedBillableTimeInSeconds * InstanceCount</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WarmPoolStatus withResourceRetainedBillableTimeInSeconds(Integer resourceRetainedBillableTimeInSeconds) {
        setResourceRetainedBillableTimeInSeconds(resourceRetainedBillableTimeInSeconds);
        return this;
    }

    /**
     * <p>
     * The name of the matching training job that reused the warm pool.
     * </p>
     * 
     * @param reusedByJob
     *        The name of the matching training job that reused the warm pool.
     */

    public void setReusedByJob(String reusedByJob) {
        this.reusedByJob = reusedByJob;
    }

    /**
     * <p>
     * The name of the matching training job that reused the warm pool.
     * </p>
     * 
     * @return The name of the matching training job that reused the warm pool.
     */

    public String getReusedByJob() {
        return this.reusedByJob;
    }

    /**
     * <p>
     * The name of the matching training job that reused the warm pool.
     * </p>
     * 
     * @param reusedByJob
     *        The name of the matching training job that reused the warm pool.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WarmPoolStatus withReusedByJob(String reusedByJob) {
        setReusedByJob(reusedByJob);
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
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getResourceRetainedBillableTimeInSeconds() != null)
            sb.append("ResourceRetainedBillableTimeInSeconds: ").append(getResourceRetainedBillableTimeInSeconds()).append(",");
        if (getReusedByJob() != null)
            sb.append("ReusedByJob: ").append(getReusedByJob());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof WarmPoolStatus == false)
            return false;
        WarmPoolStatus other = (WarmPoolStatus) obj;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getResourceRetainedBillableTimeInSeconds() == null ^ this.getResourceRetainedBillableTimeInSeconds() == null)
            return false;
        if (other.getResourceRetainedBillableTimeInSeconds() != null
                && other.getResourceRetainedBillableTimeInSeconds().equals(this.getResourceRetainedBillableTimeInSeconds()) == false)
            return false;
        if (other.getReusedByJob() == null ^ this.getReusedByJob() == null)
            return false;
        if (other.getReusedByJob() != null && other.getReusedByJob().equals(this.getReusedByJob()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getResourceRetainedBillableTimeInSeconds() == null) ? 0 : getResourceRetainedBillableTimeInSeconds().hashCode());
        hashCode = prime * hashCode + ((getReusedByJob() == null) ? 0 : getReusedByJob().hashCode());
        return hashCode;
    }

    @Override
    public WarmPoolStatus clone() {
        try {
            return (WarmPoolStatus) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.WarmPoolStatusMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
