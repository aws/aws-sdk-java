/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
public class StartTextDetectionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    private Video video;
    /**
     * <p>
     * Idempotent token used to identify the start request. If you use the same token with multiple
     * <code>StartTextDetection</code> requests, the same <code>JobId</code> is returned. Use
     * <code>ClientRequestToken</code> to prevent the same job from being accidentaly started more than once.
     * </p>
     */
    private String clientRequestToken;

    private NotificationChannel notificationChannel;
    /**
     * <p>
     * An identifier returned in the completion status published by your Amazon Simple Notification Service topic. For
     * example, you can use <code>JobTag</code> to group related jobs and identify them in the completion notification.
     * </p>
     */
    private String jobTag;
    /**
     * <p>
     * Optional parameters that let you set criteria the text must meet to be included in your response.
     * </p>
     */
    private StartTextDetectionFilters filters;

    /**
     * @param video
     */

    public void setVideo(Video video) {
        this.video = video;
    }

    /**
     * @return
     */

    public Video getVideo() {
        return this.video;
    }

    /**
     * @param video
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartTextDetectionRequest withVideo(Video video) {
        setVideo(video);
        return this;
    }

    /**
     * <p>
     * Idempotent token used to identify the start request. If you use the same token with multiple
     * <code>StartTextDetection</code> requests, the same <code>JobId</code> is returned. Use
     * <code>ClientRequestToken</code> to prevent the same job from being accidentaly started more than once.
     * </p>
     * 
     * @param clientRequestToken
     *        Idempotent token used to identify the start request. If you use the same token with multiple
     *        <code>StartTextDetection</code> requests, the same <code>JobId</code> is returned. Use
     *        <code>ClientRequestToken</code> to prevent the same job from being accidentaly started more than once.
     */

    public void setClientRequestToken(String clientRequestToken) {
        this.clientRequestToken = clientRequestToken;
    }

    /**
     * <p>
     * Idempotent token used to identify the start request. If you use the same token with multiple
     * <code>StartTextDetection</code> requests, the same <code>JobId</code> is returned. Use
     * <code>ClientRequestToken</code> to prevent the same job from being accidentaly started more than once.
     * </p>
     * 
     * @return Idempotent token used to identify the start request. If you use the same token with multiple
     *         <code>StartTextDetection</code> requests, the same <code>JobId</code> is returned. Use
     *         <code>ClientRequestToken</code> to prevent the same job from being accidentaly started more than once.
     */

    public String getClientRequestToken() {
        return this.clientRequestToken;
    }

    /**
     * <p>
     * Idempotent token used to identify the start request. If you use the same token with multiple
     * <code>StartTextDetection</code> requests, the same <code>JobId</code> is returned. Use
     * <code>ClientRequestToken</code> to prevent the same job from being accidentaly started more than once.
     * </p>
     * 
     * @param clientRequestToken
     *        Idempotent token used to identify the start request. If you use the same token with multiple
     *        <code>StartTextDetection</code> requests, the same <code>JobId</code> is returned. Use
     *        <code>ClientRequestToken</code> to prevent the same job from being accidentaly started more than once.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartTextDetectionRequest withClientRequestToken(String clientRequestToken) {
        setClientRequestToken(clientRequestToken);
        return this;
    }

    /**
     * @param notificationChannel
     */

    public void setNotificationChannel(NotificationChannel notificationChannel) {
        this.notificationChannel = notificationChannel;
    }

    /**
     * @return
     */

    public NotificationChannel getNotificationChannel() {
        return this.notificationChannel;
    }

    /**
     * @param notificationChannel
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartTextDetectionRequest withNotificationChannel(NotificationChannel notificationChannel) {
        setNotificationChannel(notificationChannel);
        return this;
    }

    /**
     * <p>
     * An identifier returned in the completion status published by your Amazon Simple Notification Service topic. For
     * example, you can use <code>JobTag</code> to group related jobs and identify them in the completion notification.
     * </p>
     * 
     * @param jobTag
     *        An identifier returned in the completion status published by your Amazon Simple Notification Service
     *        topic. For example, you can use <code>JobTag</code> to group related jobs and identify them in the
     *        completion notification.
     */

    public void setJobTag(String jobTag) {
        this.jobTag = jobTag;
    }

    /**
     * <p>
     * An identifier returned in the completion status published by your Amazon Simple Notification Service topic. For
     * example, you can use <code>JobTag</code> to group related jobs and identify them in the completion notification.
     * </p>
     * 
     * @return An identifier returned in the completion status published by your Amazon Simple Notification Service
     *         topic. For example, you can use <code>JobTag</code> to group related jobs and identify them in the
     *         completion notification.
     */

    public String getJobTag() {
        return this.jobTag;
    }

    /**
     * <p>
     * An identifier returned in the completion status published by your Amazon Simple Notification Service topic. For
     * example, you can use <code>JobTag</code> to group related jobs and identify them in the completion notification.
     * </p>
     * 
     * @param jobTag
     *        An identifier returned in the completion status published by your Amazon Simple Notification Service
     *        topic. For example, you can use <code>JobTag</code> to group related jobs and identify them in the
     *        completion notification.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartTextDetectionRequest withJobTag(String jobTag) {
        setJobTag(jobTag);
        return this;
    }

    /**
     * <p>
     * Optional parameters that let you set criteria the text must meet to be included in your response.
     * </p>
     * 
     * @param filters
     *        Optional parameters that let you set criteria the text must meet to be included in your response.
     */

    public void setFilters(StartTextDetectionFilters filters) {
        this.filters = filters;
    }

    /**
     * <p>
     * Optional parameters that let you set criteria the text must meet to be included in your response.
     * </p>
     * 
     * @return Optional parameters that let you set criteria the text must meet to be included in your response.
     */

    public StartTextDetectionFilters getFilters() {
        return this.filters;
    }

    /**
     * <p>
     * Optional parameters that let you set criteria the text must meet to be included in your response.
     * </p>
     * 
     * @param filters
     *        Optional parameters that let you set criteria the text must meet to be included in your response.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartTextDetectionRequest withFilters(StartTextDetectionFilters filters) {
        setFilters(filters);
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
        if (getVideo() != null)
            sb.append("Video: ").append(getVideo()).append(",");
        if (getClientRequestToken() != null)
            sb.append("ClientRequestToken: ").append(getClientRequestToken()).append(",");
        if (getNotificationChannel() != null)
            sb.append("NotificationChannel: ").append(getNotificationChannel()).append(",");
        if (getJobTag() != null)
            sb.append("JobTag: ").append(getJobTag()).append(",");
        if (getFilters() != null)
            sb.append("Filters: ").append(getFilters());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StartTextDetectionRequest == false)
            return false;
        StartTextDetectionRequest other = (StartTextDetectionRequest) obj;
        if (other.getVideo() == null ^ this.getVideo() == null)
            return false;
        if (other.getVideo() != null && other.getVideo().equals(this.getVideo()) == false)
            return false;
        if (other.getClientRequestToken() == null ^ this.getClientRequestToken() == null)
            return false;
        if (other.getClientRequestToken() != null && other.getClientRequestToken().equals(this.getClientRequestToken()) == false)
            return false;
        if (other.getNotificationChannel() == null ^ this.getNotificationChannel() == null)
            return false;
        if (other.getNotificationChannel() != null && other.getNotificationChannel().equals(this.getNotificationChannel()) == false)
            return false;
        if (other.getJobTag() == null ^ this.getJobTag() == null)
            return false;
        if (other.getJobTag() != null && other.getJobTag().equals(this.getJobTag()) == false)
            return false;
        if (other.getFilters() == null ^ this.getFilters() == null)
            return false;
        if (other.getFilters() != null && other.getFilters().equals(this.getFilters()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getVideo() == null) ? 0 : getVideo().hashCode());
        hashCode = prime * hashCode + ((getClientRequestToken() == null) ? 0 : getClientRequestToken().hashCode());
        hashCode = prime * hashCode + ((getNotificationChannel() == null) ? 0 : getNotificationChannel().hashCode());
        hashCode = prime * hashCode + ((getJobTag() == null) ? 0 : getJobTag().hashCode());
        hashCode = prime * hashCode + ((getFilters() == null) ? 0 : getFilters().hashCode());
        return hashCode;
    }

    @Override
    public StartTextDetectionRequest clone() {
        return (StartTextDetectionRequest) super.clone();
    }

}
