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
package com.amazonaws.services.migrationhubstrategyrecommendations.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/migrationhubstrategy-2020-02-19/ListApplicationComponents"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListApplicationComponentsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Criteria for filtering the list of application components.
     * </p>
     */
    private String applicationComponentCriteria;
    /**
     * <p>
     * Specify the value based on the application component criteria type. For example, if
     * <code>applicationComponentCriteria</code> is set to <code>SERVER_ID</code> and <code>filterValue</code> is set to
     * <code>server1</code>, then <a>ListApplicationComponents</a> returns all the application components running on
     * server1.
     * </p>
     */
    private String filterValue;
    /**
     * <p>
     * The group ID specified in to filter on.
     * </p>
     */
    private java.util.List<Group> groupIdFilter;
    /**
     * <p>
     * The maximum number of items to include in the response. The maximum value is 100.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * The token from a previous call that you use to retrieve the next set of results. For example, if a previous call
     * to this action returned 100 items, but you set <code>maxResults</code> to 10. You'll receive a set of 10 results
     * along with a token. You then use the returned token to retrieve the next set of 10.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * Specifies whether to sort by ascending (<code>ASC</code>) or descending (<code>DESC</code>) order.
     * </p>
     */
    private String sort;

    /**
     * <p>
     * Criteria for filtering the list of application components.
     * </p>
     * 
     * @param applicationComponentCriteria
     *        Criteria for filtering the list of application components.
     * @see ApplicationComponentCriteria
     */

    public void setApplicationComponentCriteria(String applicationComponentCriteria) {
        this.applicationComponentCriteria = applicationComponentCriteria;
    }

    /**
     * <p>
     * Criteria for filtering the list of application components.
     * </p>
     * 
     * @return Criteria for filtering the list of application components.
     * @see ApplicationComponentCriteria
     */

    public String getApplicationComponentCriteria() {
        return this.applicationComponentCriteria;
    }

    /**
     * <p>
     * Criteria for filtering the list of application components.
     * </p>
     * 
     * @param applicationComponentCriteria
     *        Criteria for filtering the list of application components.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ApplicationComponentCriteria
     */

    public ListApplicationComponentsRequest withApplicationComponentCriteria(String applicationComponentCriteria) {
        setApplicationComponentCriteria(applicationComponentCriteria);
        return this;
    }

    /**
     * <p>
     * Criteria for filtering the list of application components.
     * </p>
     * 
     * @param applicationComponentCriteria
     *        Criteria for filtering the list of application components.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ApplicationComponentCriteria
     */

    public ListApplicationComponentsRequest withApplicationComponentCriteria(ApplicationComponentCriteria applicationComponentCriteria) {
        this.applicationComponentCriteria = applicationComponentCriteria.toString();
        return this;
    }

    /**
     * <p>
     * Specify the value based on the application component criteria type. For example, if
     * <code>applicationComponentCriteria</code> is set to <code>SERVER_ID</code> and <code>filterValue</code> is set to
     * <code>server1</code>, then <a>ListApplicationComponents</a> returns all the application components running on
     * server1.
     * </p>
     * 
     * @param filterValue
     *        Specify the value based on the application component criteria type. For example, if
     *        <code>applicationComponentCriteria</code> is set to <code>SERVER_ID</code> and <code>filterValue</code> is
     *        set to <code>server1</code>, then <a>ListApplicationComponents</a> returns all the application components
     *        running on server1.
     */

    public void setFilterValue(String filterValue) {
        this.filterValue = filterValue;
    }

    /**
     * <p>
     * Specify the value based on the application component criteria type. For example, if
     * <code>applicationComponentCriteria</code> is set to <code>SERVER_ID</code> and <code>filterValue</code> is set to
     * <code>server1</code>, then <a>ListApplicationComponents</a> returns all the application components running on
     * server1.
     * </p>
     * 
     * @return Specify the value based on the application component criteria type. For example, if
     *         <code>applicationComponentCriteria</code> is set to <code>SERVER_ID</code> and <code>filterValue</code>
     *         is set to <code>server1</code>, then <a>ListApplicationComponents</a> returns all the application
     *         components running on server1.
     */

    public String getFilterValue() {
        return this.filterValue;
    }

    /**
     * <p>
     * Specify the value based on the application component criteria type. For example, if
     * <code>applicationComponentCriteria</code> is set to <code>SERVER_ID</code> and <code>filterValue</code> is set to
     * <code>server1</code>, then <a>ListApplicationComponents</a> returns all the application components running on
     * server1.
     * </p>
     * 
     * @param filterValue
     *        Specify the value based on the application component criteria type. For example, if
     *        <code>applicationComponentCriteria</code> is set to <code>SERVER_ID</code> and <code>filterValue</code> is
     *        set to <code>server1</code>, then <a>ListApplicationComponents</a> returns all the application components
     *        running on server1.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListApplicationComponentsRequest withFilterValue(String filterValue) {
        setFilterValue(filterValue);
        return this;
    }

    /**
     * <p>
     * The group ID specified in to filter on.
     * </p>
     * 
     * @return The group ID specified in to filter on.
     */

    public java.util.List<Group> getGroupIdFilter() {
        return groupIdFilter;
    }

    /**
     * <p>
     * The group ID specified in to filter on.
     * </p>
     * 
     * @param groupIdFilter
     *        The group ID specified in to filter on.
     */

    public void setGroupIdFilter(java.util.Collection<Group> groupIdFilter) {
        if (groupIdFilter == null) {
            this.groupIdFilter = null;
            return;
        }

        this.groupIdFilter = new java.util.ArrayList<Group>(groupIdFilter);
    }

    /**
     * <p>
     * The group ID specified in to filter on.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setGroupIdFilter(java.util.Collection)} or {@link #withGroupIdFilter(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param groupIdFilter
     *        The group ID specified in to filter on.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListApplicationComponentsRequest withGroupIdFilter(Group... groupIdFilter) {
        if (this.groupIdFilter == null) {
            setGroupIdFilter(new java.util.ArrayList<Group>(groupIdFilter.length));
        }
        for (Group ele : groupIdFilter) {
            this.groupIdFilter.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The group ID specified in to filter on.
     * </p>
     * 
     * @param groupIdFilter
     *        The group ID specified in to filter on.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListApplicationComponentsRequest withGroupIdFilter(java.util.Collection<Group> groupIdFilter) {
        setGroupIdFilter(groupIdFilter);
        return this;
    }

    /**
     * <p>
     * The maximum number of items to include in the response. The maximum value is 100.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of items to include in the response. The maximum value is 100.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of items to include in the response. The maximum value is 100.
     * </p>
     * 
     * @return The maximum number of items to include in the response. The maximum value is 100.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of items to include in the response. The maximum value is 100.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of items to include in the response. The maximum value is 100.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListApplicationComponentsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * The token from a previous call that you use to retrieve the next set of results. For example, if a previous call
     * to this action returned 100 items, but you set <code>maxResults</code> to 10. You'll receive a set of 10 results
     * along with a token. You then use the returned token to retrieve the next set of 10.
     * </p>
     * 
     * @param nextToken
     *        The token from a previous call that you use to retrieve the next set of results. For example, if a
     *        previous call to this action returned 100 items, but you set <code>maxResults</code> to 10. You'll receive
     *        a set of 10 results along with a token. You then use the returned token to retrieve the next set of 10.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token from a previous call that you use to retrieve the next set of results. For example, if a previous call
     * to this action returned 100 items, but you set <code>maxResults</code> to 10. You'll receive a set of 10 results
     * along with a token. You then use the returned token to retrieve the next set of 10.
     * </p>
     * 
     * @return The token from a previous call that you use to retrieve the next set of results. For example, if a
     *         previous call to this action returned 100 items, but you set <code>maxResults</code> to 10. You'll
     *         receive a set of 10 results along with a token. You then use the returned token to retrieve the next set
     *         of 10.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token from a previous call that you use to retrieve the next set of results. For example, if a previous call
     * to this action returned 100 items, but you set <code>maxResults</code> to 10. You'll receive a set of 10 results
     * along with a token. You then use the returned token to retrieve the next set of 10.
     * </p>
     * 
     * @param nextToken
     *        The token from a previous call that you use to retrieve the next set of results. For example, if a
     *        previous call to this action returned 100 items, but you set <code>maxResults</code> to 10. You'll receive
     *        a set of 10 results along with a token. You then use the returned token to retrieve the next set of 10.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListApplicationComponentsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * Specifies whether to sort by ascending (<code>ASC</code>) or descending (<code>DESC</code>) order.
     * </p>
     * 
     * @param sort
     *        Specifies whether to sort by ascending (<code>ASC</code>) or descending (<code>DESC</code>) order.
     * @see SortOrder
     */

    public void setSort(String sort) {
        this.sort = sort;
    }

    /**
     * <p>
     * Specifies whether to sort by ascending (<code>ASC</code>) or descending (<code>DESC</code>) order.
     * </p>
     * 
     * @return Specifies whether to sort by ascending (<code>ASC</code>) or descending (<code>DESC</code>) order.
     * @see SortOrder
     */

    public String getSort() {
        return this.sort;
    }

    /**
     * <p>
     * Specifies whether to sort by ascending (<code>ASC</code>) or descending (<code>DESC</code>) order.
     * </p>
     * 
     * @param sort
     *        Specifies whether to sort by ascending (<code>ASC</code>) or descending (<code>DESC</code>) order.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SortOrder
     */

    public ListApplicationComponentsRequest withSort(String sort) {
        setSort(sort);
        return this;
    }

    /**
     * <p>
     * Specifies whether to sort by ascending (<code>ASC</code>) or descending (<code>DESC</code>) order.
     * </p>
     * 
     * @param sort
     *        Specifies whether to sort by ascending (<code>ASC</code>) or descending (<code>DESC</code>) order.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SortOrder
     */

    public ListApplicationComponentsRequest withSort(SortOrder sort) {
        this.sort = sort.toString();
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
        if (getApplicationComponentCriteria() != null)
            sb.append("ApplicationComponentCriteria: ").append(getApplicationComponentCriteria()).append(",");
        if (getFilterValue() != null)
            sb.append("FilterValue: ").append(getFilterValue()).append(",");
        if (getGroupIdFilter() != null)
            sb.append("GroupIdFilter: ").append(getGroupIdFilter()).append(",");
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

        if (obj instanceof ListApplicationComponentsRequest == false)
            return false;
        ListApplicationComponentsRequest other = (ListApplicationComponentsRequest) obj;
        if (other.getApplicationComponentCriteria() == null ^ this.getApplicationComponentCriteria() == null)
            return false;
        if (other.getApplicationComponentCriteria() != null && other.getApplicationComponentCriteria().equals(this.getApplicationComponentCriteria()) == false)
            return false;
        if (other.getFilterValue() == null ^ this.getFilterValue() == null)
            return false;
        if (other.getFilterValue() != null && other.getFilterValue().equals(this.getFilterValue()) == false)
            return false;
        if (other.getGroupIdFilter() == null ^ this.getGroupIdFilter() == null)
            return false;
        if (other.getGroupIdFilter() != null && other.getGroupIdFilter().equals(this.getGroupIdFilter()) == false)
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

        hashCode = prime * hashCode + ((getApplicationComponentCriteria() == null) ? 0 : getApplicationComponentCriteria().hashCode());
        hashCode = prime * hashCode + ((getFilterValue() == null) ? 0 : getFilterValue().hashCode());
        hashCode = prime * hashCode + ((getGroupIdFilter() == null) ? 0 : getGroupIdFilter().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getSort() == null) ? 0 : getSort().hashCode());
        return hashCode;
    }

    @Override
    public ListApplicationComponentsRequest clone() {
        return (ListApplicationComponentsRequest) super.clone();
    }

}
