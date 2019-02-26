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
package com.amazonaws.services.iot.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CancelJobRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The unique identifier you assigned to this job when it was created.
     * </p>
     */
    private String jobId;
    /**
     * <p>
     * (Optional)A reason code string that explains why the job was canceled.
     * </p>
     */
    private String reasonCode;
    /**
     * <p>
     * An optional comment string describing why the job was canceled.
     * </p>
     */
    private String comment;
    /**
     * <p>
     * (Optional) If <code>true</code> job executions with status "IN_PROGRESS" and "QUEUED" are canceled, otherwise
     * only job executions with status "QUEUED" are canceled. The default is <code>false</code>.
     * </p>
     * <p>
     * Canceling a job which is "IN_PROGRESS", will cause a device which is executing the job to be unable to update the
     * job execution status. Use caution and ensure that each device executing a job which is canceled is able to
     * recover to a valid state.
     * </p>
     */
    private Boolean force;

    /**
     * <p>
     * The unique identifier you assigned to this job when it was created.
     * </p>
     * 
     * @param jobId
     *        The unique identifier you assigned to this job when it was created.
     */

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    /**
     * <p>
     * The unique identifier you assigned to this job when it was created.
     * </p>
     * 
     * @return The unique identifier you assigned to this job when it was created.
     */

    public String getJobId() {
        return this.jobId;
    }

    /**
     * <p>
     * The unique identifier you assigned to this job when it was created.
     * </p>
     * 
     * @param jobId
     *        The unique identifier you assigned to this job when it was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CancelJobRequest withJobId(String jobId) {
        setJobId(jobId);
        return this;
    }

    /**
     * <p>
     * (Optional)A reason code string that explains why the job was canceled.
     * </p>
     * 
     * @param reasonCode
     *        (Optional)A reason code string that explains why the job was canceled.
     */

    public void setReasonCode(String reasonCode) {
        this.reasonCode = reasonCode;
    }

    /**
     * <p>
     * (Optional)A reason code string that explains why the job was canceled.
     * </p>
     * 
     * @return (Optional)A reason code string that explains why the job was canceled.
     */

    public String getReasonCode() {
        return this.reasonCode;
    }

    /**
     * <p>
     * (Optional)A reason code string that explains why the job was canceled.
     * </p>
     * 
     * @param reasonCode
     *        (Optional)A reason code string that explains why the job was canceled.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CancelJobRequest withReasonCode(String reasonCode) {
        setReasonCode(reasonCode);
        return this;
    }

    /**
     * <p>
     * An optional comment string describing why the job was canceled.
     * </p>
     * 
     * @param comment
     *        An optional comment string describing why the job was canceled.
     */

    public void setComment(String comment) {
        this.comment = comment;
    }

    /**
     * <p>
     * An optional comment string describing why the job was canceled.
     * </p>
     * 
     * @return An optional comment string describing why the job was canceled.
     */

    public String getComment() {
        return this.comment;
    }

    /**
     * <p>
     * An optional comment string describing why the job was canceled.
     * </p>
     * 
     * @param comment
     *        An optional comment string describing why the job was canceled.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CancelJobRequest withComment(String comment) {
        setComment(comment);
        return this;
    }

    /**
     * <p>
     * (Optional) If <code>true</code> job executions with status "IN_PROGRESS" and "QUEUED" are canceled, otherwise
     * only job executions with status "QUEUED" are canceled. The default is <code>false</code>.
     * </p>
     * <p>
     * Canceling a job which is "IN_PROGRESS", will cause a device which is executing the job to be unable to update the
     * job execution status. Use caution and ensure that each device executing a job which is canceled is able to
     * recover to a valid state.
     * </p>
     * 
     * @param force
     *        (Optional) If <code>true</code> job executions with status "IN_PROGRESS" and "QUEUED" are canceled,
     *        otherwise only job executions with status "QUEUED" are canceled. The default is <code>false</code>.</p>
     *        <p>
     *        Canceling a job which is "IN_PROGRESS", will cause a device which is executing the job to be unable to
     *        update the job execution status. Use caution and ensure that each device executing a job which is canceled
     *        is able to recover to a valid state.
     */

    public void setForce(Boolean force) {
        this.force = force;
    }

    /**
     * <p>
     * (Optional) If <code>true</code> job executions with status "IN_PROGRESS" and "QUEUED" are canceled, otherwise
     * only job executions with status "QUEUED" are canceled. The default is <code>false</code>.
     * </p>
     * <p>
     * Canceling a job which is "IN_PROGRESS", will cause a device which is executing the job to be unable to update the
     * job execution status. Use caution and ensure that each device executing a job which is canceled is able to
     * recover to a valid state.
     * </p>
     * 
     * @return (Optional) If <code>true</code> job executions with status "IN_PROGRESS" and "QUEUED" are canceled,
     *         otherwise only job executions with status "QUEUED" are canceled. The default is <code>false</code>.</p>
     *         <p>
     *         Canceling a job which is "IN_PROGRESS", will cause a device which is executing the job to be unable to
     *         update the job execution status. Use caution and ensure that each device executing a job which is
     *         canceled is able to recover to a valid state.
     */

    public Boolean getForce() {
        return this.force;
    }

    /**
     * <p>
     * (Optional) If <code>true</code> job executions with status "IN_PROGRESS" and "QUEUED" are canceled, otherwise
     * only job executions with status "QUEUED" are canceled. The default is <code>false</code>.
     * </p>
     * <p>
     * Canceling a job which is "IN_PROGRESS", will cause a device which is executing the job to be unable to update the
     * job execution status. Use caution and ensure that each device executing a job which is canceled is able to
     * recover to a valid state.
     * </p>
     * 
     * @param force
     *        (Optional) If <code>true</code> job executions with status "IN_PROGRESS" and "QUEUED" are canceled,
     *        otherwise only job executions with status "QUEUED" are canceled. The default is <code>false</code>.</p>
     *        <p>
     *        Canceling a job which is "IN_PROGRESS", will cause a device which is executing the job to be unable to
     *        update the job execution status. Use caution and ensure that each device executing a job which is canceled
     *        is able to recover to a valid state.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CancelJobRequest withForce(Boolean force) {
        setForce(force);
        return this;
    }

    /**
     * <p>
     * (Optional) If <code>true</code> job executions with status "IN_PROGRESS" and "QUEUED" are canceled, otherwise
     * only job executions with status "QUEUED" are canceled. The default is <code>false</code>.
     * </p>
     * <p>
     * Canceling a job which is "IN_PROGRESS", will cause a device which is executing the job to be unable to update the
     * job execution status. Use caution and ensure that each device executing a job which is canceled is able to
     * recover to a valid state.
     * </p>
     * 
     * @return (Optional) If <code>true</code> job executions with status "IN_PROGRESS" and "QUEUED" are canceled,
     *         otherwise only job executions with status "QUEUED" are canceled. The default is <code>false</code>.</p>
     *         <p>
     *         Canceling a job which is "IN_PROGRESS", will cause a device which is executing the job to be unable to
     *         update the job execution status. Use caution and ensure that each device executing a job which is
     *         canceled is able to recover to a valid state.
     */

    public Boolean isForce() {
        return this.force;
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
        if (getJobId() != null)
            sb.append("JobId: ").append(getJobId()).append(",");
        if (getReasonCode() != null)
            sb.append("ReasonCode: ").append(getReasonCode()).append(",");
        if (getComment() != null)
            sb.append("Comment: ").append(getComment()).append(",");
        if (getForce() != null)
            sb.append("Force: ").append(getForce());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CancelJobRequest == false)
            return false;
        CancelJobRequest other = (CancelJobRequest) obj;
        if (other.getJobId() == null ^ this.getJobId() == null)
            return false;
        if (other.getJobId() != null && other.getJobId().equals(this.getJobId()) == false)
            return false;
        if (other.getReasonCode() == null ^ this.getReasonCode() == null)
            return false;
        if (other.getReasonCode() != null && other.getReasonCode().equals(this.getReasonCode()) == false)
            return false;
        if (other.getComment() == null ^ this.getComment() == null)
            return false;
        if (other.getComment() != null && other.getComment().equals(this.getComment()) == false)
            return false;
        if (other.getForce() == null ^ this.getForce() == null)
            return false;
        if (other.getForce() != null && other.getForce().equals(this.getForce()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getJobId() == null) ? 0 : getJobId().hashCode());
        hashCode = prime * hashCode + ((getReasonCode() == null) ? 0 : getReasonCode().hashCode());
        hashCode = prime * hashCode + ((getComment() == null) ? 0 : getComment().hashCode());
        hashCode = prime * hashCode + ((getForce() == null) ? 0 : getForce().hashCode());
        return hashCode;
    }

    @Override
    public CancelJobRequest clone() {
        return (CancelJobRequest) super.clone();
    }

}
