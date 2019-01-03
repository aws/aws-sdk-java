/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.machinelearning.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Represents the output of a <code>CreateBatchPrediction</code> operation, and is an acknowledgement that Amazon ML
 * received the request.
 * </p>
 * <p>
 * The <code>CreateBatchPrediction</code> operation is asynchronous. You can poll for status updates by using the
 * <code>&gt;GetBatchPrediction</code> operation and checking the <code>Status</code> parameter of the result.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateBatchPredictionResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A user-supplied ID that uniquely identifies the <code>BatchPrediction</code>. This value is identical to the
     * value of the <code>BatchPredictionId</code> in the request.
     * </p>
     */
    private String batchPredictionId;

    /**
     * <p>
     * A user-supplied ID that uniquely identifies the <code>BatchPrediction</code>. This value is identical to the
     * value of the <code>BatchPredictionId</code> in the request.
     * </p>
     * 
     * @param batchPredictionId
     *        A user-supplied ID that uniquely identifies the <code>BatchPrediction</code>. This value is identical to
     *        the value of the <code>BatchPredictionId</code> in the request.
     */

    public void setBatchPredictionId(String batchPredictionId) {
        this.batchPredictionId = batchPredictionId;
    }

    /**
     * <p>
     * A user-supplied ID that uniquely identifies the <code>BatchPrediction</code>. This value is identical to the
     * value of the <code>BatchPredictionId</code> in the request.
     * </p>
     * 
     * @return A user-supplied ID that uniquely identifies the <code>BatchPrediction</code>. This value is identical to
     *         the value of the <code>BatchPredictionId</code> in the request.
     */

    public String getBatchPredictionId() {
        return this.batchPredictionId;
    }

    /**
     * <p>
     * A user-supplied ID that uniquely identifies the <code>BatchPrediction</code>. This value is identical to the
     * value of the <code>BatchPredictionId</code> in the request.
     * </p>
     * 
     * @param batchPredictionId
     *        A user-supplied ID that uniquely identifies the <code>BatchPrediction</code>. This value is identical to
     *        the value of the <code>BatchPredictionId</code> in the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateBatchPredictionResult withBatchPredictionId(String batchPredictionId) {
        setBatchPredictionId(batchPredictionId);
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
        if (getBatchPredictionId() != null)
            sb.append("BatchPredictionId: ").append(getBatchPredictionId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateBatchPredictionResult == false)
            return false;
        CreateBatchPredictionResult other = (CreateBatchPredictionResult) obj;
        if (other.getBatchPredictionId() == null ^ this.getBatchPredictionId() == null)
            return false;
        if (other.getBatchPredictionId() != null && other.getBatchPredictionId().equals(this.getBatchPredictionId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBatchPredictionId() == null) ? 0 : getBatchPredictionId().hashCode());
        return hashCode;
    }

    @Override
    public CreateBatchPredictionResult clone() {
        try {
            return (CreateBatchPredictionResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
