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
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2018-11-05/CreateFieldLevelEncryptionConfig"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateFieldLevelEncryptionConfigResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * Returned when you create a new field-level encryption configuration.
     * </p>
     */
    private FieldLevelEncryption fieldLevelEncryption;
    /**
     * <p>
     * The fully qualified URI of the new configuration resource just created. For example:
     * <code>https://cloudfront.amazonaws.com/2010-11-01/field-level-encryption-config/EDFDVBD632BHDS5</code>.
     * </p>
     */
    private String location;
    /**
     * <p>
     * The current version of the field level encryption configuration. For example: <code>E2QWRUHAPOMQZL</code>.
     * </p>
     */
    private String eTag;

    /**
     * <p>
     * Returned when you create a new field-level encryption configuration.
     * </p>
     * 
     * @param fieldLevelEncryption
     *        Returned when you create a new field-level encryption configuration.
     */

    public void setFieldLevelEncryption(FieldLevelEncryption fieldLevelEncryption) {
        this.fieldLevelEncryption = fieldLevelEncryption;
    }

    /**
     * <p>
     * Returned when you create a new field-level encryption configuration.
     * </p>
     * 
     * @return Returned when you create a new field-level encryption configuration.
     */

    public FieldLevelEncryption getFieldLevelEncryption() {
        return this.fieldLevelEncryption;
    }

    /**
     * <p>
     * Returned when you create a new field-level encryption configuration.
     * </p>
     * 
     * @param fieldLevelEncryption
     *        Returned when you create a new field-level encryption configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFieldLevelEncryptionConfigResult withFieldLevelEncryption(FieldLevelEncryption fieldLevelEncryption) {
        setFieldLevelEncryption(fieldLevelEncryption);
        return this;
    }

    /**
     * <p>
     * The fully qualified URI of the new configuration resource just created. For example:
     * <code>https://cloudfront.amazonaws.com/2010-11-01/field-level-encryption-config/EDFDVBD632BHDS5</code>.
     * </p>
     * 
     * @param location
     *        The fully qualified URI of the new configuration resource just created. For example:
     *        <code>https://cloudfront.amazonaws.com/2010-11-01/field-level-encryption-config/EDFDVBD632BHDS5</code>.
     */

    public void setLocation(String location) {
        this.location = location;
    }

    /**
     * <p>
     * The fully qualified URI of the new configuration resource just created. For example:
     * <code>https://cloudfront.amazonaws.com/2010-11-01/field-level-encryption-config/EDFDVBD632BHDS5</code>.
     * </p>
     * 
     * @return The fully qualified URI of the new configuration resource just created. For example:
     *         <code>https://cloudfront.amazonaws.com/2010-11-01/field-level-encryption-config/EDFDVBD632BHDS5</code>.
     */

    public String getLocation() {
        return this.location;
    }

    /**
     * <p>
     * The fully qualified URI of the new configuration resource just created. For example:
     * <code>https://cloudfront.amazonaws.com/2010-11-01/field-level-encryption-config/EDFDVBD632BHDS5</code>.
     * </p>
     * 
     * @param location
     *        The fully qualified URI of the new configuration resource just created. For example:
     *        <code>https://cloudfront.amazonaws.com/2010-11-01/field-level-encryption-config/EDFDVBD632BHDS5</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFieldLevelEncryptionConfigResult withLocation(String location) {
        setLocation(location);
        return this;
    }

    /**
     * <p>
     * The current version of the field level encryption configuration. For example: <code>E2QWRUHAPOMQZL</code>.
     * </p>
     * 
     * @param eTag
     *        The current version of the field level encryption configuration. For example: <code>E2QWRUHAPOMQZL</code>.
     */

    public void setETag(String eTag) {
        this.eTag = eTag;
    }

    /**
     * <p>
     * The current version of the field level encryption configuration. For example: <code>E2QWRUHAPOMQZL</code>.
     * </p>
     * 
     * @return The current version of the field level encryption configuration. For example: <code>E2QWRUHAPOMQZL</code>
     *         .
     */

    public String getETag() {
        return this.eTag;
    }

    /**
     * <p>
     * The current version of the field level encryption configuration. For example: <code>E2QWRUHAPOMQZL</code>.
     * </p>
     * 
     * @param eTag
     *        The current version of the field level encryption configuration. For example: <code>E2QWRUHAPOMQZL</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFieldLevelEncryptionConfigResult withETag(String eTag) {
        setETag(eTag);
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
        if (getFieldLevelEncryption() != null)
            sb.append("FieldLevelEncryption: ").append(getFieldLevelEncryption()).append(",");
        if (getLocation() != null)
            sb.append("Location: ").append(getLocation()).append(",");
        if (getETag() != null)
            sb.append("ETag: ").append(getETag());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateFieldLevelEncryptionConfigResult == false)
            return false;
        CreateFieldLevelEncryptionConfigResult other = (CreateFieldLevelEncryptionConfigResult) obj;
        if (other.getFieldLevelEncryption() == null ^ this.getFieldLevelEncryption() == null)
            return false;
        if (other.getFieldLevelEncryption() != null && other.getFieldLevelEncryption().equals(this.getFieldLevelEncryption()) == false)
            return false;
        if (other.getLocation() == null ^ this.getLocation() == null)
            return false;
        if (other.getLocation() != null && other.getLocation().equals(this.getLocation()) == false)
            return false;
        if (other.getETag() == null ^ this.getETag() == null)
            return false;
        if (other.getETag() != null && other.getETag().equals(this.getETag()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFieldLevelEncryption() == null) ? 0 : getFieldLevelEncryption().hashCode());
        hashCode = prime * hashCode + ((getLocation() == null) ? 0 : getLocation().hashCode());
        hashCode = prime * hashCode + ((getETag() == null) ? 0 : getETag().hashCode());
        return hashCode;
    }

    @Override
    public CreateFieldLevelEncryptionConfigResult clone() {
        try {
            return (CreateFieldLevelEncryptionConfigResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
