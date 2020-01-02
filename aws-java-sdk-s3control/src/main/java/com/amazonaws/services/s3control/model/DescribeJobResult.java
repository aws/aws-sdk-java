/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.s3control.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/DescribeJob" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeJobResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.services.s3control.S3ControlResponseMetadata> implements
        Serializable, Cloneable {

    /**
     * <p>
     * Contains the configuration parameters and status for the job specified in the <code>Describe Job</code> request.
     * </p>
     */
    private JobDescriptor job;

    /**
     * <p>
     * Contains the configuration parameters and status for the job specified in the <code>Describe Job</code> request.
     * </p>
     * 
     * @param job
     *        Contains the configuration parameters and status for the job specified in the <code>Describe Job</code>
     *        request.
     */

    public void setJob(JobDescriptor job) {
        this.job = job;
    }

    /**
     * <p>
     * Contains the configuration parameters and status for the job specified in the <code>Describe Job</code> request.
     * </p>
     * 
     * @return Contains the configuration parameters and status for the job specified in the <code>Describe Job</code>
     *         request.
     */

    public JobDescriptor getJob() {
        return this.job;
    }

    /**
     * <p>
     * Contains the configuration parameters and status for the job specified in the <code>Describe Job</code> request.
     * </p>
     * 
     * @param job
     *        Contains the configuration parameters and status for the job specified in the <code>Describe Job</code>
     *        request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeJobResult withJob(JobDescriptor job) {
        setJob(job);
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
        if (getJob() != null)
            sb.append("Job: ").append(getJob());
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
        if (other.getJob() == null ^ this.getJob() == null)
            return false;
        if (other.getJob() != null && other.getJob().equals(this.getJob()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getJob() == null) ? 0 : getJob().hashCode());
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
