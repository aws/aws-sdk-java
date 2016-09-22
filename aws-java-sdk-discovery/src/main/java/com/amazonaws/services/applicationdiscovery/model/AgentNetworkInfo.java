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
package com.amazonaws.services.applicationdiscovery.model;

import java.io.Serializable;

/**
 * <p>
 * Network details about the host where the agent resides.
 * </p>
 */
public class AgentNetworkInfo implements Serializable, Cloneable {

    /**
     * <p>
     * The IP address for the host where the agent resides.
     * </p>
     */
    private String ipAddress;
    /**
     * <p>
     * The MAC address for the host where the agent resides.
     * </p>
     */
    private String macAddress;

    /**
     * <p>
     * The IP address for the host where the agent resides.
     * </p>
     * 
     * @param ipAddress
     *        The IP address for the host where the agent resides.
     */

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    /**
     * <p>
     * The IP address for the host where the agent resides.
     * </p>
     * 
     * @return The IP address for the host where the agent resides.
     */

    public String getIpAddress() {
        return this.ipAddress;
    }

    /**
     * <p>
     * The IP address for the host where the agent resides.
     * </p>
     * 
     * @param ipAddress
     *        The IP address for the host where the agent resides.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AgentNetworkInfo withIpAddress(String ipAddress) {
        setIpAddress(ipAddress);
        return this;
    }

    /**
     * <p>
     * The MAC address for the host where the agent resides.
     * </p>
     * 
     * @param macAddress
     *        The MAC address for the host where the agent resides.
     */

    public void setMacAddress(String macAddress) {
        this.macAddress = macAddress;
    }

    /**
     * <p>
     * The MAC address for the host where the agent resides.
     * </p>
     * 
     * @return The MAC address for the host where the agent resides.
     */

    public String getMacAddress() {
        return this.macAddress;
    }

    /**
     * <p>
     * The MAC address for the host where the agent resides.
     * </p>
     * 
     * @param macAddress
     *        The MAC address for the host where the agent resides.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AgentNetworkInfo withMacAddress(String macAddress) {
        setMacAddress(macAddress);
        return this;
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
        if (getIpAddress() != null)
            sb.append("IpAddress: " + getIpAddress() + ",");
        if (getMacAddress() != null)
            sb.append("MacAddress: " + getMacAddress());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AgentNetworkInfo == false)
            return false;
        AgentNetworkInfo other = (AgentNetworkInfo) obj;
        if (other.getIpAddress() == null ^ this.getIpAddress() == null)
            return false;
        if (other.getIpAddress() != null && other.getIpAddress().equals(this.getIpAddress()) == false)
            return false;
        if (other.getMacAddress() == null ^ this.getMacAddress() == null)
            return false;
        if (other.getMacAddress() != null && other.getMacAddress().equals(this.getMacAddress()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIpAddress() == null) ? 0 : getIpAddress().hashCode());
        hashCode = prime * hashCode + ((getMacAddress() == null) ? 0 : getMacAddress().hashCode());
        return hashCode;
    }

    @Override
    public AgentNetworkInfo clone() {
        try {
            return (AgentNetworkInfo) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
