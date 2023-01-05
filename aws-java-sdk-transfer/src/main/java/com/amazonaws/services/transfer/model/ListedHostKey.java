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
package com.amazonaws.services.transfer.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Returns properties of the host key that's specified.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transfer-2018-11-05/ListedHostKey" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListedHostKey implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The unique Amazon Resource Name (ARN) of the host key.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * A unique identifier for the host key.
     * </p>
     */
    private String hostKeyId;
    /**
     * <p>
     * The public key fingerprint, which is a short sequence of bytes used to identify the longer public key.
     * </p>
     */
    private String fingerprint;
    /**
     * <p>
     * The current description for the host key. You can change it by calling the <code>UpdateHostKey</code> operation
     * and providing a new description.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The encryption algorithm that is used for the host key. The <code>Type</code> parameter is specified by using one
     * of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ssh-rsa</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ssh-ed25519</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ecdsa-sha2-nistp256</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ecdsa-sha2-nistp384</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ecdsa-sha2-nistp521</code>
     * </p>
     * </li>
     * </ul>
     */
    private String type;
    /**
     * <p>
     * The date on which the host key was added to the server.
     * </p>
     */
    private java.util.Date dateImported;

    /**
     * <p>
     * The unique Amazon Resource Name (ARN) of the host key.
     * </p>
     * 
     * @param arn
     *        The unique Amazon Resource Name (ARN) of the host key.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The unique Amazon Resource Name (ARN) of the host key.
     * </p>
     * 
     * @return The unique Amazon Resource Name (ARN) of the host key.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The unique Amazon Resource Name (ARN) of the host key.
     * </p>
     * 
     * @param arn
     *        The unique Amazon Resource Name (ARN) of the host key.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListedHostKey withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * A unique identifier for the host key.
     * </p>
     * 
     * @param hostKeyId
     *        A unique identifier for the host key.
     */

    public void setHostKeyId(String hostKeyId) {
        this.hostKeyId = hostKeyId;
    }

    /**
     * <p>
     * A unique identifier for the host key.
     * </p>
     * 
     * @return A unique identifier for the host key.
     */

    public String getHostKeyId() {
        return this.hostKeyId;
    }

    /**
     * <p>
     * A unique identifier for the host key.
     * </p>
     * 
     * @param hostKeyId
     *        A unique identifier for the host key.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListedHostKey withHostKeyId(String hostKeyId) {
        setHostKeyId(hostKeyId);
        return this;
    }

    /**
     * <p>
     * The public key fingerprint, which is a short sequence of bytes used to identify the longer public key.
     * </p>
     * 
     * @param fingerprint
     *        The public key fingerprint, which is a short sequence of bytes used to identify the longer public key.
     */

    public void setFingerprint(String fingerprint) {
        this.fingerprint = fingerprint;
    }

    /**
     * <p>
     * The public key fingerprint, which is a short sequence of bytes used to identify the longer public key.
     * </p>
     * 
     * @return The public key fingerprint, which is a short sequence of bytes used to identify the longer public key.
     */

    public String getFingerprint() {
        return this.fingerprint;
    }

    /**
     * <p>
     * The public key fingerprint, which is a short sequence of bytes used to identify the longer public key.
     * </p>
     * 
     * @param fingerprint
     *        The public key fingerprint, which is a short sequence of bytes used to identify the longer public key.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListedHostKey withFingerprint(String fingerprint) {
        setFingerprint(fingerprint);
        return this;
    }

    /**
     * <p>
     * The current description for the host key. You can change it by calling the <code>UpdateHostKey</code> operation
     * and providing a new description.
     * </p>
     * 
     * @param description
     *        The current description for the host key. You can change it by calling the <code>UpdateHostKey</code>
     *        operation and providing a new description.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The current description for the host key. You can change it by calling the <code>UpdateHostKey</code> operation
     * and providing a new description.
     * </p>
     * 
     * @return The current description for the host key. You can change it by calling the <code>UpdateHostKey</code>
     *         operation and providing a new description.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The current description for the host key. You can change it by calling the <code>UpdateHostKey</code> operation
     * and providing a new description.
     * </p>
     * 
     * @param description
     *        The current description for the host key. You can change it by calling the <code>UpdateHostKey</code>
     *        operation and providing a new description.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListedHostKey withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The encryption algorithm that is used for the host key. The <code>Type</code> parameter is specified by using one
     * of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ssh-rsa</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ssh-ed25519</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ecdsa-sha2-nistp256</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ecdsa-sha2-nistp384</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ecdsa-sha2-nistp521</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param type
     *        The encryption algorithm that is used for the host key. The <code>Type</code> parameter is specified by
     *        using one of the following values:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ssh-rsa</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ssh-ed25519</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ecdsa-sha2-nistp256</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ecdsa-sha2-nistp384</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ecdsa-sha2-nistp521</code>
     *        </p>
     *        </li>
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The encryption algorithm that is used for the host key. The <code>Type</code> parameter is specified by using one
     * of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ssh-rsa</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ssh-ed25519</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ecdsa-sha2-nistp256</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ecdsa-sha2-nistp384</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ecdsa-sha2-nistp521</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @return The encryption algorithm that is used for the host key. The <code>Type</code> parameter is specified by
     *         using one of the following values:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>ssh-rsa</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ssh-ed25519</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ecdsa-sha2-nistp256</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ecdsa-sha2-nistp384</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ecdsa-sha2-nistp521</code>
     *         </p>
     *         </li>
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The encryption algorithm that is used for the host key. The <code>Type</code> parameter is specified by using one
     * of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ssh-rsa</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ssh-ed25519</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ecdsa-sha2-nistp256</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ecdsa-sha2-nistp384</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ecdsa-sha2-nistp521</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param type
     *        The encryption algorithm that is used for the host key. The <code>Type</code> parameter is specified by
     *        using one of the following values:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ssh-rsa</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ssh-ed25519</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ecdsa-sha2-nistp256</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ecdsa-sha2-nistp384</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ecdsa-sha2-nistp521</code>
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListedHostKey withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The date on which the host key was added to the server.
     * </p>
     * 
     * @param dateImported
     *        The date on which the host key was added to the server.
     */

    public void setDateImported(java.util.Date dateImported) {
        this.dateImported = dateImported;
    }

    /**
     * <p>
     * The date on which the host key was added to the server.
     * </p>
     * 
     * @return The date on which the host key was added to the server.
     */

    public java.util.Date getDateImported() {
        return this.dateImported;
    }

    /**
     * <p>
     * The date on which the host key was added to the server.
     * </p>
     * 
     * @param dateImported
     *        The date on which the host key was added to the server.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListedHostKey withDateImported(java.util.Date dateImported) {
        setDateImported(dateImported);
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
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getHostKeyId() != null)
            sb.append("HostKeyId: ").append(getHostKeyId()).append(",");
        if (getFingerprint() != null)
            sb.append("Fingerprint: ").append(getFingerprint()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getDateImported() != null)
            sb.append("DateImported: ").append(getDateImported());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListedHostKey == false)
            return false;
        ListedHostKey other = (ListedHostKey) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getHostKeyId() == null ^ this.getHostKeyId() == null)
            return false;
        if (other.getHostKeyId() != null && other.getHostKeyId().equals(this.getHostKeyId()) == false)
            return false;
        if (other.getFingerprint() == null ^ this.getFingerprint() == null)
            return false;
        if (other.getFingerprint() != null && other.getFingerprint().equals(this.getFingerprint()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getDateImported() == null ^ this.getDateImported() == null)
            return false;
        if (other.getDateImported() != null && other.getDateImported().equals(this.getDateImported()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getHostKeyId() == null) ? 0 : getHostKeyId().hashCode());
        hashCode = prime * hashCode + ((getFingerprint() == null) ? 0 : getFingerprint().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getDateImported() == null) ? 0 : getDateImported().hashCode());
        return hashCode;
    }

    @Override
    public ListedHostKey clone() {
        try {
            return (ListedHostKey) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.transfer.model.transform.ListedHostKeyMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
