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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/databrew-2017-07-25/UpdateSchedule" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateScheduleRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name or names of one or more jobs to be run for this schedule.
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
     * The name of the schedule to update.
     * </p>
     */
    private String name;

    /**
     * <p>
     * The name or names of one or more jobs to be run for this schedule.
     * </p>
     * 
     * @return The name or names of one or more jobs to be run for this schedule.
     */

    public java.util.List<String> getJobNames() {
        return jobNames;
    }

    /**
     * <p>
     * The name or names of one or more jobs to be run for this schedule.
     * </p>
     * 
     * @param jobNames
     *        The name or names of one or more jobs to be run for this schedule.
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
     * The name or names of one or more jobs to be run for this schedule.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setJobNames(java.util.Collection)} or {@link #withJobNames(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param jobNames
     *        The name or names of one or more jobs to be run for this schedule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateScheduleRequest withJobNames(String... jobNames) {
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
     * The name or names of one or more jobs to be run for this schedule.
     * </p>
     * 
     * @param jobNames
     *        The name or names of one or more jobs to be run for this schedule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateScheduleRequest withJobNames(java.util.Collection<String> jobNames) {
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

    public UpdateScheduleRequest withCronExpression(String cronExpression) {
        setCronExpression(cronExpression);
        return this;
    }

    /**
     * <p>
     * The name of the schedule to update.
     * </p>
     * 
     * @param name
     *        The name of the schedule to update.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the schedule to update.
     * </p>
     * 
     * @return The name of the schedule to update.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the schedule to update.
     * </p>
     * 
     * @param name
     *        The name of the schedule to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateScheduleRequest withName(String name) {
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

        if (obj instanceof UpdateScheduleRequest == false)
            return false;
        UpdateScheduleRequest other = (UpdateScheduleRequest) obj;
        if (other.getJobNames() == null ^ this.getJobNames() == null)
            return false;
        if (other.getJobNames() != null && other.getJobNames().equals(this.getJobNames()) == false)
            return false;
        if (other.getCronExpression() == null ^ this.getCronExpression() == null)
            return false;
        if (other.getCronExpression() != null && other.getCronExpression().equals(this.getCronExpression()) == false)
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
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        return hashCode;
    }

    @Override
    public UpdateScheduleRequest clone() {
        return (UpdateScheduleRequest) super.clone();
    }

}
