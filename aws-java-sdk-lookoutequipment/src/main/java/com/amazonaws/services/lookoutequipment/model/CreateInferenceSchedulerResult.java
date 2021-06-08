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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutequipment-2020-12-15/CreateInferenceScheduler"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateInferenceSchedulerResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the inference scheduler being created.
     * </p>
     */
    private String inferenceSchedulerArn;
    /**
     * <p>
     * The name of inference scheduler being created.
     * </p>
     */
    private String inferenceSchedulerName;
    /**
     * <p>
     * Indicates the status of the <code>CreateInferenceScheduler</code> operation.
     * </p>
     */
    private String status;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the inference scheduler being created.
     * </p>
     * 
     * @param inferenceSchedulerArn
     *        The Amazon Resource Name (ARN) of the inference scheduler being created.
     */

    public void setInferenceSchedulerArn(String inferenceSchedulerArn) {
        this.inferenceSchedulerArn = inferenceSchedulerArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the inference scheduler being created.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the inference scheduler being created.
     */

    public String getInferenceSchedulerArn() {
        return this.inferenceSchedulerArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the inference scheduler being created.
     * </p>
     * 
     * @param inferenceSchedulerArn
     *        The Amazon Resource Name (ARN) of the inference scheduler being created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateInferenceSchedulerResult withInferenceSchedulerArn(String inferenceSchedulerArn) {
        setInferenceSchedulerArn(inferenceSchedulerArn);
        return this;
    }

    /**
     * <p>
     * The name of inference scheduler being created.
     * </p>
     * 
     * @param inferenceSchedulerName
     *        The name of inference scheduler being created.
     */

    public void setInferenceSchedulerName(String inferenceSchedulerName) {
        this.inferenceSchedulerName = inferenceSchedulerName;
    }

    /**
     * <p>
     * The name of inference scheduler being created.
     * </p>
     * 
     * @return The name of inference scheduler being created.
     */

    public String getInferenceSchedulerName() {
        return this.inferenceSchedulerName;
    }

    /**
     * <p>
     * The name of inference scheduler being created.
     * </p>
     * 
     * @param inferenceSchedulerName
     *        The name of inference scheduler being created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateInferenceSchedulerResult withInferenceSchedulerName(String inferenceSchedulerName) {
        setInferenceSchedulerName(inferenceSchedulerName);
        return this;
    }

    /**
     * <p>
     * Indicates the status of the <code>CreateInferenceScheduler</code> operation.
     * </p>
     * 
     * @param status
     *        Indicates the status of the <code>CreateInferenceScheduler</code> operation.
     * @see InferenceSchedulerStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * Indicates the status of the <code>CreateInferenceScheduler</code> operation.
     * </p>
     * 
     * @return Indicates the status of the <code>CreateInferenceScheduler</code> operation.
     * @see InferenceSchedulerStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * Indicates the status of the <code>CreateInferenceScheduler</code> operation.
     * </p>
     * 
     * @param status
     *        Indicates the status of the <code>CreateInferenceScheduler</code> operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InferenceSchedulerStatus
     */

    public CreateInferenceSchedulerResult withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * Indicates the status of the <code>CreateInferenceScheduler</code> operation.
     * </p>
     * 
     * @param status
     *        Indicates the status of the <code>CreateInferenceScheduler</code> operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InferenceSchedulerStatus
     */

    public CreateInferenceSchedulerResult withStatus(InferenceSchedulerStatus status) {
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
        if (getInferenceSchedulerArn() != null)
            sb.append("InferenceSchedulerArn: ").append(getInferenceSchedulerArn()).append(",");
        if (getInferenceSchedulerName() != null)
            sb.append("InferenceSchedulerName: ").append(getInferenceSchedulerName()).append(",");
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

        if (obj instanceof CreateInferenceSchedulerResult == false)
            return false;
        CreateInferenceSchedulerResult other = (CreateInferenceSchedulerResult) obj;
        if (other.getInferenceSchedulerArn() == null ^ this.getInferenceSchedulerArn() == null)
            return false;
        if (other.getInferenceSchedulerArn() != null && other.getInferenceSchedulerArn().equals(this.getInferenceSchedulerArn()) == false)
            return false;
        if (other.getInferenceSchedulerName() == null ^ this.getInferenceSchedulerName() == null)
            return false;
        if (other.getInferenceSchedulerName() != null && other.getInferenceSchedulerName().equals(this.getInferenceSchedulerName()) == false)
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

        hashCode = prime * hashCode + ((getInferenceSchedulerArn() == null) ? 0 : getInferenceSchedulerArn().hashCode());
        hashCode = prime * hashCode + ((getInferenceSchedulerName() == null) ? 0 : getInferenceSchedulerName().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public CreateInferenceSchedulerResult clone() {
        try {
            return (CreateInferenceSchedulerResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
