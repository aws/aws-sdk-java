/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.mturk.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mturk-requester-2017-01-17/ListReviewableHITs" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListReviewableHITsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the HIT type of the HITs to consider for the query. If not specified, all HITs for the Reviewer are
     * considered
     * </p>
     */
    private String hITTypeId;
    /**
     * <p>
     * Can be either <code>Reviewable</code> or <code>Reviewing</code>. Reviewable is the default value.
     * </p>
     */
    private String status;
    /**
     * <p>
     * Pagination Token
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * Limit the number of results returned.
     * </p>
     */
    private Integer maxResults;

    /**
     * <p>
     * The ID of the HIT type of the HITs to consider for the query. If not specified, all HITs for the Reviewer are
     * considered
     * </p>
     * 
     * @param hITTypeId
     *        The ID of the HIT type of the HITs to consider for the query. If not specified, all HITs for the Reviewer
     *        are considered
     */

    public void setHITTypeId(String hITTypeId) {
        this.hITTypeId = hITTypeId;
    }

    /**
     * <p>
     * The ID of the HIT type of the HITs to consider for the query. If not specified, all HITs for the Reviewer are
     * considered
     * </p>
     * 
     * @return The ID of the HIT type of the HITs to consider for the query. If not specified, all HITs for the Reviewer
     *         are considered
     */

    public String getHITTypeId() {
        return this.hITTypeId;
    }

    /**
     * <p>
     * The ID of the HIT type of the HITs to consider for the query. If not specified, all HITs for the Reviewer are
     * considered
     * </p>
     * 
     * @param hITTypeId
     *        The ID of the HIT type of the HITs to consider for the query. If not specified, all HITs for the Reviewer
     *        are considered
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListReviewableHITsRequest withHITTypeId(String hITTypeId) {
        setHITTypeId(hITTypeId);
        return this;
    }

    /**
     * <p>
     * Can be either <code>Reviewable</code> or <code>Reviewing</code>. Reviewable is the default value.
     * </p>
     * 
     * @param status
     *        Can be either <code>Reviewable</code> or <code>Reviewing</code>. Reviewable is the default value.
     * @see ReviewableHITStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * Can be either <code>Reviewable</code> or <code>Reviewing</code>. Reviewable is the default value.
     * </p>
     * 
     * @return Can be either <code>Reviewable</code> or <code>Reviewing</code>. Reviewable is the default value.
     * @see ReviewableHITStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * Can be either <code>Reviewable</code> or <code>Reviewing</code>. Reviewable is the default value.
     * </p>
     * 
     * @param status
     *        Can be either <code>Reviewable</code> or <code>Reviewing</code>. Reviewable is the default value.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ReviewableHITStatus
     */

    public ListReviewableHITsRequest withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * Can be either <code>Reviewable</code> or <code>Reviewing</code>. Reviewable is the default value.
     * </p>
     * 
     * @param status
     *        Can be either <code>Reviewable</code> or <code>Reviewing</code>. Reviewable is the default value.
     * @see ReviewableHITStatus
     */

    public void setStatus(ReviewableHITStatus status) {
        withStatus(status);
    }

    /**
     * <p>
     * Can be either <code>Reviewable</code> or <code>Reviewing</code>. Reviewable is the default value.
     * </p>
     * 
     * @param status
     *        Can be either <code>Reviewable</code> or <code>Reviewing</code>. Reviewable is the default value.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ReviewableHITStatus
     */

    public ListReviewableHITsRequest withStatus(ReviewableHITStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * Pagination Token
     * </p>
     * 
     * @param nextToken
     *        Pagination Token
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * Pagination Token
     * </p>
     * 
     * @return Pagination Token
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * Pagination Token
     * </p>
     * 
     * @param nextToken
     *        Pagination Token
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListReviewableHITsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * Limit the number of results returned.
     * </p>
     * 
     * @param maxResults
     *        Limit the number of results returned.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * Limit the number of results returned.
     * </p>
     * 
     * @return Limit the number of results returned.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * Limit the number of results returned.
     * </p>
     * 
     * @param maxResults
     *        Limit the number of results returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListReviewableHITsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
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
        if (getHITTypeId() != null)
            sb.append("HITTypeId: ").append(getHITTypeId()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListReviewableHITsRequest == false)
            return false;
        ListReviewableHITsRequest other = (ListReviewableHITsRequest) obj;
        if (other.getHITTypeId() == null ^ this.getHITTypeId() == null)
            return false;
        if (other.getHITTypeId() != null && other.getHITTypeId().equals(this.getHITTypeId()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getHITTypeId() == null) ? 0 : getHITTypeId().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        return hashCode;
    }

    @Override
    public ListReviewableHITsRequest clone() {
        return (ListReviewableHITsRequest) super.clone();
    }

}
