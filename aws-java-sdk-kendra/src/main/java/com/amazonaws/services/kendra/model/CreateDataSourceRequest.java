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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/CreateDataSource" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateDataSourceRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A name for the data source connector.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The identifier of the index you want to use with the data source connector.
     * </p>
     */
    private String indexId;
    /**
     * <p>
     * The type of data source repository. For example, <code>SHAREPOINT</code>.
     * </p>
     */
    private String type;
    /**
     * <p>
     * Configuration information to connect to your data source repository.
     * </p>
     * <p>
     * You can't specify the <code>Configuration</code> parameter when the <code>Type</code> parameter is set to
     * <code>CUSTOM</code>. If you do, you receive a <code>ValidationException</code> exception.
     * </p>
     * <p>
     * The <code>Configuration</code> parameter is required for all other data sources.
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
     * A description for the data source connector.
     * </p>
     */
    private String description;
    /**
     * <p>
     * Sets the frequency for Amazon Kendra to check the documents in your data source repository and update the index.
     * If you don't set a schedule Amazon Kendra will not periodically update the index. You can call the
     * <code>StartDataSourceSyncJob</code> API to update the index.
     * </p>
     * <p>
     * You can't specify the <code>Schedule</code> parameter when the <code>Type</code> parameter is set to
     * <code>CUSTOM</code>. If you do, you receive a <code>ValidationException</code> exception.
     * </p>
     */
    private String schedule;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of a role with permission to access the data source and required resources. For
     * more information, see <a href="https://docs.aws.amazon.com/kendra/latest/dg/iam-roles.html">IAM roles for Amazon
     * Kendra</a>.
     * </p>
     * <p>
     * You can't specify the <code>RoleArn</code> parameter when the <code>Type</code> parameter is set to
     * <code>CUSTOM</code>. If you do, you receive a <code>ValidationException</code> exception.
     * </p>
     * <p>
     * The <code>RoleArn</code> parameter is required for all other data sources.
     * </p>
     */
    private String roleArn;
    /**
     * <p>
     * A list of key-value pairs that identify the data source connector. You can use the tags to identify and organize
     * your resources and to control access to resources.
     * </p>
     */
    private java.util.List<Tag> tags;
    /**
     * <p>
     * A token that you provide to identify the request to create a data source connector. Multiple calls to the
     * <code>CreateDataSource</code> API with the same client token will create only one data source connector.
     * </p>
     */
    private String clientToken;
    /**
     * <p>
     * The code for a language. This allows you to support a language for all documents when creating the data source
     * connector. English is supported by default. For more information on supported languages, including their codes,
     * see <a href="https://docs.aws.amazon.com/kendra/latest/dg/in-adding-languages.html">Adding documents in languages
     * other than English</a>.
     * </p>
     */
    private String languageCode;
    /**
     * <p>
     * Configuration information for altering document metadata and content during the document ingestion process.
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
     * A name for the data source connector.
     * </p>
     * 
     * @param name
     *        A name for the data source connector.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * A name for the data source connector.
     * </p>
     * 
     * @return A name for the data source connector.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * A name for the data source connector.
     * </p>
     * 
     * @param name
     *        A name for the data source connector.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDataSourceRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The identifier of the index you want to use with the data source connector.
     * </p>
     * 
     * @param indexId
     *        The identifier of the index you want to use with the data source connector.
     */

    public void setIndexId(String indexId) {
        this.indexId = indexId;
    }

    /**
     * <p>
     * The identifier of the index you want to use with the data source connector.
     * </p>
     * 
     * @return The identifier of the index you want to use with the data source connector.
     */

    public String getIndexId() {
        return this.indexId;
    }

    /**
     * <p>
     * The identifier of the index you want to use with the data source connector.
     * </p>
     * 
     * @param indexId
     *        The identifier of the index you want to use with the data source connector.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDataSourceRequest withIndexId(String indexId) {
        setIndexId(indexId);
        return this;
    }

    /**
     * <p>
     * The type of data source repository. For example, <code>SHAREPOINT</code>.
     * </p>
     * 
     * @param type
     *        The type of data source repository. For example, <code>SHAREPOINT</code>.
     * @see DataSourceType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of data source repository. For example, <code>SHAREPOINT</code>.
     * </p>
     * 
     * @return The type of data source repository. For example, <code>SHAREPOINT</code>.
     * @see DataSourceType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of data source repository. For example, <code>SHAREPOINT</code>.
     * </p>
     * 
     * @param type
     *        The type of data source repository. For example, <code>SHAREPOINT</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DataSourceType
     */

    public CreateDataSourceRequest withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The type of data source repository. For example, <code>SHAREPOINT</code>.
     * </p>
     * 
     * @param type
     *        The type of data source repository. For example, <code>SHAREPOINT</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DataSourceType
     */

    public CreateDataSourceRequest withType(DataSourceType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * Configuration information to connect to your data source repository.
     * </p>
     * <p>
     * You can't specify the <code>Configuration</code> parameter when the <code>Type</code> parameter is set to
     * <code>CUSTOM</code>. If you do, you receive a <code>ValidationException</code> exception.
     * </p>
     * <p>
     * The <code>Configuration</code> parameter is required for all other data sources.
     * </p>
     * 
     * @param configuration
     *        Configuration information to connect to your data source repository.</p>
     *        <p>
     *        You can't specify the <code>Configuration</code> parameter when the <code>Type</code> parameter is set to
     *        <code>CUSTOM</code>. If you do, you receive a <code>ValidationException</code> exception.
     *        </p>
     *        <p>
     *        The <code>Configuration</code> parameter is required for all other data sources.
     */

    public void setConfiguration(DataSourceConfiguration configuration) {
        this.configuration = configuration;
    }

    /**
     * <p>
     * Configuration information to connect to your data source repository.
     * </p>
     * <p>
     * You can't specify the <code>Configuration</code> parameter when the <code>Type</code> parameter is set to
     * <code>CUSTOM</code>. If you do, you receive a <code>ValidationException</code> exception.
     * </p>
     * <p>
     * The <code>Configuration</code> parameter is required for all other data sources.
     * </p>
     * 
     * @return Configuration information to connect to your data source repository.</p>
     *         <p>
     *         You can't specify the <code>Configuration</code> parameter when the <code>Type</code> parameter is set to
     *         <code>CUSTOM</code>. If you do, you receive a <code>ValidationException</code> exception.
     *         </p>
     *         <p>
     *         The <code>Configuration</code> parameter is required for all other data sources.
     */

    public DataSourceConfiguration getConfiguration() {
        return this.configuration;
    }

    /**
     * <p>
     * Configuration information to connect to your data source repository.
     * </p>
     * <p>
     * You can't specify the <code>Configuration</code> parameter when the <code>Type</code> parameter is set to
     * <code>CUSTOM</code>. If you do, you receive a <code>ValidationException</code> exception.
     * </p>
     * <p>
     * The <code>Configuration</code> parameter is required for all other data sources.
     * </p>
     * 
     * @param configuration
     *        Configuration information to connect to your data source repository.</p>
     *        <p>
     *        You can't specify the <code>Configuration</code> parameter when the <code>Type</code> parameter is set to
     *        <code>CUSTOM</code>. If you do, you receive a <code>ValidationException</code> exception.
     *        </p>
     *        <p>
     *        The <code>Configuration</code> parameter is required for all other data sources.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDataSourceRequest withConfiguration(DataSourceConfiguration configuration) {
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

    public CreateDataSourceRequest withVpcConfiguration(DataSourceVpcConfiguration vpcConfiguration) {
        setVpcConfiguration(vpcConfiguration);
        return this;
    }

    /**
     * <p>
     * A description for the data source connector.
     * </p>
     * 
     * @param description
     *        A description for the data source connector.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description for the data source connector.
     * </p>
     * 
     * @return A description for the data source connector.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A description for the data source connector.
     * </p>
     * 
     * @param description
     *        A description for the data source connector.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDataSourceRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * Sets the frequency for Amazon Kendra to check the documents in your data source repository and update the index.
     * If you don't set a schedule Amazon Kendra will not periodically update the index. You can call the
     * <code>StartDataSourceSyncJob</code> API to update the index.
     * </p>
     * <p>
     * You can't specify the <code>Schedule</code> parameter when the <code>Type</code> parameter is set to
     * <code>CUSTOM</code>. If you do, you receive a <code>ValidationException</code> exception.
     * </p>
     * 
     * @param schedule
     *        Sets the frequency for Amazon Kendra to check the documents in your data source repository and update the
     *        index. If you don't set a schedule Amazon Kendra will not periodically update the index. You can call the
     *        <code>StartDataSourceSyncJob</code> API to update the index.</p>
     *        <p>
     *        You can't specify the <code>Schedule</code> parameter when the <code>Type</code> parameter is set to
     *        <code>CUSTOM</code>. If you do, you receive a <code>ValidationException</code> exception.
     */

    public void setSchedule(String schedule) {
        this.schedule = schedule;
    }

    /**
     * <p>
     * Sets the frequency for Amazon Kendra to check the documents in your data source repository and update the index.
     * If you don't set a schedule Amazon Kendra will not periodically update the index. You can call the
     * <code>StartDataSourceSyncJob</code> API to update the index.
     * </p>
     * <p>
     * You can't specify the <code>Schedule</code> parameter when the <code>Type</code> parameter is set to
     * <code>CUSTOM</code>. If you do, you receive a <code>ValidationException</code> exception.
     * </p>
     * 
     * @return Sets the frequency for Amazon Kendra to check the documents in your data source repository and update the
     *         index. If you don't set a schedule Amazon Kendra will not periodically update the index. You can call the
     *         <code>StartDataSourceSyncJob</code> API to update the index.</p>
     *         <p>
     *         You can't specify the <code>Schedule</code> parameter when the <code>Type</code> parameter is set to
     *         <code>CUSTOM</code>. If you do, you receive a <code>ValidationException</code> exception.
     */

    public String getSchedule() {
        return this.schedule;
    }

    /**
     * <p>
     * Sets the frequency for Amazon Kendra to check the documents in your data source repository and update the index.
     * If you don't set a schedule Amazon Kendra will not periodically update the index. You can call the
     * <code>StartDataSourceSyncJob</code> API to update the index.
     * </p>
     * <p>
     * You can't specify the <code>Schedule</code> parameter when the <code>Type</code> parameter is set to
     * <code>CUSTOM</code>. If you do, you receive a <code>ValidationException</code> exception.
     * </p>
     * 
     * @param schedule
     *        Sets the frequency for Amazon Kendra to check the documents in your data source repository and update the
     *        index. If you don't set a schedule Amazon Kendra will not periodically update the index. You can call the
     *        <code>StartDataSourceSyncJob</code> API to update the index.</p>
     *        <p>
     *        You can't specify the <code>Schedule</code> parameter when the <code>Type</code> parameter is set to
     *        <code>CUSTOM</code>. If you do, you receive a <code>ValidationException</code> exception.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDataSourceRequest withSchedule(String schedule) {
        setSchedule(schedule);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of a role with permission to access the data source and required resources. For
     * more information, see <a href="https://docs.aws.amazon.com/kendra/latest/dg/iam-roles.html">IAM roles for Amazon
     * Kendra</a>.
     * </p>
     * <p>
     * You can't specify the <code>RoleArn</code> parameter when the <code>Type</code> parameter is set to
     * <code>CUSTOM</code>. If you do, you receive a <code>ValidationException</code> exception.
     * </p>
     * <p>
     * The <code>RoleArn</code> parameter is required for all other data sources.
     * </p>
     * 
     * @param roleArn
     *        The Amazon Resource Name (ARN) of a role with permission to access the data source and required resources.
     *        For more information, see <a href="https://docs.aws.amazon.com/kendra/latest/dg/iam-roles.html">IAM roles
     *        for Amazon Kendra</a>.</p>
     *        <p>
     *        You can't specify the <code>RoleArn</code> parameter when the <code>Type</code> parameter is set to
     *        <code>CUSTOM</code>. If you do, you receive a <code>ValidationException</code> exception.
     *        </p>
     *        <p>
     *        The <code>RoleArn</code> parameter is required for all other data sources.
     */

    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of a role with permission to access the data source and required resources. For
     * more information, see <a href="https://docs.aws.amazon.com/kendra/latest/dg/iam-roles.html">IAM roles for Amazon
     * Kendra</a>.
     * </p>
     * <p>
     * You can't specify the <code>RoleArn</code> parameter when the <code>Type</code> parameter is set to
     * <code>CUSTOM</code>. If you do, you receive a <code>ValidationException</code> exception.
     * </p>
     * <p>
     * The <code>RoleArn</code> parameter is required for all other data sources.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of a role with permission to access the data source and required
     *         resources. For more information, see <a
     *         href="https://docs.aws.amazon.com/kendra/latest/dg/iam-roles.html">IAM roles for Amazon Kendra</a>.</p>
     *         <p>
     *         You can't specify the <code>RoleArn</code> parameter when the <code>Type</code> parameter is set to
     *         <code>CUSTOM</code>. If you do, you receive a <code>ValidationException</code> exception.
     *         </p>
     *         <p>
     *         The <code>RoleArn</code> parameter is required for all other data sources.
     */

    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of a role with permission to access the data source and required resources. For
     * more information, see <a href="https://docs.aws.amazon.com/kendra/latest/dg/iam-roles.html">IAM roles for Amazon
     * Kendra</a>.
     * </p>
     * <p>
     * You can't specify the <code>RoleArn</code> parameter when the <code>Type</code> parameter is set to
     * <code>CUSTOM</code>. If you do, you receive a <code>ValidationException</code> exception.
     * </p>
     * <p>
     * The <code>RoleArn</code> parameter is required for all other data sources.
     * </p>
     * 
     * @param roleArn
     *        The Amazon Resource Name (ARN) of a role with permission to access the data source and required resources.
     *        For more information, see <a href="https://docs.aws.amazon.com/kendra/latest/dg/iam-roles.html">IAM roles
     *        for Amazon Kendra</a>.</p>
     *        <p>
     *        You can't specify the <code>RoleArn</code> parameter when the <code>Type</code> parameter is set to
     *        <code>CUSTOM</code>. If you do, you receive a <code>ValidationException</code> exception.
     *        </p>
     *        <p>
     *        The <code>RoleArn</code> parameter is required for all other data sources.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDataSourceRequest withRoleArn(String roleArn) {
        setRoleArn(roleArn);
        return this;
    }

    /**
     * <p>
     * A list of key-value pairs that identify the data source connector. You can use the tags to identify and organize
     * your resources and to control access to resources.
     * </p>
     * 
     * @return A list of key-value pairs that identify the data source connector. You can use the tags to identify and
     *         organize your resources and to control access to resources.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * A list of key-value pairs that identify the data source connector. You can use the tags to identify and organize
     * your resources and to control access to resources.
     * </p>
     * 
     * @param tags
     *        A list of key-value pairs that identify the data source connector. You can use the tags to identify and
     *        organize your resources and to control access to resources.
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<Tag>(tags);
    }

    /**
     * <p>
     * A list of key-value pairs that identify the data source connector. You can use the tags to identify and organize
     * your resources and to control access to resources.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        A list of key-value pairs that identify the data source connector. You can use the tags to identify and
     *        organize your resources and to control access to resources.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDataSourceRequest withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new java.util.ArrayList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of key-value pairs that identify the data source connector. You can use the tags to identify and organize
     * your resources and to control access to resources.
     * </p>
     * 
     * @param tags
     *        A list of key-value pairs that identify the data source connector. You can use the tags to identify and
     *        organize your resources and to control access to resources.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDataSourceRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
        return this;
    }

    /**
     * <p>
     * A token that you provide to identify the request to create a data source connector. Multiple calls to the
     * <code>CreateDataSource</code> API with the same client token will create only one data source connector.
     * </p>
     * 
     * @param clientToken
     *        A token that you provide to identify the request to create a data source connector. Multiple calls to the
     *        <code>CreateDataSource</code> API with the same client token will create only one data source connector.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * A token that you provide to identify the request to create a data source connector. Multiple calls to the
     * <code>CreateDataSource</code> API with the same client token will create only one data source connector.
     * </p>
     * 
     * @return A token that you provide to identify the request to create a data source connector. Multiple calls to the
     *         <code>CreateDataSource</code> API with the same client token will create only one data source connector.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * A token that you provide to identify the request to create a data source connector. Multiple calls to the
     * <code>CreateDataSource</code> API with the same client token will create only one data source connector.
     * </p>
     * 
     * @param clientToken
     *        A token that you provide to identify the request to create a data source connector. Multiple calls to the
     *        <code>CreateDataSource</code> API with the same client token will create only one data source connector.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDataSourceRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
        return this;
    }

    /**
     * <p>
     * The code for a language. This allows you to support a language for all documents when creating the data source
     * connector. English is supported by default. For more information on supported languages, including their codes,
     * see <a href="https://docs.aws.amazon.com/kendra/latest/dg/in-adding-languages.html">Adding documents in languages
     * other than English</a>.
     * </p>
     * 
     * @param languageCode
     *        The code for a language. This allows you to support a language for all documents when creating the data
     *        source connector. English is supported by default. For more information on supported languages, including
     *        their codes, see <a href="https://docs.aws.amazon.com/kendra/latest/dg/in-adding-languages.html">Adding
     *        documents in languages other than English</a>.
     */

    public void setLanguageCode(String languageCode) {
        this.languageCode = languageCode;
    }

    /**
     * <p>
     * The code for a language. This allows you to support a language for all documents when creating the data source
     * connector. English is supported by default. For more information on supported languages, including their codes,
     * see <a href="https://docs.aws.amazon.com/kendra/latest/dg/in-adding-languages.html">Adding documents in languages
     * other than English</a>.
     * </p>
     * 
     * @return The code for a language. This allows you to support a language for all documents when creating the data
     *         source connector. English is supported by default. For more information on supported languages, including
     *         their codes, see <a href="https://docs.aws.amazon.com/kendra/latest/dg/in-adding-languages.html">Adding
     *         documents in languages other than English</a>.
     */

    public String getLanguageCode() {
        return this.languageCode;
    }

    /**
     * <p>
     * The code for a language. This allows you to support a language for all documents when creating the data source
     * connector. English is supported by default. For more information on supported languages, including their codes,
     * see <a href="https://docs.aws.amazon.com/kendra/latest/dg/in-adding-languages.html">Adding documents in languages
     * other than English</a>.
     * </p>
     * 
     * @param languageCode
     *        The code for a language. This allows you to support a language for all documents when creating the data
     *        source connector. English is supported by default. For more information on supported languages, including
     *        their codes, see <a href="https://docs.aws.amazon.com/kendra/latest/dg/in-adding-languages.html">Adding
     *        documents in languages other than English</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDataSourceRequest withLanguageCode(String languageCode) {
        setLanguageCode(languageCode);
        return this;
    }

    /**
     * <p>
     * Configuration information for altering document metadata and content during the document ingestion process.
     * </p>
     * <p>
     * For more information on how to create, modify and delete document metadata, or make other content alterations
     * when you ingest documents into Amazon Kendra, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/custom-document-enrichment.html">Customizing document metadata
     * during the ingestion process</a>.
     * </p>
     * 
     * @param customDocumentEnrichmentConfiguration
     *        Configuration information for altering document metadata and content during the document ingestion
     *        process.</p>
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
     * Configuration information for altering document metadata and content during the document ingestion process.
     * </p>
     * <p>
     * For more information on how to create, modify and delete document metadata, or make other content alterations
     * when you ingest documents into Amazon Kendra, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/custom-document-enrichment.html">Customizing document metadata
     * during the ingestion process</a>.
     * </p>
     * 
     * @return Configuration information for altering document metadata and content during the document ingestion
     *         process.</p>
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
     * Configuration information for altering document metadata and content during the document ingestion process.
     * </p>
     * <p>
     * For more information on how to create, modify and delete document metadata, or make other content alterations
     * when you ingest documents into Amazon Kendra, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/custom-document-enrichment.html">Customizing document metadata
     * during the ingestion process</a>.
     * </p>
     * 
     * @param customDocumentEnrichmentConfiguration
     *        Configuration information for altering document metadata and content during the document ingestion
     *        process.</p>
     *        <p>
     *        For more information on how to create, modify and delete document metadata, or make other content
     *        alterations when you ingest documents into Amazon Kendra, see <a
     *        href="https://docs.aws.amazon.com/kendra/latest/dg/custom-document-enrichment.html">Customizing document
     *        metadata during the ingestion process</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDataSourceRequest withCustomDocumentEnrichmentConfiguration(CustomDocumentEnrichmentConfiguration customDocumentEnrichmentConfiguration) {
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getIndexId() != null)
            sb.append("IndexId: ").append(getIndexId()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getConfiguration() != null)
            sb.append("Configuration: ").append(getConfiguration()).append(",");
        if (getVpcConfiguration() != null)
            sb.append("VpcConfiguration: ").append(getVpcConfiguration()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getSchedule() != null)
            sb.append("Schedule: ").append(getSchedule()).append(",");
        if (getRoleArn() != null)
            sb.append("RoleArn: ").append(getRoleArn()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
        if (getClientToken() != null)
            sb.append("ClientToken: ").append(getClientToken()).append(",");
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

        if (obj instanceof CreateDataSourceRequest == false)
            return false;
        CreateDataSourceRequest other = (CreateDataSourceRequest) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getIndexId() == null ^ this.getIndexId() == null)
            return false;
        if (other.getIndexId() != null && other.getIndexId().equals(this.getIndexId()) == false)
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
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getSchedule() == null ^ this.getSchedule() == null)
            return false;
        if (other.getSchedule() != null && other.getSchedule().equals(this.getSchedule()) == false)
            return false;
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
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

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getIndexId() == null) ? 0 : getIndexId().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getConfiguration() == null) ? 0 : getConfiguration().hashCode());
        hashCode = prime * hashCode + ((getVpcConfiguration() == null) ? 0 : getVpcConfiguration().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getSchedule() == null) ? 0 : getSchedule().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        hashCode = prime * hashCode + ((getLanguageCode() == null) ? 0 : getLanguageCode().hashCode());
        hashCode = prime * hashCode + ((getCustomDocumentEnrichmentConfiguration() == null) ? 0 : getCustomDocumentEnrichmentConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public CreateDataSourceRequest clone() {
        return (CreateDataSourceRequest) super.clone();
    }

}
