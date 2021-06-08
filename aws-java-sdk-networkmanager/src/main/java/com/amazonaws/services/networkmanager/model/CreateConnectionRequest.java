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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/CreateConnection" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateConnectionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

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
     * The ID of the link for the first device.
     * </p>
     */
    private String linkId;
    /**
     * <p>
     * The ID of the link for the second device.
     * </p>
     */
    private String connectedLinkId;
    /**
     * <p>
     * A description of the connection.
     * </p>
     * <p>
     * Length Constraints: Maximum length of 256 characters.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The tags to apply to the resource during creation.
     * </p>
     */
    private java.util.List<Tag> tags;

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

    public CreateConnectionRequest withGlobalNetworkId(String globalNetworkId) {
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

    public CreateConnectionRequest withDeviceId(String deviceId) {
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

    public CreateConnectionRequest withConnectedDeviceId(String connectedDeviceId) {
        setConnectedDeviceId(connectedDeviceId);
        return this;
    }

    /**
     * <p>
     * The ID of the link for the first device.
     * </p>
     * 
     * @param linkId
     *        The ID of the link for the first device.
     */

    public void setLinkId(String linkId) {
        this.linkId = linkId;
    }

    /**
     * <p>
     * The ID of the link for the first device.
     * </p>
     * 
     * @return The ID of the link for the first device.
     */

    public String getLinkId() {
        return this.linkId;
    }

    /**
     * <p>
     * The ID of the link for the first device.
     * </p>
     * 
     * @param linkId
     *        The ID of the link for the first device.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateConnectionRequest withLinkId(String linkId) {
        setLinkId(linkId);
        return this;
    }

    /**
     * <p>
     * The ID of the link for the second device.
     * </p>
     * 
     * @param connectedLinkId
     *        The ID of the link for the second device.
     */

    public void setConnectedLinkId(String connectedLinkId) {
        this.connectedLinkId = connectedLinkId;
    }

    /**
     * <p>
     * The ID of the link for the second device.
     * </p>
     * 
     * @return The ID of the link for the second device.
     */

    public String getConnectedLinkId() {
        return this.connectedLinkId;
    }

    /**
     * <p>
     * The ID of the link for the second device.
     * </p>
     * 
     * @param connectedLinkId
     *        The ID of the link for the second device.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateConnectionRequest withConnectedLinkId(String connectedLinkId) {
        setConnectedLinkId(connectedLinkId);
        return this;
    }

    /**
     * <p>
     * A description of the connection.
     * </p>
     * <p>
     * Length Constraints: Maximum length of 256 characters.
     * </p>
     * 
     * @param description
     *        A description of the connection.</p>
     *        <p>
     *        Length Constraints: Maximum length of 256 characters.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description of the connection.
     * </p>
     * <p>
     * Length Constraints: Maximum length of 256 characters.
     * </p>
     * 
     * @return A description of the connection.</p>
     *         <p>
     *         Length Constraints: Maximum length of 256 characters.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A description of the connection.
     * </p>
     * <p>
     * Length Constraints: Maximum length of 256 characters.
     * </p>
     * 
     * @param description
     *        A description of the connection.</p>
     *        <p>
     *        Length Constraints: Maximum length of 256 characters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateConnectionRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The tags to apply to the resource during creation.
     * </p>
     * 
     * @return The tags to apply to the resource during creation.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * The tags to apply to the resource during creation.
     * </p>
     * 
     * @param tags
     *        The tags to apply to the resource during creation.
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
     * The tags to apply to the resource during creation.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        The tags to apply to the resource during creation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateConnectionRequest withTags(Tag... tags) {
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
     * The tags to apply to the resource during creation.
     * </p>
     * 
     * @param tags
     *        The tags to apply to the resource during creation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateConnectionRequest withTags(java.util.Collection<Tag> tags) {
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

        if (obj instanceof CreateConnectionRequest == false)
            return false;
        CreateConnectionRequest other = (CreateConnectionRequest) obj;
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

        hashCode = prime * hashCode + ((getGlobalNetworkId() == null) ? 0 : getGlobalNetworkId().hashCode());
        hashCode = prime * hashCode + ((getDeviceId() == null) ? 0 : getDeviceId().hashCode());
        hashCode = prime * hashCode + ((getConnectedDeviceId() == null) ? 0 : getConnectedDeviceId().hashCode());
        hashCode = prime * hashCode + ((getLinkId() == null) ? 0 : getLinkId().hashCode());
        hashCode = prime * hashCode + ((getConnectedLinkId() == null) ? 0 : getConnectedLinkId().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateConnectionRequest clone() {
        return (CreateConnectionRequest) super.clone();
    }

}
