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
package com.amazonaws.services.omics.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/omics-2022-11-28/ListAnnotationStoreVersions" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListAnnotationStoreVersionsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of an annotation store.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The maximum number of annotation store versions to return in one page of results.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * Specifies the pagination token from a previous request to retrieve the next page of results.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * A filter to apply to the list of annotation store versions.
     * </p>
     */
    private ListAnnotationStoreVersionsFilter filter;

    /**
     * <p>
     * The name of an annotation store.
     * </p>
     * 
     * @param name
     *        The name of an annotation store.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of an annotation store.
     * </p>
     * 
     * @return The name of an annotation store.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of an annotation store.
     * </p>
     * 
     * @param name
     *        The name of an annotation store.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAnnotationStoreVersionsRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The maximum number of annotation store versions to return in one page of results.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of annotation store versions to return in one page of results.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of annotation store versions to return in one page of results.
     * </p>
     * 
     * @return The maximum number of annotation store versions to return in one page of results.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of annotation store versions to return in one page of results.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of annotation store versions to return in one page of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAnnotationStoreVersionsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * Specifies the pagination token from a previous request to retrieve the next page of results.
     * </p>
     * 
     * @param nextToken
     *        Specifies the pagination token from a previous request to retrieve the next page of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * Specifies the pagination token from a previous request to retrieve the next page of results.
     * </p>
     * 
     * @return Specifies the pagination token from a previous request to retrieve the next page of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * Specifies the pagination token from a previous request to retrieve the next page of results.
     * </p>
     * 
     * @param nextToken
     *        Specifies the pagination token from a previous request to retrieve the next page of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAnnotationStoreVersionsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * A filter to apply to the list of annotation store versions.
     * </p>
     * 
     * @param filter
     *        A filter to apply to the list of annotation store versions.
     */

    public void setFilter(ListAnnotationStoreVersionsFilter filter) {
        this.filter = filter;
    }

    /**
     * <p>
     * A filter to apply to the list of annotation store versions.
     * </p>
     * 
     * @return A filter to apply to the list of annotation store versions.
     */

    public ListAnnotationStoreVersionsFilter getFilter() {
        return this.filter;
    }

    /**
     * <p>
     * A filter to apply to the list of annotation store versions.
     * </p>
     * 
     * @param filter
     *        A filter to apply to the list of annotation store versions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAnnotationStoreVersionsRequest withFilter(ListAnnotationStoreVersionsFilter filter) {
        setFilter(filter);
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getFilter() != null)
            sb.append("Filter: ").append(getFilter());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListAnnotationStoreVersionsRequest == false)
            return false;
        ListAnnotationStoreVersionsRequest other = (ListAnnotationStoreVersionsRequest) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getFilter() == null ^ this.getFilter() == null)
            return false;
        if (other.getFilter() != null && other.getFilter().equals(this.getFilter()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getFilter() == null) ? 0 : getFilter().hashCode());
        return hashCode;
    }

    @Override
    public ListAnnotationStoreVersionsRequest clone() {
        return (ListAnnotationStoreVersionsRequest) super.clone();
    }

}
