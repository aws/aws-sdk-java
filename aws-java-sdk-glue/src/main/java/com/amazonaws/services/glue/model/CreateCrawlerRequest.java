/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.glue.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/CreateCrawler" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateCrawlerRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Name of the new crawler.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The IAM role (or ARN of an IAM role) used by the new crawler to access customer resources.
     * </p>
     */
    private String role;
    /**
     * <p>
     * The AWS Glue database where results are written, such as:
     * <code>arn:aws:daylight:us-east-1::database/sometable/*</code>.
     * </p>
     */
    private String databaseName;
    /**
     * <p>
     * A description of the new crawler.
     * </p>
     */
    private String description;
    /**
     * <p>
     * A list of collection of targets to crawl.
     * </p>
     */
    private CrawlerTargets targets;
    /**
     * <p>
     * A <code>cron</code> expression used to specify the schedule (see <a
     * href="http://docs.aws.amazon.com/glue/latest/dg/monitor-data-warehouse-schedule.html">Time-Based Schedules for
     * Jobs and Crawlers</a>. For example, to run something every day at 12:15 UTC, you would specify:
     * <code>cron(15 12 * * ? *)</code>.
     * </p>
     */
    private String schedule;
    /**
     * <p>
     * A list of custom classifiers that the user has registered. By default, all built-in classifiers are included in a
     * crawl, but these custom classifiers always override the default classifiers for a given classification.
     * </p>
     */
    private java.util.List<String> classifiers;
    /**
     * <p>
     * The table prefix used for catalog tables that are created.
     * </p>
     */
    private String tablePrefix;
    /**
     * <p>
     * Policy for the crawler's update and deletion behavior.
     * </p>
     */
    private SchemaChangePolicy schemaChangePolicy;
    /**
     * <p>
     * Crawler configuration information. This versioned JSON string allows users to specify aspects of a crawler's
     * behavior. For more information, see <a
     * href="http://docs.aws.amazon.com/glue/latest/dg/crawler-configuration.html">Configuring a Crawler</a>.
     * </p>
     */
    private String configuration;
    /**
     * <p>
     * The name of the SecurityConfiguration structure to be used by this Crawler.
     * </p>
     */
    private String crawlerSecurityConfiguration;
    /**
     * <p>
     * The tags to use with this crawler request. You may use tags to limit access to the crawler. For more information
     * about tags in AWS Glue, see <a href="http://docs.aws.amazon.com/glue/latest/dg/monitor-tags.html">AWS Tags in AWS
     * Glue</a> in the developer guide.
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * Name of the new crawler.
     * </p>
     * 
     * @param name
     *        Name of the new crawler.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * Name of the new crawler.
     * </p>
     * 
     * @return Name of the new crawler.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * Name of the new crawler.
     * </p>
     * 
     * @param name
     *        Name of the new crawler.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCrawlerRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The IAM role (or ARN of an IAM role) used by the new crawler to access customer resources.
     * </p>
     * 
     * @param role
     *        The IAM role (or ARN of an IAM role) used by the new crawler to access customer resources.
     */

    public void setRole(String role) {
        this.role = role;
    }

    /**
     * <p>
     * The IAM role (or ARN of an IAM role) used by the new crawler to access customer resources.
     * </p>
     * 
     * @return The IAM role (or ARN of an IAM role) used by the new crawler to access customer resources.
     */

    public String getRole() {
        return this.role;
    }

    /**
     * <p>
     * The IAM role (or ARN of an IAM role) used by the new crawler to access customer resources.
     * </p>
     * 
     * @param role
     *        The IAM role (or ARN of an IAM role) used by the new crawler to access customer resources.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCrawlerRequest withRole(String role) {
        setRole(role);
        return this;
    }

    /**
     * <p>
     * The AWS Glue database where results are written, such as:
     * <code>arn:aws:daylight:us-east-1::database/sometable/*</code>.
     * </p>
     * 
     * @param databaseName
     *        The AWS Glue database where results are written, such as:
     *        <code>arn:aws:daylight:us-east-1::database/sometable/*</code>.
     */

    public void setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
    }

    /**
     * <p>
     * The AWS Glue database where results are written, such as:
     * <code>arn:aws:daylight:us-east-1::database/sometable/*</code>.
     * </p>
     * 
     * @return The AWS Glue database where results are written, such as:
     *         <code>arn:aws:daylight:us-east-1::database/sometable/*</code>.
     */

    public String getDatabaseName() {
        return this.databaseName;
    }

    /**
     * <p>
     * The AWS Glue database where results are written, such as:
     * <code>arn:aws:daylight:us-east-1::database/sometable/*</code>.
     * </p>
     * 
     * @param databaseName
     *        The AWS Glue database where results are written, such as:
     *        <code>arn:aws:daylight:us-east-1::database/sometable/*</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCrawlerRequest withDatabaseName(String databaseName) {
        setDatabaseName(databaseName);
        return this;
    }

    /**
     * <p>
     * A description of the new crawler.
     * </p>
     * 
     * @param description
     *        A description of the new crawler.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description of the new crawler.
     * </p>
     * 
     * @return A description of the new crawler.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A description of the new crawler.
     * </p>
     * 
     * @param description
     *        A description of the new crawler.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCrawlerRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * A list of collection of targets to crawl.
     * </p>
     * 
     * @param targets
     *        A list of collection of targets to crawl.
     */

    public void setTargets(CrawlerTargets targets) {
        this.targets = targets;
    }

    /**
     * <p>
     * A list of collection of targets to crawl.
     * </p>
     * 
     * @return A list of collection of targets to crawl.
     */

    public CrawlerTargets getTargets() {
        return this.targets;
    }

    /**
     * <p>
     * A list of collection of targets to crawl.
     * </p>
     * 
     * @param targets
     *        A list of collection of targets to crawl.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCrawlerRequest withTargets(CrawlerTargets targets) {
        setTargets(targets);
        return this;
    }

    /**
     * <p>
     * A <code>cron</code> expression used to specify the schedule (see <a
     * href="http://docs.aws.amazon.com/glue/latest/dg/monitor-data-warehouse-schedule.html">Time-Based Schedules for
     * Jobs and Crawlers</a>. For example, to run something every day at 12:15 UTC, you would specify:
     * <code>cron(15 12 * * ? *)</code>.
     * </p>
     * 
     * @param schedule
     *        A <code>cron</code> expression used to specify the schedule (see <a
     *        href="http://docs.aws.amazon.com/glue/latest/dg/monitor-data-warehouse-schedule.html">Time-Based Schedules
     *        for Jobs and Crawlers</a>. For example, to run something every day at 12:15 UTC, you would specify:
     *        <code>cron(15 12 * * ? *)</code>.
     */

    public void setSchedule(String schedule) {
        this.schedule = schedule;
    }

    /**
     * <p>
     * A <code>cron</code> expression used to specify the schedule (see <a
     * href="http://docs.aws.amazon.com/glue/latest/dg/monitor-data-warehouse-schedule.html">Time-Based Schedules for
     * Jobs and Crawlers</a>. For example, to run something every day at 12:15 UTC, you would specify:
     * <code>cron(15 12 * * ? *)</code>.
     * </p>
     * 
     * @return A <code>cron</code> expression used to specify the schedule (see <a
     *         href="http://docs.aws.amazon.com/glue/latest/dg/monitor-data-warehouse-schedule.html">Time-Based
     *         Schedules for Jobs and Crawlers</a>. For example, to run something every day at 12:15 UTC, you would
     *         specify: <code>cron(15 12 * * ? *)</code>.
     */

    public String getSchedule() {
        return this.schedule;
    }

    /**
     * <p>
     * A <code>cron</code> expression used to specify the schedule (see <a
     * href="http://docs.aws.amazon.com/glue/latest/dg/monitor-data-warehouse-schedule.html">Time-Based Schedules for
     * Jobs and Crawlers</a>. For example, to run something every day at 12:15 UTC, you would specify:
     * <code>cron(15 12 * * ? *)</code>.
     * </p>
     * 
     * @param schedule
     *        A <code>cron</code> expression used to specify the schedule (see <a
     *        href="http://docs.aws.amazon.com/glue/latest/dg/monitor-data-warehouse-schedule.html">Time-Based Schedules
     *        for Jobs and Crawlers</a>. For example, to run something every day at 12:15 UTC, you would specify:
     *        <code>cron(15 12 * * ? *)</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCrawlerRequest withSchedule(String schedule) {
        setSchedule(schedule);
        return this;
    }

    /**
     * <p>
     * A list of custom classifiers that the user has registered. By default, all built-in classifiers are included in a
     * crawl, but these custom classifiers always override the default classifiers for a given classification.
     * </p>
     * 
     * @return A list of custom classifiers that the user has registered. By default, all built-in classifiers are
     *         included in a crawl, but these custom classifiers always override the default classifiers for a given
     *         classification.
     */

    public java.util.List<String> getClassifiers() {
        return classifiers;
    }

    /**
     * <p>
     * A list of custom classifiers that the user has registered. By default, all built-in classifiers are included in a
     * crawl, but these custom classifiers always override the default classifiers for a given classification.
     * </p>
     * 
     * @param classifiers
     *        A list of custom classifiers that the user has registered. By default, all built-in classifiers are
     *        included in a crawl, but these custom classifiers always override the default classifiers for a given
     *        classification.
     */

    public void setClassifiers(java.util.Collection<String> classifiers) {
        if (classifiers == null) {
            this.classifiers = null;
            return;
        }

        this.classifiers = new java.util.ArrayList<String>(classifiers);
    }

    /**
     * <p>
     * A list of custom classifiers that the user has registered. By default, all built-in classifiers are included in a
     * crawl, but these custom classifiers always override the default classifiers for a given classification.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setClassifiers(java.util.Collection)} or {@link #withClassifiers(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param classifiers
     *        A list of custom classifiers that the user has registered. By default, all built-in classifiers are
     *        included in a crawl, but these custom classifiers always override the default classifiers for a given
     *        classification.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCrawlerRequest withClassifiers(String... classifiers) {
        if (this.classifiers == null) {
            setClassifiers(new java.util.ArrayList<String>(classifiers.length));
        }
        for (String ele : classifiers) {
            this.classifiers.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of custom classifiers that the user has registered. By default, all built-in classifiers are included in a
     * crawl, but these custom classifiers always override the default classifiers for a given classification.
     * </p>
     * 
     * @param classifiers
     *        A list of custom classifiers that the user has registered. By default, all built-in classifiers are
     *        included in a crawl, but these custom classifiers always override the default classifiers for a given
     *        classification.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCrawlerRequest withClassifiers(java.util.Collection<String> classifiers) {
        setClassifiers(classifiers);
        return this;
    }

    /**
     * <p>
     * The table prefix used for catalog tables that are created.
     * </p>
     * 
     * @param tablePrefix
     *        The table prefix used for catalog tables that are created.
     */

    public void setTablePrefix(String tablePrefix) {
        this.tablePrefix = tablePrefix;
    }

    /**
     * <p>
     * The table prefix used for catalog tables that are created.
     * </p>
     * 
     * @return The table prefix used for catalog tables that are created.
     */

    public String getTablePrefix() {
        return this.tablePrefix;
    }

    /**
     * <p>
     * The table prefix used for catalog tables that are created.
     * </p>
     * 
     * @param tablePrefix
     *        The table prefix used for catalog tables that are created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCrawlerRequest withTablePrefix(String tablePrefix) {
        setTablePrefix(tablePrefix);
        return this;
    }

    /**
     * <p>
     * Policy for the crawler's update and deletion behavior.
     * </p>
     * 
     * @param schemaChangePolicy
     *        Policy for the crawler's update and deletion behavior.
     */

    public void setSchemaChangePolicy(SchemaChangePolicy schemaChangePolicy) {
        this.schemaChangePolicy = schemaChangePolicy;
    }

    /**
     * <p>
     * Policy for the crawler's update and deletion behavior.
     * </p>
     * 
     * @return Policy for the crawler's update and deletion behavior.
     */

    public SchemaChangePolicy getSchemaChangePolicy() {
        return this.schemaChangePolicy;
    }

    /**
     * <p>
     * Policy for the crawler's update and deletion behavior.
     * </p>
     * 
     * @param schemaChangePolicy
     *        Policy for the crawler's update and deletion behavior.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCrawlerRequest withSchemaChangePolicy(SchemaChangePolicy schemaChangePolicy) {
        setSchemaChangePolicy(schemaChangePolicy);
        return this;
    }

    /**
     * <p>
     * Crawler configuration information. This versioned JSON string allows users to specify aspects of a crawler's
     * behavior. For more information, see <a
     * href="http://docs.aws.amazon.com/glue/latest/dg/crawler-configuration.html">Configuring a Crawler</a>.
     * </p>
     * 
     * @param configuration
     *        Crawler configuration information. This versioned JSON string allows users to specify aspects of a
     *        crawler's behavior. For more information, see <a
     *        href="http://docs.aws.amazon.com/glue/latest/dg/crawler-configuration.html">Configuring a Crawler</a>.
     */

    public void setConfiguration(String configuration) {
        this.configuration = configuration;
    }

    /**
     * <p>
     * Crawler configuration information. This versioned JSON string allows users to specify aspects of a crawler's
     * behavior. For more information, see <a
     * href="http://docs.aws.amazon.com/glue/latest/dg/crawler-configuration.html">Configuring a Crawler</a>.
     * </p>
     * 
     * @return Crawler configuration information. This versioned JSON string allows users to specify aspects of a
     *         crawler's behavior. For more information, see <a
     *         href="http://docs.aws.amazon.com/glue/latest/dg/crawler-configuration.html">Configuring a Crawler</a>.
     */

    public String getConfiguration() {
        return this.configuration;
    }

    /**
     * <p>
     * Crawler configuration information. This versioned JSON string allows users to specify aspects of a crawler's
     * behavior. For more information, see <a
     * href="http://docs.aws.amazon.com/glue/latest/dg/crawler-configuration.html">Configuring a Crawler</a>.
     * </p>
     * 
     * @param configuration
     *        Crawler configuration information. This versioned JSON string allows users to specify aspects of a
     *        crawler's behavior. For more information, see <a
     *        href="http://docs.aws.amazon.com/glue/latest/dg/crawler-configuration.html">Configuring a Crawler</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCrawlerRequest withConfiguration(String configuration) {
        setConfiguration(configuration);
        return this;
    }

    /**
     * <p>
     * The name of the SecurityConfiguration structure to be used by this Crawler.
     * </p>
     * 
     * @param crawlerSecurityConfiguration
     *        The name of the SecurityConfiguration structure to be used by this Crawler.
     */

    public void setCrawlerSecurityConfiguration(String crawlerSecurityConfiguration) {
        this.crawlerSecurityConfiguration = crawlerSecurityConfiguration;
    }

    /**
     * <p>
     * The name of the SecurityConfiguration structure to be used by this Crawler.
     * </p>
     * 
     * @return The name of the SecurityConfiguration structure to be used by this Crawler.
     */

    public String getCrawlerSecurityConfiguration() {
        return this.crawlerSecurityConfiguration;
    }

    /**
     * <p>
     * The name of the SecurityConfiguration structure to be used by this Crawler.
     * </p>
     * 
     * @param crawlerSecurityConfiguration
     *        The name of the SecurityConfiguration structure to be used by this Crawler.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCrawlerRequest withCrawlerSecurityConfiguration(String crawlerSecurityConfiguration) {
        setCrawlerSecurityConfiguration(crawlerSecurityConfiguration);
        return this;
    }

    /**
     * <p>
     * The tags to use with this crawler request. You may use tags to limit access to the crawler. For more information
     * about tags in AWS Glue, see <a href="http://docs.aws.amazon.com/glue/latest/dg/monitor-tags.html">AWS Tags in AWS
     * Glue</a> in the developer guide.
     * </p>
     * 
     * @return The tags to use with this crawler request. You may use tags to limit access to the crawler. For more
     *         information about tags in AWS Glue, see <a
     *         href="http://docs.aws.amazon.com/glue/latest/dg/monitor-tags.html">AWS Tags in AWS Glue</a> in the
     *         developer guide.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * The tags to use with this crawler request. You may use tags to limit access to the crawler. For more information
     * about tags in AWS Glue, see <a href="http://docs.aws.amazon.com/glue/latest/dg/monitor-tags.html">AWS Tags in AWS
     * Glue</a> in the developer guide.
     * </p>
     * 
     * @param tags
     *        The tags to use with this crawler request. You may use tags to limit access to the crawler. For more
     *        information about tags in AWS Glue, see <a
     *        href="http://docs.aws.amazon.com/glue/latest/dg/monitor-tags.html">AWS Tags in AWS Glue</a> in the
     *        developer guide.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * The tags to use with this crawler request. You may use tags to limit access to the crawler. For more information
     * about tags in AWS Glue, see <a href="http://docs.aws.amazon.com/glue/latest/dg/monitor-tags.html">AWS Tags in AWS
     * Glue</a> in the developer guide.
     * </p>
     * 
     * @param tags
     *        The tags to use with this crawler request. You may use tags to limit access to the crawler. For more
     *        information about tags in AWS Glue, see <a
     *        href="http://docs.aws.amazon.com/glue/latest/dg/monitor-tags.html">AWS Tags in AWS Glue</a> in the
     *        developer guide.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCrawlerRequest withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    public CreateCrawlerRequest addTagsEntry(String key, String value) {
        if (null == this.tags) {
            this.tags = new java.util.HashMap<String, String>();
        }
        if (this.tags.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.tags.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Tags.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCrawlerRequest clearTagsEntries() {
        this.tags = null;
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
        if (getRole() != null)
            sb.append("Role: ").append(getRole()).append(",");
        if (getDatabaseName() != null)
            sb.append("DatabaseName: ").append(getDatabaseName()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getTargets() != null)
            sb.append("Targets: ").append(getTargets()).append(",");
        if (getSchedule() != null)
            sb.append("Schedule: ").append(getSchedule()).append(",");
        if (getClassifiers() != null)
            sb.append("Classifiers: ").append(getClassifiers()).append(",");
        if (getTablePrefix() != null)
            sb.append("TablePrefix: ").append(getTablePrefix()).append(",");
        if (getSchemaChangePolicy() != null)
            sb.append("SchemaChangePolicy: ").append(getSchemaChangePolicy()).append(",");
        if (getConfiguration() != null)
            sb.append("Configuration: ").append(getConfiguration()).append(",");
        if (getCrawlerSecurityConfiguration() != null)
            sb.append("CrawlerSecurityConfiguration: ").append(getCrawlerSecurityConfiguration()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateCrawlerRequest == false)
            return false;
        CreateCrawlerRequest other = (CreateCrawlerRequest) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getRole() == null ^ this.getRole() == null)
            return false;
        if (other.getRole() != null && other.getRole().equals(this.getRole()) == false)
            return false;
        if (other.getDatabaseName() == null ^ this.getDatabaseName() == null)
            return false;
        if (other.getDatabaseName() != null && other.getDatabaseName().equals(this.getDatabaseName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getTargets() == null ^ this.getTargets() == null)
            return false;
        if (other.getTargets() != null && other.getTargets().equals(this.getTargets()) == false)
            return false;
        if (other.getSchedule() == null ^ this.getSchedule() == null)
            return false;
        if (other.getSchedule() != null && other.getSchedule().equals(this.getSchedule()) == false)
            return false;
        if (other.getClassifiers() == null ^ this.getClassifiers() == null)
            return false;
        if (other.getClassifiers() != null && other.getClassifiers().equals(this.getClassifiers()) == false)
            return false;
        if (other.getTablePrefix() == null ^ this.getTablePrefix() == null)
            return false;
        if (other.getTablePrefix() != null && other.getTablePrefix().equals(this.getTablePrefix()) == false)
            return false;
        if (other.getSchemaChangePolicy() == null ^ this.getSchemaChangePolicy() == null)
            return false;
        if (other.getSchemaChangePolicy() != null && other.getSchemaChangePolicy().equals(this.getSchemaChangePolicy()) == false)
            return false;
        if (other.getConfiguration() == null ^ this.getConfiguration() == null)
            return false;
        if (other.getConfiguration() != null && other.getConfiguration().equals(this.getConfiguration()) == false)
            return false;
        if (other.getCrawlerSecurityConfiguration() == null ^ this.getCrawlerSecurityConfiguration() == null)
            return false;
        if (other.getCrawlerSecurityConfiguration() != null && other.getCrawlerSecurityConfiguration().equals(this.getCrawlerSecurityConfiguration()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getRole() == null) ? 0 : getRole().hashCode());
        hashCode = prime * hashCode + ((getDatabaseName() == null) ? 0 : getDatabaseName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getTargets() == null) ? 0 : getTargets().hashCode());
        hashCode = prime * hashCode + ((getSchedule() == null) ? 0 : getSchedule().hashCode());
        hashCode = prime * hashCode + ((getClassifiers() == null) ? 0 : getClassifiers().hashCode());
        hashCode = prime * hashCode + ((getTablePrefix() == null) ? 0 : getTablePrefix().hashCode());
        hashCode = prime * hashCode + ((getSchemaChangePolicy() == null) ? 0 : getSchemaChangePolicy().hashCode());
        hashCode = prime * hashCode + ((getConfiguration() == null) ? 0 : getConfiguration().hashCode());
        hashCode = prime * hashCode + ((getCrawlerSecurityConfiguration() == null) ? 0 : getCrawlerSecurityConfiguration().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateCrawlerRequest clone() {
        return (CreateCrawlerRequest) super.clone();
    }

}
