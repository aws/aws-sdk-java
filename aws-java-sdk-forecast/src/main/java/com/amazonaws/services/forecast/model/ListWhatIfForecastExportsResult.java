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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/forecast-2018-06-26/ListWhatIfForecastExports" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListWhatIfForecastExportsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * An array of <code>WhatIfForecastExports</code> objects that describe the matched forecast exports.
     * </p>
     */
    private java.util.List<WhatIfForecastExportSummary> whatIfForecastExports;
    /**
     * <p>
     * If the response is truncated, Forecast returns this token. To retrieve the next set of results, use the token in
     * the next request.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * An array of <code>WhatIfForecastExports</code> objects that describe the matched forecast exports.
     * </p>
     * 
     * @return An array of <code>WhatIfForecastExports</code> objects that describe the matched forecast exports.
     */

    public java.util.List<WhatIfForecastExportSummary> getWhatIfForecastExports() {
        return whatIfForecastExports;
    }

    /**
     * <p>
     * An array of <code>WhatIfForecastExports</code> objects that describe the matched forecast exports.
     * </p>
     * 
     * @param whatIfForecastExports
     *        An array of <code>WhatIfForecastExports</code> objects that describe the matched forecast exports.
     */

    public void setWhatIfForecastExports(java.util.Collection<WhatIfForecastExportSummary> whatIfForecastExports) {
        if (whatIfForecastExports == null) {
            this.whatIfForecastExports = null;
            return;
        }

        this.whatIfForecastExports = new java.util.ArrayList<WhatIfForecastExportSummary>(whatIfForecastExports);
    }

    /**
     * <p>
     * An array of <code>WhatIfForecastExports</code> objects that describe the matched forecast exports.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setWhatIfForecastExports(java.util.Collection)} or
     * {@link #withWhatIfForecastExports(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param whatIfForecastExports
     *        An array of <code>WhatIfForecastExports</code> objects that describe the matched forecast exports.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListWhatIfForecastExportsResult withWhatIfForecastExports(WhatIfForecastExportSummary... whatIfForecastExports) {
        if (this.whatIfForecastExports == null) {
            setWhatIfForecastExports(new java.util.ArrayList<WhatIfForecastExportSummary>(whatIfForecastExports.length));
        }
        for (WhatIfForecastExportSummary ele : whatIfForecastExports) {
            this.whatIfForecastExports.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of <code>WhatIfForecastExports</code> objects that describe the matched forecast exports.
     * </p>
     * 
     * @param whatIfForecastExports
     *        An array of <code>WhatIfForecastExports</code> objects that describe the matched forecast exports.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListWhatIfForecastExportsResult withWhatIfForecastExports(java.util.Collection<WhatIfForecastExportSummary> whatIfForecastExports) {
        setWhatIfForecastExports(whatIfForecastExports);
        return this;
    }

    /**
     * <p>
     * If the response is truncated, Forecast returns this token. To retrieve the next set of results, use the token in
     * the next request.
     * </p>
     * 
     * @param nextToken
     *        If the response is truncated, Forecast returns this token. To retrieve the next set of results, use the
     *        token in the next request.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If the response is truncated, Forecast returns this token. To retrieve the next set of results, use the token in
     * the next request.
     * </p>
     * 
     * @return If the response is truncated, Forecast returns this token. To retrieve the next set of results, use the
     *         token in the next request.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If the response is truncated, Forecast returns this token. To retrieve the next set of results, use the token in
     * the next request.
     * </p>
     * 
     * @param nextToken
     *        If the response is truncated, Forecast returns this token. To retrieve the next set of results, use the
     *        token in the next request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListWhatIfForecastExportsResult withNextToken(String nextToken) {
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
        if (getWhatIfForecastExports() != null)
            sb.append("WhatIfForecastExports: ").append(getWhatIfForecastExports()).append(",");
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

        if (obj instanceof ListWhatIfForecastExportsResult == false)
            return false;
        ListWhatIfForecastExportsResult other = (ListWhatIfForecastExportsResult) obj;
        if (other.getWhatIfForecastExports() == null ^ this.getWhatIfForecastExports() == null)
            return false;
        if (other.getWhatIfForecastExports() != null && other.getWhatIfForecastExports().equals(this.getWhatIfForecastExports()) == false)
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

        hashCode = prime * hashCode + ((getWhatIfForecastExports() == null) ? 0 : getWhatIfForecastExports().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListWhatIfForecastExportsResult clone() {
        try {
            return (ListWhatIfForecastExportsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
