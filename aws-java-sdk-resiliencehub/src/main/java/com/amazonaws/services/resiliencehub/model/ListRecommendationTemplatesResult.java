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
package com.amazonaws.services.resiliencehub.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resiliencehub-2020-04-30/ListRecommendationTemplates"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListRecommendationTemplatesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The token for the next set of results, or null if there are no more results.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The recommendation templates for the Resilience Hub applications.
     * </p>
     */
    private java.util.List<RecommendationTemplate> recommendationTemplates;

    /**
     * <p>
     * The token for the next set of results, or null if there are no more results.
     * </p>
     * 
     * @param nextToken
     *        The token for the next set of results, or null if there are no more results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token for the next set of results, or null if there are no more results.
     * </p>
     * 
     * @return The token for the next set of results, or null if there are no more results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token for the next set of results, or null if there are no more results.
     * </p>
     * 
     * @param nextToken
     *        The token for the next set of results, or null if there are no more results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListRecommendationTemplatesResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The recommendation templates for the Resilience Hub applications.
     * </p>
     * 
     * @return The recommendation templates for the Resilience Hub applications.
     */

    public java.util.List<RecommendationTemplate> getRecommendationTemplates() {
        return recommendationTemplates;
    }

    /**
     * <p>
     * The recommendation templates for the Resilience Hub applications.
     * </p>
     * 
     * @param recommendationTemplates
     *        The recommendation templates for the Resilience Hub applications.
     */

    public void setRecommendationTemplates(java.util.Collection<RecommendationTemplate> recommendationTemplates) {
        if (recommendationTemplates == null) {
            this.recommendationTemplates = null;
            return;
        }

        this.recommendationTemplates = new java.util.ArrayList<RecommendationTemplate>(recommendationTemplates);
    }

    /**
     * <p>
     * The recommendation templates for the Resilience Hub applications.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRecommendationTemplates(java.util.Collection)} or
     * {@link #withRecommendationTemplates(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param recommendationTemplates
     *        The recommendation templates for the Resilience Hub applications.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListRecommendationTemplatesResult withRecommendationTemplates(RecommendationTemplate... recommendationTemplates) {
        if (this.recommendationTemplates == null) {
            setRecommendationTemplates(new java.util.ArrayList<RecommendationTemplate>(recommendationTemplates.length));
        }
        for (RecommendationTemplate ele : recommendationTemplates) {
            this.recommendationTemplates.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The recommendation templates for the Resilience Hub applications.
     * </p>
     * 
     * @param recommendationTemplates
     *        The recommendation templates for the Resilience Hub applications.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListRecommendationTemplatesResult withRecommendationTemplates(java.util.Collection<RecommendationTemplate> recommendationTemplates) {
        setRecommendationTemplates(recommendationTemplates);
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
        if (getRecommendationTemplates() != null)
            sb.append("RecommendationTemplates: ").append(getRecommendationTemplates());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListRecommendationTemplatesResult == false)
            return false;
        ListRecommendationTemplatesResult other = (ListRecommendationTemplatesResult) obj;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getRecommendationTemplates() == null ^ this.getRecommendationTemplates() == null)
            return false;
        if (other.getRecommendationTemplates() != null && other.getRecommendationTemplates().equals(this.getRecommendationTemplates()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getRecommendationTemplates() == null) ? 0 : getRecommendationTemplates().hashCode());
        return hashCode;
    }

    @Override
    public ListRecommendationTemplatesResult clone() {
        try {
            return (ListRecommendationTemplatesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
