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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/BatchGetCommits" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchGetCommitsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The full commit IDs of the commits to get information about.
     * </p>
     * <note>
     * <p>
     * You must supply the full SHAs of each commit. You cannot use shortened SHAs.
     * </p>
     * </note>
     */
    private java.util.List<String> commitIds;
    /**
     * <p>
     * The name of the repository that contains the commits.
     * </p>
     */
    private String repositoryName;

    /**
     * <p>
     * The full commit IDs of the commits to get information about.
     * </p>
     * <note>
     * <p>
     * You must supply the full SHAs of each commit. You cannot use shortened SHAs.
     * </p>
     * </note>
     * 
     * @return The full commit IDs of the commits to get information about.</p> <note>
     *         <p>
     *         You must supply the full SHAs of each commit. You cannot use shortened SHAs.
     *         </p>
     */

    public java.util.List<String> getCommitIds() {
        return commitIds;
    }

    /**
     * <p>
     * The full commit IDs of the commits to get information about.
     * </p>
     * <note>
     * <p>
     * You must supply the full SHAs of each commit. You cannot use shortened SHAs.
     * </p>
     * </note>
     * 
     * @param commitIds
     *        The full commit IDs of the commits to get information about.</p> <note>
     *        <p>
     *        You must supply the full SHAs of each commit. You cannot use shortened SHAs.
     *        </p>
     */

    public void setCommitIds(java.util.Collection<String> commitIds) {
        if (commitIds == null) {
            this.commitIds = null;
            return;
        }

        this.commitIds = new java.util.ArrayList<String>(commitIds);
    }

    /**
     * <p>
     * The full commit IDs of the commits to get information about.
     * </p>
     * <note>
     * <p>
     * You must supply the full SHAs of each commit. You cannot use shortened SHAs.
     * </p>
     * </note>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCommitIds(java.util.Collection)} or {@link #withCommitIds(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param commitIds
     *        The full commit IDs of the commits to get information about.</p> <note>
     *        <p>
     *        You must supply the full SHAs of each commit. You cannot use shortened SHAs.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetCommitsRequest withCommitIds(String... commitIds) {
        if (this.commitIds == null) {
            setCommitIds(new java.util.ArrayList<String>(commitIds.length));
        }
        for (String ele : commitIds) {
            this.commitIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The full commit IDs of the commits to get information about.
     * </p>
     * <note>
     * <p>
     * You must supply the full SHAs of each commit. You cannot use shortened SHAs.
     * </p>
     * </note>
     * 
     * @param commitIds
     *        The full commit IDs of the commits to get information about.</p> <note>
     *        <p>
     *        You must supply the full SHAs of each commit. You cannot use shortened SHAs.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetCommitsRequest withCommitIds(java.util.Collection<String> commitIds) {
        setCommitIds(commitIds);
        return this;
    }

    /**
     * <p>
     * The name of the repository that contains the commits.
     * </p>
     * 
     * @param repositoryName
     *        The name of the repository that contains the commits.
     */

    public void setRepositoryName(String repositoryName) {
        this.repositoryName = repositoryName;
    }

    /**
     * <p>
     * The name of the repository that contains the commits.
     * </p>
     * 
     * @return The name of the repository that contains the commits.
     */

    public String getRepositoryName() {
        return this.repositoryName;
    }

    /**
     * <p>
     * The name of the repository that contains the commits.
     * </p>
     * 
     * @param repositoryName
     *        The name of the repository that contains the commits.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetCommitsRequest withRepositoryName(String repositoryName) {
        setRepositoryName(repositoryName);
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
        if (getCommitIds() != null)
            sb.append("CommitIds: ").append(getCommitIds()).append(",");
        if (getRepositoryName() != null)
            sb.append("RepositoryName: ").append(getRepositoryName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchGetCommitsRequest == false)
            return false;
        BatchGetCommitsRequest other = (BatchGetCommitsRequest) obj;
        if (other.getCommitIds() == null ^ this.getCommitIds() == null)
            return false;
        if (other.getCommitIds() != null && other.getCommitIds().equals(this.getCommitIds()) == false)
            return false;
        if (other.getRepositoryName() == null ^ this.getRepositoryName() == null)
            return false;
        if (other.getRepositoryName() != null && other.getRepositoryName().equals(this.getRepositoryName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCommitIds() == null) ? 0 : getCommitIds().hashCode());
        hashCode = prime * hashCode + ((getRepositoryName() == null) ? 0 : getRepositoryName().hashCode());
        return hashCode;
    }

    @Override
    public BatchGetCommitsRequest clone() {
        return (BatchGetCommitsRequest) super.clone();
    }

}
