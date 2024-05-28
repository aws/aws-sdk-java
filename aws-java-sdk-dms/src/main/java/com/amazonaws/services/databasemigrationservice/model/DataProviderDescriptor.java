/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.databasemigrationservice.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about a data provider.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dms-2016-01-01/DataProviderDescriptor" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DataProviderDescriptor implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The identifier of the Amazon Web Services Secrets Manager Secret used to store access credentials for the data
     * provider.
     * </p>
     */
    private String secretsManagerSecretId;
    /**
     * <p>
     * The ARN of the role used to access Amazon Web Services Secrets Manager.
     * </p>
     */
    private String secretsManagerAccessRoleArn;
    /**
     * <p>
     * The user-friendly name of the data provider.
     * </p>
     */
    private String dataProviderName;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the data provider.
     * </p>
     */
    private String dataProviderArn;

    /**
     * <p>
     * The identifier of the Amazon Web Services Secrets Manager Secret used to store access credentials for the data
     * provider.
     * </p>
     * 
     * @param secretsManagerSecretId
     *        The identifier of the Amazon Web Services Secrets Manager Secret used to store access credentials for the
     *        data provider.
     */

    public void setSecretsManagerSecretId(String secretsManagerSecretId) {
        this.secretsManagerSecretId = secretsManagerSecretId;
    }

    /**
     * <p>
     * The identifier of the Amazon Web Services Secrets Manager Secret used to store access credentials for the data
     * provider.
     * </p>
     * 
     * @return The identifier of the Amazon Web Services Secrets Manager Secret used to store access credentials for the
     *         data provider.
     */

    public String getSecretsManagerSecretId() {
        return this.secretsManagerSecretId;
    }

    /**
     * <p>
     * The identifier of the Amazon Web Services Secrets Manager Secret used to store access credentials for the data
     * provider.
     * </p>
     * 
     * @param secretsManagerSecretId
     *        The identifier of the Amazon Web Services Secrets Manager Secret used to store access credentials for the
     *        data provider.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataProviderDescriptor withSecretsManagerSecretId(String secretsManagerSecretId) {
        setSecretsManagerSecretId(secretsManagerSecretId);
        return this;
    }

    /**
     * <p>
     * The ARN of the role used to access Amazon Web Services Secrets Manager.
     * </p>
     * 
     * @param secretsManagerAccessRoleArn
     *        The ARN of the role used to access Amazon Web Services Secrets Manager.
     */

    public void setSecretsManagerAccessRoleArn(String secretsManagerAccessRoleArn) {
        this.secretsManagerAccessRoleArn = secretsManagerAccessRoleArn;
    }

    /**
     * <p>
     * The ARN of the role used to access Amazon Web Services Secrets Manager.
     * </p>
     * 
     * @return The ARN of the role used to access Amazon Web Services Secrets Manager.
     */

    public String getSecretsManagerAccessRoleArn() {
        return this.secretsManagerAccessRoleArn;
    }

    /**
     * <p>
     * The ARN of the role used to access Amazon Web Services Secrets Manager.
     * </p>
     * 
     * @param secretsManagerAccessRoleArn
     *        The ARN of the role used to access Amazon Web Services Secrets Manager.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataProviderDescriptor withSecretsManagerAccessRoleArn(String secretsManagerAccessRoleArn) {
        setSecretsManagerAccessRoleArn(secretsManagerAccessRoleArn);
        return this;
    }

    /**
     * <p>
     * The user-friendly name of the data provider.
     * </p>
     * 
     * @param dataProviderName
     *        The user-friendly name of the data provider.
     */

    public void setDataProviderName(String dataProviderName) {
        this.dataProviderName = dataProviderName;
    }

    /**
     * <p>
     * The user-friendly name of the data provider.
     * </p>
     * 
     * @return The user-friendly name of the data provider.
     */

    public String getDataProviderName() {
        return this.dataProviderName;
    }

    /**
     * <p>
     * The user-friendly name of the data provider.
     * </p>
     * 
     * @param dataProviderName
     *        The user-friendly name of the data provider.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataProviderDescriptor withDataProviderName(String dataProviderName) {
        setDataProviderName(dataProviderName);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the data provider.
     * </p>
     * 
     * @param dataProviderArn
     *        The Amazon Resource Name (ARN) of the data provider.
     */

    public void setDataProviderArn(String dataProviderArn) {
        this.dataProviderArn = dataProviderArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the data provider.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the data provider.
     */

    public String getDataProviderArn() {
        return this.dataProviderArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the data provider.
     * </p>
     * 
     * @param dataProviderArn
     *        The Amazon Resource Name (ARN) of the data provider.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataProviderDescriptor withDataProviderArn(String dataProviderArn) {
        setDataProviderArn(dataProviderArn);
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
        if (getSecretsManagerSecretId() != null)
            sb.append("SecretsManagerSecretId: ").append(getSecretsManagerSecretId()).append(",");
        if (getSecretsManagerAccessRoleArn() != null)
            sb.append("SecretsManagerAccessRoleArn: ").append(getSecretsManagerAccessRoleArn()).append(",");
        if (getDataProviderName() != null)
            sb.append("DataProviderName: ").append(getDataProviderName()).append(",");
        if (getDataProviderArn() != null)
            sb.append("DataProviderArn: ").append(getDataProviderArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DataProviderDescriptor == false)
            return false;
        DataProviderDescriptor other = (DataProviderDescriptor) obj;
        if (other.getSecretsManagerSecretId() == null ^ this.getSecretsManagerSecretId() == null)
            return false;
        if (other.getSecretsManagerSecretId() != null && other.getSecretsManagerSecretId().equals(this.getSecretsManagerSecretId()) == false)
            return false;
        if (other.getSecretsManagerAccessRoleArn() == null ^ this.getSecretsManagerAccessRoleArn() == null)
            return false;
        if (other.getSecretsManagerAccessRoleArn() != null && other.getSecretsManagerAccessRoleArn().equals(this.getSecretsManagerAccessRoleArn()) == false)
            return false;
        if (other.getDataProviderName() == null ^ this.getDataProviderName() == null)
            return false;
        if (other.getDataProviderName() != null && other.getDataProviderName().equals(this.getDataProviderName()) == false)
            return false;
        if (other.getDataProviderArn() == null ^ this.getDataProviderArn() == null)
            return false;
        if (other.getDataProviderArn() != null && other.getDataProviderArn().equals(this.getDataProviderArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSecretsManagerSecretId() == null) ? 0 : getSecretsManagerSecretId().hashCode());
        hashCode = prime * hashCode + ((getSecretsManagerAccessRoleArn() == null) ? 0 : getSecretsManagerAccessRoleArn().hashCode());
        hashCode = prime * hashCode + ((getDataProviderName() == null) ? 0 : getDataProviderName().hashCode());
        hashCode = prime * hashCode + ((getDataProviderArn() == null) ? 0 : getDataProviderArn().hashCode());
        return hashCode;
    }

    @Override
    public DataProviderDescriptor clone() {
        try {
            return (DataProviderDescriptor) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.databasemigrationservice.model.transform.DataProviderDescriptorMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
