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
package com.amazonaws.services.computeoptimizer.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/compute-optimizer-2019-11-01/GetLambdaFunctionRecommendations"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetLambdaFunctionRecommendationsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * The token to use to advance to the next page of function recommendations.
     * </p>
     * <p>
     * This value is null when there are no more pages of function recommendations to return.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * An array of objects that describe function recommendations.
     * </p>
     */
    private java.util.List<LambdaFunctionRecommendation> lambdaFunctionRecommendations;

    /**
     * <p>
     * The token to use to advance to the next page of function recommendations.
     * </p>
     * <p>
     * This value is null when there are no more pages of function recommendations to return.
     * </p>
     * 
     * @param nextToken
     *        The token to use to advance to the next page of function recommendations.</p>
     *        <p>
     *        This value is null when there are no more pages of function recommendations to return.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token to use to advance to the next page of function recommendations.
     * </p>
     * <p>
     * This value is null when there are no more pages of function recommendations to return.
     * </p>
     * 
     * @return The token to use to advance to the next page of function recommendations.</p>
     *         <p>
     *         This value is null when there are no more pages of function recommendations to return.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token to use to advance to the next page of function recommendations.
     * </p>
     * <p>
     * This value is null when there are no more pages of function recommendations to return.
     * </p>
     * 
     * @param nextToken
     *        The token to use to advance to the next page of function recommendations.</p>
     *        <p>
     *        This value is null when there are no more pages of function recommendations to return.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetLambdaFunctionRecommendationsResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * An array of objects that describe function recommendations.
     * </p>
     * 
     * @return An array of objects that describe function recommendations.
     */

    public java.util.List<LambdaFunctionRecommendation> getLambdaFunctionRecommendations() {
        return lambdaFunctionRecommendations;
    }

    /**
     * <p>
     * An array of objects that describe function recommendations.
     * </p>
     * 
     * @param lambdaFunctionRecommendations
     *        An array of objects that describe function recommendations.
     */

    public void setLambdaFunctionRecommendations(java.util.Collection<LambdaFunctionRecommendation> lambdaFunctionRecommendations) {
        if (lambdaFunctionRecommendations == null) {
            this.lambdaFunctionRecommendations = null;
            return;
        }

        this.lambdaFunctionRecommendations = new java.util.ArrayList<LambdaFunctionRecommendation>(lambdaFunctionRecommendations);
    }

    /**
     * <p>
     * An array of objects that describe function recommendations.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setLambdaFunctionRecommendations(java.util.Collection)} or
     * {@link #withLambdaFunctionRecommendations(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param lambdaFunctionRecommendations
     *        An array of objects that describe function recommendations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetLambdaFunctionRecommendationsResult withLambdaFunctionRecommendations(LambdaFunctionRecommendation... lambdaFunctionRecommendations) {
        if (this.lambdaFunctionRecommendations == null) {
            setLambdaFunctionRecommendations(new java.util.ArrayList<LambdaFunctionRecommendation>(lambdaFunctionRecommendations.length));
        }
        for (LambdaFunctionRecommendation ele : lambdaFunctionRecommendations) {
            this.lambdaFunctionRecommendations.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of objects that describe function recommendations.
     * </p>
     * 
     * @param lambdaFunctionRecommendations
     *        An array of objects that describe function recommendations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetLambdaFunctionRecommendationsResult withLambdaFunctionRecommendations(
            java.util.Collection<LambdaFunctionRecommendation> lambdaFunctionRecommendations) {
        setLambdaFunctionRecommendations(lambdaFunctionRecommendations);
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
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getLambdaFunctionRecommendations() != null)
            sb.append("LambdaFunctionRecommendations: ").append(getLambdaFunctionRecommendations());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetLambdaFunctionRecommendationsResult == false)
            return false;
        GetLambdaFunctionRecommendationsResult other = (GetLambdaFunctionRecommendationsResult) obj;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getLambdaFunctionRecommendations() == null ^ this.getLambdaFunctionRecommendations() == null)
            return false;
        if (other.getLambdaFunctionRecommendations() != null
                && other.getLambdaFunctionRecommendations().equals(this.getLambdaFunctionRecommendations()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getLambdaFunctionRecommendations() == null) ? 0 : getLambdaFunctionRecommendations().hashCode());
        return hashCode;
    }

    @Override
    public GetLambdaFunctionRecommendationsResult clone() {
        try {
            return (GetLambdaFunctionRecommendationsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
