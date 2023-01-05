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

import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.Request;
import com.amazonaws.services.ec2.model.transform.GetVpnConnectionDeviceSampleConfigurationRequestMarshaller;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetVpnConnectionDeviceSampleConfigurationRequest extends AmazonWebServiceRequest implements Serializable, Cloneable,
        DryRunSupportedRequest<GetVpnConnectionDeviceSampleConfigurationRequest> {

    /**
     * <p>
     * The <code>VpnConnectionId</code> specifies the Site-to-Site VPN connection used for the sample configuration.
     * </p>
     */
    private String vpnConnectionId;
    /**
     * <p>
     * Device identifier provided by the <code>GetVpnConnectionDeviceTypes</code> API.
     * </p>
     */
    private String vpnConnectionDeviceTypeId;
    /**
     * <p>
     * The IKE version to be used in the sample configuration file for your customer gateway device. You can specify one
     * of the following versions: <code>ikev1</code> or <code>ikev2</code>.
     * </p>
     */
    private String internetKeyExchangeVersion;

    /**
     * <p>
     * The <code>VpnConnectionId</code> specifies the Site-to-Site VPN connection used for the sample configuration.
     * </p>
     * 
     * @param vpnConnectionId
     *        The <code>VpnConnectionId</code> specifies the Site-to-Site VPN connection used for the sample
     *        configuration.
     */

    public void setVpnConnectionId(String vpnConnectionId) {
        this.vpnConnectionId = vpnConnectionId;
    }

    /**
     * <p>
     * The <code>VpnConnectionId</code> specifies the Site-to-Site VPN connection used for the sample configuration.
     * </p>
     * 
     * @return The <code>VpnConnectionId</code> specifies the Site-to-Site VPN connection used for the sample
     *         configuration.
     */

    public String getVpnConnectionId() {
        return this.vpnConnectionId;
    }

    /**
     * <p>
     * The <code>VpnConnectionId</code> specifies the Site-to-Site VPN connection used for the sample configuration.
     * </p>
     * 
     * @param vpnConnectionId
     *        The <code>VpnConnectionId</code> specifies the Site-to-Site VPN connection used for the sample
     *        configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetVpnConnectionDeviceSampleConfigurationRequest withVpnConnectionId(String vpnConnectionId) {
        setVpnConnectionId(vpnConnectionId);
        return this;
    }

    /**
     * <p>
     * Device identifier provided by the <code>GetVpnConnectionDeviceTypes</code> API.
     * </p>
     * 
     * @param vpnConnectionDeviceTypeId
     *        Device identifier provided by the <code>GetVpnConnectionDeviceTypes</code> API.
     */

    public void setVpnConnectionDeviceTypeId(String vpnConnectionDeviceTypeId) {
        this.vpnConnectionDeviceTypeId = vpnConnectionDeviceTypeId;
    }

    /**
     * <p>
     * Device identifier provided by the <code>GetVpnConnectionDeviceTypes</code> API.
     * </p>
     * 
     * @return Device identifier provided by the <code>GetVpnConnectionDeviceTypes</code> API.
     */

    public String getVpnConnectionDeviceTypeId() {
        return this.vpnConnectionDeviceTypeId;
    }

    /**
     * <p>
     * Device identifier provided by the <code>GetVpnConnectionDeviceTypes</code> API.
     * </p>
     * 
     * @param vpnConnectionDeviceTypeId
     *        Device identifier provided by the <code>GetVpnConnectionDeviceTypes</code> API.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetVpnConnectionDeviceSampleConfigurationRequest withVpnConnectionDeviceTypeId(String vpnConnectionDeviceTypeId) {
        setVpnConnectionDeviceTypeId(vpnConnectionDeviceTypeId);
        return this;
    }

    /**
     * <p>
     * The IKE version to be used in the sample configuration file for your customer gateway device. You can specify one
     * of the following versions: <code>ikev1</code> or <code>ikev2</code>.
     * </p>
     * 
     * @param internetKeyExchangeVersion
     *        The IKE version to be used in the sample configuration file for your customer gateway device. You can
     *        specify one of the following versions: <code>ikev1</code> or <code>ikev2</code>.
     */

    public void setInternetKeyExchangeVersion(String internetKeyExchangeVersion) {
        this.internetKeyExchangeVersion = internetKeyExchangeVersion;
    }

    /**
     * <p>
     * The IKE version to be used in the sample configuration file for your customer gateway device. You can specify one
     * of the following versions: <code>ikev1</code> or <code>ikev2</code>.
     * </p>
     * 
     * @return The IKE version to be used in the sample configuration file for your customer gateway device. You can
     *         specify one of the following versions: <code>ikev1</code> or <code>ikev2</code>.
     */

    public String getInternetKeyExchangeVersion() {
        return this.internetKeyExchangeVersion;
    }

    /**
     * <p>
     * The IKE version to be used in the sample configuration file for your customer gateway device. You can specify one
     * of the following versions: <code>ikev1</code> or <code>ikev2</code>.
     * </p>
     * 
     * @param internetKeyExchangeVersion
     *        The IKE version to be used in the sample configuration file for your customer gateway device. You can
     *        specify one of the following versions: <code>ikev1</code> or <code>ikev2</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetVpnConnectionDeviceSampleConfigurationRequest withInternetKeyExchangeVersion(String internetKeyExchangeVersion) {
        setInternetKeyExchangeVersion(internetKeyExchangeVersion);
        return this;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled request configured with additional
     * parameters to enable operation dry-run.
     */
    @Override
    public Request<GetVpnConnectionDeviceSampleConfigurationRequest> getDryRunRequest() {
        Request<GetVpnConnectionDeviceSampleConfigurationRequest> request = new GetVpnConnectionDeviceSampleConfigurationRequestMarshaller().marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
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
        if (getVpnConnectionId() != null)
            sb.append("VpnConnectionId: ").append(getVpnConnectionId()).append(",");
        if (getVpnConnectionDeviceTypeId() != null)
            sb.append("VpnConnectionDeviceTypeId: ").append(getVpnConnectionDeviceTypeId()).append(",");
        if (getInternetKeyExchangeVersion() != null)
            sb.append("InternetKeyExchangeVersion: ").append(getInternetKeyExchangeVersion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetVpnConnectionDeviceSampleConfigurationRequest == false)
            return false;
        GetVpnConnectionDeviceSampleConfigurationRequest other = (GetVpnConnectionDeviceSampleConfigurationRequest) obj;
        if (other.getVpnConnectionId() == null ^ this.getVpnConnectionId() == null)
            return false;
        if (other.getVpnConnectionId() != null && other.getVpnConnectionId().equals(this.getVpnConnectionId()) == false)
            return false;
        if (other.getVpnConnectionDeviceTypeId() == null ^ this.getVpnConnectionDeviceTypeId() == null)
            return false;
        if (other.getVpnConnectionDeviceTypeId() != null && other.getVpnConnectionDeviceTypeId().equals(this.getVpnConnectionDeviceTypeId()) == false)
            return false;
        if (other.getInternetKeyExchangeVersion() == null ^ this.getInternetKeyExchangeVersion() == null)
            return false;
        if (other.getInternetKeyExchangeVersion() != null && other.getInternetKeyExchangeVersion().equals(this.getInternetKeyExchangeVersion()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getVpnConnectionId() == null) ? 0 : getVpnConnectionId().hashCode());
        hashCode = prime * hashCode + ((getVpnConnectionDeviceTypeId() == null) ? 0 : getVpnConnectionDeviceTypeId().hashCode());
        hashCode = prime * hashCode + ((getInternetKeyExchangeVersion() == null) ? 0 : getInternetKeyExchangeVersion().hashCode());
        return hashCode;
    }

    @Override
    public GetVpnConnectionDeviceSampleConfigurationRequest clone() {
        return (GetVpnConnectionDeviceSampleConfigurationRequest) super.clone();
    }
}
