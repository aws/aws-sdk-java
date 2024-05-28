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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/UpdateDataSource" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateDataSourceRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The data deletion policy of the updated data source.
     * </p>
     */
    private String dataDeletionPolicy;
    /**
     * <p>
     * Contains details about the storage configuration of the data source.
     * </p>
     */
    private DataSourceConfiguration dataSourceConfiguration;
    /**
     * <p>
     * The unique identifier of the data source.
     * </p>
     */
    private String dataSourceId;
    /**
     * <p>
     * Specifies a new description for the data source.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The unique identifier of the knowledge base to which the data source belongs.
     * </p>
     */
    private String knowledgeBaseId;
    /**
     * <p>
     * Specifies a new name for the data source.
     * </p>
     */
    private String name;
    /**
     * <p>
     * Contains details about server-side encryption of the data source.
     * </p>
     */
    private ServerSideEncryptionConfiguration serverSideEncryptionConfiguration;
    /**
     * <p>
     * Contains details about how to ingest the documents in the data source.
     * </p>
     */
    private VectorIngestionConfiguration vectorIngestionConfiguration;

    /**
     * <p>
     * The data deletion policy of the updated data source.
     * </p>
     * 
     * @param dataDeletionPolicy
     *        The data deletion policy of the updated data source.
     * @see DataDeletionPolicy
     */

    public void setDataDeletionPolicy(String dataDeletionPolicy) {
        this.dataDeletionPolicy = dataDeletionPolicy;
    }

    /**
     * <p>
     * The data deletion policy of the updated data source.
     * </p>
     * 
     * @return The data deletion policy of the updated data source.
     * @see DataDeletionPolicy
     */

    public String getDataDeletionPolicy() {
        return this.dataDeletionPolicy;
    }

    /**
     * <p>
     * The data deletion policy of the updated data source.
     * </p>
     * 
     * @param dataDeletionPolicy
     *        The data deletion policy of the updated data source.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DataDeletionPolicy
     */

    public UpdateDataSourceRequest withDataDeletionPolicy(String dataDeletionPolicy) {
        setDataDeletionPolicy(dataDeletionPolicy);
        return this;
    }

    /**
     * <p>
     * The data deletion policy of the updated data source.
     * </p>
     * 
     * @param dataDeletionPolicy
     *        The data deletion policy of the updated data source.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DataDeletionPolicy
     */

    public UpdateDataSourceRequest withDataDeletionPolicy(DataDeletionPolicy dataDeletionPolicy) {
        this.dataDeletionPolicy = dataDeletionPolicy.toString();
        return this;
    }

    /**
     * <p>
     * Contains details about the storage configuration of the data source.
     * </p>
     * 
     * @param dataSourceConfiguration
     *        Contains details about the storage configuration of the data source.
     */

    public void setDataSourceConfiguration(DataSourceConfiguration dataSourceConfiguration) {
        this.dataSourceConfiguration = dataSourceConfiguration;
    }

    /**
     * <p>
     * Contains details about the storage configuration of the data source.
     * </p>
     * 
     * @return Contains details about the storage configuration of the data source.
     */

    public DataSourceConfiguration getDataSourceConfiguration() {
        return this.dataSourceConfiguration;
    }

    /**
     * <p>
     * Contains details about the storage configuration of the data source.
     * </p>
     * 
     * @param dataSourceConfiguration
     *        Contains details about the storage configuration of the data source.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDataSourceRequest withDataSourceConfiguration(DataSourceConfiguration dataSourceConfiguration) {
        setDataSourceConfiguration(dataSourceConfiguration);
        return this;
    }

    /**
     * <p>
     * The unique identifier of the data source.
     * </p>
     * 
     * @param dataSourceId
     *        The unique identifier of the data source.
     */

    public void setDataSourceId(String dataSourceId) {
        this.dataSourceId = dataSourceId;
    }

    /**
     * <p>
     * The unique identifier of the data source.
     * </p>
     * 
     * @return The unique identifier of the data source.
     */

    public String getDataSourceId() {
        return this.dataSourceId;
    }

    /**
     * <p>
     * The unique identifier of the data source.
     * </p>
     * 
     * @param dataSourceId
     *        The unique identifier of the data source.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDataSourceRequest withDataSourceId(String dataSourceId) {
        setDataSourceId(dataSourceId);
        return this;
    }

    /**
     * <p>
     * Specifies a new description for the data source.
     * </p>
     * 
     * @param description
     *        Specifies a new description for the data source.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * Specifies a new description for the data source.
     * </p>
     * 
     * @return Specifies a new description for the data source.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * Specifies a new description for the data source.
     * </p>
     * 
     * @param description
     *        Specifies a new description for the data source.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDataSourceRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The unique identifier of the knowledge base to which the data source belongs.
     * </p>
     * 
     * @param knowledgeBaseId
     *        The unique identifier of the knowledge base to which the data source belongs.
     */

    public void setKnowledgeBaseId(String knowledgeBaseId) {
        this.knowledgeBaseId = knowledgeBaseId;
    }

    /**
     * <p>
     * The unique identifier of the knowledge base to which the data source belongs.
     * </p>
     * 
     * @return The unique identifier of the knowledge base to which the data source belongs.
     */

    public String getKnowledgeBaseId() {
        return this.knowledgeBaseId;
    }

    /**
     * <p>
     * The unique identifier of the knowledge base to which the data source belongs.
     * </p>
     * 
     * @param knowledgeBaseId
     *        The unique identifier of the knowledge base to which the data source belongs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDataSourceRequest withKnowledgeBaseId(String knowledgeBaseId) {
        setKnowledgeBaseId(knowledgeBaseId);
        return this;
    }

    /**
     * <p>
     * Specifies a new name for the data source.
     * </p>
     * 
     * @param name
     *        Specifies a new name for the data source.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * Specifies a new name for the data source.
     * </p>
     * 
     * @return Specifies a new name for the data source.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * Specifies a new name for the data source.
     * </p>
     * 
     * @param name
     *        Specifies a new name for the data source.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDataSourceRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * Contains details about server-side encryption of the data source.
     * </p>
     * 
     * @param serverSideEncryptionConfiguration
     *        Contains details about server-side encryption of the data source.
     */

    public void setServerSideEncryptionConfiguration(ServerSideEncryptionConfiguration serverSideEncryptionConfiguration) {
        this.serverSideEncryptionConfiguration = serverSideEncryptionConfiguration;
    }

    /**
     * <p>
     * Contains details about server-side encryption of the data source.
     * </p>
     * 
     * @return Contains details about server-side encryption of the data source.
     */

    public ServerSideEncryptionConfiguration getServerSideEncryptionConfiguration() {
        return this.serverSideEncryptionConfiguration;
    }

    /**
     * <p>
     * Contains details about server-side encryption of the data source.
     * </p>
     * 
     * @param serverSideEncryptionConfiguration
     *        Contains details about server-side encryption of the data source.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDataSourceRequest withServerSideEncryptionConfiguration(ServerSideEncryptionConfiguration serverSideEncryptionConfiguration) {
        setServerSideEncryptionConfiguration(serverSideEncryptionConfiguration);
        return this;
    }

    /**
     * <p>
     * Contains details about how to ingest the documents in the data source.
     * </p>
     * 
     * @param vectorIngestionConfiguration
     *        Contains details about how to ingest the documents in the data source.
     */

    public void setVectorIngestionConfiguration(VectorIngestionConfiguration vectorIngestionConfiguration) {
        this.vectorIngestionConfiguration = vectorIngestionConfiguration;
    }

    /**
     * <p>
     * Contains details about how to ingest the documents in the data source.
     * </p>
     * 
     * @return Contains details about how to ingest the documents in the data source.
     */

    public VectorIngestionConfiguration getVectorIngestionConfiguration() {
        return this.vectorIngestionConfiguration;
    }

    /**
     * <p>
     * Contains details about how to ingest the documents in the data source.
     * </p>
     * 
     * @param vectorIngestionConfiguration
     *        Contains details about how to ingest the documents in the data source.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDataSourceRequest withVectorIngestionConfiguration(VectorIngestionConfiguration vectorIngestionConfiguration) {
        setVectorIngestionConfiguration(vectorIngestionConfiguration);
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
        if (getDataDeletionPolicy() != null)
            sb.append("DataDeletionPolicy: ").append(getDataDeletionPolicy()).append(",");
        if (getDataSourceConfiguration() != null)
            sb.append("DataSourceConfiguration: ").append(getDataSourceConfiguration()).append(",");
        if (getDataSourceId() != null)
            sb.append("DataSourceId: ").append(getDataSourceId()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getKnowledgeBaseId() != null)
            sb.append("KnowledgeBaseId: ").append(getKnowledgeBaseId()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getServerSideEncryptionConfiguration() != null)
            sb.append("ServerSideEncryptionConfiguration: ").append(getServerSideEncryptionConfiguration()).append(",");
        if (getVectorIngestionConfiguration() != null)
            sb.append("VectorIngestionConfiguration: ").append(getVectorIngestionConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateDataSourceRequest == false)
            return false;
        UpdateDataSourceRequest other = (UpdateDataSourceRequest) obj;
        if (other.getDataDeletionPolicy() == null ^ this.getDataDeletionPolicy() == null)
            return false;
        if (other.getDataDeletionPolicy() != null && other.getDataDeletionPolicy().equals(this.getDataDeletionPolicy()) == false)
            return false;
        if (other.getDataSourceConfiguration() == null ^ this.getDataSourceConfiguration() == null)
            return false;
        if (other.getDataSourceConfiguration() != null && other.getDataSourceConfiguration().equals(this.getDataSourceConfiguration()) == false)
            return false;
        if (other.getDataSourceId() == null ^ this.getDataSourceId() == null)
            return false;
        if (other.getDataSourceId() != null && other.getDataSourceId().equals(this.getDataSourceId()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getKnowledgeBaseId() == null ^ this.getKnowledgeBaseId() == null)
            return false;
        if (other.getKnowledgeBaseId() != null && other.getKnowledgeBaseId().equals(this.getKnowledgeBaseId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getServerSideEncryptionConfiguration() == null ^ this.getServerSideEncryptionConfiguration() == null)
            return false;
        if (other.getServerSideEncryptionConfiguration() != null
                && other.getServerSideEncryptionConfiguration().equals(this.getServerSideEncryptionConfiguration()) == false)
            return false;
        if (other.getVectorIngestionConfiguration() == null ^ this.getVectorIngestionConfiguration() == null)
            return false;
        if (other.getVectorIngestionConfiguration() != null && other.getVectorIngestionConfiguration().equals(this.getVectorIngestionConfiguration()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDataDeletionPolicy() == null) ? 0 : getDataDeletionPolicy().hashCode());
        hashCode = prime * hashCode + ((getDataSourceConfiguration() == null) ? 0 : getDataSourceConfiguration().hashCode());
        hashCode = prime * hashCode + ((getDataSourceId() == null) ? 0 : getDataSourceId().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getKnowledgeBaseId() == null) ? 0 : getKnowledgeBaseId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getServerSideEncryptionConfiguration() == null) ? 0 : getServerSideEncryptionConfiguration().hashCode());
        hashCode = prime * hashCode + ((getVectorIngestionConfiguration() == null) ? 0 : getVectorIngestionConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public UpdateDataSourceRequest clone() {
        return (UpdateDataSourceRequest) super.clone();
    }

}
