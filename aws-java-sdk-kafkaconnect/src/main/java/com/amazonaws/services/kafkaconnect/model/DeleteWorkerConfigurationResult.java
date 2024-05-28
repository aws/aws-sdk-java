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
package com.amazonaws.services.kafkaconnect.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kafkaconnect-2021-09-14/DeleteWorkerConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteWorkerConfigurationResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the worker configuration that you requested to delete.
     * </p>
     */
    private String workerConfigurationArn;
    /**
     * <p>
     * The state of the worker configuration.
     * </p>
     */
    private String workerConfigurationState;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the worker configuration that you requested to delete.
     * </p>
     * 
     * @param workerConfigurationArn
     *        The Amazon Resource Name (ARN) of the worker configuration that you requested to delete.
     */

    public void setWorkerConfigurationArn(String workerConfigurationArn) {
        this.workerConfigurationArn = workerConfigurationArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the worker configuration that you requested to delete.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the worker configuration that you requested to delete.
     */

    public String getWorkerConfigurationArn() {
        return this.workerConfigurationArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the worker configuration that you requested to delete.
     * </p>
     * 
     * @param workerConfigurationArn
     *        The Amazon Resource Name (ARN) of the worker configuration that you requested to delete.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteWorkerConfigurationResult withWorkerConfigurationArn(String workerConfigurationArn) {
        setWorkerConfigurationArn(workerConfigurationArn);
        return this;
    }

    /**
     * <p>
     * The state of the worker configuration.
     * </p>
     * 
     * @param workerConfigurationState
     *        The state of the worker configuration.
     * @see WorkerConfigurationState
     */

    public void setWorkerConfigurationState(String workerConfigurationState) {
        this.workerConfigurationState = workerConfigurationState;
    }

    /**
     * <p>
     * The state of the worker configuration.
     * </p>
     * 
     * @return The state of the worker configuration.
     * @see WorkerConfigurationState
     */

    public String getWorkerConfigurationState() {
        return this.workerConfigurationState;
    }

    /**
     * <p>
     * The state of the worker configuration.
     * </p>
     * 
     * @param workerConfigurationState
     *        The state of the worker configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see WorkerConfigurationState
     */

    public DeleteWorkerConfigurationResult withWorkerConfigurationState(String workerConfigurationState) {
        setWorkerConfigurationState(workerConfigurationState);
        return this;
    }

    /**
     * <p>
     * The state of the worker configuration.
     * </p>
     * 
     * @param workerConfigurationState
     *        The state of the worker configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see WorkerConfigurationState
     */

    public DeleteWorkerConfigurationResult withWorkerConfigurationState(WorkerConfigurationState workerConfigurationState) {
        this.workerConfigurationState = workerConfigurationState.toString();
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
        if (getWorkerConfigurationArn() != null)
            sb.append("WorkerConfigurationArn: ").append(getWorkerConfigurationArn()).append(",");
        if (getWorkerConfigurationState() != null)
            sb.append("WorkerConfigurationState: ").append(getWorkerConfigurationState());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteWorkerConfigurationResult == false)
            return false;
        DeleteWorkerConfigurationResult other = (DeleteWorkerConfigurationResult) obj;
        if (other.getWorkerConfigurationArn() == null ^ this.getWorkerConfigurationArn() == null)
            return false;
        if (other.getWorkerConfigurationArn() != null && other.getWorkerConfigurationArn().equals(this.getWorkerConfigurationArn()) == false)
            return false;
        if (other.getWorkerConfigurationState() == null ^ this.getWorkerConfigurationState() == null)
            return false;
        if (other.getWorkerConfigurationState() != null && other.getWorkerConfigurationState().equals(this.getWorkerConfigurationState()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getWorkerConfigurationArn() == null) ? 0 : getWorkerConfigurationArn().hashCode());
        hashCode = prime * hashCode + ((getWorkerConfigurationState() == null) ? 0 : getWorkerConfigurationState().hashCode());
        return hashCode;
    }

    @Override
    public DeleteWorkerConfigurationResult clone() {
        try {
            return (DeleteWorkerConfigurationResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
