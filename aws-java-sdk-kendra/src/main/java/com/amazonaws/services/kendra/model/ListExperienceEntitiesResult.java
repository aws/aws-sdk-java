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
package com.amazonaws.services.kendra.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/ListExperienceEntities" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListExperienceEntitiesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * An array of summary information for one or more users or groups.
     * </p>
     */
    private java.util.List<ExperienceEntitiesSummary> summaryItems;
    /**
     * <p>
     * If the response is truncated, Amazon Kendra returns this token, which you can use in a later request to retrieve
     * the next set of users or groups.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * An array of summary information for one or more users or groups.
     * </p>
     * 
     * @return An array of summary information for one or more users or groups.
     */

    public java.util.List<ExperienceEntitiesSummary> getSummaryItems() {
        return summaryItems;
    }

    /**
     * <p>
     * An array of summary information for one or more users or groups.
     * </p>
     * 
     * @param summaryItems
     *        An array of summary information for one or more users or groups.
     */

    public void setSummaryItems(java.util.Collection<ExperienceEntitiesSummary> summaryItems) {
        if (summaryItems == null) {
            this.summaryItems = null;
            return;
        }

        this.summaryItems = new java.util.ArrayList<ExperienceEntitiesSummary>(summaryItems);
    }

    /**
     * <p>
     * An array of summary information for one or more users or groups.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSummaryItems(java.util.Collection)} or {@link #withSummaryItems(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param summaryItems
     *        An array of summary information for one or more users or groups.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListExperienceEntitiesResult withSummaryItems(ExperienceEntitiesSummary... summaryItems) {
        if (this.summaryItems == null) {
            setSummaryItems(new java.util.ArrayList<ExperienceEntitiesSummary>(summaryItems.length));
        }
        for (ExperienceEntitiesSummary ele : summaryItems) {
            this.summaryItems.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of summary information for one or more users or groups.
     * </p>
     * 
     * @param summaryItems
     *        An array of summary information for one or more users or groups.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListExperienceEntitiesResult withSummaryItems(java.util.Collection<ExperienceEntitiesSummary> summaryItems) {
        setSummaryItems(summaryItems);
        return this;
    }

    /**
     * <p>
     * If the response is truncated, Amazon Kendra returns this token, which you can use in a later request to retrieve
     * the next set of users or groups.
     * </p>
     * 
     * @param nextToken
     *        If the response is truncated, Amazon Kendra returns this token, which you can use in a later request to
     *        retrieve the next set of users or groups.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If the response is truncated, Amazon Kendra returns this token, which you can use in a later request to retrieve
     * the next set of users or groups.
     * </p>
     * 
     * @return If the response is truncated, Amazon Kendra returns this token, which you can use in a later request to
     *         retrieve the next set of users or groups.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If the response is truncated, Amazon Kendra returns this token, which you can use in a later request to retrieve
     * the next set of users or groups.
     * </p>
     * 
     * @param nextToken
     *        If the response is truncated, Amazon Kendra returns this token, which you can use in a later request to
     *        retrieve the next set of users or groups.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListExperienceEntitiesResult withNextToken(String nextToken) {
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
        if (getSummaryItems() != null)
            sb.append("SummaryItems: ").append(getSummaryItems()).append(",");
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

        if (obj instanceof ListExperienceEntitiesResult == false)
            return false;
        ListExperienceEntitiesResult other = (ListExperienceEntitiesResult) obj;
        if (other.getSummaryItems() == null ^ this.getSummaryItems() == null)
            return false;
        if (other.getSummaryItems() != null && other.getSummaryItems().equals(this.getSummaryItems()) == false)
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

        hashCode = prime * hashCode + ((getSummaryItems() == null) ? 0 : getSummaryItems().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListExperienceEntitiesResult clone() {
        try {
            return (ListExperienceEntitiesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
