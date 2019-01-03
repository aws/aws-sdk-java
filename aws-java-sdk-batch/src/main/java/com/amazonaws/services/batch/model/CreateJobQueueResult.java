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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/batch-2016-08-10/CreateJobQueue" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateJobQueueResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the job queue.
     * </p>
     */
    private String jobQueueName;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the job queue.
     * </p>
     */
    private String jobQueueArn;

    /**
     * <p>
     * The name of the job queue.
     * </p>
     * 
     * @param jobQueueName
     *        The name of the job queue.
     */

    public void setJobQueueName(String jobQueueName) {
        this.jobQueueName = jobQueueName;
    }

    /**
     * <p>
     * The name of the job queue.
     * </p>
     * 
     * @return The name of the job queue.
     */

    public String getJobQueueName() {
        return this.jobQueueName;
    }

    /**
     * <p>
     * The name of the job queue.
     * </p>
     * 
     * @param jobQueueName
     *        The name of the job queue.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateJobQueueResult withJobQueueName(String jobQueueName) {
        setJobQueueName(jobQueueName);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the job queue.
     * </p>
     * 
     * @param jobQueueArn
     *        The Amazon Resource Name (ARN) of the job queue.
     */

    public void setJobQueueArn(String jobQueueArn) {
        this.jobQueueArn = jobQueueArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the job queue.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the job queue.
     */

    public String getJobQueueArn() {
        return this.jobQueueArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the job queue.
     * </p>
     * 
     * @param jobQueueArn
     *        The Amazon Resource Name (ARN) of the job queue.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateJobQueueResult withJobQueueArn(String jobQueueArn) {
        setJobQueueArn(jobQueueArn);
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
        if (getJobQueueName() != null)
            sb.append("JobQueueName: ").append(getJobQueueName()).append(",");
        if (getJobQueueArn() != null)
            sb.append("JobQueueArn: ").append(getJobQueueArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateJobQueueResult == false)
            return false;
        CreateJobQueueResult other = (CreateJobQueueResult) obj;
        if (other.getJobQueueName() == null ^ this.getJobQueueName() == null)
            return false;
        if (other.getJobQueueName() != null && other.getJobQueueName().equals(this.getJobQueueName()) == false)
            return false;
        if (other.getJobQueueArn() == null ^ this.getJobQueueArn() == null)
            return false;
        if (other.getJobQueueArn() != null && other.getJobQueueArn().equals(this.getJobQueueArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getJobQueueName() == null) ? 0 : getJobQueueName().hashCode());
        hashCode = prime * hashCode + ((getJobQueueArn() == null) ? 0 : getJobQueueArn().hashCode());
        return hashCode;
    }

    @Override
    public CreateJobQueueResult clone() {
        try {
            return (CreateJobQueueResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
