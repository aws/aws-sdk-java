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
 * Provides the configuration information to connect to Jira as your data source.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/JiraConfiguration" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class JiraConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The URL of the Jira account. For example, <i>company.atlassian.net</i> or <i>https://jira.company.com</i>. You
     * can find your Jira account URL in the URL of your profile page for Jira desktop.
     * </p>
     */
    private String jiraAccountUrl;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of a secret in Secrets Manager contains the key-value pairs required to connect to
     * your Jira data source. The secret must contain a JSON structure with the following keys:
     * </p>
     * <ul>
     * <li>
     * <p>
     * jiraId—The Jira username.
     * </p>
     * </li>
     * <li>
     * <p>
     * jiraCredentials—The Jira API token. For more information on creating an API token in Jira, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/data-source-jira.html"> Using a Jira data source</a>.
     * </p>
     * </li>
     * </ul>
     */
    private String secretArn;
    /**
     * <p>
     * <code>TRUE</code> to use the Jira change log to determine which documents require updating in the index.
     * Depending on the change log's size, it may take longer for Amazon Kendra to use the change log than to scan all
     * of your documents in Jira.
     * </p>
     */
    private Boolean useChangeLog;
    /**
     * <p>
     * Specify which projects to crawl in your Jira data source. You can specify one or more Jira project IDs.
     * </p>
     */
    private java.util.List<String> project;
    /**
     * <p>
     * Specify which issue types to crawl in your Jira data source. You can specify one or more of these options to
     * crawl.
     * </p>
     */
    private java.util.List<String> issueType;
    /**
     * <p>
     * Specify which statuses to crawl in your Jira data source. You can specify one or more of these options to crawl.
     * </p>
     */
    private java.util.List<String> status;
    /**
     * <p>
     * Specify whether to crawl comments, attachments, and work logs. You can specify one or more of these options.
     * </p>
     */
    private java.util.List<String> issueSubEntityFilter;
    /**
     * <p>
     * A list of DataSourceToIndexFieldMapping objects that map attributes or field names of Jira attachments to Amazon
     * Kendra index field names. To create custom fields, use the UpdateIndex API before you map to Jira fields. For
     * more information, see <a href="https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html"> Mapping data
     * source fields</a>. The Jira data source field names must exist in your Jira custom metadata.
     * </p>
     */
    private java.util.List<DataSourceToIndexFieldMapping> attachmentFieldMappings;
    /**
     * <p>
     * A list of DataSourceToIndexFieldMapping objects that map attributes or field names of Jira comments to Amazon
     * Kendra index field names. To create custom fields, use the UpdateIndex API before you map to Jira fields. For
     * more information, see <a href="https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html"> Mapping data
     * source fields</a>. The Jira data source field names must exist in your Jira custom metadata.
     * </p>
     */
    private java.util.List<DataSourceToIndexFieldMapping> commentFieldMappings;
    /**
     * <p>
     * A list of DataSourceToIndexFieldMapping objects that map attributes or field names of Jira issues to Amazon
     * Kendra index field names. To create custom fields, use the UpdateIndex API before you map to Jira fields. For
     * more information, see <a href="https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html"> Mapping data
     * source fields</a>. The Jira data source field names must exist in your Jira custom metadata.
     * </p>
     */
    private java.util.List<DataSourceToIndexFieldMapping> issueFieldMappings;
    /**
     * <p>
     * A list of DataSourceToIndexFieldMapping objects that map attributes or field names of Jira projects to Amazon
     * Kendra index field names. To create custom fields, use the UpdateIndex API before you map to Jira fields. For
     * more information, see <a href="https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html"> Mapping data
     * source fields</a>. The Jira data source field names must exist in your Jira custom metadata.
     * </p>
     */
    private java.util.List<DataSourceToIndexFieldMapping> projectFieldMappings;
    /**
     * <p>
     * A list of DataSourceToIndexFieldMapping objects that map attributes or field names of Jira work logs to Amazon
     * Kendra index field names. To create custom fields, use the UpdateIndex API before you map to Jira fields. For
     * more information, see <a href="https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html"> Mapping data
     * source fields</a>. The Jira data source field names must exist in your Jira custom metadata.
     * </p>
     */
    private java.util.List<DataSourceToIndexFieldMapping> workLogFieldMappings;
    /**
     * <p>
     * A list of regular expression patterns to include certain file paths, file names, and file types in your Jira data
     * source. Files that match the patterns are included in the index. Files that don't match the patterns are excluded
     * from the index. If a file matches both an inclusion pattern and an exclusion pattern, the exclusion pattern takes
     * precedence and the file isn't included in the index.
     * </p>
     */
    private java.util.List<String> inclusionPatterns;
    /**
     * <p>
     * A list of regular expression patterns to exclude certain file paths, file names, and file types in your Jira data
     * source. Files that match the patterns are excluded from the index. Files that don’t match the patterns are
     * included in the index. If a file matches both an inclusion pattern and an exclusion pattern, the exclusion
     * pattern takes precedence and the file isn't included in the index.
     * </p>
     */
    private java.util.List<String> exclusionPatterns;
    /**
     * <p>
     * Configuration information for an Amazon Virtual Private Cloud to connect to your Jira. Your Jira account must
     * reside inside your VPC.
     * </p>
     */
    private DataSourceVpcConfiguration vpcConfiguration;

    /**
     * <p>
     * The URL of the Jira account. For example, <i>company.atlassian.net</i> or <i>https://jira.company.com</i>. You
     * can find your Jira account URL in the URL of your profile page for Jira desktop.
     * </p>
     * 
     * @param jiraAccountUrl
     *        The URL of the Jira account. For example, <i>company.atlassian.net</i> or <i>https://jira.company.com</i>.
     *        You can find your Jira account URL in the URL of your profile page for Jira desktop.
     */

    public void setJiraAccountUrl(String jiraAccountUrl) {
        this.jiraAccountUrl = jiraAccountUrl;
    }

    /**
     * <p>
     * The URL of the Jira account. For example, <i>company.atlassian.net</i> or <i>https://jira.company.com</i>. You
     * can find your Jira account URL in the URL of your profile page for Jira desktop.
     * </p>
     * 
     * @return The URL of the Jira account. For example, <i>company.atlassian.net</i> or
     *         <i>https://jira.company.com</i>. You can find your Jira account URL in the URL of your profile page for
     *         Jira desktop.
     */

    public String getJiraAccountUrl() {
        return this.jiraAccountUrl;
    }

    /**
     * <p>
     * The URL of the Jira account. For example, <i>company.atlassian.net</i> or <i>https://jira.company.com</i>. You
     * can find your Jira account URL in the URL of your profile page for Jira desktop.
     * </p>
     * 
     * @param jiraAccountUrl
     *        The URL of the Jira account. For example, <i>company.atlassian.net</i> or <i>https://jira.company.com</i>.
     *        You can find your Jira account URL in the URL of your profile page for Jira desktop.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JiraConfiguration withJiraAccountUrl(String jiraAccountUrl) {
        setJiraAccountUrl(jiraAccountUrl);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of a secret in Secrets Manager contains the key-value pairs required to connect to
     * your Jira data source. The secret must contain a JSON structure with the following keys:
     * </p>
     * <ul>
     * <li>
     * <p>
     * jiraId—The Jira username.
     * </p>
     * </li>
     * <li>
     * <p>
     * jiraCredentials—The Jira API token. For more information on creating an API token in Jira, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/data-source-jira.html"> Using a Jira data source</a>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param secretArn
     *        The Amazon Resource Name (ARN) of a secret in Secrets Manager contains the key-value pairs required to
     *        connect to your Jira data source. The secret must contain a JSON structure with the following keys:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        jiraId—The Jira username.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        jiraCredentials—The Jira API token. For more information on creating an API token in Jira, see <a
     *        href="https://docs.aws.amazon.com/kendra/latest/dg/data-source-jira.html"> Using a Jira data source</a>.
     *        </p>
     *        </li>
     */

    public void setSecretArn(String secretArn) {
        this.secretArn = secretArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of a secret in Secrets Manager contains the key-value pairs required to connect to
     * your Jira data source. The secret must contain a JSON structure with the following keys:
     * </p>
     * <ul>
     * <li>
     * <p>
     * jiraId—The Jira username.
     * </p>
     * </li>
     * <li>
     * <p>
     * jiraCredentials—The Jira API token. For more information on creating an API token in Jira, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/data-source-jira.html"> Using a Jira data source</a>.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The Amazon Resource Name (ARN) of a secret in Secrets Manager contains the key-value pairs required to
     *         connect to your Jira data source. The secret must contain a JSON structure with the following keys:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         jiraId—The Jira username.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         jiraCredentials—The Jira API token. For more information on creating an API token in Jira, see <a
     *         href="https://docs.aws.amazon.com/kendra/latest/dg/data-source-jira.html"> Using a Jira data source</a>.
     *         </p>
     *         </li>
     */

    public String getSecretArn() {
        return this.secretArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of a secret in Secrets Manager contains the key-value pairs required to connect to
     * your Jira data source. The secret must contain a JSON structure with the following keys:
     * </p>
     * <ul>
     * <li>
     * <p>
     * jiraId—The Jira username.
     * </p>
     * </li>
     * <li>
     * <p>
     * jiraCredentials—The Jira API token. For more information on creating an API token in Jira, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/data-source-jira.html"> Using a Jira data source</a>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param secretArn
     *        The Amazon Resource Name (ARN) of a secret in Secrets Manager contains the key-value pairs required to
     *        connect to your Jira data source. The secret must contain a JSON structure with the following keys:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        jiraId—The Jira username.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        jiraCredentials—The Jira API token. For more information on creating an API token in Jira, see <a
     *        href="https://docs.aws.amazon.com/kendra/latest/dg/data-source-jira.html"> Using a Jira data source</a>.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JiraConfiguration withSecretArn(String secretArn) {
        setSecretArn(secretArn);
        return this;
    }

    /**
     * <p>
     * <code>TRUE</code> to use the Jira change log to determine which documents require updating in the index.
     * Depending on the change log's size, it may take longer for Amazon Kendra to use the change log than to scan all
     * of your documents in Jira.
     * </p>
     * 
     * @param useChangeLog
     *        <code>TRUE</code> to use the Jira change log to determine which documents require updating in the index.
     *        Depending on the change log's size, it may take longer for Amazon Kendra to use the change log than to
     *        scan all of your documents in Jira.
     */

    public void setUseChangeLog(Boolean useChangeLog) {
        this.useChangeLog = useChangeLog;
    }

    /**
     * <p>
     * <code>TRUE</code> to use the Jira change log to determine which documents require updating in the index.
     * Depending on the change log's size, it may take longer for Amazon Kendra to use the change log than to scan all
     * of your documents in Jira.
     * </p>
     * 
     * @return <code>TRUE</code> to use the Jira change log to determine which documents require updating in the index.
     *         Depending on the change log's size, it may take longer for Amazon Kendra to use the change log than to
     *         scan all of your documents in Jira.
     */

    public Boolean getUseChangeLog() {
        return this.useChangeLog;
    }

    /**
     * <p>
     * <code>TRUE</code> to use the Jira change log to determine which documents require updating in the index.
     * Depending on the change log's size, it may take longer for Amazon Kendra to use the change log than to scan all
     * of your documents in Jira.
     * </p>
     * 
     * @param useChangeLog
     *        <code>TRUE</code> to use the Jira change log to determine which documents require updating in the index.
     *        Depending on the change log's size, it may take longer for Amazon Kendra to use the change log than to
     *        scan all of your documents in Jira.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JiraConfiguration withUseChangeLog(Boolean useChangeLog) {
        setUseChangeLog(useChangeLog);
        return this;
    }

    /**
     * <p>
     * <code>TRUE</code> to use the Jira change log to determine which documents require updating in the index.
     * Depending on the change log's size, it may take longer for Amazon Kendra to use the change log than to scan all
     * of your documents in Jira.
     * </p>
     * 
     * @return <code>TRUE</code> to use the Jira change log to determine which documents require updating in the index.
     *         Depending on the change log's size, it may take longer for Amazon Kendra to use the change log than to
     *         scan all of your documents in Jira.
     */

    public Boolean isUseChangeLog() {
        return this.useChangeLog;
    }

    /**
     * <p>
     * Specify which projects to crawl in your Jira data source. You can specify one or more Jira project IDs.
     * </p>
     * 
     * @return Specify which projects to crawl in your Jira data source. You can specify one or more Jira project IDs.
     */

    public java.util.List<String> getProject() {
        return project;
    }

    /**
     * <p>
     * Specify which projects to crawl in your Jira data source. You can specify one or more Jira project IDs.
     * </p>
     * 
     * @param project
     *        Specify which projects to crawl in your Jira data source. You can specify one or more Jira project IDs.
     */

    public void setProject(java.util.Collection<String> project) {
        if (project == null) {
            this.project = null;
            return;
        }

        this.project = new java.util.ArrayList<String>(project);
    }

    /**
     * <p>
     * Specify which projects to crawl in your Jira data source. You can specify one or more Jira project IDs.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setProject(java.util.Collection)} or {@link #withProject(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param project
     *        Specify which projects to crawl in your Jira data source. You can specify one or more Jira project IDs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JiraConfiguration withProject(String... project) {
        if (this.project == null) {
            setProject(new java.util.ArrayList<String>(project.length));
        }
        for (String ele : project) {
            this.project.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Specify which projects to crawl in your Jira data source. You can specify one or more Jira project IDs.
     * </p>
     * 
     * @param project
     *        Specify which projects to crawl in your Jira data source. You can specify one or more Jira project IDs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JiraConfiguration withProject(java.util.Collection<String> project) {
        setProject(project);
        return this;
    }

    /**
     * <p>
     * Specify which issue types to crawl in your Jira data source. You can specify one or more of these options to
     * crawl.
     * </p>
     * 
     * @return Specify which issue types to crawl in your Jira data source. You can specify one or more of these options
     *         to crawl.
     */

    public java.util.List<String> getIssueType() {
        return issueType;
    }

    /**
     * <p>
     * Specify which issue types to crawl in your Jira data source. You can specify one or more of these options to
     * crawl.
     * </p>
     * 
     * @param issueType
     *        Specify which issue types to crawl in your Jira data source. You can specify one or more of these options
     *        to crawl.
     */

    public void setIssueType(java.util.Collection<String> issueType) {
        if (issueType == null) {
            this.issueType = null;
            return;
        }

        this.issueType = new java.util.ArrayList<String>(issueType);
    }

    /**
     * <p>
     * Specify which issue types to crawl in your Jira data source. You can specify one or more of these options to
     * crawl.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setIssueType(java.util.Collection)} or {@link #withIssueType(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param issueType
     *        Specify which issue types to crawl in your Jira data source. You can specify one or more of these options
     *        to crawl.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JiraConfiguration withIssueType(String... issueType) {
        if (this.issueType == null) {
            setIssueType(new java.util.ArrayList<String>(issueType.length));
        }
        for (String ele : issueType) {
            this.issueType.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Specify which issue types to crawl in your Jira data source. You can specify one or more of these options to
     * crawl.
     * </p>
     * 
     * @param issueType
     *        Specify which issue types to crawl in your Jira data source. You can specify one or more of these options
     *        to crawl.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JiraConfiguration withIssueType(java.util.Collection<String> issueType) {
        setIssueType(issueType);
        return this;
    }

    /**
     * <p>
     * Specify which statuses to crawl in your Jira data source. You can specify one or more of these options to crawl.
     * </p>
     * 
     * @return Specify which statuses to crawl in your Jira data source. You can specify one or more of these options to
     *         crawl.
     */

    public java.util.List<String> getStatus() {
        return status;
    }

    /**
     * <p>
     * Specify which statuses to crawl in your Jira data source. You can specify one or more of these options to crawl.
     * </p>
     * 
     * @param status
     *        Specify which statuses to crawl in your Jira data source. You can specify one or more of these options to
     *        crawl.
     */

    public void setStatus(java.util.Collection<String> status) {
        if (status == null) {
            this.status = null;
            return;
        }

        this.status = new java.util.ArrayList<String>(status);
    }

    /**
     * <p>
     * Specify which statuses to crawl in your Jira data source. You can specify one or more of these options to crawl.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setStatus(java.util.Collection)} or {@link #withStatus(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param status
     *        Specify which statuses to crawl in your Jira data source. You can specify one or more of these options to
     *        crawl.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JiraConfiguration withStatus(String... status) {
        if (this.status == null) {
            setStatus(new java.util.ArrayList<String>(status.length));
        }
        for (String ele : status) {
            this.status.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Specify which statuses to crawl in your Jira data source. You can specify one or more of these options to crawl.
     * </p>
     * 
     * @param status
     *        Specify which statuses to crawl in your Jira data source. You can specify one or more of these options to
     *        crawl.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JiraConfiguration withStatus(java.util.Collection<String> status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * Specify whether to crawl comments, attachments, and work logs. You can specify one or more of these options.
     * </p>
     * 
     * @return Specify whether to crawl comments, attachments, and work logs. You can specify one or more of these
     *         options.
     * @see IssueSubEntity
     */

    public java.util.List<String> getIssueSubEntityFilter() {
        return issueSubEntityFilter;
    }

    /**
     * <p>
     * Specify whether to crawl comments, attachments, and work logs. You can specify one or more of these options.
     * </p>
     * 
     * @param issueSubEntityFilter
     *        Specify whether to crawl comments, attachments, and work logs. You can specify one or more of these
     *        options.
     * @see IssueSubEntity
     */

    public void setIssueSubEntityFilter(java.util.Collection<String> issueSubEntityFilter) {
        if (issueSubEntityFilter == null) {
            this.issueSubEntityFilter = null;
            return;
        }

        this.issueSubEntityFilter = new java.util.ArrayList<String>(issueSubEntityFilter);
    }

    /**
     * <p>
     * Specify whether to crawl comments, attachments, and work logs. You can specify one or more of these options.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setIssueSubEntityFilter(java.util.Collection)} or {@link #withIssueSubEntityFilter(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param issueSubEntityFilter
     *        Specify whether to crawl comments, attachments, and work logs. You can specify one or more of these
     *        options.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see IssueSubEntity
     */

    public JiraConfiguration withIssueSubEntityFilter(String... issueSubEntityFilter) {
        if (this.issueSubEntityFilter == null) {
            setIssueSubEntityFilter(new java.util.ArrayList<String>(issueSubEntityFilter.length));
        }
        for (String ele : issueSubEntityFilter) {
            this.issueSubEntityFilter.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Specify whether to crawl comments, attachments, and work logs. You can specify one or more of these options.
     * </p>
     * 
     * @param issueSubEntityFilter
     *        Specify whether to crawl comments, attachments, and work logs. You can specify one or more of these
     *        options.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see IssueSubEntity
     */

    public JiraConfiguration withIssueSubEntityFilter(java.util.Collection<String> issueSubEntityFilter) {
        setIssueSubEntityFilter(issueSubEntityFilter);
        return this;
    }

    /**
     * <p>
     * Specify whether to crawl comments, attachments, and work logs. You can specify one or more of these options.
     * </p>
     * 
     * @param issueSubEntityFilter
     *        Specify whether to crawl comments, attachments, and work logs. You can specify one or more of these
     *        options.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see IssueSubEntity
     */

    public JiraConfiguration withIssueSubEntityFilter(IssueSubEntity... issueSubEntityFilter) {
        java.util.ArrayList<String> issueSubEntityFilterCopy = new java.util.ArrayList<String>(issueSubEntityFilter.length);
        for (IssueSubEntity value : issueSubEntityFilter) {
            issueSubEntityFilterCopy.add(value.toString());
        }
        if (getIssueSubEntityFilter() == null) {
            setIssueSubEntityFilter(issueSubEntityFilterCopy);
        } else {
            getIssueSubEntityFilter().addAll(issueSubEntityFilterCopy);
        }
        return this;
    }

    /**
     * <p>
     * A list of DataSourceToIndexFieldMapping objects that map attributes or field names of Jira attachments to Amazon
     * Kendra index field names. To create custom fields, use the UpdateIndex API before you map to Jira fields. For
     * more information, see <a href="https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html"> Mapping data
     * source fields</a>. The Jira data source field names must exist in your Jira custom metadata.
     * </p>
     * 
     * @return A list of DataSourceToIndexFieldMapping objects that map attributes or field names of Jira attachments to
     *         Amazon Kendra index field names. To create custom fields, use the UpdateIndex API before you map to Jira
     *         fields. For more information, see <a
     *         href="https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html"> Mapping data source fields</a>.
     *         The Jira data source field names must exist in your Jira custom metadata.
     */

    public java.util.List<DataSourceToIndexFieldMapping> getAttachmentFieldMappings() {
        return attachmentFieldMappings;
    }

    /**
     * <p>
     * A list of DataSourceToIndexFieldMapping objects that map attributes or field names of Jira attachments to Amazon
     * Kendra index field names. To create custom fields, use the UpdateIndex API before you map to Jira fields. For
     * more information, see <a href="https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html"> Mapping data
     * source fields</a>. The Jira data source field names must exist in your Jira custom metadata.
     * </p>
     * 
     * @param attachmentFieldMappings
     *        A list of DataSourceToIndexFieldMapping objects that map attributes or field names of Jira attachments to
     *        Amazon Kendra index field names. To create custom fields, use the UpdateIndex API before you map to Jira
     *        fields. For more information, see <a
     *        href="https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html"> Mapping data source fields</a>.
     *        The Jira data source field names must exist in your Jira custom metadata.
     */

    public void setAttachmentFieldMappings(java.util.Collection<DataSourceToIndexFieldMapping> attachmentFieldMappings) {
        if (attachmentFieldMappings == null) {
            this.attachmentFieldMappings = null;
            return;
        }

        this.attachmentFieldMappings = new java.util.ArrayList<DataSourceToIndexFieldMapping>(attachmentFieldMappings);
    }

    /**
     * <p>
     * A list of DataSourceToIndexFieldMapping objects that map attributes or field names of Jira attachments to Amazon
     * Kendra index field names. To create custom fields, use the UpdateIndex API before you map to Jira fields. For
     * more information, see <a href="https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html"> Mapping data
     * source fields</a>. The Jira data source field names must exist in your Jira custom metadata.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAttachmentFieldMappings(java.util.Collection)} or
     * {@link #withAttachmentFieldMappings(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param attachmentFieldMappings
     *        A list of DataSourceToIndexFieldMapping objects that map attributes or field names of Jira attachments to
     *        Amazon Kendra index field names. To create custom fields, use the UpdateIndex API before you map to Jira
     *        fields. For more information, see <a
     *        href="https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html"> Mapping data source fields</a>.
     *        The Jira data source field names must exist in your Jira custom metadata.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JiraConfiguration withAttachmentFieldMappings(DataSourceToIndexFieldMapping... attachmentFieldMappings) {
        if (this.attachmentFieldMappings == null) {
            setAttachmentFieldMappings(new java.util.ArrayList<DataSourceToIndexFieldMapping>(attachmentFieldMappings.length));
        }
        for (DataSourceToIndexFieldMapping ele : attachmentFieldMappings) {
            this.attachmentFieldMappings.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of DataSourceToIndexFieldMapping objects that map attributes or field names of Jira attachments to Amazon
     * Kendra index field names. To create custom fields, use the UpdateIndex API before you map to Jira fields. For
     * more information, see <a href="https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html"> Mapping data
     * source fields</a>. The Jira data source field names must exist in your Jira custom metadata.
     * </p>
     * 
     * @param attachmentFieldMappings
     *        A list of DataSourceToIndexFieldMapping objects that map attributes or field names of Jira attachments to
     *        Amazon Kendra index field names. To create custom fields, use the UpdateIndex API before you map to Jira
     *        fields. For more information, see <a
     *        href="https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html"> Mapping data source fields</a>.
     *        The Jira data source field names must exist in your Jira custom metadata.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JiraConfiguration withAttachmentFieldMappings(java.util.Collection<DataSourceToIndexFieldMapping> attachmentFieldMappings) {
        setAttachmentFieldMappings(attachmentFieldMappings);
        return this;
    }

    /**
     * <p>
     * A list of DataSourceToIndexFieldMapping objects that map attributes or field names of Jira comments to Amazon
     * Kendra index field names. To create custom fields, use the UpdateIndex API before you map to Jira fields. For
     * more information, see <a href="https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html"> Mapping data
     * source fields</a>. The Jira data source field names must exist in your Jira custom metadata.
     * </p>
     * 
     * @return A list of DataSourceToIndexFieldMapping objects that map attributes or field names of Jira comments to
     *         Amazon Kendra index field names. To create custom fields, use the UpdateIndex API before you map to Jira
     *         fields. For more information, see <a
     *         href="https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html"> Mapping data source fields</a>.
     *         The Jira data source field names must exist in your Jira custom metadata.
     */

    public java.util.List<DataSourceToIndexFieldMapping> getCommentFieldMappings() {
        return commentFieldMappings;
    }

    /**
     * <p>
     * A list of DataSourceToIndexFieldMapping objects that map attributes or field names of Jira comments to Amazon
     * Kendra index field names. To create custom fields, use the UpdateIndex API before you map to Jira fields. For
     * more information, see <a href="https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html"> Mapping data
     * source fields</a>. The Jira data source field names must exist in your Jira custom metadata.
     * </p>
     * 
     * @param commentFieldMappings
     *        A list of DataSourceToIndexFieldMapping objects that map attributes or field names of Jira comments to
     *        Amazon Kendra index field names. To create custom fields, use the UpdateIndex API before you map to Jira
     *        fields. For more information, see <a
     *        href="https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html"> Mapping data source fields</a>.
     *        The Jira data source field names must exist in your Jira custom metadata.
     */

    public void setCommentFieldMappings(java.util.Collection<DataSourceToIndexFieldMapping> commentFieldMappings) {
        if (commentFieldMappings == null) {
            this.commentFieldMappings = null;
            return;
        }

        this.commentFieldMappings = new java.util.ArrayList<DataSourceToIndexFieldMapping>(commentFieldMappings);
    }

    /**
     * <p>
     * A list of DataSourceToIndexFieldMapping objects that map attributes or field names of Jira comments to Amazon
     * Kendra index field names. To create custom fields, use the UpdateIndex API before you map to Jira fields. For
     * more information, see <a href="https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html"> Mapping data
     * source fields</a>. The Jira data source field names must exist in your Jira custom metadata.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCommentFieldMappings(java.util.Collection)} or {@link #withCommentFieldMappings(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param commentFieldMappings
     *        A list of DataSourceToIndexFieldMapping objects that map attributes or field names of Jira comments to
     *        Amazon Kendra index field names. To create custom fields, use the UpdateIndex API before you map to Jira
     *        fields. For more information, see <a
     *        href="https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html"> Mapping data source fields</a>.
     *        The Jira data source field names must exist in your Jira custom metadata.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JiraConfiguration withCommentFieldMappings(DataSourceToIndexFieldMapping... commentFieldMappings) {
        if (this.commentFieldMappings == null) {
            setCommentFieldMappings(new java.util.ArrayList<DataSourceToIndexFieldMapping>(commentFieldMappings.length));
        }
        for (DataSourceToIndexFieldMapping ele : commentFieldMappings) {
            this.commentFieldMappings.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of DataSourceToIndexFieldMapping objects that map attributes or field names of Jira comments to Amazon
     * Kendra index field names. To create custom fields, use the UpdateIndex API before you map to Jira fields. For
     * more information, see <a href="https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html"> Mapping data
     * source fields</a>. The Jira data source field names must exist in your Jira custom metadata.
     * </p>
     * 
     * @param commentFieldMappings
     *        A list of DataSourceToIndexFieldMapping objects that map attributes or field names of Jira comments to
     *        Amazon Kendra index field names. To create custom fields, use the UpdateIndex API before you map to Jira
     *        fields. For more information, see <a
     *        href="https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html"> Mapping data source fields</a>.
     *        The Jira data source field names must exist in your Jira custom metadata.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JiraConfiguration withCommentFieldMappings(java.util.Collection<DataSourceToIndexFieldMapping> commentFieldMappings) {
        setCommentFieldMappings(commentFieldMappings);
        return this;
    }

    /**
     * <p>
     * A list of DataSourceToIndexFieldMapping objects that map attributes or field names of Jira issues to Amazon
     * Kendra index field names. To create custom fields, use the UpdateIndex API before you map to Jira fields. For
     * more information, see <a href="https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html"> Mapping data
     * source fields</a>. The Jira data source field names must exist in your Jira custom metadata.
     * </p>
     * 
     * @return A list of DataSourceToIndexFieldMapping objects that map attributes or field names of Jira issues to
     *         Amazon Kendra index field names. To create custom fields, use the UpdateIndex API before you map to Jira
     *         fields. For more information, see <a
     *         href="https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html"> Mapping data source fields</a>.
     *         The Jira data source field names must exist in your Jira custom metadata.
     */

    public java.util.List<DataSourceToIndexFieldMapping> getIssueFieldMappings() {
        return issueFieldMappings;
    }

    /**
     * <p>
     * A list of DataSourceToIndexFieldMapping objects that map attributes or field names of Jira issues to Amazon
     * Kendra index field names. To create custom fields, use the UpdateIndex API before you map to Jira fields. For
     * more information, see <a href="https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html"> Mapping data
     * source fields</a>. The Jira data source field names must exist in your Jira custom metadata.
     * </p>
     * 
     * @param issueFieldMappings
     *        A list of DataSourceToIndexFieldMapping objects that map attributes or field names of Jira issues to
     *        Amazon Kendra index field names. To create custom fields, use the UpdateIndex API before you map to Jira
     *        fields. For more information, see <a
     *        href="https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html"> Mapping data source fields</a>.
     *        The Jira data source field names must exist in your Jira custom metadata.
     */

    public void setIssueFieldMappings(java.util.Collection<DataSourceToIndexFieldMapping> issueFieldMappings) {
        if (issueFieldMappings == null) {
            this.issueFieldMappings = null;
            return;
        }

        this.issueFieldMappings = new java.util.ArrayList<DataSourceToIndexFieldMapping>(issueFieldMappings);
    }

    /**
     * <p>
     * A list of DataSourceToIndexFieldMapping objects that map attributes or field names of Jira issues to Amazon
     * Kendra index field names. To create custom fields, use the UpdateIndex API before you map to Jira fields. For
     * more information, see <a href="https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html"> Mapping data
     * source fields</a>. The Jira data source field names must exist in your Jira custom metadata.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setIssueFieldMappings(java.util.Collection)} or {@link #withIssueFieldMappings(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param issueFieldMappings
     *        A list of DataSourceToIndexFieldMapping objects that map attributes or field names of Jira issues to
     *        Amazon Kendra index field names. To create custom fields, use the UpdateIndex API before you map to Jira
     *        fields. For more information, see <a
     *        href="https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html"> Mapping data source fields</a>.
     *        The Jira data source field names must exist in your Jira custom metadata.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JiraConfiguration withIssueFieldMappings(DataSourceToIndexFieldMapping... issueFieldMappings) {
        if (this.issueFieldMappings == null) {
            setIssueFieldMappings(new java.util.ArrayList<DataSourceToIndexFieldMapping>(issueFieldMappings.length));
        }
        for (DataSourceToIndexFieldMapping ele : issueFieldMappings) {
            this.issueFieldMappings.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of DataSourceToIndexFieldMapping objects that map attributes or field names of Jira issues to Amazon
     * Kendra index field names. To create custom fields, use the UpdateIndex API before you map to Jira fields. For
     * more information, see <a href="https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html"> Mapping data
     * source fields</a>. The Jira data source field names must exist in your Jira custom metadata.
     * </p>
     * 
     * @param issueFieldMappings
     *        A list of DataSourceToIndexFieldMapping objects that map attributes or field names of Jira issues to
     *        Amazon Kendra index field names. To create custom fields, use the UpdateIndex API before you map to Jira
     *        fields. For more information, see <a
     *        href="https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html"> Mapping data source fields</a>.
     *        The Jira data source field names must exist in your Jira custom metadata.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JiraConfiguration withIssueFieldMappings(java.util.Collection<DataSourceToIndexFieldMapping> issueFieldMappings) {
        setIssueFieldMappings(issueFieldMappings);
        return this;
    }

    /**
     * <p>
     * A list of DataSourceToIndexFieldMapping objects that map attributes or field names of Jira projects to Amazon
     * Kendra index field names. To create custom fields, use the UpdateIndex API before you map to Jira fields. For
     * more information, see <a href="https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html"> Mapping data
     * source fields</a>. The Jira data source field names must exist in your Jira custom metadata.
     * </p>
     * 
     * @return A list of DataSourceToIndexFieldMapping objects that map attributes or field names of Jira projects to
     *         Amazon Kendra index field names. To create custom fields, use the UpdateIndex API before you map to Jira
     *         fields. For more information, see <a
     *         href="https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html"> Mapping data source fields</a>.
     *         The Jira data source field names must exist in your Jira custom metadata.
     */

    public java.util.List<DataSourceToIndexFieldMapping> getProjectFieldMappings() {
        return projectFieldMappings;
    }

    /**
     * <p>
     * A list of DataSourceToIndexFieldMapping objects that map attributes or field names of Jira projects to Amazon
     * Kendra index field names. To create custom fields, use the UpdateIndex API before you map to Jira fields. For
     * more information, see <a href="https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html"> Mapping data
     * source fields</a>. The Jira data source field names must exist in your Jira custom metadata.
     * </p>
     * 
     * @param projectFieldMappings
     *        A list of DataSourceToIndexFieldMapping objects that map attributes or field names of Jira projects to
     *        Amazon Kendra index field names. To create custom fields, use the UpdateIndex API before you map to Jira
     *        fields. For more information, see <a
     *        href="https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html"> Mapping data source fields</a>.
     *        The Jira data source field names must exist in your Jira custom metadata.
     */

    public void setProjectFieldMappings(java.util.Collection<DataSourceToIndexFieldMapping> projectFieldMappings) {
        if (projectFieldMappings == null) {
            this.projectFieldMappings = null;
            return;
        }

        this.projectFieldMappings = new java.util.ArrayList<DataSourceToIndexFieldMapping>(projectFieldMappings);
    }

    /**
     * <p>
     * A list of DataSourceToIndexFieldMapping objects that map attributes or field names of Jira projects to Amazon
     * Kendra index field names. To create custom fields, use the UpdateIndex API before you map to Jira fields. For
     * more information, see <a href="https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html"> Mapping data
     * source fields</a>. The Jira data source field names must exist in your Jira custom metadata.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setProjectFieldMappings(java.util.Collection)} or {@link #withProjectFieldMappings(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param projectFieldMappings
     *        A list of DataSourceToIndexFieldMapping objects that map attributes or field names of Jira projects to
     *        Amazon Kendra index field names. To create custom fields, use the UpdateIndex API before you map to Jira
     *        fields. For more information, see <a
     *        href="https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html"> Mapping data source fields</a>.
     *        The Jira data source field names must exist in your Jira custom metadata.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JiraConfiguration withProjectFieldMappings(DataSourceToIndexFieldMapping... projectFieldMappings) {
        if (this.projectFieldMappings == null) {
            setProjectFieldMappings(new java.util.ArrayList<DataSourceToIndexFieldMapping>(projectFieldMappings.length));
        }
        for (DataSourceToIndexFieldMapping ele : projectFieldMappings) {
            this.projectFieldMappings.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of DataSourceToIndexFieldMapping objects that map attributes or field names of Jira projects to Amazon
     * Kendra index field names. To create custom fields, use the UpdateIndex API before you map to Jira fields. For
     * more information, see <a href="https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html"> Mapping data
     * source fields</a>. The Jira data source field names must exist in your Jira custom metadata.
     * </p>
     * 
     * @param projectFieldMappings
     *        A list of DataSourceToIndexFieldMapping objects that map attributes or field names of Jira projects to
     *        Amazon Kendra index field names. To create custom fields, use the UpdateIndex API before you map to Jira
     *        fields. For more information, see <a
     *        href="https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html"> Mapping data source fields</a>.
     *        The Jira data source field names must exist in your Jira custom metadata.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JiraConfiguration withProjectFieldMappings(java.util.Collection<DataSourceToIndexFieldMapping> projectFieldMappings) {
        setProjectFieldMappings(projectFieldMappings);
        return this;
    }

    /**
     * <p>
     * A list of DataSourceToIndexFieldMapping objects that map attributes or field names of Jira work logs to Amazon
     * Kendra index field names. To create custom fields, use the UpdateIndex API before you map to Jira fields. For
     * more information, see <a href="https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html"> Mapping data
     * source fields</a>. The Jira data source field names must exist in your Jira custom metadata.
     * </p>
     * 
     * @return A list of DataSourceToIndexFieldMapping objects that map attributes or field names of Jira work logs to
     *         Amazon Kendra index field names. To create custom fields, use the UpdateIndex API before you map to Jira
     *         fields. For more information, see <a
     *         href="https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html"> Mapping data source fields</a>.
     *         The Jira data source field names must exist in your Jira custom metadata.
     */

    public java.util.List<DataSourceToIndexFieldMapping> getWorkLogFieldMappings() {
        return workLogFieldMappings;
    }

    /**
     * <p>
     * A list of DataSourceToIndexFieldMapping objects that map attributes or field names of Jira work logs to Amazon
     * Kendra index field names. To create custom fields, use the UpdateIndex API before you map to Jira fields. For
     * more information, see <a href="https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html"> Mapping data
     * source fields</a>. The Jira data source field names must exist in your Jira custom metadata.
     * </p>
     * 
     * @param workLogFieldMappings
     *        A list of DataSourceToIndexFieldMapping objects that map attributes or field names of Jira work logs to
     *        Amazon Kendra index field names. To create custom fields, use the UpdateIndex API before you map to Jira
     *        fields. For more information, see <a
     *        href="https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html"> Mapping data source fields</a>.
     *        The Jira data source field names must exist in your Jira custom metadata.
     */

    public void setWorkLogFieldMappings(java.util.Collection<DataSourceToIndexFieldMapping> workLogFieldMappings) {
        if (workLogFieldMappings == null) {
            this.workLogFieldMappings = null;
            return;
        }

        this.workLogFieldMappings = new java.util.ArrayList<DataSourceToIndexFieldMapping>(workLogFieldMappings);
    }

    /**
     * <p>
     * A list of DataSourceToIndexFieldMapping objects that map attributes or field names of Jira work logs to Amazon
     * Kendra index field names. To create custom fields, use the UpdateIndex API before you map to Jira fields. For
     * more information, see <a href="https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html"> Mapping data
     * source fields</a>. The Jira data source field names must exist in your Jira custom metadata.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setWorkLogFieldMappings(java.util.Collection)} or {@link #withWorkLogFieldMappings(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param workLogFieldMappings
     *        A list of DataSourceToIndexFieldMapping objects that map attributes or field names of Jira work logs to
     *        Amazon Kendra index field names. To create custom fields, use the UpdateIndex API before you map to Jira
     *        fields. For more information, see <a
     *        href="https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html"> Mapping data source fields</a>.
     *        The Jira data source field names must exist in your Jira custom metadata.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JiraConfiguration withWorkLogFieldMappings(DataSourceToIndexFieldMapping... workLogFieldMappings) {
        if (this.workLogFieldMappings == null) {
            setWorkLogFieldMappings(new java.util.ArrayList<DataSourceToIndexFieldMapping>(workLogFieldMappings.length));
        }
        for (DataSourceToIndexFieldMapping ele : workLogFieldMappings) {
            this.workLogFieldMappings.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of DataSourceToIndexFieldMapping objects that map attributes or field names of Jira work logs to Amazon
     * Kendra index field names. To create custom fields, use the UpdateIndex API before you map to Jira fields. For
     * more information, see <a href="https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html"> Mapping data
     * source fields</a>. The Jira data source field names must exist in your Jira custom metadata.
     * </p>
     * 
     * @param workLogFieldMappings
     *        A list of DataSourceToIndexFieldMapping objects that map attributes or field names of Jira work logs to
     *        Amazon Kendra index field names. To create custom fields, use the UpdateIndex API before you map to Jira
     *        fields. For more information, see <a
     *        href="https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html"> Mapping data source fields</a>.
     *        The Jira data source field names must exist in your Jira custom metadata.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JiraConfiguration withWorkLogFieldMappings(java.util.Collection<DataSourceToIndexFieldMapping> workLogFieldMappings) {
        setWorkLogFieldMappings(workLogFieldMappings);
        return this;
    }

    /**
     * <p>
     * A list of regular expression patterns to include certain file paths, file names, and file types in your Jira data
     * source. Files that match the patterns are included in the index. Files that don't match the patterns are excluded
     * from the index. If a file matches both an inclusion pattern and an exclusion pattern, the exclusion pattern takes
     * precedence and the file isn't included in the index.
     * </p>
     * 
     * @return A list of regular expression patterns to include certain file paths, file names, and file types in your
     *         Jira data source. Files that match the patterns are included in the index. Files that don't match the
     *         patterns are excluded from the index. If a file matches both an inclusion pattern and an exclusion
     *         pattern, the exclusion pattern takes precedence and the file isn't included in the index.
     */

    public java.util.List<String> getInclusionPatterns() {
        return inclusionPatterns;
    }

    /**
     * <p>
     * A list of regular expression patterns to include certain file paths, file names, and file types in your Jira data
     * source. Files that match the patterns are included in the index. Files that don't match the patterns are excluded
     * from the index. If a file matches both an inclusion pattern and an exclusion pattern, the exclusion pattern takes
     * precedence and the file isn't included in the index.
     * </p>
     * 
     * @param inclusionPatterns
     *        A list of regular expression patterns to include certain file paths, file names, and file types in your
     *        Jira data source. Files that match the patterns are included in the index. Files that don't match the
     *        patterns are excluded from the index. If a file matches both an inclusion pattern and an exclusion
     *        pattern, the exclusion pattern takes precedence and the file isn't included in the index.
     */

    public void setInclusionPatterns(java.util.Collection<String> inclusionPatterns) {
        if (inclusionPatterns == null) {
            this.inclusionPatterns = null;
            return;
        }

        this.inclusionPatterns = new java.util.ArrayList<String>(inclusionPatterns);
    }

    /**
     * <p>
     * A list of regular expression patterns to include certain file paths, file names, and file types in your Jira data
     * source. Files that match the patterns are included in the index. Files that don't match the patterns are excluded
     * from the index. If a file matches both an inclusion pattern and an exclusion pattern, the exclusion pattern takes
     * precedence and the file isn't included in the index.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setInclusionPatterns(java.util.Collection)} or {@link #withInclusionPatterns(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param inclusionPatterns
     *        A list of regular expression patterns to include certain file paths, file names, and file types in your
     *        Jira data source. Files that match the patterns are included in the index. Files that don't match the
     *        patterns are excluded from the index. If a file matches both an inclusion pattern and an exclusion
     *        pattern, the exclusion pattern takes precedence and the file isn't included in the index.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JiraConfiguration withInclusionPatterns(String... inclusionPatterns) {
        if (this.inclusionPatterns == null) {
            setInclusionPatterns(new java.util.ArrayList<String>(inclusionPatterns.length));
        }
        for (String ele : inclusionPatterns) {
            this.inclusionPatterns.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of regular expression patterns to include certain file paths, file names, and file types in your Jira data
     * source. Files that match the patterns are included in the index. Files that don't match the patterns are excluded
     * from the index. If a file matches both an inclusion pattern and an exclusion pattern, the exclusion pattern takes
     * precedence and the file isn't included in the index.
     * </p>
     * 
     * @param inclusionPatterns
     *        A list of regular expression patterns to include certain file paths, file names, and file types in your
     *        Jira data source. Files that match the patterns are included in the index. Files that don't match the
     *        patterns are excluded from the index. If a file matches both an inclusion pattern and an exclusion
     *        pattern, the exclusion pattern takes precedence and the file isn't included in the index.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JiraConfiguration withInclusionPatterns(java.util.Collection<String> inclusionPatterns) {
        setInclusionPatterns(inclusionPatterns);
        return this;
    }

    /**
     * <p>
     * A list of regular expression patterns to exclude certain file paths, file names, and file types in your Jira data
     * source. Files that match the patterns are excluded from the index. Files that don’t match the patterns are
     * included in the index. If a file matches both an inclusion pattern and an exclusion pattern, the exclusion
     * pattern takes precedence and the file isn't included in the index.
     * </p>
     * 
     * @return A list of regular expression patterns to exclude certain file paths, file names, and file types in your
     *         Jira data source. Files that match the patterns are excluded from the index. Files that don’t match the
     *         patterns are included in the index. If a file matches both an inclusion pattern and an exclusion pattern,
     *         the exclusion pattern takes precedence and the file isn't included in the index.
     */

    public java.util.List<String> getExclusionPatterns() {
        return exclusionPatterns;
    }

    /**
     * <p>
     * A list of regular expression patterns to exclude certain file paths, file names, and file types in your Jira data
     * source. Files that match the patterns are excluded from the index. Files that don’t match the patterns are
     * included in the index. If a file matches both an inclusion pattern and an exclusion pattern, the exclusion
     * pattern takes precedence and the file isn't included in the index.
     * </p>
     * 
     * @param exclusionPatterns
     *        A list of regular expression patterns to exclude certain file paths, file names, and file types in your
     *        Jira data source. Files that match the patterns are excluded from the index. Files that don’t match the
     *        patterns are included in the index. If a file matches both an inclusion pattern and an exclusion pattern,
     *        the exclusion pattern takes precedence and the file isn't included in the index.
     */

    public void setExclusionPatterns(java.util.Collection<String> exclusionPatterns) {
        if (exclusionPatterns == null) {
            this.exclusionPatterns = null;
            return;
        }

        this.exclusionPatterns = new java.util.ArrayList<String>(exclusionPatterns);
    }

    /**
     * <p>
     * A list of regular expression patterns to exclude certain file paths, file names, and file types in your Jira data
     * source. Files that match the patterns are excluded from the index. Files that don’t match the patterns are
     * included in the index. If a file matches both an inclusion pattern and an exclusion pattern, the exclusion
     * pattern takes precedence and the file isn't included in the index.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setExclusionPatterns(java.util.Collection)} or {@link #withExclusionPatterns(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param exclusionPatterns
     *        A list of regular expression patterns to exclude certain file paths, file names, and file types in your
     *        Jira data source. Files that match the patterns are excluded from the index. Files that don’t match the
     *        patterns are included in the index. If a file matches both an inclusion pattern and an exclusion pattern,
     *        the exclusion pattern takes precedence and the file isn't included in the index.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JiraConfiguration withExclusionPatterns(String... exclusionPatterns) {
        if (this.exclusionPatterns == null) {
            setExclusionPatterns(new java.util.ArrayList<String>(exclusionPatterns.length));
        }
        for (String ele : exclusionPatterns) {
            this.exclusionPatterns.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of regular expression patterns to exclude certain file paths, file names, and file types in your Jira data
     * source. Files that match the patterns are excluded from the index. Files that don’t match the patterns are
     * included in the index. If a file matches both an inclusion pattern and an exclusion pattern, the exclusion
     * pattern takes precedence and the file isn't included in the index.
     * </p>
     * 
     * @param exclusionPatterns
     *        A list of regular expression patterns to exclude certain file paths, file names, and file types in your
     *        Jira data source. Files that match the patterns are excluded from the index. Files that don’t match the
     *        patterns are included in the index. If a file matches both an inclusion pattern and an exclusion pattern,
     *        the exclusion pattern takes precedence and the file isn't included in the index.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JiraConfiguration withExclusionPatterns(java.util.Collection<String> exclusionPatterns) {
        setExclusionPatterns(exclusionPatterns);
        return this;
    }

    /**
     * <p>
     * Configuration information for an Amazon Virtual Private Cloud to connect to your Jira. Your Jira account must
     * reside inside your VPC.
     * </p>
     * 
     * @param vpcConfiguration
     *        Configuration information for an Amazon Virtual Private Cloud to connect to your Jira. Your Jira account
     *        must reside inside your VPC.
     */

    public void setVpcConfiguration(DataSourceVpcConfiguration vpcConfiguration) {
        this.vpcConfiguration = vpcConfiguration;
    }

    /**
     * <p>
     * Configuration information for an Amazon Virtual Private Cloud to connect to your Jira. Your Jira account must
     * reside inside your VPC.
     * </p>
     * 
     * @return Configuration information for an Amazon Virtual Private Cloud to connect to your Jira. Your Jira account
     *         must reside inside your VPC.
     */

    public DataSourceVpcConfiguration getVpcConfiguration() {
        return this.vpcConfiguration;
    }

    /**
     * <p>
     * Configuration information for an Amazon Virtual Private Cloud to connect to your Jira. Your Jira account must
     * reside inside your VPC.
     * </p>
     * 
     * @param vpcConfiguration
     *        Configuration information for an Amazon Virtual Private Cloud to connect to your Jira. Your Jira account
     *        must reside inside your VPC.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JiraConfiguration withVpcConfiguration(DataSourceVpcConfiguration vpcConfiguration) {
        setVpcConfiguration(vpcConfiguration);
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
        if (getJiraAccountUrl() != null)
            sb.append("JiraAccountUrl: ").append(getJiraAccountUrl()).append(",");
        if (getSecretArn() != null)
            sb.append("SecretArn: ").append(getSecretArn()).append(",");
        if (getUseChangeLog() != null)
            sb.append("UseChangeLog: ").append(getUseChangeLog()).append(",");
        if (getProject() != null)
            sb.append("Project: ").append(getProject()).append(",");
        if (getIssueType() != null)
            sb.append("IssueType: ").append(getIssueType()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getIssueSubEntityFilter() != null)
            sb.append("IssueSubEntityFilter: ").append(getIssueSubEntityFilter()).append(",");
        if (getAttachmentFieldMappings() != null)
            sb.append("AttachmentFieldMappings: ").append(getAttachmentFieldMappings()).append(",");
        if (getCommentFieldMappings() != null)
            sb.append("CommentFieldMappings: ").append(getCommentFieldMappings()).append(",");
        if (getIssueFieldMappings() != null)
            sb.append("IssueFieldMappings: ").append(getIssueFieldMappings()).append(",");
        if (getProjectFieldMappings() != null)
            sb.append("ProjectFieldMappings: ").append(getProjectFieldMappings()).append(",");
        if (getWorkLogFieldMappings() != null)
            sb.append("WorkLogFieldMappings: ").append(getWorkLogFieldMappings()).append(",");
        if (getInclusionPatterns() != null)
            sb.append("InclusionPatterns: ").append(getInclusionPatterns()).append(",");
        if (getExclusionPatterns() != null)
            sb.append("ExclusionPatterns: ").append(getExclusionPatterns()).append(",");
        if (getVpcConfiguration() != null)
            sb.append("VpcConfiguration: ").append(getVpcConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof JiraConfiguration == false)
            return false;
        JiraConfiguration other = (JiraConfiguration) obj;
        if (other.getJiraAccountUrl() == null ^ this.getJiraAccountUrl() == null)
            return false;
        if (other.getJiraAccountUrl() != null && other.getJiraAccountUrl().equals(this.getJiraAccountUrl()) == false)
            return false;
        if (other.getSecretArn() == null ^ this.getSecretArn() == null)
            return false;
        if (other.getSecretArn() != null && other.getSecretArn().equals(this.getSecretArn()) == false)
            return false;
        if (other.getUseChangeLog() == null ^ this.getUseChangeLog() == null)
            return false;
        if (other.getUseChangeLog() != null && other.getUseChangeLog().equals(this.getUseChangeLog()) == false)
            return false;
        if (other.getProject() == null ^ this.getProject() == null)
            return false;
        if (other.getProject() != null && other.getProject().equals(this.getProject()) == false)
            return false;
        if (other.getIssueType() == null ^ this.getIssueType() == null)
            return false;
        if (other.getIssueType() != null && other.getIssueType().equals(this.getIssueType()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getIssueSubEntityFilter() == null ^ this.getIssueSubEntityFilter() == null)
            return false;
        if (other.getIssueSubEntityFilter() != null && other.getIssueSubEntityFilter().equals(this.getIssueSubEntityFilter()) == false)
            return false;
        if (other.getAttachmentFieldMappings() == null ^ this.getAttachmentFieldMappings() == null)
            return false;
        if (other.getAttachmentFieldMappings() != null && other.getAttachmentFieldMappings().equals(this.getAttachmentFieldMappings()) == false)
            return false;
        if (other.getCommentFieldMappings() == null ^ this.getCommentFieldMappings() == null)
            return false;
        if (other.getCommentFieldMappings() != null && other.getCommentFieldMappings().equals(this.getCommentFieldMappings()) == false)
            return false;
        if (other.getIssueFieldMappings() == null ^ this.getIssueFieldMappings() == null)
            return false;
        if (other.getIssueFieldMappings() != null && other.getIssueFieldMappings().equals(this.getIssueFieldMappings()) == false)
            return false;
        if (other.getProjectFieldMappings() == null ^ this.getProjectFieldMappings() == null)
            return false;
        if (other.getProjectFieldMappings() != null && other.getProjectFieldMappings().equals(this.getProjectFieldMappings()) == false)
            return false;
        if (other.getWorkLogFieldMappings() == null ^ this.getWorkLogFieldMappings() == null)
            return false;
        if (other.getWorkLogFieldMappings() != null && other.getWorkLogFieldMappings().equals(this.getWorkLogFieldMappings()) == false)
            return false;
        if (other.getInclusionPatterns() == null ^ this.getInclusionPatterns() == null)
            return false;
        if (other.getInclusionPatterns() != null && other.getInclusionPatterns().equals(this.getInclusionPatterns()) == false)
            return false;
        if (other.getExclusionPatterns() == null ^ this.getExclusionPatterns() == null)
            return false;
        if (other.getExclusionPatterns() != null && other.getExclusionPatterns().equals(this.getExclusionPatterns()) == false)
            return false;
        if (other.getVpcConfiguration() == null ^ this.getVpcConfiguration() == null)
            return false;
        if (other.getVpcConfiguration() != null && other.getVpcConfiguration().equals(this.getVpcConfiguration()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getJiraAccountUrl() == null) ? 0 : getJiraAccountUrl().hashCode());
        hashCode = prime * hashCode + ((getSecretArn() == null) ? 0 : getSecretArn().hashCode());
        hashCode = prime * hashCode + ((getUseChangeLog() == null) ? 0 : getUseChangeLog().hashCode());
        hashCode = prime * hashCode + ((getProject() == null) ? 0 : getProject().hashCode());
        hashCode = prime * hashCode + ((getIssueType() == null) ? 0 : getIssueType().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getIssueSubEntityFilter() == null) ? 0 : getIssueSubEntityFilter().hashCode());
        hashCode = prime * hashCode + ((getAttachmentFieldMappings() == null) ? 0 : getAttachmentFieldMappings().hashCode());
        hashCode = prime * hashCode + ((getCommentFieldMappings() == null) ? 0 : getCommentFieldMappings().hashCode());
        hashCode = prime * hashCode + ((getIssueFieldMappings() == null) ? 0 : getIssueFieldMappings().hashCode());
        hashCode = prime * hashCode + ((getProjectFieldMappings() == null) ? 0 : getProjectFieldMappings().hashCode());
        hashCode = prime * hashCode + ((getWorkLogFieldMappings() == null) ? 0 : getWorkLogFieldMappings().hashCode());
        hashCode = prime * hashCode + ((getInclusionPatterns() == null) ? 0 : getInclusionPatterns().hashCode());
        hashCode = prime * hashCode + ((getExclusionPatterns() == null) ? 0 : getExclusionPatterns().hashCode());
        hashCode = prime * hashCode + ((getVpcConfiguration() == null) ? 0 : getVpcConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public JiraConfiguration clone() {
        try {
            return (JiraConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.kendra.model.transform.JiraConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
