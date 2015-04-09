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
 * Container for the parameters to the {@link com.amazonaws.services.machinelearning.AmazonMachineLearning#predict(PredictRequest) Predict operation}.
 * <p>
 * Generates a prediction for the observation using the specified
 * <code>MLModel</code> .
 * </p>
 * <p>
 * <b>NOTE:</b> Note Not all response parameters will be populated
 * because this is dependent on the type of requested model.
 * </p>
 *
 * @see com.amazonaws.services.machinelearning.AmazonMachineLearning#predict(PredictRequest)
 */
public class PredictRequest extends AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * A unique identifier of the <code>MLModel</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     */
    private String mLModelId;

    /**
     * A map of variable name-value pairs that represent an observation.
     */
    private java.util.Map<String,String> record;

    private String predictEndpoint;

    /**
     * A unique identifier of the <code>MLModel</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @return A unique identifier of the <code>MLModel</code>.
     */
    public String getMLModelId() {
        return mLModelId;
    }
    
    /**
     * A unique identifier of the <code>MLModel</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @param mLModelId A unique identifier of the <code>MLModel</code>.
     */
    public void setMLModelId(String mLModelId) {
        this.mLModelId = mLModelId;
    }
    
    /**
     * A unique identifier of the <code>MLModel</code>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @param mLModelId A unique identifier of the <code>MLModel</code>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public PredictRequest withMLModelId(String mLModelId) {
        this.mLModelId = mLModelId;
        return this;
    }

    /**
     * A map of variable name-value pairs that represent an observation.
     *
     * @return A map of variable name-value pairs that represent an observation.
     */
    public java.util.Map<String,String> getRecord() {
        
        if (record == null) {
            record = new java.util.HashMap<String,String>();
        }
        return record;
    }
    
    /**
     * A map of variable name-value pairs that represent an observation.
     *
     * @param record A map of variable name-value pairs that represent an observation.
     */
    public void setRecord(java.util.Map<String,String> record) {
        this.record = record;
    }
    
    /**
     * A map of variable name-value pairs that represent an observation.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param record A map of variable name-value pairs that represent an observation.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public PredictRequest withRecord(java.util.Map<String,String> record) {
        setRecord(record);
        return this;
    }

    /**
     * A map of variable name-value pairs that represent an observation.
     * <p>
     * The method adds a new key-value pair into Record parameter, and
     * returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param key The key of the entry to be added into Record.
     * @param value The corresponding value of the entry to be added into Record.
     */
    public PredictRequest addRecordEntry(String key, String value) {
        if (null == this.record) {
            this.record = new java.util.HashMap<String,String>();
        }
        if (this.record.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.record.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Record.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     */
    public PredictRequest clearRecordEntries() {
        this.record = null;
        return this;
    }
    
    /**
     * Returns the value of the PredictEndpoint property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 2048<br/>
     * <b>Pattern: </b>https://[a-zA-Z0-9-.]*\.amazon(aws)?\.com[/]?<br/>
     *
     * @return The value of the PredictEndpoint property for this object.
     */
    public String getPredictEndpoint() {
        return predictEndpoint;
    }
    
    /**
     * Sets the value of the PredictEndpoint property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 2048<br/>
     * <b>Pattern: </b>https://[a-zA-Z0-9-.]*\.amazon(aws)?\.com[/]?<br/>
     *
     * @param predictEndpoint The new value for the PredictEndpoint property for this object.
     */
    public void setPredictEndpoint(String predictEndpoint) {
        this.predictEndpoint = predictEndpoint;
    }
    
    /**
     * Sets the value of the PredictEndpoint property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 2048<br/>
     * <b>Pattern: </b>https://[a-zA-Z0-9-.]*\.amazon(aws)?\.com[/]?<br/>
     *
     * @param predictEndpoint The new value for the PredictEndpoint property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public PredictRequest withPredictEndpoint(String predictEndpoint) {
        this.predictEndpoint = predictEndpoint;
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
        if (getMLModelId() != null) sb.append("MLModelId: " + getMLModelId() + ",");
        if (getRecord() != null) sb.append("Record: " + getRecord() + ",");
        if (getPredictEndpoint() != null) sb.append("PredictEndpoint: " + getPredictEndpoint() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getMLModelId() == null) ? 0 : getMLModelId().hashCode()); 
        hashCode = prime * hashCode + ((getRecord() == null) ? 0 : getRecord().hashCode()); 
        hashCode = prime * hashCode + ((getPredictEndpoint() == null) ? 0 : getPredictEndpoint().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof PredictRequest == false) return false;
        PredictRequest other = (PredictRequest)obj;
        
        if (other.getMLModelId() == null ^ this.getMLModelId() == null) return false;
        if (other.getMLModelId() != null && other.getMLModelId().equals(this.getMLModelId()) == false) return false; 
        if (other.getRecord() == null ^ this.getRecord() == null) return false;
        if (other.getRecord() != null && other.getRecord().equals(this.getRecord()) == false) return false; 
        if (other.getPredictEndpoint() == null ^ this.getPredictEndpoint() == null) return false;
        if (other.getPredictEndpoint() != null && other.getPredictEndpoint().equals(this.getPredictEndpoint()) == false) return false; 
        return true;
    }
    
    @Override
    public PredictRequest clone() {
        
            return (PredictRequest) super.clone();
    }

}
    