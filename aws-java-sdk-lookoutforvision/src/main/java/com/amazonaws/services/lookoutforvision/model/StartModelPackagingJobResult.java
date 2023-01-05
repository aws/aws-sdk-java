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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutvision-2020-11-20/StartModelPackagingJob"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StartModelPackagingJobResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The job name for the model packaging job. If you don't supply a job name in the <code>JobName</code> input
     * parameter, the service creates a job name for you.
     * </p>
     */
    private String jobName;

    /**
     * <p>
     * The job name for the model packaging job. If you don't supply a job name in the <code>JobName</code> input
     * parameter, the service creates a job name for you.
     * </p>
     * 
     * @param jobName
     *        The job name for the model packaging job. If you don't supply a job name in the <code>JobName</code> input
     *        parameter, the service creates a job name for you.
     */

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    /**
     * <p>
     * The job name for the model packaging job. If you don't supply a job name in the <code>JobName</code> input
     * parameter, the service creates a job name for you.
     * </p>
     * 
     * @return The job name for the model packaging job. If you don't supply a job name in the <code>JobName</code>
     *         input parameter, the service creates a job name for you.
     */

    public String getJobName() {
        return this.jobName;
    }

    /**
     * <p>
     * The job name for the model packaging job. If you don't supply a job name in the <code>JobName</code> input
     * parameter, the service creates a job name for you.
     * </p>
     * 
     * @param jobName
     *        The job name for the model packaging job. If you don't supply a job name in the <code>JobName</code> input
     *        parameter, the service creates a job name for you.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartModelPackagingJobResult withJobName(String jobName) {
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

        if (obj instanceof StartModelPackagingJobResult == false)
            return false;
        StartModelPackagingJobResult other = (StartModelPackagingJobResult) obj;
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

        hashCode = prime * hashCode + ((getJobName() == null) ? 0 : getJobName().hashCode());
        return hashCode;
    }

    @Override
    public StartModelPackagingJobResult clone() {
        try {
            return (StartModelPackagingJobResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
