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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesisvideo-2017-09-30/ListTagsForStream" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListTagsForStreamRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * If you specify this parameter and the result of a <code>ListTagsForStream</code> call is truncated, the response
     * includes a token that you can use in the next request to fetch the next batch of tags.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the stream that you want to list tags for.
     * </p>
     */
    private String streamARN;
    /**
     * <p>
     * The name of the stream that you want to list tags for.
     * </p>
     */
    private String streamName;

    /**
     * <p>
     * If you specify this parameter and the result of a <code>ListTagsForStream</code> call is truncated, the response
     * includes a token that you can use in the next request to fetch the next batch of tags.
     * </p>
     * 
     * @param nextToken
     *        If you specify this parameter and the result of a <code>ListTagsForStream</code> call is truncated, the
     *        response includes a token that you can use in the next request to fetch the next batch of tags.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If you specify this parameter and the result of a <code>ListTagsForStream</code> call is truncated, the response
     * includes a token that you can use in the next request to fetch the next batch of tags.
     * </p>
     * 
     * @return If you specify this parameter and the result of a <code>ListTagsForStream</code> call is truncated, the
     *         response includes a token that you can use in the next request to fetch the next batch of tags.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If you specify this parameter and the result of a <code>ListTagsForStream</code> call is truncated, the response
     * includes a token that you can use in the next request to fetch the next batch of tags.
     * </p>
     * 
     * @param nextToken
     *        If you specify this parameter and the result of a <code>ListTagsForStream</code> call is truncated, the
     *        response includes a token that you can use in the next request to fetch the next batch of tags.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTagsForStreamRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the stream that you want to list tags for.
     * </p>
     * 
     * @param streamARN
     *        The Amazon Resource Name (ARN) of the stream that you want to list tags for.
     */

    public void setStreamARN(String streamARN) {
        this.streamARN = streamARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the stream that you want to list tags for.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the stream that you want to list tags for.
     */

    public String getStreamARN() {
        return this.streamARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the stream that you want to list tags for.
     * </p>
     * 
     * @param streamARN
     *        The Amazon Resource Name (ARN) of the stream that you want to list tags for.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTagsForStreamRequest withStreamARN(String streamARN) {
        setStreamARN(streamARN);
        return this;
    }

    /**
     * <p>
     * The name of the stream that you want to list tags for.
     * </p>
     * 
     * @param streamName
     *        The name of the stream that you want to list tags for.
     */

    public void setStreamName(String streamName) {
        this.streamName = streamName;
    }

    /**
     * <p>
     * The name of the stream that you want to list tags for.
     * </p>
     * 
     * @return The name of the stream that you want to list tags for.
     */

    public String getStreamName() {
        return this.streamName;
    }

    /**
     * <p>
     * The name of the stream that you want to list tags for.
     * </p>
     * 
     * @param streamName
     *        The name of the stream that you want to list tags for.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTagsForStreamRequest withStreamName(String streamName) {
        setStreamName(streamName);
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
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getStreamARN() != null)
            sb.append("StreamARN: ").append(getStreamARN()).append(",");
        if (getStreamName() != null)
            sb.append("StreamName: ").append(getStreamName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListTagsForStreamRequest == false)
            return false;
        ListTagsForStreamRequest other = (ListTagsForStreamRequest) obj;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getStreamARN() == null ^ this.getStreamARN() == null)
            return false;
        if (other.getStreamARN() != null && other.getStreamARN().equals(this.getStreamARN()) == false)
            return false;
        if (other.getStreamName() == null ^ this.getStreamName() == null)
            return false;
        if (other.getStreamName() != null && other.getStreamName().equals(this.getStreamName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getStreamARN() == null) ? 0 : getStreamARN().hashCode());
        hashCode = prime * hashCode + ((getStreamName() == null) ? 0 : getStreamName().hashCode());
        return hashCode;
    }

    @Override
    public ListTagsForStreamRequest clone() {
        return (ListTagsForStreamRequest) super.clone();
    }

}
