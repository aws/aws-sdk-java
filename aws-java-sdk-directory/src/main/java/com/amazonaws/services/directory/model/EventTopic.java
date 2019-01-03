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
package com.amazonaws.services.directory.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about SNS topic and AWS Directory Service directory associations.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ds-2015-04-16/EventTopic" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EventTopic implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Directory ID of an AWS Directory Service directory that will publish status messages to an SNS topic.
     * </p>
     */
    private String directoryId;
    /**
     * <p>
     * The name of an AWS SNS topic the receives status messages from the directory.
     * </p>
     */
    private String topicName;
    /**
     * <p>
     * The SNS topic ARN (Amazon Resource Name).
     * </p>
     */
    private String topicArn;
    /**
     * <p>
     * The date and time of when you associated your directory with the SNS topic.
     * </p>
     */
    private java.util.Date createdDateTime;
    /**
     * <p>
     * The topic registration status.
     * </p>
     */
    private String status;

    /**
     * <p>
     * The Directory ID of an AWS Directory Service directory that will publish status messages to an SNS topic.
     * </p>
     * 
     * @param directoryId
     *        The Directory ID of an AWS Directory Service directory that will publish status messages to an SNS topic.
     */

    public void setDirectoryId(String directoryId) {
        this.directoryId = directoryId;
    }

    /**
     * <p>
     * The Directory ID of an AWS Directory Service directory that will publish status messages to an SNS topic.
     * </p>
     * 
     * @return The Directory ID of an AWS Directory Service directory that will publish status messages to an SNS topic.
     */

    public String getDirectoryId() {
        return this.directoryId;
    }

    /**
     * <p>
     * The Directory ID of an AWS Directory Service directory that will publish status messages to an SNS topic.
     * </p>
     * 
     * @param directoryId
     *        The Directory ID of an AWS Directory Service directory that will publish status messages to an SNS topic.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EventTopic withDirectoryId(String directoryId) {
        setDirectoryId(directoryId);
        return this;
    }

    /**
     * <p>
     * The name of an AWS SNS topic the receives status messages from the directory.
     * </p>
     * 
     * @param topicName
     *        The name of an AWS SNS topic the receives status messages from the directory.
     */

    public void setTopicName(String topicName) {
        this.topicName = topicName;
    }

    /**
     * <p>
     * The name of an AWS SNS topic the receives status messages from the directory.
     * </p>
     * 
     * @return The name of an AWS SNS topic the receives status messages from the directory.
     */

    public String getTopicName() {
        return this.topicName;
    }

    /**
     * <p>
     * The name of an AWS SNS topic the receives status messages from the directory.
     * </p>
     * 
     * @param topicName
     *        The name of an AWS SNS topic the receives status messages from the directory.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EventTopic withTopicName(String topicName) {
        setTopicName(topicName);
        return this;
    }

    /**
     * <p>
     * The SNS topic ARN (Amazon Resource Name).
     * </p>
     * 
     * @param topicArn
     *        The SNS topic ARN (Amazon Resource Name).
     */

    public void setTopicArn(String topicArn) {
        this.topicArn = topicArn;
    }

    /**
     * <p>
     * The SNS topic ARN (Amazon Resource Name).
     * </p>
     * 
     * @return The SNS topic ARN (Amazon Resource Name).
     */

    public String getTopicArn() {
        return this.topicArn;
    }

    /**
     * <p>
     * The SNS topic ARN (Amazon Resource Name).
     * </p>
     * 
     * @param topicArn
     *        The SNS topic ARN (Amazon Resource Name).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EventTopic withTopicArn(String topicArn) {
        setTopicArn(topicArn);
        return this;
    }

    /**
     * <p>
     * The date and time of when you associated your directory with the SNS topic.
     * </p>
     * 
     * @param createdDateTime
     *        The date and time of when you associated your directory with the SNS topic.
     */

    public void setCreatedDateTime(java.util.Date createdDateTime) {
        this.createdDateTime = createdDateTime;
    }

    /**
     * <p>
     * The date and time of when you associated your directory with the SNS topic.
     * </p>
     * 
     * @return The date and time of when you associated your directory with the SNS topic.
     */

    public java.util.Date getCreatedDateTime() {
        return this.createdDateTime;
    }

    /**
     * <p>
     * The date and time of when you associated your directory with the SNS topic.
     * </p>
     * 
     * @param createdDateTime
     *        The date and time of when you associated your directory with the SNS topic.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EventTopic withCreatedDateTime(java.util.Date createdDateTime) {
        setCreatedDateTime(createdDateTime);
        return this;
    }

    /**
     * <p>
     * The topic registration status.
     * </p>
     * 
     * @param status
     *        The topic registration status.
     * @see TopicStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The topic registration status.
     * </p>
     * 
     * @return The topic registration status.
     * @see TopicStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The topic registration status.
     * </p>
     * 
     * @param status
     *        The topic registration status.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TopicStatus
     */

    public EventTopic withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The topic registration status.
     * </p>
     * 
     * @param status
     *        The topic registration status.
     * @see TopicStatus
     */

    public void setStatus(TopicStatus status) {
        withStatus(status);
    }

    /**
     * <p>
     * The topic registration status.
     * </p>
     * 
     * @param status
     *        The topic registration status.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TopicStatus
     */

    public EventTopic withStatus(TopicStatus status) {
        this.status = status.toString();
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
        if (getDirectoryId() != null)
            sb.append("DirectoryId: ").append(getDirectoryId()).append(",");
        if (getTopicName() != null)
            sb.append("TopicName: ").append(getTopicName()).append(",");
        if (getTopicArn() != null)
            sb.append("TopicArn: ").append(getTopicArn()).append(",");
        if (getCreatedDateTime() != null)
            sb.append("CreatedDateTime: ").append(getCreatedDateTime()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EventTopic == false)
            return false;
        EventTopic other = (EventTopic) obj;
        if (other.getDirectoryId() == null ^ this.getDirectoryId() == null)
            return false;
        if (other.getDirectoryId() != null && other.getDirectoryId().equals(this.getDirectoryId()) == false)
            return false;
        if (other.getTopicName() == null ^ this.getTopicName() == null)
            return false;
        if (other.getTopicName() != null && other.getTopicName().equals(this.getTopicName()) == false)
            return false;
        if (other.getTopicArn() == null ^ this.getTopicArn() == null)
            return false;
        if (other.getTopicArn() != null && other.getTopicArn().equals(this.getTopicArn()) == false)
            return false;
        if (other.getCreatedDateTime() == null ^ this.getCreatedDateTime() == null)
            return false;
        if (other.getCreatedDateTime() != null && other.getCreatedDateTime().equals(this.getCreatedDateTime()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDirectoryId() == null) ? 0 : getDirectoryId().hashCode());
        hashCode = prime * hashCode + ((getTopicName() == null) ? 0 : getTopicName().hashCode());
        hashCode = prime * hashCode + ((getTopicArn() == null) ? 0 : getTopicArn().hashCode());
        hashCode = prime * hashCode + ((getCreatedDateTime() == null) ? 0 : getCreatedDateTime().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public EventTopic clone() {
        try {
            return (EventTopic) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.directory.model.transform.EventTopicMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
