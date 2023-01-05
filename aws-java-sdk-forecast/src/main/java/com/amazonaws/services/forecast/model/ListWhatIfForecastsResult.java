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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/forecast-2018-06-26/ListWhatIfForecasts" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListWhatIfForecastsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * An array of <code>WhatIfForecasts</code> objects that describe the matched forecasts.
     * </p>
     */
    private java.util.List<WhatIfForecastSummary> whatIfForecasts;
    /**
     * <p>
     * If the result of the previous request was truncated, the response includes a <code>NextToken</code>. To retrieve
     * the next set of results, use the token in the next&#x2028; request. Tokens expire after 24 hours.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * An array of <code>WhatIfForecasts</code> objects that describe the matched forecasts.
     * </p>
     * 
     * @return An array of <code>WhatIfForecasts</code> objects that describe the matched forecasts.
     */

    public java.util.List<WhatIfForecastSummary> getWhatIfForecasts() {
        return whatIfForecasts;
    }

    /**
     * <p>
     * An array of <code>WhatIfForecasts</code> objects that describe the matched forecasts.
     * </p>
     * 
     * @param whatIfForecasts
     *        An array of <code>WhatIfForecasts</code> objects that describe the matched forecasts.
     */

    public void setWhatIfForecasts(java.util.Collection<WhatIfForecastSummary> whatIfForecasts) {
        if (whatIfForecasts == null) {
            this.whatIfForecasts = null;
            return;
        }

        this.whatIfForecasts = new java.util.ArrayList<WhatIfForecastSummary>(whatIfForecasts);
    }

    /**
     * <p>
     * An array of <code>WhatIfForecasts</code> objects that describe the matched forecasts.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setWhatIfForecasts(java.util.Collection)} or {@link #withWhatIfForecasts(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param whatIfForecasts
     *        An array of <code>WhatIfForecasts</code> objects that describe the matched forecasts.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListWhatIfForecastsResult withWhatIfForecasts(WhatIfForecastSummary... whatIfForecasts) {
        if (this.whatIfForecasts == null) {
            setWhatIfForecasts(new java.util.ArrayList<WhatIfForecastSummary>(whatIfForecasts.length));
        }
        for (WhatIfForecastSummary ele : whatIfForecasts) {
            this.whatIfForecasts.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of <code>WhatIfForecasts</code> objects that describe the matched forecasts.
     * </p>
     * 
     * @param whatIfForecasts
     *        An array of <code>WhatIfForecasts</code> objects that describe the matched forecasts.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListWhatIfForecastsResult withWhatIfForecasts(java.util.Collection<WhatIfForecastSummary> whatIfForecasts) {
        setWhatIfForecasts(whatIfForecasts);
        return this;
    }

    /**
     * <p>
     * If the result of the previous request was truncated, the response includes a <code>NextToken</code>. To retrieve
     * the next set of results, use the token in the next&#x2028; request. Tokens expire after 24 hours.
     * </p>
     * 
     * @param nextToken
     *        If the result of the previous request was truncated, the response includes a <code>NextToken</code>. To
     *        retrieve the next set of results, use the token in the next&#x2028; request. Tokens expire after 24 hours.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If the result of the previous request was truncated, the response includes a <code>NextToken</code>. To retrieve
     * the next set of results, use the token in the next&#x2028; request. Tokens expire after 24 hours.
     * </p>
     * 
     * @return If the result of the previous request was truncated, the response includes a <code>NextToken</code>. To
     *         retrieve the next set of results, use the token in the next&#x2028; request. Tokens expire after 24
     *         hours.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If the result of the previous request was truncated, the response includes a <code>NextToken</code>. To retrieve
     * the next set of results, use the token in the next&#x2028; request. Tokens expire after 24 hours.
     * </p>
     * 
     * @param nextToken
     *        If the result of the previous request was truncated, the response includes a <code>NextToken</code>. To
     *        retrieve the next set of results, use the token in the next&#x2028; request. Tokens expire after 24 hours.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListWhatIfForecastsResult withNextToken(String nextToken) {
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
        if (getWhatIfForecasts() != null)
            sb.append("WhatIfForecasts: ").append(getWhatIfForecasts()).append(",");
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

        if (obj instanceof ListWhatIfForecastsResult == false)
            return false;
        ListWhatIfForecastsResult other = (ListWhatIfForecastsResult) obj;
        if (other.getWhatIfForecasts() == null ^ this.getWhatIfForecasts() == null)
            return false;
        if (other.getWhatIfForecasts() != null && other.getWhatIfForecasts().equals(this.getWhatIfForecasts()) == false)
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

        hashCode = prime * hashCode + ((getWhatIfForecasts() == null) ? 0 : getWhatIfForecasts().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListWhatIfForecastsResult clone() {
        try {
            return (ListWhatIfForecastsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
