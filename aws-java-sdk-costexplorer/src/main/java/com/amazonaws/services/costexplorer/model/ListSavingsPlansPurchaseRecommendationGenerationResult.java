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
package com.amazonaws.services.costexplorer.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ce-2017-10-25/ListSavingsPlansPurchaseRecommendationGeneration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListSavingsPlansPurchaseRecommendationGenerationResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements
        Serializable, Cloneable {

    /**
     * <p>
     * The list of historical recommendation generations.
     * </p>
     */
    private java.util.List<GenerationSummary> generationSummaryList;
    /**
     * <p>
     * The token to retrieve the next set of results.
     * </p>
     */
    private String nextPageToken;

    /**
     * <p>
     * The list of historical recommendation generations.
     * </p>
     * 
     * @return The list of historical recommendation generations.
     */

    public java.util.List<GenerationSummary> getGenerationSummaryList() {
        return generationSummaryList;
    }

    /**
     * <p>
     * The list of historical recommendation generations.
     * </p>
     * 
     * @param generationSummaryList
     *        The list of historical recommendation generations.
     */

    public void setGenerationSummaryList(java.util.Collection<GenerationSummary> generationSummaryList) {
        if (generationSummaryList == null) {
            this.generationSummaryList = null;
            return;
        }

        this.generationSummaryList = new java.util.ArrayList<GenerationSummary>(generationSummaryList);
    }

    /**
     * <p>
     * The list of historical recommendation generations.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setGenerationSummaryList(java.util.Collection)} or
     * {@link #withGenerationSummaryList(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param generationSummaryList
     *        The list of historical recommendation generations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListSavingsPlansPurchaseRecommendationGenerationResult withGenerationSummaryList(GenerationSummary... generationSummaryList) {
        if (this.generationSummaryList == null) {
            setGenerationSummaryList(new java.util.ArrayList<GenerationSummary>(generationSummaryList.length));
        }
        for (GenerationSummary ele : generationSummaryList) {
            this.generationSummaryList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of historical recommendation generations.
     * </p>
     * 
     * @param generationSummaryList
     *        The list of historical recommendation generations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListSavingsPlansPurchaseRecommendationGenerationResult withGenerationSummaryList(java.util.Collection<GenerationSummary> generationSummaryList) {
        setGenerationSummaryList(generationSummaryList);
        return this;
    }

    /**
     * <p>
     * The token to retrieve the next set of results.
     * </p>
     * 
     * @param nextPageToken
     *        The token to retrieve the next set of results.
     */

    public void setNextPageToken(String nextPageToken) {
        this.nextPageToken = nextPageToken;
    }

    /**
     * <p>
     * The token to retrieve the next set of results.
     * </p>
     * 
     * @return The token to retrieve the next set of results.
     */

    public String getNextPageToken() {
        return this.nextPageToken;
    }

    /**
     * <p>
     * The token to retrieve the next set of results.
     * </p>
     * 
     * @param nextPageToken
     *        The token to retrieve the next set of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListSavingsPlansPurchaseRecommendationGenerationResult withNextPageToken(String nextPageToken) {
        setNextPageToken(nextPageToken);
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
        if (getGenerationSummaryList() != null)
            sb.append("GenerationSummaryList: ").append(getGenerationSummaryList()).append(",");
        if (getNextPageToken() != null)
            sb.append("NextPageToken: ").append(getNextPageToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListSavingsPlansPurchaseRecommendationGenerationResult == false)
            return false;
        ListSavingsPlansPurchaseRecommendationGenerationResult other = (ListSavingsPlansPurchaseRecommendationGenerationResult) obj;
        if (other.getGenerationSummaryList() == null ^ this.getGenerationSummaryList() == null)
            return false;
        if (other.getGenerationSummaryList() != null && other.getGenerationSummaryList().equals(this.getGenerationSummaryList()) == false)
            return false;
        if (other.getNextPageToken() == null ^ this.getNextPageToken() == null)
            return false;
        if (other.getNextPageToken() != null && other.getNextPageToken().equals(this.getNextPageToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getGenerationSummaryList() == null) ? 0 : getGenerationSummaryList().hashCode());
        hashCode = prime * hashCode + ((getNextPageToken() == null) ? 0 : getNextPageToken().hashCode());
        return hashCode;
    }

    @Override
    public ListSavingsPlansPurchaseRecommendationGenerationResult clone() {
        try {
            return (ListSavingsPlansPurchaseRecommendationGenerationResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
