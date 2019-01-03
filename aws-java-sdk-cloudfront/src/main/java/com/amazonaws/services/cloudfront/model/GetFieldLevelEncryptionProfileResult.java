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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2018-11-05/GetFieldLevelEncryptionProfile"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetFieldLevelEncryptionProfileResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * Return the field-level encryption profile information.
     * </p>
     */
    private FieldLevelEncryptionProfile fieldLevelEncryptionProfile;
    /**
     * <p>
     * The current version of the field level encryption profile. For example: <code>E2QWRUHAPOMQZL</code>.
     * </p>
     */
    private String eTag;

    /**
     * <p>
     * Return the field-level encryption profile information.
     * </p>
     * 
     * @param fieldLevelEncryptionProfile
     *        Return the field-level encryption profile information.
     */

    public void setFieldLevelEncryptionProfile(FieldLevelEncryptionProfile fieldLevelEncryptionProfile) {
        this.fieldLevelEncryptionProfile = fieldLevelEncryptionProfile;
    }

    /**
     * <p>
     * Return the field-level encryption profile information.
     * </p>
     * 
     * @return Return the field-level encryption profile information.
     */

    public FieldLevelEncryptionProfile getFieldLevelEncryptionProfile() {
        return this.fieldLevelEncryptionProfile;
    }

    /**
     * <p>
     * Return the field-level encryption profile information.
     * </p>
     * 
     * @param fieldLevelEncryptionProfile
     *        Return the field-level encryption profile information.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetFieldLevelEncryptionProfileResult withFieldLevelEncryptionProfile(FieldLevelEncryptionProfile fieldLevelEncryptionProfile) {
        setFieldLevelEncryptionProfile(fieldLevelEncryptionProfile);
        return this;
    }

    /**
     * <p>
     * The current version of the field level encryption profile. For example: <code>E2QWRUHAPOMQZL</code>.
     * </p>
     * 
     * @param eTag
     *        The current version of the field level encryption profile. For example: <code>E2QWRUHAPOMQZL</code>.
     */

    public void setETag(String eTag) {
        this.eTag = eTag;
    }

    /**
     * <p>
     * The current version of the field level encryption profile. For example: <code>E2QWRUHAPOMQZL</code>.
     * </p>
     * 
     * @return The current version of the field level encryption profile. For example: <code>E2QWRUHAPOMQZL</code>.
     */

    public String getETag() {
        return this.eTag;
    }

    /**
     * <p>
     * The current version of the field level encryption profile. For example: <code>E2QWRUHAPOMQZL</code>.
     * </p>
     * 
     * @param eTag
     *        The current version of the field level encryption profile. For example: <code>E2QWRUHAPOMQZL</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetFieldLevelEncryptionProfileResult withETag(String eTag) {
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
        if (getFieldLevelEncryptionProfile() != null)
            sb.append("FieldLevelEncryptionProfile: ").append(getFieldLevelEncryptionProfile()).append(",");
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

        if (obj instanceof GetFieldLevelEncryptionProfileResult == false)
            return false;
        GetFieldLevelEncryptionProfileResult other = (GetFieldLevelEncryptionProfileResult) obj;
        if (other.getFieldLevelEncryptionProfile() == null ^ this.getFieldLevelEncryptionProfile() == null)
            return false;
        if (other.getFieldLevelEncryptionProfile() != null && other.getFieldLevelEncryptionProfile().equals(this.getFieldLevelEncryptionProfile()) == false)
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

        hashCode = prime * hashCode + ((getFieldLevelEncryptionProfile() == null) ? 0 : getFieldLevelEncryptionProfile().hashCode());
        hashCode = prime * hashCode + ((getETag() == null) ? 0 : getETag().hashCode());
        return hashCode;
    }

    @Override
    public GetFieldLevelEncryptionProfileResult clone() {
        try {
            return (GetFieldLevelEncryptionProfileResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
