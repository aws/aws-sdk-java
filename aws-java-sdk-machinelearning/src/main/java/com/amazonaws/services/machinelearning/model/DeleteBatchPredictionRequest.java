/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.machinelearning.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.machinelearning.AmazonMachineLearning#deleteBatchPrediction(DeleteBatchPredictionRequest) DeleteBatchPrediction operation}.
 * <p>
 * Assigns the DELETED status to a <code>BatchPrediction</code> ,
 * rendering it unusable.
 * </p>
 * <p>
 * After using the <code>DeleteBatchPrediction</code> operation, you can
 * use the GetBatchPrediction operation to verify that the status of the
 * <code>BatchPrediction</code> changed to DELETED.
 * </p>
 * Caution The result of the DeleteBatchPrediction operation is
 * irreversible.
 *
 * @see com.amazonaws.services.machinelearning.AmazonMachineLearning#deleteBatchPrediction(DeleteBatchPredictionRequest)
 */
public class DeleteBatchPredictionRequest extends AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * A user-supplied ID that uniquely identifies the
     * <code>BatchPrediction</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     */
    private String batchPredictionId;

    /**
     * A user-supplied ID that uniquely identifies the
     * <code>BatchPrediction</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @return A user-supplied ID that uniquely identifies the
     *         <code>BatchPrediction</code>.
     */
    public String getBatchPredictionId() {
        return batchPredictionId;
    }
    
    /**
     * A user-supplied ID that uniquely identifies the
     * <code>BatchPrediction</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @param batchPredictionId A user-supplied ID that uniquely identifies the
     *         <code>BatchPrediction</code>.
     */
    public void setBatchPredictionId(String batchPredictionId) {
        this.batchPredictionId = batchPredictionId;
    }
    
    /**
     * A user-supplied ID that uniquely identifies the
     * <code>BatchPrediction</code>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @param batchPredictionId A user-supplied ID that uniquely identifies the
     *         <code>BatchPrediction</code>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DeleteBatchPredictionRequest withBatchPredictionId(String batchPredictionId) {
        this.batchPredictionId = batchPredictionId;
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getBatchPredictionId() != null) sb.append("BatchPredictionId: " + getBatchPredictionId() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getBatchPredictionId() == null) ? 0 : getBatchPredictionId().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DeleteBatchPredictionRequest == false) return false;
        DeleteBatchPredictionRequest other = (DeleteBatchPredictionRequest)obj;
        
        if (other.getBatchPredictionId() == null ^ this.getBatchPredictionId() == null) return false;
        if (other.getBatchPredictionId() != null && other.getBatchPredictionId().equals(this.getBatchPredictionId()) == false) return false; 
        return true;
    }
    
    @Override
    public DeleteBatchPredictionRequest clone() {
        
            return (DeleteBatchPredictionRequest) super.clone();
    }

}
    