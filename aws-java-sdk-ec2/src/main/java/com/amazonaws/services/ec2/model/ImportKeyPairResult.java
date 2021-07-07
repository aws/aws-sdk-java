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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceResult;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ImportKeyPairResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The MD5 public key fingerprint as specified in section 4 of RFC 4716.
     * </p>
     */
    private String keyFingerprint;
    /**
     * <p>
     * The key pair name that you provided.
     * </p>
     */
    private String keyName;
    /**
     * <p>
     * The ID of the resulting key pair.
     * </p>
     */
    private String keyPairId;
    /**
     * <p>
     * The tags applied to the imported key pair.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Tag> tags;

    /**
     * <p>
     * The MD5 public key fingerprint as specified in section 4 of RFC 4716.
     * </p>
     * 
     * @param keyFingerprint
     *        The MD5 public key fingerprint as specified in section 4 of RFC 4716.
     */

    public void setKeyFingerprint(String keyFingerprint) {
        this.keyFingerprint = keyFingerprint;
    }

    /**
     * <p>
     * The MD5 public key fingerprint as specified in section 4 of RFC 4716.
     * </p>
     * 
     * @return The MD5 public key fingerprint as specified in section 4 of RFC 4716.
     */

    public String getKeyFingerprint() {
        return this.keyFingerprint;
    }

    /**
     * <p>
     * The MD5 public key fingerprint as specified in section 4 of RFC 4716.
     * </p>
     * 
     * @param keyFingerprint
     *        The MD5 public key fingerprint as specified in section 4 of RFC 4716.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportKeyPairResult withKeyFingerprint(String keyFingerprint) {
        setKeyFingerprint(keyFingerprint);
        return this;
    }

    /**
     * <p>
     * The key pair name that you provided.
     * </p>
     * 
     * @param keyName
     *        The key pair name that you provided.
     */

    public void setKeyName(String keyName) {
        this.keyName = keyName;
    }

    /**
     * <p>
     * The key pair name that you provided.
     * </p>
     * 
     * @return The key pair name that you provided.
     */

    public String getKeyName() {
        return this.keyName;
    }

    /**
     * <p>
     * The key pair name that you provided.
     * </p>
     * 
     * @param keyName
     *        The key pair name that you provided.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportKeyPairResult withKeyName(String keyName) {
        setKeyName(keyName);
        return this;
    }

    /**
     * <p>
     * The ID of the resulting key pair.
     * </p>
     * 
     * @param keyPairId
     *        The ID of the resulting key pair.
     */

    public void setKeyPairId(String keyPairId) {
        this.keyPairId = keyPairId;
    }

    /**
     * <p>
     * The ID of the resulting key pair.
     * </p>
     * 
     * @return The ID of the resulting key pair.
     */

    public String getKeyPairId() {
        return this.keyPairId;
    }

    /**
     * <p>
     * The ID of the resulting key pair.
     * </p>
     * 
     * @param keyPairId
     *        The ID of the resulting key pair.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportKeyPairResult withKeyPairId(String keyPairId) {
        setKeyPairId(keyPairId);
        return this;
    }

    /**
     * <p>
     * The tags applied to the imported key pair.
     * </p>
     * 
     * @return The tags applied to the imported key pair.
     */

    public java.util.List<Tag> getTags() {
        if (tags == null) {
            tags = new com.amazonaws.internal.SdkInternalList<Tag>();
        }
        return tags;
    }

    /**
     * <p>
     * The tags applied to the imported key pair.
     * </p>
     * 
     * @param tags
     *        The tags applied to the imported key pair.
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new com.amazonaws.internal.SdkInternalList<Tag>(tags);
    }

    /**
     * <p>
     * The tags applied to the imported key pair.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        The tags applied to the imported key pair.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportKeyPairResult withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new com.amazonaws.internal.SdkInternalList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The tags applied to the imported key pair.
     * </p>
     * 
     * @param tags
     *        The tags applied to the imported key pair.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportKeyPairResult withTags(java.util.Collection<Tag> tags) {
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
        if (getKeyFingerprint() != null)
            sb.append("KeyFingerprint: ").append(getKeyFingerprint()).append(",");
        if (getKeyName() != null)
            sb.append("KeyName: ").append(getKeyName()).append(",");
        if (getKeyPairId() != null)
            sb.append("KeyPairId: ").append(getKeyPairId()).append(",");
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

        if (obj instanceof ImportKeyPairResult == false)
            return false;
        ImportKeyPairResult other = (ImportKeyPairResult) obj;
        if (other.getKeyFingerprint() == null ^ this.getKeyFingerprint() == null)
            return false;
        if (other.getKeyFingerprint() != null && other.getKeyFingerprint().equals(this.getKeyFingerprint()) == false)
            return false;
        if (other.getKeyName() == null ^ this.getKeyName() == null)
            return false;
        if (other.getKeyName() != null && other.getKeyName().equals(this.getKeyName()) == false)
            return false;
        if (other.getKeyPairId() == null ^ this.getKeyPairId() == null)
            return false;
        if (other.getKeyPairId() != null && other.getKeyPairId().equals(this.getKeyPairId()) == false)
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

        hashCode = prime * hashCode + ((getKeyFingerprint() == null) ? 0 : getKeyFingerprint().hashCode());
        hashCode = prime * hashCode + ((getKeyName() == null) ? 0 : getKeyName().hashCode());
        hashCode = prime * hashCode + ((getKeyPairId() == null) ? 0 : getKeyPairId().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public ImportKeyPairResult clone() {
        try {
            return (ImportKeyPairResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
