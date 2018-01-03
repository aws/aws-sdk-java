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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/StartJobRun" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StartJobRunRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the job to start.
     * </p>
     */
    private String jobName;
    /**
     * <p>
     * The ID of the job run to start.
     * </p>
     */
    private String jobRunId;
    /**
     * <p>
     * Specific arguments for this job run.
     * </p>
     */
    private java.util.Map<String, String> arguments;
    /**
     * <p>
     * The infrastructure capacity to allocate to this job.
     * </p>
     */
    private Integer allocatedCapacity;

    /**
     * <p>
     * The name of the job to start.
     * </p>
     * 
     * @param jobName
     *        The name of the job to start.
     */

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    /**
     * <p>
     * The name of the job to start.
     * </p>
     * 
     * @return The name of the job to start.
     */

    public String getJobName() {
        return this.jobName;
    }

    /**
     * <p>
     * The name of the job to start.
     * </p>
     * 
     * @param jobName
     *        The name of the job to start.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartJobRunRequest withJobName(String jobName) {
        setJobName(jobName);
        return this;
    }

    /**
     * <p>
     * The ID of the job run to start.
     * </p>
     * 
     * @param jobRunId
     *        The ID of the job run to start.
     */

    public void setJobRunId(String jobRunId) {
        this.jobRunId = jobRunId;
    }

    /**
     * <p>
     * The ID of the job run to start.
     * </p>
     * 
     * @return The ID of the job run to start.
     */

    public String getJobRunId() {
        return this.jobRunId;
    }

    /**
     * <p>
     * The ID of the job run to start.
     * </p>
     * 
     * @param jobRunId
     *        The ID of the job run to start.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartJobRunRequest withJobRunId(String jobRunId) {
        setJobRunId(jobRunId);
        return this;
    }

    /**
     * <p>
     * Specific arguments for this job run.
     * </p>
     * 
     * @return Specific arguments for this job run.
     */

    public java.util.Map<String, String> getArguments() {
        return arguments;
    }

    /**
     * <p>
     * Specific arguments for this job run.
     * </p>
     * 
     * @param arguments
     *        Specific arguments for this job run.
     */

    public void setArguments(java.util.Map<String, String> arguments) {
        this.arguments = arguments;
    }

    /**
     * <p>
     * Specific arguments for this job run.
     * </p>
     * 
     * @param arguments
     *        Specific arguments for this job run.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartJobRunRequest withArguments(java.util.Map<String, String> arguments) {
        setArguments(arguments);
        return this;
    }

    public StartJobRunRequest addArgumentsEntry(String key, String value) {
        if (null == this.arguments) {
            this.arguments = new java.util.HashMap<String, String>();
        }
        if (this.arguments.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.arguments.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Arguments.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartJobRunRequest clearArgumentsEntries() {
        this.arguments = null;
        return this;
    }

    /**
     * <p>
     * The infrastructure capacity to allocate to this job.
     * </p>
     * 
     * @param allocatedCapacity
     *        The infrastructure capacity to allocate to this job.
     */

    public void setAllocatedCapacity(Integer allocatedCapacity) {
        this.allocatedCapacity = allocatedCapacity;
    }

    /**
     * <p>
     * The infrastructure capacity to allocate to this job.
     * </p>
     * 
     * @return The infrastructure capacity to allocate to this job.
     */

    public Integer getAllocatedCapacity() {
        return this.allocatedCapacity;
    }

    /**
     * <p>
     * The infrastructure capacity to allocate to this job.
     * </p>
     * 
     * @param allocatedCapacity
     *        The infrastructure capacity to allocate to this job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartJobRunRequest withAllocatedCapacity(Integer allocatedCapacity) {
        setAllocatedCapacity(allocatedCapacity);
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
        if (getJobRunId() != null)
            sb.append("JobRunId: ").append(getJobRunId()).append(",");
        if (getArguments() != null)
            sb.append("Arguments: ").append(getArguments()).append(",");
        if (getAllocatedCapacity() != null)
            sb.append("AllocatedCapacity: ").append(getAllocatedCapacity());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StartJobRunRequest == false)
            return false;
        StartJobRunRequest other = (StartJobRunRequest) obj;
        if (other.getJobName() == null ^ this.getJobName() == null)
            return false;
        if (other.getJobName() != null && other.getJobName().equals(this.getJobName()) == false)
            return false;
        if (other.getJobRunId() == null ^ this.getJobRunId() == null)
            return false;
        if (other.getJobRunId() != null && other.getJobRunId().equals(this.getJobRunId()) == false)
            return false;
        if (other.getArguments() == null ^ this.getArguments() == null)
            return false;
        if (other.getArguments() != null && other.getArguments().equals(this.getArguments()) == false)
            return false;
        if (other.getAllocatedCapacity() == null ^ this.getAllocatedCapacity() == null)
            return false;
        if (other.getAllocatedCapacity() != null && other.getAllocatedCapacity().equals(this.getAllocatedCapacity()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getJobName() == null) ? 0 : getJobName().hashCode());
        hashCode = prime * hashCode + ((getJobRunId() == null) ? 0 : getJobRunId().hashCode());
        hashCode = prime * hashCode + ((getArguments() == null) ? 0 : getArguments().hashCode());
        hashCode = prime * hashCode + ((getAllocatedCapacity() == null) ? 0 : getAllocatedCapacity().hashCode());
        return hashCode;
    }

    @Override
    public StartJobRunRequest clone() {
        return (StartJobRunRequest) super.clone();
    }

}
