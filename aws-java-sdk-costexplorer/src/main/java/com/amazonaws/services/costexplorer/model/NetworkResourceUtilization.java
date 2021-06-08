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
package com.amazonaws.services.costexplorer.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The network field that contains a list of network metrics associated with the current instance.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ce-2017-10-25/NetworkResourceUtilization" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class NetworkResourceUtilization implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The network ingress throughput utilization measured in Bytes per second.
     * </p>
     */
    private String networkInBytesPerSecond;
    /**
     * <p>
     * The network outgress throughput utilization measured in Bytes per second.
     * </p>
     */
    private String networkOutBytesPerSecond;
    /**
     * <p>
     * The network ingress packets measured in packets per second.
     * </p>
     */
    private String networkPacketsInPerSecond;
    /**
     * <p>
     * The network outgress packets measured in packets per second.
     * </p>
     */
    private String networkPacketsOutPerSecond;

    /**
     * <p>
     * The network ingress throughput utilization measured in Bytes per second.
     * </p>
     * 
     * @param networkInBytesPerSecond
     *        The network ingress throughput utilization measured in Bytes per second.
     */

    public void setNetworkInBytesPerSecond(String networkInBytesPerSecond) {
        this.networkInBytesPerSecond = networkInBytesPerSecond;
    }

    /**
     * <p>
     * The network ingress throughput utilization measured in Bytes per second.
     * </p>
     * 
     * @return The network ingress throughput utilization measured in Bytes per second.
     */

    public String getNetworkInBytesPerSecond() {
        return this.networkInBytesPerSecond;
    }

    /**
     * <p>
     * The network ingress throughput utilization measured in Bytes per second.
     * </p>
     * 
     * @param networkInBytesPerSecond
     *        The network ingress throughput utilization measured in Bytes per second.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NetworkResourceUtilization withNetworkInBytesPerSecond(String networkInBytesPerSecond) {
        setNetworkInBytesPerSecond(networkInBytesPerSecond);
        return this;
    }

    /**
     * <p>
     * The network outgress throughput utilization measured in Bytes per second.
     * </p>
     * 
     * @param networkOutBytesPerSecond
     *        The network outgress throughput utilization measured in Bytes per second.
     */

    public void setNetworkOutBytesPerSecond(String networkOutBytesPerSecond) {
        this.networkOutBytesPerSecond = networkOutBytesPerSecond;
    }

    /**
     * <p>
     * The network outgress throughput utilization measured in Bytes per second.
     * </p>
     * 
     * @return The network outgress throughput utilization measured in Bytes per second.
     */

    public String getNetworkOutBytesPerSecond() {
        return this.networkOutBytesPerSecond;
    }

    /**
     * <p>
     * The network outgress throughput utilization measured in Bytes per second.
     * </p>
     * 
     * @param networkOutBytesPerSecond
     *        The network outgress throughput utilization measured in Bytes per second.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NetworkResourceUtilization withNetworkOutBytesPerSecond(String networkOutBytesPerSecond) {
        setNetworkOutBytesPerSecond(networkOutBytesPerSecond);
        return this;
    }

    /**
     * <p>
     * The network ingress packets measured in packets per second.
     * </p>
     * 
     * @param networkPacketsInPerSecond
     *        The network ingress packets measured in packets per second.
     */

    public void setNetworkPacketsInPerSecond(String networkPacketsInPerSecond) {
        this.networkPacketsInPerSecond = networkPacketsInPerSecond;
    }

    /**
     * <p>
     * The network ingress packets measured in packets per second.
     * </p>
     * 
     * @return The network ingress packets measured in packets per second.
     */

    public String getNetworkPacketsInPerSecond() {
        return this.networkPacketsInPerSecond;
    }

    /**
     * <p>
     * The network ingress packets measured in packets per second.
     * </p>
     * 
     * @param networkPacketsInPerSecond
     *        The network ingress packets measured in packets per second.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NetworkResourceUtilization withNetworkPacketsInPerSecond(String networkPacketsInPerSecond) {
        setNetworkPacketsInPerSecond(networkPacketsInPerSecond);
        return this;
    }

    /**
     * <p>
     * The network outgress packets measured in packets per second.
     * </p>
     * 
     * @param networkPacketsOutPerSecond
     *        The network outgress packets measured in packets per second.
     */

    public void setNetworkPacketsOutPerSecond(String networkPacketsOutPerSecond) {
        this.networkPacketsOutPerSecond = networkPacketsOutPerSecond;
    }

    /**
     * <p>
     * The network outgress packets measured in packets per second.
     * </p>
     * 
     * @return The network outgress packets measured in packets per second.
     */

    public String getNetworkPacketsOutPerSecond() {
        return this.networkPacketsOutPerSecond;
    }

    /**
     * <p>
     * The network outgress packets measured in packets per second.
     * </p>
     * 
     * @param networkPacketsOutPerSecond
     *        The network outgress packets measured in packets per second.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NetworkResourceUtilization withNetworkPacketsOutPerSecond(String networkPacketsOutPerSecond) {
        setNetworkPacketsOutPerSecond(networkPacketsOutPerSecond);
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
        if (getNetworkInBytesPerSecond() != null)
            sb.append("NetworkInBytesPerSecond: ").append(getNetworkInBytesPerSecond()).append(",");
        if (getNetworkOutBytesPerSecond() != null)
            sb.append("NetworkOutBytesPerSecond: ").append(getNetworkOutBytesPerSecond()).append(",");
        if (getNetworkPacketsInPerSecond() != null)
            sb.append("NetworkPacketsInPerSecond: ").append(getNetworkPacketsInPerSecond()).append(",");
        if (getNetworkPacketsOutPerSecond() != null)
            sb.append("NetworkPacketsOutPerSecond: ").append(getNetworkPacketsOutPerSecond());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof NetworkResourceUtilization == false)
            return false;
        NetworkResourceUtilization other = (NetworkResourceUtilization) obj;
        if (other.getNetworkInBytesPerSecond() == null ^ this.getNetworkInBytesPerSecond() == null)
            return false;
        if (other.getNetworkInBytesPerSecond() != null && other.getNetworkInBytesPerSecond().equals(this.getNetworkInBytesPerSecond()) == false)
            return false;
        if (other.getNetworkOutBytesPerSecond() == null ^ this.getNetworkOutBytesPerSecond() == null)
            return false;
        if (other.getNetworkOutBytesPerSecond() != null && other.getNetworkOutBytesPerSecond().equals(this.getNetworkOutBytesPerSecond()) == false)
            return false;
        if (other.getNetworkPacketsInPerSecond() == null ^ this.getNetworkPacketsInPerSecond() == null)
            return false;
        if (other.getNetworkPacketsInPerSecond() != null && other.getNetworkPacketsInPerSecond().equals(this.getNetworkPacketsInPerSecond()) == false)
            return false;
        if (other.getNetworkPacketsOutPerSecond() == null ^ this.getNetworkPacketsOutPerSecond() == null)
            return false;
        if (other.getNetworkPacketsOutPerSecond() != null && other.getNetworkPacketsOutPerSecond().equals(this.getNetworkPacketsOutPerSecond()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNetworkInBytesPerSecond() == null) ? 0 : getNetworkInBytesPerSecond().hashCode());
        hashCode = prime * hashCode + ((getNetworkOutBytesPerSecond() == null) ? 0 : getNetworkOutBytesPerSecond().hashCode());
        hashCode = prime * hashCode + ((getNetworkPacketsInPerSecond() == null) ? 0 : getNetworkPacketsInPerSecond().hashCode());
        hashCode = prime * hashCode + ((getNetworkPacketsOutPerSecond() == null) ? 0 : getNetworkPacketsOutPerSecond().hashCode());
        return hashCode;
    }

    @Override
    public NetworkResourceUtilization clone() {
        try {
            return (NetworkResourceUtilization) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.costexplorer.model.transform.NetworkResourceUtilizationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
