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
package com.amazonaws.services.kinesisfirehose.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes the encryption for a destination in Amazon S3.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/firehose-2015-08-04/EncryptionConfiguration" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EncryptionConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Specifically override existing encryption information to ensure that no encryption is used.
     * </p>
     */
    private String noEncryptionConfig;
    /**
     * <p>
     * The encryption key.
     * </p>
     */
    private KMSEncryptionConfig kMSEncryptionConfig;

    /**
     * <p>
     * Specifically override existing encryption information to ensure that no encryption is used.
     * </p>
     * 
     * @param noEncryptionConfig
     *        Specifically override existing encryption information to ensure that no encryption is used.
     * @see NoEncryptionConfig
     */

    public void setNoEncryptionConfig(String noEncryptionConfig) {
        this.noEncryptionConfig = noEncryptionConfig;
    }

    /**
     * <p>
     * Specifically override existing encryption information to ensure that no encryption is used.
     * </p>
     * 
     * @return Specifically override existing encryption information to ensure that no encryption is used.
     * @see NoEncryptionConfig
     */

    public String getNoEncryptionConfig() {
        return this.noEncryptionConfig;
    }

    /**
     * <p>
     * Specifically override existing encryption information to ensure that no encryption is used.
     * </p>
     * 
     * @param noEncryptionConfig
     *        Specifically override existing encryption information to ensure that no encryption is used.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see NoEncryptionConfig
     */

    public EncryptionConfiguration withNoEncryptionConfig(String noEncryptionConfig) {
        setNoEncryptionConfig(noEncryptionConfig);
        return this;
    }

    /**
     * <p>
     * Specifically override existing encryption information to ensure that no encryption is used.
     * </p>
     * 
     * @param noEncryptionConfig
     *        Specifically override existing encryption information to ensure that no encryption is used.
     * @see NoEncryptionConfig
     */

    public void setNoEncryptionConfig(NoEncryptionConfig noEncryptionConfig) {
        withNoEncryptionConfig(noEncryptionConfig);
    }

    /**
     * <p>
     * Specifically override existing encryption information to ensure that no encryption is used.
     * </p>
     * 
     * @param noEncryptionConfig
     *        Specifically override existing encryption information to ensure that no encryption is used.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see NoEncryptionConfig
     */

    public EncryptionConfiguration withNoEncryptionConfig(NoEncryptionConfig noEncryptionConfig) {
        this.noEncryptionConfig = noEncryptionConfig.toString();
        return this;
    }

    /**
     * <p>
     * The encryption key.
     * </p>
     * 
     * @param kMSEncryptionConfig
     *        The encryption key.
     */

    public void setKMSEncryptionConfig(KMSEncryptionConfig kMSEncryptionConfig) {
        this.kMSEncryptionConfig = kMSEncryptionConfig;
    }

    /**
     * <p>
     * The encryption key.
     * </p>
     * 
     * @return The encryption key.
     */

    public KMSEncryptionConfig getKMSEncryptionConfig() {
        return this.kMSEncryptionConfig;
    }

    /**
     * <p>
     * The encryption key.
     * </p>
     * 
     * @param kMSEncryptionConfig
     *        The encryption key.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EncryptionConfiguration withKMSEncryptionConfig(KMSEncryptionConfig kMSEncryptionConfig) {
        setKMSEncryptionConfig(kMSEncryptionConfig);
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
        if (getNoEncryptionConfig() != null)
            sb.append("NoEncryptionConfig: ").append(getNoEncryptionConfig()).append(",");
        if (getKMSEncryptionConfig() != null)
            sb.append("KMSEncryptionConfig: ").append(getKMSEncryptionConfig());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EncryptionConfiguration == false)
            return false;
        EncryptionConfiguration other = (EncryptionConfiguration) obj;
        if (other.getNoEncryptionConfig() == null ^ this.getNoEncryptionConfig() == null)
            return false;
        if (other.getNoEncryptionConfig() != null && other.getNoEncryptionConfig().equals(this.getNoEncryptionConfig()) == false)
            return false;
        if (other.getKMSEncryptionConfig() == null ^ this.getKMSEncryptionConfig() == null)
            return false;
        if (other.getKMSEncryptionConfig() != null && other.getKMSEncryptionConfig().equals(this.getKMSEncryptionConfig()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNoEncryptionConfig() == null) ? 0 : getNoEncryptionConfig().hashCode());
        hashCode = prime * hashCode + ((getKMSEncryptionConfig() == null) ? 0 : getKMSEncryptionConfig().hashCode());
        return hashCode;
    }

    @Override
    public EncryptionConfiguration clone() {
        try {
            return (EncryptionConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.kinesisfirehose.model.transform.EncryptionConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
