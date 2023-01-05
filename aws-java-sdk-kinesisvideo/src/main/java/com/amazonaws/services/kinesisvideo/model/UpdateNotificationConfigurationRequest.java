/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.kinesisvideo.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesisvideo-2017-09-30/UpdateNotificationConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateNotificationConfigurationRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the stream from which to update the notification configuration. You must specify either the
     * <code>StreamName</code> or the <code>StreamARN</code>.
     * </p>
     */
    private String streamName;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Kinesis video stream from where you want to update the notification
     * configuration. You must specify either the <code>StreamName</code> or the <code>StreamARN</code>.
     * </p>
     */
    private String streamARN;
    /**
     * <p>
     * The structure containing the information required for notifications. If the structure is null, the configuration
     * will be deleted from the stream.
     * </p>
     */
    private NotificationConfiguration notificationConfiguration;

    /**
     * <p>
     * The name of the stream from which to update the notification configuration. You must specify either the
     * <code>StreamName</code> or the <code>StreamARN</code>.
     * </p>
     * 
     * @param streamName
     *        The name of the stream from which to update the notification configuration. You must specify either the
     *        <code>StreamName</code> or the <code>StreamARN</code>.
     */

    public void setStreamName(String streamName) {
        this.streamName = streamName;
    }

    /**
     * <p>
     * The name of the stream from which to update the notification configuration. You must specify either the
     * <code>StreamName</code> or the <code>StreamARN</code>.
     * </p>
     * 
     * @return The name of the stream from which to update the notification configuration. You must specify either the
     *         <code>StreamName</code> or the <code>StreamARN</code>.
     */

    public String getStreamName() {
        return this.streamName;
    }

    /**
     * <p>
     * The name of the stream from which to update the notification configuration. You must specify either the
     * <code>StreamName</code> or the <code>StreamARN</code>.
     * </p>
     * 
     * @param streamName
     *        The name of the stream from which to update the notification configuration. You must specify either the
     *        <code>StreamName</code> or the <code>StreamARN</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateNotificationConfigurationRequest withStreamName(String streamName) {
        setStreamName(streamName);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Kinesis video stream from where you want to update the notification
     * configuration. You must specify either the <code>StreamName</code> or the <code>StreamARN</code>.
     * </p>
     * 
     * @param streamARN
     *        The Amazon Resource Name (ARN) of the Kinesis video stream from where you want to update the notification
     *        configuration. You must specify either the <code>StreamName</code> or the <code>StreamARN</code>.
     */

    public void setStreamARN(String streamARN) {
        this.streamARN = streamARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Kinesis video stream from where you want to update the notification
     * configuration. You must specify either the <code>StreamName</code> or the <code>StreamARN</code>.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the Kinesis video stream from where you want to update the notification
     *         configuration. You must specify either the <code>StreamName</code> or the <code>StreamARN</code>.
     */

    public String getStreamARN() {
        return this.streamARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Kinesis video stream from where you want to update the notification
     * configuration. You must specify either the <code>StreamName</code> or the <code>StreamARN</code>.
     * </p>
     * 
     * @param streamARN
     *        The Amazon Resource Name (ARN) of the Kinesis video stream from where you want to update the notification
     *        configuration. You must specify either the <code>StreamName</code> or the <code>StreamARN</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateNotificationConfigurationRequest withStreamARN(String streamARN) {
        setStreamARN(streamARN);
        return this;
    }

    /**
     * <p>
     * The structure containing the information required for notifications. If the structure is null, the configuration
     * will be deleted from the stream.
     * </p>
     * 
     * @param notificationConfiguration
     *        The structure containing the information required for notifications. If the structure is null, the
     *        configuration will be deleted from the stream.
     */

    public void setNotificationConfiguration(NotificationConfiguration notificationConfiguration) {
        this.notificationConfiguration = notificationConfiguration;
    }

    /**
     * <p>
     * The structure containing the information required for notifications. If the structure is null, the configuration
     * will be deleted from the stream.
     * </p>
     * 
     * @return The structure containing the information required for notifications. If the structure is null, the
     *         configuration will be deleted from the stream.
     */

    public NotificationConfiguration getNotificationConfiguration() {
        return this.notificationConfiguration;
    }

    /**
     * <p>
     * The structure containing the information required for notifications. If the structure is null, the configuration
     * will be deleted from the stream.
     * </p>
     * 
     * @param notificationConfiguration
     *        The structure containing the information required for notifications. If the structure is null, the
     *        configuration will be deleted from the stream.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateNotificationConfigurationRequest withNotificationConfiguration(NotificationConfiguration notificationConfiguration) {
        setNotificationConfiguration(notificationConfiguration);
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
        if (getStreamName() != null)
            sb.append("StreamName: ").append(getStreamName()).append(",");
        if (getStreamARN() != null)
            sb.append("StreamARN: ").append(getStreamARN()).append(",");
        if (getNotificationConfiguration() != null)
            sb.append("NotificationConfiguration: ").append(getNotificationConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateNotificationConfigurationRequest == false)
            return false;
        UpdateNotificationConfigurationRequest other = (UpdateNotificationConfigurationRequest) obj;
        if (other.getStreamName() == null ^ this.getStreamName() == null)
            return false;
        if (other.getStreamName() != null && other.getStreamName().equals(this.getStreamName()) == false)
            return false;
        if (other.getStreamARN() == null ^ this.getStreamARN() == null)
            return false;
        if (other.getStreamARN() != null && other.getStreamARN().equals(this.getStreamARN()) == false)
            return false;
        if (other.getNotificationConfiguration() == null ^ this.getNotificationConfiguration() == null)
            return false;
        if (other.getNotificationConfiguration() != null && other.getNotificationConfiguration().equals(this.getNotificationConfiguration()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStreamName() == null) ? 0 : getStreamName().hashCode());
        hashCode = prime * hashCode + ((getStreamARN() == null) ? 0 : getStreamARN().hashCode());
        hashCode = prime * hashCode + ((getNotificationConfiguration() == null) ? 0 : getNotificationConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public UpdateNotificationConfigurationRequest clone() {
        return (UpdateNotificationConfigurationRequest) super.clone();
    }

}
