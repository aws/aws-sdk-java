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
package com.amazonaws.services.panorama.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/panorama-2019-07-24/CreatePackageImportJob" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreatePackageImportJobRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A client token for the package import job.
     * </p>
     */
    private String clientToken;
    /**
     * <p>
     * An input config for the package import job.
     * </p>
     */
    private PackageImportJobInputConfig inputConfig;
    /**
     * <p>
     * Tags for the package import job.
     * </p>
     */
    private java.util.List<JobResourceTags> jobTags;
    /**
     * <p>
     * A job type for the package import job.
     * </p>
     */
    private String jobType;
    /**
     * <p>
     * An output config for the package import job.
     * </p>
     */
    private PackageImportJobOutputConfig outputConfig;

    /**
     * <p>
     * A client token for the package import job.
     * </p>
     * 
     * @param clientToken
     *        A client token for the package import job.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * A client token for the package import job.
     * </p>
     * 
     * @return A client token for the package import job.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * A client token for the package import job.
     * </p>
     * 
     * @param clientToken
     *        A client token for the package import job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreatePackageImportJobRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
        return this;
    }

    /**
     * <p>
     * An input config for the package import job.
     * </p>
     * 
     * @param inputConfig
     *        An input config for the package import job.
     */

    public void setInputConfig(PackageImportJobInputConfig inputConfig) {
        this.inputConfig = inputConfig;
    }

    /**
     * <p>
     * An input config for the package import job.
     * </p>
     * 
     * @return An input config for the package import job.
     */

    public PackageImportJobInputConfig getInputConfig() {
        return this.inputConfig;
    }

    /**
     * <p>
     * An input config for the package import job.
     * </p>
     * 
     * @param inputConfig
     *        An input config for the package import job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreatePackageImportJobRequest withInputConfig(PackageImportJobInputConfig inputConfig) {
        setInputConfig(inputConfig);
        return this;
    }

    /**
     * <p>
     * Tags for the package import job.
     * </p>
     * 
     * @return Tags for the package import job.
     */

    public java.util.List<JobResourceTags> getJobTags() {
        return jobTags;
    }

    /**
     * <p>
     * Tags for the package import job.
     * </p>
     * 
     * @param jobTags
     *        Tags for the package import job.
     */

    public void setJobTags(java.util.Collection<JobResourceTags> jobTags) {
        if (jobTags == null) {
            this.jobTags = null;
            return;
        }

        this.jobTags = new java.util.ArrayList<JobResourceTags>(jobTags);
    }

    /**
     * <p>
     * Tags for the package import job.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setJobTags(java.util.Collection)} or {@link #withJobTags(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param jobTags
     *        Tags for the package import job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreatePackageImportJobRequest withJobTags(JobResourceTags... jobTags) {
        if (this.jobTags == null) {
            setJobTags(new java.util.ArrayList<JobResourceTags>(jobTags.length));
        }
        for (JobResourceTags ele : jobTags) {
            this.jobTags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Tags for the package import job.
     * </p>
     * 
     * @param jobTags
     *        Tags for the package import job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreatePackageImportJobRequest withJobTags(java.util.Collection<JobResourceTags> jobTags) {
        setJobTags(jobTags);
        return this;
    }

    /**
     * <p>
     * A job type for the package import job.
     * </p>
     * 
     * @param jobType
     *        A job type for the package import job.
     * @see PackageImportJobType
     */

    public void setJobType(String jobType) {
        this.jobType = jobType;
    }

    /**
     * <p>
     * A job type for the package import job.
     * </p>
     * 
     * @return A job type for the package import job.
     * @see PackageImportJobType
     */

    public String getJobType() {
        return this.jobType;
    }

    /**
     * <p>
     * A job type for the package import job.
     * </p>
     * 
     * @param jobType
     *        A job type for the package import job.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PackageImportJobType
     */

    public CreatePackageImportJobRequest withJobType(String jobType) {
        setJobType(jobType);
        return this;
    }

    /**
     * <p>
     * A job type for the package import job.
     * </p>
     * 
     * @param jobType
     *        A job type for the package import job.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PackageImportJobType
     */

    public CreatePackageImportJobRequest withJobType(PackageImportJobType jobType) {
        this.jobType = jobType.toString();
        return this;
    }

    /**
     * <p>
     * An output config for the package import job.
     * </p>
     * 
     * @param outputConfig
     *        An output config for the package import job.
     */

    public void setOutputConfig(PackageImportJobOutputConfig outputConfig) {
        this.outputConfig = outputConfig;
    }

    /**
     * <p>
     * An output config for the package import job.
     * </p>
     * 
     * @return An output config for the package import job.
     */

    public PackageImportJobOutputConfig getOutputConfig() {
        return this.outputConfig;
    }

    /**
     * <p>
     * An output config for the package import job.
     * </p>
     * 
     * @param outputConfig
     *        An output config for the package import job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreatePackageImportJobRequest withOutputConfig(PackageImportJobOutputConfig outputConfig) {
        setOutputConfig(outputConfig);
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
        if (getClientToken() != null)
            sb.append("ClientToken: ").append(getClientToken()).append(",");
        if (getInputConfig() != null)
            sb.append("InputConfig: ").append(getInputConfig()).append(",");
        if (getJobTags() != null)
            sb.append("JobTags: ").append(getJobTags()).append(",");
        if (getJobType() != null)
            sb.append("JobType: ").append(getJobType()).append(",");
        if (getOutputConfig() != null)
            sb.append("OutputConfig: ").append(getOutputConfig());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreatePackageImportJobRequest == false)
            return false;
        CreatePackageImportJobRequest other = (CreatePackageImportJobRequest) obj;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        if (other.getInputConfig() == null ^ this.getInputConfig() == null)
            return false;
        if (other.getInputConfig() != null && other.getInputConfig().equals(this.getInputConfig()) == false)
            return false;
        if (other.getJobTags() == null ^ this.getJobTags() == null)
            return false;
        if (other.getJobTags() != null && other.getJobTags().equals(this.getJobTags()) == false)
            return false;
        if (other.getJobType() == null ^ this.getJobType() == null)
            return false;
        if (other.getJobType() != null && other.getJobType().equals(this.getJobType()) == false)
            return false;
        if (other.getOutputConfig() == null ^ this.getOutputConfig() == null)
            return false;
        if (other.getOutputConfig() != null && other.getOutputConfig().equals(this.getOutputConfig()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        hashCode = prime * hashCode + ((getInputConfig() == null) ? 0 : getInputConfig().hashCode());
        hashCode = prime * hashCode + ((getJobTags() == null) ? 0 : getJobTags().hashCode());
        hashCode = prime * hashCode + ((getJobType() == null) ? 0 : getJobType().hashCode());
        hashCode = prime * hashCode + ((getOutputConfig() == null) ? 0 : getOutputConfig().hashCode());
        return hashCode;
    }

    @Override
    public CreatePackageImportJobRequest clone() {
        return (CreatePackageImportJobRequest) super.clone();
    }

}
