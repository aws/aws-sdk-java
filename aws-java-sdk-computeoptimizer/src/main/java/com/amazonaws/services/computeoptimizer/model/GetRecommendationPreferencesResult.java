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
package com.amazonaws.services.computeoptimizer.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/compute-optimizer-2019-11-01/GetRecommendationPreferences"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetRecommendationPreferencesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The token to use to advance to the next page of recommendation preferences.
     * </p>
     * <p>
     * This value is null when there are no more pages of recommendation preferences to return.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * An array of objects that describe recommendation preferences.
     * </p>
     */
    private java.util.List<RecommendationPreferencesDetail> recommendationPreferencesDetails;

    /**
     * <p>
     * The token to use to advance to the next page of recommendation preferences.
     * </p>
     * <p>
     * This value is null when there are no more pages of recommendation preferences to return.
     * </p>
     * 
     * @param nextToken
     *        The token to use to advance to the next page of recommendation preferences.</p>
     *        <p>
     *        This value is null when there are no more pages of recommendation preferences to return.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token to use to advance to the next page of recommendation preferences.
     * </p>
     * <p>
     * This value is null when there are no more pages of recommendation preferences to return.
     * </p>
     * 
     * @return The token to use to advance to the next page of recommendation preferences.</p>
     *         <p>
     *         This value is null when there are no more pages of recommendation preferences to return.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token to use to advance to the next page of recommendation preferences.
     * </p>
     * <p>
     * This value is null when there are no more pages of recommendation preferences to return.
     * </p>
     * 
     * @param nextToken
     *        The token to use to advance to the next page of recommendation preferences.</p>
     *        <p>
     *        This value is null when there are no more pages of recommendation preferences to return.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetRecommendationPreferencesResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * An array of objects that describe recommendation preferences.
     * </p>
     * 
     * @return An array of objects that describe recommendation preferences.
     */

    public java.util.List<RecommendationPreferencesDetail> getRecommendationPreferencesDetails() {
        return recommendationPreferencesDetails;
    }

    /**
     * <p>
     * An array of objects that describe recommendation preferences.
     * </p>
     * 
     * @param recommendationPreferencesDetails
     *        An array of objects that describe recommendation preferences.
     */

    public void setRecommendationPreferencesDetails(java.util.Collection<RecommendationPreferencesDetail> recommendationPreferencesDetails) {
        if (recommendationPreferencesDetails == null) {
            this.recommendationPreferencesDetails = null;
            return;
        }

        this.recommendationPreferencesDetails = new java.util.ArrayList<RecommendationPreferencesDetail>(recommendationPreferencesDetails);
    }

    /**
     * <p>
     * An array of objects that describe recommendation preferences.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRecommendationPreferencesDetails(java.util.Collection)} or
     * {@link #withRecommendationPreferencesDetails(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param recommendationPreferencesDetails
     *        An array of objects that describe recommendation preferences.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetRecommendationPreferencesResult withRecommendationPreferencesDetails(RecommendationPreferencesDetail... recommendationPreferencesDetails) {
        if (this.recommendationPreferencesDetails == null) {
            setRecommendationPreferencesDetails(new java.util.ArrayList<RecommendationPreferencesDetail>(recommendationPreferencesDetails.length));
        }
        for (RecommendationPreferencesDetail ele : recommendationPreferencesDetails) {
            this.recommendationPreferencesDetails.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of objects that describe recommendation preferences.
     * </p>
     * 
     * @param recommendationPreferencesDetails
     *        An array of objects that describe recommendation preferences.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetRecommendationPreferencesResult withRecommendationPreferencesDetails(
            java.util.Collection<RecommendationPreferencesDetail> recommendationPreferencesDetails) {
        setRecommendationPreferencesDetails(recommendationPreferencesDetails);
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
        if (getRecommendationPreferencesDetails() != null)
            sb.append("RecommendationPreferencesDetails: ").append(getRecommendationPreferencesDetails());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetRecommendationPreferencesResult == false)
            return false;
        GetRecommendationPreferencesResult other = (GetRecommendationPreferencesResult) obj;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getRecommendationPreferencesDetails() == null ^ this.getRecommendationPreferencesDetails() == null)
            return false;
        if (other.getRecommendationPreferencesDetails() != null
                && other.getRecommendationPreferencesDetails().equals(this.getRecommendationPreferencesDetails()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getRecommendationPreferencesDetails() == null) ? 0 : getRecommendationPreferencesDetails().hashCode());
        return hashCode;
    }

    @Override
    public GetRecommendationPreferencesResult clone() {
        try {
            return (GetRecommendationPreferencesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
