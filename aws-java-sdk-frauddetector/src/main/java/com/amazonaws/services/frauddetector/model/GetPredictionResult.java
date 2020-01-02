/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/frauddetector-2019-11-15/GetPrediction" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetPredictionResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The prediction outcomes.
     * </p>
     */
    private java.util.List<String> outcomes;
    /**
     * <p>
     * The model scores for models used in the detector version.
     * </p>
     */
    private java.util.List<ModelScores> modelScores;

    /**
     * <p>
     * The prediction outcomes.
     * </p>
     * 
     * @return The prediction outcomes.
     */

    public java.util.List<String> getOutcomes() {
        return outcomes;
    }

    /**
     * <p>
     * The prediction outcomes.
     * </p>
     * 
     * @param outcomes
     *        The prediction outcomes.
     */

    public void setOutcomes(java.util.Collection<String> outcomes) {
        if (outcomes == null) {
            this.outcomes = null;
            return;
        }

        this.outcomes = new java.util.ArrayList<String>(outcomes);
    }

    /**
     * <p>
     * The prediction outcomes.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setOutcomes(java.util.Collection)} or {@link #withOutcomes(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param outcomes
     *        The prediction outcomes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetPredictionResult withOutcomes(String... outcomes) {
        if (this.outcomes == null) {
            setOutcomes(new java.util.ArrayList<String>(outcomes.length));
        }
        for (String ele : outcomes) {
            this.outcomes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The prediction outcomes.
     * </p>
     * 
     * @param outcomes
     *        The prediction outcomes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetPredictionResult withOutcomes(java.util.Collection<String> outcomes) {
        setOutcomes(outcomes);
        return this;
    }

    /**
     * <p>
     * The model scores for models used in the detector version.
     * </p>
     * 
     * @return The model scores for models used in the detector version.
     */

    public java.util.List<ModelScores> getModelScores() {
        return modelScores;
    }

    /**
     * <p>
     * The model scores for models used in the detector version.
     * </p>
     * 
     * @param modelScores
     *        The model scores for models used in the detector version.
     */

    public void setModelScores(java.util.Collection<ModelScores> modelScores) {
        if (modelScores == null) {
            this.modelScores = null;
            return;
        }

        this.modelScores = new java.util.ArrayList<ModelScores>(modelScores);
    }

    /**
     * <p>
     * The model scores for models used in the detector version.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setModelScores(java.util.Collection)} or {@link #withModelScores(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param modelScores
     *        The model scores for models used in the detector version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetPredictionResult withModelScores(ModelScores... modelScores) {
        if (this.modelScores == null) {
            setModelScores(new java.util.ArrayList<ModelScores>(modelScores.length));
        }
        for (ModelScores ele : modelScores) {
            this.modelScores.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The model scores for models used in the detector version.
     * </p>
     * 
     * @param modelScores
     *        The model scores for models used in the detector version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetPredictionResult withModelScores(java.util.Collection<ModelScores> modelScores) {
        setModelScores(modelScores);
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
        if (getOutcomes() != null)
            sb.append("Outcomes: ").append(getOutcomes()).append(",");
        if (getModelScores() != null)
            sb.append("ModelScores: ").append(getModelScores());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetPredictionResult == false)
            return false;
        GetPredictionResult other = (GetPredictionResult) obj;
        if (other.getOutcomes() == null ^ this.getOutcomes() == null)
            return false;
        if (other.getOutcomes() != null && other.getOutcomes().equals(this.getOutcomes()) == false)
            return false;
        if (other.getModelScores() == null ^ this.getModelScores() == null)
            return false;
        if (other.getModelScores() != null && other.getModelScores().equals(this.getModelScores()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getOutcomes() == null) ? 0 : getOutcomes().hashCode());
        hashCode = prime * hashCode + ((getModelScores() == null) ? 0 : getModelScores().hashCode());
        return hashCode;
    }

    @Override
    public GetPredictionResult clone() {
        try {
            return (GetPredictionResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
