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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-geospatial-2020-05-27/StartEarthObservationJob"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StartEarthObservationJobResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Earth Observation job.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The creation time.
     * </p>
     */
    private java.util.Date creationTime;
    /**
     * <p>
     * The duration of the session, in seconds.
     * </p>
     */
    private Integer durationInSeconds;
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
    private InputConfigOutput inputConfig;
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
     * The status of the Earth Observation job.
     * </p>
     */
    private String status;
    /**
     * <p>
     * Each tag consists of a key and a value.
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Earth Observation job.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the Earth Observation job.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Earth Observation job.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the Earth Observation job.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Earth Observation job.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the Earth Observation job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartEarthObservationJobResult withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The creation time.
     * </p>
     * 
     * @param creationTime
     *        The creation time.
     */

    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * The creation time.
     * </p>
     * 
     * @return The creation time.
     */

    public java.util.Date getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * The creation time.
     * </p>
     * 
     * @param creationTime
     *        The creation time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartEarthObservationJobResult withCreationTime(java.util.Date creationTime) {
        setCreationTime(creationTime);
        return this;
    }

    /**
     * <p>
     * The duration of the session, in seconds.
     * </p>
     * 
     * @param durationInSeconds
     *        The duration of the session, in seconds.
     */

    public void setDurationInSeconds(Integer durationInSeconds) {
        this.durationInSeconds = durationInSeconds;
    }

    /**
     * <p>
     * The duration of the session, in seconds.
     * </p>
     * 
     * @return The duration of the session, in seconds.
     */

    public Integer getDurationInSeconds() {
        return this.durationInSeconds;
    }

    /**
     * <p>
     * The duration of the session, in seconds.
     * </p>
     * 
     * @param durationInSeconds
     *        The duration of the session, in seconds.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartEarthObservationJobResult withDurationInSeconds(Integer durationInSeconds) {
        setDurationInSeconds(durationInSeconds);
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

    public StartEarthObservationJobResult withExecutionRoleArn(String executionRoleArn) {
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

    public void setInputConfig(InputConfigOutput inputConfig) {
        this.inputConfig = inputConfig;
    }

    /**
     * <p>
     * Input configuration information for the Earth Observation job.
     * </p>
     * 
     * @return Input configuration information for the Earth Observation job.
     */

    public InputConfigOutput getInputConfig() {
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

    public StartEarthObservationJobResult withInputConfig(InputConfigOutput inputConfig) {
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

    public StartEarthObservationJobResult withJobConfig(JobConfigInput jobConfig) {
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

    public StartEarthObservationJobResult withKmsKeyId(String kmsKeyId) {
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

    public StartEarthObservationJobResult withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The status of the Earth Observation job.
     * </p>
     * 
     * @param status
     *        The status of the Earth Observation job.
     * @see EarthObservationJobStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the Earth Observation job.
     * </p>
     * 
     * @return The status of the Earth Observation job.
     * @see EarthObservationJobStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the Earth Observation job.
     * </p>
     * 
     * @param status
     *        The status of the Earth Observation job.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EarthObservationJobStatus
     */

    public StartEarthObservationJobResult withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the Earth Observation job.
     * </p>
     * 
     * @param status
     *        The status of the Earth Observation job.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EarthObservationJobStatus
     */

    public StartEarthObservationJobResult withStatus(EarthObservationJobStatus status) {
        this.status = status.toString();
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

    public StartEarthObservationJobResult withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see StartEarthObservationJobResult#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public StartEarthObservationJobResult addTagsEntry(String key, String value) {
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

    public StartEarthObservationJobResult clearTagsEntries() {
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
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getCreationTime() != null)
            sb.append("CreationTime: ").append(getCreationTime()).append(",");
        if (getDurationInSeconds() != null)
            sb.append("DurationInSeconds: ").append(getDurationInSeconds()).append(",");
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
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
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

        if (obj instanceof StartEarthObservationJobResult == false)
            return false;
        StartEarthObservationJobResult other = (StartEarthObservationJobResult) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        if (other.getDurationInSeconds() == null ^ this.getDurationInSeconds() == null)
            return false;
        if (other.getDurationInSeconds() != null && other.getDurationInSeconds().equals(this.getDurationInSeconds()) == false)
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
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
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

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode + ((getDurationInSeconds() == null) ? 0 : getDurationInSeconds().hashCode());
        hashCode = prime * hashCode + ((getExecutionRoleArn() == null) ? 0 : getExecutionRoleArn().hashCode());
        hashCode = prime * hashCode + ((getInputConfig() == null) ? 0 : getInputConfig().hashCode());
        hashCode = prime * hashCode + ((getJobConfig() == null) ? 0 : getJobConfig().hashCode());
        hashCode = prime * hashCode + ((getKmsKeyId() == null) ? 0 : getKmsKeyId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public StartEarthObservationJobResult clone() {
        try {
            return (StartEarthObservationJobResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
