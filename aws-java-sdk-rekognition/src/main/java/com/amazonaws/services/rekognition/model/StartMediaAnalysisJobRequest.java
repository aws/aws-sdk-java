/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.rekognition.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StartMediaAnalysisJobRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Idempotency token used to prevent the accidental creation of duplicate versions. If you use the same token with
     * multiple <code>StartMediaAnalysisJobRequest</code> requests, the same response is returned. Use
     * <code>ClientRequestToken</code> to prevent the same request from being processed more than once.
     * </p>
     */
    private String clientRequestToken;
    /**
     * <p>
     * The name of the job. Does not have to be unique.
     * </p>
     */
    private String jobName;
    /**
     * <p>
     * Configuration options for the media analysis job to be created.
     * </p>
     */
    private MediaAnalysisOperationsConfig operationsConfig;
    /**
     * <p>
     * Input data to be analyzed by the job.
     * </p>
     */
    private MediaAnalysisInput input;
    /**
     * <p>
     * The Amazon S3 bucket location to store the results.
     * </p>
     */
    private MediaAnalysisOutputConfig outputConfig;
    /**
     * <p>
     * The identifier of customer managed AWS KMS key (name or ARN). The key is used to encrypt images copied into the
     * service. The key is also used to encrypt results and manifest files written to the output Amazon S3 bucket.
     * </p>
     */
    private String kmsKeyId;

    /**
     * <p>
     * Idempotency token used to prevent the accidental creation of duplicate versions. If you use the same token with
     * multiple <code>StartMediaAnalysisJobRequest</code> requests, the same response is returned. Use
     * <code>ClientRequestToken</code> to prevent the same request from being processed more than once.
     * </p>
     * 
     * @param clientRequestToken
     *        Idempotency token used to prevent the accidental creation of duplicate versions. If you use the same token
     *        with multiple <code>StartMediaAnalysisJobRequest</code> requests, the same response is returned. Use
     *        <code>ClientRequestToken</code> to prevent the same request from being processed more than once.
     */

    public void setClientRequestToken(String clientRequestToken) {
        this.clientRequestToken = clientRequestToken;
    }

    /**
     * <p>
     * Idempotency token used to prevent the accidental creation of duplicate versions. If you use the same token with
     * multiple <code>StartMediaAnalysisJobRequest</code> requests, the same response is returned. Use
     * <code>ClientRequestToken</code> to prevent the same request from being processed more than once.
     * </p>
     * 
     * @return Idempotency token used to prevent the accidental creation of duplicate versions. If you use the same
     *         token with multiple <code>StartMediaAnalysisJobRequest</code> requests, the same response is returned.
     *         Use <code>ClientRequestToken</code> to prevent the same request from being processed more than once.
     */

    public String getClientRequestToken() {
        return this.clientRequestToken;
    }

    /**
     * <p>
     * Idempotency token used to prevent the accidental creation of duplicate versions. If you use the same token with
     * multiple <code>StartMediaAnalysisJobRequest</code> requests, the same response is returned. Use
     * <code>ClientRequestToken</code> to prevent the same request from being processed more than once.
     * </p>
     * 
     * @param clientRequestToken
     *        Idempotency token used to prevent the accidental creation of duplicate versions. If you use the same token
     *        with multiple <code>StartMediaAnalysisJobRequest</code> requests, the same response is returned. Use
     *        <code>ClientRequestToken</code> to prevent the same request from being processed more than once.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartMediaAnalysisJobRequest withClientRequestToken(String clientRequestToken) {
        setClientRequestToken(clientRequestToken);
        return this;
    }

    /**
     * <p>
     * The name of the job. Does not have to be unique.
     * </p>
     * 
     * @param jobName
     *        The name of the job. Does not have to be unique.
     */

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    /**
     * <p>
     * The name of the job. Does not have to be unique.
     * </p>
     * 
     * @return The name of the job. Does not have to be unique.
     */

    public String getJobName() {
        return this.jobName;
    }

    /**
     * <p>
     * The name of the job. Does not have to be unique.
     * </p>
     * 
     * @param jobName
     *        The name of the job. Does not have to be unique.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartMediaAnalysisJobRequest withJobName(String jobName) {
        setJobName(jobName);
        return this;
    }

    /**
     * <p>
     * Configuration options for the media analysis job to be created.
     * </p>
     * 
     * @param operationsConfig
     *        Configuration options for the media analysis job to be created.
     */

    public void setOperationsConfig(MediaAnalysisOperationsConfig operationsConfig) {
        this.operationsConfig = operationsConfig;
    }

    /**
     * <p>
     * Configuration options for the media analysis job to be created.
     * </p>
     * 
     * @return Configuration options for the media analysis job to be created.
     */

    public MediaAnalysisOperationsConfig getOperationsConfig() {
        return this.operationsConfig;
    }

    /**
     * <p>
     * Configuration options for the media analysis job to be created.
     * </p>
     * 
     * @param operationsConfig
     *        Configuration options for the media analysis job to be created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartMediaAnalysisJobRequest withOperationsConfig(MediaAnalysisOperationsConfig operationsConfig) {
        setOperationsConfig(operationsConfig);
        return this;
    }

    /**
     * <p>
     * Input data to be analyzed by the job.
     * </p>
     * 
     * @param input
     *        Input data to be analyzed by the job.
     */

    public void setInput(MediaAnalysisInput input) {
        this.input = input;
    }

    /**
     * <p>
     * Input data to be analyzed by the job.
     * </p>
     * 
     * @return Input data to be analyzed by the job.
     */

    public MediaAnalysisInput getInput() {
        return this.input;
    }

    /**
     * <p>
     * Input data to be analyzed by the job.
     * </p>
     * 
     * @param input
     *        Input data to be analyzed by the job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartMediaAnalysisJobRequest withInput(MediaAnalysisInput input) {
        setInput(input);
        return this;
    }

    /**
     * <p>
     * The Amazon S3 bucket location to store the results.
     * </p>
     * 
     * @param outputConfig
     *        The Amazon S3 bucket location to store the results.
     */

    public void setOutputConfig(MediaAnalysisOutputConfig outputConfig) {
        this.outputConfig = outputConfig;
    }

    /**
     * <p>
     * The Amazon S3 bucket location to store the results.
     * </p>
     * 
     * @return The Amazon S3 bucket location to store the results.
     */

    public MediaAnalysisOutputConfig getOutputConfig() {
        return this.outputConfig;
    }

    /**
     * <p>
     * The Amazon S3 bucket location to store the results.
     * </p>
     * 
     * @param outputConfig
     *        The Amazon S3 bucket location to store the results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartMediaAnalysisJobRequest withOutputConfig(MediaAnalysisOutputConfig outputConfig) {
        setOutputConfig(outputConfig);
        return this;
    }

    /**
     * <p>
     * The identifier of customer managed AWS KMS key (name or ARN). The key is used to encrypt images copied into the
     * service. The key is also used to encrypt results and manifest files written to the output Amazon S3 bucket.
     * </p>
     * 
     * @param kmsKeyId
     *        The identifier of customer managed AWS KMS key (name or ARN). The key is used to encrypt images copied
     *        into the service. The key is also used to encrypt results and manifest files written to the output Amazon
     *        S3 bucket.
     */

    public void setKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
    }

    /**
     * <p>
     * The identifier of customer managed AWS KMS key (name or ARN). The key is used to encrypt images copied into the
     * service. The key is also used to encrypt results and manifest files written to the output Amazon S3 bucket.
     * </p>
     * 
     * @return The identifier of customer managed AWS KMS key (name or ARN). The key is used to encrypt images copied
     *         into the service. The key is also used to encrypt results and manifest files written to the output Amazon
     *         S3 bucket.
     */

    public String getKmsKeyId() {
        return this.kmsKeyId;
    }

    /**
     * <p>
     * The identifier of customer managed AWS KMS key (name or ARN). The key is used to encrypt images copied into the
     * service. The key is also used to encrypt results and manifest files written to the output Amazon S3 bucket.
     * </p>
     * 
     * @param kmsKeyId
     *        The identifier of customer managed AWS KMS key (name or ARN). The key is used to encrypt images copied
     *        into the service. The key is also used to encrypt results and manifest files written to the output Amazon
     *        S3 bucket.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartMediaAnalysisJobRequest withKmsKeyId(String kmsKeyId) {
        setKmsKeyId(kmsKeyId);
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
        if (getClientRequestToken() != null)
            sb.append("ClientRequestToken: ").append(getClientRequestToken()).append(",");
        if (getJobName() != null)
            sb.append("JobName: ").append(getJobName()).append(",");
        if (getOperationsConfig() != null)
            sb.append("OperationsConfig: ").append(getOperationsConfig()).append(",");
        if (getInput() != null)
            sb.append("Input: ").append(getInput()).append(",");
        if (getOutputConfig() != null)
            sb.append("OutputConfig: ").append(getOutputConfig()).append(",");
        if (getKmsKeyId() != null)
            sb.append("KmsKeyId: ").append(getKmsKeyId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StartMediaAnalysisJobRequest == false)
            return false;
        StartMediaAnalysisJobRequest other = (StartMediaAnalysisJobRequest) obj;
        if (other.getClientRequestToken() == null ^ this.getClientRequestToken() == null)
            return false;
        if (other.getClientRequestToken() != null && other.getClientRequestToken().equals(this.getClientRequestToken()) == false)
            return false;
        if (other.getJobName() == null ^ this.getJobName() == null)
            return false;
        if (other.getJobName() != null && other.getJobName().equals(this.getJobName()) == false)
            return false;
        if (other.getOperationsConfig() == null ^ this.getOperationsConfig() == null)
            return false;
        if (other.getOperationsConfig() != null && other.getOperationsConfig().equals(this.getOperationsConfig()) == false)
            return false;
        if (other.getInput() == null ^ this.getInput() == null)
            return false;
        if (other.getInput() != null && other.getInput().equals(this.getInput()) == false)
            return false;
        if (other.getOutputConfig() == null ^ this.getOutputConfig() == null)
            return false;
        if (other.getOutputConfig() != null && other.getOutputConfig().equals(this.getOutputConfig()) == false)
            return false;
        if (other.getKmsKeyId() == null ^ this.getKmsKeyId() == null)
            return false;
        if (other.getKmsKeyId() != null && other.getKmsKeyId().equals(this.getKmsKeyId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getClientRequestToken() == null) ? 0 : getClientRequestToken().hashCode());
        hashCode = prime * hashCode + ((getJobName() == null) ? 0 : getJobName().hashCode());
        hashCode = prime * hashCode + ((getOperationsConfig() == null) ? 0 : getOperationsConfig().hashCode());
        hashCode = prime * hashCode + ((getInput() == null) ? 0 : getInput().hashCode());
        hashCode = prime * hashCode + ((getOutputConfig() == null) ? 0 : getOutputConfig().hashCode());
        hashCode = prime * hashCode + ((getKmsKeyId() == null) ? 0 : getKmsKeyId().hashCode());
        return hashCode;
    }

    @Override
    public StartMediaAnalysisJobRequest clone() {
        return (StartMediaAnalysisJobRequest) super.clone();
    }

}
