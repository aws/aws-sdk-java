/*
 * Copyright 2012-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/BatchStopJobRun" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchStopJobRunRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the job whose job runs are to be stopped.
     * </p>
     */
    private String jobName;
    /**
     * <p>
     * A list of job run Ids of the given job to be stopped.
     * </p>
     */
    private java.util.List<String> jobRunIds;

    /**
     * <p>
     * The name of the job whose job runs are to be stopped.
     * </p>
     * 
     * @param jobName
     *        The name of the job whose job runs are to be stopped.
     */

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    /**
     * <p>
     * The name of the job whose job runs are to be stopped.
     * </p>
     * 
     * @return The name of the job whose job runs are to be stopped.
     */

    public String getJobName() {
        return this.jobName;
    }

    /**
     * <p>
     * The name of the job whose job runs are to be stopped.
     * </p>
     * 
     * @param jobName
     *        The name of the job whose job runs are to be stopped.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchStopJobRunRequest withJobName(String jobName) {
        setJobName(jobName);
        return this;
    }

    /**
     * <p>
     * A list of job run Ids of the given job to be stopped.
     * </p>
     * 
     * @return A list of job run Ids of the given job to be stopped.
     */

    public java.util.List<String> getJobRunIds() {
        return jobRunIds;
    }

    /**
     * <p>
     * A list of job run Ids of the given job to be stopped.
     * </p>
     * 
     * @param jobRunIds
     *        A list of job run Ids of the given job to be stopped.
     */

    public void setJobRunIds(java.util.Collection<String> jobRunIds) {
        if (jobRunIds == null) {
            this.jobRunIds = null;
            return;
        }

        this.jobRunIds = new java.util.ArrayList<String>(jobRunIds);
    }

    /**
     * <p>
     * A list of job run Ids of the given job to be stopped.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setJobRunIds(java.util.Collection)} or {@link #withJobRunIds(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param jobRunIds
     *        A list of job run Ids of the given job to be stopped.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchStopJobRunRequest withJobRunIds(String... jobRunIds) {
        if (this.jobRunIds == null) {
            setJobRunIds(new java.util.ArrayList<String>(jobRunIds.length));
        }
        for (String ele : jobRunIds) {
            this.jobRunIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of job run Ids of the given job to be stopped.
     * </p>
     * 
     * @param jobRunIds
     *        A list of job run Ids of the given job to be stopped.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchStopJobRunRequest withJobRunIds(java.util.Collection<String> jobRunIds) {
        setJobRunIds(jobRunIds);
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
        if (getJobName() != null)
            sb.append("JobName: ").append(getJobName()).append(",");
        if (getJobRunIds() != null)
            sb.append("JobRunIds: ").append(getJobRunIds());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchStopJobRunRequest == false)
            return false;
        BatchStopJobRunRequest other = (BatchStopJobRunRequest) obj;
        if (other.getJobName() == null ^ this.getJobName() == null)
            return false;
        if (other.getJobName() != null && other.getJobName().equals(this.getJobName()) == false)
            return false;
        if (other.getJobRunIds() == null ^ this.getJobRunIds() == null)
            return false;
        if (other.getJobRunIds() != null && other.getJobRunIds().equals(this.getJobRunIds()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getJobName() == null) ? 0 : getJobName().hashCode());
        hashCode = prime * hashCode + ((getJobRunIds() == null) ? 0 : getJobRunIds().hashCode());
        return hashCode;
    }

    @Override
    public BatchStopJobRunRequest clone() {
        return (BatchStopJobRunRequest) super.clone();
    }

}
