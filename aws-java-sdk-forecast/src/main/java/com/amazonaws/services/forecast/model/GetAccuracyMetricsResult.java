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
     * Whether the predictor was created with <a>CreateAutoPredictor</a>.
     * </p>
     */
    private Boolean isAutoPredictor;
    /**
     * <note>
     * <p>
     * The <code>LatencyOptimized</code> AutoML override strategy is only available in private beta. Contact AWS Support
     * or your account manager to learn more about access privileges.
     * </p>
     * </note>
     * <p>
     * The AutoML strategy used to train the predictor. Unless <code>LatencyOptimized</code> is specified, the AutoML
     * strategy optimizes predictor accuracy.
     * </p>
     * <p>
     * This parameter is only valid for predictors trained using AutoML.
     * </p>
     */
    private String autoMLOverrideStrategy;
    /**
     * <p>
     * The accuracy metric used to optimize the predictor.
     * </p>
     */
    private String optimizationMetric;

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
     * <p>
     * Whether the predictor was created with <a>CreateAutoPredictor</a>.
     * </p>
     * 
     * @param isAutoPredictor
     *        Whether the predictor was created with <a>CreateAutoPredictor</a>.
     */

    public void setIsAutoPredictor(Boolean isAutoPredictor) {
        this.isAutoPredictor = isAutoPredictor;
    }

    /**
     * <p>
     * Whether the predictor was created with <a>CreateAutoPredictor</a>.
     * </p>
     * 
     * @return Whether the predictor was created with <a>CreateAutoPredictor</a>.
     */

    public Boolean getIsAutoPredictor() {
        return this.isAutoPredictor;
    }

    /**
     * <p>
     * Whether the predictor was created with <a>CreateAutoPredictor</a>.
     * </p>
     * 
     * @param isAutoPredictor
     *        Whether the predictor was created with <a>CreateAutoPredictor</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAccuracyMetricsResult withIsAutoPredictor(Boolean isAutoPredictor) {
        setIsAutoPredictor(isAutoPredictor);
        return this;
    }

    /**
     * <p>
     * Whether the predictor was created with <a>CreateAutoPredictor</a>.
     * </p>
     * 
     * @return Whether the predictor was created with <a>CreateAutoPredictor</a>.
     */

    public Boolean isAutoPredictor() {
        return this.isAutoPredictor;
    }

    /**
     * <note>
     * <p>
     * The <code>LatencyOptimized</code> AutoML override strategy is only available in private beta. Contact AWS Support
     * or your account manager to learn more about access privileges.
     * </p>
     * </note>
     * <p>
     * The AutoML strategy used to train the predictor. Unless <code>LatencyOptimized</code> is specified, the AutoML
     * strategy optimizes predictor accuracy.
     * </p>
     * <p>
     * This parameter is only valid for predictors trained using AutoML.
     * </p>
     * 
     * @param autoMLOverrideStrategy
     *        <p>
     *        The <code>LatencyOptimized</code> AutoML override strategy is only available in private beta. Contact AWS
     *        Support or your account manager to learn more about access privileges.
     *        </p>
     *        </note>
     *        <p>
     *        The AutoML strategy used to train the predictor. Unless <code>LatencyOptimized</code> is specified, the
     *        AutoML strategy optimizes predictor accuracy.
     *        </p>
     *        <p>
     *        This parameter is only valid for predictors trained using AutoML.
     * @see AutoMLOverrideStrategy
     */

    public void setAutoMLOverrideStrategy(String autoMLOverrideStrategy) {
        this.autoMLOverrideStrategy = autoMLOverrideStrategy;
    }

    /**
     * <note>
     * <p>
     * The <code>LatencyOptimized</code> AutoML override strategy is only available in private beta. Contact AWS Support
     * or your account manager to learn more about access privileges.
     * </p>
     * </note>
     * <p>
     * The AutoML strategy used to train the predictor. Unless <code>LatencyOptimized</code> is specified, the AutoML
     * strategy optimizes predictor accuracy.
     * </p>
     * <p>
     * This parameter is only valid for predictors trained using AutoML.
     * </p>
     * 
     * @return <p>
     *         The <code>LatencyOptimized</code> AutoML override strategy is only available in private beta. Contact AWS
     *         Support or your account manager to learn more about access privileges.
     *         </p>
     *         </note>
     *         <p>
     *         The AutoML strategy used to train the predictor. Unless <code>LatencyOptimized</code> is specified, the
     *         AutoML strategy optimizes predictor accuracy.
     *         </p>
     *         <p>
     *         This parameter is only valid for predictors trained using AutoML.
     * @see AutoMLOverrideStrategy
     */

    public String getAutoMLOverrideStrategy() {
        return this.autoMLOverrideStrategy;
    }

    /**
     * <note>
     * <p>
     * The <code>LatencyOptimized</code> AutoML override strategy is only available in private beta. Contact AWS Support
     * or your account manager to learn more about access privileges.
     * </p>
     * </note>
     * <p>
     * The AutoML strategy used to train the predictor. Unless <code>LatencyOptimized</code> is specified, the AutoML
     * strategy optimizes predictor accuracy.
     * </p>
     * <p>
     * This parameter is only valid for predictors trained using AutoML.
     * </p>
     * 
     * @param autoMLOverrideStrategy
     *        <p>
     *        The <code>LatencyOptimized</code> AutoML override strategy is only available in private beta. Contact AWS
     *        Support or your account manager to learn more about access privileges.
     *        </p>
     *        </note>
     *        <p>
     *        The AutoML strategy used to train the predictor. Unless <code>LatencyOptimized</code> is specified, the
     *        AutoML strategy optimizes predictor accuracy.
     *        </p>
     *        <p>
     *        This parameter is only valid for predictors trained using AutoML.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AutoMLOverrideStrategy
     */

    public GetAccuracyMetricsResult withAutoMLOverrideStrategy(String autoMLOverrideStrategy) {
        setAutoMLOverrideStrategy(autoMLOverrideStrategy);
        return this;
    }

    /**
     * <note>
     * <p>
     * The <code>LatencyOptimized</code> AutoML override strategy is only available in private beta. Contact AWS Support
     * or your account manager to learn more about access privileges.
     * </p>
     * </note>
     * <p>
     * The AutoML strategy used to train the predictor. Unless <code>LatencyOptimized</code> is specified, the AutoML
     * strategy optimizes predictor accuracy.
     * </p>
     * <p>
     * This parameter is only valid for predictors trained using AutoML.
     * </p>
     * 
     * @param autoMLOverrideStrategy
     *        <p>
     *        The <code>LatencyOptimized</code> AutoML override strategy is only available in private beta. Contact AWS
     *        Support or your account manager to learn more about access privileges.
     *        </p>
     *        </note>
     *        <p>
     *        The AutoML strategy used to train the predictor. Unless <code>LatencyOptimized</code> is specified, the
     *        AutoML strategy optimizes predictor accuracy.
     *        </p>
     *        <p>
     *        This parameter is only valid for predictors trained using AutoML.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AutoMLOverrideStrategy
     */

    public GetAccuracyMetricsResult withAutoMLOverrideStrategy(AutoMLOverrideStrategy autoMLOverrideStrategy) {
        this.autoMLOverrideStrategy = autoMLOverrideStrategy.toString();
        return this;
    }

    /**
     * <p>
     * The accuracy metric used to optimize the predictor.
     * </p>
     * 
     * @param optimizationMetric
     *        The accuracy metric used to optimize the predictor.
     * @see OptimizationMetric
     */

    public void setOptimizationMetric(String optimizationMetric) {
        this.optimizationMetric = optimizationMetric;
    }

    /**
     * <p>
     * The accuracy metric used to optimize the predictor.
     * </p>
     * 
     * @return The accuracy metric used to optimize the predictor.
     * @see OptimizationMetric
     */

    public String getOptimizationMetric() {
        return this.optimizationMetric;
    }

    /**
     * <p>
     * The accuracy metric used to optimize the predictor.
     * </p>
     * 
     * @param optimizationMetric
     *        The accuracy metric used to optimize the predictor.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OptimizationMetric
     */

    public GetAccuracyMetricsResult withOptimizationMetric(String optimizationMetric) {
        setOptimizationMetric(optimizationMetric);
        return this;
    }

    /**
     * <p>
     * The accuracy metric used to optimize the predictor.
     * </p>
     * 
     * @param optimizationMetric
     *        The accuracy metric used to optimize the predictor.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OptimizationMetric
     */

    public GetAccuracyMetricsResult withOptimizationMetric(OptimizationMetric optimizationMetric) {
        this.optimizationMetric = optimizationMetric.toString();
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
            sb.append("PredictorEvaluationResults: ").append(getPredictorEvaluationResults()).append(",");
        if (getIsAutoPredictor() != null)
            sb.append("IsAutoPredictor: ").append(getIsAutoPredictor()).append(",");
        if (getAutoMLOverrideStrategy() != null)
            sb.append("AutoMLOverrideStrategy: ").append(getAutoMLOverrideStrategy()).append(",");
        if (getOptimizationMetric() != null)
            sb.append("OptimizationMetric: ").append(getOptimizationMetric());
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
        if (other.getIsAutoPredictor() == null ^ this.getIsAutoPredictor() == null)
            return false;
        if (other.getIsAutoPredictor() != null && other.getIsAutoPredictor().equals(this.getIsAutoPredictor()) == false)
            return false;
        if (other.getAutoMLOverrideStrategy() == null ^ this.getAutoMLOverrideStrategy() == null)
            return false;
        if (other.getAutoMLOverrideStrategy() != null && other.getAutoMLOverrideStrategy().equals(this.getAutoMLOverrideStrategy()) == false)
            return false;
        if (other.getOptimizationMetric() == null ^ this.getOptimizationMetric() == null)
            return false;
        if (other.getOptimizationMetric() != null && other.getOptimizationMetric().equals(this.getOptimizationMetric()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPredictorEvaluationResults() == null) ? 0 : getPredictorEvaluationResults().hashCode());
        hashCode = prime * hashCode + ((getIsAutoPredictor() == null) ? 0 : getIsAutoPredictor().hashCode());
        hashCode = prime * hashCode + ((getAutoMLOverrideStrategy() == null) ? 0 : getAutoMLOverrideStrategy().hashCode());
        hashCode = prime * hashCode + ((getOptimizationMetric() == null) ? 0 : getOptimizationMetric().hashCode());
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
