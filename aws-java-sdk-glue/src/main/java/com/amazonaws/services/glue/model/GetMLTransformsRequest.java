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
package com.amazonaws.services.glue.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/GetMLTransforms" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetMLTransformsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A paginated token to offset the results.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The maximum number of results to return.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * The filter transformation criteria.
     * </p>
     */
    private TransformFilterCriteria filter;
    /**
     * <p>
     * The sorting criteria.
     * </p>
     */
    private TransformSortCriteria sort;

    /**
     * <p>
     * A paginated token to offset the results.
     * </p>
     * 
     * @param nextToken
     *        A paginated token to offset the results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A paginated token to offset the results.
     * </p>
     * 
     * @return A paginated token to offset the results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * A paginated token to offset the results.
     * </p>
     * 
     * @param nextToken
     *        A paginated token to offset the results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetMLTransformsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The maximum number of results to return.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to return.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return.
     * </p>
     * 
     * @return The maximum number of results to return.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to return.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetMLTransformsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * The filter transformation criteria.
     * </p>
     * 
     * @param filter
     *        The filter transformation criteria.
     */

    public void setFilter(TransformFilterCriteria filter) {
        this.filter = filter;
    }

    /**
     * <p>
     * The filter transformation criteria.
     * </p>
     * 
     * @return The filter transformation criteria.
     */

    public TransformFilterCriteria getFilter() {
        return this.filter;
    }

    /**
     * <p>
     * The filter transformation criteria.
     * </p>
     * 
     * @param filter
     *        The filter transformation criteria.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetMLTransformsRequest withFilter(TransformFilterCriteria filter) {
        setFilter(filter);
        return this;
    }

    /**
     * <p>
     * The sorting criteria.
     * </p>
     * 
     * @param sort
     *        The sorting criteria.
     */

    public void setSort(TransformSortCriteria sort) {
        this.sort = sort;
    }

    /**
     * <p>
     * The sorting criteria.
     * </p>
     * 
     * @return The sorting criteria.
     */

    public TransformSortCriteria getSort() {
        return this.sort;
    }

    /**
     * <p>
     * The sorting criteria.
     * </p>
     * 
     * @param sort
     *        The sorting criteria.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetMLTransformsRequest withSort(TransformSortCriteria sort) {
        setSort(sort);
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
        if (getFilter() != null)
            sb.append("Filter: ").append(getFilter()).append(",");
        if (getSort() != null)
            sb.append("Sort: ").append(getSort());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetMLTransformsRequest == false)
            return false;
        GetMLTransformsRequest other = (GetMLTransformsRequest) obj;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getFilter() == null ^ this.getFilter() == null)
            return false;
        if (other.getFilter() != null && other.getFilter().equals(this.getFilter()) == false)
            return false;
        if (other.getSort() == null ^ this.getSort() == null)
            return false;
        if (other.getSort() != null && other.getSort().equals(this.getSort()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getFilter() == null) ? 0 : getFilter().hashCode());
        hashCode = prime * hashCode + ((getSort() == null) ? 0 : getSort().hashCode());
        return hashCode;
    }

    @Override
    public GetMLTransformsRequest clone() {
        return (GetMLTransformsRequest) super.clone();
    }

}
