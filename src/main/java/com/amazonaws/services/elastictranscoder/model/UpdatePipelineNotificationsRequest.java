/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.elastictranscoder.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.elastictranscoder.AmazonElasticTranscoder#updatePipelineNotifications(UpdatePipelineNotificationsRequest) UpdatePipelineNotifications operation}.
 * <p>
 * With the UpdatePipelineNotifications operation, you can update Amazon Simple Notification Service (Amazon SNS) notifications for a pipeline.
 * </p>
 * <p>
 * When you update notifications for a pipeline, Elastic Transcoder returns the values that you specified in the request.
 * </p>
 *
 * @see com.amazonaws.services.elastictranscoder.AmazonElasticTranscoder#updatePipelineNotifications(UpdatePipelineNotificationsRequest)
 */
public class UpdatePipelineNotificationsRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * The identifier of the pipeline for which you want to change
     * notification settings.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^\d{13}-\w{6}$<br/>
     */
    private String id;

    /**
     * The topic ARN for the Amazon Simple Notification Service (Amazon SNS)
     * topic that you want to notify to report job status. <important>To
     * receive notifications, you must also subscribe to the new topic in the
     * Amazon SNS console.</important> <ul> <li><b>Progressing</b>: The topic
     * ARN for the Amazon Simple Notification Service (Amazon SNS) topic that
     * you want to notify when Elastic Transcoder has started to process jobs
     * that are added to this pipeline. This is the ARN that Amazon SNS
     * returned when you created the topic.</li> <li><b>Completed</b>: The
     * topic ARN for the Amazon SNS topic that you want to notify when
     * Elastic Transcoder has finished processing a job. This is the ARN that
     * Amazon SNS returned when you created the topic.</li>
     * <li><b>Warning</b>: The topic ARN for the Amazon SNS topic that you
     * want to notify when Elastic Transcoder encounters a warning condition.
     * This is the ARN that Amazon SNS returned when you created the
     * topic.</li> <li><b>Error</b>: The topic ARN for the Amazon SNS topic
     * that you want to notify when Elastic Transcoder encounters an error
     * condition. This is the ARN that Amazon SNS returned when you created
     * the topic.</li> </ul>
     */
    private Notifications notifications;

    /**
     * The identifier of the pipeline for which you want to change
     * notification settings.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^\d{13}-\w{6}$<br/>
     *
     * @return The identifier of the pipeline for which you want to change
     *         notification settings.
     */
    public String getId() {
        return id;
    }
    
    /**
     * The identifier of the pipeline for which you want to change
     * notification settings.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^\d{13}-\w{6}$<br/>
     *
     * @param id The identifier of the pipeline for which you want to change
     *         notification settings.
     */
    public void setId(String id) {
        this.id = id;
    }
    
    /**
     * The identifier of the pipeline for which you want to change
     * notification settings.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^\d{13}-\w{6}$<br/>
     *
     * @param id The identifier of the pipeline for which you want to change
     *         notification settings.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public UpdatePipelineNotificationsRequest withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * The topic ARN for the Amazon Simple Notification Service (Amazon SNS)
     * topic that you want to notify to report job status. <important>To
     * receive notifications, you must also subscribe to the new topic in the
     * Amazon SNS console.</important> <ul> <li><b>Progressing</b>: The topic
     * ARN for the Amazon Simple Notification Service (Amazon SNS) topic that
     * you want to notify when Elastic Transcoder has started to process jobs
     * that are added to this pipeline. This is the ARN that Amazon SNS
     * returned when you created the topic.</li> <li><b>Completed</b>: The
     * topic ARN for the Amazon SNS topic that you want to notify when
     * Elastic Transcoder has finished processing a job. This is the ARN that
     * Amazon SNS returned when you created the topic.</li>
     * <li><b>Warning</b>: The topic ARN for the Amazon SNS topic that you
     * want to notify when Elastic Transcoder encounters a warning condition.
     * This is the ARN that Amazon SNS returned when you created the
     * topic.</li> <li><b>Error</b>: The topic ARN for the Amazon SNS topic
     * that you want to notify when Elastic Transcoder encounters an error
     * condition. This is the ARN that Amazon SNS returned when you created
     * the topic.</li> </ul>
     *
     * @return The topic ARN for the Amazon Simple Notification Service (Amazon SNS)
     *         topic that you want to notify to report job status. <important>To
     *         receive notifications, you must also subscribe to the new topic in the
     *         Amazon SNS console.</important> <ul> <li><b>Progressing</b>: The topic
     *         ARN for the Amazon Simple Notification Service (Amazon SNS) topic that
     *         you want to notify when Elastic Transcoder has started to process jobs
     *         that are added to this pipeline. This is the ARN that Amazon SNS
     *         returned when you created the topic.</li> <li><b>Completed</b>: The
     *         topic ARN for the Amazon SNS topic that you want to notify when
     *         Elastic Transcoder has finished processing a job. This is the ARN that
     *         Amazon SNS returned when you created the topic.</li>
     *         <li><b>Warning</b>: The topic ARN for the Amazon SNS topic that you
     *         want to notify when Elastic Transcoder encounters a warning condition.
     *         This is the ARN that Amazon SNS returned when you created the
     *         topic.</li> <li><b>Error</b>: The topic ARN for the Amazon SNS topic
     *         that you want to notify when Elastic Transcoder encounters an error
     *         condition. This is the ARN that Amazon SNS returned when you created
     *         the topic.</li> </ul>
     */
    public Notifications getNotifications() {
        return notifications;
    }
    
    /**
     * The topic ARN for the Amazon Simple Notification Service (Amazon SNS)
     * topic that you want to notify to report job status. <important>To
     * receive notifications, you must also subscribe to the new topic in the
     * Amazon SNS console.</important> <ul> <li><b>Progressing</b>: The topic
     * ARN for the Amazon Simple Notification Service (Amazon SNS) topic that
     * you want to notify when Elastic Transcoder has started to process jobs
     * that are added to this pipeline. This is the ARN that Amazon SNS
     * returned when you created the topic.</li> <li><b>Completed</b>: The
     * topic ARN for the Amazon SNS topic that you want to notify when
     * Elastic Transcoder has finished processing a job. This is the ARN that
     * Amazon SNS returned when you created the topic.</li>
     * <li><b>Warning</b>: The topic ARN for the Amazon SNS topic that you
     * want to notify when Elastic Transcoder encounters a warning condition.
     * This is the ARN that Amazon SNS returned when you created the
     * topic.</li> <li><b>Error</b>: The topic ARN for the Amazon SNS topic
     * that you want to notify when Elastic Transcoder encounters an error
     * condition. This is the ARN that Amazon SNS returned when you created
     * the topic.</li> </ul>
     *
     * @param notifications The topic ARN for the Amazon Simple Notification Service (Amazon SNS)
     *         topic that you want to notify to report job status. <important>To
     *         receive notifications, you must also subscribe to the new topic in the
     *         Amazon SNS console.</important> <ul> <li><b>Progressing</b>: The topic
     *         ARN for the Amazon Simple Notification Service (Amazon SNS) topic that
     *         you want to notify when Elastic Transcoder has started to process jobs
     *         that are added to this pipeline. This is the ARN that Amazon SNS
     *         returned when you created the topic.</li> <li><b>Completed</b>: The
     *         topic ARN for the Amazon SNS topic that you want to notify when
     *         Elastic Transcoder has finished processing a job. This is the ARN that
     *         Amazon SNS returned when you created the topic.</li>
     *         <li><b>Warning</b>: The topic ARN for the Amazon SNS topic that you
     *         want to notify when Elastic Transcoder encounters a warning condition.
     *         This is the ARN that Amazon SNS returned when you created the
     *         topic.</li> <li><b>Error</b>: The topic ARN for the Amazon SNS topic
     *         that you want to notify when Elastic Transcoder encounters an error
     *         condition. This is the ARN that Amazon SNS returned when you created
     *         the topic.</li> </ul>
     */
    public void setNotifications(Notifications notifications) {
        this.notifications = notifications;
    }
    
    /**
     * The topic ARN for the Amazon Simple Notification Service (Amazon SNS)
     * topic that you want to notify to report job status. <important>To
     * receive notifications, you must also subscribe to the new topic in the
     * Amazon SNS console.</important> <ul> <li><b>Progressing</b>: The topic
     * ARN for the Amazon Simple Notification Service (Amazon SNS) topic that
     * you want to notify when Elastic Transcoder has started to process jobs
     * that are added to this pipeline. This is the ARN that Amazon SNS
     * returned when you created the topic.</li> <li><b>Completed</b>: The
     * topic ARN for the Amazon SNS topic that you want to notify when
     * Elastic Transcoder has finished processing a job. This is the ARN that
     * Amazon SNS returned when you created the topic.</li>
     * <li><b>Warning</b>: The topic ARN for the Amazon SNS topic that you
     * want to notify when Elastic Transcoder encounters a warning condition.
     * This is the ARN that Amazon SNS returned when you created the
     * topic.</li> <li><b>Error</b>: The topic ARN for the Amazon SNS topic
     * that you want to notify when Elastic Transcoder encounters an error
     * condition. This is the ARN that Amazon SNS returned when you created
     * the topic.</li> </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param notifications The topic ARN for the Amazon Simple Notification Service (Amazon SNS)
     *         topic that you want to notify to report job status. <important>To
     *         receive notifications, you must also subscribe to the new topic in the
     *         Amazon SNS console.</important> <ul> <li><b>Progressing</b>: The topic
     *         ARN for the Amazon Simple Notification Service (Amazon SNS) topic that
     *         you want to notify when Elastic Transcoder has started to process jobs
     *         that are added to this pipeline. This is the ARN that Amazon SNS
     *         returned when you created the topic.</li> <li><b>Completed</b>: The
     *         topic ARN for the Amazon SNS topic that you want to notify when
     *         Elastic Transcoder has finished processing a job. This is the ARN that
     *         Amazon SNS returned when you created the topic.</li>
     *         <li><b>Warning</b>: The topic ARN for the Amazon SNS topic that you
     *         want to notify when Elastic Transcoder encounters a warning condition.
     *         This is the ARN that Amazon SNS returned when you created the
     *         topic.</li> <li><b>Error</b>: The topic ARN for the Amazon SNS topic
     *         that you want to notify when Elastic Transcoder encounters an error
     *         condition. This is the ARN that Amazon SNS returned when you created
     *         the topic.</li> </ul>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public UpdatePipelineNotificationsRequest withNotifications(Notifications notifications) {
        this.notifications = notifications;
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getId() != null) sb.append("Id: " + getId() + ",");
        if (getNotifications() != null) sb.append("Notifications: " + getNotifications() );
        sb.append("}");
        return sb.toString();
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
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof UpdatePipelineNotificationsRequest == false) return false;
        UpdatePipelineNotificationsRequest other = (UpdatePipelineNotificationsRequest)obj;
        
        if (other.getId() == null ^ this.getId() == null) return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false) return false; 
        if (other.getNotifications() == null ^ this.getNotifications() == null) return false;
        if (other.getNotifications() != null && other.getNotifications().equals(this.getNotifications()) == false) return false; 
        return true;
    }
    
}
    