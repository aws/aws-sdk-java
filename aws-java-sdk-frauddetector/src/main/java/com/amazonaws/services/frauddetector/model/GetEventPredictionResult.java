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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/frauddetector-2019-11-15/GetEventPrediction" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetEventPredictionResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The model scores. Amazon Fraud Detector generates model scores between 0 and 1000, where 0 is low fraud risk and
     * 1000 is high fraud risk. Model scores are directly related to the false positive rate (FPR). For example, a score
     * of 600 corresponds to an estimated 10% false positive rate whereas a score of 900 corresponds to an estimated 2%
     * false positive rate.
     * </p>
     */
    private java.util.List<ModelScores> modelScores;
    /**
     * <p>
     * The results.
     * </p>
     */
    private java.util.List<RuleResult> ruleResults;

    /**
     * <p>
     * The model scores. Amazon Fraud Detector generates model scores between 0 and 1000, where 0 is low fraud risk and
     * 1000 is high fraud risk. Model scores are directly related to the false positive rate (FPR). For example, a score
     * of 600 corresponds to an estimated 10% false positive rate whereas a score of 900 corresponds to an estimated 2%
     * false positive rate.
     * </p>
     * 
     * @return The model scores. Amazon Fraud Detector generates model scores between 0 and 1000, where 0 is low fraud
     *         risk and 1000 is high fraud risk. Model scores are directly related to the false positive rate (FPR). For
     *         example, a score of 600 corresponds to an estimated 10% false positive rate whereas a score of 900
     *         corresponds to an estimated 2% false positive rate.
     */

    public java.util.List<ModelScores> getModelScores() {
        return modelScores;
    }

    /**
     * <p>
     * The model scores. Amazon Fraud Detector generates model scores between 0 and 1000, where 0 is low fraud risk and
     * 1000 is high fraud risk. Model scores are directly related to the false positive rate (FPR). For example, a score
     * of 600 corresponds to an estimated 10% false positive rate whereas a score of 900 corresponds to an estimated 2%
     * false positive rate.
     * </p>
     * 
     * @param modelScores
     *        The model scores. Amazon Fraud Detector generates model scores between 0 and 1000, where 0 is low fraud
     *        risk and 1000 is high fraud risk. Model scores are directly related to the false positive rate (FPR). For
     *        example, a score of 600 corresponds to an estimated 10% false positive rate whereas a score of 900
     *        corresponds to an estimated 2% false positive rate.
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
     * The model scores. Amazon Fraud Detector generates model scores between 0 and 1000, where 0 is low fraud risk and
     * 1000 is high fraud risk. Model scores are directly related to the false positive rate (FPR). For example, a score
     * of 600 corresponds to an estimated 10% false positive rate whereas a score of 900 corresponds to an estimated 2%
     * false positive rate.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setModelScores(java.util.Collection)} or {@link #withModelScores(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param modelScores
     *        The model scores. Amazon Fraud Detector generates model scores between 0 and 1000, where 0 is low fraud
     *        risk and 1000 is high fraud risk. Model scores are directly related to the false positive rate (FPR). For
     *        example, a score of 600 corresponds to an estimated 10% false positive rate whereas a score of 900
     *        corresponds to an estimated 2% false positive rate.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetEventPredictionResult withModelScores(ModelScores... modelScores) {
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
     * The model scores. Amazon Fraud Detector generates model scores between 0 and 1000, where 0 is low fraud risk and
     * 1000 is high fraud risk. Model scores are directly related to the false positive rate (FPR). For example, a score
     * of 600 corresponds to an estimated 10% false positive rate whereas a score of 900 corresponds to an estimated 2%
     * false positive rate.
     * </p>
     * 
     * @param modelScores
     *        The model scores. Amazon Fraud Detector generates model scores between 0 and 1000, where 0 is low fraud
     *        risk and 1000 is high fraud risk. Model scores are directly related to the false positive rate (FPR). For
     *        example, a score of 600 corresponds to an estimated 10% false positive rate whereas a score of 900
     *        corresponds to an estimated 2% false positive rate.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetEventPredictionResult withModelScores(java.util.Collection<ModelScores> modelScores) {
        setModelScores(modelScores);
        return this;
    }

    /**
     * <p>
     * The results.
     * </p>
     * 
     * @return The results.
     */

    public java.util.List<RuleResult> getRuleResults() {
        return ruleResults;
    }

    /**
     * <p>
     * The results.
     * </p>
     * 
     * @param ruleResults
     *        The results.
     */

    public void setRuleResults(java.util.Collection<RuleResult> ruleResults) {
        if (ruleResults == null) {
            this.ruleResults = null;
            return;
        }

        this.ruleResults = new java.util.ArrayList<RuleResult>(ruleResults);
    }

    /**
     * <p>
     * The results.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRuleResults(java.util.Collection)} or {@link #withRuleResults(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param ruleResults
     *        The results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetEventPredictionResult withRuleResults(RuleResult... ruleResults) {
        if (this.ruleResults == null) {
            setRuleResults(new java.util.ArrayList<RuleResult>(ruleResults.length));
        }
        for (RuleResult ele : ruleResults) {
            this.ruleResults.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The results.
     * </p>
     * 
     * @param ruleResults
     *        The results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetEventPredictionResult withRuleResults(java.util.Collection<RuleResult> ruleResults) {
        setRuleResults(ruleResults);
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
        if (getModelScores() != null)
            sb.append("ModelScores: ").append(getModelScores()).append(",");
        if (getRuleResults() != null)
            sb.append("RuleResults: ").append(getRuleResults());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetEventPredictionResult == false)
            return false;
        GetEventPredictionResult other = (GetEventPredictionResult) obj;
        if (other.getModelScores() == null ^ this.getModelScores() == null)
            return false;
        if (other.getModelScores() != null && other.getModelScores().equals(this.getModelScores()) == false)
            return false;
        if (other.getRuleResults() == null ^ this.getRuleResults() == null)
            return false;
        if (other.getRuleResults() != null && other.getRuleResults().equals(this.getRuleResults()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getModelScores() == null) ? 0 : getModelScores().hashCode());
        hashCode = prime * hashCode + ((getRuleResults() == null) ? 0 : getRuleResults().hashCode());
        return hashCode;
    }

    @Override
    public GetEventPredictionResult clone() {
        try {
            return (GetEventPredictionResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
