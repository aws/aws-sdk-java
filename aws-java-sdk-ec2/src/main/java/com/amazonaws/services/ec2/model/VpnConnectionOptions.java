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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Describes VPN connection options.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/VpnConnectionOptions" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class VpnConnectionOptions implements Serializable, Cloneable {

    /**
     * <p>
     * Indicates whether acceleration is enabled for the VPN connection.
     * </p>
     */
    private Boolean enableAcceleration;
    /**
     * <p>
     * Indicates whether the VPN connection uses static routes only. Static routes must be used for devices that don't
     * support BGP.
     * </p>
     */
    private Boolean staticRoutesOnly;
    /**
     * <p>
     * Indicates the VPN tunnel options.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<TunnelOption> tunnelOptions;

    /**
     * <p>
     * Indicates whether acceleration is enabled for the VPN connection.
     * </p>
     * 
     * @param enableAcceleration
     *        Indicates whether acceleration is enabled for the VPN connection.
     */

    public void setEnableAcceleration(Boolean enableAcceleration) {
        this.enableAcceleration = enableAcceleration;
    }

    /**
     * <p>
     * Indicates whether acceleration is enabled for the VPN connection.
     * </p>
     * 
     * @return Indicates whether acceleration is enabled for the VPN connection.
     */

    public Boolean getEnableAcceleration() {
        return this.enableAcceleration;
    }

    /**
     * <p>
     * Indicates whether acceleration is enabled for the VPN connection.
     * </p>
     * 
     * @param enableAcceleration
     *        Indicates whether acceleration is enabled for the VPN connection.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VpnConnectionOptions withEnableAcceleration(Boolean enableAcceleration) {
        setEnableAcceleration(enableAcceleration);
        return this;
    }

    /**
     * <p>
     * Indicates whether acceleration is enabled for the VPN connection.
     * </p>
     * 
     * @return Indicates whether acceleration is enabled for the VPN connection.
     */

    public Boolean isEnableAcceleration() {
        return this.enableAcceleration;
    }

    /**
     * <p>
     * Indicates whether the VPN connection uses static routes only. Static routes must be used for devices that don't
     * support BGP.
     * </p>
     * 
     * @param staticRoutesOnly
     *        Indicates whether the VPN connection uses static routes only. Static routes must be used for devices that
     *        don't support BGP.
     */

    public void setStaticRoutesOnly(Boolean staticRoutesOnly) {
        this.staticRoutesOnly = staticRoutesOnly;
    }

    /**
     * <p>
     * Indicates whether the VPN connection uses static routes only. Static routes must be used for devices that don't
     * support BGP.
     * </p>
     * 
     * @return Indicates whether the VPN connection uses static routes only. Static routes must be used for devices that
     *         don't support BGP.
     */

    public Boolean getStaticRoutesOnly() {
        return this.staticRoutesOnly;
    }

    /**
     * <p>
     * Indicates whether the VPN connection uses static routes only. Static routes must be used for devices that don't
     * support BGP.
     * </p>
     * 
     * @param staticRoutesOnly
     *        Indicates whether the VPN connection uses static routes only. Static routes must be used for devices that
     *        don't support BGP.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VpnConnectionOptions withStaticRoutesOnly(Boolean staticRoutesOnly) {
        setStaticRoutesOnly(staticRoutesOnly);
        return this;
    }

    /**
     * <p>
     * Indicates whether the VPN connection uses static routes only. Static routes must be used for devices that don't
     * support BGP.
     * </p>
     * 
     * @return Indicates whether the VPN connection uses static routes only. Static routes must be used for devices that
     *         don't support BGP.
     */

    public Boolean isStaticRoutesOnly() {
        return this.staticRoutesOnly;
    }

    /**
     * <p>
     * Indicates the VPN tunnel options.
     * </p>
     * 
     * @return Indicates the VPN tunnel options.
     */

    public java.util.List<TunnelOption> getTunnelOptions() {
        if (tunnelOptions == null) {
            tunnelOptions = new com.amazonaws.internal.SdkInternalList<TunnelOption>();
        }
        return tunnelOptions;
    }

    /**
     * <p>
     * Indicates the VPN tunnel options.
     * </p>
     * 
     * @param tunnelOptions
     *        Indicates the VPN tunnel options.
     */

    public void setTunnelOptions(java.util.Collection<TunnelOption> tunnelOptions) {
        if (tunnelOptions == null) {
            this.tunnelOptions = null;
            return;
        }

        this.tunnelOptions = new com.amazonaws.internal.SdkInternalList<TunnelOption>(tunnelOptions);
    }

    /**
     * <p>
     * Indicates the VPN tunnel options.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTunnelOptions(java.util.Collection)} or {@link #withTunnelOptions(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param tunnelOptions
     *        Indicates the VPN tunnel options.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VpnConnectionOptions withTunnelOptions(TunnelOption... tunnelOptions) {
        if (this.tunnelOptions == null) {
            setTunnelOptions(new com.amazonaws.internal.SdkInternalList<TunnelOption>(tunnelOptions.length));
        }
        for (TunnelOption ele : tunnelOptions) {
            this.tunnelOptions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Indicates the VPN tunnel options.
     * </p>
     * 
     * @param tunnelOptions
     *        Indicates the VPN tunnel options.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VpnConnectionOptions withTunnelOptions(java.util.Collection<TunnelOption> tunnelOptions) {
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
        if (getEnableAcceleration() != null)
            sb.append("EnableAcceleration: ").append(getEnableAcceleration()).append(",");
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

        if (obj instanceof VpnConnectionOptions == false)
            return false;
        VpnConnectionOptions other = (VpnConnectionOptions) obj;
        if (other.getEnableAcceleration() == null ^ this.getEnableAcceleration() == null)
            return false;
        if (other.getEnableAcceleration() != null && other.getEnableAcceleration().equals(this.getEnableAcceleration()) == false)
            return false;
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

        hashCode = prime * hashCode + ((getEnableAcceleration() == null) ? 0 : getEnableAcceleration().hashCode());
        hashCode = prime * hashCode + ((getStaticRoutesOnly() == null) ? 0 : getStaticRoutesOnly().hashCode());
        hashCode = prime * hashCode + ((getTunnelOptions() == null) ? 0 : getTunnelOptions().hashCode());
        return hashCode;
    }

    @Override
    public VpnConnectionOptions clone() {
        try {
            return (VpnConnectionOptions) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
