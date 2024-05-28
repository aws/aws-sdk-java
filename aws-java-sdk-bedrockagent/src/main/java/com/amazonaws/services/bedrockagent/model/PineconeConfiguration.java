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
 * Contains details about the storage configuration of the knowledge base in Pinecone. For more information, see <a
 * href="https://docs.aws.amazon.com/bedrock/latest/userguide/knowledge-base-setup-pinecone.html">Create a vector index
 * in Pinecone</a>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/PineconeConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PineconeConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The endpoint URL for your index management page.
     * </p>
     */
    private String connectionString;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the secret that you created in Secrets Manager that is linked to your Pinecone
     * API key.
     * </p>
     */
    private String credentialsSecretArn;
    /**
     * <p>
     * Contains the names of the fields to which to map information about the vector store.
     * </p>
     */
    private PineconeFieldMapping fieldMapping;
    /**
     * <p>
     * The namespace to be used to write new data to your database.
     * </p>
     */
    private String namespace;

    /**
     * <p>
     * The endpoint URL for your index management page.
     * </p>
     * 
     * @param connectionString
     *        The endpoint URL for your index management page.
     */

    public void setConnectionString(String connectionString) {
        this.connectionString = connectionString;
    }

    /**
     * <p>
     * The endpoint URL for your index management page.
     * </p>
     * 
     * @return The endpoint URL for your index management page.
     */

    public String getConnectionString() {
        return this.connectionString;
    }

    /**
     * <p>
     * The endpoint URL for your index management page.
     * </p>
     * 
     * @param connectionString
     *        The endpoint URL for your index management page.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PineconeConfiguration withConnectionString(String connectionString) {
        setConnectionString(connectionString);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the secret that you created in Secrets Manager that is linked to your Pinecone
     * API key.
     * </p>
     * 
     * @param credentialsSecretArn
     *        The Amazon Resource Name (ARN) of the secret that you created in Secrets Manager that is linked to your
     *        Pinecone API key.
     */

    public void setCredentialsSecretArn(String credentialsSecretArn) {
        this.credentialsSecretArn = credentialsSecretArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the secret that you created in Secrets Manager that is linked to your Pinecone
     * API key.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the secret that you created in Secrets Manager that is linked to your
     *         Pinecone API key.
     */

    public String getCredentialsSecretArn() {
        return this.credentialsSecretArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the secret that you created in Secrets Manager that is linked to your Pinecone
     * API key.
     * </p>
     * 
     * @param credentialsSecretArn
     *        The Amazon Resource Name (ARN) of the secret that you created in Secrets Manager that is linked to your
     *        Pinecone API key.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PineconeConfiguration withCredentialsSecretArn(String credentialsSecretArn) {
        setCredentialsSecretArn(credentialsSecretArn);
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

    public void setFieldMapping(PineconeFieldMapping fieldMapping) {
        this.fieldMapping = fieldMapping;
    }

    /**
     * <p>
     * Contains the names of the fields to which to map information about the vector store.
     * </p>
     * 
     * @return Contains the names of the fields to which to map information about the vector store.
     */

    public PineconeFieldMapping getFieldMapping() {
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

    public PineconeConfiguration withFieldMapping(PineconeFieldMapping fieldMapping) {
        setFieldMapping(fieldMapping);
        return this;
    }

    /**
     * <p>
     * The namespace to be used to write new data to your database.
     * </p>
     * 
     * @param namespace
     *        The namespace to be used to write new data to your database.
     */

    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

    /**
     * <p>
     * The namespace to be used to write new data to your database.
     * </p>
     * 
     * @return The namespace to be used to write new data to your database.
     */

    public String getNamespace() {
        return this.namespace;
    }

    /**
     * <p>
     * The namespace to be used to write new data to your database.
     * </p>
     * 
     * @param namespace
     *        The namespace to be used to write new data to your database.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PineconeConfiguration withNamespace(String namespace) {
        setNamespace(namespace);
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
        if (getConnectionString() != null)
            sb.append("ConnectionString: ").append(getConnectionString()).append(",");
        if (getCredentialsSecretArn() != null)
            sb.append("CredentialsSecretArn: ").append(getCredentialsSecretArn()).append(",");
        if (getFieldMapping() != null)
            sb.append("FieldMapping: ").append(getFieldMapping()).append(",");
        if (getNamespace() != null)
            sb.append("Namespace: ").append(getNamespace());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PineconeConfiguration == false)
            return false;
        PineconeConfiguration other = (PineconeConfiguration) obj;
        if (other.getConnectionString() == null ^ this.getConnectionString() == null)
            return false;
        if (other.getConnectionString() != null && other.getConnectionString().equals(this.getConnectionString()) == false)
            return false;
        if (other.getCredentialsSecretArn() == null ^ this.getCredentialsSecretArn() == null)
            return false;
        if (other.getCredentialsSecretArn() != null && other.getCredentialsSecretArn().equals(this.getCredentialsSecretArn()) == false)
            return false;
        if (other.getFieldMapping() == null ^ this.getFieldMapping() == null)
            return false;
        if (other.getFieldMapping() != null && other.getFieldMapping().equals(this.getFieldMapping()) == false)
            return false;
        if (other.getNamespace() == null ^ this.getNamespace() == null)
            return false;
        if (other.getNamespace() != null && other.getNamespace().equals(this.getNamespace()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getConnectionString() == null) ? 0 : getConnectionString().hashCode());
        hashCode = prime * hashCode + ((getCredentialsSecretArn() == null) ? 0 : getCredentialsSecretArn().hashCode());
        hashCode = prime * hashCode + ((getFieldMapping() == null) ? 0 : getFieldMapping().hashCode());
        hashCode = prime * hashCode + ((getNamespace() == null) ? 0 : getNamespace().hashCode());
        return hashCode;
    }

    @Override
    public PineconeConfiguration clone() {
        try {
            return (PineconeConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.bedrockagent.model.transform.PineconeConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
