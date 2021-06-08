/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.glue.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The encryption-at-rest settings of the transform that apply to accessing user data. Machine learning transforms can
 * access user data encrypted in Amazon S3 using KMS.
 * </p>
 * <p>
 * Additionally, imported labels and trained transforms can now be encrypted using a customer provided KMS key.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/TransformEncryption" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TransformEncryption implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * An <code>MLUserDataEncryption</code> object containing the encryption mode and customer-provided KMS key ID.
     * </p>
     */
    private MLUserDataEncryption mlUserDataEncryption;
    /**
     * <p>
     * The name of the security configuration.
     * </p>
     */
    private String taskRunSecurityConfigurationName;

    /**
     * <p>
     * An <code>MLUserDataEncryption</code> object containing the encryption mode and customer-provided KMS key ID.
     * </p>
     * 
     * @param mlUserDataEncryption
     *        An <code>MLUserDataEncryption</code> object containing the encryption mode and customer-provided KMS key
     *        ID.
     */

    public void setMlUserDataEncryption(MLUserDataEncryption mlUserDataEncryption) {
        this.mlUserDataEncryption = mlUserDataEncryption;
    }

    /**
     * <p>
     * An <code>MLUserDataEncryption</code> object containing the encryption mode and customer-provided KMS key ID.
     * </p>
     * 
     * @return An <code>MLUserDataEncryption</code> object containing the encryption mode and customer-provided KMS key
     *         ID.
     */

    public MLUserDataEncryption getMlUserDataEncryption() {
        return this.mlUserDataEncryption;
    }

    /**
     * <p>
     * An <code>MLUserDataEncryption</code> object containing the encryption mode and customer-provided KMS key ID.
     * </p>
     * 
     * @param mlUserDataEncryption
     *        An <code>MLUserDataEncryption</code> object containing the encryption mode and customer-provided KMS key
     *        ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TransformEncryption withMlUserDataEncryption(MLUserDataEncryption mlUserDataEncryption) {
        setMlUserDataEncryption(mlUserDataEncryption);
        return this;
    }

    /**
     * <p>
     * The name of the security configuration.
     * </p>
     * 
     * @param taskRunSecurityConfigurationName
     *        The name of the security configuration.
     */

    public void setTaskRunSecurityConfigurationName(String taskRunSecurityConfigurationName) {
        this.taskRunSecurityConfigurationName = taskRunSecurityConfigurationName;
    }

    /**
     * <p>
     * The name of the security configuration.
     * </p>
     * 
     * @return The name of the security configuration.
     */

    public String getTaskRunSecurityConfigurationName() {
        return this.taskRunSecurityConfigurationName;
    }

    /**
     * <p>
     * The name of the security configuration.
     * </p>
     * 
     * @param taskRunSecurityConfigurationName
     *        The name of the security configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TransformEncryption withTaskRunSecurityConfigurationName(String taskRunSecurityConfigurationName) {
        setTaskRunSecurityConfigurationName(taskRunSecurityConfigurationName);
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
        if (getMlUserDataEncryption() != null)
            sb.append("MlUserDataEncryption: ").append(getMlUserDataEncryption()).append(",");
        if (getTaskRunSecurityConfigurationName() != null)
            sb.append("TaskRunSecurityConfigurationName: ").append(getTaskRunSecurityConfigurationName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TransformEncryption == false)
            return false;
        TransformEncryption other = (TransformEncryption) obj;
        if (other.getMlUserDataEncryption() == null ^ this.getMlUserDataEncryption() == null)
            return false;
        if (other.getMlUserDataEncryption() != null && other.getMlUserDataEncryption().equals(this.getMlUserDataEncryption()) == false)
            return false;
        if (other.getTaskRunSecurityConfigurationName() == null ^ this.getTaskRunSecurityConfigurationName() == null)
            return false;
        if (other.getTaskRunSecurityConfigurationName() != null
                && other.getTaskRunSecurityConfigurationName().equals(this.getTaskRunSecurityConfigurationName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMlUserDataEncryption() == null) ? 0 : getMlUserDataEncryption().hashCode());
        hashCode = prime * hashCode + ((getTaskRunSecurityConfigurationName() == null) ? 0 : getTaskRunSecurityConfigurationName().hashCode());
        return hashCode;
    }

    @Override
    public TransformEncryption clone() {
        try {
            return (TransformEncryption) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.glue.model.transform.TransformEncryptionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
