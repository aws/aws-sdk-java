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
package com.amazonaws.services.simplesystemsmanagement.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A structure that includes attributes that describe a document attachment.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/AttachmentContent" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AttachmentContent implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of an attachment.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The size of an attachment in bytes.
     * </p>
     */
    private Long size;
    /**
     * <p>
     * The cryptographic hash value of the document content.
     * </p>
     */
    private String hash;
    /**
     * <p>
     * The hash algorithm used to calculate the hash value.
     * </p>
     */
    private String hashType;
    /**
     * <p>
     * The URL location of the attachment content.
     * </p>
     */
    private String url;

    /**
     * <p>
     * The name of an attachment.
     * </p>
     * 
     * @param name
     *        The name of an attachment.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of an attachment.
     * </p>
     * 
     * @return The name of an attachment.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of an attachment.
     * </p>
     * 
     * @param name
     *        The name of an attachment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AttachmentContent withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The size of an attachment in bytes.
     * </p>
     * 
     * @param size
     *        The size of an attachment in bytes.
     */

    public void setSize(Long size) {
        this.size = size;
    }

    /**
     * <p>
     * The size of an attachment in bytes.
     * </p>
     * 
     * @return The size of an attachment in bytes.
     */

    public Long getSize() {
        return this.size;
    }

    /**
     * <p>
     * The size of an attachment in bytes.
     * </p>
     * 
     * @param size
     *        The size of an attachment in bytes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AttachmentContent withSize(Long size) {
        setSize(size);
        return this;
    }

    /**
     * <p>
     * The cryptographic hash value of the document content.
     * </p>
     * 
     * @param hash
     *        The cryptographic hash value of the document content.
     */

    public void setHash(String hash) {
        this.hash = hash;
    }

    /**
     * <p>
     * The cryptographic hash value of the document content.
     * </p>
     * 
     * @return The cryptographic hash value of the document content.
     */

    public String getHash() {
        return this.hash;
    }

    /**
     * <p>
     * The cryptographic hash value of the document content.
     * </p>
     * 
     * @param hash
     *        The cryptographic hash value of the document content.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AttachmentContent withHash(String hash) {
        setHash(hash);
        return this;
    }

    /**
     * <p>
     * The hash algorithm used to calculate the hash value.
     * </p>
     * 
     * @param hashType
     *        The hash algorithm used to calculate the hash value.
     * @see AttachmentHashType
     */

    public void setHashType(String hashType) {
        this.hashType = hashType;
    }

    /**
     * <p>
     * The hash algorithm used to calculate the hash value.
     * </p>
     * 
     * @return The hash algorithm used to calculate the hash value.
     * @see AttachmentHashType
     */

    public String getHashType() {
        return this.hashType;
    }

    /**
     * <p>
     * The hash algorithm used to calculate the hash value.
     * </p>
     * 
     * @param hashType
     *        The hash algorithm used to calculate the hash value.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AttachmentHashType
     */

    public AttachmentContent withHashType(String hashType) {
        setHashType(hashType);
        return this;
    }

    /**
     * <p>
     * The hash algorithm used to calculate the hash value.
     * </p>
     * 
     * @param hashType
     *        The hash algorithm used to calculate the hash value.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AttachmentHashType
     */

    public AttachmentContent withHashType(AttachmentHashType hashType) {
        this.hashType = hashType.toString();
        return this;
    }

    /**
     * <p>
     * The URL location of the attachment content.
     * </p>
     * 
     * @param url
     *        The URL location of the attachment content.
     */

    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * <p>
     * The URL location of the attachment content.
     * </p>
     * 
     * @return The URL location of the attachment content.
     */

    public String getUrl() {
        return this.url;
    }

    /**
     * <p>
     * The URL location of the attachment content.
     * </p>
     * 
     * @param url
     *        The URL location of the attachment content.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AttachmentContent withUrl(String url) {
        setUrl(url);
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getSize() != null)
            sb.append("Size: ").append(getSize()).append(",");
        if (getHash() != null)
            sb.append("Hash: ").append(getHash()).append(",");
        if (getHashType() != null)
            sb.append("HashType: ").append(getHashType()).append(",");
        if (getUrl() != null)
            sb.append("Url: ").append(getUrl());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AttachmentContent == false)
            return false;
        AttachmentContent other = (AttachmentContent) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getSize() == null ^ this.getSize() == null)
            return false;
        if (other.getSize() != null && other.getSize().equals(this.getSize()) == false)
            return false;
        if (other.getHash() == null ^ this.getHash() == null)
            return false;
        if (other.getHash() != null && other.getHash().equals(this.getHash()) == false)
            return false;
        if (other.getHashType() == null ^ this.getHashType() == null)
            return false;
        if (other.getHashType() != null && other.getHashType().equals(this.getHashType()) == false)
            return false;
        if (other.getUrl() == null ^ this.getUrl() == null)
            return false;
        if (other.getUrl() != null && other.getUrl().equals(this.getUrl()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getSize() == null) ? 0 : getSize().hashCode());
        hashCode = prime * hashCode + ((getHash() == null) ? 0 : getHash().hashCode());
        hashCode = prime * hashCode + ((getHashType() == null) ? 0 : getHashType().hashCode());
        hashCode = prime * hashCode + ((getUrl() == null) ? 0 : getUrl().hashCode());
        return hashCode;
    }

    @Override
    public AttachmentContent clone() {
        try {
            return (AttachmentContent) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.simplesystemsmanagement.model.transform.AttachmentContentMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
