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
package com.amazonaws.services.eventbridge.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eventbridge-2015-10-07/ListEventSources" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListEventSourcesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Specifying this limits the results to only those partner event sources with names that start with the specified
     * prefix.
     * </p>
     */
    private String namePrefix;
    /**
     * <p>
     * The token returned by a previous call to retrieve the next set of results.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * Specifying this limits the number of results returned by this operation. The operation also returns a
     * <code>NextToken</code> that you can use in a subsequent operation to retrieve the next set of results.
     * </p>
     */
    private Integer limit;

    /**
     * <p>
     * Specifying this limits the results to only those partner event sources with names that start with the specified
     * prefix.
     * </p>
     * 
     * @param namePrefix
     *        Specifying this limits the results to only those partner event sources with names that start with the
     *        specified prefix.
     */

    public void setNamePrefix(String namePrefix) {
        this.namePrefix = namePrefix;
    }

    /**
     * <p>
     * Specifying this limits the results to only those partner event sources with names that start with the specified
     * prefix.
     * </p>
     * 
     * @return Specifying this limits the results to only those partner event sources with names that start with the
     *         specified prefix.
     */

    public String getNamePrefix() {
        return this.namePrefix;
    }

    /**
     * <p>
     * Specifying this limits the results to only those partner event sources with names that start with the specified
     * prefix.
     * </p>
     * 
     * @param namePrefix
     *        Specifying this limits the results to only those partner event sources with names that start with the
     *        specified prefix.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListEventSourcesRequest withNamePrefix(String namePrefix) {
        setNamePrefix(namePrefix);
        return this;
    }

    /**
     * <p>
     * The token returned by a previous call to retrieve the next set of results.
     * </p>
     * 
     * @param nextToken
     *        The token returned by a previous call to retrieve the next set of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token returned by a previous call to retrieve the next set of results.
     * </p>
     * 
     * @return The token returned by a previous call to retrieve the next set of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token returned by a previous call to retrieve the next set of results.
     * </p>
     * 
     * @param nextToken
     *        The token returned by a previous call to retrieve the next set of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListEventSourcesRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * Specifying this limits the number of results returned by this operation. The operation also returns a
     * <code>NextToken</code> that you can use in a subsequent operation to retrieve the next set of results.
     * </p>
     * 
     * @param limit
     *        Specifying this limits the number of results returned by this operation. The operation also returns a
     *        <code>NextToken</code> that you can use in a subsequent operation to retrieve the next set of results.
     */

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    /**
     * <p>
     * Specifying this limits the number of results returned by this operation. The operation also returns a
     * <code>NextToken</code> that you can use in a subsequent operation to retrieve the next set of results.
     * </p>
     * 
     * @return Specifying this limits the number of results returned by this operation. The operation also returns a
     *         <code>NextToken</code> that you can use in a subsequent operation to retrieve the next set of results.
     */

    public Integer getLimit() {
        return this.limit;
    }

    /**
     * <p>
     * Specifying this limits the number of results returned by this operation. The operation also returns a
     * <code>NextToken</code> that you can use in a subsequent operation to retrieve the next set of results.
     * </p>
     * 
     * @param limit
     *        Specifying this limits the number of results returned by this operation. The operation also returns a
     *        <code>NextToken</code> that you can use in a subsequent operation to retrieve the next set of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListEventSourcesRequest withLimit(Integer limit) {
        setLimit(limit);
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
        if (getNamePrefix() != null)
            sb.append("NamePrefix: ").append(getNamePrefix()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getLimit() != null)
            sb.append("Limit: ").append(getLimit());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListEventSourcesRequest == false)
            return false;
        ListEventSourcesRequest other = (ListEventSourcesRequest) obj;
        if (other.getNamePrefix() == null ^ this.getNamePrefix() == null)
            return false;
        if (other.getNamePrefix() != null && other.getNamePrefix().equals(this.getNamePrefix()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getLimit() == null ^ this.getLimit() == null)
            return false;
        if (other.getLimit() != null && other.getLimit().equals(this.getLimit()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNamePrefix() == null) ? 0 : getNamePrefix().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getLimit() == null) ? 0 : getLimit().hashCode());
        return hashCode;
    }

    @Override
    public ListEventSourcesRequest clone() {
        return (ListEventSourcesRequest) super.clone();
    }

}
