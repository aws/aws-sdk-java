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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconvert-2017-08-29/CreateJob" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateJobRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /** This is a beta feature. If you are interested in using this feature, please contact AWS customer support. */
    private AccelerationSettings accelerationSettings;
    /**
     * Optional. Choose a tag type that AWS Billing and Cost Management will use to sort your AWS Elemental MediaConvert
     * costs on any billing report that you set up. Any transcoding outputs that don't have an associated tag will
     * appear in your billing report unsorted. If you don't choose a valid value for this field, your job outputs will
     * appear on the billing report unsorted.
     */
    private String billingTagsSource;
    /** Idempotency token for CreateJob operation. */
    private String clientRequestToken;
    /** When you create a job, you can either specify a job template or specify the transcoding settings individually */
    private String jobTemplate;
    /**
     * Optional. When you create a job, you can specify a queue to send it to. If you don't specify, the job will go to
     * the default queue. For more about queues, see the User Guide topic at
     * http://docs.aws.amazon.com/mediaconvert/latest/ug/what-is.html.
     */
    private String queue;
    /**
     * Required. The IAM role you use for creating this job. For details about permissions, see the User Guide topic at
     * the User Guide at http://docs.aws.amazon.com/mediaconvert/latest/ug/iam-role.html.
     */
    private String role;
    /** JobSettings contains all the transcode settings for a job. */
    private JobSettings settings;
    /**
     * Specify how often MediaConvert sends STATUS_UPDATE events to Amazon CloudWatch Events. Set the interval, in
     * seconds, between status updates. MediaConvert sends an update at this interval from the time the service begins
     * processing your job to the time it completes the transcode or encounters an error.
     */
    private String statusUpdateInterval;
    /**
     * User-defined metadata that you want to associate with an MediaConvert job. You specify metadata in key/value
     * pairs.
     */
    private java.util.Map<String, String> userMetadata;

    /**
     * This is a beta feature. If you are interested in using this feature, please contact AWS customer support.
     * 
     * @param accelerationSettings
     *        This is a beta feature. If you are interested in using this feature, please contact AWS customer support.
     */

    public void setAccelerationSettings(AccelerationSettings accelerationSettings) {
        this.accelerationSettings = accelerationSettings;
    }

    /**
     * This is a beta feature. If you are interested in using this feature, please contact AWS customer support.
     * 
     * @return This is a beta feature. If you are interested in using this feature, please contact AWS customer support.
     */

    public AccelerationSettings getAccelerationSettings() {
        return this.accelerationSettings;
    }

    /**
     * This is a beta feature. If you are interested in using this feature, please contact AWS customer support.
     * 
     * @param accelerationSettings
     *        This is a beta feature. If you are interested in using this feature, please contact AWS customer support.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateJobRequest withAccelerationSettings(AccelerationSettings accelerationSettings) {
        setAccelerationSettings(accelerationSettings);
        return this;
    }

    /**
     * Optional. Choose a tag type that AWS Billing and Cost Management will use to sort your AWS Elemental MediaConvert
     * costs on any billing report that you set up. Any transcoding outputs that don't have an associated tag will
     * appear in your billing report unsorted. If you don't choose a valid value for this field, your job outputs will
     * appear on the billing report unsorted.
     * 
     * @param billingTagsSource
     *        Optional. Choose a tag type that AWS Billing and Cost Management will use to sort your AWS Elemental
     *        MediaConvert costs on any billing report that you set up. Any transcoding outputs that don't have an
     *        associated tag will appear in your billing report unsorted. If you don't choose a valid value for this
     *        field, your job outputs will appear on the billing report unsorted.
     * @see BillingTagsSource
     */

    public void setBillingTagsSource(String billingTagsSource) {
        this.billingTagsSource = billingTagsSource;
    }

    /**
     * Optional. Choose a tag type that AWS Billing and Cost Management will use to sort your AWS Elemental MediaConvert
     * costs on any billing report that you set up. Any transcoding outputs that don't have an associated tag will
     * appear in your billing report unsorted. If you don't choose a valid value for this field, your job outputs will
     * appear on the billing report unsorted.
     * 
     * @return Optional. Choose a tag type that AWS Billing and Cost Management will use to sort your AWS Elemental
     *         MediaConvert costs on any billing report that you set up. Any transcoding outputs that don't have an
     *         associated tag will appear in your billing report unsorted. If you don't choose a valid value for this
     *         field, your job outputs will appear on the billing report unsorted.
     * @see BillingTagsSource
     */

    public String getBillingTagsSource() {
        return this.billingTagsSource;
    }

    /**
     * Optional. Choose a tag type that AWS Billing and Cost Management will use to sort your AWS Elemental MediaConvert
     * costs on any billing report that you set up. Any transcoding outputs that don't have an associated tag will
     * appear in your billing report unsorted. If you don't choose a valid value for this field, your job outputs will
     * appear on the billing report unsorted.
     * 
     * @param billingTagsSource
     *        Optional. Choose a tag type that AWS Billing and Cost Management will use to sort your AWS Elemental
     *        MediaConvert costs on any billing report that you set up. Any transcoding outputs that don't have an
     *        associated tag will appear in your billing report unsorted. If you don't choose a valid value for this
     *        field, your job outputs will appear on the billing report unsorted.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see BillingTagsSource
     */

    public CreateJobRequest withBillingTagsSource(String billingTagsSource) {
        setBillingTagsSource(billingTagsSource);
        return this;
    }

    /**
     * Optional. Choose a tag type that AWS Billing and Cost Management will use to sort your AWS Elemental MediaConvert
     * costs on any billing report that you set up. Any transcoding outputs that don't have an associated tag will
     * appear in your billing report unsorted. If you don't choose a valid value for this field, your job outputs will
     * appear on the billing report unsorted.
     * 
     * @param billingTagsSource
     *        Optional. Choose a tag type that AWS Billing and Cost Management will use to sort your AWS Elemental
     *        MediaConvert costs on any billing report that you set up. Any transcoding outputs that don't have an
     *        associated tag will appear in your billing report unsorted. If you don't choose a valid value for this
     *        field, your job outputs will appear on the billing report unsorted.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see BillingTagsSource
     */

    public CreateJobRequest withBillingTagsSource(BillingTagsSource billingTagsSource) {
        this.billingTagsSource = billingTagsSource.toString();
        return this;
    }

    /**
     * Idempotency token for CreateJob operation.
     * 
     * @param clientRequestToken
     *        Idempotency token for CreateJob operation.
     */

    public void setClientRequestToken(String clientRequestToken) {
        this.clientRequestToken = clientRequestToken;
    }

    /**
     * Idempotency token for CreateJob operation.
     * 
     * @return Idempotency token for CreateJob operation.
     */

    public String getClientRequestToken() {
        return this.clientRequestToken;
    }

    /**
     * Idempotency token for CreateJob operation.
     * 
     * @param clientRequestToken
     *        Idempotency token for CreateJob operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateJobRequest withClientRequestToken(String clientRequestToken) {
        setClientRequestToken(clientRequestToken);
        return this;
    }

    /**
     * When you create a job, you can either specify a job template or specify the transcoding settings individually
     * 
     * @param jobTemplate
     *        When you create a job, you can either specify a job template or specify the transcoding settings
     *        individually
     */

    public void setJobTemplate(String jobTemplate) {
        this.jobTemplate = jobTemplate;
    }

    /**
     * When you create a job, you can either specify a job template or specify the transcoding settings individually
     * 
     * @return When you create a job, you can either specify a job template or specify the transcoding settings
     *         individually
     */

    public String getJobTemplate() {
        return this.jobTemplate;
    }

    /**
     * When you create a job, you can either specify a job template or specify the transcoding settings individually
     * 
     * @param jobTemplate
     *        When you create a job, you can either specify a job template or specify the transcoding settings
     *        individually
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateJobRequest withJobTemplate(String jobTemplate) {
        setJobTemplate(jobTemplate);
        return this;
    }

    /**
     * Optional. When you create a job, you can specify a queue to send it to. If you don't specify, the job will go to
     * the default queue. For more about queues, see the User Guide topic at
     * http://docs.aws.amazon.com/mediaconvert/latest/ug/what-is.html.
     * 
     * @param queue
     *        Optional. When you create a job, you can specify a queue to send it to. If you don't specify, the job will
     *        go to the default queue. For more about queues, see the User Guide topic at
     *        http://docs.aws.amazon.com/mediaconvert/latest/ug/what-is.html.
     */

    public void setQueue(String queue) {
        this.queue = queue;
    }

    /**
     * Optional. When you create a job, you can specify a queue to send it to. If you don't specify, the job will go to
     * the default queue. For more about queues, see the User Guide topic at
     * http://docs.aws.amazon.com/mediaconvert/latest/ug/what-is.html.
     * 
     * @return Optional. When you create a job, you can specify a queue to send it to. If you don't specify, the job
     *         will go to the default queue. For more about queues, see the User Guide topic at
     *         http://docs.aws.amazon.com/mediaconvert/latest/ug/what-is.html.
     */

    public String getQueue() {
        return this.queue;
    }

    /**
     * Optional. When you create a job, you can specify a queue to send it to. If you don't specify, the job will go to
     * the default queue. For more about queues, see the User Guide topic at
     * http://docs.aws.amazon.com/mediaconvert/latest/ug/what-is.html.
     * 
     * @param queue
     *        Optional. When you create a job, you can specify a queue to send it to. If you don't specify, the job will
     *        go to the default queue. For more about queues, see the User Guide topic at
     *        http://docs.aws.amazon.com/mediaconvert/latest/ug/what-is.html.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateJobRequest withQueue(String queue) {
        setQueue(queue);
        return this;
    }

    /**
     * Required. The IAM role you use for creating this job. For details about permissions, see the User Guide topic at
     * the User Guide at http://docs.aws.amazon.com/mediaconvert/latest/ug/iam-role.html.
     * 
     * @param role
     *        Required. The IAM role you use for creating this job. For details about permissions, see the User Guide
     *        topic at the User Guide at http://docs.aws.amazon.com/mediaconvert/latest/ug/iam-role.html.
     */

    public void setRole(String role) {
        this.role = role;
    }

    /**
     * Required. The IAM role you use for creating this job. For details about permissions, see the User Guide topic at
     * the User Guide at http://docs.aws.amazon.com/mediaconvert/latest/ug/iam-role.html.
     * 
     * @return Required. The IAM role you use for creating this job. For details about permissions, see the User Guide
     *         topic at the User Guide at http://docs.aws.amazon.com/mediaconvert/latest/ug/iam-role.html.
     */

    public String getRole() {
        return this.role;
    }

    /**
     * Required. The IAM role you use for creating this job. For details about permissions, see the User Guide topic at
     * the User Guide at http://docs.aws.amazon.com/mediaconvert/latest/ug/iam-role.html.
     * 
     * @param role
     *        Required. The IAM role you use for creating this job. For details about permissions, see the User Guide
     *        topic at the User Guide at http://docs.aws.amazon.com/mediaconvert/latest/ug/iam-role.html.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateJobRequest withRole(String role) {
        setRole(role);
        return this;
    }

    /**
     * JobSettings contains all the transcode settings for a job.
     * 
     * @param settings
     *        JobSettings contains all the transcode settings for a job.
     */

    public void setSettings(JobSettings settings) {
        this.settings = settings;
    }

    /**
     * JobSettings contains all the transcode settings for a job.
     * 
     * @return JobSettings contains all the transcode settings for a job.
     */

    public JobSettings getSettings() {
        return this.settings;
    }

    /**
     * JobSettings contains all the transcode settings for a job.
     * 
     * @param settings
     *        JobSettings contains all the transcode settings for a job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateJobRequest withSettings(JobSettings settings) {
        setSettings(settings);
        return this;
    }

    /**
     * Specify how often MediaConvert sends STATUS_UPDATE events to Amazon CloudWatch Events. Set the interval, in
     * seconds, between status updates. MediaConvert sends an update at this interval from the time the service begins
     * processing your job to the time it completes the transcode or encounters an error.
     * 
     * @param statusUpdateInterval
     *        Specify how often MediaConvert sends STATUS_UPDATE events to Amazon CloudWatch Events. Set the interval,
     *        in seconds, between status updates. MediaConvert sends an update at this interval from the time the
     *        service begins processing your job to the time it completes the transcode or encounters an error.
     * @see StatusUpdateInterval
     */

    public void setStatusUpdateInterval(String statusUpdateInterval) {
        this.statusUpdateInterval = statusUpdateInterval;
    }

    /**
     * Specify how often MediaConvert sends STATUS_UPDATE events to Amazon CloudWatch Events. Set the interval, in
     * seconds, between status updates. MediaConvert sends an update at this interval from the time the service begins
     * processing your job to the time it completes the transcode or encounters an error.
     * 
     * @return Specify how often MediaConvert sends STATUS_UPDATE events to Amazon CloudWatch Events. Set the interval,
     *         in seconds, between status updates. MediaConvert sends an update at this interval from the time the
     *         service begins processing your job to the time it completes the transcode or encounters an error.
     * @see StatusUpdateInterval
     */

    public String getStatusUpdateInterval() {
        return this.statusUpdateInterval;
    }

    /**
     * Specify how often MediaConvert sends STATUS_UPDATE events to Amazon CloudWatch Events. Set the interval, in
     * seconds, between status updates. MediaConvert sends an update at this interval from the time the service begins
     * processing your job to the time it completes the transcode or encounters an error.
     * 
     * @param statusUpdateInterval
     *        Specify how often MediaConvert sends STATUS_UPDATE events to Amazon CloudWatch Events. Set the interval,
     *        in seconds, between status updates. MediaConvert sends an update at this interval from the time the
     *        service begins processing your job to the time it completes the transcode or encounters an error.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StatusUpdateInterval
     */

    public CreateJobRequest withStatusUpdateInterval(String statusUpdateInterval) {
        setStatusUpdateInterval(statusUpdateInterval);
        return this;
    }

    /**
     * Specify how often MediaConvert sends STATUS_UPDATE events to Amazon CloudWatch Events. Set the interval, in
     * seconds, between status updates. MediaConvert sends an update at this interval from the time the service begins
     * processing your job to the time it completes the transcode or encounters an error.
     * 
     * @param statusUpdateInterval
     *        Specify how often MediaConvert sends STATUS_UPDATE events to Amazon CloudWatch Events. Set the interval,
     *        in seconds, between status updates. MediaConvert sends an update at this interval from the time the
     *        service begins processing your job to the time it completes the transcode or encounters an error.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StatusUpdateInterval
     */

    public CreateJobRequest withStatusUpdateInterval(StatusUpdateInterval statusUpdateInterval) {
        this.statusUpdateInterval = statusUpdateInterval.toString();
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

    public CreateJobRequest withUserMetadata(java.util.Map<String, String> userMetadata) {
        setUserMetadata(userMetadata);
        return this;
    }

    public CreateJobRequest addUserMetadataEntry(String key, String value) {
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

    public CreateJobRequest clearUserMetadataEntries() {
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
        if (getBillingTagsSource() != null)
            sb.append("BillingTagsSource: ").append(getBillingTagsSource()).append(",");
        if (getClientRequestToken() != null)
            sb.append("ClientRequestToken: ").append(getClientRequestToken()).append(",");
        if (getJobTemplate() != null)
            sb.append("JobTemplate: ").append(getJobTemplate()).append(",");
        if (getQueue() != null)
            sb.append("Queue: ").append(getQueue()).append(",");
        if (getRole() != null)
            sb.append("Role: ").append(getRole()).append(",");
        if (getSettings() != null)
            sb.append("Settings: ").append(getSettings()).append(",");
        if (getStatusUpdateInterval() != null)
            sb.append("StatusUpdateInterval: ").append(getStatusUpdateInterval()).append(",");
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

        if (obj instanceof CreateJobRequest == false)
            return false;
        CreateJobRequest other = (CreateJobRequest) obj;
        if (other.getAccelerationSettings() == null ^ this.getAccelerationSettings() == null)
            return false;
        if (other.getAccelerationSettings() != null && other.getAccelerationSettings().equals(this.getAccelerationSettings()) == false)
            return false;
        if (other.getBillingTagsSource() == null ^ this.getBillingTagsSource() == null)
            return false;
        if (other.getBillingTagsSource() != null && other.getBillingTagsSource().equals(this.getBillingTagsSource()) == false)
            return false;
        if (other.getClientRequestToken() == null ^ this.getClientRequestToken() == null)
            return false;
        if (other.getClientRequestToken() != null && other.getClientRequestToken().equals(this.getClientRequestToken()) == false)
            return false;
        if (other.getJobTemplate() == null ^ this.getJobTemplate() == null)
            return false;
        if (other.getJobTemplate() != null && other.getJobTemplate().equals(this.getJobTemplate()) == false)
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
        if (other.getStatusUpdateInterval() == null ^ this.getStatusUpdateInterval() == null)
            return false;
        if (other.getStatusUpdateInterval() != null && other.getStatusUpdateInterval().equals(this.getStatusUpdateInterval()) == false)
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
        hashCode = prime * hashCode + ((getBillingTagsSource() == null) ? 0 : getBillingTagsSource().hashCode());
        hashCode = prime * hashCode + ((getClientRequestToken() == null) ? 0 : getClientRequestToken().hashCode());
        hashCode = prime * hashCode + ((getJobTemplate() == null) ? 0 : getJobTemplate().hashCode());
        hashCode = prime * hashCode + ((getQueue() == null) ? 0 : getQueue().hashCode());
        hashCode = prime * hashCode + ((getRole() == null) ? 0 : getRole().hashCode());
        hashCode = prime * hashCode + ((getSettings() == null) ? 0 : getSettings().hashCode());
        hashCode = prime * hashCode + ((getStatusUpdateInterval() == null) ? 0 : getStatusUpdateInterval().hashCode());
        hashCode = prime * hashCode + ((getUserMetadata() == null) ? 0 : getUserMetadata().hashCode());
        return hashCode;
    }

    @Override
    public CreateJobRequest clone() {
        return (CreateJobRequest) super.clone();
    }

}
