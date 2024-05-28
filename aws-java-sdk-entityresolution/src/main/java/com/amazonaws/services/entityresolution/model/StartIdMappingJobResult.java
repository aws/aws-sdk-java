/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.entityresolution.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/entityresolution-2018-05-10/StartIdMappingJob" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StartIdMappingJobResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the job.
     * </p>
     */
    private String jobId;
    /**
     * <p>
     * A list of <code>OutputSource</code> objects.
     * </p>
     */
    private java.util.List<IdMappingJobOutputSource> outputSourceConfig;

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

    public StartIdMappingJobResult withJobId(String jobId) {
        setJobId(jobId);
        return this;
    }

    /**
     * <p>
     * A list of <code>OutputSource</code> objects.
     * </p>
     * 
     * @return A list of <code>OutputSource</code> objects.
     */

    public java.util.List<IdMappingJobOutputSource> getOutputSourceConfig() {
        return outputSourceConfig;
    }

    /**
     * <p>
     * A list of <code>OutputSource</code> objects.
     * </p>
     * 
     * @param outputSourceConfig
     *        A list of <code>OutputSource</code> objects.
     */

    public void setOutputSourceConfig(java.util.Collection<IdMappingJobOutputSource> outputSourceConfig) {
        if (outputSourceConfig == null) {
            this.outputSourceConfig = null;
            return;
        }

        this.outputSourceConfig = new java.util.ArrayList<IdMappingJobOutputSource>(outputSourceConfig);
    }

    /**
     * <p>
     * A list of <code>OutputSource</code> objects.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setOutputSourceConfig(java.util.Collection)} or {@link #withOutputSourceConfig(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param outputSourceConfig
     *        A list of <code>OutputSource</code> objects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartIdMappingJobResult withOutputSourceConfig(IdMappingJobOutputSource... outputSourceConfig) {
        if (this.outputSourceConfig == null) {
            setOutputSourceConfig(new java.util.ArrayList<IdMappingJobOutputSource>(outputSourceConfig.length));
        }
        for (IdMappingJobOutputSource ele : outputSourceConfig) {
            this.outputSourceConfig.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of <code>OutputSource</code> objects.
     * </p>
     * 
     * @param outputSourceConfig
     *        A list of <code>OutputSource</code> objects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartIdMappingJobResult withOutputSourceConfig(java.util.Collection<IdMappingJobOutputSource> outputSourceConfig) {
        setOutputSourceConfig(outputSourceConfig);
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
        if (getJobId() != null)
            sb.append("JobId: ").append(getJobId()).append(",");
        if (getOutputSourceConfig() != null)
            sb.append("OutputSourceConfig: ").append(getOutputSourceConfig());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StartIdMappingJobResult == false)
            return false;
        StartIdMappingJobResult other = (StartIdMappingJobResult) obj;
        if (other.getJobId() == null ^ this.getJobId() == null)
            return false;
        if (other.getJobId() != null && other.getJobId().equals(this.getJobId()) == false)
            return false;
        if (other.getOutputSourceConfig() == null ^ this.getOutputSourceConfig() == null)
            return false;
        if (other.getOutputSourceConfig() != null && other.getOutputSourceConfig().equals(this.getOutputSourceConfig()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getJobId() == null) ? 0 : getJobId().hashCode());
        hashCode = prime * hashCode + ((getOutputSourceConfig() == null) ? 0 : getOutputSourceConfig().hashCode());
        return hashCode;
    }

    @Override
    public StartIdMappingJobResult clone() {
        try {
            return (StartIdMappingJobResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
