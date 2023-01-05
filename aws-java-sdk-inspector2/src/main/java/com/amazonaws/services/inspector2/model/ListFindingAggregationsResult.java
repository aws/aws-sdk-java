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
package com.amazonaws.services.inspector2.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/inspector2-2020-06-08/ListFindingAggregations" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListFindingAggregationsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The type of aggregation to perform.
     * </p>
     */
    private String aggregationType;
    /**
     * <p>
     * A token to use for paginating results that are returned in the response. Set the value of this parameter to null
     * for the first request to a list action. For subsequent calls, use the <code>NextToken</code> value returned from
     * the previous request to continue listing results after the first page.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * Objects that contain the results of an aggregation operation.
     * </p>
     */
    private java.util.List<AggregationResponse> responses;

    /**
     * <p>
     * The type of aggregation to perform.
     * </p>
     * 
     * @param aggregationType
     *        The type of aggregation to perform.
     * @see AggregationType
     */

    public void setAggregationType(String aggregationType) {
        this.aggregationType = aggregationType;
    }

    /**
     * <p>
     * The type of aggregation to perform.
     * </p>
     * 
     * @return The type of aggregation to perform.
     * @see AggregationType
     */

    public String getAggregationType() {
        return this.aggregationType;
    }

    /**
     * <p>
     * The type of aggregation to perform.
     * </p>
     * 
     * @param aggregationType
     *        The type of aggregation to perform.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AggregationType
     */

    public ListFindingAggregationsResult withAggregationType(String aggregationType) {
        setAggregationType(aggregationType);
        return this;
    }

    /**
     * <p>
     * The type of aggregation to perform.
     * </p>
     * 
     * @param aggregationType
     *        The type of aggregation to perform.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AggregationType
     */

    public ListFindingAggregationsResult withAggregationType(AggregationType aggregationType) {
        this.aggregationType = aggregationType.toString();
        return this;
    }

    /**
     * <p>
     * A token to use for paginating results that are returned in the response. Set the value of this parameter to null
     * for the first request to a list action. For subsequent calls, use the <code>NextToken</code> value returned from
     * the previous request to continue listing results after the first page.
     * </p>
     * 
     * @param nextToken
     *        A token to use for paginating results that are returned in the response. Set the value of this parameter
     *        to null for the first request to a list action. For subsequent calls, use the <code>NextToken</code> value
     *        returned from the previous request to continue listing results after the first page.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A token to use for paginating results that are returned in the response. Set the value of this parameter to null
     * for the first request to a list action. For subsequent calls, use the <code>NextToken</code> value returned from
     * the previous request to continue listing results after the first page.
     * </p>
     * 
     * @return A token to use for paginating results that are returned in the response. Set the value of this parameter
     *         to null for the first request to a list action. For subsequent calls, use the <code>NextToken</code>
     *         value returned from the previous request to continue listing results after the first page.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * A token to use for paginating results that are returned in the response. Set the value of this parameter to null
     * for the first request to a list action. For subsequent calls, use the <code>NextToken</code> value returned from
     * the previous request to continue listing results after the first page.
     * </p>
     * 
     * @param nextToken
     *        A token to use for paginating results that are returned in the response. Set the value of this parameter
     *        to null for the first request to a list action. For subsequent calls, use the <code>NextToken</code> value
     *        returned from the previous request to continue listing results after the first page.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListFindingAggregationsResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * Objects that contain the results of an aggregation operation.
     * </p>
     * 
     * @return Objects that contain the results of an aggregation operation.
     */

    public java.util.List<AggregationResponse> getResponses() {
        return responses;
    }

    /**
     * <p>
     * Objects that contain the results of an aggregation operation.
     * </p>
     * 
     * @param responses
     *        Objects that contain the results of an aggregation operation.
     */

    public void setResponses(java.util.Collection<AggregationResponse> responses) {
        if (responses == null) {
            this.responses = null;
            return;
        }

        this.responses = new java.util.ArrayList<AggregationResponse>(responses);
    }

    /**
     * <p>
     * Objects that contain the results of an aggregation operation.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setResponses(java.util.Collection)} or {@link #withResponses(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param responses
     *        Objects that contain the results of an aggregation operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListFindingAggregationsResult withResponses(AggregationResponse... responses) {
        if (this.responses == null) {
            setResponses(new java.util.ArrayList<AggregationResponse>(responses.length));
        }
        for (AggregationResponse ele : responses) {
            this.responses.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Objects that contain the results of an aggregation operation.
     * </p>
     * 
     * @param responses
     *        Objects that contain the results of an aggregation operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListFindingAggregationsResult withResponses(java.util.Collection<AggregationResponse> responses) {
        setResponses(responses);
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
        if (getAggregationType() != null)
            sb.append("AggregationType: ").append(getAggregationType()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getResponses() != null)
            sb.append("Responses: ").append(getResponses());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListFindingAggregationsResult == false)
            return false;
        ListFindingAggregationsResult other = (ListFindingAggregationsResult) obj;
        if (other.getAggregationType() == null ^ this.getAggregationType() == null)
            return false;
        if (other.getAggregationType() != null && other.getAggregationType().equals(this.getAggregationType()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getResponses() == null ^ this.getResponses() == null)
            return false;
        if (other.getResponses() != null && other.getResponses().equals(this.getResponses()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAggregationType() == null) ? 0 : getAggregationType().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getResponses() == null) ? 0 : getResponses().hashCode());
        return hashCode;
    }

    @Override
    public ListFindingAggregationsResult clone() {
        try {
            return (ListFindingAggregationsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
