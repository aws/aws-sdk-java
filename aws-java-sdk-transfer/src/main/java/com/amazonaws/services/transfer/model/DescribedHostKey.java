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
 * The details for a server host key.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transfer-2018-11-05/DescribedHostKey" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribedHostKey implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The unique Amazon Resource Name (ARN) for the host key.
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
    private String hostKeyFingerprint;
    /**
     * <p>
     * The text description for this host key.
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
     * Key-value pairs that can be used to group and search for host keys.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * The unique Amazon Resource Name (ARN) for the host key.
     * </p>
     * 
     * @param arn
     *        The unique Amazon Resource Name (ARN) for the host key.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The unique Amazon Resource Name (ARN) for the host key.
     * </p>
     * 
     * @return The unique Amazon Resource Name (ARN) for the host key.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The unique Amazon Resource Name (ARN) for the host key.
     * </p>
     * 
     * @param arn
     *        The unique Amazon Resource Name (ARN) for the host key.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribedHostKey withArn(String arn) {
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

    public DescribedHostKey withHostKeyId(String hostKeyId) {
        setHostKeyId(hostKeyId);
        return this;
    }

    /**
     * <p>
     * The public key fingerprint, which is a short sequence of bytes used to identify the longer public key.
     * </p>
     * 
     * @param hostKeyFingerprint
     *        The public key fingerprint, which is a short sequence of bytes used to identify the longer public key.
     */

    public void setHostKeyFingerprint(String hostKeyFingerprint) {
        this.hostKeyFingerprint = hostKeyFingerprint;
    }

    /**
     * <p>
     * The public key fingerprint, which is a short sequence of bytes used to identify the longer public key.
     * </p>
     * 
     * @return The public key fingerprint, which is a short sequence of bytes used to identify the longer public key.
     */

    public String getHostKeyFingerprint() {
        return this.hostKeyFingerprint;
    }

    /**
     * <p>
     * The public key fingerprint, which is a short sequence of bytes used to identify the longer public key.
     * </p>
     * 
     * @param hostKeyFingerprint
     *        The public key fingerprint, which is a short sequence of bytes used to identify the longer public key.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribedHostKey withHostKeyFingerprint(String hostKeyFingerprint) {
        setHostKeyFingerprint(hostKeyFingerprint);
        return this;
    }

    /**
     * <p>
     * The text description for this host key.
     * </p>
     * 
     * @param description
     *        The text description for this host key.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The text description for this host key.
     * </p>
     * 
     * @return The text description for this host key.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The text description for this host key.
     * </p>
     * 
     * @param description
     *        The text description for this host key.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribedHostKey withDescription(String description) {
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

    public DescribedHostKey withType(String type) {
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

    public DescribedHostKey withDateImported(java.util.Date dateImported) {
        setDateImported(dateImported);
        return this;
    }

    /**
     * <p>
     * Key-value pairs that can be used to group and search for host keys.
     * </p>
     * 
     * @return Key-value pairs that can be used to group and search for host keys.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * Key-value pairs that can be used to group and search for host keys.
     * </p>
     * 
     * @param tags
     *        Key-value pairs that can be used to group and search for host keys.
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<Tag>(tags);
    }

    /**
     * <p>
     * Key-value pairs that can be used to group and search for host keys.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        Key-value pairs that can be used to group and search for host keys.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribedHostKey withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new java.util.ArrayList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Key-value pairs that can be used to group and search for host keys.
     * </p>
     * 
     * @param tags
     *        Key-value pairs that can be used to group and search for host keys.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribedHostKey withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
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
        if (getHostKeyFingerprint() != null)
            sb.append("HostKeyFingerprint: ").append(getHostKeyFingerprint()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getDateImported() != null)
            sb.append("DateImported: ").append(getDateImported()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribedHostKey == false)
            return false;
        DescribedHostKey other = (DescribedHostKey) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getHostKeyId() == null ^ this.getHostKeyId() == null)
            return false;
        if (other.getHostKeyId() != null && other.getHostKeyId().equals(this.getHostKeyId()) == false)
            return false;
        if (other.getHostKeyFingerprint() == null ^ this.getHostKeyFingerprint() == null)
            return false;
        if (other.getHostKeyFingerprint() != null && other.getHostKeyFingerprint().equals(this.getHostKeyFingerprint()) == false)
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
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getHostKeyId() == null) ? 0 : getHostKeyId().hashCode());
        hashCode = prime * hashCode + ((getHostKeyFingerprint() == null) ? 0 : getHostKeyFingerprint().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getDateImported() == null) ? 0 : getDateImported().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public DescribedHostKey clone() {
        try {
            return (DescribedHostKey) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.transfer.model.transform.DescribedHostKeyMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
