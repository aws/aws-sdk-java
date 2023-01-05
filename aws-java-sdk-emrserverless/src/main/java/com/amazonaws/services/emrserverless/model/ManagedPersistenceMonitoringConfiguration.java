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
package com.amazonaws.services.emrserverless.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The managed log persistence configuration for a job run.
 * </p>
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/emr-serverless-2021-07-13/ManagedPersistenceMonitoringConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ManagedPersistenceMonitoringConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Enables managed logging and defaults to true. If set to false, managed logging will be turned off.
     * </p>
     */
    private Boolean enabled;
    /**
     * <p>
     * The KMS key ARN to encrypt the logs stored in managed log persistence.
     * </p>
     */
    private String encryptionKeyArn;

    /**
     * <p>
     * Enables managed logging and defaults to true. If set to false, managed logging will be turned off.
     * </p>
     * 
     * @param enabled
     *        Enables managed logging and defaults to true. If set to false, managed logging will be turned off.
     */

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    /**
     * <p>
     * Enables managed logging and defaults to true. If set to false, managed logging will be turned off.
     * </p>
     * 
     * @return Enables managed logging and defaults to true. If set to false, managed logging will be turned off.
     */

    public Boolean getEnabled() {
        return this.enabled;
    }

    /**
     * <p>
     * Enables managed logging and defaults to true. If set to false, managed logging will be turned off.
     * </p>
     * 
     * @param enabled
     *        Enables managed logging and defaults to true. If set to false, managed logging will be turned off.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ManagedPersistenceMonitoringConfiguration withEnabled(Boolean enabled) {
        setEnabled(enabled);
        return this;
    }

    /**
     * <p>
     * Enables managed logging and defaults to true. If set to false, managed logging will be turned off.
     * </p>
     * 
     * @return Enables managed logging and defaults to true. If set to false, managed logging will be turned off.
     */

    public Boolean isEnabled() {
        return this.enabled;
    }

    /**
     * <p>
     * The KMS key ARN to encrypt the logs stored in managed log persistence.
     * </p>
     * 
     * @param encryptionKeyArn
     *        The KMS key ARN to encrypt the logs stored in managed log persistence.
     */

    public void setEncryptionKeyArn(String encryptionKeyArn) {
        this.encryptionKeyArn = encryptionKeyArn;
    }

    /**
     * <p>
     * The KMS key ARN to encrypt the logs stored in managed log persistence.
     * </p>
     * 
     * @return The KMS key ARN to encrypt the logs stored in managed log persistence.
     */

    public String getEncryptionKeyArn() {
        return this.encryptionKeyArn;
    }

    /**
     * <p>
     * The KMS key ARN to encrypt the logs stored in managed log persistence.
     * </p>
     * 
     * @param encryptionKeyArn
     *        The KMS key ARN to encrypt the logs stored in managed log persistence.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ManagedPersistenceMonitoringConfiguration withEncryptionKeyArn(String encryptionKeyArn) {
        setEncryptionKeyArn(encryptionKeyArn);
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
        if (getEnabled() != null)
            sb.append("Enabled: ").append(getEnabled()).append(",");
        if (getEncryptionKeyArn() != null)
            sb.append("EncryptionKeyArn: ").append(getEncryptionKeyArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ManagedPersistenceMonitoringConfiguration == false)
            return false;
        ManagedPersistenceMonitoringConfiguration other = (ManagedPersistenceMonitoringConfiguration) obj;
        if (other.getEnabled() == null ^ this.getEnabled() == null)
            return false;
        if (other.getEnabled() != null && other.getEnabled().equals(this.getEnabled()) == false)
            return false;
        if (other.getEncryptionKeyArn() == null ^ this.getEncryptionKeyArn() == null)
            return false;
        if (other.getEncryptionKeyArn() != null && other.getEncryptionKeyArn().equals(this.getEncryptionKeyArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEnabled() == null) ? 0 : getEnabled().hashCode());
        hashCode = prime * hashCode + ((getEncryptionKeyArn() == null) ? 0 : getEncryptionKeyArn().hashCode());
        return hashCode;
    }

    @Override
    public ManagedPersistenceMonitoringConfiguration clone() {
        try {
            return (ManagedPersistenceMonitoringConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.emrserverless.model.transform.ManagedPersistenceMonitoringConfigurationMarshaller.getInstance().marshall(this,
                protocolMarshaller);
    }
}
