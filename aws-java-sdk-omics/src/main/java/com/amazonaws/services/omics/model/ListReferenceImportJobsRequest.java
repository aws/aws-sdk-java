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
package com.amazonaws.services.omics.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/omics-2022-11-28/ListReferenceImportJobs" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListReferenceImportJobsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A filter to apply to the list.
     * </p>
     */
    private ImportReferenceFilter filter;
    /**
     * <p>
     * The maximum number of jobs to return in one page of results.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * Specify the pagination token from a previous request to retrieve the next page of results.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The job's reference store ID.
     * </p>
     */
    private String referenceStoreId;

    /**
     * <p>
     * A filter to apply to the list.
     * </p>
     * 
     * @param filter
     *        A filter to apply to the list.
     */

    public void setFilter(ImportReferenceFilter filter) {
        this.filter = filter;
    }

    /**
     * <p>
     * A filter to apply to the list.
     * </p>
     * 
     * @return A filter to apply to the list.
     */

    public ImportReferenceFilter getFilter() {
        return this.filter;
    }

    /**
     * <p>
     * A filter to apply to the list.
     * </p>
     * 
     * @param filter
     *        A filter to apply to the list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListReferenceImportJobsRequest withFilter(ImportReferenceFilter filter) {
        setFilter(filter);
        return this;
    }

    /**
     * <p>
     * The maximum number of jobs to return in one page of results.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of jobs to return in one page of results.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of jobs to return in one page of results.
     * </p>
     * 
     * @return The maximum number of jobs to return in one page of results.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of jobs to return in one page of results.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of jobs to return in one page of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListReferenceImportJobsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * Specify the pagination token from a previous request to retrieve the next page of results.
     * </p>
     * 
     * @param nextToken
     *        Specify the pagination token from a previous request to retrieve the next page of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * Specify the pagination token from a previous request to retrieve the next page of results.
     * </p>
     * 
     * @return Specify the pagination token from a previous request to retrieve the next page of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * Specify the pagination token from a previous request to retrieve the next page of results.
     * </p>
     * 
     * @param nextToken
     *        Specify the pagination token from a previous request to retrieve the next page of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListReferenceImportJobsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The job's reference store ID.
     * </p>
     * 
     * @param referenceStoreId
     *        The job's reference store ID.
     */

    public void setReferenceStoreId(String referenceStoreId) {
        this.referenceStoreId = referenceStoreId;
    }

    /**
     * <p>
     * The job's reference store ID.
     * </p>
     * 
     * @return The job's reference store ID.
     */

    public String getReferenceStoreId() {
        return this.referenceStoreId;
    }

    /**
     * <p>
     * The job's reference store ID.
     * </p>
     * 
     * @param referenceStoreId
     *        The job's reference store ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListReferenceImportJobsRequest withReferenceStoreId(String referenceStoreId) {
        setReferenceStoreId(referenceStoreId);
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
        if (getFilter() != null)
            sb.append("Filter: ").append(getFilter()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getReferenceStoreId() != null)
            sb.append("ReferenceStoreId: ").append(getReferenceStoreId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListReferenceImportJobsRequest == false)
            return false;
        ListReferenceImportJobsRequest other = (ListReferenceImportJobsRequest) obj;
        if (other.getFilter() == null ^ this.getFilter() == null)
            return false;
        if (other.getFilter() != null && other.getFilter().equals(this.getFilter()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getReferenceStoreId() == null ^ this.getReferenceStoreId() == null)
            return false;
        if (other.getReferenceStoreId() != null && other.getReferenceStoreId().equals(this.getReferenceStoreId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFilter() == null) ? 0 : getFilter().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getReferenceStoreId() == null) ? 0 : getReferenceStoreId().hashCode());
        return hashCode;
    }

    @Override
    public ListReferenceImportJobsRequest clone() {
        return (ListReferenceImportJobsRequest) super.clone();
    }

}
