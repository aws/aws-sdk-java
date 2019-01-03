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
 * A complex data type for field-level encryption profiles.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2018-11-05/FieldLevelEncryptionProfile"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FieldLevelEncryptionProfile implements Serializable, Cloneable {

    /**
     * <p>
     * The ID for a field-level encryption profile configuration which includes a set of profiles that specify certain
     * selected data fields to be encrypted by specific public keys.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The last time the field-level encryption profile was updated.
     * </p>
     */
    private java.util.Date lastModifiedTime;
    /**
     * <p>
     * A complex data type that includes the profile name and the encryption entities for the field-level encryption
     * profile.
     * </p>
     */
    private FieldLevelEncryptionProfileConfig fieldLevelEncryptionProfileConfig;

    /**
     * <p>
     * The ID for a field-level encryption profile configuration which includes a set of profiles that specify certain
     * selected data fields to be encrypted by specific public keys.
     * </p>
     * 
     * @param id
     *        The ID for a field-level encryption profile configuration which includes a set of profiles that specify
     *        certain selected data fields to be encrypted by specific public keys.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The ID for a field-level encryption profile configuration which includes a set of profiles that specify certain
     * selected data fields to be encrypted by specific public keys.
     * </p>
     * 
     * @return The ID for a field-level encryption profile configuration which includes a set of profiles that specify
     *         certain selected data fields to be encrypted by specific public keys.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The ID for a field-level encryption profile configuration which includes a set of profiles that specify certain
     * selected data fields to be encrypted by specific public keys.
     * </p>
     * 
     * @param id
     *        The ID for a field-level encryption profile configuration which includes a set of profiles that specify
     *        certain selected data fields to be encrypted by specific public keys.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FieldLevelEncryptionProfile withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The last time the field-level encryption profile was updated.
     * </p>
     * 
     * @param lastModifiedTime
     *        The last time the field-level encryption profile was updated.
     */

    public void setLastModifiedTime(java.util.Date lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
    }

    /**
     * <p>
     * The last time the field-level encryption profile was updated.
     * </p>
     * 
     * @return The last time the field-level encryption profile was updated.
     */

    public java.util.Date getLastModifiedTime() {
        return this.lastModifiedTime;
    }

    /**
     * <p>
     * The last time the field-level encryption profile was updated.
     * </p>
     * 
     * @param lastModifiedTime
     *        The last time the field-level encryption profile was updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FieldLevelEncryptionProfile withLastModifiedTime(java.util.Date lastModifiedTime) {
        setLastModifiedTime(lastModifiedTime);
        return this;
    }

    /**
     * <p>
     * A complex data type that includes the profile name and the encryption entities for the field-level encryption
     * profile.
     * </p>
     * 
     * @param fieldLevelEncryptionProfileConfig
     *        A complex data type that includes the profile name and the encryption entities for the field-level
     *        encryption profile.
     */

    public void setFieldLevelEncryptionProfileConfig(FieldLevelEncryptionProfileConfig fieldLevelEncryptionProfileConfig) {
        this.fieldLevelEncryptionProfileConfig = fieldLevelEncryptionProfileConfig;
    }

    /**
     * <p>
     * A complex data type that includes the profile name and the encryption entities for the field-level encryption
     * profile.
     * </p>
     * 
     * @return A complex data type that includes the profile name and the encryption entities for the field-level
     *         encryption profile.
     */

    public FieldLevelEncryptionProfileConfig getFieldLevelEncryptionProfileConfig() {
        return this.fieldLevelEncryptionProfileConfig;
    }

    /**
     * <p>
     * A complex data type that includes the profile name and the encryption entities for the field-level encryption
     * profile.
     * </p>
     * 
     * @param fieldLevelEncryptionProfileConfig
     *        A complex data type that includes the profile name and the encryption entities for the field-level
     *        encryption profile.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FieldLevelEncryptionProfile withFieldLevelEncryptionProfileConfig(FieldLevelEncryptionProfileConfig fieldLevelEncryptionProfileConfig) {
        setFieldLevelEncryptionProfileConfig(fieldLevelEncryptionProfileConfig);
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
        if (getFieldLevelEncryptionProfileConfig() != null)
            sb.append("FieldLevelEncryptionProfileConfig: ").append(getFieldLevelEncryptionProfileConfig());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof FieldLevelEncryptionProfile == false)
            return false;
        FieldLevelEncryptionProfile other = (FieldLevelEncryptionProfile) obj;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getLastModifiedTime() == null ^ this.getLastModifiedTime() == null)
            return false;
        if (other.getLastModifiedTime() != null && other.getLastModifiedTime().equals(this.getLastModifiedTime()) == false)
            return false;
        if (other.getFieldLevelEncryptionProfileConfig() == null ^ this.getFieldLevelEncryptionProfileConfig() == null)
            return false;
        if (other.getFieldLevelEncryptionProfileConfig() != null
                && other.getFieldLevelEncryptionProfileConfig().equals(this.getFieldLevelEncryptionProfileConfig()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getLastModifiedTime() == null) ? 0 : getLastModifiedTime().hashCode());
        hashCode = prime * hashCode + ((getFieldLevelEncryptionProfileConfig() == null) ? 0 : getFieldLevelEncryptionProfileConfig().hashCode());
        return hashCode;
    }

    @Override
    public FieldLevelEncryptionProfile clone() {
        try {
            return (FieldLevelEncryptionProfile) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
