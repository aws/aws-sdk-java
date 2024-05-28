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
package com.amazonaws.services.bedrockagent.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains details about the storage configuration of the knowledge base in Redis Enterprise Cloud. For more
 * information, see <a href="https://docs.aws.amazon.com/bedrock/latest/userguide/knowledge-base-setup-oss.html">Create
 * a vector index in Redis Enterprise Cloud</a>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/RedisEnterpriseCloudConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RedisEnterpriseCloudConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the secret that you created in Secrets Manager that is linked to your Redis
     * Enterprise Cloud database.
     * </p>
     */
    private String credentialsSecretArn;
    /**
     * <p>
     * The endpoint URL of the Redis Enterprise Cloud database.
     * </p>
     */
    private String endpoint;
    /**
     * <p>
     * Contains the names of the fields to which to map information about the vector store.
     * </p>
     */
    private RedisEnterpriseCloudFieldMapping fieldMapping;
    /**
     * <p>
     * The name of the vector index.
     * </p>
     */
    private String vectorIndexName;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the secret that you created in Secrets Manager that is linked to your Redis
     * Enterprise Cloud database.
     * </p>
     * 
     * @param credentialsSecretArn
     *        The Amazon Resource Name (ARN) of the secret that you created in Secrets Manager that is linked to your
     *        Redis Enterprise Cloud database.
     */

    public void setCredentialsSecretArn(String credentialsSecretArn) {
        this.credentialsSecretArn = credentialsSecretArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the secret that you created in Secrets Manager that is linked to your Redis
     * Enterprise Cloud database.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the secret that you created in Secrets Manager that is linked to your
     *         Redis Enterprise Cloud database.
     */

    public String getCredentialsSecretArn() {
        return this.credentialsSecretArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the secret that you created in Secrets Manager that is linked to your Redis
     * Enterprise Cloud database.
     * </p>
     * 
     * @param credentialsSecretArn
     *        The Amazon Resource Name (ARN) of the secret that you created in Secrets Manager that is linked to your
     *        Redis Enterprise Cloud database.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RedisEnterpriseCloudConfiguration withCredentialsSecretArn(String credentialsSecretArn) {
        setCredentialsSecretArn(credentialsSecretArn);
        return this;
    }

    /**
     * <p>
     * The endpoint URL of the Redis Enterprise Cloud database.
     * </p>
     * 
     * @param endpoint
     *        The endpoint URL of the Redis Enterprise Cloud database.
     */

    public void setEndpoint(String endpoint) {
        this.endpoint = endpoint;
    }

    /**
     * <p>
     * The endpoint URL of the Redis Enterprise Cloud database.
     * </p>
     * 
     * @return The endpoint URL of the Redis Enterprise Cloud database.
     */

    public String getEndpoint() {
        return this.endpoint;
    }

    /**
     * <p>
     * The endpoint URL of the Redis Enterprise Cloud database.
     * </p>
     * 
     * @param endpoint
     *        The endpoint URL of the Redis Enterprise Cloud database.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RedisEnterpriseCloudConfiguration withEndpoint(String endpoint) {
        setEndpoint(endpoint);
        return this;
    }

    /**
     * <p>
     * Contains the names of the fields to which to map information about the vector store.
     * </p>
     * 
     * @param fieldMapping
     *        Contains the names of the fields to which to map information about the vector store.
     */

    public void setFieldMapping(RedisEnterpriseCloudFieldMapping fieldMapping) {
        this.fieldMapping = fieldMapping;
    }

    /**
     * <p>
     * Contains the names of the fields to which to map information about the vector store.
     * </p>
     * 
     * @return Contains the names of the fields to which to map information about the vector store.
     */

    public RedisEnterpriseCloudFieldMapping getFieldMapping() {
        return this.fieldMapping;
    }

    /**
     * <p>
     * Contains the names of the fields to which to map information about the vector store.
     * </p>
     * 
     * @param fieldMapping
     *        Contains the names of the fields to which to map information about the vector store.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RedisEnterpriseCloudConfiguration withFieldMapping(RedisEnterpriseCloudFieldMapping fieldMapping) {
        setFieldMapping(fieldMapping);
        return this;
    }

    /**
     * <p>
     * The name of the vector index.
     * </p>
     * 
     * @param vectorIndexName
     *        The name of the vector index.
     */

    public void setVectorIndexName(String vectorIndexName) {
        this.vectorIndexName = vectorIndexName;
    }

    /**
     * <p>
     * The name of the vector index.
     * </p>
     * 
     * @return The name of the vector index.
     */

    public String getVectorIndexName() {
        return this.vectorIndexName;
    }

    /**
     * <p>
     * The name of the vector index.
     * </p>
     * 
     * @param vectorIndexName
     *        The name of the vector index.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RedisEnterpriseCloudConfiguration withVectorIndexName(String vectorIndexName) {
        setVectorIndexName(vectorIndexName);
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
        if (getCredentialsSecretArn() != null)
            sb.append("CredentialsSecretArn: ").append(getCredentialsSecretArn()).append(",");
        if (getEndpoint() != null)
            sb.append("Endpoint: ").append(getEndpoint()).append(",");
        if (getFieldMapping() != null)
            sb.append("FieldMapping: ").append(getFieldMapping()).append(",");
        if (getVectorIndexName() != null)
            sb.append("VectorIndexName: ").append(getVectorIndexName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RedisEnterpriseCloudConfiguration == false)
            return false;
        RedisEnterpriseCloudConfiguration other = (RedisEnterpriseCloudConfiguration) obj;
        if (other.getCredentialsSecretArn() == null ^ this.getCredentialsSecretArn() == null)
            return false;
        if (other.getCredentialsSecretArn() != null && other.getCredentialsSecretArn().equals(this.getCredentialsSecretArn()) == false)
            return false;
        if (other.getEndpoint() == null ^ this.getEndpoint() == null)
            return false;
        if (other.getEndpoint() != null && other.getEndpoint().equals(this.getEndpoint()) == false)
            return false;
        if (other.getFieldMapping() == null ^ this.getFieldMapping() == null)
            return false;
        if (other.getFieldMapping() != null && other.getFieldMapping().equals(this.getFieldMapping()) == false)
            return false;
        if (other.getVectorIndexName() == null ^ this.getVectorIndexName() == null)
            return false;
        if (other.getVectorIndexName() != null && other.getVectorIndexName().equals(this.getVectorIndexName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCredentialsSecretArn() == null) ? 0 : getCredentialsSecretArn().hashCode());
        hashCode = prime * hashCode + ((getEndpoint() == null) ? 0 : getEndpoint().hashCode());
        hashCode = prime * hashCode + ((getFieldMapping() == null) ? 0 : getFieldMapping().hashCode());
        hashCode = prime * hashCode + ((getVectorIndexName() == null) ? 0 : getVectorIndexName().hashCode());
        return hashCode;
    }

    @Override
    public RedisEnterpriseCloudConfiguration clone() {
        try {
            return (RedisEnterpriseCloudConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.bedrockagent.model.transform.RedisEnterpriseCloudConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
