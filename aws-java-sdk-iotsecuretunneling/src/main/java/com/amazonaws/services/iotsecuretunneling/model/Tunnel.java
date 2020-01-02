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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A connection between a source computer and a destination device.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotsecuretunneling-2018-10-05/Tunnel" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Tunnel implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A unique alpha-numeric ID that identifies a tunnel.
     * </p>
     */
    private String tunnelId;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of a tunnel. The tunnel ARN format is
     * <code>arn:aws:tunnel:&lt;region&gt;:&lt;account-id&gt;:tunnel/&lt;tunnel-id&gt;</code>
     * </p>
     */
    private String tunnelArn;
    /**
     * <p>
     * The status of a tunnel. Valid values are: Open and Closed.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The connection state of the source application.
     * </p>
     */
    private ConnectionState sourceConnectionState;
    /**
     * <p>
     * The connection state of the destination application.
     * </p>
     */
    private ConnectionState destinationConnectionState;
    /**
     * <p>
     * A description of the tunnel.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The destination configuration that specifies the thing name of the destination device and a service name that the
     * local proxy uses to connect to the destination application.
     * </p>
     */
    private DestinationConfig destinationConfig;
    /**
     * <p>
     * Timeout configuration for the tunnel.
     * </p>
     */
    private TimeoutConfig timeoutConfig;
    /**
     * <p>
     * A list of tag metadata associated with the secure tunnel.
     * </p>
     */
    private java.util.List<Tag> tags;
    /**
     * <p>
     * The time when the tunnel was created.
     * </p>
     */
    private java.util.Date createdAt;
    /**
     * <p>
     * The last time the tunnel was updated.
     * </p>
     */
    private java.util.Date lastUpdatedAt;

    /**
     * <p>
     * A unique alpha-numeric ID that identifies a tunnel.
     * </p>
     * 
     * @param tunnelId
     *        A unique alpha-numeric ID that identifies a tunnel.
     */

    public void setTunnelId(String tunnelId) {
        this.tunnelId = tunnelId;
    }

    /**
     * <p>
     * A unique alpha-numeric ID that identifies a tunnel.
     * </p>
     * 
     * @return A unique alpha-numeric ID that identifies a tunnel.
     */

    public String getTunnelId() {
        return this.tunnelId;
    }

    /**
     * <p>
     * A unique alpha-numeric ID that identifies a tunnel.
     * </p>
     * 
     * @param tunnelId
     *        A unique alpha-numeric ID that identifies a tunnel.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Tunnel withTunnelId(String tunnelId) {
        setTunnelId(tunnelId);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of a tunnel. The tunnel ARN format is
     * <code>arn:aws:tunnel:&lt;region&gt;:&lt;account-id&gt;:tunnel/&lt;tunnel-id&gt;</code>
     * </p>
     * 
     * @param tunnelArn
     *        The Amazon Resource Name (ARN) of a tunnel. The tunnel ARN format is
     *        <code>arn:aws:tunnel:&lt;region&gt;:&lt;account-id&gt;:tunnel/&lt;tunnel-id&gt;</code>
     */

    public void setTunnelArn(String tunnelArn) {
        this.tunnelArn = tunnelArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of a tunnel. The tunnel ARN format is
     * <code>arn:aws:tunnel:&lt;region&gt;:&lt;account-id&gt;:tunnel/&lt;tunnel-id&gt;</code>
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of a tunnel. The tunnel ARN format is
     *         <code>arn:aws:tunnel:&lt;region&gt;:&lt;account-id&gt;:tunnel/&lt;tunnel-id&gt;</code>
     */

    public String getTunnelArn() {
        return this.tunnelArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of a tunnel. The tunnel ARN format is
     * <code>arn:aws:tunnel:&lt;region&gt;:&lt;account-id&gt;:tunnel/&lt;tunnel-id&gt;</code>
     * </p>
     * 
     * @param tunnelArn
     *        The Amazon Resource Name (ARN) of a tunnel. The tunnel ARN format is
     *        <code>arn:aws:tunnel:&lt;region&gt;:&lt;account-id&gt;:tunnel/&lt;tunnel-id&gt;</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Tunnel withTunnelArn(String tunnelArn) {
        setTunnelArn(tunnelArn);
        return this;
    }

    /**
     * <p>
     * The status of a tunnel. Valid values are: Open and Closed.
     * </p>
     * 
     * @param status
     *        The status of a tunnel. Valid values are: Open and Closed.
     * @see TunnelStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of a tunnel. Valid values are: Open and Closed.
     * </p>
     * 
     * @return The status of a tunnel. Valid values are: Open and Closed.
     * @see TunnelStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of a tunnel. Valid values are: Open and Closed.
     * </p>
     * 
     * @param status
     *        The status of a tunnel. Valid values are: Open and Closed.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TunnelStatus
     */

    public Tunnel withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of a tunnel. Valid values are: Open and Closed.
     * </p>
     * 
     * @param status
     *        The status of a tunnel. Valid values are: Open and Closed.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TunnelStatus
     */

    public Tunnel withStatus(TunnelStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The connection state of the source application.
     * </p>
     * 
     * @param sourceConnectionState
     *        The connection state of the source application.
     */

    public void setSourceConnectionState(ConnectionState sourceConnectionState) {
        this.sourceConnectionState = sourceConnectionState;
    }

    /**
     * <p>
     * The connection state of the source application.
     * </p>
     * 
     * @return The connection state of the source application.
     */

    public ConnectionState getSourceConnectionState() {
        return this.sourceConnectionState;
    }

    /**
     * <p>
     * The connection state of the source application.
     * </p>
     * 
     * @param sourceConnectionState
     *        The connection state of the source application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Tunnel withSourceConnectionState(ConnectionState sourceConnectionState) {
        setSourceConnectionState(sourceConnectionState);
        return this;
    }

    /**
     * <p>
     * The connection state of the destination application.
     * </p>
     * 
     * @param destinationConnectionState
     *        The connection state of the destination application.
     */

    public void setDestinationConnectionState(ConnectionState destinationConnectionState) {
        this.destinationConnectionState = destinationConnectionState;
    }

    /**
     * <p>
     * The connection state of the destination application.
     * </p>
     * 
     * @return The connection state of the destination application.
     */

    public ConnectionState getDestinationConnectionState() {
        return this.destinationConnectionState;
    }

    /**
     * <p>
     * The connection state of the destination application.
     * </p>
     * 
     * @param destinationConnectionState
     *        The connection state of the destination application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Tunnel withDestinationConnectionState(ConnectionState destinationConnectionState) {
        setDestinationConnectionState(destinationConnectionState);
        return this;
    }

    /**
     * <p>
     * A description of the tunnel.
     * </p>
     * 
     * @param description
     *        A description of the tunnel.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description of the tunnel.
     * </p>
     * 
     * @return A description of the tunnel.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A description of the tunnel.
     * </p>
     * 
     * @param description
     *        A description of the tunnel.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Tunnel withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The destination configuration that specifies the thing name of the destination device and a service name that the
     * local proxy uses to connect to the destination application.
     * </p>
     * 
     * @param destinationConfig
     *        The destination configuration that specifies the thing name of the destination device and a service name
     *        that the local proxy uses to connect to the destination application.
     */

    public void setDestinationConfig(DestinationConfig destinationConfig) {
        this.destinationConfig = destinationConfig;
    }

    /**
     * <p>
     * The destination configuration that specifies the thing name of the destination device and a service name that the
     * local proxy uses to connect to the destination application.
     * </p>
     * 
     * @return The destination configuration that specifies the thing name of the destination device and a service name
     *         that the local proxy uses to connect to the destination application.
     */

    public DestinationConfig getDestinationConfig() {
        return this.destinationConfig;
    }

    /**
     * <p>
     * The destination configuration that specifies the thing name of the destination device and a service name that the
     * local proxy uses to connect to the destination application.
     * </p>
     * 
     * @param destinationConfig
     *        The destination configuration that specifies the thing name of the destination device and a service name
     *        that the local proxy uses to connect to the destination application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Tunnel withDestinationConfig(DestinationConfig destinationConfig) {
        setDestinationConfig(destinationConfig);
        return this;
    }

    /**
     * <p>
     * Timeout configuration for the tunnel.
     * </p>
     * 
     * @param timeoutConfig
     *        Timeout configuration for the tunnel.
     */

    public void setTimeoutConfig(TimeoutConfig timeoutConfig) {
        this.timeoutConfig = timeoutConfig;
    }

    /**
     * <p>
     * Timeout configuration for the tunnel.
     * </p>
     * 
     * @return Timeout configuration for the tunnel.
     */

    public TimeoutConfig getTimeoutConfig() {
        return this.timeoutConfig;
    }

    /**
     * <p>
     * Timeout configuration for the tunnel.
     * </p>
     * 
     * @param timeoutConfig
     *        Timeout configuration for the tunnel.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Tunnel withTimeoutConfig(TimeoutConfig timeoutConfig) {
        setTimeoutConfig(timeoutConfig);
        return this;
    }

    /**
     * <p>
     * A list of tag metadata associated with the secure tunnel.
     * </p>
     * 
     * @return A list of tag metadata associated with the secure tunnel.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * A list of tag metadata associated with the secure tunnel.
     * </p>
     * 
     * @param tags
     *        A list of tag metadata associated with the secure tunnel.
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
     * A list of tag metadata associated with the secure tunnel.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        A list of tag metadata associated with the secure tunnel.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Tunnel withTags(Tag... tags) {
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
     * A list of tag metadata associated with the secure tunnel.
     * </p>
     * 
     * @param tags
     *        A list of tag metadata associated with the secure tunnel.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Tunnel withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
        return this;
    }

    /**
     * <p>
     * The time when the tunnel was created.
     * </p>
     * 
     * @param createdAt
     *        The time when the tunnel was created.
     */

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * The time when the tunnel was created.
     * </p>
     * 
     * @return The time when the tunnel was created.
     */

    public java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    /**
     * <p>
     * The time when the tunnel was created.
     * </p>
     * 
     * @param createdAt
     *        The time when the tunnel was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Tunnel withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
        return this;
    }

    /**
     * <p>
     * The last time the tunnel was updated.
     * </p>
     * 
     * @param lastUpdatedAt
     *        The last time the tunnel was updated.
     */

    public void setLastUpdatedAt(java.util.Date lastUpdatedAt) {
        this.lastUpdatedAt = lastUpdatedAt;
    }

    /**
     * <p>
     * The last time the tunnel was updated.
     * </p>
     * 
     * @return The last time the tunnel was updated.
     */

    public java.util.Date getLastUpdatedAt() {
        return this.lastUpdatedAt;
    }

    /**
     * <p>
     * The last time the tunnel was updated.
     * </p>
     * 
     * @param lastUpdatedAt
     *        The last time the tunnel was updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Tunnel withLastUpdatedAt(java.util.Date lastUpdatedAt) {
        setLastUpdatedAt(lastUpdatedAt);
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
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getSourceConnectionState() != null)
            sb.append("SourceConnectionState: ").append(getSourceConnectionState()).append(",");
        if (getDestinationConnectionState() != null)
            sb.append("DestinationConnectionState: ").append(getDestinationConnectionState()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getDestinationConfig() != null)
            sb.append("DestinationConfig: ").append(getDestinationConfig()).append(",");
        if (getTimeoutConfig() != null)
            sb.append("TimeoutConfig: ").append(getTimeoutConfig()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
        if (getCreatedAt() != null)
            sb.append("CreatedAt: ").append(getCreatedAt()).append(",");
        if (getLastUpdatedAt() != null)
            sb.append("LastUpdatedAt: ").append(getLastUpdatedAt());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Tunnel == false)
            return false;
        Tunnel other = (Tunnel) obj;
        if (other.getTunnelId() == null ^ this.getTunnelId() == null)
            return false;
        if (other.getTunnelId() != null && other.getTunnelId().equals(this.getTunnelId()) == false)
            return false;
        if (other.getTunnelArn() == null ^ this.getTunnelArn() == null)
            return false;
        if (other.getTunnelArn() != null && other.getTunnelArn().equals(this.getTunnelArn()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getSourceConnectionState() == null ^ this.getSourceConnectionState() == null)
            return false;
        if (other.getSourceConnectionState() != null && other.getSourceConnectionState().equals(this.getSourceConnectionState()) == false)
            return false;
        if (other.getDestinationConnectionState() == null ^ this.getDestinationConnectionState() == null)
            return false;
        if (other.getDestinationConnectionState() != null && other.getDestinationConnectionState().equals(this.getDestinationConnectionState()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getDestinationConfig() == null ^ this.getDestinationConfig() == null)
            return false;
        if (other.getDestinationConfig() != null && other.getDestinationConfig().equals(this.getDestinationConfig()) == false)
            return false;
        if (other.getTimeoutConfig() == null ^ this.getTimeoutConfig() == null)
            return false;
        if (other.getTimeoutConfig() != null && other.getTimeoutConfig().equals(this.getTimeoutConfig()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        if (other.getLastUpdatedAt() == null ^ this.getLastUpdatedAt() == null)
            return false;
        if (other.getLastUpdatedAt() != null && other.getLastUpdatedAt().equals(this.getLastUpdatedAt()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTunnelId() == null) ? 0 : getTunnelId().hashCode());
        hashCode = prime * hashCode + ((getTunnelArn() == null) ? 0 : getTunnelArn().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getSourceConnectionState() == null) ? 0 : getSourceConnectionState().hashCode());
        hashCode = prime * hashCode + ((getDestinationConnectionState() == null) ? 0 : getDestinationConnectionState().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getDestinationConfig() == null) ? 0 : getDestinationConfig().hashCode());
        hashCode = prime * hashCode + ((getTimeoutConfig() == null) ? 0 : getTimeoutConfig().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getLastUpdatedAt() == null) ? 0 : getLastUpdatedAt().hashCode());
        return hashCode;
    }

    @Override
    public Tunnel clone() {
        try {
            return (Tunnel) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iotsecuretunneling.model.transform.TunnelMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
