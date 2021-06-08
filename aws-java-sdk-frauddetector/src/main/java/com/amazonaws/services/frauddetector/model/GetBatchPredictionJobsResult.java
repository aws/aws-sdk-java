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
package com.amazonaws.services.frauddetector.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/frauddetector-2019-11-15/GetBatchPredictionJobs"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetBatchPredictionJobsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * An array containing the details of each batch prediction job.
     * </p>
     */
    private java.util.List<BatchPrediction> batchPredictions;
    /**
     * <p>
     * The next token for the subsequent request.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * An array containing the details of each batch prediction job.
     * </p>
     * 
     * @return An array containing the details of each batch prediction job.
     */

    public java.util.List<BatchPrediction> getBatchPredictions() {
        return batchPredictions;
    }

    /**
     * <p>
     * An array containing the details of each batch prediction job.
     * </p>
     * 
     * @param batchPredictions
     *        An array containing the details of each batch prediction job.
     */

    public void setBatchPredictions(java.util.Collection<BatchPrediction> batchPredictions) {
        if (batchPredictions == null) {
            this.batchPredictions = null;
            return;
        }

        this.batchPredictions = new java.util.ArrayList<BatchPrediction>(batchPredictions);
    }

    /**
     * <p>
     * An array containing the details of each batch prediction job.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setBatchPredictions(java.util.Collection)} or {@link #withBatchPredictions(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param batchPredictions
     *        An array containing the details of each batch prediction job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetBatchPredictionJobsResult withBatchPredictions(BatchPrediction... batchPredictions) {
        if (this.batchPredictions == null) {
            setBatchPredictions(new java.util.ArrayList<BatchPrediction>(batchPredictions.length));
        }
        for (BatchPrediction ele : batchPredictions) {
            this.batchPredictions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array containing the details of each batch prediction job.
     * </p>
     * 
     * @param batchPredictions
     *        An array containing the details of each batch prediction job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetBatchPredictionJobsResult withBatchPredictions(java.util.Collection<BatchPrediction> batchPredictions) {
        setBatchPredictions(batchPredictions);
        return this;
    }

    /**
     * <p>
     * The next token for the subsequent request.
     * </p>
     * 
     * @param nextToken
     *        The next token for the subsequent request.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The next token for the subsequent request.
     * </p>
     * 
     * @return The next token for the subsequent request.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The next token for the subsequent request.
     * </p>
     * 
     * @param nextToken
     *        The next token for the subsequent request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetBatchPredictionJobsResult withNextToken(String nextToken) {
        setNextToken(nextToken);
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
        if (getBatchPredictions() != null)
            sb.append("BatchPredictions: ").append(getBatchPredictions()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetBatchPredictionJobsResult == false)
            return false;
        GetBatchPredictionJobsResult other = (GetBatchPredictionJobsResult) obj;
        if (other.getBatchPredictions() == null ^ this.getBatchPredictions() == null)
            return false;
        if (other.getBatchPredictions() != null && other.getBatchPredictions().equals(this.getBatchPredictions()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBatchPredictions() == null) ? 0 : getBatchPredictions().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public GetBatchPredictionJobsResult clone() {
        try {
            return (GetBatchPredictionJobsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
