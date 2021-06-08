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
package com.amazonaws.services.codegurureviewer.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeguru-reviewer-2019-09-19/ListRecommendations"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListRecommendationsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Pagination token.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The maximum number of results that are returned per call. The default is 100.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the <a
     * href="https://docs.aws.amazon.com/codeguru/latest/reviewer-api/API_CodeReview.html"> <code>CodeReview</code> </a>
     * object.
     * </p>
     */
    private String codeReviewArn;

    /**
     * <p>
     * Pagination token.
     * </p>
     * 
     * @param nextToken
     *        Pagination token.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * Pagination token.
     * </p>
     * 
     * @return Pagination token.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * Pagination token.
     * </p>
     * 
     * @param nextToken
     *        Pagination token.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListRecommendationsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The maximum number of results that are returned per call. The default is 100.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results that are returned per call. The default is 100.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of results that are returned per call. The default is 100.
     * </p>
     * 
     * @return The maximum number of results that are returned per call. The default is 100.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of results that are returned per call. The default is 100.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results that are returned per call. The default is 100.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListRecommendationsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the <a
     * href="https://docs.aws.amazon.com/codeguru/latest/reviewer-api/API_CodeReview.html"> <code>CodeReview</code> </a>
     * object.
     * </p>
     * 
     * @param codeReviewArn
     *        The Amazon Resource Name (ARN) of the <a
     *        href="https://docs.aws.amazon.com/codeguru/latest/reviewer-api/API_CodeReview.html">
     *        <code>CodeReview</code> </a> object.
     */

    public void setCodeReviewArn(String codeReviewArn) {
        this.codeReviewArn = codeReviewArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the <a
     * href="https://docs.aws.amazon.com/codeguru/latest/reviewer-api/API_CodeReview.html"> <code>CodeReview</code> </a>
     * object.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the <a
     *         href="https://docs.aws.amazon.com/codeguru/latest/reviewer-api/API_CodeReview.html">
     *         <code>CodeReview</code> </a> object.
     */

    public String getCodeReviewArn() {
        return this.codeReviewArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the <a
     * href="https://docs.aws.amazon.com/codeguru/latest/reviewer-api/API_CodeReview.html"> <code>CodeReview</code> </a>
     * object.
     * </p>
     * 
     * @param codeReviewArn
     *        The Amazon Resource Name (ARN) of the <a
     *        href="https://docs.aws.amazon.com/codeguru/latest/reviewer-api/API_CodeReview.html">
     *        <code>CodeReview</code> </a> object.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListRecommendationsRequest withCodeReviewArn(String codeReviewArn) {
        setCodeReviewArn(codeReviewArn);
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
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
        if (getCodeReviewArn() != null)
            sb.append("CodeReviewArn: ").append(getCodeReviewArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListRecommendationsRequest == false)
            return false;
        ListRecommendationsRequest other = (ListRecommendationsRequest) obj;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getCodeReviewArn() == null ^ this.getCodeReviewArn() == null)
            return false;
        if (other.getCodeReviewArn() != null && other.getCodeReviewArn().equals(this.getCodeReviewArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getCodeReviewArn() == null) ? 0 : getCodeReviewArn().hashCode());
        return hashCode;
    }

    @Override
    public ListRecommendationsRequest clone() {
        return (ListRecommendationsRequest) super.clone();
    }

}
