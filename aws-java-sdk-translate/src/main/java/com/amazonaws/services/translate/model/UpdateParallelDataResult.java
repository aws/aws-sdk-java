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
package com.amazonaws.services.translate.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/translate-2017-07-01/UpdateParallelData" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateParallelDataResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the parallel data resource being updated.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The status of the parallel data resource that you are attempting to update. Your update request is accepted only
     * if this status is either <code>ACTIVE</code> or <code>FAILED</code>.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The status of the parallel data update attempt. When the updated parallel data resource is ready for you to use,
     * the status is <code>ACTIVE</code>.
     * </p>
     */
    private String latestUpdateAttemptStatus;
    /**
     * <p>
     * The time that the most recent update was attempted.
     * </p>
     */
    private java.util.Date latestUpdateAttemptAt;

    /**
     * <p>
     * The name of the parallel data resource being updated.
     * </p>
     * 
     * @param name
     *        The name of the parallel data resource being updated.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the parallel data resource being updated.
     * </p>
     * 
     * @return The name of the parallel data resource being updated.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the parallel data resource being updated.
     * </p>
     * 
     * @param name
     *        The name of the parallel data resource being updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateParallelDataResult withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The status of the parallel data resource that you are attempting to update. Your update request is accepted only
     * if this status is either <code>ACTIVE</code> or <code>FAILED</code>.
     * </p>
     * 
     * @param status
     *        The status of the parallel data resource that you are attempting to update. Your update request is
     *        accepted only if this status is either <code>ACTIVE</code> or <code>FAILED</code>.
     * @see ParallelDataStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the parallel data resource that you are attempting to update. Your update request is accepted only
     * if this status is either <code>ACTIVE</code> or <code>FAILED</code>.
     * </p>
     * 
     * @return The status of the parallel data resource that you are attempting to update. Your update request is
     *         accepted only if this status is either <code>ACTIVE</code> or <code>FAILED</code>.
     * @see ParallelDataStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the parallel data resource that you are attempting to update. Your update request is accepted only
     * if this status is either <code>ACTIVE</code> or <code>FAILED</code>.
     * </p>
     * 
     * @param status
     *        The status of the parallel data resource that you are attempting to update. Your update request is
     *        accepted only if this status is either <code>ACTIVE</code> or <code>FAILED</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ParallelDataStatus
     */

    public UpdateParallelDataResult withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the parallel data resource that you are attempting to update. Your update request is accepted only
     * if this status is either <code>ACTIVE</code> or <code>FAILED</code>.
     * </p>
     * 
     * @param status
     *        The status of the parallel data resource that you are attempting to update. Your update request is
     *        accepted only if this status is either <code>ACTIVE</code> or <code>FAILED</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ParallelDataStatus
     */

    public UpdateParallelDataResult withStatus(ParallelDataStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The status of the parallel data update attempt. When the updated parallel data resource is ready for you to use,
     * the status is <code>ACTIVE</code>.
     * </p>
     * 
     * @param latestUpdateAttemptStatus
     *        The status of the parallel data update attempt. When the updated parallel data resource is ready for you
     *        to use, the status is <code>ACTIVE</code>.
     * @see ParallelDataStatus
     */

    public void setLatestUpdateAttemptStatus(String latestUpdateAttemptStatus) {
        this.latestUpdateAttemptStatus = latestUpdateAttemptStatus;
    }

    /**
     * <p>
     * The status of the parallel data update attempt. When the updated parallel data resource is ready for you to use,
     * the status is <code>ACTIVE</code>.
     * </p>
     * 
     * @return The status of the parallel data update attempt. When the updated parallel data resource is ready for you
     *         to use, the status is <code>ACTIVE</code>.
     * @see ParallelDataStatus
     */

    public String getLatestUpdateAttemptStatus() {
        return this.latestUpdateAttemptStatus;
    }

    /**
     * <p>
     * The status of the parallel data update attempt. When the updated parallel data resource is ready for you to use,
     * the status is <code>ACTIVE</code>.
     * </p>
     * 
     * @param latestUpdateAttemptStatus
     *        The status of the parallel data update attempt. When the updated parallel data resource is ready for you
     *        to use, the status is <code>ACTIVE</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ParallelDataStatus
     */

    public UpdateParallelDataResult withLatestUpdateAttemptStatus(String latestUpdateAttemptStatus) {
        setLatestUpdateAttemptStatus(latestUpdateAttemptStatus);
        return this;
    }

    /**
     * <p>
     * The status of the parallel data update attempt. When the updated parallel data resource is ready for you to use,
     * the status is <code>ACTIVE</code>.
     * </p>
     * 
     * @param latestUpdateAttemptStatus
     *        The status of the parallel data update attempt. When the updated parallel data resource is ready for you
     *        to use, the status is <code>ACTIVE</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ParallelDataStatus
     */

    public UpdateParallelDataResult withLatestUpdateAttemptStatus(ParallelDataStatus latestUpdateAttemptStatus) {
        this.latestUpdateAttemptStatus = latestUpdateAttemptStatus.toString();
        return this;
    }

    /**
     * <p>
     * The time that the most recent update was attempted.
     * </p>
     * 
     * @param latestUpdateAttemptAt
     *        The time that the most recent update was attempted.
     */

    public void setLatestUpdateAttemptAt(java.util.Date latestUpdateAttemptAt) {
        this.latestUpdateAttemptAt = latestUpdateAttemptAt;
    }

    /**
     * <p>
     * The time that the most recent update was attempted.
     * </p>
     * 
     * @return The time that the most recent update was attempted.
     */

    public java.util.Date getLatestUpdateAttemptAt() {
        return this.latestUpdateAttemptAt;
    }

    /**
     * <p>
     * The time that the most recent update was attempted.
     * </p>
     * 
     * @param latestUpdateAttemptAt
     *        The time that the most recent update was attempted.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateParallelDataResult withLatestUpdateAttemptAt(java.util.Date latestUpdateAttemptAt) {
        setLatestUpdateAttemptAt(latestUpdateAttemptAt);
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getLatestUpdateAttemptStatus() != null)
            sb.append("LatestUpdateAttemptStatus: ").append(getLatestUpdateAttemptStatus()).append(",");
        if (getLatestUpdateAttemptAt() != null)
            sb.append("LatestUpdateAttemptAt: ").append(getLatestUpdateAttemptAt());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateParallelDataResult == false)
            return false;
        UpdateParallelDataResult other = (UpdateParallelDataResult) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getLatestUpdateAttemptStatus() == null ^ this.getLatestUpdateAttemptStatus() == null)
            return false;
        if (other.getLatestUpdateAttemptStatus() != null && other.getLatestUpdateAttemptStatus().equals(this.getLatestUpdateAttemptStatus()) == false)
            return false;
        if (other.getLatestUpdateAttemptAt() == null ^ this.getLatestUpdateAttemptAt() == null)
            return false;
        if (other.getLatestUpdateAttemptAt() != null && other.getLatestUpdateAttemptAt().equals(this.getLatestUpdateAttemptAt()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getLatestUpdateAttemptStatus() == null) ? 0 : getLatestUpdateAttemptStatus().hashCode());
        hashCode = prime * hashCode + ((getLatestUpdateAttemptAt() == null) ? 0 : getLatestUpdateAttemptAt().hashCode());
        return hashCode;
    }

    @Override
    public UpdateParallelDataResult clone() {
        try {
            return (UpdateParallelDataResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
