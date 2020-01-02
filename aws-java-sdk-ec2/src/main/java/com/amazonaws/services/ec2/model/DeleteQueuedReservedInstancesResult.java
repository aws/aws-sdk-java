/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceResult;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteQueuedReservedInstancesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * Information about the queued purchases that were successfully deleted.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<SuccessfulQueuedPurchaseDeletion> successfulQueuedPurchaseDeletions;
    /**
     * <p>
     * Information about the queued purchases that could not be deleted.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<FailedQueuedPurchaseDeletion> failedQueuedPurchaseDeletions;

    /**
     * <p>
     * Information about the queued purchases that were successfully deleted.
     * </p>
     * 
     * @return Information about the queued purchases that were successfully deleted.
     */

    public java.util.List<SuccessfulQueuedPurchaseDeletion> getSuccessfulQueuedPurchaseDeletions() {
        if (successfulQueuedPurchaseDeletions == null) {
            successfulQueuedPurchaseDeletions = new com.amazonaws.internal.SdkInternalList<SuccessfulQueuedPurchaseDeletion>();
        }
        return successfulQueuedPurchaseDeletions;
    }

    /**
     * <p>
     * Information about the queued purchases that were successfully deleted.
     * </p>
     * 
     * @param successfulQueuedPurchaseDeletions
     *        Information about the queued purchases that were successfully deleted.
     */

    public void setSuccessfulQueuedPurchaseDeletions(java.util.Collection<SuccessfulQueuedPurchaseDeletion> successfulQueuedPurchaseDeletions) {
        if (successfulQueuedPurchaseDeletions == null) {
            this.successfulQueuedPurchaseDeletions = null;
            return;
        }

        this.successfulQueuedPurchaseDeletions = new com.amazonaws.internal.SdkInternalList<SuccessfulQueuedPurchaseDeletion>(successfulQueuedPurchaseDeletions);
    }

    /**
     * <p>
     * Information about the queued purchases that were successfully deleted.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSuccessfulQueuedPurchaseDeletions(java.util.Collection)} or
     * {@link #withSuccessfulQueuedPurchaseDeletions(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param successfulQueuedPurchaseDeletions
     *        Information about the queued purchases that were successfully deleted.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteQueuedReservedInstancesResult withSuccessfulQueuedPurchaseDeletions(SuccessfulQueuedPurchaseDeletion... successfulQueuedPurchaseDeletions) {
        if (this.successfulQueuedPurchaseDeletions == null) {
            setSuccessfulQueuedPurchaseDeletions(new com.amazonaws.internal.SdkInternalList<SuccessfulQueuedPurchaseDeletion>(
                    successfulQueuedPurchaseDeletions.length));
        }
        for (SuccessfulQueuedPurchaseDeletion ele : successfulQueuedPurchaseDeletions) {
            this.successfulQueuedPurchaseDeletions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Information about the queued purchases that were successfully deleted.
     * </p>
     * 
     * @param successfulQueuedPurchaseDeletions
     *        Information about the queued purchases that were successfully deleted.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteQueuedReservedInstancesResult withSuccessfulQueuedPurchaseDeletions(
            java.util.Collection<SuccessfulQueuedPurchaseDeletion> successfulQueuedPurchaseDeletions) {
        setSuccessfulQueuedPurchaseDeletions(successfulQueuedPurchaseDeletions);
        return this;
    }

    /**
     * <p>
     * Information about the queued purchases that could not be deleted.
     * </p>
     * 
     * @return Information about the queued purchases that could not be deleted.
     */

    public java.util.List<FailedQueuedPurchaseDeletion> getFailedQueuedPurchaseDeletions() {
        if (failedQueuedPurchaseDeletions == null) {
            failedQueuedPurchaseDeletions = new com.amazonaws.internal.SdkInternalList<FailedQueuedPurchaseDeletion>();
        }
        return failedQueuedPurchaseDeletions;
    }

    /**
     * <p>
     * Information about the queued purchases that could not be deleted.
     * </p>
     * 
     * @param failedQueuedPurchaseDeletions
     *        Information about the queued purchases that could not be deleted.
     */

    public void setFailedQueuedPurchaseDeletions(java.util.Collection<FailedQueuedPurchaseDeletion> failedQueuedPurchaseDeletions) {
        if (failedQueuedPurchaseDeletions == null) {
            this.failedQueuedPurchaseDeletions = null;
            return;
        }

        this.failedQueuedPurchaseDeletions = new com.amazonaws.internal.SdkInternalList<FailedQueuedPurchaseDeletion>(failedQueuedPurchaseDeletions);
    }

    /**
     * <p>
     * Information about the queued purchases that could not be deleted.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFailedQueuedPurchaseDeletions(java.util.Collection)} or
     * {@link #withFailedQueuedPurchaseDeletions(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param failedQueuedPurchaseDeletions
     *        Information about the queued purchases that could not be deleted.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteQueuedReservedInstancesResult withFailedQueuedPurchaseDeletions(FailedQueuedPurchaseDeletion... failedQueuedPurchaseDeletions) {
        if (this.failedQueuedPurchaseDeletions == null) {
            setFailedQueuedPurchaseDeletions(new com.amazonaws.internal.SdkInternalList<FailedQueuedPurchaseDeletion>(failedQueuedPurchaseDeletions.length));
        }
        for (FailedQueuedPurchaseDeletion ele : failedQueuedPurchaseDeletions) {
            this.failedQueuedPurchaseDeletions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Information about the queued purchases that could not be deleted.
     * </p>
     * 
     * @param failedQueuedPurchaseDeletions
     *        Information about the queued purchases that could not be deleted.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteQueuedReservedInstancesResult withFailedQueuedPurchaseDeletions(
            java.util.Collection<FailedQueuedPurchaseDeletion> failedQueuedPurchaseDeletions) {
        setFailedQueuedPurchaseDeletions(failedQueuedPurchaseDeletions);
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
        if (getSuccessfulQueuedPurchaseDeletions() != null)
            sb.append("SuccessfulQueuedPurchaseDeletions: ").append(getSuccessfulQueuedPurchaseDeletions()).append(",");
        if (getFailedQueuedPurchaseDeletions() != null)
            sb.append("FailedQueuedPurchaseDeletions: ").append(getFailedQueuedPurchaseDeletions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteQueuedReservedInstancesResult == false)
            return false;
        DeleteQueuedReservedInstancesResult other = (DeleteQueuedReservedInstancesResult) obj;
        if (other.getSuccessfulQueuedPurchaseDeletions() == null ^ this.getSuccessfulQueuedPurchaseDeletions() == null)
            return false;
        if (other.getSuccessfulQueuedPurchaseDeletions() != null
                && other.getSuccessfulQueuedPurchaseDeletions().equals(this.getSuccessfulQueuedPurchaseDeletions()) == false)
            return false;
        if (other.getFailedQueuedPurchaseDeletions() == null ^ this.getFailedQueuedPurchaseDeletions() == null)
            return false;
        if (other.getFailedQueuedPurchaseDeletions() != null
                && other.getFailedQueuedPurchaseDeletions().equals(this.getFailedQueuedPurchaseDeletions()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSuccessfulQueuedPurchaseDeletions() == null) ? 0 : getSuccessfulQueuedPurchaseDeletions().hashCode());
        hashCode = prime * hashCode + ((getFailedQueuedPurchaseDeletions() == null) ? 0 : getFailedQueuedPurchaseDeletions().hashCode());
        return hashCode;
    }

    @Override
    public DeleteQueuedReservedInstancesResult clone() {
        try {
            return (DeleteQueuedReservedInstancesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
