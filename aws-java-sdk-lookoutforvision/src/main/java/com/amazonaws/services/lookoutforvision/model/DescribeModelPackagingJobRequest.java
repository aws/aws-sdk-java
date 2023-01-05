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
package com.amazonaws.services.lookoutforvision.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutvision-2020-11-20/DescribeModelPackagingJob"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeModelPackagingJobRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the project that contains the model packaging job that you want to describe.
     * </p>
     */
    private String projectName;
    /**
     * <p>
     * The job name for the model packaging job.
     * </p>
     */
    private String jobName;

    /**
     * <p>
     * The name of the project that contains the model packaging job that you want to describe.
     * </p>
     * 
     * @param projectName
     *        The name of the project that contains the model packaging job that you want to describe.
     */

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    /**
     * <p>
     * The name of the project that contains the model packaging job that you want to describe.
     * </p>
     * 
     * @return The name of the project that contains the model packaging job that you want to describe.
     */

    public String getProjectName() {
        return this.projectName;
    }

    /**
     * <p>
     * The name of the project that contains the model packaging job that you want to describe.
     * </p>
     * 
     * @param projectName
     *        The name of the project that contains the model packaging job that you want to describe.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeModelPackagingJobRequest withProjectName(String projectName) {
        setProjectName(projectName);
        return this;
    }

    /**
     * <p>
     * The job name for the model packaging job.
     * </p>
     * 
     * @param jobName
     *        The job name for the model packaging job.
     */

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    /**
     * <p>
     * The job name for the model packaging job.
     * </p>
     * 
     * @return The job name for the model packaging job.
     */

    public String getJobName() {
        return this.jobName;
    }

    /**
     * <p>
     * The job name for the model packaging job.
     * </p>
     * 
     * @param jobName
     *        The job name for the model packaging job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeModelPackagingJobRequest withJobName(String jobName) {
        setJobName(jobName);
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
        if (getProjectName() != null)
            sb.append("ProjectName: ").append(getProjectName()).append(",");
        if (getJobName() != null)
            sb.append("JobName: ").append(getJobName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeModelPackagingJobRequest == false)
            return false;
        DescribeModelPackagingJobRequest other = (DescribeModelPackagingJobRequest) obj;
        if (other.getProjectName() == null ^ this.getProjectName() == null)
            return false;
        if (other.getProjectName() != null && other.getProjectName().equals(this.getProjectName()) == false)
            return false;
        if (other.getJobName() == null ^ this.getJobName() == null)
            return false;
        if (other.getJobName() != null && other.getJobName().equals(this.getJobName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getProjectName() == null) ? 0 : getProjectName().hashCode());
        hashCode = prime * hashCode + ((getJobName() == null) ? 0 : getJobName().hashCode());
        return hashCode;
    }

    @Override
    public DescribeModelPackagingJobRequest clone() {
        return (DescribeModelPackagingJobRequest) super.clone();
    }

}
