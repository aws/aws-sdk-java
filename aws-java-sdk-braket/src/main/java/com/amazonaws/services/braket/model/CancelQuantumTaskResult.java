/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/braket-2019-09-01/CancelQuantumTask" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CancelQuantumTaskResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The status of the cancellation request.
     * </p>
     */
    private String cancellationStatus;
    /**
     * <p>
     * The ARN of the task.
     * </p>
     */
    private String quantumTaskArn;

    /**
     * <p>
     * The status of the cancellation request.
     * </p>
     * 
     * @param cancellationStatus
     *        The status of the cancellation request.
     * @see CancellationStatus
     */

    public void setCancellationStatus(String cancellationStatus) {
        this.cancellationStatus = cancellationStatus;
    }

    /**
     * <p>
     * The status of the cancellation request.
     * </p>
     * 
     * @return The status of the cancellation request.
     * @see CancellationStatus
     */

    public String getCancellationStatus() {
        return this.cancellationStatus;
    }

    /**
     * <p>
     * The status of the cancellation request.
     * </p>
     * 
     * @param cancellationStatus
     *        The status of the cancellation request.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CancellationStatus
     */

    public CancelQuantumTaskResult withCancellationStatus(String cancellationStatus) {
        setCancellationStatus(cancellationStatus);
        return this;
    }

    /**
     * <p>
     * The status of the cancellation request.
     * </p>
     * 
     * @param cancellationStatus
     *        The status of the cancellation request.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CancellationStatus
     */

    public CancelQuantumTaskResult withCancellationStatus(CancellationStatus cancellationStatus) {
        this.cancellationStatus = cancellationStatus.toString();
        return this;
    }

    /**
     * <p>
     * The ARN of the task.
     * </p>
     * 
     * @param quantumTaskArn
     *        The ARN of the task.
     */

    public void setQuantumTaskArn(String quantumTaskArn) {
        this.quantumTaskArn = quantumTaskArn;
    }

    /**
     * <p>
     * The ARN of the task.
     * </p>
     * 
     * @return The ARN of the task.
     */

    public String getQuantumTaskArn() {
        return this.quantumTaskArn;
    }

    /**
     * <p>
     * The ARN of the task.
     * </p>
     * 
     * @param quantumTaskArn
     *        The ARN of the task.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CancelQuantumTaskResult withQuantumTaskArn(String quantumTaskArn) {
        setQuantumTaskArn(quantumTaskArn);
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
        if (getQuantumTaskArn() != null)
            sb.append("QuantumTaskArn: ").append(getQuantumTaskArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CancelQuantumTaskResult == false)
            return false;
        CancelQuantumTaskResult other = (CancelQuantumTaskResult) obj;
        if (other.getCancellationStatus() == null ^ this.getCancellationStatus() == null)
            return false;
        if (other.getCancellationStatus() != null && other.getCancellationStatus().equals(this.getCancellationStatus()) == false)
            return false;
        if (other.getQuantumTaskArn() == null ^ this.getQuantumTaskArn() == null)
            return false;
        if (other.getQuantumTaskArn() != null && other.getQuantumTaskArn().equals(this.getQuantumTaskArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCancellationStatus() == null) ? 0 : getCancellationStatus().hashCode());
        hashCode = prime * hashCode + ((getQuantumTaskArn() == null) ? 0 : getQuantumTaskArn().hashCode());
        return hashCode;
    }

    @Override
    public CancelQuantumTaskResult clone() {
        try {
            return (CancelQuantumTaskResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
