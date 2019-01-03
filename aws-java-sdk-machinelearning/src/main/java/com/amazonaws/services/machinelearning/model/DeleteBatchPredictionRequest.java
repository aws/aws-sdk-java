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

import com.amazonaws.AmazonWebServiceRequest;

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteBatchPredictionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A user-supplied ID that uniquely identifies the <code>BatchPrediction</code>.
     * </p>
     */
    private String batchPredictionId;

    /**
     * <p>
     * A user-supplied ID that uniquely identifies the <code>BatchPrediction</code>.
     * </p>
     * 
     * @param batchPredictionId
     *        A user-supplied ID that uniquely identifies the <code>BatchPrediction</code>.
     */

    public void setBatchPredictionId(String batchPredictionId) {
        this.batchPredictionId = batchPredictionId;
    }

    /**
     * <p>
     * A user-supplied ID that uniquely identifies the <code>BatchPrediction</code>.
     * </p>
     * 
     * @return A user-supplied ID that uniquely identifies the <code>BatchPrediction</code>.
     */

    public String getBatchPredictionId() {
        return this.batchPredictionId;
    }

    /**
     * <p>
     * A user-supplied ID that uniquely identifies the <code>BatchPrediction</code>.
     * </p>
     * 
     * @param batchPredictionId
     *        A user-supplied ID that uniquely identifies the <code>BatchPrediction</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteBatchPredictionRequest withBatchPredictionId(String batchPredictionId) {
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

        if (obj instanceof DeleteBatchPredictionRequest == false)
            return false;
        DeleteBatchPredictionRequest other = (DeleteBatchPredictionRequest) obj;
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
    public DeleteBatchPredictionRequest clone() {
        return (DeleteBatchPredictionRequest) super.clone();
    }

}
