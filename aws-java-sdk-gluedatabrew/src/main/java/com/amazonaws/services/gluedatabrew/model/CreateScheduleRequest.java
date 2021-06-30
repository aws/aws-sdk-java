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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/databrew-2017-07-25/CreateSchedule" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateScheduleRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name or names of one or more jobs to be run.
     * </p>
     */
    private java.util.List<String> jobNames;
    /**
     * <p>
     * The date or dates and time or times when the jobs are to be run. For more information, see <a
     * href="https://docs.aws.amazon.com/databrew/latest/dg/jobs.cron.html">Cron expressions</a> in the <i>Glue DataBrew
     * Developer Guide</i>.
     * </p>
     */
    private String cronExpression;
    /**
     * <p>
     * Metadata tags to apply to this schedule.
     * </p>
     */
    private java.util.Map<String, String> tags;
    /**
     * <p>
     * A unique name for the schedule. Valid characters are alphanumeric (A-Z, a-z, 0-9), hyphen (-), period (.), and
     * space.
     * </p>
     */
    private String name;

    /**
     * <p>
     * The name or names of one or more jobs to be run.
     * </p>
     * 
     * @return The name or names of one or more jobs to be run.
     */

    public java.util.List<String> getJobNames() {
        return jobNames;
    }

    /**
     * <p>
     * The name or names of one or more jobs to be run.
     * </p>
     * 
     * @param jobNames
     *        The name or names of one or more jobs to be run.
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
     * The name or names of one or more jobs to be run.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setJobNames(java.util.Collection)} or {@link #withJobNames(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param jobNames
     *        The name or names of one or more jobs to be run.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateScheduleRequest withJobNames(String... jobNames) {
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
     * The name or names of one or more jobs to be run.
     * </p>
     * 
     * @param jobNames
     *        The name or names of one or more jobs to be run.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateScheduleRequest withJobNames(java.util.Collection<String> jobNames) {
        setJobNames(jobNames);
        return this;
    }

    /**
     * <p>
     * The date or dates and time or times when the jobs are to be run. For more information, see <a
     * href="https://docs.aws.amazon.com/databrew/latest/dg/jobs.cron.html">Cron expressions</a> in the <i>Glue DataBrew
     * Developer Guide</i>.
     * </p>
     * 
     * @param cronExpression
     *        The date or dates and time or times when the jobs are to be run. For more information, see <a
     *        href="https://docs.aws.amazon.com/databrew/latest/dg/jobs.cron.html">Cron expressions</a> in the <i>Glue
     *        DataBrew Developer Guide</i>.
     */

    public void setCronExpression(String cronExpression) {
        this.cronExpression = cronExpression;
    }

    /**
     * <p>
     * The date or dates and time or times when the jobs are to be run. For more information, see <a
     * href="https://docs.aws.amazon.com/databrew/latest/dg/jobs.cron.html">Cron expressions</a> in the <i>Glue DataBrew
     * Developer Guide</i>.
     * </p>
     * 
     * @return The date or dates and time or times when the jobs are to be run. For more information, see <a
     *         href="https://docs.aws.amazon.com/databrew/latest/dg/jobs.cron.html">Cron expressions</a> in the <i>Glue
     *         DataBrew Developer Guide</i>.
     */

    public String getCronExpression() {
        return this.cronExpression;
    }

    /**
     * <p>
     * The date or dates and time or times when the jobs are to be run. For more information, see <a
     * href="https://docs.aws.amazon.com/databrew/latest/dg/jobs.cron.html">Cron expressions</a> in the <i>Glue DataBrew
     * Developer Guide</i>.
     * </p>
     * 
     * @param cronExpression
     *        The date or dates and time or times when the jobs are to be run. For more information, see <a
     *        href="https://docs.aws.amazon.com/databrew/latest/dg/jobs.cron.html">Cron expressions</a> in the <i>Glue
     *        DataBrew Developer Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateScheduleRequest withCronExpression(String cronExpression) {
        setCronExpression(cronExpression);
        return this;
    }

    /**
     * <p>
     * Metadata tags to apply to this schedule.
     * </p>
     * 
     * @return Metadata tags to apply to this schedule.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * Metadata tags to apply to this schedule.
     * </p>
     * 
     * @param tags
     *        Metadata tags to apply to this schedule.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * Metadata tags to apply to this schedule.
     * </p>
     * 
     * @param tags
     *        Metadata tags to apply to this schedule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateScheduleRequest withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see CreateScheduleRequest#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public CreateScheduleRequest addTagsEntry(String key, String value) {
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

    public CreateScheduleRequest clearTagsEntries() {
        this.tags = null;
        return this;
    }

    /**
     * <p>
     * A unique name for the schedule. Valid characters are alphanumeric (A-Z, a-z, 0-9), hyphen (-), period (.), and
     * space.
     * </p>
     * 
     * @param name
     *        A unique name for the schedule. Valid characters are alphanumeric (A-Z, a-z, 0-9), hyphen (-), period (.),
     *        and space.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * A unique name for the schedule. Valid characters are alphanumeric (A-Z, a-z, 0-9), hyphen (-), period (.), and
     * space.
     * </p>
     * 
     * @return A unique name for the schedule. Valid characters are alphanumeric (A-Z, a-z, 0-9), hyphen (-), period
     *         (.), and space.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * A unique name for the schedule. Valid characters are alphanumeric (A-Z, a-z, 0-9), hyphen (-), period (.), and
     * space.
     * </p>
     * 
     * @param name
     *        A unique name for the schedule. Valid characters are alphanumeric (A-Z, a-z, 0-9), hyphen (-), period (.),
     *        and space.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateScheduleRequest withName(String name) {
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
        if (getJobNames() != null)
            sb.append("JobNames: ").append(getJobNames()).append(",");
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

        if (obj instanceof CreateScheduleRequest == false)
            return false;
        CreateScheduleRequest other = (CreateScheduleRequest) obj;
        if (other.getJobNames() == null ^ this.getJobNames() == null)
            return false;
        if (other.getJobNames() != null && other.getJobNames().equals(this.getJobNames()) == false)
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

        hashCode = prime * hashCode + ((getJobNames() == null) ? 0 : getJobNames().hashCode());
        hashCode = prime * hashCode + ((getCronExpression() == null) ? 0 : getCronExpression().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        return hashCode;
    }

    @Override
    public CreateScheduleRequest clone() {
        return (CreateScheduleRequest) super.clone();
    }

}
