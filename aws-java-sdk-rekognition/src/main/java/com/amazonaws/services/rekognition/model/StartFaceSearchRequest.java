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
public class StartFaceSearchRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The video you want to search. The video must be stored in an Amazon S3 bucket.
     * </p>
     */
    private Video video;
    /**
     * <p>
     * Idempotent token used to identify the start request. If you use the same token with multiple
     * <code>StartFaceSearch</code> requests, the same <code>JobId</code> is returned. Use
     * <code>ClientRequestToken</code> to prevent the same job from being accidently started more than once.
     * </p>
     */
    private String clientRequestToken;
    /**
     * <p>
     * The minimum confidence in the person match to return. For example, don't return any matches where confidence in
     * matches is less than 70%.
     * </p>
     */
    private Float faceMatchThreshold;
    /**
     * <p>
     * ID of the collection that contains the faces you want to search for.
     * </p>
     */
    private String collectionId;
    /**
     * <p>
     * The ARN of the Amazon SNS topic to which you want Amazon Rekognition Video to publish the completion status of
     * the search.
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
     * The video you want to search. The video must be stored in an Amazon S3 bucket.
     * </p>
     * 
     * @param video
     *        The video you want to search. The video must be stored in an Amazon S3 bucket.
     */

    public void setVideo(Video video) {
        this.video = video;
    }

    /**
     * <p>
     * The video you want to search. The video must be stored in an Amazon S3 bucket.
     * </p>
     * 
     * @return The video you want to search. The video must be stored in an Amazon S3 bucket.
     */

    public Video getVideo() {
        return this.video;
    }

    /**
     * <p>
     * The video you want to search. The video must be stored in an Amazon S3 bucket.
     * </p>
     * 
     * @param video
     *        The video you want to search. The video must be stored in an Amazon S3 bucket.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartFaceSearchRequest withVideo(Video video) {
        setVideo(video);
        return this;
    }

    /**
     * <p>
     * Idempotent token used to identify the start request. If you use the same token with multiple
     * <code>StartFaceSearch</code> requests, the same <code>JobId</code> is returned. Use
     * <code>ClientRequestToken</code> to prevent the same job from being accidently started more than once.
     * </p>
     * 
     * @param clientRequestToken
     *        Idempotent token used to identify the start request. If you use the same token with multiple
     *        <code>StartFaceSearch</code> requests, the same <code>JobId</code> is returned. Use
     *        <code>ClientRequestToken</code> to prevent the same job from being accidently started more than once.
     */

    public void setClientRequestToken(String clientRequestToken) {
        this.clientRequestToken = clientRequestToken;
    }

    /**
     * <p>
     * Idempotent token used to identify the start request. If you use the same token with multiple
     * <code>StartFaceSearch</code> requests, the same <code>JobId</code> is returned. Use
     * <code>ClientRequestToken</code> to prevent the same job from being accidently started more than once.
     * </p>
     * 
     * @return Idempotent token used to identify the start request. If you use the same token with multiple
     *         <code>StartFaceSearch</code> requests, the same <code>JobId</code> is returned. Use
     *         <code>ClientRequestToken</code> to prevent the same job from being accidently started more than once.
     */

    public String getClientRequestToken() {
        return this.clientRequestToken;
    }

    /**
     * <p>
     * Idempotent token used to identify the start request. If you use the same token with multiple
     * <code>StartFaceSearch</code> requests, the same <code>JobId</code> is returned. Use
     * <code>ClientRequestToken</code> to prevent the same job from being accidently started more than once.
     * </p>
     * 
     * @param clientRequestToken
     *        Idempotent token used to identify the start request. If you use the same token with multiple
     *        <code>StartFaceSearch</code> requests, the same <code>JobId</code> is returned. Use
     *        <code>ClientRequestToken</code> to prevent the same job from being accidently started more than once.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartFaceSearchRequest withClientRequestToken(String clientRequestToken) {
        setClientRequestToken(clientRequestToken);
        return this;
    }

    /**
     * <p>
     * The minimum confidence in the person match to return. For example, don't return any matches where confidence in
     * matches is less than 70%.
     * </p>
     * 
     * @param faceMatchThreshold
     *        The minimum confidence in the person match to return. For example, don't return any matches where
     *        confidence in matches is less than 70%.
     */

    public void setFaceMatchThreshold(Float faceMatchThreshold) {
        this.faceMatchThreshold = faceMatchThreshold;
    }

    /**
     * <p>
     * The minimum confidence in the person match to return. For example, don't return any matches where confidence in
     * matches is less than 70%.
     * </p>
     * 
     * @return The minimum confidence in the person match to return. For example, don't return any matches where
     *         confidence in matches is less than 70%.
     */

    public Float getFaceMatchThreshold() {
        return this.faceMatchThreshold;
    }

    /**
     * <p>
     * The minimum confidence in the person match to return. For example, don't return any matches where confidence in
     * matches is less than 70%.
     * </p>
     * 
     * @param faceMatchThreshold
     *        The minimum confidence in the person match to return. For example, don't return any matches where
     *        confidence in matches is less than 70%.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartFaceSearchRequest withFaceMatchThreshold(Float faceMatchThreshold) {
        setFaceMatchThreshold(faceMatchThreshold);
        return this;
    }

    /**
     * <p>
     * ID of the collection that contains the faces you want to search for.
     * </p>
     * 
     * @param collectionId
     *        ID of the collection that contains the faces you want to search for.
     */

    public void setCollectionId(String collectionId) {
        this.collectionId = collectionId;
    }

    /**
     * <p>
     * ID of the collection that contains the faces you want to search for.
     * </p>
     * 
     * @return ID of the collection that contains the faces you want to search for.
     */

    public String getCollectionId() {
        return this.collectionId;
    }

    /**
     * <p>
     * ID of the collection that contains the faces you want to search for.
     * </p>
     * 
     * @param collectionId
     *        ID of the collection that contains the faces you want to search for.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartFaceSearchRequest withCollectionId(String collectionId) {
        setCollectionId(collectionId);
        return this;
    }

    /**
     * <p>
     * The ARN of the Amazon SNS topic to which you want Amazon Rekognition Video to publish the completion status of
     * the search.
     * </p>
     * 
     * @param notificationChannel
     *        The ARN of the Amazon SNS topic to which you want Amazon Rekognition Video to publish the completion
     *        status of the search.
     */

    public void setNotificationChannel(NotificationChannel notificationChannel) {
        this.notificationChannel = notificationChannel;
    }

    /**
     * <p>
     * The ARN of the Amazon SNS topic to which you want Amazon Rekognition Video to publish the completion status of
     * the search.
     * </p>
     * 
     * @return The ARN of the Amazon SNS topic to which you want Amazon Rekognition Video to publish the completion
     *         status of the search.
     */

    public NotificationChannel getNotificationChannel() {
        return this.notificationChannel;
    }

    /**
     * <p>
     * The ARN of the Amazon SNS topic to which you want Amazon Rekognition Video to publish the completion status of
     * the search.
     * </p>
     * 
     * @param notificationChannel
     *        The ARN of the Amazon SNS topic to which you want Amazon Rekognition Video to publish the completion
     *        status of the search.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartFaceSearchRequest withNotificationChannel(NotificationChannel notificationChannel) {
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

    public StartFaceSearchRequest withJobTag(String jobTag) {
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
        if (getClientRequestToken() != null)
            sb.append("ClientRequestToken: ").append(getClientRequestToken()).append(",");
        if (getFaceMatchThreshold() != null)
            sb.append("FaceMatchThreshold: ").append(getFaceMatchThreshold()).append(",");
        if (getCollectionId() != null)
            sb.append("CollectionId: ").append(getCollectionId()).append(",");
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

        if (obj instanceof StartFaceSearchRequest == false)
            return false;
        StartFaceSearchRequest other = (StartFaceSearchRequest) obj;
        if (other.getVideo() == null ^ this.getVideo() == null)
            return false;
        if (other.getVideo() != null && other.getVideo().equals(this.getVideo()) == false)
            return false;
        if (other.getClientRequestToken() == null ^ this.getClientRequestToken() == null)
            return false;
        if (other.getClientRequestToken() != null && other.getClientRequestToken().equals(this.getClientRequestToken()) == false)
            return false;
        if (other.getFaceMatchThreshold() == null ^ this.getFaceMatchThreshold() == null)
            return false;
        if (other.getFaceMatchThreshold() != null && other.getFaceMatchThreshold().equals(this.getFaceMatchThreshold()) == false)
            return false;
        if (other.getCollectionId() == null ^ this.getCollectionId() == null)
            return false;
        if (other.getCollectionId() != null && other.getCollectionId().equals(this.getCollectionId()) == false)
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
        hashCode = prime * hashCode + ((getClientRequestToken() == null) ? 0 : getClientRequestToken().hashCode());
        hashCode = prime * hashCode + ((getFaceMatchThreshold() == null) ? 0 : getFaceMatchThreshold().hashCode());
        hashCode = prime * hashCode + ((getCollectionId() == null) ? 0 : getCollectionId().hashCode());
        hashCode = prime * hashCode + ((getNotificationChannel() == null) ? 0 : getNotificationChannel().hashCode());
        hashCode = prime * hashCode + ((getJobTag() == null) ? 0 : getJobTag().hashCode());
        return hashCode;
    }

    @Override
    public StartFaceSearchRequest clone() {
        return (StartFaceSearchRequest) super.clone();
    }

}
