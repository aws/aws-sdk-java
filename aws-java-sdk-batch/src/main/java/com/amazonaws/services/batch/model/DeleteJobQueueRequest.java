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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/batch-2016-08-10/DeleteJobQueue" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteJobQueueRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The short name or full Amazon Resource Name (ARN) of the queue to delete.
     * </p>
     */
    private String jobQueue;

    /**
     * <p>
     * The short name or full Amazon Resource Name (ARN) of the queue to delete.
     * </p>
     * 
     * @param jobQueue
     *        The short name or full Amazon Resource Name (ARN) of the queue to delete.
     */

    public void setJobQueue(String jobQueue) {
        this.jobQueue = jobQueue;
    }

    /**
     * <p>
     * The short name or full Amazon Resource Name (ARN) of the queue to delete.
     * </p>
     * 
     * @return The short name or full Amazon Resource Name (ARN) of the queue to delete.
     */

    public String getJobQueue() {
        return this.jobQueue;
    }

    /**
     * <p>
     * The short name or full Amazon Resource Name (ARN) of the queue to delete.
     * </p>
     * 
     * @param jobQueue
     *        The short name or full Amazon Resource Name (ARN) of the queue to delete.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteJobQueueRequest withJobQueue(String jobQueue) {
        setJobQueue(jobQueue);
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
        if (getJobQueue() != null)
            sb.append("JobQueue: ").append(getJobQueue());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteJobQueueRequest == false)
            return false;
        DeleteJobQueueRequest other = (DeleteJobQueueRequest) obj;
        if (other.getJobQueue() == null ^ this.getJobQueue() == null)
            return false;
        if (other.getJobQueue() != null && other.getJobQueue().equals(this.getJobQueue()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getJobQueue() == null) ? 0 : getJobQueue().hashCode());
        return hashCode;
    }

    @Override
    public DeleteJobQueueRequest clone() {
        return (DeleteJobQueueRequest) super.clone();
    }

}
