/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

/**
 * <p>
 * Describes VPN connection options.
 * </p>
 */
public class VpnConnectionOptionsSpecification implements Serializable, Cloneable {

    /**
     * <p>
     * Indicates whether the VPN connection uses static routes only. Static routes must be used for devices that don't
     * support BGP.
     * </p>
     */
    private Boolean staticRoutesOnly;

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

    public VpnConnectionOptionsSpecification withStaticRoutesOnly(Boolean staticRoutesOnly) {
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
     * Returns a string representation of this object; useful for testing and debugging.
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
            sb.append("StaticRoutesOnly: " + getStaticRoutesOnly());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof VpnConnectionOptionsSpecification == false)
            return false;
        VpnConnectionOptionsSpecification other = (VpnConnectionOptionsSpecification) obj;
        if (other.getStaticRoutesOnly() == null ^ this.getStaticRoutesOnly() == null)
            return false;
        if (other.getStaticRoutesOnly() != null && other.getStaticRoutesOnly().equals(this.getStaticRoutesOnly()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStaticRoutesOnly() == null) ? 0 : getStaticRoutesOnly().hashCode());
        return hashCode;
    }

    @Override
    public VpnConnectionOptionsSpecification clone() {
        try {
            return (VpnConnectionOptionsSpecification) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
