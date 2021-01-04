/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.iotsitewise.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotsitewise-2019-12-02/GetAssetPropertyAggregates"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetAssetPropertyAggregatesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The requested aggregated values.
     * </p>
     */
    private java.util.List<AggregatedValue> aggregatedValues;
    /**
     * <p>
     * The token for the next set of results, or null if there are no additional results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The requested aggregated values.
     * </p>
     * 
     * @return The requested aggregated values.
     */

    public java.util.List<AggregatedValue> getAggregatedValues() {
        return aggregatedValues;
    }

    /**
     * <p>
     * The requested aggregated values.
     * </p>
     * 
     * @param aggregatedValues
     *        The requested aggregated values.
     */

    public void setAggregatedValues(java.util.Collection<AggregatedValue> aggregatedValues) {
        if (aggregatedValues == null) {
            this.aggregatedValues = null;
            return;
        }

        this.aggregatedValues = new java.util.ArrayList<AggregatedValue>(aggregatedValues);
    }

    /**
     * <p>
     * The requested aggregated values.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAggregatedValues(java.util.Collection)} or {@link #withAggregatedValues(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param aggregatedValues
     *        The requested aggregated values.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAssetPropertyAggregatesResult withAggregatedValues(AggregatedValue... aggregatedValues) {
        if (this.aggregatedValues == null) {
            setAggregatedValues(new java.util.ArrayList<AggregatedValue>(aggregatedValues.length));
        }
        for (AggregatedValue ele : aggregatedValues) {
            this.aggregatedValues.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The requested aggregated values.
     * </p>
     * 
     * @param aggregatedValues
     *        The requested aggregated values.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAssetPropertyAggregatesResult withAggregatedValues(java.util.Collection<AggregatedValue> aggregatedValues) {
        setAggregatedValues(aggregatedValues);
        return this;
    }

    /**
     * <p>
     * The token for the next set of results, or null if there are no additional results.
     * </p>
     * 
     * @param nextToken
     *        The token for the next set of results, or null if there are no additional results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token for the next set of results, or null if there are no additional results.
     * </p>
     * 
     * @return The token for the next set of results, or null if there are no additional results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token for the next set of results, or null if there are no additional results.
     * </p>
     * 
     * @param nextToken
     *        The token for the next set of results, or null if there are no additional results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAssetPropertyAggregatesResult withNextToken(String nextToken) {
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
        if (getAggregatedValues() != null)
            sb.append("AggregatedValues: ").append(getAggregatedValues()).append(",");
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

        if (obj instanceof GetAssetPropertyAggregatesResult == false)
            return false;
        GetAssetPropertyAggregatesResult other = (GetAssetPropertyAggregatesResult) obj;
        if (other.getAggregatedValues() == null ^ this.getAggregatedValues() == null)
            return false;
        if (other.getAggregatedValues() != null && other.getAggregatedValues().equals(this.getAggregatedValues()) == false)
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

        hashCode = prime * hashCode + ((getAggregatedValues() == null) ? 0 : getAggregatedValues().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public GetAssetPropertyAggregatesResult clone() {
        try {
            return (GetAssetPropertyAggregatesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
