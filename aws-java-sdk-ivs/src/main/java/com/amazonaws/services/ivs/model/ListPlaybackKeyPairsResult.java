/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivs-2020-07-14/ListPlaybackKeyPairs" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListPlaybackKeyPairsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * List of key pairs.
     * </p>
     */
    private java.util.List<PlaybackKeyPairSummary> keyPairs;
    /**
     * <p>
     * If there are more key pairs than <code>maxResults</code>, use <code>nextToken</code> in the request to get the
     * next set.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * List of key pairs.
     * </p>
     * 
     * @return List of key pairs.
     */

    public java.util.List<PlaybackKeyPairSummary> getKeyPairs() {
        return keyPairs;
    }

    /**
     * <p>
     * List of key pairs.
     * </p>
     * 
     * @param keyPairs
     *        List of key pairs.
     */

    public void setKeyPairs(java.util.Collection<PlaybackKeyPairSummary> keyPairs) {
        if (keyPairs == null) {
            this.keyPairs = null;
            return;
        }

        this.keyPairs = new java.util.ArrayList<PlaybackKeyPairSummary>(keyPairs);
    }

    /**
     * <p>
     * List of key pairs.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setKeyPairs(java.util.Collection)} or {@link #withKeyPairs(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param keyPairs
     *        List of key pairs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListPlaybackKeyPairsResult withKeyPairs(PlaybackKeyPairSummary... keyPairs) {
        if (this.keyPairs == null) {
            setKeyPairs(new java.util.ArrayList<PlaybackKeyPairSummary>(keyPairs.length));
        }
        for (PlaybackKeyPairSummary ele : keyPairs) {
            this.keyPairs.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * List of key pairs.
     * </p>
     * 
     * @param keyPairs
     *        List of key pairs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListPlaybackKeyPairsResult withKeyPairs(java.util.Collection<PlaybackKeyPairSummary> keyPairs) {
        setKeyPairs(keyPairs);
        return this;
    }

    /**
     * <p>
     * If there are more key pairs than <code>maxResults</code>, use <code>nextToken</code> in the request to get the
     * next set.
     * </p>
     * 
     * @param nextToken
     *        If there are more key pairs than <code>maxResults</code>, use <code>nextToken</code> in the request to get
     *        the next set.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If there are more key pairs than <code>maxResults</code>, use <code>nextToken</code> in the request to get the
     * next set.
     * </p>
     * 
     * @return If there are more key pairs than <code>maxResults</code>, use <code>nextToken</code> in the request to
     *         get the next set.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If there are more key pairs than <code>maxResults</code>, use <code>nextToken</code> in the request to get the
     * next set.
     * </p>
     * 
     * @param nextToken
     *        If there are more key pairs than <code>maxResults</code>, use <code>nextToken</code> in the request to get
     *        the next set.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListPlaybackKeyPairsResult withNextToken(String nextToken) {
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
        if (getKeyPairs() != null)
            sb.append("KeyPairs: ").append(getKeyPairs()).append(",");
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

        if (obj instanceof ListPlaybackKeyPairsResult == false)
            return false;
        ListPlaybackKeyPairsResult other = (ListPlaybackKeyPairsResult) obj;
        if (other.getKeyPairs() == null ^ this.getKeyPairs() == null)
            return false;
        if (other.getKeyPairs() != null && other.getKeyPairs().equals(this.getKeyPairs()) == false)
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

        hashCode = prime * hashCode + ((getKeyPairs() == null) ? 0 : getKeyPairs().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListPlaybackKeyPairsResult clone() {
        try {
            return (ListPlaybackKeyPairsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
