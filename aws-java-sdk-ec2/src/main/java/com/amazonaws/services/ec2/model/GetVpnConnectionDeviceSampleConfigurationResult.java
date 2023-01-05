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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceResult;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetVpnConnectionDeviceSampleConfigurationResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements
        Serializable, Cloneable {

    /**
     * <p>
     * Sample configuration file for the specified customer gateway device.
     * </p>
     */
    private String vpnConnectionDeviceSampleConfiguration;

    /**
     * <p>
     * Sample configuration file for the specified customer gateway device.
     * </p>
     * 
     * @param vpnConnectionDeviceSampleConfiguration
     *        Sample configuration file for the specified customer gateway device.
     */

    public void setVpnConnectionDeviceSampleConfiguration(String vpnConnectionDeviceSampleConfiguration) {
        this.vpnConnectionDeviceSampleConfiguration = vpnConnectionDeviceSampleConfiguration;
    }

    /**
     * <p>
     * Sample configuration file for the specified customer gateway device.
     * </p>
     * 
     * @return Sample configuration file for the specified customer gateway device.
     */

    public String getVpnConnectionDeviceSampleConfiguration() {
        return this.vpnConnectionDeviceSampleConfiguration;
    }

    /**
     * <p>
     * Sample configuration file for the specified customer gateway device.
     * </p>
     * 
     * @param vpnConnectionDeviceSampleConfiguration
     *        Sample configuration file for the specified customer gateway device.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetVpnConnectionDeviceSampleConfigurationResult withVpnConnectionDeviceSampleConfiguration(String vpnConnectionDeviceSampleConfiguration) {
        setVpnConnectionDeviceSampleConfiguration(vpnConnectionDeviceSampleConfiguration);
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
        if (getVpnConnectionDeviceSampleConfiguration() != null)
            sb.append("VpnConnectionDeviceSampleConfiguration: ").append("***Sensitive Data Redacted***");
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetVpnConnectionDeviceSampleConfigurationResult == false)
            return false;
        GetVpnConnectionDeviceSampleConfigurationResult other = (GetVpnConnectionDeviceSampleConfigurationResult) obj;
        if (other.getVpnConnectionDeviceSampleConfiguration() == null ^ this.getVpnConnectionDeviceSampleConfiguration() == null)
            return false;
        if (other.getVpnConnectionDeviceSampleConfiguration() != null
                && other.getVpnConnectionDeviceSampleConfiguration().equals(this.getVpnConnectionDeviceSampleConfiguration()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getVpnConnectionDeviceSampleConfiguration() == null) ? 0 : getVpnConnectionDeviceSampleConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public GetVpnConnectionDeviceSampleConfigurationResult clone() {
        try {
            return (GetVpnConnectionDeviceSampleConfigurationResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
