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
package com.amazonaws.services.devopsguru.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devops-guru-2020-12-01/ListRecommendations" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListRecommendationsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * An array of the requested recommendations.
     * </p>
     */
    private java.util.List<Recommendation> recommendations;
    /**
     * <p>
     * The pagination token to use to retrieve the next page of results for this operation. If there are no more pages,
     * this value is null.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * An array of the requested recommendations.
     * </p>
     * 
     * @return An array of the requested recommendations.
     */

    public java.util.List<Recommendation> getRecommendations() {
        return recommendations;
    }

    /**
     * <p>
     * An array of the requested recommendations.
     * </p>
     * 
     * @param recommendations
     *        An array of the requested recommendations.
     */

    public void setRecommendations(java.util.Collection<Recommendation> recommendations) {
        if (recommendations == null) {
            this.recommendations = null;
            return;
        }

        this.recommendations = new java.util.ArrayList<Recommendation>(recommendations);
    }

    /**
     * <p>
     * An array of the requested recommendations.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRecommendations(java.util.Collection)} or {@link #withRecommendations(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param recommendations
     *        An array of the requested recommendations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListRecommendationsResult withRecommendations(Recommendation... recommendations) {
        if (this.recommendations == null) {
            setRecommendations(new java.util.ArrayList<Recommendation>(recommendations.length));
        }
        for (Recommendation ele : recommendations) {
            this.recommendations.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of the requested recommendations.
     * </p>
     * 
     * @param recommendations
     *        An array of the requested recommendations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListRecommendationsResult withRecommendations(java.util.Collection<Recommendation> recommendations) {
        setRecommendations(recommendations);
        return this;
    }

    /**
     * <p>
     * The pagination token to use to retrieve the next page of results for this operation. If there are no more pages,
     * this value is null.
     * </p>
     * 
     * @param nextToken
     *        The pagination token to use to retrieve the next page of results for this operation. If there are no more
     *        pages, this value is null.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The pagination token to use to retrieve the next page of results for this operation. If there are no more pages,
     * this value is null.
     * </p>
     * 
     * @return The pagination token to use to retrieve the next page of results for this operation. If there are no more
     *         pages, this value is null.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The pagination token to use to retrieve the next page of results for this operation. If there are no more pages,
     * this value is null.
     * </p>
     * 
     * @param nextToken
     *        The pagination token to use to retrieve the next page of results for this operation. If there are no more
     *        pages, this value is null.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListRecommendationsResult withNextToken(String nextToken) {
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
        if (getRecommendations() != null)
            sb.append("Recommendations: ").append(getRecommendations()).append(",");
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

        if (obj instanceof ListRecommendationsResult == false)
            return false;
        ListRecommendationsResult other = (ListRecommendationsResult) obj;
        if (other.getRecommendations() == null ^ this.getRecommendations() == null)
            return false;
        if (other.getRecommendations() != null && other.getRecommendations().equals(this.getRecommendations()) == false)
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

        hashCode = prime * hashCode + ((getRecommendations() == null) ? 0 : getRecommendations().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListRecommendationsResult clone() {
        try {
            return (ListRecommendationsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
