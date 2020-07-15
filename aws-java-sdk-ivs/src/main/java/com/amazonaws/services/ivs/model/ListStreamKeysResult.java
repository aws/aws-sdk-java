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
package com.amazonaws.services.ivs.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivs-2020-07-14/ListStreamKeys" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListStreamKeysResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * List of stream keys.
     * </p>
     */
    private java.util.List<StreamKeySummary> streamKeys;
    /**
     * <p>
     * If there are more stream keys than <code>maxResults</code>, use <code>nextToken</code> in the request to get the
     * next set.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * List of stream keys.
     * </p>
     * 
     * @return List of stream keys.
     */

    public java.util.List<StreamKeySummary> getStreamKeys() {
        return streamKeys;
    }

    /**
     * <p>
     * List of stream keys.
     * </p>
     * 
     * @param streamKeys
     *        List of stream keys.
     */

    public void setStreamKeys(java.util.Collection<StreamKeySummary> streamKeys) {
        if (streamKeys == null) {
            this.streamKeys = null;
            return;
        }

        this.streamKeys = new java.util.ArrayList<StreamKeySummary>(streamKeys);
    }

    /**
     * <p>
     * List of stream keys.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setStreamKeys(java.util.Collection)} or {@link #withStreamKeys(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param streamKeys
     *        List of stream keys.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListStreamKeysResult withStreamKeys(StreamKeySummary... streamKeys) {
        if (this.streamKeys == null) {
            setStreamKeys(new java.util.ArrayList<StreamKeySummary>(streamKeys.length));
        }
        for (StreamKeySummary ele : streamKeys) {
            this.streamKeys.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * List of stream keys.
     * </p>
     * 
     * @param streamKeys
     *        List of stream keys.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListStreamKeysResult withStreamKeys(java.util.Collection<StreamKeySummary> streamKeys) {
        setStreamKeys(streamKeys);
        return this;
    }

    /**
     * <p>
     * If there are more stream keys than <code>maxResults</code>, use <code>nextToken</code> in the request to get the
     * next set.
     * </p>
     * 
     * @param nextToken
     *        If there are more stream keys than <code>maxResults</code>, use <code>nextToken</code> in the request to
     *        get the next set.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If there are more stream keys than <code>maxResults</code>, use <code>nextToken</code> in the request to get the
     * next set.
     * </p>
     * 
     * @return If there are more stream keys than <code>maxResults</code>, use <code>nextToken</code> in the request to
     *         get the next set.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If there are more stream keys than <code>maxResults</code>, use <code>nextToken</code> in the request to get the
     * next set.
     * </p>
     * 
     * @param nextToken
     *        If there are more stream keys than <code>maxResults</code>, use <code>nextToken</code> in the request to
     *        get the next set.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListStreamKeysResult withNextToken(String nextToken) {
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
        if (getStreamKeys() != null)
            sb.append("StreamKeys: ").append(getStreamKeys()).append(",");
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

        if (obj instanceof ListStreamKeysResult == false)
            return false;
        ListStreamKeysResult other = (ListStreamKeysResult) obj;
        if (other.getStreamKeys() == null ^ this.getStreamKeys() == null)
            return false;
        if (other.getStreamKeys() != null && other.getStreamKeys().equals(this.getStreamKeys()) == false)
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

        hashCode = prime * hashCode + ((getStreamKeys() == null) ? 0 : getStreamKeys().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListStreamKeysResult clone() {
        try {
            return (ListStreamKeysResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
