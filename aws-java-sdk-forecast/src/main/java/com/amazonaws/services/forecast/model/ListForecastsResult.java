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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/forecast-2018-06-26/ListForecasts" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListForecastsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * An array of objects that summarize each forecast's properties.
     * </p>
     */
    private java.util.List<ForecastSummary> forecasts;
    /**
     * <p>
     * If the response is truncated, Amazon Forecast returns this token. To retrieve the next set of results, use the
     * token in the next request.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * An array of objects that summarize each forecast's properties.
     * </p>
     * 
     * @return An array of objects that summarize each forecast's properties.
     */

    public java.util.List<ForecastSummary> getForecasts() {
        return forecasts;
    }

    /**
     * <p>
     * An array of objects that summarize each forecast's properties.
     * </p>
     * 
     * @param forecasts
     *        An array of objects that summarize each forecast's properties.
     */

    public void setForecasts(java.util.Collection<ForecastSummary> forecasts) {
        if (forecasts == null) {
            this.forecasts = null;
            return;
        }

        this.forecasts = new java.util.ArrayList<ForecastSummary>(forecasts);
    }

    /**
     * <p>
     * An array of objects that summarize each forecast's properties.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setForecasts(java.util.Collection)} or {@link #withForecasts(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param forecasts
     *        An array of objects that summarize each forecast's properties.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListForecastsResult withForecasts(ForecastSummary... forecasts) {
        if (this.forecasts == null) {
            setForecasts(new java.util.ArrayList<ForecastSummary>(forecasts.length));
        }
        for (ForecastSummary ele : forecasts) {
            this.forecasts.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of objects that summarize each forecast's properties.
     * </p>
     * 
     * @param forecasts
     *        An array of objects that summarize each forecast's properties.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListForecastsResult withForecasts(java.util.Collection<ForecastSummary> forecasts) {
        setForecasts(forecasts);
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

    public ListForecastsResult withNextToken(String nextToken) {
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
        if (getForecasts() != null)
            sb.append("Forecasts: ").append(getForecasts()).append(",");
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

        if (obj instanceof ListForecastsResult == false)
            return false;
        ListForecastsResult other = (ListForecastsResult) obj;
        if (other.getForecasts() == null ^ this.getForecasts() == null)
            return false;
        if (other.getForecasts() != null && other.getForecasts().equals(this.getForecasts()) == false)
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

        hashCode = prime * hashCode + ((getForecasts() == null) ? 0 : getForecasts().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListForecastsResult clone() {
        try {
            return (ListForecastsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
