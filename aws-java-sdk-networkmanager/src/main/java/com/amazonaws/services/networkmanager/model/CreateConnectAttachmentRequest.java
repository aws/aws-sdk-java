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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/CreateConnectAttachment"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateConnectAttachmentRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of a core network where you want to create the attachment.
     * </p>
     */
    private String coreNetworkId;
    /**
     * <p>
     * The Region where the edge is located.
     * </p>
     */
    private String edgeLocation;
    /**
     * <p>
     * The ID of the attachment between the two connections.
     * </p>
     */
    private String transportAttachmentId;
    /**
     * <p>
     * Options for creating an attachment.
     * </p>
     */
    private ConnectAttachmentOptions options;
    /**
     * <p>
     * The list of key-value tags associated with the request.
     * </p>
     */
    private java.util.List<Tag> tags;
    /**
     * <p>
     * The client token associated with the request.
     * </p>
     */
    private String clientToken;

    /**
     * <p>
     * The ID of a core network where you want to create the attachment.
     * </p>
     * 
     * @param coreNetworkId
     *        The ID of a core network where you want to create the attachment.
     */

    public void setCoreNetworkId(String coreNetworkId) {
        this.coreNetworkId = coreNetworkId;
    }

    /**
     * <p>
     * The ID of a core network where you want to create the attachment.
     * </p>
     * 
     * @return The ID of a core network where you want to create the attachment.
     */

    public String getCoreNetworkId() {
        return this.coreNetworkId;
    }

    /**
     * <p>
     * The ID of a core network where you want to create the attachment.
     * </p>
     * 
     * @param coreNetworkId
     *        The ID of a core network where you want to create the attachment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateConnectAttachmentRequest withCoreNetworkId(String coreNetworkId) {
        setCoreNetworkId(coreNetworkId);
        return this;
    }

    /**
     * <p>
     * The Region where the edge is located.
     * </p>
     * 
     * @param edgeLocation
     *        The Region where the edge is located.
     */

    public void setEdgeLocation(String edgeLocation) {
        this.edgeLocation = edgeLocation;
    }

    /**
     * <p>
     * The Region where the edge is located.
     * </p>
     * 
     * @return The Region where the edge is located.
     */

    public String getEdgeLocation() {
        return this.edgeLocation;
    }

    /**
     * <p>
     * The Region where the edge is located.
     * </p>
     * 
     * @param edgeLocation
     *        The Region where the edge is located.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateConnectAttachmentRequest withEdgeLocation(String edgeLocation) {
        setEdgeLocation(edgeLocation);
        return this;
    }

    /**
     * <p>
     * The ID of the attachment between the two connections.
     * </p>
     * 
     * @param transportAttachmentId
     *        The ID of the attachment between the two connections.
     */

    public void setTransportAttachmentId(String transportAttachmentId) {
        this.transportAttachmentId = transportAttachmentId;
    }

    /**
     * <p>
     * The ID of the attachment between the two connections.
     * </p>
     * 
     * @return The ID of the attachment between the two connections.
     */

    public String getTransportAttachmentId() {
        return this.transportAttachmentId;
    }

    /**
     * <p>
     * The ID of the attachment between the two connections.
     * </p>
     * 
     * @param transportAttachmentId
     *        The ID of the attachment between the two connections.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateConnectAttachmentRequest withTransportAttachmentId(String transportAttachmentId) {
        setTransportAttachmentId(transportAttachmentId);
        return this;
    }

    /**
     * <p>
     * Options for creating an attachment.
     * </p>
     * 
     * @param options
     *        Options for creating an attachment.
     */

    public void setOptions(ConnectAttachmentOptions options) {
        this.options = options;
    }

    /**
     * <p>
     * Options for creating an attachment.
     * </p>
     * 
     * @return Options for creating an attachment.
     */

    public ConnectAttachmentOptions getOptions() {
        return this.options;
    }

    /**
     * <p>
     * Options for creating an attachment.
     * </p>
     * 
     * @param options
     *        Options for creating an attachment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateConnectAttachmentRequest withOptions(ConnectAttachmentOptions options) {
        setOptions(options);
        return this;
    }

    /**
     * <p>
     * The list of key-value tags associated with the request.
     * </p>
     * 
     * @return The list of key-value tags associated with the request.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * The list of key-value tags associated with the request.
     * </p>
     * 
     * @param tags
     *        The list of key-value tags associated with the request.
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
     * The list of key-value tags associated with the request.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        The list of key-value tags associated with the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateConnectAttachmentRequest withTags(Tag... tags) {
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
     * The list of key-value tags associated with the request.
     * </p>
     * 
     * @param tags
     *        The list of key-value tags associated with the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateConnectAttachmentRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
        return this;
    }

    /**
     * <p>
     * The client token associated with the request.
     * </p>
     * 
     * @param clientToken
     *        The client token associated with the request.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * The client token associated with the request.
     * </p>
     * 
     * @return The client token associated with the request.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * The client token associated with the request.
     * </p>
     * 
     * @param clientToken
     *        The client token associated with the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateConnectAttachmentRequest withClientToken(String clientToken) {
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
        if (getCoreNetworkId() != null)
            sb.append("CoreNetworkId: ").append(getCoreNetworkId()).append(",");
        if (getEdgeLocation() != null)
            sb.append("EdgeLocation: ").append(getEdgeLocation()).append(",");
        if (getTransportAttachmentId() != null)
            sb.append("TransportAttachmentId: ").append(getTransportAttachmentId()).append(",");
        if (getOptions() != null)
            sb.append("Options: ").append(getOptions()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
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

        if (obj instanceof CreateConnectAttachmentRequest == false)
            return false;
        CreateConnectAttachmentRequest other = (CreateConnectAttachmentRequest) obj;
        if (other.getCoreNetworkId() == null ^ this.getCoreNetworkId() == null)
            return false;
        if (other.getCoreNetworkId() != null && other.getCoreNetworkId().equals(this.getCoreNetworkId()) == false)
            return false;
        if (other.getEdgeLocation() == null ^ this.getEdgeLocation() == null)
            return false;
        if (other.getEdgeLocation() != null && other.getEdgeLocation().equals(this.getEdgeLocation()) == false)
            return false;
        if (other.getTransportAttachmentId() == null ^ this.getTransportAttachmentId() == null)
            return false;
        if (other.getTransportAttachmentId() != null && other.getTransportAttachmentId().equals(this.getTransportAttachmentId()) == false)
            return false;
        if (other.getOptions() == null ^ this.getOptions() == null)
            return false;
        if (other.getOptions() != null && other.getOptions().equals(this.getOptions()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
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

        hashCode = prime * hashCode + ((getCoreNetworkId() == null) ? 0 : getCoreNetworkId().hashCode());
        hashCode = prime * hashCode + ((getEdgeLocation() == null) ? 0 : getEdgeLocation().hashCode());
        hashCode = prime * hashCode + ((getTransportAttachmentId() == null) ? 0 : getTransportAttachmentId().hashCode());
        hashCode = prime * hashCode + ((getOptions() == null) ? 0 : getOptions().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        return hashCode;
    }

    @Override
    public CreateConnectAttachmentRequest clone() {
        return (CreateConnectAttachmentRequest) super.clone();
    }

}
