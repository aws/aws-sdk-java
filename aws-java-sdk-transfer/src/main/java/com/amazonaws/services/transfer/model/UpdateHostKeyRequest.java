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
package com.amazonaws.services.transfer.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transfer-2018-11-05/UpdateHostKey" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateHostKeyRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier of the server that contains the host key that you are updating.
     * </p>
     */
    private String serverId;
    /**
     * <p>
     * The identifier of the host key that you are updating.
     * </p>
     */
    private String hostKeyId;
    /**
     * <p>
     * An updated description for the host key.
     * </p>
     */
    private String description;

    /**
     * <p>
     * The identifier of the server that contains the host key that you are updating.
     * </p>
     * 
     * @param serverId
     *        The identifier of the server that contains the host key that you are updating.
     */

    public void setServerId(String serverId) {
        this.serverId = serverId;
    }

    /**
     * <p>
     * The identifier of the server that contains the host key that you are updating.
     * </p>
     * 
     * @return The identifier of the server that contains the host key that you are updating.
     */

    public String getServerId() {
        return this.serverId;
    }

    /**
     * <p>
     * The identifier of the server that contains the host key that you are updating.
     * </p>
     * 
     * @param serverId
     *        The identifier of the server that contains the host key that you are updating.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateHostKeyRequest withServerId(String serverId) {
        setServerId(serverId);
        return this;
    }

    /**
     * <p>
     * The identifier of the host key that you are updating.
     * </p>
     * 
     * @param hostKeyId
     *        The identifier of the host key that you are updating.
     */

    public void setHostKeyId(String hostKeyId) {
        this.hostKeyId = hostKeyId;
    }

    /**
     * <p>
     * The identifier of the host key that you are updating.
     * </p>
     * 
     * @return The identifier of the host key that you are updating.
     */

    public String getHostKeyId() {
        return this.hostKeyId;
    }

    /**
     * <p>
     * The identifier of the host key that you are updating.
     * </p>
     * 
     * @param hostKeyId
     *        The identifier of the host key that you are updating.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateHostKeyRequest withHostKeyId(String hostKeyId) {
        setHostKeyId(hostKeyId);
        return this;
    }

    /**
     * <p>
     * An updated description for the host key.
     * </p>
     * 
     * @param description
     *        An updated description for the host key.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * An updated description for the host key.
     * </p>
     * 
     * @return An updated description for the host key.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * An updated description for the host key.
     * </p>
     * 
     * @param description
     *        An updated description for the host key.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateHostKeyRequest withDescription(String description) {
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
        if (getServerId() != null)
            sb.append("ServerId: ").append(getServerId()).append(",");
        if (getHostKeyId() != null)
            sb.append("HostKeyId: ").append(getHostKeyId()).append(",");
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

        if (obj instanceof UpdateHostKeyRequest == false)
            return false;
        UpdateHostKeyRequest other = (UpdateHostKeyRequest) obj;
        if (other.getServerId() == null ^ this.getServerId() == null)
            return false;
        if (other.getServerId() != null && other.getServerId().equals(this.getServerId()) == false)
            return false;
        if (other.getHostKeyId() == null ^ this.getHostKeyId() == null)
            return false;
        if (other.getHostKeyId() != null && other.getHostKeyId().equals(this.getHostKeyId()) == false)
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

        hashCode = prime * hashCode + ((getServerId() == null) ? 0 : getServerId().hashCode());
        hashCode = prime * hashCode + ((getHostKeyId() == null) ? 0 : getHostKeyId().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        return hashCode;
    }

    @Override
    public UpdateHostKeyRequest clone() {
        return (UpdateHostKeyRequest) super.clone();
    }

}
