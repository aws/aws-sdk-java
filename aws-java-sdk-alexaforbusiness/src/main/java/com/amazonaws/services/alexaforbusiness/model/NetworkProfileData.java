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
package com.amazonaws.services.alexaforbusiness.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The data associated with a network profile.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/NetworkProfileData"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class NetworkProfileData implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ARN of the network profile associated with a device.
     * </p>
     */
    private String networkProfileArn;
    /**
     * <p>
     * The name of the network profile associated with a device.
     * </p>
     */
    private String networkProfileName;
    /**
     * <p>
     * Detailed information about a device's network profile.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The SSID of the Wi-Fi network.
     * </p>
     */
    private String ssid;
    /**
     * <p>
     * The security type of the Wi-Fi network. This can be WPA2_ENTERPRISE, WPA2_PSK, WPA_PSK, WEP, or OPEN.
     * </p>
     */
    private String securityType;
    /**
     * <p>
     * The authentication standard that is used in the EAP framework. Currently, EAP_TLS is supported.
     * </p>
     */
    private String eapMethod;
    /**
     * <p>
     * The ARN of the Private Certificate Authority (PCA) created in AWS Certificate Manager (ACM). This is used to
     * issue certificates to the devices.
     * </p>
     */
    private String certificateAuthorityArn;

    /**
     * <p>
     * The ARN of the network profile associated with a device.
     * </p>
     * 
     * @param networkProfileArn
     *        The ARN of the network profile associated with a device.
     */

    public void setNetworkProfileArn(String networkProfileArn) {
        this.networkProfileArn = networkProfileArn;
    }

    /**
     * <p>
     * The ARN of the network profile associated with a device.
     * </p>
     * 
     * @return The ARN of the network profile associated with a device.
     */

    public String getNetworkProfileArn() {
        return this.networkProfileArn;
    }

    /**
     * <p>
     * The ARN of the network profile associated with a device.
     * </p>
     * 
     * @param networkProfileArn
     *        The ARN of the network profile associated with a device.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NetworkProfileData withNetworkProfileArn(String networkProfileArn) {
        setNetworkProfileArn(networkProfileArn);
        return this;
    }

    /**
     * <p>
     * The name of the network profile associated with a device.
     * </p>
     * 
     * @param networkProfileName
     *        The name of the network profile associated with a device.
     */

    public void setNetworkProfileName(String networkProfileName) {
        this.networkProfileName = networkProfileName;
    }

    /**
     * <p>
     * The name of the network profile associated with a device.
     * </p>
     * 
     * @return The name of the network profile associated with a device.
     */

    public String getNetworkProfileName() {
        return this.networkProfileName;
    }

    /**
     * <p>
     * The name of the network profile associated with a device.
     * </p>
     * 
     * @param networkProfileName
     *        The name of the network profile associated with a device.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NetworkProfileData withNetworkProfileName(String networkProfileName) {
        setNetworkProfileName(networkProfileName);
        return this;
    }

    /**
     * <p>
     * Detailed information about a device's network profile.
     * </p>
     * 
     * @param description
     *        Detailed information about a device's network profile.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * Detailed information about a device's network profile.
     * </p>
     * 
     * @return Detailed information about a device's network profile.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * Detailed information about a device's network profile.
     * </p>
     * 
     * @param description
     *        Detailed information about a device's network profile.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NetworkProfileData withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The SSID of the Wi-Fi network.
     * </p>
     * 
     * @param ssid
     *        The SSID of the Wi-Fi network.
     */

    public void setSsid(String ssid) {
        this.ssid = ssid;
    }

    /**
     * <p>
     * The SSID of the Wi-Fi network.
     * </p>
     * 
     * @return The SSID of the Wi-Fi network.
     */

    public String getSsid() {
        return this.ssid;
    }

    /**
     * <p>
     * The SSID of the Wi-Fi network.
     * </p>
     * 
     * @param ssid
     *        The SSID of the Wi-Fi network.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NetworkProfileData withSsid(String ssid) {
        setSsid(ssid);
        return this;
    }

    /**
     * <p>
     * The security type of the Wi-Fi network. This can be WPA2_ENTERPRISE, WPA2_PSK, WPA_PSK, WEP, or OPEN.
     * </p>
     * 
     * @param securityType
     *        The security type of the Wi-Fi network. This can be WPA2_ENTERPRISE, WPA2_PSK, WPA_PSK, WEP, or OPEN.
     * @see NetworkSecurityType
     */

    public void setSecurityType(String securityType) {
        this.securityType = securityType;
    }

    /**
     * <p>
     * The security type of the Wi-Fi network. This can be WPA2_ENTERPRISE, WPA2_PSK, WPA_PSK, WEP, or OPEN.
     * </p>
     * 
     * @return The security type of the Wi-Fi network. This can be WPA2_ENTERPRISE, WPA2_PSK, WPA_PSK, WEP, or OPEN.
     * @see NetworkSecurityType
     */

    public String getSecurityType() {
        return this.securityType;
    }

    /**
     * <p>
     * The security type of the Wi-Fi network. This can be WPA2_ENTERPRISE, WPA2_PSK, WPA_PSK, WEP, or OPEN.
     * </p>
     * 
     * @param securityType
     *        The security type of the Wi-Fi network. This can be WPA2_ENTERPRISE, WPA2_PSK, WPA_PSK, WEP, or OPEN.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see NetworkSecurityType
     */

    public NetworkProfileData withSecurityType(String securityType) {
        setSecurityType(securityType);
        return this;
    }

    /**
     * <p>
     * The security type of the Wi-Fi network. This can be WPA2_ENTERPRISE, WPA2_PSK, WPA_PSK, WEP, or OPEN.
     * </p>
     * 
     * @param securityType
     *        The security type of the Wi-Fi network. This can be WPA2_ENTERPRISE, WPA2_PSK, WPA_PSK, WEP, or OPEN.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see NetworkSecurityType
     */

    public NetworkProfileData withSecurityType(NetworkSecurityType securityType) {
        this.securityType = securityType.toString();
        return this;
    }

    /**
     * <p>
     * The authentication standard that is used in the EAP framework. Currently, EAP_TLS is supported.
     * </p>
     * 
     * @param eapMethod
     *        The authentication standard that is used in the EAP framework. Currently, EAP_TLS is supported.
     * @see NetworkEapMethod
     */

    public void setEapMethod(String eapMethod) {
        this.eapMethod = eapMethod;
    }

    /**
     * <p>
     * The authentication standard that is used in the EAP framework. Currently, EAP_TLS is supported.
     * </p>
     * 
     * @return The authentication standard that is used in the EAP framework. Currently, EAP_TLS is supported.
     * @see NetworkEapMethod
     */

    public String getEapMethod() {
        return this.eapMethod;
    }

    /**
     * <p>
     * The authentication standard that is used in the EAP framework. Currently, EAP_TLS is supported.
     * </p>
     * 
     * @param eapMethod
     *        The authentication standard that is used in the EAP framework. Currently, EAP_TLS is supported.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see NetworkEapMethod
     */

    public NetworkProfileData withEapMethod(String eapMethod) {
        setEapMethod(eapMethod);
        return this;
    }

    /**
     * <p>
     * The authentication standard that is used in the EAP framework. Currently, EAP_TLS is supported.
     * </p>
     * 
     * @param eapMethod
     *        The authentication standard that is used in the EAP framework. Currently, EAP_TLS is supported.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see NetworkEapMethod
     */

    public NetworkProfileData withEapMethod(NetworkEapMethod eapMethod) {
        this.eapMethod = eapMethod.toString();
        return this;
    }

    /**
     * <p>
     * The ARN of the Private Certificate Authority (PCA) created in AWS Certificate Manager (ACM). This is used to
     * issue certificates to the devices.
     * </p>
     * 
     * @param certificateAuthorityArn
     *        The ARN of the Private Certificate Authority (PCA) created in AWS Certificate Manager (ACM). This is used
     *        to issue certificates to the devices.
     */

    public void setCertificateAuthorityArn(String certificateAuthorityArn) {
        this.certificateAuthorityArn = certificateAuthorityArn;
    }

    /**
     * <p>
     * The ARN of the Private Certificate Authority (PCA) created in AWS Certificate Manager (ACM). This is used to
     * issue certificates to the devices.
     * </p>
     * 
     * @return The ARN of the Private Certificate Authority (PCA) created in AWS Certificate Manager (ACM). This is used
     *         to issue certificates to the devices.
     */

    public String getCertificateAuthorityArn() {
        return this.certificateAuthorityArn;
    }

    /**
     * <p>
     * The ARN of the Private Certificate Authority (PCA) created in AWS Certificate Manager (ACM). This is used to
     * issue certificates to the devices.
     * </p>
     * 
     * @param certificateAuthorityArn
     *        The ARN of the Private Certificate Authority (PCA) created in AWS Certificate Manager (ACM). This is used
     *        to issue certificates to the devices.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NetworkProfileData withCertificateAuthorityArn(String certificateAuthorityArn) {
        setCertificateAuthorityArn(certificateAuthorityArn);
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
        if (getNetworkProfileArn() != null)
            sb.append("NetworkProfileArn: ").append(getNetworkProfileArn()).append(",");
        if (getNetworkProfileName() != null)
            sb.append("NetworkProfileName: ").append(getNetworkProfileName()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getSsid() != null)
            sb.append("Ssid: ").append(getSsid()).append(",");
        if (getSecurityType() != null)
            sb.append("SecurityType: ").append(getSecurityType()).append(",");
        if (getEapMethod() != null)
            sb.append("EapMethod: ").append(getEapMethod()).append(",");
        if (getCertificateAuthorityArn() != null)
            sb.append("CertificateAuthorityArn: ").append(getCertificateAuthorityArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof NetworkProfileData == false)
            return false;
        NetworkProfileData other = (NetworkProfileData) obj;
        if (other.getNetworkProfileArn() == null ^ this.getNetworkProfileArn() == null)
            return false;
        if (other.getNetworkProfileArn() != null && other.getNetworkProfileArn().equals(this.getNetworkProfileArn()) == false)
            return false;
        if (other.getNetworkProfileName() == null ^ this.getNetworkProfileName() == null)
            return false;
        if (other.getNetworkProfileName() != null && other.getNetworkProfileName().equals(this.getNetworkProfileName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getSsid() == null ^ this.getSsid() == null)
            return false;
        if (other.getSsid() != null && other.getSsid().equals(this.getSsid()) == false)
            return false;
        if (other.getSecurityType() == null ^ this.getSecurityType() == null)
            return false;
        if (other.getSecurityType() != null && other.getSecurityType().equals(this.getSecurityType()) == false)
            return false;
        if (other.getEapMethod() == null ^ this.getEapMethod() == null)
            return false;
        if (other.getEapMethod() != null && other.getEapMethod().equals(this.getEapMethod()) == false)
            return false;
        if (other.getCertificateAuthorityArn() == null ^ this.getCertificateAuthorityArn() == null)
            return false;
        if (other.getCertificateAuthorityArn() != null && other.getCertificateAuthorityArn().equals(this.getCertificateAuthorityArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNetworkProfileArn() == null) ? 0 : getNetworkProfileArn().hashCode());
        hashCode = prime * hashCode + ((getNetworkProfileName() == null) ? 0 : getNetworkProfileName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getSsid() == null) ? 0 : getSsid().hashCode());
        hashCode = prime * hashCode + ((getSecurityType() == null) ? 0 : getSecurityType().hashCode());
        hashCode = prime * hashCode + ((getEapMethod() == null) ? 0 : getEapMethod().hashCode());
        hashCode = prime * hashCode + ((getCertificateAuthorityArn() == null) ? 0 : getCertificateAuthorityArn().hashCode());
        return hashCode;
    }

    @Override
    public NetworkProfileData clone() {
        try {
            return (NetworkProfileData) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.alexaforbusiness.model.transform.NetworkProfileDataMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
