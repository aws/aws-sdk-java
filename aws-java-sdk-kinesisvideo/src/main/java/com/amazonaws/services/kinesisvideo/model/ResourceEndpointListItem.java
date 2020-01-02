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
package com.amazonaws.services.kinesisvideo.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An object that describes the endpoint of the signaling channel returned by the
 * <code>GetSignalingChannelEndpoint</code> API.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesisvideo-2017-09-30/ResourceEndpointListItem"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ResourceEndpointListItem implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The protocol of the signaling channel returned by the <code>GetSignalingChannelEndpoint</code> API.
     * </p>
     */
    private String protocol;
    /**
     * <p>
     * The endpoint of the signaling channel returned by the <code>GetSignalingChannelEndpoint</code> API.
     * </p>
     */
    private String resourceEndpoint;

    /**
     * <p>
     * The protocol of the signaling channel returned by the <code>GetSignalingChannelEndpoint</code> API.
     * </p>
     * 
     * @param protocol
     *        The protocol of the signaling channel returned by the <code>GetSignalingChannelEndpoint</code> API.
     * @see ChannelProtocol
     */

    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    /**
     * <p>
     * The protocol of the signaling channel returned by the <code>GetSignalingChannelEndpoint</code> API.
     * </p>
     * 
     * @return The protocol of the signaling channel returned by the <code>GetSignalingChannelEndpoint</code> API.
     * @see ChannelProtocol
     */

    public String getProtocol() {
        return this.protocol;
    }

    /**
     * <p>
     * The protocol of the signaling channel returned by the <code>GetSignalingChannelEndpoint</code> API.
     * </p>
     * 
     * @param protocol
     *        The protocol of the signaling channel returned by the <code>GetSignalingChannelEndpoint</code> API.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ChannelProtocol
     */

    public ResourceEndpointListItem withProtocol(String protocol) {
        setProtocol(protocol);
        return this;
    }

    /**
     * <p>
     * The protocol of the signaling channel returned by the <code>GetSignalingChannelEndpoint</code> API.
     * </p>
     * 
     * @param protocol
     *        The protocol of the signaling channel returned by the <code>GetSignalingChannelEndpoint</code> API.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ChannelProtocol
     */

    public ResourceEndpointListItem withProtocol(ChannelProtocol protocol) {
        this.protocol = protocol.toString();
        return this;
    }

    /**
     * <p>
     * The endpoint of the signaling channel returned by the <code>GetSignalingChannelEndpoint</code> API.
     * </p>
     * 
     * @param resourceEndpoint
     *        The endpoint of the signaling channel returned by the <code>GetSignalingChannelEndpoint</code> API.
     */

    public void setResourceEndpoint(String resourceEndpoint) {
        this.resourceEndpoint = resourceEndpoint;
    }

    /**
     * <p>
     * The endpoint of the signaling channel returned by the <code>GetSignalingChannelEndpoint</code> API.
     * </p>
     * 
     * @return The endpoint of the signaling channel returned by the <code>GetSignalingChannelEndpoint</code> API.
     */

    public String getResourceEndpoint() {
        return this.resourceEndpoint;
    }

    /**
     * <p>
     * The endpoint of the signaling channel returned by the <code>GetSignalingChannelEndpoint</code> API.
     * </p>
     * 
     * @param resourceEndpoint
     *        The endpoint of the signaling channel returned by the <code>GetSignalingChannelEndpoint</code> API.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceEndpointListItem withResourceEndpoint(String resourceEndpoint) {
        setResourceEndpoint(resourceEndpoint);
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
        if (getProtocol() != null)
            sb.append("Protocol: ").append(getProtocol()).append(",");
        if (getResourceEndpoint() != null)
            sb.append("ResourceEndpoint: ").append(getResourceEndpoint());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ResourceEndpointListItem == false)
            return false;
        ResourceEndpointListItem other = (ResourceEndpointListItem) obj;
        if (other.getProtocol() == null ^ this.getProtocol() == null)
            return false;
        if (other.getProtocol() != null && other.getProtocol().equals(this.getProtocol()) == false)
            return false;
        if (other.getResourceEndpoint() == null ^ this.getResourceEndpoint() == null)
            return false;
        if (other.getResourceEndpoint() != null && other.getResourceEndpoint().equals(this.getResourceEndpoint()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getProtocol() == null) ? 0 : getProtocol().hashCode());
        hashCode = prime * hashCode + ((getResourceEndpoint() == null) ? 0 : getResourceEndpoint().hashCode());
        return hashCode;
    }

    @Override
    public ResourceEndpointListItem clone() {
        try {
            return (ResourceEndpointListItem) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.kinesisvideo.model.transform.ResourceEndpointListItemMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
