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
 * Contains details about a data source.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/DataSource" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DataSource implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The time at which the data source was created.
     * </p>
     */
    private java.util.Date createdAt;
    /**
     * <p>
     * The data deletion policy for a data source.
     * </p>
     */
    private String dataDeletionPolicy;
    /**
     * <p>
     * Contains details about how the data source is stored.
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
     * The description of the data source.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The detailed reasons on the failure to delete a data source.
     * </p>
     */
    private java.util.List<String> failureReasons;
    /**
     * <p>
     * The unique identifier of the knowledge base to which the data source belongs.
     * </p>
     */
    private String knowledgeBaseId;
    /**
     * <p>
     * The name of the data source.
     * </p>
     */
    private String name;
    /**
     * <p>
     * Contains details about the configuration of the server-side encryption.
     * </p>
     */
    private ServerSideEncryptionConfiguration serverSideEncryptionConfiguration;
    /**
     * <p>
     * The status of the data source. The following statuses are possible:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Available – The data source has been created and is ready for ingestion into the knowledge base.
     * </p>
     * </li>
     * <li>
     * <p>
     * Deleting – The data source is being deleted.
     * </p>
     * </li>
     * </ul>
     */
    private String status;
    /**
     * <p>
     * The time at which the data source was last updated.
     * </p>
     */
    private java.util.Date updatedAt;
    /**
     * <p>
     * Contains details about how to ingest the documents in the data source.
     * </p>
     */
    private VectorIngestionConfiguration vectorIngestionConfiguration;

    /**
     * <p>
     * The time at which the data source was created.
     * </p>
     * 
     * @param createdAt
     *        The time at which the data source was created.
     */

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * The time at which the data source was created.
     * </p>
     * 
     * @return The time at which the data source was created.
     */

    public java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    /**
     * <p>
     * The time at which the data source was created.
     * </p>
     * 
     * @param createdAt
     *        The time at which the data source was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataSource withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
        return this;
    }

    /**
     * <p>
     * The data deletion policy for a data source.
     * </p>
     * 
     * @param dataDeletionPolicy
     *        The data deletion policy for a data source.
     * @see DataDeletionPolicy
     */

    public void setDataDeletionPolicy(String dataDeletionPolicy) {
        this.dataDeletionPolicy = dataDeletionPolicy;
    }

    /**
     * <p>
     * The data deletion policy for a data source.
     * </p>
     * 
     * @return The data deletion policy for a data source.
     * @see DataDeletionPolicy
     */

    public String getDataDeletionPolicy() {
        return this.dataDeletionPolicy;
    }

    /**
     * <p>
     * The data deletion policy for a data source.
     * </p>
     * 
     * @param dataDeletionPolicy
     *        The data deletion policy for a data source.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DataDeletionPolicy
     */

    public DataSource withDataDeletionPolicy(String dataDeletionPolicy) {
        setDataDeletionPolicy(dataDeletionPolicy);
        return this;
    }

    /**
     * <p>
     * The data deletion policy for a data source.
     * </p>
     * 
     * @param dataDeletionPolicy
     *        The data deletion policy for a data source.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DataDeletionPolicy
     */

    public DataSource withDataDeletionPolicy(DataDeletionPolicy dataDeletionPolicy) {
        this.dataDeletionPolicy = dataDeletionPolicy.toString();
        return this;
    }

    /**
     * <p>
     * Contains details about how the data source is stored.
     * </p>
     * 
     * @param dataSourceConfiguration
     *        Contains details about how the data source is stored.
     */

    public void setDataSourceConfiguration(DataSourceConfiguration dataSourceConfiguration) {
        this.dataSourceConfiguration = dataSourceConfiguration;
    }

    /**
     * <p>
     * Contains details about how the data source is stored.
     * </p>
     * 
     * @return Contains details about how the data source is stored.
     */

    public DataSourceConfiguration getDataSourceConfiguration() {
        return this.dataSourceConfiguration;
    }

    /**
     * <p>
     * Contains details about how the data source is stored.
     * </p>
     * 
     * @param dataSourceConfiguration
     *        Contains details about how the data source is stored.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataSource withDataSourceConfiguration(DataSourceConfiguration dataSourceConfiguration) {
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

    public DataSource withDataSourceId(String dataSourceId) {
        setDataSourceId(dataSourceId);
        return this;
    }

    /**
     * <p>
     * The description of the data source.
     * </p>
     * 
     * @param description
     *        The description of the data source.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the data source.
     * </p>
     * 
     * @return The description of the data source.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the data source.
     * </p>
     * 
     * @param description
     *        The description of the data source.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataSource withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The detailed reasons on the failure to delete a data source.
     * </p>
     * 
     * @return The detailed reasons on the failure to delete a data source.
     */

    public java.util.List<String> getFailureReasons() {
        return failureReasons;
    }

    /**
     * <p>
     * The detailed reasons on the failure to delete a data source.
     * </p>
     * 
     * @param failureReasons
     *        The detailed reasons on the failure to delete a data source.
     */

    public void setFailureReasons(java.util.Collection<String> failureReasons) {
        if (failureReasons == null) {
            this.failureReasons = null;
            return;
        }

        this.failureReasons = new java.util.ArrayList<String>(failureReasons);
    }

    /**
     * <p>
     * The detailed reasons on the failure to delete a data source.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFailureReasons(java.util.Collection)} or {@link #withFailureReasons(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param failureReasons
     *        The detailed reasons on the failure to delete a data source.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataSource withFailureReasons(String... failureReasons) {
        if (this.failureReasons == null) {
            setFailureReasons(new java.util.ArrayList<String>(failureReasons.length));
        }
        for (String ele : failureReasons) {
            this.failureReasons.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The detailed reasons on the failure to delete a data source.
     * </p>
     * 
     * @param failureReasons
     *        The detailed reasons on the failure to delete a data source.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataSource withFailureReasons(java.util.Collection<String> failureReasons) {
        setFailureReasons(failureReasons);
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

    public DataSource withKnowledgeBaseId(String knowledgeBaseId) {
        setKnowledgeBaseId(knowledgeBaseId);
        return this;
    }

    /**
     * <p>
     * The name of the data source.
     * </p>
     * 
     * @param name
     *        The name of the data source.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the data source.
     * </p>
     * 
     * @return The name of the data source.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the data source.
     * </p>
     * 
     * @param name
     *        The name of the data source.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataSource withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * Contains details about the configuration of the server-side encryption.
     * </p>
     * 
     * @param serverSideEncryptionConfiguration
     *        Contains details about the configuration of the server-side encryption.
     */

    public void setServerSideEncryptionConfiguration(ServerSideEncryptionConfiguration serverSideEncryptionConfiguration) {
        this.serverSideEncryptionConfiguration = serverSideEncryptionConfiguration;
    }

    /**
     * <p>
     * Contains details about the configuration of the server-side encryption.
     * </p>
     * 
     * @return Contains details about the configuration of the server-side encryption.
     */

    public ServerSideEncryptionConfiguration getServerSideEncryptionConfiguration() {
        return this.serverSideEncryptionConfiguration;
    }

    /**
     * <p>
     * Contains details about the configuration of the server-side encryption.
     * </p>
     * 
     * @param serverSideEncryptionConfiguration
     *        Contains details about the configuration of the server-side encryption.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataSource withServerSideEncryptionConfiguration(ServerSideEncryptionConfiguration serverSideEncryptionConfiguration) {
        setServerSideEncryptionConfiguration(serverSideEncryptionConfiguration);
        return this;
    }

    /**
     * <p>
     * The status of the data source. The following statuses are possible:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Available – The data source has been created and is ready for ingestion into the knowledge base.
     * </p>
     * </li>
     * <li>
     * <p>
     * Deleting – The data source is being deleted.
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        The status of the data source. The following statuses are possible:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        Available – The data source has been created and is ready for ingestion into the knowledge base.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Deleting – The data source is being deleted.
     *        </p>
     *        </li>
     * @see DataSourceStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the data source. The following statuses are possible:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Available – The data source has been created and is ready for ingestion into the knowledge base.
     * </p>
     * </li>
     * <li>
     * <p>
     * Deleting – The data source is being deleted.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The status of the data source. The following statuses are possible:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         Available – The data source has been created and is ready for ingestion into the knowledge base.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Deleting – The data source is being deleted.
     *         </p>
     *         </li>
     * @see DataSourceStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the data source. The following statuses are possible:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Available – The data source has been created and is ready for ingestion into the knowledge base.
     * </p>
     * </li>
     * <li>
     * <p>
     * Deleting – The data source is being deleted.
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        The status of the data source. The following statuses are possible:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        Available – The data source has been created and is ready for ingestion into the knowledge base.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Deleting – The data source is being deleted.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DataSourceStatus
     */

    public DataSource withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the data source. The following statuses are possible:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Available – The data source has been created and is ready for ingestion into the knowledge base.
     * </p>
     * </li>
     * <li>
     * <p>
     * Deleting – The data source is being deleted.
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        The status of the data source. The following statuses are possible:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        Available – The data source has been created and is ready for ingestion into the knowledge base.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Deleting – The data source is being deleted.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DataSourceStatus
     */

    public DataSource withStatus(DataSourceStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The time at which the data source was last updated.
     * </p>
     * 
     * @param updatedAt
     *        The time at which the data source was last updated.
     */

    public void setUpdatedAt(java.util.Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * <p>
     * The time at which the data source was last updated.
     * </p>
     * 
     * @return The time at which the data source was last updated.
     */

    public java.util.Date getUpdatedAt() {
        return this.updatedAt;
    }

    /**
     * <p>
     * The time at which the data source was last updated.
     * </p>
     * 
     * @param updatedAt
     *        The time at which the data source was last updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataSource withUpdatedAt(java.util.Date updatedAt) {
        setUpdatedAt(updatedAt);
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

    public DataSource withVectorIngestionConfiguration(VectorIngestionConfiguration vectorIngestionConfiguration) {
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
        if (getCreatedAt() != null)
            sb.append("CreatedAt: ").append(getCreatedAt()).append(",");
        if (getDataDeletionPolicy() != null)
            sb.append("DataDeletionPolicy: ").append(getDataDeletionPolicy()).append(",");
        if (getDataSourceConfiguration() != null)
            sb.append("DataSourceConfiguration: ").append(getDataSourceConfiguration()).append(",");
        if (getDataSourceId() != null)
            sb.append("DataSourceId: ").append(getDataSourceId()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getFailureReasons() != null)
            sb.append("FailureReasons: ").append(getFailureReasons()).append(",");
        if (getKnowledgeBaseId() != null)
            sb.append("KnowledgeBaseId: ").append(getKnowledgeBaseId()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getServerSideEncryptionConfiguration() != null)
            sb.append("ServerSideEncryptionConfiguration: ").append(getServerSideEncryptionConfiguration()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getUpdatedAt() != null)
            sb.append("UpdatedAt: ").append(getUpdatedAt()).append(",");
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

        if (obj instanceof DataSource == false)
            return false;
        DataSource other = (DataSource) obj;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
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
        if (other.getFailureReasons() == null ^ this.getFailureReasons() == null)
            return false;
        if (other.getFailureReasons() != null && other.getFailureReasons().equals(this.getFailureReasons()) == false)
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
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getUpdatedAt() == null ^ this.getUpdatedAt() == null)
            return false;
        if (other.getUpdatedAt() != null && other.getUpdatedAt().equals(this.getUpdatedAt()) == false)
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

        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getDataDeletionPolicy() == null) ? 0 : getDataDeletionPolicy().hashCode());
        hashCode = prime * hashCode + ((getDataSourceConfiguration() == null) ? 0 : getDataSourceConfiguration().hashCode());
        hashCode = prime * hashCode + ((getDataSourceId() == null) ? 0 : getDataSourceId().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getFailureReasons() == null) ? 0 : getFailureReasons().hashCode());
        hashCode = prime * hashCode + ((getKnowledgeBaseId() == null) ? 0 : getKnowledgeBaseId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getServerSideEncryptionConfiguration() == null) ? 0 : getServerSideEncryptionConfiguration().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getUpdatedAt() == null) ? 0 : getUpdatedAt().hashCode());
        hashCode = prime * hashCode + ((getVectorIngestionConfiguration() == null) ? 0 : getVectorIngestionConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public DataSource clone() {
        try {
            return (DataSource) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.bedrockagent.model.transform.DataSourceMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
