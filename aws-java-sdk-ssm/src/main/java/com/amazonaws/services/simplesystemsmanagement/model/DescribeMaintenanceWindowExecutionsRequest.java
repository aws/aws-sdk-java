/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.simplesystemsmanagement.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/DescribeMaintenanceWindowExecutions"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeMaintenanceWindowExecutionsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the Maintenance Window whose executions should be retrieved.
     * </p>
     */
    private String windowId;
    /**
     * <p>
     * Each entry in the array is a structure containing:
     * </p>
     * <p>
     * Key (string, between 1 and 128 characters)
     * </p>
     * <p>
     * Values (array of strings, each string is between 1 and 256 characters)
     * </p>
     * <p>
     * The supported Keys are ExecutedBefore and ExecutedAfter with the value being a date/time string such as
     * 2016-11-04T05:00:00Z.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<MaintenanceWindowFilter> filters;
    /**
     * <p>
     * The maximum number of items to return for this call. The call also returns a token that you can specify in a
     * subsequent call to get the next set of results.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * The token for the next set of items to return. (You received this token from a previous call.)
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The ID of the Maintenance Window whose executions should be retrieved.
     * </p>
     * 
     * @param windowId
     *        The ID of the Maintenance Window whose executions should be retrieved.
     */

    public void setWindowId(String windowId) {
        this.windowId = windowId;
    }

    /**
     * <p>
     * The ID of the Maintenance Window whose executions should be retrieved.
     * </p>
     * 
     * @return The ID of the Maintenance Window whose executions should be retrieved.
     */

    public String getWindowId() {
        return this.windowId;
    }

    /**
     * <p>
     * The ID of the Maintenance Window whose executions should be retrieved.
     * </p>
     * 
     * @param windowId
     *        The ID of the Maintenance Window whose executions should be retrieved.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeMaintenanceWindowExecutionsRequest withWindowId(String windowId) {
        setWindowId(windowId);
        return this;
    }

    /**
     * <p>
     * Each entry in the array is a structure containing:
     * </p>
     * <p>
     * Key (string, between 1 and 128 characters)
     * </p>
     * <p>
     * Values (array of strings, each string is between 1 and 256 characters)
     * </p>
     * <p>
     * The supported Keys are ExecutedBefore and ExecutedAfter with the value being a date/time string such as
     * 2016-11-04T05:00:00Z.
     * </p>
     * 
     * @return Each entry in the array is a structure containing:</p>
     *         <p>
     *         Key (string, between 1 and 128 characters)
     *         </p>
     *         <p>
     *         Values (array of strings, each string is between 1 and 256 characters)
     *         </p>
     *         <p>
     *         The supported Keys are ExecutedBefore and ExecutedAfter with the value being a date/time string such as
     *         2016-11-04T05:00:00Z.
     */

    public java.util.List<MaintenanceWindowFilter> getFilters() {
        if (filters == null) {
            filters = new com.amazonaws.internal.SdkInternalList<MaintenanceWindowFilter>();
        }
        return filters;
    }

    /**
     * <p>
     * Each entry in the array is a structure containing:
     * </p>
     * <p>
     * Key (string, between 1 and 128 characters)
     * </p>
     * <p>
     * Values (array of strings, each string is between 1 and 256 characters)
     * </p>
     * <p>
     * The supported Keys are ExecutedBefore and ExecutedAfter with the value being a date/time string such as
     * 2016-11-04T05:00:00Z.
     * </p>
     * 
     * @param filters
     *        Each entry in the array is a structure containing:</p>
     *        <p>
     *        Key (string, between 1 and 128 characters)
     *        </p>
     *        <p>
     *        Values (array of strings, each string is between 1 and 256 characters)
     *        </p>
     *        <p>
     *        The supported Keys are ExecutedBefore and ExecutedAfter with the value being a date/time string such as
     *        2016-11-04T05:00:00Z.
     */

    public void setFilters(java.util.Collection<MaintenanceWindowFilter> filters) {
        if (filters == null) {
            this.filters = null;
            return;
        }

        this.filters = new com.amazonaws.internal.SdkInternalList<MaintenanceWindowFilter>(filters);
    }

    /**
     * <p>
     * Each entry in the array is a structure containing:
     * </p>
     * <p>
     * Key (string, between 1 and 128 characters)
     * </p>
     * <p>
     * Values (array of strings, each string is between 1 and 256 characters)
     * </p>
     * <p>
     * The supported Keys are ExecutedBefore and ExecutedAfter with the value being a date/time string such as
     * 2016-11-04T05:00:00Z.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFilters(java.util.Collection)} or {@link #withFilters(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param filters
     *        Each entry in the array is a structure containing:</p>
     *        <p>
     *        Key (string, between 1 and 128 characters)
     *        </p>
     *        <p>
     *        Values (array of strings, each string is between 1 and 256 characters)
     *        </p>
     *        <p>
     *        The supported Keys are ExecutedBefore and ExecutedAfter with the value being a date/time string such as
     *        2016-11-04T05:00:00Z.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeMaintenanceWindowExecutionsRequest withFilters(MaintenanceWindowFilter... filters) {
        if (this.filters == null) {
            setFilters(new com.amazonaws.internal.SdkInternalList<MaintenanceWindowFilter>(filters.length));
        }
        for (MaintenanceWindowFilter ele : filters) {
            this.filters.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Each entry in the array is a structure containing:
     * </p>
     * <p>
     * Key (string, between 1 and 128 characters)
     * </p>
     * <p>
     * Values (array of strings, each string is between 1 and 256 characters)
     * </p>
     * <p>
     * The supported Keys are ExecutedBefore and ExecutedAfter with the value being a date/time string such as
     * 2016-11-04T05:00:00Z.
     * </p>
     * 
     * @param filters
     *        Each entry in the array is a structure containing:</p>
     *        <p>
     *        Key (string, between 1 and 128 characters)
     *        </p>
     *        <p>
     *        Values (array of strings, each string is between 1 and 256 characters)
     *        </p>
     *        <p>
     *        The supported Keys are ExecutedBefore and ExecutedAfter with the value being a date/time string such as
     *        2016-11-04T05:00:00Z.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeMaintenanceWindowExecutionsRequest withFilters(java.util.Collection<MaintenanceWindowFilter> filters) {
        setFilters(filters);
        return this;
    }

    /**
     * <p>
     * The maximum number of items to return for this call. The call also returns a token that you can specify in a
     * subsequent call to get the next set of results.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of items to return for this call. The call also returns a token that you can specify in
     *        a subsequent call to get the next set of results.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of items to return for this call. The call also returns a token that you can specify in a
     * subsequent call to get the next set of results.
     * </p>
     * 
     * @return The maximum number of items to return for this call. The call also returns a token that you can specify
     *         in a subsequent call to get the next set of results.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of items to return for this call. The call also returns a token that you can specify in a
     * subsequent call to get the next set of results.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of items to return for this call. The call also returns a token that you can specify in
     *        a subsequent call to get the next set of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeMaintenanceWindowExecutionsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * The token for the next set of items to return. (You received this token from a previous call.)
     * </p>
     * 
     * @param nextToken
     *        The token for the next set of items to return. (You received this token from a previous call.)
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token for the next set of items to return. (You received this token from a previous call.)
     * </p>
     * 
     * @return The token for the next set of items to return. (You received this token from a previous call.)
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token for the next set of items to return. (You received this token from a previous call.)
     * </p>
     * 
     * @param nextToken
     *        The token for the next set of items to return. (You received this token from a previous call.)
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeMaintenanceWindowExecutionsRequest withNextToken(String nextToken) {
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
        if (getWindowId() != null)
            sb.append("WindowId: ").append(getWindowId()).append(",");
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

        if (obj instanceof DescribeMaintenanceWindowExecutionsRequest == false)
            return false;
        DescribeMaintenanceWindowExecutionsRequest other = (DescribeMaintenanceWindowExecutionsRequest) obj;
        if (other.getWindowId() == null ^ this.getWindowId() == null)
            return false;
        if (other.getWindowId() != null && other.getWindowId().equals(this.getWindowId()) == false)
            return false;
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

        hashCode = prime * hashCode + ((getWindowId() == null) ? 0 : getWindowId().hashCode());
        hashCode = prime * hashCode + ((getFilters() == null) ? 0 : getFilters().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public DescribeMaintenanceWindowExecutionsRequest clone() {
        return (DescribeMaintenanceWindowExecutionsRequest) super.clone();
    }

}
