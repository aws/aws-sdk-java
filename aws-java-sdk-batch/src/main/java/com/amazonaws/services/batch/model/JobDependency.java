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
package com.amazonaws.services.batch.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An object representing an AWS Batch job dependency.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/batch-2016-08-10/JobDependency" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class JobDependency implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The job ID of the AWS Batch job associated with this dependency.
     * </p>
     */
    private String jobId;
    /**
     * <p>
     * The type of the job dependency.
     * </p>
     */
    private String type;

    /**
     * <p>
     * The job ID of the AWS Batch job associated with this dependency.
     * </p>
     * 
     * @param jobId
     *        The job ID of the AWS Batch job associated with this dependency.
     */

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    /**
     * <p>
     * The job ID of the AWS Batch job associated with this dependency.
     * </p>
     * 
     * @return The job ID of the AWS Batch job associated with this dependency.
     */

    public String getJobId() {
        return this.jobId;
    }

    /**
     * <p>
     * The job ID of the AWS Batch job associated with this dependency.
     * </p>
     * 
     * @param jobId
     *        The job ID of the AWS Batch job associated with this dependency.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobDependency withJobId(String jobId) {
        setJobId(jobId);
        return this;
    }

    /**
     * <p>
     * The type of the job dependency.
     * </p>
     * 
     * @param type
     *        The type of the job dependency.
     * @see ArrayJobDependency
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of the job dependency.
     * </p>
     * 
     * @return The type of the job dependency.
     * @see ArrayJobDependency
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of the job dependency.
     * </p>
     * 
     * @param type
     *        The type of the job dependency.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ArrayJobDependency
     */

    public JobDependency withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The type of the job dependency.
     * </p>
     * 
     * @param type
     *        The type of the job dependency.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ArrayJobDependency
     */

    public JobDependency withType(ArrayJobDependency type) {
        this.type = type.toString();
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
        if (getType() != null)
            sb.append("Type: ").append(getType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof JobDependency == false)
            return false;
        JobDependency other = (JobDependency) obj;
        if (other.getJobId() == null ^ this.getJobId() == null)
            return false;
        if (other.getJobId() != null && other.getJobId().equals(this.getJobId()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getJobId() == null) ? 0 : getJobId().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        return hashCode;
    }

    @Override
    public JobDependency clone() {
        try {
            return (JobDependency) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.batch.model.transform.JobDependencyMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
