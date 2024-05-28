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
package com.amazonaws.services.mgn.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * List imports request.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mgn-2020-02-26/ListImports" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListImportsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * List imports request filters.
     * </p>
     */
    private ListImportsRequestFilters filters;
    /**
     * <p>
     * List imports request max results.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * List imports request next token.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * List imports request filters.
     * </p>
     * 
     * @param filters
     *        List imports request filters.
     */

    public void setFilters(ListImportsRequestFilters filters) {
        this.filters = filters;
    }

    /**
     * <p>
     * List imports request filters.
     * </p>
     * 
     * @return List imports request filters.
     */

    public ListImportsRequestFilters getFilters() {
        return this.filters;
    }

    /**
     * <p>
     * List imports request filters.
     * </p>
     * 
     * @param filters
     *        List imports request filters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListImportsRequest withFilters(ListImportsRequestFilters filters) {
        setFilters(filters);
        return this;
    }

    /**
     * <p>
     * List imports request max results.
     * </p>
     * 
     * @param maxResults
     *        List imports request max results.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * List imports request max results.
     * </p>
     * 
     * @return List imports request max results.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * List imports request max results.
     * </p>
     * 
     * @param maxResults
     *        List imports request max results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListImportsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * List imports request next token.
     * </p>
     * 
     * @param nextToken
     *        List imports request next token.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * List imports request next token.
     * </p>
     * 
     * @return List imports request next token.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * List imports request next token.
     * </p>
     * 
     * @param nextToken
     *        List imports request next token.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListImportsRequest withNextToken(String nextToken) {
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
        if (getFilters() != null)
            sb.append("Filters: ").append(getFilters()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
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

        if (obj instanceof ListImportsRequest == false)
            return false;
        ListImportsRequest other = (ListImportsRequest) obj;
        if (other.getFilters() == null ^ this.getFilters() == null)
            return false;
        if (other.getFilters() != null && other.getFilters().equals(this.getFilters()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
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

        hashCode = prime * hashCode + ((getFilters() == null) ? 0 : getFilters().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListImportsRequest clone() {
        return (ListImportsRequest) super.clone();
    }

}
