/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/UpdateTrainingJob" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateTrainingJobRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of a training job to update the Debugger profiling configuration.
     * </p>
     */
    private String trainingJobName;
    /**
     * <p>
     * Configuration information for Amazon SageMaker Debugger system monitoring, framework profiling, and storage
     * paths.
     * </p>
     */
    private ProfilerConfigForUpdate profilerConfig;
    /**
     * <p>
     * Configuration information for Amazon SageMaker Debugger rules for profiling system and framework metrics.
     * </p>
     */
    private java.util.List<ProfilerRuleConfiguration> profilerRuleConfigurations;
    /**
     * <p>
     * The training job <code>ResourceConfig</code> to update warm pool retention length.
     * </p>
     */
    private ResourceConfigForUpdate resourceConfig;

    /**
     * <p>
     * The name of a training job to update the Debugger profiling configuration.
     * </p>
     * 
     * @param trainingJobName
     *        The name of a training job to update the Debugger profiling configuration.
     */

    public void setTrainingJobName(String trainingJobName) {
        this.trainingJobName = trainingJobName;
    }

    /**
     * <p>
     * The name of a training job to update the Debugger profiling configuration.
     * </p>
     * 
     * @return The name of a training job to update the Debugger profiling configuration.
     */

    public String getTrainingJobName() {
        return this.trainingJobName;
    }

    /**
     * <p>
     * The name of a training job to update the Debugger profiling configuration.
     * </p>
     * 
     * @param trainingJobName
     *        The name of a training job to update the Debugger profiling configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateTrainingJobRequest withTrainingJobName(String trainingJobName) {
        setTrainingJobName(trainingJobName);
        return this;
    }

    /**
     * <p>
     * Configuration information for Amazon SageMaker Debugger system monitoring, framework profiling, and storage
     * paths.
     * </p>
     * 
     * @param profilerConfig
     *        Configuration information for Amazon SageMaker Debugger system monitoring, framework profiling, and
     *        storage paths.
     */

    public void setProfilerConfig(ProfilerConfigForUpdate profilerConfig) {
        this.profilerConfig = profilerConfig;
    }

    /**
     * <p>
     * Configuration information for Amazon SageMaker Debugger system monitoring, framework profiling, and storage
     * paths.
     * </p>
     * 
     * @return Configuration information for Amazon SageMaker Debugger system monitoring, framework profiling, and
     *         storage paths.
     */

    public ProfilerConfigForUpdate getProfilerConfig() {
        return this.profilerConfig;
    }

    /**
     * <p>
     * Configuration information for Amazon SageMaker Debugger system monitoring, framework profiling, and storage
     * paths.
     * </p>
     * 
     * @param profilerConfig
     *        Configuration information for Amazon SageMaker Debugger system monitoring, framework profiling, and
     *        storage paths.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateTrainingJobRequest withProfilerConfig(ProfilerConfigForUpdate profilerConfig) {
        setProfilerConfig(profilerConfig);
        return this;
    }

    /**
     * <p>
     * Configuration information for Amazon SageMaker Debugger rules for profiling system and framework metrics.
     * </p>
     * 
     * @return Configuration information for Amazon SageMaker Debugger rules for profiling system and framework metrics.
     */

    public java.util.List<ProfilerRuleConfiguration> getProfilerRuleConfigurations() {
        return profilerRuleConfigurations;
    }

    /**
     * <p>
     * Configuration information for Amazon SageMaker Debugger rules for profiling system and framework metrics.
     * </p>
     * 
     * @param profilerRuleConfigurations
     *        Configuration information for Amazon SageMaker Debugger rules for profiling system and framework metrics.
     */

    public void setProfilerRuleConfigurations(java.util.Collection<ProfilerRuleConfiguration> profilerRuleConfigurations) {
        if (profilerRuleConfigurations == null) {
            this.profilerRuleConfigurations = null;
            return;
        }

        this.profilerRuleConfigurations = new java.util.ArrayList<ProfilerRuleConfiguration>(profilerRuleConfigurations);
    }

    /**
     * <p>
     * Configuration information for Amazon SageMaker Debugger rules for profiling system and framework metrics.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setProfilerRuleConfigurations(java.util.Collection)} or
     * {@link #withProfilerRuleConfigurations(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param profilerRuleConfigurations
     *        Configuration information for Amazon SageMaker Debugger rules for profiling system and framework metrics.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateTrainingJobRequest withProfilerRuleConfigurations(ProfilerRuleConfiguration... profilerRuleConfigurations) {
        if (this.profilerRuleConfigurations == null) {
            setProfilerRuleConfigurations(new java.util.ArrayList<ProfilerRuleConfiguration>(profilerRuleConfigurations.length));
        }
        for (ProfilerRuleConfiguration ele : profilerRuleConfigurations) {
            this.profilerRuleConfigurations.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Configuration information for Amazon SageMaker Debugger rules for profiling system and framework metrics.
     * </p>
     * 
     * @param profilerRuleConfigurations
     *        Configuration information for Amazon SageMaker Debugger rules for profiling system and framework metrics.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateTrainingJobRequest withProfilerRuleConfigurations(java.util.Collection<ProfilerRuleConfiguration> profilerRuleConfigurations) {
        setProfilerRuleConfigurations(profilerRuleConfigurations);
        return this;
    }

    /**
     * <p>
     * The training job <code>ResourceConfig</code> to update warm pool retention length.
     * </p>
     * 
     * @param resourceConfig
     *        The training job <code>ResourceConfig</code> to update warm pool retention length.
     */

    public void setResourceConfig(ResourceConfigForUpdate resourceConfig) {
        this.resourceConfig = resourceConfig;
    }

    /**
     * <p>
     * The training job <code>ResourceConfig</code> to update warm pool retention length.
     * </p>
     * 
     * @return The training job <code>ResourceConfig</code> to update warm pool retention length.
     */

    public ResourceConfigForUpdate getResourceConfig() {
        return this.resourceConfig;
    }

    /**
     * <p>
     * The training job <code>ResourceConfig</code> to update warm pool retention length.
     * </p>
     * 
     * @param resourceConfig
     *        The training job <code>ResourceConfig</code> to update warm pool retention length.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateTrainingJobRequest withResourceConfig(ResourceConfigForUpdate resourceConfig) {
        setResourceConfig(resourceConfig);
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
        if (getTrainingJobName() != null)
            sb.append("TrainingJobName: ").append(getTrainingJobName()).append(",");
        if (getProfilerConfig() != null)
            sb.append("ProfilerConfig: ").append(getProfilerConfig()).append(",");
        if (getProfilerRuleConfigurations() != null)
            sb.append("ProfilerRuleConfigurations: ").append(getProfilerRuleConfigurations()).append(",");
        if (getResourceConfig() != null)
            sb.append("ResourceConfig: ").append(getResourceConfig());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateTrainingJobRequest == false)
            return false;
        UpdateTrainingJobRequest other = (UpdateTrainingJobRequest) obj;
        if (other.getTrainingJobName() == null ^ this.getTrainingJobName() == null)
            return false;
        if (other.getTrainingJobName() != null && other.getTrainingJobName().equals(this.getTrainingJobName()) == false)
            return false;
        if (other.getProfilerConfig() == null ^ this.getProfilerConfig() == null)
            return false;
        if (other.getProfilerConfig() != null && other.getProfilerConfig().equals(this.getProfilerConfig()) == false)
            return false;
        if (other.getProfilerRuleConfigurations() == null ^ this.getProfilerRuleConfigurations() == null)
            return false;
        if (other.getProfilerRuleConfigurations() != null && other.getProfilerRuleConfigurations().equals(this.getProfilerRuleConfigurations()) == false)
            return false;
        if (other.getResourceConfig() == null ^ this.getResourceConfig() == null)
            return false;
        if (other.getResourceConfig() != null && other.getResourceConfig().equals(this.getResourceConfig()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTrainingJobName() == null) ? 0 : getTrainingJobName().hashCode());
        hashCode = prime * hashCode + ((getProfilerConfig() == null) ? 0 : getProfilerConfig().hashCode());
        hashCode = prime * hashCode + ((getProfilerRuleConfigurations() == null) ? 0 : getProfilerRuleConfigurations().hashCode());
        hashCode = prime * hashCode + ((getResourceConfig() == null) ? 0 : getResourceConfig().hashCode());
        return hashCode;
    }

    @Override
    public UpdateTrainingJobRequest clone() {
        return (UpdateTrainingJobRequest) super.clone();
    }

}
