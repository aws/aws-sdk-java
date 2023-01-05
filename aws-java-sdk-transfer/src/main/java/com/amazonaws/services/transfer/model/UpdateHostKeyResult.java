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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transfer-2018-11-05/UpdateHostKey" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateHostKeyResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Returns the server identifier for the server that contains the updated host key.
     * </p>
     */
    private String serverId;
    /**
     * <p>
     * Returns the host key identifier for the updated host key.
     * </p>
     */
    private String hostKeyId;

    /**
     * <p>
     * Returns the server identifier for the server that contains the updated host key.
     * </p>
     * 
     * @param serverId
     *        Returns the server identifier for the server that contains the updated host key.
     */

    public void setServerId(String serverId) {
        this.serverId = serverId;
    }

    /**
     * <p>
     * Returns the server identifier for the server that contains the updated host key.
     * </p>
     * 
     * @return Returns the server identifier for the server that contains the updated host key.
     */

    public String getServerId() {
        return this.serverId;
    }

    /**
     * <p>
     * Returns the server identifier for the server that contains the updated host key.
     * </p>
     * 
     * @param serverId
     *        Returns the server identifier for the server that contains the updated host key.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateHostKeyResult withServerId(String serverId) {
        setServerId(serverId);
        return this;
    }

    /**
     * <p>
     * Returns the host key identifier for the updated host key.
     * </p>
     * 
     * @param hostKeyId
     *        Returns the host key identifier for the updated host key.
     */

    public void setHostKeyId(String hostKeyId) {
        this.hostKeyId = hostKeyId;
    }

    /**
     * <p>
     * Returns the host key identifier for the updated host key.
     * </p>
     * 
     * @return Returns the host key identifier for the updated host key.
     */

    public String getHostKeyId() {
        return this.hostKeyId;
    }

    /**
     * <p>
     * Returns the host key identifier for the updated host key.
     * </p>
     * 
     * @param hostKeyId
     *        Returns the host key identifier for the updated host key.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateHostKeyResult withHostKeyId(String hostKeyId) {
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

        if (obj instanceof UpdateHostKeyResult == false)
            return false;
        UpdateHostKeyResult other = (UpdateHostKeyResult) obj;
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
    public UpdateHostKeyResult clone() {
        try {
            return (UpdateHostKeyResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
