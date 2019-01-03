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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/GetDifferences" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetDifferencesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the repository where you want to get differences.
     * </p>
     */
    private String repositoryName;
    /**
     * <p>
     * The branch, tag, HEAD, or other fully qualified reference used to identify a commit. For example, the full commit
     * ID. Optional. If not specified, all changes prior to the <code>afterCommitSpecifier</code> value will be shown.
     * If you do not use <code>beforeCommitSpecifier</code> in your request, consider limiting the results with
     * <code>maxResults</code>.
     * </p>
     */
    private String beforeCommitSpecifier;
    /**
     * <p>
     * The branch, tag, HEAD, or other fully qualified reference used to identify a commit.
     * </p>
     */
    private String afterCommitSpecifier;
    /**
     * <p>
     * The file path in which to check for differences. Limits the results to this path. Can also be used to specify the
     * previous name of a directory or folder. If <code>beforePath</code> and <code>afterPath</code> are not specified,
     * differences will be shown for all paths.
     * </p>
     */
    private String beforePath;
    /**
     * <p>
     * The file path in which to check differences. Limits the results to this path. Can also be used to specify the
     * changed name of a directory or folder, if it has changed. If not specified, differences will be shown for all
     * paths.
     * </p>
     */
    private String afterPath;
    /**
     * <p>
     * A non-negative integer used to limit the number of returned results.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * An enumeration token that when provided in a request, returns the next batch of the results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The name of the repository where you want to get differences.
     * </p>
     * 
     * @param repositoryName
     *        The name of the repository where you want to get differences.
     */

    public void setRepositoryName(String repositoryName) {
        this.repositoryName = repositoryName;
    }

    /**
     * <p>
     * The name of the repository where you want to get differences.
     * </p>
     * 
     * @return The name of the repository where you want to get differences.
     */

    public String getRepositoryName() {
        return this.repositoryName;
    }

    /**
     * <p>
     * The name of the repository where you want to get differences.
     * </p>
     * 
     * @param repositoryName
     *        The name of the repository where you want to get differences.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDifferencesRequest withRepositoryName(String repositoryName) {
        setRepositoryName(repositoryName);
        return this;
    }

    /**
     * <p>
     * The branch, tag, HEAD, or other fully qualified reference used to identify a commit. For example, the full commit
     * ID. Optional. If not specified, all changes prior to the <code>afterCommitSpecifier</code> value will be shown.
     * If you do not use <code>beforeCommitSpecifier</code> in your request, consider limiting the results with
     * <code>maxResults</code>.
     * </p>
     * 
     * @param beforeCommitSpecifier
     *        The branch, tag, HEAD, or other fully qualified reference used to identify a commit. For example, the full
     *        commit ID. Optional. If not specified, all changes prior to the <code>afterCommitSpecifier</code> value
     *        will be shown. If you do not use <code>beforeCommitSpecifier</code> in your request, consider limiting the
     *        results with <code>maxResults</code>.
     */

    public void setBeforeCommitSpecifier(String beforeCommitSpecifier) {
        this.beforeCommitSpecifier = beforeCommitSpecifier;
    }

    /**
     * <p>
     * The branch, tag, HEAD, or other fully qualified reference used to identify a commit. For example, the full commit
     * ID. Optional. If not specified, all changes prior to the <code>afterCommitSpecifier</code> value will be shown.
     * If you do not use <code>beforeCommitSpecifier</code> in your request, consider limiting the results with
     * <code>maxResults</code>.
     * </p>
     * 
     * @return The branch, tag, HEAD, or other fully qualified reference used to identify a commit. For example, the
     *         full commit ID. Optional. If not specified, all changes prior to the <code>afterCommitSpecifier</code>
     *         value will be shown. If you do not use <code>beforeCommitSpecifier</code> in your request, consider
     *         limiting the results with <code>maxResults</code>.
     */

    public String getBeforeCommitSpecifier() {
        return this.beforeCommitSpecifier;
    }

    /**
     * <p>
     * The branch, tag, HEAD, or other fully qualified reference used to identify a commit. For example, the full commit
     * ID. Optional. If not specified, all changes prior to the <code>afterCommitSpecifier</code> value will be shown.
     * If you do not use <code>beforeCommitSpecifier</code> in your request, consider limiting the results with
     * <code>maxResults</code>.
     * </p>
     * 
     * @param beforeCommitSpecifier
     *        The branch, tag, HEAD, or other fully qualified reference used to identify a commit. For example, the full
     *        commit ID. Optional. If not specified, all changes prior to the <code>afterCommitSpecifier</code> value
     *        will be shown. If you do not use <code>beforeCommitSpecifier</code> in your request, consider limiting the
     *        results with <code>maxResults</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDifferencesRequest withBeforeCommitSpecifier(String beforeCommitSpecifier) {
        setBeforeCommitSpecifier(beforeCommitSpecifier);
        return this;
    }

    /**
     * <p>
     * The branch, tag, HEAD, or other fully qualified reference used to identify a commit.
     * </p>
     * 
     * @param afterCommitSpecifier
     *        The branch, tag, HEAD, or other fully qualified reference used to identify a commit.
     */

    public void setAfterCommitSpecifier(String afterCommitSpecifier) {
        this.afterCommitSpecifier = afterCommitSpecifier;
    }

    /**
     * <p>
     * The branch, tag, HEAD, or other fully qualified reference used to identify a commit.
     * </p>
     * 
     * @return The branch, tag, HEAD, or other fully qualified reference used to identify a commit.
     */

    public String getAfterCommitSpecifier() {
        return this.afterCommitSpecifier;
    }

    /**
     * <p>
     * The branch, tag, HEAD, or other fully qualified reference used to identify a commit.
     * </p>
     * 
     * @param afterCommitSpecifier
     *        The branch, tag, HEAD, or other fully qualified reference used to identify a commit.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDifferencesRequest withAfterCommitSpecifier(String afterCommitSpecifier) {
        setAfterCommitSpecifier(afterCommitSpecifier);
        return this;
    }

    /**
     * <p>
     * The file path in which to check for differences. Limits the results to this path. Can also be used to specify the
     * previous name of a directory or folder. If <code>beforePath</code> and <code>afterPath</code> are not specified,
     * differences will be shown for all paths.
     * </p>
     * 
     * @param beforePath
     *        The file path in which to check for differences. Limits the results to this path. Can also be used to
     *        specify the previous name of a directory or folder. If <code>beforePath</code> and <code>afterPath</code>
     *        are not specified, differences will be shown for all paths.
     */

    public void setBeforePath(String beforePath) {
        this.beforePath = beforePath;
    }

    /**
     * <p>
     * The file path in which to check for differences. Limits the results to this path. Can also be used to specify the
     * previous name of a directory or folder. If <code>beforePath</code> and <code>afterPath</code> are not specified,
     * differences will be shown for all paths.
     * </p>
     * 
     * @return The file path in which to check for differences. Limits the results to this path. Can also be used to
     *         specify the previous name of a directory or folder. If <code>beforePath</code> and <code>afterPath</code>
     *         are not specified, differences will be shown for all paths.
     */

    public String getBeforePath() {
        return this.beforePath;
    }

    /**
     * <p>
     * The file path in which to check for differences. Limits the results to this path. Can also be used to specify the
     * previous name of a directory or folder. If <code>beforePath</code> and <code>afterPath</code> are not specified,
     * differences will be shown for all paths.
     * </p>
     * 
     * @param beforePath
     *        The file path in which to check for differences. Limits the results to this path. Can also be used to
     *        specify the previous name of a directory or folder. If <code>beforePath</code> and <code>afterPath</code>
     *        are not specified, differences will be shown for all paths.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDifferencesRequest withBeforePath(String beforePath) {
        setBeforePath(beforePath);
        return this;
    }

    /**
     * <p>
     * The file path in which to check differences. Limits the results to this path. Can also be used to specify the
     * changed name of a directory or folder, if it has changed. If not specified, differences will be shown for all
     * paths.
     * </p>
     * 
     * @param afterPath
     *        The file path in which to check differences. Limits the results to this path. Can also be used to specify
     *        the changed name of a directory or folder, if it has changed. If not specified, differences will be shown
     *        for all paths.
     */

    public void setAfterPath(String afterPath) {
        this.afterPath = afterPath;
    }

    /**
     * <p>
     * The file path in which to check differences. Limits the results to this path. Can also be used to specify the
     * changed name of a directory or folder, if it has changed. If not specified, differences will be shown for all
     * paths.
     * </p>
     * 
     * @return The file path in which to check differences. Limits the results to this path. Can also be used to specify
     *         the changed name of a directory or folder, if it has changed. If not specified, differences will be shown
     *         for all paths.
     */

    public String getAfterPath() {
        return this.afterPath;
    }

    /**
     * <p>
     * The file path in which to check differences. Limits the results to this path. Can also be used to specify the
     * changed name of a directory or folder, if it has changed. If not specified, differences will be shown for all
     * paths.
     * </p>
     * 
     * @param afterPath
     *        The file path in which to check differences. Limits the results to this path. Can also be used to specify
     *        the changed name of a directory or folder, if it has changed. If not specified, differences will be shown
     *        for all paths.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDifferencesRequest withAfterPath(String afterPath) {
        setAfterPath(afterPath);
        return this;
    }

    /**
     * <p>
     * A non-negative integer used to limit the number of returned results.
     * </p>
     * 
     * @param maxResults
     *        A non-negative integer used to limit the number of returned results.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * A non-negative integer used to limit the number of returned results.
     * </p>
     * 
     * @return A non-negative integer used to limit the number of returned results.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * A non-negative integer used to limit the number of returned results.
     * </p>
     * 
     * @param maxResults
     *        A non-negative integer used to limit the number of returned results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDifferencesRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
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

    public GetDifferencesRequest withNextToken(String nextToken) {
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
        if (getRepositoryName() != null)
            sb.append("RepositoryName: ").append(getRepositoryName()).append(",");
        if (getBeforeCommitSpecifier() != null)
            sb.append("BeforeCommitSpecifier: ").append(getBeforeCommitSpecifier()).append(",");
        if (getAfterCommitSpecifier() != null)
            sb.append("AfterCommitSpecifier: ").append(getAfterCommitSpecifier()).append(",");
        if (getBeforePath() != null)
            sb.append("BeforePath: ").append(getBeforePath()).append(",");
        if (getAfterPath() != null)
            sb.append("AfterPath: ").append(getAfterPath()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
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

        if (obj instanceof GetDifferencesRequest == false)
            return false;
        GetDifferencesRequest other = (GetDifferencesRequest) obj;
        if (other.getRepositoryName() == null ^ this.getRepositoryName() == null)
            return false;
        if (other.getRepositoryName() != null && other.getRepositoryName().equals(this.getRepositoryName()) == false)
            return false;
        if (other.getBeforeCommitSpecifier() == null ^ this.getBeforeCommitSpecifier() == null)
            return false;
        if (other.getBeforeCommitSpecifier() != null && other.getBeforeCommitSpecifier().equals(this.getBeforeCommitSpecifier()) == false)
            return false;
        if (other.getAfterCommitSpecifier() == null ^ this.getAfterCommitSpecifier() == null)
            return false;
        if (other.getAfterCommitSpecifier() != null && other.getAfterCommitSpecifier().equals(this.getAfterCommitSpecifier()) == false)
            return false;
        if (other.getBeforePath() == null ^ this.getBeforePath() == null)
            return false;
        if (other.getBeforePath() != null && other.getBeforePath().equals(this.getBeforePath()) == false)
            return false;
        if (other.getAfterPath() == null ^ this.getAfterPath() == null)
            return false;
        if (other.getAfterPath() != null && other.getAfterPath().equals(this.getAfterPath()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
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

        hashCode = prime * hashCode + ((getRepositoryName() == null) ? 0 : getRepositoryName().hashCode());
        hashCode = prime * hashCode + ((getBeforeCommitSpecifier() == null) ? 0 : getBeforeCommitSpecifier().hashCode());
        hashCode = prime * hashCode + ((getAfterCommitSpecifier() == null) ? 0 : getAfterCommitSpecifier().hashCode());
        hashCode = prime * hashCode + ((getBeforePath() == null) ? 0 : getBeforePath().hashCode());
        hashCode = prime * hashCode + ((getAfterPath() == null) ? 0 : getAfterPath().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public GetDifferencesRequest clone() {
        return (GetDifferencesRequest) super.clone();
    }

}
