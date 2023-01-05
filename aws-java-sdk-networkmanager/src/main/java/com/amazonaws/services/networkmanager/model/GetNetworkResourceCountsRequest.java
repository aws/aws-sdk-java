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
package com.amazonaws.services.networkmanager.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/GetNetworkResourceCounts"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetNetworkResourceCountsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the global network.
     * </p>
     */
    private String globalNetworkId;
    /**
     * <p>
     * The resource type.
     * </p>
     * <p>
     * The following are the supported resource types for Direct Connect:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>dxcon</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>dx-gateway</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>dx-vif</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * The following are the supported resource types for Network Manager:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>connection</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>device</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>link</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>site</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * The following are the supported resource types for Amazon VPC:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>customer-gateway</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>transit-gateway</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>transit-gateway-attachment</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>transit-gateway-connect-peer</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>transit-gateway-route-table</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>vpn-connection</code>
     * </p>
     * </li>
     * </ul>
     */
    private String resourceType;
    /**
     * <p>
     * The maximum number of results to return.
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
     * The ID of the global network.
     * </p>
     * 
     * @param globalNetworkId
     *        The ID of the global network.
     */

    public void setGlobalNetworkId(String globalNetworkId) {
        this.globalNetworkId = globalNetworkId;
    }

    /**
     * <p>
     * The ID of the global network.
     * </p>
     * 
     * @return The ID of the global network.
     */

    public String getGlobalNetworkId() {
        return this.globalNetworkId;
    }

    /**
     * <p>
     * The ID of the global network.
     * </p>
     * 
     * @param globalNetworkId
     *        The ID of the global network.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetNetworkResourceCountsRequest withGlobalNetworkId(String globalNetworkId) {
        setGlobalNetworkId(globalNetworkId);
        return this;
    }

    /**
     * <p>
     * The resource type.
     * </p>
     * <p>
     * The following are the supported resource types for Direct Connect:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>dxcon</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>dx-gateway</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>dx-vif</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * The following are the supported resource types for Network Manager:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>connection</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>device</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>link</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>site</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * The following are the supported resource types for Amazon VPC:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>customer-gateway</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>transit-gateway</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>transit-gateway-attachment</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>transit-gateway-connect-peer</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>transit-gateway-route-table</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>vpn-connection</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param resourceType
     *        The resource type.</p>
     *        <p>
     *        The following are the supported resource types for Direct Connect:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>dxcon</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>dx-gateway</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>dx-vif</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        The following are the supported resource types for Network Manager:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>connection</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>device</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>link</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>site</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        The following are the supported resource types for Amazon VPC:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>customer-gateway</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>transit-gateway</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>transit-gateway-attachment</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>transit-gateway-connect-peer</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>transit-gateway-route-table</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>vpn-connection</code>
     *        </p>
     *        </li>
     */

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * <p>
     * The resource type.
     * </p>
     * <p>
     * The following are the supported resource types for Direct Connect:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>dxcon</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>dx-gateway</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>dx-vif</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * The following are the supported resource types for Network Manager:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>connection</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>device</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>link</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>site</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * The following are the supported resource types for Amazon VPC:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>customer-gateway</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>transit-gateway</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>transit-gateway-attachment</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>transit-gateway-connect-peer</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>transit-gateway-route-table</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>vpn-connection</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @return The resource type.</p>
     *         <p>
     *         The following are the supported resource types for Direct Connect:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>dxcon</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>dx-gateway</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>dx-vif</code>
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         The following are the supported resource types for Network Manager:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>connection</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>device</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>link</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>site</code>
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         The following are the supported resource types for Amazon VPC:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>customer-gateway</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>transit-gateway</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>transit-gateway-attachment</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>transit-gateway-connect-peer</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>transit-gateway-route-table</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>vpn-connection</code>
     *         </p>
     *         </li>
     */

    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * <p>
     * The resource type.
     * </p>
     * <p>
     * The following are the supported resource types for Direct Connect:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>dxcon</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>dx-gateway</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>dx-vif</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * The following are the supported resource types for Network Manager:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>connection</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>device</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>link</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>site</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * The following are the supported resource types for Amazon VPC:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>customer-gateway</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>transit-gateway</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>transit-gateway-attachment</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>transit-gateway-connect-peer</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>transit-gateway-route-table</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>vpn-connection</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param resourceType
     *        The resource type.</p>
     *        <p>
     *        The following are the supported resource types for Direct Connect:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>dxcon</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>dx-gateway</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>dx-vif</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        The following are the supported resource types for Network Manager:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>connection</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>device</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>link</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>site</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        The following are the supported resource types for Amazon VPC:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>customer-gateway</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>transit-gateway</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>transit-gateway-attachment</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>transit-gateway-connect-peer</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>transit-gateway-route-table</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>vpn-connection</code>
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetNetworkResourceCountsRequest withResourceType(String resourceType) {
        setResourceType(resourceType);
        return this;
    }

    /**
     * <p>
     * The maximum number of results to return.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to return.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return.
     * </p>
     * 
     * @return The maximum number of results to return.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to return.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetNetworkResourceCountsRequest withMaxResults(Integer maxResults) {
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

    public GetNetworkResourceCountsRequest withNextToken(String nextToken) {
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
        if (getGlobalNetworkId() != null)
            sb.append("GlobalNetworkId: ").append(getGlobalNetworkId()).append(",");
        if (getResourceType() != null)
            sb.append("ResourceType: ").append(getResourceType()).append(",");
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

        if (obj instanceof GetNetworkResourceCountsRequest == false)
            return false;
        GetNetworkResourceCountsRequest other = (GetNetworkResourceCountsRequest) obj;
        if (other.getGlobalNetworkId() == null ^ this.getGlobalNetworkId() == null)
            return false;
        if (other.getGlobalNetworkId() != null && other.getGlobalNetworkId().equals(this.getGlobalNetworkId()) == false)
            return false;
        if (other.getResourceType() == null ^ this.getResourceType() == null)
            return false;
        if (other.getResourceType() != null && other.getResourceType().equals(this.getResourceType()) == false)
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

        hashCode = prime * hashCode + ((getGlobalNetworkId() == null) ? 0 : getGlobalNetworkId().hashCode());
        hashCode = prime * hashCode + ((getResourceType() == null) ? 0 : getResourceType().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public GetNetworkResourceCountsRequest clone() {
        return (GetNetworkResourceCountsRequest) super.clone();
    }

}
