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
package com.amazonaws.services.cloudfront.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * A complex data type of profiles for the field-level encryption.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2018-11-05/FieldLevelEncryptionProfileConfig"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FieldLevelEncryptionProfileConfig implements Serializable, Cloneable {

    /**
     * <p>
     * Profile name for the field-level encryption profile.
     * </p>
     */
    private String name;
    /**
     * <p>
     * A unique number that ensures that the request can't be replayed.
     * </p>
     */
    private String callerReference;
    /**
     * <p>
     * An optional comment for the field-level encryption profile.
     * </p>
     */
    private String comment;
    /**
     * <p>
     * A complex data type of encryption entities for the field-level encryption profile that include the public key ID,
     * provider, and field patterns for specifying which fields to encrypt with this key.
     * </p>
     */
    private EncryptionEntities encryptionEntities;

    /**
     * <p>
     * Profile name for the field-level encryption profile.
     * </p>
     * 
     * @param name
     *        Profile name for the field-level encryption profile.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * Profile name for the field-level encryption profile.
     * </p>
     * 
     * @return Profile name for the field-level encryption profile.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * Profile name for the field-level encryption profile.
     * </p>
     * 
     * @param name
     *        Profile name for the field-level encryption profile.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FieldLevelEncryptionProfileConfig withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * A unique number that ensures that the request can't be replayed.
     * </p>
     * 
     * @param callerReference
     *        A unique number that ensures that the request can't be replayed.
     */

    public void setCallerReference(String callerReference) {
        this.callerReference = callerReference;
    }

    /**
     * <p>
     * A unique number that ensures that the request can't be replayed.
     * </p>
     * 
     * @return A unique number that ensures that the request can't be replayed.
     */

    public String getCallerReference() {
        return this.callerReference;
    }

    /**
     * <p>
     * A unique number that ensures that the request can't be replayed.
     * </p>
     * 
     * @param callerReference
     *        A unique number that ensures that the request can't be replayed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FieldLevelEncryptionProfileConfig withCallerReference(String callerReference) {
        setCallerReference(callerReference);
        return this;
    }

    /**
     * <p>
     * An optional comment for the field-level encryption profile.
     * </p>
     * 
     * @param comment
     *        An optional comment for the field-level encryption profile.
     */

    public void setComment(String comment) {
        this.comment = comment;
    }

    /**
     * <p>
     * An optional comment for the field-level encryption profile.
     * </p>
     * 
     * @return An optional comment for the field-level encryption profile.
     */

    public String getComment() {
        return this.comment;
    }

    /**
     * <p>
     * An optional comment for the field-level encryption profile.
     * </p>
     * 
     * @param comment
     *        An optional comment for the field-level encryption profile.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FieldLevelEncryptionProfileConfig withComment(String comment) {
        setComment(comment);
        return this;
    }

    /**
     * <p>
     * A complex data type of encryption entities for the field-level encryption profile that include the public key ID,
     * provider, and field patterns for specifying which fields to encrypt with this key.
     * </p>
     * 
     * @param encryptionEntities
     *        A complex data type of encryption entities for the field-level encryption profile that include the public
     *        key ID, provider, and field patterns for specifying which fields to encrypt with this key.
     */

    public void setEncryptionEntities(EncryptionEntities encryptionEntities) {
        this.encryptionEntities = encryptionEntities;
    }

    /**
     * <p>
     * A complex data type of encryption entities for the field-level encryption profile that include the public key ID,
     * provider, and field patterns for specifying which fields to encrypt with this key.
     * </p>
     * 
     * @return A complex data type of encryption entities for the field-level encryption profile that include the public
     *         key ID, provider, and field patterns for specifying which fields to encrypt with this key.
     */

    public EncryptionEntities getEncryptionEntities() {
        return this.encryptionEntities;
    }

    /**
     * <p>
     * A complex data type of encryption entities for the field-level encryption profile that include the public key ID,
     * provider, and field patterns for specifying which fields to encrypt with this key.
     * </p>
     * 
     * @param encryptionEntities
     *        A complex data type of encryption entities for the field-level encryption profile that include the public
     *        key ID, provider, and field patterns for specifying which fields to encrypt with this key.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FieldLevelEncryptionProfileConfig withEncryptionEntities(EncryptionEntities encryptionEntities) {
        setEncryptionEntities(encryptionEntities);
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
        if (getCallerReference() != null)
            sb.append("CallerReference: ").append(getCallerReference()).append(",");
        if (getComment() != null)
            sb.append("Comment: ").append(getComment()).append(",");
        if (getEncryptionEntities() != null)
            sb.append("EncryptionEntities: ").append(getEncryptionEntities());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof FieldLevelEncryptionProfileConfig == false)
            return false;
        FieldLevelEncryptionProfileConfig other = (FieldLevelEncryptionProfileConfig) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getCallerReference() == null ^ this.getCallerReference() == null)
            return false;
        if (other.getCallerReference() != null && other.getCallerReference().equals(this.getCallerReference()) == false)
            return false;
        if (other.getComment() == null ^ this.getComment() == null)
            return false;
        if (other.getComment() != null && other.getComment().equals(this.getComment()) == false)
            return false;
        if (other.getEncryptionEntities() == null ^ this.getEncryptionEntities() == null)
            return false;
        if (other.getEncryptionEntities() != null && other.getEncryptionEntities().equals(this.getEncryptionEntities()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getCallerReference() == null) ? 0 : getCallerReference().hashCode());
        hashCode = prime * hashCode + ((getComment() == null) ? 0 : getComment().hashCode());
        hashCode = prime * hashCode + ((getEncryptionEntities() == null) ? 0 : getEncryptionEntities().hashCode());
        return hashCode;
    }

    @Override
    public FieldLevelEncryptionProfileConfig clone() {
        try {
            return (FieldLevelEncryptionProfileConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
