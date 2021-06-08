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
package com.amazonaws.services.elasticinference.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elastic-inference-2017-07-25/DescribeAccelerators"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeAcceleratorsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The IDs of the accelerators to describe.
     * </p>
     */
    private java.util.List<String> acceleratorIds;
    /**
     * <p>
     * One or more filters. Filter names and values are case-sensitive. Valid filter names are: accelerator-types: can
     * provide a list of accelerator type names to filter for. instance-id: can provide a list of EC2 instance ids to
     * filter for.
     * </p>
     */
    private java.util.List<Filter> filters;
    /**
     * <p>
     * The total number of items to return in the command's output. If the total number of items available is more than
     * the value specified, a NextToken is provided in the command's output. To resume pagination, provide the NextToken
     * value in the starting-token argument of a subsequent command. Do not use the NextToken response element directly
     * outside of the AWS CLI.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * A token to specify where to start paginating. This is the NextToken from a previously truncated response.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The IDs of the accelerators to describe.
     * </p>
     * 
     * @return The IDs of the accelerators to describe.
     */

    public java.util.List<String> getAcceleratorIds() {
        return acceleratorIds;
    }

    /**
     * <p>
     * The IDs of the accelerators to describe.
     * </p>
     * 
     * @param acceleratorIds
     *        The IDs of the accelerators to describe.
     */

    public void setAcceleratorIds(java.util.Collection<String> acceleratorIds) {
        if (acceleratorIds == null) {
            this.acceleratorIds = null;
            return;
        }

        this.acceleratorIds = new java.util.ArrayList<String>(acceleratorIds);
    }

    /**
     * <p>
     * The IDs of the accelerators to describe.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAcceleratorIds(java.util.Collection)} or {@link #withAcceleratorIds(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param acceleratorIds
     *        The IDs of the accelerators to describe.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAcceleratorsRequest withAcceleratorIds(String... acceleratorIds) {
        if (this.acceleratorIds == null) {
            setAcceleratorIds(new java.util.ArrayList<String>(acceleratorIds.length));
        }
        for (String ele : acceleratorIds) {
            this.acceleratorIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The IDs of the accelerators to describe.
     * </p>
     * 
     * @param acceleratorIds
     *        The IDs of the accelerators to describe.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAcceleratorsRequest withAcceleratorIds(java.util.Collection<String> acceleratorIds) {
        setAcceleratorIds(acceleratorIds);
        return this;
    }

    /**
     * <p>
     * One or more filters. Filter names and values are case-sensitive. Valid filter names are: accelerator-types: can
     * provide a list of accelerator type names to filter for. instance-id: can provide a list of EC2 instance ids to
     * filter for.
     * </p>
     * 
     * @return One or more filters. Filter names and values are case-sensitive. Valid filter names are:
     *         accelerator-types: can provide a list of accelerator type names to filter for. instance-id: can provide a
     *         list of EC2 instance ids to filter for.
     */

    public java.util.List<Filter> getFilters() {
        return filters;
    }

    /**
     * <p>
     * One or more filters. Filter names and values are case-sensitive. Valid filter names are: accelerator-types: can
     * provide a list of accelerator type names to filter for. instance-id: can provide a list of EC2 instance ids to
     * filter for.
     * </p>
     * 
     * @param filters
     *        One or more filters. Filter names and values are case-sensitive. Valid filter names are:
     *        accelerator-types: can provide a list of accelerator type names to filter for. instance-id: can provide a
     *        list of EC2 instance ids to filter for.
     */

    public void setFilters(java.util.Collection<Filter> filters) {
        if (filters == null) {
            this.filters = null;
            return;
        }

        this.filters = new java.util.ArrayList<Filter>(filters);
    }

    /**
     * <p>
     * One or more filters. Filter names and values are case-sensitive. Valid filter names are: accelerator-types: can
     * provide a list of accelerator type names to filter for. instance-id: can provide a list of EC2 instance ids to
     * filter for.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFilters(java.util.Collection)} or {@link #withFilters(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param filters
     *        One or more filters. Filter names and values are case-sensitive. Valid filter names are:
     *        accelerator-types: can provide a list of accelerator type names to filter for. instance-id: can provide a
     *        list of EC2 instance ids to filter for.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAcceleratorsRequest withFilters(Filter... filters) {
        if (this.filters == null) {
            setFilters(new java.util.ArrayList<Filter>(filters.length));
        }
        for (Filter ele : filters) {
            this.filters.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * One or more filters. Filter names and values are case-sensitive. Valid filter names are: accelerator-types: can
     * provide a list of accelerator type names to filter for. instance-id: can provide a list of EC2 instance ids to
     * filter for.
     * </p>
     * 
     * @param filters
     *        One or more filters. Filter names and values are case-sensitive. Valid filter names are:
     *        accelerator-types: can provide a list of accelerator type names to filter for. instance-id: can provide a
     *        list of EC2 instance ids to filter for.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAcceleratorsRequest withFilters(java.util.Collection<Filter> filters) {
        setFilters(filters);
        return this;
    }

    /**
     * <p>
     * The total number of items to return in the command's output. If the total number of items available is more than
     * the value specified, a NextToken is provided in the command's output. To resume pagination, provide the NextToken
     * value in the starting-token argument of a subsequent command. Do not use the NextToken response element directly
     * outside of the AWS CLI.
     * </p>
     * 
     * @param maxResults
     *        The total number of items to return in the command's output. If the total number of items available is
     *        more than the value specified, a NextToken is provided in the command's output. To resume pagination,
     *        provide the NextToken value in the starting-token argument of a subsequent command. Do not use the
     *        NextToken response element directly outside of the AWS CLI.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The total number of items to return in the command's output. If the total number of items available is more than
     * the value specified, a NextToken is provided in the command's output. To resume pagination, provide the NextToken
     * value in the starting-token argument of a subsequent command. Do not use the NextToken response element directly
     * outside of the AWS CLI.
     * </p>
     * 
     * @return The total number of items to return in the command's output. If the total number of items available is
     *         more than the value specified, a NextToken is provided in the command's output. To resume pagination,
     *         provide the NextToken value in the starting-token argument of a subsequent command. Do not use the
     *         NextToken response element directly outside of the AWS CLI.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The total number of items to return in the command's output. If the total number of items available is more than
     * the value specified, a NextToken is provided in the command's output. To resume pagination, provide the NextToken
     * value in the starting-token argument of a subsequent command. Do not use the NextToken response element directly
     * outside of the AWS CLI.
     * </p>
     * 
     * @param maxResults
     *        The total number of items to return in the command's output. If the total number of items available is
     *        more than the value specified, a NextToken is provided in the command's output. To resume pagination,
     *        provide the NextToken value in the starting-token argument of a subsequent command. Do not use the
     *        NextToken response element directly outside of the AWS CLI.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAcceleratorsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * A token to specify where to start paginating. This is the NextToken from a previously truncated response.
     * </p>
     * 
     * @param nextToken
     *        A token to specify where to start paginating. This is the NextToken from a previously truncated response.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A token to specify where to start paginating. This is the NextToken from a previously truncated response.
     * </p>
     * 
     * @return A token to specify where to start paginating. This is the NextToken from a previously truncated response.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * A token to specify where to start paginating. This is the NextToken from a previously truncated response.
     * </p>
     * 
     * @param nextToken
     *        A token to specify where to start paginating. This is the NextToken from a previously truncated response.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAcceleratorsRequest withNextToken(String nextToken) {
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
        if (getAcceleratorIds() != null)
            sb.append("AcceleratorIds: ").append(getAcceleratorIds()).append(",");
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

        if (obj instanceof DescribeAcceleratorsRequest == false)
            return false;
        DescribeAcceleratorsRequest other = (DescribeAcceleratorsRequest) obj;
        if (other.getAcceleratorIds() == null ^ this.getAcceleratorIds() == null)
            return false;
        if (other.getAcceleratorIds() != null && other.getAcceleratorIds().equals(this.getAcceleratorIds()) == false)
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

        hashCode = prime * hashCode + ((getAcceleratorIds() == null) ? 0 : getAcceleratorIds().hashCode());
        hashCode = prime * hashCode + ((getFilters() == null) ? 0 : getFilters().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public DescribeAcceleratorsRequest clone() {
        return (DescribeAcceleratorsRequest) super.clone();
    }

}
