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
package com.amazonaws.services.finspace.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/finspace-2021-03-12/UpdateKxEnvironmentNetwork"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateKxEnvironmentNetworkRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A unique identifier for the kdb environment.
     * </p>
     */
    private String environmentId;
    /**
     * <p>
     * Specifies the transit gateway and network configuration to connect the kdb environment to an internal network.
     * </p>
     */
    private TransitGatewayConfiguration transitGatewayConfiguration;
    /**
     * <p>
     * A list of DNS server name and server IP. This is used to set up Route-53 outbound resolvers.
     * </p>
     */
    private java.util.List<CustomDNSServer> customDNSConfiguration;
    /**
     * <p>
     * A token that ensures idempotency. This token expires in 10 minutes.
     * </p>
     */
    private String clientToken;

    /**
     * <p>
     * A unique identifier for the kdb environment.
     * </p>
     * 
     * @param environmentId
     *        A unique identifier for the kdb environment.
     */

    public void setEnvironmentId(String environmentId) {
        this.environmentId = environmentId;
    }

    /**
     * <p>
     * A unique identifier for the kdb environment.
     * </p>
     * 
     * @return A unique identifier for the kdb environment.
     */

    public String getEnvironmentId() {
        return this.environmentId;
    }

    /**
     * <p>
     * A unique identifier for the kdb environment.
     * </p>
     * 
     * @param environmentId
     *        A unique identifier for the kdb environment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateKxEnvironmentNetworkRequest withEnvironmentId(String environmentId) {
        setEnvironmentId(environmentId);
        return this;
    }

    /**
     * <p>
     * Specifies the transit gateway and network configuration to connect the kdb environment to an internal network.
     * </p>
     * 
     * @param transitGatewayConfiguration
     *        Specifies the transit gateway and network configuration to connect the kdb environment to an internal
     *        network.
     */

    public void setTransitGatewayConfiguration(TransitGatewayConfiguration transitGatewayConfiguration) {
        this.transitGatewayConfiguration = transitGatewayConfiguration;
    }

    /**
     * <p>
     * Specifies the transit gateway and network configuration to connect the kdb environment to an internal network.
     * </p>
     * 
     * @return Specifies the transit gateway and network configuration to connect the kdb environment to an internal
     *         network.
     */

    public TransitGatewayConfiguration getTransitGatewayConfiguration() {
        return this.transitGatewayConfiguration;
    }

    /**
     * <p>
     * Specifies the transit gateway and network configuration to connect the kdb environment to an internal network.
     * </p>
     * 
     * @param transitGatewayConfiguration
     *        Specifies the transit gateway and network configuration to connect the kdb environment to an internal
     *        network.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateKxEnvironmentNetworkRequest withTransitGatewayConfiguration(TransitGatewayConfiguration transitGatewayConfiguration) {
        setTransitGatewayConfiguration(transitGatewayConfiguration);
        return this;
    }

    /**
     * <p>
     * A list of DNS server name and server IP. This is used to set up Route-53 outbound resolvers.
     * </p>
     * 
     * @return A list of DNS server name and server IP. This is used to set up Route-53 outbound resolvers.
     */

    public java.util.List<CustomDNSServer> getCustomDNSConfiguration() {
        return customDNSConfiguration;
    }

    /**
     * <p>
     * A list of DNS server name and server IP. This is used to set up Route-53 outbound resolvers.
     * </p>
     * 
     * @param customDNSConfiguration
     *        A list of DNS server name and server IP. This is used to set up Route-53 outbound resolvers.
     */

    public void setCustomDNSConfiguration(java.util.Collection<CustomDNSServer> customDNSConfiguration) {
        if (customDNSConfiguration == null) {
            this.customDNSConfiguration = null;
            return;
        }

        this.customDNSConfiguration = new java.util.ArrayList<CustomDNSServer>(customDNSConfiguration);
    }

    /**
     * <p>
     * A list of DNS server name and server IP. This is used to set up Route-53 outbound resolvers.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCustomDNSConfiguration(java.util.Collection)} or
     * {@link #withCustomDNSConfiguration(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param customDNSConfiguration
     *        A list of DNS server name and server IP. This is used to set up Route-53 outbound resolvers.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateKxEnvironmentNetworkRequest withCustomDNSConfiguration(CustomDNSServer... customDNSConfiguration) {
        if (this.customDNSConfiguration == null) {
            setCustomDNSConfiguration(new java.util.ArrayList<CustomDNSServer>(customDNSConfiguration.length));
        }
        for (CustomDNSServer ele : customDNSConfiguration) {
            this.customDNSConfiguration.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of DNS server name and server IP. This is used to set up Route-53 outbound resolvers.
     * </p>
     * 
     * @param customDNSConfiguration
     *        A list of DNS server name and server IP. This is used to set up Route-53 outbound resolvers.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateKxEnvironmentNetworkRequest withCustomDNSConfiguration(java.util.Collection<CustomDNSServer> customDNSConfiguration) {
        setCustomDNSConfiguration(customDNSConfiguration);
        return this;
    }

    /**
     * <p>
     * A token that ensures idempotency. This token expires in 10 minutes.
     * </p>
     * 
     * @param clientToken
     *        A token that ensures idempotency. This token expires in 10 minutes.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * A token that ensures idempotency. This token expires in 10 minutes.
     * </p>
     * 
     * @return A token that ensures idempotency. This token expires in 10 minutes.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * A token that ensures idempotency. This token expires in 10 minutes.
     * </p>
     * 
     * @param clientToken
     *        A token that ensures idempotency. This token expires in 10 minutes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateKxEnvironmentNetworkRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
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
        if (getEnvironmentId() != null)
            sb.append("EnvironmentId: ").append(getEnvironmentId()).append(",");
        if (getTransitGatewayConfiguration() != null)
            sb.append("TransitGatewayConfiguration: ").append(getTransitGatewayConfiguration()).append(",");
        if (getCustomDNSConfiguration() != null)
            sb.append("CustomDNSConfiguration: ").append(getCustomDNSConfiguration()).append(",");
        if (getClientToken() != null)
            sb.append("ClientToken: ").append(getClientToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateKxEnvironmentNetworkRequest == false)
            return false;
        UpdateKxEnvironmentNetworkRequest other = (UpdateKxEnvironmentNetworkRequest) obj;
        if (other.getEnvironmentId() == null ^ this.getEnvironmentId() == null)
            return false;
        if (other.getEnvironmentId() != null && other.getEnvironmentId().equals(this.getEnvironmentId()) == false)
            return false;
        if (other.getTransitGatewayConfiguration() == null ^ this.getTransitGatewayConfiguration() == null)
            return false;
        if (other.getTransitGatewayConfiguration() != null && other.getTransitGatewayConfiguration().equals(this.getTransitGatewayConfiguration()) == false)
            return false;
        if (other.getCustomDNSConfiguration() == null ^ this.getCustomDNSConfiguration() == null)
            return false;
        if (other.getCustomDNSConfiguration() != null && other.getCustomDNSConfiguration().equals(this.getCustomDNSConfiguration()) == false)
            return false;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEnvironmentId() == null) ? 0 : getEnvironmentId().hashCode());
        hashCode = prime * hashCode + ((getTransitGatewayConfiguration() == null) ? 0 : getTransitGatewayConfiguration().hashCode());
        hashCode = prime * hashCode + ((getCustomDNSConfiguration() == null) ? 0 : getCustomDNSConfiguration().hashCode());
        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        return hashCode;
    }

    @Override
    public UpdateKxEnvironmentNetworkRequest clone() {
        return (UpdateKxEnvironmentNetworkRequest) super.clone();
    }

}
