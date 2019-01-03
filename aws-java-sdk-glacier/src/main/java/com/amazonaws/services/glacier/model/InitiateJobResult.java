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
package com.amazonaws.services.glacier.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Contains the Amazon Glacier response to your request.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InitiateJobResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The relative URI path of the job.
     * </p>
     */
    private String location;
    /**
     * <p>
     * The ID of the job.
     * </p>
     */
    private String jobId;
    /**
     * <p>
     * The path to the location of where the select results are stored.
     * </p>
     */
    private String jobOutputPath;

    /**
     * <p>
     * The relative URI path of the job.
     * </p>
     * 
     * @param location
     *        The relative URI path of the job.
     */

    public void setLocation(String location) {
        this.location = location;
    }

    /**
     * <p>
     * The relative URI path of the job.
     * </p>
     * 
     * @return The relative URI path of the job.
     */

    public String getLocation() {
        return this.location;
    }

    /**
     * <p>
     * The relative URI path of the job.
     * </p>
     * 
     * @param location
     *        The relative URI path of the job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InitiateJobResult withLocation(String location) {
        setLocation(location);
        return this;
    }

    /**
     * <p>
     * The ID of the job.
     * </p>
     * 
     * @param jobId
     *        The ID of the job.
     */

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    /**
     * <p>
     * The ID of the job.
     * </p>
     * 
     * @return The ID of the job.
     */

    public String getJobId() {
        return this.jobId;
    }

    /**
     * <p>
     * The ID of the job.
     * </p>
     * 
     * @param jobId
     *        The ID of the job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InitiateJobResult withJobId(String jobId) {
        setJobId(jobId);
        return this;
    }

    /**
     * <p>
     * The path to the location of where the select results are stored.
     * </p>
     * 
     * @param jobOutputPath
     *        The path to the location of where the select results are stored.
     */

    public void setJobOutputPath(String jobOutputPath) {
        this.jobOutputPath = jobOutputPath;
    }

    /**
     * <p>
     * The path to the location of where the select results are stored.
     * </p>
     * 
     * @return The path to the location of where the select results are stored.
     */

    public String getJobOutputPath() {
        return this.jobOutputPath;
    }

    /**
     * <p>
     * The path to the location of where the select results are stored.
     * </p>
     * 
     * @param jobOutputPath
     *        The path to the location of where the select results are stored.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InitiateJobResult withJobOutputPath(String jobOutputPath) {
        setJobOutputPath(jobOutputPath);
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
        if (getLocation() != null)
            sb.append("Location: ").append(getLocation()).append(",");
        if (getJobId() != null)
            sb.append("JobId: ").append(getJobId()).append(",");
        if (getJobOutputPath() != null)
            sb.append("JobOutputPath: ").append(getJobOutputPath());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof InitiateJobResult == false)
            return false;
        InitiateJobResult other = (InitiateJobResult) obj;
        if (other.getLocation() == null ^ this.getLocation() == null)
            return false;
        if (other.getLocation() != null && other.getLocation().equals(this.getLocation()) == false)
            return false;
        if (other.getJobId() == null ^ this.getJobId() == null)
            return false;
        if (other.getJobId() != null && other.getJobId().equals(this.getJobId()) == false)
            return false;
        if (other.getJobOutputPath() == null ^ this.getJobOutputPath() == null)
            return false;
        if (other.getJobOutputPath() != null && other.getJobOutputPath().equals(this.getJobOutputPath()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLocation() == null) ? 0 : getLocation().hashCode());
        hashCode = prime * hashCode + ((getJobId() == null) ? 0 : getJobId().hashCode());
        hashCode = prime * hashCode + ((getJobOutputPath() == null) ? 0 : getJobOutputPath().hashCode());
        return hashCode;
    }

    @Override
    public InitiateJobResult clone() {
        try {
            return (InitiateJobResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
