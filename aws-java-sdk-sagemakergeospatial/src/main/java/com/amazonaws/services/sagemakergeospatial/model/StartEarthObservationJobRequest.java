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
package com.amazonaws.services.sagemakergeospatial.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-geospatial-2020-05-27/StartEarthObservationJob"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StartEarthObservationJobRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A unique token that guarantees that the call to this API is idempotent.
     * </p>
     */
    private String clientToken;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role that you specified for the job.
     * </p>
     */
    private String executionRoleArn;
    /**
     * <p>
     * Input configuration information for the Earth Observation job.
     * </p>
     */
    private InputConfigInput inputConfig;
    /**
     * <p>
     * An object containing information about the job configuration.
     * </p>
     */
    private JobConfigInput jobConfig;
    /**
     * <p>
     * The Amazon Key Management Service (KMS) key ID for server-side encryption.
     * </p>
     */
    private String kmsKeyId;
    /**
     * <p>
     * The name of the Earth Observation job.
     * </p>
     */
    private String name;
    /**
     * <p>
     * Each tag consists of a key and a value.
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * A unique token that guarantees that the call to this API is idempotent.
     * </p>
     * 
     * @param clientToken
     *        A unique token that guarantees that the call to this API is idempotent.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * A unique token that guarantees that the call to this API is idempotent.
     * </p>
     * 
     * @return A unique token that guarantees that the call to this API is idempotent.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * A unique token that guarantees that the call to this API is idempotent.
     * </p>
     * 
     * @param clientToken
     *        A unique token that guarantees that the call to this API is idempotent.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartEarthObservationJobRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role that you specified for the job.
     * </p>
     * 
     * @param executionRoleArn
     *        The Amazon Resource Name (ARN) of the IAM role that you specified for the job.
     */

    public void setExecutionRoleArn(String executionRoleArn) {
        this.executionRoleArn = executionRoleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role that you specified for the job.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the IAM role that you specified for the job.
     */

    public String getExecutionRoleArn() {
        return this.executionRoleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role that you specified for the job.
     * </p>
     * 
     * @param executionRoleArn
     *        The Amazon Resource Name (ARN) of the IAM role that you specified for the job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartEarthObservationJobRequest withExecutionRoleArn(String executionRoleArn) {
        setExecutionRoleArn(executionRoleArn);
        return this;
    }

    /**
     * <p>
     * Input configuration information for the Earth Observation job.
     * </p>
     * 
     * @param inputConfig
     *        Input configuration information for the Earth Observation job.
     */

    public void setInputConfig(InputConfigInput inputConfig) {
        this.inputConfig = inputConfig;
    }

    /**
     * <p>
     * Input configuration information for the Earth Observation job.
     * </p>
     * 
     * @return Input configuration information for the Earth Observation job.
     */

    public InputConfigInput getInputConfig() {
        return this.inputConfig;
    }

    /**
     * <p>
     * Input configuration information for the Earth Observation job.
     * </p>
     * 
     * @param inputConfig
     *        Input configuration information for the Earth Observation job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartEarthObservationJobRequest withInputConfig(InputConfigInput inputConfig) {
        setInputConfig(inputConfig);
        return this;
    }

    /**
     * <p>
     * An object containing information about the job configuration.
     * </p>
     * 
     * @param jobConfig
     *        An object containing information about the job configuration.
     */

    public void setJobConfig(JobConfigInput jobConfig) {
        this.jobConfig = jobConfig;
    }

    /**
     * <p>
     * An object containing information about the job configuration.
     * </p>
     * 
     * @return An object containing information about the job configuration.
     */

    public JobConfigInput getJobConfig() {
        return this.jobConfig;
    }

    /**
     * <p>
     * An object containing information about the job configuration.
     * </p>
     * 
     * @param jobConfig
     *        An object containing information about the job configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartEarthObservationJobRequest withJobConfig(JobConfigInput jobConfig) {
        setJobConfig(jobConfig);
        return this;
    }

    /**
     * <p>
     * The Amazon Key Management Service (KMS) key ID for server-side encryption.
     * </p>
     * 
     * @param kmsKeyId
     *        The Amazon Key Management Service (KMS) key ID for server-side encryption.
     */

    public void setKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
    }

    /**
     * <p>
     * The Amazon Key Management Service (KMS) key ID for server-side encryption.
     * </p>
     * 
     * @return The Amazon Key Management Service (KMS) key ID for server-side encryption.
     */

    public String getKmsKeyId() {
        return this.kmsKeyId;
    }

    /**
     * <p>
     * The Amazon Key Management Service (KMS) key ID for server-side encryption.
     * </p>
     * 
     * @param kmsKeyId
     *        The Amazon Key Management Service (KMS) key ID for server-side encryption.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartEarthObservationJobRequest withKmsKeyId(String kmsKeyId) {
        setKmsKeyId(kmsKeyId);
        return this;
    }

    /**
     * <p>
     * The name of the Earth Observation job.
     * </p>
     * 
     * @param name
     *        The name of the Earth Observation job.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the Earth Observation job.
     * </p>
     * 
     * @return The name of the Earth Observation job.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the Earth Observation job.
     * </p>
     * 
     * @param name
     *        The name of the Earth Observation job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartEarthObservationJobRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * Each tag consists of a key and a value.
     * </p>
     * 
     * @return Each tag consists of a key and a value.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * Each tag consists of a key and a value.
     * </p>
     * 
     * @param tags
     *        Each tag consists of a key and a value.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * Each tag consists of a key and a value.
     * </p>
     * 
     * @param tags
     *        Each tag consists of a key and a value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartEarthObservationJobRequest withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see StartEarthObservationJobRequest#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public StartEarthObservationJobRequest addTagsEntry(String key, String value) {
        if (null == this.tags) {
            this.tags = new java.util.HashMap<String, String>();
        }
        if (this.tags.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.tags.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Tags.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartEarthObservationJobRequest clearTagsEntries() {
        this.tags = null;
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
        if (getExecutionRoleArn() != null)
            sb.append("ExecutionRoleArn: ").append(getExecutionRoleArn()).append(",");
        if (getInputConfig() != null)
            sb.append("InputConfig: ").append(getInputConfig()).append(",");
        if (getJobConfig() != null)
            sb.append("JobConfig: ").append(getJobConfig()).append(",");
        if (getKmsKeyId() != null)
            sb.append("KmsKeyId: ").append(getKmsKeyId()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StartEarthObservationJobRequest == false)
            return false;
        StartEarthObservationJobRequest other = (StartEarthObservationJobRequest) obj;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        if (other.getExecutionRoleArn() == null ^ this.getExecutionRoleArn() == null)
            return false;
        if (other.getExecutionRoleArn() != null && other.getExecutionRoleArn().equals(this.getExecutionRoleArn()) == false)
            return false;
        if (other.getInputConfig() == null ^ this.getInputConfig() == null)
            return false;
        if (other.getInputConfig() != null && other.getInputConfig().equals(this.getInputConfig()) == false)
            return false;
        if (other.getJobConfig() == null ^ this.getJobConfig() == null)
            return false;
        if (other.getJobConfig() != null && other.getJobConfig().equals(this.getJobConfig()) == false)
            return false;
        if (other.getKmsKeyId() == null ^ this.getKmsKeyId() == null)
            return false;
        if (other.getKmsKeyId() != null && other.getKmsKeyId().equals(this.getKmsKeyId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        hashCode = prime * hashCode + ((getExecutionRoleArn() == null) ? 0 : getExecutionRoleArn().hashCode());
        hashCode = prime * hashCode + ((getInputConfig() == null) ? 0 : getInputConfig().hashCode());
        hashCode = prime * hashCode + ((getJobConfig() == null) ? 0 : getJobConfig().hashCode());
        hashCode = prime * hashCode + ((getKmsKeyId() == null) ? 0 : getKmsKeyId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public StartEarthObservationJobRequest clone() {
        return (StartEarthObservationJobRequest) super.clone();
    }

}
