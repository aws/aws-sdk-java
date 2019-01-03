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
package com.amazonaws.services.migrationhub.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/AWSMigrationHub-2017-05-31/ListProgressUpdateStreams"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListProgressUpdateStreamsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * List of progress update streams up to the max number of results passed in the input.
     * </p>
     */
    private java.util.List<ProgressUpdateStreamSummary> progressUpdateStreamSummaryList;
    /**
     * <p>
     * If there are more streams created than the max result, return the next token to be passed to the next call as a
     * bookmark of where to start from.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * List of progress update streams up to the max number of results passed in the input.
     * </p>
     * 
     * @return List of progress update streams up to the max number of results passed in the input.
     */

    public java.util.List<ProgressUpdateStreamSummary> getProgressUpdateStreamSummaryList() {
        return progressUpdateStreamSummaryList;
    }

    /**
     * <p>
     * List of progress update streams up to the max number of results passed in the input.
     * </p>
     * 
     * @param progressUpdateStreamSummaryList
     *        List of progress update streams up to the max number of results passed in the input.
     */

    public void setProgressUpdateStreamSummaryList(java.util.Collection<ProgressUpdateStreamSummary> progressUpdateStreamSummaryList) {
        if (progressUpdateStreamSummaryList == null) {
            this.progressUpdateStreamSummaryList = null;
            return;
        }

        this.progressUpdateStreamSummaryList = new java.util.ArrayList<ProgressUpdateStreamSummary>(progressUpdateStreamSummaryList);
    }

    /**
     * <p>
     * List of progress update streams up to the max number of results passed in the input.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setProgressUpdateStreamSummaryList(java.util.Collection)} or
     * {@link #withProgressUpdateStreamSummaryList(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param progressUpdateStreamSummaryList
     *        List of progress update streams up to the max number of results passed in the input.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListProgressUpdateStreamsResult withProgressUpdateStreamSummaryList(ProgressUpdateStreamSummary... progressUpdateStreamSummaryList) {
        if (this.progressUpdateStreamSummaryList == null) {
            setProgressUpdateStreamSummaryList(new java.util.ArrayList<ProgressUpdateStreamSummary>(progressUpdateStreamSummaryList.length));
        }
        for (ProgressUpdateStreamSummary ele : progressUpdateStreamSummaryList) {
            this.progressUpdateStreamSummaryList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * List of progress update streams up to the max number of results passed in the input.
     * </p>
     * 
     * @param progressUpdateStreamSummaryList
     *        List of progress update streams up to the max number of results passed in the input.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListProgressUpdateStreamsResult withProgressUpdateStreamSummaryList(java.util.Collection<ProgressUpdateStreamSummary> progressUpdateStreamSummaryList) {
        setProgressUpdateStreamSummaryList(progressUpdateStreamSummaryList);
        return this;
    }

    /**
     * <p>
     * If there are more streams created than the max result, return the next token to be passed to the next call as a
     * bookmark of where to start from.
     * </p>
     * 
     * @param nextToken
     *        If there are more streams created than the max result, return the next token to be passed to the next call
     *        as a bookmark of where to start from.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If there are more streams created than the max result, return the next token to be passed to the next call as a
     * bookmark of where to start from.
     * </p>
     * 
     * @return If there are more streams created than the max result, return the next token to be passed to the next
     *         call as a bookmark of where to start from.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If there are more streams created than the max result, return the next token to be passed to the next call as a
     * bookmark of where to start from.
     * </p>
     * 
     * @param nextToken
     *        If there are more streams created than the max result, return the next token to be passed to the next call
     *        as a bookmark of where to start from.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListProgressUpdateStreamsResult withNextToken(String nextToken) {
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
        if (getProgressUpdateStreamSummaryList() != null)
            sb.append("ProgressUpdateStreamSummaryList: ").append(getProgressUpdateStreamSummaryList()).append(",");
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

        if (obj instanceof ListProgressUpdateStreamsResult == false)
            return false;
        ListProgressUpdateStreamsResult other = (ListProgressUpdateStreamsResult) obj;
        if (other.getProgressUpdateStreamSummaryList() == null ^ this.getProgressUpdateStreamSummaryList() == null)
            return false;
        if (other.getProgressUpdateStreamSummaryList() != null
                && other.getProgressUpdateStreamSummaryList().equals(this.getProgressUpdateStreamSummaryList()) == false)
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

        hashCode = prime * hashCode + ((getProgressUpdateStreamSummaryList() == null) ? 0 : getProgressUpdateStreamSummaryList().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListProgressUpdateStreamsResult clone() {
        try {
            return (ListProgressUpdateStreamsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
