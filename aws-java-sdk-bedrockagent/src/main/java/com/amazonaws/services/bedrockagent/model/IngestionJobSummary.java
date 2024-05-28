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
 * Contains details about an ingestion job.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/IngestionJobSummary" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class IngestionJobSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The unique identifier of the data source in the ingestion job.
     * </p>
     */
    private String dataSourceId;
    /**
     * <p>
     * The description of the ingestion job.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The unique identifier of the ingestion job.
     * </p>
     */
    private String ingestionJobId;
    /**
     * <p>
     * The unique identifier of the knowledge base to which the data source is added.
     * </p>
     */
    private String knowledgeBaseId;
    /**
     * <p>
     * The time at which the ingestion job was started.
     * </p>
     */
    private java.util.Date startedAt;
    /**
     * <p>
     * Contains statistics for the ingestion job.
     * </p>
     */
    private IngestionJobStatistics statistics;
    /**
     * <p>
     * The status of the ingestion job.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The time at which the ingestion job was last updated.
     * </p>
     */
    private java.util.Date updatedAt;

    /**
     * <p>
     * The unique identifier of the data source in the ingestion job.
     * </p>
     * 
     * @param dataSourceId
     *        The unique identifier of the data source in the ingestion job.
     */

    public void setDataSourceId(String dataSourceId) {
        this.dataSourceId = dataSourceId;
    }

    /**
     * <p>
     * The unique identifier of the data source in the ingestion job.
     * </p>
     * 
     * @return The unique identifier of the data source in the ingestion job.
     */

    public String getDataSourceId() {
        return this.dataSourceId;
    }

    /**
     * <p>
     * The unique identifier of the data source in the ingestion job.
     * </p>
     * 
     * @param dataSourceId
     *        The unique identifier of the data source in the ingestion job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IngestionJobSummary withDataSourceId(String dataSourceId) {
        setDataSourceId(dataSourceId);
        return this;
    }

    /**
     * <p>
     * The description of the ingestion job.
     * </p>
     * 
     * @param description
     *        The description of the ingestion job.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the ingestion job.
     * </p>
     * 
     * @return The description of the ingestion job.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the ingestion job.
     * </p>
     * 
     * @param description
     *        The description of the ingestion job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IngestionJobSummary withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The unique identifier of the ingestion job.
     * </p>
     * 
     * @param ingestionJobId
     *        The unique identifier of the ingestion job.
     */

    public void setIngestionJobId(String ingestionJobId) {
        this.ingestionJobId = ingestionJobId;
    }

    /**
     * <p>
     * The unique identifier of the ingestion job.
     * </p>
     * 
     * @return The unique identifier of the ingestion job.
     */

    public String getIngestionJobId() {
        return this.ingestionJobId;
    }

    /**
     * <p>
     * The unique identifier of the ingestion job.
     * </p>
     * 
     * @param ingestionJobId
     *        The unique identifier of the ingestion job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IngestionJobSummary withIngestionJobId(String ingestionJobId) {
        setIngestionJobId(ingestionJobId);
        return this;
    }

    /**
     * <p>
     * The unique identifier of the knowledge base to which the data source is added.
     * </p>
     * 
     * @param knowledgeBaseId
     *        The unique identifier of the knowledge base to which the data source is added.
     */

    public void setKnowledgeBaseId(String knowledgeBaseId) {
        this.knowledgeBaseId = knowledgeBaseId;
    }

    /**
     * <p>
     * The unique identifier of the knowledge base to which the data source is added.
     * </p>
     * 
     * @return The unique identifier of the knowledge base to which the data source is added.
     */

    public String getKnowledgeBaseId() {
        return this.knowledgeBaseId;
    }

    /**
     * <p>
     * The unique identifier of the knowledge base to which the data source is added.
     * </p>
     * 
     * @param knowledgeBaseId
     *        The unique identifier of the knowledge base to which the data source is added.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IngestionJobSummary withKnowledgeBaseId(String knowledgeBaseId) {
        setKnowledgeBaseId(knowledgeBaseId);
        return this;
    }

    /**
     * <p>
     * The time at which the ingestion job was started.
     * </p>
     * 
     * @param startedAt
     *        The time at which the ingestion job was started.
     */

    public void setStartedAt(java.util.Date startedAt) {
        this.startedAt = startedAt;
    }

    /**
     * <p>
     * The time at which the ingestion job was started.
     * </p>
     * 
     * @return The time at which the ingestion job was started.
     */

    public java.util.Date getStartedAt() {
        return this.startedAt;
    }

    /**
     * <p>
     * The time at which the ingestion job was started.
     * </p>
     * 
     * @param startedAt
     *        The time at which the ingestion job was started.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IngestionJobSummary withStartedAt(java.util.Date startedAt) {
        setStartedAt(startedAt);
        return this;
    }

    /**
     * <p>
     * Contains statistics for the ingestion job.
     * </p>
     * 
     * @param statistics
     *        Contains statistics for the ingestion job.
     */

    public void setStatistics(IngestionJobStatistics statistics) {
        this.statistics = statistics;
    }

    /**
     * <p>
     * Contains statistics for the ingestion job.
     * </p>
     * 
     * @return Contains statistics for the ingestion job.
     */

    public IngestionJobStatistics getStatistics() {
        return this.statistics;
    }

    /**
     * <p>
     * Contains statistics for the ingestion job.
     * </p>
     * 
     * @param statistics
     *        Contains statistics for the ingestion job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IngestionJobSummary withStatistics(IngestionJobStatistics statistics) {
        setStatistics(statistics);
        return this;
    }

    /**
     * <p>
     * The status of the ingestion job.
     * </p>
     * 
     * @param status
     *        The status of the ingestion job.
     * @see IngestionJobStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the ingestion job.
     * </p>
     * 
     * @return The status of the ingestion job.
     * @see IngestionJobStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the ingestion job.
     * </p>
     * 
     * @param status
     *        The status of the ingestion job.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see IngestionJobStatus
     */

    public IngestionJobSummary withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the ingestion job.
     * </p>
     * 
     * @param status
     *        The status of the ingestion job.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see IngestionJobStatus
     */

    public IngestionJobSummary withStatus(IngestionJobStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The time at which the ingestion job was last updated.
     * </p>
     * 
     * @param updatedAt
     *        The time at which the ingestion job was last updated.
     */

    public void setUpdatedAt(java.util.Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * <p>
     * The time at which the ingestion job was last updated.
     * </p>
     * 
     * @return The time at which the ingestion job was last updated.
     */

    public java.util.Date getUpdatedAt() {
        return this.updatedAt;
    }

    /**
     * <p>
     * The time at which the ingestion job was last updated.
     * </p>
     * 
     * @param updatedAt
     *        The time at which the ingestion job was last updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IngestionJobSummary withUpdatedAt(java.util.Date updatedAt) {
        setUpdatedAt(updatedAt);
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
        if (getDataSourceId() != null)
            sb.append("DataSourceId: ").append(getDataSourceId()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getIngestionJobId() != null)
            sb.append("IngestionJobId: ").append(getIngestionJobId()).append(",");
        if (getKnowledgeBaseId() != null)
            sb.append("KnowledgeBaseId: ").append(getKnowledgeBaseId()).append(",");
        if (getStartedAt() != null)
            sb.append("StartedAt: ").append(getStartedAt()).append(",");
        if (getStatistics() != null)
            sb.append("Statistics: ").append(getStatistics()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getUpdatedAt() != null)
            sb.append("UpdatedAt: ").append(getUpdatedAt());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof IngestionJobSummary == false)
            return false;
        IngestionJobSummary other = (IngestionJobSummary) obj;
        if (other.getDataSourceId() == null ^ this.getDataSourceId() == null)
            return false;
        if (other.getDataSourceId() != null && other.getDataSourceId().equals(this.getDataSourceId()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getIngestionJobId() == null ^ this.getIngestionJobId() == null)
            return false;
        if (other.getIngestionJobId() != null && other.getIngestionJobId().equals(this.getIngestionJobId()) == false)
            return false;
        if (other.getKnowledgeBaseId() == null ^ this.getKnowledgeBaseId() == null)
            return false;
        if (other.getKnowledgeBaseId() != null && other.getKnowledgeBaseId().equals(this.getKnowledgeBaseId()) == false)
            return false;
        if (other.getStartedAt() == null ^ this.getStartedAt() == null)
            return false;
        if (other.getStartedAt() != null && other.getStartedAt().equals(this.getStartedAt()) == false)
            return false;
        if (other.getStatistics() == null ^ this.getStatistics() == null)
            return false;
        if (other.getStatistics() != null && other.getStatistics().equals(this.getStatistics()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getUpdatedAt() == null ^ this.getUpdatedAt() == null)
            return false;
        if (other.getUpdatedAt() != null && other.getUpdatedAt().equals(this.getUpdatedAt()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDataSourceId() == null) ? 0 : getDataSourceId().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getIngestionJobId() == null) ? 0 : getIngestionJobId().hashCode());
        hashCode = prime * hashCode + ((getKnowledgeBaseId() == null) ? 0 : getKnowledgeBaseId().hashCode());
        hashCode = prime * hashCode + ((getStartedAt() == null) ? 0 : getStartedAt().hashCode());
        hashCode = prime * hashCode + ((getStatistics() == null) ? 0 : getStatistics().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getUpdatedAt() == null) ? 0 : getUpdatedAt().hashCode());
        return hashCode;
    }

    @Override
    public IngestionJobSummary clone() {
        try {
            return (IngestionJobSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.bedrockagent.model.transform.IngestionJobSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
