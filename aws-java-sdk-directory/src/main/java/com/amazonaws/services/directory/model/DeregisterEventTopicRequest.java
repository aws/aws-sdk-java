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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Removes the specified directory as a publisher to the specified SNS topic.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ds-2015-04-16/DeregisterEventTopic" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeregisterEventTopicRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Directory ID to remove as a publisher. This directory will no longer send messages to the specified SNS
     * topic.
     * </p>
     */
    private String directoryId;
    /**
     * <p>
     * The name of the SNS topic from which to remove the directory as a publisher.
     * </p>
     */
    private String topicName;

    /**
     * <p>
     * The Directory ID to remove as a publisher. This directory will no longer send messages to the specified SNS
     * topic.
     * </p>
     * 
     * @param directoryId
     *        The Directory ID to remove as a publisher. This directory will no longer send messages to the specified
     *        SNS topic.
     */

    public void setDirectoryId(String directoryId) {
        this.directoryId = directoryId;
    }

    /**
     * <p>
     * The Directory ID to remove as a publisher. This directory will no longer send messages to the specified SNS
     * topic.
     * </p>
     * 
     * @return The Directory ID to remove as a publisher. This directory will no longer send messages to the specified
     *         SNS topic.
     */

    public String getDirectoryId() {
        return this.directoryId;
    }

    /**
     * <p>
     * The Directory ID to remove as a publisher. This directory will no longer send messages to the specified SNS
     * topic.
     * </p>
     * 
     * @param directoryId
     *        The Directory ID to remove as a publisher. This directory will no longer send messages to the specified
     *        SNS topic.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeregisterEventTopicRequest withDirectoryId(String directoryId) {
        setDirectoryId(directoryId);
        return this;
    }

    /**
     * <p>
     * The name of the SNS topic from which to remove the directory as a publisher.
     * </p>
     * 
     * @param topicName
     *        The name of the SNS topic from which to remove the directory as a publisher.
     */

    public void setTopicName(String topicName) {
        this.topicName = topicName;
    }

    /**
     * <p>
     * The name of the SNS topic from which to remove the directory as a publisher.
     * </p>
     * 
     * @return The name of the SNS topic from which to remove the directory as a publisher.
     */

    public String getTopicName() {
        return this.topicName;
    }

    /**
     * <p>
     * The name of the SNS topic from which to remove the directory as a publisher.
     * </p>
     * 
     * @param topicName
     *        The name of the SNS topic from which to remove the directory as a publisher.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeregisterEventTopicRequest withTopicName(String topicName) {
        setTopicName(topicName);
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
            sb.append("TopicName: ").append(getTopicName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeregisterEventTopicRequest == false)
            return false;
        DeregisterEventTopicRequest other = (DeregisterEventTopicRequest) obj;
        if (other.getDirectoryId() == null ^ this.getDirectoryId() == null)
            return false;
        if (other.getDirectoryId() != null && other.getDirectoryId().equals(this.getDirectoryId()) == false)
            return false;
        if (other.getTopicName() == null ^ this.getTopicName() == null)
            return false;
        if (other.getTopicName() != null && other.getTopicName().equals(this.getTopicName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDirectoryId() == null) ? 0 : getDirectoryId().hashCode());
        hashCode = prime * hashCode + ((getTopicName() == null) ? 0 : getTopicName().hashCode());
        return hashCode;
    }

    @Override
    public DeregisterEventTopicRequest clone() {
        return (DeregisterEventTopicRequest) super.clone();
    }

}
