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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/UpdateConnection" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateConnectionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the global network.
     * </p>
     */
    private String globalNetworkId;
    /**
     * <p>
     * The ID of the connection.
     * </p>
     */
    private String connectionId;
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
     * A description of the connection.
     * </p>
     * <p>
     * Length Constraints: Maximum length of 256 characters.
     * </p>
     */
    private String description;

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

    public UpdateConnectionRequest withGlobalNetworkId(String globalNetworkId) {
        setGlobalNetworkId(globalNetworkId);
        return this;
    }

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

    public UpdateConnectionRequest withConnectionId(String connectionId) {
        setConnectionId(connectionId);
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

    public UpdateConnectionRequest withLinkId(String linkId) {
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

    public UpdateConnectionRequest withConnectedLinkId(String connectedLinkId) {
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

    public UpdateConnectionRequest withDescription(String description) {
        setDescription(description);
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
        if (getConnectionId() != null)
            sb.append("ConnectionId: ").append(getConnectionId()).append(",");
        if (getLinkId() != null)
            sb.append("LinkId: ").append(getLinkId()).append(",");
        if (getConnectedLinkId() != null)
            sb.append("ConnectedLinkId: ").append(getConnectedLinkId()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateConnectionRequest == false)
            return false;
        UpdateConnectionRequest other = (UpdateConnectionRequest) obj;
        if (other.getGlobalNetworkId() == null ^ this.getGlobalNetworkId() == null)
            return false;
        if (other.getGlobalNetworkId() != null && other.getGlobalNetworkId().equals(this.getGlobalNetworkId()) == false)
            return false;
        if (other.getConnectionId() == null ^ this.getConnectionId() == null)
            return false;
        if (other.getConnectionId() != null && other.getConnectionId().equals(this.getConnectionId()) == false)
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
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getGlobalNetworkId() == null) ? 0 : getGlobalNetworkId().hashCode());
        hashCode = prime * hashCode + ((getConnectionId() == null) ? 0 : getConnectionId().hashCode());
        hashCode = prime * hashCode + ((getLinkId() == null) ? 0 : getLinkId().hashCode());
        hashCode = prime * hashCode + ((getConnectedLinkId() == null) ? 0 : getConnectedLinkId().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        return hashCode;
    }

    @Override
    public UpdateConnectionRequest clone() {
        return (UpdateConnectionRequest) super.clone();
    }

}
