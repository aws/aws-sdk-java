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
 * Contains details about the storage configuration of the knowledge base in MongoDB Atlas.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/MongoDbAtlasConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MongoDbAtlasConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The collection name of the knowledge base in MongoDB Atlas.
     * </p>
     */
    private String collectionName;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the secret that you created in Secrets Manager that contains user credentials
     * for your MongoDB Atlas cluster.
     * </p>
     */
    private String credentialsSecretArn;
    /**
     * <p>
     * The database name in your MongoDB Atlas cluster for your knowledge base.
     * </p>
     */
    private String databaseName;
    /**
     * <p>
     * The endpoint URL of your MongoDB Atlas cluster for your knowledge base.
     * </p>
     */
    private String endpoint;
    /**
     * <p>
     * The name of the VPC endpoint service in your account that is connected to your MongoDB Atlas cluster.
     * </p>
     */
    private String endpointServiceName;
    /**
     * <p>
     * Contains the names of the fields to which to map information about the vector store.
     * </p>
     */
    private MongoDbAtlasFieldMapping fieldMapping;
    /**
     * <p>
     * The name of the MongoDB Atlas vector search index.
     * </p>
     */
    private String vectorIndexName;

    /**
     * <p>
     * The collection name of the knowledge base in MongoDB Atlas.
     * </p>
     * 
     * @param collectionName
     *        The collection name of the knowledge base in MongoDB Atlas.
     */

    public void setCollectionName(String collectionName) {
        this.collectionName = collectionName;
    }

    /**
     * <p>
     * The collection name of the knowledge base in MongoDB Atlas.
     * </p>
     * 
     * @return The collection name of the knowledge base in MongoDB Atlas.
     */

    public String getCollectionName() {
        return this.collectionName;
    }

    /**
     * <p>
     * The collection name of the knowledge base in MongoDB Atlas.
     * </p>
     * 
     * @param collectionName
     *        The collection name of the knowledge base in MongoDB Atlas.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MongoDbAtlasConfiguration withCollectionName(String collectionName) {
        setCollectionName(collectionName);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the secret that you created in Secrets Manager that contains user credentials
     * for your MongoDB Atlas cluster.
     * </p>
     * 
     * @param credentialsSecretArn
     *        The Amazon Resource Name (ARN) of the secret that you created in Secrets Manager that contains user
     *        credentials for your MongoDB Atlas cluster.
     */

    public void setCredentialsSecretArn(String credentialsSecretArn) {
        this.credentialsSecretArn = credentialsSecretArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the secret that you created in Secrets Manager that contains user credentials
     * for your MongoDB Atlas cluster.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the secret that you created in Secrets Manager that contains user
     *         credentials for your MongoDB Atlas cluster.
     */

    public String getCredentialsSecretArn() {
        return this.credentialsSecretArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the secret that you created in Secrets Manager that contains user credentials
     * for your MongoDB Atlas cluster.
     * </p>
     * 
     * @param credentialsSecretArn
     *        The Amazon Resource Name (ARN) of the secret that you created in Secrets Manager that contains user
     *        credentials for your MongoDB Atlas cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MongoDbAtlasConfiguration withCredentialsSecretArn(String credentialsSecretArn) {
        setCredentialsSecretArn(credentialsSecretArn);
        return this;
    }

    /**
     * <p>
     * The database name in your MongoDB Atlas cluster for your knowledge base.
     * </p>
     * 
     * @param databaseName
     *        The database name in your MongoDB Atlas cluster for your knowledge base.
     */

    public void setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
    }

    /**
     * <p>
     * The database name in your MongoDB Atlas cluster for your knowledge base.
     * </p>
     * 
     * @return The database name in your MongoDB Atlas cluster for your knowledge base.
     */

    public String getDatabaseName() {
        return this.databaseName;
    }

    /**
     * <p>
     * The database name in your MongoDB Atlas cluster for your knowledge base.
     * </p>
     * 
     * @param databaseName
     *        The database name in your MongoDB Atlas cluster for your knowledge base.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MongoDbAtlasConfiguration withDatabaseName(String databaseName) {
        setDatabaseName(databaseName);
        return this;
    }

    /**
     * <p>
     * The endpoint URL of your MongoDB Atlas cluster for your knowledge base.
     * </p>
     * 
     * @param endpoint
     *        The endpoint URL of your MongoDB Atlas cluster for your knowledge base.
     */

    public void setEndpoint(String endpoint) {
        this.endpoint = endpoint;
    }

    /**
     * <p>
     * The endpoint URL of your MongoDB Atlas cluster for your knowledge base.
     * </p>
     * 
     * @return The endpoint URL of your MongoDB Atlas cluster for your knowledge base.
     */

    public String getEndpoint() {
        return this.endpoint;
    }

    /**
     * <p>
     * The endpoint URL of your MongoDB Atlas cluster for your knowledge base.
     * </p>
     * 
     * @param endpoint
     *        The endpoint URL of your MongoDB Atlas cluster for your knowledge base.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MongoDbAtlasConfiguration withEndpoint(String endpoint) {
        setEndpoint(endpoint);
        return this;
    }

    /**
     * <p>
     * The name of the VPC endpoint service in your account that is connected to your MongoDB Atlas cluster.
     * </p>
     * 
     * @param endpointServiceName
     *        The name of the VPC endpoint service in your account that is connected to your MongoDB Atlas cluster.
     */

    public void setEndpointServiceName(String endpointServiceName) {
        this.endpointServiceName = endpointServiceName;
    }

    /**
     * <p>
     * The name of the VPC endpoint service in your account that is connected to your MongoDB Atlas cluster.
     * </p>
     * 
     * @return The name of the VPC endpoint service in your account that is connected to your MongoDB Atlas cluster.
     */

    public String getEndpointServiceName() {
        return this.endpointServiceName;
    }

    /**
     * <p>
     * The name of the VPC endpoint service in your account that is connected to your MongoDB Atlas cluster.
     * </p>
     * 
     * @param endpointServiceName
     *        The name of the VPC endpoint service in your account that is connected to your MongoDB Atlas cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MongoDbAtlasConfiguration withEndpointServiceName(String endpointServiceName) {
        setEndpointServiceName(endpointServiceName);
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

    public void setFieldMapping(MongoDbAtlasFieldMapping fieldMapping) {
        this.fieldMapping = fieldMapping;
    }

    /**
     * <p>
     * Contains the names of the fields to which to map information about the vector store.
     * </p>
     * 
     * @return Contains the names of the fields to which to map information about the vector store.
     */

    public MongoDbAtlasFieldMapping getFieldMapping() {
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

    public MongoDbAtlasConfiguration withFieldMapping(MongoDbAtlasFieldMapping fieldMapping) {
        setFieldMapping(fieldMapping);
        return this;
    }

    /**
     * <p>
     * The name of the MongoDB Atlas vector search index.
     * </p>
     * 
     * @param vectorIndexName
     *        The name of the MongoDB Atlas vector search index.
     */

    public void setVectorIndexName(String vectorIndexName) {
        this.vectorIndexName = vectorIndexName;
    }

    /**
     * <p>
     * The name of the MongoDB Atlas vector search index.
     * </p>
     * 
     * @return The name of the MongoDB Atlas vector search index.
     */

    public String getVectorIndexName() {
        return this.vectorIndexName;
    }

    /**
     * <p>
     * The name of the MongoDB Atlas vector search index.
     * </p>
     * 
     * @param vectorIndexName
     *        The name of the MongoDB Atlas vector search index.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MongoDbAtlasConfiguration withVectorIndexName(String vectorIndexName) {
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
        if (getCollectionName() != null)
            sb.append("CollectionName: ").append(getCollectionName()).append(",");
        if (getCredentialsSecretArn() != null)
            sb.append("CredentialsSecretArn: ").append(getCredentialsSecretArn()).append(",");
        if (getDatabaseName() != null)
            sb.append("DatabaseName: ").append(getDatabaseName()).append(",");
        if (getEndpoint() != null)
            sb.append("Endpoint: ").append(getEndpoint()).append(",");
        if (getEndpointServiceName() != null)
            sb.append("EndpointServiceName: ").append(getEndpointServiceName()).append(",");
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

        if (obj instanceof MongoDbAtlasConfiguration == false)
            return false;
        MongoDbAtlasConfiguration other = (MongoDbAtlasConfiguration) obj;
        if (other.getCollectionName() == null ^ this.getCollectionName() == null)
            return false;
        if (other.getCollectionName() != null && other.getCollectionName().equals(this.getCollectionName()) == false)
            return false;
        if (other.getCredentialsSecretArn() == null ^ this.getCredentialsSecretArn() == null)
            return false;
        if (other.getCredentialsSecretArn() != null && other.getCredentialsSecretArn().equals(this.getCredentialsSecretArn()) == false)
            return false;
        if (other.getDatabaseName() == null ^ this.getDatabaseName() == null)
            return false;
        if (other.getDatabaseName() != null && other.getDatabaseName().equals(this.getDatabaseName()) == false)
            return false;
        if (other.getEndpoint() == null ^ this.getEndpoint() == null)
            return false;
        if (other.getEndpoint() != null && other.getEndpoint().equals(this.getEndpoint()) == false)
            return false;
        if (other.getEndpointServiceName() == null ^ this.getEndpointServiceName() == null)
            return false;
        if (other.getEndpointServiceName() != null && other.getEndpointServiceName().equals(this.getEndpointServiceName()) == false)
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

        hashCode = prime * hashCode + ((getCollectionName() == null) ? 0 : getCollectionName().hashCode());
        hashCode = prime * hashCode + ((getCredentialsSecretArn() == null) ? 0 : getCredentialsSecretArn().hashCode());
        hashCode = prime * hashCode + ((getDatabaseName() == null) ? 0 : getDatabaseName().hashCode());
        hashCode = prime * hashCode + ((getEndpoint() == null) ? 0 : getEndpoint().hashCode());
        hashCode = prime * hashCode + ((getEndpointServiceName() == null) ? 0 : getEndpointServiceName().hashCode());
        hashCode = prime * hashCode + ((getFieldMapping() == null) ? 0 : getFieldMapping().hashCode());
        hashCode = prime * hashCode + ((getVectorIndexName() == null) ? 0 : getVectorIndexName().hashCode());
        return hashCode;
    }

    @Override
    public MongoDbAtlasConfiguration clone() {
        try {
            return (MongoDbAtlasConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.bedrockagent.model.transform.MongoDbAtlasConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
