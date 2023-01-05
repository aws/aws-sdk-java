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
package com.amazonaws.services.braket.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/braket-2019-09-01/CancelJob" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CancelJobResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The status of the job cancellation request.
     * </p>
     */
    private String cancellationStatus;
    /**
     * <p>
     * The ARN of the Amazon Braket job.
     * </p>
     */
    private String jobArn;

    /**
     * <p>
     * The status of the job cancellation request.
     * </p>
     * 
     * @param cancellationStatus
     *        The status of the job cancellation request.
     * @see CancellationStatus
     */

    public void setCancellationStatus(String cancellationStatus) {
        this.cancellationStatus = cancellationStatus;
    }

    /**
     * <p>
     * The status of the job cancellation request.
     * </p>
     * 
     * @return The status of the job cancellation request.
     * @see CancellationStatus
     */

    public String getCancellationStatus() {
        return this.cancellationStatus;
    }

    /**
     * <p>
     * The status of the job cancellation request.
     * </p>
     * 
     * @param cancellationStatus
     *        The status of the job cancellation request.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CancellationStatus
     */

    public CancelJobResult withCancellationStatus(String cancellationStatus) {
        setCancellationStatus(cancellationStatus);
        return this;
    }

    /**
     * <p>
     * The status of the job cancellation request.
     * </p>
     * 
     * @param cancellationStatus
     *        The status of the job cancellation request.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CancellationStatus
     */

    public CancelJobResult withCancellationStatus(CancellationStatus cancellationStatus) {
        this.cancellationStatus = cancellationStatus.toString();
        return this;
    }

    /**
     * <p>
     * The ARN of the Amazon Braket job.
     * </p>
     * 
     * @param jobArn
     *        The ARN of the Amazon Braket job.
     */

    public void setJobArn(String jobArn) {
        this.jobArn = jobArn;
    }

    /**
     * <p>
     * The ARN of the Amazon Braket job.
     * </p>
     * 
     * @return The ARN of the Amazon Braket job.
     */

    public String getJobArn() {
        return this.jobArn;
    }

    /**
     * <p>
     * The ARN of the Amazon Braket job.
     * </p>
     * 
     * @param jobArn
     *        The ARN of the Amazon Braket job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CancelJobResult withJobArn(String jobArn) {
        setJobArn(jobArn);
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
        if (getCancellationStatus() != null)
            sb.append("CancellationStatus: ").append(getCancellationStatus()).append(",");
        if (getJobArn() != null)
            sb.append("JobArn: ").append(getJobArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CancelJobResult == false)
            return false;
        CancelJobResult other = (CancelJobResult) obj;
        if (other.getCancellationStatus() == null ^ this.getCancellationStatus() == null)
            return false;
        if (other.getCancellationStatus() != null && other.getCancellationStatus().equals(this.getCancellationStatus()) == false)
            return false;
        if (other.getJobArn() == null ^ this.getJobArn() == null)
            return false;
        if (other.getJobArn() != null && other.getJobArn().equals(this.getJobArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCancellationStatus() == null) ? 0 : getCancellationStatus().hashCode());
        hashCode = prime * hashCode + ((getJobArn() == null) ? 0 : getJobArn().hashCode());
        return hashCode;
    }

    @Override
    public CancelJobResult clone() {
        try {
            return (CancelJobResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
