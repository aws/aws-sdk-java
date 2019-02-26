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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesisvideo-2017-09-30/ListTagsForStream" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListTagsForStreamResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * If you specify this parameter and the result of a <code>ListTags</code> call is truncated, the response includes
     * a token that you can use in the next request to fetch the next set of tags.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * A map of tag keys and values associated with the specified stream.
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * If you specify this parameter and the result of a <code>ListTags</code> call is truncated, the response includes
     * a token that you can use in the next request to fetch the next set of tags.
     * </p>
     * 
     * @param nextToken
     *        If you specify this parameter and the result of a <code>ListTags</code> call is truncated, the response
     *        includes a token that you can use in the next request to fetch the next set of tags.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If you specify this parameter and the result of a <code>ListTags</code> call is truncated, the response includes
     * a token that you can use in the next request to fetch the next set of tags.
     * </p>
     * 
     * @return If you specify this parameter and the result of a <code>ListTags</code> call is truncated, the response
     *         includes a token that you can use in the next request to fetch the next set of tags.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If you specify this parameter and the result of a <code>ListTags</code> call is truncated, the response includes
     * a token that you can use in the next request to fetch the next set of tags.
     * </p>
     * 
     * @param nextToken
     *        If you specify this parameter and the result of a <code>ListTags</code> call is truncated, the response
     *        includes a token that you can use in the next request to fetch the next set of tags.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTagsForStreamResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * A map of tag keys and values associated with the specified stream.
     * </p>
     * 
     * @return A map of tag keys and values associated with the specified stream.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * A map of tag keys and values associated with the specified stream.
     * </p>
     * 
     * @param tags
     *        A map of tag keys and values associated with the specified stream.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * A map of tag keys and values associated with the specified stream.
     * </p>
     * 
     * @param tags
     *        A map of tag keys and values associated with the specified stream.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTagsForStreamResult withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    public ListTagsForStreamResult addTagsEntry(String key, String value) {
        if (null == this.tags) {
            this.tags = new java.util.HashMap<String, String>();
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

    public ListTagsForStreamResult clearTagsEntries() {
        this.tags = null;
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
        if (getTags() != null)
            sb.append("Tags: ").append(getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListTagsForStreamResult == false)
            return false;
        ListTagsForStreamResult other = (ListTagsForStreamResult) obj;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public ListTagsForStreamResult clone() {
        try {
            return (ListTagsForStreamResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
