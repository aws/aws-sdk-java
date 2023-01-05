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
package com.amazonaws.services.emrcontainers.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The values of StartJobRun API requests used in job runs started using the job template.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/emr-containers-2020-10-01/JobTemplateData" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class JobTemplateData implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The execution role ARN of the job run.
     * </p>
     */
    private String executionRoleArn;
    /**
     * <p>
     * The release version of Amazon EMR.
     * </p>
     */
    private String releaseLabel;
    /**
     * <p>
     * The configuration settings that are used to override defaults configuration.
     * </p>
     */
    private ParametricConfigurationOverrides configurationOverrides;

    private JobDriver jobDriver;
    /**
     * <p>
     * The configuration of parameters existing in the job template.
     * </p>
     */
    private java.util.Map<String, TemplateParameterConfiguration> parameterConfiguration;
    /**
     * <p>
     * The tags assigned to jobs started using the job template.
     * </p>
     */
    private java.util.Map<String, String> jobTags;

    /**
     * <p>
     * The execution role ARN of the job run.
     * </p>
     * 
     * @param executionRoleArn
     *        The execution role ARN of the job run.
     */

    public void setExecutionRoleArn(String executionRoleArn) {
        this.executionRoleArn = executionRoleArn;
    }

    /**
     * <p>
     * The execution role ARN of the job run.
     * </p>
     * 
     * @return The execution role ARN of the job run.
     */

    public String getExecutionRoleArn() {
        return this.executionRoleArn;
    }

    /**
     * <p>
     * The execution role ARN of the job run.
     * </p>
     * 
     * @param executionRoleArn
     *        The execution role ARN of the job run.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobTemplateData withExecutionRoleArn(String executionRoleArn) {
        setExecutionRoleArn(executionRoleArn);
        return this;
    }

    /**
     * <p>
     * The release version of Amazon EMR.
     * </p>
     * 
     * @param releaseLabel
     *        The release version of Amazon EMR.
     */

    public void setReleaseLabel(String releaseLabel) {
        this.releaseLabel = releaseLabel;
    }

    /**
     * <p>
     * The release version of Amazon EMR.
     * </p>
     * 
     * @return The release version of Amazon EMR.
     */

    public String getReleaseLabel() {
        return this.releaseLabel;
    }

    /**
     * <p>
     * The release version of Amazon EMR.
     * </p>
     * 
     * @param releaseLabel
     *        The release version of Amazon EMR.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobTemplateData withReleaseLabel(String releaseLabel) {
        setReleaseLabel(releaseLabel);
        return this;
    }

    /**
     * <p>
     * The configuration settings that are used to override defaults configuration.
     * </p>
     * 
     * @param configurationOverrides
     *        The configuration settings that are used to override defaults configuration.
     */

    public void setConfigurationOverrides(ParametricConfigurationOverrides configurationOverrides) {
        this.configurationOverrides = configurationOverrides;
    }

    /**
     * <p>
     * The configuration settings that are used to override defaults configuration.
     * </p>
     * 
     * @return The configuration settings that are used to override defaults configuration.
     */

    public ParametricConfigurationOverrides getConfigurationOverrides() {
        return this.configurationOverrides;
    }

    /**
     * <p>
     * The configuration settings that are used to override defaults configuration.
     * </p>
     * 
     * @param configurationOverrides
     *        The configuration settings that are used to override defaults configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobTemplateData withConfigurationOverrides(ParametricConfigurationOverrides configurationOverrides) {
        setConfigurationOverrides(configurationOverrides);
        return this;
    }

    /**
     * @param jobDriver
     */

    public void setJobDriver(JobDriver jobDriver) {
        this.jobDriver = jobDriver;
    }

    /**
     * @return
     */

    public JobDriver getJobDriver() {
        return this.jobDriver;
    }

    /**
     * @param jobDriver
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobTemplateData withJobDriver(JobDriver jobDriver) {
        setJobDriver(jobDriver);
        return this;
    }

    /**
     * <p>
     * The configuration of parameters existing in the job template.
     * </p>
     * 
     * @return The configuration of parameters existing in the job template.
     */

    public java.util.Map<String, TemplateParameterConfiguration> getParameterConfiguration() {
        return parameterConfiguration;
    }

    /**
     * <p>
     * The configuration of parameters existing in the job template.
     * </p>
     * 
     * @param parameterConfiguration
     *        The configuration of parameters existing in the job template.
     */

    public void setParameterConfiguration(java.util.Map<String, TemplateParameterConfiguration> parameterConfiguration) {
        this.parameterConfiguration = parameterConfiguration;
    }

    /**
     * <p>
     * The configuration of parameters existing in the job template.
     * </p>
     * 
     * @param parameterConfiguration
     *        The configuration of parameters existing in the job template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobTemplateData withParameterConfiguration(java.util.Map<String, TemplateParameterConfiguration> parameterConfiguration) {
        setParameterConfiguration(parameterConfiguration);
        return this;
    }

    /**
     * Add a single ParameterConfiguration entry
     *
     * @see JobTemplateData#withParameterConfiguration
     * @returns a reference to this object so that method calls can be chained together.
     */

    public JobTemplateData addParameterConfigurationEntry(String key, TemplateParameterConfiguration value) {
        if (null == this.parameterConfiguration) {
            this.parameterConfiguration = new java.util.HashMap<String, TemplateParameterConfiguration>();
        }
        if (this.parameterConfiguration.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.parameterConfiguration.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into ParameterConfiguration.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobTemplateData clearParameterConfigurationEntries() {
        this.parameterConfiguration = null;
        return this;
    }

    /**
     * <p>
     * The tags assigned to jobs started using the job template.
     * </p>
     * 
     * @return The tags assigned to jobs started using the job template.
     */

    public java.util.Map<String, String> getJobTags() {
        return jobTags;
    }

    /**
     * <p>
     * The tags assigned to jobs started using the job template.
     * </p>
     * 
     * @param jobTags
     *        The tags assigned to jobs started using the job template.
     */

    public void setJobTags(java.util.Map<String, String> jobTags) {
        this.jobTags = jobTags;
    }

    /**
     * <p>
     * The tags assigned to jobs started using the job template.
     * </p>
     * 
     * @param jobTags
     *        The tags assigned to jobs started using the job template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobTemplateData withJobTags(java.util.Map<String, String> jobTags) {
        setJobTags(jobTags);
        return this;
    }

    /**
     * Add a single JobTags entry
     *
     * @see JobTemplateData#withJobTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public JobTemplateData addJobTagsEntry(String key, String value) {
        if (null == this.jobTags) {
            this.jobTags = new java.util.HashMap<String, String>();
        }
        if (this.jobTags.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.jobTags.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into JobTags.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobTemplateData clearJobTagsEntries() {
        this.jobTags = null;
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
        if (getExecutionRoleArn() != null)
            sb.append("ExecutionRoleArn: ").append(getExecutionRoleArn()).append(",");
        if (getReleaseLabel() != null)
            sb.append("ReleaseLabel: ").append(getReleaseLabel()).append(",");
        if (getConfigurationOverrides() != null)
            sb.append("ConfigurationOverrides: ").append(getConfigurationOverrides()).append(",");
        if (getJobDriver() != null)
            sb.append("JobDriver: ").append(getJobDriver()).append(",");
        if (getParameterConfiguration() != null)
            sb.append("ParameterConfiguration: ").append(getParameterConfiguration()).append(",");
        if (getJobTags() != null)
            sb.append("JobTags: ").append(getJobTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof JobTemplateData == false)
            return false;
        JobTemplateData other = (JobTemplateData) obj;
        if (other.getExecutionRoleArn() == null ^ this.getExecutionRoleArn() == null)
            return false;
        if (other.getExecutionRoleArn() != null && other.getExecutionRoleArn().equals(this.getExecutionRoleArn()) == false)
            return false;
        if (other.getReleaseLabel() == null ^ this.getReleaseLabel() == null)
            return false;
        if (other.getReleaseLabel() != null && other.getReleaseLabel().equals(this.getReleaseLabel()) == false)
            return false;
        if (other.getConfigurationOverrides() == null ^ this.getConfigurationOverrides() == null)
            return false;
        if (other.getConfigurationOverrides() != null && other.getConfigurationOverrides().equals(this.getConfigurationOverrides()) == false)
            return false;
        if (other.getJobDriver() == null ^ this.getJobDriver() == null)
            return false;
        if (other.getJobDriver() != null && other.getJobDriver().equals(this.getJobDriver()) == false)
            return false;
        if (other.getParameterConfiguration() == null ^ this.getParameterConfiguration() == null)
            return false;
        if (other.getParameterConfiguration() != null && other.getParameterConfiguration().equals(this.getParameterConfiguration()) == false)
            return false;
        if (other.getJobTags() == null ^ this.getJobTags() == null)
            return false;
        if (other.getJobTags() != null && other.getJobTags().equals(this.getJobTags()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getExecutionRoleArn() == null) ? 0 : getExecutionRoleArn().hashCode());
        hashCode = prime * hashCode + ((getReleaseLabel() == null) ? 0 : getReleaseLabel().hashCode());
        hashCode = prime * hashCode + ((getConfigurationOverrides() == null) ? 0 : getConfigurationOverrides().hashCode());
        hashCode = prime * hashCode + ((getJobDriver() == null) ? 0 : getJobDriver().hashCode());
        hashCode = prime * hashCode + ((getParameterConfiguration() == null) ? 0 : getParameterConfiguration().hashCode());
        hashCode = prime * hashCode + ((getJobTags() == null) ? 0 : getJobTags().hashCode());
        return hashCode;
    }

    @Override
    public JobTemplateData clone() {
        try {
            return (JobTemplateData) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.emrcontainers.model.transform.JobTemplateDataMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
