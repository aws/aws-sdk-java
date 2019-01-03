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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2018-11-05/UpdateFieldLevelEncryptionConfig"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateFieldLevelEncryptionConfigResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * Return the results of updating the configuration.
     * </p>
     */
    private FieldLevelEncryption fieldLevelEncryption;
    /**
     * <p>
     * The value of the <code>ETag</code> header that you received when updating the configuration. For example:
     * <code>E2QWRUHAPOMQZL</code>.
     * </p>
     */
    private String eTag;

    /**
     * <p>
     * Return the results of updating the configuration.
     * </p>
     * 
     * @param fieldLevelEncryption
     *        Return the results of updating the configuration.
     */

    public void setFieldLevelEncryption(FieldLevelEncryption fieldLevelEncryption) {
        this.fieldLevelEncryption = fieldLevelEncryption;
    }

    /**
     * <p>
     * Return the results of updating the configuration.
     * </p>
     * 
     * @return Return the results of updating the configuration.
     */

    public FieldLevelEncryption getFieldLevelEncryption() {
        return this.fieldLevelEncryption;
    }

    /**
     * <p>
     * Return the results of updating the configuration.
     * </p>
     * 
     * @param fieldLevelEncryption
     *        Return the results of updating the configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateFieldLevelEncryptionConfigResult withFieldLevelEncryption(FieldLevelEncryption fieldLevelEncryption) {
        setFieldLevelEncryption(fieldLevelEncryption);
        return this;
    }

    /**
     * <p>
     * The value of the <code>ETag</code> header that you received when updating the configuration. For example:
     * <code>E2QWRUHAPOMQZL</code>.
     * </p>
     * 
     * @param eTag
     *        The value of the <code>ETag</code> header that you received when updating the configuration. For example:
     *        <code>E2QWRUHAPOMQZL</code>.
     */

    public void setETag(String eTag) {
        this.eTag = eTag;
    }

    /**
     * <p>
     * The value of the <code>ETag</code> header that you received when updating the configuration. For example:
     * <code>E2QWRUHAPOMQZL</code>.
     * </p>
     * 
     * @return The value of the <code>ETag</code> header that you received when updating the configuration. For example:
     *         <code>E2QWRUHAPOMQZL</code>.
     */

    public String getETag() {
        return this.eTag;
    }

    /**
     * <p>
     * The value of the <code>ETag</code> header that you received when updating the configuration. For example:
     * <code>E2QWRUHAPOMQZL</code>.
     * </p>
     * 
     * @param eTag
     *        The value of the <code>ETag</code> header that you received when updating the configuration. For example:
     *        <code>E2QWRUHAPOMQZL</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateFieldLevelEncryptionConfigResult withETag(String eTag) {
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

        if (obj instanceof UpdateFieldLevelEncryptionConfigResult == false)
            return false;
        UpdateFieldLevelEncryptionConfigResult other = (UpdateFieldLevelEncryptionConfigResult) obj;
        if (other.getFieldLevelEncryption() == null ^ this.getFieldLevelEncryption() == null)
            return false;
        if (other.getFieldLevelEncryption() != null && other.getFieldLevelEncryption().equals(this.getFieldLevelEncryption()) == false)
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
        hashCode = prime * hashCode + ((getETag() == null) ? 0 : getETag().hashCode());
        return hashCode;
    }

    @Override
    public UpdateFieldLevelEncryptionConfigResult clone() {
        try {
            return (UpdateFieldLevelEncryptionConfigResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
