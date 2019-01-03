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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Specifies the maximum number of training jobs and parallel training jobs that a hyperparameter tuning job can launch.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/ResourceLimits" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ResourceLimits implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The maximum number of training jobs that a hyperparameter tuning job can launch.
     * </p>
     */
    private Integer maxNumberOfTrainingJobs;
    /**
     * <p>
     * The maximum number of concurrent training jobs that a hyperparameter tuning job can launch.
     * </p>
     */
    private Integer maxParallelTrainingJobs;

    /**
     * <p>
     * The maximum number of training jobs that a hyperparameter tuning job can launch.
     * </p>
     * 
     * @param maxNumberOfTrainingJobs
     *        The maximum number of training jobs that a hyperparameter tuning job can launch.
     */

    public void setMaxNumberOfTrainingJobs(Integer maxNumberOfTrainingJobs) {
        this.maxNumberOfTrainingJobs = maxNumberOfTrainingJobs;
    }

    /**
     * <p>
     * The maximum number of training jobs that a hyperparameter tuning job can launch.
     * </p>
     * 
     * @return The maximum number of training jobs that a hyperparameter tuning job can launch.
     */

    public Integer getMaxNumberOfTrainingJobs() {
        return this.maxNumberOfTrainingJobs;
    }

    /**
     * <p>
     * The maximum number of training jobs that a hyperparameter tuning job can launch.
     * </p>
     * 
     * @param maxNumberOfTrainingJobs
     *        The maximum number of training jobs that a hyperparameter tuning job can launch.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceLimits withMaxNumberOfTrainingJobs(Integer maxNumberOfTrainingJobs) {
        setMaxNumberOfTrainingJobs(maxNumberOfTrainingJobs);
        return this;
    }

    /**
     * <p>
     * The maximum number of concurrent training jobs that a hyperparameter tuning job can launch.
     * </p>
     * 
     * @param maxParallelTrainingJobs
     *        The maximum number of concurrent training jobs that a hyperparameter tuning job can launch.
     */

    public void setMaxParallelTrainingJobs(Integer maxParallelTrainingJobs) {
        this.maxParallelTrainingJobs = maxParallelTrainingJobs;
    }

    /**
     * <p>
     * The maximum number of concurrent training jobs that a hyperparameter tuning job can launch.
     * </p>
     * 
     * @return The maximum number of concurrent training jobs that a hyperparameter tuning job can launch.
     */

    public Integer getMaxParallelTrainingJobs() {
        return this.maxParallelTrainingJobs;
    }

    /**
     * <p>
     * The maximum number of concurrent training jobs that a hyperparameter tuning job can launch.
     * </p>
     * 
     * @param maxParallelTrainingJobs
     *        The maximum number of concurrent training jobs that a hyperparameter tuning job can launch.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceLimits withMaxParallelTrainingJobs(Integer maxParallelTrainingJobs) {
        setMaxParallelTrainingJobs(maxParallelTrainingJobs);
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
        if (getMaxNumberOfTrainingJobs() != null)
            sb.append("MaxNumberOfTrainingJobs: ").append(getMaxNumberOfTrainingJobs()).append(",");
        if (getMaxParallelTrainingJobs() != null)
            sb.append("MaxParallelTrainingJobs: ").append(getMaxParallelTrainingJobs());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ResourceLimits == false)
            return false;
        ResourceLimits other = (ResourceLimits) obj;
        if (other.getMaxNumberOfTrainingJobs() == null ^ this.getMaxNumberOfTrainingJobs() == null)
            return false;
        if (other.getMaxNumberOfTrainingJobs() != null && other.getMaxNumberOfTrainingJobs().equals(this.getMaxNumberOfTrainingJobs()) == false)
            return false;
        if (other.getMaxParallelTrainingJobs() == null ^ this.getMaxParallelTrainingJobs() == null)
            return false;
        if (other.getMaxParallelTrainingJobs() != null && other.getMaxParallelTrainingJobs().equals(this.getMaxParallelTrainingJobs()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMaxNumberOfTrainingJobs() == null) ? 0 : getMaxNumberOfTrainingJobs().hashCode());
        hashCode = prime * hashCode + ((getMaxParallelTrainingJobs() == null) ? 0 : getMaxParallelTrainingJobs().hashCode());
        return hashCode;
    }

    @Override
    public ResourceLimits clone() {
        try {
            return (ResourceLimits) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.ResourceLimitsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
