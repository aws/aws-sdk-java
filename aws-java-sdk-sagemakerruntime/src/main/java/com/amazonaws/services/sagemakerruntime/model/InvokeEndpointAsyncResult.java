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
package com.amazonaws.services.sagemakerruntime.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/runtime.sagemaker-2017-05-13/InvokeEndpointAsync"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InvokeEndpointAsyncResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Identifier for an inference request. This will be the same as the <code>InferenceId</code> specified in the
     * input. Amazon SageMaker will generate an identifier for you if you do not specify one.
     * </p>
     */
    private String inferenceId;
    /**
     * <p>
     * The Amazon S3 URI where the inference response payload is stored.
     * </p>
     */
    private String outputLocation;

    /**
     * <p>
     * Identifier for an inference request. This will be the same as the <code>InferenceId</code> specified in the
     * input. Amazon SageMaker will generate an identifier for you if you do not specify one.
     * </p>
     * 
     * @param inferenceId
     *        Identifier for an inference request. This will be the same as the <code>InferenceId</code> specified in
     *        the input. Amazon SageMaker will generate an identifier for you if you do not specify one.
     */

    public void setInferenceId(String inferenceId) {
        this.inferenceId = inferenceId;
    }

    /**
     * <p>
     * Identifier for an inference request. This will be the same as the <code>InferenceId</code> specified in the
     * input. Amazon SageMaker will generate an identifier for you if you do not specify one.
     * </p>
     * 
     * @return Identifier for an inference request. This will be the same as the <code>InferenceId</code> specified in
     *         the input. Amazon SageMaker will generate an identifier for you if you do not specify one.
     */

    public String getInferenceId() {
        return this.inferenceId;
    }

    /**
     * <p>
     * Identifier for an inference request. This will be the same as the <code>InferenceId</code> specified in the
     * input. Amazon SageMaker will generate an identifier for you if you do not specify one.
     * </p>
     * 
     * @param inferenceId
     *        Identifier for an inference request. This will be the same as the <code>InferenceId</code> specified in
     *        the input. Amazon SageMaker will generate an identifier for you if you do not specify one.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InvokeEndpointAsyncResult withInferenceId(String inferenceId) {
        setInferenceId(inferenceId);
        return this;
    }

    /**
     * <p>
     * The Amazon S3 URI where the inference response payload is stored.
     * </p>
     * 
     * @param outputLocation
     *        The Amazon S3 URI where the inference response payload is stored.
     */

    public void setOutputLocation(String outputLocation) {
        this.outputLocation = outputLocation;
    }

    /**
     * <p>
     * The Amazon S3 URI where the inference response payload is stored.
     * </p>
     * 
     * @return The Amazon S3 URI where the inference response payload is stored.
     */

    public String getOutputLocation() {
        return this.outputLocation;
    }

    /**
     * <p>
     * The Amazon S3 URI where the inference response payload is stored.
     * </p>
     * 
     * @param outputLocation
     *        The Amazon S3 URI where the inference response payload is stored.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InvokeEndpointAsyncResult withOutputLocation(String outputLocation) {
        setOutputLocation(outputLocation);
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
        if (getInferenceId() != null)
            sb.append("InferenceId: ").append(getInferenceId()).append(",");
        if (getOutputLocation() != null)
            sb.append("OutputLocation: ").append(getOutputLocation());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof InvokeEndpointAsyncResult == false)
            return false;
        InvokeEndpointAsyncResult other = (InvokeEndpointAsyncResult) obj;
        if (other.getInferenceId() == null ^ this.getInferenceId() == null)
            return false;
        if (other.getInferenceId() != null && other.getInferenceId().equals(this.getInferenceId()) == false)
            return false;
        if (other.getOutputLocation() == null ^ this.getOutputLocation() == null)
            return false;
        if (other.getOutputLocation() != null && other.getOutputLocation().equals(this.getOutputLocation()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInferenceId() == null) ? 0 : getInferenceId().hashCode());
        hashCode = prime * hashCode + ((getOutputLocation() == null) ? 0 : getOutputLocation().hashCode());
        return hashCode;
    }

    @Override
    public InvokeEndpointAsyncResult clone() {
        try {
            return (InvokeEndpointAsyncResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
