/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/ListFileCommitHistory" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListFileCommitHistoryRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the repository that contains the file.
     * </p>
     */
    private String repositoryName;
    /**
     * <p>
     * The fully quaified reference that identifies the commit that contains the file. For example, you can specify a
     * full commit ID, a tag, a branch name, or a reference such as <code>refs/heads/main</code>. If none is provided,
     * the head commit is used.
     * </p>
     */
    private String commitSpecifier;
    /**
     * <p>
     * The full path of the file whose history you want to retrieve, including the name of the file.
     * </p>
     */
    private String filePath;
    /**
     * <p>
     * A non-zero, non-negative integer used to limit the number of returned results.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * An enumeration token that allows the operation to batch the results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The name of the repository that contains the file.
     * </p>
     * 
     * @param repositoryName
     *        The name of the repository that contains the file.
     */

    public void setRepositoryName(String repositoryName) {
        this.repositoryName = repositoryName;
    }

    /**
     * <p>
     * The name of the repository that contains the file.
     * </p>
     * 
     * @return The name of the repository that contains the file.
     */

    public String getRepositoryName() {
        return this.repositoryName;
    }

    /**
     * <p>
     * The name of the repository that contains the file.
     * </p>
     * 
     * @param repositoryName
     *        The name of the repository that contains the file.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListFileCommitHistoryRequest withRepositoryName(String repositoryName) {
        setRepositoryName(repositoryName);
        return this;
    }

    /**
     * <p>
     * The fully quaified reference that identifies the commit that contains the file. For example, you can specify a
     * full commit ID, a tag, a branch name, or a reference such as <code>refs/heads/main</code>. If none is provided,
     * the head commit is used.
     * </p>
     * 
     * @param commitSpecifier
     *        The fully quaified reference that identifies the commit that contains the file. For example, you can
     *        specify a full commit ID, a tag, a branch name, or a reference such as <code>refs/heads/main</code>. If
     *        none is provided, the head commit is used.
     */

    public void setCommitSpecifier(String commitSpecifier) {
        this.commitSpecifier = commitSpecifier;
    }

    /**
     * <p>
     * The fully quaified reference that identifies the commit that contains the file. For example, you can specify a
     * full commit ID, a tag, a branch name, or a reference such as <code>refs/heads/main</code>. If none is provided,
     * the head commit is used.
     * </p>
     * 
     * @return The fully quaified reference that identifies the commit that contains the file. For example, you can
     *         specify a full commit ID, a tag, a branch name, or a reference such as <code>refs/heads/main</code>. If
     *         none is provided, the head commit is used.
     */

    public String getCommitSpecifier() {
        return this.commitSpecifier;
    }

    /**
     * <p>
     * The fully quaified reference that identifies the commit that contains the file. For example, you can specify a
     * full commit ID, a tag, a branch name, or a reference such as <code>refs/heads/main</code>. If none is provided,
     * the head commit is used.
     * </p>
     * 
     * @param commitSpecifier
     *        The fully quaified reference that identifies the commit that contains the file. For example, you can
     *        specify a full commit ID, a tag, a branch name, or a reference such as <code>refs/heads/main</code>. If
     *        none is provided, the head commit is used.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListFileCommitHistoryRequest withCommitSpecifier(String commitSpecifier) {
        setCommitSpecifier(commitSpecifier);
        return this;
    }

    /**
     * <p>
     * The full path of the file whose history you want to retrieve, including the name of the file.
     * </p>
     * 
     * @param filePath
     *        The full path of the file whose history you want to retrieve, including the name of the file.
     */

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    /**
     * <p>
     * The full path of the file whose history you want to retrieve, including the name of the file.
     * </p>
     * 
     * @return The full path of the file whose history you want to retrieve, including the name of the file.
     */

    public String getFilePath() {
        return this.filePath;
    }

    /**
     * <p>
     * The full path of the file whose history you want to retrieve, including the name of the file.
     * </p>
     * 
     * @param filePath
     *        The full path of the file whose history you want to retrieve, including the name of the file.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListFileCommitHistoryRequest withFilePath(String filePath) {
        setFilePath(filePath);
        return this;
    }

    /**
     * <p>
     * A non-zero, non-negative integer used to limit the number of returned results.
     * </p>
     * 
     * @param maxResults
     *        A non-zero, non-negative integer used to limit the number of returned results.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * A non-zero, non-negative integer used to limit the number of returned results.
     * </p>
     * 
     * @return A non-zero, non-negative integer used to limit the number of returned results.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * A non-zero, non-negative integer used to limit the number of returned results.
     * </p>
     * 
     * @param maxResults
     *        A non-zero, non-negative integer used to limit the number of returned results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListFileCommitHistoryRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * An enumeration token that allows the operation to batch the results.
     * </p>
     * 
     * @param nextToken
     *        An enumeration token that allows the operation to batch the results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * An enumeration token that allows the operation to batch the results.
     * </p>
     * 
     * @return An enumeration token that allows the operation to batch the results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * An enumeration token that allows the operation to batch the results.
     * </p>
     * 
     * @param nextToken
     *        An enumeration token that allows the operation to batch the results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListFileCommitHistoryRequest withNextToken(String nextToken) {
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
        if (getCommitSpecifier() != null)
            sb.append("CommitSpecifier: ").append(getCommitSpecifier()).append(",");
        if (getFilePath() != null)
            sb.append("FilePath: ").append(getFilePath()).append(",");
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

        if (obj instanceof ListFileCommitHistoryRequest == false)
            return false;
        ListFileCommitHistoryRequest other = (ListFileCommitHistoryRequest) obj;
        if (other.getRepositoryName() == null ^ this.getRepositoryName() == null)
            return false;
        if (other.getRepositoryName() != null && other.getRepositoryName().equals(this.getRepositoryName()) == false)
            return false;
        if (other.getCommitSpecifier() == null ^ this.getCommitSpecifier() == null)
            return false;
        if (other.getCommitSpecifier() != null && other.getCommitSpecifier().equals(this.getCommitSpecifier()) == false)
            return false;
        if (other.getFilePath() == null ^ this.getFilePath() == null)
            return false;
        if (other.getFilePath() != null && other.getFilePath().equals(this.getFilePath()) == false)
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
        hashCode = prime * hashCode + ((getCommitSpecifier() == null) ? 0 : getCommitSpecifier().hashCode());
        hashCode = prime * hashCode + ((getFilePath() == null) ? 0 : getFilePath().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListFileCommitHistoryRequest clone() {
        return (ListFileCommitHistoryRequest) super.clone();
    }

}
