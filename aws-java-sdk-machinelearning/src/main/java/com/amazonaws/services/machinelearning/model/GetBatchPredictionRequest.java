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
public class GetBatchPredictionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * An ID assigned to the <code>BatchPrediction</code> at creation.
     * </p>
     */
    private String batchPredictionId;

    /**
     * <p>
     * An ID assigned to the <code>BatchPrediction</code> at creation.
     * </p>
     * 
     * @param batchPredictionId
     *        An ID assigned to the <code>BatchPrediction</code> at creation.
     */

    public void setBatchPredictionId(String batchPredictionId) {
        this.batchPredictionId = batchPredictionId;
    }

    /**
     * <p>
     * An ID assigned to the <code>BatchPrediction</code> at creation.
     * </p>
     * 
     * @return An ID assigned to the <code>BatchPrediction</code> at creation.
     */

    public String getBatchPredictionId() {
        return this.batchPredictionId;
    }

    /**
     * <p>
     * An ID assigned to the <code>BatchPrediction</code> at creation.
     * </p>
     * 
     * @param batchPredictionId
     *        An ID assigned to the <code>BatchPrediction</code> at creation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetBatchPredictionRequest withBatchPredictionId(String batchPredictionId) {
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

        if (obj instanceof GetBatchPredictionRequest == false)
            return false;
        GetBatchPredictionRequest other = (GetBatchPredictionRequest) obj;
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
    public GetBatchPredictionRequest clone() {
        return (GetBatchPredictionRequest) super.clone();
    }

}
