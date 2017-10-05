/*
 * Copyright 2012-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Specifies a crawler program that examines a data source and uses classifiers to try to its schema. If successful, the
 * crawler records metatdata concerning the data source in the Data Catalog.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/Crawler" target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Crawler implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The <code>Crawler</code> name.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The ARN of an IAM role used to access customer resources such as data in S3.
     * </p>
     */
    private String role;
    /**
     * <p>
     * A collection of targets to crawl.
     * </p>
     */
    private CrawlerTargets targets;
    /**
     * <p>
     * The <code>Database</code> where this Crawler's output should be stored.
     * </p>
     */
    private String databaseName;
    /**
     * <p>
     * A description of this Crawler and where it should be used.
     * </p>
     */
    private String description;
    /**
     * <p>
     * A list of custom <code>Classifier</code>s associated with this Crawler.
     * </p>
     */
    private java.util.List<String> classifiers;
    /**
     * <p>
     * Sets policy for the crawler's update and delete behavior.
     * </p>
     */
    private SchemaChangePolicy schemaChangePolicy;
    /**
     * <p>
     * Indicates whether this Crawler is running, or whether a run is pending.
     * </p>
     */
    private String state;
    /**
     * <p>
     * The table prefix used for catalog tables created.
     * </p>
     */
    private String tablePrefix;
    /**
     * <p>
     * A <code>Schedule</code> object that specifies the schedule on which this Crawler is to be run.
     * </p>
     */
    private Schedule schedule;
    /**
     * <p>
     * If this Crawler is running, contains the total time elapsed since the last crawl began.
     * </p>
     */
    private Long crawlElapsedTime;
    /**
     * <p>
     * The time when the Crawler was created.
     * </p>
     */
    private java.util.Date creationTime;
    /**
     * <p>
     * The time the Crawler was last updated.
     * </p>
     */
    private java.util.Date lastUpdated;
    /**
     * <p>
     * The status of the last crawl, and potentially error information if an error occurred.
     * </p>
     */
    private LastCrawlInfo lastCrawl;
    /**
     * <p>
     * The version of the Crawler.
     * </p>
     */
    private Long version;

    /**
     * <p>
     * The <code>Crawler</code> name.
     * </p>
     * 
     * @param name
     *        The <code>Crawler</code> name.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The <code>Crawler</code> name.
     * </p>
     * 
     * @return The <code>Crawler</code> name.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The <code>Crawler</code> name.
     * </p>
     * 
     * @param name
     *        The <code>Crawler</code> name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Crawler withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The ARN of an IAM role used to access customer resources such as data in S3.
     * </p>
     * 
     * @param role
     *        The ARN of an IAM role used to access customer resources such as data in S3.
     */

    public void setRole(String role) {
        this.role = role;
    }

    /**
     * <p>
     * The ARN of an IAM role used to access customer resources such as data in S3.
     * </p>
     * 
     * @return The ARN of an IAM role used to access customer resources such as data in S3.
     */

    public String getRole() {
        return this.role;
    }

    /**
     * <p>
     * The ARN of an IAM role used to access customer resources such as data in S3.
     * </p>
     * 
     * @param role
     *        The ARN of an IAM role used to access customer resources such as data in S3.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Crawler withRole(String role) {
        setRole(role);
        return this;
    }

    /**
     * <p>
     * A collection of targets to crawl.
     * </p>
     * 
     * @param targets
     *        A collection of targets to crawl.
     */

    public void setTargets(CrawlerTargets targets) {
        this.targets = targets;
    }

    /**
     * <p>
     * A collection of targets to crawl.
     * </p>
     * 
     * @return A collection of targets to crawl.
     */

    public CrawlerTargets getTargets() {
        return this.targets;
    }

    /**
     * <p>
     * A collection of targets to crawl.
     * </p>
     * 
     * @param targets
     *        A collection of targets to crawl.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Crawler withTargets(CrawlerTargets targets) {
        setTargets(targets);
        return this;
    }

    /**
     * <p>
     * The <code>Database</code> where this Crawler's output should be stored.
     * </p>
     * 
     * @param databaseName
     *        The <code>Database</code> where this Crawler's output should be stored.
     */

    public void setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
    }

    /**
     * <p>
     * The <code>Database</code> where this Crawler's output should be stored.
     * </p>
     * 
     * @return The <code>Database</code> where this Crawler's output should be stored.
     */

    public String getDatabaseName() {
        return this.databaseName;
    }

    /**
     * <p>
     * The <code>Database</code> where this Crawler's output should be stored.
     * </p>
     * 
     * @param databaseName
     *        The <code>Database</code> where this Crawler's output should be stored.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Crawler withDatabaseName(String databaseName) {
        setDatabaseName(databaseName);
        return this;
    }

    /**
     * <p>
     * A description of this Crawler and where it should be used.
     * </p>
     * 
     * @param description
     *        A description of this Crawler and where it should be used.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description of this Crawler and where it should be used.
     * </p>
     * 
     * @return A description of this Crawler and where it should be used.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A description of this Crawler and where it should be used.
     * </p>
     * 
     * @param description
     *        A description of this Crawler and where it should be used.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Crawler withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * A list of custom <code>Classifier</code>s associated with this Crawler.
     * </p>
     * 
     * @return A list of custom <code>Classifier</code>s associated with this Crawler.
     */

    public java.util.List<String> getClassifiers() {
        return classifiers;
    }

    /**
     * <p>
     * A list of custom <code>Classifier</code>s associated with this Crawler.
     * </p>
     * 
     * @param classifiers
     *        A list of custom <code>Classifier</code>s associated with this Crawler.
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
     * A list of custom <code>Classifier</code>s associated with this Crawler.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setClassifiers(java.util.Collection)} or {@link #withClassifiers(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param classifiers
     *        A list of custom <code>Classifier</code>s associated with this Crawler.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Crawler withClassifiers(String... classifiers) {
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
     * A list of custom <code>Classifier</code>s associated with this Crawler.
     * </p>
     * 
     * @param classifiers
     *        A list of custom <code>Classifier</code>s associated with this Crawler.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Crawler withClassifiers(java.util.Collection<String> classifiers) {
        setClassifiers(classifiers);
        return this;
    }

    /**
     * <p>
     * Sets policy for the crawler's update and delete behavior.
     * </p>
     * 
     * @param schemaChangePolicy
     *        Sets policy for the crawler's update and delete behavior.
     */

    public void setSchemaChangePolicy(SchemaChangePolicy schemaChangePolicy) {
        this.schemaChangePolicy = schemaChangePolicy;
    }

    /**
     * <p>
     * Sets policy for the crawler's update and delete behavior.
     * </p>
     * 
     * @return Sets policy for the crawler's update and delete behavior.
     */

    public SchemaChangePolicy getSchemaChangePolicy() {
        return this.schemaChangePolicy;
    }

    /**
     * <p>
     * Sets policy for the crawler's update and delete behavior.
     * </p>
     * 
     * @param schemaChangePolicy
     *        Sets policy for the crawler's update and delete behavior.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Crawler withSchemaChangePolicy(SchemaChangePolicy schemaChangePolicy) {
        setSchemaChangePolicy(schemaChangePolicy);
        return this;
    }

    /**
     * <p>
     * Indicates whether this Crawler is running, or whether a run is pending.
     * </p>
     * 
     * @param state
     *        Indicates whether this Crawler is running, or whether a run is pending.
     * @see CrawlerState
     */

    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * Indicates whether this Crawler is running, or whether a run is pending.
     * </p>
     * 
     * @return Indicates whether this Crawler is running, or whether a run is pending.
     * @see CrawlerState
     */

    public String getState() {
        return this.state;
    }

    /**
     * <p>
     * Indicates whether this Crawler is running, or whether a run is pending.
     * </p>
     * 
     * @param state
     *        Indicates whether this Crawler is running, or whether a run is pending.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CrawlerState
     */

    public Crawler withState(String state) {
        setState(state);
        return this;
    }

    /**
     * <p>
     * Indicates whether this Crawler is running, or whether a run is pending.
     * </p>
     * 
     * @param state
     *        Indicates whether this Crawler is running, or whether a run is pending.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CrawlerState
     */

    public Crawler withState(CrawlerState state) {
        this.state = state.toString();
        return this;
    }

    /**
     * <p>
     * The table prefix used for catalog tables created.
     * </p>
     * 
     * @param tablePrefix
     *        The table prefix used for catalog tables created.
     */

    public void setTablePrefix(String tablePrefix) {
        this.tablePrefix = tablePrefix;
    }

    /**
     * <p>
     * The table prefix used for catalog tables created.
     * </p>
     * 
     * @return The table prefix used for catalog tables created.
     */

    public String getTablePrefix() {
        return this.tablePrefix;
    }

    /**
     * <p>
     * The table prefix used for catalog tables created.
     * </p>
     * 
     * @param tablePrefix
     *        The table prefix used for catalog tables created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Crawler withTablePrefix(String tablePrefix) {
        setTablePrefix(tablePrefix);
        return this;
    }

    /**
     * <p>
     * A <code>Schedule</code> object that specifies the schedule on which this Crawler is to be run.
     * </p>
     * 
     * @param schedule
     *        A <code>Schedule</code> object that specifies the schedule on which this Crawler is to be run.
     */

    public void setSchedule(Schedule schedule) {
        this.schedule = schedule;
    }

    /**
     * <p>
     * A <code>Schedule</code> object that specifies the schedule on which this Crawler is to be run.
     * </p>
     * 
     * @return A <code>Schedule</code> object that specifies the schedule on which this Crawler is to be run.
     */

    public Schedule getSchedule() {
        return this.schedule;
    }

    /**
     * <p>
     * A <code>Schedule</code> object that specifies the schedule on which this Crawler is to be run.
     * </p>
     * 
     * @param schedule
     *        A <code>Schedule</code> object that specifies the schedule on which this Crawler is to be run.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Crawler withSchedule(Schedule schedule) {
        setSchedule(schedule);
        return this;
    }

    /**
     * <p>
     * If this Crawler is running, contains the total time elapsed since the last crawl began.
     * </p>
     * 
     * @param crawlElapsedTime
     *        If this Crawler is running, contains the total time elapsed since the last crawl began.
     */

    public void setCrawlElapsedTime(Long crawlElapsedTime) {
        this.crawlElapsedTime = crawlElapsedTime;
    }

    /**
     * <p>
     * If this Crawler is running, contains the total time elapsed since the last crawl began.
     * </p>
     * 
     * @return If this Crawler is running, contains the total time elapsed since the last crawl began.
     */

    public Long getCrawlElapsedTime() {
        return this.crawlElapsedTime;
    }

    /**
     * <p>
     * If this Crawler is running, contains the total time elapsed since the last crawl began.
     * </p>
     * 
     * @param crawlElapsedTime
     *        If this Crawler is running, contains the total time elapsed since the last crawl began.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Crawler withCrawlElapsedTime(Long crawlElapsedTime) {
        setCrawlElapsedTime(crawlElapsedTime);
        return this;
    }

    /**
     * <p>
     * The time when the Crawler was created.
     * </p>
     * 
     * @param creationTime
     *        The time when the Crawler was created.
     */

    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * The time when the Crawler was created.
     * </p>
     * 
     * @return The time when the Crawler was created.
     */

    public java.util.Date getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * The time when the Crawler was created.
     * </p>
     * 
     * @param creationTime
     *        The time when the Crawler was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Crawler withCreationTime(java.util.Date creationTime) {
        setCreationTime(creationTime);
        return this;
    }

    /**
     * <p>
     * The time the Crawler was last updated.
     * </p>
     * 
     * @param lastUpdated
     *        The time the Crawler was last updated.
     */

    public void setLastUpdated(java.util.Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    /**
     * <p>
     * The time the Crawler was last updated.
     * </p>
     * 
     * @return The time the Crawler was last updated.
     */

    public java.util.Date getLastUpdated() {
        return this.lastUpdated;
    }

    /**
     * <p>
     * The time the Crawler was last updated.
     * </p>
     * 
     * @param lastUpdated
     *        The time the Crawler was last updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Crawler withLastUpdated(java.util.Date lastUpdated) {
        setLastUpdated(lastUpdated);
        return this;
    }

    /**
     * <p>
     * The status of the last crawl, and potentially error information if an error occurred.
     * </p>
     * 
     * @param lastCrawl
     *        The status of the last crawl, and potentially error information if an error occurred.
     */

    public void setLastCrawl(LastCrawlInfo lastCrawl) {
        this.lastCrawl = lastCrawl;
    }

    /**
     * <p>
     * The status of the last crawl, and potentially error information if an error occurred.
     * </p>
     * 
     * @return The status of the last crawl, and potentially error information if an error occurred.
     */

    public LastCrawlInfo getLastCrawl() {
        return this.lastCrawl;
    }

    /**
     * <p>
     * The status of the last crawl, and potentially error information if an error occurred.
     * </p>
     * 
     * @param lastCrawl
     *        The status of the last crawl, and potentially error information if an error occurred.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Crawler withLastCrawl(LastCrawlInfo lastCrawl) {
        setLastCrawl(lastCrawl);
        return this;
    }

    /**
     * <p>
     * The version of the Crawler.
     * </p>
     * 
     * @param version
     *        The version of the Crawler.
     */

    public void setVersion(Long version) {
        this.version = version;
    }

    /**
     * <p>
     * The version of the Crawler.
     * </p>
     * 
     * @return The version of the Crawler.
     */

    public Long getVersion() {
        return this.version;
    }

    /**
     * <p>
     * The version of the Crawler.
     * </p>
     * 
     * @param version
     *        The version of the Crawler.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Crawler withVersion(Long version) {
        setVersion(version);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
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
        if (getTargets() != null)
            sb.append("Targets: ").append(getTargets()).append(",");
        if (getDatabaseName() != null)
            sb.append("DatabaseName: ").append(getDatabaseName()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getClassifiers() != null)
            sb.append("Classifiers: ").append(getClassifiers()).append(",");
        if (getSchemaChangePolicy() != null)
            sb.append("SchemaChangePolicy: ").append(getSchemaChangePolicy()).append(",");
        if (getState() != null)
            sb.append("State: ").append(getState()).append(",");
        if (getTablePrefix() != null)
            sb.append("TablePrefix: ").append(getTablePrefix()).append(",");
        if (getSchedule() != null)
            sb.append("Schedule: ").append(getSchedule()).append(",");
        if (getCrawlElapsedTime() != null)
            sb.append("CrawlElapsedTime: ").append(getCrawlElapsedTime()).append(",");
        if (getCreationTime() != null)
            sb.append("CreationTime: ").append(getCreationTime()).append(",");
        if (getLastUpdated() != null)
            sb.append("LastUpdated: ").append(getLastUpdated()).append(",");
        if (getLastCrawl() != null)
            sb.append("LastCrawl: ").append(getLastCrawl()).append(",");
        if (getVersion() != null)
            sb.append("Version: ").append(getVersion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Crawler == false)
            return false;
        Crawler other = (Crawler) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getRole() == null ^ this.getRole() == null)
            return false;
        if (other.getRole() != null && other.getRole().equals(this.getRole()) == false)
            return false;
        if (other.getTargets() == null ^ this.getTargets() == null)
            return false;
        if (other.getTargets() != null && other.getTargets().equals(this.getTargets()) == false)
            return false;
        if (other.getDatabaseName() == null ^ this.getDatabaseName() == null)
            return false;
        if (other.getDatabaseName() != null && other.getDatabaseName().equals(this.getDatabaseName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getClassifiers() == null ^ this.getClassifiers() == null)
            return false;
        if (other.getClassifiers() != null && other.getClassifiers().equals(this.getClassifiers()) == false)
            return false;
        if (other.getSchemaChangePolicy() == null ^ this.getSchemaChangePolicy() == null)
            return false;
        if (other.getSchemaChangePolicy() != null && other.getSchemaChangePolicy().equals(this.getSchemaChangePolicy()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        if (other.getTablePrefix() == null ^ this.getTablePrefix() == null)
            return false;
        if (other.getTablePrefix() != null && other.getTablePrefix().equals(this.getTablePrefix()) == false)
            return false;
        if (other.getSchedule() == null ^ this.getSchedule() == null)
            return false;
        if (other.getSchedule() != null && other.getSchedule().equals(this.getSchedule()) == false)
            return false;
        if (other.getCrawlElapsedTime() == null ^ this.getCrawlElapsedTime() == null)
            return false;
        if (other.getCrawlElapsedTime() != null && other.getCrawlElapsedTime().equals(this.getCrawlElapsedTime()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        if (other.getLastUpdated() == null ^ this.getLastUpdated() == null)
            return false;
        if (other.getLastUpdated() != null && other.getLastUpdated().equals(this.getLastUpdated()) == false)
            return false;
        if (other.getLastCrawl() == null ^ this.getLastCrawl() == null)
            return false;
        if (other.getLastCrawl() != null && other.getLastCrawl().equals(this.getLastCrawl()) == false)
            return false;
        if (other.getVersion() == null ^ this.getVersion() == null)
            return false;
        if (other.getVersion() != null && other.getVersion().equals(this.getVersion()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getRole() == null) ? 0 : getRole().hashCode());
        hashCode = prime * hashCode + ((getTargets() == null) ? 0 : getTargets().hashCode());
        hashCode = prime * hashCode + ((getDatabaseName() == null) ? 0 : getDatabaseName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getClassifiers() == null) ? 0 : getClassifiers().hashCode());
        hashCode = prime * hashCode + ((getSchemaChangePolicy() == null) ? 0 : getSchemaChangePolicy().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode + ((getTablePrefix() == null) ? 0 : getTablePrefix().hashCode());
        hashCode = prime * hashCode + ((getSchedule() == null) ? 0 : getSchedule().hashCode());
        hashCode = prime * hashCode + ((getCrawlElapsedTime() == null) ? 0 : getCrawlElapsedTime().hashCode());
        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode + ((getLastUpdated() == null) ? 0 : getLastUpdated().hashCode());
        hashCode = prime * hashCode + ((getLastCrawl() == null) ? 0 : getLastCrawl().hashCode());
        hashCode = prime * hashCode + ((getVersion() == null) ? 0 : getVersion().hashCode());
        return hashCode;
    }

    @Override
    public Crawler clone() {
        try {
            return (Crawler) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.glue.model.transform.CrawlerMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
