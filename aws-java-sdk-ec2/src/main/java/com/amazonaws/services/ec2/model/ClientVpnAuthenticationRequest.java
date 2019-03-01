/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Describes the authentication method to be used by a Client VPN endpoint. Client VPN supports Active Directory and
 * mutual authentication. For more information, see <a href=
 * "https://docs.aws.amazon.com/vpn/latest/clientvpn-admin/authentication-authrization.html#client-authentication"
 * >Authentication</a> in the <i>AWS Client VPN Administrator Guide</i>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/ClientVpnAuthenticationRequest" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ClientVpnAuthenticationRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The type of client authentication to be used. Specify <code>certificate-authentication</code> to use
     * certificate-based authentication, or <code>directory-service-authentication</code> to use Active Directory
     * authentication.
     * </p>
     */
    private String type;
    /**
     * <p>
     * Information about the Active Directory to be used, if applicable. You must provide this information if
     * <b>Type</b> is <code>directory-service-authentication</code>.
     * </p>
     */
    private DirectoryServiceAuthenticationRequest activeDirectory;
    /**
     * <p>
     * Information about the authentication certificates to be used, if applicable. You must provide this information if
     * <b>Type</b> is <code>certificate-authentication</code>.
     * </p>
     */
    private CertificateAuthenticationRequest mutualAuthentication;

    /**
     * <p>
     * The type of client authentication to be used. Specify <code>certificate-authentication</code> to use
     * certificate-based authentication, or <code>directory-service-authentication</code> to use Active Directory
     * authentication.
     * </p>
     * 
     * @param type
     *        The type of client authentication to be used. Specify <code>certificate-authentication</code> to use
     *        certificate-based authentication, or <code>directory-service-authentication</code> to use Active Directory
     *        authentication.
     * @see ClientVpnAuthenticationType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of client authentication to be used. Specify <code>certificate-authentication</code> to use
     * certificate-based authentication, or <code>directory-service-authentication</code> to use Active Directory
     * authentication.
     * </p>
     * 
     * @return The type of client authentication to be used. Specify <code>certificate-authentication</code> to use
     *         certificate-based authentication, or <code>directory-service-authentication</code> to use Active
     *         Directory authentication.
     * @see ClientVpnAuthenticationType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of client authentication to be used. Specify <code>certificate-authentication</code> to use
     * certificate-based authentication, or <code>directory-service-authentication</code> to use Active Directory
     * authentication.
     * </p>
     * 
     * @param type
     *        The type of client authentication to be used. Specify <code>certificate-authentication</code> to use
     *        certificate-based authentication, or <code>directory-service-authentication</code> to use Active Directory
     *        authentication.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ClientVpnAuthenticationType
     */

    public ClientVpnAuthenticationRequest withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The type of client authentication to be used. Specify <code>certificate-authentication</code> to use
     * certificate-based authentication, or <code>directory-service-authentication</code> to use Active Directory
     * authentication.
     * </p>
     * 
     * @param type
     *        The type of client authentication to be used. Specify <code>certificate-authentication</code> to use
     *        certificate-based authentication, or <code>directory-service-authentication</code> to use Active Directory
     *        authentication.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ClientVpnAuthenticationType
     */

    public ClientVpnAuthenticationRequest withType(ClientVpnAuthenticationType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * Information about the Active Directory to be used, if applicable. You must provide this information if
     * <b>Type</b> is <code>directory-service-authentication</code>.
     * </p>
     * 
     * @param activeDirectory
     *        Information about the Active Directory to be used, if applicable. You must provide this information if
     *        <b>Type</b> is <code>directory-service-authentication</code>.
     */

    public void setActiveDirectory(DirectoryServiceAuthenticationRequest activeDirectory) {
        this.activeDirectory = activeDirectory;
    }

    /**
     * <p>
     * Information about the Active Directory to be used, if applicable. You must provide this information if
     * <b>Type</b> is <code>directory-service-authentication</code>.
     * </p>
     * 
     * @return Information about the Active Directory to be used, if applicable. You must provide this information if
     *         <b>Type</b> is <code>directory-service-authentication</code>.
     */

    public DirectoryServiceAuthenticationRequest getActiveDirectory() {
        return this.activeDirectory;
    }

    /**
     * <p>
     * Information about the Active Directory to be used, if applicable. You must provide this information if
     * <b>Type</b> is <code>directory-service-authentication</code>.
     * </p>
     * 
     * @param activeDirectory
     *        Information about the Active Directory to be used, if applicable. You must provide this information if
     *        <b>Type</b> is <code>directory-service-authentication</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ClientVpnAuthenticationRequest withActiveDirectory(DirectoryServiceAuthenticationRequest activeDirectory) {
        setActiveDirectory(activeDirectory);
        return this;
    }

    /**
     * <p>
     * Information about the authentication certificates to be used, if applicable. You must provide this information if
     * <b>Type</b> is <code>certificate-authentication</code>.
     * </p>
     * 
     * @param mutualAuthentication
     *        Information about the authentication certificates to be used, if applicable. You must provide this
     *        information if <b>Type</b> is <code>certificate-authentication</code>.
     */

    public void setMutualAuthentication(CertificateAuthenticationRequest mutualAuthentication) {
        this.mutualAuthentication = mutualAuthentication;
    }

    /**
     * <p>
     * Information about the authentication certificates to be used, if applicable. You must provide this information if
     * <b>Type</b> is <code>certificate-authentication</code>.
     * </p>
     * 
     * @return Information about the authentication certificates to be used, if applicable. You must provide this
     *         information if <b>Type</b> is <code>certificate-authentication</code>.
     */

    public CertificateAuthenticationRequest getMutualAuthentication() {
        return this.mutualAuthentication;
    }

    /**
     * <p>
     * Information about the authentication certificates to be used, if applicable. You must provide this information if
     * <b>Type</b> is <code>certificate-authentication</code>.
     * </p>
     * 
     * @param mutualAuthentication
     *        Information about the authentication certificates to be used, if applicable. You must provide this
     *        information if <b>Type</b> is <code>certificate-authentication</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ClientVpnAuthenticationRequest withMutualAuthentication(CertificateAuthenticationRequest mutualAuthentication) {
        setMutualAuthentication(mutualAuthentication);
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
            sb.append("MutualAuthentication: ").append(getMutualAuthentication());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ClientVpnAuthenticationRequest == false)
            return false;
        ClientVpnAuthenticationRequest other = (ClientVpnAuthenticationRequest) obj;
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
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getActiveDirectory() == null) ? 0 : getActiveDirectory().hashCode());
        hashCode = prime * hashCode + ((getMutualAuthentication() == null) ? 0 : getMutualAuthentication().hashCode());
        return hashCode;
    }

    @Override
    public ClientVpnAuthenticationRequest clone() {
        try {
            return (ClientVpnAuthenticationRequest) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
