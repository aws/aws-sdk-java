/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.quicksight.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The structure that contains information about a network interface.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/NetworkInterface" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class NetworkInterface implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The subnet ID associated with the network interface.
     * </p>
     */
    private String subnetId;
    /**
     * <p>
     * The availability zone that the network interface resides in.
     * </p>
     */
    private String availabilityZone;
    /**
     * <p>
     * An error message.
     * </p>
     */
    private String errorMessage;
    /**
     * <p>
     * The status of the network interface.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The network interface ID.
     * </p>
     */
    private String networkInterfaceId;

    /**
     * <p>
     * The subnet ID associated with the network interface.
     * </p>
     * 
     * @param subnetId
     *        The subnet ID associated with the network interface.
     */

    public void setSubnetId(String subnetId) {
        this.subnetId = subnetId;
    }

    /**
     * <p>
     * The subnet ID associated with the network interface.
     * </p>
     * 
     * @return The subnet ID associated with the network interface.
     */

    public String getSubnetId() {
        return this.subnetId;
    }

    /**
     * <p>
     * The subnet ID associated with the network interface.
     * </p>
     * 
     * @param subnetId
     *        The subnet ID associated with the network interface.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NetworkInterface withSubnetId(String subnetId) {
        setSubnetId(subnetId);
        return this;
    }

    /**
     * <p>
     * The availability zone that the network interface resides in.
     * </p>
     * 
     * @param availabilityZone
     *        The availability zone that the network interface resides in.
     */

    public void setAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
    }

    /**
     * <p>
     * The availability zone that the network interface resides in.
     * </p>
     * 
     * @return The availability zone that the network interface resides in.
     */

    public String getAvailabilityZone() {
        return this.availabilityZone;
    }

    /**
     * <p>
     * The availability zone that the network interface resides in.
     * </p>
     * 
     * @param availabilityZone
     *        The availability zone that the network interface resides in.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NetworkInterface withAvailabilityZone(String availabilityZone) {
        setAvailabilityZone(availabilityZone);
        return this;
    }

    /**
     * <p>
     * An error message.
     * </p>
     * 
     * @param errorMessage
     *        An error message.
     */

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    /**
     * <p>
     * An error message.
     * </p>
     * 
     * @return An error message.
     */

    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * <p>
     * An error message.
     * </p>
     * 
     * @param errorMessage
     *        An error message.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NetworkInterface withErrorMessage(String errorMessage) {
        setErrorMessage(errorMessage);
        return this;
    }

    /**
     * <p>
     * The status of the network interface.
     * </p>
     * 
     * @param status
     *        The status of the network interface.
     * @see NetworkInterfaceStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the network interface.
     * </p>
     * 
     * @return The status of the network interface.
     * @see NetworkInterfaceStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the network interface.
     * </p>
     * 
     * @param status
     *        The status of the network interface.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see NetworkInterfaceStatus
     */

    public NetworkInterface withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the network interface.
     * </p>
     * 
     * @param status
     *        The status of the network interface.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see NetworkInterfaceStatus
     */

    public NetworkInterface withStatus(NetworkInterfaceStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The network interface ID.
     * </p>
     * 
     * @param networkInterfaceId
     *        The network interface ID.
     */

    public void setNetworkInterfaceId(String networkInterfaceId) {
        this.networkInterfaceId = networkInterfaceId;
    }

    /**
     * <p>
     * The network interface ID.
     * </p>
     * 
     * @return The network interface ID.
     */

    public String getNetworkInterfaceId() {
        return this.networkInterfaceId;
    }

    /**
     * <p>
     * The network interface ID.
     * </p>
     * 
     * @param networkInterfaceId
     *        The network interface ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NetworkInterface withNetworkInterfaceId(String networkInterfaceId) {
        setNetworkInterfaceId(networkInterfaceId);
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
        if (getSubnetId() != null)
            sb.append("SubnetId: ").append(getSubnetId()).append(",");
        if (getAvailabilityZone() != null)
            sb.append("AvailabilityZone: ").append(getAvailabilityZone()).append(",");
        if (getErrorMessage() != null)
            sb.append("ErrorMessage: ").append(getErrorMessage()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getNetworkInterfaceId() != null)
            sb.append("NetworkInterfaceId: ").append(getNetworkInterfaceId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof NetworkInterface == false)
            return false;
        NetworkInterface other = (NetworkInterface) obj;
        if (other.getSubnetId() == null ^ this.getSubnetId() == null)
            return false;
        if (other.getSubnetId() != null && other.getSubnetId().equals(this.getSubnetId()) == false)
            return false;
        if (other.getAvailabilityZone() == null ^ this.getAvailabilityZone() == null)
            return false;
        if (other.getAvailabilityZone() != null && other.getAvailabilityZone().equals(this.getAvailabilityZone()) == false)
            return false;
        if (other.getErrorMessage() == null ^ this.getErrorMessage() == null)
            return false;
        if (other.getErrorMessage() != null && other.getErrorMessage().equals(this.getErrorMessage()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getNetworkInterfaceId() == null ^ this.getNetworkInterfaceId() == null)
            return false;
        if (other.getNetworkInterfaceId() != null && other.getNetworkInterfaceId().equals(this.getNetworkInterfaceId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSubnetId() == null) ? 0 : getSubnetId().hashCode());
        hashCode = prime * hashCode + ((getAvailabilityZone() == null) ? 0 : getAvailabilityZone().hashCode());
        hashCode = prime * hashCode + ((getErrorMessage() == null) ? 0 : getErrorMessage().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getNetworkInterfaceId() == null) ? 0 : getNetworkInterfaceId().hashCode());
        return hashCode;
    }

    @Override
    public NetworkInterface clone() {
        try {
            return (NetworkInterface) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.NetworkInterfaceMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
