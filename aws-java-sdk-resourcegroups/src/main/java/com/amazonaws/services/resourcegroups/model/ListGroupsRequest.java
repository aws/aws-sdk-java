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
package com.amazonaws.services.resourcegroups.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resource-groups-2017-11-27/ListGroups" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListGroupsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Filters, formatted as <a>GroupFilter</a> objects, that you want to apply to a <code>ListGroups</code> operation.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>resource-type</code> - Filter the results to include only those of the specified resource types. Specify up
     * to five resource types in the format <code>AWS::<i>ServiceCode</i>::<i>ResourceType</i> </code>. For example,
     * <code>AWS::EC2::Instance</code>, or <code>AWS::S3::Bucket</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>configuration-type</code> - Filter the results to include only those groups that have the specified
     * configuration types attached. The current supported values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>AWS:EC2::CapacityReservationPool</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AWS:EC2::HostManagement</code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     */
    private java.util.List<GroupFilter> filters;
    /**
     * <p>
     * The total number of results that you want included on each page of the response. If you do not include this
     * parameter, it defaults to a value that is specific to the operation. If additional items exist beyond the maximum
     * you specify, the <code>NextToken</code> response element is present and has a value (is not null). Include that
     * value as the <code>NextToken</code> request parameter in the next call to the operation to get the next part of
     * the results. Note that the service might return fewer results than the maximum even when there are more results
     * available. You should check <code>NextToken</code> after every operation to ensure that you receive all of the
     * results.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * The parameter for receiving additional results if you receive a <code>NextToken</code> response in a previous
     * request. A <code>NextToken</code> response indicates that more output is available. Set this parameter to the
     * value provided by a previous call's <code>NextToken</code> response to indicate where the output should continue
     * from.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Filters, formatted as <a>GroupFilter</a> objects, that you want to apply to a <code>ListGroups</code> operation.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>resource-type</code> - Filter the results to include only those of the specified resource types. Specify up
     * to five resource types in the format <code>AWS::<i>ServiceCode</i>::<i>ResourceType</i> </code>. For example,
     * <code>AWS::EC2::Instance</code>, or <code>AWS::S3::Bucket</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>configuration-type</code> - Filter the results to include only those groups that have the specified
     * configuration types attached. The current supported values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>AWS:EC2::CapacityReservationPool</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AWS:EC2::HostManagement</code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @return Filters, formatted as <a>GroupFilter</a> objects, that you want to apply to a <code>ListGroups</code>
     *         operation.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>resource-type</code> - Filter the results to include only those of the specified resource types.
     *         Specify up to five resource types in the format
     *         <code>AWS::<i>ServiceCode</i>::<i>ResourceType</i> </code>. For example, <code>AWS::EC2::Instance</code>,
     *         or <code>AWS::S3::Bucket</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>configuration-type</code> - Filter the results to include only those groups that have the specified
     *         configuration types attached. The current supported values are:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>AWS:EC2::CapacityReservationPool</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>AWS:EC2::HostManagement</code>
     *         </p>
     *         </li>
     *         </ul>
     *         </li>
     */

    public java.util.List<GroupFilter> getFilters() {
        return filters;
    }

    /**
     * <p>
     * Filters, formatted as <a>GroupFilter</a> objects, that you want to apply to a <code>ListGroups</code> operation.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>resource-type</code> - Filter the results to include only those of the specified resource types. Specify up
     * to five resource types in the format <code>AWS::<i>ServiceCode</i>::<i>ResourceType</i> </code>. For example,
     * <code>AWS::EC2::Instance</code>, or <code>AWS::S3::Bucket</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>configuration-type</code> - Filter the results to include only those groups that have the specified
     * configuration types attached. The current supported values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>AWS:EC2::CapacityReservationPool</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AWS:EC2::HostManagement</code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param filters
     *        Filters, formatted as <a>GroupFilter</a> objects, that you want to apply to a <code>ListGroups</code>
     *        operation.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>resource-type</code> - Filter the results to include only those of the specified resource types.
     *        Specify up to five resource types in the format <code>AWS::<i>ServiceCode</i>::<i>ResourceType</i> </code>
     *        . For example, <code>AWS::EC2::Instance</code>, or <code>AWS::S3::Bucket</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>configuration-type</code> - Filter the results to include only those groups that have the specified
     *        configuration types attached. The current supported values are:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>AWS:EC2::CapacityReservationPool</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>AWS:EC2::HostManagement</code>
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     */

    public void setFilters(java.util.Collection<GroupFilter> filters) {
        if (filters == null) {
            this.filters = null;
            return;
        }

        this.filters = new java.util.ArrayList<GroupFilter>(filters);
    }

    /**
     * <p>
     * Filters, formatted as <a>GroupFilter</a> objects, that you want to apply to a <code>ListGroups</code> operation.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>resource-type</code> - Filter the results to include only those of the specified resource types. Specify up
     * to five resource types in the format <code>AWS::<i>ServiceCode</i>::<i>ResourceType</i> </code>. For example,
     * <code>AWS::EC2::Instance</code>, or <code>AWS::S3::Bucket</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>configuration-type</code> - Filter the results to include only those groups that have the specified
     * configuration types attached. The current supported values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>AWS:EC2::CapacityReservationPool</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AWS:EC2::HostManagement</code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFilters(java.util.Collection)} or {@link #withFilters(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param filters
     *        Filters, formatted as <a>GroupFilter</a> objects, that you want to apply to a <code>ListGroups</code>
     *        operation.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>resource-type</code> - Filter the results to include only those of the specified resource types.
     *        Specify up to five resource types in the format <code>AWS::<i>ServiceCode</i>::<i>ResourceType</i> </code>
     *        . For example, <code>AWS::EC2::Instance</code>, or <code>AWS::S3::Bucket</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>configuration-type</code> - Filter the results to include only those groups that have the specified
     *        configuration types attached. The current supported values are:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>AWS:EC2::CapacityReservationPool</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>AWS:EC2::HostManagement</code>
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListGroupsRequest withFilters(GroupFilter... filters) {
        if (this.filters == null) {
            setFilters(new java.util.ArrayList<GroupFilter>(filters.length));
        }
        for (GroupFilter ele : filters) {
            this.filters.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Filters, formatted as <a>GroupFilter</a> objects, that you want to apply to a <code>ListGroups</code> operation.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>resource-type</code> - Filter the results to include only those of the specified resource types. Specify up
     * to five resource types in the format <code>AWS::<i>ServiceCode</i>::<i>ResourceType</i> </code>. For example,
     * <code>AWS::EC2::Instance</code>, or <code>AWS::S3::Bucket</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>configuration-type</code> - Filter the results to include only those groups that have the specified
     * configuration types attached. The current supported values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>AWS:EC2::CapacityReservationPool</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AWS:EC2::HostManagement</code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param filters
     *        Filters, formatted as <a>GroupFilter</a> objects, that you want to apply to a <code>ListGroups</code>
     *        operation.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>resource-type</code> - Filter the results to include only those of the specified resource types.
     *        Specify up to five resource types in the format <code>AWS::<i>ServiceCode</i>::<i>ResourceType</i> </code>
     *        . For example, <code>AWS::EC2::Instance</code>, or <code>AWS::S3::Bucket</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>configuration-type</code> - Filter the results to include only those groups that have the specified
     *        configuration types attached. The current supported values are:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>AWS:EC2::CapacityReservationPool</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>AWS:EC2::HostManagement</code>
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListGroupsRequest withFilters(java.util.Collection<GroupFilter> filters) {
        setFilters(filters);
        return this;
    }

    /**
     * <p>
     * The total number of results that you want included on each page of the response. If you do not include this
     * parameter, it defaults to a value that is specific to the operation. If additional items exist beyond the maximum
     * you specify, the <code>NextToken</code> response element is present and has a value (is not null). Include that
     * value as the <code>NextToken</code> request parameter in the next call to the operation to get the next part of
     * the results. Note that the service might return fewer results than the maximum even when there are more results
     * available. You should check <code>NextToken</code> after every operation to ensure that you receive all of the
     * results.
     * </p>
     * 
     * @param maxResults
     *        The total number of results that you want included on each page of the response. If you do not include
     *        this parameter, it defaults to a value that is specific to the operation. If additional items exist beyond
     *        the maximum you specify, the <code>NextToken</code> response element is present and has a value (is not
     *        null). Include that value as the <code>NextToken</code> request parameter in the next call to the
     *        operation to get the next part of the results. Note that the service might return fewer results than the
     *        maximum even when there are more results available. You should check <code>NextToken</code> after every
     *        operation to ensure that you receive all of the results.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The total number of results that you want included on each page of the response. If you do not include this
     * parameter, it defaults to a value that is specific to the operation. If additional items exist beyond the maximum
     * you specify, the <code>NextToken</code> response element is present and has a value (is not null). Include that
     * value as the <code>NextToken</code> request parameter in the next call to the operation to get the next part of
     * the results. Note that the service might return fewer results than the maximum even when there are more results
     * available. You should check <code>NextToken</code> after every operation to ensure that you receive all of the
     * results.
     * </p>
     * 
     * @return The total number of results that you want included on each page of the response. If you do not include
     *         this parameter, it defaults to a value that is specific to the operation. If additional items exist
     *         beyond the maximum you specify, the <code>NextToken</code> response element is present and has a value
     *         (is not null). Include that value as the <code>NextToken</code> request parameter in the next call to the
     *         operation to get the next part of the results. Note that the service might return fewer results than the
     *         maximum even when there are more results available. You should check <code>NextToken</code> after every
     *         operation to ensure that you receive all of the results.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The total number of results that you want included on each page of the response. If you do not include this
     * parameter, it defaults to a value that is specific to the operation. If additional items exist beyond the maximum
     * you specify, the <code>NextToken</code> response element is present and has a value (is not null). Include that
     * value as the <code>NextToken</code> request parameter in the next call to the operation to get the next part of
     * the results. Note that the service might return fewer results than the maximum even when there are more results
     * available. You should check <code>NextToken</code> after every operation to ensure that you receive all of the
     * results.
     * </p>
     * 
     * @param maxResults
     *        The total number of results that you want included on each page of the response. If you do not include
     *        this parameter, it defaults to a value that is specific to the operation. If additional items exist beyond
     *        the maximum you specify, the <code>NextToken</code> response element is present and has a value (is not
     *        null). Include that value as the <code>NextToken</code> request parameter in the next call to the
     *        operation to get the next part of the results. Note that the service might return fewer results than the
     *        maximum even when there are more results available. You should check <code>NextToken</code> after every
     *        operation to ensure that you receive all of the results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListGroupsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * The parameter for receiving additional results if you receive a <code>NextToken</code> response in a previous
     * request. A <code>NextToken</code> response indicates that more output is available. Set this parameter to the
     * value provided by a previous call's <code>NextToken</code> response to indicate where the output should continue
     * from.
     * </p>
     * 
     * @param nextToken
     *        The parameter for receiving additional results if you receive a <code>NextToken</code> response in a
     *        previous request. A <code>NextToken</code> response indicates that more output is available. Set this
     *        parameter to the value provided by a previous call's <code>NextToken</code> response to indicate where the
     *        output should continue from.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The parameter for receiving additional results if you receive a <code>NextToken</code> response in a previous
     * request. A <code>NextToken</code> response indicates that more output is available. Set this parameter to the
     * value provided by a previous call's <code>NextToken</code> response to indicate where the output should continue
     * from.
     * </p>
     * 
     * @return The parameter for receiving additional results if you receive a <code>NextToken</code> response in a
     *         previous request. A <code>NextToken</code> response indicates that more output is available. Set this
     *         parameter to the value provided by a previous call's <code>NextToken</code> response to indicate where
     *         the output should continue from.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The parameter for receiving additional results if you receive a <code>NextToken</code> response in a previous
     * request. A <code>NextToken</code> response indicates that more output is available. Set this parameter to the
     * value provided by a previous call's <code>NextToken</code> response to indicate where the output should continue
     * from.
     * </p>
     * 
     * @param nextToken
     *        The parameter for receiving additional results if you receive a <code>NextToken</code> response in a
     *        previous request. A <code>NextToken</code> response indicates that more output is available. Set this
     *        parameter to the value provided by a previous call's <code>NextToken</code> response to indicate where the
     *        output should continue from.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListGroupsRequest withNextToken(String nextToken) {
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

        if (obj instanceof ListGroupsRequest == false)
            return false;
        ListGroupsRequest other = (ListGroupsRequest) obj;
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
    public ListGroupsRequest clone() {
        return (ListGroupsRequest) super.clone();
    }

}
