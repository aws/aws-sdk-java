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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/GetCommentsForComparedCommit"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetCommentsForComparedCommitResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A list of comment objects on the compared commit.
     * </p>
     */
    private java.util.List<CommentsForComparedCommit> commentsForComparedCommitData;
    /**
     * <p>
     * An enumeration token that can be used in a request to return the next batch of the results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A list of comment objects on the compared commit.
     * </p>
     * 
     * @return A list of comment objects on the compared commit.
     */

    public java.util.List<CommentsForComparedCommit> getCommentsForComparedCommitData() {
        return commentsForComparedCommitData;
    }

    /**
     * <p>
     * A list of comment objects on the compared commit.
     * </p>
     * 
     * @param commentsForComparedCommitData
     *        A list of comment objects on the compared commit.
     */

    public void setCommentsForComparedCommitData(java.util.Collection<CommentsForComparedCommit> commentsForComparedCommitData) {
        if (commentsForComparedCommitData == null) {
            this.commentsForComparedCommitData = null;
            return;
        }

        this.commentsForComparedCommitData = new java.util.ArrayList<CommentsForComparedCommit>(commentsForComparedCommitData);
    }

    /**
     * <p>
     * A list of comment objects on the compared commit.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCommentsForComparedCommitData(java.util.Collection)} or
     * {@link #withCommentsForComparedCommitData(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param commentsForComparedCommitData
     *        A list of comment objects on the compared commit.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetCommentsForComparedCommitResult withCommentsForComparedCommitData(CommentsForComparedCommit... commentsForComparedCommitData) {
        if (this.commentsForComparedCommitData == null) {
            setCommentsForComparedCommitData(new java.util.ArrayList<CommentsForComparedCommit>(commentsForComparedCommitData.length));
        }
        for (CommentsForComparedCommit ele : commentsForComparedCommitData) {
            this.commentsForComparedCommitData.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of comment objects on the compared commit.
     * </p>
     * 
     * @param commentsForComparedCommitData
     *        A list of comment objects on the compared commit.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetCommentsForComparedCommitResult withCommentsForComparedCommitData(java.util.Collection<CommentsForComparedCommit> commentsForComparedCommitData) {
        setCommentsForComparedCommitData(commentsForComparedCommitData);
        return this;
    }

    /**
     * <p>
     * An enumeration token that can be used in a request to return the next batch of the results.
     * </p>
     * 
     * @param nextToken
     *        An enumeration token that can be used in a request to return the next batch of the results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * An enumeration token that can be used in a request to return the next batch of the results.
     * </p>
     * 
     * @return An enumeration token that can be used in a request to return the next batch of the results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * An enumeration token that can be used in a request to return the next batch of the results.
     * </p>
     * 
     * @param nextToken
     *        An enumeration token that can be used in a request to return the next batch of the results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetCommentsForComparedCommitResult withNextToken(String nextToken) {
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
        if (getCommentsForComparedCommitData() != null)
            sb.append("CommentsForComparedCommitData: ").append(getCommentsForComparedCommitData()).append(",");
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

        if (obj instanceof GetCommentsForComparedCommitResult == false)
            return false;
        GetCommentsForComparedCommitResult other = (GetCommentsForComparedCommitResult) obj;
        if (other.getCommentsForComparedCommitData() == null ^ this.getCommentsForComparedCommitData() == null)
            return false;
        if (other.getCommentsForComparedCommitData() != null
                && other.getCommentsForComparedCommitData().equals(this.getCommentsForComparedCommitData()) == false)
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

        hashCode = prime * hashCode + ((getCommentsForComparedCommitData() == null) ? 0 : getCommentsForComparedCommitData().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public GetCommentsForComparedCommitResult clone() {
        try {
            return (GetCommentsForComparedCommitResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
