/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The model version evalutions.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/frauddetector-2019-11-15/ModelVersionEvaluation"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ModelVersionEvaluation implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The output variable name.
     * </p>
     */
    private String outputVariableName;
    /**
     * <p>
     * The evaluation score generated for the model version.
     * </p>
     */
    private String evaluationScore;
    /**
     * <p>
     * The prediction explanations generated for the model version.
     * </p>
     */
    private PredictionExplanations predictionExplanations;

    /**
     * <p>
     * The output variable name.
     * </p>
     * 
     * @param outputVariableName
     *        The output variable name.
     */

    public void setOutputVariableName(String outputVariableName) {
        this.outputVariableName = outputVariableName;
    }

    /**
     * <p>
     * The output variable name.
     * </p>
     * 
     * @return The output variable name.
     */

    public String getOutputVariableName() {
        return this.outputVariableName;
    }

    /**
     * <p>
     * The output variable name.
     * </p>
     * 
     * @param outputVariableName
     *        The output variable name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModelVersionEvaluation withOutputVariableName(String outputVariableName) {
        setOutputVariableName(outputVariableName);
        return this;
    }

    /**
     * <p>
     * The evaluation score generated for the model version.
     * </p>
     * 
     * @param evaluationScore
     *        The evaluation score generated for the model version.
     */

    public void setEvaluationScore(String evaluationScore) {
        this.evaluationScore = evaluationScore;
    }

    /**
     * <p>
     * The evaluation score generated for the model version.
     * </p>
     * 
     * @return The evaluation score generated for the model version.
     */

    public String getEvaluationScore() {
        return this.evaluationScore;
    }

    /**
     * <p>
     * The evaluation score generated for the model version.
     * </p>
     * 
     * @param evaluationScore
     *        The evaluation score generated for the model version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModelVersionEvaluation withEvaluationScore(String evaluationScore) {
        setEvaluationScore(evaluationScore);
        return this;
    }

    /**
     * <p>
     * The prediction explanations generated for the model version.
     * </p>
     * 
     * @param predictionExplanations
     *        The prediction explanations generated for the model version.
     */

    public void setPredictionExplanations(PredictionExplanations predictionExplanations) {
        this.predictionExplanations = predictionExplanations;
    }

    /**
     * <p>
     * The prediction explanations generated for the model version.
     * </p>
     * 
     * @return The prediction explanations generated for the model version.
     */

    public PredictionExplanations getPredictionExplanations() {
        return this.predictionExplanations;
    }

    /**
     * <p>
     * The prediction explanations generated for the model version.
     * </p>
     * 
     * @param predictionExplanations
     *        The prediction explanations generated for the model version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModelVersionEvaluation withPredictionExplanations(PredictionExplanations predictionExplanations) {
        setPredictionExplanations(predictionExplanations);
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
        if (getOutputVariableName() != null)
            sb.append("OutputVariableName: ").append(getOutputVariableName()).append(",");
        if (getEvaluationScore() != null)
            sb.append("EvaluationScore: ").append(getEvaluationScore()).append(",");
        if (getPredictionExplanations() != null)
            sb.append("PredictionExplanations: ").append(getPredictionExplanations());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ModelVersionEvaluation == false)
            return false;
        ModelVersionEvaluation other = (ModelVersionEvaluation) obj;
        if (other.getOutputVariableName() == null ^ this.getOutputVariableName() == null)
            return false;
        if (other.getOutputVariableName() != null && other.getOutputVariableName().equals(this.getOutputVariableName()) == false)
            return false;
        if (other.getEvaluationScore() == null ^ this.getEvaluationScore() == null)
            return false;
        if (other.getEvaluationScore() != null && other.getEvaluationScore().equals(this.getEvaluationScore()) == false)
            return false;
        if (other.getPredictionExplanations() == null ^ this.getPredictionExplanations() == null)
            return false;
        if (other.getPredictionExplanations() != null && other.getPredictionExplanations().equals(this.getPredictionExplanations()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getOutputVariableName() == null) ? 0 : getOutputVariableName().hashCode());
        hashCode = prime * hashCode + ((getEvaluationScore() == null) ? 0 : getEvaluationScore().hashCode());
        hashCode = prime * hashCode + ((getPredictionExplanations() == null) ? 0 : getPredictionExplanations().hashCode());
        return hashCode;
    }

    @Override
    public ModelVersionEvaluation clone() {
        try {
            return (ModelVersionEvaluation) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.frauddetector.model.transform.ModelVersionEvaluationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
