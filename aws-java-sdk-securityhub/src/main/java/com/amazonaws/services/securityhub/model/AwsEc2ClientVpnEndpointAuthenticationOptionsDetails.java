/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Information about the authentication method used by the Client VPN endpoint.
 * </p>
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/AwsEc2ClientVpnEndpointAuthenticationOptionsDetails"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsEc2ClientVpnEndpointAuthenticationOptionsDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The authentication type used.
     * </p>
     */
    private String type;
    /**
     * <p>
     * Information about the Active Directory, if applicable. With Active Directory authentication, clients are
     * authenticated against existing Active Directory groups.
     * </p>
     */
    private AwsEc2ClientVpnEndpointAuthenticationOptionsActiveDirectoryDetails activeDirectory;
    /**
     * <p>
     * Information about the authentication certificates, if applicable.
     * </p>
     */
    private AwsEc2ClientVpnEndpointAuthenticationOptionsMutualAuthenticationDetails mutualAuthentication;
    /**
     * <p>
     * Information about the IAM SAML identity provider, if applicable.
     * </p>
     */
    private AwsEc2ClientVpnEndpointAuthenticationOptionsFederatedAuthenticationDetails federatedAuthentication;

    /**
     * <p>
     * The authentication type used.
     * </p>
     * 
     * @param type
     *        The authentication type used.
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The authentication type used.
     * </p>
     * 
     * @return The authentication type used.
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The authentication type used.
     * </p>
     * 
     * @param type
     *        The authentication type used.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEc2ClientVpnEndpointAuthenticationOptionsDetails withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * Information about the Active Directory, if applicable. With Active Directory authentication, clients are
     * authenticated against existing Active Directory groups.
     * </p>
     * 
     * @param activeDirectory
     *        Information about the Active Directory, if applicable. With Active Directory authentication, clients are
     *        authenticated against existing Active Directory groups.
     */

    public void setActiveDirectory(AwsEc2ClientVpnEndpointAuthenticationOptionsActiveDirectoryDetails activeDirectory) {
        this.activeDirectory = activeDirectory;
    }

    /**
     * <p>
     * Information about the Active Directory, if applicable. With Active Directory authentication, clients are
     * authenticated against existing Active Directory groups.
     * </p>
     * 
     * @return Information about the Active Directory, if applicable. With Active Directory authentication, clients are
     *         authenticated against existing Active Directory groups.
     */

    public AwsEc2ClientVpnEndpointAuthenticationOptionsActiveDirectoryDetails getActiveDirectory() {
        return this.activeDirectory;
    }

    /**
     * <p>
     * Information about the Active Directory, if applicable. With Active Directory authentication, clients are
     * authenticated against existing Active Directory groups.
     * </p>
     * 
     * @param activeDirectory
     *        Information about the Active Directory, if applicable. With Active Directory authentication, clients are
     *        authenticated against existing Active Directory groups.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEc2ClientVpnEndpointAuthenticationOptionsDetails withActiveDirectory(
            AwsEc2ClientVpnEndpointAuthenticationOptionsActiveDirectoryDetails activeDirectory) {
        setActiveDirectory(activeDirectory);
        return this;
    }

    /**
     * <p>
     * Information about the authentication certificates, if applicable.
     * </p>
     * 
     * @param mutualAuthentication
     *        Information about the authentication certificates, if applicable.
     */

    public void setMutualAuthentication(AwsEc2ClientVpnEndpointAuthenticationOptionsMutualAuthenticationDetails mutualAuthentication) {
        this.mutualAuthentication = mutualAuthentication;
    }

    /**
     * <p>
     * Information about the authentication certificates, if applicable.
     * </p>
     * 
     * @return Information about the authentication certificates, if applicable.
     */

    public AwsEc2ClientVpnEndpointAuthenticationOptionsMutualAuthenticationDetails getMutualAuthentication() {
        return this.mutualAuthentication;
    }

    /**
     * <p>
     * Information about the authentication certificates, if applicable.
     * </p>
     * 
     * @param mutualAuthentication
     *        Information about the authentication certificates, if applicable.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEc2ClientVpnEndpointAuthenticationOptionsDetails withMutualAuthentication(
            AwsEc2ClientVpnEndpointAuthenticationOptionsMutualAuthenticationDetails mutualAuthentication) {
        setMutualAuthentication(mutualAuthentication);
        return this;
    }

    /**
     * <p>
     * Information about the IAM SAML identity provider, if applicable.
     * </p>
     * 
     * @param federatedAuthentication
     *        Information about the IAM SAML identity provider, if applicable.
     */

    public void setFederatedAuthentication(AwsEc2ClientVpnEndpointAuthenticationOptionsFederatedAuthenticationDetails federatedAuthentication) {
        this.federatedAuthentication = federatedAuthentication;
    }

    /**
     * <p>
     * Information about the IAM SAML identity provider, if applicable.
     * </p>
     * 
     * @return Information about the IAM SAML identity provider, if applicable.
     */

    public AwsEc2ClientVpnEndpointAuthenticationOptionsFederatedAuthenticationDetails getFederatedAuthentication() {
        return this.federatedAuthentication;
    }

    /**
     * <p>
     * Information about the IAM SAML identity provider, if applicable.
     * </p>
     * 
     * @param federatedAuthentication
     *        Information about the IAM SAML identity provider, if applicable.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEc2ClientVpnEndpointAuthenticationOptionsDetails withFederatedAuthentication(
            AwsEc2ClientVpnEndpointAuthenticationOptionsFederatedAuthenticationDetails federatedAuthentication) {
        setFederatedAuthentication(federatedAuthentication);
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
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getActiveDirectory() != null)
            sb.append("ActiveDirectory: ").append(getActiveDirectory()).append(",");
        if (getMutualAuthentication() != null)
            sb.append("MutualAuthentication: ").append(getMutualAuthentication()).append(",");
        if (getFederatedAuthentication() != null)
            sb.append("FederatedAuthentication: ").append(getFederatedAuthentication());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AwsEc2ClientVpnEndpointAuthenticationOptionsDetails == false)
            return false;
        AwsEc2ClientVpnEndpointAuthenticationOptionsDetails other = (AwsEc2ClientVpnEndpointAuthenticationOptionsDetails) obj;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getActiveDirectory() == null ^ this.getActiveDirectory() == null)
            return false;
        if (other.getActiveDirectory() != null && other.getActiveDirectory().equals(this.getActiveDirectory()) == false)
            return false;
        if (other.getMutualAuthentication() == null ^ this.getMutualAuthentication() == null)
            return false;
        if (other.getMutualAuthentication() != null && other.getMutualAuthentication().equals(this.getMutualAuthentication()) == false)
            return false;
        if (other.getFederatedAuthentication() == null ^ this.getFederatedAuthentication() == null)
            return false;
        if (other.getFederatedAuthentication() != null && other.getFederatedAuthentication().equals(this.getFederatedAuthentication()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getActiveDirectory() == null) ? 0 : getActiveDirectory().hashCode());
        hashCode = prime * hashCode + ((getMutualAuthentication() == null) ? 0 : getMutualAuthentication().hashCode());
        hashCode = prime * hashCode + ((getFederatedAuthentication() == null) ? 0 : getFederatedAuthentication().hashCode());
        return hashCode;
    }

    @Override
    public AwsEc2ClientVpnEndpointAuthenticationOptionsDetails clone() {
        try {
            return (AwsEc2ClientVpnEndpointAuthenticationOptionsDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.AwsEc2ClientVpnEndpointAuthenticationOptionsDetailsMarshaller.getInstance().marshall(this,
                protocolMarshaller);
    }
}
