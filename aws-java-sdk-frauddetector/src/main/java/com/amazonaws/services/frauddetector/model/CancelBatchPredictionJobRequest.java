/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.frauddetector.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/frauddetector-2019-11-15/CancelBatchPredictionJob"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CancelBatchPredictionJobRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the batch prediction job to cancel.
     * </p>
     */
    private String jobId;

    /**
     * <p>
     * The ID of the batch prediction job to cancel.
     * </p>
     * 
     * @param jobId
     *        The ID of the batch prediction job to cancel.
     */

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    /**
     * <p>
     * The ID of the batch prediction job to cancel.
     * </p>
     * 
     * @return The ID of the batch prediction job to cancel.
     */

    public String getJobId() {
        return this.jobId;
    }

    /**
     * <p>
     * The ID of the batch prediction job to cancel.
     * </p>
     * 
     * @param jobId
     *        The ID of the batch prediction job to cancel.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CancelBatchPredictionJobRequest withJobId(String jobId) {
        setJobId(jobId);
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
            sb.append("JobId: ").append(getJobId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CancelBatchPredictionJobRequest == false)
            return false;
        CancelBatchPredictionJobRequest other = (CancelBatchPredictionJobRequest) obj;
        if (other.getJobId() == null ^ this.getJobId() == null)
            return false;
        if (other.getJobId() != null && other.getJobId().equals(this.getJobId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getJobId() == null) ? 0 : getJobId().hashCode());
        return hashCode;
    }

    @Override
    public CancelBatchPredictionJobRequest clone() {
        return (CancelBatchPredictionJobRequest) super.clone();
    }

}
