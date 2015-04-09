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
 * Container for the parameters to the {@link com.amazonaws.services.machinelearning.AmazonMachineLearning#createEvaluation(CreateEvaluationRequest) CreateEvaluation operation}.
 * <p>
 * Creates a new <code>Evaluation</code> of an <code>MLModel</code> . An
 * <code>MLModel</code> is evaluated on a set of observations associated
 * to a <code>DataSource</code> . Like a <code>DataSource</code> for an
 * <code>MLModel</code> , the <code>DataSource</code> for an
 * <code>Evaluation</code> contains values for the Target Variable. The
 * <code>Evaluation</code> compares the predicted result for each
 * observation to the actual outcome and provides a summary so that you
 * know how effective the <code>MLModel</code> functions on the test
 * data. Evaluation generates a relevant performance metric such as
 * BinaryAUC, RegressionRMSE or MulticlassAvgFScore based on the
 * corresponding <code>MLModelType</code> :
 * <code>BINARY</code> ,
 * <code>REGRESSION</code> or <code>MULTICLASS</code>
 * .
 * 
 * </p>
 * <p>
 * <code>CreateEvaluation</code> is an asynchronous operation. In
 * response to <code>CreateEvaluation</code> , Amazon Machine Learning
 * (Amazon ML) immediately returns and sets the evaluation status to
 * <code>PENDING</code> . After the <code>Evaluation</code> is created
 * and ready for use, Amazon ML sets the status to <code>COMPLETED</code>
 * .
 * 
 * </p>
 * <p>
 * You can use the GetEvaluation operation to check progress of the
 * evaluation during the creation operation.
 * </p>
 *
 * @see com.amazonaws.services.machinelearning.AmazonMachineLearning#createEvaluation(CreateEvaluationRequest)
 */
public class CreateEvaluationRequest extends AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * A user-supplied ID that uniquely identifies the
     * <code>Evaluation</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     */
    private String evaluationId;

    /**
     * A user-supplied name or description of the <code>Evaluation</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>.*\S.*|^$<br/>
     */
    private String evaluationName;

    /**
     * The ID of the <code>MLModel</code> to evaluate. <p>The schema used in
     * creating the <code>MLModel</code> must match the schema of the
     * <code>DataSource</code> used in the <code>Evaluation</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     */
    private String mLModelId;

    /**
     * The ID of the <code>DataSource</code> for the evaluation. The schema
     * of the <code>DataSource</code> must match the schema used to create
     * the <code>MLModel</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     */
    private String evaluationDataSourceId;

    /**
     * A user-supplied ID that uniquely identifies the
     * <code>Evaluation</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @return A user-supplied ID that uniquely identifies the
     *         <code>Evaluation</code>.
     */
    public String getEvaluationId() {
        return evaluationId;
    }
    
    /**
     * A user-supplied ID that uniquely identifies the
     * <code>Evaluation</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @param evaluationId A user-supplied ID that uniquely identifies the
     *         <code>Evaluation</code>.
     */
    public void setEvaluationId(String evaluationId) {
        this.evaluationId = evaluationId;
    }
    
    /**
     * A user-supplied ID that uniquely identifies the
     * <code>Evaluation</code>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @param evaluationId A user-supplied ID that uniquely identifies the
     *         <code>Evaluation</code>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateEvaluationRequest withEvaluationId(String evaluationId) {
        this.evaluationId = evaluationId;
        return this;
    }

    /**
     * A user-supplied name or description of the <code>Evaluation</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>.*\S.*|^$<br/>
     *
     * @return A user-supplied name or description of the <code>Evaluation</code>.
     */
    public String getEvaluationName() {
        return evaluationName;
    }
    
    /**
     * A user-supplied name or description of the <code>Evaluation</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>.*\S.*|^$<br/>
     *
     * @param evaluationName A user-supplied name or description of the <code>Evaluation</code>.
     */
    public void setEvaluationName(String evaluationName) {
        this.evaluationName = evaluationName;
    }
    
    /**
     * A user-supplied name or description of the <code>Evaluation</code>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>.*\S.*|^$<br/>
     *
     * @param evaluationName A user-supplied name or description of the <code>Evaluation</code>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateEvaluationRequest withEvaluationName(String evaluationName) {
        this.evaluationName = evaluationName;
        return this;
    }

    /**
     * The ID of the <code>MLModel</code> to evaluate. <p>The schema used in
     * creating the <code>MLModel</code> must match the schema of the
     * <code>DataSource</code> used in the <code>Evaluation</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @return The ID of the <code>MLModel</code> to evaluate. <p>The schema used in
     *         creating the <code>MLModel</code> must match the schema of the
     *         <code>DataSource</code> used in the <code>Evaluation</code>.
     */
    public String getMLModelId() {
        return mLModelId;
    }
    
    /**
     * The ID of the <code>MLModel</code> to evaluate. <p>The schema used in
     * creating the <code>MLModel</code> must match the schema of the
     * <code>DataSource</code> used in the <code>Evaluation</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @param mLModelId The ID of the <code>MLModel</code> to evaluate. <p>The schema used in
     *         creating the <code>MLModel</code> must match the schema of the
     *         <code>DataSource</code> used in the <code>Evaluation</code>.
     */
    public void setMLModelId(String mLModelId) {
        this.mLModelId = mLModelId;
    }
    
    /**
     * The ID of the <code>MLModel</code> to evaluate. <p>The schema used in
     * creating the <code>MLModel</code> must match the schema of the
     * <code>DataSource</code> used in the <code>Evaluation</code>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @param mLModelId The ID of the <code>MLModel</code> to evaluate. <p>The schema used in
     *         creating the <code>MLModel</code> must match the schema of the
     *         <code>DataSource</code> used in the <code>Evaluation</code>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateEvaluationRequest withMLModelId(String mLModelId) {
        this.mLModelId = mLModelId;
        return this;
    }

    /**
     * The ID of the <code>DataSource</code> for the evaluation. The schema
     * of the <code>DataSource</code> must match the schema used to create
     * the <code>MLModel</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @return The ID of the <code>DataSource</code> for the evaluation. The schema
     *         of the <code>DataSource</code> must match the schema used to create
     *         the <code>MLModel</code>.
     */
    public String getEvaluationDataSourceId() {
        return evaluationDataSourceId;
    }
    
    /**
     * The ID of the <code>DataSource</code> for the evaluation. The schema
     * of the <code>DataSource</code> must match the schema used to create
     * the <code>MLModel</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @param evaluationDataSourceId The ID of the <code>DataSource</code> for the evaluation. The schema
     *         of the <code>DataSource</code> must match the schema used to create
     *         the <code>MLModel</code>.
     */
    public void setEvaluationDataSourceId(String evaluationDataSourceId) {
        this.evaluationDataSourceId = evaluationDataSourceId;
    }
    
    /**
     * The ID of the <code>DataSource</code> for the evaluation. The schema
     * of the <code>DataSource</code> must match the schema used to create
     * the <code>MLModel</code>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @param evaluationDataSourceId The ID of the <code>DataSource</code> for the evaluation. The schema
     *         of the <code>DataSource</code> must match the schema used to create
     *         the <code>MLModel</code>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateEvaluationRequest withEvaluationDataSourceId(String evaluationDataSourceId) {
        this.evaluationDataSourceId = evaluationDataSourceId;
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
        if (getEvaluationName() != null) sb.append("EvaluationName: " + getEvaluationName() + ",");
        if (getMLModelId() != null) sb.append("MLModelId: " + getMLModelId() + ",");
        if (getEvaluationDataSourceId() != null) sb.append("EvaluationDataSourceId: " + getEvaluationDataSourceId() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getEvaluationId() == null) ? 0 : getEvaluationId().hashCode()); 
        hashCode = prime * hashCode + ((getEvaluationName() == null) ? 0 : getEvaluationName().hashCode()); 
        hashCode = prime * hashCode + ((getMLModelId() == null) ? 0 : getMLModelId().hashCode()); 
        hashCode = prime * hashCode + ((getEvaluationDataSourceId() == null) ? 0 : getEvaluationDataSourceId().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof CreateEvaluationRequest == false) return false;
        CreateEvaluationRequest other = (CreateEvaluationRequest)obj;
        
        if (other.getEvaluationId() == null ^ this.getEvaluationId() == null) return false;
        if (other.getEvaluationId() != null && other.getEvaluationId().equals(this.getEvaluationId()) == false) return false; 
        if (other.getEvaluationName() == null ^ this.getEvaluationName() == null) return false;
        if (other.getEvaluationName() != null && other.getEvaluationName().equals(this.getEvaluationName()) == false) return false; 
        if (other.getMLModelId() == null ^ this.getMLModelId() == null) return false;
        if (other.getMLModelId() != null && other.getMLModelId().equals(this.getMLModelId()) == false) return false; 
        if (other.getEvaluationDataSourceId() == null ^ this.getEvaluationDataSourceId() == null) return false;
        if (other.getEvaluationDataSourceId() != null && other.getEvaluationDataSourceId().equals(this.getEvaluationDataSourceId()) == false) return false; 
        return true;
    }
    
    @Override
    public CreateEvaluationRequest clone() {
        
            return (CreateEvaluationRequest) super.clone();
    }

}
    