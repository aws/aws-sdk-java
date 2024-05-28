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
package com.amazonaws.services.connect.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/SearchContacts" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SearchContactsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier of Amazon Connect instance. You can find the instance ID in the Amazon Resource Name (ARN) of the
     * instance.
     * </p>
     */
    private String instanceId;
    /**
     * <p>
     * Time range that you want to search results.
     * </p>
     */
    private SearchContactsTimeRange timeRange;
    /**
     * <p>
     * The search criteria to be used to return contacts.
     * </p>
     */
    private SearchCriteria searchCriteria;
    /**
     * <p>
     * The maximum number of results to return per page.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * The token for the next set of results. Use the value returned in the previous response in the next request to
     * retrieve the next set of results.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * Specifies a field to sort by and a sort order.
     * </p>
     */
    private Sort sort;

    /**
     * <p>
     * The identifier of Amazon Connect instance. You can find the instance ID in the Amazon Resource Name (ARN) of the
     * instance.
     * </p>
     * 
     * @param instanceId
     *        The identifier of Amazon Connect instance. You can find the instance ID in the Amazon Resource Name (ARN)
     *        of the instance.
     */

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    /**
     * <p>
     * The identifier of Amazon Connect instance. You can find the instance ID in the Amazon Resource Name (ARN) of the
     * instance.
     * </p>
     * 
     * @return The identifier of Amazon Connect instance. You can find the instance ID in the Amazon Resource Name (ARN)
     *         of the instance.
     */

    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * <p>
     * The identifier of Amazon Connect instance. You can find the instance ID in the Amazon Resource Name (ARN) of the
     * instance.
     * </p>
     * 
     * @param instanceId
     *        The identifier of Amazon Connect instance. You can find the instance ID in the Amazon Resource Name (ARN)
     *        of the instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchContactsRequest withInstanceId(String instanceId) {
        setInstanceId(instanceId);
        return this;
    }

    /**
     * <p>
     * Time range that you want to search results.
     * </p>
     * 
     * @param timeRange
     *        Time range that you want to search results.
     */

    public void setTimeRange(SearchContactsTimeRange timeRange) {
        this.timeRange = timeRange;
    }

    /**
     * <p>
     * Time range that you want to search results.
     * </p>
     * 
     * @return Time range that you want to search results.
     */

    public SearchContactsTimeRange getTimeRange() {
        return this.timeRange;
    }

    /**
     * <p>
     * Time range that you want to search results.
     * </p>
     * 
     * @param timeRange
     *        Time range that you want to search results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchContactsRequest withTimeRange(SearchContactsTimeRange timeRange) {
        setTimeRange(timeRange);
        return this;
    }

    /**
     * <p>
     * The search criteria to be used to return contacts.
     * </p>
     * 
     * @param searchCriteria
     *        The search criteria to be used to return contacts.
     */

    public void setSearchCriteria(SearchCriteria searchCriteria) {
        this.searchCriteria = searchCriteria;
    }

    /**
     * <p>
     * The search criteria to be used to return contacts.
     * </p>
     * 
     * @return The search criteria to be used to return contacts.
     */

    public SearchCriteria getSearchCriteria() {
        return this.searchCriteria;
    }

    /**
     * <p>
     * The search criteria to be used to return contacts.
     * </p>
     * 
     * @param searchCriteria
     *        The search criteria to be used to return contacts.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchContactsRequest withSearchCriteria(SearchCriteria searchCriteria) {
        setSearchCriteria(searchCriteria);
        return this;
    }

    /**
     * <p>
     * The maximum number of results to return per page.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to return per page.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return per page.
     * </p>
     * 
     * @return The maximum number of results to return per page.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return per page.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to return per page.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchContactsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * The token for the next set of results. Use the value returned in the previous response in the next request to
     * retrieve the next set of results.
     * </p>
     * 
     * @param nextToken
     *        The token for the next set of results. Use the value returned in the previous response in the next request
     *        to retrieve the next set of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token for the next set of results. Use the value returned in the previous response in the next request to
     * retrieve the next set of results.
     * </p>
     * 
     * @return The token for the next set of results. Use the value returned in the previous response in the next
     *         request to retrieve the next set of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token for the next set of results. Use the value returned in the previous response in the next request to
     * retrieve the next set of results.
     * </p>
     * 
     * @param nextToken
     *        The token for the next set of results. Use the value returned in the previous response in the next request
     *        to retrieve the next set of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchContactsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * Specifies a field to sort by and a sort order.
     * </p>
     * 
     * @param sort
     *        Specifies a field to sort by and a sort order.
     */

    public void setSort(Sort sort) {
        this.sort = sort;
    }

    /**
     * <p>
     * Specifies a field to sort by and a sort order.
     * </p>
     * 
     * @return Specifies a field to sort by and a sort order.
     */

    public Sort getSort() {
        return this.sort;
    }

    /**
     * <p>
     * Specifies a field to sort by and a sort order.
     * </p>
     * 
     * @param sort
     *        Specifies a field to sort by and a sort order.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchContactsRequest withSort(Sort sort) {
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
        if (getInstanceId() != null)
            sb.append("InstanceId: ").append(getInstanceId()).append(",");
        if (getTimeRange() != null)
            sb.append("TimeRange: ").append(getTimeRange()).append(",");
        if (getSearchCriteria() != null)
            sb.append("SearchCriteria: ").append(getSearchCriteria()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
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

        if (obj instanceof SearchContactsRequest == false)
            return false;
        SearchContactsRequest other = (SearchContactsRequest) obj;
        if (other.getInstanceId() == null ^ this.getInstanceId() == null)
            return false;
        if (other.getInstanceId() != null && other.getInstanceId().equals(this.getInstanceId()) == false)
            return false;
        if (other.getTimeRange() == null ^ this.getTimeRange() == null)
            return false;
        if (other.getTimeRange() != null && other.getTimeRange().equals(this.getTimeRange()) == false)
            return false;
        if (other.getSearchCriteria() == null ^ this.getSearchCriteria() == null)
            return false;
        if (other.getSearchCriteria() != null && other.getSearchCriteria().equals(this.getSearchCriteria()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
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

        hashCode = prime * hashCode + ((getInstanceId() == null) ? 0 : getInstanceId().hashCode());
        hashCode = prime * hashCode + ((getTimeRange() == null) ? 0 : getTimeRange().hashCode());
        hashCode = prime * hashCode + ((getSearchCriteria() == null) ? 0 : getSearchCriteria().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getSort() == null) ? 0 : getSort().hashCode());
        return hashCode;
    }

    @Override
    public SearchContactsRequest clone() {
        return (SearchContactsRequest) super.clone();
    }

}
