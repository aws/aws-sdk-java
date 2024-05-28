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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.Request;
import com.amazonaws.services.ec2.model.transform.DescribeInstanceTopologyRequestMarshaller;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeInstanceTopologyRequest extends AmazonWebServiceRequest implements Serializable, Cloneable,
        DryRunSupportedRequest<DescribeInstanceTopologyRequest> {

    /**
     * <p>
     * The token returned from a previous paginated request. Pagination continues from the end of the items returned by
     * the previous request.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The maximum number of items to return for this request. To get the next page of items, make another request with
     * the token returned in the output. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Query-Requests.html#api-pagination">Pagination</a>.
     * </p>
     * <p>
     * You can't specify this parameter and the instance IDs parameter in the same request.
     * </p>
     * <p>
     * Default: <code>20</code>
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * The instance IDs.
     * </p>
     * <p>
     * Default: Describes all your instances.
     * </p>
     * <p>
     * Constraints: Maximum 100 explicitly specified instance IDs.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> instanceIds;
    /**
     * <p>
     * The name of the placement group that each instance is in.
     * </p>
     * <p>
     * Constraints: Maximum 100 explicitly specified placement group names.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> groupNames;
    /**
     * <p>
     * The filters.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>availability-zone</code> - The name of the Availability Zone (for example, <code>us-west-2a</code>) or
     * Local Zone (for example, <code>us-west-2-lax-1b</code>) that the instance is in.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>instance-type</code> - The instance type (for example, <code>p4d.24xlarge</code>) or instance family (for
     * example, <code>p4d*</code>). You can use the <code>*</code> wildcard to match zero or more characters, or the
     * <code>?</code> wildcard to match zero or one character.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>zone-id</code> - The ID of the Availability Zone (for example, <code>usw2-az2</code>) or Local Zone (for
     * example, <code>usw2-lax1-az1</code>) that the instance is in.
     * </p>
     * </li>
     * </ul>
     */
    private com.amazonaws.internal.SdkInternalList<Filter> filters;

    /**
     * <p>
     * The token returned from a previous paginated request. Pagination continues from the end of the items returned by
     * the previous request.
     * </p>
     * 
     * @param nextToken
     *        The token returned from a previous paginated request. Pagination continues from the end of the items
     *        returned by the previous request.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token returned from a previous paginated request. Pagination continues from the end of the items returned by
     * the previous request.
     * </p>
     * 
     * @return The token returned from a previous paginated request. Pagination continues from the end of the items
     *         returned by the previous request.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token returned from a previous paginated request. Pagination continues from the end of the items returned by
     * the previous request.
     * </p>
     * 
     * @param nextToken
     *        The token returned from a previous paginated request. Pagination continues from the end of the items
     *        returned by the previous request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeInstanceTopologyRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The maximum number of items to return for this request. To get the next page of items, make another request with
     * the token returned in the output. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Query-Requests.html#api-pagination">Pagination</a>.
     * </p>
     * <p>
     * You can't specify this parameter and the instance IDs parameter in the same request.
     * </p>
     * <p>
     * Default: <code>20</code>
     * </p>
     * 
     * @param maxResults
     *        The maximum number of items to return for this request. To get the next page of items, make another
     *        request with the token returned in the output. For more information, see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Query-Requests.html#api-pagination"
     *        >Pagination</a>.</p>
     *        <p>
     *        You can't specify this parameter and the instance IDs parameter in the same request.
     *        </p>
     *        <p>
     *        Default: <code>20</code>
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of items to return for this request. To get the next page of items, make another request with
     * the token returned in the output. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Query-Requests.html#api-pagination">Pagination</a>.
     * </p>
     * <p>
     * You can't specify this parameter and the instance IDs parameter in the same request.
     * </p>
     * <p>
     * Default: <code>20</code>
     * </p>
     * 
     * @return The maximum number of items to return for this request. To get the next page of items, make another
     *         request with the token returned in the output. For more information, see <a
     *         href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Query-Requests.html#api-pagination"
     *         >Pagination</a>.</p>
     *         <p>
     *         You can't specify this parameter and the instance IDs parameter in the same request.
     *         </p>
     *         <p>
     *         Default: <code>20</code>
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of items to return for this request. To get the next page of items, make another request with
     * the token returned in the output. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Query-Requests.html#api-pagination">Pagination</a>.
     * </p>
     * <p>
     * You can't specify this parameter and the instance IDs parameter in the same request.
     * </p>
     * <p>
     * Default: <code>20</code>
     * </p>
     * 
     * @param maxResults
     *        The maximum number of items to return for this request. To get the next page of items, make another
     *        request with the token returned in the output. For more information, see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Query-Requests.html#api-pagination"
     *        >Pagination</a>.</p>
     *        <p>
     *        You can't specify this parameter and the instance IDs parameter in the same request.
     *        </p>
     *        <p>
     *        Default: <code>20</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeInstanceTopologyRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * The instance IDs.
     * </p>
     * <p>
     * Default: Describes all your instances.
     * </p>
     * <p>
     * Constraints: Maximum 100 explicitly specified instance IDs.
     * </p>
     * 
     * @return The instance IDs.</p>
     *         <p>
     *         Default: Describes all your instances.
     *         </p>
     *         <p>
     *         Constraints: Maximum 100 explicitly specified instance IDs.
     */

    public java.util.List<String> getInstanceIds() {
        if (instanceIds == null) {
            instanceIds = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return instanceIds;
    }

    /**
     * <p>
     * The instance IDs.
     * </p>
     * <p>
     * Default: Describes all your instances.
     * </p>
     * <p>
     * Constraints: Maximum 100 explicitly specified instance IDs.
     * </p>
     * 
     * @param instanceIds
     *        The instance IDs.</p>
     *        <p>
     *        Default: Describes all your instances.
     *        </p>
     *        <p>
     *        Constraints: Maximum 100 explicitly specified instance IDs.
     */

    public void setInstanceIds(java.util.Collection<String> instanceIds) {
        if (instanceIds == null) {
            this.instanceIds = null;
            return;
        }

        this.instanceIds = new com.amazonaws.internal.SdkInternalList<String>(instanceIds);
    }

    /**
     * <p>
     * The instance IDs.
     * </p>
     * <p>
     * Default: Describes all your instances.
     * </p>
     * <p>
     * Constraints: Maximum 100 explicitly specified instance IDs.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setInstanceIds(java.util.Collection)} or {@link #withInstanceIds(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param instanceIds
     *        The instance IDs.</p>
     *        <p>
     *        Default: Describes all your instances.
     *        </p>
     *        <p>
     *        Constraints: Maximum 100 explicitly specified instance IDs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeInstanceTopologyRequest withInstanceIds(String... instanceIds) {
        if (this.instanceIds == null) {
            setInstanceIds(new com.amazonaws.internal.SdkInternalList<String>(instanceIds.length));
        }
        for (String ele : instanceIds) {
            this.instanceIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The instance IDs.
     * </p>
     * <p>
     * Default: Describes all your instances.
     * </p>
     * <p>
     * Constraints: Maximum 100 explicitly specified instance IDs.
     * </p>
     * 
     * @param instanceIds
     *        The instance IDs.</p>
     *        <p>
     *        Default: Describes all your instances.
     *        </p>
     *        <p>
     *        Constraints: Maximum 100 explicitly specified instance IDs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeInstanceTopologyRequest withInstanceIds(java.util.Collection<String> instanceIds) {
        setInstanceIds(instanceIds);
        return this;
    }

    /**
     * <p>
     * The name of the placement group that each instance is in.
     * </p>
     * <p>
     * Constraints: Maximum 100 explicitly specified placement group names.
     * </p>
     * 
     * @return The name of the placement group that each instance is in.</p>
     *         <p>
     *         Constraints: Maximum 100 explicitly specified placement group names.
     */

    public java.util.List<String> getGroupNames() {
        if (groupNames == null) {
            groupNames = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return groupNames;
    }

    /**
     * <p>
     * The name of the placement group that each instance is in.
     * </p>
     * <p>
     * Constraints: Maximum 100 explicitly specified placement group names.
     * </p>
     * 
     * @param groupNames
     *        The name of the placement group that each instance is in.</p>
     *        <p>
     *        Constraints: Maximum 100 explicitly specified placement group names.
     */

    public void setGroupNames(java.util.Collection<String> groupNames) {
        if (groupNames == null) {
            this.groupNames = null;
            return;
        }

        this.groupNames = new com.amazonaws.internal.SdkInternalList<String>(groupNames);
    }

    /**
     * <p>
     * The name of the placement group that each instance is in.
     * </p>
     * <p>
     * Constraints: Maximum 100 explicitly specified placement group names.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setGroupNames(java.util.Collection)} or {@link #withGroupNames(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param groupNames
     *        The name of the placement group that each instance is in.</p>
     *        <p>
     *        Constraints: Maximum 100 explicitly specified placement group names.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeInstanceTopologyRequest withGroupNames(String... groupNames) {
        if (this.groupNames == null) {
            setGroupNames(new com.amazonaws.internal.SdkInternalList<String>(groupNames.length));
        }
        for (String ele : groupNames) {
            this.groupNames.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The name of the placement group that each instance is in.
     * </p>
     * <p>
     * Constraints: Maximum 100 explicitly specified placement group names.
     * </p>
     * 
     * @param groupNames
     *        The name of the placement group that each instance is in.</p>
     *        <p>
     *        Constraints: Maximum 100 explicitly specified placement group names.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeInstanceTopologyRequest withGroupNames(java.util.Collection<String> groupNames) {
        setGroupNames(groupNames);
        return this;
    }

    /**
     * <p>
     * The filters.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>availability-zone</code> - The name of the Availability Zone (for example, <code>us-west-2a</code>) or
     * Local Zone (for example, <code>us-west-2-lax-1b</code>) that the instance is in.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>instance-type</code> - The instance type (for example, <code>p4d.24xlarge</code>) or instance family (for
     * example, <code>p4d*</code>). You can use the <code>*</code> wildcard to match zero or more characters, or the
     * <code>?</code> wildcard to match zero or one character.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>zone-id</code> - The ID of the Availability Zone (for example, <code>usw2-az2</code>) or Local Zone (for
     * example, <code>usw2-lax1-az1</code>) that the instance is in.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The filters.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>availability-zone</code> - The name of the Availability Zone (for example, <code>us-west-2a</code>)
     *         or Local Zone (for example, <code>us-west-2-lax-1b</code>) that the instance is in.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>instance-type</code> - The instance type (for example, <code>p4d.24xlarge</code>) or instance
     *         family (for example, <code>p4d*</code>). You can use the <code>*</code> wildcard to match zero or more
     *         characters, or the <code>?</code> wildcard to match zero or one character.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>zone-id</code> - The ID of the Availability Zone (for example, <code>usw2-az2</code>) or Local Zone
     *         (for example, <code>usw2-lax1-az1</code>) that the instance is in.
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
     * <code>availability-zone</code> - The name of the Availability Zone (for example, <code>us-west-2a</code>) or
     * Local Zone (for example, <code>us-west-2-lax-1b</code>) that the instance is in.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>instance-type</code> - The instance type (for example, <code>p4d.24xlarge</code>) or instance family (for
     * example, <code>p4d*</code>). You can use the <code>*</code> wildcard to match zero or more characters, or the
     * <code>?</code> wildcard to match zero or one character.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>zone-id</code> - The ID of the Availability Zone (for example, <code>usw2-az2</code>) or Local Zone (for
     * example, <code>usw2-lax1-az1</code>) that the instance is in.
     * </p>
     * </li>
     * </ul>
     * 
     * @param filters
     *        The filters.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>availability-zone</code> - The name of the Availability Zone (for example, <code>us-west-2a</code>)
     *        or Local Zone (for example, <code>us-west-2-lax-1b</code>) that the instance is in.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>instance-type</code> - The instance type (for example, <code>p4d.24xlarge</code>) or instance family
     *        (for example, <code>p4d*</code>). You can use the <code>*</code> wildcard to match zero or more
     *        characters, or the <code>?</code> wildcard to match zero or one character.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>zone-id</code> - The ID of the Availability Zone (for example, <code>usw2-az2</code>) or Local Zone
     *        (for example, <code>usw2-lax1-az1</code>) that the instance is in.
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
     * <code>availability-zone</code> - The name of the Availability Zone (for example, <code>us-west-2a</code>) or
     * Local Zone (for example, <code>us-west-2-lax-1b</code>) that the instance is in.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>instance-type</code> - The instance type (for example, <code>p4d.24xlarge</code>) or instance family (for
     * example, <code>p4d*</code>). You can use the <code>*</code> wildcard to match zero or more characters, or the
     * <code>?</code> wildcard to match zero or one character.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>zone-id</code> - The ID of the Availability Zone (for example, <code>usw2-az2</code>) or Local Zone (for
     * example, <code>usw2-lax1-az1</code>) that the instance is in.
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
     *        <code>availability-zone</code> - The name of the Availability Zone (for example, <code>us-west-2a</code>)
     *        or Local Zone (for example, <code>us-west-2-lax-1b</code>) that the instance is in.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>instance-type</code> - The instance type (for example, <code>p4d.24xlarge</code>) or instance family
     *        (for example, <code>p4d*</code>). You can use the <code>*</code> wildcard to match zero or more
     *        characters, or the <code>?</code> wildcard to match zero or one character.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>zone-id</code> - The ID of the Availability Zone (for example, <code>usw2-az2</code>) or Local Zone
     *        (for example, <code>usw2-lax1-az1</code>) that the instance is in.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeInstanceTopologyRequest withFilters(Filter... filters) {
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
     * <code>availability-zone</code> - The name of the Availability Zone (for example, <code>us-west-2a</code>) or
     * Local Zone (for example, <code>us-west-2-lax-1b</code>) that the instance is in.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>instance-type</code> - The instance type (for example, <code>p4d.24xlarge</code>) or instance family (for
     * example, <code>p4d*</code>). You can use the <code>*</code> wildcard to match zero or more characters, or the
     * <code>?</code> wildcard to match zero or one character.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>zone-id</code> - The ID of the Availability Zone (for example, <code>usw2-az2</code>) or Local Zone (for
     * example, <code>usw2-lax1-az1</code>) that the instance is in.
     * </p>
     * </li>
     * </ul>
     * 
     * @param filters
     *        The filters.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>availability-zone</code> - The name of the Availability Zone (for example, <code>us-west-2a</code>)
     *        or Local Zone (for example, <code>us-west-2-lax-1b</code>) that the instance is in.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>instance-type</code> - The instance type (for example, <code>p4d.24xlarge</code>) or instance family
     *        (for example, <code>p4d*</code>). You can use the <code>*</code> wildcard to match zero or more
     *        characters, or the <code>?</code> wildcard to match zero or one character.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>zone-id</code> - The ID of the Availability Zone (for example, <code>usw2-az2</code>) or Local Zone
     *        (for example, <code>usw2-lax1-az1</code>) that the instance is in.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeInstanceTopologyRequest withFilters(java.util.Collection<Filter> filters) {
        setFilters(filters);
        return this;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled request configured with additional
     * parameters to enable operation dry-run.
     */
    @Override
    public Request<DescribeInstanceTopologyRequest> getDryRunRequest() {
        Request<DescribeInstanceTopologyRequest> request = new DescribeInstanceTopologyRequestMarshaller().marshall(this);
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
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
        if (getInstanceIds() != null)
            sb.append("InstanceIds: ").append(getInstanceIds()).append(",");
        if (getGroupNames() != null)
            sb.append("GroupNames: ").append(getGroupNames()).append(",");
        if (getFilters() != null)
            sb.append("Filters: ").append(getFilters());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeInstanceTopologyRequest == false)
            return false;
        DescribeInstanceTopologyRequest other = (DescribeInstanceTopologyRequest) obj;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getInstanceIds() == null ^ this.getInstanceIds() == null)
            return false;
        if (other.getInstanceIds() != null && other.getInstanceIds().equals(this.getInstanceIds()) == false)
            return false;
        if (other.getGroupNames() == null ^ this.getGroupNames() == null)
            return false;
        if (other.getGroupNames() != null && other.getGroupNames().equals(this.getGroupNames()) == false)
            return false;
        if (other.getFilters() == null ^ this.getFilters() == null)
            return false;
        if (other.getFilters() != null && other.getFilters().equals(this.getFilters()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getInstanceIds() == null) ? 0 : getInstanceIds().hashCode());
        hashCode = prime * hashCode + ((getGroupNames() == null) ? 0 : getGroupNames().hashCode());
        hashCode = prime * hashCode + ((getFilters() == null) ? 0 : getFilters().hashCode());
        return hashCode;
    }

    @Override
    public DescribeInstanceTopologyRequest clone() {
        return (DescribeInstanceTopologyRequest) super.clone();
    }
}
