/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.kendra.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/DescribeDataSource" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeDataSourceResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier of the data source connector.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The identifier of the index used with the data source connector.
     * </p>
     */
    private String indexId;
    /**
     * <p>
     * The name for the data source connector.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The type of the data source. For example, <code>SHAREPOINT</code>.
     * </p>
     */
    private String type;
    /**
     * <p>
     * Configuration details for the data source connector. This shows how the data source is configured. The
     * configuration options for a data source depend on the data source provider.
     * </p>
     */
    private DataSourceConfiguration configuration;
    /**
     * <p>
     * Configuration information for an Amazon Virtual Private Cloud to connect to your data source. For more
     * information, see <a href="https://docs.aws.amazon.com/kendra/latest/dg/vpc-configuration.html">Configuring a
     * VPC</a>.
     * </p>
     */
    private DataSourceVpcConfiguration vpcConfiguration;
    /**
     * <p>
     * The Unix timestamp of when the data source connector was created.
     * </p>
     */
    private java.util.Date createdAt;
    /**
     * <p>
     * The Unix timestamp of when the data source connector was last updated.
     * </p>
     */
    private java.util.Date updatedAt;
    /**
     * <p>
     * The description for the data source connector.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The current status of the data source connector. When the status is <code>ACTIVE</code> the data source is ready
     * to use. When the status is <code>FAILED</code>, the <code>ErrorMessage</code> field contains the reason that the
     * data source failed.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The schedule for Amazon Kendra to update the index.
     * </p>
     */
    private String schedule;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the role with permission to access the data source and required resources.
     * </p>
     */
    private String roleArn;
    /**
     * <p>
     * When the <code>Status</code> field value is <code>FAILED</code>, the <code>ErrorMessage</code> field contains a
     * description of the error that caused the data source to fail.
     * </p>
     */
    private String errorMessage;
    /**
     * <p>
     * The code for a language. This shows a supported language for all documents in the data source. English is
     * supported by default. For more information on supported languages, including their codes, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/in-adding-languages.html">Adding documents in languages other
     * than English</a>.
     * </p>
     */
    private String languageCode;
    /**
     * <p>
     * Configuration information for altering document metadata and content during the document ingestion process when
     * you describe a data source.
     * </p>
     * <p>
     * For more information on how to create, modify and delete document metadata, or make other content alterations
     * when you ingest documents into Amazon Kendra, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/custom-document-enrichment.html">Customizing document metadata
     * during the ingestion process</a>.
     * </p>
     */
    private CustomDocumentEnrichmentConfiguration customDocumentEnrichmentConfiguration;

    /**
     * <p>
     * The identifier of the data source connector.
     * </p>
     * 
     * @param id
     *        The identifier of the data source connector.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The identifier of the data source connector.
     * </p>
     * 
     * @return The identifier of the data source connector.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The identifier of the data source connector.
     * </p>
     * 
     * @param id
     *        The identifier of the data source connector.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDataSourceResult withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The identifier of the index used with the data source connector.
     * </p>
     * 
     * @param indexId
     *        The identifier of the index used with the data source connector.
     */

    public void setIndexId(String indexId) {
        this.indexId = indexId;
    }

    /**
     * <p>
     * The identifier of the index used with the data source connector.
     * </p>
     * 
     * @return The identifier of the index used with the data source connector.
     */

    public String getIndexId() {
        return this.indexId;
    }

    /**
     * <p>
     * The identifier of the index used with the data source connector.
     * </p>
     * 
     * @param indexId
     *        The identifier of the index used with the data source connector.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDataSourceResult withIndexId(String indexId) {
        setIndexId(indexId);
        return this;
    }

    /**
     * <p>
     * The name for the data source connector.
     * </p>
     * 
     * @param name
     *        The name for the data source connector.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name for the data source connector.
     * </p>
     * 
     * @return The name for the data source connector.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name for the data source connector.
     * </p>
     * 
     * @param name
     *        The name for the data source connector.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDataSourceResult withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The type of the data source. For example, <code>SHAREPOINT</code>.
     * </p>
     * 
     * @param type
     *        The type of the data source. For example, <code>SHAREPOINT</code>.
     * @see DataSourceType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of the data source. For example, <code>SHAREPOINT</code>.
     * </p>
     * 
     * @return The type of the data source. For example, <code>SHAREPOINT</code>.
     * @see DataSourceType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of the data source. For example, <code>SHAREPOINT</code>.
     * </p>
     * 
     * @param type
     *        The type of the data source. For example, <code>SHAREPOINT</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DataSourceType
     */

    public DescribeDataSourceResult withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The type of the data source. For example, <code>SHAREPOINT</code>.
     * </p>
     * 
     * @param type
     *        The type of the data source. For example, <code>SHAREPOINT</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DataSourceType
     */

    public DescribeDataSourceResult withType(DataSourceType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * Configuration details for the data source connector. This shows how the data source is configured. The
     * configuration options for a data source depend on the data source provider.
     * </p>
     * 
     * @param configuration
     *        Configuration details for the data source connector. This shows how the data source is configured. The
     *        configuration options for a data source depend on the data source provider.
     */

    public void setConfiguration(DataSourceConfiguration configuration) {
        this.configuration = configuration;
    }

    /**
     * <p>
     * Configuration details for the data source connector. This shows how the data source is configured. The
     * configuration options for a data source depend on the data source provider.
     * </p>
     * 
     * @return Configuration details for the data source connector. This shows how the data source is configured. The
     *         configuration options for a data source depend on the data source provider.
     */

    public DataSourceConfiguration getConfiguration() {
        return this.configuration;
    }

    /**
     * <p>
     * Configuration details for the data source connector. This shows how the data source is configured. The
     * configuration options for a data source depend on the data source provider.
     * </p>
     * 
     * @param configuration
     *        Configuration details for the data source connector. This shows how the data source is configured. The
     *        configuration options for a data source depend on the data source provider.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDataSourceResult withConfiguration(DataSourceConfiguration configuration) {
        setConfiguration(configuration);
        return this;
    }

    /**
     * <p>
     * Configuration information for an Amazon Virtual Private Cloud to connect to your data source. For more
     * information, see <a href="https://docs.aws.amazon.com/kendra/latest/dg/vpc-configuration.html">Configuring a
     * VPC</a>.
     * </p>
     * 
     * @param vpcConfiguration
     *        Configuration information for an Amazon Virtual Private Cloud to connect to your data source. For more
     *        information, see <a href="https://docs.aws.amazon.com/kendra/latest/dg/vpc-configuration.html">Configuring
     *        a VPC</a>.
     */

    public void setVpcConfiguration(DataSourceVpcConfiguration vpcConfiguration) {
        this.vpcConfiguration = vpcConfiguration;
    }

    /**
     * <p>
     * Configuration information for an Amazon Virtual Private Cloud to connect to your data source. For more
     * information, see <a href="https://docs.aws.amazon.com/kendra/latest/dg/vpc-configuration.html">Configuring a
     * VPC</a>.
     * </p>
     * 
     * @return Configuration information for an Amazon Virtual Private Cloud to connect to your data source. For more
     *         information, see <a
     *         href="https://docs.aws.amazon.com/kendra/latest/dg/vpc-configuration.html">Configuring a VPC</a>.
     */

    public DataSourceVpcConfiguration getVpcConfiguration() {
        return this.vpcConfiguration;
    }

    /**
     * <p>
     * Configuration information for an Amazon Virtual Private Cloud to connect to your data source. For more
     * information, see <a href="https://docs.aws.amazon.com/kendra/latest/dg/vpc-configuration.html">Configuring a
     * VPC</a>.
     * </p>
     * 
     * @param vpcConfiguration
     *        Configuration information for an Amazon Virtual Private Cloud to connect to your data source. For more
     *        information, see <a href="https://docs.aws.amazon.com/kendra/latest/dg/vpc-configuration.html">Configuring
     *        a VPC</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDataSourceResult withVpcConfiguration(DataSourceVpcConfiguration vpcConfiguration) {
        setVpcConfiguration(vpcConfiguration);
        return this;
    }

    /**
     * <p>
     * The Unix timestamp of when the data source connector was created.
     * </p>
     * 
     * @param createdAt
     *        The Unix timestamp of when the data source connector was created.
     */

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * The Unix timestamp of when the data source connector was created.
     * </p>
     * 
     * @return The Unix timestamp of when the data source connector was created.
     */

    public java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    /**
     * <p>
     * The Unix timestamp of when the data source connector was created.
     * </p>
     * 
     * @param createdAt
     *        The Unix timestamp of when the data source connector was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDataSourceResult withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
        return this;
    }

    /**
     * <p>
     * The Unix timestamp of when the data source connector was last updated.
     * </p>
     * 
     * @param updatedAt
     *        The Unix timestamp of when the data source connector was last updated.
     */

    public void setUpdatedAt(java.util.Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * <p>
     * The Unix timestamp of when the data source connector was last updated.
     * </p>
     * 
     * @return The Unix timestamp of when the data source connector was last updated.
     */

    public java.util.Date getUpdatedAt() {
        return this.updatedAt;
    }

    /**
     * <p>
     * The Unix timestamp of when the data source connector was last updated.
     * </p>
     * 
     * @param updatedAt
     *        The Unix timestamp of when the data source connector was last updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDataSourceResult withUpdatedAt(java.util.Date updatedAt) {
        setUpdatedAt(updatedAt);
        return this;
    }

    /**
     * <p>
     * The description for the data source connector.
     * </p>
     * 
     * @param description
     *        The description for the data source connector.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description for the data source connector.
     * </p>
     * 
     * @return The description for the data source connector.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description for the data source connector.
     * </p>
     * 
     * @param description
     *        The description for the data source connector.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDataSourceResult withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The current status of the data source connector. When the status is <code>ACTIVE</code> the data source is ready
     * to use. When the status is <code>FAILED</code>, the <code>ErrorMessage</code> field contains the reason that the
     * data source failed.
     * </p>
     * 
     * @param status
     *        The current status of the data source connector. When the status is <code>ACTIVE</code> the data source is
     *        ready to use. When the status is <code>FAILED</code>, the <code>ErrorMessage</code> field contains the
     *        reason that the data source failed.
     * @see DataSourceStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The current status of the data source connector. When the status is <code>ACTIVE</code> the data source is ready
     * to use. When the status is <code>FAILED</code>, the <code>ErrorMessage</code> field contains the reason that the
     * data source failed.
     * </p>
     * 
     * @return The current status of the data source connector. When the status is <code>ACTIVE</code> the data source
     *         is ready to use. When the status is <code>FAILED</code>, the <code>ErrorMessage</code> field contains the
     *         reason that the data source failed.
     * @see DataSourceStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The current status of the data source connector. When the status is <code>ACTIVE</code> the data source is ready
     * to use. When the status is <code>FAILED</code>, the <code>ErrorMessage</code> field contains the reason that the
     * data source failed.
     * </p>
     * 
     * @param status
     *        The current status of the data source connector. When the status is <code>ACTIVE</code> the data source is
     *        ready to use. When the status is <code>FAILED</code>, the <code>ErrorMessage</code> field contains the
     *        reason that the data source failed.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DataSourceStatus
     */

    public DescribeDataSourceResult withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The current status of the data source connector. When the status is <code>ACTIVE</code> the data source is ready
     * to use. When the status is <code>FAILED</code>, the <code>ErrorMessage</code> field contains the reason that the
     * data source failed.
     * </p>
     * 
     * @param status
     *        The current status of the data source connector. When the status is <code>ACTIVE</code> the data source is
     *        ready to use. When the status is <code>FAILED</code>, the <code>ErrorMessage</code> field contains the
     *        reason that the data source failed.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DataSourceStatus
     */

    public DescribeDataSourceResult withStatus(DataSourceStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The schedule for Amazon Kendra to update the index.
     * </p>
     * 
     * @param schedule
     *        The schedule for Amazon Kendra to update the index.
     */

    public void setSchedule(String schedule) {
        this.schedule = schedule;
    }

    /**
     * <p>
     * The schedule for Amazon Kendra to update the index.
     * </p>
     * 
     * @return The schedule for Amazon Kendra to update the index.
     */

    public String getSchedule() {
        return this.schedule;
    }

    /**
     * <p>
     * The schedule for Amazon Kendra to update the index.
     * </p>
     * 
     * @param schedule
     *        The schedule for Amazon Kendra to update the index.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDataSourceResult withSchedule(String schedule) {
        setSchedule(schedule);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the role with permission to access the data source and required resources.
     * </p>
     * 
     * @param roleArn
     *        The Amazon Resource Name (ARN) of the role with permission to access the data source and required
     *        resources.
     */

    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the role with permission to access the data source and required resources.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the role with permission to access the data source and required
     *         resources.
     */

    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the role with permission to access the data source and required resources.
     * </p>
     * 
     * @param roleArn
     *        The Amazon Resource Name (ARN) of the role with permission to access the data source and required
     *        resources.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDataSourceResult withRoleArn(String roleArn) {
        setRoleArn(roleArn);
        return this;
    }

    /**
     * <p>
     * When the <code>Status</code> field value is <code>FAILED</code>, the <code>ErrorMessage</code> field contains a
     * description of the error that caused the data source to fail.
     * </p>
     * 
     * @param errorMessage
     *        When the <code>Status</code> field value is <code>FAILED</code>, the <code>ErrorMessage</code> field
     *        contains a description of the error that caused the data source to fail.
     */

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    /**
     * <p>
     * When the <code>Status</code> field value is <code>FAILED</code>, the <code>ErrorMessage</code> field contains a
     * description of the error that caused the data source to fail.
     * </p>
     * 
     * @return When the <code>Status</code> field value is <code>FAILED</code>, the <code>ErrorMessage</code> field
     *         contains a description of the error that caused the data source to fail.
     */

    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * <p>
     * When the <code>Status</code> field value is <code>FAILED</code>, the <code>ErrorMessage</code> field contains a
     * description of the error that caused the data source to fail.
     * </p>
     * 
     * @param errorMessage
     *        When the <code>Status</code> field value is <code>FAILED</code>, the <code>ErrorMessage</code> field
     *        contains a description of the error that caused the data source to fail.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDataSourceResult withErrorMessage(String errorMessage) {
        setErrorMessage(errorMessage);
        return this;
    }

    /**
     * <p>
     * The code for a language. This shows a supported language for all documents in the data source. English is
     * supported by default. For more information on supported languages, including their codes, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/in-adding-languages.html">Adding documents in languages other
     * than English</a>.
     * </p>
     * 
     * @param languageCode
     *        The code for a language. This shows a supported language for all documents in the data source. English is
     *        supported by default. For more information on supported languages, including their codes, see <a
     *        href="https://docs.aws.amazon.com/kendra/latest/dg/in-adding-languages.html">Adding documents in languages
     *        other than English</a>.
     */

    public void setLanguageCode(String languageCode) {
        this.languageCode = languageCode;
    }

    /**
     * <p>
     * The code for a language. This shows a supported language for all documents in the data source. English is
     * supported by default. For more information on supported languages, including their codes, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/in-adding-languages.html">Adding documents in languages other
     * than English</a>.
     * </p>
     * 
     * @return The code for a language. This shows a supported language for all documents in the data source. English is
     *         supported by default. For more information on supported languages, including their codes, see <a
     *         href="https://docs.aws.amazon.com/kendra/latest/dg/in-adding-languages.html">Adding documents in
     *         languages other than English</a>.
     */

    public String getLanguageCode() {
        return this.languageCode;
    }

    /**
     * <p>
     * The code for a language. This shows a supported language for all documents in the data source. English is
     * supported by default. For more information on supported languages, including their codes, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/in-adding-languages.html">Adding documents in languages other
     * than English</a>.
     * </p>
     * 
     * @param languageCode
     *        The code for a language. This shows a supported language for all documents in the data source. English is
     *        supported by default. For more information on supported languages, including their codes, see <a
     *        href="https://docs.aws.amazon.com/kendra/latest/dg/in-adding-languages.html">Adding documents in languages
     *        other than English</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDataSourceResult withLanguageCode(String languageCode) {
        setLanguageCode(languageCode);
        return this;
    }

    /**
     * <p>
     * Configuration information for altering document metadata and content during the document ingestion process when
     * you describe a data source.
     * </p>
     * <p>
     * For more information on how to create, modify and delete document metadata, or make other content alterations
     * when you ingest documents into Amazon Kendra, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/custom-document-enrichment.html">Customizing document metadata
     * during the ingestion process</a>.
     * </p>
     * 
     * @param customDocumentEnrichmentConfiguration
     *        Configuration information for altering document metadata and content during the document ingestion process
     *        when you describe a data source.</p>
     *        <p>
     *        For more information on how to create, modify and delete document metadata, or make other content
     *        alterations when you ingest documents into Amazon Kendra, see <a
     *        href="https://docs.aws.amazon.com/kendra/latest/dg/custom-document-enrichment.html">Customizing document
     *        metadata during the ingestion process</a>.
     */

    public void setCustomDocumentEnrichmentConfiguration(CustomDocumentEnrichmentConfiguration customDocumentEnrichmentConfiguration) {
        this.customDocumentEnrichmentConfiguration = customDocumentEnrichmentConfiguration;
    }

    /**
     * <p>
     * Configuration information for altering document metadata and content during the document ingestion process when
     * you describe a data source.
     * </p>
     * <p>
     * For more information on how to create, modify and delete document metadata, or make other content alterations
     * when you ingest documents into Amazon Kendra, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/custom-document-enrichment.html">Customizing document metadata
     * during the ingestion process</a>.
     * </p>
     * 
     * @return Configuration information for altering document metadata and content during the document ingestion
     *         process when you describe a data source.</p>
     *         <p>
     *         For more information on how to create, modify and delete document metadata, or make other content
     *         alterations when you ingest documents into Amazon Kendra, see <a
     *         href="https://docs.aws.amazon.com/kendra/latest/dg/custom-document-enrichment.html">Customizing document
     *         metadata during the ingestion process</a>.
     */

    public CustomDocumentEnrichmentConfiguration getCustomDocumentEnrichmentConfiguration() {
        return this.customDocumentEnrichmentConfiguration;
    }

    /**
     * <p>
     * Configuration information for altering document metadata and content during the document ingestion process when
     * you describe a data source.
     * </p>
     * <p>
     * For more information on how to create, modify and delete document metadata, or make other content alterations
     * when you ingest documents into Amazon Kendra, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/custom-document-enrichment.html">Customizing document metadata
     * during the ingestion process</a>.
     * </p>
     * 
     * @param customDocumentEnrichmentConfiguration
     *        Configuration information for altering document metadata and content during the document ingestion process
     *        when you describe a data source.</p>
     *        <p>
     *        For more information on how to create, modify and delete document metadata, or make other content
     *        alterations when you ingest documents into Amazon Kendra, see <a
     *        href="https://docs.aws.amazon.com/kendra/latest/dg/custom-document-enrichment.html">Customizing document
     *        metadata during the ingestion process</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDataSourceResult withCustomDocumentEnrichmentConfiguration(CustomDocumentEnrichmentConfiguration customDocumentEnrichmentConfiguration) {
        setCustomDocumentEnrichmentConfiguration(customDocumentEnrichmentConfiguration);
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
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getIndexId() != null)
            sb.append("IndexId: ").append(getIndexId()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getConfiguration() != null)
            sb.append("Configuration: ").append(getConfiguration()).append(",");
        if (getVpcConfiguration() != null)
            sb.append("VpcConfiguration: ").append(getVpcConfiguration()).append(",");
        if (getCreatedAt() != null)
            sb.append("CreatedAt: ").append(getCreatedAt()).append(",");
        if (getUpdatedAt() != null)
            sb.append("UpdatedAt: ").append(getUpdatedAt()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getSchedule() != null)
            sb.append("Schedule: ").append(getSchedule()).append(",");
        if (getRoleArn() != null)
            sb.append("RoleArn: ").append(getRoleArn()).append(",");
        if (getErrorMessage() != null)
            sb.append("ErrorMessage: ").append(getErrorMessage()).append(",");
        if (getLanguageCode() != null)
            sb.append("LanguageCode: ").append(getLanguageCode()).append(",");
        if (getCustomDocumentEnrichmentConfiguration() != null)
            sb.append("CustomDocumentEnrichmentConfiguration: ").append(getCustomDocumentEnrichmentConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeDataSourceResult == false)
            return false;
        DescribeDataSourceResult other = (DescribeDataSourceResult) obj;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getIndexId() == null ^ this.getIndexId() == null)
            return false;
        if (other.getIndexId() != null && other.getIndexId().equals(this.getIndexId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getConfiguration() == null ^ this.getConfiguration() == null)
            return false;
        if (other.getConfiguration() != null && other.getConfiguration().equals(this.getConfiguration()) == false)
            return false;
        if (other.getVpcConfiguration() == null ^ this.getVpcConfiguration() == null)
            return false;
        if (other.getVpcConfiguration() != null && other.getVpcConfiguration().equals(this.getVpcConfiguration()) == false)
            return false;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        if (other.getUpdatedAt() == null ^ this.getUpdatedAt() == null)
            return false;
        if (other.getUpdatedAt() != null && other.getUpdatedAt().equals(this.getUpdatedAt()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getSchedule() == null ^ this.getSchedule() == null)
            return false;
        if (other.getSchedule() != null && other.getSchedule().equals(this.getSchedule()) == false)
            return false;
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        if (other.getErrorMessage() == null ^ this.getErrorMessage() == null)
            return false;
        if (other.getErrorMessage() != null && other.getErrorMessage().equals(this.getErrorMessage()) == false)
            return false;
        if (other.getLanguageCode() == null ^ this.getLanguageCode() == null)
            return false;
        if (other.getLanguageCode() != null && other.getLanguageCode().equals(this.getLanguageCode()) == false)
            return false;
        if (other.getCustomDocumentEnrichmentConfiguration() == null ^ this.getCustomDocumentEnrichmentConfiguration() == null)
            return false;
        if (other.getCustomDocumentEnrichmentConfiguration() != null
                && other.getCustomDocumentEnrichmentConfiguration().equals(this.getCustomDocumentEnrichmentConfiguration()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getIndexId() == null) ? 0 : getIndexId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getConfiguration() == null) ? 0 : getConfiguration().hashCode());
        hashCode = prime * hashCode + ((getVpcConfiguration() == null) ? 0 : getVpcConfiguration().hashCode());
        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getUpdatedAt() == null) ? 0 : getUpdatedAt().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getSchedule() == null) ? 0 : getSchedule().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        hashCode = prime * hashCode + ((getErrorMessage() == null) ? 0 : getErrorMessage().hashCode());
        hashCode = prime * hashCode + ((getLanguageCode() == null) ? 0 : getLanguageCode().hashCode());
        hashCode = prime * hashCode + ((getCustomDocumentEnrichmentConfiguration() == null) ? 0 : getCustomDocumentEnrichmentConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public DescribeDataSourceResult clone() {
        try {
            return (DescribeDataSourceResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
