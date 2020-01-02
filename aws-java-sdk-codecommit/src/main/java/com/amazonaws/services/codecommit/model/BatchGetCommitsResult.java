/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/BatchGetCommits" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchGetCommitsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * An array of commit data type objects, each of which contains information about a specified commit.
     * </p>
     */
    private java.util.List<Commit> commits;
    /**
     * <p>
     * Returns any commit IDs for which information could not be found. For example, if one of the commit IDs was a
     * shortened SHA ID or that commit was not found in the specified repository, the ID returns an error object with
     * more information.
     * </p>
     */
    private java.util.List<BatchGetCommitsError> errors;

    /**
     * <p>
     * An array of commit data type objects, each of which contains information about a specified commit.
     * </p>
     * 
     * @return An array of commit data type objects, each of which contains information about a specified commit.
     */

    public java.util.List<Commit> getCommits() {
        return commits;
    }

    /**
     * <p>
     * An array of commit data type objects, each of which contains information about a specified commit.
     * </p>
     * 
     * @param commits
     *        An array of commit data type objects, each of which contains information about a specified commit.
     */

    public void setCommits(java.util.Collection<Commit> commits) {
        if (commits == null) {
            this.commits = null;
            return;
        }

        this.commits = new java.util.ArrayList<Commit>(commits);
    }

    /**
     * <p>
     * An array of commit data type objects, each of which contains information about a specified commit.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCommits(java.util.Collection)} or {@link #withCommits(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param commits
     *        An array of commit data type objects, each of which contains information about a specified commit.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetCommitsResult withCommits(Commit... commits) {
        if (this.commits == null) {
            setCommits(new java.util.ArrayList<Commit>(commits.length));
        }
        for (Commit ele : commits) {
            this.commits.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of commit data type objects, each of which contains information about a specified commit.
     * </p>
     * 
     * @param commits
     *        An array of commit data type objects, each of which contains information about a specified commit.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetCommitsResult withCommits(java.util.Collection<Commit> commits) {
        setCommits(commits);
        return this;
    }

    /**
     * <p>
     * Returns any commit IDs for which information could not be found. For example, if one of the commit IDs was a
     * shortened SHA ID or that commit was not found in the specified repository, the ID returns an error object with
     * more information.
     * </p>
     * 
     * @return Returns any commit IDs for which information could not be found. For example, if one of the commit IDs
     *         was a shortened SHA ID or that commit was not found in the specified repository, the ID returns an error
     *         object with more information.
     */

    public java.util.List<BatchGetCommitsError> getErrors() {
        return errors;
    }

    /**
     * <p>
     * Returns any commit IDs for which information could not be found. For example, if one of the commit IDs was a
     * shortened SHA ID or that commit was not found in the specified repository, the ID returns an error object with
     * more information.
     * </p>
     * 
     * @param errors
     *        Returns any commit IDs for which information could not be found. For example, if one of the commit IDs was
     *        a shortened SHA ID or that commit was not found in the specified repository, the ID returns an error
     *        object with more information.
     */

    public void setErrors(java.util.Collection<BatchGetCommitsError> errors) {
        if (errors == null) {
            this.errors = null;
            return;
        }

        this.errors = new java.util.ArrayList<BatchGetCommitsError>(errors);
    }

    /**
     * <p>
     * Returns any commit IDs for which information could not be found. For example, if one of the commit IDs was a
     * shortened SHA ID or that commit was not found in the specified repository, the ID returns an error object with
     * more information.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setErrors(java.util.Collection)} or {@link #withErrors(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param errors
     *        Returns any commit IDs for which information could not be found. For example, if one of the commit IDs was
     *        a shortened SHA ID or that commit was not found in the specified repository, the ID returns an error
     *        object with more information.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetCommitsResult withErrors(BatchGetCommitsError... errors) {
        if (this.errors == null) {
            setErrors(new java.util.ArrayList<BatchGetCommitsError>(errors.length));
        }
        for (BatchGetCommitsError ele : errors) {
            this.errors.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Returns any commit IDs for which information could not be found. For example, if one of the commit IDs was a
     * shortened SHA ID or that commit was not found in the specified repository, the ID returns an error object with
     * more information.
     * </p>
     * 
     * @param errors
     *        Returns any commit IDs for which information could not be found. For example, if one of the commit IDs was
     *        a shortened SHA ID or that commit was not found in the specified repository, the ID returns an error
     *        object with more information.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetCommitsResult withErrors(java.util.Collection<BatchGetCommitsError> errors) {
        setErrors(errors);
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
        if (getCommits() != null)
            sb.append("Commits: ").append(getCommits()).append(",");
        if (getErrors() != null)
            sb.append("Errors: ").append(getErrors());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchGetCommitsResult == false)
            return false;
        BatchGetCommitsResult other = (BatchGetCommitsResult) obj;
        if (other.getCommits() == null ^ this.getCommits() == null)
            return false;
        if (other.getCommits() != null && other.getCommits().equals(this.getCommits()) == false)
            return false;
        if (other.getErrors() == null ^ this.getErrors() == null)
            return false;
        if (other.getErrors() != null && other.getErrors().equals(this.getErrors()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCommits() == null) ? 0 : getCommits().hashCode());
        hashCode = prime * hashCode + ((getErrors() == null) ? 0 : getErrors().hashCode());
        return hashCode;
    }

    @Override
    public BatchGetCommitsResult clone() {
        try {
            return (BatchGetCommitsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
