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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivs-2020-07-14/ListChannels" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListChannelsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Filters the channel list to match the specified name.
     * </p>
     */
    private String filterByName;
    /**
     * <p>
     * The first channel to retrieve. This is used for pagination; see the <code>nextToken</code> response field.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * Maximum number of channels to return.
     * </p>
     */
    private Integer maxResults;

    /**
     * <p>
     * Filters the channel list to match the specified name.
     * </p>
     * 
     * @param filterByName
     *        Filters the channel list to match the specified name.
     */

    public void setFilterByName(String filterByName) {
        this.filterByName = filterByName;
    }

    /**
     * <p>
     * Filters the channel list to match the specified name.
     * </p>
     * 
     * @return Filters the channel list to match the specified name.
     */

    public String getFilterByName() {
        return this.filterByName;
    }

    /**
     * <p>
     * Filters the channel list to match the specified name.
     * </p>
     * 
     * @param filterByName
     *        Filters the channel list to match the specified name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListChannelsRequest withFilterByName(String filterByName) {
        setFilterByName(filterByName);
        return this;
    }

    /**
     * <p>
     * The first channel to retrieve. This is used for pagination; see the <code>nextToken</code> response field.
     * </p>
     * 
     * @param nextToken
     *        The first channel to retrieve. This is used for pagination; see the <code>nextToken</code> response field.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The first channel to retrieve. This is used for pagination; see the <code>nextToken</code> response field.
     * </p>
     * 
     * @return The first channel to retrieve. This is used for pagination; see the <code>nextToken</code> response
     *         field.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The first channel to retrieve. This is used for pagination; see the <code>nextToken</code> response field.
     * </p>
     * 
     * @param nextToken
     *        The first channel to retrieve. This is used for pagination; see the <code>nextToken</code> response field.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListChannelsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * Maximum number of channels to return.
     * </p>
     * 
     * @param maxResults
     *        Maximum number of channels to return.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * Maximum number of channels to return.
     * </p>
     * 
     * @return Maximum number of channels to return.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * Maximum number of channels to return.
     * </p>
     * 
     * @param maxResults
     *        Maximum number of channels to return.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListChannelsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
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
        if (getFilterByName() != null)
            sb.append("FilterByName: ").append(getFilterByName()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListChannelsRequest == false)
            return false;
        ListChannelsRequest other = (ListChannelsRequest) obj;
        if (other.getFilterByName() == null ^ this.getFilterByName() == null)
            return false;
        if (other.getFilterByName() != null && other.getFilterByName().equals(this.getFilterByName()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFilterByName() == null) ? 0 : getFilterByName().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        return hashCode;
    }

    @Override
    public ListChannelsRequest clone() {
        return (ListChannelsRequest) super.clone();
    }

}
