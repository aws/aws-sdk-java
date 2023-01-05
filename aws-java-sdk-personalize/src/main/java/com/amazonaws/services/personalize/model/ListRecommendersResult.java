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
package com.amazonaws.services.personalize.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/personalize-2018-05-22/ListRecommenders" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListRecommendersResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A list of the recommenders.
     * </p>
     */
    private java.util.List<RecommenderSummary> recommenders;
    /**
     * <p>
     * A token for getting the next set of recommenders (if they exist).
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A list of the recommenders.
     * </p>
     * 
     * @return A list of the recommenders.
     */

    public java.util.List<RecommenderSummary> getRecommenders() {
        return recommenders;
    }

    /**
     * <p>
     * A list of the recommenders.
     * </p>
     * 
     * @param recommenders
     *        A list of the recommenders.
     */

    public void setRecommenders(java.util.Collection<RecommenderSummary> recommenders) {
        if (recommenders == null) {
            this.recommenders = null;
            return;
        }

        this.recommenders = new java.util.ArrayList<RecommenderSummary>(recommenders);
    }

    /**
     * <p>
     * A list of the recommenders.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRecommenders(java.util.Collection)} or {@link #withRecommenders(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param recommenders
     *        A list of the recommenders.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListRecommendersResult withRecommenders(RecommenderSummary... recommenders) {
        if (this.recommenders == null) {
            setRecommenders(new java.util.ArrayList<RecommenderSummary>(recommenders.length));
        }
        for (RecommenderSummary ele : recommenders) {
            this.recommenders.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of the recommenders.
     * </p>
     * 
     * @param recommenders
     *        A list of the recommenders.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListRecommendersResult withRecommenders(java.util.Collection<RecommenderSummary> recommenders) {
        setRecommenders(recommenders);
        return this;
    }

    /**
     * <p>
     * A token for getting the next set of recommenders (if they exist).
     * </p>
     * 
     * @param nextToken
     *        A token for getting the next set of recommenders (if they exist).
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A token for getting the next set of recommenders (if they exist).
     * </p>
     * 
     * @return A token for getting the next set of recommenders (if they exist).
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * A token for getting the next set of recommenders (if they exist).
     * </p>
     * 
     * @param nextToken
     *        A token for getting the next set of recommenders (if they exist).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListRecommendersResult withNextToken(String nextToken) {
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
        if (getRecommenders() != null)
            sb.append("Recommenders: ").append(getRecommenders()).append(",");
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

        if (obj instanceof ListRecommendersResult == false)
            return false;
        ListRecommendersResult other = (ListRecommendersResult) obj;
        if (other.getRecommenders() == null ^ this.getRecommenders() == null)
            return false;
        if (other.getRecommenders() != null && other.getRecommenders().equals(this.getRecommenders()) == false)
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

        hashCode = prime * hashCode + ((getRecommenders() == null) ? 0 : getRecommenders().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListRecommendersResult clone() {
        try {
            return (ListRecommendersResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
