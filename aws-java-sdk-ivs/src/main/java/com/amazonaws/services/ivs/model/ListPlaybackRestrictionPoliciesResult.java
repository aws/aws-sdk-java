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
package com.amazonaws.services.ivs.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivs-2020-07-14/ListPlaybackRestrictionPolicies"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListPlaybackRestrictionPoliciesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * If there are more channels than <code>maxResults</code>, use <code>nextToken</code> in the request to get the
     * next set.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * List of the matching policies.
     * </p>
     */
    private java.util.List<PlaybackRestrictionPolicySummary> playbackRestrictionPolicies;

    /**
     * <p>
     * If there are more channels than <code>maxResults</code>, use <code>nextToken</code> in the request to get the
     * next set.
     * </p>
     * 
     * @param nextToken
     *        If there are more channels than <code>maxResults</code>, use <code>nextToken</code> in the request to get
     *        the next set.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If there are more channels than <code>maxResults</code>, use <code>nextToken</code> in the request to get the
     * next set.
     * </p>
     * 
     * @return If there are more channels than <code>maxResults</code>, use <code>nextToken</code> in the request to get
     *         the next set.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If there are more channels than <code>maxResults</code>, use <code>nextToken</code> in the request to get the
     * next set.
     * </p>
     * 
     * @param nextToken
     *        If there are more channels than <code>maxResults</code>, use <code>nextToken</code> in the request to get
     *        the next set.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListPlaybackRestrictionPoliciesResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * List of the matching policies.
     * </p>
     * 
     * @return List of the matching policies.
     */

    public java.util.List<PlaybackRestrictionPolicySummary> getPlaybackRestrictionPolicies() {
        return playbackRestrictionPolicies;
    }

    /**
     * <p>
     * List of the matching policies.
     * </p>
     * 
     * @param playbackRestrictionPolicies
     *        List of the matching policies.
     */

    public void setPlaybackRestrictionPolicies(java.util.Collection<PlaybackRestrictionPolicySummary> playbackRestrictionPolicies) {
        if (playbackRestrictionPolicies == null) {
            this.playbackRestrictionPolicies = null;
            return;
        }

        this.playbackRestrictionPolicies = new java.util.ArrayList<PlaybackRestrictionPolicySummary>(playbackRestrictionPolicies);
    }

    /**
     * <p>
     * List of the matching policies.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPlaybackRestrictionPolicies(java.util.Collection)} or
     * {@link #withPlaybackRestrictionPolicies(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param playbackRestrictionPolicies
     *        List of the matching policies.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListPlaybackRestrictionPoliciesResult withPlaybackRestrictionPolicies(PlaybackRestrictionPolicySummary... playbackRestrictionPolicies) {
        if (this.playbackRestrictionPolicies == null) {
            setPlaybackRestrictionPolicies(new java.util.ArrayList<PlaybackRestrictionPolicySummary>(playbackRestrictionPolicies.length));
        }
        for (PlaybackRestrictionPolicySummary ele : playbackRestrictionPolicies) {
            this.playbackRestrictionPolicies.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * List of the matching policies.
     * </p>
     * 
     * @param playbackRestrictionPolicies
     *        List of the matching policies.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListPlaybackRestrictionPoliciesResult withPlaybackRestrictionPolicies(
            java.util.Collection<PlaybackRestrictionPolicySummary> playbackRestrictionPolicies) {
        setPlaybackRestrictionPolicies(playbackRestrictionPolicies);
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
        if (getPlaybackRestrictionPolicies() != null)
            sb.append("PlaybackRestrictionPolicies: ").append(getPlaybackRestrictionPolicies());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListPlaybackRestrictionPoliciesResult == false)
            return false;
        ListPlaybackRestrictionPoliciesResult other = (ListPlaybackRestrictionPoliciesResult) obj;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getPlaybackRestrictionPolicies() == null ^ this.getPlaybackRestrictionPolicies() == null)
            return false;
        if (other.getPlaybackRestrictionPolicies() != null && other.getPlaybackRestrictionPolicies().equals(this.getPlaybackRestrictionPolicies()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getPlaybackRestrictionPolicies() == null) ? 0 : getPlaybackRestrictionPolicies().hashCode());
        return hashCode;
    }

    @Override
    public ListPlaybackRestrictionPoliciesResult clone() {
        try {
            return (ListPlaybackRestrictionPoliciesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
