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
package com.amazonaws.services.elastictranscoder.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * The <code>UpdatePipelineNotificationsRequest</code> structure.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdatePipelineNotificationsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier of the pipeline for which you want to change notification settings.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The topic ARN for the Amazon Simple Notification Service (Amazon SNS) topic that you want to notify to report job
     * status.
     * </p>
     * <important>
     * <p>
     * To receive notifications, you must also subscribe to the new topic in the Amazon SNS console.
     * </p>
     * </important>
     * <ul>
     * <li>
     * <p>
     * <b>Progressing</b>: The topic ARN for the Amazon Simple Notification Service (Amazon SNS) topic that you want to
     * notify when Elastic Transcoder has started to process jobs that are added to this pipeline. This is the ARN that
     * Amazon SNS returned when you created the topic.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Complete</b>: The topic ARN for the Amazon SNS topic that you want to notify when Elastic Transcoder has
     * finished processing a job. This is the ARN that Amazon SNS returned when you created the topic.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Warning</b>: The topic ARN for the Amazon SNS topic that you want to notify when Elastic Transcoder encounters
     * a warning condition. This is the ARN that Amazon SNS returned when you created the topic.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Error</b>: The topic ARN for the Amazon SNS topic that you want to notify when Elastic Transcoder encounters
     * an error condition. This is the ARN that Amazon SNS returned when you created the topic.
     * </p>
     * </li>
     * </ul>
     */
    private Notifications notifications;

    /**
     * <p>
     * The identifier of the pipeline for which you want to change notification settings.
     * </p>
     * 
     * @param id
     *        The identifier of the pipeline for which you want to change notification settings.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The identifier of the pipeline for which you want to change notification settings.
     * </p>
     * 
     * @return The identifier of the pipeline for which you want to change notification settings.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The identifier of the pipeline for which you want to change notification settings.
     * </p>
     * 
     * @param id
     *        The identifier of the pipeline for which you want to change notification settings.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdatePipelineNotificationsRequest withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The topic ARN for the Amazon Simple Notification Service (Amazon SNS) topic that you want to notify to report job
     * status.
     * </p>
     * <important>
     * <p>
     * To receive notifications, you must also subscribe to the new topic in the Amazon SNS console.
     * </p>
     * </important>
     * <ul>
     * <li>
     * <p>
     * <b>Progressing</b>: The topic ARN for the Amazon Simple Notification Service (Amazon SNS) topic that you want to
     * notify when Elastic Transcoder has started to process jobs that are added to this pipeline. This is the ARN that
     * Amazon SNS returned when you created the topic.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Complete</b>: The topic ARN for the Amazon SNS topic that you want to notify when Elastic Transcoder has
     * finished processing a job. This is the ARN that Amazon SNS returned when you created the topic.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Warning</b>: The topic ARN for the Amazon SNS topic that you want to notify when Elastic Transcoder encounters
     * a warning condition. This is the ARN that Amazon SNS returned when you created the topic.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Error</b>: The topic ARN for the Amazon SNS topic that you want to notify when Elastic Transcoder encounters
     * an error condition. This is the ARN that Amazon SNS returned when you created the topic.
     * </p>
     * </li>
     * </ul>
     * 
     * @param notifications
     *        The topic ARN for the Amazon Simple Notification Service (Amazon SNS) topic that you want to notify to
     *        report job status.</p> <important>
     *        <p>
     *        To receive notifications, you must also subscribe to the new topic in the Amazon SNS console.
     *        </p>
     *        </important>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>Progressing</b>: The topic ARN for the Amazon Simple Notification Service (Amazon SNS) topic that you
     *        want to notify when Elastic Transcoder has started to process jobs that are added to this pipeline. This
     *        is the ARN that Amazon SNS returned when you created the topic.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>Complete</b>: The topic ARN for the Amazon SNS topic that you want to notify when Elastic Transcoder
     *        has finished processing a job. This is the ARN that Amazon SNS returned when you created the topic.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>Warning</b>: The topic ARN for the Amazon SNS topic that you want to notify when Elastic Transcoder
     *        encounters a warning condition. This is the ARN that Amazon SNS returned when you created the topic.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>Error</b>: The topic ARN for the Amazon SNS topic that you want to notify when Elastic Transcoder
     *        encounters an error condition. This is the ARN that Amazon SNS returned when you created the topic.
     *        </p>
     *        </li>
     */

    public void setNotifications(Notifications notifications) {
        this.notifications = notifications;
    }

    /**
     * <p>
     * The topic ARN for the Amazon Simple Notification Service (Amazon SNS) topic that you want to notify to report job
     * status.
     * </p>
     * <important>
     * <p>
     * To receive notifications, you must also subscribe to the new topic in the Amazon SNS console.
     * </p>
     * </important>
     * <ul>
     * <li>
     * <p>
     * <b>Progressing</b>: The topic ARN for the Amazon Simple Notification Service (Amazon SNS) topic that you want to
     * notify when Elastic Transcoder has started to process jobs that are added to this pipeline. This is the ARN that
     * Amazon SNS returned when you created the topic.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Complete</b>: The topic ARN for the Amazon SNS topic that you want to notify when Elastic Transcoder has
     * finished processing a job. This is the ARN that Amazon SNS returned when you created the topic.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Warning</b>: The topic ARN for the Amazon SNS topic that you want to notify when Elastic Transcoder encounters
     * a warning condition. This is the ARN that Amazon SNS returned when you created the topic.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Error</b>: The topic ARN for the Amazon SNS topic that you want to notify when Elastic Transcoder encounters
     * an error condition. This is the ARN that Amazon SNS returned when you created the topic.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The topic ARN for the Amazon Simple Notification Service (Amazon SNS) topic that you want to notify to
     *         report job status.</p> <important>
     *         <p>
     *         To receive notifications, you must also subscribe to the new topic in the Amazon SNS console.
     *         </p>
     *         </important>
     *         <ul>
     *         <li>
     *         <p>
     *         <b>Progressing</b>: The topic ARN for the Amazon Simple Notification Service (Amazon SNS) topic that you
     *         want to notify when Elastic Transcoder has started to process jobs that are added to this pipeline. This
     *         is the ARN that Amazon SNS returned when you created the topic.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>Complete</b>: The topic ARN for the Amazon SNS topic that you want to notify when Elastic Transcoder
     *         has finished processing a job. This is the ARN that Amazon SNS returned when you created the topic.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>Warning</b>: The topic ARN for the Amazon SNS topic that you want to notify when Elastic Transcoder
     *         encounters a warning condition. This is the ARN that Amazon SNS returned when you created the topic.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>Error</b>: The topic ARN for the Amazon SNS topic that you want to notify when Elastic Transcoder
     *         encounters an error condition. This is the ARN that Amazon SNS returned when you created the topic.
     *         </p>
     *         </li>
     */

    public Notifications getNotifications() {
        return this.notifications;
    }

    /**
     * <p>
     * The topic ARN for the Amazon Simple Notification Service (Amazon SNS) topic that you want to notify to report job
     * status.
     * </p>
     * <important>
     * <p>
     * To receive notifications, you must also subscribe to the new topic in the Amazon SNS console.
     * </p>
     * </important>
     * <ul>
     * <li>
     * <p>
     * <b>Progressing</b>: The topic ARN for the Amazon Simple Notification Service (Amazon SNS) topic that you want to
     * notify when Elastic Transcoder has started to process jobs that are added to this pipeline. This is the ARN that
     * Amazon SNS returned when you created the topic.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Complete</b>: The topic ARN for the Amazon SNS topic that you want to notify when Elastic Transcoder has
     * finished processing a job. This is the ARN that Amazon SNS returned when you created the topic.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Warning</b>: The topic ARN for the Amazon SNS topic that you want to notify when Elastic Transcoder encounters
     * a warning condition. This is the ARN that Amazon SNS returned when you created the topic.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Error</b>: The topic ARN for the Amazon SNS topic that you want to notify when Elastic Transcoder encounters
     * an error condition. This is the ARN that Amazon SNS returned when you created the topic.
     * </p>
     * </li>
     * </ul>
     * 
     * @param notifications
     *        The topic ARN for the Amazon Simple Notification Service (Amazon SNS) topic that you want to notify to
     *        report job status.</p> <important>
     *        <p>
     *        To receive notifications, you must also subscribe to the new topic in the Amazon SNS console.
     *        </p>
     *        </important>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>Progressing</b>: The topic ARN for the Amazon Simple Notification Service (Amazon SNS) topic that you
     *        want to notify when Elastic Transcoder has started to process jobs that are added to this pipeline. This
     *        is the ARN that Amazon SNS returned when you created the topic.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>Complete</b>: The topic ARN for the Amazon SNS topic that you want to notify when Elastic Transcoder
     *        has finished processing a job. This is the ARN that Amazon SNS returned when you created the topic.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>Warning</b>: The topic ARN for the Amazon SNS topic that you want to notify when Elastic Transcoder
     *        encounters a warning condition. This is the ARN that Amazon SNS returned when you created the topic.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>Error</b>: The topic ARN for the Amazon SNS topic that you want to notify when Elastic Transcoder
     *        encounters an error condition. This is the ARN that Amazon SNS returned when you created the topic.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdatePipelineNotificationsRequest withNotifications(Notifications notifications) {
        setNotifications(notifications);
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
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getNotifications() != null)
            sb.append("Notifications: ").append(getNotifications());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdatePipelineNotificationsRequest == false)
            return false;
        UpdatePipelineNotificationsRequest other = (UpdatePipelineNotificationsRequest) obj;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getNotifications() == null ^ this.getNotifications() == null)
            return false;
        if (other.getNotifications() != null && other.getNotifications().equals(this.getNotifications()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getNotifications() == null) ? 0 : getNotifications().hashCode());
        return hashCode;
    }

    @Override
    public UpdatePipelineNotificationsRequest clone() {
        return (UpdatePipelineNotificationsRequest) super.clone();
    }

}
