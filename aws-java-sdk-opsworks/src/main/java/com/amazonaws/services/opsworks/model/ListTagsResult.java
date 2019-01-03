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
package com.amazonaws.services.opsworks.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Contains the response to a <code>ListTags</code> request.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opsworks-2013-02-18/ListTags" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListTagsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A set of key-value pairs that contain tag keys and tag values that are attached to a stack or layer.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalMap<String, String> tags;
    /**
     * <p>
     * If a paginated request does not return all of the remaining results, this parameter is set to a token that you
     * can assign to the request object's <code>NextToken</code> parameter to get the next set of results. If the
     * previous paginated request returned all of the remaining results, this parameter is set to <code>null</code>.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A set of key-value pairs that contain tag keys and tag values that are attached to a stack or layer.
     * </p>
     * 
     * @return A set of key-value pairs that contain tag keys and tag values that are attached to a stack or layer.
     */

    public java.util.Map<String, String> getTags() {
        if (tags == null) {
            tags = new com.amazonaws.internal.SdkInternalMap<String, String>();
        }
        return tags;
    }

    /**
     * <p>
     * A set of key-value pairs that contain tag keys and tag values that are attached to a stack or layer.
     * </p>
     * 
     * @param tags
     *        A set of key-value pairs that contain tag keys and tag values that are attached to a stack or layer.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags == null ? null : new com.amazonaws.internal.SdkInternalMap<String, String>(tags);
    }

    /**
     * <p>
     * A set of key-value pairs that contain tag keys and tag values that are attached to a stack or layer.
     * </p>
     * 
     * @param tags
     *        A set of key-value pairs that contain tag keys and tag values that are attached to a stack or layer.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTagsResult withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    public ListTagsResult addTagsEntry(String key, String value) {
        if (null == this.tags) {
            this.tags = new com.amazonaws.internal.SdkInternalMap<String, String>();
        }
        if (this.tags.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.tags.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Tags.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTagsResult clearTagsEntries() {
        this.tags = null;
        return this;
    }

    /**
     * <p>
     * If a paginated request does not return all of the remaining results, this parameter is set to a token that you
     * can assign to the request object's <code>NextToken</code> parameter to get the next set of results. If the
     * previous paginated request returned all of the remaining results, this parameter is set to <code>null</code>.
     * </p>
     * 
     * @param nextToken
     *        If a paginated request does not return all of the remaining results, this parameter is set to a token that
     *        you can assign to the request object's <code>NextToken</code> parameter to get the next set of results. If
     *        the previous paginated request returned all of the remaining results, this parameter is set to
     *        <code>null</code>.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If a paginated request does not return all of the remaining results, this parameter is set to a token that you
     * can assign to the request object's <code>NextToken</code> parameter to get the next set of results. If the
     * previous paginated request returned all of the remaining results, this parameter is set to <code>null</code>.
     * </p>
     * 
     * @return If a paginated request does not return all of the remaining results, this parameter is set to a token
     *         that you can assign to the request object's <code>NextToken</code> parameter to get the next set of
     *         results. If the previous paginated request returned all of the remaining results, this parameter is set
     *         to <code>null</code>.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If a paginated request does not return all of the remaining results, this parameter is set to a token that you
     * can assign to the request object's <code>NextToken</code> parameter to get the next set of results. If the
     * previous paginated request returned all of the remaining results, this parameter is set to <code>null</code>.
     * </p>
     * 
     * @param nextToken
     *        If a paginated request does not return all of the remaining results, this parameter is set to a token that
     *        you can assign to the request object's <code>NextToken</code> parameter to get the next set of results. If
     *        the previous paginated request returned all of the remaining results, this parameter is set to
     *        <code>null</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTagsResult withNextToken(String nextToken) {
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
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
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

        if (obj instanceof ListTagsResult == false)
            return false;
        ListTagsResult other = (ListTagsResult) obj;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
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

        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListTagsResult clone() {
        try {
            return (ListTagsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
