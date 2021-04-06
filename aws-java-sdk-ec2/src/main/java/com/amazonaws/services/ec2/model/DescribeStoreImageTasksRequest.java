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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.Request;
import com.amazonaws.services.ec2.model.transform.DescribeStoreImageTasksRequestMarshaller;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeStoreImageTasksRequest extends AmazonWebServiceRequest implements Serializable, Cloneable,
        DryRunSupportedRequest<DescribeStoreImageTasksRequest> {

    /**
     * <p>
     * The AMI IDs for which to show progress. Up to 20 AMI IDs can be included in a request.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> imageIds;
    /**
     * <p>
     * The filters.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>task-state</code> - Returns tasks in a certain state (<code>InProgress</code> | <code>Completed</code> |
     * <code>Failed</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>bucket</code> - Returns task information for tasks that targeted a specific bucket. For the filter value,
     * specify the bucket name.
     * </p>
     * </li>
     * </ul>
     */
    private com.amazonaws.internal.SdkInternalList<Filter> filters;
    /**
     * <p>
     * The token for the next page of results.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The maximum number of results to return in a single call. To retrieve the remaining results, make another call
     * with the returned <code>NextToken</code> value. This value can be between 1 and 200. You cannot specify this
     * parameter and the <code>ImageIDs</code> parameter in the same call.
     * </p>
     */
    private Integer maxResults;

    /**
     * <p>
     * The AMI IDs for which to show progress. Up to 20 AMI IDs can be included in a request.
     * </p>
     * 
     * @return The AMI IDs for which to show progress. Up to 20 AMI IDs can be included in a request.
     */

    public java.util.List<String> getImageIds() {
        if (imageIds == null) {
            imageIds = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return imageIds;
    }

    /**
     * <p>
     * The AMI IDs for which to show progress. Up to 20 AMI IDs can be included in a request.
     * </p>
     * 
     * @param imageIds
     *        The AMI IDs for which to show progress. Up to 20 AMI IDs can be included in a request.
     */

    public void setImageIds(java.util.Collection<String> imageIds) {
        if (imageIds == null) {
            this.imageIds = null;
            return;
        }

        this.imageIds = new com.amazonaws.internal.SdkInternalList<String>(imageIds);
    }

    /**
     * <p>
     * The AMI IDs for which to show progress. Up to 20 AMI IDs can be included in a request.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setImageIds(java.util.Collection)} or {@link #withImageIds(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param imageIds
     *        The AMI IDs for which to show progress. Up to 20 AMI IDs can be included in a request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeStoreImageTasksRequest withImageIds(String... imageIds) {
        if (this.imageIds == null) {
            setImageIds(new com.amazonaws.internal.SdkInternalList<String>(imageIds.length));
        }
        for (String ele : imageIds) {
            this.imageIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The AMI IDs for which to show progress. Up to 20 AMI IDs can be included in a request.
     * </p>
     * 
     * @param imageIds
     *        The AMI IDs for which to show progress. Up to 20 AMI IDs can be included in a request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeStoreImageTasksRequest withImageIds(java.util.Collection<String> imageIds) {
        setImageIds(imageIds);
        return this;
    }

    /**
     * <p>
     * The filters.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>task-state</code> - Returns tasks in a certain state (<code>InProgress</code> | <code>Completed</code> |
     * <code>Failed</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>bucket</code> - Returns task information for tasks that targeted a specific bucket. For the filter value,
     * specify the bucket name.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The filters.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>task-state</code> - Returns tasks in a certain state (<code>InProgress</code> |
     *         <code>Completed</code> | <code>Failed</code>)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>bucket</code> - Returns task information for tasks that targeted a specific bucket. For the filter
     *         value, specify the bucket name.
     *         </p>
     *         </li>
     */

    public java.util.List<Filter> getFilters() {
        if (filters == null) {
            filters = new com.amazonaws.internal.SdkInternalList<Filter>();
        }
        return filters;
    }

    /**
     * <p>
     * The filters.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>task-state</code> - Returns tasks in a certain state (<code>InProgress</code> | <code>Completed</code> |
     * <code>Failed</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>bucket</code> - Returns task information for tasks that targeted a specific bucket. For the filter value,
     * specify the bucket name.
     * </p>
     * </li>
     * </ul>
     * 
     * @param filters
     *        The filters.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>task-state</code> - Returns tasks in a certain state (<code>InProgress</code> |
     *        <code>Completed</code> | <code>Failed</code>)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>bucket</code> - Returns task information for tasks that targeted a specific bucket. For the filter
     *        value, specify the bucket name.
     *        </p>
     *        </li>
     */

    public void setFilters(java.util.Collection<Filter> filters) {
        if (filters == null) {
            this.filters = null;
            return;
        }

        this.filters = new com.amazonaws.internal.SdkInternalList<Filter>(filters);
    }

    /**
     * <p>
     * The filters.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>task-state</code> - Returns tasks in a certain state (<code>InProgress</code> | <code>Completed</code> |
     * <code>Failed</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>bucket</code> - Returns task information for tasks that targeted a specific bucket. For the filter value,
     * specify the bucket name.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFilters(java.util.Collection)} or {@link #withFilters(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param filters
     *        The filters.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>task-state</code> - Returns tasks in a certain state (<code>InProgress</code> |
     *        <code>Completed</code> | <code>Failed</code>)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>bucket</code> - Returns task information for tasks that targeted a specific bucket. For the filter
     *        value, specify the bucket name.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeStoreImageTasksRequest withFilters(Filter... filters) {
        if (this.filters == null) {
            setFilters(new com.amazonaws.internal.SdkInternalList<Filter>(filters.length));
        }
        for (Filter ele : filters) {
            this.filters.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The filters.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>task-state</code> - Returns tasks in a certain state (<code>InProgress</code> | <code>Completed</code> |
     * <code>Failed</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>bucket</code> - Returns task information for tasks that targeted a specific bucket. For the filter value,
     * specify the bucket name.
     * </p>
     * </li>
     * </ul>
     * 
     * @param filters
     *        The filters.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>task-state</code> - Returns tasks in a certain state (<code>InProgress</code> |
     *        <code>Completed</code> | <code>Failed</code>)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>bucket</code> - Returns task information for tasks that targeted a specific bucket. For the filter
     *        value, specify the bucket name.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeStoreImageTasksRequest withFilters(java.util.Collection<Filter> filters) {
        setFilters(filters);
        return this;
    }

    /**
     * <p>
     * The token for the next page of results.
     * </p>
     * 
     * @param nextToken
     *        The token for the next page of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token for the next page of results.
     * </p>
     * 
     * @return The token for the next page of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token for the next page of results.
     * </p>
     * 
     * @param nextToken
     *        The token for the next page of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeStoreImageTasksRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The maximum number of results to return in a single call. To retrieve the remaining results, make another call
     * with the returned <code>NextToken</code> value. This value can be between 1 and 200. You cannot specify this
     * parameter and the <code>ImageIDs</code> parameter in the same call.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to return in a single call. To retrieve the remaining results, make another
     *        call with the returned <code>NextToken</code> value. This value can be between 1 and 200. You cannot
     *        specify this parameter and the <code>ImageIDs</code> parameter in the same call.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return in a single call. To retrieve the remaining results, make another call
     * with the returned <code>NextToken</code> value. This value can be between 1 and 200. You cannot specify this
     * parameter and the <code>ImageIDs</code> parameter in the same call.
     * </p>
     * 
     * @return The maximum number of results to return in a single call. To retrieve the remaining results, make another
     *         call with the returned <code>NextToken</code> value. This value can be between 1 and 200. You cannot
     *         specify this parameter and the <code>ImageIDs</code> parameter in the same call.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return in a single call. To retrieve the remaining results, make another call
     * with the returned <code>NextToken</code> value. This value can be between 1 and 200. You cannot specify this
     * parameter and the <code>ImageIDs</code> parameter in the same call.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to return in a single call. To retrieve the remaining results, make another
     *        call with the returned <code>NextToken</code> value. This value can be between 1 and 200. You cannot
     *        specify this parameter and the <code>ImageIDs</code> parameter in the same call.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeStoreImageTasksRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled request configured with additional
     * parameters to enable operation dry-run.
     */
    @Override
    public Request<DescribeStoreImageTasksRequest> getDryRunRequest() {
        Request<DescribeStoreImageTasksRequest> request = new DescribeStoreImageTasksRequestMarshaller().marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
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
        if (getImageIds() != null)
            sb.append("ImageIds: ").append(getImageIds()).append(",");
        if (getFilters() != null)
            sb.append("Filters: ").append(getFilters()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeStoreImageTasksRequest == false)
            return false;
        DescribeStoreImageTasksRequest other = (DescribeStoreImageTasksRequest) obj;
        if (other.getImageIds() == null ^ this.getImageIds() == null)
            return false;
        if (other.getImageIds() != null && other.getImageIds().equals(this.getImageIds()) == false)
            return false;
        if (other.getFilters() == null ^ this.getFilters() == null)
            return false;
        if (other.getFilters() != null && other.getFilters().equals(this.getFilters()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getImageIds() == null) ? 0 : getImageIds().hashCode());
        hashCode = prime * hashCode + ((getFilters() == null) ? 0 : getFilters().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        return hashCode;
    }

    @Override
    public DescribeStoreImageTasksRequest clone() {
        return (DescribeStoreImageTasksRequest) super.clone();
    }
}
