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
 * Container for the parameters to the {@link com.amazonaws.services.machinelearning.AmazonMachineLearning#updateMLModel(UpdateMLModelRequest) UpdateMLModel operation}.
 * <p>
 * Updates the <code>MLModelName</code> and the
 * <code>ScoreThreshold</code> of an <code>MLModel</code> .
 * </p>
 * <p>
 * You can use the GetMLModel operation to view the contents of the
 * updated data element.
 * </p>
 *
 * @see com.amazonaws.services.machinelearning.AmazonMachineLearning#updateMLModel(UpdateMLModelRequest)
 */
public class UpdateMLModelRequest extends AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * The ID assigned to the <code>MLModel</code> during creation.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     */
    private String mLModelId;

    /**
     * A user-supplied name or description of the <code>MLModel</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>.*\S.*|^$<br/>
     */
    private String mLModelName;

    /**
     * The <code>ScoreThreshold</code> used in binary classification
     * <code>MLModel</code> that marks the boundary between a positive
     * prediction and a negative prediction. <p>Output values greater than or
     * equal to the <code>ScoreThreshold</code> receive a positive result
     * from the <code>MLModel</code>, such as <code>true</code>. Output
     * values less than the <code>ScoreThreshold</code> receive a negative
     * response from the <code>MLModel</code>, such as <code>false</code>.
     */
    private Float scoreThreshold;

    /**
     * The ID assigned to the <code>MLModel</code> during creation.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @return The ID assigned to the <code>MLModel</code> during creation.
     */
    public String getMLModelId() {
        return mLModelId;
    }
    
    /**
     * The ID assigned to the <code>MLModel</code> during creation.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @param mLModelId The ID assigned to the <code>MLModel</code> during creation.
     */
    public void setMLModelId(String mLModelId) {
        this.mLModelId = mLModelId;
    }
    
    /**
     * The ID assigned to the <code>MLModel</code> during creation.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @param mLModelId The ID assigned to the <code>MLModel</code> during creation.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public UpdateMLModelRequest withMLModelId(String mLModelId) {
        this.mLModelId = mLModelId;
        return this;
    }

    /**
     * A user-supplied name or description of the <code>MLModel</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>.*\S.*|^$<br/>
     *
     * @return A user-supplied name or description of the <code>MLModel</code>.
     */
    public String getMLModelName() {
        return mLModelName;
    }
    
    /**
     * A user-supplied name or description of the <code>MLModel</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>.*\S.*|^$<br/>
     *
     * @param mLModelName A user-supplied name or description of the <code>MLModel</code>.
     */
    public void setMLModelName(String mLModelName) {
        this.mLModelName = mLModelName;
    }
    
    /**
     * A user-supplied name or description of the <code>MLModel</code>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>.*\S.*|^$<br/>
     *
     * @param mLModelName A user-supplied name or description of the <code>MLModel</code>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public UpdateMLModelRequest withMLModelName(String mLModelName) {
        this.mLModelName = mLModelName;
        return this;
    }

    /**
     * The <code>ScoreThreshold</code> used in binary classification
     * <code>MLModel</code> that marks the boundary between a positive
     * prediction and a negative prediction. <p>Output values greater than or
     * equal to the <code>ScoreThreshold</code> receive a positive result
     * from the <code>MLModel</code>, such as <code>true</code>. Output
     * values less than the <code>ScoreThreshold</code> receive a negative
     * response from the <code>MLModel</code>, such as <code>false</code>.
     *
     * @return The <code>ScoreThreshold</code> used in binary classification
     *         <code>MLModel</code> that marks the boundary between a positive
     *         prediction and a negative prediction. <p>Output values greater than or
     *         equal to the <code>ScoreThreshold</code> receive a positive result
     *         from the <code>MLModel</code>, such as <code>true</code>. Output
     *         values less than the <code>ScoreThreshold</code> receive a negative
     *         response from the <code>MLModel</code>, such as <code>false</code>.
     */
    public Float getScoreThreshold() {
        return scoreThreshold;
    }
    
    /**
     * The <code>ScoreThreshold</code> used in binary classification
     * <code>MLModel</code> that marks the boundary between a positive
     * prediction and a negative prediction. <p>Output values greater than or
     * equal to the <code>ScoreThreshold</code> receive a positive result
     * from the <code>MLModel</code>, such as <code>true</code>. Output
     * values less than the <code>ScoreThreshold</code> receive a negative
     * response from the <code>MLModel</code>, such as <code>false</code>.
     *
     * @param scoreThreshold The <code>ScoreThreshold</code> used in binary classification
     *         <code>MLModel</code> that marks the boundary between a positive
     *         prediction and a negative prediction. <p>Output values greater than or
     *         equal to the <code>ScoreThreshold</code> receive a positive result
     *         from the <code>MLModel</code>, such as <code>true</code>. Output
     *         values less than the <code>ScoreThreshold</code> receive a negative
     *         response from the <code>MLModel</code>, such as <code>false</code>.
     */
    public void setScoreThreshold(Float scoreThreshold) {
        this.scoreThreshold = scoreThreshold;
    }
    
    /**
     * The <code>ScoreThreshold</code> used in binary classification
     * <code>MLModel</code> that marks the boundary between a positive
     * prediction and a negative prediction. <p>Output values greater than or
     * equal to the <code>ScoreThreshold</code> receive a positive result
     * from the <code>MLModel</code>, such as <code>true</code>. Output
     * values less than the <code>ScoreThreshold</code> receive a negative
     * response from the <code>MLModel</code>, such as <code>false</code>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param scoreThreshold The <code>ScoreThreshold</code> used in binary classification
     *         <code>MLModel</code> that marks the boundary between a positive
     *         prediction and a negative prediction. <p>Output values greater than or
     *         equal to the <code>ScoreThreshold</code> receive a positive result
     *         from the <code>MLModel</code>, such as <code>true</code>. Output
     *         values less than the <code>ScoreThreshold</code> receive a negative
     *         response from the <code>MLModel</code>, such as <code>false</code>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public UpdateMLModelRequest withScoreThreshold(Float scoreThreshold) {
        this.scoreThreshold = scoreThreshold;
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
        if (getMLModelName() != null) sb.append("MLModelName: " + getMLModelName() + ",");
        if (getScoreThreshold() != null) sb.append("ScoreThreshold: " + getScoreThreshold() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getMLModelId() == null) ? 0 : getMLModelId().hashCode()); 
        hashCode = prime * hashCode + ((getMLModelName() == null) ? 0 : getMLModelName().hashCode()); 
        hashCode = prime * hashCode + ((getScoreThreshold() == null) ? 0 : getScoreThreshold().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof UpdateMLModelRequest == false) return false;
        UpdateMLModelRequest other = (UpdateMLModelRequest)obj;
        
        if (other.getMLModelId() == null ^ this.getMLModelId() == null) return false;
        if (other.getMLModelId() != null && other.getMLModelId().equals(this.getMLModelId()) == false) return false; 
        if (other.getMLModelName() == null ^ this.getMLModelName() == null) return false;
        if (other.getMLModelName() != null && other.getMLModelName().equals(this.getMLModelName()) == false) return false; 
        if (other.getScoreThreshold() == null ^ this.getScoreThreshold() == null) return false;
        if (other.getScoreThreshold() != null && other.getScoreThreshold().equals(this.getScoreThreshold()) == false) return false; 
        return true;
    }
    
    @Override
    public UpdateMLModelRequest clone() {
        
            return (UpdateMLModelRequest) super.clone();
    }

}
    