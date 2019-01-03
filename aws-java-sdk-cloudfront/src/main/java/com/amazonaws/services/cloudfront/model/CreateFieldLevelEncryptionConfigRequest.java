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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2018-11-05/CreateFieldLevelEncryptionConfig"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateFieldLevelEncryptionConfigRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The request to create a new field-level encryption configuration.
     * </p>
     */
    private FieldLevelEncryptionConfig fieldLevelEncryptionConfig;

    /**
     * <p>
     * The request to create a new field-level encryption configuration.
     * </p>
     * 
     * @param fieldLevelEncryptionConfig
     *        The request to create a new field-level encryption configuration.
     */

    public void setFieldLevelEncryptionConfig(FieldLevelEncryptionConfig fieldLevelEncryptionConfig) {
        this.fieldLevelEncryptionConfig = fieldLevelEncryptionConfig;
    }

    /**
     * <p>
     * The request to create a new field-level encryption configuration.
     * </p>
     * 
     * @return The request to create a new field-level encryption configuration.
     */

    public FieldLevelEncryptionConfig getFieldLevelEncryptionConfig() {
        return this.fieldLevelEncryptionConfig;
    }

    /**
     * <p>
     * The request to create a new field-level encryption configuration.
     * </p>
     * 
     * @param fieldLevelEncryptionConfig
     *        The request to create a new field-level encryption configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFieldLevelEncryptionConfigRequest withFieldLevelEncryptionConfig(FieldLevelEncryptionConfig fieldLevelEncryptionConfig) {
        setFieldLevelEncryptionConfig(fieldLevelEncryptionConfig);
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
        if (getFieldLevelEncryptionConfig() != null)
            sb.append("FieldLevelEncryptionConfig: ").append(getFieldLevelEncryptionConfig());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateFieldLevelEncryptionConfigRequest == false)
            return false;
        CreateFieldLevelEncryptionConfigRequest other = (CreateFieldLevelEncryptionConfigRequest) obj;
        if (other.getFieldLevelEncryptionConfig() == null ^ this.getFieldLevelEncryptionConfig() == null)
            return false;
        if (other.getFieldLevelEncryptionConfig() != null && other.getFieldLevelEncryptionConfig().equals(this.getFieldLevelEncryptionConfig()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFieldLevelEncryptionConfig() == null) ? 0 : getFieldLevelEncryptionConfig().hashCode());
        return hashCode;
    }

    @Override
    public CreateFieldLevelEncryptionConfigRequest clone() {
        return (CreateFieldLevelEncryptionConfigRequest) super.clone();
    }

}
