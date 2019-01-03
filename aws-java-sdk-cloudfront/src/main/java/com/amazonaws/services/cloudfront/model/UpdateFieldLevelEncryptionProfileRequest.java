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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2018-11-05/UpdateFieldLevelEncryptionProfile"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateFieldLevelEncryptionProfileRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Request to update a field-level encryption profile.
     * </p>
     */
    private FieldLevelEncryptionProfileConfig fieldLevelEncryptionProfileConfig;
    /**
     * <p>
     * The ID of the field-level encryption profile request.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The value of the <code>ETag</code> header that you received when retrieving the profile identity to update. For
     * example: <code>E2QWRUHAPOMQZL</code>.
     * </p>
     */
    private String ifMatch;

    /**
     * <p>
     * Request to update a field-level encryption profile.
     * </p>
     * 
     * @param fieldLevelEncryptionProfileConfig
     *        Request to update a field-level encryption profile.
     */

    public void setFieldLevelEncryptionProfileConfig(FieldLevelEncryptionProfileConfig fieldLevelEncryptionProfileConfig) {
        this.fieldLevelEncryptionProfileConfig = fieldLevelEncryptionProfileConfig;
    }

    /**
     * <p>
     * Request to update a field-level encryption profile.
     * </p>
     * 
     * @return Request to update a field-level encryption profile.
     */

    public FieldLevelEncryptionProfileConfig getFieldLevelEncryptionProfileConfig() {
        return this.fieldLevelEncryptionProfileConfig;
    }

    /**
     * <p>
     * Request to update a field-level encryption profile.
     * </p>
     * 
     * @param fieldLevelEncryptionProfileConfig
     *        Request to update a field-level encryption profile.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateFieldLevelEncryptionProfileRequest withFieldLevelEncryptionProfileConfig(FieldLevelEncryptionProfileConfig fieldLevelEncryptionProfileConfig) {
        setFieldLevelEncryptionProfileConfig(fieldLevelEncryptionProfileConfig);
        return this;
    }

    /**
     * <p>
     * The ID of the field-level encryption profile request.
     * </p>
     * 
     * @param id
     *        The ID of the field-level encryption profile request.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The ID of the field-level encryption profile request.
     * </p>
     * 
     * @return The ID of the field-level encryption profile request.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The ID of the field-level encryption profile request.
     * </p>
     * 
     * @param id
     *        The ID of the field-level encryption profile request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateFieldLevelEncryptionProfileRequest withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The value of the <code>ETag</code> header that you received when retrieving the profile identity to update. For
     * example: <code>E2QWRUHAPOMQZL</code>.
     * </p>
     * 
     * @param ifMatch
     *        The value of the <code>ETag</code> header that you received when retrieving the profile identity to
     *        update. For example: <code>E2QWRUHAPOMQZL</code>.
     */

    public void setIfMatch(String ifMatch) {
        this.ifMatch = ifMatch;
    }

    /**
     * <p>
     * The value of the <code>ETag</code> header that you received when retrieving the profile identity to update. For
     * example: <code>E2QWRUHAPOMQZL</code>.
     * </p>
     * 
     * @return The value of the <code>ETag</code> header that you received when retrieving the profile identity to
     *         update. For example: <code>E2QWRUHAPOMQZL</code>.
     */

    public String getIfMatch() {
        return this.ifMatch;
    }

    /**
     * <p>
     * The value of the <code>ETag</code> header that you received when retrieving the profile identity to update. For
     * example: <code>E2QWRUHAPOMQZL</code>.
     * </p>
     * 
     * @param ifMatch
     *        The value of the <code>ETag</code> header that you received when retrieving the profile identity to
     *        update. For example: <code>E2QWRUHAPOMQZL</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateFieldLevelEncryptionProfileRequest withIfMatch(String ifMatch) {
        setIfMatch(ifMatch);
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
        if (getFieldLevelEncryptionProfileConfig() != null)
            sb.append("FieldLevelEncryptionProfileConfig: ").append(getFieldLevelEncryptionProfileConfig()).append(",");
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getIfMatch() != null)
            sb.append("IfMatch: ").append(getIfMatch());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateFieldLevelEncryptionProfileRequest == false)
            return false;
        UpdateFieldLevelEncryptionProfileRequest other = (UpdateFieldLevelEncryptionProfileRequest) obj;
        if (other.getFieldLevelEncryptionProfileConfig() == null ^ this.getFieldLevelEncryptionProfileConfig() == null)
            return false;
        if (other.getFieldLevelEncryptionProfileConfig() != null
                && other.getFieldLevelEncryptionProfileConfig().equals(this.getFieldLevelEncryptionProfileConfig()) == false)
            return false;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getIfMatch() == null ^ this.getIfMatch() == null)
            return false;
        if (other.getIfMatch() != null && other.getIfMatch().equals(this.getIfMatch()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFieldLevelEncryptionProfileConfig() == null) ? 0 : getFieldLevelEncryptionProfileConfig().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getIfMatch() == null) ? 0 : getIfMatch().hashCode());
        return hashCode;
    }

    @Override
    public UpdateFieldLevelEncryptionProfileRequest clone() {
        return (UpdateFieldLevelEncryptionProfileRequest) super.clone();
    }

}
