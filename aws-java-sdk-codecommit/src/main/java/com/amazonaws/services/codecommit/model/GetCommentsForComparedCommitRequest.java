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
package com.amazonaws.services.codecommit.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/GetCommentsForComparedCommit"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetCommentsForComparedCommitRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the repository where you want to compare commits.
     * </p>
     */
    private String repositoryName;
    /**
     * <p>
     * To establish the directionality of the comparison, the full commit ID of the 'before' commit.
     * </p>
     */
    private String beforeCommitId;
    /**
     * <p>
     * To establish the directionality of the comparison, the full commit ID of the 'after' commit.
     * </p>
     */
    private String afterCommitId;
    /**
     * <p>
     * An enumeration token that when provided in a request, returns the next batch of the results.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * A non-negative integer used to limit the number of returned results. The default is 100 comments, and is
     * configurable up to 500.
     * </p>
     */
    private Integer maxResults;

    /**
     * <p>
     * The name of the repository where you want to compare commits.
     * </p>
     * 
     * @param repositoryName
     *        The name of the repository where you want to compare commits.
     */

    public void setRepositoryName(String repositoryName) {
        this.repositoryName = repositoryName;
    }

    /**
     * <p>
     * The name of the repository where you want to compare commits.
     * </p>
     * 
     * @return The name of the repository where you want to compare commits.
     */

    public String getRepositoryName() {
        return this.repositoryName;
    }

    /**
     * <p>
     * The name of the repository where you want to compare commits.
     * </p>
     * 
     * @param repositoryName
     *        The name of the repository where you want to compare commits.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetCommentsForComparedCommitRequest withRepositoryName(String repositoryName) {
        setRepositoryName(repositoryName);
        return this;
    }

    /**
     * <p>
     * To establish the directionality of the comparison, the full commit ID of the 'before' commit.
     * </p>
     * 
     * @param beforeCommitId
     *        To establish the directionality of the comparison, the full commit ID of the 'before' commit.
     */

    public void setBeforeCommitId(String beforeCommitId) {
        this.beforeCommitId = beforeCommitId;
    }

    /**
     * <p>
     * To establish the directionality of the comparison, the full commit ID of the 'before' commit.
     * </p>
     * 
     * @return To establish the directionality of the comparison, the full commit ID of the 'before' commit.
     */

    public String getBeforeCommitId() {
        return this.beforeCommitId;
    }

    /**
     * <p>
     * To establish the directionality of the comparison, the full commit ID of the 'before' commit.
     * </p>
     * 
     * @param beforeCommitId
     *        To establish the directionality of the comparison, the full commit ID of the 'before' commit.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetCommentsForComparedCommitRequest withBeforeCommitId(String beforeCommitId) {
        setBeforeCommitId(beforeCommitId);
        return this;
    }

    /**
     * <p>
     * To establish the directionality of the comparison, the full commit ID of the 'after' commit.
     * </p>
     * 
     * @param afterCommitId
     *        To establish the directionality of the comparison, the full commit ID of the 'after' commit.
     */

    public void setAfterCommitId(String afterCommitId) {
        this.afterCommitId = afterCommitId;
    }

    /**
     * <p>
     * To establish the directionality of the comparison, the full commit ID of the 'after' commit.
     * </p>
     * 
     * @return To establish the directionality of the comparison, the full commit ID of the 'after' commit.
     */

    public String getAfterCommitId() {
        return this.afterCommitId;
    }

    /**
     * <p>
     * To establish the directionality of the comparison, the full commit ID of the 'after' commit.
     * </p>
     * 
     * @param afterCommitId
     *        To establish the directionality of the comparison, the full commit ID of the 'after' commit.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetCommentsForComparedCommitRequest withAfterCommitId(String afterCommitId) {
        setAfterCommitId(afterCommitId);
        return this;
    }

    /**
     * <p>
     * An enumeration token that when provided in a request, returns the next batch of the results.
     * </p>
     * 
     * @param nextToken
     *        An enumeration token that when provided in a request, returns the next batch of the results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * An enumeration token that when provided in a request, returns the next batch of the results.
     * </p>
     * 
     * @return An enumeration token that when provided in a request, returns the next batch of the results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * An enumeration token that when provided in a request, returns the next batch of the results.
     * </p>
     * 
     * @param nextToken
     *        An enumeration token that when provided in a request, returns the next batch of the results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetCommentsForComparedCommitRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * A non-negative integer used to limit the number of returned results. The default is 100 comments, and is
     * configurable up to 500.
     * </p>
     * 
     * @param maxResults
     *        A non-negative integer used to limit the number of returned results. The default is 100 comments, and is
     *        configurable up to 500.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * A non-negative integer used to limit the number of returned results. The default is 100 comments, and is
     * configurable up to 500.
     * </p>
     * 
     * @return A non-negative integer used to limit the number of returned results. The default is 100 comments, and is
     *         configurable up to 500.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * A non-negative integer used to limit the number of returned results. The default is 100 comments, and is
     * configurable up to 500.
     * </p>
     * 
     * @param maxResults
     *        A non-negative integer used to limit the number of returned results. The default is 100 comments, and is
     *        configurable up to 500.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetCommentsForComparedCommitRequest withMaxResults(Integer maxResults) {
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
        if (getRepositoryName() != null)
            sb.append("RepositoryName: ").append(getRepositoryName()).append(",");
        if (getBeforeCommitId() != null)
            sb.append("BeforeCommitId: ").append(getBeforeCommitId()).append(",");
        if (getAfterCommitId() != null)
            sb.append("AfterCommitId: ").append(getAfterCommitId()).append(",");
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

        if (obj instanceof GetCommentsForComparedCommitRequest == false)
            return false;
        GetCommentsForComparedCommitRequest other = (GetCommentsForComparedCommitRequest) obj;
        if (other.getRepositoryName() == null ^ this.getRepositoryName() == null)
            return false;
        if (other.getRepositoryName() != null && other.getRepositoryName().equals(this.getRepositoryName()) == false)
            return false;
        if (other.getBeforeCommitId() == null ^ this.getBeforeCommitId() == null)
            return false;
        if (other.getBeforeCommitId() != null && other.getBeforeCommitId().equals(this.getBeforeCommitId()) == false)
            return false;
        if (other.getAfterCommitId() == null ^ this.getAfterCommitId() == null)
            return false;
        if (other.getAfterCommitId() != null && other.getAfterCommitId().equals(this.getAfterCommitId()) == false)
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

        hashCode = prime * hashCode + ((getRepositoryName() == null) ? 0 : getRepositoryName().hashCode());
        hashCode = prime * hashCode + ((getBeforeCommitId() == null) ? 0 : getBeforeCommitId().hashCode());
        hashCode = prime * hashCode + ((getAfterCommitId() == null) ? 0 : getAfterCommitId().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        return hashCode;
    }

    @Override
    public GetCommentsForComparedCommitRequest clone() {
        return (GetCommentsForComparedCommitRequest) super.clone();
    }

}
