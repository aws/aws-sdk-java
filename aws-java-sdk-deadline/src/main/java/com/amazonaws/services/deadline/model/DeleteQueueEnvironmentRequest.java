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
package com.amazonaws.services.deadline.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/DeleteQueueEnvironment" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteQueueEnvironmentRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The farm ID of the farm from which to remove the queue environment.
     * </p>
     */
    private String farmId;
    /**
     * <p>
     * The queue environment ID of the queue environment to delete.
     * </p>
     */
    private String queueEnvironmentId;
    /**
     * <p>
     * The queue ID of the queue environment to delete.
     * </p>
     */
    private String queueId;

    /**
     * <p>
     * The farm ID of the farm from which to remove the queue environment.
     * </p>
     * 
     * @param farmId
     *        The farm ID of the farm from which to remove the queue environment.
     */

    public void setFarmId(String farmId) {
        this.farmId = farmId;
    }

    /**
     * <p>
     * The farm ID of the farm from which to remove the queue environment.
     * </p>
     * 
     * @return The farm ID of the farm from which to remove the queue environment.
     */

    public String getFarmId() {
        return this.farmId;
    }

    /**
     * <p>
     * The farm ID of the farm from which to remove the queue environment.
     * </p>
     * 
     * @param farmId
     *        The farm ID of the farm from which to remove the queue environment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteQueueEnvironmentRequest withFarmId(String farmId) {
        setFarmId(farmId);
        return this;
    }

    /**
     * <p>
     * The queue environment ID of the queue environment to delete.
     * </p>
     * 
     * @param queueEnvironmentId
     *        The queue environment ID of the queue environment to delete.
     */

    public void setQueueEnvironmentId(String queueEnvironmentId) {
        this.queueEnvironmentId = queueEnvironmentId;
    }

    /**
     * <p>
     * The queue environment ID of the queue environment to delete.
     * </p>
     * 
     * @return The queue environment ID of the queue environment to delete.
     */

    public String getQueueEnvironmentId() {
        return this.queueEnvironmentId;
    }

    /**
     * <p>
     * The queue environment ID of the queue environment to delete.
     * </p>
     * 
     * @param queueEnvironmentId
     *        The queue environment ID of the queue environment to delete.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteQueueEnvironmentRequest withQueueEnvironmentId(String queueEnvironmentId) {
        setQueueEnvironmentId(queueEnvironmentId);
        return this;
    }

    /**
     * <p>
     * The queue ID of the queue environment to delete.
     * </p>
     * 
     * @param queueId
     *        The queue ID of the queue environment to delete.
     */

    public void setQueueId(String queueId) {
        this.queueId = queueId;
    }

    /**
     * <p>
     * The queue ID of the queue environment to delete.
     * </p>
     * 
     * @return The queue ID of the queue environment to delete.
     */

    public String getQueueId() {
        return this.queueId;
    }

    /**
     * <p>
     * The queue ID of the queue environment to delete.
     * </p>
     * 
     * @param queueId
     *        The queue ID of the queue environment to delete.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteQueueEnvironmentRequest withQueueId(String queueId) {
        setQueueId(queueId);
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
        if (getFarmId() != null)
            sb.append("FarmId: ").append(getFarmId()).append(",");
        if (getQueueEnvironmentId() != null)
            sb.append("QueueEnvironmentId: ").append(getQueueEnvironmentId()).append(",");
        if (getQueueId() != null)
            sb.append("QueueId: ").append(getQueueId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteQueueEnvironmentRequest == false)
            return false;
        DeleteQueueEnvironmentRequest other = (DeleteQueueEnvironmentRequest) obj;
        if (other.getFarmId() == null ^ this.getFarmId() == null)
            return false;
        if (other.getFarmId() != null && other.getFarmId().equals(this.getFarmId()) == false)
            return false;
        if (other.getQueueEnvironmentId() == null ^ this.getQueueEnvironmentId() == null)
            return false;
        if (other.getQueueEnvironmentId() != null && other.getQueueEnvironmentId().equals(this.getQueueEnvironmentId()) == false)
            return false;
        if (other.getQueueId() == null ^ this.getQueueId() == null)
            return false;
        if (other.getQueueId() != null && other.getQueueId().equals(this.getQueueId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFarmId() == null) ? 0 : getFarmId().hashCode());
        hashCode = prime * hashCode + ((getQueueEnvironmentId() == null) ? 0 : getQueueEnvironmentId().hashCode());
        hashCode = prime * hashCode + ((getQueueId() == null) ? 0 : getQueueId().hashCode());
        return hashCode;
    }

    @Override
    public DeleteQueueEnvironmentRequest clone() {
        return (DeleteQueueEnvironmentRequest) super.clone();
    }

}
