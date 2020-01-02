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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * How long a job is allowed to run, or how many candidates a job is allowed to generate.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/AutoMLJobCompletionCriteria"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AutoMLJobCompletionCriteria implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The maximum number of times a training job is allowed to run.
     * </p>
     */
    private Integer maxCandidates;
    /**
     * <p>
     * The maximum time, in seconds, a job is allowed to run.
     * </p>
     */
    private Integer maxRuntimePerTrainingJobInSeconds;
    /**
     * <p>
     * The maximum time, in seconds, an AutoML job is allowed to wait for a trial to complete. It must be equal to or
     * greater than MaxRuntimePerTrainingJobInSeconds.
     * </p>
     */
    private Integer maxAutoMLJobRuntimeInSeconds;

    /**
     * <p>
     * The maximum number of times a training job is allowed to run.
     * </p>
     * 
     * @param maxCandidates
     *        The maximum number of times a training job is allowed to run.
     */

    public void setMaxCandidates(Integer maxCandidates) {
        this.maxCandidates = maxCandidates;
    }

    /**
     * <p>
     * The maximum number of times a training job is allowed to run.
     * </p>
     * 
     * @return The maximum number of times a training job is allowed to run.
     */

    public Integer getMaxCandidates() {
        return this.maxCandidates;
    }

    /**
     * <p>
     * The maximum number of times a training job is allowed to run.
     * </p>
     * 
     * @param maxCandidates
     *        The maximum number of times a training job is allowed to run.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutoMLJobCompletionCriteria withMaxCandidates(Integer maxCandidates) {
        setMaxCandidates(maxCandidates);
        return this;
    }

    /**
     * <p>
     * The maximum time, in seconds, a job is allowed to run.
     * </p>
     * 
     * @param maxRuntimePerTrainingJobInSeconds
     *        The maximum time, in seconds, a job is allowed to run.
     */

    public void setMaxRuntimePerTrainingJobInSeconds(Integer maxRuntimePerTrainingJobInSeconds) {
        this.maxRuntimePerTrainingJobInSeconds = maxRuntimePerTrainingJobInSeconds;
    }

    /**
     * <p>
     * The maximum time, in seconds, a job is allowed to run.
     * </p>
     * 
     * @return The maximum time, in seconds, a job is allowed to run.
     */

    public Integer getMaxRuntimePerTrainingJobInSeconds() {
        return this.maxRuntimePerTrainingJobInSeconds;
    }

    /**
     * <p>
     * The maximum time, in seconds, a job is allowed to run.
     * </p>
     * 
     * @param maxRuntimePerTrainingJobInSeconds
     *        The maximum time, in seconds, a job is allowed to run.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutoMLJobCompletionCriteria withMaxRuntimePerTrainingJobInSeconds(Integer maxRuntimePerTrainingJobInSeconds) {
        setMaxRuntimePerTrainingJobInSeconds(maxRuntimePerTrainingJobInSeconds);
        return this;
    }

    /**
     * <p>
     * The maximum time, in seconds, an AutoML job is allowed to wait for a trial to complete. It must be equal to or
     * greater than MaxRuntimePerTrainingJobInSeconds.
     * </p>
     * 
     * @param maxAutoMLJobRuntimeInSeconds
     *        The maximum time, in seconds, an AutoML job is allowed to wait for a trial to complete. It must be equal
     *        to or greater than MaxRuntimePerTrainingJobInSeconds.
     */

    public void setMaxAutoMLJobRuntimeInSeconds(Integer maxAutoMLJobRuntimeInSeconds) {
        this.maxAutoMLJobRuntimeInSeconds = maxAutoMLJobRuntimeInSeconds;
    }

    /**
     * <p>
     * The maximum time, in seconds, an AutoML job is allowed to wait for a trial to complete. It must be equal to or
     * greater than MaxRuntimePerTrainingJobInSeconds.
     * </p>
     * 
     * @return The maximum time, in seconds, an AutoML job is allowed to wait for a trial to complete. It must be equal
     *         to or greater than MaxRuntimePerTrainingJobInSeconds.
     */

    public Integer getMaxAutoMLJobRuntimeInSeconds() {
        return this.maxAutoMLJobRuntimeInSeconds;
    }

    /**
     * <p>
     * The maximum time, in seconds, an AutoML job is allowed to wait for a trial to complete. It must be equal to or
     * greater than MaxRuntimePerTrainingJobInSeconds.
     * </p>
     * 
     * @param maxAutoMLJobRuntimeInSeconds
     *        The maximum time, in seconds, an AutoML job is allowed to wait for a trial to complete. It must be equal
     *        to or greater than MaxRuntimePerTrainingJobInSeconds.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutoMLJobCompletionCriteria withMaxAutoMLJobRuntimeInSeconds(Integer maxAutoMLJobRuntimeInSeconds) {
        setMaxAutoMLJobRuntimeInSeconds(maxAutoMLJobRuntimeInSeconds);
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
        if (getMaxCandidates() != null)
            sb.append("MaxCandidates: ").append(getMaxCandidates()).append(",");
        if (getMaxRuntimePerTrainingJobInSeconds() != null)
            sb.append("MaxRuntimePerTrainingJobInSeconds: ").append(getMaxRuntimePerTrainingJobInSeconds()).append(",");
        if (getMaxAutoMLJobRuntimeInSeconds() != null)
            sb.append("MaxAutoMLJobRuntimeInSeconds: ").append(getMaxAutoMLJobRuntimeInSeconds());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AutoMLJobCompletionCriteria == false)
            return false;
        AutoMLJobCompletionCriteria other = (AutoMLJobCompletionCriteria) obj;
        if (other.getMaxCandidates() == null ^ this.getMaxCandidates() == null)
            return false;
        if (other.getMaxCandidates() != null && other.getMaxCandidates().equals(this.getMaxCandidates()) == false)
            return false;
        if (other.getMaxRuntimePerTrainingJobInSeconds() == null ^ this.getMaxRuntimePerTrainingJobInSeconds() == null)
            return false;
        if (other.getMaxRuntimePerTrainingJobInSeconds() != null
                && other.getMaxRuntimePerTrainingJobInSeconds().equals(this.getMaxRuntimePerTrainingJobInSeconds()) == false)
            return false;
        if (other.getMaxAutoMLJobRuntimeInSeconds() == null ^ this.getMaxAutoMLJobRuntimeInSeconds() == null)
            return false;
        if (other.getMaxAutoMLJobRuntimeInSeconds() != null && other.getMaxAutoMLJobRuntimeInSeconds().equals(this.getMaxAutoMLJobRuntimeInSeconds()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMaxCandidates() == null) ? 0 : getMaxCandidates().hashCode());
        hashCode = prime * hashCode + ((getMaxRuntimePerTrainingJobInSeconds() == null) ? 0 : getMaxRuntimePerTrainingJobInSeconds().hashCode());
        hashCode = prime * hashCode + ((getMaxAutoMLJobRuntimeInSeconds() == null) ? 0 : getMaxAutoMLJobRuntimeInSeconds().hashCode());
        return hashCode;
    }

    @Override
    public AutoMLJobCompletionCriteria clone() {
        try {
            return (AutoMLJobCompletionCriteria) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.AutoMLJobCompletionCriteriaMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
