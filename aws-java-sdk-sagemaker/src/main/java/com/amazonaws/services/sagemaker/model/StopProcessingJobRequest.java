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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/StopProcessingJob" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StopProcessingJobRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the processing job to stop.
     * </p>
     */
    private String processingJobName;

    /**
     * <p>
     * The name of the processing job to stop.
     * </p>
     * 
     * @param processingJobName
     *        The name of the processing job to stop.
     */

    public void setProcessingJobName(String processingJobName) {
        this.processingJobName = processingJobName;
    }

    /**
     * <p>
     * The name of the processing job to stop.
     * </p>
     * 
     * @return The name of the processing job to stop.
     */

    public String getProcessingJobName() {
        return this.processingJobName;
    }

    /**
     * <p>
     * The name of the processing job to stop.
     * </p>
     * 
     * @param processingJobName
     *        The name of the processing job to stop.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StopProcessingJobRequest withProcessingJobName(String processingJobName) {
        setProcessingJobName(processingJobName);
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
        if (getProcessingJobName() != null)
            sb.append("ProcessingJobName: ").append(getProcessingJobName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StopProcessingJobRequest == false)
            return false;
        StopProcessingJobRequest other = (StopProcessingJobRequest) obj;
        if (other.getProcessingJobName() == null ^ this.getProcessingJobName() == null)
            return false;
        if (other.getProcessingJobName() != null && other.getProcessingJobName().equals(this.getProcessingJobName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getProcessingJobName() == null) ? 0 : getProcessingJobName().hashCode());
        return hashCode;
    }

    @Override
    public StopProcessingJobRequest clone() {
        return (StopProcessingJobRequest) super.clone();
    }

}
