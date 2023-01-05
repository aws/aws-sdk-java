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
package com.amazonaws.services.private5g.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about a network.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/privatenetworks-2021-12-03/Network" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Network implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The creation time of the network.
     * </p>
     */
    private java.util.Date createdAt;
    /**
     * <p>
     * The description of the network.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the network.
     * </p>
     */
    private String networkArn;
    /**
     * <p>
     * The name of the network.
     * </p>
     */
    private String networkName;
    /**
     * <p>
     * The status of the network.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The status reason of the network.
     * </p>
     */
    private String statusReason;

    /**
     * <p>
     * The creation time of the network.
     * </p>
     * 
     * @param createdAt
     *        The creation time of the network.
     */

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * The creation time of the network.
     * </p>
     * 
     * @return The creation time of the network.
     */

    public java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    /**
     * <p>
     * The creation time of the network.
     * </p>
     * 
     * @param createdAt
     *        The creation time of the network.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Network withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
        return this;
    }

    /**
     * <p>
     * The description of the network.
     * </p>
     * 
     * @param description
     *        The description of the network.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the network.
     * </p>
     * 
     * @return The description of the network.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the network.
     * </p>
     * 
     * @param description
     *        The description of the network.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Network withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the network.
     * </p>
     * 
     * @param networkArn
     *        The Amazon Resource Name (ARN) of the network.
     */

    public void setNetworkArn(String networkArn) {
        this.networkArn = networkArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the network.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the network.
     */

    public String getNetworkArn() {
        return this.networkArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the network.
     * </p>
     * 
     * @param networkArn
     *        The Amazon Resource Name (ARN) of the network.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Network withNetworkArn(String networkArn) {
        setNetworkArn(networkArn);
        return this;
    }

    /**
     * <p>
     * The name of the network.
     * </p>
     * 
     * @param networkName
     *        The name of the network.
     */

    public void setNetworkName(String networkName) {
        this.networkName = networkName;
    }

    /**
     * <p>
     * The name of the network.
     * </p>
     * 
     * @return The name of the network.
     */

    public String getNetworkName() {
        return this.networkName;
    }

    /**
     * <p>
     * The name of the network.
     * </p>
     * 
     * @param networkName
     *        The name of the network.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Network withNetworkName(String networkName) {
        setNetworkName(networkName);
        return this;
    }

    /**
     * <p>
     * The status of the network.
     * </p>
     * 
     * @param status
     *        The status of the network.
     * @see NetworkStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the network.
     * </p>
     * 
     * @return The status of the network.
     * @see NetworkStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the network.
     * </p>
     * 
     * @param status
     *        The status of the network.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see NetworkStatus
     */

    public Network withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the network.
     * </p>
     * 
     * @param status
     *        The status of the network.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see NetworkStatus
     */

    public Network withStatus(NetworkStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The status reason of the network.
     * </p>
     * 
     * @param statusReason
     *        The status reason of the network.
     */

    public void setStatusReason(String statusReason) {
        this.statusReason = statusReason;
    }

    /**
     * <p>
     * The status reason of the network.
     * </p>
     * 
     * @return The status reason of the network.
     */

    public String getStatusReason() {
        return this.statusReason;
    }

    /**
     * <p>
     * The status reason of the network.
     * </p>
     * 
     * @param statusReason
     *        The status reason of the network.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Network withStatusReason(String statusReason) {
        setStatusReason(statusReason);
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
        if (getCreatedAt() != null)
            sb.append("CreatedAt: ").append(getCreatedAt()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getNetworkArn() != null)
            sb.append("NetworkArn: ").append(getNetworkArn()).append(",");
        if (getNetworkName() != null)
            sb.append("NetworkName: ").append(getNetworkName()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getStatusReason() != null)
            sb.append("StatusReason: ").append(getStatusReason());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Network == false)
            return false;
        Network other = (Network) obj;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getNetworkArn() == null ^ this.getNetworkArn() == null)
            return false;
        if (other.getNetworkArn() != null && other.getNetworkArn().equals(this.getNetworkArn()) == false)
            return false;
        if (other.getNetworkName() == null ^ this.getNetworkName() == null)
            return false;
        if (other.getNetworkName() != null && other.getNetworkName().equals(this.getNetworkName()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getStatusReason() == null ^ this.getStatusReason() == null)
            return false;
        if (other.getStatusReason() != null && other.getStatusReason().equals(this.getStatusReason()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getNetworkArn() == null) ? 0 : getNetworkArn().hashCode());
        hashCode = prime * hashCode + ((getNetworkName() == null) ? 0 : getNetworkName().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getStatusReason() == null) ? 0 : getStatusReason().hashCode());
        return hashCode;
    }

    @Override
    public Network clone() {
        try {
            return (Network) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.private5g.model.transform.NetworkMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
