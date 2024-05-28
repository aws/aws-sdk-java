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
 * Contains the storage configuration of the knowledge base.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/StorageConfiguration" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StorageConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Contains the storage configuration of the knowledge base in MongoDB Atlas.
     * </p>
     */
    private MongoDbAtlasConfiguration mongoDbAtlasConfiguration;
    /**
     * <p>
     * Contains the storage configuration of the knowledge base in Amazon OpenSearch Service.
     * </p>
     */
    private OpenSearchServerlessConfiguration opensearchServerlessConfiguration;
    /**
     * <p>
     * Contains the storage configuration of the knowledge base in Pinecone.
     * </p>
     */
    private PineconeConfiguration pineconeConfiguration;
    /**
     * <p>
     * Contains details about the storage configuration of the knowledge base in Amazon RDS. For more information, see
     * <a href="https://docs.aws.amazon.com/bedrock/latest/userguide/knowledge-base-setup-rds.html">Create a vector
     * index in Amazon RDS</a>.
     * </p>
     */
    private RdsConfiguration rdsConfiguration;
    /**
     * <p>
     * Contains the storage configuration of the knowledge base in Redis Enterprise Cloud.
     * </p>
     */
    private RedisEnterpriseCloudConfiguration redisEnterpriseCloudConfiguration;
    /**
     * <p>
     * The vector store service in which the knowledge base is stored.
     * </p>
     */
    private String type;

    /**
     * <p>
     * Contains the storage configuration of the knowledge base in MongoDB Atlas.
     * </p>
     * 
     * @param mongoDbAtlasConfiguration
     *        Contains the storage configuration of the knowledge base in MongoDB Atlas.
     */

    public void setMongoDbAtlasConfiguration(MongoDbAtlasConfiguration mongoDbAtlasConfiguration) {
        this.mongoDbAtlasConfiguration = mongoDbAtlasConfiguration;
    }

    /**
     * <p>
     * Contains the storage configuration of the knowledge base in MongoDB Atlas.
     * </p>
     * 
     * @return Contains the storage configuration of the knowledge base in MongoDB Atlas.
     */

    public MongoDbAtlasConfiguration getMongoDbAtlasConfiguration() {
        return this.mongoDbAtlasConfiguration;
    }

    /**
     * <p>
     * Contains the storage configuration of the knowledge base in MongoDB Atlas.
     * </p>
     * 
     * @param mongoDbAtlasConfiguration
     *        Contains the storage configuration of the knowledge base in MongoDB Atlas.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StorageConfiguration withMongoDbAtlasConfiguration(MongoDbAtlasConfiguration mongoDbAtlasConfiguration) {
        setMongoDbAtlasConfiguration(mongoDbAtlasConfiguration);
        return this;
    }

    /**
     * <p>
     * Contains the storage configuration of the knowledge base in Amazon OpenSearch Service.
     * </p>
     * 
     * @param opensearchServerlessConfiguration
     *        Contains the storage configuration of the knowledge base in Amazon OpenSearch Service.
     */

    public void setOpensearchServerlessConfiguration(OpenSearchServerlessConfiguration opensearchServerlessConfiguration) {
        this.opensearchServerlessConfiguration = opensearchServerlessConfiguration;
    }

    /**
     * <p>
     * Contains the storage configuration of the knowledge base in Amazon OpenSearch Service.
     * </p>
     * 
     * @return Contains the storage configuration of the knowledge base in Amazon OpenSearch Service.
     */

    public OpenSearchServerlessConfiguration getOpensearchServerlessConfiguration() {
        return this.opensearchServerlessConfiguration;
    }

    /**
     * <p>
     * Contains the storage configuration of the knowledge base in Amazon OpenSearch Service.
     * </p>
     * 
     * @param opensearchServerlessConfiguration
     *        Contains the storage configuration of the knowledge base in Amazon OpenSearch Service.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StorageConfiguration withOpensearchServerlessConfiguration(OpenSearchServerlessConfiguration opensearchServerlessConfiguration) {
        setOpensearchServerlessConfiguration(opensearchServerlessConfiguration);
        return this;
    }

    /**
     * <p>
     * Contains the storage configuration of the knowledge base in Pinecone.
     * </p>
     * 
     * @param pineconeConfiguration
     *        Contains the storage configuration of the knowledge base in Pinecone.
     */

    public void setPineconeConfiguration(PineconeConfiguration pineconeConfiguration) {
        this.pineconeConfiguration = pineconeConfiguration;
    }

    /**
     * <p>
     * Contains the storage configuration of the knowledge base in Pinecone.
     * </p>
     * 
     * @return Contains the storage configuration of the knowledge base in Pinecone.
     */

    public PineconeConfiguration getPineconeConfiguration() {
        return this.pineconeConfiguration;
    }

    /**
     * <p>
     * Contains the storage configuration of the knowledge base in Pinecone.
     * </p>
     * 
     * @param pineconeConfiguration
     *        Contains the storage configuration of the knowledge base in Pinecone.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StorageConfiguration withPineconeConfiguration(PineconeConfiguration pineconeConfiguration) {
        setPineconeConfiguration(pineconeConfiguration);
        return this;
    }

    /**
     * <p>
     * Contains details about the storage configuration of the knowledge base in Amazon RDS. For more information, see
     * <a href="https://docs.aws.amazon.com/bedrock/latest/userguide/knowledge-base-setup-rds.html">Create a vector
     * index in Amazon RDS</a>.
     * </p>
     * 
     * @param rdsConfiguration
     *        Contains details about the storage configuration of the knowledge base in Amazon RDS. For more
     *        information, see <a
     *        href="https://docs.aws.amazon.com/bedrock/latest/userguide/knowledge-base-setup-rds.html">Create a vector
     *        index in Amazon RDS</a>.
     */

    public void setRdsConfiguration(RdsConfiguration rdsConfiguration) {
        this.rdsConfiguration = rdsConfiguration;
    }

    /**
     * <p>
     * Contains details about the storage configuration of the knowledge base in Amazon RDS. For more information, see
     * <a href="https://docs.aws.amazon.com/bedrock/latest/userguide/knowledge-base-setup-rds.html">Create a vector
     * index in Amazon RDS</a>.
     * </p>
     * 
     * @return Contains details about the storage configuration of the knowledge base in Amazon RDS. For more
     *         information, see <a
     *         href="https://docs.aws.amazon.com/bedrock/latest/userguide/knowledge-base-setup-rds.html">Create a vector
     *         index in Amazon RDS</a>.
     */

    public RdsConfiguration getRdsConfiguration() {
        return this.rdsConfiguration;
    }

    /**
     * <p>
     * Contains details about the storage configuration of the knowledge base in Amazon RDS. For more information, see
     * <a href="https://docs.aws.amazon.com/bedrock/latest/userguide/knowledge-base-setup-rds.html">Create a vector
     * index in Amazon RDS</a>.
     * </p>
     * 
     * @param rdsConfiguration
     *        Contains details about the storage configuration of the knowledge base in Amazon RDS. For more
     *        information, see <a
     *        href="https://docs.aws.amazon.com/bedrock/latest/userguide/knowledge-base-setup-rds.html">Create a vector
     *        index in Amazon RDS</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StorageConfiguration withRdsConfiguration(RdsConfiguration rdsConfiguration) {
        setRdsConfiguration(rdsConfiguration);
        return this;
    }

    /**
     * <p>
     * Contains the storage configuration of the knowledge base in Redis Enterprise Cloud.
     * </p>
     * 
     * @param redisEnterpriseCloudConfiguration
     *        Contains the storage configuration of the knowledge base in Redis Enterprise Cloud.
     */

    public void setRedisEnterpriseCloudConfiguration(RedisEnterpriseCloudConfiguration redisEnterpriseCloudConfiguration) {
        this.redisEnterpriseCloudConfiguration = redisEnterpriseCloudConfiguration;
    }

    /**
     * <p>
     * Contains the storage configuration of the knowledge base in Redis Enterprise Cloud.
     * </p>
     * 
     * @return Contains the storage configuration of the knowledge base in Redis Enterprise Cloud.
     */

    public RedisEnterpriseCloudConfiguration getRedisEnterpriseCloudConfiguration() {
        return this.redisEnterpriseCloudConfiguration;
    }

    /**
     * <p>
     * Contains the storage configuration of the knowledge base in Redis Enterprise Cloud.
     * </p>
     * 
     * @param redisEnterpriseCloudConfiguration
     *        Contains the storage configuration of the knowledge base in Redis Enterprise Cloud.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StorageConfiguration withRedisEnterpriseCloudConfiguration(RedisEnterpriseCloudConfiguration redisEnterpriseCloudConfiguration) {
        setRedisEnterpriseCloudConfiguration(redisEnterpriseCloudConfiguration);
        return this;
    }

    /**
     * <p>
     * The vector store service in which the knowledge base is stored.
     * </p>
     * 
     * @param type
     *        The vector store service in which the knowledge base is stored.
     * @see KnowledgeBaseStorageType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The vector store service in which the knowledge base is stored.
     * </p>
     * 
     * @return The vector store service in which the knowledge base is stored.
     * @see KnowledgeBaseStorageType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The vector store service in which the knowledge base is stored.
     * </p>
     * 
     * @param type
     *        The vector store service in which the knowledge base is stored.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see KnowledgeBaseStorageType
     */

    public StorageConfiguration withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The vector store service in which the knowledge base is stored.
     * </p>
     * 
     * @param type
     *        The vector store service in which the knowledge base is stored.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see KnowledgeBaseStorageType
     */

    public StorageConfiguration withType(KnowledgeBaseStorageType type) {
        this.type = type.toString();
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
        if (getMongoDbAtlasConfiguration() != null)
            sb.append("MongoDbAtlasConfiguration: ").append(getMongoDbAtlasConfiguration()).append(",");
        if (getOpensearchServerlessConfiguration() != null)
            sb.append("OpensearchServerlessConfiguration: ").append(getOpensearchServerlessConfiguration()).append(",");
        if (getPineconeConfiguration() != null)
            sb.append("PineconeConfiguration: ").append(getPineconeConfiguration()).append(",");
        if (getRdsConfiguration() != null)
            sb.append("RdsConfiguration: ").append(getRdsConfiguration()).append(",");
        if (getRedisEnterpriseCloudConfiguration() != null)
            sb.append("RedisEnterpriseCloudConfiguration: ").append(getRedisEnterpriseCloudConfiguration()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StorageConfiguration == false)
            return false;
        StorageConfiguration other = (StorageConfiguration) obj;
        if (other.getMongoDbAtlasConfiguration() == null ^ this.getMongoDbAtlasConfiguration() == null)
            return false;
        if (other.getMongoDbAtlasConfiguration() != null && other.getMongoDbAtlasConfiguration().equals(this.getMongoDbAtlasConfiguration()) == false)
            return false;
        if (other.getOpensearchServerlessConfiguration() == null ^ this.getOpensearchServerlessConfiguration() == null)
            return false;
        if (other.getOpensearchServerlessConfiguration() != null
                && other.getOpensearchServerlessConfiguration().equals(this.getOpensearchServerlessConfiguration()) == false)
            return false;
        if (other.getPineconeConfiguration() == null ^ this.getPineconeConfiguration() == null)
            return false;
        if (other.getPineconeConfiguration() != null && other.getPineconeConfiguration().equals(this.getPineconeConfiguration()) == false)
            return false;
        if (other.getRdsConfiguration() == null ^ this.getRdsConfiguration() == null)
            return false;
        if (other.getRdsConfiguration() != null && other.getRdsConfiguration().equals(this.getRdsConfiguration()) == false)
            return false;
        if (other.getRedisEnterpriseCloudConfiguration() == null ^ this.getRedisEnterpriseCloudConfiguration() == null)
            return false;
        if (other.getRedisEnterpriseCloudConfiguration() != null
                && other.getRedisEnterpriseCloudConfiguration().equals(this.getRedisEnterpriseCloudConfiguration()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMongoDbAtlasConfiguration() == null) ? 0 : getMongoDbAtlasConfiguration().hashCode());
        hashCode = prime * hashCode + ((getOpensearchServerlessConfiguration() == null) ? 0 : getOpensearchServerlessConfiguration().hashCode());
        hashCode = prime * hashCode + ((getPineconeConfiguration() == null) ? 0 : getPineconeConfiguration().hashCode());
        hashCode = prime * hashCode + ((getRdsConfiguration() == null) ? 0 : getRdsConfiguration().hashCode());
        hashCode = prime * hashCode + ((getRedisEnterpriseCloudConfiguration() == null) ? 0 : getRedisEnterpriseCloudConfiguration().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        return hashCode;
    }

    @Override
    public StorageConfiguration clone() {
        try {
            return (StorageConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.bedrockagent.model.transform.StorageConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
