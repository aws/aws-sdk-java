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
 * Container for the parameters to the {@link com.amazonaws.services.machinelearning.AmazonMachineLearning#updateEvaluation(UpdateEvaluationRequest) UpdateEvaluation operation}.
 * <p>
 * Updates the <code>EvaluationName</code> of an <code>Evaluation</code>
 * .
 * </p>
 * <p>
 * You can use the GetEvaluation operation to view the contents of the
 * updated data element.
 * </p>
 *
 * @see com.amazonaws.services.machinelearning.AmazonMachineLearning#updateEvaluation(UpdateEvaluationRequest)
 */
public class UpdateEvaluationRequest extends AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * The ID assigned to the <code>Evaluation</code> during creation.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     */
    private String evaluationId;

    /**
     * A new user-supplied name or description of the <code>Evaluation</code>
     * that will replace the current content.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>.*\S.*|^$<br/>
     */
    private String evaluationName;

    /**
     * The ID assigned to the <code>Evaluation</code> during creation.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @return The ID assigned to the <code>Evaluation</code> during creation.
     */
    public String getEvaluationId() {
        return evaluationId;
    }
    
    /**
     * The ID assigned to the <code>Evaluation</code> during creation.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @param evaluationId The ID assigned to the <code>Evaluation</code> during creation.
     */
    public void setEvaluationId(String evaluationId) {
        this.evaluationId = evaluationId;
    }
    
    /**
     * The ID assigned to the <code>Evaluation</code> during creation.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @param evaluationId The ID assigned to the <code>Evaluation</code> during creation.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public UpdateEvaluationRequest withEvaluationId(String evaluationId) {
        this.evaluationId = evaluationId;
        return this;
    }

    /**
     * A new user-supplied name or description of the <code>Evaluation</code>
     * that will replace the current content.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>.*\S.*|^$<br/>
     *
     * @return A new user-supplied name or description of the <code>Evaluation</code>
     *         that will replace the current content.
     */
    public String getEvaluationName() {
        return evaluationName;
    }
    
    /**
     * A new user-supplied name or description of the <code>Evaluation</code>
     * that will replace the current content.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>.*\S.*|^$<br/>
     *
     * @param evaluationName A new user-supplied name or description of the <code>Evaluation</code>
     *         that will replace the current content.
     */
    public void setEvaluationName(String evaluationName) {
        this.evaluationName = evaluationName;
    }
    
    /**
     * A new user-supplied name or description of the <code>Evaluation</code>
     * that will replace the current content.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>.*\S.*|^$<br/>
     *
     * @param evaluationName A new user-supplied name or description of the <code>Evaluation</code>
     *         that will replace the current content.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public UpdateEvaluationRequest withEvaluationName(String evaluationName) {
        this.evaluationName = evaluationName;
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
        if (getEvaluationId() != null) sb.append("EvaluationId: " + getEvaluationId() + ",");
        if (getEvaluationName() != null) sb.append("EvaluationName: " + getEvaluationName() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getEvaluationId() == null) ? 0 : getEvaluationId().hashCode()); 
        hashCode = prime * hashCode + ((getEvaluationName() == null) ? 0 : getEvaluationName().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof UpdateEvaluationRequest == false) return false;
        UpdateEvaluationRequest other = (UpdateEvaluationRequest)obj;
        
        if (other.getEvaluationId() == null ^ this.getEvaluationId() == null) return false;
        if (other.getEvaluationId() != null && other.getEvaluationId().equals(this.getEvaluationId()) == false) return false; 
        if (other.getEvaluationName() == null ^ this.getEvaluationName() == null) return false;
        if (other.getEvaluationName() != null && other.getEvaluationName().equals(this.getEvaluationName()) == false) return false; 
        return true;
    }
    
    @Override
    public UpdateEvaluationRequest clone() {
        
            return (UpdateEvaluationRequest) super.clone();
    }

}
    