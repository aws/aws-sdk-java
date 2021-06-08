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
package com.amazonaws.services.schemas.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/schemas-2019-12-02/ListDiscoverers" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListDiscoverersRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Specifying this limits the results to only those discoverer IDs that start with the specified prefix.
     * </p>
     */
    private String discovererIdPrefix;

    private Integer limit;
    /**
     * <p>
     * The token that specifies the next page of results to return. To request the first page, leave NextToken empty.
     * The token will expire in 24 hours, and cannot be shared with other accounts.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * Specifying this limits the results to only those ARNs that start with the specified prefix.
     * </p>
     */
    private String sourceArnPrefix;

    /**
     * <p>
     * Specifying this limits the results to only those discoverer IDs that start with the specified prefix.
     * </p>
     * 
     * @param discovererIdPrefix
     *        Specifying this limits the results to only those discoverer IDs that start with the specified prefix.
     */

    public void setDiscovererIdPrefix(String discovererIdPrefix) {
        this.discovererIdPrefix = discovererIdPrefix;
    }

    /**
     * <p>
     * Specifying this limits the results to only those discoverer IDs that start with the specified prefix.
     * </p>
     * 
     * @return Specifying this limits the results to only those discoverer IDs that start with the specified prefix.
     */

    public String getDiscovererIdPrefix() {
        return this.discovererIdPrefix;
    }

    /**
     * <p>
     * Specifying this limits the results to only those discoverer IDs that start with the specified prefix.
     * </p>
     * 
     * @param discovererIdPrefix
     *        Specifying this limits the results to only those discoverer IDs that start with the specified prefix.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDiscoverersRequest withDiscovererIdPrefix(String discovererIdPrefix) {
        setDiscovererIdPrefix(discovererIdPrefix);
        return this;
    }

    /**
     * @param limit
     */

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    /**
     * @return
     */

    public Integer getLimit() {
        return this.limit;
    }

    /**
     * @param limit
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDiscoverersRequest withLimit(Integer limit) {
        setLimit(limit);
        return this;
    }

    /**
     * <p>
     * The token that specifies the next page of results to return. To request the first page, leave NextToken empty.
     * The token will expire in 24 hours, and cannot be shared with other accounts.
     * </p>
     * 
     * @param nextToken
     *        The token that specifies the next page of results to return. To request the first page, leave NextToken
     *        empty. The token will expire in 24 hours, and cannot be shared with other accounts.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token that specifies the next page of results to return. To request the first page, leave NextToken empty.
     * The token will expire in 24 hours, and cannot be shared with other accounts.
     * </p>
     * 
     * @return The token that specifies the next page of results to return. To request the first page, leave NextToken
     *         empty. The token will expire in 24 hours, and cannot be shared with other accounts.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token that specifies the next page of results to return. To request the first page, leave NextToken empty.
     * The token will expire in 24 hours, and cannot be shared with other accounts.
     * </p>
     * 
     * @param nextToken
     *        The token that specifies the next page of results to return. To request the first page, leave NextToken
     *        empty. The token will expire in 24 hours, and cannot be shared with other accounts.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDiscoverersRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * Specifying this limits the results to only those ARNs that start with the specified prefix.
     * </p>
     * 
     * @param sourceArnPrefix
     *        Specifying this limits the results to only those ARNs that start with the specified prefix.
     */

    public void setSourceArnPrefix(String sourceArnPrefix) {
        this.sourceArnPrefix = sourceArnPrefix;
    }

    /**
     * <p>
     * Specifying this limits the results to only those ARNs that start with the specified prefix.
     * </p>
     * 
     * @return Specifying this limits the results to only those ARNs that start with the specified prefix.
     */

    public String getSourceArnPrefix() {
        return this.sourceArnPrefix;
    }

    /**
     * <p>
     * Specifying this limits the results to only those ARNs that start with the specified prefix.
     * </p>
     * 
     * @param sourceArnPrefix
     *        Specifying this limits the results to only those ARNs that start with the specified prefix.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDiscoverersRequest withSourceArnPrefix(String sourceArnPrefix) {
        setSourceArnPrefix(sourceArnPrefix);
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
        if (getDiscovererIdPrefix() != null)
            sb.append("DiscovererIdPrefix: ").append(getDiscovererIdPrefix()).append(",");
        if (getLimit() != null)
            sb.append("Limit: ").append(getLimit()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getSourceArnPrefix() != null)
            sb.append("SourceArnPrefix: ").append(getSourceArnPrefix());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListDiscoverersRequest == false)
            return false;
        ListDiscoverersRequest other = (ListDiscoverersRequest) obj;
        if (other.getDiscovererIdPrefix() == null ^ this.getDiscovererIdPrefix() == null)
            return false;
        if (other.getDiscovererIdPrefix() != null && other.getDiscovererIdPrefix().equals(this.getDiscovererIdPrefix()) == false)
            return false;
        if (other.getLimit() == null ^ this.getLimit() == null)
            return false;
        if (other.getLimit() != null && other.getLimit().equals(this.getLimit()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getSourceArnPrefix() == null ^ this.getSourceArnPrefix() == null)
            return false;
        if (other.getSourceArnPrefix() != null && other.getSourceArnPrefix().equals(this.getSourceArnPrefix()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDiscovererIdPrefix() == null) ? 0 : getDiscovererIdPrefix().hashCode());
        hashCode = prime * hashCode + ((getLimit() == null) ? 0 : getLimit().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getSourceArnPrefix() == null) ? 0 : getSourceArnPrefix().hashCode());
        return hashCode;
    }

    @Override
    public ListDiscoverersRequest clone() {
        return (ListDiscoverersRequest) super.clone();
    }

}
