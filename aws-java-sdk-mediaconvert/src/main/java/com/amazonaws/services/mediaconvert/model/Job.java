/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.mediaconvert.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * Each job converts an input file into an output file or files. For more information, see the User Guide at
 * http://docs.aws.amazon.com/mediaconvert/latest/ug/what-is.html
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconvert-2017-08-29/Job" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Job implements Serializable, Cloneable, StructuredPojo {

    /** Acceleration settings for job execution. */
    private AccelerationSettings accelerationSettings;
    /** An identifier for this resource that is unique within all of AWS. */
    private String arn;

    private String billingTagsSource;
    /** The time, in Unix epoch format in seconds, when the job got created. */
    private java.util.Date createdAt;
    /** Error code for the job */
    private Integer errorCode;
    /** Error message of Job */
    private String errorMessage;
    /** A portion of the job's ARN, unique within your AWS Elemental MediaConvert resources */
    private String id;
    /** The job template that the job is created from, if it is created from a job template. */
    private String jobTemplate;
    /** List of output group details */
    private java.util.List<OutputGroupDetail> outputGroupDetails;
    /**
     * Optional. When you create a job, you can specify a queue to send it to. If you don't specify, the job will go to
     * the default queue. For more about queues, see the User Guide topic at
     * http://docs.aws.amazon.com/mediaconvert/latest/ug/what-is.html
     */
    private String queue;
    /**
     * The IAM role you use for creating this job. For details about permissions, see the User Guide topic at the User
     * Guide at http://docs.aws.amazon.com/mediaconvert/latest/ug/iam-role.html
     */
    private String role;

    private JobSettings settings;

    private String status;
    /**
     * Specify how often MediaConvert sends STATUS_UPDATE events to Amazon CloudWatch Events. Set the interval, in
     * seconds, between status updates. MediaConvert sends an update at this interval from the time the service begins
     * processing your job to the time it completes the transcode or encounters an error.
     */
    private Long statusUpdateIntervalInSecs;

    private Timing timing;
    /**
     * User-defined metadata that you want to associate with an MediaConvert job. You specify metadata in key/value
     * pairs.
     */
    private java.util.Map<String, String> userMetadata;

    /**
     * Acceleration settings for job execution.
     * 
     * @param accelerationSettings
     *        Acceleration settings for job execution.
     */

    public void setAccelerationSettings(AccelerationSettings accelerationSettings) {
        this.accelerationSettings = accelerationSettings;
    }

    /**
     * Acceleration settings for job execution.
     * 
     * @return Acceleration settings for job execution.
     */

    public AccelerationSettings getAccelerationSettings() {
        return this.accelerationSettings;
    }

    /**
     * Acceleration settings for job execution.
     * 
     * @param accelerationSettings
     *        Acceleration settings for job execution.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Job withAccelerationSettings(AccelerationSettings accelerationSettings) {
        setAccelerationSettings(accelerationSettings);
        return this;
    }

    /**
     * An identifier for this resource that is unique within all of AWS.
     * 
     * @param arn
     *        An identifier for this resource that is unique within all of AWS.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * An identifier for this resource that is unique within all of AWS.
     * 
     * @return An identifier for this resource that is unique within all of AWS.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * An identifier for this resource that is unique within all of AWS.
     * 
     * @param arn
     *        An identifier for this resource that is unique within all of AWS.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Job withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * @param billingTagsSource
     * @see BillingTagsSource
     */

    public void setBillingTagsSource(String billingTagsSource) {
        this.billingTagsSource = billingTagsSource;
    }

    /**
     * @return
     * @see BillingTagsSource
     */

    public String getBillingTagsSource() {
        return this.billingTagsSource;
    }

    /**
     * @param billingTagsSource
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see BillingTagsSource
     */

    public Job withBillingTagsSource(String billingTagsSource) {
        setBillingTagsSource(billingTagsSource);
        return this;
    }

    /**
     * @param billingTagsSource
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see BillingTagsSource
     */

    public Job withBillingTagsSource(BillingTagsSource billingTagsSource) {
        this.billingTagsSource = billingTagsSource.toString();
        return this;
    }

    /**
     * The time, in Unix epoch format in seconds, when the job got created.
     * 
     * @param createdAt
     *        The time, in Unix epoch format in seconds, when the job got created.
     */

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * The time, in Unix epoch format in seconds, when the job got created.
     * 
     * @return The time, in Unix epoch format in seconds, when the job got created.
     */

    public java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    /**
     * The time, in Unix epoch format in seconds, when the job got created.
     * 
     * @param createdAt
     *        The time, in Unix epoch format in seconds, when the job got created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Job withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
        return this;
    }

    /**
     * Error code for the job
     * 
     * @param errorCode
     *        Error code for the job
     */

    public void setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
    }

    /**
     * Error code for the job
     * 
     * @return Error code for the job
     */

    public Integer getErrorCode() {
        return this.errorCode;
    }

    /**
     * Error code for the job
     * 
     * @param errorCode
     *        Error code for the job
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Job withErrorCode(Integer errorCode) {
        setErrorCode(errorCode);
        return this;
    }

    /**
     * Error message of Job
     * 
     * @param errorMessage
     *        Error message of Job
     */

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    /**
     * Error message of Job
     * 
     * @return Error message of Job
     */

    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * Error message of Job
     * 
     * @param errorMessage
     *        Error message of Job
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Job withErrorMessage(String errorMessage) {
        setErrorMessage(errorMessage);
        return this;
    }

    /**
     * A portion of the job's ARN, unique within your AWS Elemental MediaConvert resources
     * 
     * @param id
     *        A portion of the job's ARN, unique within your AWS Elemental MediaConvert resources
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * A portion of the job's ARN, unique within your AWS Elemental MediaConvert resources
     * 
     * @return A portion of the job's ARN, unique within your AWS Elemental MediaConvert resources
     */

    public String getId() {
        return this.id;
    }

    /**
     * A portion of the job's ARN, unique within your AWS Elemental MediaConvert resources
     * 
     * @param id
     *        A portion of the job's ARN, unique within your AWS Elemental MediaConvert resources
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Job withId(String id) {
        setId(id);
        return this;
    }

    /**
     * The job template that the job is created from, if it is created from a job template.
     * 
     * @param jobTemplate
     *        The job template that the job is created from, if it is created from a job template.
     */

    public void setJobTemplate(String jobTemplate) {
        this.jobTemplate = jobTemplate;
    }

    /**
     * The job template that the job is created from, if it is created from a job template.
     * 
     * @return The job template that the job is created from, if it is created from a job template.
     */

    public String getJobTemplate() {
        return this.jobTemplate;
    }

    /**
     * The job template that the job is created from, if it is created from a job template.
     * 
     * @param jobTemplate
     *        The job template that the job is created from, if it is created from a job template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Job withJobTemplate(String jobTemplate) {
        setJobTemplate(jobTemplate);
        return this;
    }

    /**
     * List of output group details
     * 
     * @return List of output group details
     */

    public java.util.List<OutputGroupDetail> getOutputGroupDetails() {
        return outputGroupDetails;
    }

    /**
     * List of output group details
     * 
     * @param outputGroupDetails
     *        List of output group details
     */

    public void setOutputGroupDetails(java.util.Collection<OutputGroupDetail> outputGroupDetails) {
        if (outputGroupDetails == null) {
            this.outputGroupDetails = null;
            return;
        }

        this.outputGroupDetails = new java.util.ArrayList<OutputGroupDetail>(outputGroupDetails);
    }

    /**
     * List of output group details
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setOutputGroupDetails(java.util.Collection)} or {@link #withOutputGroupDetails(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param outputGroupDetails
     *        List of output group details
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Job withOutputGroupDetails(OutputGroupDetail... outputGroupDetails) {
        if (this.outputGroupDetails == null) {
            setOutputGroupDetails(new java.util.ArrayList<OutputGroupDetail>(outputGroupDetails.length));
        }
        for (OutputGroupDetail ele : outputGroupDetails) {
            this.outputGroupDetails.add(ele);
        }
        return this;
    }

    /**
     * List of output group details
     * 
     * @param outputGroupDetails
     *        List of output group details
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Job withOutputGroupDetails(java.util.Collection<OutputGroupDetail> outputGroupDetails) {
        setOutputGroupDetails(outputGroupDetails);
        return this;
    }

    /**
     * Optional. When you create a job, you can specify a queue to send it to. If you don't specify, the job will go to
     * the default queue. For more about queues, see the User Guide topic at
     * http://docs.aws.amazon.com/mediaconvert/latest/ug/what-is.html
     * 
     * @param queue
     *        Optional. When you create a job, you can specify a queue to send it to. If you don't specify, the job will
     *        go to the default queue. For more about queues, see the User Guide topic at
     *        http://docs.aws.amazon.com/mediaconvert/latest/ug/what-is.html
     */

    public void setQueue(String queue) {
        this.queue = queue;
    }

    /**
     * Optional. When you create a job, you can specify a queue to send it to. If you don't specify, the job will go to
     * the default queue. For more about queues, see the User Guide topic at
     * http://docs.aws.amazon.com/mediaconvert/latest/ug/what-is.html
     * 
     * @return Optional. When you create a job, you can specify a queue to send it to. If you don't specify, the job
     *         will go to the default queue. For more about queues, see the User Guide topic at
     *         http://docs.aws.amazon.com/mediaconvert/latest/ug/what-is.html
     */

    public String getQueue() {
        return this.queue;
    }

    /**
     * Optional. When you create a job, you can specify a queue to send it to. If you don't specify, the job will go to
     * the default queue. For more about queues, see the User Guide topic at
     * http://docs.aws.amazon.com/mediaconvert/latest/ug/what-is.html
     * 
     * @param queue
     *        Optional. When you create a job, you can specify a queue to send it to. If you don't specify, the job will
     *        go to the default queue. For more about queues, see the User Guide topic at
     *        http://docs.aws.amazon.com/mediaconvert/latest/ug/what-is.html
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Job withQueue(String queue) {
        setQueue(queue);
        return this;
    }

    /**
     * The IAM role you use for creating this job. For details about permissions, see the User Guide topic at the User
     * Guide at http://docs.aws.amazon.com/mediaconvert/latest/ug/iam-role.html
     * 
     * @param role
     *        The IAM role you use for creating this job. For details about permissions, see the User Guide topic at the
     *        User Guide at http://docs.aws.amazon.com/mediaconvert/latest/ug/iam-role.html
     */

    public void setRole(String role) {
        this.role = role;
    }

    /**
     * The IAM role you use for creating this job. For details about permissions, see the User Guide topic at the User
     * Guide at http://docs.aws.amazon.com/mediaconvert/latest/ug/iam-role.html
     * 
     * @return The IAM role you use for creating this job. For details about permissions, see the User Guide topic at
     *         the User Guide at http://docs.aws.amazon.com/mediaconvert/latest/ug/iam-role.html
     */

    public String getRole() {
        return this.role;
    }

    /**
     * The IAM role you use for creating this job. For details about permissions, see the User Guide topic at the User
     * Guide at http://docs.aws.amazon.com/mediaconvert/latest/ug/iam-role.html
     * 
     * @param role
     *        The IAM role you use for creating this job. For details about permissions, see the User Guide topic at the
     *        User Guide at http://docs.aws.amazon.com/mediaconvert/latest/ug/iam-role.html
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Job withRole(String role) {
        setRole(role);
        return this;
    }

    /**
     * @param settings
     */

    public void setSettings(JobSettings settings) {
        this.settings = settings;
    }

    /**
     * @return
     */

    public JobSettings getSettings() {
        return this.settings;
    }

    /**
     * @param settings
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Job withSettings(JobSettings settings) {
        setSettings(settings);
        return this;
    }

    /**
     * @param status
     * @see JobStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * @return
     * @see JobStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * @param status
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see JobStatus
     */

    public Job withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * @param status
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see JobStatus
     */

    public Job withStatus(JobStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * Specify how often MediaConvert sends STATUS_UPDATE events to Amazon CloudWatch Events. Set the interval, in
     * seconds, between status updates. MediaConvert sends an update at this interval from the time the service begins
     * processing your job to the time it completes the transcode or encounters an error.
     * 
     * @param statusUpdateIntervalInSecs
     *        Specify how often MediaConvert sends STATUS_UPDATE events to Amazon CloudWatch Events. Set the interval,
     *        in seconds, between status updates. MediaConvert sends an update at this interval from the time the
     *        service begins processing your job to the time it completes the transcode or encounters an error.
     */

    public void setStatusUpdateIntervalInSecs(Long statusUpdateIntervalInSecs) {
        this.statusUpdateIntervalInSecs = statusUpdateIntervalInSecs;
    }

    /**
     * Specify how often MediaConvert sends STATUS_UPDATE events to Amazon CloudWatch Events. Set the interval, in
     * seconds, between status updates. MediaConvert sends an update at this interval from the time the service begins
     * processing your job to the time it completes the transcode or encounters an error.
     * 
     * @return Specify how often MediaConvert sends STATUS_UPDATE events to Amazon CloudWatch Events. Set the interval,
     *         in seconds, between status updates. MediaConvert sends an update at this interval from the time the
     *         service begins processing your job to the time it completes the transcode or encounters an error.
     */

    public Long getStatusUpdateIntervalInSecs() {
        return this.statusUpdateIntervalInSecs;
    }

    /**
     * Specify how often MediaConvert sends STATUS_UPDATE events to Amazon CloudWatch Events. Set the interval, in
     * seconds, between status updates. MediaConvert sends an update at this interval from the time the service begins
     * processing your job to the time it completes the transcode or encounters an error.
     * 
     * @param statusUpdateIntervalInSecs
     *        Specify how often MediaConvert sends STATUS_UPDATE events to Amazon CloudWatch Events. Set the interval,
     *        in seconds, between status updates. MediaConvert sends an update at this interval from the time the
     *        service begins processing your job to the time it completes the transcode or encounters an error.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Job withStatusUpdateIntervalInSecs(Long statusUpdateIntervalInSecs) {
        setStatusUpdateIntervalInSecs(statusUpdateIntervalInSecs);
        return this;
    }

    /**
     * @param timing
     */

    public void setTiming(Timing timing) {
        this.timing = timing;
    }

    /**
     * @return
     */

    public Timing getTiming() {
        return this.timing;
    }

    /**
     * @param timing
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Job withTiming(Timing timing) {
        setTiming(timing);
        return this;
    }

    /**
     * User-defined metadata that you want to associate with an MediaConvert job. You specify metadata in key/value
     * pairs.
     * 
     * @return User-defined metadata that you want to associate with an MediaConvert job. You specify metadata in
     *         key/value pairs.
     */

    public java.util.Map<String, String> getUserMetadata() {
        return userMetadata;
    }

    /**
     * User-defined metadata that you want to associate with an MediaConvert job. You specify metadata in key/value
     * pairs.
     * 
     * @param userMetadata
     *        User-defined metadata that you want to associate with an MediaConvert job. You specify metadata in
     *        key/value pairs.
     */

    public void setUserMetadata(java.util.Map<String, String> userMetadata) {
        this.userMetadata = userMetadata;
    }

    /**
     * User-defined metadata that you want to associate with an MediaConvert job. You specify metadata in key/value
     * pairs.
     * 
     * @param userMetadata
     *        User-defined metadata that you want to associate with an MediaConvert job. You specify metadata in
     *        key/value pairs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Job withUserMetadata(java.util.Map<String, String> userMetadata) {
        setUserMetadata(userMetadata);
        return this;
    }

    public Job addUserMetadataEntry(String key, String value) {
        if (null == this.userMetadata) {
            this.userMetadata = new java.util.HashMap<String, String>();
        }
        if (this.userMetadata.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.userMetadata.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into UserMetadata.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Job clearUserMetadataEntries() {
        this.userMetadata = null;
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
        if (getAccelerationSettings() != null)
            sb.append("AccelerationSettings: ").append(getAccelerationSettings()).append(",");
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getBillingTagsSource() != null)
            sb.append("BillingTagsSource: ").append(getBillingTagsSource()).append(",");
        if (getCreatedAt() != null)
            sb.append("CreatedAt: ").append(getCreatedAt()).append(",");
        if (getErrorCode() != null)
            sb.append("ErrorCode: ").append(getErrorCode()).append(",");
        if (getErrorMessage() != null)
            sb.append("ErrorMessage: ").append(getErrorMessage()).append(",");
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getJobTemplate() != null)
            sb.append("JobTemplate: ").append(getJobTemplate()).append(",");
        if (getOutputGroupDetails() != null)
            sb.append("OutputGroupDetails: ").append(getOutputGroupDetails()).append(",");
        if (getQueue() != null)
            sb.append("Queue: ").append(getQueue()).append(",");
        if (getRole() != null)
            sb.append("Role: ").append(getRole()).append(",");
        if (getSettings() != null)
            sb.append("Settings: ").append(getSettings()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getStatusUpdateIntervalInSecs() != null)
            sb.append("StatusUpdateIntervalInSecs: ").append(getStatusUpdateIntervalInSecs()).append(",");
        if (getTiming() != null)
            sb.append("Timing: ").append(getTiming()).append(",");
        if (getUserMetadata() != null)
            sb.append("UserMetadata: ").append(getUserMetadata());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Job == false)
            return false;
        Job other = (Job) obj;
        if (other.getAccelerationSettings() == null ^ this.getAccelerationSettings() == null)
            return false;
        if (other.getAccelerationSettings() != null && other.getAccelerationSettings().equals(this.getAccelerationSettings()) == false)
            return false;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getBillingTagsSource() == null ^ this.getBillingTagsSource() == null)
            return false;
        if (other.getBillingTagsSource() != null && other.getBillingTagsSource().equals(this.getBillingTagsSource()) == false)
            return false;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        if (other.getErrorCode() == null ^ this.getErrorCode() == null)
            return false;
        if (other.getErrorCode() != null && other.getErrorCode().equals(this.getErrorCode()) == false)
            return false;
        if (other.getErrorMessage() == null ^ this.getErrorMessage() == null)
            return false;
        if (other.getErrorMessage() != null && other.getErrorMessage().equals(this.getErrorMessage()) == false)
            return false;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getJobTemplate() == null ^ this.getJobTemplate() == null)
            return false;
        if (other.getJobTemplate() != null && other.getJobTemplate().equals(this.getJobTemplate()) == false)
            return false;
        if (other.getOutputGroupDetails() == null ^ this.getOutputGroupDetails() == null)
            return false;
        if (other.getOutputGroupDetails() != null && other.getOutputGroupDetails().equals(this.getOutputGroupDetails()) == false)
            return false;
        if (other.getQueue() == null ^ this.getQueue() == null)
            return false;
        if (other.getQueue() != null && other.getQueue().equals(this.getQueue()) == false)
            return false;
        if (other.getRole() == null ^ this.getRole() == null)
            return false;
        if (other.getRole() != null && other.getRole().equals(this.getRole()) == false)
            return false;
        if (other.getSettings() == null ^ this.getSettings() == null)
            return false;
        if (other.getSettings() != null && other.getSettings().equals(this.getSettings()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getStatusUpdateIntervalInSecs() == null ^ this.getStatusUpdateIntervalInSecs() == null)
            return false;
        if (other.getStatusUpdateIntervalInSecs() != null && other.getStatusUpdateIntervalInSecs().equals(this.getStatusUpdateIntervalInSecs()) == false)
            return false;
        if (other.getTiming() == null ^ this.getTiming() == null)
            return false;
        if (other.getTiming() != null && other.getTiming().equals(this.getTiming()) == false)
            return false;
        if (other.getUserMetadata() == null ^ this.getUserMetadata() == null)
            return false;
        if (other.getUserMetadata() != null && other.getUserMetadata().equals(this.getUserMetadata()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAccelerationSettings() == null) ? 0 : getAccelerationSettings().hashCode());
        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getBillingTagsSource() == null) ? 0 : getBillingTagsSource().hashCode());
        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getErrorCode() == null) ? 0 : getErrorCode().hashCode());
        hashCode = prime * hashCode + ((getErrorMessage() == null) ? 0 : getErrorMessage().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getJobTemplate() == null) ? 0 : getJobTemplate().hashCode());
        hashCode = prime * hashCode + ((getOutputGroupDetails() == null) ? 0 : getOutputGroupDetails().hashCode());
        hashCode = prime * hashCode + ((getQueue() == null) ? 0 : getQueue().hashCode());
        hashCode = prime * hashCode + ((getRole() == null) ? 0 : getRole().hashCode());
        hashCode = prime * hashCode + ((getSettings() == null) ? 0 : getSettings().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getStatusUpdateIntervalInSecs() == null) ? 0 : getStatusUpdateIntervalInSecs().hashCode());
        hashCode = prime * hashCode + ((getTiming() == null) ? 0 : getTiming().hashCode());
        hashCode = prime * hashCode + ((getUserMetadata() == null) ? 0 : getUserMetadata().hashCode());
        return hashCode;
    }

    @Override
    public Job clone() {
        try {
            return (Job) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mediaconvert.model.transform.JobMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
