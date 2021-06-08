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
package com.amazonaws.services.rekognition.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StartSegmentDetectionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    private Video video;
    /**
     * <p>
     * Idempotent token used to identify the start request. If you use the same token with multiple
     * <code>StartSegmentDetection</code> requests, the same <code>JobId</code> is returned. Use
     * <code>ClientRequestToken</code> to prevent the same job from being accidently started more than once.
     * </p>
     */
    private String clientRequestToken;
    /**
     * <p>
     * The ARN of the Amazon SNS topic to which you want Amazon Rekognition Video to publish the completion status of
     * the segment detection operation.
     * </p>
     */
    private NotificationChannel notificationChannel;
    /**
     * <p>
     * An identifier you specify that's returned in the completion notification that's published to your Amazon Simple
     * Notification Service topic. For example, you can use <code>JobTag</code> to group related jobs and identify them
     * in the completion notification.
     * </p>
     */
    private String jobTag;
    /**
     * <p>
     * Filters for technical cue or shot detection.
     * </p>
     */
    private StartSegmentDetectionFilters filters;
    /**
     * <p>
     * An array of segment types to detect in the video. Valid values are TECHNICAL_CUE and SHOT.
     * </p>
     */
    private java.util.List<String> segmentTypes;

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

    public StartSegmentDetectionRequest withVideo(Video video) {
        setVideo(video);
        return this;
    }

    /**
     * <p>
     * Idempotent token used to identify the start request. If you use the same token with multiple
     * <code>StartSegmentDetection</code> requests, the same <code>JobId</code> is returned. Use
     * <code>ClientRequestToken</code> to prevent the same job from being accidently started more than once.
     * </p>
     * 
     * @param clientRequestToken
     *        Idempotent token used to identify the start request. If you use the same token with multiple
     *        <code>StartSegmentDetection</code> requests, the same <code>JobId</code> is returned. Use
     *        <code>ClientRequestToken</code> to prevent the same job from being accidently started more than once.
     */

    public void setClientRequestToken(String clientRequestToken) {
        this.clientRequestToken = clientRequestToken;
    }

    /**
     * <p>
     * Idempotent token used to identify the start request. If you use the same token with multiple
     * <code>StartSegmentDetection</code> requests, the same <code>JobId</code> is returned. Use
     * <code>ClientRequestToken</code> to prevent the same job from being accidently started more than once.
     * </p>
     * 
     * @return Idempotent token used to identify the start request. If you use the same token with multiple
     *         <code>StartSegmentDetection</code> requests, the same <code>JobId</code> is returned. Use
     *         <code>ClientRequestToken</code> to prevent the same job from being accidently started more than once.
     */

    public String getClientRequestToken() {
        return this.clientRequestToken;
    }

    /**
     * <p>
     * Idempotent token used to identify the start request. If you use the same token with multiple
     * <code>StartSegmentDetection</code> requests, the same <code>JobId</code> is returned. Use
     * <code>ClientRequestToken</code> to prevent the same job from being accidently started more than once.
     * </p>
     * 
     * @param clientRequestToken
     *        Idempotent token used to identify the start request. If you use the same token with multiple
     *        <code>StartSegmentDetection</code> requests, the same <code>JobId</code> is returned. Use
     *        <code>ClientRequestToken</code> to prevent the same job from being accidently started more than once.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartSegmentDetectionRequest withClientRequestToken(String clientRequestToken) {
        setClientRequestToken(clientRequestToken);
        return this;
    }

    /**
     * <p>
     * The ARN of the Amazon SNS topic to which you want Amazon Rekognition Video to publish the completion status of
     * the segment detection operation.
     * </p>
     * 
     * @param notificationChannel
     *        The ARN of the Amazon SNS topic to which you want Amazon Rekognition Video to publish the completion
     *        status of the segment detection operation.
     */

    public void setNotificationChannel(NotificationChannel notificationChannel) {
        this.notificationChannel = notificationChannel;
    }

    /**
     * <p>
     * The ARN of the Amazon SNS topic to which you want Amazon Rekognition Video to publish the completion status of
     * the segment detection operation.
     * </p>
     * 
     * @return The ARN of the Amazon SNS topic to which you want Amazon Rekognition Video to publish the completion
     *         status of the segment detection operation.
     */

    public NotificationChannel getNotificationChannel() {
        return this.notificationChannel;
    }

    /**
     * <p>
     * The ARN of the Amazon SNS topic to which you want Amazon Rekognition Video to publish the completion status of
     * the segment detection operation.
     * </p>
     * 
     * @param notificationChannel
     *        The ARN of the Amazon SNS topic to which you want Amazon Rekognition Video to publish the completion
     *        status of the segment detection operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartSegmentDetectionRequest withNotificationChannel(NotificationChannel notificationChannel) {
        setNotificationChannel(notificationChannel);
        return this;
    }

    /**
     * <p>
     * An identifier you specify that's returned in the completion notification that's published to your Amazon Simple
     * Notification Service topic. For example, you can use <code>JobTag</code> to group related jobs and identify them
     * in the completion notification.
     * </p>
     * 
     * @param jobTag
     *        An identifier you specify that's returned in the completion notification that's published to your Amazon
     *        Simple Notification Service topic. For example, you can use <code>JobTag</code> to group related jobs and
     *        identify them in the completion notification.
     */

    public void setJobTag(String jobTag) {
        this.jobTag = jobTag;
    }

    /**
     * <p>
     * An identifier you specify that's returned in the completion notification that's published to your Amazon Simple
     * Notification Service topic. For example, you can use <code>JobTag</code> to group related jobs and identify them
     * in the completion notification.
     * </p>
     * 
     * @return An identifier you specify that's returned in the completion notification that's published to your Amazon
     *         Simple Notification Service topic. For example, you can use <code>JobTag</code> to group related jobs and
     *         identify them in the completion notification.
     */

    public String getJobTag() {
        return this.jobTag;
    }

    /**
     * <p>
     * An identifier you specify that's returned in the completion notification that's published to your Amazon Simple
     * Notification Service topic. For example, you can use <code>JobTag</code> to group related jobs and identify them
     * in the completion notification.
     * </p>
     * 
     * @param jobTag
     *        An identifier you specify that's returned in the completion notification that's published to your Amazon
     *        Simple Notification Service topic. For example, you can use <code>JobTag</code> to group related jobs and
     *        identify them in the completion notification.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartSegmentDetectionRequest withJobTag(String jobTag) {
        setJobTag(jobTag);
        return this;
    }

    /**
     * <p>
     * Filters for technical cue or shot detection.
     * </p>
     * 
     * @param filters
     *        Filters for technical cue or shot detection.
     */

    public void setFilters(StartSegmentDetectionFilters filters) {
        this.filters = filters;
    }

    /**
     * <p>
     * Filters for technical cue or shot detection.
     * </p>
     * 
     * @return Filters for technical cue or shot detection.
     */

    public StartSegmentDetectionFilters getFilters() {
        return this.filters;
    }

    /**
     * <p>
     * Filters for technical cue or shot detection.
     * </p>
     * 
     * @param filters
     *        Filters for technical cue or shot detection.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartSegmentDetectionRequest withFilters(StartSegmentDetectionFilters filters) {
        setFilters(filters);
        return this;
    }

    /**
     * <p>
     * An array of segment types to detect in the video. Valid values are TECHNICAL_CUE and SHOT.
     * </p>
     * 
     * @return An array of segment types to detect in the video. Valid values are TECHNICAL_CUE and SHOT.
     * @see SegmentType
     */

    public java.util.List<String> getSegmentTypes() {
        return segmentTypes;
    }

    /**
     * <p>
     * An array of segment types to detect in the video. Valid values are TECHNICAL_CUE and SHOT.
     * </p>
     * 
     * @param segmentTypes
     *        An array of segment types to detect in the video. Valid values are TECHNICAL_CUE and SHOT.
     * @see SegmentType
     */

    public void setSegmentTypes(java.util.Collection<String> segmentTypes) {
        if (segmentTypes == null) {
            this.segmentTypes = null;
            return;
        }

        this.segmentTypes = new java.util.ArrayList<String>(segmentTypes);
    }

    /**
     * <p>
     * An array of segment types to detect in the video. Valid values are TECHNICAL_CUE and SHOT.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSegmentTypes(java.util.Collection)} or {@link #withSegmentTypes(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param segmentTypes
     *        An array of segment types to detect in the video. Valid values are TECHNICAL_CUE and SHOT.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SegmentType
     */

    public StartSegmentDetectionRequest withSegmentTypes(String... segmentTypes) {
        if (this.segmentTypes == null) {
            setSegmentTypes(new java.util.ArrayList<String>(segmentTypes.length));
        }
        for (String ele : segmentTypes) {
            this.segmentTypes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of segment types to detect in the video. Valid values are TECHNICAL_CUE and SHOT.
     * </p>
     * 
     * @param segmentTypes
     *        An array of segment types to detect in the video. Valid values are TECHNICAL_CUE and SHOT.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SegmentType
     */

    public StartSegmentDetectionRequest withSegmentTypes(java.util.Collection<String> segmentTypes) {
        setSegmentTypes(segmentTypes);
        return this;
    }

    /**
     * <p>
     * An array of segment types to detect in the video. Valid values are TECHNICAL_CUE and SHOT.
     * </p>
     * 
     * @param segmentTypes
     *        An array of segment types to detect in the video. Valid values are TECHNICAL_CUE and SHOT.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SegmentType
     */

    public StartSegmentDetectionRequest withSegmentTypes(SegmentType... segmentTypes) {
        java.util.ArrayList<String> segmentTypesCopy = new java.util.ArrayList<String>(segmentTypes.length);
        for (SegmentType value : segmentTypes) {
            segmentTypesCopy.add(value.toString());
        }
        if (getSegmentTypes() == null) {
            setSegmentTypes(segmentTypesCopy);
        } else {
            getSegmentTypes().addAll(segmentTypesCopy);
        }
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
            sb.append("Filters: ").append(getFilters()).append(",");
        if (getSegmentTypes() != null)
            sb.append("SegmentTypes: ").append(getSegmentTypes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StartSegmentDetectionRequest == false)
            return false;
        StartSegmentDetectionRequest other = (StartSegmentDetectionRequest) obj;
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
        if (other.getSegmentTypes() == null ^ this.getSegmentTypes() == null)
            return false;
        if (other.getSegmentTypes() != null && other.getSegmentTypes().equals(this.getSegmentTypes()) == false)
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
        hashCode = prime * hashCode + ((getSegmentTypes() == null) ? 0 : getSegmentTypes().hashCode());
        return hashCode;
    }

    @Override
    public StartSegmentDetectionRequest clone() {
        return (StartSegmentDetectionRequest) super.clone();
    }

}
