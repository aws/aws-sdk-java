/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.kinesis.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Represents the output for <code>ListStreams</code>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesis-2013-12-02/ListStreams" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListStreamsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The names of the streams that are associated with the Amazon Web Services account making the
     * <code>ListStreams</code> request.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> streamNames;
    /**
     * <p>
     * If set to <code>true</code>, there are more streams available to list.
     * </p>
     */
    private Boolean hasMoreStreams;
    /** <p/> */
    private String nextToken;
    /** <p/> */
    private com.amazonaws.internal.SdkInternalList<StreamSummary> streamSummaries;

    /**
     * <p>
     * The names of the streams that are associated with the Amazon Web Services account making the
     * <code>ListStreams</code> request.
     * </p>
     * 
     * @return The names of the streams that are associated with the Amazon Web Services account making the
     *         <code>ListStreams</code> request.
     */

    public java.util.List<String> getStreamNames() {
        if (streamNames == null) {
            streamNames = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return streamNames;
    }

    /**
     * <p>
     * The names of the streams that are associated with the Amazon Web Services account making the
     * <code>ListStreams</code> request.
     * </p>
     * 
     * @param streamNames
     *        The names of the streams that are associated with the Amazon Web Services account making the
     *        <code>ListStreams</code> request.
     */

    public void setStreamNames(java.util.Collection<String> streamNames) {
        if (streamNames == null) {
            this.streamNames = null;
            return;
        }

        this.streamNames = new com.amazonaws.internal.SdkInternalList<String>(streamNames);
    }

    /**
     * <p>
     * The names of the streams that are associated with the Amazon Web Services account making the
     * <code>ListStreams</code> request.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setStreamNames(java.util.Collection)} or {@link #withStreamNames(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param streamNames
     *        The names of the streams that are associated with the Amazon Web Services account making the
     *        <code>ListStreams</code> request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListStreamsResult withStreamNames(String... streamNames) {
        if (this.streamNames == null) {
            setStreamNames(new com.amazonaws.internal.SdkInternalList<String>(streamNames.length));
        }
        for (String ele : streamNames) {
            this.streamNames.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The names of the streams that are associated with the Amazon Web Services account making the
     * <code>ListStreams</code> request.
     * </p>
     * 
     * @param streamNames
     *        The names of the streams that are associated with the Amazon Web Services account making the
     *        <code>ListStreams</code> request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListStreamsResult withStreamNames(java.util.Collection<String> streamNames) {
        setStreamNames(streamNames);
        return this;
    }

    /**
     * <p>
     * If set to <code>true</code>, there are more streams available to list.
     * </p>
     * 
     * @param hasMoreStreams
     *        If set to <code>true</code>, there are more streams available to list.
     */

    public void setHasMoreStreams(Boolean hasMoreStreams) {
        this.hasMoreStreams = hasMoreStreams;
    }

    /**
     * <p>
     * If set to <code>true</code>, there are more streams available to list.
     * </p>
     * 
     * @return If set to <code>true</code>, there are more streams available to list.
     */

    public Boolean getHasMoreStreams() {
        return this.hasMoreStreams;
    }

    /**
     * <p>
     * If set to <code>true</code>, there are more streams available to list.
     * </p>
     * 
     * @param hasMoreStreams
     *        If set to <code>true</code>, there are more streams available to list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListStreamsResult withHasMoreStreams(Boolean hasMoreStreams) {
        setHasMoreStreams(hasMoreStreams);
        return this;
    }

    /**
     * <p>
     * If set to <code>true</code>, there are more streams available to list.
     * </p>
     * 
     * @return If set to <code>true</code>, there are more streams available to list.
     */

    public Boolean isHasMoreStreams() {
        return this.hasMoreStreams;
    }

    /**
     * <p/>
     * 
     * @param nextToken
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p/>
     * 
     * @return
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p/>
     * 
     * @param nextToken
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListStreamsResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p/>
     * 
     * @return
     */

    public java.util.List<StreamSummary> getStreamSummaries() {
        if (streamSummaries == null) {
            streamSummaries = new com.amazonaws.internal.SdkInternalList<StreamSummary>();
        }
        return streamSummaries;
    }

    /**
     * <p/>
     * 
     * @param streamSummaries
     */

    public void setStreamSummaries(java.util.Collection<StreamSummary> streamSummaries) {
        if (streamSummaries == null) {
            this.streamSummaries = null;
            return;
        }

        this.streamSummaries = new com.amazonaws.internal.SdkInternalList<StreamSummary>(streamSummaries);
    }

    /**
     * <p/>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setStreamSummaries(java.util.Collection)} or {@link #withStreamSummaries(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param streamSummaries
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListStreamsResult withStreamSummaries(StreamSummary... streamSummaries) {
        if (this.streamSummaries == null) {
            setStreamSummaries(new com.amazonaws.internal.SdkInternalList<StreamSummary>(streamSummaries.length));
        }
        for (StreamSummary ele : streamSummaries) {
            this.streamSummaries.add(ele);
        }
        return this;
    }

    /**
     * <p/>
     * 
     * @param streamSummaries
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListStreamsResult withStreamSummaries(java.util.Collection<StreamSummary> streamSummaries) {
        setStreamSummaries(streamSummaries);
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
        if (getStreamNames() != null)
            sb.append("StreamNames: ").append(getStreamNames()).append(",");
        if (getHasMoreStreams() != null)
            sb.append("HasMoreStreams: ").append(getHasMoreStreams()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getStreamSummaries() != null)
            sb.append("StreamSummaries: ").append(getStreamSummaries());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListStreamsResult == false)
            return false;
        ListStreamsResult other = (ListStreamsResult) obj;
        if (other.getStreamNames() == null ^ this.getStreamNames() == null)
            return false;
        if (other.getStreamNames() != null && other.getStreamNames().equals(this.getStreamNames()) == false)
            return false;
        if (other.getHasMoreStreams() == null ^ this.getHasMoreStreams() == null)
            return false;
        if (other.getHasMoreStreams() != null && other.getHasMoreStreams().equals(this.getHasMoreStreams()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getStreamSummaries() == null ^ this.getStreamSummaries() == null)
            return false;
        if (other.getStreamSummaries() != null && other.getStreamSummaries().equals(this.getStreamSummaries()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStreamNames() == null) ? 0 : getStreamNames().hashCode());
        hashCode = prime * hashCode + ((getHasMoreStreams() == null) ? 0 : getHasMoreStreams().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getStreamSummaries() == null) ? 0 : getStreamSummaries().hashCode());
        return hashCode;
    }

    @Override
    public ListStreamsResult clone() {
        try {
            return (ListStreamsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
