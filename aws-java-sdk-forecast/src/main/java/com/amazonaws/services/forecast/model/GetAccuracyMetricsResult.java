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
package com.amazonaws.services.forecast.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/forecast-2018-06-26/GetAccuracyMetrics" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetAccuracyMetricsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * An array of results from evaluating the predictor.
     * </p>
     */
    private java.util.List<EvaluationResult> predictorEvaluationResults;

    /**
     * <p>
     * An array of results from evaluating the predictor.
     * </p>
     * 
     * @return An array of results from evaluating the predictor.
     */

    public java.util.List<EvaluationResult> getPredictorEvaluationResults() {
        return predictorEvaluationResults;
    }

    /**
     * <p>
     * An array of results from evaluating the predictor.
     * </p>
     * 
     * @param predictorEvaluationResults
     *        An array of results from evaluating the predictor.
     */

    public void setPredictorEvaluationResults(java.util.Collection<EvaluationResult> predictorEvaluationResults) {
        if (predictorEvaluationResults == null) {
            this.predictorEvaluationResults = null;
            return;
        }

        this.predictorEvaluationResults = new java.util.ArrayList<EvaluationResult>(predictorEvaluationResults);
    }

    /**
     * <p>
     * An array of results from evaluating the predictor.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPredictorEvaluationResults(java.util.Collection)} or
     * {@link #withPredictorEvaluationResults(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param predictorEvaluationResults
     *        An array of results from evaluating the predictor.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAccuracyMetricsResult withPredictorEvaluationResults(EvaluationResult... predictorEvaluationResults) {
        if (this.predictorEvaluationResults == null) {
            setPredictorEvaluationResults(new java.util.ArrayList<EvaluationResult>(predictorEvaluationResults.length));
        }
        for (EvaluationResult ele : predictorEvaluationResults) {
            this.predictorEvaluationResults.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of results from evaluating the predictor.
     * </p>
     * 
     * @param predictorEvaluationResults
     *        An array of results from evaluating the predictor.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAccuracyMetricsResult withPredictorEvaluationResults(java.util.Collection<EvaluationResult> predictorEvaluationResults) {
        setPredictorEvaluationResults(predictorEvaluationResults);
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
        if (getPredictorEvaluationResults() != null)
            sb.append("PredictorEvaluationResults: ").append(getPredictorEvaluationResults());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetAccuracyMetricsResult == false)
            return false;
        GetAccuracyMetricsResult other = (GetAccuracyMetricsResult) obj;
        if (other.getPredictorEvaluationResults() == null ^ this.getPredictorEvaluationResults() == null)
            return false;
        if (other.getPredictorEvaluationResults() != null && other.getPredictorEvaluationResults().equals(this.getPredictorEvaluationResults()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPredictorEvaluationResults() == null) ? 0 : getPredictorEvaluationResults().hashCode());
        return hashCode;
    }

    @Override
    public GetAccuracyMetricsResult clone() {
        try {
            return (GetAccuracyMetricsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
