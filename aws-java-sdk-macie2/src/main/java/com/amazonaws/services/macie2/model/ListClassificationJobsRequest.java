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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/ListClassificationJobs" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListClassificationJobsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The criteria to use to filter the results.
     * </p>
     */
    private ListJobsFilterCriteria filterCriteria;
    /**
     * <p>
     * The maximum number of items to include in each page of the response.
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
     * The criteria to use to sort the results.
     * </p>
     */
    private ListJobsSortCriteria sortCriteria;

    /**
     * <p>
     * The criteria to use to filter the results.
     * </p>
     * 
     * @param filterCriteria
     *        The criteria to use to filter the results.
     */

    public void setFilterCriteria(ListJobsFilterCriteria filterCriteria) {
        this.filterCriteria = filterCriteria;
    }

    /**
     * <p>
     * The criteria to use to filter the results.
     * </p>
     * 
     * @return The criteria to use to filter the results.
     */

    public ListJobsFilterCriteria getFilterCriteria() {
        return this.filterCriteria;
    }

    /**
     * <p>
     * The criteria to use to filter the results.
     * </p>
     * 
     * @param filterCriteria
     *        The criteria to use to filter the results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListClassificationJobsRequest withFilterCriteria(ListJobsFilterCriteria filterCriteria) {
        setFilterCriteria(filterCriteria);
        return this;
    }

    /**
     * <p>
     * The maximum number of items to include in each page of the response.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of items to include in each page of the response.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of items to include in each page of the response.
     * </p>
     * 
     * @return The maximum number of items to include in each page of the response.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of items to include in each page of the response.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of items to include in each page of the response.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListClassificationJobsRequest withMaxResults(Integer maxResults) {
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

    public ListClassificationJobsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The criteria to use to sort the results.
     * </p>
     * 
     * @param sortCriteria
     *        The criteria to use to sort the results.
     */

    public void setSortCriteria(ListJobsSortCriteria sortCriteria) {
        this.sortCriteria = sortCriteria;
    }

    /**
     * <p>
     * The criteria to use to sort the results.
     * </p>
     * 
     * @return The criteria to use to sort the results.
     */

    public ListJobsSortCriteria getSortCriteria() {
        return this.sortCriteria;
    }

    /**
     * <p>
     * The criteria to use to sort the results.
     * </p>
     * 
     * @param sortCriteria
     *        The criteria to use to sort the results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListClassificationJobsRequest withSortCriteria(ListJobsSortCriteria sortCriteria) {
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
        if (getFilterCriteria() != null)
            sb.append("FilterCriteria: ").append(getFilterCriteria()).append(",");
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

        if (obj instanceof ListClassificationJobsRequest == false)
            return false;
        ListClassificationJobsRequest other = (ListClassificationJobsRequest) obj;
        if (other.getFilterCriteria() == null ^ this.getFilterCriteria() == null)
            return false;
        if (other.getFilterCriteria() != null && other.getFilterCriteria().equals(this.getFilterCriteria()) == false)
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

        hashCode = prime * hashCode + ((getFilterCriteria() == null) ? 0 : getFilterCriteria().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getSortCriteria() == null) ? 0 : getSortCriteria().hashCode());
        return hashCode;
    }

    @Override
    public ListClassificationJobsRequest clone() {
        return (ListClassificationJobsRequest) super.clone();
    }

}
