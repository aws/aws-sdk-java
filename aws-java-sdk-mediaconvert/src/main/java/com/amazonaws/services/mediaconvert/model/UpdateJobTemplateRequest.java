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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconvert-2017-08-29/UpdateJobTemplate" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateJobTemplateRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /** This is a beta feature. If you are interested in using this feature, please contact AWS customer support. */
    private AccelerationSettings accelerationSettings;
    /** The new category for the job template, if you are changing it. */
    private String category;
    /** The new description for the job template, if you are changing it. */
    private String description;
    /** The name of the job template you are modifying */
    private String name;
    /** The new queue for the job template, if you are changing it. */
    private String queue;
    /**
     * JobTemplateSettings contains all the transcode settings saved in the template that will be applied to jobs
     * created from it.
     */
    private JobTemplateSettings settings;
    /**
     * Specify how often MediaConvert sends STATUS_UPDATE events to Amazon CloudWatch Events. Set the interval, in
     * seconds, between status updates. MediaConvert sends an update at this interval from the time the service begins
     * processing your job to the time it completes the transcode or encounters an error.
     */
    private String statusUpdateInterval;

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

    public UpdateJobTemplateRequest withAccelerationSettings(AccelerationSettings accelerationSettings) {
        setAccelerationSettings(accelerationSettings);
        return this;
    }

    /**
     * The new category for the job template, if you are changing it.
     * 
     * @param category
     *        The new category for the job template, if you are changing it.
     */

    public void setCategory(String category) {
        this.category = category;
    }

    /**
     * The new category for the job template, if you are changing it.
     * 
     * @return The new category for the job template, if you are changing it.
     */

    public String getCategory() {
        return this.category;
    }

    /**
     * The new category for the job template, if you are changing it.
     * 
     * @param category
     *        The new category for the job template, if you are changing it.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateJobTemplateRequest withCategory(String category) {
        setCategory(category);
        return this;
    }

    /**
     * The new description for the job template, if you are changing it.
     * 
     * @param description
     *        The new description for the job template, if you are changing it.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * The new description for the job template, if you are changing it.
     * 
     * @return The new description for the job template, if you are changing it.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * The new description for the job template, if you are changing it.
     * 
     * @param description
     *        The new description for the job template, if you are changing it.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateJobTemplateRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * The name of the job template you are modifying
     * 
     * @param name
     *        The name of the job template you are modifying
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * The name of the job template you are modifying
     * 
     * @return The name of the job template you are modifying
     */

    public String getName() {
        return this.name;
    }

    /**
     * The name of the job template you are modifying
     * 
     * @param name
     *        The name of the job template you are modifying
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateJobTemplateRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * The new queue for the job template, if you are changing it.
     * 
     * @param queue
     *        The new queue for the job template, if you are changing it.
     */

    public void setQueue(String queue) {
        this.queue = queue;
    }

    /**
     * The new queue for the job template, if you are changing it.
     * 
     * @return The new queue for the job template, if you are changing it.
     */

    public String getQueue() {
        return this.queue;
    }

    /**
     * The new queue for the job template, if you are changing it.
     * 
     * @param queue
     *        The new queue for the job template, if you are changing it.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateJobTemplateRequest withQueue(String queue) {
        setQueue(queue);
        return this;
    }

    /**
     * JobTemplateSettings contains all the transcode settings saved in the template that will be applied to jobs
     * created from it.
     * 
     * @param settings
     *        JobTemplateSettings contains all the transcode settings saved in the template that will be applied to jobs
     *        created from it.
     */

    public void setSettings(JobTemplateSettings settings) {
        this.settings = settings;
    }

    /**
     * JobTemplateSettings contains all the transcode settings saved in the template that will be applied to jobs
     * created from it.
     * 
     * @return JobTemplateSettings contains all the transcode settings saved in the template that will be applied to
     *         jobs created from it.
     */

    public JobTemplateSettings getSettings() {
        return this.settings;
    }

    /**
     * JobTemplateSettings contains all the transcode settings saved in the template that will be applied to jobs
     * created from it.
     * 
     * @param settings
     *        JobTemplateSettings contains all the transcode settings saved in the template that will be applied to jobs
     *        created from it.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateJobTemplateRequest withSettings(JobTemplateSettings settings) {
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

    public UpdateJobTemplateRequest withStatusUpdateInterval(String statusUpdateInterval) {
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

    public UpdateJobTemplateRequest withStatusUpdateInterval(StatusUpdateInterval statusUpdateInterval) {
        this.statusUpdateInterval = statusUpdateInterval.toString();
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
        if (getCategory() != null)
            sb.append("Category: ").append(getCategory()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getQueue() != null)
            sb.append("Queue: ").append(getQueue()).append(",");
        if (getSettings() != null)
            sb.append("Settings: ").append(getSettings()).append(",");
        if (getStatusUpdateInterval() != null)
            sb.append("StatusUpdateInterval: ").append(getStatusUpdateInterval());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateJobTemplateRequest == false)
            return false;
        UpdateJobTemplateRequest other = (UpdateJobTemplateRequest) obj;
        if (other.getAccelerationSettings() == null ^ this.getAccelerationSettings() == null)
            return false;
        if (other.getAccelerationSettings() != null && other.getAccelerationSettings().equals(this.getAccelerationSettings()) == false)
            return false;
        if (other.getCategory() == null ^ this.getCategory() == null)
            return false;
        if (other.getCategory() != null && other.getCategory().equals(this.getCategory()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getQueue() == null ^ this.getQueue() == null)
            return false;
        if (other.getQueue() != null && other.getQueue().equals(this.getQueue()) == false)
            return false;
        if (other.getSettings() == null ^ this.getSettings() == null)
            return false;
        if (other.getSettings() != null && other.getSettings().equals(this.getSettings()) == false)
            return false;
        if (other.getStatusUpdateInterval() == null ^ this.getStatusUpdateInterval() == null)
            return false;
        if (other.getStatusUpdateInterval() != null && other.getStatusUpdateInterval().equals(this.getStatusUpdateInterval()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAccelerationSettings() == null) ? 0 : getAccelerationSettings().hashCode());
        hashCode = prime * hashCode + ((getCategory() == null) ? 0 : getCategory().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getQueue() == null) ? 0 : getQueue().hashCode());
        hashCode = prime * hashCode + ((getSettings() == null) ? 0 : getSettings().hashCode());
        hashCode = prime * hashCode + ((getStatusUpdateInterval() == null) ? 0 : getStatusUpdateInterval().hashCode());
        return hashCode;
    }

    @Override
    public UpdateJobTemplateRequest clone() {
        return (UpdateJobTemplateRequest) super.clone();
    }

}
