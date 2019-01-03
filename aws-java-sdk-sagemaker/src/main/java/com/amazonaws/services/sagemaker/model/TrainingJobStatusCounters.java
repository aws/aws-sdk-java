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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The numbers of training jobs launched by a hyperparameter tuning job, categorized by status.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/TrainingJobStatusCounters"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TrainingJobStatusCounters implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The number of completed training jobs launched by the hyperparameter tuning job.
     * </p>
     */
    private Integer completed;
    /**
     * <p>
     * The number of in-progress training jobs launched by a hyperparameter tuning job.
     * </p>
     */
    private Integer inProgress;
    /**
     * <p>
     * The number of training jobs that failed, but can be retried. A failed training job can be retried only if it
     * failed because an internal service error occurred.
     * </p>
     */
    private Integer retryableError;
    /**
     * <p>
     * The number of training jobs that failed and can't be retried. A failed training job can't be retried if it failed
     * because a client error occurred.
     * </p>
     */
    private Integer nonRetryableError;
    /**
     * <p>
     * The number of training jobs launched by a hyperparameter tuning job that were manually stopped.
     * </p>
     */
    private Integer stopped;

    /**
     * <p>
     * The number of completed training jobs launched by the hyperparameter tuning job.
     * </p>
     * 
     * @param completed
     *        The number of completed training jobs launched by the hyperparameter tuning job.
     */

    public void setCompleted(Integer completed) {
        this.completed = completed;
    }

    /**
     * <p>
     * The number of completed training jobs launched by the hyperparameter tuning job.
     * </p>
     * 
     * @return The number of completed training jobs launched by the hyperparameter tuning job.
     */

    public Integer getCompleted() {
        return this.completed;
    }

    /**
     * <p>
     * The number of completed training jobs launched by the hyperparameter tuning job.
     * </p>
     * 
     * @param completed
     *        The number of completed training jobs launched by the hyperparameter tuning job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TrainingJobStatusCounters withCompleted(Integer completed) {
        setCompleted(completed);
        return this;
    }

    /**
     * <p>
     * The number of in-progress training jobs launched by a hyperparameter tuning job.
     * </p>
     * 
     * @param inProgress
     *        The number of in-progress training jobs launched by a hyperparameter tuning job.
     */

    public void setInProgress(Integer inProgress) {
        this.inProgress = inProgress;
    }

    /**
     * <p>
     * The number of in-progress training jobs launched by a hyperparameter tuning job.
     * </p>
     * 
     * @return The number of in-progress training jobs launched by a hyperparameter tuning job.
     */

    public Integer getInProgress() {
        return this.inProgress;
    }

    /**
     * <p>
     * The number of in-progress training jobs launched by a hyperparameter tuning job.
     * </p>
     * 
     * @param inProgress
     *        The number of in-progress training jobs launched by a hyperparameter tuning job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TrainingJobStatusCounters withInProgress(Integer inProgress) {
        setInProgress(inProgress);
        return this;
    }

    /**
     * <p>
     * The number of training jobs that failed, but can be retried. A failed training job can be retried only if it
     * failed because an internal service error occurred.
     * </p>
     * 
     * @param retryableError
     *        The number of training jobs that failed, but can be retried. A failed training job can be retried only if
     *        it failed because an internal service error occurred.
     */

    public void setRetryableError(Integer retryableError) {
        this.retryableError = retryableError;
    }

    /**
     * <p>
     * The number of training jobs that failed, but can be retried. A failed training job can be retried only if it
     * failed because an internal service error occurred.
     * </p>
     * 
     * @return The number of training jobs that failed, but can be retried. A failed training job can be retried only if
     *         it failed because an internal service error occurred.
     */

    public Integer getRetryableError() {
        return this.retryableError;
    }

    /**
     * <p>
     * The number of training jobs that failed, but can be retried. A failed training job can be retried only if it
     * failed because an internal service error occurred.
     * </p>
     * 
     * @param retryableError
     *        The number of training jobs that failed, but can be retried. A failed training job can be retried only if
     *        it failed because an internal service error occurred.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TrainingJobStatusCounters withRetryableError(Integer retryableError) {
        setRetryableError(retryableError);
        return this;
    }

    /**
     * <p>
     * The number of training jobs that failed and can't be retried. A failed training job can't be retried if it failed
     * because a client error occurred.
     * </p>
     * 
     * @param nonRetryableError
     *        The number of training jobs that failed and can't be retried. A failed training job can't be retried if it
     *        failed because a client error occurred.
     */

    public void setNonRetryableError(Integer nonRetryableError) {
        this.nonRetryableError = nonRetryableError;
    }

    /**
     * <p>
     * The number of training jobs that failed and can't be retried. A failed training job can't be retried if it failed
     * because a client error occurred.
     * </p>
     * 
     * @return The number of training jobs that failed and can't be retried. A failed training job can't be retried if
     *         it failed because a client error occurred.
     */

    public Integer getNonRetryableError() {
        return this.nonRetryableError;
    }

    /**
     * <p>
     * The number of training jobs that failed and can't be retried. A failed training job can't be retried if it failed
     * because a client error occurred.
     * </p>
     * 
     * @param nonRetryableError
     *        The number of training jobs that failed and can't be retried. A failed training job can't be retried if it
     *        failed because a client error occurred.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TrainingJobStatusCounters withNonRetryableError(Integer nonRetryableError) {
        setNonRetryableError(nonRetryableError);
        return this;
    }

    /**
     * <p>
     * The number of training jobs launched by a hyperparameter tuning job that were manually stopped.
     * </p>
     * 
     * @param stopped
     *        The number of training jobs launched by a hyperparameter tuning job that were manually stopped.
     */

    public void setStopped(Integer stopped) {
        this.stopped = stopped;
    }

    /**
     * <p>
     * The number of training jobs launched by a hyperparameter tuning job that were manually stopped.
     * </p>
     * 
     * @return The number of training jobs launched by a hyperparameter tuning job that were manually stopped.
     */

    public Integer getStopped() {
        return this.stopped;
    }

    /**
     * <p>
     * The number of training jobs launched by a hyperparameter tuning job that were manually stopped.
     * </p>
     * 
     * @param stopped
     *        The number of training jobs launched by a hyperparameter tuning job that were manually stopped.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TrainingJobStatusCounters withStopped(Integer stopped) {
        setStopped(stopped);
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
        if (getCompleted() != null)
            sb.append("Completed: ").append(getCompleted()).append(",");
        if (getInProgress() != null)
            sb.append("InProgress: ").append(getInProgress()).append(",");
        if (getRetryableError() != null)
            sb.append("RetryableError: ").append(getRetryableError()).append(",");
        if (getNonRetryableError() != null)
            sb.append("NonRetryableError: ").append(getNonRetryableError()).append(",");
        if (getStopped() != null)
            sb.append("Stopped: ").append(getStopped());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TrainingJobStatusCounters == false)
            return false;
        TrainingJobStatusCounters other = (TrainingJobStatusCounters) obj;
        if (other.getCompleted() == null ^ this.getCompleted() == null)
            return false;
        if (other.getCompleted() != null && other.getCompleted().equals(this.getCompleted()) == false)
            return false;
        if (other.getInProgress() == null ^ this.getInProgress() == null)
            return false;
        if (other.getInProgress() != null && other.getInProgress().equals(this.getInProgress()) == false)
            return false;
        if (other.getRetryableError() == null ^ this.getRetryableError() == null)
            return false;
        if (other.getRetryableError() != null && other.getRetryableError().equals(this.getRetryableError()) == false)
            return false;
        if (other.getNonRetryableError() == null ^ this.getNonRetryableError() == null)
            return false;
        if (other.getNonRetryableError() != null && other.getNonRetryableError().equals(this.getNonRetryableError()) == false)
            return false;
        if (other.getStopped() == null ^ this.getStopped() == null)
            return false;
        if (other.getStopped() != null && other.getStopped().equals(this.getStopped()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCompleted() == null) ? 0 : getCompleted().hashCode());
        hashCode = prime * hashCode + ((getInProgress() == null) ? 0 : getInProgress().hashCode());
        hashCode = prime * hashCode + ((getRetryableError() == null) ? 0 : getRetryableError().hashCode());
        hashCode = prime * hashCode + ((getNonRetryableError() == null) ? 0 : getNonRetryableError().hashCode());
        hashCode = prime * hashCode + ((getStopped() == null) ? 0 : getStopped().hashCode());
        return hashCode;
    }

    @Override
    public TrainingJobStatusCounters clone() {
        try {
            return (TrainingJobStatusCounters) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.TrainingJobStatusCountersMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
