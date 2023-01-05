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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Provides the configuration information to connect to GitHub as your data source.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/GitHubConfiguration" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GitHubConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Configuration information to connect to GitHub Enterprise Cloud (SaaS).
     * </p>
     */
    private SaaSConfiguration saaSConfiguration;
    /**
     * <p>
     * Configuration information to connect to GitHub Enterprise Server (on premises).
     * </p>
     */
    private OnPremiseConfiguration onPremiseConfiguration;
    /**
     * <p>
     * The type of GitHub service you want to connect to—GitHub Enterprise Cloud (SaaS) or GitHub Enterprise Server (on
     * premises).
     * </p>
     */
    private String type;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of an Secrets Manager secret that contains the key-value pairs required to connect
     * to your GitHub. The secret must contain a JSON structure with the following keys:
     * </p>
     * <ul>
     * <li>
     * <p>
     * personalToken—The access token created in GitHub. For more information on creating a token in GitHub, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/data-source-github.html">Using a GitHub data source</a>.
     * </p>
     * </li>
     * </ul>
     */
    private String secretArn;
    /**
     * <p>
     * <code>TRUE</code> to use the GitHub change log to determine which documents require updating in the index.
     * Depending on the GitHub change log's size, it may take longer for Amazon Kendra to use the change log than to
     * scan all of your documents in GitHub.
     * </p>
     */
    private Boolean useChangeLog;
    /**
     * <p>
     * Configuration information to include certain types of GitHub content. You can configure to index repository files
     * only, or also include issues and pull requests, comments, and comment attachments.
     * </p>
     */
    private GitHubDocumentCrawlProperties gitHubDocumentCrawlProperties;
    /**
     * <p>
     * A list of names of the specific repositories you want to index.
     * </p>
     */
    private java.util.List<String> repositoryFilter;
    /**
     * <p>
     * A list of regular expression patterns to include certain folder names in your GitHub repository or repositories.
     * Folder names that match the patterns are included in the index. Folder names that don't match the patterns are
     * excluded from the index. If a folder matches both an inclusion and exclusion pattern, the exclusion pattern takes
     * precedence and the folder isn't included in the index.
     * </p>
     */
    private java.util.List<String> inclusionFolderNamePatterns;
    /**
     * <p>
     * A list of regular expression patterns to include certain file types in your GitHub repository or repositories.
     * File types that match the patterns are included in the index. File types that don't match the patterns are
     * excluded from the index. If a file matches both an inclusion and exclusion pattern, the exclusion pattern takes
     * precedence and the file isn't included in the index.
     * </p>
     */
    private java.util.List<String> inclusionFileTypePatterns;
    /**
     * <p>
     * A list of regular expression patterns to include certain file names in your GitHub repository or repositories.
     * File names that match the patterns are included in the index. File names that don't match the patterns are
     * excluded from the index. If a file matches both an inclusion and exclusion pattern, the exclusion pattern takes
     * precedence and the file isn't included in the index.
     * </p>
     */
    private java.util.List<String> inclusionFileNamePatterns;
    /**
     * <p>
     * A list of regular expression patterns to exclude certain folder names in your GitHub repository or repositories.
     * Folder names that match the patterns are excluded from the index. Folder names that don't match the patterns are
     * included in the index. If a folder matches both an exclusion and inclusion pattern, the exclusion pattern takes
     * precedence and the folder isn't included in the index.
     * </p>
     */
    private java.util.List<String> exclusionFolderNamePatterns;
    /**
     * <p>
     * A list of regular expression patterns to exclude certain file types in your GitHub repository or repositories.
     * File types that match the patterns are excluded from the index. File types that don't match the patterns are
     * included in the index. If a file matches both an exclusion and inclusion pattern, the exclusion pattern takes
     * precedence and the file isn't included in the index.
     * </p>
     */
    private java.util.List<String> exclusionFileTypePatterns;
    /**
     * <p>
     * A list of regular expression patterns to exclude certain file names in your GitHub repository or repositories.
     * File names that match the patterns are excluded from the index. File names that don't match the patterns are
     * included in the index. If a file matches both an exclusion and inclusion pattern, the exclusion pattern takes
     * precedence and the file isn't included in the index.
     * </p>
     */
    private java.util.List<String> exclusionFileNamePatterns;
    /**
     * <p>
     * Configuration information of an Amazon Virtual Private Cloud to connect to your GitHub. For more information, see
     * <a href="https://docs.aws.amazon.com/kendra/latest/dg/vpc-configuration.html">Configuring a VPC</a>.
     * </p>
     */
    private DataSourceVpcConfiguration vpcConfiguration;
    /**
     * <p>
     * A list of <code>DataSourceToIndexFieldMapping</code> objects that map GitHub repository attributes or field names
     * to Amazon Kendra index field names. To create custom fields, use the <code>UpdateIndex</code> API before you map
     * to GitHub fields. For more information, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html">Mapping data source fields</a>. The GitHub
     * data source field names must exist in your GitHub custom metadata.
     * </p>
     */
    private java.util.List<DataSourceToIndexFieldMapping> gitHubRepositoryConfigurationFieldMappings;
    /**
     * <p>
     * A list of <code>DataSourceToIndexFieldMapping</code> objects that map attributes or field names of GitHub commits
     * to Amazon Kendra index field names. To create custom fields, use the <code>UpdateIndex</code> API before you map
     * to GitHub fields. For more information, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html">Mapping data source fields</a>. The GitHub
     * data source field names must exist in your GitHub custom metadata.
     * </p>
     */
    private java.util.List<DataSourceToIndexFieldMapping> gitHubCommitConfigurationFieldMappings;
    /**
     * <p>
     * A list of <code>DataSourceToIndexFieldMapping</code> objects that map attributes or field names of GitHub issues
     * to Amazon Kendra index field names. To create custom fields, use the <code>UpdateIndex</code> API before you map
     * to GitHub fields. For more information, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html">Mapping data source fields</a>. The GitHub
     * data source field names must exist in your GitHub custom metadata.
     * </p>
     */
    private java.util.List<DataSourceToIndexFieldMapping> gitHubIssueDocumentConfigurationFieldMappings;
    /**
     * <p>
     * A list of <code>DataSourceToIndexFieldMapping</code> objects that map attributes or field names of GitHub issue
     * comments to Amazon Kendra index field names. To create custom fields, use the <code>UpdateIndex</code> API before
     * you map to GitHub fields. For more information, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html">Mapping data source fields</a>. The GitHub
     * data source field names must exist in your GitHub custom metadata.
     * </p>
     */
    private java.util.List<DataSourceToIndexFieldMapping> gitHubIssueCommentConfigurationFieldMappings;
    /**
     * <p>
     * A list of <code>DataSourceToIndexFieldMapping</code> objects that map attributes or field names of GitHub issue
     * attachments to Amazon Kendra index field names. To create custom fields, use the <code>UpdateIndex</code> API
     * before you map to GitHub fields. For more information, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html">Mapping data source fields</a>. The GitHub
     * data source field names must exist in your GitHub custom metadata.
     * </p>
     */
    private java.util.List<DataSourceToIndexFieldMapping> gitHubIssueAttachmentConfigurationFieldMappings;
    /**
     * <p>
     * A list of <code>DataSourceToIndexFieldMapping</code> objects that map attributes or field names of GitHub pull
     * request comments to Amazon Kendra index field names. To create custom fields, use the <code>UpdateIndex</code>
     * API before you map to GitHub fields. For more information, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html">Mapping data source fields</a>. The GitHub
     * data source field names must exist in your GitHub custom metadata.
     * </p>
     */
    private java.util.List<DataSourceToIndexFieldMapping> gitHubPullRequestCommentConfigurationFieldMappings;
    /**
     * <p>
     * A list of <code>DataSourceToIndexFieldMapping</code> objects that map attributes or field names of GitHub pull
     * requests to Amazon Kendra index field names. To create custom fields, use the <code>UpdateIndex</code> API before
     * you map to GitHub fields. For more information, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html">Mapping data source fields</a>. The GitHub
     * data source field names must exist in your GitHub custom metadata.
     * </p>
     */
    private java.util.List<DataSourceToIndexFieldMapping> gitHubPullRequestDocumentConfigurationFieldMappings;
    /**
     * <p>
     * A list of <code>DataSourceToIndexFieldMapping</code> objects that map attributes or field names of GitHub pull
     * request attachments to Amazon Kendra index field names. To create custom fields, use the <code>UpdateIndex</code>
     * API before you map to GitHub fields. For more information, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html">Mapping data source fields</a>. The GitHub
     * data source field names must exist in your GitHub custom metadata.
     * </p>
     */
    private java.util.List<DataSourceToIndexFieldMapping> gitHubPullRequestDocumentAttachmentConfigurationFieldMappings;

    /**
     * <p>
     * Configuration information to connect to GitHub Enterprise Cloud (SaaS).
     * </p>
     * 
     * @param saaSConfiguration
     *        Configuration information to connect to GitHub Enterprise Cloud (SaaS).
     */

    public void setSaaSConfiguration(SaaSConfiguration saaSConfiguration) {
        this.saaSConfiguration = saaSConfiguration;
    }

    /**
     * <p>
     * Configuration information to connect to GitHub Enterprise Cloud (SaaS).
     * </p>
     * 
     * @return Configuration information to connect to GitHub Enterprise Cloud (SaaS).
     */

    public SaaSConfiguration getSaaSConfiguration() {
        return this.saaSConfiguration;
    }

    /**
     * <p>
     * Configuration information to connect to GitHub Enterprise Cloud (SaaS).
     * </p>
     * 
     * @param saaSConfiguration
     *        Configuration information to connect to GitHub Enterprise Cloud (SaaS).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GitHubConfiguration withSaaSConfiguration(SaaSConfiguration saaSConfiguration) {
        setSaaSConfiguration(saaSConfiguration);
        return this;
    }

    /**
     * <p>
     * Configuration information to connect to GitHub Enterprise Server (on premises).
     * </p>
     * 
     * @param onPremiseConfiguration
     *        Configuration information to connect to GitHub Enterprise Server (on premises).
     */

    public void setOnPremiseConfiguration(OnPremiseConfiguration onPremiseConfiguration) {
        this.onPremiseConfiguration = onPremiseConfiguration;
    }

    /**
     * <p>
     * Configuration information to connect to GitHub Enterprise Server (on premises).
     * </p>
     * 
     * @return Configuration information to connect to GitHub Enterprise Server (on premises).
     */

    public OnPremiseConfiguration getOnPremiseConfiguration() {
        return this.onPremiseConfiguration;
    }

    /**
     * <p>
     * Configuration information to connect to GitHub Enterprise Server (on premises).
     * </p>
     * 
     * @param onPremiseConfiguration
     *        Configuration information to connect to GitHub Enterprise Server (on premises).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GitHubConfiguration withOnPremiseConfiguration(OnPremiseConfiguration onPremiseConfiguration) {
        setOnPremiseConfiguration(onPremiseConfiguration);
        return this;
    }

    /**
     * <p>
     * The type of GitHub service you want to connect to—GitHub Enterprise Cloud (SaaS) or GitHub Enterprise Server (on
     * premises).
     * </p>
     * 
     * @param type
     *        The type of GitHub service you want to connect to—GitHub Enterprise Cloud (SaaS) or GitHub Enterprise
     *        Server (on premises).
     * @see Type
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of GitHub service you want to connect to—GitHub Enterprise Cloud (SaaS) or GitHub Enterprise Server (on
     * premises).
     * </p>
     * 
     * @return The type of GitHub service you want to connect to—GitHub Enterprise Cloud (SaaS) or GitHub Enterprise
     *         Server (on premises).
     * @see Type
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of GitHub service you want to connect to—GitHub Enterprise Cloud (SaaS) or GitHub Enterprise Server (on
     * premises).
     * </p>
     * 
     * @param type
     *        The type of GitHub service you want to connect to—GitHub Enterprise Cloud (SaaS) or GitHub Enterprise
     *        Server (on premises).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Type
     */

    public GitHubConfiguration withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The type of GitHub service you want to connect to—GitHub Enterprise Cloud (SaaS) or GitHub Enterprise Server (on
     * premises).
     * </p>
     * 
     * @param type
     *        The type of GitHub service you want to connect to—GitHub Enterprise Cloud (SaaS) or GitHub Enterprise
     *        Server (on premises).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Type
     */

    public GitHubConfiguration withType(Type type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of an Secrets Manager secret that contains the key-value pairs required to connect
     * to your GitHub. The secret must contain a JSON structure with the following keys:
     * </p>
     * <ul>
     * <li>
     * <p>
     * personalToken—The access token created in GitHub. For more information on creating a token in GitHub, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/data-source-github.html">Using a GitHub data source</a>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param secretArn
     *        The Amazon Resource Name (ARN) of an Secrets Manager secret that contains the key-value pairs required to
     *        connect to your GitHub. The secret must contain a JSON structure with the following keys:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        personalToken—The access token created in GitHub. For more information on creating a token in GitHub, see
     *        <a href="https://docs.aws.amazon.com/kendra/latest/dg/data-source-github.html">Using a GitHub data
     *        source</a>.
     *        </p>
     *        </li>
     */

    public void setSecretArn(String secretArn) {
        this.secretArn = secretArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of an Secrets Manager secret that contains the key-value pairs required to connect
     * to your GitHub. The secret must contain a JSON structure with the following keys:
     * </p>
     * <ul>
     * <li>
     * <p>
     * personalToken—The access token created in GitHub. For more information on creating a token in GitHub, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/data-source-github.html">Using a GitHub data source</a>.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The Amazon Resource Name (ARN) of an Secrets Manager secret that contains the key-value pairs required to
     *         connect to your GitHub. The secret must contain a JSON structure with the following keys:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         personalToken—The access token created in GitHub. For more information on creating a token in GitHub, see
     *         <a href="https://docs.aws.amazon.com/kendra/latest/dg/data-source-github.html">Using a GitHub data
     *         source</a>.
     *         </p>
     *         </li>
     */

    public String getSecretArn() {
        return this.secretArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of an Secrets Manager secret that contains the key-value pairs required to connect
     * to your GitHub. The secret must contain a JSON structure with the following keys:
     * </p>
     * <ul>
     * <li>
     * <p>
     * personalToken—The access token created in GitHub. For more information on creating a token in GitHub, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/data-source-github.html">Using a GitHub data source</a>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param secretArn
     *        The Amazon Resource Name (ARN) of an Secrets Manager secret that contains the key-value pairs required to
     *        connect to your GitHub. The secret must contain a JSON structure with the following keys:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        personalToken—The access token created in GitHub. For more information on creating a token in GitHub, see
     *        <a href="https://docs.aws.amazon.com/kendra/latest/dg/data-source-github.html">Using a GitHub data
     *        source</a>.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GitHubConfiguration withSecretArn(String secretArn) {
        setSecretArn(secretArn);
        return this;
    }

    /**
     * <p>
     * <code>TRUE</code> to use the GitHub change log to determine which documents require updating in the index.
     * Depending on the GitHub change log's size, it may take longer for Amazon Kendra to use the change log than to
     * scan all of your documents in GitHub.
     * </p>
     * 
     * @param useChangeLog
     *        <code>TRUE</code> to use the GitHub change log to determine which documents require updating in the index.
     *        Depending on the GitHub change log's size, it may take longer for Amazon Kendra to use the change log than
     *        to scan all of your documents in GitHub.
     */

    public void setUseChangeLog(Boolean useChangeLog) {
        this.useChangeLog = useChangeLog;
    }

    /**
     * <p>
     * <code>TRUE</code> to use the GitHub change log to determine which documents require updating in the index.
     * Depending on the GitHub change log's size, it may take longer for Amazon Kendra to use the change log than to
     * scan all of your documents in GitHub.
     * </p>
     * 
     * @return <code>TRUE</code> to use the GitHub change log to determine which documents require updating in the
     *         index. Depending on the GitHub change log's size, it may take longer for Amazon Kendra to use the change
     *         log than to scan all of your documents in GitHub.
     */

    public Boolean getUseChangeLog() {
        return this.useChangeLog;
    }

    /**
     * <p>
     * <code>TRUE</code> to use the GitHub change log to determine which documents require updating in the index.
     * Depending on the GitHub change log's size, it may take longer for Amazon Kendra to use the change log than to
     * scan all of your documents in GitHub.
     * </p>
     * 
     * @param useChangeLog
     *        <code>TRUE</code> to use the GitHub change log to determine which documents require updating in the index.
     *        Depending on the GitHub change log's size, it may take longer for Amazon Kendra to use the change log than
     *        to scan all of your documents in GitHub.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GitHubConfiguration withUseChangeLog(Boolean useChangeLog) {
        setUseChangeLog(useChangeLog);
        return this;
    }

    /**
     * <p>
     * <code>TRUE</code> to use the GitHub change log to determine which documents require updating in the index.
     * Depending on the GitHub change log's size, it may take longer for Amazon Kendra to use the change log than to
     * scan all of your documents in GitHub.
     * </p>
     * 
     * @return <code>TRUE</code> to use the GitHub change log to determine which documents require updating in the
     *         index. Depending on the GitHub change log's size, it may take longer for Amazon Kendra to use the change
     *         log than to scan all of your documents in GitHub.
     */

    public Boolean isUseChangeLog() {
        return this.useChangeLog;
    }

    /**
     * <p>
     * Configuration information to include certain types of GitHub content. You can configure to index repository files
     * only, or also include issues and pull requests, comments, and comment attachments.
     * </p>
     * 
     * @param gitHubDocumentCrawlProperties
     *        Configuration information to include certain types of GitHub content. You can configure to index
     *        repository files only, or also include issues and pull requests, comments, and comment attachments.
     */

    public void setGitHubDocumentCrawlProperties(GitHubDocumentCrawlProperties gitHubDocumentCrawlProperties) {
        this.gitHubDocumentCrawlProperties = gitHubDocumentCrawlProperties;
    }

    /**
     * <p>
     * Configuration information to include certain types of GitHub content. You can configure to index repository files
     * only, or also include issues and pull requests, comments, and comment attachments.
     * </p>
     * 
     * @return Configuration information to include certain types of GitHub content. You can configure to index
     *         repository files only, or also include issues and pull requests, comments, and comment attachments.
     */

    public GitHubDocumentCrawlProperties getGitHubDocumentCrawlProperties() {
        return this.gitHubDocumentCrawlProperties;
    }

    /**
     * <p>
     * Configuration information to include certain types of GitHub content. You can configure to index repository files
     * only, or also include issues and pull requests, comments, and comment attachments.
     * </p>
     * 
     * @param gitHubDocumentCrawlProperties
     *        Configuration information to include certain types of GitHub content. You can configure to index
     *        repository files only, or also include issues and pull requests, comments, and comment attachments.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GitHubConfiguration withGitHubDocumentCrawlProperties(GitHubDocumentCrawlProperties gitHubDocumentCrawlProperties) {
        setGitHubDocumentCrawlProperties(gitHubDocumentCrawlProperties);
        return this;
    }

    /**
     * <p>
     * A list of names of the specific repositories you want to index.
     * </p>
     * 
     * @return A list of names of the specific repositories you want to index.
     */

    public java.util.List<String> getRepositoryFilter() {
        return repositoryFilter;
    }

    /**
     * <p>
     * A list of names of the specific repositories you want to index.
     * </p>
     * 
     * @param repositoryFilter
     *        A list of names of the specific repositories you want to index.
     */

    public void setRepositoryFilter(java.util.Collection<String> repositoryFilter) {
        if (repositoryFilter == null) {
            this.repositoryFilter = null;
            return;
        }

        this.repositoryFilter = new java.util.ArrayList<String>(repositoryFilter);
    }

    /**
     * <p>
     * A list of names of the specific repositories you want to index.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRepositoryFilter(java.util.Collection)} or {@link #withRepositoryFilter(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param repositoryFilter
     *        A list of names of the specific repositories you want to index.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GitHubConfiguration withRepositoryFilter(String... repositoryFilter) {
        if (this.repositoryFilter == null) {
            setRepositoryFilter(new java.util.ArrayList<String>(repositoryFilter.length));
        }
        for (String ele : repositoryFilter) {
            this.repositoryFilter.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of names of the specific repositories you want to index.
     * </p>
     * 
     * @param repositoryFilter
     *        A list of names of the specific repositories you want to index.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GitHubConfiguration withRepositoryFilter(java.util.Collection<String> repositoryFilter) {
        setRepositoryFilter(repositoryFilter);
        return this;
    }

    /**
     * <p>
     * A list of regular expression patterns to include certain folder names in your GitHub repository or repositories.
     * Folder names that match the patterns are included in the index. Folder names that don't match the patterns are
     * excluded from the index. If a folder matches both an inclusion and exclusion pattern, the exclusion pattern takes
     * precedence and the folder isn't included in the index.
     * </p>
     * 
     * @return A list of regular expression patterns to include certain folder names in your GitHub repository or
     *         repositories. Folder names that match the patterns are included in the index. Folder names that don't
     *         match the patterns are excluded from the index. If a folder matches both an inclusion and exclusion
     *         pattern, the exclusion pattern takes precedence and the folder isn't included in the index.
     */

    public java.util.List<String> getInclusionFolderNamePatterns() {
        return inclusionFolderNamePatterns;
    }

    /**
     * <p>
     * A list of regular expression patterns to include certain folder names in your GitHub repository or repositories.
     * Folder names that match the patterns are included in the index. Folder names that don't match the patterns are
     * excluded from the index. If a folder matches both an inclusion and exclusion pattern, the exclusion pattern takes
     * precedence and the folder isn't included in the index.
     * </p>
     * 
     * @param inclusionFolderNamePatterns
     *        A list of regular expression patterns to include certain folder names in your GitHub repository or
     *        repositories. Folder names that match the patterns are included in the index. Folder names that don't
     *        match the patterns are excluded from the index. If a folder matches both an inclusion and exclusion
     *        pattern, the exclusion pattern takes precedence and the folder isn't included in the index.
     */

    public void setInclusionFolderNamePatterns(java.util.Collection<String> inclusionFolderNamePatterns) {
        if (inclusionFolderNamePatterns == null) {
            this.inclusionFolderNamePatterns = null;
            return;
        }

        this.inclusionFolderNamePatterns = new java.util.ArrayList<String>(inclusionFolderNamePatterns);
    }

    /**
     * <p>
     * A list of regular expression patterns to include certain folder names in your GitHub repository or repositories.
     * Folder names that match the patterns are included in the index. Folder names that don't match the patterns are
     * excluded from the index. If a folder matches both an inclusion and exclusion pattern, the exclusion pattern takes
     * precedence and the folder isn't included in the index.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setInclusionFolderNamePatterns(java.util.Collection)} or
     * {@link #withInclusionFolderNamePatterns(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param inclusionFolderNamePatterns
     *        A list of regular expression patterns to include certain folder names in your GitHub repository or
     *        repositories. Folder names that match the patterns are included in the index. Folder names that don't
     *        match the patterns are excluded from the index. If a folder matches both an inclusion and exclusion
     *        pattern, the exclusion pattern takes precedence and the folder isn't included in the index.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GitHubConfiguration withInclusionFolderNamePatterns(String... inclusionFolderNamePatterns) {
        if (this.inclusionFolderNamePatterns == null) {
            setInclusionFolderNamePatterns(new java.util.ArrayList<String>(inclusionFolderNamePatterns.length));
        }
        for (String ele : inclusionFolderNamePatterns) {
            this.inclusionFolderNamePatterns.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of regular expression patterns to include certain folder names in your GitHub repository or repositories.
     * Folder names that match the patterns are included in the index. Folder names that don't match the patterns are
     * excluded from the index. If a folder matches both an inclusion and exclusion pattern, the exclusion pattern takes
     * precedence and the folder isn't included in the index.
     * </p>
     * 
     * @param inclusionFolderNamePatterns
     *        A list of regular expression patterns to include certain folder names in your GitHub repository or
     *        repositories. Folder names that match the patterns are included in the index. Folder names that don't
     *        match the patterns are excluded from the index. If a folder matches both an inclusion and exclusion
     *        pattern, the exclusion pattern takes precedence and the folder isn't included in the index.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GitHubConfiguration withInclusionFolderNamePatterns(java.util.Collection<String> inclusionFolderNamePatterns) {
        setInclusionFolderNamePatterns(inclusionFolderNamePatterns);
        return this;
    }

    /**
     * <p>
     * A list of regular expression patterns to include certain file types in your GitHub repository or repositories.
     * File types that match the patterns are included in the index. File types that don't match the patterns are
     * excluded from the index. If a file matches both an inclusion and exclusion pattern, the exclusion pattern takes
     * precedence and the file isn't included in the index.
     * </p>
     * 
     * @return A list of regular expression patterns to include certain file types in your GitHub repository or
     *         repositories. File types that match the patterns are included in the index. File types that don't match
     *         the patterns are excluded from the index. If a file matches both an inclusion and exclusion pattern, the
     *         exclusion pattern takes precedence and the file isn't included in the index.
     */

    public java.util.List<String> getInclusionFileTypePatterns() {
        return inclusionFileTypePatterns;
    }

    /**
     * <p>
     * A list of regular expression patterns to include certain file types in your GitHub repository or repositories.
     * File types that match the patterns are included in the index. File types that don't match the patterns are
     * excluded from the index. If a file matches both an inclusion and exclusion pattern, the exclusion pattern takes
     * precedence and the file isn't included in the index.
     * </p>
     * 
     * @param inclusionFileTypePatterns
     *        A list of regular expression patterns to include certain file types in your GitHub repository or
     *        repositories. File types that match the patterns are included in the index. File types that don't match
     *        the patterns are excluded from the index. If a file matches both an inclusion and exclusion pattern, the
     *        exclusion pattern takes precedence and the file isn't included in the index.
     */

    public void setInclusionFileTypePatterns(java.util.Collection<String> inclusionFileTypePatterns) {
        if (inclusionFileTypePatterns == null) {
            this.inclusionFileTypePatterns = null;
            return;
        }

        this.inclusionFileTypePatterns = new java.util.ArrayList<String>(inclusionFileTypePatterns);
    }

    /**
     * <p>
     * A list of regular expression patterns to include certain file types in your GitHub repository or repositories.
     * File types that match the patterns are included in the index. File types that don't match the patterns are
     * excluded from the index. If a file matches both an inclusion and exclusion pattern, the exclusion pattern takes
     * precedence and the file isn't included in the index.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setInclusionFileTypePatterns(java.util.Collection)} or
     * {@link #withInclusionFileTypePatterns(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param inclusionFileTypePatterns
     *        A list of regular expression patterns to include certain file types in your GitHub repository or
     *        repositories. File types that match the patterns are included in the index. File types that don't match
     *        the patterns are excluded from the index. If a file matches both an inclusion and exclusion pattern, the
     *        exclusion pattern takes precedence and the file isn't included in the index.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GitHubConfiguration withInclusionFileTypePatterns(String... inclusionFileTypePatterns) {
        if (this.inclusionFileTypePatterns == null) {
            setInclusionFileTypePatterns(new java.util.ArrayList<String>(inclusionFileTypePatterns.length));
        }
        for (String ele : inclusionFileTypePatterns) {
            this.inclusionFileTypePatterns.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of regular expression patterns to include certain file types in your GitHub repository or repositories.
     * File types that match the patterns are included in the index. File types that don't match the patterns are
     * excluded from the index. If a file matches both an inclusion and exclusion pattern, the exclusion pattern takes
     * precedence and the file isn't included in the index.
     * </p>
     * 
     * @param inclusionFileTypePatterns
     *        A list of regular expression patterns to include certain file types in your GitHub repository or
     *        repositories. File types that match the patterns are included in the index. File types that don't match
     *        the patterns are excluded from the index. If a file matches both an inclusion and exclusion pattern, the
     *        exclusion pattern takes precedence and the file isn't included in the index.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GitHubConfiguration withInclusionFileTypePatterns(java.util.Collection<String> inclusionFileTypePatterns) {
        setInclusionFileTypePatterns(inclusionFileTypePatterns);
        return this;
    }

    /**
     * <p>
     * A list of regular expression patterns to include certain file names in your GitHub repository or repositories.
     * File names that match the patterns are included in the index. File names that don't match the patterns are
     * excluded from the index. If a file matches both an inclusion and exclusion pattern, the exclusion pattern takes
     * precedence and the file isn't included in the index.
     * </p>
     * 
     * @return A list of regular expression patterns to include certain file names in your GitHub repository or
     *         repositories. File names that match the patterns are included in the index. File names that don't match
     *         the patterns are excluded from the index. If a file matches both an inclusion and exclusion pattern, the
     *         exclusion pattern takes precedence and the file isn't included in the index.
     */

    public java.util.List<String> getInclusionFileNamePatterns() {
        return inclusionFileNamePatterns;
    }

    /**
     * <p>
     * A list of regular expression patterns to include certain file names in your GitHub repository or repositories.
     * File names that match the patterns are included in the index. File names that don't match the patterns are
     * excluded from the index. If a file matches both an inclusion and exclusion pattern, the exclusion pattern takes
     * precedence and the file isn't included in the index.
     * </p>
     * 
     * @param inclusionFileNamePatterns
     *        A list of regular expression patterns to include certain file names in your GitHub repository or
     *        repositories. File names that match the patterns are included in the index. File names that don't match
     *        the patterns are excluded from the index. If a file matches both an inclusion and exclusion pattern, the
     *        exclusion pattern takes precedence and the file isn't included in the index.
     */

    public void setInclusionFileNamePatterns(java.util.Collection<String> inclusionFileNamePatterns) {
        if (inclusionFileNamePatterns == null) {
            this.inclusionFileNamePatterns = null;
            return;
        }

        this.inclusionFileNamePatterns = new java.util.ArrayList<String>(inclusionFileNamePatterns);
    }

    /**
     * <p>
     * A list of regular expression patterns to include certain file names in your GitHub repository or repositories.
     * File names that match the patterns are included in the index. File names that don't match the patterns are
     * excluded from the index. If a file matches both an inclusion and exclusion pattern, the exclusion pattern takes
     * precedence and the file isn't included in the index.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setInclusionFileNamePatterns(java.util.Collection)} or
     * {@link #withInclusionFileNamePatterns(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param inclusionFileNamePatterns
     *        A list of regular expression patterns to include certain file names in your GitHub repository or
     *        repositories. File names that match the patterns are included in the index. File names that don't match
     *        the patterns are excluded from the index. If a file matches both an inclusion and exclusion pattern, the
     *        exclusion pattern takes precedence and the file isn't included in the index.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GitHubConfiguration withInclusionFileNamePatterns(String... inclusionFileNamePatterns) {
        if (this.inclusionFileNamePatterns == null) {
            setInclusionFileNamePatterns(new java.util.ArrayList<String>(inclusionFileNamePatterns.length));
        }
        for (String ele : inclusionFileNamePatterns) {
            this.inclusionFileNamePatterns.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of regular expression patterns to include certain file names in your GitHub repository or repositories.
     * File names that match the patterns are included in the index. File names that don't match the patterns are
     * excluded from the index. If a file matches both an inclusion and exclusion pattern, the exclusion pattern takes
     * precedence and the file isn't included in the index.
     * </p>
     * 
     * @param inclusionFileNamePatterns
     *        A list of regular expression patterns to include certain file names in your GitHub repository or
     *        repositories. File names that match the patterns are included in the index. File names that don't match
     *        the patterns are excluded from the index. If a file matches both an inclusion and exclusion pattern, the
     *        exclusion pattern takes precedence and the file isn't included in the index.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GitHubConfiguration withInclusionFileNamePatterns(java.util.Collection<String> inclusionFileNamePatterns) {
        setInclusionFileNamePatterns(inclusionFileNamePatterns);
        return this;
    }

    /**
     * <p>
     * A list of regular expression patterns to exclude certain folder names in your GitHub repository or repositories.
     * Folder names that match the patterns are excluded from the index. Folder names that don't match the patterns are
     * included in the index. If a folder matches both an exclusion and inclusion pattern, the exclusion pattern takes
     * precedence and the folder isn't included in the index.
     * </p>
     * 
     * @return A list of regular expression patterns to exclude certain folder names in your GitHub repository or
     *         repositories. Folder names that match the patterns are excluded from the index. Folder names that don't
     *         match the patterns are included in the index. If a folder matches both an exclusion and inclusion
     *         pattern, the exclusion pattern takes precedence and the folder isn't included in the index.
     */

    public java.util.List<String> getExclusionFolderNamePatterns() {
        return exclusionFolderNamePatterns;
    }

    /**
     * <p>
     * A list of regular expression patterns to exclude certain folder names in your GitHub repository or repositories.
     * Folder names that match the patterns are excluded from the index. Folder names that don't match the patterns are
     * included in the index. If a folder matches both an exclusion and inclusion pattern, the exclusion pattern takes
     * precedence and the folder isn't included in the index.
     * </p>
     * 
     * @param exclusionFolderNamePatterns
     *        A list of regular expression patterns to exclude certain folder names in your GitHub repository or
     *        repositories. Folder names that match the patterns are excluded from the index. Folder names that don't
     *        match the patterns are included in the index. If a folder matches both an exclusion and inclusion pattern,
     *        the exclusion pattern takes precedence and the folder isn't included in the index.
     */

    public void setExclusionFolderNamePatterns(java.util.Collection<String> exclusionFolderNamePatterns) {
        if (exclusionFolderNamePatterns == null) {
            this.exclusionFolderNamePatterns = null;
            return;
        }

        this.exclusionFolderNamePatterns = new java.util.ArrayList<String>(exclusionFolderNamePatterns);
    }

    /**
     * <p>
     * A list of regular expression patterns to exclude certain folder names in your GitHub repository or repositories.
     * Folder names that match the patterns are excluded from the index. Folder names that don't match the patterns are
     * included in the index. If a folder matches both an exclusion and inclusion pattern, the exclusion pattern takes
     * precedence and the folder isn't included in the index.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setExclusionFolderNamePatterns(java.util.Collection)} or
     * {@link #withExclusionFolderNamePatterns(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param exclusionFolderNamePatterns
     *        A list of regular expression patterns to exclude certain folder names in your GitHub repository or
     *        repositories. Folder names that match the patterns are excluded from the index. Folder names that don't
     *        match the patterns are included in the index. If a folder matches both an exclusion and inclusion pattern,
     *        the exclusion pattern takes precedence and the folder isn't included in the index.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GitHubConfiguration withExclusionFolderNamePatterns(String... exclusionFolderNamePatterns) {
        if (this.exclusionFolderNamePatterns == null) {
            setExclusionFolderNamePatterns(new java.util.ArrayList<String>(exclusionFolderNamePatterns.length));
        }
        for (String ele : exclusionFolderNamePatterns) {
            this.exclusionFolderNamePatterns.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of regular expression patterns to exclude certain folder names in your GitHub repository or repositories.
     * Folder names that match the patterns are excluded from the index. Folder names that don't match the patterns are
     * included in the index. If a folder matches both an exclusion and inclusion pattern, the exclusion pattern takes
     * precedence and the folder isn't included in the index.
     * </p>
     * 
     * @param exclusionFolderNamePatterns
     *        A list of regular expression patterns to exclude certain folder names in your GitHub repository or
     *        repositories. Folder names that match the patterns are excluded from the index. Folder names that don't
     *        match the patterns are included in the index. If a folder matches both an exclusion and inclusion pattern,
     *        the exclusion pattern takes precedence and the folder isn't included in the index.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GitHubConfiguration withExclusionFolderNamePatterns(java.util.Collection<String> exclusionFolderNamePatterns) {
        setExclusionFolderNamePatterns(exclusionFolderNamePatterns);
        return this;
    }

    /**
     * <p>
     * A list of regular expression patterns to exclude certain file types in your GitHub repository or repositories.
     * File types that match the patterns are excluded from the index. File types that don't match the patterns are
     * included in the index. If a file matches both an exclusion and inclusion pattern, the exclusion pattern takes
     * precedence and the file isn't included in the index.
     * </p>
     * 
     * @return A list of regular expression patterns to exclude certain file types in your GitHub repository or
     *         repositories. File types that match the patterns are excluded from the index. File types that don't match
     *         the patterns are included in the index. If a file matches both an exclusion and inclusion pattern, the
     *         exclusion pattern takes precedence and the file isn't included in the index.
     */

    public java.util.List<String> getExclusionFileTypePatterns() {
        return exclusionFileTypePatterns;
    }

    /**
     * <p>
     * A list of regular expression patterns to exclude certain file types in your GitHub repository or repositories.
     * File types that match the patterns are excluded from the index. File types that don't match the patterns are
     * included in the index. If a file matches both an exclusion and inclusion pattern, the exclusion pattern takes
     * precedence and the file isn't included in the index.
     * </p>
     * 
     * @param exclusionFileTypePatterns
     *        A list of regular expression patterns to exclude certain file types in your GitHub repository or
     *        repositories. File types that match the patterns are excluded from the index. File types that don't match
     *        the patterns are included in the index. If a file matches both an exclusion and inclusion pattern, the
     *        exclusion pattern takes precedence and the file isn't included in the index.
     */

    public void setExclusionFileTypePatterns(java.util.Collection<String> exclusionFileTypePatterns) {
        if (exclusionFileTypePatterns == null) {
            this.exclusionFileTypePatterns = null;
            return;
        }

        this.exclusionFileTypePatterns = new java.util.ArrayList<String>(exclusionFileTypePatterns);
    }

    /**
     * <p>
     * A list of regular expression patterns to exclude certain file types in your GitHub repository or repositories.
     * File types that match the patterns are excluded from the index. File types that don't match the patterns are
     * included in the index. If a file matches both an exclusion and inclusion pattern, the exclusion pattern takes
     * precedence and the file isn't included in the index.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setExclusionFileTypePatterns(java.util.Collection)} or
     * {@link #withExclusionFileTypePatterns(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param exclusionFileTypePatterns
     *        A list of regular expression patterns to exclude certain file types in your GitHub repository or
     *        repositories. File types that match the patterns are excluded from the index. File types that don't match
     *        the patterns are included in the index. If a file matches both an exclusion and inclusion pattern, the
     *        exclusion pattern takes precedence and the file isn't included in the index.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GitHubConfiguration withExclusionFileTypePatterns(String... exclusionFileTypePatterns) {
        if (this.exclusionFileTypePatterns == null) {
            setExclusionFileTypePatterns(new java.util.ArrayList<String>(exclusionFileTypePatterns.length));
        }
        for (String ele : exclusionFileTypePatterns) {
            this.exclusionFileTypePatterns.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of regular expression patterns to exclude certain file types in your GitHub repository or repositories.
     * File types that match the patterns are excluded from the index. File types that don't match the patterns are
     * included in the index. If a file matches both an exclusion and inclusion pattern, the exclusion pattern takes
     * precedence and the file isn't included in the index.
     * </p>
     * 
     * @param exclusionFileTypePatterns
     *        A list of regular expression patterns to exclude certain file types in your GitHub repository or
     *        repositories. File types that match the patterns are excluded from the index. File types that don't match
     *        the patterns are included in the index. If a file matches both an exclusion and inclusion pattern, the
     *        exclusion pattern takes precedence and the file isn't included in the index.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GitHubConfiguration withExclusionFileTypePatterns(java.util.Collection<String> exclusionFileTypePatterns) {
        setExclusionFileTypePatterns(exclusionFileTypePatterns);
        return this;
    }

    /**
     * <p>
     * A list of regular expression patterns to exclude certain file names in your GitHub repository or repositories.
     * File names that match the patterns are excluded from the index. File names that don't match the patterns are
     * included in the index. If a file matches both an exclusion and inclusion pattern, the exclusion pattern takes
     * precedence and the file isn't included in the index.
     * </p>
     * 
     * @return A list of regular expression patterns to exclude certain file names in your GitHub repository or
     *         repositories. File names that match the patterns are excluded from the index. File names that don't match
     *         the patterns are included in the index. If a file matches both an exclusion and inclusion pattern, the
     *         exclusion pattern takes precedence and the file isn't included in the index.
     */

    public java.util.List<String> getExclusionFileNamePatterns() {
        return exclusionFileNamePatterns;
    }

    /**
     * <p>
     * A list of regular expression patterns to exclude certain file names in your GitHub repository or repositories.
     * File names that match the patterns are excluded from the index. File names that don't match the patterns are
     * included in the index. If a file matches both an exclusion and inclusion pattern, the exclusion pattern takes
     * precedence and the file isn't included in the index.
     * </p>
     * 
     * @param exclusionFileNamePatterns
     *        A list of regular expression patterns to exclude certain file names in your GitHub repository or
     *        repositories. File names that match the patterns are excluded from the index. File names that don't match
     *        the patterns are included in the index. If a file matches both an exclusion and inclusion pattern, the
     *        exclusion pattern takes precedence and the file isn't included in the index.
     */

    public void setExclusionFileNamePatterns(java.util.Collection<String> exclusionFileNamePatterns) {
        if (exclusionFileNamePatterns == null) {
            this.exclusionFileNamePatterns = null;
            return;
        }

        this.exclusionFileNamePatterns = new java.util.ArrayList<String>(exclusionFileNamePatterns);
    }

    /**
     * <p>
     * A list of regular expression patterns to exclude certain file names in your GitHub repository or repositories.
     * File names that match the patterns are excluded from the index. File names that don't match the patterns are
     * included in the index. If a file matches both an exclusion and inclusion pattern, the exclusion pattern takes
     * precedence and the file isn't included in the index.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setExclusionFileNamePatterns(java.util.Collection)} or
     * {@link #withExclusionFileNamePatterns(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param exclusionFileNamePatterns
     *        A list of regular expression patterns to exclude certain file names in your GitHub repository or
     *        repositories. File names that match the patterns are excluded from the index. File names that don't match
     *        the patterns are included in the index. If a file matches both an exclusion and inclusion pattern, the
     *        exclusion pattern takes precedence and the file isn't included in the index.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GitHubConfiguration withExclusionFileNamePatterns(String... exclusionFileNamePatterns) {
        if (this.exclusionFileNamePatterns == null) {
            setExclusionFileNamePatterns(new java.util.ArrayList<String>(exclusionFileNamePatterns.length));
        }
        for (String ele : exclusionFileNamePatterns) {
            this.exclusionFileNamePatterns.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of regular expression patterns to exclude certain file names in your GitHub repository or repositories.
     * File names that match the patterns are excluded from the index. File names that don't match the patterns are
     * included in the index. If a file matches both an exclusion and inclusion pattern, the exclusion pattern takes
     * precedence and the file isn't included in the index.
     * </p>
     * 
     * @param exclusionFileNamePatterns
     *        A list of regular expression patterns to exclude certain file names in your GitHub repository or
     *        repositories. File names that match the patterns are excluded from the index. File names that don't match
     *        the patterns are included in the index. If a file matches both an exclusion and inclusion pattern, the
     *        exclusion pattern takes precedence and the file isn't included in the index.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GitHubConfiguration withExclusionFileNamePatterns(java.util.Collection<String> exclusionFileNamePatterns) {
        setExclusionFileNamePatterns(exclusionFileNamePatterns);
        return this;
    }

    /**
     * <p>
     * Configuration information of an Amazon Virtual Private Cloud to connect to your GitHub. For more information, see
     * <a href="https://docs.aws.amazon.com/kendra/latest/dg/vpc-configuration.html">Configuring a VPC</a>.
     * </p>
     * 
     * @param vpcConfiguration
     *        Configuration information of an Amazon Virtual Private Cloud to connect to your GitHub. For more
     *        information, see <a href="https://docs.aws.amazon.com/kendra/latest/dg/vpc-configuration.html">Configuring
     *        a VPC</a>.
     */

    public void setVpcConfiguration(DataSourceVpcConfiguration vpcConfiguration) {
        this.vpcConfiguration = vpcConfiguration;
    }

    /**
     * <p>
     * Configuration information of an Amazon Virtual Private Cloud to connect to your GitHub. For more information, see
     * <a href="https://docs.aws.amazon.com/kendra/latest/dg/vpc-configuration.html">Configuring a VPC</a>.
     * </p>
     * 
     * @return Configuration information of an Amazon Virtual Private Cloud to connect to your GitHub. For more
     *         information, see <a
     *         href="https://docs.aws.amazon.com/kendra/latest/dg/vpc-configuration.html">Configuring a VPC</a>.
     */

    public DataSourceVpcConfiguration getVpcConfiguration() {
        return this.vpcConfiguration;
    }

    /**
     * <p>
     * Configuration information of an Amazon Virtual Private Cloud to connect to your GitHub. For more information, see
     * <a href="https://docs.aws.amazon.com/kendra/latest/dg/vpc-configuration.html">Configuring a VPC</a>.
     * </p>
     * 
     * @param vpcConfiguration
     *        Configuration information of an Amazon Virtual Private Cloud to connect to your GitHub. For more
     *        information, see <a href="https://docs.aws.amazon.com/kendra/latest/dg/vpc-configuration.html">Configuring
     *        a VPC</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GitHubConfiguration withVpcConfiguration(DataSourceVpcConfiguration vpcConfiguration) {
        setVpcConfiguration(vpcConfiguration);
        return this;
    }

    /**
     * <p>
     * A list of <code>DataSourceToIndexFieldMapping</code> objects that map GitHub repository attributes or field names
     * to Amazon Kendra index field names. To create custom fields, use the <code>UpdateIndex</code> API before you map
     * to GitHub fields. For more information, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html">Mapping data source fields</a>. The GitHub
     * data source field names must exist in your GitHub custom metadata.
     * </p>
     * 
     * @return A list of <code>DataSourceToIndexFieldMapping</code> objects that map GitHub repository attributes or
     *         field names to Amazon Kendra index field names. To create custom fields, use the <code>UpdateIndex</code>
     *         API before you map to GitHub fields. For more information, see <a
     *         href="https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html">Mapping data source fields</a>.
     *         The GitHub data source field names must exist in your GitHub custom metadata.
     */

    public java.util.List<DataSourceToIndexFieldMapping> getGitHubRepositoryConfigurationFieldMappings() {
        return gitHubRepositoryConfigurationFieldMappings;
    }

    /**
     * <p>
     * A list of <code>DataSourceToIndexFieldMapping</code> objects that map GitHub repository attributes or field names
     * to Amazon Kendra index field names. To create custom fields, use the <code>UpdateIndex</code> API before you map
     * to GitHub fields. For more information, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html">Mapping data source fields</a>. The GitHub
     * data source field names must exist in your GitHub custom metadata.
     * </p>
     * 
     * @param gitHubRepositoryConfigurationFieldMappings
     *        A list of <code>DataSourceToIndexFieldMapping</code> objects that map GitHub repository attributes or
     *        field names to Amazon Kendra index field names. To create custom fields, use the <code>UpdateIndex</code>
     *        API before you map to GitHub fields. For more information, see <a
     *        href="https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html">Mapping data source fields</a>. The
     *        GitHub data source field names must exist in your GitHub custom metadata.
     */

    public void setGitHubRepositoryConfigurationFieldMappings(java.util.Collection<DataSourceToIndexFieldMapping> gitHubRepositoryConfigurationFieldMappings) {
        if (gitHubRepositoryConfigurationFieldMappings == null) {
            this.gitHubRepositoryConfigurationFieldMappings = null;
            return;
        }

        this.gitHubRepositoryConfigurationFieldMappings = new java.util.ArrayList<DataSourceToIndexFieldMapping>(gitHubRepositoryConfigurationFieldMappings);
    }

    /**
     * <p>
     * A list of <code>DataSourceToIndexFieldMapping</code> objects that map GitHub repository attributes or field names
     * to Amazon Kendra index field names. To create custom fields, use the <code>UpdateIndex</code> API before you map
     * to GitHub fields. For more information, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html">Mapping data source fields</a>. The GitHub
     * data source field names must exist in your GitHub custom metadata.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setGitHubRepositoryConfigurationFieldMappings(java.util.Collection)} or
     * {@link #withGitHubRepositoryConfigurationFieldMappings(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param gitHubRepositoryConfigurationFieldMappings
     *        A list of <code>DataSourceToIndexFieldMapping</code> objects that map GitHub repository attributes or
     *        field names to Amazon Kendra index field names. To create custom fields, use the <code>UpdateIndex</code>
     *        API before you map to GitHub fields. For more information, see <a
     *        href="https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html">Mapping data source fields</a>. The
     *        GitHub data source field names must exist in your GitHub custom metadata.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GitHubConfiguration withGitHubRepositoryConfigurationFieldMappings(DataSourceToIndexFieldMapping... gitHubRepositoryConfigurationFieldMappings) {
        if (this.gitHubRepositoryConfigurationFieldMappings == null) {
            setGitHubRepositoryConfigurationFieldMappings(new java.util.ArrayList<DataSourceToIndexFieldMapping>(
                    gitHubRepositoryConfigurationFieldMappings.length));
        }
        for (DataSourceToIndexFieldMapping ele : gitHubRepositoryConfigurationFieldMappings) {
            this.gitHubRepositoryConfigurationFieldMappings.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of <code>DataSourceToIndexFieldMapping</code> objects that map GitHub repository attributes or field names
     * to Amazon Kendra index field names. To create custom fields, use the <code>UpdateIndex</code> API before you map
     * to GitHub fields. For more information, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html">Mapping data source fields</a>. The GitHub
     * data source field names must exist in your GitHub custom metadata.
     * </p>
     * 
     * @param gitHubRepositoryConfigurationFieldMappings
     *        A list of <code>DataSourceToIndexFieldMapping</code> objects that map GitHub repository attributes or
     *        field names to Amazon Kendra index field names. To create custom fields, use the <code>UpdateIndex</code>
     *        API before you map to GitHub fields. For more information, see <a
     *        href="https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html">Mapping data source fields</a>. The
     *        GitHub data source field names must exist in your GitHub custom metadata.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GitHubConfiguration withGitHubRepositoryConfigurationFieldMappings(
            java.util.Collection<DataSourceToIndexFieldMapping> gitHubRepositoryConfigurationFieldMappings) {
        setGitHubRepositoryConfigurationFieldMappings(gitHubRepositoryConfigurationFieldMappings);
        return this;
    }

    /**
     * <p>
     * A list of <code>DataSourceToIndexFieldMapping</code> objects that map attributes or field names of GitHub commits
     * to Amazon Kendra index field names. To create custom fields, use the <code>UpdateIndex</code> API before you map
     * to GitHub fields. For more information, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html">Mapping data source fields</a>. The GitHub
     * data source field names must exist in your GitHub custom metadata.
     * </p>
     * 
     * @return A list of <code>DataSourceToIndexFieldMapping</code> objects that map attributes or field names of GitHub
     *         commits to Amazon Kendra index field names. To create custom fields, use the <code>UpdateIndex</code> API
     *         before you map to GitHub fields. For more information, see <a
     *         href="https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html">Mapping data source fields</a>.
     *         The GitHub data source field names must exist in your GitHub custom metadata.
     */

    public java.util.List<DataSourceToIndexFieldMapping> getGitHubCommitConfigurationFieldMappings() {
        return gitHubCommitConfigurationFieldMappings;
    }

    /**
     * <p>
     * A list of <code>DataSourceToIndexFieldMapping</code> objects that map attributes or field names of GitHub commits
     * to Amazon Kendra index field names. To create custom fields, use the <code>UpdateIndex</code> API before you map
     * to GitHub fields. For more information, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html">Mapping data source fields</a>. The GitHub
     * data source field names must exist in your GitHub custom metadata.
     * </p>
     * 
     * @param gitHubCommitConfigurationFieldMappings
     *        A list of <code>DataSourceToIndexFieldMapping</code> objects that map attributes or field names of GitHub
     *        commits to Amazon Kendra index field names. To create custom fields, use the <code>UpdateIndex</code> API
     *        before you map to GitHub fields. For more information, see <a
     *        href="https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html">Mapping data source fields</a>. The
     *        GitHub data source field names must exist in your GitHub custom metadata.
     */

    public void setGitHubCommitConfigurationFieldMappings(java.util.Collection<DataSourceToIndexFieldMapping> gitHubCommitConfigurationFieldMappings) {
        if (gitHubCommitConfigurationFieldMappings == null) {
            this.gitHubCommitConfigurationFieldMappings = null;
            return;
        }

        this.gitHubCommitConfigurationFieldMappings = new java.util.ArrayList<DataSourceToIndexFieldMapping>(gitHubCommitConfigurationFieldMappings);
    }

    /**
     * <p>
     * A list of <code>DataSourceToIndexFieldMapping</code> objects that map attributes or field names of GitHub commits
     * to Amazon Kendra index field names. To create custom fields, use the <code>UpdateIndex</code> API before you map
     * to GitHub fields. For more information, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html">Mapping data source fields</a>. The GitHub
     * data source field names must exist in your GitHub custom metadata.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setGitHubCommitConfigurationFieldMappings(java.util.Collection)} or
     * {@link #withGitHubCommitConfigurationFieldMappings(java.util.Collection)} if you want to override the existing
     * values.
     * </p>
     * 
     * @param gitHubCommitConfigurationFieldMappings
     *        A list of <code>DataSourceToIndexFieldMapping</code> objects that map attributes or field names of GitHub
     *        commits to Amazon Kendra index field names. To create custom fields, use the <code>UpdateIndex</code> API
     *        before you map to GitHub fields. For more information, see <a
     *        href="https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html">Mapping data source fields</a>. The
     *        GitHub data source field names must exist in your GitHub custom metadata.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GitHubConfiguration withGitHubCommitConfigurationFieldMappings(DataSourceToIndexFieldMapping... gitHubCommitConfigurationFieldMappings) {
        if (this.gitHubCommitConfigurationFieldMappings == null) {
            setGitHubCommitConfigurationFieldMappings(new java.util.ArrayList<DataSourceToIndexFieldMapping>(gitHubCommitConfigurationFieldMappings.length));
        }
        for (DataSourceToIndexFieldMapping ele : gitHubCommitConfigurationFieldMappings) {
            this.gitHubCommitConfigurationFieldMappings.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of <code>DataSourceToIndexFieldMapping</code> objects that map attributes or field names of GitHub commits
     * to Amazon Kendra index field names. To create custom fields, use the <code>UpdateIndex</code> API before you map
     * to GitHub fields. For more information, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html">Mapping data source fields</a>. The GitHub
     * data source field names must exist in your GitHub custom metadata.
     * </p>
     * 
     * @param gitHubCommitConfigurationFieldMappings
     *        A list of <code>DataSourceToIndexFieldMapping</code> objects that map attributes or field names of GitHub
     *        commits to Amazon Kendra index field names. To create custom fields, use the <code>UpdateIndex</code> API
     *        before you map to GitHub fields. For more information, see <a
     *        href="https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html">Mapping data source fields</a>. The
     *        GitHub data source field names must exist in your GitHub custom metadata.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GitHubConfiguration withGitHubCommitConfigurationFieldMappings(
            java.util.Collection<DataSourceToIndexFieldMapping> gitHubCommitConfigurationFieldMappings) {
        setGitHubCommitConfigurationFieldMappings(gitHubCommitConfigurationFieldMappings);
        return this;
    }

    /**
     * <p>
     * A list of <code>DataSourceToIndexFieldMapping</code> objects that map attributes or field names of GitHub issues
     * to Amazon Kendra index field names. To create custom fields, use the <code>UpdateIndex</code> API before you map
     * to GitHub fields. For more information, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html">Mapping data source fields</a>. The GitHub
     * data source field names must exist in your GitHub custom metadata.
     * </p>
     * 
     * @return A list of <code>DataSourceToIndexFieldMapping</code> objects that map attributes or field names of GitHub
     *         issues to Amazon Kendra index field names. To create custom fields, use the <code>UpdateIndex</code> API
     *         before you map to GitHub fields. For more information, see <a
     *         href="https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html">Mapping data source fields</a>.
     *         The GitHub data source field names must exist in your GitHub custom metadata.
     */

    public java.util.List<DataSourceToIndexFieldMapping> getGitHubIssueDocumentConfigurationFieldMappings() {
        return gitHubIssueDocumentConfigurationFieldMappings;
    }

    /**
     * <p>
     * A list of <code>DataSourceToIndexFieldMapping</code> objects that map attributes or field names of GitHub issues
     * to Amazon Kendra index field names. To create custom fields, use the <code>UpdateIndex</code> API before you map
     * to GitHub fields. For more information, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html">Mapping data source fields</a>. The GitHub
     * data source field names must exist in your GitHub custom metadata.
     * </p>
     * 
     * @param gitHubIssueDocumentConfigurationFieldMappings
     *        A list of <code>DataSourceToIndexFieldMapping</code> objects that map attributes or field names of GitHub
     *        issues to Amazon Kendra index field names. To create custom fields, use the <code>UpdateIndex</code> API
     *        before you map to GitHub fields. For more information, see <a
     *        href="https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html">Mapping data source fields</a>. The
     *        GitHub data source field names must exist in your GitHub custom metadata.
     */

    public void setGitHubIssueDocumentConfigurationFieldMappings(
            java.util.Collection<DataSourceToIndexFieldMapping> gitHubIssueDocumentConfigurationFieldMappings) {
        if (gitHubIssueDocumentConfigurationFieldMappings == null) {
            this.gitHubIssueDocumentConfigurationFieldMappings = null;
            return;
        }

        this.gitHubIssueDocumentConfigurationFieldMappings = new java.util.ArrayList<DataSourceToIndexFieldMapping>(
                gitHubIssueDocumentConfigurationFieldMappings);
    }

    /**
     * <p>
     * A list of <code>DataSourceToIndexFieldMapping</code> objects that map attributes or field names of GitHub issues
     * to Amazon Kendra index field names. To create custom fields, use the <code>UpdateIndex</code> API before you map
     * to GitHub fields. For more information, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html">Mapping data source fields</a>. The GitHub
     * data source field names must exist in your GitHub custom metadata.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setGitHubIssueDocumentConfigurationFieldMappings(java.util.Collection)} or
     * {@link #withGitHubIssueDocumentConfigurationFieldMappings(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param gitHubIssueDocumentConfigurationFieldMappings
     *        A list of <code>DataSourceToIndexFieldMapping</code> objects that map attributes or field names of GitHub
     *        issues to Amazon Kendra index field names. To create custom fields, use the <code>UpdateIndex</code> API
     *        before you map to GitHub fields. For more information, see <a
     *        href="https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html">Mapping data source fields</a>. The
     *        GitHub data source field names must exist in your GitHub custom metadata.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GitHubConfiguration withGitHubIssueDocumentConfigurationFieldMappings(DataSourceToIndexFieldMapping... gitHubIssueDocumentConfigurationFieldMappings) {
        if (this.gitHubIssueDocumentConfigurationFieldMappings == null) {
            setGitHubIssueDocumentConfigurationFieldMappings(new java.util.ArrayList<DataSourceToIndexFieldMapping>(
                    gitHubIssueDocumentConfigurationFieldMappings.length));
        }
        for (DataSourceToIndexFieldMapping ele : gitHubIssueDocumentConfigurationFieldMappings) {
            this.gitHubIssueDocumentConfigurationFieldMappings.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of <code>DataSourceToIndexFieldMapping</code> objects that map attributes or field names of GitHub issues
     * to Amazon Kendra index field names. To create custom fields, use the <code>UpdateIndex</code> API before you map
     * to GitHub fields. For more information, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html">Mapping data source fields</a>. The GitHub
     * data source field names must exist in your GitHub custom metadata.
     * </p>
     * 
     * @param gitHubIssueDocumentConfigurationFieldMappings
     *        A list of <code>DataSourceToIndexFieldMapping</code> objects that map attributes or field names of GitHub
     *        issues to Amazon Kendra index field names. To create custom fields, use the <code>UpdateIndex</code> API
     *        before you map to GitHub fields. For more information, see <a
     *        href="https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html">Mapping data source fields</a>. The
     *        GitHub data source field names must exist in your GitHub custom metadata.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GitHubConfiguration withGitHubIssueDocumentConfigurationFieldMappings(
            java.util.Collection<DataSourceToIndexFieldMapping> gitHubIssueDocumentConfigurationFieldMappings) {
        setGitHubIssueDocumentConfigurationFieldMappings(gitHubIssueDocumentConfigurationFieldMappings);
        return this;
    }

    /**
     * <p>
     * A list of <code>DataSourceToIndexFieldMapping</code> objects that map attributes or field names of GitHub issue
     * comments to Amazon Kendra index field names. To create custom fields, use the <code>UpdateIndex</code> API before
     * you map to GitHub fields. For more information, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html">Mapping data source fields</a>. The GitHub
     * data source field names must exist in your GitHub custom metadata.
     * </p>
     * 
     * @return A list of <code>DataSourceToIndexFieldMapping</code> objects that map attributes or field names of GitHub
     *         issue comments to Amazon Kendra index field names. To create custom fields, use the
     *         <code>UpdateIndex</code> API before you map to GitHub fields. For more information, see <a
     *         href="https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html">Mapping data source fields</a>.
     *         The GitHub data source field names must exist in your GitHub custom metadata.
     */

    public java.util.List<DataSourceToIndexFieldMapping> getGitHubIssueCommentConfigurationFieldMappings() {
        return gitHubIssueCommentConfigurationFieldMappings;
    }

    /**
     * <p>
     * A list of <code>DataSourceToIndexFieldMapping</code> objects that map attributes or field names of GitHub issue
     * comments to Amazon Kendra index field names. To create custom fields, use the <code>UpdateIndex</code> API before
     * you map to GitHub fields. For more information, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html">Mapping data source fields</a>. The GitHub
     * data source field names must exist in your GitHub custom metadata.
     * </p>
     * 
     * @param gitHubIssueCommentConfigurationFieldMappings
     *        A list of <code>DataSourceToIndexFieldMapping</code> objects that map attributes or field names of GitHub
     *        issue comments to Amazon Kendra index field names. To create custom fields, use the
     *        <code>UpdateIndex</code> API before you map to GitHub fields. For more information, see <a
     *        href="https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html">Mapping data source fields</a>. The
     *        GitHub data source field names must exist in your GitHub custom metadata.
     */

    public void setGitHubIssueCommentConfigurationFieldMappings(java.util.Collection<DataSourceToIndexFieldMapping> gitHubIssueCommentConfigurationFieldMappings) {
        if (gitHubIssueCommentConfigurationFieldMappings == null) {
            this.gitHubIssueCommentConfigurationFieldMappings = null;
            return;
        }

        this.gitHubIssueCommentConfigurationFieldMappings = new java.util.ArrayList<DataSourceToIndexFieldMapping>(gitHubIssueCommentConfigurationFieldMappings);
    }

    /**
     * <p>
     * A list of <code>DataSourceToIndexFieldMapping</code> objects that map attributes or field names of GitHub issue
     * comments to Amazon Kendra index field names. To create custom fields, use the <code>UpdateIndex</code> API before
     * you map to GitHub fields. For more information, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html">Mapping data source fields</a>. The GitHub
     * data source field names must exist in your GitHub custom metadata.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setGitHubIssueCommentConfigurationFieldMappings(java.util.Collection)} or
     * {@link #withGitHubIssueCommentConfigurationFieldMappings(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param gitHubIssueCommentConfigurationFieldMappings
     *        A list of <code>DataSourceToIndexFieldMapping</code> objects that map attributes or field names of GitHub
     *        issue comments to Amazon Kendra index field names. To create custom fields, use the
     *        <code>UpdateIndex</code> API before you map to GitHub fields. For more information, see <a
     *        href="https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html">Mapping data source fields</a>. The
     *        GitHub data source field names must exist in your GitHub custom metadata.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GitHubConfiguration withGitHubIssueCommentConfigurationFieldMappings(DataSourceToIndexFieldMapping... gitHubIssueCommentConfigurationFieldMappings) {
        if (this.gitHubIssueCommentConfigurationFieldMappings == null) {
            setGitHubIssueCommentConfigurationFieldMappings(new java.util.ArrayList<DataSourceToIndexFieldMapping>(
                    gitHubIssueCommentConfigurationFieldMappings.length));
        }
        for (DataSourceToIndexFieldMapping ele : gitHubIssueCommentConfigurationFieldMappings) {
            this.gitHubIssueCommentConfigurationFieldMappings.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of <code>DataSourceToIndexFieldMapping</code> objects that map attributes or field names of GitHub issue
     * comments to Amazon Kendra index field names. To create custom fields, use the <code>UpdateIndex</code> API before
     * you map to GitHub fields. For more information, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html">Mapping data source fields</a>. The GitHub
     * data source field names must exist in your GitHub custom metadata.
     * </p>
     * 
     * @param gitHubIssueCommentConfigurationFieldMappings
     *        A list of <code>DataSourceToIndexFieldMapping</code> objects that map attributes or field names of GitHub
     *        issue comments to Amazon Kendra index field names. To create custom fields, use the
     *        <code>UpdateIndex</code> API before you map to GitHub fields. For more information, see <a
     *        href="https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html">Mapping data source fields</a>. The
     *        GitHub data source field names must exist in your GitHub custom metadata.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GitHubConfiguration withGitHubIssueCommentConfigurationFieldMappings(
            java.util.Collection<DataSourceToIndexFieldMapping> gitHubIssueCommentConfigurationFieldMappings) {
        setGitHubIssueCommentConfigurationFieldMappings(gitHubIssueCommentConfigurationFieldMappings);
        return this;
    }

    /**
     * <p>
     * A list of <code>DataSourceToIndexFieldMapping</code> objects that map attributes or field names of GitHub issue
     * attachments to Amazon Kendra index field names. To create custom fields, use the <code>UpdateIndex</code> API
     * before you map to GitHub fields. For more information, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html">Mapping data source fields</a>. The GitHub
     * data source field names must exist in your GitHub custom metadata.
     * </p>
     * 
     * @return A list of <code>DataSourceToIndexFieldMapping</code> objects that map attributes or field names of GitHub
     *         issue attachments to Amazon Kendra index field names. To create custom fields, use the
     *         <code>UpdateIndex</code> API before you map to GitHub fields. For more information, see <a
     *         href="https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html">Mapping data source fields</a>.
     *         The GitHub data source field names must exist in your GitHub custom metadata.
     */

    public java.util.List<DataSourceToIndexFieldMapping> getGitHubIssueAttachmentConfigurationFieldMappings() {
        return gitHubIssueAttachmentConfigurationFieldMappings;
    }

    /**
     * <p>
     * A list of <code>DataSourceToIndexFieldMapping</code> objects that map attributes or field names of GitHub issue
     * attachments to Amazon Kendra index field names. To create custom fields, use the <code>UpdateIndex</code> API
     * before you map to GitHub fields. For more information, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html">Mapping data source fields</a>. The GitHub
     * data source field names must exist in your GitHub custom metadata.
     * </p>
     * 
     * @param gitHubIssueAttachmentConfigurationFieldMappings
     *        A list of <code>DataSourceToIndexFieldMapping</code> objects that map attributes or field names of GitHub
     *        issue attachments to Amazon Kendra index field names. To create custom fields, use the
     *        <code>UpdateIndex</code> API before you map to GitHub fields. For more information, see <a
     *        href="https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html">Mapping data source fields</a>. The
     *        GitHub data source field names must exist in your GitHub custom metadata.
     */

    public void setGitHubIssueAttachmentConfigurationFieldMappings(
            java.util.Collection<DataSourceToIndexFieldMapping> gitHubIssueAttachmentConfigurationFieldMappings) {
        if (gitHubIssueAttachmentConfigurationFieldMappings == null) {
            this.gitHubIssueAttachmentConfigurationFieldMappings = null;
            return;
        }

        this.gitHubIssueAttachmentConfigurationFieldMappings = new java.util.ArrayList<DataSourceToIndexFieldMapping>(
                gitHubIssueAttachmentConfigurationFieldMappings);
    }

    /**
     * <p>
     * A list of <code>DataSourceToIndexFieldMapping</code> objects that map attributes or field names of GitHub issue
     * attachments to Amazon Kendra index field names. To create custom fields, use the <code>UpdateIndex</code> API
     * before you map to GitHub fields. For more information, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html">Mapping data source fields</a>. The GitHub
     * data source field names must exist in your GitHub custom metadata.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setGitHubIssueAttachmentConfigurationFieldMappings(java.util.Collection)} or
     * {@link #withGitHubIssueAttachmentConfigurationFieldMappings(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param gitHubIssueAttachmentConfigurationFieldMappings
     *        A list of <code>DataSourceToIndexFieldMapping</code> objects that map attributes or field names of GitHub
     *        issue attachments to Amazon Kendra index field names. To create custom fields, use the
     *        <code>UpdateIndex</code> API before you map to GitHub fields. For more information, see <a
     *        href="https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html">Mapping data source fields</a>. The
     *        GitHub data source field names must exist in your GitHub custom metadata.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GitHubConfiguration withGitHubIssueAttachmentConfigurationFieldMappings(
            DataSourceToIndexFieldMapping... gitHubIssueAttachmentConfigurationFieldMappings) {
        if (this.gitHubIssueAttachmentConfigurationFieldMappings == null) {
            setGitHubIssueAttachmentConfigurationFieldMappings(new java.util.ArrayList<DataSourceToIndexFieldMapping>(
                    gitHubIssueAttachmentConfigurationFieldMappings.length));
        }
        for (DataSourceToIndexFieldMapping ele : gitHubIssueAttachmentConfigurationFieldMappings) {
            this.gitHubIssueAttachmentConfigurationFieldMappings.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of <code>DataSourceToIndexFieldMapping</code> objects that map attributes or field names of GitHub issue
     * attachments to Amazon Kendra index field names. To create custom fields, use the <code>UpdateIndex</code> API
     * before you map to GitHub fields. For more information, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html">Mapping data source fields</a>. The GitHub
     * data source field names must exist in your GitHub custom metadata.
     * </p>
     * 
     * @param gitHubIssueAttachmentConfigurationFieldMappings
     *        A list of <code>DataSourceToIndexFieldMapping</code> objects that map attributes or field names of GitHub
     *        issue attachments to Amazon Kendra index field names. To create custom fields, use the
     *        <code>UpdateIndex</code> API before you map to GitHub fields. For more information, see <a
     *        href="https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html">Mapping data source fields</a>. The
     *        GitHub data source field names must exist in your GitHub custom metadata.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GitHubConfiguration withGitHubIssueAttachmentConfigurationFieldMappings(
            java.util.Collection<DataSourceToIndexFieldMapping> gitHubIssueAttachmentConfigurationFieldMappings) {
        setGitHubIssueAttachmentConfigurationFieldMappings(gitHubIssueAttachmentConfigurationFieldMappings);
        return this;
    }

    /**
     * <p>
     * A list of <code>DataSourceToIndexFieldMapping</code> objects that map attributes or field names of GitHub pull
     * request comments to Amazon Kendra index field names. To create custom fields, use the <code>UpdateIndex</code>
     * API before you map to GitHub fields. For more information, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html">Mapping data source fields</a>. The GitHub
     * data source field names must exist in your GitHub custom metadata.
     * </p>
     * 
     * @return A list of <code>DataSourceToIndexFieldMapping</code> objects that map attributes or field names of GitHub
     *         pull request comments to Amazon Kendra index field names. To create custom fields, use the
     *         <code>UpdateIndex</code> API before you map to GitHub fields. For more information, see <a
     *         href="https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html">Mapping data source fields</a>.
     *         The GitHub data source field names must exist in your GitHub custom metadata.
     */

    public java.util.List<DataSourceToIndexFieldMapping> getGitHubPullRequestCommentConfigurationFieldMappings() {
        return gitHubPullRequestCommentConfigurationFieldMappings;
    }

    /**
     * <p>
     * A list of <code>DataSourceToIndexFieldMapping</code> objects that map attributes or field names of GitHub pull
     * request comments to Amazon Kendra index field names. To create custom fields, use the <code>UpdateIndex</code>
     * API before you map to GitHub fields. For more information, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html">Mapping data source fields</a>. The GitHub
     * data source field names must exist in your GitHub custom metadata.
     * </p>
     * 
     * @param gitHubPullRequestCommentConfigurationFieldMappings
     *        A list of <code>DataSourceToIndexFieldMapping</code> objects that map attributes or field names of GitHub
     *        pull request comments to Amazon Kendra index field names. To create custom fields, use the
     *        <code>UpdateIndex</code> API before you map to GitHub fields. For more information, see <a
     *        href="https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html">Mapping data source fields</a>. The
     *        GitHub data source field names must exist in your GitHub custom metadata.
     */

    public void setGitHubPullRequestCommentConfigurationFieldMappings(
            java.util.Collection<DataSourceToIndexFieldMapping> gitHubPullRequestCommentConfigurationFieldMappings) {
        if (gitHubPullRequestCommentConfigurationFieldMappings == null) {
            this.gitHubPullRequestCommentConfigurationFieldMappings = null;
            return;
        }

        this.gitHubPullRequestCommentConfigurationFieldMappings = new java.util.ArrayList<DataSourceToIndexFieldMapping>(
                gitHubPullRequestCommentConfigurationFieldMappings);
    }

    /**
     * <p>
     * A list of <code>DataSourceToIndexFieldMapping</code> objects that map attributes or field names of GitHub pull
     * request comments to Amazon Kendra index field names. To create custom fields, use the <code>UpdateIndex</code>
     * API before you map to GitHub fields. For more information, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html">Mapping data source fields</a>. The GitHub
     * data source field names must exist in your GitHub custom metadata.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setGitHubPullRequestCommentConfigurationFieldMappings(java.util.Collection)} or
     * {@link #withGitHubPullRequestCommentConfigurationFieldMappings(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param gitHubPullRequestCommentConfigurationFieldMappings
     *        A list of <code>DataSourceToIndexFieldMapping</code> objects that map attributes or field names of GitHub
     *        pull request comments to Amazon Kendra index field names. To create custom fields, use the
     *        <code>UpdateIndex</code> API before you map to GitHub fields. For more information, see <a
     *        href="https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html">Mapping data source fields</a>. The
     *        GitHub data source field names must exist in your GitHub custom metadata.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GitHubConfiguration withGitHubPullRequestCommentConfigurationFieldMappings(
            DataSourceToIndexFieldMapping... gitHubPullRequestCommentConfigurationFieldMappings) {
        if (this.gitHubPullRequestCommentConfigurationFieldMappings == null) {
            setGitHubPullRequestCommentConfigurationFieldMappings(new java.util.ArrayList<DataSourceToIndexFieldMapping>(
                    gitHubPullRequestCommentConfigurationFieldMappings.length));
        }
        for (DataSourceToIndexFieldMapping ele : gitHubPullRequestCommentConfigurationFieldMappings) {
            this.gitHubPullRequestCommentConfigurationFieldMappings.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of <code>DataSourceToIndexFieldMapping</code> objects that map attributes or field names of GitHub pull
     * request comments to Amazon Kendra index field names. To create custom fields, use the <code>UpdateIndex</code>
     * API before you map to GitHub fields. For more information, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html">Mapping data source fields</a>. The GitHub
     * data source field names must exist in your GitHub custom metadata.
     * </p>
     * 
     * @param gitHubPullRequestCommentConfigurationFieldMappings
     *        A list of <code>DataSourceToIndexFieldMapping</code> objects that map attributes or field names of GitHub
     *        pull request comments to Amazon Kendra index field names. To create custom fields, use the
     *        <code>UpdateIndex</code> API before you map to GitHub fields. For more information, see <a
     *        href="https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html">Mapping data source fields</a>. The
     *        GitHub data source field names must exist in your GitHub custom metadata.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GitHubConfiguration withGitHubPullRequestCommentConfigurationFieldMappings(
            java.util.Collection<DataSourceToIndexFieldMapping> gitHubPullRequestCommentConfigurationFieldMappings) {
        setGitHubPullRequestCommentConfigurationFieldMappings(gitHubPullRequestCommentConfigurationFieldMappings);
        return this;
    }

    /**
     * <p>
     * A list of <code>DataSourceToIndexFieldMapping</code> objects that map attributes or field names of GitHub pull
     * requests to Amazon Kendra index field names. To create custom fields, use the <code>UpdateIndex</code> API before
     * you map to GitHub fields. For more information, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html">Mapping data source fields</a>. The GitHub
     * data source field names must exist in your GitHub custom metadata.
     * </p>
     * 
     * @return A list of <code>DataSourceToIndexFieldMapping</code> objects that map attributes or field names of GitHub
     *         pull requests to Amazon Kendra index field names. To create custom fields, use the
     *         <code>UpdateIndex</code> API before you map to GitHub fields. For more information, see <a
     *         href="https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html">Mapping data source fields</a>.
     *         The GitHub data source field names must exist in your GitHub custom metadata.
     */

    public java.util.List<DataSourceToIndexFieldMapping> getGitHubPullRequestDocumentConfigurationFieldMappings() {
        return gitHubPullRequestDocumentConfigurationFieldMappings;
    }

    /**
     * <p>
     * A list of <code>DataSourceToIndexFieldMapping</code> objects that map attributes or field names of GitHub pull
     * requests to Amazon Kendra index field names. To create custom fields, use the <code>UpdateIndex</code> API before
     * you map to GitHub fields. For more information, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html">Mapping data source fields</a>. The GitHub
     * data source field names must exist in your GitHub custom metadata.
     * </p>
     * 
     * @param gitHubPullRequestDocumentConfigurationFieldMappings
     *        A list of <code>DataSourceToIndexFieldMapping</code> objects that map attributes or field names of GitHub
     *        pull requests to Amazon Kendra index field names. To create custom fields, use the
     *        <code>UpdateIndex</code> API before you map to GitHub fields. For more information, see <a
     *        href="https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html">Mapping data source fields</a>. The
     *        GitHub data source field names must exist in your GitHub custom metadata.
     */

    public void setGitHubPullRequestDocumentConfigurationFieldMappings(
            java.util.Collection<DataSourceToIndexFieldMapping> gitHubPullRequestDocumentConfigurationFieldMappings) {
        if (gitHubPullRequestDocumentConfigurationFieldMappings == null) {
            this.gitHubPullRequestDocumentConfigurationFieldMappings = null;
            return;
        }

        this.gitHubPullRequestDocumentConfigurationFieldMappings = new java.util.ArrayList<DataSourceToIndexFieldMapping>(
                gitHubPullRequestDocumentConfigurationFieldMappings);
    }

    /**
     * <p>
     * A list of <code>DataSourceToIndexFieldMapping</code> objects that map attributes or field names of GitHub pull
     * requests to Amazon Kendra index field names. To create custom fields, use the <code>UpdateIndex</code> API before
     * you map to GitHub fields. For more information, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html">Mapping data source fields</a>. The GitHub
     * data source field names must exist in your GitHub custom metadata.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setGitHubPullRequestDocumentConfigurationFieldMappings(java.util.Collection)} or
     * {@link #withGitHubPullRequestDocumentConfigurationFieldMappings(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param gitHubPullRequestDocumentConfigurationFieldMappings
     *        A list of <code>DataSourceToIndexFieldMapping</code> objects that map attributes or field names of GitHub
     *        pull requests to Amazon Kendra index field names. To create custom fields, use the
     *        <code>UpdateIndex</code> API before you map to GitHub fields. For more information, see <a
     *        href="https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html">Mapping data source fields</a>. The
     *        GitHub data source field names must exist in your GitHub custom metadata.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GitHubConfiguration withGitHubPullRequestDocumentConfigurationFieldMappings(
            DataSourceToIndexFieldMapping... gitHubPullRequestDocumentConfigurationFieldMappings) {
        if (this.gitHubPullRequestDocumentConfigurationFieldMappings == null) {
            setGitHubPullRequestDocumentConfigurationFieldMappings(new java.util.ArrayList<DataSourceToIndexFieldMapping>(
                    gitHubPullRequestDocumentConfigurationFieldMappings.length));
        }
        for (DataSourceToIndexFieldMapping ele : gitHubPullRequestDocumentConfigurationFieldMappings) {
            this.gitHubPullRequestDocumentConfigurationFieldMappings.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of <code>DataSourceToIndexFieldMapping</code> objects that map attributes or field names of GitHub pull
     * requests to Amazon Kendra index field names. To create custom fields, use the <code>UpdateIndex</code> API before
     * you map to GitHub fields. For more information, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html">Mapping data source fields</a>. The GitHub
     * data source field names must exist in your GitHub custom metadata.
     * </p>
     * 
     * @param gitHubPullRequestDocumentConfigurationFieldMappings
     *        A list of <code>DataSourceToIndexFieldMapping</code> objects that map attributes or field names of GitHub
     *        pull requests to Amazon Kendra index field names. To create custom fields, use the
     *        <code>UpdateIndex</code> API before you map to GitHub fields. For more information, see <a
     *        href="https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html">Mapping data source fields</a>. The
     *        GitHub data source field names must exist in your GitHub custom metadata.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GitHubConfiguration withGitHubPullRequestDocumentConfigurationFieldMappings(
            java.util.Collection<DataSourceToIndexFieldMapping> gitHubPullRequestDocumentConfigurationFieldMappings) {
        setGitHubPullRequestDocumentConfigurationFieldMappings(gitHubPullRequestDocumentConfigurationFieldMappings);
        return this;
    }

    /**
     * <p>
     * A list of <code>DataSourceToIndexFieldMapping</code> objects that map attributes or field names of GitHub pull
     * request attachments to Amazon Kendra index field names. To create custom fields, use the <code>UpdateIndex</code>
     * API before you map to GitHub fields. For more information, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html">Mapping data source fields</a>. The GitHub
     * data source field names must exist in your GitHub custom metadata.
     * </p>
     * 
     * @return A list of <code>DataSourceToIndexFieldMapping</code> objects that map attributes or field names of GitHub
     *         pull request attachments to Amazon Kendra index field names. To create custom fields, use the
     *         <code>UpdateIndex</code> API before you map to GitHub fields. For more information, see <a
     *         href="https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html">Mapping data source fields</a>.
     *         The GitHub data source field names must exist in your GitHub custom metadata.
     */

    public java.util.List<DataSourceToIndexFieldMapping> getGitHubPullRequestDocumentAttachmentConfigurationFieldMappings() {
        return gitHubPullRequestDocumentAttachmentConfigurationFieldMappings;
    }

    /**
     * <p>
     * A list of <code>DataSourceToIndexFieldMapping</code> objects that map attributes or field names of GitHub pull
     * request attachments to Amazon Kendra index field names. To create custom fields, use the <code>UpdateIndex</code>
     * API before you map to GitHub fields. For more information, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html">Mapping data source fields</a>. The GitHub
     * data source field names must exist in your GitHub custom metadata.
     * </p>
     * 
     * @param gitHubPullRequestDocumentAttachmentConfigurationFieldMappings
     *        A list of <code>DataSourceToIndexFieldMapping</code> objects that map attributes or field names of GitHub
     *        pull request attachments to Amazon Kendra index field names. To create custom fields, use the
     *        <code>UpdateIndex</code> API before you map to GitHub fields. For more information, see <a
     *        href="https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html">Mapping data source fields</a>. The
     *        GitHub data source field names must exist in your GitHub custom metadata.
     */

    public void setGitHubPullRequestDocumentAttachmentConfigurationFieldMappings(
            java.util.Collection<DataSourceToIndexFieldMapping> gitHubPullRequestDocumentAttachmentConfigurationFieldMappings) {
        if (gitHubPullRequestDocumentAttachmentConfigurationFieldMappings == null) {
            this.gitHubPullRequestDocumentAttachmentConfigurationFieldMappings = null;
            return;
        }

        this.gitHubPullRequestDocumentAttachmentConfigurationFieldMappings = new java.util.ArrayList<DataSourceToIndexFieldMapping>(
                gitHubPullRequestDocumentAttachmentConfigurationFieldMappings);
    }

    /**
     * <p>
     * A list of <code>DataSourceToIndexFieldMapping</code> objects that map attributes or field names of GitHub pull
     * request attachments to Amazon Kendra index field names. To create custom fields, use the <code>UpdateIndex</code>
     * API before you map to GitHub fields. For more information, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html">Mapping data source fields</a>. The GitHub
     * data source field names must exist in your GitHub custom metadata.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setGitHubPullRequestDocumentAttachmentConfigurationFieldMappings(java.util.Collection)} or
     * {@link #withGitHubPullRequestDocumentAttachmentConfigurationFieldMappings(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param gitHubPullRequestDocumentAttachmentConfigurationFieldMappings
     *        A list of <code>DataSourceToIndexFieldMapping</code> objects that map attributes or field names of GitHub
     *        pull request attachments to Amazon Kendra index field names. To create custom fields, use the
     *        <code>UpdateIndex</code> API before you map to GitHub fields. For more information, see <a
     *        href="https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html">Mapping data source fields</a>. The
     *        GitHub data source field names must exist in your GitHub custom metadata.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GitHubConfiguration withGitHubPullRequestDocumentAttachmentConfigurationFieldMappings(
            DataSourceToIndexFieldMapping... gitHubPullRequestDocumentAttachmentConfigurationFieldMappings) {
        if (this.gitHubPullRequestDocumentAttachmentConfigurationFieldMappings == null) {
            setGitHubPullRequestDocumentAttachmentConfigurationFieldMappings(new java.util.ArrayList<DataSourceToIndexFieldMapping>(
                    gitHubPullRequestDocumentAttachmentConfigurationFieldMappings.length));
        }
        for (DataSourceToIndexFieldMapping ele : gitHubPullRequestDocumentAttachmentConfigurationFieldMappings) {
            this.gitHubPullRequestDocumentAttachmentConfigurationFieldMappings.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of <code>DataSourceToIndexFieldMapping</code> objects that map attributes or field names of GitHub pull
     * request attachments to Amazon Kendra index field names. To create custom fields, use the <code>UpdateIndex</code>
     * API before you map to GitHub fields. For more information, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html">Mapping data source fields</a>. The GitHub
     * data source field names must exist in your GitHub custom metadata.
     * </p>
     * 
     * @param gitHubPullRequestDocumentAttachmentConfigurationFieldMappings
     *        A list of <code>DataSourceToIndexFieldMapping</code> objects that map attributes or field names of GitHub
     *        pull request attachments to Amazon Kendra index field names. To create custom fields, use the
     *        <code>UpdateIndex</code> API before you map to GitHub fields. For more information, see <a
     *        href="https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html">Mapping data source fields</a>. The
     *        GitHub data source field names must exist in your GitHub custom metadata.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GitHubConfiguration withGitHubPullRequestDocumentAttachmentConfigurationFieldMappings(
            java.util.Collection<DataSourceToIndexFieldMapping> gitHubPullRequestDocumentAttachmentConfigurationFieldMappings) {
        setGitHubPullRequestDocumentAttachmentConfigurationFieldMappings(gitHubPullRequestDocumentAttachmentConfigurationFieldMappings);
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
        if (getSaaSConfiguration() != null)
            sb.append("SaaSConfiguration: ").append(getSaaSConfiguration()).append(",");
        if (getOnPremiseConfiguration() != null)
            sb.append("OnPremiseConfiguration: ").append(getOnPremiseConfiguration()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getSecretArn() != null)
            sb.append("SecretArn: ").append(getSecretArn()).append(",");
        if (getUseChangeLog() != null)
            sb.append("UseChangeLog: ").append(getUseChangeLog()).append(",");
        if (getGitHubDocumentCrawlProperties() != null)
            sb.append("GitHubDocumentCrawlProperties: ").append(getGitHubDocumentCrawlProperties()).append(",");
        if (getRepositoryFilter() != null)
            sb.append("RepositoryFilter: ").append(getRepositoryFilter()).append(",");
        if (getInclusionFolderNamePatterns() != null)
            sb.append("InclusionFolderNamePatterns: ").append(getInclusionFolderNamePatterns()).append(",");
        if (getInclusionFileTypePatterns() != null)
            sb.append("InclusionFileTypePatterns: ").append(getInclusionFileTypePatterns()).append(",");
        if (getInclusionFileNamePatterns() != null)
            sb.append("InclusionFileNamePatterns: ").append(getInclusionFileNamePatterns()).append(",");
        if (getExclusionFolderNamePatterns() != null)
            sb.append("ExclusionFolderNamePatterns: ").append(getExclusionFolderNamePatterns()).append(",");
        if (getExclusionFileTypePatterns() != null)
            sb.append("ExclusionFileTypePatterns: ").append(getExclusionFileTypePatterns()).append(",");
        if (getExclusionFileNamePatterns() != null)
            sb.append("ExclusionFileNamePatterns: ").append(getExclusionFileNamePatterns()).append(",");
        if (getVpcConfiguration() != null)
            sb.append("VpcConfiguration: ").append(getVpcConfiguration()).append(",");
        if (getGitHubRepositoryConfigurationFieldMappings() != null)
            sb.append("GitHubRepositoryConfigurationFieldMappings: ").append(getGitHubRepositoryConfigurationFieldMappings()).append(",");
        if (getGitHubCommitConfigurationFieldMappings() != null)
            sb.append("GitHubCommitConfigurationFieldMappings: ").append(getGitHubCommitConfigurationFieldMappings()).append(",");
        if (getGitHubIssueDocumentConfigurationFieldMappings() != null)
            sb.append("GitHubIssueDocumentConfigurationFieldMappings: ").append(getGitHubIssueDocumentConfigurationFieldMappings()).append(",");
        if (getGitHubIssueCommentConfigurationFieldMappings() != null)
            sb.append("GitHubIssueCommentConfigurationFieldMappings: ").append(getGitHubIssueCommentConfigurationFieldMappings()).append(",");
        if (getGitHubIssueAttachmentConfigurationFieldMappings() != null)
            sb.append("GitHubIssueAttachmentConfigurationFieldMappings: ").append(getGitHubIssueAttachmentConfigurationFieldMappings()).append(",");
        if (getGitHubPullRequestCommentConfigurationFieldMappings() != null)
            sb.append("GitHubPullRequestCommentConfigurationFieldMappings: ").append(getGitHubPullRequestCommentConfigurationFieldMappings()).append(",");
        if (getGitHubPullRequestDocumentConfigurationFieldMappings() != null)
            sb.append("GitHubPullRequestDocumentConfigurationFieldMappings: ").append(getGitHubPullRequestDocumentConfigurationFieldMappings()).append(",");
        if (getGitHubPullRequestDocumentAttachmentConfigurationFieldMappings() != null)
            sb.append("GitHubPullRequestDocumentAttachmentConfigurationFieldMappings: ").append(
                    getGitHubPullRequestDocumentAttachmentConfigurationFieldMappings());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GitHubConfiguration == false)
            return false;
        GitHubConfiguration other = (GitHubConfiguration) obj;
        if (other.getSaaSConfiguration() == null ^ this.getSaaSConfiguration() == null)
            return false;
        if (other.getSaaSConfiguration() != null && other.getSaaSConfiguration().equals(this.getSaaSConfiguration()) == false)
            return false;
        if (other.getOnPremiseConfiguration() == null ^ this.getOnPremiseConfiguration() == null)
            return false;
        if (other.getOnPremiseConfiguration() != null && other.getOnPremiseConfiguration().equals(this.getOnPremiseConfiguration()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getSecretArn() == null ^ this.getSecretArn() == null)
            return false;
        if (other.getSecretArn() != null && other.getSecretArn().equals(this.getSecretArn()) == false)
            return false;
        if (other.getUseChangeLog() == null ^ this.getUseChangeLog() == null)
            return false;
        if (other.getUseChangeLog() != null && other.getUseChangeLog().equals(this.getUseChangeLog()) == false)
            return false;
        if (other.getGitHubDocumentCrawlProperties() == null ^ this.getGitHubDocumentCrawlProperties() == null)
            return false;
        if (other.getGitHubDocumentCrawlProperties() != null
                && other.getGitHubDocumentCrawlProperties().equals(this.getGitHubDocumentCrawlProperties()) == false)
            return false;
        if (other.getRepositoryFilter() == null ^ this.getRepositoryFilter() == null)
            return false;
        if (other.getRepositoryFilter() != null && other.getRepositoryFilter().equals(this.getRepositoryFilter()) == false)
            return false;
        if (other.getInclusionFolderNamePatterns() == null ^ this.getInclusionFolderNamePatterns() == null)
            return false;
        if (other.getInclusionFolderNamePatterns() != null && other.getInclusionFolderNamePatterns().equals(this.getInclusionFolderNamePatterns()) == false)
            return false;
        if (other.getInclusionFileTypePatterns() == null ^ this.getInclusionFileTypePatterns() == null)
            return false;
        if (other.getInclusionFileTypePatterns() != null && other.getInclusionFileTypePatterns().equals(this.getInclusionFileTypePatterns()) == false)
            return false;
        if (other.getInclusionFileNamePatterns() == null ^ this.getInclusionFileNamePatterns() == null)
            return false;
        if (other.getInclusionFileNamePatterns() != null && other.getInclusionFileNamePatterns().equals(this.getInclusionFileNamePatterns()) == false)
            return false;
        if (other.getExclusionFolderNamePatterns() == null ^ this.getExclusionFolderNamePatterns() == null)
            return false;
        if (other.getExclusionFolderNamePatterns() != null && other.getExclusionFolderNamePatterns().equals(this.getExclusionFolderNamePatterns()) == false)
            return false;
        if (other.getExclusionFileTypePatterns() == null ^ this.getExclusionFileTypePatterns() == null)
            return false;
        if (other.getExclusionFileTypePatterns() != null && other.getExclusionFileTypePatterns().equals(this.getExclusionFileTypePatterns()) == false)
            return false;
        if (other.getExclusionFileNamePatterns() == null ^ this.getExclusionFileNamePatterns() == null)
            return false;
        if (other.getExclusionFileNamePatterns() != null && other.getExclusionFileNamePatterns().equals(this.getExclusionFileNamePatterns()) == false)
            return false;
        if (other.getVpcConfiguration() == null ^ this.getVpcConfiguration() == null)
            return false;
        if (other.getVpcConfiguration() != null && other.getVpcConfiguration().equals(this.getVpcConfiguration()) == false)
            return false;
        if (other.getGitHubRepositoryConfigurationFieldMappings() == null ^ this.getGitHubRepositoryConfigurationFieldMappings() == null)
            return false;
        if (other.getGitHubRepositoryConfigurationFieldMappings() != null
                && other.getGitHubRepositoryConfigurationFieldMappings().equals(this.getGitHubRepositoryConfigurationFieldMappings()) == false)
            return false;
        if (other.getGitHubCommitConfigurationFieldMappings() == null ^ this.getGitHubCommitConfigurationFieldMappings() == null)
            return false;
        if (other.getGitHubCommitConfigurationFieldMappings() != null
                && other.getGitHubCommitConfigurationFieldMappings().equals(this.getGitHubCommitConfigurationFieldMappings()) == false)
            return false;
        if (other.getGitHubIssueDocumentConfigurationFieldMappings() == null ^ this.getGitHubIssueDocumentConfigurationFieldMappings() == null)
            return false;
        if (other.getGitHubIssueDocumentConfigurationFieldMappings() != null
                && other.getGitHubIssueDocumentConfigurationFieldMappings().equals(this.getGitHubIssueDocumentConfigurationFieldMappings()) == false)
            return false;
        if (other.getGitHubIssueCommentConfigurationFieldMappings() == null ^ this.getGitHubIssueCommentConfigurationFieldMappings() == null)
            return false;
        if (other.getGitHubIssueCommentConfigurationFieldMappings() != null
                && other.getGitHubIssueCommentConfigurationFieldMappings().equals(this.getGitHubIssueCommentConfigurationFieldMappings()) == false)
            return false;
        if (other.getGitHubIssueAttachmentConfigurationFieldMappings() == null ^ this.getGitHubIssueAttachmentConfigurationFieldMappings() == null)
            return false;
        if (other.getGitHubIssueAttachmentConfigurationFieldMappings() != null
                && other.getGitHubIssueAttachmentConfigurationFieldMappings().equals(this.getGitHubIssueAttachmentConfigurationFieldMappings()) == false)
            return false;
        if (other.getGitHubPullRequestCommentConfigurationFieldMappings() == null ^ this.getGitHubPullRequestCommentConfigurationFieldMappings() == null)
            return false;
        if (other.getGitHubPullRequestCommentConfigurationFieldMappings() != null
                && other.getGitHubPullRequestCommentConfigurationFieldMappings().equals(this.getGitHubPullRequestCommentConfigurationFieldMappings()) == false)
            return false;
        if (other.getGitHubPullRequestDocumentConfigurationFieldMappings() == null ^ this.getGitHubPullRequestDocumentConfigurationFieldMappings() == null)
            return false;
        if (other.getGitHubPullRequestDocumentConfigurationFieldMappings() != null
                && other.getGitHubPullRequestDocumentConfigurationFieldMappings().equals(this.getGitHubPullRequestDocumentConfigurationFieldMappings()) == false)
            return false;
        if (other.getGitHubPullRequestDocumentAttachmentConfigurationFieldMappings() == null
                ^ this.getGitHubPullRequestDocumentAttachmentConfigurationFieldMappings() == null)
            return false;
        if (other.getGitHubPullRequestDocumentAttachmentConfigurationFieldMappings() != null
                && other.getGitHubPullRequestDocumentAttachmentConfigurationFieldMappings().equals(
                        this.getGitHubPullRequestDocumentAttachmentConfigurationFieldMappings()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSaaSConfiguration() == null) ? 0 : getSaaSConfiguration().hashCode());
        hashCode = prime * hashCode + ((getOnPremiseConfiguration() == null) ? 0 : getOnPremiseConfiguration().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getSecretArn() == null) ? 0 : getSecretArn().hashCode());
        hashCode = prime * hashCode + ((getUseChangeLog() == null) ? 0 : getUseChangeLog().hashCode());
        hashCode = prime * hashCode + ((getGitHubDocumentCrawlProperties() == null) ? 0 : getGitHubDocumentCrawlProperties().hashCode());
        hashCode = prime * hashCode + ((getRepositoryFilter() == null) ? 0 : getRepositoryFilter().hashCode());
        hashCode = prime * hashCode + ((getInclusionFolderNamePatterns() == null) ? 0 : getInclusionFolderNamePatterns().hashCode());
        hashCode = prime * hashCode + ((getInclusionFileTypePatterns() == null) ? 0 : getInclusionFileTypePatterns().hashCode());
        hashCode = prime * hashCode + ((getInclusionFileNamePatterns() == null) ? 0 : getInclusionFileNamePatterns().hashCode());
        hashCode = prime * hashCode + ((getExclusionFolderNamePatterns() == null) ? 0 : getExclusionFolderNamePatterns().hashCode());
        hashCode = prime * hashCode + ((getExclusionFileTypePatterns() == null) ? 0 : getExclusionFileTypePatterns().hashCode());
        hashCode = prime * hashCode + ((getExclusionFileNamePatterns() == null) ? 0 : getExclusionFileNamePatterns().hashCode());
        hashCode = prime * hashCode + ((getVpcConfiguration() == null) ? 0 : getVpcConfiguration().hashCode());
        hashCode = prime * hashCode
                + ((getGitHubRepositoryConfigurationFieldMappings() == null) ? 0 : getGitHubRepositoryConfigurationFieldMappings().hashCode());
        hashCode = prime * hashCode + ((getGitHubCommitConfigurationFieldMappings() == null) ? 0 : getGitHubCommitConfigurationFieldMappings().hashCode());
        hashCode = prime * hashCode
                + ((getGitHubIssueDocumentConfigurationFieldMappings() == null) ? 0 : getGitHubIssueDocumentConfigurationFieldMappings().hashCode());
        hashCode = prime * hashCode
                + ((getGitHubIssueCommentConfigurationFieldMappings() == null) ? 0 : getGitHubIssueCommentConfigurationFieldMappings().hashCode());
        hashCode = prime * hashCode
                + ((getGitHubIssueAttachmentConfigurationFieldMappings() == null) ? 0 : getGitHubIssueAttachmentConfigurationFieldMappings().hashCode());
        hashCode = prime * hashCode
                + ((getGitHubPullRequestCommentConfigurationFieldMappings() == null) ? 0 : getGitHubPullRequestCommentConfigurationFieldMappings().hashCode());
        hashCode = prime
                * hashCode
                + ((getGitHubPullRequestDocumentConfigurationFieldMappings() == null) ? 0 : getGitHubPullRequestDocumentConfigurationFieldMappings().hashCode());
        hashCode = prime
                * hashCode
                + ((getGitHubPullRequestDocumentAttachmentConfigurationFieldMappings() == null) ? 0
                        : getGitHubPullRequestDocumentAttachmentConfigurationFieldMappings().hashCode());
        return hashCode;
    }

    @Override
    public GitHubConfiguration clone() {
        try {
            return (GitHubConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.kendra.model.transform.GitHubConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
