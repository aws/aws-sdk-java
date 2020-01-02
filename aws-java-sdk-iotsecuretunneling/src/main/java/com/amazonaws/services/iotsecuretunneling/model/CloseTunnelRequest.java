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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotsecuretunneling-2018-10-05/CloseTunnel" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CloseTunnelRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the tunnel to close.
     * </p>
     */
    private String tunnelId;
    /**
     * <p>
     * When set to true, AWS IoT Secure Tunneling deletes the tunnel data immediately.
     * </p>
     */
    private Boolean delete;

    /**
     * <p>
     * The ID of the tunnel to close.
     * </p>
     * 
     * @param tunnelId
     *        The ID of the tunnel to close.
     */

    public void setTunnelId(String tunnelId) {
        this.tunnelId = tunnelId;
    }

    /**
     * <p>
     * The ID of the tunnel to close.
     * </p>
     * 
     * @return The ID of the tunnel to close.
     */

    public String getTunnelId() {
        return this.tunnelId;
    }

    /**
     * <p>
     * The ID of the tunnel to close.
     * </p>
     * 
     * @param tunnelId
     *        The ID of the tunnel to close.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CloseTunnelRequest withTunnelId(String tunnelId) {
        setTunnelId(tunnelId);
        return this;
    }

    /**
     * <p>
     * When set to true, AWS IoT Secure Tunneling deletes the tunnel data immediately.
     * </p>
     * 
     * @param delete
     *        When set to true, AWS IoT Secure Tunneling deletes the tunnel data immediately.
     */

    public void setDelete(Boolean delete) {
        this.delete = delete;
    }

    /**
     * <p>
     * When set to true, AWS IoT Secure Tunneling deletes the tunnel data immediately.
     * </p>
     * 
     * @return When set to true, AWS IoT Secure Tunneling deletes the tunnel data immediately.
     */

    public Boolean getDelete() {
        return this.delete;
    }

    /**
     * <p>
     * When set to true, AWS IoT Secure Tunneling deletes the tunnel data immediately.
     * </p>
     * 
     * @param delete
     *        When set to true, AWS IoT Secure Tunneling deletes the tunnel data immediately.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CloseTunnelRequest withDelete(Boolean delete) {
        setDelete(delete);
        return this;
    }

    /**
     * <p>
     * When set to true, AWS IoT Secure Tunneling deletes the tunnel data immediately.
     * </p>
     * 
     * @return When set to true, AWS IoT Secure Tunneling deletes the tunnel data immediately.
     */

    public Boolean isDelete() {
        return this.delete;
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
        if (getDelete() != null)
            sb.append("Delete: ").append(getDelete());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CloseTunnelRequest == false)
            return false;
        CloseTunnelRequest other = (CloseTunnelRequest) obj;
        if (other.getTunnelId() == null ^ this.getTunnelId() == null)
            return false;
        if (other.getTunnelId() != null && other.getTunnelId().equals(this.getTunnelId()) == false)
            return false;
        if (other.getDelete() == null ^ this.getDelete() == null)
            return false;
        if (other.getDelete() != null && other.getDelete().equals(this.getDelete()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTunnelId() == null) ? 0 : getTunnelId().hashCode());
        hashCode = prime * hashCode + ((getDelete() == null) ? 0 : getDelete().hashCode());
        return hashCode;
    }

    @Override
    public CloseTunnelRequest clone() {
        return (CloseTunnelRequest) super.clone();
    }

}
