/*
 * Copyright 2010-2014 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Container for the parameters to the {@link com.amazonaws.services.config.AmazonConfig#getResourceConfigHistory(GetResourceConfigHistoryRequest) GetResourceConfigHistory operation}.
 * <p>
 * Returns a list of configuration items for the specified resource. The
 * list contains details about each state of the resource during the
 * specified time interval. You can specify a <code>limit</code> on the
 * number of results returned on the page. If a limit is specified, a
 * <code>nextToken</code> is returned as part of the result that you can
 * use to continue this request.
 * </p>
 * <p>
 * <b>NOTE:</b> Each call to the API is limited to span a duration of
 * seven days. It is likely that the number of records returned is
 * smaller than the specified limit. In such cases, you can make another
 * call, using the nextToken .
 * </p>
 *
 * @see com.amazonaws.services.config.AmazonConfig#getResourceConfigHistory(GetResourceConfigHistoryRequest)
 */
public class GetResourceConfigHistoryRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * The resource type.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AWS::EC2::CustomerGateway, AWS::EC2::EIP, AWS::EC2::Instance, AWS::EC2::InternetGateway, AWS::EC2::NetworkAcl, AWS::EC2::NetworkInterface, AWS::EC2::RouteTable, AWS::EC2::SecurityGroup, AWS::EC2::Subnet, AWS::CloudTrail::Trail, AWS::EC2::Volume, AWS::EC2::VPC, AWS::EC2::VPNConnection, AWS::EC2::VPNGateway
     */
    private String resourceType;

    /**
     * The ID of the resource (for example., <code>sg-xxxxxx</code>).
     */
    private String resourceId;

    /**
     * The time stamp that indicates a later time. If not specified, current
     * time is taken.
     */
    private java.util.Date laterTime;

    /**
     * The time stamp that indicates an earlier time. If not specified, the
     * action returns paginated results that contain configuration items that
     * start from when the first configuration item was recorded.
     */
    private java.util.Date earlierTime;

    /**
     * The chronological order for configuration items listed. By default the
     * results are listed in reverse chronological order.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Reverse, Forward
     */
    private String chronologicalOrder;

    /**
     * The maximum number of configuration items returned in each page. The
     * default is 10. You cannot specify a limit greater than 100.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 100<br/>
     */
    private Integer limit;

    /**
     * An optional parameter used for pagination of the results.
     */
    private String nextToken;

    /**
     * The resource type.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AWS::EC2::CustomerGateway, AWS::EC2::EIP, AWS::EC2::Instance, AWS::EC2::InternetGateway, AWS::EC2::NetworkAcl, AWS::EC2::NetworkInterface, AWS::EC2::RouteTable, AWS::EC2::SecurityGroup, AWS::EC2::Subnet, AWS::CloudTrail::Trail, AWS::EC2::Volume, AWS::EC2::VPC, AWS::EC2::VPNConnection, AWS::EC2::VPNGateway
     *
     * @return The resource type.
     *
     * @see ResourceType
     */
    public String getResourceType() {
        return resourceType;
    }
    
    /**
     * The resource type.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AWS::EC2::CustomerGateway, AWS::EC2::EIP, AWS::EC2::Instance, AWS::EC2::InternetGateway, AWS::EC2::NetworkAcl, AWS::EC2::NetworkInterface, AWS::EC2::RouteTable, AWS::EC2::SecurityGroup, AWS::EC2::Subnet, AWS::CloudTrail::Trail, AWS::EC2::Volume, AWS::EC2::VPC, AWS::EC2::VPNConnection, AWS::EC2::VPNGateway
     *
     * @param resourceType The resource type.
     *
     * @see ResourceType
     */
    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }
    
    /**
     * The resource type.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AWS::EC2::CustomerGateway, AWS::EC2::EIP, AWS::EC2::Instance, AWS::EC2::InternetGateway, AWS::EC2::NetworkAcl, AWS::EC2::NetworkInterface, AWS::EC2::RouteTable, AWS::EC2::SecurityGroup, AWS::EC2::Subnet, AWS::CloudTrail::Trail, AWS::EC2::Volume, AWS::EC2::VPC, AWS::EC2::VPNConnection, AWS::EC2::VPNGateway
     *
     * @param resourceType The resource type.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see ResourceType
     */
    public GetResourceConfigHistoryRequest withResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }

    /**
     * The resource type.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AWS::EC2::CustomerGateway, AWS::EC2::EIP, AWS::EC2::Instance, AWS::EC2::InternetGateway, AWS::EC2::NetworkAcl, AWS::EC2::NetworkInterface, AWS::EC2::RouteTable, AWS::EC2::SecurityGroup, AWS::EC2::Subnet, AWS::CloudTrail::Trail, AWS::EC2::Volume, AWS::EC2::VPC, AWS::EC2::VPNConnection, AWS::EC2::VPNGateway
     *
     * @param resourceType The resource type.
     *
     * @see ResourceType
     */
    public void setResourceType(ResourceType resourceType) {
        this.resourceType = resourceType.toString();
    }
    
    /**
     * The resource type.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AWS::EC2::CustomerGateway, AWS::EC2::EIP, AWS::EC2::Instance, AWS::EC2::InternetGateway, AWS::EC2::NetworkAcl, AWS::EC2::NetworkInterface, AWS::EC2::RouteTable, AWS::EC2::SecurityGroup, AWS::EC2::Subnet, AWS::CloudTrail::Trail, AWS::EC2::Volume, AWS::EC2::VPC, AWS::EC2::VPNConnection, AWS::EC2::VPNGateway
     *
     * @param resourceType The resource type.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see ResourceType
     */
    public GetResourceConfigHistoryRequest withResourceType(ResourceType resourceType) {
        this.resourceType = resourceType.toString();
        return this;
    }

    /**
     * The ID of the resource (for example., <code>sg-xxxxxx</code>).
     *
     * @return The ID of the resource (for example., <code>sg-xxxxxx</code>).
     */
    public String getResourceId() {
        return resourceId;
    }
    
    /**
     * The ID of the resource (for example., <code>sg-xxxxxx</code>).
     *
     * @param resourceId The ID of the resource (for example., <code>sg-xxxxxx</code>).
     */
    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }
    
    /**
     * The ID of the resource (for example., <code>sg-xxxxxx</code>).
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param resourceId The ID of the resource (for example., <code>sg-xxxxxx</code>).
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public GetResourceConfigHistoryRequest withResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    /**
     * The time stamp that indicates a later time. If not specified, current
     * time is taken.
     *
     * @return The time stamp that indicates a later time. If not specified, current
     *         time is taken.
     */
    public java.util.Date getLaterTime() {
        return laterTime;
    }
    
    /**
     * The time stamp that indicates a later time. If not specified, current
     * time is taken.
     *
     * @param laterTime The time stamp that indicates a later time. If not specified, current
     *         time is taken.
     */
    public void setLaterTime(java.util.Date laterTime) {
        this.laterTime = laterTime;
    }
    
    /**
     * The time stamp that indicates a later time. If not specified, current
     * time is taken.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param laterTime The time stamp that indicates a later time. If not specified, current
     *         time is taken.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public GetResourceConfigHistoryRequest withLaterTime(java.util.Date laterTime) {
        this.laterTime = laterTime;
        return this;
    }

    /**
     * The time stamp that indicates an earlier time. If not specified, the
     * action returns paginated results that contain configuration items that
     * start from when the first configuration item was recorded.
     *
     * @return The time stamp that indicates an earlier time. If not specified, the
     *         action returns paginated results that contain configuration items that
     *         start from when the first configuration item was recorded.
     */
    public java.util.Date getEarlierTime() {
        return earlierTime;
    }
    
    /**
     * The time stamp that indicates an earlier time. If not specified, the
     * action returns paginated results that contain configuration items that
     * start from when the first configuration item was recorded.
     *
     * @param earlierTime The time stamp that indicates an earlier time. If not specified, the
     *         action returns paginated results that contain configuration items that
     *         start from when the first configuration item was recorded.
     */
    public void setEarlierTime(java.util.Date earlierTime) {
        this.earlierTime = earlierTime;
    }
    
    /**
     * The time stamp that indicates an earlier time. If not specified, the
     * action returns paginated results that contain configuration items that
     * start from when the first configuration item was recorded.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param earlierTime The time stamp that indicates an earlier time. If not specified, the
     *         action returns paginated results that contain configuration items that
     *         start from when the first configuration item was recorded.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public GetResourceConfigHistoryRequest withEarlierTime(java.util.Date earlierTime) {
        this.earlierTime = earlierTime;
        return this;
    }

    /**
     * The chronological order for configuration items listed. By default the
     * results are listed in reverse chronological order.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Reverse, Forward
     *
     * @return The chronological order for configuration items listed. By default the
     *         results are listed in reverse chronological order.
     *
     * @see ChronologicalOrder
     */
    public String getChronologicalOrder() {
        return chronologicalOrder;
    }
    
    /**
     * The chronological order for configuration items listed. By default the
     * results are listed in reverse chronological order.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Reverse, Forward
     *
     * @param chronologicalOrder The chronological order for configuration items listed. By default the
     *         results are listed in reverse chronological order.
     *
     * @see ChronologicalOrder
     */
    public void setChronologicalOrder(String chronologicalOrder) {
        this.chronologicalOrder = chronologicalOrder;
    }
    
    /**
     * The chronological order for configuration items listed. By default the
     * results are listed in reverse chronological order.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Reverse, Forward
     *
     * @param chronologicalOrder The chronological order for configuration items listed. By default the
     *         results are listed in reverse chronological order.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see ChronologicalOrder
     */
    public GetResourceConfigHistoryRequest withChronologicalOrder(String chronologicalOrder) {
        this.chronologicalOrder = chronologicalOrder;
        return this;
    }

    /**
     * The chronological order for configuration items listed. By default the
     * results are listed in reverse chronological order.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Reverse, Forward
     *
     * @param chronologicalOrder The chronological order for configuration items listed. By default the
     *         results are listed in reverse chronological order.
     *
     * @see ChronologicalOrder
     */
    public void setChronologicalOrder(ChronologicalOrder chronologicalOrder) {
        this.chronologicalOrder = chronologicalOrder.toString();
    }
    
    /**
     * The chronological order for configuration items listed. By default the
     * results are listed in reverse chronological order.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Reverse, Forward
     *
     * @param chronologicalOrder The chronological order for configuration items listed. By default the
     *         results are listed in reverse chronological order.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see ChronologicalOrder
     */
    public GetResourceConfigHistoryRequest withChronologicalOrder(ChronologicalOrder chronologicalOrder) {
        this.chronologicalOrder = chronologicalOrder.toString();
        return this;
    }

    /**
     * The maximum number of configuration items returned in each page. The
     * default is 10. You cannot specify a limit greater than 100.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 100<br/>
     *
     * @return The maximum number of configuration items returned in each page. The
     *         default is 10. You cannot specify a limit greater than 100.
     */
    public Integer getLimit() {
        return limit;
    }
    
    /**
     * The maximum number of configuration items returned in each page. The
     * default is 10. You cannot specify a limit greater than 100.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 100<br/>
     *
     * @param limit The maximum number of configuration items returned in each page. The
     *         default is 10. You cannot specify a limit greater than 100.
     */
    public void setLimit(Integer limit) {
        this.limit = limit;
    }
    
    /**
     * The maximum number of configuration items returned in each page. The
     * default is 10. You cannot specify a limit greater than 100.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 100<br/>
     *
     * @param limit The maximum number of configuration items returned in each page. The
     *         default is 10. You cannot specify a limit greater than 100.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public GetResourceConfigHistoryRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * An optional parameter used for pagination of the results.
     *
     * @return An optional parameter used for pagination of the results.
     */
    public String getNextToken() {
        return nextToken;
    }
    
    /**
     * An optional parameter used for pagination of the results.
     *
     * @param nextToken An optional parameter used for pagination of the results.
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }
    
    /**
     * An optional parameter used for pagination of the results.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param nextToken An optional parameter used for pagination of the results.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public GetResourceConfigHistoryRequest withNextToken(String nextToken) {
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
        if (getResourceId() != null) sb.append("ResourceId: " + getResourceId() + ",");
        if (getLaterTime() != null) sb.append("LaterTime: " + getLaterTime() + ",");
        if (getEarlierTime() != null) sb.append("EarlierTime: " + getEarlierTime() + ",");
        if (getChronologicalOrder() != null) sb.append("ChronologicalOrder: " + getChronologicalOrder() + ",");
        if (getLimit() != null) sb.append("Limit: " + getLimit() + ",");
        if (getNextToken() != null) sb.append("NextToken: " + getNextToken() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getResourceType() == null) ? 0 : getResourceType().hashCode()); 
        hashCode = prime * hashCode + ((getResourceId() == null) ? 0 : getResourceId().hashCode()); 
        hashCode = prime * hashCode + ((getLaterTime() == null) ? 0 : getLaterTime().hashCode()); 
        hashCode = prime * hashCode + ((getEarlierTime() == null) ? 0 : getEarlierTime().hashCode()); 
        hashCode = prime * hashCode + ((getChronologicalOrder() == null) ? 0 : getChronologicalOrder().hashCode()); 
        hashCode = prime * hashCode + ((getLimit() == null) ? 0 : getLimit().hashCode()); 
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof GetResourceConfigHistoryRequest == false) return false;
        GetResourceConfigHistoryRequest other = (GetResourceConfigHistoryRequest)obj;
        
        if (other.getResourceType() == null ^ this.getResourceType() == null) return false;
        if (other.getResourceType() != null && other.getResourceType().equals(this.getResourceType()) == false) return false; 
        if (other.getResourceId() == null ^ this.getResourceId() == null) return false;
        if (other.getResourceId() != null && other.getResourceId().equals(this.getResourceId()) == false) return false; 
        if (other.getLaterTime() == null ^ this.getLaterTime() == null) return false;
        if (other.getLaterTime() != null && other.getLaterTime().equals(this.getLaterTime()) == false) return false; 
        if (other.getEarlierTime() == null ^ this.getEarlierTime() == null) return false;
        if (other.getEarlierTime() != null && other.getEarlierTime().equals(this.getEarlierTime()) == false) return false; 
        if (other.getChronologicalOrder() == null ^ this.getChronologicalOrder() == null) return false;
        if (other.getChronologicalOrder() != null && other.getChronologicalOrder().equals(this.getChronologicalOrder()) == false) return false; 
        if (other.getLimit() == null ^ this.getLimit() == null) return false;
        if (other.getLimit() != null && other.getLimit().equals(this.getLimit()) == false) return false; 
        if (other.getNextToken() == null ^ this.getNextToken() == null) return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false) return false; 
        return true;
    }
    
}
    