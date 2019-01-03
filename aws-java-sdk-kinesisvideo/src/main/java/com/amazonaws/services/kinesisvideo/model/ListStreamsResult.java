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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesisvideo-2017-09-30/ListStreams" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListStreamsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * An array of <code>StreamInfo</code> objects.
     * </p>
     */
    private java.util.List<StreamInfo> streamInfoList;
    /**
     * <p>
     * If the response is truncated, the call returns this element with a token. To get the next batch of streams, use
     * this token in your next request.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * An array of <code>StreamInfo</code> objects.
     * </p>
     * 
     * @return An array of <code>StreamInfo</code> objects.
     */

    public java.util.List<StreamInfo> getStreamInfoList() {
        return streamInfoList;
    }

    /**
     * <p>
     * An array of <code>StreamInfo</code> objects.
     * </p>
     * 
     * @param streamInfoList
     *        An array of <code>StreamInfo</code> objects.
     */

    public void setStreamInfoList(java.util.Collection<StreamInfo> streamInfoList) {
        if (streamInfoList == null) {
            this.streamInfoList = null;
            return;
        }

        this.streamInfoList = new java.util.ArrayList<StreamInfo>(streamInfoList);
    }

    /**
     * <p>
     * An array of <code>StreamInfo</code> objects.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setStreamInfoList(java.util.Collection)} or {@link #withStreamInfoList(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param streamInfoList
     *        An array of <code>StreamInfo</code> objects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListStreamsResult withStreamInfoList(StreamInfo... streamInfoList) {
        if (this.streamInfoList == null) {
            setStreamInfoList(new java.util.ArrayList<StreamInfo>(streamInfoList.length));
        }
        for (StreamInfo ele : streamInfoList) {
            this.streamInfoList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of <code>StreamInfo</code> objects.
     * </p>
     * 
     * @param streamInfoList
     *        An array of <code>StreamInfo</code> objects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListStreamsResult withStreamInfoList(java.util.Collection<StreamInfo> streamInfoList) {
        setStreamInfoList(streamInfoList);
        return this;
    }

    /**
     * <p>
     * If the response is truncated, the call returns this element with a token. To get the next batch of streams, use
     * this token in your next request.
     * </p>
     * 
     * @param nextToken
     *        If the response is truncated, the call returns this element with a token. To get the next batch of
     *        streams, use this token in your next request.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If the response is truncated, the call returns this element with a token. To get the next batch of streams, use
     * this token in your next request.
     * </p>
     * 
     * @return If the response is truncated, the call returns this element with a token. To get the next batch of
     *         streams, use this token in your next request.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If the response is truncated, the call returns this element with a token. To get the next batch of streams, use
     * this token in your next request.
     * </p>
     * 
     * @param nextToken
     *        If the response is truncated, the call returns this element with a token. To get the next batch of
     *        streams, use this token in your next request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListStreamsResult withNextToken(String nextToken) {
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
        if (getStreamInfoList() != null)
            sb.append("StreamInfoList: ").append(getStreamInfoList()).append(",");
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

        if (obj instanceof ListStreamsResult == false)
            return false;
        ListStreamsResult other = (ListStreamsResult) obj;
        if (other.getStreamInfoList() == null ^ this.getStreamInfoList() == null)
            return false;
        if (other.getStreamInfoList() != null && other.getStreamInfoList().equals(this.getStreamInfoList()) == false)
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

        hashCode = prime * hashCode + ((getStreamInfoList() == null) ? 0 : getStreamInfoList().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
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
