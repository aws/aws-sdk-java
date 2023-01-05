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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/UpdateDataSource" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateDataSourceRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier of the data source connector you want to update.
     * </p>
     */
    private String id;
    /**
     * <p>
     * A new name for the data source connector.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The identifier of the index used with the data source connector.
     * </p>
     */
    private String indexId;
    /**
     * <p>
     * Configuration information you want to update for the data source connector.
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
     * A new description for the data source connector.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The sync schedule you want to update for the data source connector.
     * </p>
     */
    private String schedule;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of a role with permission to access the data source and required resources. For
     * more information, see <a href="https://docs.aws.amazon.com/kendra/latest/dg/iam-roles.html">IAM roles for Amazon
     * Kendra</a>.
     * </p>
     */
    private String roleArn;
    /**
     * <p>
     * The code for a language you want to update for the data source connector. This allows you to support a language
     * for all documents when updating the data source. English is supported by default. For more information on
     * supported languages, including their codes, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/in-adding-languages.html">Adding documents in languages other
     * than English</a>.
     * </p>
     */
    private String languageCode;
    /**
     * <p>
     * Configuration information you want to update for altering document metadata and content during the document
     * ingestion process.
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
     * The identifier of the data source connector you want to update.
     * </p>
     * 
     * @param id
     *        The identifier of the data source connector you want to update.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The identifier of the data source connector you want to update.
     * </p>
     * 
     * @return The identifier of the data source connector you want to update.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The identifier of the data source connector you want to update.
     * </p>
     * 
     * @param id
     *        The identifier of the data source connector you want to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDataSourceRequest withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * A new name for the data source connector.
     * </p>
     * 
     * @param name
     *        A new name for the data source connector.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * A new name for the data source connector.
     * </p>
     * 
     * @return A new name for the data source connector.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * A new name for the data source connector.
     * </p>
     * 
     * @param name
     *        A new name for the data source connector.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDataSourceRequest withName(String name) {
        setName(name);
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

    public UpdateDataSourceRequest withIndexId(String indexId) {
        setIndexId(indexId);
        return this;
    }

    /**
     * <p>
     * Configuration information you want to update for the data source connector.
     * </p>
     * 
     * @param configuration
     *        Configuration information you want to update for the data source connector.
     */

    public void setConfiguration(DataSourceConfiguration configuration) {
        this.configuration = configuration;
    }

    /**
     * <p>
     * Configuration information you want to update for the data source connector.
     * </p>
     * 
     * @return Configuration information you want to update for the data source connector.
     */

    public DataSourceConfiguration getConfiguration() {
        return this.configuration;
    }

    /**
     * <p>
     * Configuration information you want to update for the data source connector.
     * </p>
     * 
     * @param configuration
     *        Configuration information you want to update for the data source connector.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDataSourceRequest withConfiguration(DataSourceConfiguration configuration) {
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

    public UpdateDataSourceRequest withVpcConfiguration(DataSourceVpcConfiguration vpcConfiguration) {
        setVpcConfiguration(vpcConfiguration);
        return this;
    }

    /**
     * <p>
     * A new description for the data source connector.
     * </p>
     * 
     * @param description
     *        A new description for the data source connector.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A new description for the data source connector.
     * </p>
     * 
     * @return A new description for the data source connector.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A new description for the data source connector.
     * </p>
     * 
     * @param description
     *        A new description for the data source connector.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDataSourceRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The sync schedule you want to update for the data source connector.
     * </p>
     * 
     * @param schedule
     *        The sync schedule you want to update for the data source connector.
     */

    public void setSchedule(String schedule) {
        this.schedule = schedule;
    }

    /**
     * <p>
     * The sync schedule you want to update for the data source connector.
     * </p>
     * 
     * @return The sync schedule you want to update for the data source connector.
     */

    public String getSchedule() {
        return this.schedule;
    }

    /**
     * <p>
     * The sync schedule you want to update for the data source connector.
     * </p>
     * 
     * @param schedule
     *        The sync schedule you want to update for the data source connector.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDataSourceRequest withSchedule(String schedule) {
        setSchedule(schedule);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of a role with permission to access the data source and required resources. For
     * more information, see <a href="https://docs.aws.amazon.com/kendra/latest/dg/iam-roles.html">IAM roles for Amazon
     * Kendra</a>.
     * </p>
     * 
     * @param roleArn
     *        The Amazon Resource Name (ARN) of a role with permission to access the data source and required resources.
     *        For more information, see <a href="https://docs.aws.amazon.com/kendra/latest/dg/iam-roles.html">IAM roles
     *        for Amazon Kendra</a>.
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
     * 
     * @return The Amazon Resource Name (ARN) of a role with permission to access the data source and required
     *         resources. For more information, see <a
     *         href="https://docs.aws.amazon.com/kendra/latest/dg/iam-roles.html">IAM roles for Amazon Kendra</a>.
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
     * 
     * @param roleArn
     *        The Amazon Resource Name (ARN) of a role with permission to access the data source and required resources.
     *        For more information, see <a href="https://docs.aws.amazon.com/kendra/latest/dg/iam-roles.html">IAM roles
     *        for Amazon Kendra</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDataSourceRequest withRoleArn(String roleArn) {
        setRoleArn(roleArn);
        return this;
    }

    /**
     * <p>
     * The code for a language you want to update for the data source connector. This allows you to support a language
     * for all documents when updating the data source. English is supported by default. For more information on
     * supported languages, including their codes, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/in-adding-languages.html">Adding documents in languages other
     * than English</a>.
     * </p>
     * 
     * @param languageCode
     *        The code for a language you want to update for the data source connector. This allows you to support a
     *        language for all documents when updating the data source. English is supported by default. For more
     *        information on supported languages, including their codes, see <a
     *        href="https://docs.aws.amazon.com/kendra/latest/dg/in-adding-languages.html">Adding documents in languages
     *        other than English</a>.
     */

    public void setLanguageCode(String languageCode) {
        this.languageCode = languageCode;
    }

    /**
     * <p>
     * The code for a language you want to update for the data source connector. This allows you to support a language
     * for all documents when updating the data source. English is supported by default. For more information on
     * supported languages, including their codes, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/in-adding-languages.html">Adding documents in languages other
     * than English</a>.
     * </p>
     * 
     * @return The code for a language you want to update for the data source connector. This allows you to support a
     *         language for all documents when updating the data source. English is supported by default. For more
     *         information on supported languages, including their codes, see <a
     *         href="https://docs.aws.amazon.com/kendra/latest/dg/in-adding-languages.html">Adding documents in
     *         languages other than English</a>.
     */

    public String getLanguageCode() {
        return this.languageCode;
    }

    /**
     * <p>
     * The code for a language you want to update for the data source connector. This allows you to support a language
     * for all documents when updating the data source. English is supported by default. For more information on
     * supported languages, including their codes, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/in-adding-languages.html">Adding documents in languages other
     * than English</a>.
     * </p>
     * 
     * @param languageCode
     *        The code for a language you want to update for the data source connector. This allows you to support a
     *        language for all documents when updating the data source. English is supported by default. For more
     *        information on supported languages, including their codes, see <a
     *        href="https://docs.aws.amazon.com/kendra/latest/dg/in-adding-languages.html">Adding documents in languages
     *        other than English</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDataSourceRequest withLanguageCode(String languageCode) {
        setLanguageCode(languageCode);
        return this;
    }

    /**
     * <p>
     * Configuration information you want to update for altering document metadata and content during the document
     * ingestion process.
     * </p>
     * <p>
     * For more information on how to create, modify and delete document metadata, or make other content alterations
     * when you ingest documents into Amazon Kendra, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/custom-document-enrichment.html">Customizing document metadata
     * during the ingestion process</a>.
     * </p>
     * 
     * @param customDocumentEnrichmentConfiguration
     *        Configuration information you want to update for altering document metadata and content during the
     *        document ingestion process.</p>
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
     * Configuration information you want to update for altering document metadata and content during the document
     * ingestion process.
     * </p>
     * <p>
     * For more information on how to create, modify and delete document metadata, or make other content alterations
     * when you ingest documents into Amazon Kendra, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/custom-document-enrichment.html">Customizing document metadata
     * during the ingestion process</a>.
     * </p>
     * 
     * @return Configuration information you want to update for altering document metadata and content during the
     *         document ingestion process.</p>
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
     * Configuration information you want to update for altering document metadata and content during the document
     * ingestion process.
     * </p>
     * <p>
     * For more information on how to create, modify and delete document metadata, or make other content alterations
     * when you ingest documents into Amazon Kendra, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/custom-document-enrichment.html">Customizing document metadata
     * during the ingestion process</a>.
     * </p>
     * 
     * @param customDocumentEnrichmentConfiguration
     *        Configuration information you want to update for altering document metadata and content during the
     *        document ingestion process.</p>
     *        <p>
     *        For more information on how to create, modify and delete document metadata, or make other content
     *        alterations when you ingest documents into Amazon Kendra, see <a
     *        href="https://docs.aws.amazon.com/kendra/latest/dg/custom-document-enrichment.html">Customizing document
     *        metadata during the ingestion process</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDataSourceRequest withCustomDocumentEnrichmentConfiguration(CustomDocumentEnrichmentConfiguration customDocumentEnrichmentConfiguration) {
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getIndexId() != null)
            sb.append("IndexId: ").append(getIndexId()).append(",");
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

        if (obj instanceof UpdateDataSourceRequest == false)
            return false;
        UpdateDataSourceRequest other = (UpdateDataSourceRequest) obj;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getIndexId() == null ^ this.getIndexId() == null)
            return false;
        if (other.getIndexId() != null && other.getIndexId().equals(this.getIndexId()) == false)
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
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getIndexId() == null) ? 0 : getIndexId().hashCode());
        hashCode = prime * hashCode + ((getConfiguration() == null) ? 0 : getConfiguration().hashCode());
        hashCode = prime * hashCode + ((getVpcConfiguration() == null) ? 0 : getVpcConfiguration().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getSchedule() == null) ? 0 : getSchedule().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        hashCode = prime * hashCode + ((getLanguageCode() == null) ? 0 : getLanguageCode().hashCode());
        hashCode = prime * hashCode + ((getCustomDocumentEnrichmentConfiguration() == null) ? 0 : getCustomDocumentEnrichmentConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public UpdateDataSourceRequest clone() {
        return (UpdateDataSourceRequest) super.clone();
    }

}
