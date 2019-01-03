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
package com.amazonaws.services.kinesisvideo.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesisvideo-2017-09-30/ListStreams" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListStreamsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The maximum number of streams to return in the response. The default is 10,000.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * If you specify this parameter, when the result of a <code>ListStreams</code> operation is truncated, the call
     * returns the <code>NextToken</code> in the response. To get another batch of streams, provide this token in your
     * next request.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * Optional: Returns only streams that satisfy a specific condition. Currently, you can specify only the prefix of a
     * stream name as a condition.
     * </p>
     */
    private StreamNameCondition streamNameCondition;

    /**
     * <p>
     * The maximum number of streams to return in the response. The default is 10,000.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of streams to return in the response. The default is 10,000.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of streams to return in the response. The default is 10,000.
     * </p>
     * 
     * @return The maximum number of streams to return in the response. The default is 10,000.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of streams to return in the response. The default is 10,000.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of streams to return in the response. The default is 10,000.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListStreamsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * If you specify this parameter, when the result of a <code>ListStreams</code> operation is truncated, the call
     * returns the <code>NextToken</code> in the response. To get another batch of streams, provide this token in your
     * next request.
     * </p>
     * 
     * @param nextToken
     *        If you specify this parameter, when the result of a <code>ListStreams</code> operation is truncated, the
     *        call returns the <code>NextToken</code> in the response. To get another batch of streams, provide this
     *        token in your next request.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If you specify this parameter, when the result of a <code>ListStreams</code> operation is truncated, the call
     * returns the <code>NextToken</code> in the response. To get another batch of streams, provide this token in your
     * next request.
     * </p>
     * 
     * @return If you specify this parameter, when the result of a <code>ListStreams</code> operation is truncated, the
     *         call returns the <code>NextToken</code> in the response. To get another batch of streams, provide this
     *         token in your next request.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If you specify this parameter, when the result of a <code>ListStreams</code> operation is truncated, the call
     * returns the <code>NextToken</code> in the response. To get another batch of streams, provide this token in your
     * next request.
     * </p>
     * 
     * @param nextToken
     *        If you specify this parameter, when the result of a <code>ListStreams</code> operation is truncated, the
     *        call returns the <code>NextToken</code> in the response. To get another batch of streams, provide this
     *        token in your next request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListStreamsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * Optional: Returns only streams that satisfy a specific condition. Currently, you can specify only the prefix of a
     * stream name as a condition.
     * </p>
     * 
     * @param streamNameCondition
     *        Optional: Returns only streams that satisfy a specific condition. Currently, you can specify only the
     *        prefix of a stream name as a condition.
     */

    public void setStreamNameCondition(StreamNameCondition streamNameCondition) {
        this.streamNameCondition = streamNameCondition;
    }

    /**
     * <p>
     * Optional: Returns only streams that satisfy a specific condition. Currently, you can specify only the prefix of a
     * stream name as a condition.
     * </p>
     * 
     * @return Optional: Returns only streams that satisfy a specific condition. Currently, you can specify only the
     *         prefix of a stream name as a condition.
     */

    public StreamNameCondition getStreamNameCondition() {
        return this.streamNameCondition;
    }

    /**
     * <p>
     * Optional: Returns only streams that satisfy a specific condition. Currently, you can specify only the prefix of a
     * stream name as a condition.
     * </p>
     * 
     * @param streamNameCondition
     *        Optional: Returns only streams that satisfy a specific condition. Currently, you can specify only the
     *        prefix of a stream name as a condition.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListStreamsRequest withStreamNameCondition(StreamNameCondition streamNameCondition) {
        setStreamNameCondition(streamNameCondition);
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
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getStreamNameCondition() != null)
            sb.append("StreamNameCondition: ").append(getStreamNameCondition());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListStreamsRequest == false)
            return false;
        ListStreamsRequest other = (ListStreamsRequest) obj;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getStreamNameCondition() == null ^ this.getStreamNameCondition() == null)
            return false;
        if (other.getStreamNameCondition() != null && other.getStreamNameCondition().equals(this.getStreamNameCondition()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getStreamNameCondition() == null) ? 0 : getStreamNameCondition().hashCode());
        return hashCode;
    }

    @Override
    public ListStreamsRequest clone() {
        return (ListStreamsRequest) super.clone();
    }

}
