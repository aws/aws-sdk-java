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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/UpdateJob" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateJobRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Name of the job definition to update.
     * </p>
     */
    private String jobName;
    /**
     * <p>
     * Specifies the values with which to update the job definition.
     * </p>
     */
    private JobUpdate jobUpdate;

    /**
     * <p>
     * Name of the job definition to update.
     * </p>
     * 
     * @param jobName
     *        Name of the job definition to update.
     */

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    /**
     * <p>
     * Name of the job definition to update.
     * </p>
     * 
     * @return Name of the job definition to update.
     */

    public String getJobName() {
        return this.jobName;
    }

    /**
     * <p>
     * Name of the job definition to update.
     * </p>
     * 
     * @param jobName
     *        Name of the job definition to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateJobRequest withJobName(String jobName) {
        setJobName(jobName);
        return this;
    }

    /**
     * <p>
     * Specifies the values with which to update the job definition.
     * </p>
     * 
     * @param jobUpdate
     *        Specifies the values with which to update the job definition.
     */

    public void setJobUpdate(JobUpdate jobUpdate) {
        this.jobUpdate = jobUpdate;
    }

    /**
     * <p>
     * Specifies the values with which to update the job definition.
     * </p>
     * 
     * @return Specifies the values with which to update the job definition.
     */

    public JobUpdate getJobUpdate() {
        return this.jobUpdate;
    }

    /**
     * <p>
     * Specifies the values with which to update the job definition.
     * </p>
     * 
     * @param jobUpdate
     *        Specifies the values with which to update the job definition.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateJobRequest withJobUpdate(JobUpdate jobUpdate) {
        setJobUpdate(jobUpdate);
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
        if (getJobName() != null)
            sb.append("JobName: ").append(getJobName()).append(",");
        if (getJobUpdate() != null)
            sb.append("JobUpdate: ").append(getJobUpdate());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateJobRequest == false)
            return false;
        UpdateJobRequest other = (UpdateJobRequest) obj;
        if (other.getJobName() == null ^ this.getJobName() == null)
            return false;
        if (other.getJobName() != null && other.getJobName().equals(this.getJobName()) == false)
            return false;
        if (other.getJobUpdate() == null ^ this.getJobUpdate() == null)
            return false;
        if (other.getJobUpdate() != null && other.getJobUpdate().equals(this.getJobUpdate()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getJobName() == null) ? 0 : getJobName().hashCode());
        hashCode = prime * hashCode + ((getJobUpdate() == null) ? 0 : getJobUpdate().hashCode());
        return hashCode;
    }

    @Override
    public UpdateJobRequest clone() {
        return (UpdateJobRequest) super.clone();
    }

}
