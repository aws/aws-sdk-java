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
package com.amazonaws.services.macie2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/DescribeBuckets" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeBucketsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The criteria to use to filter the query results.
     * </p>
     */
    private java.util.Map<String, BucketCriteriaAdditionalProperties> criteria;
    /**
     * <p>
     * The maximum number of items to include in each page of the response. The default value is 50.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * The nextToken string that specifies which page of results to return in a paginated response.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The criteria to use to sort the query results.
     * </p>
     */
    private BucketSortCriteria sortCriteria;

    /**
     * <p>
     * The criteria to use to filter the query results.
     * </p>
     * 
     * @return The criteria to use to filter the query results.
     */

    public java.util.Map<String, BucketCriteriaAdditionalProperties> getCriteria() {
        return criteria;
    }

    /**
     * <p>
     * The criteria to use to filter the query results.
     * </p>
     * 
     * @param criteria
     *        The criteria to use to filter the query results.
     */

    public void setCriteria(java.util.Map<String, BucketCriteriaAdditionalProperties> criteria) {
        this.criteria = criteria;
    }

    /**
     * <p>
     * The criteria to use to filter the query results.
     * </p>
     * 
     * @param criteria
     *        The criteria to use to filter the query results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeBucketsRequest withCriteria(java.util.Map<String, BucketCriteriaAdditionalProperties> criteria) {
        setCriteria(criteria);
        return this;
    }

    /**
     * Add a single Criteria entry
     *
     * @see DescribeBucketsRequest#withCriteria
     * @returns a reference to this object so that method calls can be chained together.
     */

    public DescribeBucketsRequest addCriteriaEntry(String key, BucketCriteriaAdditionalProperties value) {
        if (null == this.criteria) {
            this.criteria = new java.util.HashMap<String, BucketCriteriaAdditionalProperties>();
        }
        if (this.criteria.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.criteria.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Criteria.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeBucketsRequest clearCriteriaEntries() {
        this.criteria = null;
        return this;
    }

    /**
     * <p>
     * The maximum number of items to include in each page of the response. The default value is 50.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of items to include in each page of the response. The default value is 50.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of items to include in each page of the response. The default value is 50.
     * </p>
     * 
     * @return The maximum number of items to include in each page of the response. The default value is 50.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of items to include in each page of the response. The default value is 50.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of items to include in each page of the response. The default value is 50.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeBucketsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * The nextToken string that specifies which page of results to return in a paginated response.
     * </p>
     * 
     * @param nextToken
     *        The nextToken string that specifies which page of results to return in a paginated response.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The nextToken string that specifies which page of results to return in a paginated response.
     * </p>
     * 
     * @return The nextToken string that specifies which page of results to return in a paginated response.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The nextToken string that specifies which page of results to return in a paginated response.
     * </p>
     * 
     * @param nextToken
     *        The nextToken string that specifies which page of results to return in a paginated response.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeBucketsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The criteria to use to sort the query results.
     * </p>
     * 
     * @param sortCriteria
     *        The criteria to use to sort the query results.
     */

    public void setSortCriteria(BucketSortCriteria sortCriteria) {
        this.sortCriteria = sortCriteria;
    }

    /**
     * <p>
     * The criteria to use to sort the query results.
     * </p>
     * 
     * @return The criteria to use to sort the query results.
     */

    public BucketSortCriteria getSortCriteria() {
        return this.sortCriteria;
    }

    /**
     * <p>
     * The criteria to use to sort the query results.
     * </p>
     * 
     * @param sortCriteria
     *        The criteria to use to sort the query results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeBucketsRequest withSortCriteria(BucketSortCriteria sortCriteria) {
        setSortCriteria(sortCriteria);
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
        if (getCriteria() != null)
            sb.append("Criteria: ").append(getCriteria()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getSortCriteria() != null)
            sb.append("SortCriteria: ").append(getSortCriteria());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeBucketsRequest == false)
            return false;
        DescribeBucketsRequest other = (DescribeBucketsRequest) obj;
        if (other.getCriteria() == null ^ this.getCriteria() == null)
            return false;
        if (other.getCriteria() != null && other.getCriteria().equals(this.getCriteria()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getSortCriteria() == null ^ this.getSortCriteria() == null)
            return false;
        if (other.getSortCriteria() != null && other.getSortCriteria().equals(this.getSortCriteria()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCriteria() == null) ? 0 : getCriteria().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getSortCriteria() == null) ? 0 : getSortCriteria().hashCode());
        return hashCode;
    }

    @Override
    public DescribeBucketsRequest clone() {
        return (DescribeBucketsRequest) super.clone();
    }

}
