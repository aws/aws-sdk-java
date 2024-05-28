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

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetMediaAnalysisJobResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier for the media analysis job.
     * </p>
     */
    private String jobId;
    /**
     * <p>
     * The name of the media analysis job.
     * </p>
     */
    private String jobName;
    /**
     * <p>
     * Operation configurations that were provided during job creation.
     * </p>
     */
    private MediaAnalysisOperationsConfig operationsConfig;
    /**
     * <p>
     * The current status of the media analysis job.
     * </p>
     */
    private String status;
    /**
     * <p>
     * Details about the error that resulted in failure of the job.
     * </p>
     */
    private MediaAnalysisJobFailureDetails failureDetails;
    /**
     * <p>
     * The Unix date and time when the job was started.
     * </p>
     */
    private java.util.Date creationTimestamp;
    /**
     * <p>
     * The Unix date and time when the job finished.
     * </p>
     */
    private java.util.Date completionTimestamp;
    /**
     * <p>
     * Reference to the input manifest that was provided in the job creation request.
     * </p>
     */
    private MediaAnalysisInput input;
    /**
     * <p>
     * Output configuration that was provided in the creation request.
     * </p>
     */
    private MediaAnalysisOutputConfig outputConfig;
    /**
     * <p>
     * KMS Key that was provided in the creation request.
     * </p>
     */
    private String kmsKeyId;
    /**
     * <p>
     * Output manifest that contains prediction results.
     * </p>
     */
    private MediaAnalysisResults results;
    /**
     * <p>
     * The summary manifest provides statistics on input manifest and errors identified in the input manifest.
     * </p>
     */
    private MediaAnalysisManifestSummary manifestSummary;

    /**
     * <p>
     * The identifier for the media analysis job.
     * </p>
     * 
     * @param jobId
     *        The identifier for the media analysis job.
     */

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    /**
     * <p>
     * The identifier for the media analysis job.
     * </p>
     * 
     * @return The identifier for the media analysis job.
     */

    public String getJobId() {
        return this.jobId;
    }

    /**
     * <p>
     * The identifier for the media analysis job.
     * </p>
     * 
     * @param jobId
     *        The identifier for the media analysis job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetMediaAnalysisJobResult withJobId(String jobId) {
        setJobId(jobId);
        return this;
    }

    /**
     * <p>
     * The name of the media analysis job.
     * </p>
     * 
     * @param jobName
     *        The name of the media analysis job.
     */

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    /**
     * <p>
     * The name of the media analysis job.
     * </p>
     * 
     * @return The name of the media analysis job.
     */

    public String getJobName() {
        return this.jobName;
    }

    /**
     * <p>
     * The name of the media analysis job.
     * </p>
     * 
     * @param jobName
     *        The name of the media analysis job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetMediaAnalysisJobResult withJobName(String jobName) {
        setJobName(jobName);
        return this;
    }

    /**
     * <p>
     * Operation configurations that were provided during job creation.
     * </p>
     * 
     * @param operationsConfig
     *        Operation configurations that were provided during job creation.
     */

    public void setOperationsConfig(MediaAnalysisOperationsConfig operationsConfig) {
        this.operationsConfig = operationsConfig;
    }

    /**
     * <p>
     * Operation configurations that were provided during job creation.
     * </p>
     * 
     * @return Operation configurations that were provided during job creation.
     */

    public MediaAnalysisOperationsConfig getOperationsConfig() {
        return this.operationsConfig;
    }

    /**
     * <p>
     * Operation configurations that were provided during job creation.
     * </p>
     * 
     * @param operationsConfig
     *        Operation configurations that were provided during job creation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetMediaAnalysisJobResult withOperationsConfig(MediaAnalysisOperationsConfig operationsConfig) {
        setOperationsConfig(operationsConfig);
        return this;
    }

    /**
     * <p>
     * The current status of the media analysis job.
     * </p>
     * 
     * @param status
     *        The current status of the media analysis job.
     * @see MediaAnalysisJobStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The current status of the media analysis job.
     * </p>
     * 
     * @return The current status of the media analysis job.
     * @see MediaAnalysisJobStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The current status of the media analysis job.
     * </p>
     * 
     * @param status
     *        The current status of the media analysis job.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MediaAnalysisJobStatus
     */

    public GetMediaAnalysisJobResult withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The current status of the media analysis job.
     * </p>
     * 
     * @param status
     *        The current status of the media analysis job.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MediaAnalysisJobStatus
     */

    public GetMediaAnalysisJobResult withStatus(MediaAnalysisJobStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * Details about the error that resulted in failure of the job.
     * </p>
     * 
     * @param failureDetails
     *        Details about the error that resulted in failure of the job.
     */

    public void setFailureDetails(MediaAnalysisJobFailureDetails failureDetails) {
        this.failureDetails = failureDetails;
    }

    /**
     * <p>
     * Details about the error that resulted in failure of the job.
     * </p>
     * 
     * @return Details about the error that resulted in failure of the job.
     */

    public MediaAnalysisJobFailureDetails getFailureDetails() {
        return this.failureDetails;
    }

    /**
     * <p>
     * Details about the error that resulted in failure of the job.
     * </p>
     * 
     * @param failureDetails
     *        Details about the error that resulted in failure of the job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetMediaAnalysisJobResult withFailureDetails(MediaAnalysisJobFailureDetails failureDetails) {
        setFailureDetails(failureDetails);
        return this;
    }

    /**
     * <p>
     * The Unix date and time when the job was started.
     * </p>
     * 
     * @param creationTimestamp
     *        The Unix date and time when the job was started.
     */

    public void setCreationTimestamp(java.util.Date creationTimestamp) {
        this.creationTimestamp = creationTimestamp;
    }

    /**
     * <p>
     * The Unix date and time when the job was started.
     * </p>
     * 
     * @return The Unix date and time when the job was started.
     */

    public java.util.Date getCreationTimestamp() {
        return this.creationTimestamp;
    }

    /**
     * <p>
     * The Unix date and time when the job was started.
     * </p>
     * 
     * @param creationTimestamp
     *        The Unix date and time when the job was started.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetMediaAnalysisJobResult withCreationTimestamp(java.util.Date creationTimestamp) {
        setCreationTimestamp(creationTimestamp);
        return this;
    }

    /**
     * <p>
     * The Unix date and time when the job finished.
     * </p>
     * 
     * @param completionTimestamp
     *        The Unix date and time when the job finished.
     */

    public void setCompletionTimestamp(java.util.Date completionTimestamp) {
        this.completionTimestamp = completionTimestamp;
    }

    /**
     * <p>
     * The Unix date and time when the job finished.
     * </p>
     * 
     * @return The Unix date and time when the job finished.
     */

    public java.util.Date getCompletionTimestamp() {
        return this.completionTimestamp;
    }

    /**
     * <p>
     * The Unix date and time when the job finished.
     * </p>
     * 
     * @param completionTimestamp
     *        The Unix date and time when the job finished.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetMediaAnalysisJobResult withCompletionTimestamp(java.util.Date completionTimestamp) {
        setCompletionTimestamp(completionTimestamp);
        return this;
    }

    /**
     * <p>
     * Reference to the input manifest that was provided in the job creation request.
     * </p>
     * 
     * @param input
     *        Reference to the input manifest that was provided in the job creation request.
     */

    public void setInput(MediaAnalysisInput input) {
        this.input = input;
    }

    /**
     * <p>
     * Reference to the input manifest that was provided in the job creation request.
     * </p>
     * 
     * @return Reference to the input manifest that was provided in the job creation request.
     */

    public MediaAnalysisInput getInput() {
        return this.input;
    }

    /**
     * <p>
     * Reference to the input manifest that was provided in the job creation request.
     * </p>
     * 
     * @param input
     *        Reference to the input manifest that was provided in the job creation request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetMediaAnalysisJobResult withInput(MediaAnalysisInput input) {
        setInput(input);
        return this;
    }

    /**
     * <p>
     * Output configuration that was provided in the creation request.
     * </p>
     * 
     * @param outputConfig
     *        Output configuration that was provided in the creation request.
     */

    public void setOutputConfig(MediaAnalysisOutputConfig outputConfig) {
        this.outputConfig = outputConfig;
    }

    /**
     * <p>
     * Output configuration that was provided in the creation request.
     * </p>
     * 
     * @return Output configuration that was provided in the creation request.
     */

    public MediaAnalysisOutputConfig getOutputConfig() {
        return this.outputConfig;
    }

    /**
     * <p>
     * Output configuration that was provided in the creation request.
     * </p>
     * 
     * @param outputConfig
     *        Output configuration that was provided in the creation request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetMediaAnalysisJobResult withOutputConfig(MediaAnalysisOutputConfig outputConfig) {
        setOutputConfig(outputConfig);
        return this;
    }

    /**
     * <p>
     * KMS Key that was provided in the creation request.
     * </p>
     * 
     * @param kmsKeyId
     *        KMS Key that was provided in the creation request.
     */

    public void setKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
    }

    /**
     * <p>
     * KMS Key that was provided in the creation request.
     * </p>
     * 
     * @return KMS Key that was provided in the creation request.
     */

    public String getKmsKeyId() {
        return this.kmsKeyId;
    }

    /**
     * <p>
     * KMS Key that was provided in the creation request.
     * </p>
     * 
     * @param kmsKeyId
     *        KMS Key that was provided in the creation request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetMediaAnalysisJobResult withKmsKeyId(String kmsKeyId) {
        setKmsKeyId(kmsKeyId);
        return this;
    }

    /**
     * <p>
     * Output manifest that contains prediction results.
     * </p>
     * 
     * @param results
     *        Output manifest that contains prediction results.
     */

    public void setResults(MediaAnalysisResults results) {
        this.results = results;
    }

    /**
     * <p>
     * Output manifest that contains prediction results.
     * </p>
     * 
     * @return Output manifest that contains prediction results.
     */

    public MediaAnalysisResults getResults() {
        return this.results;
    }

    /**
     * <p>
     * Output manifest that contains prediction results.
     * </p>
     * 
     * @param results
     *        Output manifest that contains prediction results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetMediaAnalysisJobResult withResults(MediaAnalysisResults results) {
        setResults(results);
        return this;
    }

    /**
     * <p>
     * The summary manifest provides statistics on input manifest and errors identified in the input manifest.
     * </p>
     * 
     * @param manifestSummary
     *        The summary manifest provides statistics on input manifest and errors identified in the input manifest.
     */

    public void setManifestSummary(MediaAnalysisManifestSummary manifestSummary) {
        this.manifestSummary = manifestSummary;
    }

    /**
     * <p>
     * The summary manifest provides statistics on input manifest and errors identified in the input manifest.
     * </p>
     * 
     * @return The summary manifest provides statistics on input manifest and errors identified in the input manifest.
     */

    public MediaAnalysisManifestSummary getManifestSummary() {
        return this.manifestSummary;
    }

    /**
     * <p>
     * The summary manifest provides statistics on input manifest and errors identified in the input manifest.
     * </p>
     * 
     * @param manifestSummary
     *        The summary manifest provides statistics on input manifest and errors identified in the input manifest.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetMediaAnalysisJobResult withManifestSummary(MediaAnalysisManifestSummary manifestSummary) {
        setManifestSummary(manifestSummary);
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
            sb.append("JobId: ").append(getJobId()).append(",");
        if (getJobName() != null)
            sb.append("JobName: ").append(getJobName()).append(",");
        if (getOperationsConfig() != null)
            sb.append("OperationsConfig: ").append(getOperationsConfig()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getFailureDetails() != null)
            sb.append("FailureDetails: ").append(getFailureDetails()).append(",");
        if (getCreationTimestamp() != null)
            sb.append("CreationTimestamp: ").append(getCreationTimestamp()).append(",");
        if (getCompletionTimestamp() != null)
            sb.append("CompletionTimestamp: ").append(getCompletionTimestamp()).append(",");
        if (getInput() != null)
            sb.append("Input: ").append(getInput()).append(",");
        if (getOutputConfig() != null)
            sb.append("OutputConfig: ").append(getOutputConfig()).append(",");
        if (getKmsKeyId() != null)
            sb.append("KmsKeyId: ").append(getKmsKeyId()).append(",");
        if (getResults() != null)
            sb.append("Results: ").append(getResults()).append(",");
        if (getManifestSummary() != null)
            sb.append("ManifestSummary: ").append(getManifestSummary());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetMediaAnalysisJobResult == false)
            return false;
        GetMediaAnalysisJobResult other = (GetMediaAnalysisJobResult) obj;
        if (other.getJobId() == null ^ this.getJobId() == null)
            return false;
        if (other.getJobId() != null && other.getJobId().equals(this.getJobId()) == false)
            return false;
        if (other.getJobName() == null ^ this.getJobName() == null)
            return false;
        if (other.getJobName() != null && other.getJobName().equals(this.getJobName()) == false)
            return false;
        if (other.getOperationsConfig() == null ^ this.getOperationsConfig() == null)
            return false;
        if (other.getOperationsConfig() != null && other.getOperationsConfig().equals(this.getOperationsConfig()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getFailureDetails() == null ^ this.getFailureDetails() == null)
            return false;
        if (other.getFailureDetails() != null && other.getFailureDetails().equals(this.getFailureDetails()) == false)
            return false;
        if (other.getCreationTimestamp() == null ^ this.getCreationTimestamp() == null)
            return false;
        if (other.getCreationTimestamp() != null && other.getCreationTimestamp().equals(this.getCreationTimestamp()) == false)
            return false;
        if (other.getCompletionTimestamp() == null ^ this.getCompletionTimestamp() == null)
            return false;
        if (other.getCompletionTimestamp() != null && other.getCompletionTimestamp().equals(this.getCompletionTimestamp()) == false)
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
        if (other.getResults() == null ^ this.getResults() == null)
            return false;
        if (other.getResults() != null && other.getResults().equals(this.getResults()) == false)
            return false;
        if (other.getManifestSummary() == null ^ this.getManifestSummary() == null)
            return false;
        if (other.getManifestSummary() != null && other.getManifestSummary().equals(this.getManifestSummary()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getJobId() == null) ? 0 : getJobId().hashCode());
        hashCode = prime * hashCode + ((getJobName() == null) ? 0 : getJobName().hashCode());
        hashCode = prime * hashCode + ((getOperationsConfig() == null) ? 0 : getOperationsConfig().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getFailureDetails() == null) ? 0 : getFailureDetails().hashCode());
        hashCode = prime * hashCode + ((getCreationTimestamp() == null) ? 0 : getCreationTimestamp().hashCode());
        hashCode = prime * hashCode + ((getCompletionTimestamp() == null) ? 0 : getCompletionTimestamp().hashCode());
        hashCode = prime * hashCode + ((getInput() == null) ? 0 : getInput().hashCode());
        hashCode = prime * hashCode + ((getOutputConfig() == null) ? 0 : getOutputConfig().hashCode());
        hashCode = prime * hashCode + ((getKmsKeyId() == null) ? 0 : getKmsKeyId().hashCode());
        hashCode = prime * hashCode + ((getResults() == null) ? 0 : getResults().hashCode());
        hashCode = prime * hashCode + ((getManifestSummary() == null) ? 0 : getManifestSummary().hashCode());
        return hashCode;
    }

    @Override
    public GetMediaAnalysisJobResult clone() {
        try {
            return (GetMediaAnalysisJobResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
