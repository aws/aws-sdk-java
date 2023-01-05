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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/migrationhubstrategy-2020-02-19/ListServers" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListServersRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Specifies the filter value, which is based on the type of server criteria. For example, if
     * <code>serverCriteria</code> is <code>OS_NAME</code>, and the <code>filterValue</code> is equal to
     * <code>WindowsServer</code>, then <code>ListServers</code> returns all of the servers matching the OS name
     * <code>WindowsServer</code>.
     * </p>
     */
    private String filterValue;
    /**
     * <p>
     * Specifies the group ID to filter on.
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
     * Criteria for filtering servers.
     * </p>
     */
    private String serverCriteria;
    /**
     * <p>
     * Specifies whether to sort by ascending (<code>ASC</code>) or descending (<code>DESC</code>) order.
     * </p>
     */
    private String sort;

    /**
     * <p>
     * Specifies the filter value, which is based on the type of server criteria. For example, if
     * <code>serverCriteria</code> is <code>OS_NAME</code>, and the <code>filterValue</code> is equal to
     * <code>WindowsServer</code>, then <code>ListServers</code> returns all of the servers matching the OS name
     * <code>WindowsServer</code>.
     * </p>
     * 
     * @param filterValue
     *        Specifies the filter value, which is based on the type of server criteria. For example, if
     *        <code>serverCriteria</code> is <code>OS_NAME</code>, and the <code>filterValue</code> is equal to
     *        <code>WindowsServer</code>, then <code>ListServers</code> returns all of the servers matching the OS name
     *        <code>WindowsServer</code>.
     */

    public void setFilterValue(String filterValue) {
        this.filterValue = filterValue;
    }

    /**
     * <p>
     * Specifies the filter value, which is based on the type of server criteria. For example, if
     * <code>serverCriteria</code> is <code>OS_NAME</code>, and the <code>filterValue</code> is equal to
     * <code>WindowsServer</code>, then <code>ListServers</code> returns all of the servers matching the OS name
     * <code>WindowsServer</code>.
     * </p>
     * 
     * @return Specifies the filter value, which is based on the type of server criteria. For example, if
     *         <code>serverCriteria</code> is <code>OS_NAME</code>, and the <code>filterValue</code> is equal to
     *         <code>WindowsServer</code>, then <code>ListServers</code> returns all of the servers matching the OS name
     *         <code>WindowsServer</code>.
     */

    public String getFilterValue() {
        return this.filterValue;
    }

    /**
     * <p>
     * Specifies the filter value, which is based on the type of server criteria. For example, if
     * <code>serverCriteria</code> is <code>OS_NAME</code>, and the <code>filterValue</code> is equal to
     * <code>WindowsServer</code>, then <code>ListServers</code> returns all of the servers matching the OS name
     * <code>WindowsServer</code>.
     * </p>
     * 
     * @param filterValue
     *        Specifies the filter value, which is based on the type of server criteria. For example, if
     *        <code>serverCriteria</code> is <code>OS_NAME</code>, and the <code>filterValue</code> is equal to
     *        <code>WindowsServer</code>, then <code>ListServers</code> returns all of the servers matching the OS name
     *        <code>WindowsServer</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListServersRequest withFilterValue(String filterValue) {
        setFilterValue(filterValue);
        return this;
    }

    /**
     * <p>
     * Specifies the group ID to filter on.
     * </p>
     * 
     * @return Specifies the group ID to filter on.
     */

    public java.util.List<Group> getGroupIdFilter() {
        return groupIdFilter;
    }

    /**
     * <p>
     * Specifies the group ID to filter on.
     * </p>
     * 
     * @param groupIdFilter
     *        Specifies the group ID to filter on.
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
     * Specifies the group ID to filter on.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setGroupIdFilter(java.util.Collection)} or {@link #withGroupIdFilter(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param groupIdFilter
     *        Specifies the group ID to filter on.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListServersRequest withGroupIdFilter(Group... groupIdFilter) {
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
     * Specifies the group ID to filter on.
     * </p>
     * 
     * @param groupIdFilter
     *        Specifies the group ID to filter on.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListServersRequest withGroupIdFilter(java.util.Collection<Group> groupIdFilter) {
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

    public ListServersRequest withMaxResults(Integer maxResults) {
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

    public ListServersRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * Criteria for filtering servers.
     * </p>
     * 
     * @param serverCriteria
     *        Criteria for filtering servers.
     * @see ServerCriteria
     */

    public void setServerCriteria(String serverCriteria) {
        this.serverCriteria = serverCriteria;
    }

    /**
     * <p>
     * Criteria for filtering servers.
     * </p>
     * 
     * @return Criteria for filtering servers.
     * @see ServerCriteria
     */

    public String getServerCriteria() {
        return this.serverCriteria;
    }

    /**
     * <p>
     * Criteria for filtering servers.
     * </p>
     * 
     * @param serverCriteria
     *        Criteria for filtering servers.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ServerCriteria
     */

    public ListServersRequest withServerCriteria(String serverCriteria) {
        setServerCriteria(serverCriteria);
        return this;
    }

    /**
     * <p>
     * Criteria for filtering servers.
     * </p>
     * 
     * @param serverCriteria
     *        Criteria for filtering servers.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ServerCriteria
     */

    public ListServersRequest withServerCriteria(ServerCriteria serverCriteria) {
        this.serverCriteria = serverCriteria.toString();
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

    public ListServersRequest withSort(String sort) {
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

    public ListServersRequest withSort(SortOrder sort) {
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
        if (getFilterValue() != null)
            sb.append("FilterValue: ").append(getFilterValue()).append(",");
        if (getGroupIdFilter() != null)
            sb.append("GroupIdFilter: ").append(getGroupIdFilter()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getServerCriteria() != null)
            sb.append("ServerCriteria: ").append(getServerCriteria()).append(",");
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

        if (obj instanceof ListServersRequest == false)
            return false;
        ListServersRequest other = (ListServersRequest) obj;
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
        if (other.getServerCriteria() == null ^ this.getServerCriteria() == null)
            return false;
        if (other.getServerCriteria() != null && other.getServerCriteria().equals(this.getServerCriteria()) == false)
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

        hashCode = prime * hashCode + ((getFilterValue() == null) ? 0 : getFilterValue().hashCode());
        hashCode = prime * hashCode + ((getGroupIdFilter() == null) ? 0 : getGroupIdFilter().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getServerCriteria() == null) ? 0 : getServerCriteria().hashCode());
        hashCode = prime * hashCode + ((getSort() == null) ? 0 : getSort().hashCode());
        return hashCode;
    }

    @Override
    public ListServersRequest clone() {
        return (ListServersRequest) super.clone();
    }

}
