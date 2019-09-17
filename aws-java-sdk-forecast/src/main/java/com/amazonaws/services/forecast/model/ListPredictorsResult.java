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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/forecast-2018-06-26/ListPredictors" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListPredictorsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * An array of objects that summarize each predictor's properties.
     * </p>
     */
    private java.util.List<PredictorSummary> predictors;
    /**
     * <p>
     * If the response is truncated, Amazon Forecast returns this token. To retrieve the next set of results, use the
     * token in the next request.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * An array of objects that summarize each predictor's properties.
     * </p>
     * 
     * @return An array of objects that summarize each predictor's properties.
     */

    public java.util.List<PredictorSummary> getPredictors() {
        return predictors;
    }

    /**
     * <p>
     * An array of objects that summarize each predictor's properties.
     * </p>
     * 
     * @param predictors
     *        An array of objects that summarize each predictor's properties.
     */

    public void setPredictors(java.util.Collection<PredictorSummary> predictors) {
        if (predictors == null) {
            this.predictors = null;
            return;
        }

        this.predictors = new java.util.ArrayList<PredictorSummary>(predictors);
    }

    /**
     * <p>
     * An array of objects that summarize each predictor's properties.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPredictors(java.util.Collection)} or {@link #withPredictors(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param predictors
     *        An array of objects that summarize each predictor's properties.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListPredictorsResult withPredictors(PredictorSummary... predictors) {
        if (this.predictors == null) {
            setPredictors(new java.util.ArrayList<PredictorSummary>(predictors.length));
        }
        for (PredictorSummary ele : predictors) {
            this.predictors.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of objects that summarize each predictor's properties.
     * </p>
     * 
     * @param predictors
     *        An array of objects that summarize each predictor's properties.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListPredictorsResult withPredictors(java.util.Collection<PredictorSummary> predictors) {
        setPredictors(predictors);
        return this;
    }

    /**
     * <p>
     * If the response is truncated, Amazon Forecast returns this token. To retrieve the next set of results, use the
     * token in the next request.
     * </p>
     * 
     * @param nextToken
     *        If the response is truncated, Amazon Forecast returns this token. To retrieve the next set of results, use
     *        the token in the next request.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If the response is truncated, Amazon Forecast returns this token. To retrieve the next set of results, use the
     * token in the next request.
     * </p>
     * 
     * @return If the response is truncated, Amazon Forecast returns this token. To retrieve the next set of results,
     *         use the token in the next request.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If the response is truncated, Amazon Forecast returns this token. To retrieve the next set of results, use the
     * token in the next request.
     * </p>
     * 
     * @param nextToken
     *        If the response is truncated, Amazon Forecast returns this token. To retrieve the next set of results, use
     *        the token in the next request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListPredictorsResult withNextToken(String nextToken) {
        setNextToken(nextToken);
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
        if (getPredictors() != null)
            sb.append("Predictors: ").append(getPredictors()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListPredictorsResult == false)
            return false;
        ListPredictorsResult other = (ListPredictorsResult) obj;
        if (other.getPredictors() == null ^ this.getPredictors() == null)
            return false;
        if (other.getPredictors() != null && other.getPredictors().equals(this.getPredictors()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPredictors() == null) ? 0 : getPredictors().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListPredictorsResult clone() {
        try {
            return (ListPredictorsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
