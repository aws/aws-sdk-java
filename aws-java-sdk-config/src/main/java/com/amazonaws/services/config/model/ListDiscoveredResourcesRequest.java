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
package com.amazonaws.services.config.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p/>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/ListDiscoveredResources" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListDiscoveredResourcesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The type of resources that you want AWS Config to list in the response.
     * </p>
     */
    private String resourceType;
    /**
     * <p>
     * The IDs of only those resources that you want AWS Config to list in the response. If you do not specify this
     * parameter, AWS Config lists all resources of the specified type that it has discovered.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> resourceIds;
    /**
     * <p>
     * The custom name of only those resources that you want AWS Config to list in the response. If you do not specify
     * this parameter, AWS Config lists all resources of the specified type that it has discovered.
     * </p>
     */
    private String resourceName;
    /**
     * <p>
     * The maximum number of resource identifiers returned on each page. The default is 100. You cannot specify a number
     * greater than 100. If you specify 0, AWS Config uses the default.
     * </p>
     */
    private Integer limit;
    /**
     * <p>
     * Specifies whether AWS Config includes deleted resources in the results. By default, deleted resources are not
     * included.
     * </p>
     */
    private Boolean includeDeletedResources;
    /**
     * <p>
     * The <code>nextToken</code> string returned on a previous page that you use to get the next page of results in a
     * paginated response.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The type of resources that you want AWS Config to list in the response.
     * </p>
     * 
     * @param resourceType
     *        The type of resources that you want AWS Config to list in the response.
     * @see ResourceType
     */

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * <p>
     * The type of resources that you want AWS Config to list in the response.
     * </p>
     * 
     * @return The type of resources that you want AWS Config to list in the response.
     * @see ResourceType
     */

    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * <p>
     * The type of resources that you want AWS Config to list in the response.
     * </p>
     * 
     * @param resourceType
     *        The type of resources that you want AWS Config to list in the response.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResourceType
     */

    public ListDiscoveredResourcesRequest withResourceType(String resourceType) {
        setResourceType(resourceType);
        return this;
    }

    /**
     * <p>
     * The type of resources that you want AWS Config to list in the response.
     * </p>
     * 
     * @param resourceType
     *        The type of resources that you want AWS Config to list in the response.
     * @see ResourceType
     */

    public void setResourceType(ResourceType resourceType) {
        withResourceType(resourceType);
    }

    /**
     * <p>
     * The type of resources that you want AWS Config to list in the response.
     * </p>
     * 
     * @param resourceType
     *        The type of resources that you want AWS Config to list in the response.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResourceType
     */

    public ListDiscoveredResourcesRequest withResourceType(ResourceType resourceType) {
        this.resourceType = resourceType.toString();
        return this;
    }

    /**
     * <p>
     * The IDs of only those resources that you want AWS Config to list in the response. If you do not specify this
     * parameter, AWS Config lists all resources of the specified type that it has discovered.
     * </p>
     * 
     * @return The IDs of only those resources that you want AWS Config to list in the response. If you do not specify
     *         this parameter, AWS Config lists all resources of the specified type that it has discovered.
     */

    public java.util.List<String> getResourceIds() {
        if (resourceIds == null) {
            resourceIds = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return resourceIds;
    }

    /**
     * <p>
     * The IDs of only those resources that you want AWS Config to list in the response. If you do not specify this
     * parameter, AWS Config lists all resources of the specified type that it has discovered.
     * </p>
     * 
     * @param resourceIds
     *        The IDs of only those resources that you want AWS Config to list in the response. If you do not specify
     *        this parameter, AWS Config lists all resources of the specified type that it has discovered.
     */

    public void setResourceIds(java.util.Collection<String> resourceIds) {
        if (resourceIds == null) {
            this.resourceIds = null;
            return;
        }

        this.resourceIds = new com.amazonaws.internal.SdkInternalList<String>(resourceIds);
    }

    /**
     * <p>
     * The IDs of only those resources that you want AWS Config to list in the response. If you do not specify this
     * parameter, AWS Config lists all resources of the specified type that it has discovered.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setResourceIds(java.util.Collection)} or {@link #withResourceIds(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param resourceIds
     *        The IDs of only those resources that you want AWS Config to list in the response. If you do not specify
     *        this parameter, AWS Config lists all resources of the specified type that it has discovered.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDiscoveredResourcesRequest withResourceIds(String... resourceIds) {
        if (this.resourceIds == null) {
            setResourceIds(new com.amazonaws.internal.SdkInternalList<String>(resourceIds.length));
        }
        for (String ele : resourceIds) {
            this.resourceIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The IDs of only those resources that you want AWS Config to list in the response. If you do not specify this
     * parameter, AWS Config lists all resources of the specified type that it has discovered.
     * </p>
     * 
     * @param resourceIds
     *        The IDs of only those resources that you want AWS Config to list in the response. If you do not specify
     *        this parameter, AWS Config lists all resources of the specified type that it has discovered.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDiscoveredResourcesRequest withResourceIds(java.util.Collection<String> resourceIds) {
        setResourceIds(resourceIds);
        return this;
    }

    /**
     * <p>
     * The custom name of only those resources that you want AWS Config to list in the response. If you do not specify
     * this parameter, AWS Config lists all resources of the specified type that it has discovered.
     * </p>
     * 
     * @param resourceName
     *        The custom name of only those resources that you want AWS Config to list in the response. If you do not
     *        specify this parameter, AWS Config lists all resources of the specified type that it has discovered.
     */

    public void setResourceName(String resourceName) {
        this.resourceName = resourceName;
    }

    /**
     * <p>
     * The custom name of only those resources that you want AWS Config to list in the response. If you do not specify
     * this parameter, AWS Config lists all resources of the specified type that it has discovered.
     * </p>
     * 
     * @return The custom name of only those resources that you want AWS Config to list in the response. If you do not
     *         specify this parameter, AWS Config lists all resources of the specified type that it has discovered.
     */

    public String getResourceName() {
        return this.resourceName;
    }

    /**
     * <p>
     * The custom name of only those resources that you want AWS Config to list in the response. If you do not specify
     * this parameter, AWS Config lists all resources of the specified type that it has discovered.
     * </p>
     * 
     * @param resourceName
     *        The custom name of only those resources that you want AWS Config to list in the response. If you do not
     *        specify this parameter, AWS Config lists all resources of the specified type that it has discovered.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDiscoveredResourcesRequest withResourceName(String resourceName) {
        setResourceName(resourceName);
        return this;
    }

    /**
     * <p>
     * The maximum number of resource identifiers returned on each page. The default is 100. You cannot specify a number
     * greater than 100. If you specify 0, AWS Config uses the default.
     * </p>
     * 
     * @param limit
     *        The maximum number of resource identifiers returned on each page. The default is 100. You cannot specify a
     *        number greater than 100. If you specify 0, AWS Config uses the default.
     */

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    /**
     * <p>
     * The maximum number of resource identifiers returned on each page. The default is 100. You cannot specify a number
     * greater than 100. If you specify 0, AWS Config uses the default.
     * </p>
     * 
     * @return The maximum number of resource identifiers returned on each page. The default is 100. You cannot specify
     *         a number greater than 100. If you specify 0, AWS Config uses the default.
     */

    public Integer getLimit() {
        return this.limit;
    }

    /**
     * <p>
     * The maximum number of resource identifiers returned on each page. The default is 100. You cannot specify a number
     * greater than 100. If you specify 0, AWS Config uses the default.
     * </p>
     * 
     * @param limit
     *        The maximum number of resource identifiers returned on each page. The default is 100. You cannot specify a
     *        number greater than 100. If you specify 0, AWS Config uses the default.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDiscoveredResourcesRequest withLimit(Integer limit) {
        setLimit(limit);
        return this;
    }

    /**
     * <p>
     * Specifies whether AWS Config includes deleted resources in the results. By default, deleted resources are not
     * included.
     * </p>
     * 
     * @param includeDeletedResources
     *        Specifies whether AWS Config includes deleted resources in the results. By default, deleted resources are
     *        not included.
     */

    public void setIncludeDeletedResources(Boolean includeDeletedResources) {
        this.includeDeletedResources = includeDeletedResources;
    }

    /**
     * <p>
     * Specifies whether AWS Config includes deleted resources in the results. By default, deleted resources are not
     * included.
     * </p>
     * 
     * @return Specifies whether AWS Config includes deleted resources in the results. By default, deleted resources are
     *         not included.
     */

    public Boolean getIncludeDeletedResources() {
        return this.includeDeletedResources;
    }

    /**
     * <p>
     * Specifies whether AWS Config includes deleted resources in the results. By default, deleted resources are not
     * included.
     * </p>
     * 
     * @param includeDeletedResources
     *        Specifies whether AWS Config includes deleted resources in the results. By default, deleted resources are
     *        not included.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDiscoveredResourcesRequest withIncludeDeletedResources(Boolean includeDeletedResources) {
        setIncludeDeletedResources(includeDeletedResources);
        return this;
    }

    /**
     * <p>
     * Specifies whether AWS Config includes deleted resources in the results. By default, deleted resources are not
     * included.
     * </p>
     * 
     * @return Specifies whether AWS Config includes deleted resources in the results. By default, deleted resources are
     *         not included.
     */

    public Boolean isIncludeDeletedResources() {
        return this.includeDeletedResources;
    }

    /**
     * <p>
     * The <code>nextToken</code> string returned on a previous page that you use to get the next page of results in a
     * paginated response.
     * </p>
     * 
     * @param nextToken
     *        The <code>nextToken</code> string returned on a previous page that you use to get the next page of results
     *        in a paginated response.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The <code>nextToken</code> string returned on a previous page that you use to get the next page of results in a
     * paginated response.
     * </p>
     * 
     * @return The <code>nextToken</code> string returned on a previous page that you use to get the next page of
     *         results in a paginated response.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The <code>nextToken</code> string returned on a previous page that you use to get the next page of results in a
     * paginated response.
     * </p>
     * 
     * @param nextToken
     *        The <code>nextToken</code> string returned on a previous page that you use to get the next page of results
     *        in a paginated response.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDiscoveredResourcesRequest withNextToken(String nextToken) {
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
        if (getResourceType() != null)
            sb.append("ResourceType: ").append(getResourceType()).append(",");
        if (getResourceIds() != null)
            sb.append("ResourceIds: ").append(getResourceIds()).append(",");
        if (getResourceName() != null)
            sb.append("ResourceName: ").append(getResourceName()).append(",");
        if (getLimit() != null)
            sb.append("Limit: ").append(getLimit()).append(",");
        if (getIncludeDeletedResources() != null)
            sb.append("IncludeDeletedResources: ").append(getIncludeDeletedResources()).append(",");
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

        if (obj instanceof ListDiscoveredResourcesRequest == false)
            return false;
        ListDiscoveredResourcesRequest other = (ListDiscoveredResourcesRequest) obj;
        if (other.getResourceType() == null ^ this.getResourceType() == null)
            return false;
        if (other.getResourceType() != null && other.getResourceType().equals(this.getResourceType()) == false)
            return false;
        if (other.getResourceIds() == null ^ this.getResourceIds() == null)
            return false;
        if (other.getResourceIds() != null && other.getResourceIds().equals(this.getResourceIds()) == false)
            return false;
        if (other.getResourceName() == null ^ this.getResourceName() == null)
            return false;
        if (other.getResourceName() != null && other.getResourceName().equals(this.getResourceName()) == false)
            return false;
        if (other.getLimit() == null ^ this.getLimit() == null)
            return false;
        if (other.getLimit() != null && other.getLimit().equals(this.getLimit()) == false)
            return false;
        if (other.getIncludeDeletedResources() == null ^ this.getIncludeDeletedResources() == null)
            return false;
        if (other.getIncludeDeletedResources() != null && other.getIncludeDeletedResources().equals(this.getIncludeDeletedResources()) == false)
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

        hashCode = prime * hashCode + ((getResourceType() == null) ? 0 : getResourceType().hashCode());
        hashCode = prime * hashCode + ((getResourceIds() == null) ? 0 : getResourceIds().hashCode());
        hashCode = prime * hashCode + ((getResourceName() == null) ? 0 : getResourceName().hashCode());
        hashCode = prime * hashCode + ((getLimit() == null) ? 0 : getLimit().hashCode());
        hashCode = prime * hashCode + ((getIncludeDeletedResources() == null) ? 0 : getIncludeDeletedResources().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListDiscoveredResourcesRequest clone() {
        return (ListDiscoveredResourcesRequest) super.clone();
    }

}
