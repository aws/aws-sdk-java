/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/frauddetector-2019-11-15/CreateBatchPredictionJob"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateBatchPredictionJobRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the batch prediction job.
     * </p>
     */
    private String jobId;
    /**
     * <p>
     * The Amazon S3 location of your training file.
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
     * The name of the detector.
     * </p>
     */
    private String detectorName;
    /**
     * <p>
     * The detector version.
     * </p>
     */
    private String detectorVersion;
    /**
     * <p>
     * The ARN of the IAM role to use for this job request.
     * </p>
     */
    private String iamRoleArn;
    /**
     * <p>
     * A collection of key and value pairs.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * The ID of the batch prediction job.
     * </p>
     * 
     * @param jobId
     *        The ID of the batch prediction job.
     */

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    /**
     * <p>
     * The ID of the batch prediction job.
     * </p>
     * 
     * @return The ID of the batch prediction job.
     */

    public String getJobId() {
        return this.jobId;
    }

    /**
     * <p>
     * The ID of the batch prediction job.
     * </p>
     * 
     * @param jobId
     *        The ID of the batch prediction job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateBatchPredictionJobRequest withJobId(String jobId) {
        setJobId(jobId);
        return this;
    }

    /**
     * <p>
     * The Amazon S3 location of your training file.
     * </p>
     * 
     * @param inputPath
     *        The Amazon S3 location of your training file.
     */

    public void setInputPath(String inputPath) {
        this.inputPath = inputPath;
    }

    /**
     * <p>
     * The Amazon S3 location of your training file.
     * </p>
     * 
     * @return The Amazon S3 location of your training file.
     */

    public String getInputPath() {
        return this.inputPath;
    }

    /**
     * <p>
     * The Amazon S3 location of your training file.
     * </p>
     * 
     * @param inputPath
     *        The Amazon S3 location of your training file.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateBatchPredictionJobRequest withInputPath(String inputPath) {
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

    public CreateBatchPredictionJobRequest withOutputPath(String outputPath) {
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

    public CreateBatchPredictionJobRequest withEventTypeName(String eventTypeName) {
        setEventTypeName(eventTypeName);
        return this;
    }

    /**
     * <p>
     * The name of the detector.
     * </p>
     * 
     * @param detectorName
     *        The name of the detector.
     */

    public void setDetectorName(String detectorName) {
        this.detectorName = detectorName;
    }

    /**
     * <p>
     * The name of the detector.
     * </p>
     * 
     * @return The name of the detector.
     */

    public String getDetectorName() {
        return this.detectorName;
    }

    /**
     * <p>
     * The name of the detector.
     * </p>
     * 
     * @param detectorName
     *        The name of the detector.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateBatchPredictionJobRequest withDetectorName(String detectorName) {
        setDetectorName(detectorName);
        return this;
    }

    /**
     * <p>
     * The detector version.
     * </p>
     * 
     * @param detectorVersion
     *        The detector version.
     */

    public void setDetectorVersion(String detectorVersion) {
        this.detectorVersion = detectorVersion;
    }

    /**
     * <p>
     * The detector version.
     * </p>
     * 
     * @return The detector version.
     */

    public String getDetectorVersion() {
        return this.detectorVersion;
    }

    /**
     * <p>
     * The detector version.
     * </p>
     * 
     * @param detectorVersion
     *        The detector version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateBatchPredictionJobRequest withDetectorVersion(String detectorVersion) {
        setDetectorVersion(detectorVersion);
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

    public CreateBatchPredictionJobRequest withIamRoleArn(String iamRoleArn) {
        setIamRoleArn(iamRoleArn);
        return this;
    }

    /**
     * <p>
     * A collection of key and value pairs.
     * </p>
     * 
     * @return A collection of key and value pairs.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * A collection of key and value pairs.
     * </p>
     * 
     * @param tags
     *        A collection of key and value pairs.
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<Tag>(tags);
    }

    /**
     * <p>
     * A collection of key and value pairs.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        A collection of key and value pairs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateBatchPredictionJobRequest withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new java.util.ArrayList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A collection of key and value pairs.
     * </p>
     * 
     * @param tags
     *        A collection of key and value pairs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateBatchPredictionJobRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
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
        if (getInputPath() != null)
            sb.append("InputPath: ").append(getInputPath()).append(",");
        if (getOutputPath() != null)
            sb.append("OutputPath: ").append(getOutputPath()).append(",");
        if (getEventTypeName() != null)
            sb.append("EventTypeName: ").append(getEventTypeName()).append(",");
        if (getDetectorName() != null)
            sb.append("DetectorName: ").append(getDetectorName()).append(",");
        if (getDetectorVersion() != null)
            sb.append("DetectorVersion: ").append(getDetectorVersion()).append(",");
        if (getIamRoleArn() != null)
            sb.append("IamRoleArn: ").append(getIamRoleArn()).append(",");
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

        if (obj instanceof CreateBatchPredictionJobRequest == false)
            return false;
        CreateBatchPredictionJobRequest other = (CreateBatchPredictionJobRequest) obj;
        if (other.getJobId() == null ^ this.getJobId() == null)
            return false;
        if (other.getJobId() != null && other.getJobId().equals(this.getJobId()) == false)
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
        if (other.getDetectorName() == null ^ this.getDetectorName() == null)
            return false;
        if (other.getDetectorName() != null && other.getDetectorName().equals(this.getDetectorName()) == false)
            return false;
        if (other.getDetectorVersion() == null ^ this.getDetectorVersion() == null)
            return false;
        if (other.getDetectorVersion() != null && other.getDetectorVersion().equals(this.getDetectorVersion()) == false)
            return false;
        if (other.getIamRoleArn() == null ^ this.getIamRoleArn() == null)
            return false;
        if (other.getIamRoleArn() != null && other.getIamRoleArn().equals(this.getIamRoleArn()) == false)
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

        hashCode = prime * hashCode + ((getJobId() == null) ? 0 : getJobId().hashCode());
        hashCode = prime * hashCode + ((getInputPath() == null) ? 0 : getInputPath().hashCode());
        hashCode = prime * hashCode + ((getOutputPath() == null) ? 0 : getOutputPath().hashCode());
        hashCode = prime * hashCode + ((getEventTypeName() == null) ? 0 : getEventTypeName().hashCode());
        hashCode = prime * hashCode + ((getDetectorName() == null) ? 0 : getDetectorName().hashCode());
        hashCode = prime * hashCode + ((getDetectorVersion() == null) ? 0 : getDetectorVersion().hashCode());
        hashCode = prime * hashCode + ((getIamRoleArn() == null) ? 0 : getIamRoleArn().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateBatchPredictionJobRequest clone() {
        return (CreateBatchPredictionJobRequest) super.clone();
    }

}
