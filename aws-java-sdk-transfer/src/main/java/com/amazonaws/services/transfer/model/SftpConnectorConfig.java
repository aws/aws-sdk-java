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
 * Contains the details for an SFTP connector object. The connector object is used for transferring files to and from a
 * partner's SFTP server.
 * </p>
 * <note>
 * <p>
 * Because the <code>SftpConnectorConfig</code> data type is used for both creating and updating SFTP connectors, its
 * parameters, <code>TrustedHostKeys</code> and <code>UserSecretId</code> are marked as not required. This is a bit
 * misleading, as they are not required when you are updating an existing SFTP connector, but <i>are required</i> when
 * you are creating a new SFTP connector.
 * </p>
 * </note>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transfer-2018-11-05/SftpConnectorConfig" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SftpConnectorConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The identifier for the secret (in Amazon Web Services Secrets Manager) that contains the SFTP user's private key,
     * password, or both. The identifier must be the Amazon Resource Name (ARN) of the secret.
     * </p>
     */
    private String userSecretId;
    /**
     * <p>
     * The public portion of the host key, or keys, that are used to identify the external server to which you are
     * connecting. You can use the <code>ssh-keyscan</code> command against the SFTP server to retrieve the necessary
     * key.
     * </p>
     * <p>
     * The three standard SSH public key format elements are <code>&lt;key type&gt;</code>,
     * <code>&lt;body base64&gt;</code>, and an optional <code>&lt;comment&gt;</code>, with spaces between each element.
     * Specify only the <code>&lt;key type&gt;</code> and <code>&lt;body base64&gt;</code>: do not enter the
     * <code>&lt;comment&gt;</code> portion of the key.
     * </p>
     * <p>
     * For the trusted host key, Transfer Family accepts RSA and ECDSA keys.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For RSA keys, the <code>&lt;key type&gt;</code> string is <code>ssh-rsa</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For ECDSA keys, the <code>&lt;key type&gt;</code> string is either <code>ecdsa-sha2-nistp256</code>,
     * <code>ecdsa-sha2-nistp384</code>, or <code>ecdsa-sha2-nistp521</code>, depending on the size of the key you
     * generated.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Run this command to retrieve the SFTP server host key, where your SFTP server name is <code>ftp.host.com</code>.
     * </p>
     * <p>
     * <code>ssh-keyscan ftp.host.com</code>
     * </p>
     * <p>
     * This prints the public host key to standard output.
     * </p>
     * <p>
     * <code>ftp.host.com ssh-rsa AAAAB3Nza...&lt;long-string-for-public-key</code>
     * </p>
     * <p>
     * Copy and paste this string into the <code>TrustedHostKeys</code> field for the <code>create-connector</code>
     * command or into the <b>Trusted host keys</b> field in the console.
     * </p>
     */
    private java.util.List<String> trustedHostKeys;

    /**
     * <p>
     * The identifier for the secret (in Amazon Web Services Secrets Manager) that contains the SFTP user's private key,
     * password, or both. The identifier must be the Amazon Resource Name (ARN) of the secret.
     * </p>
     * 
     * @param userSecretId
     *        The identifier for the secret (in Amazon Web Services Secrets Manager) that contains the SFTP user's
     *        private key, password, or both. The identifier must be the Amazon Resource Name (ARN) of the secret.
     */

    public void setUserSecretId(String userSecretId) {
        this.userSecretId = userSecretId;
    }

    /**
     * <p>
     * The identifier for the secret (in Amazon Web Services Secrets Manager) that contains the SFTP user's private key,
     * password, or both. The identifier must be the Amazon Resource Name (ARN) of the secret.
     * </p>
     * 
     * @return The identifier for the secret (in Amazon Web Services Secrets Manager) that contains the SFTP user's
     *         private key, password, or both. The identifier must be the Amazon Resource Name (ARN) of the secret.
     */

    public String getUserSecretId() {
        return this.userSecretId;
    }

    /**
     * <p>
     * The identifier for the secret (in Amazon Web Services Secrets Manager) that contains the SFTP user's private key,
     * password, or both. The identifier must be the Amazon Resource Name (ARN) of the secret.
     * </p>
     * 
     * @param userSecretId
     *        The identifier for the secret (in Amazon Web Services Secrets Manager) that contains the SFTP user's
     *        private key, password, or both. The identifier must be the Amazon Resource Name (ARN) of the secret.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SftpConnectorConfig withUserSecretId(String userSecretId) {
        setUserSecretId(userSecretId);
        return this;
    }

    /**
     * <p>
     * The public portion of the host key, or keys, that are used to identify the external server to which you are
     * connecting. You can use the <code>ssh-keyscan</code> command against the SFTP server to retrieve the necessary
     * key.
     * </p>
     * <p>
     * The three standard SSH public key format elements are <code>&lt;key type&gt;</code>,
     * <code>&lt;body base64&gt;</code>, and an optional <code>&lt;comment&gt;</code>, with spaces between each element.
     * Specify only the <code>&lt;key type&gt;</code> and <code>&lt;body base64&gt;</code>: do not enter the
     * <code>&lt;comment&gt;</code> portion of the key.
     * </p>
     * <p>
     * For the trusted host key, Transfer Family accepts RSA and ECDSA keys.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For RSA keys, the <code>&lt;key type&gt;</code> string is <code>ssh-rsa</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For ECDSA keys, the <code>&lt;key type&gt;</code> string is either <code>ecdsa-sha2-nistp256</code>,
     * <code>ecdsa-sha2-nistp384</code>, or <code>ecdsa-sha2-nistp521</code>, depending on the size of the key you
     * generated.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Run this command to retrieve the SFTP server host key, where your SFTP server name is <code>ftp.host.com</code>.
     * </p>
     * <p>
     * <code>ssh-keyscan ftp.host.com</code>
     * </p>
     * <p>
     * This prints the public host key to standard output.
     * </p>
     * <p>
     * <code>ftp.host.com ssh-rsa AAAAB3Nza...&lt;long-string-for-public-key</code>
     * </p>
     * <p>
     * Copy and paste this string into the <code>TrustedHostKeys</code> field for the <code>create-connector</code>
     * command or into the <b>Trusted host keys</b> field in the console.
     * </p>
     * 
     * @return The public portion of the host key, or keys, that are used to identify the external server to which you
     *         are connecting. You can use the <code>ssh-keyscan</code> command against the SFTP server to retrieve the
     *         necessary key.</p>
     *         <p>
     *         The three standard SSH public key format elements are <code>&lt;key type&gt;</code>,
     *         <code>&lt;body base64&gt;</code>, and an optional <code>&lt;comment&gt;</code>, with spaces between each
     *         element. Specify only the <code>&lt;key type&gt;</code> and <code>&lt;body base64&gt;</code>: do not
     *         enter the <code>&lt;comment&gt;</code> portion of the key.
     *         </p>
     *         <p>
     *         For the trusted host key, Transfer Family accepts RSA and ECDSA keys.
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         For RSA keys, the <code>&lt;key type&gt;</code> string is <code>ssh-rsa</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For ECDSA keys, the <code>&lt;key type&gt;</code> string is either <code>ecdsa-sha2-nistp256</code>,
     *         <code>ecdsa-sha2-nistp384</code>, or <code>ecdsa-sha2-nistp521</code>, depending on the size of the key
     *         you generated.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         Run this command to retrieve the SFTP server host key, where your SFTP server name is
     *         <code>ftp.host.com</code>.
     *         </p>
     *         <p>
     *         <code>ssh-keyscan ftp.host.com</code>
     *         </p>
     *         <p>
     *         This prints the public host key to standard output.
     *         </p>
     *         <p>
     *         <code>ftp.host.com ssh-rsa AAAAB3Nza...&lt;long-string-for-public-key</code>
     *         </p>
     *         <p>
     *         Copy and paste this string into the <code>TrustedHostKeys</code> field for the
     *         <code>create-connector</code> command or into the <b>Trusted host keys</b> field in the console.
     */

    public java.util.List<String> getTrustedHostKeys() {
        return trustedHostKeys;
    }

    /**
     * <p>
     * The public portion of the host key, or keys, that are used to identify the external server to which you are
     * connecting. You can use the <code>ssh-keyscan</code> command against the SFTP server to retrieve the necessary
     * key.
     * </p>
     * <p>
     * The three standard SSH public key format elements are <code>&lt;key type&gt;</code>,
     * <code>&lt;body base64&gt;</code>, and an optional <code>&lt;comment&gt;</code>, with spaces between each element.
     * Specify only the <code>&lt;key type&gt;</code> and <code>&lt;body base64&gt;</code>: do not enter the
     * <code>&lt;comment&gt;</code> portion of the key.
     * </p>
     * <p>
     * For the trusted host key, Transfer Family accepts RSA and ECDSA keys.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For RSA keys, the <code>&lt;key type&gt;</code> string is <code>ssh-rsa</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For ECDSA keys, the <code>&lt;key type&gt;</code> string is either <code>ecdsa-sha2-nistp256</code>,
     * <code>ecdsa-sha2-nistp384</code>, or <code>ecdsa-sha2-nistp521</code>, depending on the size of the key you
     * generated.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Run this command to retrieve the SFTP server host key, where your SFTP server name is <code>ftp.host.com</code>.
     * </p>
     * <p>
     * <code>ssh-keyscan ftp.host.com</code>
     * </p>
     * <p>
     * This prints the public host key to standard output.
     * </p>
     * <p>
     * <code>ftp.host.com ssh-rsa AAAAB3Nza...&lt;long-string-for-public-key</code>
     * </p>
     * <p>
     * Copy and paste this string into the <code>TrustedHostKeys</code> field for the <code>create-connector</code>
     * command or into the <b>Trusted host keys</b> field in the console.
     * </p>
     * 
     * @param trustedHostKeys
     *        The public portion of the host key, or keys, that are used to identify the external server to which you
     *        are connecting. You can use the <code>ssh-keyscan</code> command against the SFTP server to retrieve the
     *        necessary key.</p>
     *        <p>
     *        The three standard SSH public key format elements are <code>&lt;key type&gt;</code>,
     *        <code>&lt;body base64&gt;</code>, and an optional <code>&lt;comment&gt;</code>, with spaces between each
     *        element. Specify only the <code>&lt;key type&gt;</code> and <code>&lt;body base64&gt;</code>: do not enter
     *        the <code>&lt;comment&gt;</code> portion of the key.
     *        </p>
     *        <p>
     *        For the trusted host key, Transfer Family accepts RSA and ECDSA keys.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        For RSA keys, the <code>&lt;key type&gt;</code> string is <code>ssh-rsa</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For ECDSA keys, the <code>&lt;key type&gt;</code> string is either <code>ecdsa-sha2-nistp256</code>,
     *        <code>ecdsa-sha2-nistp384</code>, or <code>ecdsa-sha2-nistp521</code>, depending on the size of the key
     *        you generated.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Run this command to retrieve the SFTP server host key, where your SFTP server name is
     *        <code>ftp.host.com</code>.
     *        </p>
     *        <p>
     *        <code>ssh-keyscan ftp.host.com</code>
     *        </p>
     *        <p>
     *        This prints the public host key to standard output.
     *        </p>
     *        <p>
     *        <code>ftp.host.com ssh-rsa AAAAB3Nza...&lt;long-string-for-public-key</code>
     *        </p>
     *        <p>
     *        Copy and paste this string into the <code>TrustedHostKeys</code> field for the
     *        <code>create-connector</code> command or into the <b>Trusted host keys</b> field in the console.
     */

    public void setTrustedHostKeys(java.util.Collection<String> trustedHostKeys) {
        if (trustedHostKeys == null) {
            this.trustedHostKeys = null;
            return;
        }

        this.trustedHostKeys = new java.util.ArrayList<String>(trustedHostKeys);
    }

    /**
     * <p>
     * The public portion of the host key, or keys, that are used to identify the external server to which you are
     * connecting. You can use the <code>ssh-keyscan</code> command against the SFTP server to retrieve the necessary
     * key.
     * </p>
     * <p>
     * The three standard SSH public key format elements are <code>&lt;key type&gt;</code>,
     * <code>&lt;body base64&gt;</code>, and an optional <code>&lt;comment&gt;</code>, with spaces between each element.
     * Specify only the <code>&lt;key type&gt;</code> and <code>&lt;body base64&gt;</code>: do not enter the
     * <code>&lt;comment&gt;</code> portion of the key.
     * </p>
     * <p>
     * For the trusted host key, Transfer Family accepts RSA and ECDSA keys.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For RSA keys, the <code>&lt;key type&gt;</code> string is <code>ssh-rsa</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For ECDSA keys, the <code>&lt;key type&gt;</code> string is either <code>ecdsa-sha2-nistp256</code>,
     * <code>ecdsa-sha2-nistp384</code>, or <code>ecdsa-sha2-nistp521</code>, depending on the size of the key you
     * generated.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Run this command to retrieve the SFTP server host key, where your SFTP server name is <code>ftp.host.com</code>.
     * </p>
     * <p>
     * <code>ssh-keyscan ftp.host.com</code>
     * </p>
     * <p>
     * This prints the public host key to standard output.
     * </p>
     * <p>
     * <code>ftp.host.com ssh-rsa AAAAB3Nza...&lt;long-string-for-public-key</code>
     * </p>
     * <p>
     * Copy and paste this string into the <code>TrustedHostKeys</code> field for the <code>create-connector</code>
     * command or into the <b>Trusted host keys</b> field in the console.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTrustedHostKeys(java.util.Collection)} or {@link #withTrustedHostKeys(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param trustedHostKeys
     *        The public portion of the host key, or keys, that are used to identify the external server to which you
     *        are connecting. You can use the <code>ssh-keyscan</code> command against the SFTP server to retrieve the
     *        necessary key.</p>
     *        <p>
     *        The three standard SSH public key format elements are <code>&lt;key type&gt;</code>,
     *        <code>&lt;body base64&gt;</code>, and an optional <code>&lt;comment&gt;</code>, with spaces between each
     *        element. Specify only the <code>&lt;key type&gt;</code> and <code>&lt;body base64&gt;</code>: do not enter
     *        the <code>&lt;comment&gt;</code> portion of the key.
     *        </p>
     *        <p>
     *        For the trusted host key, Transfer Family accepts RSA and ECDSA keys.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        For RSA keys, the <code>&lt;key type&gt;</code> string is <code>ssh-rsa</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For ECDSA keys, the <code>&lt;key type&gt;</code> string is either <code>ecdsa-sha2-nistp256</code>,
     *        <code>ecdsa-sha2-nistp384</code>, or <code>ecdsa-sha2-nistp521</code>, depending on the size of the key
     *        you generated.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Run this command to retrieve the SFTP server host key, where your SFTP server name is
     *        <code>ftp.host.com</code>.
     *        </p>
     *        <p>
     *        <code>ssh-keyscan ftp.host.com</code>
     *        </p>
     *        <p>
     *        This prints the public host key to standard output.
     *        </p>
     *        <p>
     *        <code>ftp.host.com ssh-rsa AAAAB3Nza...&lt;long-string-for-public-key</code>
     *        </p>
     *        <p>
     *        Copy and paste this string into the <code>TrustedHostKeys</code> field for the
     *        <code>create-connector</code> command or into the <b>Trusted host keys</b> field in the console.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SftpConnectorConfig withTrustedHostKeys(String... trustedHostKeys) {
        if (this.trustedHostKeys == null) {
            setTrustedHostKeys(new java.util.ArrayList<String>(trustedHostKeys.length));
        }
        for (String ele : trustedHostKeys) {
            this.trustedHostKeys.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The public portion of the host key, or keys, that are used to identify the external server to which you are
     * connecting. You can use the <code>ssh-keyscan</code> command against the SFTP server to retrieve the necessary
     * key.
     * </p>
     * <p>
     * The three standard SSH public key format elements are <code>&lt;key type&gt;</code>,
     * <code>&lt;body base64&gt;</code>, and an optional <code>&lt;comment&gt;</code>, with spaces between each element.
     * Specify only the <code>&lt;key type&gt;</code> and <code>&lt;body base64&gt;</code>: do not enter the
     * <code>&lt;comment&gt;</code> portion of the key.
     * </p>
     * <p>
     * For the trusted host key, Transfer Family accepts RSA and ECDSA keys.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For RSA keys, the <code>&lt;key type&gt;</code> string is <code>ssh-rsa</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For ECDSA keys, the <code>&lt;key type&gt;</code> string is either <code>ecdsa-sha2-nistp256</code>,
     * <code>ecdsa-sha2-nistp384</code>, or <code>ecdsa-sha2-nistp521</code>, depending on the size of the key you
     * generated.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Run this command to retrieve the SFTP server host key, where your SFTP server name is <code>ftp.host.com</code>.
     * </p>
     * <p>
     * <code>ssh-keyscan ftp.host.com</code>
     * </p>
     * <p>
     * This prints the public host key to standard output.
     * </p>
     * <p>
     * <code>ftp.host.com ssh-rsa AAAAB3Nza...&lt;long-string-for-public-key</code>
     * </p>
     * <p>
     * Copy and paste this string into the <code>TrustedHostKeys</code> field for the <code>create-connector</code>
     * command or into the <b>Trusted host keys</b> field in the console.
     * </p>
     * 
     * @param trustedHostKeys
     *        The public portion of the host key, or keys, that are used to identify the external server to which you
     *        are connecting. You can use the <code>ssh-keyscan</code> command against the SFTP server to retrieve the
     *        necessary key.</p>
     *        <p>
     *        The three standard SSH public key format elements are <code>&lt;key type&gt;</code>,
     *        <code>&lt;body base64&gt;</code>, and an optional <code>&lt;comment&gt;</code>, with spaces between each
     *        element. Specify only the <code>&lt;key type&gt;</code> and <code>&lt;body base64&gt;</code>: do not enter
     *        the <code>&lt;comment&gt;</code> portion of the key.
     *        </p>
     *        <p>
     *        For the trusted host key, Transfer Family accepts RSA and ECDSA keys.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        For RSA keys, the <code>&lt;key type&gt;</code> string is <code>ssh-rsa</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For ECDSA keys, the <code>&lt;key type&gt;</code> string is either <code>ecdsa-sha2-nistp256</code>,
     *        <code>ecdsa-sha2-nistp384</code>, or <code>ecdsa-sha2-nistp521</code>, depending on the size of the key
     *        you generated.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Run this command to retrieve the SFTP server host key, where your SFTP server name is
     *        <code>ftp.host.com</code>.
     *        </p>
     *        <p>
     *        <code>ssh-keyscan ftp.host.com</code>
     *        </p>
     *        <p>
     *        This prints the public host key to standard output.
     *        </p>
     *        <p>
     *        <code>ftp.host.com ssh-rsa AAAAB3Nza...&lt;long-string-for-public-key</code>
     *        </p>
     *        <p>
     *        Copy and paste this string into the <code>TrustedHostKeys</code> field for the
     *        <code>create-connector</code> command or into the <b>Trusted host keys</b> field in the console.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SftpConnectorConfig withTrustedHostKeys(java.util.Collection<String> trustedHostKeys) {
        setTrustedHostKeys(trustedHostKeys);
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
        if (getUserSecretId() != null)
            sb.append("UserSecretId: ").append(getUserSecretId()).append(",");
        if (getTrustedHostKeys() != null)
            sb.append("TrustedHostKeys: ").append(getTrustedHostKeys());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SftpConnectorConfig == false)
            return false;
        SftpConnectorConfig other = (SftpConnectorConfig) obj;
        if (other.getUserSecretId() == null ^ this.getUserSecretId() == null)
            return false;
        if (other.getUserSecretId() != null && other.getUserSecretId().equals(this.getUserSecretId()) == false)
            return false;
        if (other.getTrustedHostKeys() == null ^ this.getTrustedHostKeys() == null)
            return false;
        if (other.getTrustedHostKeys() != null && other.getTrustedHostKeys().equals(this.getTrustedHostKeys()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getUserSecretId() == null) ? 0 : getUserSecretId().hashCode());
        hashCode = prime * hashCode + ((getTrustedHostKeys() == null) ? 0 : getTrustedHostKeys().hashCode());
        return hashCode;
    }

    @Override
    public SftpConnectorConfig clone() {
        try {
            return (SftpConnectorConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.transfer.model.transform.SftpConnectorConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
