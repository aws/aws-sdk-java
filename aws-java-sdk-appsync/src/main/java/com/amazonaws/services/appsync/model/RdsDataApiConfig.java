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
package com.amazonaws.services.appsync.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains the metadata required to introspect the RDS cluster.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appsync-2017-07-25/RdsDataApiConfig" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RdsDataApiConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The resource ARN of the RDS cluster.
     * </p>
     */
    private String resourceArn;
    /**
     * <p>
     * The secret's ARN that was obtained from Secrets Manager. A secret consists of secret information, the secret
     * value, plus metadata about the secret. A secret value can be a string or binary. It typically includes the ARN,
     * secret name and description, policies, tags, encryption key from the Key Management Service, and key rotation
     * data.
     * </p>
     */
    private String secretArn;
    /**
     * <p>
     * The name of the database in the cluster.
     * </p>
     */
    private String databaseName;

    /**
     * <p>
     * The resource ARN of the RDS cluster.
     * </p>
     * 
     * @param resourceArn
     *        The resource ARN of the RDS cluster.
     */

    public void setResourceArn(String resourceArn) {
        this.resourceArn = resourceArn;
    }

    /**
     * <p>
     * The resource ARN of the RDS cluster.
     * </p>
     * 
     * @return The resource ARN of the RDS cluster.
     */

    public String getResourceArn() {
        return this.resourceArn;
    }

    /**
     * <p>
     * The resource ARN of the RDS cluster.
     * </p>
     * 
     * @param resourceArn
     *        The resource ARN of the RDS cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RdsDataApiConfig withResourceArn(String resourceArn) {
        setResourceArn(resourceArn);
        return this;
    }

    /**
     * <p>
     * The secret's ARN that was obtained from Secrets Manager. A secret consists of secret information, the secret
     * value, plus metadata about the secret. A secret value can be a string or binary. It typically includes the ARN,
     * secret name and description, policies, tags, encryption key from the Key Management Service, and key rotation
     * data.
     * </p>
     * 
     * @param secretArn
     *        The secret's ARN that was obtained from Secrets Manager. A secret consists of secret information, the
     *        secret value, plus metadata about the secret. A secret value can be a string or binary. It typically
     *        includes the ARN, secret name and description, policies, tags, encryption key from the Key Management
     *        Service, and key rotation data.
     */

    public void setSecretArn(String secretArn) {
        this.secretArn = secretArn;
    }

    /**
     * <p>
     * The secret's ARN that was obtained from Secrets Manager. A secret consists of secret information, the secret
     * value, plus metadata about the secret. A secret value can be a string or binary. It typically includes the ARN,
     * secret name and description, policies, tags, encryption key from the Key Management Service, and key rotation
     * data.
     * </p>
     * 
     * @return The secret's ARN that was obtained from Secrets Manager. A secret consists of secret information, the
     *         secret value, plus metadata about the secret. A secret value can be a string or binary. It typically
     *         includes the ARN, secret name and description, policies, tags, encryption key from the Key Management
     *         Service, and key rotation data.
     */

    public String getSecretArn() {
        return this.secretArn;
    }

    /**
     * <p>
     * The secret's ARN that was obtained from Secrets Manager. A secret consists of secret information, the secret
     * value, plus metadata about the secret. A secret value can be a string or binary. It typically includes the ARN,
     * secret name and description, policies, tags, encryption key from the Key Management Service, and key rotation
     * data.
     * </p>
     * 
     * @param secretArn
     *        The secret's ARN that was obtained from Secrets Manager. A secret consists of secret information, the
     *        secret value, plus metadata about the secret. A secret value can be a string or binary. It typically
     *        includes the ARN, secret name and description, policies, tags, encryption key from the Key Management
     *        Service, and key rotation data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RdsDataApiConfig withSecretArn(String secretArn) {
        setSecretArn(secretArn);
        return this;
    }

    /**
     * <p>
     * The name of the database in the cluster.
     * </p>
     * 
     * @param databaseName
     *        The name of the database in the cluster.
     */

    public void setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
    }

    /**
     * <p>
     * The name of the database in the cluster.
     * </p>
     * 
     * @return The name of the database in the cluster.
     */

    public String getDatabaseName() {
        return this.databaseName;
    }

    /**
     * <p>
     * The name of the database in the cluster.
     * </p>
     * 
     * @param databaseName
     *        The name of the database in the cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RdsDataApiConfig withDatabaseName(String databaseName) {
        setDatabaseName(databaseName);
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
        if (getResourceArn() != null)
            sb.append("ResourceArn: ").append(getResourceArn()).append(",");
        if (getSecretArn() != null)
            sb.append("SecretArn: ").append(getSecretArn()).append(",");
        if (getDatabaseName() != null)
            sb.append("DatabaseName: ").append(getDatabaseName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RdsDataApiConfig == false)
            return false;
        RdsDataApiConfig other = (RdsDataApiConfig) obj;
        if (other.getResourceArn() == null ^ this.getResourceArn() == null)
            return false;
        if (other.getResourceArn() != null && other.getResourceArn().equals(this.getResourceArn()) == false)
            return false;
        if (other.getSecretArn() == null ^ this.getSecretArn() == null)
            return false;
        if (other.getSecretArn() != null && other.getSecretArn().equals(this.getSecretArn()) == false)
            return false;
        if (other.getDatabaseName() == null ^ this.getDatabaseName() == null)
            return false;
        if (other.getDatabaseName() != null && other.getDatabaseName().equals(this.getDatabaseName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getResourceArn() == null) ? 0 : getResourceArn().hashCode());
        hashCode = prime * hashCode + ((getSecretArn() == null) ? 0 : getSecretArn().hashCode());
        hashCode = prime * hashCode + ((getDatabaseName() == null) ? 0 : getDatabaseName().hashCode());
        return hashCode;
    }

    @Override
    public RdsDataApiConfig clone() {
        try {
            return (RdsDataApiConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.appsync.model.transform.RdsDataApiConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
