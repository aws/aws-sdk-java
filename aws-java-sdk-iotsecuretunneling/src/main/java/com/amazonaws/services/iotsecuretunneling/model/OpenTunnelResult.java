/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotsecuretunneling-2018-10-05/OpenTunnel" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class OpenTunnelResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A unique alpha-numeric tunnel ID.
     * </p>
     */
    private String tunnelId;
    /**
     * <p>
     * The Amazon Resource Name for the tunnel. The tunnel ARN format is
     * <code>arn:aws:tunnel:&lt;region&gt;:&lt;account-id&gt;:tunnel/&lt;tunnel-id&gt;</code>
     * </p>
     */
    private String tunnelArn;
    /**
     * <p>
     * The access token the source local proxy uses to connect to AWS IoT Secure Tunneling.
     * </p>
     */
    private String sourceAccessToken;
    /**
     * <p>
     * The access token the destination local proxy uses to connect to AWS IoT Secure Tunneling.
     * </p>
     */
    private String destinationAccessToken;

    /**
     * <p>
     * A unique alpha-numeric tunnel ID.
     * </p>
     * 
     * @param tunnelId
     *        A unique alpha-numeric tunnel ID.
     */

    public void setTunnelId(String tunnelId) {
        this.tunnelId = tunnelId;
    }

    /**
     * <p>
     * A unique alpha-numeric tunnel ID.
     * </p>
     * 
     * @return A unique alpha-numeric tunnel ID.
     */

    public String getTunnelId() {
        return this.tunnelId;
    }

    /**
     * <p>
     * A unique alpha-numeric tunnel ID.
     * </p>
     * 
     * @param tunnelId
     *        A unique alpha-numeric tunnel ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OpenTunnelResult withTunnelId(String tunnelId) {
        setTunnelId(tunnelId);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name for the tunnel. The tunnel ARN format is
     * <code>arn:aws:tunnel:&lt;region&gt;:&lt;account-id&gt;:tunnel/&lt;tunnel-id&gt;</code>
     * </p>
     * 
     * @param tunnelArn
     *        The Amazon Resource Name for the tunnel. The tunnel ARN format is
     *        <code>arn:aws:tunnel:&lt;region&gt;:&lt;account-id&gt;:tunnel/&lt;tunnel-id&gt;</code>
     */

    public void setTunnelArn(String tunnelArn) {
        this.tunnelArn = tunnelArn;
    }

    /**
     * <p>
     * The Amazon Resource Name for the tunnel. The tunnel ARN format is
     * <code>arn:aws:tunnel:&lt;region&gt;:&lt;account-id&gt;:tunnel/&lt;tunnel-id&gt;</code>
     * </p>
     * 
     * @return The Amazon Resource Name for the tunnel. The tunnel ARN format is
     *         <code>arn:aws:tunnel:&lt;region&gt;:&lt;account-id&gt;:tunnel/&lt;tunnel-id&gt;</code>
     */

    public String getTunnelArn() {
        return this.tunnelArn;
    }

    /**
     * <p>
     * The Amazon Resource Name for the tunnel. The tunnel ARN format is
     * <code>arn:aws:tunnel:&lt;region&gt;:&lt;account-id&gt;:tunnel/&lt;tunnel-id&gt;</code>
     * </p>
     * 
     * @param tunnelArn
     *        The Amazon Resource Name for the tunnel. The tunnel ARN format is
     *        <code>arn:aws:tunnel:&lt;region&gt;:&lt;account-id&gt;:tunnel/&lt;tunnel-id&gt;</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OpenTunnelResult withTunnelArn(String tunnelArn) {
        setTunnelArn(tunnelArn);
        return this;
    }

    /**
     * <p>
     * The access token the source local proxy uses to connect to AWS IoT Secure Tunneling.
     * </p>
     * 
     * @param sourceAccessToken
     *        The access token the source local proxy uses to connect to AWS IoT Secure Tunneling.
     */

    public void setSourceAccessToken(String sourceAccessToken) {
        this.sourceAccessToken = sourceAccessToken;
    }

    /**
     * <p>
     * The access token the source local proxy uses to connect to AWS IoT Secure Tunneling.
     * </p>
     * 
     * @return The access token the source local proxy uses to connect to AWS IoT Secure Tunneling.
     */

    public String getSourceAccessToken() {
        return this.sourceAccessToken;
    }

    /**
     * <p>
     * The access token the source local proxy uses to connect to AWS IoT Secure Tunneling.
     * </p>
     * 
     * @param sourceAccessToken
     *        The access token the source local proxy uses to connect to AWS IoT Secure Tunneling.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OpenTunnelResult withSourceAccessToken(String sourceAccessToken) {
        setSourceAccessToken(sourceAccessToken);
        return this;
    }

    /**
     * <p>
     * The access token the destination local proxy uses to connect to AWS IoT Secure Tunneling.
     * </p>
     * 
     * @param destinationAccessToken
     *        The access token the destination local proxy uses to connect to AWS IoT Secure Tunneling.
     */

    public void setDestinationAccessToken(String destinationAccessToken) {
        this.destinationAccessToken = destinationAccessToken;
    }

    /**
     * <p>
     * The access token the destination local proxy uses to connect to AWS IoT Secure Tunneling.
     * </p>
     * 
     * @return The access token the destination local proxy uses to connect to AWS IoT Secure Tunneling.
     */

    public String getDestinationAccessToken() {
        return this.destinationAccessToken;
    }

    /**
     * <p>
     * The access token the destination local proxy uses to connect to AWS IoT Secure Tunneling.
     * </p>
     * 
     * @param destinationAccessToken
     *        The access token the destination local proxy uses to connect to AWS IoT Secure Tunneling.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OpenTunnelResult withDestinationAccessToken(String destinationAccessToken) {
        setDestinationAccessToken(destinationAccessToken);
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
        if (getTunnelArn() != null)
            sb.append("TunnelArn: ").append(getTunnelArn()).append(",");
        if (getSourceAccessToken() != null)
            sb.append("SourceAccessToken: ").append("***Sensitive Data Redacted***").append(",");
        if (getDestinationAccessToken() != null)
            sb.append("DestinationAccessToken: ").append("***Sensitive Data Redacted***");
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof OpenTunnelResult == false)
            return false;
        OpenTunnelResult other = (OpenTunnelResult) obj;
        if (other.getTunnelId() == null ^ this.getTunnelId() == null)
            return false;
        if (other.getTunnelId() != null && other.getTunnelId().equals(this.getTunnelId()) == false)
            return false;
        if (other.getTunnelArn() == null ^ this.getTunnelArn() == null)
            return false;
        if (other.getTunnelArn() != null && other.getTunnelArn().equals(this.getTunnelArn()) == false)
            return false;
        if (other.getSourceAccessToken() == null ^ this.getSourceAccessToken() == null)
            return false;
        if (other.getSourceAccessToken() != null && other.getSourceAccessToken().equals(this.getSourceAccessToken()) == false)
            return false;
        if (other.getDestinationAccessToken() == null ^ this.getDestinationAccessToken() == null)
            return false;
        if (other.getDestinationAccessToken() != null && other.getDestinationAccessToken().equals(this.getDestinationAccessToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTunnelId() == null) ? 0 : getTunnelId().hashCode());
        hashCode = prime * hashCode + ((getTunnelArn() == null) ? 0 : getTunnelArn().hashCode());
        hashCode = prime * hashCode + ((getSourceAccessToken() == null) ? 0 : getSourceAccessToken().hashCode());
        hashCode = prime * hashCode + ((getDestinationAccessToken() == null) ? 0 : getDestinationAccessToken().hashCode());
        return hashCode;
    }

    @Override
    public OpenTunnelResult clone() {
        try {
            return (OpenTunnelResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
