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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/UpdateNetworkProfile"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateNetworkProfileRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

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
     * The current password of the Wi-Fi network.
     * </p>
     */
    private String currentPassword;
    /**
     * <p>
     * The next, or subsequent, password of the Wi-Fi network. This password is asynchronously transmitted to the device
     * and is used when the password of the network changes to NextPassword.
     * </p>
     */
    private String nextPassword;
    /**
     * <p>
     * The ARN of the Private Certificate Authority (PCA) created in AWS Certificate Manager (ACM). This is used to
     * issue certificates to the devices.
     * </p>
     */
    private String certificateAuthorityArn;
    /**
     * <p>
     * The root certificate(s) of your authentication server that will be installed on your devices and used to trust
     * your authentication server during EAP negotiation.
     * </p>
     */
    private java.util.List<String> trustAnchors;

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

    public UpdateNetworkProfileRequest withNetworkProfileArn(String networkProfileArn) {
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

    public UpdateNetworkProfileRequest withNetworkProfileName(String networkProfileName) {
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

    public UpdateNetworkProfileRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The current password of the Wi-Fi network.
     * </p>
     * 
     * @param currentPassword
     *        The current password of the Wi-Fi network.
     */

    public void setCurrentPassword(String currentPassword) {
        this.currentPassword = currentPassword;
    }

    /**
     * <p>
     * The current password of the Wi-Fi network.
     * </p>
     * 
     * @return The current password of the Wi-Fi network.
     */

    public String getCurrentPassword() {
        return this.currentPassword;
    }

    /**
     * <p>
     * The current password of the Wi-Fi network.
     * </p>
     * 
     * @param currentPassword
     *        The current password of the Wi-Fi network.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateNetworkProfileRequest withCurrentPassword(String currentPassword) {
        setCurrentPassword(currentPassword);
        return this;
    }

    /**
     * <p>
     * The next, or subsequent, password of the Wi-Fi network. This password is asynchronously transmitted to the device
     * and is used when the password of the network changes to NextPassword.
     * </p>
     * 
     * @param nextPassword
     *        The next, or subsequent, password of the Wi-Fi network. This password is asynchronously transmitted to the
     *        device and is used when the password of the network changes to NextPassword.
     */

    public void setNextPassword(String nextPassword) {
        this.nextPassword = nextPassword;
    }

    /**
     * <p>
     * The next, or subsequent, password of the Wi-Fi network. This password is asynchronously transmitted to the device
     * and is used when the password of the network changes to NextPassword.
     * </p>
     * 
     * @return The next, or subsequent, password of the Wi-Fi network. This password is asynchronously transmitted to
     *         the device and is used when the password of the network changes to NextPassword.
     */

    public String getNextPassword() {
        return this.nextPassword;
    }

    /**
     * <p>
     * The next, or subsequent, password of the Wi-Fi network. This password is asynchronously transmitted to the device
     * and is used when the password of the network changes to NextPassword.
     * </p>
     * 
     * @param nextPassword
     *        The next, or subsequent, password of the Wi-Fi network. This password is asynchronously transmitted to the
     *        device and is used when the password of the network changes to NextPassword.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateNetworkProfileRequest withNextPassword(String nextPassword) {
        setNextPassword(nextPassword);
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

    public UpdateNetworkProfileRequest withCertificateAuthorityArn(String certificateAuthorityArn) {
        setCertificateAuthorityArn(certificateAuthorityArn);
        return this;
    }

    /**
     * <p>
     * The root certificate(s) of your authentication server that will be installed on your devices and used to trust
     * your authentication server during EAP negotiation.
     * </p>
     * 
     * @return The root certificate(s) of your authentication server that will be installed on your devices and used to
     *         trust your authentication server during EAP negotiation.
     */

    public java.util.List<String> getTrustAnchors() {
        return trustAnchors;
    }

    /**
     * <p>
     * The root certificate(s) of your authentication server that will be installed on your devices and used to trust
     * your authentication server during EAP negotiation.
     * </p>
     * 
     * @param trustAnchors
     *        The root certificate(s) of your authentication server that will be installed on your devices and used to
     *        trust your authentication server during EAP negotiation.
     */

    public void setTrustAnchors(java.util.Collection<String> trustAnchors) {
        if (trustAnchors == null) {
            this.trustAnchors = null;
            return;
        }

        this.trustAnchors = new java.util.ArrayList<String>(trustAnchors);
    }

    /**
     * <p>
     * The root certificate(s) of your authentication server that will be installed on your devices and used to trust
     * your authentication server during EAP negotiation.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTrustAnchors(java.util.Collection)} or {@link #withTrustAnchors(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param trustAnchors
     *        The root certificate(s) of your authentication server that will be installed on your devices and used to
     *        trust your authentication server during EAP negotiation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateNetworkProfileRequest withTrustAnchors(String... trustAnchors) {
        if (this.trustAnchors == null) {
            setTrustAnchors(new java.util.ArrayList<String>(trustAnchors.length));
        }
        for (String ele : trustAnchors) {
            this.trustAnchors.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The root certificate(s) of your authentication server that will be installed on your devices and used to trust
     * your authentication server during EAP negotiation.
     * </p>
     * 
     * @param trustAnchors
     *        The root certificate(s) of your authentication server that will be installed on your devices and used to
     *        trust your authentication server during EAP negotiation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateNetworkProfileRequest withTrustAnchors(java.util.Collection<String> trustAnchors) {
        setTrustAnchors(trustAnchors);
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
        if (getCurrentPassword() != null)
            sb.append("CurrentPassword: ").append("***Sensitive Data Redacted***").append(",");
        if (getNextPassword() != null)
            sb.append("NextPassword: ").append("***Sensitive Data Redacted***").append(",");
        if (getCertificateAuthorityArn() != null)
            sb.append("CertificateAuthorityArn: ").append(getCertificateAuthorityArn()).append(",");
        if (getTrustAnchors() != null)
            sb.append("TrustAnchors: ").append(getTrustAnchors());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateNetworkProfileRequest == false)
            return false;
        UpdateNetworkProfileRequest other = (UpdateNetworkProfileRequest) obj;
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
        if (other.getCurrentPassword() == null ^ this.getCurrentPassword() == null)
            return false;
        if (other.getCurrentPassword() != null && other.getCurrentPassword().equals(this.getCurrentPassword()) == false)
            return false;
        if (other.getNextPassword() == null ^ this.getNextPassword() == null)
            return false;
        if (other.getNextPassword() != null && other.getNextPassword().equals(this.getNextPassword()) == false)
            return false;
        if (other.getCertificateAuthorityArn() == null ^ this.getCertificateAuthorityArn() == null)
            return false;
        if (other.getCertificateAuthorityArn() != null && other.getCertificateAuthorityArn().equals(this.getCertificateAuthorityArn()) == false)
            return false;
        if (other.getTrustAnchors() == null ^ this.getTrustAnchors() == null)
            return false;
        if (other.getTrustAnchors() != null && other.getTrustAnchors().equals(this.getTrustAnchors()) == false)
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
        hashCode = prime * hashCode + ((getCurrentPassword() == null) ? 0 : getCurrentPassword().hashCode());
        hashCode = prime * hashCode + ((getNextPassword() == null) ? 0 : getNextPassword().hashCode());
        hashCode = prime * hashCode + ((getCertificateAuthorityArn() == null) ? 0 : getCertificateAuthorityArn().hashCode());
        hashCode = prime * hashCode + ((getTrustAnchors() == null) ? 0 : getTrustAnchors().hashCode());
        return hashCode;
    }

    @Override
    public UpdateNetworkProfileRequest clone() {
        return (UpdateNetworkProfileRequest) super.clone();
    }

}
