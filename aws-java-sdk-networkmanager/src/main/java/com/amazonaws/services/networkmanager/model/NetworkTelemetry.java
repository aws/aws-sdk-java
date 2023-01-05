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
 * Describes the telemetry information for a resource.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/NetworkTelemetry" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class NetworkTelemetry implements Serializable, Cloneable, StructuredPojo {

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
     * The address.
     * </p>
     */
    private String address;
    /**
     * <p>
     * The connection health.
     * </p>
     */
    private ConnectionHealth health;

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

    public NetworkTelemetry withRegisteredGatewayArn(String registeredGatewayArn) {
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

    public NetworkTelemetry withCoreNetworkId(String coreNetworkId) {
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

    public NetworkTelemetry withAwsRegion(String awsRegion) {
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

    public NetworkTelemetry withAccountId(String accountId) {
        setAccountId(accountId);
        return this;
    }

    /**
     * <p>
     * The resource type.
     * </p>
     * 
     * @param resourceType
     *        The resource type.
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
     */

    public NetworkTelemetry withResourceType(String resourceType) {
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

    public NetworkTelemetry withResourceId(String resourceId) {
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

    public NetworkTelemetry withResourceArn(String resourceArn) {
        setResourceArn(resourceArn);
        return this;
    }

    /**
     * <p>
     * The address.
     * </p>
     * 
     * @param address
     *        The address.
     */

    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * <p>
     * The address.
     * </p>
     * 
     * @return The address.
     */

    public String getAddress() {
        return this.address;
    }

    /**
     * <p>
     * The address.
     * </p>
     * 
     * @param address
     *        The address.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NetworkTelemetry withAddress(String address) {
        setAddress(address);
        return this;
    }

    /**
     * <p>
     * The connection health.
     * </p>
     * 
     * @param health
     *        The connection health.
     */

    public void setHealth(ConnectionHealth health) {
        this.health = health;
    }

    /**
     * <p>
     * The connection health.
     * </p>
     * 
     * @return The connection health.
     */

    public ConnectionHealth getHealth() {
        return this.health;
    }

    /**
     * <p>
     * The connection health.
     * </p>
     * 
     * @param health
     *        The connection health.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NetworkTelemetry withHealth(ConnectionHealth health) {
        setHealth(health);
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
        if (getAddress() != null)
            sb.append("Address: ").append(getAddress()).append(",");
        if (getHealth() != null)
            sb.append("Health: ").append(getHealth());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof NetworkTelemetry == false)
            return false;
        NetworkTelemetry other = (NetworkTelemetry) obj;
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
        if (other.getAddress() == null ^ this.getAddress() == null)
            return false;
        if (other.getAddress() != null && other.getAddress().equals(this.getAddress()) == false)
            return false;
        if (other.getHealth() == null ^ this.getHealth() == null)
            return false;
        if (other.getHealth() != null && other.getHealth().equals(this.getHealth()) == false)
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
        hashCode = prime * hashCode + ((getAddress() == null) ? 0 : getAddress().hashCode());
        hashCode = prime * hashCode + ((getHealth() == null) ? 0 : getHealth().hashCode());
        return hashCode;
    }

    @Override
    public NetworkTelemetry clone() {
        try {
            return (NetworkTelemetry) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.networkmanager.model.transform.NetworkTelemetryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
