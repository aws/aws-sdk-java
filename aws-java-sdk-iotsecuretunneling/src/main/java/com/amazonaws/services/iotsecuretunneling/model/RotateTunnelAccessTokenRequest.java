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
package com.amazonaws.services.iotsecuretunneling.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotsecuretunneling-2018-10-05/RotateTunnelAccessToken"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RotateTunnelAccessTokenRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The tunnel for which you want to rotate the access tokens.
     * </p>
     */
    private String tunnelId;
    /**
     * <p>
     * The mode of the client that will use the client token, which can be either the source or destination, or both
     * source and destination.
     * </p>
     */
    private String clientMode;

    private DestinationConfig destinationConfig;

    /**
     * <p>
     * The tunnel for which you want to rotate the access tokens.
     * </p>
     * 
     * @param tunnelId
     *        The tunnel for which you want to rotate the access tokens.
     */

    public void setTunnelId(String tunnelId) {
        this.tunnelId = tunnelId;
    }

    /**
     * <p>
     * The tunnel for which you want to rotate the access tokens.
     * </p>
     * 
     * @return The tunnel for which you want to rotate the access tokens.
     */

    public String getTunnelId() {
        return this.tunnelId;
    }

    /**
     * <p>
     * The tunnel for which you want to rotate the access tokens.
     * </p>
     * 
     * @param tunnelId
     *        The tunnel for which you want to rotate the access tokens.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RotateTunnelAccessTokenRequest withTunnelId(String tunnelId) {
        setTunnelId(tunnelId);
        return this;
    }

    /**
     * <p>
     * The mode of the client that will use the client token, which can be either the source or destination, or both
     * source and destination.
     * </p>
     * 
     * @param clientMode
     *        The mode of the client that will use the client token, which can be either the source or destination, or
     *        both source and destination.
     * @see ClientMode
     */

    public void setClientMode(String clientMode) {
        this.clientMode = clientMode;
    }

    /**
     * <p>
     * The mode of the client that will use the client token, which can be either the source or destination, or both
     * source and destination.
     * </p>
     * 
     * @return The mode of the client that will use the client token, which can be either the source or destination, or
     *         both source and destination.
     * @see ClientMode
     */

    public String getClientMode() {
        return this.clientMode;
    }

    /**
     * <p>
     * The mode of the client that will use the client token, which can be either the source or destination, or both
     * source and destination.
     * </p>
     * 
     * @param clientMode
     *        The mode of the client that will use the client token, which can be either the source or destination, or
     *        both source and destination.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ClientMode
     */

    public RotateTunnelAccessTokenRequest withClientMode(String clientMode) {
        setClientMode(clientMode);
        return this;
    }

    /**
     * <p>
     * The mode of the client that will use the client token, which can be either the source or destination, or both
     * source and destination.
     * </p>
     * 
     * @param clientMode
     *        The mode of the client that will use the client token, which can be either the source or destination, or
     *        both source and destination.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ClientMode
     */

    public RotateTunnelAccessTokenRequest withClientMode(ClientMode clientMode) {
        this.clientMode = clientMode.toString();
        return this;
    }

    /**
     * @param destinationConfig
     */

    public void setDestinationConfig(DestinationConfig destinationConfig) {
        this.destinationConfig = destinationConfig;
    }

    /**
     * @return
     */

    public DestinationConfig getDestinationConfig() {
        return this.destinationConfig;
    }

    /**
     * @param destinationConfig
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RotateTunnelAccessTokenRequest withDestinationConfig(DestinationConfig destinationConfig) {
        setDestinationConfig(destinationConfig);
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
        if (getTunnelId() != null)
            sb.append("TunnelId: ").append(getTunnelId()).append(",");
        if (getClientMode() != null)
            sb.append("ClientMode: ").append(getClientMode()).append(",");
        if (getDestinationConfig() != null)
            sb.append("DestinationConfig: ").append(getDestinationConfig());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RotateTunnelAccessTokenRequest == false)
            return false;
        RotateTunnelAccessTokenRequest other = (RotateTunnelAccessTokenRequest) obj;
        if (other.getTunnelId() == null ^ this.getTunnelId() == null)
            return false;
        if (other.getTunnelId() != null && other.getTunnelId().equals(this.getTunnelId()) == false)
            return false;
        if (other.getClientMode() == null ^ this.getClientMode() == null)
            return false;
        if (other.getClientMode() != null && other.getClientMode().equals(this.getClientMode()) == false)
            return false;
        if (other.getDestinationConfig() == null ^ this.getDestinationConfig() == null)
            return false;
        if (other.getDestinationConfig() != null && other.getDestinationConfig().equals(this.getDestinationConfig()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTunnelId() == null) ? 0 : getTunnelId().hashCode());
        hashCode = prime * hashCode + ((getClientMode() == null) ? 0 : getClientMode().hashCode());
        hashCode = prime * hashCode + ((getDestinationConfig() == null) ? 0 : getDestinationConfig().hashCode());
        return hashCode;
    }

    @Override
    public RotateTunnelAccessTokenRequest clone() {
        return (RotateTunnelAccessTokenRequest) super.clone();
    }

}
