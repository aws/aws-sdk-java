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
package com.amazonaws.services.connect.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/SearchQueues" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SearchQueuesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier of the Amazon Connect instance. You can find the instanceId in the ARN of the instance.
     * </p>
     */
    private String instanceId;
    /**
     * <p>
     * The token for the next set of results. Use the value returned in the previous response in the next request to
     * retrieve the next set of results.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The maximum number of results to return per page.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * Filters to be applied to search results.
     * </p>
     */
    private QueueSearchFilter searchFilter;
    /**
     * <p>
     * The search criteria to be used to return queues.
     * </p>
     * <note>
     * <p>
     * The <code>name</code> and <code>description</code> fields support "contains" queries with a minimum of 2
     * characters and a maximum of 25 characters. Any queries with character lengths outside of this range will throw
     * invalid results.
     * </p>
     * </note>
     */
    private QueueSearchCriteria searchCriteria;

    /**
     * <p>
     * The identifier of the Amazon Connect instance. You can find the instanceId in the ARN of the instance.
     * </p>
     * 
     * @param instanceId
     *        The identifier of the Amazon Connect instance. You can find the instanceId in the ARN of the instance.
     */

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    /**
     * <p>
     * The identifier of the Amazon Connect instance. You can find the instanceId in the ARN of the instance.
     * </p>
     * 
     * @return The identifier of the Amazon Connect instance. You can find the instanceId in the ARN of the instance.
     */

    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * <p>
     * The identifier of the Amazon Connect instance. You can find the instanceId in the ARN of the instance.
     * </p>
     * 
     * @param instanceId
     *        The identifier of the Amazon Connect instance. You can find the instanceId in the ARN of the instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchQueuesRequest withInstanceId(String instanceId) {
        setInstanceId(instanceId);
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

    public SearchQueuesRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
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

    public SearchQueuesRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * Filters to be applied to search results.
     * </p>
     * 
     * @param searchFilter
     *        Filters to be applied to search results.
     */

    public void setSearchFilter(QueueSearchFilter searchFilter) {
        this.searchFilter = searchFilter;
    }

    /**
     * <p>
     * Filters to be applied to search results.
     * </p>
     * 
     * @return Filters to be applied to search results.
     */

    public QueueSearchFilter getSearchFilter() {
        return this.searchFilter;
    }

    /**
     * <p>
     * Filters to be applied to search results.
     * </p>
     * 
     * @param searchFilter
     *        Filters to be applied to search results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchQueuesRequest withSearchFilter(QueueSearchFilter searchFilter) {
        setSearchFilter(searchFilter);
        return this;
    }

    /**
     * <p>
     * The search criteria to be used to return queues.
     * </p>
     * <note>
     * <p>
     * The <code>name</code> and <code>description</code> fields support "contains" queries with a minimum of 2
     * characters and a maximum of 25 characters. Any queries with character lengths outside of this range will throw
     * invalid results.
     * </p>
     * </note>
     * 
     * @param searchCriteria
     *        The search criteria to be used to return queues.</p> <note>
     *        <p>
     *        The <code>name</code> and <code>description</code> fields support "contains" queries with a minimum of 2
     *        characters and a maximum of 25 characters. Any queries with character lengths outside of this range will
     *        throw invalid results.
     *        </p>
     */

    public void setSearchCriteria(QueueSearchCriteria searchCriteria) {
        this.searchCriteria = searchCriteria;
    }

    /**
     * <p>
     * The search criteria to be used to return queues.
     * </p>
     * <note>
     * <p>
     * The <code>name</code> and <code>description</code> fields support "contains" queries with a minimum of 2
     * characters and a maximum of 25 characters. Any queries with character lengths outside of this range will throw
     * invalid results.
     * </p>
     * </note>
     * 
     * @return The search criteria to be used to return queues.</p> <note>
     *         <p>
     *         The <code>name</code> and <code>description</code> fields support "contains" queries with a minimum of 2
     *         characters and a maximum of 25 characters. Any queries with character lengths outside of this range will
     *         throw invalid results.
     *         </p>
     */

    public QueueSearchCriteria getSearchCriteria() {
        return this.searchCriteria;
    }

    /**
     * <p>
     * The search criteria to be used to return queues.
     * </p>
     * <note>
     * <p>
     * The <code>name</code> and <code>description</code> fields support "contains" queries with a minimum of 2
     * characters and a maximum of 25 characters. Any queries with character lengths outside of this range will throw
     * invalid results.
     * </p>
     * </note>
     * 
     * @param searchCriteria
     *        The search criteria to be used to return queues.</p> <note>
     *        <p>
     *        The <code>name</code> and <code>description</code> fields support "contains" queries with a minimum of 2
     *        characters and a maximum of 25 characters. Any queries with character lengths outside of this range will
     *        throw invalid results.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchQueuesRequest withSearchCriteria(QueueSearchCriteria searchCriteria) {
        setSearchCriteria(searchCriteria);
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
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
        if (getSearchFilter() != null)
            sb.append("SearchFilter: ").append(getSearchFilter()).append(",");
        if (getSearchCriteria() != null)
            sb.append("SearchCriteria: ").append(getSearchCriteria());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SearchQueuesRequest == false)
            return false;
        SearchQueuesRequest other = (SearchQueuesRequest) obj;
        if (other.getInstanceId() == null ^ this.getInstanceId() == null)
            return false;
        if (other.getInstanceId() != null && other.getInstanceId().equals(this.getInstanceId()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getSearchFilter() == null ^ this.getSearchFilter() == null)
            return false;
        if (other.getSearchFilter() != null && other.getSearchFilter().equals(this.getSearchFilter()) == false)
            return false;
        if (other.getSearchCriteria() == null ^ this.getSearchCriteria() == null)
            return false;
        if (other.getSearchCriteria() != null && other.getSearchCriteria().equals(this.getSearchCriteria()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInstanceId() == null) ? 0 : getInstanceId().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getSearchFilter() == null) ? 0 : getSearchFilter().hashCode());
        hashCode = prime * hashCode + ((getSearchCriteria() == null) ? 0 : getSearchCriteria().hashCode());
        return hashCode;
    }

    @Override
    public SearchQueuesRequest clone() {
        return (SearchQueuesRequest) super.clone();
    }

}
