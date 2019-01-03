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
package com.amazonaws.services.rekognition.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StartContentModerationRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The video in which you want to moderate content. The video must be stored in an Amazon S3 bucket.
     * </p>
     */
    private Video video;
    /**
     * <p>
     * Specifies the minimum confidence that Amazon Rekognition must have in order to return a moderated content label.
     * Confidence represents how certain Amazon Rekognition is that the moderated content is correctly identified. 0 is
     * the lowest confidence. 100 is the highest confidence. Amazon Rekognition doesn't return any moderated content
     * labels with a confidence level lower than this specified value. If you don't specify <code>MinConfidence</code>,
     * <code>GetContentModeration</code> returns labels with confidence values greater than or equal to 50 percent.
     * </p>
     */
    private Float minConfidence;
    /**
     * <p>
     * Idempotent token used to identify the start request. If you use the same token with multiple
     * <code>StartContentModeration</code> requests, the same <code>JobId</code> is returned. Use
     * <code>ClientRequestToken</code> to prevent the same job from being accidently started more than once.
     * </p>
     */
    private String clientRequestToken;
    /**
     * <p>
     * The Amazon SNS topic ARN that you want Amazon Rekognition Video to publish the completion status of the content
     * moderation analysis to.
     * </p>
     */
    private NotificationChannel notificationChannel;
    /**
     * <p>
     * Unique identifier you specify to identify the job in the completion status published to the Amazon Simple
     * Notification Service topic.
     * </p>
     */
    private String jobTag;

    /**
     * <p>
     * The video in which you want to moderate content. The video must be stored in an Amazon S3 bucket.
     * </p>
     * 
     * @param video
     *        The video in which you want to moderate content. The video must be stored in an Amazon S3 bucket.
     */

    public void setVideo(Video video) {
        this.video = video;
    }

    /**
     * <p>
     * The video in which you want to moderate content. The video must be stored in an Amazon S3 bucket.
     * </p>
     * 
     * @return The video in which you want to moderate content. The video must be stored in an Amazon S3 bucket.
     */

    public Video getVideo() {
        return this.video;
    }

    /**
     * <p>
     * The video in which you want to moderate content. The video must be stored in an Amazon S3 bucket.
     * </p>
     * 
     * @param video
     *        The video in which you want to moderate content. The video must be stored in an Amazon S3 bucket.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartContentModerationRequest withVideo(Video video) {
        setVideo(video);
        return this;
    }

    /**
     * <p>
     * Specifies the minimum confidence that Amazon Rekognition must have in order to return a moderated content label.
     * Confidence represents how certain Amazon Rekognition is that the moderated content is correctly identified. 0 is
     * the lowest confidence. 100 is the highest confidence. Amazon Rekognition doesn't return any moderated content
     * labels with a confidence level lower than this specified value. If you don't specify <code>MinConfidence</code>,
     * <code>GetContentModeration</code> returns labels with confidence values greater than or equal to 50 percent.
     * </p>
     * 
     * @param minConfidence
     *        Specifies the minimum confidence that Amazon Rekognition must have in order to return a moderated content
     *        label. Confidence represents how certain Amazon Rekognition is that the moderated content is correctly
     *        identified. 0 is the lowest confidence. 100 is the highest confidence. Amazon Rekognition doesn't return
     *        any moderated content labels with a confidence level lower than this specified value. If you don't specify
     *        <code>MinConfidence</code>, <code>GetContentModeration</code> returns labels with confidence values
     *        greater than or equal to 50 percent.
     */

    public void setMinConfidence(Float minConfidence) {
        this.minConfidence = minConfidence;
    }

    /**
     * <p>
     * Specifies the minimum confidence that Amazon Rekognition must have in order to return a moderated content label.
     * Confidence represents how certain Amazon Rekognition is that the moderated content is correctly identified. 0 is
     * the lowest confidence. 100 is the highest confidence. Amazon Rekognition doesn't return any moderated content
     * labels with a confidence level lower than this specified value. If you don't specify <code>MinConfidence</code>,
     * <code>GetContentModeration</code> returns labels with confidence values greater than or equal to 50 percent.
     * </p>
     * 
     * @return Specifies the minimum confidence that Amazon Rekognition must have in order to return a moderated content
     *         label. Confidence represents how certain Amazon Rekognition is that the moderated content is correctly
     *         identified. 0 is the lowest confidence. 100 is the highest confidence. Amazon Rekognition doesn't return
     *         any moderated content labels with a confidence level lower than this specified value. If you don't
     *         specify <code>MinConfidence</code>, <code>GetContentModeration</code> returns labels with confidence
     *         values greater than or equal to 50 percent.
     */

    public Float getMinConfidence() {
        return this.minConfidence;
    }

    /**
     * <p>
     * Specifies the minimum confidence that Amazon Rekognition must have in order to return a moderated content label.
     * Confidence represents how certain Amazon Rekognition is that the moderated content is correctly identified. 0 is
     * the lowest confidence. 100 is the highest confidence. Amazon Rekognition doesn't return any moderated content
     * labels with a confidence level lower than this specified value. If you don't specify <code>MinConfidence</code>,
     * <code>GetContentModeration</code> returns labels with confidence values greater than or equal to 50 percent.
     * </p>
     * 
     * @param minConfidence
     *        Specifies the minimum confidence that Amazon Rekognition must have in order to return a moderated content
     *        label. Confidence represents how certain Amazon Rekognition is that the moderated content is correctly
     *        identified. 0 is the lowest confidence. 100 is the highest confidence. Amazon Rekognition doesn't return
     *        any moderated content labels with a confidence level lower than this specified value. If you don't specify
     *        <code>MinConfidence</code>, <code>GetContentModeration</code> returns labels with confidence values
     *        greater than or equal to 50 percent.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartContentModerationRequest withMinConfidence(Float minConfidence) {
        setMinConfidence(minConfidence);
        return this;
    }

    /**
     * <p>
     * Idempotent token used to identify the start request. If you use the same token with multiple
     * <code>StartContentModeration</code> requests, the same <code>JobId</code> is returned. Use
     * <code>ClientRequestToken</code> to prevent the same job from being accidently started more than once.
     * </p>
     * 
     * @param clientRequestToken
     *        Idempotent token used to identify the start request. If you use the same token with multiple
     *        <code>StartContentModeration</code> requests, the same <code>JobId</code> is returned. Use
     *        <code>ClientRequestToken</code> to prevent the same job from being accidently started more than once.
     */

    public void setClientRequestToken(String clientRequestToken) {
        this.clientRequestToken = clientRequestToken;
    }

    /**
     * <p>
     * Idempotent token used to identify the start request. If you use the same token with multiple
     * <code>StartContentModeration</code> requests, the same <code>JobId</code> is returned. Use
     * <code>ClientRequestToken</code> to prevent the same job from being accidently started more than once.
     * </p>
     * 
     * @return Idempotent token used to identify the start request. If you use the same token with multiple
     *         <code>StartContentModeration</code> requests, the same <code>JobId</code> is returned. Use
     *         <code>ClientRequestToken</code> to prevent the same job from being accidently started more than once.
     */

    public String getClientRequestToken() {
        return this.clientRequestToken;
    }

    /**
     * <p>
     * Idempotent token used to identify the start request. If you use the same token with multiple
     * <code>StartContentModeration</code> requests, the same <code>JobId</code> is returned. Use
     * <code>ClientRequestToken</code> to prevent the same job from being accidently started more than once.
     * </p>
     * 
     * @param clientRequestToken
     *        Idempotent token used to identify the start request. If you use the same token with multiple
     *        <code>StartContentModeration</code> requests, the same <code>JobId</code> is returned. Use
     *        <code>ClientRequestToken</code> to prevent the same job from being accidently started more than once.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartContentModerationRequest withClientRequestToken(String clientRequestToken) {
        setClientRequestToken(clientRequestToken);
        return this;
    }

    /**
     * <p>
     * The Amazon SNS topic ARN that you want Amazon Rekognition Video to publish the completion status of the content
     * moderation analysis to.
     * </p>
     * 
     * @param notificationChannel
     *        The Amazon SNS topic ARN that you want Amazon Rekognition Video to publish the completion status of the
     *        content moderation analysis to.
     */

    public void setNotificationChannel(NotificationChannel notificationChannel) {
        this.notificationChannel = notificationChannel;
    }

    /**
     * <p>
     * The Amazon SNS topic ARN that you want Amazon Rekognition Video to publish the completion status of the content
     * moderation analysis to.
     * </p>
     * 
     * @return The Amazon SNS topic ARN that you want Amazon Rekognition Video to publish the completion status of the
     *         content moderation analysis to.
     */

    public NotificationChannel getNotificationChannel() {
        return this.notificationChannel;
    }

    /**
     * <p>
     * The Amazon SNS topic ARN that you want Amazon Rekognition Video to publish the completion status of the content
     * moderation analysis to.
     * </p>
     * 
     * @param notificationChannel
     *        The Amazon SNS topic ARN that you want Amazon Rekognition Video to publish the completion status of the
     *        content moderation analysis to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartContentModerationRequest withNotificationChannel(NotificationChannel notificationChannel) {
        setNotificationChannel(notificationChannel);
        return this;
    }

    /**
     * <p>
     * Unique identifier you specify to identify the job in the completion status published to the Amazon Simple
     * Notification Service topic.
     * </p>
     * 
     * @param jobTag
     *        Unique identifier you specify to identify the job in the completion status published to the Amazon Simple
     *        Notification Service topic.
     */

    public void setJobTag(String jobTag) {
        this.jobTag = jobTag;
    }

    /**
     * <p>
     * Unique identifier you specify to identify the job in the completion status published to the Amazon Simple
     * Notification Service topic.
     * </p>
     * 
     * @return Unique identifier you specify to identify the job in the completion status published to the Amazon Simple
     *         Notification Service topic.
     */

    public String getJobTag() {
        return this.jobTag;
    }

    /**
     * <p>
     * Unique identifier you specify to identify the job in the completion status published to the Amazon Simple
     * Notification Service topic.
     * </p>
     * 
     * @param jobTag
     *        Unique identifier you specify to identify the job in the completion status published to the Amazon Simple
     *        Notification Service topic.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartContentModerationRequest withJobTag(String jobTag) {
        setJobTag(jobTag);
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
        if (getMinConfidence() != null)
            sb.append("MinConfidence: ").append(getMinConfidence()).append(",");
        if (getClientRequestToken() != null)
            sb.append("ClientRequestToken: ").append(getClientRequestToken()).append(",");
        if (getNotificationChannel() != null)
            sb.append("NotificationChannel: ").append(getNotificationChannel()).append(",");
        if (getJobTag() != null)
            sb.append("JobTag: ").append(getJobTag());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StartContentModerationRequest == false)
            return false;
        StartContentModerationRequest other = (StartContentModerationRequest) obj;
        if (other.getVideo() == null ^ this.getVideo() == null)
            return false;
        if (other.getVideo() != null && other.getVideo().equals(this.getVideo()) == false)
            return false;
        if (other.getMinConfidence() == null ^ this.getMinConfidence() == null)
            return false;
        if (other.getMinConfidence() != null && other.getMinConfidence().equals(this.getMinConfidence()) == false)
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
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getVideo() == null) ? 0 : getVideo().hashCode());
        hashCode = prime * hashCode + ((getMinConfidence() == null) ? 0 : getMinConfidence().hashCode());
        hashCode = prime * hashCode + ((getClientRequestToken() == null) ? 0 : getClientRequestToken().hashCode());
        hashCode = prime * hashCode + ((getNotificationChannel() == null) ? 0 : getNotificationChannel().hashCode());
        hashCode = prime * hashCode + ((getJobTag() == null) ? 0 : getJobTag().hashCode());
        return hashCode;
    }

    @Override
    public StartContentModerationRequest clone() {
        return (StartContentModerationRequest) super.clone();
    }

}
