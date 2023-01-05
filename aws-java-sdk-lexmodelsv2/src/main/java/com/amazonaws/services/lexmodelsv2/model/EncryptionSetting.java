/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.lexmodelsv2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The object representing the passwords that were used to encrypt the data related to the bot recommendation, as well
 * as the KMS key ARN used to encrypt the associated metadata.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/EncryptionSetting" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EncryptionSetting implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The KMS key ARN used to encrypt the metadata associated with the bot recommendation.
     * </p>
     */
    private String kmsKeyArn;
    /**
     * <p>
     * The password used to encrypt the recommended bot recommendation file.
     * </p>
     */
    private String botLocaleExportPassword;
    /**
     * <p>
     * The password used to encrypt the associated transcript file.
     * </p>
     */
    private String associatedTranscriptsPassword;

    /**
     * <p>
     * The KMS key ARN used to encrypt the metadata associated with the bot recommendation.
     * </p>
     * 
     * @param kmsKeyArn
     *        The KMS key ARN used to encrypt the metadata associated with the bot recommendation.
     */

    public void setKmsKeyArn(String kmsKeyArn) {
        this.kmsKeyArn = kmsKeyArn;
    }

    /**
     * <p>
     * The KMS key ARN used to encrypt the metadata associated with the bot recommendation.
     * </p>
     * 
     * @return The KMS key ARN used to encrypt the metadata associated with the bot recommendation.
     */

    public String getKmsKeyArn() {
        return this.kmsKeyArn;
    }

    /**
     * <p>
     * The KMS key ARN used to encrypt the metadata associated with the bot recommendation.
     * </p>
     * 
     * @param kmsKeyArn
     *        The KMS key ARN used to encrypt the metadata associated with the bot recommendation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EncryptionSetting withKmsKeyArn(String kmsKeyArn) {
        setKmsKeyArn(kmsKeyArn);
        return this;
    }

    /**
     * <p>
     * The password used to encrypt the recommended bot recommendation file.
     * </p>
     * 
     * @param botLocaleExportPassword
     *        The password used to encrypt the recommended bot recommendation file.
     */

    public void setBotLocaleExportPassword(String botLocaleExportPassword) {
        this.botLocaleExportPassword = botLocaleExportPassword;
    }

    /**
     * <p>
     * The password used to encrypt the recommended bot recommendation file.
     * </p>
     * 
     * @return The password used to encrypt the recommended bot recommendation file.
     */

    public String getBotLocaleExportPassword() {
        return this.botLocaleExportPassword;
    }

    /**
     * <p>
     * The password used to encrypt the recommended bot recommendation file.
     * </p>
     * 
     * @param botLocaleExportPassword
     *        The password used to encrypt the recommended bot recommendation file.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EncryptionSetting withBotLocaleExportPassword(String botLocaleExportPassword) {
        setBotLocaleExportPassword(botLocaleExportPassword);
        return this;
    }

    /**
     * <p>
     * The password used to encrypt the associated transcript file.
     * </p>
     * 
     * @param associatedTranscriptsPassword
     *        The password used to encrypt the associated transcript file.
     */

    public void setAssociatedTranscriptsPassword(String associatedTranscriptsPassword) {
        this.associatedTranscriptsPassword = associatedTranscriptsPassword;
    }

    /**
     * <p>
     * The password used to encrypt the associated transcript file.
     * </p>
     * 
     * @return The password used to encrypt the associated transcript file.
     */

    public String getAssociatedTranscriptsPassword() {
        return this.associatedTranscriptsPassword;
    }

    /**
     * <p>
     * The password used to encrypt the associated transcript file.
     * </p>
     * 
     * @param associatedTranscriptsPassword
     *        The password used to encrypt the associated transcript file.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EncryptionSetting withAssociatedTranscriptsPassword(String associatedTranscriptsPassword) {
        setAssociatedTranscriptsPassword(associatedTranscriptsPassword);
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
        if (getKmsKeyArn() != null)
            sb.append("KmsKeyArn: ").append(getKmsKeyArn()).append(",");
        if (getBotLocaleExportPassword() != null)
            sb.append("BotLocaleExportPassword: ").append("***Sensitive Data Redacted***").append(",");
        if (getAssociatedTranscriptsPassword() != null)
            sb.append("AssociatedTranscriptsPassword: ").append("***Sensitive Data Redacted***");
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EncryptionSetting == false)
            return false;
        EncryptionSetting other = (EncryptionSetting) obj;
        if (other.getKmsKeyArn() == null ^ this.getKmsKeyArn() == null)
            return false;
        if (other.getKmsKeyArn() != null && other.getKmsKeyArn().equals(this.getKmsKeyArn()) == false)
            return false;
        if (other.getBotLocaleExportPassword() == null ^ this.getBotLocaleExportPassword() == null)
            return false;
        if (other.getBotLocaleExportPassword() != null && other.getBotLocaleExportPassword().equals(this.getBotLocaleExportPassword()) == false)
            return false;
        if (other.getAssociatedTranscriptsPassword() == null ^ this.getAssociatedTranscriptsPassword() == null)
            return false;
        if (other.getAssociatedTranscriptsPassword() != null
                && other.getAssociatedTranscriptsPassword().equals(this.getAssociatedTranscriptsPassword()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getKmsKeyArn() == null) ? 0 : getKmsKeyArn().hashCode());
        hashCode = prime * hashCode + ((getBotLocaleExportPassword() == null) ? 0 : getBotLocaleExportPassword().hashCode());
        hashCode = prime * hashCode + ((getAssociatedTranscriptsPassword() == null) ? 0 : getAssociatedTranscriptsPassword().hashCode());
        return hashCode;
    }

    @Override
    public EncryptionSetting clone() {
        try {
            return (EncryptionSetting) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lexmodelsv2.model.transform.EncryptionSettingMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
