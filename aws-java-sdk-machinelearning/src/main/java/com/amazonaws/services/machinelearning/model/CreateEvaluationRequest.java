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
public class CreateEvaluationRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A user-supplied ID that uniquely identifies the <code>Evaluation</code>.
     * </p>
     */
    private String evaluationId;
    /**
     * <p>
     * A user-supplied name or description of the <code>Evaluation</code>.
     * </p>
     */
    private String evaluationName;
    /**
     * <p>
     * The ID of the <code>MLModel</code> to evaluate.
     * </p>
     * <p>
     * The schema used in creating the <code>MLModel</code> must match the schema of the <code>DataSource</code> used in
     * the <code>Evaluation</code>.
     * </p>
     */
    private String mLModelId;
    /**
     * <p>
     * The ID of the <code>DataSource</code> for the evaluation. The schema of the <code>DataSource</code> must match
     * the schema used to create the <code>MLModel</code>.
     * </p>
     */
    private String evaluationDataSourceId;

    /**
     * <p>
     * A user-supplied ID that uniquely identifies the <code>Evaluation</code>.
     * </p>
     * 
     * @param evaluationId
     *        A user-supplied ID that uniquely identifies the <code>Evaluation</code>.
     */

    public void setEvaluationId(String evaluationId) {
        this.evaluationId = evaluationId;
    }

    /**
     * <p>
     * A user-supplied ID that uniquely identifies the <code>Evaluation</code>.
     * </p>
     * 
     * @return A user-supplied ID that uniquely identifies the <code>Evaluation</code>.
     */

    public String getEvaluationId() {
        return this.evaluationId;
    }

    /**
     * <p>
     * A user-supplied ID that uniquely identifies the <code>Evaluation</code>.
     * </p>
     * 
     * @param evaluationId
     *        A user-supplied ID that uniquely identifies the <code>Evaluation</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateEvaluationRequest withEvaluationId(String evaluationId) {
        setEvaluationId(evaluationId);
        return this;
    }

    /**
     * <p>
     * A user-supplied name or description of the <code>Evaluation</code>.
     * </p>
     * 
     * @param evaluationName
     *        A user-supplied name or description of the <code>Evaluation</code>.
     */

    public void setEvaluationName(String evaluationName) {
        this.evaluationName = evaluationName;
    }

    /**
     * <p>
     * A user-supplied name or description of the <code>Evaluation</code>.
     * </p>
     * 
     * @return A user-supplied name or description of the <code>Evaluation</code>.
     */

    public String getEvaluationName() {
        return this.evaluationName;
    }

    /**
     * <p>
     * A user-supplied name or description of the <code>Evaluation</code>.
     * </p>
     * 
     * @param evaluationName
     *        A user-supplied name or description of the <code>Evaluation</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateEvaluationRequest withEvaluationName(String evaluationName) {
        setEvaluationName(evaluationName);
        return this;
    }

    /**
     * <p>
     * The ID of the <code>MLModel</code> to evaluate.
     * </p>
     * <p>
     * The schema used in creating the <code>MLModel</code> must match the schema of the <code>DataSource</code> used in
     * the <code>Evaluation</code>.
     * </p>
     * 
     * @param mLModelId
     *        The ID of the <code>MLModel</code> to evaluate.</p>
     *        <p>
     *        The schema used in creating the <code>MLModel</code> must match the schema of the <code>DataSource</code>
     *        used in the <code>Evaluation</code>.
     */

    public void setMLModelId(String mLModelId) {
        this.mLModelId = mLModelId;
    }

    /**
     * <p>
     * The ID of the <code>MLModel</code> to evaluate.
     * </p>
     * <p>
     * The schema used in creating the <code>MLModel</code> must match the schema of the <code>DataSource</code> used in
     * the <code>Evaluation</code>.
     * </p>
     * 
     * @return The ID of the <code>MLModel</code> to evaluate.</p>
     *         <p>
     *         The schema used in creating the <code>MLModel</code> must match the schema of the <code>DataSource</code>
     *         used in the <code>Evaluation</code>.
     */

    public String getMLModelId() {
        return this.mLModelId;
    }

    /**
     * <p>
     * The ID of the <code>MLModel</code> to evaluate.
     * </p>
     * <p>
     * The schema used in creating the <code>MLModel</code> must match the schema of the <code>DataSource</code> used in
     * the <code>Evaluation</code>.
     * </p>
     * 
     * @param mLModelId
     *        The ID of the <code>MLModel</code> to evaluate.</p>
     *        <p>
     *        The schema used in creating the <code>MLModel</code> must match the schema of the <code>DataSource</code>
     *        used in the <code>Evaluation</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateEvaluationRequest withMLModelId(String mLModelId) {
        setMLModelId(mLModelId);
        return this;
    }

    /**
     * <p>
     * The ID of the <code>DataSource</code> for the evaluation. The schema of the <code>DataSource</code> must match
     * the schema used to create the <code>MLModel</code>.
     * </p>
     * 
     * @param evaluationDataSourceId
     *        The ID of the <code>DataSource</code> for the evaluation. The schema of the <code>DataSource</code> must
     *        match the schema used to create the <code>MLModel</code>.
     */

    public void setEvaluationDataSourceId(String evaluationDataSourceId) {
        this.evaluationDataSourceId = evaluationDataSourceId;
    }

    /**
     * <p>
     * The ID of the <code>DataSource</code> for the evaluation. The schema of the <code>DataSource</code> must match
     * the schema used to create the <code>MLModel</code>.
     * </p>
     * 
     * @return The ID of the <code>DataSource</code> for the evaluation. The schema of the <code>DataSource</code> must
     *         match the schema used to create the <code>MLModel</code>.
     */

    public String getEvaluationDataSourceId() {
        return this.evaluationDataSourceId;
    }

    /**
     * <p>
     * The ID of the <code>DataSource</code> for the evaluation. The schema of the <code>DataSource</code> must match
     * the schema used to create the <code>MLModel</code>.
     * </p>
     * 
     * @param evaluationDataSourceId
     *        The ID of the <code>DataSource</code> for the evaluation. The schema of the <code>DataSource</code> must
     *        match the schema used to create the <code>MLModel</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateEvaluationRequest withEvaluationDataSourceId(String evaluationDataSourceId) {
        setEvaluationDataSourceId(evaluationDataSourceId);
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
        if (getEvaluationId() != null)
            sb.append("EvaluationId: ").append(getEvaluationId()).append(",");
        if (getEvaluationName() != null)
            sb.append("EvaluationName: ").append(getEvaluationName()).append(",");
        if (getMLModelId() != null)
            sb.append("MLModelId: ").append(getMLModelId()).append(",");
        if (getEvaluationDataSourceId() != null)
            sb.append("EvaluationDataSourceId: ").append(getEvaluationDataSourceId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateEvaluationRequest == false)
            return false;
        CreateEvaluationRequest other = (CreateEvaluationRequest) obj;
        if (other.getEvaluationId() == null ^ this.getEvaluationId() == null)
            return false;
        if (other.getEvaluationId() != null && other.getEvaluationId().equals(this.getEvaluationId()) == false)
            return false;
        if (other.getEvaluationName() == null ^ this.getEvaluationName() == null)
            return false;
        if (other.getEvaluationName() != null && other.getEvaluationName().equals(this.getEvaluationName()) == false)
            return false;
        if (other.getMLModelId() == null ^ this.getMLModelId() == null)
            return false;
        if (other.getMLModelId() != null && other.getMLModelId().equals(this.getMLModelId()) == false)
            return false;
        if (other.getEvaluationDataSourceId() == null ^ this.getEvaluationDataSourceId() == null)
            return false;
        if (other.getEvaluationDataSourceId() != null && other.getEvaluationDataSourceId().equals(this.getEvaluationDataSourceId()) == false)
            return false;
        return true;
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
    public CreateEvaluationRequest clone() {
        return (CreateEvaluationRequest) super.clone();
    }

}
