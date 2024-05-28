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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/DataSourceSummary" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DataSourceSummary implements Serializable, Cloneable, StructuredPojo {

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
     * The status of the data source.
     * </p>
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

    public DataSourceSummary withDataSourceId(String dataSourceId) {
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

    public DataSourceSummary withDescription(String description) {
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

    public DataSourceSummary withKnowledgeBaseId(String knowledgeBaseId) {
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

    public DataSourceSummary withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The status of the data source.
     * </p>
     * 
     * @param status
     *        The status of the data source.
     * @see DataSourceStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the data source.
     * </p>
     * 
     * @return The status of the data source.
     * @see DataSourceStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the data source.
     * </p>
     * 
     * @param status
     *        The status of the data source.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DataSourceStatus
     */

    public DataSourceSummary withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the data source.
     * </p>
     * 
     * @param status
     *        The status of the data source.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DataSourceStatus
     */

    public DataSourceSummary withStatus(DataSourceStatus status) {
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

    public DataSourceSummary withUpdatedAt(java.util.Date updatedAt) {
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
        if (getKnowledgeBaseId() != null)
            sb.append("KnowledgeBaseId: ").append(getKnowledgeBaseId()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
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

        if (obj instanceof DataSourceSummary == false)
            return false;
        DataSourceSummary other = (DataSourceSummary) obj;
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
        hashCode = prime * hashCode + ((getKnowledgeBaseId() == null) ? 0 : getKnowledgeBaseId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getUpdatedAt() == null) ? 0 : getUpdatedAt().hashCode());
        return hashCode;
    }

    @Override
    public DataSourceSummary clone() {
        try {
            return (DataSourceSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.bedrockagent.model.transform.DataSourceSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
