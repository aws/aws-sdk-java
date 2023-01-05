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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes a network resource.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/NetworkResource" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class NetworkResource implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ARN of the gateway.
     * </p>
     */
    private String registeredGatewayArn;
    /**
     * <p>
     * The ID of a core network.
     * </p>
     */
    private String coreNetworkId;
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
     * The ID of the resource.
     * </p>
     */
    private String resourceId;
    /**
     * <p>
     * The ARN of the resource.
     * </p>
     */
    private String resourceArn;
    /**
     * <p>
     * Information about the resource, in JSON format. Network Manager gets this information by describing the resource
     * using its Describe API call.
     * </p>
     */
    private String definition;
    /**
     * <p>
     * The time that the resource definition was retrieved.
     * </p>
     */
    private java.util.Date definitionTimestamp;
    /**
     * <p>
     * The tags.
     * </p>
     */
    private java.util.List<Tag> tags;
    /**
     * <p>
     * The resource metadata.
     * </p>
     */
    private java.util.Map<String, String> metadata;

    /**
     * <p>
     * The ARN of the gateway.
     * </p>
     * 
     * @param registeredGatewayArn
     *        The ARN of the gateway.
     */

    public void setRegisteredGatewayArn(String registeredGatewayArn) {
        this.registeredGatewayArn = registeredGatewayArn;
    }

    /**
     * <p>
     * The ARN of the gateway.
     * </p>
     * 
     * @return The ARN of the gateway.
     */

    public String getRegisteredGatewayArn() {
        return this.registeredGatewayArn;
    }

    /**
     * <p>
     * The ARN of the gateway.
     * </p>
     * 
     * @param registeredGatewayArn
     *        The ARN of the gateway.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NetworkResource withRegisteredGatewayArn(String registeredGatewayArn) {
        setRegisteredGatewayArn(registeredGatewayArn);
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

    public NetworkResource withCoreNetworkId(String coreNetworkId) {
        setCoreNetworkId(coreNetworkId);
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

    public NetworkResource withAwsRegion(String awsRegion) {
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

    public NetworkResource withAccountId(String accountId) {
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

    public NetworkResource withResourceType(String resourceType) {
        setResourceType(resourceType);
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

    public NetworkResource withResourceId(String resourceId) {
        setResourceId(resourceId);
        return this;
    }

    /**
     * <p>
     * The ARN of the resource.
     * </p>
     * 
     * @param resourceArn
     *        The ARN of the resource.
     */

    public void setResourceArn(String resourceArn) {
        this.resourceArn = resourceArn;
    }

    /**
     * <p>
     * The ARN of the resource.
     * </p>
     * 
     * @return The ARN of the resource.
     */

    public String getResourceArn() {
        return this.resourceArn;
    }

    /**
     * <p>
     * The ARN of the resource.
     * </p>
     * 
     * @param resourceArn
     *        The ARN of the resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NetworkResource withResourceArn(String resourceArn) {
        setResourceArn(resourceArn);
        return this;
    }

    /**
     * <p>
     * Information about the resource, in JSON format. Network Manager gets this information by describing the resource
     * using its Describe API call.
     * </p>
     * 
     * @param definition
     *        Information about the resource, in JSON format. Network Manager gets this information by describing the
     *        resource using its Describe API call.
     */

    public void setDefinition(String definition) {
        this.definition = definition;
    }

    /**
     * <p>
     * Information about the resource, in JSON format. Network Manager gets this information by describing the resource
     * using its Describe API call.
     * </p>
     * 
     * @return Information about the resource, in JSON format. Network Manager gets this information by describing the
     *         resource using its Describe API call.
     */

    public String getDefinition() {
        return this.definition;
    }

    /**
     * <p>
     * Information about the resource, in JSON format. Network Manager gets this information by describing the resource
     * using its Describe API call.
     * </p>
     * 
     * @param definition
     *        Information about the resource, in JSON format. Network Manager gets this information by describing the
     *        resource using its Describe API call.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NetworkResource withDefinition(String definition) {
        setDefinition(definition);
        return this;
    }

    /**
     * <p>
     * The time that the resource definition was retrieved.
     * </p>
     * 
     * @param definitionTimestamp
     *        The time that the resource definition was retrieved.
     */

    public void setDefinitionTimestamp(java.util.Date definitionTimestamp) {
        this.definitionTimestamp = definitionTimestamp;
    }

    /**
     * <p>
     * The time that the resource definition was retrieved.
     * </p>
     * 
     * @return The time that the resource definition was retrieved.
     */

    public java.util.Date getDefinitionTimestamp() {
        return this.definitionTimestamp;
    }

    /**
     * <p>
     * The time that the resource definition was retrieved.
     * </p>
     * 
     * @param definitionTimestamp
     *        The time that the resource definition was retrieved.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NetworkResource withDefinitionTimestamp(java.util.Date definitionTimestamp) {
        setDefinitionTimestamp(definitionTimestamp);
        return this;
    }

    /**
     * <p>
     * The tags.
     * </p>
     * 
     * @return The tags.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * The tags.
     * </p>
     * 
     * @param tags
     *        The tags.
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<Tag>(tags);
    }

    /**
     * <p>
     * The tags.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        The tags.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NetworkResource withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new java.util.ArrayList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The tags.
     * </p>
     * 
     * @param tags
     *        The tags.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NetworkResource withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
        return this;
    }

    /**
     * <p>
     * The resource metadata.
     * </p>
     * 
     * @return The resource metadata.
     */

    public java.util.Map<String, String> getMetadata() {
        return metadata;
    }

    /**
     * <p>
     * The resource metadata.
     * </p>
     * 
     * @param metadata
     *        The resource metadata.
     */

    public void setMetadata(java.util.Map<String, String> metadata) {
        this.metadata = metadata;
    }

    /**
     * <p>
     * The resource metadata.
     * </p>
     * 
     * @param metadata
     *        The resource metadata.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NetworkResource withMetadata(java.util.Map<String, String> metadata) {
        setMetadata(metadata);
        return this;
    }

    /**
     * Add a single Metadata entry
     *
     * @see NetworkResource#withMetadata
     * @returns a reference to this object so that method calls can be chained together.
     */

    public NetworkResource addMetadataEntry(String key, String value) {
        if (null == this.metadata) {
            this.metadata = new java.util.HashMap<String, String>();
        }
        if (this.metadata.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.metadata.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Metadata.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NetworkResource clearMetadataEntries() {
        this.metadata = null;
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
        if (getRegisteredGatewayArn() != null)
            sb.append("RegisteredGatewayArn: ").append(getRegisteredGatewayArn()).append(",");
        if (getCoreNetworkId() != null)
            sb.append("CoreNetworkId: ").append(getCoreNetworkId()).append(",");
        if (getAwsRegion() != null)
            sb.append("AwsRegion: ").append(getAwsRegion()).append(",");
        if (getAccountId() != null)
            sb.append("AccountId: ").append(getAccountId()).append(",");
        if (getResourceType() != null)
            sb.append("ResourceType: ").append(getResourceType()).append(",");
        if (getResourceId() != null)
            sb.append("ResourceId: ").append(getResourceId()).append(",");
        if (getResourceArn() != null)
            sb.append("ResourceArn: ").append(getResourceArn()).append(",");
        if (getDefinition() != null)
            sb.append("Definition: ").append(getDefinition()).append(",");
        if (getDefinitionTimestamp() != null)
            sb.append("DefinitionTimestamp: ").append(getDefinitionTimestamp()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
        if (getMetadata() != null)
            sb.append("Metadata: ").append(getMetadata());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof NetworkResource == false)
            return false;
        NetworkResource other = (NetworkResource) obj;
        if (other.getRegisteredGatewayArn() == null ^ this.getRegisteredGatewayArn() == null)
            return false;
        if (other.getRegisteredGatewayArn() != null && other.getRegisteredGatewayArn().equals(this.getRegisteredGatewayArn()) == false)
            return false;
        if (other.getCoreNetworkId() == null ^ this.getCoreNetworkId() == null)
            return false;
        if (other.getCoreNetworkId() != null && other.getCoreNetworkId().equals(this.getCoreNetworkId()) == false)
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
        if (other.getResourceId() == null ^ this.getResourceId() == null)
            return false;
        if (other.getResourceId() != null && other.getResourceId().equals(this.getResourceId()) == false)
            return false;
        if (other.getResourceArn() == null ^ this.getResourceArn() == null)
            return false;
        if (other.getResourceArn() != null && other.getResourceArn().equals(this.getResourceArn()) == false)
            return false;
        if (other.getDefinition() == null ^ this.getDefinition() == null)
            return false;
        if (other.getDefinition() != null && other.getDefinition().equals(this.getDefinition()) == false)
            return false;
        if (other.getDefinitionTimestamp() == null ^ this.getDefinitionTimestamp() == null)
            return false;
        if (other.getDefinitionTimestamp() != null && other.getDefinitionTimestamp().equals(this.getDefinitionTimestamp()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getMetadata() == null ^ this.getMetadata() == null)
            return false;
        if (other.getMetadata() != null && other.getMetadata().equals(this.getMetadata()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRegisteredGatewayArn() == null) ? 0 : getRegisteredGatewayArn().hashCode());
        hashCode = prime * hashCode + ((getCoreNetworkId() == null) ? 0 : getCoreNetworkId().hashCode());
        hashCode = prime * hashCode + ((getAwsRegion() == null) ? 0 : getAwsRegion().hashCode());
        hashCode = prime * hashCode + ((getAccountId() == null) ? 0 : getAccountId().hashCode());
        hashCode = prime * hashCode + ((getResourceType() == null) ? 0 : getResourceType().hashCode());
        hashCode = prime * hashCode + ((getResourceId() == null) ? 0 : getResourceId().hashCode());
        hashCode = prime * hashCode + ((getResourceArn() == null) ? 0 : getResourceArn().hashCode());
        hashCode = prime * hashCode + ((getDefinition() == null) ? 0 : getDefinition().hashCode());
        hashCode = prime * hashCode + ((getDefinitionTimestamp() == null) ? 0 : getDefinitionTimestamp().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getMetadata() == null) ? 0 : getMetadata().hashCode());
        return hashCode;
    }

    @Override
    public NetworkResource clone() {
        try {
            return (NetworkResource) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.networkmanager.model.transform.NetworkResourceMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
