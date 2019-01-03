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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2018-11-05/CreateFieldLevelEncryptionProfile"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateFieldLevelEncryptionProfileRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The request to create a field-level encryption profile.
     * </p>
     */
    private FieldLevelEncryptionProfileConfig fieldLevelEncryptionProfileConfig;

    /**
     * <p>
     * The request to create a field-level encryption profile.
     * </p>
     * 
     * @param fieldLevelEncryptionProfileConfig
     *        The request to create a field-level encryption profile.
     */

    public void setFieldLevelEncryptionProfileConfig(FieldLevelEncryptionProfileConfig fieldLevelEncryptionProfileConfig) {
        this.fieldLevelEncryptionProfileConfig = fieldLevelEncryptionProfileConfig;
    }

    /**
     * <p>
     * The request to create a field-level encryption profile.
     * </p>
     * 
     * @return The request to create a field-level encryption profile.
     */

    public FieldLevelEncryptionProfileConfig getFieldLevelEncryptionProfileConfig() {
        return this.fieldLevelEncryptionProfileConfig;
    }

    /**
     * <p>
     * The request to create a field-level encryption profile.
     * </p>
     * 
     * @param fieldLevelEncryptionProfileConfig
     *        The request to create a field-level encryption profile.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFieldLevelEncryptionProfileRequest withFieldLevelEncryptionProfileConfig(FieldLevelEncryptionProfileConfig fieldLevelEncryptionProfileConfig) {
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

        if (obj instanceof CreateFieldLevelEncryptionProfileRequest == false)
            return false;
        CreateFieldLevelEncryptionProfileRequest other = (CreateFieldLevelEncryptionProfileRequest) obj;
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

        hashCode = prime * hashCode + ((getFieldLevelEncryptionProfileConfig() == null) ? 0 : getFieldLevelEncryptionProfileConfig().hashCode());
        return hashCode;
    }

    @Override
    public CreateFieldLevelEncryptionProfileRequest clone() {
        return (CreateFieldLevelEncryptionProfileRequest) super.clone();
    }

}
