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
package com.amazonaws.services.glue.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/ListSessions" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListSessionsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The token for the next set of results, or null if there are no more result.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The maximum number of results.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * Tags belonging to the session.
     * </p>
     */
    private java.util.Map<String, String> tags;
    /**
     * <p>
     * The origin of the request.
     * </p>
     */
    private String requestOrigin;

    /**
     * <p>
     * The token for the next set of results, or null if there are no more result.
     * </p>
     * 
     * @param nextToken
     *        The token for the next set of results, or null if there are no more result.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token for the next set of results, or null if there are no more result.
     * </p>
     * 
     * @return The token for the next set of results, or null if there are no more result.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token for the next set of results, or null if there are no more result.
     * </p>
     * 
     * @param nextToken
     *        The token for the next set of results, or null if there are no more result.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListSessionsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The maximum number of results.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of results.
     * </p>
     * 
     * @return The maximum number of results.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of results.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListSessionsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * Tags belonging to the session.
     * </p>
     * 
     * @return Tags belonging to the session.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * Tags belonging to the session.
     * </p>
     * 
     * @param tags
     *        Tags belonging to the session.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * Tags belonging to the session.
     * </p>
     * 
     * @param tags
     *        Tags belonging to the session.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListSessionsRequest withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see ListSessionsRequest#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public ListSessionsRequest addTagsEntry(String key, String value) {
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

    public ListSessionsRequest clearTagsEntries() {
        this.tags = null;
        return this;
    }

    /**
     * <p>
     * The origin of the request.
     * </p>
     * 
     * @param requestOrigin
     *        The origin of the request.
     */

    public void setRequestOrigin(String requestOrigin) {
        this.requestOrigin = requestOrigin;
    }

    /**
     * <p>
     * The origin of the request.
     * </p>
     * 
     * @return The origin of the request.
     */

    public String getRequestOrigin() {
        return this.requestOrigin;
    }

    /**
     * <p>
     * The origin of the request.
     * </p>
     * 
     * @param requestOrigin
     *        The origin of the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListSessionsRequest withRequestOrigin(String requestOrigin) {
        setRequestOrigin(requestOrigin);
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
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
        if (getRequestOrigin() != null)
            sb.append("RequestOrigin: ").append(getRequestOrigin());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListSessionsRequest == false)
            return false;
        ListSessionsRequest other = (ListSessionsRequest) obj;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getRequestOrigin() == null ^ this.getRequestOrigin() == null)
            return false;
        if (other.getRequestOrigin() != null && other.getRequestOrigin().equals(this.getRequestOrigin()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getRequestOrigin() == null) ? 0 : getRequestOrigin().hashCode());
        return hashCode;
    }

    @Override
    public ListSessionsRequest clone() {
        return (ListSessionsRequest) super.clone();
    }

}
