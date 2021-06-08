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
package com.amazonaws.services.s3outposts.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The container for the network interface.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3outposts-2017-07-25/NetworkInterface" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class NetworkInterface implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ID for the network interface.
     * </p>
     */
    private String networkInterfaceId;

    /**
     * <p>
     * The ID for the network interface.
     * </p>
     * 
     * @param networkInterfaceId
     *        The ID for the network interface.
     */

    public void setNetworkInterfaceId(String networkInterfaceId) {
        this.networkInterfaceId = networkInterfaceId;
    }

    /**
     * <p>
     * The ID for the network interface.
     * </p>
     * 
     * @return The ID for the network interface.
     */

    public String getNetworkInterfaceId() {
        return this.networkInterfaceId;
    }

    /**
     * <p>
     * The ID for the network interface.
     * </p>
     * 
     * @param networkInterfaceId
     *        The ID for the network interface.
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
        com.amazonaws.services.s3outposts.model.transform.NetworkInterfaceMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
