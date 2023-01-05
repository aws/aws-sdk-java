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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/GetNetworkResourceRelationships"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetNetworkResourceRelationshipsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the global network.
     * </p>
     */
    private String globalNetworkId;
    /**
     * <p>
     * The ID of a core network.
     * </p>
     */
    private String coreNetworkId;
    /**
     * <p>
     * The ARN of the registered gateway.
     * </p>
     */
    private String registeredGatewayArn;
    /**
     * <p>
     * The Amazon Web Services Region.
     * </p>
     */
    private String awsRegion;
    /**
     * <p>
     * The Amazon Web Services account ID.
     * </p>
     */
    private String accountId;
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
     * The ARN of the gateway.
     * </p>
     */
    private String resourceArn;
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

    public GetNetworkResourceRelationshipsRequest withGlobalNetworkId(String globalNetworkId) {
        setGlobalNetworkId(globalNetworkId);
        return this;
    }

    /**
     * <p>
     * The ID of a core network.
     * </p>
     * 
     * @param coreNetworkId
     *        The ID of a core network.
     */

    public void setCoreNetworkId(String coreNetworkId) {
        this.coreNetworkId = coreNetworkId;
    }

    /**
     * <p>
     * The ID of a core network.
     * </p>
     * 
     * @return The ID of a core network.
     */

    public String getCoreNetworkId() {
        return this.coreNetworkId;
    }

    /**
     * <p>
     * The ID of a core network.
     * </p>
     * 
     * @param coreNetworkId
     *        The ID of a core network.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetNetworkResourceRelationshipsRequest withCoreNetworkId(String coreNetworkId) {
        setCoreNetworkId(coreNetworkId);
        return this;
    }

    /**
     * <p>
     * The ARN of the registered gateway.
     * </p>
     * 
     * @param registeredGatewayArn
     *        The ARN of the registered gateway.
     */

    public void setRegisteredGatewayArn(String registeredGatewayArn) {
        this.registeredGatewayArn = registeredGatewayArn;
    }

    /**
     * <p>
     * The ARN of the registered gateway.
     * </p>
     * 
     * @return The ARN of the registered gateway.
     */

    public String getRegisteredGatewayArn() {
        return this.registeredGatewayArn;
    }

    /**
     * <p>
     * The ARN of the registered gateway.
     * </p>
     * 
     * @param registeredGatewayArn
     *        The ARN of the registered gateway.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetNetworkResourceRelationshipsRequest withRegisteredGatewayArn(String registeredGatewayArn) {
        setRegisteredGatewayArn(registeredGatewayArn);
        return this;
    }

    /**
     * <p>
     * The Amazon Web Services Region.
     * </p>
     * 
     * @param awsRegion
     *        The Amazon Web Services Region.
     */

    public void setAwsRegion(String awsRegion) {
        this.awsRegion = awsRegion;
    }

    /**
     * <p>
     * The Amazon Web Services Region.
     * </p>
     * 
     * @return The Amazon Web Services Region.
     */

    public String getAwsRegion() {
        return this.awsRegion;
    }

    /**
     * <p>
     * The Amazon Web Services Region.
     * </p>
     * 
     * @param awsRegion
     *        The Amazon Web Services Region.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetNetworkResourceRelationshipsRequest withAwsRegion(String awsRegion) {
        setAwsRegion(awsRegion);
        return this;
    }

    /**
     * <p>
     * The Amazon Web Services account ID.
     * </p>
     * 
     * @param accountId
     *        The Amazon Web Services account ID.
     */

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    /**
     * <p>
     * The Amazon Web Services account ID.
     * </p>
     * 
     * @return The Amazon Web Services account ID.
     */

    public String getAccountId() {
        return this.accountId;
    }

    /**
     * <p>
     * The Amazon Web Services account ID.
     * </p>
     * 
     * @param accountId
     *        The Amazon Web Services account ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetNetworkResourceRelationshipsRequest withAccountId(String accountId) {
        setAccountId(accountId);
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

    public GetNetworkResourceRelationshipsRequest withResourceType(String resourceType) {
        setResourceType(resourceType);
        return this;
    }

    /**
     * <p>
     * The ARN of the gateway.
     * </p>
     * 
     * @param resourceArn
     *        The ARN of the gateway.
     */

    public void setResourceArn(String resourceArn) {
        this.resourceArn = resourceArn;
    }

    /**
     * <p>
     * The ARN of the gateway.
     * </p>
     * 
     * @return The ARN of the gateway.
     */

    public String getResourceArn() {
        return this.resourceArn;
    }

    /**
     * <p>
     * The ARN of the gateway.
     * </p>
     * 
     * @param resourceArn
     *        The ARN of the gateway.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetNetworkResourceRelationshipsRequest withResourceArn(String resourceArn) {
        setResourceArn(resourceArn);
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

    public GetNetworkResourceRelationshipsRequest withMaxResults(Integer maxResults) {
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

    public GetNetworkResourceRelationshipsRequest withNextToken(String nextToken) {
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
        if (getCoreNetworkId() != null)
            sb.append("CoreNetworkId: ").append(getCoreNetworkId()).append(",");
        if (getRegisteredGatewayArn() != null)
            sb.append("RegisteredGatewayArn: ").append(getRegisteredGatewayArn()).append(",");
        if (getAwsRegion() != null)
            sb.append("AwsRegion: ").append(getAwsRegion()).append(",");
        if (getAccountId() != null)
            sb.append("AccountId: ").append(getAccountId()).append(",");
        if (getResourceType() != null)
            sb.append("ResourceType: ").append(getResourceType()).append(",");
        if (getResourceArn() != null)
            sb.append("ResourceArn: ").append(getResourceArn()).append(",");
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

        if (obj instanceof GetNetworkResourceRelationshipsRequest == false)
            return false;
        GetNetworkResourceRelationshipsRequest other = (GetNetworkResourceRelationshipsRequest) obj;
        if (other.getGlobalNetworkId() == null ^ this.getGlobalNetworkId() == null)
            return false;
        if (other.getGlobalNetworkId() != null && other.getGlobalNetworkId().equals(this.getGlobalNetworkId()) == false)
            return false;
        if (other.getCoreNetworkId() == null ^ this.getCoreNetworkId() == null)
            return false;
        if (other.getCoreNetworkId() != null && other.getCoreNetworkId().equals(this.getCoreNetworkId()) == false)
            return false;
        if (other.getRegisteredGatewayArn() == null ^ this.getRegisteredGatewayArn() == null)
            return false;
        if (other.getRegisteredGatewayArn() != null && other.getRegisteredGatewayArn().equals(this.getRegisteredGatewayArn()) == false)
            return false;
        if (other.getAwsRegion() == null ^ this.getAwsRegion() == null)
            return false;
        if (other.getAwsRegion() != null && other.getAwsRegion().equals(this.getAwsRegion()) == false)
            return false;
        if (other.getAccountId() == null ^ this.getAccountId() == null)
            return false;
        if (other.getAccountId() != null && other.getAccountId().equals(this.getAccountId()) == false)
            return false;
        if (other.getResourceType() == null ^ this.getResourceType() == null)
            return false;
        if (other.getResourceType() != null && other.getResourceType().equals(this.getResourceType()) == false)
            return false;
        if (other.getResourceArn() == null ^ this.getResourceArn() == null)
            return false;
        if (other.getResourceArn() != null && other.getResourceArn().equals(this.getResourceArn()) == false)
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
        hashCode = prime * hashCode + ((getCoreNetworkId() == null) ? 0 : getCoreNetworkId().hashCode());
        hashCode = prime * hashCode + ((getRegisteredGatewayArn() == null) ? 0 : getRegisteredGatewayArn().hashCode());
        hashCode = prime * hashCode + ((getAwsRegion() == null) ? 0 : getAwsRegion().hashCode());
        hashCode = prime * hashCode + ((getAccountId() == null) ? 0 : getAccountId().hashCode());
        hashCode = prime * hashCode + ((getResourceType() == null) ? 0 : getResourceType().hashCode());
        hashCode = prime * hashCode + ((getResourceArn() == null) ? 0 : getResourceArn().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public GetNetworkResourceRelationshipsRequest clone() {
        return (GetNetworkResourceRelationshipsRequest) super.clone();
    }

}
