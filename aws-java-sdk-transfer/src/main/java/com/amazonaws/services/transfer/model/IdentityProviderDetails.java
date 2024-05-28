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
package com.amazonaws.services.transfer.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Returns information related to the type of user authentication that is in use for a file transfer protocol-enabled
 * server's users. A server can have only one method of authentication.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transfer-2018-11-05/IdentityProviderDetails" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class IdentityProviderDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Provides the location of the service endpoint used to authenticate users.
     * </p>
     */
    private String url;
    /**
     * <p>
     * This parameter is only applicable if your <code>IdentityProviderType</code> is <code>API_GATEWAY</code>. Provides
     * the type of <code>InvocationRole</code> used to authenticate the user account.
     * </p>
     */
    private String invocationRole;
    /**
     * <p>
     * The identifier of the Directory Service directory that you want to use as your identity provider.
     * </p>
     */
    private String directoryId;
    /**
     * <p>
     * The ARN for a Lambda function to use for the Identity provider.
     * </p>
     */
    private String function;
    /**
     * <p>
     * For SFTP-enabled servers, and for custom identity providers <i>only</i>, you can specify whether to authenticate
     * using a password, SSH key pair, or both.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PASSWORD</code> - users must provide their password to connect.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PUBLIC_KEY</code> - users must provide their private key to connect.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PUBLIC_KEY_OR_PASSWORD</code> - users can authenticate with either their password or their key. This is the
     * default value.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PUBLIC_KEY_AND_PASSWORD</code> - users must provide both their private key and their password to connect.
     * The server checks the key first, and then if the key is valid, the system prompts for a password. If the private
     * key provided does not match the public key that is stored, authentication fails.
     * </p>
     * </li>
     * </ul>
     */
    private String sftpAuthenticationMethods;

    /**
     * <p>
     * Provides the location of the service endpoint used to authenticate users.
     * </p>
     * 
     * @param url
     *        Provides the location of the service endpoint used to authenticate users.
     */

    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * <p>
     * Provides the location of the service endpoint used to authenticate users.
     * </p>
     * 
     * @return Provides the location of the service endpoint used to authenticate users.
     */

    public String getUrl() {
        return this.url;
    }

    /**
     * <p>
     * Provides the location of the service endpoint used to authenticate users.
     * </p>
     * 
     * @param url
     *        Provides the location of the service endpoint used to authenticate users.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IdentityProviderDetails withUrl(String url) {
        setUrl(url);
        return this;
    }

    /**
     * <p>
     * This parameter is only applicable if your <code>IdentityProviderType</code> is <code>API_GATEWAY</code>. Provides
     * the type of <code>InvocationRole</code> used to authenticate the user account.
     * </p>
     * 
     * @param invocationRole
     *        This parameter is only applicable if your <code>IdentityProviderType</code> is <code>API_GATEWAY</code>.
     *        Provides the type of <code>InvocationRole</code> used to authenticate the user account.
     */

    public void setInvocationRole(String invocationRole) {
        this.invocationRole = invocationRole;
    }

    /**
     * <p>
     * This parameter is only applicable if your <code>IdentityProviderType</code> is <code>API_GATEWAY</code>. Provides
     * the type of <code>InvocationRole</code> used to authenticate the user account.
     * </p>
     * 
     * @return This parameter is only applicable if your <code>IdentityProviderType</code> is <code>API_GATEWAY</code>.
     *         Provides the type of <code>InvocationRole</code> used to authenticate the user account.
     */

    public String getInvocationRole() {
        return this.invocationRole;
    }

    /**
     * <p>
     * This parameter is only applicable if your <code>IdentityProviderType</code> is <code>API_GATEWAY</code>. Provides
     * the type of <code>InvocationRole</code> used to authenticate the user account.
     * </p>
     * 
     * @param invocationRole
     *        This parameter is only applicable if your <code>IdentityProviderType</code> is <code>API_GATEWAY</code>.
     *        Provides the type of <code>InvocationRole</code> used to authenticate the user account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IdentityProviderDetails withInvocationRole(String invocationRole) {
        setInvocationRole(invocationRole);
        return this;
    }

    /**
     * <p>
     * The identifier of the Directory Service directory that you want to use as your identity provider.
     * </p>
     * 
     * @param directoryId
     *        The identifier of the Directory Service directory that you want to use as your identity provider.
     */

    public void setDirectoryId(String directoryId) {
        this.directoryId = directoryId;
    }

    /**
     * <p>
     * The identifier of the Directory Service directory that you want to use as your identity provider.
     * </p>
     * 
     * @return The identifier of the Directory Service directory that you want to use as your identity provider.
     */

    public String getDirectoryId() {
        return this.directoryId;
    }

    /**
     * <p>
     * The identifier of the Directory Service directory that you want to use as your identity provider.
     * </p>
     * 
     * @param directoryId
     *        The identifier of the Directory Service directory that you want to use as your identity provider.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IdentityProviderDetails withDirectoryId(String directoryId) {
        setDirectoryId(directoryId);
        return this;
    }

    /**
     * <p>
     * The ARN for a Lambda function to use for the Identity provider.
     * </p>
     * 
     * @param function
     *        The ARN for a Lambda function to use for the Identity provider.
     */

    public void setFunction(String function) {
        this.function = function;
    }

    /**
     * <p>
     * The ARN for a Lambda function to use for the Identity provider.
     * </p>
     * 
     * @return The ARN for a Lambda function to use for the Identity provider.
     */

    public String getFunction() {
        return this.function;
    }

    /**
     * <p>
     * The ARN for a Lambda function to use for the Identity provider.
     * </p>
     * 
     * @param function
     *        The ARN for a Lambda function to use for the Identity provider.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IdentityProviderDetails withFunction(String function) {
        setFunction(function);
        return this;
    }

    /**
     * <p>
     * For SFTP-enabled servers, and for custom identity providers <i>only</i>, you can specify whether to authenticate
     * using a password, SSH key pair, or both.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PASSWORD</code> - users must provide their password to connect.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PUBLIC_KEY</code> - users must provide their private key to connect.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PUBLIC_KEY_OR_PASSWORD</code> - users can authenticate with either their password or their key. This is the
     * default value.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PUBLIC_KEY_AND_PASSWORD</code> - users must provide both their private key and their password to connect.
     * The server checks the key first, and then if the key is valid, the system prompts for a password. If the private
     * key provided does not match the public key that is stored, authentication fails.
     * </p>
     * </li>
     * </ul>
     * 
     * @param sftpAuthenticationMethods
     *        For SFTP-enabled servers, and for custom identity providers <i>only</i>, you can specify whether to
     *        authenticate using a password, SSH key pair, or both.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>PASSWORD</code> - users must provide their password to connect.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>PUBLIC_KEY</code> - users must provide their private key to connect.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>PUBLIC_KEY_OR_PASSWORD</code> - users can authenticate with either their password or their key. This
     *        is the default value.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>PUBLIC_KEY_AND_PASSWORD</code> - users must provide both their private key and their password to
     *        connect. The server checks the key first, and then if the key is valid, the system prompts for a password.
     *        If the private key provided does not match the public key that is stored, authentication fails.
     *        </p>
     *        </li>
     * @see SftpAuthenticationMethods
     */

    public void setSftpAuthenticationMethods(String sftpAuthenticationMethods) {
        this.sftpAuthenticationMethods = sftpAuthenticationMethods;
    }

    /**
     * <p>
     * For SFTP-enabled servers, and for custom identity providers <i>only</i>, you can specify whether to authenticate
     * using a password, SSH key pair, or both.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PASSWORD</code> - users must provide their password to connect.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PUBLIC_KEY</code> - users must provide their private key to connect.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PUBLIC_KEY_OR_PASSWORD</code> - users can authenticate with either their password or their key. This is the
     * default value.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PUBLIC_KEY_AND_PASSWORD</code> - users must provide both their private key and their password to connect.
     * The server checks the key first, and then if the key is valid, the system prompts for a password. If the private
     * key provided does not match the public key that is stored, authentication fails.
     * </p>
     * </li>
     * </ul>
     * 
     * @return For SFTP-enabled servers, and for custom identity providers <i>only</i>, you can specify whether to
     *         authenticate using a password, SSH key pair, or both.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>PASSWORD</code> - users must provide their password to connect.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>PUBLIC_KEY</code> - users must provide their private key to connect.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>PUBLIC_KEY_OR_PASSWORD</code> - users can authenticate with either their password or their key.
     *         This is the default value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>PUBLIC_KEY_AND_PASSWORD</code> - users must provide both their private key and their password to
     *         connect. The server checks the key first, and then if the key is valid, the system prompts for a
     *         password. If the private key provided does not match the public key that is stored, authentication fails.
     *         </p>
     *         </li>
     * @see SftpAuthenticationMethods
     */

    public String getSftpAuthenticationMethods() {
        return this.sftpAuthenticationMethods;
    }

    /**
     * <p>
     * For SFTP-enabled servers, and for custom identity providers <i>only</i>, you can specify whether to authenticate
     * using a password, SSH key pair, or both.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PASSWORD</code> - users must provide their password to connect.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PUBLIC_KEY</code> - users must provide their private key to connect.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PUBLIC_KEY_OR_PASSWORD</code> - users can authenticate with either their password or their key. This is the
     * default value.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PUBLIC_KEY_AND_PASSWORD</code> - users must provide both their private key and their password to connect.
     * The server checks the key first, and then if the key is valid, the system prompts for a password. If the private
     * key provided does not match the public key that is stored, authentication fails.
     * </p>
     * </li>
     * </ul>
     * 
     * @param sftpAuthenticationMethods
     *        For SFTP-enabled servers, and for custom identity providers <i>only</i>, you can specify whether to
     *        authenticate using a password, SSH key pair, or both.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>PASSWORD</code> - users must provide their password to connect.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>PUBLIC_KEY</code> - users must provide their private key to connect.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>PUBLIC_KEY_OR_PASSWORD</code> - users can authenticate with either their password or their key. This
     *        is the default value.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>PUBLIC_KEY_AND_PASSWORD</code> - users must provide both their private key and their password to
     *        connect. The server checks the key first, and then if the key is valid, the system prompts for a password.
     *        If the private key provided does not match the public key that is stored, authentication fails.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SftpAuthenticationMethods
     */

    public IdentityProviderDetails withSftpAuthenticationMethods(String sftpAuthenticationMethods) {
        setSftpAuthenticationMethods(sftpAuthenticationMethods);
        return this;
    }

    /**
     * <p>
     * For SFTP-enabled servers, and for custom identity providers <i>only</i>, you can specify whether to authenticate
     * using a password, SSH key pair, or both.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PASSWORD</code> - users must provide their password to connect.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PUBLIC_KEY</code> - users must provide their private key to connect.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PUBLIC_KEY_OR_PASSWORD</code> - users can authenticate with either their password or their key. This is the
     * default value.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PUBLIC_KEY_AND_PASSWORD</code> - users must provide both their private key and their password to connect.
     * The server checks the key first, and then if the key is valid, the system prompts for a password. If the private
     * key provided does not match the public key that is stored, authentication fails.
     * </p>
     * </li>
     * </ul>
     * 
     * @param sftpAuthenticationMethods
     *        For SFTP-enabled servers, and for custom identity providers <i>only</i>, you can specify whether to
     *        authenticate using a password, SSH key pair, or both.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>PASSWORD</code> - users must provide their password to connect.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>PUBLIC_KEY</code> - users must provide their private key to connect.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>PUBLIC_KEY_OR_PASSWORD</code> - users can authenticate with either their password or their key. This
     *        is the default value.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>PUBLIC_KEY_AND_PASSWORD</code> - users must provide both their private key and their password to
     *        connect. The server checks the key first, and then if the key is valid, the system prompts for a password.
     *        If the private key provided does not match the public key that is stored, authentication fails.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SftpAuthenticationMethods
     */

    public IdentityProviderDetails withSftpAuthenticationMethods(SftpAuthenticationMethods sftpAuthenticationMethods) {
        this.sftpAuthenticationMethods = sftpAuthenticationMethods.toString();
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
        if (getUrl() != null)
            sb.append("Url: ").append(getUrl()).append(",");
        if (getInvocationRole() != null)
            sb.append("InvocationRole: ").append(getInvocationRole()).append(",");
        if (getDirectoryId() != null)
            sb.append("DirectoryId: ").append(getDirectoryId()).append(",");
        if (getFunction() != null)
            sb.append("Function: ").append(getFunction()).append(",");
        if (getSftpAuthenticationMethods() != null)
            sb.append("SftpAuthenticationMethods: ").append(getSftpAuthenticationMethods());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof IdentityProviderDetails == false)
            return false;
        IdentityProviderDetails other = (IdentityProviderDetails) obj;
        if (other.getUrl() == null ^ this.getUrl() == null)
            return false;
        if (other.getUrl() != null && other.getUrl().equals(this.getUrl()) == false)
            return false;
        if (other.getInvocationRole() == null ^ this.getInvocationRole() == null)
            return false;
        if (other.getInvocationRole() != null && other.getInvocationRole().equals(this.getInvocationRole()) == false)
            return false;
        if (other.getDirectoryId() == null ^ this.getDirectoryId() == null)
            return false;
        if (other.getDirectoryId() != null && other.getDirectoryId().equals(this.getDirectoryId()) == false)
            return false;
        if (other.getFunction() == null ^ this.getFunction() == null)
            return false;
        if (other.getFunction() != null && other.getFunction().equals(this.getFunction()) == false)
            return false;
        if (other.getSftpAuthenticationMethods() == null ^ this.getSftpAuthenticationMethods() == null)
            return false;
        if (other.getSftpAuthenticationMethods() != null && other.getSftpAuthenticationMethods().equals(this.getSftpAuthenticationMethods()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getUrl() == null) ? 0 : getUrl().hashCode());
        hashCode = prime * hashCode + ((getInvocationRole() == null) ? 0 : getInvocationRole().hashCode());
        hashCode = prime * hashCode + ((getDirectoryId() == null) ? 0 : getDirectoryId().hashCode());
        hashCode = prime * hashCode + ((getFunction() == null) ? 0 : getFunction().hashCode());
        hashCode = prime * hashCode + ((getSftpAuthenticationMethods() == null) ? 0 : getSftpAuthenticationMethods().hashCode());
        return hashCode;
    }

    @Override
    public IdentityProviderDetails clone() {
        try {
            return (IdentityProviderDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.transfer.model.transform.IdentityProviderDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
