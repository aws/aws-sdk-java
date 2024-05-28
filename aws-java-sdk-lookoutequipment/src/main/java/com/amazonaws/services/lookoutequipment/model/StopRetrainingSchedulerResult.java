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
package com.amazonaws.services.lookoutequipment.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutequipment-2020-12-15/StopRetrainingScheduler"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StopRetrainingSchedulerResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the model whose retraining scheduler is being stopped.
     * </p>
     */
    private String modelName;
    /**
     * <p>
     * The ARN of the model whose retraining scheduler is being stopped.
     * </p>
     */
    private String modelArn;
    /**
     * <p>
     * The status of the retraining scheduler.
     * </p>
     */
    private String status;

    /**
     * <p>
     * The name of the model whose retraining scheduler is being stopped.
     * </p>
     * 
     * @param modelName
     *        The name of the model whose retraining scheduler is being stopped.
     */

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    /**
     * <p>
     * The name of the model whose retraining scheduler is being stopped.
     * </p>
     * 
     * @return The name of the model whose retraining scheduler is being stopped.
     */

    public String getModelName() {
        return this.modelName;
    }

    /**
     * <p>
     * The name of the model whose retraining scheduler is being stopped.
     * </p>
     * 
     * @param modelName
     *        The name of the model whose retraining scheduler is being stopped.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StopRetrainingSchedulerResult withModelName(String modelName) {
        setModelName(modelName);
        return this;
    }

    /**
     * <p>
     * The ARN of the model whose retraining scheduler is being stopped.
     * </p>
     * 
     * @param modelArn
     *        The ARN of the model whose retraining scheduler is being stopped.
     */

    public void setModelArn(String modelArn) {
        this.modelArn = modelArn;
    }

    /**
     * <p>
     * The ARN of the model whose retraining scheduler is being stopped.
     * </p>
     * 
     * @return The ARN of the model whose retraining scheduler is being stopped.
     */

    public String getModelArn() {
        return this.modelArn;
    }

    /**
     * <p>
     * The ARN of the model whose retraining scheduler is being stopped.
     * </p>
     * 
     * @param modelArn
     *        The ARN of the model whose retraining scheduler is being stopped.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StopRetrainingSchedulerResult withModelArn(String modelArn) {
        setModelArn(modelArn);
        return this;
    }

    /**
     * <p>
     * The status of the retraining scheduler.
     * </p>
     * 
     * @param status
     *        The status of the retraining scheduler.
     * @see RetrainingSchedulerStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the retraining scheduler.
     * </p>
     * 
     * @return The status of the retraining scheduler.
     * @see RetrainingSchedulerStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the retraining scheduler.
     * </p>
     * 
     * @param status
     *        The status of the retraining scheduler.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RetrainingSchedulerStatus
     */

    public StopRetrainingSchedulerResult withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the retraining scheduler.
     * </p>
     * 
     * @param status
     *        The status of the retraining scheduler.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RetrainingSchedulerStatus
     */

    public StopRetrainingSchedulerResult withStatus(RetrainingSchedulerStatus status) {
        this.status = status.toString();
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
        if (getModelName() != null)
            sb.append("ModelName: ").append(getModelName()).append(",");
        if (getModelArn() != null)
            sb.append("ModelArn: ").append(getModelArn()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StopRetrainingSchedulerResult == false)
            return false;
        StopRetrainingSchedulerResult other = (StopRetrainingSchedulerResult) obj;
        if (other.getModelName() == null ^ this.getModelName() == null)
            return false;
        if (other.getModelName() != null && other.getModelName().equals(this.getModelName()) == false)
            return false;
        if (other.getModelArn() == null ^ this.getModelArn() == null)
            return false;
        if (other.getModelArn() != null && other.getModelArn().equals(this.getModelArn()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getModelName() == null) ? 0 : getModelName().hashCode());
        hashCode = prime * hashCode + ((getModelArn() == null) ? 0 : getModelArn().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public StopRetrainingSchedulerResult clone() {
        try {
            return (StopRetrainingSchedulerResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
