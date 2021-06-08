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
package com.amazonaws.services.lookoutequipment.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutequipment-2020-12-15/StopInferenceScheduler"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StopInferenceSchedulerResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the ML model used by the inference scheduler being stopped.
     * </p>
     */
    private String modelArn;
    /**
     * <p>
     * The name of the ML model used by the inference scheduler being stopped.
     * </p>
     */
    private String modelName;
    /**
     * <p>
     * The name of the inference scheduler being stopped.
     * </p>
     */
    private String inferenceSchedulerName;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the inference schedule being stopped.
     * </p>
     */
    private String inferenceSchedulerArn;
    /**
     * <p>
     * Indicates the status of the inference scheduler.
     * </p>
     */
    private String status;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the ML model used by the inference scheduler being stopped.
     * </p>
     * 
     * @param modelArn
     *        The Amazon Resource Name (ARN) of the ML model used by the inference scheduler being stopped.
     */

    public void setModelArn(String modelArn) {
        this.modelArn = modelArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the ML model used by the inference scheduler being stopped.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the ML model used by the inference scheduler being stopped.
     */

    public String getModelArn() {
        return this.modelArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the ML model used by the inference scheduler being stopped.
     * </p>
     * 
     * @param modelArn
     *        The Amazon Resource Name (ARN) of the ML model used by the inference scheduler being stopped.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StopInferenceSchedulerResult withModelArn(String modelArn) {
        setModelArn(modelArn);
        return this;
    }

    /**
     * <p>
     * The name of the ML model used by the inference scheduler being stopped.
     * </p>
     * 
     * @param modelName
     *        The name of the ML model used by the inference scheduler being stopped.
     */

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    /**
     * <p>
     * The name of the ML model used by the inference scheduler being stopped.
     * </p>
     * 
     * @return The name of the ML model used by the inference scheduler being stopped.
     */

    public String getModelName() {
        return this.modelName;
    }

    /**
     * <p>
     * The name of the ML model used by the inference scheduler being stopped.
     * </p>
     * 
     * @param modelName
     *        The name of the ML model used by the inference scheduler being stopped.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StopInferenceSchedulerResult withModelName(String modelName) {
        setModelName(modelName);
        return this;
    }

    /**
     * <p>
     * The name of the inference scheduler being stopped.
     * </p>
     * 
     * @param inferenceSchedulerName
     *        The name of the inference scheduler being stopped.
     */

    public void setInferenceSchedulerName(String inferenceSchedulerName) {
        this.inferenceSchedulerName = inferenceSchedulerName;
    }

    /**
     * <p>
     * The name of the inference scheduler being stopped.
     * </p>
     * 
     * @return The name of the inference scheduler being stopped.
     */

    public String getInferenceSchedulerName() {
        return this.inferenceSchedulerName;
    }

    /**
     * <p>
     * The name of the inference scheduler being stopped.
     * </p>
     * 
     * @param inferenceSchedulerName
     *        The name of the inference scheduler being stopped.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StopInferenceSchedulerResult withInferenceSchedulerName(String inferenceSchedulerName) {
        setInferenceSchedulerName(inferenceSchedulerName);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the inference schedule being stopped.
     * </p>
     * 
     * @param inferenceSchedulerArn
     *        The Amazon Resource Name (ARN) of the inference schedule being stopped.
     */

    public void setInferenceSchedulerArn(String inferenceSchedulerArn) {
        this.inferenceSchedulerArn = inferenceSchedulerArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the inference schedule being stopped.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the inference schedule being stopped.
     */

    public String getInferenceSchedulerArn() {
        return this.inferenceSchedulerArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the inference schedule being stopped.
     * </p>
     * 
     * @param inferenceSchedulerArn
     *        The Amazon Resource Name (ARN) of the inference schedule being stopped.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StopInferenceSchedulerResult withInferenceSchedulerArn(String inferenceSchedulerArn) {
        setInferenceSchedulerArn(inferenceSchedulerArn);
        return this;
    }

    /**
     * <p>
     * Indicates the status of the inference scheduler.
     * </p>
     * 
     * @param status
     *        Indicates the status of the inference scheduler.
     * @see InferenceSchedulerStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * Indicates the status of the inference scheduler.
     * </p>
     * 
     * @return Indicates the status of the inference scheduler.
     * @see InferenceSchedulerStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * Indicates the status of the inference scheduler.
     * </p>
     * 
     * @param status
     *        Indicates the status of the inference scheduler.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InferenceSchedulerStatus
     */

    public StopInferenceSchedulerResult withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * Indicates the status of the inference scheduler.
     * </p>
     * 
     * @param status
     *        Indicates the status of the inference scheduler.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InferenceSchedulerStatus
     */

    public StopInferenceSchedulerResult withStatus(InferenceSchedulerStatus status) {
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
        if (getModelArn() != null)
            sb.append("ModelArn: ").append(getModelArn()).append(",");
        if (getModelName() != null)
            sb.append("ModelName: ").append(getModelName()).append(",");
        if (getInferenceSchedulerName() != null)
            sb.append("InferenceSchedulerName: ").append(getInferenceSchedulerName()).append(",");
        if (getInferenceSchedulerArn() != null)
            sb.append("InferenceSchedulerArn: ").append(getInferenceSchedulerArn()).append(",");
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

        if (obj instanceof StopInferenceSchedulerResult == false)
            return false;
        StopInferenceSchedulerResult other = (StopInferenceSchedulerResult) obj;
        if (other.getModelArn() == null ^ this.getModelArn() == null)
            return false;
        if (other.getModelArn() != null && other.getModelArn().equals(this.getModelArn()) == false)
            return false;
        if (other.getModelName() == null ^ this.getModelName() == null)
            return false;
        if (other.getModelName() != null && other.getModelName().equals(this.getModelName()) == false)
            return false;
        if (other.getInferenceSchedulerName() == null ^ this.getInferenceSchedulerName() == null)
            return false;
        if (other.getInferenceSchedulerName() != null && other.getInferenceSchedulerName().equals(this.getInferenceSchedulerName()) == false)
            return false;
        if (other.getInferenceSchedulerArn() == null ^ this.getInferenceSchedulerArn() == null)
            return false;
        if (other.getInferenceSchedulerArn() != null && other.getInferenceSchedulerArn().equals(this.getInferenceSchedulerArn()) == false)
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

        hashCode = prime * hashCode + ((getModelArn() == null) ? 0 : getModelArn().hashCode());
        hashCode = prime * hashCode + ((getModelName() == null) ? 0 : getModelName().hashCode());
        hashCode = prime * hashCode + ((getInferenceSchedulerName() == null) ? 0 : getInferenceSchedulerName().hashCode());
        hashCode = prime * hashCode + ((getInferenceSchedulerArn() == null) ? 0 : getInferenceSchedulerArn().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public StopInferenceSchedulerResult clone() {
        try {
            return (StopInferenceSchedulerResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
