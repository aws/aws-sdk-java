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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transfer-2018-11-05/DeleteHostKey" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteHostKeyRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier of the server that contains the host key that you are deleting.
     * </p>
     */
    private String serverId;
    /**
     * <p>
     * The identifier of the host key that you are deleting.
     * </p>
     */
    private String hostKeyId;

    /**
     * <p>
     * The identifier of the server that contains the host key that you are deleting.
     * </p>
     * 
     * @param serverId
     *        The identifier of the server that contains the host key that you are deleting.
     */

    public void setServerId(String serverId) {
        this.serverId = serverId;
    }

    /**
     * <p>
     * The identifier of the server that contains the host key that you are deleting.
     * </p>
     * 
     * @return The identifier of the server that contains the host key that you are deleting.
     */

    public String getServerId() {
        return this.serverId;
    }

    /**
     * <p>
     * The identifier of the server that contains the host key that you are deleting.
     * </p>
     * 
     * @param serverId
     *        The identifier of the server that contains the host key that you are deleting.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteHostKeyRequest withServerId(String serverId) {
        setServerId(serverId);
        return this;
    }

    /**
     * <p>
     * The identifier of the host key that you are deleting.
     * </p>
     * 
     * @param hostKeyId
     *        The identifier of the host key that you are deleting.
     */

    public void setHostKeyId(String hostKeyId) {
        this.hostKeyId = hostKeyId;
    }

    /**
     * <p>
     * The identifier of the host key that you are deleting.
     * </p>
     * 
     * @return The identifier of the host key that you are deleting.
     */

    public String getHostKeyId() {
        return this.hostKeyId;
    }

    /**
     * <p>
     * The identifier of the host key that you are deleting.
     * </p>
     * 
     * @param hostKeyId
     *        The identifier of the host key that you are deleting.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteHostKeyRequest withHostKeyId(String hostKeyId) {
        setHostKeyId(hostKeyId);
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
            sb.append("HostKeyId: ").append(getHostKeyId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteHostKeyRequest == false)
            return false;
        DeleteHostKeyRequest other = (DeleteHostKeyRequest) obj;
        if (other.getServerId() == null ^ this.getServerId() == null)
            return false;
        if (other.getServerId() != null && other.getServerId().equals(this.getServerId()) == false)
            return false;
        if (other.getHostKeyId() == null ^ this.getHostKeyId() == null)
            return false;
        if (other.getHostKeyId() != null && other.getHostKeyId().equals(this.getHostKeyId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getServerId() == null) ? 0 : getServerId().hashCode());
        hashCode = prime * hashCode + ((getHostKeyId() == null) ? 0 : getHostKeyId().hashCode());
        return hashCode;
    }

    @Override
    public DeleteHostKeyRequest clone() {
        return (DeleteHostKeyRequest) super.clone();
    }

}
