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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/GetIngestionJob" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetIngestionJobRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The unique identifier of the data source in the ingestion job.
     * </p>
     */
    private String dataSourceId;
    /**
     * <p>
     * The unique identifier of the ingestion job.
     * </p>
     */
    private String ingestionJobId;
    /**
     * <p>
     * The unique identifier of the knowledge base for which the ingestion job applies.
     * </p>
     */
    private String knowledgeBaseId;

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

    public GetIngestionJobRequest withDataSourceId(String dataSourceId) {
        setDataSourceId(dataSourceId);
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

    public GetIngestionJobRequest withIngestionJobId(String ingestionJobId) {
        setIngestionJobId(ingestionJobId);
        return this;
    }

    /**
     * <p>
     * The unique identifier of the knowledge base for which the ingestion job applies.
     * </p>
     * 
     * @param knowledgeBaseId
     *        The unique identifier of the knowledge base for which the ingestion job applies.
     */

    public void setKnowledgeBaseId(String knowledgeBaseId) {
        this.knowledgeBaseId = knowledgeBaseId;
    }

    /**
     * <p>
     * The unique identifier of the knowledge base for which the ingestion job applies.
     * </p>
     * 
     * @return The unique identifier of the knowledge base for which the ingestion job applies.
     */

    public String getKnowledgeBaseId() {
        return this.knowledgeBaseId;
    }

    /**
     * <p>
     * The unique identifier of the knowledge base for which the ingestion job applies.
     * </p>
     * 
     * @param knowledgeBaseId
     *        The unique identifier of the knowledge base for which the ingestion job applies.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetIngestionJobRequest withKnowledgeBaseId(String knowledgeBaseId) {
        setKnowledgeBaseId(knowledgeBaseId);
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
        if (getIngestionJobId() != null)
            sb.append("IngestionJobId: ").append(getIngestionJobId()).append(",");
        if (getKnowledgeBaseId() != null)
            sb.append("KnowledgeBaseId: ").append(getKnowledgeBaseId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetIngestionJobRequest == false)
            return false;
        GetIngestionJobRequest other = (GetIngestionJobRequest) obj;
        if (other.getDataSourceId() == null ^ this.getDataSourceId() == null)
            return false;
        if (other.getDataSourceId() != null && other.getDataSourceId().equals(this.getDataSourceId()) == false)
            return false;
        if (other.getIngestionJobId() == null ^ this.getIngestionJobId() == null)
            return false;
        if (other.getIngestionJobId() != null && other.getIngestionJobId().equals(this.getIngestionJobId()) == false)
            return false;
        if (other.getKnowledgeBaseId() == null ^ this.getKnowledgeBaseId() == null)
            return false;
        if (other.getKnowledgeBaseId() != null && other.getKnowledgeBaseId().equals(this.getKnowledgeBaseId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDataSourceId() == null) ? 0 : getDataSourceId().hashCode());
        hashCode = prime * hashCode + ((getIngestionJobId() == null) ? 0 : getIngestionJobId().hashCode());
        hashCode = prime * hashCode + ((getKnowledgeBaseId() == null) ? 0 : getKnowledgeBaseId().hashCode());
        return hashCode;
    }

    @Override
    public GetIngestionJobRequest clone() {
        return (GetIngestionJobRequest) super.clone();
    }

}
