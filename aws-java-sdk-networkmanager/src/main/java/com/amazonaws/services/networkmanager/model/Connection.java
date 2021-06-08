/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Describes a connection.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/Connection" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Connection implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ID of the connection.
     * </p>
     */
    private String connectionId;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the connection.
     * </p>
     */
    private String connectionArn;
    /**
     * <p>
     * The ID of the global network.
     * </p>
     */
    private String globalNetworkId;
    /**
     * <p>
     * The ID of the first device in the connection.
     * </p>
     */
    private String deviceId;
    /**
     * <p>
     * The ID of the second device in the connection.
     * </p>
     */
    private String connectedDeviceId;
    /**
     * <p>
     * The ID of the link for the first device in the connection.
     * </p>
     */
    private String linkId;
    /**
     * <p>
     * The ID of the link for the second device in the connection.
     * </p>
     */
    private String connectedLinkId;
    /**
     * <p>
     * The description of the connection.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The date and time that the connection was created.
     * </p>
     */
    private java.util.Date createdAt;
    /**
     * <p>
     * The state of the connection.
     * </p>
     */
    private String state;
    /**
     * <p>
     * The tags for the connection.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * The ID of the connection.
     * </p>
     * 
     * @param connectionId
     *        The ID of the connection.
     */

    public void setConnectionId(String connectionId) {
        this.connectionId = connectionId;
    }

    /**
     * <p>
     * The ID of the connection.
     * </p>
     * 
     * @return The ID of the connection.
     */

    public String getConnectionId() {
        return this.connectionId;
    }

    /**
     * <p>
     * The ID of the connection.
     * </p>
     * 
     * @param connectionId
     *        The ID of the connection.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Connection withConnectionId(String connectionId) {
        setConnectionId(connectionId);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the connection.
     * </p>
     * 
     * @param connectionArn
     *        The Amazon Resource Name (ARN) of the connection.
     */

    public void setConnectionArn(String connectionArn) {
        this.connectionArn = connectionArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the connection.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the connection.
     */

    public String getConnectionArn() {
        return this.connectionArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the connection.
     * </p>
     * 
     * @param connectionArn
     *        The Amazon Resource Name (ARN) of the connection.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Connection withConnectionArn(String connectionArn) {
        setConnectionArn(connectionArn);
        return this;
    }

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

    public Connection withGlobalNetworkId(String globalNetworkId) {
        setGlobalNetworkId(globalNetworkId);
        return this;
    }

    /**
     * <p>
     * The ID of the first device in the connection.
     * </p>
     * 
     * @param deviceId
     *        The ID of the first device in the connection.
     */

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    /**
     * <p>
     * The ID of the first device in the connection.
     * </p>
     * 
     * @return The ID of the first device in the connection.
     */

    public String getDeviceId() {
        return this.deviceId;
    }

    /**
     * <p>
     * The ID of the first device in the connection.
     * </p>
     * 
     * @param deviceId
     *        The ID of the first device in the connection.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Connection withDeviceId(String deviceId) {
        setDeviceId(deviceId);
        return this;
    }

    /**
     * <p>
     * The ID of the second device in the connection.
     * </p>
     * 
     * @param connectedDeviceId
     *        The ID of the second device in the connection.
     */

    public void setConnectedDeviceId(String connectedDeviceId) {
        this.connectedDeviceId = connectedDeviceId;
    }

    /**
     * <p>
     * The ID of the second device in the connection.
     * </p>
     * 
     * @return The ID of the second device in the connection.
     */

    public String getConnectedDeviceId() {
        return this.connectedDeviceId;
    }

    /**
     * <p>
     * The ID of the second device in the connection.
     * </p>
     * 
     * @param connectedDeviceId
     *        The ID of the second device in the connection.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Connection withConnectedDeviceId(String connectedDeviceId) {
        setConnectedDeviceId(connectedDeviceId);
        return this;
    }

    /**
     * <p>
     * The ID of the link for the first device in the connection.
     * </p>
     * 
     * @param linkId
     *        The ID of the link for the first device in the connection.
     */

    public void setLinkId(String linkId) {
        this.linkId = linkId;
    }

    /**
     * <p>
     * The ID of the link for the first device in the connection.
     * </p>
     * 
     * @return The ID of the link for the first device in the connection.
     */

    public String getLinkId() {
        return this.linkId;
    }

    /**
     * <p>
     * The ID of the link for the first device in the connection.
     * </p>
     * 
     * @param linkId
     *        The ID of the link for the first device in the connection.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Connection withLinkId(String linkId) {
        setLinkId(linkId);
        return this;
    }

    /**
     * <p>
     * The ID of the link for the second device in the connection.
     * </p>
     * 
     * @param connectedLinkId
     *        The ID of the link for the second device in the connection.
     */

    public void setConnectedLinkId(String connectedLinkId) {
        this.connectedLinkId = connectedLinkId;
    }

    /**
     * <p>
     * The ID of the link for the second device in the connection.
     * </p>
     * 
     * @return The ID of the link for the second device in the connection.
     */

    public String getConnectedLinkId() {
        return this.connectedLinkId;
    }

    /**
     * <p>
     * The ID of the link for the second device in the connection.
     * </p>
     * 
     * @param connectedLinkId
     *        The ID of the link for the second device in the connection.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Connection withConnectedLinkId(String connectedLinkId) {
        setConnectedLinkId(connectedLinkId);
        return this;
    }

    /**
     * <p>
     * The description of the connection.
     * </p>
     * 
     * @param description
     *        The description of the connection.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the connection.
     * </p>
     * 
     * @return The description of the connection.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the connection.
     * </p>
     * 
     * @param description
     *        The description of the connection.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Connection withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The date and time that the connection was created.
     * </p>
     * 
     * @param createdAt
     *        The date and time that the connection was created.
     */

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * The date and time that the connection was created.
     * </p>
     * 
     * @return The date and time that the connection was created.
     */

    public java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    /**
     * <p>
     * The date and time that the connection was created.
     * </p>
     * 
     * @param createdAt
     *        The date and time that the connection was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Connection withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
        return this;
    }

    /**
     * <p>
     * The state of the connection.
     * </p>
     * 
     * @param state
     *        The state of the connection.
     * @see ConnectionState
     */

    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The state of the connection.
     * </p>
     * 
     * @return The state of the connection.
     * @see ConnectionState
     */

    public String getState() {
        return this.state;
    }

    /**
     * <p>
     * The state of the connection.
     * </p>
     * 
     * @param state
     *        The state of the connection.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ConnectionState
     */

    public Connection withState(String state) {
        setState(state);
        return this;
    }

    /**
     * <p>
     * The state of the connection.
     * </p>
     * 
     * @param state
     *        The state of the connection.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ConnectionState
     */

    public Connection withState(ConnectionState state) {
        this.state = state.toString();
        return this;
    }

    /**
     * <p>
     * The tags for the connection.
     * </p>
     * 
     * @return The tags for the connection.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * The tags for the connection.
     * </p>
     * 
     * @param tags
     *        The tags for the connection.
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
     * The tags for the connection.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        The tags for the connection.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Connection withTags(Tag... tags) {
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
     * The tags for the connection.
     * </p>
     * 
     * @param tags
     *        The tags for the connection.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Connection withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
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
        if (getConnectionId() != null)
            sb.append("ConnectionId: ").append(getConnectionId()).append(",");
        if (getConnectionArn() != null)
            sb.append("ConnectionArn: ").append(getConnectionArn()).append(",");
        if (getGlobalNetworkId() != null)
            sb.append("GlobalNetworkId: ").append(getGlobalNetworkId()).append(",");
        if (getDeviceId() != null)
            sb.append("DeviceId: ").append(getDeviceId()).append(",");
        if (getConnectedDeviceId() != null)
            sb.append("ConnectedDeviceId: ").append(getConnectedDeviceId()).append(",");
        if (getLinkId() != null)
            sb.append("LinkId: ").append(getLinkId()).append(",");
        if (getConnectedLinkId() != null)
            sb.append("ConnectedLinkId: ").append(getConnectedLinkId()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getCreatedAt() != null)
            sb.append("CreatedAt: ").append(getCreatedAt()).append(",");
        if (getState() != null)
            sb.append("State: ").append(getState()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Connection == false)
            return false;
        Connection other = (Connection) obj;
        if (other.getConnectionId() == null ^ this.getConnectionId() == null)
            return false;
        if (other.getConnectionId() != null && other.getConnectionId().equals(this.getConnectionId()) == false)
            return false;
        if (other.getConnectionArn() == null ^ this.getConnectionArn() == null)
            return false;
        if (other.getConnectionArn() != null && other.getConnectionArn().equals(this.getConnectionArn()) == false)
            return false;
        if (other.getGlobalNetworkId() == null ^ this.getGlobalNetworkId() == null)
            return false;
        if (other.getGlobalNetworkId() != null && other.getGlobalNetworkId().equals(this.getGlobalNetworkId()) == false)
            return false;
        if (other.getDeviceId() == null ^ this.getDeviceId() == null)
            return false;
        if (other.getDeviceId() != null && other.getDeviceId().equals(this.getDeviceId()) == false)
            return false;
        if (other.getConnectedDeviceId() == null ^ this.getConnectedDeviceId() == null)
            return false;
        if (other.getConnectedDeviceId() != null && other.getConnectedDeviceId().equals(this.getConnectedDeviceId()) == false)
            return false;
        if (other.getLinkId() == null ^ this.getLinkId() == null)
            return false;
        if (other.getLinkId() != null && other.getLinkId().equals(this.getLinkId()) == false)
            return false;
        if (other.getConnectedLinkId() == null ^ this.getConnectedLinkId() == null)
            return false;
        if (other.getConnectedLinkId() != null && other.getConnectedLinkId().equals(this.getConnectedLinkId()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getConnectionId() == null) ? 0 : getConnectionId().hashCode());
        hashCode = prime * hashCode + ((getConnectionArn() == null) ? 0 : getConnectionArn().hashCode());
        hashCode = prime * hashCode + ((getGlobalNetworkId() == null) ? 0 : getGlobalNetworkId().hashCode());
        hashCode = prime * hashCode + ((getDeviceId() == null) ? 0 : getDeviceId().hashCode());
        hashCode = prime * hashCode + ((getConnectedDeviceId() == null) ? 0 : getConnectedDeviceId().hashCode());
        hashCode = prime * hashCode + ((getLinkId() == null) ? 0 : getLinkId().hashCode());
        hashCode = prime * hashCode + ((getConnectedLinkId() == null) ? 0 : getConnectedLinkId().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public Connection clone() {
        try {
            return (Connection) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.networkmanager.model.transform.ConnectionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
