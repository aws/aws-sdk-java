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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.Request;
import com.amazonaws.services.ec2.model.transform.GetIpamResourceCidrsRequestMarshaller;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetIpamResourceCidrsRequest extends AmazonWebServiceRequest implements Serializable, Cloneable,
        DryRunSupportedRequest<GetIpamResourceCidrsRequest> {

    /**
     * <p>
     * One or more filters for the request. For more information about filtering, see <a
     * href="https://docs.aws.amazon.com/cli/latest/userguide/cli-usage-filter.html">Filtering CLI output</a>.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Filter> filters;
    /**
     * <p>
     * The maximum number of results to return in the request.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * The token for the next page of results.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The ID of the scope that the resource is in.
     * </p>
     */
    private String ipamScopeId;
    /**
     * <p>
     * The ID of the IPAM pool that the resource is in.
     * </p>
     */
    private String ipamPoolId;
    /**
     * <p>
     * The ID of the resource.
     * </p>
     */
    private String resourceId;
    /**
     * <p>
     * The resource type.
     * </p>
     */
    private String resourceType;
    /**
     * <p>
     * The resource tag.
     * </p>
     */
    private RequestIpamResourceTag resourceTag;
    /**
     * <p>
     * The ID of the Amazon Web Services account that owns the resource.
     * </p>
     */
    private String resourceOwner;

    /**
     * <p>
     * One or more filters for the request. For more information about filtering, see <a
     * href="https://docs.aws.amazon.com/cli/latest/userguide/cli-usage-filter.html">Filtering CLI output</a>.
     * </p>
     * 
     * @return One or more filters for the request. For more information about filtering, see <a
     *         href="https://docs.aws.amazon.com/cli/latest/userguide/cli-usage-filter.html">Filtering CLI output</a>.
     */

    public java.util.List<Filter> getFilters() {
        if (filters == null) {
            filters = new com.amazonaws.internal.SdkInternalList<Filter>();
        }
        return filters;
    }

    /**
     * <p>
     * One or more filters for the request. For more information about filtering, see <a
     * href="https://docs.aws.amazon.com/cli/latest/userguide/cli-usage-filter.html">Filtering CLI output</a>.
     * </p>
     * 
     * @param filters
     *        One or more filters for the request. For more information about filtering, see <a
     *        href="https://docs.aws.amazon.com/cli/latest/userguide/cli-usage-filter.html">Filtering CLI output</a>.
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
     * One or more filters for the request. For more information about filtering, see <a
     * href="https://docs.aws.amazon.com/cli/latest/userguide/cli-usage-filter.html">Filtering CLI output</a>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFilters(java.util.Collection)} or {@link #withFilters(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param filters
     *        One or more filters for the request. For more information about filtering, see <a
     *        href="https://docs.aws.amazon.com/cli/latest/userguide/cli-usage-filter.html">Filtering CLI output</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetIpamResourceCidrsRequest withFilters(Filter... filters) {
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
     * One or more filters for the request. For more information about filtering, see <a
     * href="https://docs.aws.amazon.com/cli/latest/userguide/cli-usage-filter.html">Filtering CLI output</a>.
     * </p>
     * 
     * @param filters
     *        One or more filters for the request. For more information about filtering, see <a
     *        href="https://docs.aws.amazon.com/cli/latest/userguide/cli-usage-filter.html">Filtering CLI output</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetIpamResourceCidrsRequest withFilters(java.util.Collection<Filter> filters) {
        setFilters(filters);
        return this;
    }

    /**
     * <p>
     * The maximum number of results to return in the request.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to return in the request.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return in the request.
     * </p>
     * 
     * @return The maximum number of results to return in the request.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return in the request.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to return in the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetIpamResourceCidrsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
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

    public GetIpamResourceCidrsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The ID of the scope that the resource is in.
     * </p>
     * 
     * @param ipamScopeId
     *        The ID of the scope that the resource is in.
     */

    public void setIpamScopeId(String ipamScopeId) {
        this.ipamScopeId = ipamScopeId;
    }

    /**
     * <p>
     * The ID of the scope that the resource is in.
     * </p>
     * 
     * @return The ID of the scope that the resource is in.
     */

    public String getIpamScopeId() {
        return this.ipamScopeId;
    }

    /**
     * <p>
     * The ID of the scope that the resource is in.
     * </p>
     * 
     * @param ipamScopeId
     *        The ID of the scope that the resource is in.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetIpamResourceCidrsRequest withIpamScopeId(String ipamScopeId) {
        setIpamScopeId(ipamScopeId);
        return this;
    }

    /**
     * <p>
     * The ID of the IPAM pool that the resource is in.
     * </p>
     * 
     * @param ipamPoolId
     *        The ID of the IPAM pool that the resource is in.
     */

    public void setIpamPoolId(String ipamPoolId) {
        this.ipamPoolId = ipamPoolId;
    }

    /**
     * <p>
     * The ID of the IPAM pool that the resource is in.
     * </p>
     * 
     * @return The ID of the IPAM pool that the resource is in.
     */

    public String getIpamPoolId() {
        return this.ipamPoolId;
    }

    /**
     * <p>
     * The ID of the IPAM pool that the resource is in.
     * </p>
     * 
     * @param ipamPoolId
     *        The ID of the IPAM pool that the resource is in.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetIpamResourceCidrsRequest withIpamPoolId(String ipamPoolId) {
        setIpamPoolId(ipamPoolId);
        return this;
    }

    /**
     * <p>
     * The ID of the resource.
     * </p>
     * 
     * @param resourceId
     *        The ID of the resource.
     */

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    /**
     * <p>
     * The ID of the resource.
     * </p>
     * 
     * @return The ID of the resource.
     */

    public String getResourceId() {
        return this.resourceId;
    }

    /**
     * <p>
     * The ID of the resource.
     * </p>
     * 
     * @param resourceId
     *        The ID of the resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetIpamResourceCidrsRequest withResourceId(String resourceId) {
        setResourceId(resourceId);
        return this;
    }

    /**
     * <p>
     * The resource type.
     * </p>
     * 
     * @param resourceType
     *        The resource type.
     * @see IpamResourceType
     */

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * <p>
     * The resource type.
     * </p>
     * 
     * @return The resource type.
     * @see IpamResourceType
     */

    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * <p>
     * The resource type.
     * </p>
     * 
     * @param resourceType
     *        The resource type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see IpamResourceType
     */

    public GetIpamResourceCidrsRequest withResourceType(String resourceType) {
        setResourceType(resourceType);
        return this;
    }

    /**
     * <p>
     * The resource type.
     * </p>
     * 
     * @param resourceType
     *        The resource type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see IpamResourceType
     */

    public GetIpamResourceCidrsRequest withResourceType(IpamResourceType resourceType) {
        this.resourceType = resourceType.toString();
        return this;
    }

    /**
     * <p>
     * The resource tag.
     * </p>
     * 
     * @param resourceTag
     *        The resource tag.
     */

    public void setResourceTag(RequestIpamResourceTag resourceTag) {
        this.resourceTag = resourceTag;
    }

    /**
     * <p>
     * The resource tag.
     * </p>
     * 
     * @return The resource tag.
     */

    public RequestIpamResourceTag getResourceTag() {
        return this.resourceTag;
    }

    /**
     * <p>
     * The resource tag.
     * </p>
     * 
     * @param resourceTag
     *        The resource tag.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetIpamResourceCidrsRequest withResourceTag(RequestIpamResourceTag resourceTag) {
        setResourceTag(resourceTag);
        return this;
    }

    /**
     * <p>
     * The ID of the Amazon Web Services account that owns the resource.
     * </p>
     * 
     * @param resourceOwner
     *        The ID of the Amazon Web Services account that owns the resource.
     */

    public void setResourceOwner(String resourceOwner) {
        this.resourceOwner = resourceOwner;
    }

    /**
     * <p>
     * The ID of the Amazon Web Services account that owns the resource.
     * </p>
     * 
     * @return The ID of the Amazon Web Services account that owns the resource.
     */

    public String getResourceOwner() {
        return this.resourceOwner;
    }

    /**
     * <p>
     * The ID of the Amazon Web Services account that owns the resource.
     * </p>
     * 
     * @param resourceOwner
     *        The ID of the Amazon Web Services account that owns the resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetIpamResourceCidrsRequest withResourceOwner(String resourceOwner) {
        setResourceOwner(resourceOwner);
        return this;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled request configured with additional
     * parameters to enable operation dry-run.
     */
    @Override
    public Request<GetIpamResourceCidrsRequest> getDryRunRequest() {
        Request<GetIpamResourceCidrsRequest> request = new GetIpamResourceCidrsRequestMarshaller().marshall(this);
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
        if (getFilters() != null)
            sb.append("Filters: ").append(getFilters()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getIpamScopeId() != null)
            sb.append("IpamScopeId: ").append(getIpamScopeId()).append(",");
        if (getIpamPoolId() != null)
            sb.append("IpamPoolId: ").append(getIpamPoolId()).append(",");
        if (getResourceId() != null)
            sb.append("ResourceId: ").append(getResourceId()).append(",");
        if (getResourceType() != null)
            sb.append("ResourceType: ").append(getResourceType()).append(",");
        if (getResourceTag() != null)
            sb.append("ResourceTag: ").append(getResourceTag()).append(",");
        if (getResourceOwner() != null)
            sb.append("ResourceOwner: ").append(getResourceOwner());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetIpamResourceCidrsRequest == false)
            return false;
        GetIpamResourceCidrsRequest other = (GetIpamResourceCidrsRequest) obj;
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
        if (other.getIpamScopeId() == null ^ this.getIpamScopeId() == null)
            return false;
        if (other.getIpamScopeId() != null && other.getIpamScopeId().equals(this.getIpamScopeId()) == false)
            return false;
        if (other.getIpamPoolId() == null ^ this.getIpamPoolId() == null)
            return false;
        if (other.getIpamPoolId() != null && other.getIpamPoolId().equals(this.getIpamPoolId()) == false)
            return false;
        if (other.getResourceId() == null ^ this.getResourceId() == null)
            return false;
        if (other.getResourceId() != null && other.getResourceId().equals(this.getResourceId()) == false)
            return false;
        if (other.getResourceType() == null ^ this.getResourceType() == null)
            return false;
        if (other.getResourceType() != null && other.getResourceType().equals(this.getResourceType()) == false)
            return false;
        if (other.getResourceTag() == null ^ this.getResourceTag() == null)
            return false;
        if (other.getResourceTag() != null && other.getResourceTag().equals(this.getResourceTag()) == false)
            return false;
        if (other.getResourceOwner() == null ^ this.getResourceOwner() == null)
            return false;
        if (other.getResourceOwner() != null && other.getResourceOwner().equals(this.getResourceOwner()) == false)
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
        hashCode = prime * hashCode + ((getIpamScopeId() == null) ? 0 : getIpamScopeId().hashCode());
        hashCode = prime * hashCode + ((getIpamPoolId() == null) ? 0 : getIpamPoolId().hashCode());
        hashCode = prime * hashCode + ((getResourceId() == null) ? 0 : getResourceId().hashCode());
        hashCode = prime * hashCode + ((getResourceType() == null) ? 0 : getResourceType().hashCode());
        hashCode = prime * hashCode + ((getResourceTag() == null) ? 0 : getResourceTag().hashCode());
        hashCode = prime * hashCode + ((getResourceOwner() == null) ? 0 : getResourceOwner().hashCode());
        return hashCode;
    }

    @Override
    public GetIpamResourceCidrsRequest clone() {
        return (GetIpamResourceCidrsRequest) super.clone();
    }
}
