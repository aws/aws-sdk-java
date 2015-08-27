/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.config.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.config.AmazonConfig#listDiscoveredResources(ListDiscoveredResourcesRequest) ListDiscoveredResources operation}.
 * <p>
 * Accepts a resource type and returns a list of resource identifiers for
 * the resources of that type. A resource identifier includes the
 * resource type, ID, and (if available) the custom resource name. The
 * results consist of resources that AWS Config has discovered, including
 * those that AWS Config is not currently recording. You can narrow the
 * results to include only resources that have specific resource IDs or a
 * resource name.
 * </p>
 * <p>
 * <b>NOTE:</b>You can specify either resource IDs or a resource name but
 * not both in the same request.
 * </p>
 * <p>
 * The response is paginated, and by default AWS Config lists 100
 * resource identifiers on each page. You can customize this number with
 * the <code>limit</code> parameter. The response includes a
 * <code>nextToken</code> string, and to get the next
 * page of results, run the request again and enter this string for the
 * <code>nextToken</code> parameter.
 * </p>
 *
 * @see com.amazonaws.services.config.AmazonConfig#listDiscoveredResources(ListDiscoveredResourcesRequest)
 */
public class ListDiscoveredResourcesRequest extends AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * The type of resources that you want AWS Config to list in the
     * response.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AWS::EC2::CustomerGateway, AWS::EC2::EIP, AWS::EC2::Instance, AWS::EC2::InternetGateway, AWS::EC2::NetworkAcl, AWS::EC2::NetworkInterface, AWS::EC2::RouteTable, AWS::EC2::SecurityGroup, AWS::EC2::Subnet, AWS::CloudTrail::Trail, AWS::EC2::Volume, AWS::EC2::VPC, AWS::EC2::VPNConnection, AWS::EC2::VPNGateway
     */
    private String resourceType;

    /**
     * The IDs of only those resources that you want AWS Config to list in
     * the response. If you do not specify this parameter, AWS Config lists
     * all resources of the specified type that it has discovered.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> resourceIds;

    /**
     * The custom name of only those resources that you want AWS Config to
     * list in the response. If you do not specify this parameter, AWS Config
     * lists all resources of the specified type that it has discovered.
     */
    private String resourceName;

    /**
     * The maximum number of resource identifiers returned on each page. The
     * default is 100. You cannot specify a limit greater than 100. If you
     * specify 0, AWS Config uses the default.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 100<br/>
     */
    private Integer limit;

    /**
     * Specifies whether AWS Config includes deleted resources in the
     * results. By default, deleted resources are not included.
     */
    private Boolean includeDeletedResources;

    /**
     * The <code>nextToken</code> string returned on a previous page that you
     * use to get the next page of results in a paginated response.
     */
    private String nextToken;

    /**
     * The type of resources that you want AWS Config to list in the
     * response.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AWS::EC2::CustomerGateway, AWS::EC2::EIP, AWS::EC2::Instance, AWS::EC2::InternetGateway, AWS::EC2::NetworkAcl, AWS::EC2::NetworkInterface, AWS::EC2::RouteTable, AWS::EC2::SecurityGroup, AWS::EC2::Subnet, AWS::CloudTrail::Trail, AWS::EC2::Volume, AWS::EC2::VPC, AWS::EC2::VPNConnection, AWS::EC2::VPNGateway
     *
     * @return The type of resources that you want AWS Config to list in the
     *         response.
     *
     * @see ResourceType
     */
    public String getResourceType() {
        return resourceType;
    }
    
    /**
     * The type of resources that you want AWS Config to list in the
     * response.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AWS::EC2::CustomerGateway, AWS::EC2::EIP, AWS::EC2::Instance, AWS::EC2::InternetGateway, AWS::EC2::NetworkAcl, AWS::EC2::NetworkInterface, AWS::EC2::RouteTable, AWS::EC2::SecurityGroup, AWS::EC2::Subnet, AWS::CloudTrail::Trail, AWS::EC2::Volume, AWS::EC2::VPC, AWS::EC2::VPNConnection, AWS::EC2::VPNGateway
     *
     * @param resourceType The type of resources that you want AWS Config to list in the
     *         response.
     *
     * @see ResourceType
     */
    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }
    
    /**
     * The type of resources that you want AWS Config to list in the
     * response.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AWS::EC2::CustomerGateway, AWS::EC2::EIP, AWS::EC2::Instance, AWS::EC2::InternetGateway, AWS::EC2::NetworkAcl, AWS::EC2::NetworkInterface, AWS::EC2::RouteTable, AWS::EC2::SecurityGroup, AWS::EC2::Subnet, AWS::CloudTrail::Trail, AWS::EC2::Volume, AWS::EC2::VPC, AWS::EC2::VPNConnection, AWS::EC2::VPNGateway
     *
     * @param resourceType The type of resources that you want AWS Config to list in the
     *         response.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see ResourceType
     */
    public ListDiscoveredResourcesRequest withResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }

    /**
     * The type of resources that you want AWS Config to list in the
     * response.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AWS::EC2::CustomerGateway, AWS::EC2::EIP, AWS::EC2::Instance, AWS::EC2::InternetGateway, AWS::EC2::NetworkAcl, AWS::EC2::NetworkInterface, AWS::EC2::RouteTable, AWS::EC2::SecurityGroup, AWS::EC2::Subnet, AWS::CloudTrail::Trail, AWS::EC2::Volume, AWS::EC2::VPC, AWS::EC2::VPNConnection, AWS::EC2::VPNGateway
     *
     * @param resourceType The type of resources that you want AWS Config to list in the
     *         response.
     *
     * @see ResourceType
     */
    public void setResourceType(ResourceType resourceType) {
        this.resourceType = resourceType.toString();
    }
    
    /**
     * The type of resources that you want AWS Config to list in the
     * response.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AWS::EC2::CustomerGateway, AWS::EC2::EIP, AWS::EC2::Instance, AWS::EC2::InternetGateway, AWS::EC2::NetworkAcl, AWS::EC2::NetworkInterface, AWS::EC2::RouteTable, AWS::EC2::SecurityGroup, AWS::EC2::Subnet, AWS::CloudTrail::Trail, AWS::EC2::Volume, AWS::EC2::VPC, AWS::EC2::VPNConnection, AWS::EC2::VPNGateway
     *
     * @param resourceType The type of resources that you want AWS Config to list in the
     *         response.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see ResourceType
     */
    public ListDiscoveredResourcesRequest withResourceType(ResourceType resourceType) {
        this.resourceType = resourceType.toString();
        return this;
    }

    /**
     * The IDs of only those resources that you want AWS Config to list in
     * the response. If you do not specify this parameter, AWS Config lists
     * all resources of the specified type that it has discovered.
     *
     * @return The IDs of only those resources that you want AWS Config to list in
     *         the response. If you do not specify this parameter, AWS Config lists
     *         all resources of the specified type that it has discovered.
     */
    public java.util.List<String> getResourceIds() {
        if (resourceIds == null) {
              resourceIds = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              resourceIds.setAutoConstruct(true);
        }
        return resourceIds;
    }
    
    /**
     * The IDs of only those resources that you want AWS Config to list in
     * the response. If you do not specify this parameter, AWS Config lists
     * all resources of the specified type that it has discovered.
     *
     * @param resourceIds The IDs of only those resources that you want AWS Config to list in
     *         the response. If you do not specify this parameter, AWS Config lists
     *         all resources of the specified type that it has discovered.
     */
    public void setResourceIds(java.util.Collection<String> resourceIds) {
        if (resourceIds == null) {
            this.resourceIds = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> resourceIdsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(resourceIds.size());
        resourceIdsCopy.addAll(resourceIds);
        this.resourceIds = resourceIdsCopy;
    }
    
    /**
     * The IDs of only those resources that you want AWS Config to list in
     * the response. If you do not specify this parameter, AWS Config lists
     * all resources of the specified type that it has discovered.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setResourceIds(java.util.Collection)} or {@link
     * #withResourceIds(java.util.Collection)} if you want to override the
     * existing values.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param resourceIds The IDs of only those resources that you want AWS Config to list in
     *         the response. If you do not specify this parameter, AWS Config lists
     *         all resources of the specified type that it has discovered.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ListDiscoveredResourcesRequest withResourceIds(String... resourceIds) {
        if (getResourceIds() == null) setResourceIds(new java.util.ArrayList<String>(resourceIds.length));
        for (String value : resourceIds) {
            getResourceIds().add(value);
        }
        return this;
    }
    
    /**
     * The IDs of only those resources that you want AWS Config to list in
     * the response. If you do not specify this parameter, AWS Config lists
     * all resources of the specified type that it has discovered.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param resourceIds The IDs of only those resources that you want AWS Config to list in
     *         the response. If you do not specify this parameter, AWS Config lists
     *         all resources of the specified type that it has discovered.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ListDiscoveredResourcesRequest withResourceIds(java.util.Collection<String> resourceIds) {
        if (resourceIds == null) {
            this.resourceIds = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> resourceIdsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(resourceIds.size());
            resourceIdsCopy.addAll(resourceIds);
            this.resourceIds = resourceIdsCopy;
        }

        return this;
    }

    /**
     * The custom name of only those resources that you want AWS Config to
     * list in the response. If you do not specify this parameter, AWS Config
     * lists all resources of the specified type that it has discovered.
     *
     * @return The custom name of only those resources that you want AWS Config to
     *         list in the response. If you do not specify this parameter, AWS Config
     *         lists all resources of the specified type that it has discovered.
     */
    public String getResourceName() {
        return resourceName;
    }
    
    /**
     * The custom name of only those resources that you want AWS Config to
     * list in the response. If you do not specify this parameter, AWS Config
     * lists all resources of the specified type that it has discovered.
     *
     * @param resourceName The custom name of only those resources that you want AWS Config to
     *         list in the response. If you do not specify this parameter, AWS Config
     *         lists all resources of the specified type that it has discovered.
     */
    public void setResourceName(String resourceName) {
        this.resourceName = resourceName;
    }
    
    /**
     * The custom name of only those resources that you want AWS Config to
     * list in the response. If you do not specify this parameter, AWS Config
     * lists all resources of the specified type that it has discovered.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param resourceName The custom name of only those resources that you want AWS Config to
     *         list in the response. If you do not specify this parameter, AWS Config
     *         lists all resources of the specified type that it has discovered.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ListDiscoveredResourcesRequest withResourceName(String resourceName) {
        this.resourceName = resourceName;
        return this;
    }

    /**
     * The maximum number of resource identifiers returned on each page. The
     * default is 100. You cannot specify a limit greater than 100. If you
     * specify 0, AWS Config uses the default.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 100<br/>
     *
     * @return The maximum number of resource identifiers returned on each page. The
     *         default is 100. You cannot specify a limit greater than 100. If you
     *         specify 0, AWS Config uses the default.
     */
    public Integer getLimit() {
        return limit;
    }
    
    /**
     * The maximum number of resource identifiers returned on each page. The
     * default is 100. You cannot specify a limit greater than 100. If you
     * specify 0, AWS Config uses the default.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 100<br/>
     *
     * @param limit The maximum number of resource identifiers returned on each page. The
     *         default is 100. You cannot specify a limit greater than 100. If you
     *         specify 0, AWS Config uses the default.
     */
    public void setLimit(Integer limit) {
        this.limit = limit;
    }
    
    /**
     * The maximum number of resource identifiers returned on each page. The
     * default is 100. You cannot specify a limit greater than 100. If you
     * specify 0, AWS Config uses the default.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 100<br/>
     *
     * @param limit The maximum number of resource identifiers returned on each page. The
     *         default is 100. You cannot specify a limit greater than 100. If you
     *         specify 0, AWS Config uses the default.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ListDiscoveredResourcesRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * Specifies whether AWS Config includes deleted resources in the
     * results. By default, deleted resources are not included.
     *
     * @return Specifies whether AWS Config includes deleted resources in the
     *         results. By default, deleted resources are not included.
     */
    public Boolean isIncludeDeletedResources() {
        return includeDeletedResources;
    }
    
    /**
     * Specifies whether AWS Config includes deleted resources in the
     * results. By default, deleted resources are not included.
     *
     * @param includeDeletedResources Specifies whether AWS Config includes deleted resources in the
     *         results. By default, deleted resources are not included.
     */
    public void setIncludeDeletedResources(Boolean includeDeletedResources) {
        this.includeDeletedResources = includeDeletedResources;
    }
    
    /**
     * Specifies whether AWS Config includes deleted resources in the
     * results. By default, deleted resources are not included.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param includeDeletedResources Specifies whether AWS Config includes deleted resources in the
     *         results. By default, deleted resources are not included.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ListDiscoveredResourcesRequest withIncludeDeletedResources(Boolean includeDeletedResources) {
        this.includeDeletedResources = includeDeletedResources;
        return this;
    }

    /**
     * Specifies whether AWS Config includes deleted resources in the
     * results. By default, deleted resources are not included.
     *
     * @return Specifies whether AWS Config includes deleted resources in the
     *         results. By default, deleted resources are not included.
     */
    public Boolean getIncludeDeletedResources() {
        return includeDeletedResources;
    }

    /**
     * The <code>nextToken</code> string returned on a previous page that you
     * use to get the next page of results in a paginated response.
     *
     * @return The <code>nextToken</code> string returned on a previous page that you
     *         use to get the next page of results in a paginated response.
     */
    public String getNextToken() {
        return nextToken;
    }
    
    /**
     * The <code>nextToken</code> string returned on a previous page that you
     * use to get the next page of results in a paginated response.
     *
     * @param nextToken The <code>nextToken</code> string returned on a previous page that you
     *         use to get the next page of results in a paginated response.
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }
    
    /**
     * The <code>nextToken</code> string returned on a previous page that you
     * use to get the next page of results in a paginated response.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param nextToken The <code>nextToken</code> string returned on a previous page that you
     *         use to get the next page of results in a paginated response.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ListDiscoveredResourcesRequest withNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getResourceType() != null) sb.append("ResourceType: " + getResourceType() + ",");
        if (getResourceIds() != null) sb.append("ResourceIds: " + getResourceIds() + ",");
        if (getResourceName() != null) sb.append("ResourceName: " + getResourceName() + ",");
        if (getLimit() != null) sb.append("Limit: " + getLimit() + ",");
        if (isIncludeDeletedResources() != null) sb.append("IncludeDeletedResources: " + isIncludeDeletedResources() + ",");
        if (getNextToken() != null) sb.append("NextToken: " + getNextToken() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getResourceType() == null) ? 0 : getResourceType().hashCode()); 
        hashCode = prime * hashCode + ((getResourceIds() == null) ? 0 : getResourceIds().hashCode()); 
        hashCode = prime * hashCode + ((getResourceName() == null) ? 0 : getResourceName().hashCode()); 
        hashCode = prime * hashCode + ((getLimit() == null) ? 0 : getLimit().hashCode()); 
        hashCode = prime * hashCode + ((isIncludeDeletedResources() == null) ? 0 : isIncludeDeletedResources().hashCode()); 
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ListDiscoveredResourcesRequest == false) return false;
        ListDiscoveredResourcesRequest other = (ListDiscoveredResourcesRequest)obj;
        
        if (other.getResourceType() == null ^ this.getResourceType() == null) return false;
        if (other.getResourceType() != null && other.getResourceType().equals(this.getResourceType()) == false) return false; 
        if (other.getResourceIds() == null ^ this.getResourceIds() == null) return false;
        if (other.getResourceIds() != null && other.getResourceIds().equals(this.getResourceIds()) == false) return false; 
        if (other.getResourceName() == null ^ this.getResourceName() == null) return false;
        if (other.getResourceName() != null && other.getResourceName().equals(this.getResourceName()) == false) return false; 
        if (other.getLimit() == null ^ this.getLimit() == null) return false;
        if (other.getLimit() != null && other.getLimit().equals(this.getLimit()) == false) return false; 
        if (other.isIncludeDeletedResources() == null ^ this.isIncludeDeletedResources() == null) return false;
        if (other.isIncludeDeletedResources() != null && other.isIncludeDeletedResources().equals(this.isIncludeDeletedResources()) == false) return false; 
        if (other.getNextToken() == null ^ this.getNextToken() == null) return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false) return false; 
        return true;
    }
    
    @Override
    public ListDiscoveredResourcesRequest clone() {
        
            return (ListDiscoveredResourcesRequest) super.clone();
    }

}
    