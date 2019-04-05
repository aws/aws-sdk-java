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
 * The field-level encryption profile summary.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2018-11-05/FieldLevelEncryptionProfileSummary"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FieldLevelEncryptionProfileSummary implements Serializable, Cloneable {

    /**
     * <p>
     * ID for the field-level encryption profile summary.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The time when the the field-level encryption profile summary was last updated.
     * </p>
     */
    private java.util.Date lastModifiedTime;
    /**
     * <p>
     * Name for the field-level encryption profile summary.
     * </p>
     */
    private String name;
    /**
     * <p>
     * A complex data type of encryption entities for the field-level encryption profile that include the public key ID,
     * provider, and field patterns for specifying which fields to encrypt with this key.
     * </p>
     */
    private EncryptionEntities encryptionEntities;
    /**
     * <p>
     * An optional comment for the field-level encryption profile summary.
     * </p>
     */
    private String comment;

    /**
     * <p>
     * ID for the field-level encryption profile summary.
     * </p>
     * 
     * @param id
     *        ID for the field-level encryption profile summary.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * ID for the field-level encryption profile summary.
     * </p>
     * 
     * @return ID for the field-level encryption profile summary.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * ID for the field-level encryption profile summary.
     * </p>
     * 
     * @param id
     *        ID for the field-level encryption profile summary.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FieldLevelEncryptionProfileSummary withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The time when the the field-level encryption profile summary was last updated.
     * </p>
     * 
     * @param lastModifiedTime
     *        The time when the the field-level encryption profile summary was last updated.
     */

    public void setLastModifiedTime(java.util.Date lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
    }

    /**
     * <p>
     * The time when the the field-level encryption profile summary was last updated.
     * </p>
     * 
     * @return The time when the the field-level encryption profile summary was last updated.
     */

    public java.util.Date getLastModifiedTime() {
        return this.lastModifiedTime;
    }

    /**
     * <p>
     * The time when the the field-level encryption profile summary was last updated.
     * </p>
     * 
     * @param lastModifiedTime
     *        The time when the the field-level encryption profile summary was last updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FieldLevelEncryptionProfileSummary withLastModifiedTime(java.util.Date lastModifiedTime) {
        setLastModifiedTime(lastModifiedTime);
        return this;
    }

    /**
     * <p>
     * Name for the field-level encryption profile summary.
     * </p>
     * 
     * @param name
     *        Name for the field-level encryption profile summary.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * Name for the field-level encryption profile summary.
     * </p>
     * 
     * @return Name for the field-level encryption profile summary.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * Name for the field-level encryption profile summary.
     * </p>
     * 
     * @param name
     *        Name for the field-level encryption profile summary.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FieldLevelEncryptionProfileSummary withName(String name) {
        setName(name);
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

    public FieldLevelEncryptionProfileSummary withEncryptionEntities(EncryptionEntities encryptionEntities) {
        setEncryptionEntities(encryptionEntities);
        return this;
    }

    /**
     * <p>
     * An optional comment for the field-level encryption profile summary.
     * </p>
     * 
     * @param comment
     *        An optional comment for the field-level encryption profile summary.
     */

    public void setComment(String comment) {
        this.comment = comment;
    }

    /**
     * <p>
     * An optional comment for the field-level encryption profile summary.
     * </p>
     * 
     * @return An optional comment for the field-level encryption profile summary.
     */

    public String getComment() {
        return this.comment;
    }

    /**
     * <p>
     * An optional comment for the field-level encryption profile summary.
     * </p>
     * 
     * @param comment
     *        An optional comment for the field-level encryption profile summary.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FieldLevelEncryptionProfileSummary withComment(String comment) {
        setComment(comment);
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
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getLastModifiedTime() != null)
            sb.append("LastModifiedTime: ").append(getLastModifiedTime()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getEncryptionEntities() != null)
            sb.append("EncryptionEntities: ").append(getEncryptionEntities()).append(",");
        if (getComment() != null)
            sb.append("Comment: ").append(getComment());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof FieldLevelEncryptionProfileSummary == false)
            return false;
        FieldLevelEncryptionProfileSummary other = (FieldLevelEncryptionProfileSummary) obj;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getLastModifiedTime() == null ^ this.getLastModifiedTime() == null)
            return false;
        if (other.getLastModifiedTime() != null && other.getLastModifiedTime().equals(this.getLastModifiedTime()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getEncryptionEntities() == null ^ this.getEncryptionEntities() == null)
            return false;
        if (other.getEncryptionEntities() != null && other.getEncryptionEntities().equals(this.getEncryptionEntities()) == false)
            return false;
        if (other.getComment() == null ^ this.getComment() == null)
            return false;
        if (other.getComment() != null && other.getComment().equals(this.getComment()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getLastModifiedTime() == null) ? 0 : getLastModifiedTime().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getEncryptionEntities() == null) ? 0 : getEncryptionEntities().hashCode());
        hashCode = prime * hashCode + ((getComment() == null) ? 0 : getComment().hashCode());
        return hashCode;
    }

    @Override
    public FieldLevelEncryptionProfileSummary clone() {
        try {
            return (FieldLevelEncryptionProfileSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
