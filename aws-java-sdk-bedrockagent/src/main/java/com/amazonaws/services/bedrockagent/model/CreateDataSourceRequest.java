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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/CreateDataSource" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateDataSourceRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A unique, case-sensitive identifier to ensure that the API request completes no more than one time. If this token
     * matches a previous request, Amazon Bedrock ignores the request, but does not return an error. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">Ensuring
     * idempotency</a>.
     * </p>
     */
    private String clientToken;
    /**
     * <p>
     * The data deletion policy assigned to the data source.
     * </p>
     */
    private String dataDeletionPolicy;
    /**
     * <p>
     * Contains metadata about where the data source is stored.
     * </p>
     */
    private DataSourceConfiguration dataSourceConfiguration;
    /**
     * <p>
     * A description of the data source.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The unique identifier of the knowledge base to which to add the data source.
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
     * Contains details about the server-side encryption for the data source.
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
     * A unique, case-sensitive identifier to ensure that the API request completes no more than one time. If this token
     * matches a previous request, Amazon Bedrock ignores the request, but does not return an error. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">Ensuring
     * idempotency</a>.
     * </p>
     * 
     * @param clientToken
     *        A unique, case-sensitive identifier to ensure that the API request completes no more than one time. If
     *        this token matches a previous request, Amazon Bedrock ignores the request, but does not return an error.
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">Ensuring
     *        idempotency</a>.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * A unique, case-sensitive identifier to ensure that the API request completes no more than one time. If this token
     * matches a previous request, Amazon Bedrock ignores the request, but does not return an error. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">Ensuring
     * idempotency</a>.
     * </p>
     * 
     * @return A unique, case-sensitive identifier to ensure that the API request completes no more than one time. If
     *         this token matches a previous request, Amazon Bedrock ignores the request, but does not return an error.
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">Ensuring
     *         idempotency</a>.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * A unique, case-sensitive identifier to ensure that the API request completes no more than one time. If this token
     * matches a previous request, Amazon Bedrock ignores the request, but does not return an error. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">Ensuring
     * idempotency</a>.
     * </p>
     * 
     * @param clientToken
     *        A unique, case-sensitive identifier to ensure that the API request completes no more than one time. If
     *        this token matches a previous request, Amazon Bedrock ignores the request, but does not return an error.
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">Ensuring
     *        idempotency</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDataSourceRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
        return this;
    }

    /**
     * <p>
     * The data deletion policy assigned to the data source.
     * </p>
     * 
     * @param dataDeletionPolicy
     *        The data deletion policy assigned to the data source.
     * @see DataDeletionPolicy
     */

    public void setDataDeletionPolicy(String dataDeletionPolicy) {
        this.dataDeletionPolicy = dataDeletionPolicy;
    }

    /**
     * <p>
     * The data deletion policy assigned to the data source.
     * </p>
     * 
     * @return The data deletion policy assigned to the data source.
     * @see DataDeletionPolicy
     */

    public String getDataDeletionPolicy() {
        return this.dataDeletionPolicy;
    }

    /**
     * <p>
     * The data deletion policy assigned to the data source.
     * </p>
     * 
     * @param dataDeletionPolicy
     *        The data deletion policy assigned to the data source.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DataDeletionPolicy
     */

    public CreateDataSourceRequest withDataDeletionPolicy(String dataDeletionPolicy) {
        setDataDeletionPolicy(dataDeletionPolicy);
        return this;
    }

    /**
     * <p>
     * The data deletion policy assigned to the data source.
     * </p>
     * 
     * @param dataDeletionPolicy
     *        The data deletion policy assigned to the data source.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DataDeletionPolicy
     */

    public CreateDataSourceRequest withDataDeletionPolicy(DataDeletionPolicy dataDeletionPolicy) {
        this.dataDeletionPolicy = dataDeletionPolicy.toString();
        return this;
    }

    /**
     * <p>
     * Contains metadata about where the data source is stored.
     * </p>
     * 
     * @param dataSourceConfiguration
     *        Contains metadata about where the data source is stored.
     */

    public void setDataSourceConfiguration(DataSourceConfiguration dataSourceConfiguration) {
        this.dataSourceConfiguration = dataSourceConfiguration;
    }

    /**
     * <p>
     * Contains metadata about where the data source is stored.
     * </p>
     * 
     * @return Contains metadata about where the data source is stored.
     */

    public DataSourceConfiguration getDataSourceConfiguration() {
        return this.dataSourceConfiguration;
    }

    /**
     * <p>
     * Contains metadata about where the data source is stored.
     * </p>
     * 
     * @param dataSourceConfiguration
     *        Contains metadata about where the data source is stored.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDataSourceRequest withDataSourceConfiguration(DataSourceConfiguration dataSourceConfiguration) {
        setDataSourceConfiguration(dataSourceConfiguration);
        return this;
    }

    /**
     * <p>
     * A description of the data source.
     * </p>
     * 
     * @param description
     *        A description of the data source.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description of the data source.
     * </p>
     * 
     * @return A description of the data source.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A description of the data source.
     * </p>
     * 
     * @param description
     *        A description of the data source.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDataSourceRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The unique identifier of the knowledge base to which to add the data source.
     * </p>
     * 
     * @param knowledgeBaseId
     *        The unique identifier of the knowledge base to which to add the data source.
     */

    public void setKnowledgeBaseId(String knowledgeBaseId) {
        this.knowledgeBaseId = knowledgeBaseId;
    }

    /**
     * <p>
     * The unique identifier of the knowledge base to which to add the data source.
     * </p>
     * 
     * @return The unique identifier of the knowledge base to which to add the data source.
     */

    public String getKnowledgeBaseId() {
        return this.knowledgeBaseId;
    }

    /**
     * <p>
     * The unique identifier of the knowledge base to which to add the data source.
     * </p>
     * 
     * @param knowledgeBaseId
     *        The unique identifier of the knowledge base to which to add the data source.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDataSourceRequest withKnowledgeBaseId(String knowledgeBaseId) {
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

    public CreateDataSourceRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * Contains details about the server-side encryption for the data source.
     * </p>
     * 
     * @param serverSideEncryptionConfiguration
     *        Contains details about the server-side encryption for the data source.
     */

    public void setServerSideEncryptionConfiguration(ServerSideEncryptionConfiguration serverSideEncryptionConfiguration) {
        this.serverSideEncryptionConfiguration = serverSideEncryptionConfiguration;
    }

    /**
     * <p>
     * Contains details about the server-side encryption for the data source.
     * </p>
     * 
     * @return Contains details about the server-side encryption for the data source.
     */

    public ServerSideEncryptionConfiguration getServerSideEncryptionConfiguration() {
        return this.serverSideEncryptionConfiguration;
    }

    /**
     * <p>
     * Contains details about the server-side encryption for the data source.
     * </p>
     * 
     * @param serverSideEncryptionConfiguration
     *        Contains details about the server-side encryption for the data source.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDataSourceRequest withServerSideEncryptionConfiguration(ServerSideEncryptionConfiguration serverSideEncryptionConfiguration) {
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

    public CreateDataSourceRequest withVectorIngestionConfiguration(VectorIngestionConfiguration vectorIngestionConfiguration) {
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
        if (getClientToken() != null)
            sb.append("ClientToken: ").append(getClientToken()).append(",");
        if (getDataDeletionPolicy() != null)
            sb.append("DataDeletionPolicy: ").append(getDataDeletionPolicy()).append(",");
        if (getDataSourceConfiguration() != null)
            sb.append("DataSourceConfiguration: ").append(getDataSourceConfiguration()).append(",");
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

        if (obj instanceof CreateDataSourceRequest == false)
            return false;
        CreateDataSourceRequest other = (CreateDataSourceRequest) obj;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        if (other.getDataDeletionPolicy() == null ^ this.getDataDeletionPolicy() == null)
            return false;
        if (other.getDataDeletionPolicy() != null && other.getDataDeletionPolicy().equals(this.getDataDeletionPolicy()) == false)
            return false;
        if (other.getDataSourceConfiguration() == null ^ this.getDataSourceConfiguration() == null)
            return false;
        if (other.getDataSourceConfiguration() != null && other.getDataSourceConfiguration().equals(this.getDataSourceConfiguration()) == false)
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

        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        hashCode = prime * hashCode + ((getDataDeletionPolicy() == null) ? 0 : getDataDeletionPolicy().hashCode());
        hashCode = prime * hashCode + ((getDataSourceConfiguration() == null) ? 0 : getDataSourceConfiguration().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getKnowledgeBaseId() == null) ? 0 : getKnowledgeBaseId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getServerSideEncryptionConfiguration() == null) ? 0 : getServerSideEncryptionConfiguration().hashCode());
        hashCode = prime * hashCode + ((getVectorIngestionConfiguration() == null) ? 0 : getVectorIngestionConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public CreateDataSourceRequest clone() {
        return (CreateDataSourceRequest) super.clone();
    }

}
