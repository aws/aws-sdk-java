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
package com.amazonaws.services.frauddetector.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The batch import job details.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/frauddetector-2019-11-15/BatchImport" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchImport implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ID of the batch import job.
     * </p>
     */
    private String jobId;
    /**
     * <p>
     * The status of the batch import job.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The reason batch import job failed.
     * </p>
     */
    private String failureReason;
    /**
     * <p>
     * Timestamp of when the batch import job started.
     * </p>
     */
    private String startTime;
    /**
     * <p>
     * Timestamp of when batch import job completed.
     * </p>
     */
    private String completionTime;
    /**
     * <p>
     * The Amazon S3 location of your data file for batch import.
     * </p>
     */
    private String inputPath;
    /**
     * <p>
     * The Amazon S3 location of your output file.
     * </p>
     */
    private String outputPath;
    /**
     * <p>
     * The name of the event type.
     * </p>
     */
    private String eventTypeName;
    /**
     * <p>
     * The ARN of the IAM role to use for this job request.
     * </p>
     */
    private String iamRoleArn;
    /**
     * <p>
     * The ARN of the batch import job.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The number of records processed by batch import job.
     * </p>
     */
    private Integer processedRecordsCount;
    /**
     * <p>
     * The number of records that failed to import.
     * </p>
     */
    private Integer failedRecordsCount;
    /**
     * <p>
     * The total number of records in the batch import job.
     * </p>
     */
    private Integer totalRecordsCount;

    /**
     * <p>
     * The ID of the batch import job.
     * </p>
     * 
     * @param jobId
     *        The ID of the batch import job.
     */

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    /**
     * <p>
     * The ID of the batch import job.
     * </p>
     * 
     * @return The ID of the batch import job.
     */

    public String getJobId() {
        return this.jobId;
    }

    /**
     * <p>
     * The ID of the batch import job.
     * </p>
     * 
     * @param jobId
     *        The ID of the batch import job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchImport withJobId(String jobId) {
        setJobId(jobId);
        return this;
    }

    /**
     * <p>
     * The status of the batch import job.
     * </p>
     * 
     * @param status
     *        The status of the batch import job.
     * @see AsyncJobStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the batch import job.
     * </p>
     * 
     * @return The status of the batch import job.
     * @see AsyncJobStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the batch import job.
     * </p>
     * 
     * @param status
     *        The status of the batch import job.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AsyncJobStatus
     */

    public BatchImport withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the batch import job.
     * </p>
     * 
     * @param status
     *        The status of the batch import job.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AsyncJobStatus
     */

    public BatchImport withStatus(AsyncJobStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The reason batch import job failed.
     * </p>
     * 
     * @param failureReason
     *        The reason batch import job failed.
     */

    public void setFailureReason(String failureReason) {
        this.failureReason = failureReason;
    }

    /**
     * <p>
     * The reason batch import job failed.
     * </p>
     * 
     * @return The reason batch import job failed.
     */

    public String getFailureReason() {
        return this.failureReason;
    }

    /**
     * <p>
     * The reason batch import job failed.
     * </p>
     * 
     * @param failureReason
     *        The reason batch import job failed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchImport withFailureReason(String failureReason) {
        setFailureReason(failureReason);
        return this;
    }

    /**
     * <p>
     * Timestamp of when the batch import job started.
     * </p>
     * 
     * @param startTime
     *        Timestamp of when the batch import job started.
     */

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    /**
     * <p>
     * Timestamp of when the batch import job started.
     * </p>
     * 
     * @return Timestamp of when the batch import job started.
     */

    public String getStartTime() {
        return this.startTime;
    }

    /**
     * <p>
     * Timestamp of when the batch import job started.
     * </p>
     * 
     * @param startTime
     *        Timestamp of when the batch import job started.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchImport withStartTime(String startTime) {
        setStartTime(startTime);
        return this;
    }

    /**
     * <p>
     * Timestamp of when batch import job completed.
     * </p>
     * 
     * @param completionTime
     *        Timestamp of when batch import job completed.
     */

    public void setCompletionTime(String completionTime) {
        this.completionTime = completionTime;
    }

    /**
     * <p>
     * Timestamp of when batch import job completed.
     * </p>
     * 
     * @return Timestamp of when batch import job completed.
     */

    public String getCompletionTime() {
        return this.completionTime;
    }

    /**
     * <p>
     * Timestamp of when batch import job completed.
     * </p>
     * 
     * @param completionTime
     *        Timestamp of when batch import job completed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchImport withCompletionTime(String completionTime) {
        setCompletionTime(completionTime);
        return this;
    }

    /**
     * <p>
     * The Amazon S3 location of your data file for batch import.
     * </p>
     * 
     * @param inputPath
     *        The Amazon S3 location of your data file for batch import.
     */

    public void setInputPath(String inputPath) {
        this.inputPath = inputPath;
    }

    /**
     * <p>
     * The Amazon S3 location of your data file for batch import.
     * </p>
     * 
     * @return The Amazon S3 location of your data file for batch import.
     */

    public String getInputPath() {
        return this.inputPath;
    }

    /**
     * <p>
     * The Amazon S3 location of your data file for batch import.
     * </p>
     * 
     * @param inputPath
     *        The Amazon S3 location of your data file for batch import.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchImport withInputPath(String inputPath) {
        setInputPath(inputPath);
        return this;
    }

    /**
     * <p>
     * The Amazon S3 location of your output file.
     * </p>
     * 
     * @param outputPath
     *        The Amazon S3 location of your output file.
     */

    public void setOutputPath(String outputPath) {
        this.outputPath = outputPath;
    }

    /**
     * <p>
     * The Amazon S3 location of your output file.
     * </p>
     * 
     * @return The Amazon S3 location of your output file.
     */

    public String getOutputPath() {
        return this.outputPath;
    }

    /**
     * <p>
     * The Amazon S3 location of your output file.
     * </p>
     * 
     * @param outputPath
     *        The Amazon S3 location of your output file.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchImport withOutputPath(String outputPath) {
        setOutputPath(outputPath);
        return this;
    }

    /**
     * <p>
     * The name of the event type.
     * </p>
     * 
     * @param eventTypeName
     *        The name of the event type.
     */

    public void setEventTypeName(String eventTypeName) {
        this.eventTypeName = eventTypeName;
    }

    /**
     * <p>
     * The name of the event type.
     * </p>
     * 
     * @return The name of the event type.
     */

    public String getEventTypeName() {
        return this.eventTypeName;
    }

    /**
     * <p>
     * The name of the event type.
     * </p>
     * 
     * @param eventTypeName
     *        The name of the event type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchImport withEventTypeName(String eventTypeName) {
        setEventTypeName(eventTypeName);
        return this;
    }

    /**
     * <p>
     * The ARN of the IAM role to use for this job request.
     * </p>
     * 
     * @param iamRoleArn
     *        The ARN of the IAM role to use for this job request.
     */

    public void setIamRoleArn(String iamRoleArn) {
        this.iamRoleArn = iamRoleArn;
    }

    /**
     * <p>
     * The ARN of the IAM role to use for this job request.
     * </p>
     * 
     * @return The ARN of the IAM role to use for this job request.
     */

    public String getIamRoleArn() {
        return this.iamRoleArn;
    }

    /**
     * <p>
     * The ARN of the IAM role to use for this job request.
     * </p>
     * 
     * @param iamRoleArn
     *        The ARN of the IAM role to use for this job request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchImport withIamRoleArn(String iamRoleArn) {
        setIamRoleArn(iamRoleArn);
        return this;
    }

    /**
     * <p>
     * The ARN of the batch import job.
     * </p>
     * 
     * @param arn
     *        The ARN of the batch import job.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The ARN of the batch import job.
     * </p>
     * 
     * @return The ARN of the batch import job.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The ARN of the batch import job.
     * </p>
     * 
     * @param arn
     *        The ARN of the batch import job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchImport withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The number of records processed by batch import job.
     * </p>
     * 
     * @param processedRecordsCount
     *        The number of records processed by batch import job.
     */

    public void setProcessedRecordsCount(Integer processedRecordsCount) {
        this.processedRecordsCount = processedRecordsCount;
    }

    /**
     * <p>
     * The number of records processed by batch import job.
     * </p>
     * 
     * @return The number of records processed by batch import job.
     */

    public Integer getProcessedRecordsCount() {
        return this.processedRecordsCount;
    }

    /**
     * <p>
     * The number of records processed by batch import job.
     * </p>
     * 
     * @param processedRecordsCount
     *        The number of records processed by batch import job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchImport withProcessedRecordsCount(Integer processedRecordsCount) {
        setProcessedRecordsCount(processedRecordsCount);
        return this;
    }

    /**
     * <p>
     * The number of records that failed to import.
     * </p>
     * 
     * @param failedRecordsCount
     *        The number of records that failed to import.
     */

    public void setFailedRecordsCount(Integer failedRecordsCount) {
        this.failedRecordsCount = failedRecordsCount;
    }

    /**
     * <p>
     * The number of records that failed to import.
     * </p>
     * 
     * @return The number of records that failed to import.
     */

    public Integer getFailedRecordsCount() {
        return this.failedRecordsCount;
    }

    /**
     * <p>
     * The number of records that failed to import.
     * </p>
     * 
     * @param failedRecordsCount
     *        The number of records that failed to import.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchImport withFailedRecordsCount(Integer failedRecordsCount) {
        setFailedRecordsCount(failedRecordsCount);
        return this;
    }

    /**
     * <p>
     * The total number of records in the batch import job.
     * </p>
     * 
     * @param totalRecordsCount
     *        The total number of records in the batch import job.
     */

    public void setTotalRecordsCount(Integer totalRecordsCount) {
        this.totalRecordsCount = totalRecordsCount;
    }

    /**
     * <p>
     * The total number of records in the batch import job.
     * </p>
     * 
     * @return The total number of records in the batch import job.
     */

    public Integer getTotalRecordsCount() {
        return this.totalRecordsCount;
    }

    /**
     * <p>
     * The total number of records in the batch import job.
     * </p>
     * 
     * @param totalRecordsCount
     *        The total number of records in the batch import job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchImport withTotalRecordsCount(Integer totalRecordsCount) {
        setTotalRecordsCount(totalRecordsCount);
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
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getFailureReason() != null)
            sb.append("FailureReason: ").append(getFailureReason()).append(",");
        if (getStartTime() != null)
            sb.append("StartTime: ").append(getStartTime()).append(",");
        if (getCompletionTime() != null)
            sb.append("CompletionTime: ").append(getCompletionTime()).append(",");
        if (getInputPath() != null)
            sb.append("InputPath: ").append(getInputPath()).append(",");
        if (getOutputPath() != null)
            sb.append("OutputPath: ").append(getOutputPath()).append(",");
        if (getEventTypeName() != null)
            sb.append("EventTypeName: ").append(getEventTypeName()).append(",");
        if (getIamRoleArn() != null)
            sb.append("IamRoleArn: ").append(getIamRoleArn()).append(",");
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getProcessedRecordsCount() != null)
            sb.append("ProcessedRecordsCount: ").append(getProcessedRecordsCount()).append(",");
        if (getFailedRecordsCount() != null)
            sb.append("FailedRecordsCount: ").append(getFailedRecordsCount()).append(",");
        if (getTotalRecordsCount() != null)
            sb.append("TotalRecordsCount: ").append(getTotalRecordsCount());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchImport == false)
            return false;
        BatchImport other = (BatchImport) obj;
        if (other.getJobId() == null ^ this.getJobId() == null)
            return false;
        if (other.getJobId() != null && other.getJobId().equals(this.getJobId()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getFailureReason() == null ^ this.getFailureReason() == null)
            return false;
        if (other.getFailureReason() != null && other.getFailureReason().equals(this.getFailureReason()) == false)
            return false;
        if (other.getStartTime() == null ^ this.getStartTime() == null)
            return false;
        if (other.getStartTime() != null && other.getStartTime().equals(this.getStartTime()) == false)
            return false;
        if (other.getCompletionTime() == null ^ this.getCompletionTime() == null)
            return false;
        if (other.getCompletionTime() != null && other.getCompletionTime().equals(this.getCompletionTime()) == false)
            return false;
        if (other.getInputPath() == null ^ this.getInputPath() == null)
            return false;
        if (other.getInputPath() != null && other.getInputPath().equals(this.getInputPath()) == false)
            return false;
        if (other.getOutputPath() == null ^ this.getOutputPath() == null)
            return false;
        if (other.getOutputPath() != null && other.getOutputPath().equals(this.getOutputPath()) == false)
            return false;
        if (other.getEventTypeName() == null ^ this.getEventTypeName() == null)
            return false;
        if (other.getEventTypeName() != null && other.getEventTypeName().equals(this.getEventTypeName()) == false)
            return false;
        if (other.getIamRoleArn() == null ^ this.getIamRoleArn() == null)
            return false;
        if (other.getIamRoleArn() != null && other.getIamRoleArn().equals(this.getIamRoleArn()) == false)
            return false;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getProcessedRecordsCount() == null ^ this.getProcessedRecordsCount() == null)
            return false;
        if (other.getProcessedRecordsCount() != null && other.getProcessedRecordsCount().equals(this.getProcessedRecordsCount()) == false)
            return false;
        if (other.getFailedRecordsCount() == null ^ this.getFailedRecordsCount() == null)
            return false;
        if (other.getFailedRecordsCount() != null && other.getFailedRecordsCount().equals(this.getFailedRecordsCount()) == false)
            return false;
        if (other.getTotalRecordsCount() == null ^ this.getTotalRecordsCount() == null)
            return false;
        if (other.getTotalRecordsCount() != null && other.getTotalRecordsCount().equals(this.getTotalRecordsCount()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getJobId() == null) ? 0 : getJobId().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getFailureReason() == null) ? 0 : getFailureReason().hashCode());
        hashCode = prime * hashCode + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        hashCode = prime * hashCode + ((getCompletionTime() == null) ? 0 : getCompletionTime().hashCode());
        hashCode = prime * hashCode + ((getInputPath() == null) ? 0 : getInputPath().hashCode());
        hashCode = prime * hashCode + ((getOutputPath() == null) ? 0 : getOutputPath().hashCode());
        hashCode = prime * hashCode + ((getEventTypeName() == null) ? 0 : getEventTypeName().hashCode());
        hashCode = prime * hashCode + ((getIamRoleArn() == null) ? 0 : getIamRoleArn().hashCode());
        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getProcessedRecordsCount() == null) ? 0 : getProcessedRecordsCount().hashCode());
        hashCode = prime * hashCode + ((getFailedRecordsCount() == null) ? 0 : getFailedRecordsCount().hashCode());
        hashCode = prime * hashCode + ((getTotalRecordsCount() == null) ? 0 : getTotalRecordsCount().hashCode());
        return hashCode;
    }

    @Override
    public BatchImport clone() {
        try {
            return (BatchImport) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.frauddetector.model.transform.BatchImportMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
