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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/ListFileCommitHistory" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListFileCommitHistoryResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * An array of FileVersion objects that form a directed acyclic graph (DAG) of the changes to the file made by the
     * commits that changed the file.
     * </p>
     */
    private java.util.List<FileVersion> revisionDag;
    /**
     * <p>
     * An enumeration token that can be used to return the next batch of results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * An array of FileVersion objects that form a directed acyclic graph (DAG) of the changes to the file made by the
     * commits that changed the file.
     * </p>
     * 
     * @return An array of FileVersion objects that form a directed acyclic graph (DAG) of the changes to the file made
     *         by the commits that changed the file.
     */

    public java.util.List<FileVersion> getRevisionDag() {
        return revisionDag;
    }

    /**
     * <p>
     * An array of FileVersion objects that form a directed acyclic graph (DAG) of the changes to the file made by the
     * commits that changed the file.
     * </p>
     * 
     * @param revisionDag
     *        An array of FileVersion objects that form a directed acyclic graph (DAG) of the changes to the file made
     *        by the commits that changed the file.
     */

    public void setRevisionDag(java.util.Collection<FileVersion> revisionDag) {
        if (revisionDag == null) {
            this.revisionDag = null;
            return;
        }

        this.revisionDag = new java.util.ArrayList<FileVersion>(revisionDag);
    }

    /**
     * <p>
     * An array of FileVersion objects that form a directed acyclic graph (DAG) of the changes to the file made by the
     * commits that changed the file.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRevisionDag(java.util.Collection)} or {@link #withRevisionDag(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param revisionDag
     *        An array of FileVersion objects that form a directed acyclic graph (DAG) of the changes to the file made
     *        by the commits that changed the file.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListFileCommitHistoryResult withRevisionDag(FileVersion... revisionDag) {
        if (this.revisionDag == null) {
            setRevisionDag(new java.util.ArrayList<FileVersion>(revisionDag.length));
        }
        for (FileVersion ele : revisionDag) {
            this.revisionDag.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of FileVersion objects that form a directed acyclic graph (DAG) of the changes to the file made by the
     * commits that changed the file.
     * </p>
     * 
     * @param revisionDag
     *        An array of FileVersion objects that form a directed acyclic graph (DAG) of the changes to the file made
     *        by the commits that changed the file.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListFileCommitHistoryResult withRevisionDag(java.util.Collection<FileVersion> revisionDag) {
        setRevisionDag(revisionDag);
        return this;
    }

    /**
     * <p>
     * An enumeration token that can be used to return the next batch of results.
     * </p>
     * 
     * @param nextToken
     *        An enumeration token that can be used to return the next batch of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * An enumeration token that can be used to return the next batch of results.
     * </p>
     * 
     * @return An enumeration token that can be used to return the next batch of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * An enumeration token that can be used to return the next batch of results.
     * </p>
     * 
     * @param nextToken
     *        An enumeration token that can be used to return the next batch of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListFileCommitHistoryResult withNextToken(String nextToken) {
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
        if (getRevisionDag() != null)
            sb.append("RevisionDag: ").append(getRevisionDag()).append(",");
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

        if (obj instanceof ListFileCommitHistoryResult == false)
            return false;
        ListFileCommitHistoryResult other = (ListFileCommitHistoryResult) obj;
        if (other.getRevisionDag() == null ^ this.getRevisionDag() == null)
            return false;
        if (other.getRevisionDag() != null && other.getRevisionDag().equals(this.getRevisionDag()) == false)
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

        hashCode = prime * hashCode + ((getRevisionDag() == null) ? 0 : getRevisionDag().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListFileCommitHistoryResult clone() {
        try {
            return (ListFileCommitHistoryResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
