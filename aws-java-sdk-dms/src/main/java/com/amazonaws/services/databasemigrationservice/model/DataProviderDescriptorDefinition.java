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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dms-2016-01-01/DataProviderDescriptorDefinition"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DataProviderDescriptorDefinition implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name or Amazon Resource Name (ARN) of the data provider.
     * </p>
     */
    private String dataProviderIdentifier;
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
     * The name or Amazon Resource Name (ARN) of the data provider.
     * </p>
     * 
     * @param dataProviderIdentifier
     *        The name or Amazon Resource Name (ARN) of the data provider.
     */

    public void setDataProviderIdentifier(String dataProviderIdentifier) {
        this.dataProviderIdentifier = dataProviderIdentifier;
    }

    /**
     * <p>
     * The name or Amazon Resource Name (ARN) of the data provider.
     * </p>
     * 
     * @return The name or Amazon Resource Name (ARN) of the data provider.
     */

    public String getDataProviderIdentifier() {
        return this.dataProviderIdentifier;
    }

    /**
     * <p>
     * The name or Amazon Resource Name (ARN) of the data provider.
     * </p>
     * 
     * @param dataProviderIdentifier
     *        The name or Amazon Resource Name (ARN) of the data provider.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataProviderDescriptorDefinition withDataProviderIdentifier(String dataProviderIdentifier) {
        setDataProviderIdentifier(dataProviderIdentifier);
        return this;
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

    public DataProviderDescriptorDefinition withSecretsManagerSecretId(String secretsManagerSecretId) {
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

    public DataProviderDescriptorDefinition withSecretsManagerAccessRoleArn(String secretsManagerAccessRoleArn) {
        setSecretsManagerAccessRoleArn(secretsManagerAccessRoleArn);
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
        if (getDataProviderIdentifier() != null)
            sb.append("DataProviderIdentifier: ").append(getDataProviderIdentifier()).append(",");
        if (getSecretsManagerSecretId() != null)
            sb.append("SecretsManagerSecretId: ").append(getSecretsManagerSecretId()).append(",");
        if (getSecretsManagerAccessRoleArn() != null)
            sb.append("SecretsManagerAccessRoleArn: ").append(getSecretsManagerAccessRoleArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DataProviderDescriptorDefinition == false)
            return false;
        DataProviderDescriptorDefinition other = (DataProviderDescriptorDefinition) obj;
        if (other.getDataProviderIdentifier() == null ^ this.getDataProviderIdentifier() == null)
            return false;
        if (other.getDataProviderIdentifier() != null && other.getDataProviderIdentifier().equals(this.getDataProviderIdentifier()) == false)
            return false;
        if (other.getSecretsManagerSecretId() == null ^ this.getSecretsManagerSecretId() == null)
            return false;
        if (other.getSecretsManagerSecretId() != null && other.getSecretsManagerSecretId().equals(this.getSecretsManagerSecretId()) == false)
            return false;
        if (other.getSecretsManagerAccessRoleArn() == null ^ this.getSecretsManagerAccessRoleArn() == null)
            return false;
        if (other.getSecretsManagerAccessRoleArn() != null && other.getSecretsManagerAccessRoleArn().equals(this.getSecretsManagerAccessRoleArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDataProviderIdentifier() == null) ? 0 : getDataProviderIdentifier().hashCode());
        hashCode = prime * hashCode + ((getSecretsManagerSecretId() == null) ? 0 : getSecretsManagerSecretId().hashCode());
        hashCode = prime * hashCode + ((getSecretsManagerAccessRoleArn() == null) ? 0 : getSecretsManagerAccessRoleArn().hashCode());
        return hashCode;
    }

    @Override
    public DataProviderDescriptorDefinition clone() {
        try {
            return (DataProviderDescriptorDefinition) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.databasemigrationservice.model.transform.DataProviderDescriptorDefinitionMarshaller.getInstance().marshall(this,
                protocolMarshaller);
    }
}
