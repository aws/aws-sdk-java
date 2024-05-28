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
 * Contains details about an ingestion job, which converts a data source to embeddings for a vector store in knowledge
 * base.
 * </p>
 * <p>
 * This data type is used in the following API operations:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a href=
 * "https://docs.aws.amazon.com/bedrock/latest/APIReference/API_agent_StartIngestionJob.html#API_agent_StartIngestionJob_ResponseSyntax"
 * >StartIngestionJob response</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href=
 * "https://docs.aws.amazon.com/bedrock/latest/APIReference/API_agent_GetIngestionJob.html#API_agent_GetIngestionJob_ResponseSyntax"
 * >GetIngestionJob response</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href=
 * "https://docs.aws.amazon.com/bedrock/latest/APIReference/API_agent_ListIngestionJobs.html#API_agent_ListIngestionJobs_ResponseSyntax"
 * >ListIngestionJob response</a>
 * </p>
 * </li>
 * </ul>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/IngestionJob" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class IngestionJob implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The unique identifier of the ingested data source.
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
     * A list of reasons that the ingestion job failed.
     * </p>
     */
    private java.util.List<String> failureReasons;
    /**
     * <p>
     * The unique identifier of the ingestion job.
     * </p>
     */
    private String ingestionJobId;
    /**
     * <p>
     * The unique identifier of the knowledge base to which the data source is being added.
     * </p>
     */
    private String knowledgeBaseId;
    /**
     * <p>
     * The time at which the ingestion job started.
     * </p>
     */
    private java.util.Date startedAt;
    /**
     * <p>
     * Contains statistics about the ingestion job.
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
     * The unique identifier of the ingested data source.
     * </p>
     * 
     * @param dataSourceId
     *        The unique identifier of the ingested data source.
     */

    public void setDataSourceId(String dataSourceId) {
        this.dataSourceId = dataSourceId;
    }

    /**
     * <p>
     * The unique identifier of the ingested data source.
     * </p>
     * 
     * @return The unique identifier of the ingested data source.
     */

    public String getDataSourceId() {
        return this.dataSourceId;
    }

    /**
     * <p>
     * The unique identifier of the ingested data source.
     * </p>
     * 
     * @param dataSourceId
     *        The unique identifier of the ingested data source.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IngestionJob withDataSourceId(String dataSourceId) {
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

    public IngestionJob withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * A list of reasons that the ingestion job failed.
     * </p>
     * 
     * @return A list of reasons that the ingestion job failed.
     */

    public java.util.List<String> getFailureReasons() {
        return failureReasons;
    }

    /**
     * <p>
     * A list of reasons that the ingestion job failed.
     * </p>
     * 
     * @param failureReasons
     *        A list of reasons that the ingestion job failed.
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
     * A list of reasons that the ingestion job failed.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFailureReasons(java.util.Collection)} or {@link #withFailureReasons(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param failureReasons
     *        A list of reasons that the ingestion job failed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IngestionJob withFailureReasons(String... failureReasons) {
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
     * A list of reasons that the ingestion job failed.
     * </p>
     * 
     * @param failureReasons
     *        A list of reasons that the ingestion job failed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IngestionJob withFailureReasons(java.util.Collection<String> failureReasons) {
        setFailureReasons(failureReasons);
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

    public IngestionJob withIngestionJobId(String ingestionJobId) {
        setIngestionJobId(ingestionJobId);
        return this;
    }

    /**
     * <p>
     * The unique identifier of the knowledge base to which the data source is being added.
     * </p>
     * 
     * @param knowledgeBaseId
     *        The unique identifier of the knowledge base to which the data source is being added.
     */

    public void setKnowledgeBaseId(String knowledgeBaseId) {
        this.knowledgeBaseId = knowledgeBaseId;
    }

    /**
     * <p>
     * The unique identifier of the knowledge base to which the data source is being added.
     * </p>
     * 
     * @return The unique identifier of the knowledge base to which the data source is being added.
     */

    public String getKnowledgeBaseId() {
        return this.knowledgeBaseId;
    }

    /**
     * <p>
     * The unique identifier of the knowledge base to which the data source is being added.
     * </p>
     * 
     * @param knowledgeBaseId
     *        The unique identifier of the knowledge base to which the data source is being added.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IngestionJob withKnowledgeBaseId(String knowledgeBaseId) {
        setKnowledgeBaseId(knowledgeBaseId);
        return this;
    }

    /**
     * <p>
     * The time at which the ingestion job started.
     * </p>
     * 
     * @param startedAt
     *        The time at which the ingestion job started.
     */

    public void setStartedAt(java.util.Date startedAt) {
        this.startedAt = startedAt;
    }

    /**
     * <p>
     * The time at which the ingestion job started.
     * </p>
     * 
     * @return The time at which the ingestion job started.
     */

    public java.util.Date getStartedAt() {
        return this.startedAt;
    }

    /**
     * <p>
     * The time at which the ingestion job started.
     * </p>
     * 
     * @param startedAt
     *        The time at which the ingestion job started.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IngestionJob withStartedAt(java.util.Date startedAt) {
        setStartedAt(startedAt);
        return this;
    }

    /**
     * <p>
     * Contains statistics about the ingestion job.
     * </p>
     * 
     * @param statistics
     *        Contains statistics about the ingestion job.
     */

    public void setStatistics(IngestionJobStatistics statistics) {
        this.statistics = statistics;
    }

    /**
     * <p>
     * Contains statistics about the ingestion job.
     * </p>
     * 
     * @return Contains statistics about the ingestion job.
     */

    public IngestionJobStatistics getStatistics() {
        return this.statistics;
    }

    /**
     * <p>
     * Contains statistics about the ingestion job.
     * </p>
     * 
     * @param statistics
     *        Contains statistics about the ingestion job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IngestionJob withStatistics(IngestionJobStatistics statistics) {
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

    public IngestionJob withStatus(String status) {
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

    public IngestionJob withStatus(IngestionJobStatus status) {
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

    public IngestionJob withUpdatedAt(java.util.Date updatedAt) {
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
        if (getFailureReasons() != null)
            sb.append("FailureReasons: ").append(getFailureReasons()).append(",");
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

        if (obj instanceof IngestionJob == false)
            return false;
        IngestionJob other = (IngestionJob) obj;
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
        hashCode = prime * hashCode + ((getFailureReasons() == null) ? 0 : getFailureReasons().hashCode());
        hashCode = prime * hashCode + ((getIngestionJobId() == null) ? 0 : getIngestionJobId().hashCode());
        hashCode = prime * hashCode + ((getKnowledgeBaseId() == null) ? 0 : getKnowledgeBaseId().hashCode());
        hashCode = prime * hashCode + ((getStartedAt() == null) ? 0 : getStartedAt().hashCode());
        hashCode = prime * hashCode + ((getStatistics() == null) ? 0 : getStatistics().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getUpdatedAt() == null) ? 0 : getUpdatedAt().hashCode());
        return hashCode;
    }

    @Override
    public IngestionJob clone() {
        try {
            return (IngestionJob) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.bedrockagent.model.transform.IngestionJobMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
