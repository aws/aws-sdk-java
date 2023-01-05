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
package com.amazonaws.services.inspector2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/inspector2-2020-06-08/ListCoverageStatistics" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListCoverageStatisticsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * An object that contains details on the filters to apply to the coverage data for your environment.
     * </p>
     */
    private CoverageFilterCriteria filterCriteria;
    /**
     * <p>
     * The value to group the results by.
     * </p>
     */
    private String groupBy;
    /**
     * <p>
     * A token to use for paginating results that are returned in the response. Set the value of this parameter to null
     * for the first request to a list action. For subsequent calls, use the <code>NextToken</code> value returned from
     * the previous request to continue listing results after the first page.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * An object that contains details on the filters to apply to the coverage data for your environment.
     * </p>
     * 
     * @param filterCriteria
     *        An object that contains details on the filters to apply to the coverage data for your environment.
     */

    public void setFilterCriteria(CoverageFilterCriteria filterCriteria) {
        this.filterCriteria = filterCriteria;
    }

    /**
     * <p>
     * An object that contains details on the filters to apply to the coverage data for your environment.
     * </p>
     * 
     * @return An object that contains details on the filters to apply to the coverage data for your environment.
     */

    public CoverageFilterCriteria getFilterCriteria() {
        return this.filterCriteria;
    }

    /**
     * <p>
     * An object that contains details on the filters to apply to the coverage data for your environment.
     * </p>
     * 
     * @param filterCriteria
     *        An object that contains details on the filters to apply to the coverage data for your environment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListCoverageStatisticsRequest withFilterCriteria(CoverageFilterCriteria filterCriteria) {
        setFilterCriteria(filterCriteria);
        return this;
    }

    /**
     * <p>
     * The value to group the results by.
     * </p>
     * 
     * @param groupBy
     *        The value to group the results by.
     * @see GroupKey
     */

    public void setGroupBy(String groupBy) {
        this.groupBy = groupBy;
    }

    /**
     * <p>
     * The value to group the results by.
     * </p>
     * 
     * @return The value to group the results by.
     * @see GroupKey
     */

    public String getGroupBy() {
        return this.groupBy;
    }

    /**
     * <p>
     * The value to group the results by.
     * </p>
     * 
     * @param groupBy
     *        The value to group the results by.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see GroupKey
     */

    public ListCoverageStatisticsRequest withGroupBy(String groupBy) {
        setGroupBy(groupBy);
        return this;
    }

    /**
     * <p>
     * The value to group the results by.
     * </p>
     * 
     * @param groupBy
     *        The value to group the results by.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see GroupKey
     */

    public ListCoverageStatisticsRequest withGroupBy(GroupKey groupBy) {
        this.groupBy = groupBy.toString();
        return this;
    }

    /**
     * <p>
     * A token to use for paginating results that are returned in the response. Set the value of this parameter to null
     * for the first request to a list action. For subsequent calls, use the <code>NextToken</code> value returned from
     * the previous request to continue listing results after the first page.
     * </p>
     * 
     * @param nextToken
     *        A token to use for paginating results that are returned in the response. Set the value of this parameter
     *        to null for the first request to a list action. For subsequent calls, use the <code>NextToken</code> value
     *        returned from the previous request to continue listing results after the first page.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A token to use for paginating results that are returned in the response. Set the value of this parameter to null
     * for the first request to a list action. For subsequent calls, use the <code>NextToken</code> value returned from
     * the previous request to continue listing results after the first page.
     * </p>
     * 
     * @return A token to use for paginating results that are returned in the response. Set the value of this parameter
     *         to null for the first request to a list action. For subsequent calls, use the <code>NextToken</code>
     *         value returned from the previous request to continue listing results after the first page.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * A token to use for paginating results that are returned in the response. Set the value of this parameter to null
     * for the first request to a list action. For subsequent calls, use the <code>NextToken</code> value returned from
     * the previous request to continue listing results after the first page.
     * </p>
     * 
     * @param nextToken
     *        A token to use for paginating results that are returned in the response. Set the value of this parameter
     *        to null for the first request to a list action. For subsequent calls, use the <code>NextToken</code> value
     *        returned from the previous request to continue listing results after the first page.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListCoverageStatisticsRequest withNextToken(String nextToken) {
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
        if (getFilterCriteria() != null)
            sb.append("FilterCriteria: ").append(getFilterCriteria()).append(",");
        if (getGroupBy() != null)
            sb.append("GroupBy: ").append(getGroupBy()).append(",");
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

        if (obj instanceof ListCoverageStatisticsRequest == false)
            return false;
        ListCoverageStatisticsRequest other = (ListCoverageStatisticsRequest) obj;
        if (other.getFilterCriteria() == null ^ this.getFilterCriteria() == null)
            return false;
        if (other.getFilterCriteria() != null && other.getFilterCriteria().equals(this.getFilterCriteria()) == false)
            return false;
        if (other.getGroupBy() == null ^ this.getGroupBy() == null)
            return false;
        if (other.getGroupBy() != null && other.getGroupBy().equals(this.getGroupBy()) == false)
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

        hashCode = prime * hashCode + ((getFilterCriteria() == null) ? 0 : getFilterCriteria().hashCode());
        hashCode = prime * hashCode + ((getGroupBy() == null) ? 0 : getGroupBy().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListCoverageStatisticsRequest clone() {
        return (ListCoverageStatisticsRequest) super.clone();
    }

}
