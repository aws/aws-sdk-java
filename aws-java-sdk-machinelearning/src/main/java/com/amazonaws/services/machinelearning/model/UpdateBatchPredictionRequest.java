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
 * Container for the parameters to the {@link com.amazonaws.services.machinelearning.AmazonMachineLearning#updateBatchPrediction(UpdateBatchPredictionRequest) UpdateBatchPrediction operation}.
 * <p>
 * Updates the <code>BatchPredictionName</code> of a
 * <code>BatchPrediction</code> .
 * </p>
 * <p>
 * You can use the GetBatchPrediction operation to view the contents of
 * the updated data element.
 * </p>
 *
 * @see com.amazonaws.services.machinelearning.AmazonMachineLearning#updateBatchPrediction(UpdateBatchPredictionRequest)
 */
public class UpdateBatchPredictionRequest extends AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * The ID assigned to the <code>BatchPrediction</code> during creation.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     */
    private String batchPredictionId;

    /**
     * A new user-supplied name or description of the
     * <code>BatchPrediction</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>.*\S.*|^$<br/>
     */
    private String batchPredictionName;

    /**
     * The ID assigned to the <code>BatchPrediction</code> during creation.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @return The ID assigned to the <code>BatchPrediction</code> during creation.
     */
    public String getBatchPredictionId() {
        return batchPredictionId;
    }
    
    /**
     * The ID assigned to the <code>BatchPrediction</code> during creation.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @param batchPredictionId The ID assigned to the <code>BatchPrediction</code> during creation.
     */
    public void setBatchPredictionId(String batchPredictionId) {
        this.batchPredictionId = batchPredictionId;
    }
    
    /**
     * The ID assigned to the <code>BatchPrediction</code> during creation.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @param batchPredictionId The ID assigned to the <code>BatchPrediction</code> during creation.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public UpdateBatchPredictionRequest withBatchPredictionId(String batchPredictionId) {
        this.batchPredictionId = batchPredictionId;
        return this;
    }

    /**
     * A new user-supplied name or description of the
     * <code>BatchPrediction</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>.*\S.*|^$<br/>
     *
     * @return A new user-supplied name or description of the
     *         <code>BatchPrediction</code>.
     */
    public String getBatchPredictionName() {
        return batchPredictionName;
    }
    
    /**
     * A new user-supplied name or description of the
     * <code>BatchPrediction</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>.*\S.*|^$<br/>
     *
     * @param batchPredictionName A new user-supplied name or description of the
     *         <code>BatchPrediction</code>.
     */
    public void setBatchPredictionName(String batchPredictionName) {
        this.batchPredictionName = batchPredictionName;
    }
    
    /**
     * A new user-supplied name or description of the
     * <code>BatchPrediction</code>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>.*\S.*|^$<br/>
     *
     * @param batchPredictionName A new user-supplied name or description of the
     *         <code>BatchPrediction</code>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public UpdateBatchPredictionRequest withBatchPredictionName(String batchPredictionName) {
        this.batchPredictionName = batchPredictionName;
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
        if (getBatchPredictionId() != null) sb.append("BatchPredictionId: " + getBatchPredictionId() + ",");
        if (getBatchPredictionName() != null) sb.append("BatchPredictionName: " + getBatchPredictionName() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getBatchPredictionId() == null) ? 0 : getBatchPredictionId().hashCode()); 
        hashCode = prime * hashCode + ((getBatchPredictionName() == null) ? 0 : getBatchPredictionName().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof UpdateBatchPredictionRequest == false) return false;
        UpdateBatchPredictionRequest other = (UpdateBatchPredictionRequest)obj;
        
        if (other.getBatchPredictionId() == null ^ this.getBatchPredictionId() == null) return false;
        if (other.getBatchPredictionId() != null && other.getBatchPredictionId().equals(this.getBatchPredictionId()) == false) return false; 
        if (other.getBatchPredictionName() == null ^ this.getBatchPredictionName() == null) return false;
        if (other.getBatchPredictionName() != null && other.getBatchPredictionName().equals(this.getBatchPredictionName()) == false) return false; 
        return true;
    }
    
    @Override
    public UpdateBatchPredictionRequest clone() {
        
            return (UpdateBatchPredictionRequest) super.clone();
    }

}
    