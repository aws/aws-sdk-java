/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.directory.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ds-2015-04-16/EnableClientAuthentication" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EnableClientAuthenticationRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier of the specified directory.
     * </p>
     */
    private String directoryId;
    /**
     * <p>
     * The type of client authentication to enable. Currently only the value <code>SmartCard</code> is supported. Smart
     * card authentication in AD Connector requires that you enable Kerberos Constrained Delegation for the Service User
     * to the LDAP service in the on-premises AD.
     * </p>
     */
    private String type;

    /**
     * <p>
     * The identifier of the specified directory.
     * </p>
     * 
     * @param directoryId
     *        The identifier of the specified directory.
     */

    public void setDirectoryId(String directoryId) {
        this.directoryId = directoryId;
    }

    /**
     * <p>
     * The identifier of the specified directory.
     * </p>
     * 
     * @return The identifier of the specified directory.
     */

    public String getDirectoryId() {
        return this.directoryId;
    }

    /**
     * <p>
     * The identifier of the specified directory.
     * </p>
     * 
     * @param directoryId
     *        The identifier of the specified directory.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EnableClientAuthenticationRequest withDirectoryId(String directoryId) {
        setDirectoryId(directoryId);
        return this;
    }

    /**
     * <p>
     * The type of client authentication to enable. Currently only the value <code>SmartCard</code> is supported. Smart
     * card authentication in AD Connector requires that you enable Kerberos Constrained Delegation for the Service User
     * to the LDAP service in the on-premises AD.
     * </p>
     * 
     * @param type
     *        The type of client authentication to enable. Currently only the value <code>SmartCard</code> is supported.
     *        Smart card authentication in AD Connector requires that you enable Kerberos Constrained Delegation for the
     *        Service User to the LDAP service in the on-premises AD.
     * @see ClientAuthenticationType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of client authentication to enable. Currently only the value <code>SmartCard</code> is supported. Smart
     * card authentication in AD Connector requires that you enable Kerberos Constrained Delegation for the Service User
     * to the LDAP service in the on-premises AD.
     * </p>
     * 
     * @return The type of client authentication to enable. Currently only the value <code>SmartCard</code> is
     *         supported. Smart card authentication in AD Connector requires that you enable Kerberos Constrained
     *         Delegation for the Service User to the LDAP service in the on-premises AD.
     * @see ClientAuthenticationType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of client authentication to enable. Currently only the value <code>SmartCard</code> is supported. Smart
     * card authentication in AD Connector requires that you enable Kerberos Constrained Delegation for the Service User
     * to the LDAP service in the on-premises AD.
     * </p>
     * 
     * @param type
     *        The type of client authentication to enable. Currently only the value <code>SmartCard</code> is supported.
     *        Smart card authentication in AD Connector requires that you enable Kerberos Constrained Delegation for the
     *        Service User to the LDAP service in the on-premises AD.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ClientAuthenticationType
     */

    public EnableClientAuthenticationRequest withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The type of client authentication to enable. Currently only the value <code>SmartCard</code> is supported. Smart
     * card authentication in AD Connector requires that you enable Kerberos Constrained Delegation for the Service User
     * to the LDAP service in the on-premises AD.
     * </p>
     * 
     * @param type
     *        The type of client authentication to enable. Currently only the value <code>SmartCard</code> is supported.
     *        Smart card authentication in AD Connector requires that you enable Kerberos Constrained Delegation for the
     *        Service User to the LDAP service in the on-premises AD.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ClientAuthenticationType
     */

    public EnableClientAuthenticationRequest withType(ClientAuthenticationType type) {
        this.type = type.toString();
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
        if (getDirectoryId() != null)
            sb.append("DirectoryId: ").append(getDirectoryId()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EnableClientAuthenticationRequest == false)
            return false;
        EnableClientAuthenticationRequest other = (EnableClientAuthenticationRequest) obj;
        if (other.getDirectoryId() == null ^ this.getDirectoryId() == null)
            return false;
        if (other.getDirectoryId() != null && other.getDirectoryId().equals(this.getDirectoryId()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDirectoryId() == null) ? 0 : getDirectoryId().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        return hashCode;
    }

    @Override
    public EnableClientAuthenticationRequest clone() {
        return (EnableClientAuthenticationRequest) super.clone();
    }

}
