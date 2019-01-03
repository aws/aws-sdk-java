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
package com.amazonaws.services.snowball.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/snowball-2016-06-30/DescribeJob" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeJobResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Information about a specific job, including shipping information, job status, and other important metadata.
     * </p>
     */
    private JobMetadata jobMetadata;
    /**
     * <p>
     * Information about a specific job part (in the case of an export job), including shipping information, job status,
     * and other important metadata.
     * </p>
     */
    private java.util.List<JobMetadata> subJobMetadata;

    /**
     * <p>
     * Information about a specific job, including shipping information, job status, and other important metadata.
     * </p>
     * 
     * @param jobMetadata
     *        Information about a specific job, including shipping information, job status, and other important
     *        metadata.
     */

    public void setJobMetadata(JobMetadata jobMetadata) {
        this.jobMetadata = jobMetadata;
    }

    /**
     * <p>
     * Information about a specific job, including shipping information, job status, and other important metadata.
     * </p>
     * 
     * @return Information about a specific job, including shipping information, job status, and other important
     *         metadata.
     */

    public JobMetadata getJobMetadata() {
        return this.jobMetadata;
    }

    /**
     * <p>
     * Information about a specific job, including shipping information, job status, and other important metadata.
     * </p>
     * 
     * @param jobMetadata
     *        Information about a specific job, including shipping information, job status, and other important
     *        metadata.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeJobResult withJobMetadata(JobMetadata jobMetadata) {
        setJobMetadata(jobMetadata);
        return this;
    }

    /**
     * <p>
     * Information about a specific job part (in the case of an export job), including shipping information, job status,
     * and other important metadata.
     * </p>
     * 
     * @return Information about a specific job part (in the case of an export job), including shipping information, job
     *         status, and other important metadata.
     */

    public java.util.List<JobMetadata> getSubJobMetadata() {
        return subJobMetadata;
    }

    /**
     * <p>
     * Information about a specific job part (in the case of an export job), including shipping information, job status,
     * and other important metadata.
     * </p>
     * 
     * @param subJobMetadata
     *        Information about a specific job part (in the case of an export job), including shipping information, job
     *        status, and other important metadata.
     */

    public void setSubJobMetadata(java.util.Collection<JobMetadata> subJobMetadata) {
        if (subJobMetadata == null) {
            this.subJobMetadata = null;
            return;
        }

        this.subJobMetadata = new java.util.ArrayList<JobMetadata>(subJobMetadata);
    }

    /**
     * <p>
     * Information about a specific job part (in the case of an export job), including shipping information, job status,
     * and other important metadata.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSubJobMetadata(java.util.Collection)} or {@link #withSubJobMetadata(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param subJobMetadata
     *        Information about a specific job part (in the case of an export job), including shipping information, job
     *        status, and other important metadata.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeJobResult withSubJobMetadata(JobMetadata... subJobMetadata) {
        if (this.subJobMetadata == null) {
            setSubJobMetadata(new java.util.ArrayList<JobMetadata>(subJobMetadata.length));
        }
        for (JobMetadata ele : subJobMetadata) {
            this.subJobMetadata.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Information about a specific job part (in the case of an export job), including shipping information, job status,
     * and other important metadata.
     * </p>
     * 
     * @param subJobMetadata
     *        Information about a specific job part (in the case of an export job), including shipping information, job
     *        status, and other important metadata.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeJobResult withSubJobMetadata(java.util.Collection<JobMetadata> subJobMetadata) {
        setSubJobMetadata(subJobMetadata);
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
        if (getJobMetadata() != null)
            sb.append("JobMetadata: ").append(getJobMetadata()).append(",");
        if (getSubJobMetadata() != null)
            sb.append("SubJobMetadata: ").append(getSubJobMetadata());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeJobResult == false)
            return false;
        DescribeJobResult other = (DescribeJobResult) obj;
        if (other.getJobMetadata() == null ^ this.getJobMetadata() == null)
            return false;
        if (other.getJobMetadata() != null && other.getJobMetadata().equals(this.getJobMetadata()) == false)
            return false;
        if (other.getSubJobMetadata() == null ^ this.getSubJobMetadata() == null)
            return false;
        if (other.getSubJobMetadata() != null && other.getSubJobMetadata().equals(this.getSubJobMetadata()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getJobMetadata() == null) ? 0 : getJobMetadata().hashCode());
        hashCode = prime * hashCode + ((getSubJobMetadata() == null) ? 0 : getSubJobMetadata().hashCode());
        return hashCode;
    }

    @Override
    public DescribeJobResult clone() {
        try {
            return (DescribeJobResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
