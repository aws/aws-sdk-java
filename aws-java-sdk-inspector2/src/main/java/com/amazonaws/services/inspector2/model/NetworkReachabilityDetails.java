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
package com.amazonaws.services.inspector2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains the details of a network reachability finding.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/inspector2-2020-06-08/NetworkReachabilityDetails"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class NetworkReachabilityDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * An object that contains details about a network path associated with a finding.
     * </p>
     */
    private NetworkPath networkPath;
    /**
     * <p>
     * An object that contains details about the open port range associated with a finding.
     * </p>
     */
    private PortRange openPortRange;
    /**
     * <p>
     * The protocol associated with a finding.
     * </p>
     */
    private String protocol;

    /**
     * <p>
     * An object that contains details about a network path associated with a finding.
     * </p>
     * 
     * @param networkPath
     *        An object that contains details about a network path associated with a finding.
     */

    public void setNetworkPath(NetworkPath networkPath) {
        this.networkPath = networkPath;
    }

    /**
     * <p>
     * An object that contains details about a network path associated with a finding.
     * </p>
     * 
     * @return An object that contains details about a network path associated with a finding.
     */

    public NetworkPath getNetworkPath() {
        return this.networkPath;
    }

    /**
     * <p>
     * An object that contains details about a network path associated with a finding.
     * </p>
     * 
     * @param networkPath
     *        An object that contains details about a network path associated with a finding.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NetworkReachabilityDetails withNetworkPath(NetworkPath networkPath) {
        setNetworkPath(networkPath);
        return this;
    }

    /**
     * <p>
     * An object that contains details about the open port range associated with a finding.
     * </p>
     * 
     * @param openPortRange
     *        An object that contains details about the open port range associated with a finding.
     */

    public void setOpenPortRange(PortRange openPortRange) {
        this.openPortRange = openPortRange;
    }

    /**
     * <p>
     * An object that contains details about the open port range associated with a finding.
     * </p>
     * 
     * @return An object that contains details about the open port range associated with a finding.
     */

    public PortRange getOpenPortRange() {
        return this.openPortRange;
    }

    /**
     * <p>
     * An object that contains details about the open port range associated with a finding.
     * </p>
     * 
     * @param openPortRange
     *        An object that contains details about the open port range associated with a finding.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NetworkReachabilityDetails withOpenPortRange(PortRange openPortRange) {
        setOpenPortRange(openPortRange);
        return this;
    }

    /**
     * <p>
     * The protocol associated with a finding.
     * </p>
     * 
     * @param protocol
     *        The protocol associated with a finding.
     * @see NetworkProtocol
     */

    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    /**
     * <p>
     * The protocol associated with a finding.
     * </p>
     * 
     * @return The protocol associated with a finding.
     * @see NetworkProtocol
     */

    public String getProtocol() {
        return this.protocol;
    }

    /**
     * <p>
     * The protocol associated with a finding.
     * </p>
     * 
     * @param protocol
     *        The protocol associated with a finding.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see NetworkProtocol
     */

    public NetworkReachabilityDetails withProtocol(String protocol) {
        setProtocol(protocol);
        return this;
    }

    /**
     * <p>
     * The protocol associated with a finding.
     * </p>
     * 
     * @param protocol
     *        The protocol associated with a finding.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see NetworkProtocol
     */

    public NetworkReachabilityDetails withProtocol(NetworkProtocol protocol) {
        this.protocol = protocol.toString();
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
        if (getNetworkPath() != null)
            sb.append("NetworkPath: ").append(getNetworkPath()).append(",");
        if (getOpenPortRange() != null)
            sb.append("OpenPortRange: ").append(getOpenPortRange()).append(",");
        if (getProtocol() != null)
            sb.append("Protocol: ").append(getProtocol());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof NetworkReachabilityDetails == false)
            return false;
        NetworkReachabilityDetails other = (NetworkReachabilityDetails) obj;
        if (other.getNetworkPath() == null ^ this.getNetworkPath() == null)
            return false;
        if (other.getNetworkPath() != null && other.getNetworkPath().equals(this.getNetworkPath()) == false)
            return false;
        if (other.getOpenPortRange() == null ^ this.getOpenPortRange() == null)
            return false;
        if (other.getOpenPortRange() != null && other.getOpenPortRange().equals(this.getOpenPortRange()) == false)
            return false;
        if (other.getProtocol() == null ^ this.getProtocol() == null)
            return false;
        if (other.getProtocol() != null && other.getProtocol().equals(this.getProtocol()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNetworkPath() == null) ? 0 : getNetworkPath().hashCode());
        hashCode = prime * hashCode + ((getOpenPortRange() == null) ? 0 : getOpenPortRange().hashCode());
        hashCode = prime * hashCode + ((getProtocol() == null) ? 0 : getProtocol().hashCode());
        return hashCode;
    }

    @Override
    public NetworkReachabilityDetails clone() {
        try {
            return (NetworkReachabilityDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.inspector2.model.transform.NetworkReachabilityDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
