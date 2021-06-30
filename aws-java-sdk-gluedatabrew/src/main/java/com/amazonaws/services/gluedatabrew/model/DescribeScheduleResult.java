/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.gluedatabrew.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/databrew-2017-07-25/DescribeSchedule" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeScheduleResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The date and time that the schedule was created.
     * </p>
     */
    private java.util.Date createDate;
    /**
     * <p>
     * The identifier (user name) of the user who created the schedule.
     * </p>
     */
    private String createdBy;
    /**
     * <p>
     * The name or names of one or more jobs to be run by using the schedule.
     * </p>
     */
    private java.util.List<String> jobNames;
    /**
     * <p>
     * The identifier (user name) of the user who last modified the schedule.
     * </p>
     */
    private String lastModifiedBy;
    /**
     * <p>
     * The date and time that the schedule was last modified.
     * </p>
     */
    private java.util.Date lastModifiedDate;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the schedule.
     * </p>
     */
    private String resourceArn;
    /**
     * <p>
     * The date or dates and time or times when the jobs are to be run for the schedule. For more information, see <a
     * href="https://docs.aws.amazon.com/databrew/latest/dg/jobs.cron.html">Cron expressions</a> in the <i>Glue DataBrew
     * Developer Guide</i>.
     * </p>
     */
    private String cronExpression;
    /**
     * <p>
     * Metadata tags associated with this schedule.
     * </p>
     */
    private java.util.Map<String, String> tags;
    /**
     * <p>
     * The name of the schedule.
     * </p>
     */
    private String name;

    /**
     * <p>
     * The date and time that the schedule was created.
     * </p>
     * 
     * @param createDate
     *        The date and time that the schedule was created.
     */

    public void setCreateDate(java.util.Date createDate) {
        this.createDate = createDate;
    }

    /**
     * <p>
     * The date and time that the schedule was created.
     * </p>
     * 
     * @return The date and time that the schedule was created.
     */

    public java.util.Date getCreateDate() {
        return this.createDate;
    }

    /**
     * <p>
     * The date and time that the schedule was created.
     * </p>
     * 
     * @param createDate
     *        The date and time that the schedule was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeScheduleResult withCreateDate(java.util.Date createDate) {
        setCreateDate(createDate);
        return this;
    }

    /**
     * <p>
     * The identifier (user name) of the user who created the schedule.
     * </p>
     * 
     * @param createdBy
     *        The identifier (user name) of the user who created the schedule.
     */

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    /**
     * <p>
     * The identifier (user name) of the user who created the schedule.
     * </p>
     * 
     * @return The identifier (user name) of the user who created the schedule.
     */

    public String getCreatedBy() {
        return this.createdBy;
    }

    /**
     * <p>
     * The identifier (user name) of the user who created the schedule.
     * </p>
     * 
     * @param createdBy
     *        The identifier (user name) of the user who created the schedule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeScheduleResult withCreatedBy(String createdBy) {
        setCreatedBy(createdBy);
        return this;
    }

    /**
     * <p>
     * The name or names of one or more jobs to be run by using the schedule.
     * </p>
     * 
     * @return The name or names of one or more jobs to be run by using the schedule.
     */

    public java.util.List<String> getJobNames() {
        return jobNames;
    }

    /**
     * <p>
     * The name or names of one or more jobs to be run by using the schedule.
     * </p>
     * 
     * @param jobNames
     *        The name or names of one or more jobs to be run by using the schedule.
     */

    public void setJobNames(java.util.Collection<String> jobNames) {
        if (jobNames == null) {
            this.jobNames = null;
            return;
        }

        this.jobNames = new java.util.ArrayList<String>(jobNames);
    }

    /**
     * <p>
     * The name or names of one or more jobs to be run by using the schedule.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setJobNames(java.util.Collection)} or {@link #withJobNames(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param jobNames
     *        The name or names of one or more jobs to be run by using the schedule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeScheduleResult withJobNames(String... jobNames) {
        if (this.jobNames == null) {
            setJobNames(new java.util.ArrayList<String>(jobNames.length));
        }
        for (String ele : jobNames) {
            this.jobNames.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The name or names of one or more jobs to be run by using the schedule.
     * </p>
     * 
     * @param jobNames
     *        The name or names of one or more jobs to be run by using the schedule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeScheduleResult withJobNames(java.util.Collection<String> jobNames) {
        setJobNames(jobNames);
        return this;
    }

    /**
     * <p>
     * The identifier (user name) of the user who last modified the schedule.
     * </p>
     * 
     * @param lastModifiedBy
     *        The identifier (user name) of the user who last modified the schedule.
     */

    public void setLastModifiedBy(String lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }

    /**
     * <p>
     * The identifier (user name) of the user who last modified the schedule.
     * </p>
     * 
     * @return The identifier (user name) of the user who last modified the schedule.
     */

    public String getLastModifiedBy() {
        return this.lastModifiedBy;
    }

    /**
     * <p>
     * The identifier (user name) of the user who last modified the schedule.
     * </p>
     * 
     * @param lastModifiedBy
     *        The identifier (user name) of the user who last modified the schedule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeScheduleResult withLastModifiedBy(String lastModifiedBy) {
        setLastModifiedBy(lastModifiedBy);
        return this;
    }

    /**
     * <p>
     * The date and time that the schedule was last modified.
     * </p>
     * 
     * @param lastModifiedDate
     *        The date and time that the schedule was last modified.
     */

    public void setLastModifiedDate(java.util.Date lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    /**
     * <p>
     * The date and time that the schedule was last modified.
     * </p>
     * 
     * @return The date and time that the schedule was last modified.
     */

    public java.util.Date getLastModifiedDate() {
        return this.lastModifiedDate;
    }

    /**
     * <p>
     * The date and time that the schedule was last modified.
     * </p>
     * 
     * @param lastModifiedDate
     *        The date and time that the schedule was last modified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeScheduleResult withLastModifiedDate(java.util.Date lastModifiedDate) {
        setLastModifiedDate(lastModifiedDate);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the schedule.
     * </p>
     * 
     * @param resourceArn
     *        The Amazon Resource Name (ARN) of the schedule.
     */

    public void setResourceArn(String resourceArn) {
        this.resourceArn = resourceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the schedule.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the schedule.
     */

    public String getResourceArn() {
        return this.resourceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the schedule.
     * </p>
     * 
     * @param resourceArn
     *        The Amazon Resource Name (ARN) of the schedule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeScheduleResult withResourceArn(String resourceArn) {
        setResourceArn(resourceArn);
        return this;
    }

    /**
     * <p>
     * The date or dates and time or times when the jobs are to be run for the schedule. For more information, see <a
     * href="https://docs.aws.amazon.com/databrew/latest/dg/jobs.cron.html">Cron expressions</a> in the <i>Glue DataBrew
     * Developer Guide</i>.
     * </p>
     * 
     * @param cronExpression
     *        The date or dates and time or times when the jobs are to be run for the schedule. For more information,
     *        see <a href="https://docs.aws.amazon.com/databrew/latest/dg/jobs.cron.html">Cron expressions</a> in the
     *        <i>Glue DataBrew Developer Guide</i>.
     */

    public void setCronExpression(String cronExpression) {
        this.cronExpression = cronExpression;
    }

    /**
     * <p>
     * The date or dates and time or times when the jobs are to be run for the schedule. For more information, see <a
     * href="https://docs.aws.amazon.com/databrew/latest/dg/jobs.cron.html">Cron expressions</a> in the <i>Glue DataBrew
     * Developer Guide</i>.
     * </p>
     * 
     * @return The date or dates and time or times when the jobs are to be run for the schedule. For more information,
     *         see <a href="https://docs.aws.amazon.com/databrew/latest/dg/jobs.cron.html">Cron expressions</a> in the
     *         <i>Glue DataBrew Developer Guide</i>.
     */

    public String getCronExpression() {
        return this.cronExpression;
    }

    /**
     * <p>
     * The date or dates and time or times when the jobs are to be run for the schedule. For more information, see <a
     * href="https://docs.aws.amazon.com/databrew/latest/dg/jobs.cron.html">Cron expressions</a> in the <i>Glue DataBrew
     * Developer Guide</i>.
     * </p>
     * 
     * @param cronExpression
     *        The date or dates and time or times when the jobs are to be run for the schedule. For more information,
     *        see <a href="https://docs.aws.amazon.com/databrew/latest/dg/jobs.cron.html">Cron expressions</a> in the
     *        <i>Glue DataBrew Developer Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeScheduleResult withCronExpression(String cronExpression) {
        setCronExpression(cronExpression);
        return this;
    }

    /**
     * <p>
     * Metadata tags associated with this schedule.
     * </p>
     * 
     * @return Metadata tags associated with this schedule.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * Metadata tags associated with this schedule.
     * </p>
     * 
     * @param tags
     *        Metadata tags associated with this schedule.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * Metadata tags associated with this schedule.
     * </p>
     * 
     * @param tags
     *        Metadata tags associated with this schedule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeScheduleResult withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see DescribeScheduleResult#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public DescribeScheduleResult addTagsEntry(String key, String value) {
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

    public DescribeScheduleResult clearTagsEntries() {
        this.tags = null;
        return this;
    }

    /**
     * <p>
     * The name of the schedule.
     * </p>
     * 
     * @param name
     *        The name of the schedule.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the schedule.
     * </p>
     * 
     * @return The name of the schedule.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the schedule.
     * </p>
     * 
     * @param name
     *        The name of the schedule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeScheduleResult withName(String name) {
        setName(name);
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
        if (getCreateDate() != null)
            sb.append("CreateDate: ").append(getCreateDate()).append(",");
        if (getCreatedBy() != null)
            sb.append("CreatedBy: ").append(getCreatedBy()).append(",");
        if (getJobNames() != null)
            sb.append("JobNames: ").append(getJobNames()).append(",");
        if (getLastModifiedBy() != null)
            sb.append("LastModifiedBy: ").append(getLastModifiedBy()).append(",");
        if (getLastModifiedDate() != null)
            sb.append("LastModifiedDate: ").append(getLastModifiedDate()).append(",");
        if (getResourceArn() != null)
            sb.append("ResourceArn: ").append(getResourceArn()).append(",");
        if (getCronExpression() != null)
            sb.append("CronExpression: ").append(getCronExpression()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeScheduleResult == false)
            return false;
        DescribeScheduleResult other = (DescribeScheduleResult) obj;
        if (other.getCreateDate() == null ^ this.getCreateDate() == null)
            return false;
        if (other.getCreateDate() != null && other.getCreateDate().equals(this.getCreateDate()) == false)
            return false;
        if (other.getCreatedBy() == null ^ this.getCreatedBy() == null)
            return false;
        if (other.getCreatedBy() != null && other.getCreatedBy().equals(this.getCreatedBy()) == false)
            return false;
        if (other.getJobNames() == null ^ this.getJobNames() == null)
            return false;
        if (other.getJobNames() != null && other.getJobNames().equals(this.getJobNames()) == false)
            return false;
        if (other.getLastModifiedBy() == null ^ this.getLastModifiedBy() == null)
            return false;
        if (other.getLastModifiedBy() != null && other.getLastModifiedBy().equals(this.getLastModifiedBy()) == false)
            return false;
        if (other.getLastModifiedDate() == null ^ this.getLastModifiedDate() == null)
            return false;
        if (other.getLastModifiedDate() != null && other.getLastModifiedDate().equals(this.getLastModifiedDate()) == false)
            return false;
        if (other.getResourceArn() == null ^ this.getResourceArn() == null)
            return false;
        if (other.getResourceArn() != null && other.getResourceArn().equals(this.getResourceArn()) == false)
            return false;
        if (other.getCronExpression() == null ^ this.getCronExpression() == null)
            return false;
        if (other.getCronExpression() != null && other.getCronExpression().equals(this.getCronExpression()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCreateDate() == null) ? 0 : getCreateDate().hashCode());
        hashCode = prime * hashCode + ((getCreatedBy() == null) ? 0 : getCreatedBy().hashCode());
        hashCode = prime * hashCode + ((getJobNames() == null) ? 0 : getJobNames().hashCode());
        hashCode = prime * hashCode + ((getLastModifiedBy() == null) ? 0 : getLastModifiedBy().hashCode());
        hashCode = prime * hashCode + ((getLastModifiedDate() == null) ? 0 : getLastModifiedDate().hashCode());
        hashCode = prime * hashCode + ((getResourceArn() == null) ? 0 : getResourceArn().hashCode());
        hashCode = prime * hashCode + ((getCronExpression() == null) ? 0 : getCronExpression().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        return hashCode;
    }

    @Override
    public DescribeScheduleResult clone() {
        try {
            return (DescribeScheduleResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
