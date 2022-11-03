/*
 * Copyright 2017-2022 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.iamrolesanywhere.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rolesanywhere-2018-05-10/ImportCrl" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ImportCrlRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The x509 v3 specified certificate revocation list
     * </p>
     */
    private java.nio.ByteBuffer crlData;
    /**
     * <p>
     * Specifies whether the certificate revocation list (CRL) is enabled.
     * </p>
     */
    private Boolean enabled;
    /**
     * <p>
     * The name of the certificate revocation list (CRL).
     * </p>
     */
    private String name;
    /**
     * <p>
     * A list of tags to attach to the certificate revocation list (CRL).
     * </p>
     */
    private java.util.List<Tag> tags;
    /**
     * <p>
     * The ARN of the TrustAnchor the certificate revocation list (CRL) will provide revocation for.
     * </p>
     */
    private String trustAnchorArn;

    /**
     * <p>
     * The x509 v3 specified certificate revocation list
     * </p>
     * <p>
     * The AWS SDK for Java performs a Base64 encoding on this field before sending this request to the AWS service.
     * Users of the SDK should not perform Base64 encoding on this field.
     * </p>
     * <p>
     * Warning: ByteBuffers returned by the SDK are mutable. Changes to the content or position of the byte buffer will
     * be seen by all objects that have a reference to this object. It is recommended to call ByteBuffer.duplicate() or
     * ByteBuffer.asReadOnlyBuffer() before using or reading from the buffer. This behavior will be changed in a future
     * major version of the SDK.
     * </p>
     * 
     * @param crlData
     *        The x509 v3 specified certificate revocation list
     */

    public void setCrlData(java.nio.ByteBuffer crlData) {
        this.crlData = crlData;
    }

    /**
     * <p>
     * The x509 v3 specified certificate revocation list
     * </p>
     * <p>
     * {@code ByteBuffer}s are stateful. Calling their {@code get} methods changes their {@code position}. We recommend
     * using {@link java.nio.ByteBuffer#asReadOnlyBuffer()} to create a read-only view of the buffer with an independent
     * {@code position}, and calling {@code get} methods on this rather than directly on the returned {@code ByteBuffer}.
     * Doing so will ensure that anyone else using the {@code ByteBuffer} will not be affected by changes to the
     * {@code position}.
     * </p>
     * 
     * @return The x509 v3 specified certificate revocation list
     */

    public java.nio.ByteBuffer getCrlData() {
        return this.crlData;
    }

    /**
     * <p>
     * The x509 v3 specified certificate revocation list
     * </p>
     * <p>
     * The AWS SDK for Java performs a Base64 encoding on this field before sending this request to the AWS service.
     * Users of the SDK should not perform Base64 encoding on this field.
     * </p>
     * <p>
     * Warning: ByteBuffers returned by the SDK are mutable. Changes to the content or position of the byte buffer will
     * be seen by all objects that have a reference to this object. It is recommended to call ByteBuffer.duplicate() or
     * ByteBuffer.asReadOnlyBuffer() before using or reading from the buffer. This behavior will be changed in a future
     * major version of the SDK.
     * </p>
     * 
     * @param crlData
     *        The x509 v3 specified certificate revocation list
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportCrlRequest withCrlData(java.nio.ByteBuffer crlData) {
        setCrlData(crlData);
        return this;
    }

    /**
     * <p>
     * Specifies whether the certificate revocation list (CRL) is enabled.
     * </p>
     * 
     * @param enabled
     *        Specifies whether the certificate revocation list (CRL) is enabled.
     */

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    /**
     * <p>
     * Specifies whether the certificate revocation list (CRL) is enabled.
     * </p>
     * 
     * @return Specifies whether the certificate revocation list (CRL) is enabled.
     */

    public Boolean getEnabled() {
        return this.enabled;
    }

    /**
     * <p>
     * Specifies whether the certificate revocation list (CRL) is enabled.
     * </p>
     * 
     * @param enabled
     *        Specifies whether the certificate revocation list (CRL) is enabled.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportCrlRequest withEnabled(Boolean enabled) {
        setEnabled(enabled);
        return this;
    }

    /**
     * <p>
     * Specifies whether the certificate revocation list (CRL) is enabled.
     * </p>
     * 
     * @return Specifies whether the certificate revocation list (CRL) is enabled.
     */

    public Boolean isEnabled() {
        return this.enabled;
    }

    /**
     * <p>
     * The name of the certificate revocation list (CRL).
     * </p>
     * 
     * @param name
     *        The name of the certificate revocation list (CRL).
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the certificate revocation list (CRL).
     * </p>
     * 
     * @return The name of the certificate revocation list (CRL).
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the certificate revocation list (CRL).
     * </p>
     * 
     * @param name
     *        The name of the certificate revocation list (CRL).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportCrlRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * A list of tags to attach to the certificate revocation list (CRL).
     * </p>
     * 
     * @return A list of tags to attach to the certificate revocation list (CRL).
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * A list of tags to attach to the certificate revocation list (CRL).
     * </p>
     * 
     * @param tags
     *        A list of tags to attach to the certificate revocation list (CRL).
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
     * A list of tags to attach to the certificate revocation list (CRL).
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        A list of tags to attach to the certificate revocation list (CRL).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportCrlRequest withTags(Tag... tags) {
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
     * A list of tags to attach to the certificate revocation list (CRL).
     * </p>
     * 
     * @param tags
     *        A list of tags to attach to the certificate revocation list (CRL).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportCrlRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
        return this;
    }

    /**
     * <p>
     * The ARN of the TrustAnchor the certificate revocation list (CRL) will provide revocation for.
     * </p>
     * 
     * @param trustAnchorArn
     *        The ARN of the TrustAnchor the certificate revocation list (CRL) will provide revocation for.
     */

    public void setTrustAnchorArn(String trustAnchorArn) {
        this.trustAnchorArn = trustAnchorArn;
    }

    /**
     * <p>
     * The ARN of the TrustAnchor the certificate revocation list (CRL) will provide revocation for.
     * </p>
     * 
     * @return The ARN of the TrustAnchor the certificate revocation list (CRL) will provide revocation for.
     */

    public String getTrustAnchorArn() {
        return this.trustAnchorArn;
    }

    /**
     * <p>
     * The ARN of the TrustAnchor the certificate revocation list (CRL) will provide revocation for.
     * </p>
     * 
     * @param trustAnchorArn
     *        The ARN of the TrustAnchor the certificate revocation list (CRL) will provide revocation for.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportCrlRequest withTrustAnchorArn(String trustAnchorArn) {
        setTrustAnchorArn(trustAnchorArn);
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
        if (getCrlData() != null)
            sb.append("CrlData: ").append(getCrlData()).append(",");
        if (getEnabled() != null)
            sb.append("Enabled: ").append(getEnabled()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
        if (getTrustAnchorArn() != null)
            sb.append("TrustAnchorArn: ").append(getTrustAnchorArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ImportCrlRequest == false)
            return false;
        ImportCrlRequest other = (ImportCrlRequest) obj;
        if (other.getCrlData() == null ^ this.getCrlData() == null)
            return false;
        if (other.getCrlData() != null && other.getCrlData().equals(this.getCrlData()) == false)
            return false;
        if (other.getEnabled() == null ^ this.getEnabled() == null)
            return false;
        if (other.getEnabled() != null && other.getEnabled().equals(this.getEnabled()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getTrustAnchorArn() == null ^ this.getTrustAnchorArn() == null)
            return false;
        if (other.getTrustAnchorArn() != null && other.getTrustAnchorArn().equals(this.getTrustAnchorArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCrlData() == null) ? 0 : getCrlData().hashCode());
        hashCode = prime * hashCode + ((getEnabled() == null) ? 0 : getEnabled().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getTrustAnchorArn() == null) ? 0 : getTrustAnchorArn().hashCode());
        return hashCode;
    }

    @Override
    public ImportCrlRequest clone() {
        return (ImportCrlRequest) super.clone();
    }

}
