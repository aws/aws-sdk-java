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
package com.amazonaws.services.securityhub.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * VPN connection options.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/AwsEc2VpnConnectionOptionsDetails"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsEc2VpnConnectionOptionsDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Whether the VPN connection uses static routes only.
     * </p>
     */
    private Boolean staticRoutesOnly;
    /**
     * <p>
     * The VPN tunnel options.
     * </p>
     */
    private java.util.List<AwsEc2VpnConnectionOptionsTunnelOptionsDetails> tunnelOptions;

    /**
     * <p>
     * Whether the VPN connection uses static routes only.
     * </p>
     * 
     * @param staticRoutesOnly
     *        Whether the VPN connection uses static routes only.
     */

    public void setStaticRoutesOnly(Boolean staticRoutesOnly) {
        this.staticRoutesOnly = staticRoutesOnly;
    }

    /**
     * <p>
     * Whether the VPN connection uses static routes only.
     * </p>
     * 
     * @return Whether the VPN connection uses static routes only.
     */

    public Boolean getStaticRoutesOnly() {
        return this.staticRoutesOnly;
    }

    /**
     * <p>
     * Whether the VPN connection uses static routes only.
     * </p>
     * 
     * @param staticRoutesOnly
     *        Whether the VPN connection uses static routes only.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEc2VpnConnectionOptionsDetails withStaticRoutesOnly(Boolean staticRoutesOnly) {
        setStaticRoutesOnly(staticRoutesOnly);
        return this;
    }

    /**
     * <p>
     * Whether the VPN connection uses static routes only.
     * </p>
     * 
     * @return Whether the VPN connection uses static routes only.
     */

    public Boolean isStaticRoutesOnly() {
        return this.staticRoutesOnly;
    }

    /**
     * <p>
     * The VPN tunnel options.
     * </p>
     * 
     * @return The VPN tunnel options.
     */

    public java.util.List<AwsEc2VpnConnectionOptionsTunnelOptionsDetails> getTunnelOptions() {
        return tunnelOptions;
    }

    /**
     * <p>
     * The VPN tunnel options.
     * </p>
     * 
     * @param tunnelOptions
     *        The VPN tunnel options.
     */

    public void setTunnelOptions(java.util.Collection<AwsEc2VpnConnectionOptionsTunnelOptionsDetails> tunnelOptions) {
        if (tunnelOptions == null) {
            this.tunnelOptions = null;
            return;
        }

        this.tunnelOptions = new java.util.ArrayList<AwsEc2VpnConnectionOptionsTunnelOptionsDetails>(tunnelOptions);
    }

    /**
     * <p>
     * The VPN tunnel options.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTunnelOptions(java.util.Collection)} or {@link #withTunnelOptions(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param tunnelOptions
     *        The VPN tunnel options.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEc2VpnConnectionOptionsDetails withTunnelOptions(AwsEc2VpnConnectionOptionsTunnelOptionsDetails... tunnelOptions) {
        if (this.tunnelOptions == null) {
            setTunnelOptions(new java.util.ArrayList<AwsEc2VpnConnectionOptionsTunnelOptionsDetails>(tunnelOptions.length));
        }
        for (AwsEc2VpnConnectionOptionsTunnelOptionsDetails ele : tunnelOptions) {
            this.tunnelOptions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The VPN tunnel options.
     * </p>
     * 
     * @param tunnelOptions
     *        The VPN tunnel options.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEc2VpnConnectionOptionsDetails withTunnelOptions(java.util.Collection<AwsEc2VpnConnectionOptionsTunnelOptionsDetails> tunnelOptions) {
        setTunnelOptions(tunnelOptions);
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
        if (getStaticRoutesOnly() != null)
            sb.append("StaticRoutesOnly: ").append(getStaticRoutesOnly()).append(",");
        if (getTunnelOptions() != null)
            sb.append("TunnelOptions: ").append(getTunnelOptions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AwsEc2VpnConnectionOptionsDetails == false)
            return false;
        AwsEc2VpnConnectionOptionsDetails other = (AwsEc2VpnConnectionOptionsDetails) obj;
        if (other.getStaticRoutesOnly() == null ^ this.getStaticRoutesOnly() == null)
            return false;
        if (other.getStaticRoutesOnly() != null && other.getStaticRoutesOnly().equals(this.getStaticRoutesOnly()) == false)
            return false;
        if (other.getTunnelOptions() == null ^ this.getTunnelOptions() == null)
            return false;
        if (other.getTunnelOptions() != null && other.getTunnelOptions().equals(this.getTunnelOptions()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStaticRoutesOnly() == null) ? 0 : getStaticRoutesOnly().hashCode());
        hashCode = prime * hashCode + ((getTunnelOptions() == null) ? 0 : getTunnelOptions().hashCode());
        return hashCode;
    }

    @Override
    public AwsEc2VpnConnectionOptionsDetails clone() {
        try {
            return (AwsEc2VpnConnectionOptionsDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.AwsEc2VpnConnectionOptionsDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
