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
package com.amazonaws.services.nimblestudio.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/nimble-2020-08-01/StreamingSession" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StreamingSession implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ARN of the resource.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The Unix epoch timestamp in seconds for when the resource was created.
     * </p>
     */
    private java.util.Date createdAt;
    /**
     * <p>
     * The user ID of the user that created the streaming session.
     * </p>
     */
    private String createdBy;
    /**
     * <p>
     * The EC2 Instance type used for the streaming session.
     * </p>
     */
    private String ec2InstanceType;
    /**
     * <p>
     * The ID of the launch profile used to control access from the streaming session.
     * </p>
     */
    private String launchProfileId;
    /**
     * <p>
     * The session ID.
     * </p>
     */
    private String sessionId;
    /**
     * <p>
     * The current state.
     * </p>
     */
    private String state;
    /**
     * <p>
     * The status code.
     * </p>
     */
    private String statusCode;
    /**
     * <p>
     * The status message for the streaming session.
     * </p>
     */
    private String statusMessage;
    /**
     * <p>
     * The ID of the streaming image.
     * </p>
     */
    private String streamingImageId;
    /**
     * <p>
     * A collection of labels, in the form of key:value pairs, that apply to this resource.
     * </p>
     */
    private java.util.Map<String, String> tags;
    /**
     * <p>
     * The time the streaming session will automatically terminate if not terminated by the user.
     * </p>
     */
    private java.util.Date terminateAt;
    /**
     * <p>
     * The Unix epoch timestamp in seconds for when the resource was updated.
     * </p>
     */
    private java.util.Date updatedAt;
    /**
     * <p>
     * The user ID of the user that most recently updated the resource.
     * </p>
     */
    private String updatedBy;

    /**
     * <p>
     * The ARN of the resource.
     * </p>
     * 
     * @param arn
     *        The ARN of the resource.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The ARN of the resource.
     * </p>
     * 
     * @return The ARN of the resource.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The ARN of the resource.
     * </p>
     * 
     * @param arn
     *        The ARN of the resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StreamingSession withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The Unix epoch timestamp in seconds for when the resource was created.
     * </p>
     * 
     * @param createdAt
     *        The Unix epoch timestamp in seconds for when the resource was created.
     */

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * The Unix epoch timestamp in seconds for when the resource was created.
     * </p>
     * 
     * @return The Unix epoch timestamp in seconds for when the resource was created.
     */

    public java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    /**
     * <p>
     * The Unix epoch timestamp in seconds for when the resource was created.
     * </p>
     * 
     * @param createdAt
     *        The Unix epoch timestamp in seconds for when the resource was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StreamingSession withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
        return this;
    }

    /**
     * <p>
     * The user ID of the user that created the streaming session.
     * </p>
     * 
     * @param createdBy
     *        The user ID of the user that created the streaming session.
     */

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    /**
     * <p>
     * The user ID of the user that created the streaming session.
     * </p>
     * 
     * @return The user ID of the user that created the streaming session.
     */

    public String getCreatedBy() {
        return this.createdBy;
    }

    /**
     * <p>
     * The user ID of the user that created the streaming session.
     * </p>
     * 
     * @param createdBy
     *        The user ID of the user that created the streaming session.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StreamingSession withCreatedBy(String createdBy) {
        setCreatedBy(createdBy);
        return this;
    }

    /**
     * <p>
     * The EC2 Instance type used for the streaming session.
     * </p>
     * 
     * @param ec2InstanceType
     *        The EC2 Instance type used for the streaming session.
     */

    public void setEc2InstanceType(String ec2InstanceType) {
        this.ec2InstanceType = ec2InstanceType;
    }

    /**
     * <p>
     * The EC2 Instance type used for the streaming session.
     * </p>
     * 
     * @return The EC2 Instance type used for the streaming session.
     */

    public String getEc2InstanceType() {
        return this.ec2InstanceType;
    }

    /**
     * <p>
     * The EC2 Instance type used for the streaming session.
     * </p>
     * 
     * @param ec2InstanceType
     *        The EC2 Instance type used for the streaming session.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StreamingSession withEc2InstanceType(String ec2InstanceType) {
        setEc2InstanceType(ec2InstanceType);
        return this;
    }

    /**
     * <p>
     * The ID of the launch profile used to control access from the streaming session.
     * </p>
     * 
     * @param launchProfileId
     *        The ID of the launch profile used to control access from the streaming session.
     */

    public void setLaunchProfileId(String launchProfileId) {
        this.launchProfileId = launchProfileId;
    }

    /**
     * <p>
     * The ID of the launch profile used to control access from the streaming session.
     * </p>
     * 
     * @return The ID of the launch profile used to control access from the streaming session.
     */

    public String getLaunchProfileId() {
        return this.launchProfileId;
    }

    /**
     * <p>
     * The ID of the launch profile used to control access from the streaming session.
     * </p>
     * 
     * @param launchProfileId
     *        The ID of the launch profile used to control access from the streaming session.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StreamingSession withLaunchProfileId(String launchProfileId) {
        setLaunchProfileId(launchProfileId);
        return this;
    }

    /**
     * <p>
     * The session ID.
     * </p>
     * 
     * @param sessionId
     *        The session ID.
     */

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    /**
     * <p>
     * The session ID.
     * </p>
     * 
     * @return The session ID.
     */

    public String getSessionId() {
        return this.sessionId;
    }

    /**
     * <p>
     * The session ID.
     * </p>
     * 
     * @param sessionId
     *        The session ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StreamingSession withSessionId(String sessionId) {
        setSessionId(sessionId);
        return this;
    }

    /**
     * <p>
     * The current state.
     * </p>
     * 
     * @param state
     *        The current state.
     * @see StreamingSessionState
     */

    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The current state.
     * </p>
     * 
     * @return The current state.
     * @see StreamingSessionState
     */

    public String getState() {
        return this.state;
    }

    /**
     * <p>
     * The current state.
     * </p>
     * 
     * @param state
     *        The current state.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StreamingSessionState
     */

    public StreamingSession withState(String state) {
        setState(state);
        return this;
    }

    /**
     * <p>
     * The current state.
     * </p>
     * 
     * @param state
     *        The current state.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StreamingSessionState
     */

    public StreamingSession withState(StreamingSessionState state) {
        this.state = state.toString();
        return this;
    }

    /**
     * <p>
     * The status code.
     * </p>
     * 
     * @param statusCode
     *        The status code.
     * @see StreamingSessionStatusCode
     */

    public void setStatusCode(String statusCode) {
        this.statusCode = statusCode;
    }

    /**
     * <p>
     * The status code.
     * </p>
     * 
     * @return The status code.
     * @see StreamingSessionStatusCode
     */

    public String getStatusCode() {
        return this.statusCode;
    }

    /**
     * <p>
     * The status code.
     * </p>
     * 
     * @param statusCode
     *        The status code.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StreamingSessionStatusCode
     */

    public StreamingSession withStatusCode(String statusCode) {
        setStatusCode(statusCode);
        return this;
    }

    /**
     * <p>
     * The status code.
     * </p>
     * 
     * @param statusCode
     *        The status code.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StreamingSessionStatusCode
     */

    public StreamingSession withStatusCode(StreamingSessionStatusCode statusCode) {
        this.statusCode = statusCode.toString();
        return this;
    }

    /**
     * <p>
     * The status message for the streaming session.
     * </p>
     * 
     * @param statusMessage
     *        The status message for the streaming session.
     */

    public void setStatusMessage(String statusMessage) {
        this.statusMessage = statusMessage;
    }

    /**
     * <p>
     * The status message for the streaming session.
     * </p>
     * 
     * @return The status message for the streaming session.
     */

    public String getStatusMessage() {
        return this.statusMessage;
    }

    /**
     * <p>
     * The status message for the streaming session.
     * </p>
     * 
     * @param statusMessage
     *        The status message for the streaming session.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StreamingSession withStatusMessage(String statusMessage) {
        setStatusMessage(statusMessage);
        return this;
    }

    /**
     * <p>
     * The ID of the streaming image.
     * </p>
     * 
     * @param streamingImageId
     *        The ID of the streaming image.
     */

    public void setStreamingImageId(String streamingImageId) {
        this.streamingImageId = streamingImageId;
    }

    /**
     * <p>
     * The ID of the streaming image.
     * </p>
     * 
     * @return The ID of the streaming image.
     */

    public String getStreamingImageId() {
        return this.streamingImageId;
    }

    /**
     * <p>
     * The ID of the streaming image.
     * </p>
     * 
     * @param streamingImageId
     *        The ID of the streaming image.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StreamingSession withStreamingImageId(String streamingImageId) {
        setStreamingImageId(streamingImageId);
        return this;
    }

    /**
     * <p>
     * A collection of labels, in the form of key:value pairs, that apply to this resource.
     * </p>
     * 
     * @return A collection of labels, in the form of key:value pairs, that apply to this resource.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * A collection of labels, in the form of key:value pairs, that apply to this resource.
     * </p>
     * 
     * @param tags
     *        A collection of labels, in the form of key:value pairs, that apply to this resource.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * A collection of labels, in the form of key:value pairs, that apply to this resource.
     * </p>
     * 
     * @param tags
     *        A collection of labels, in the form of key:value pairs, that apply to this resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StreamingSession withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see StreamingSession#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public StreamingSession addTagsEntry(String key, String value) {
        if (null == this.tags) {
            this.tags = new java.util.HashMap<String, String>();
        }
        if (this.tags.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.tags.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Tags.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StreamingSession clearTagsEntries() {
        this.tags = null;
        return this;
    }

    /**
     * <p>
     * The time the streaming session will automatically terminate if not terminated by the user.
     * </p>
     * 
     * @param terminateAt
     *        The time the streaming session will automatically terminate if not terminated by the user.
     */

    public void setTerminateAt(java.util.Date terminateAt) {
        this.terminateAt = terminateAt;
    }

    /**
     * <p>
     * The time the streaming session will automatically terminate if not terminated by the user.
     * </p>
     * 
     * @return The time the streaming session will automatically terminate if not terminated by the user.
     */

    public java.util.Date getTerminateAt() {
        return this.terminateAt;
    }

    /**
     * <p>
     * The time the streaming session will automatically terminate if not terminated by the user.
     * </p>
     * 
     * @param terminateAt
     *        The time the streaming session will automatically terminate if not terminated by the user.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StreamingSession withTerminateAt(java.util.Date terminateAt) {
        setTerminateAt(terminateAt);
        return this;
    }

    /**
     * <p>
     * The Unix epoch timestamp in seconds for when the resource was updated.
     * </p>
     * 
     * @param updatedAt
     *        The Unix epoch timestamp in seconds for when the resource was updated.
     */

    public void setUpdatedAt(java.util.Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * <p>
     * The Unix epoch timestamp in seconds for when the resource was updated.
     * </p>
     * 
     * @return The Unix epoch timestamp in seconds for when the resource was updated.
     */

    public java.util.Date getUpdatedAt() {
        return this.updatedAt;
    }

    /**
     * <p>
     * The Unix epoch timestamp in seconds for when the resource was updated.
     * </p>
     * 
     * @param updatedAt
     *        The Unix epoch timestamp in seconds for when the resource was updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StreamingSession withUpdatedAt(java.util.Date updatedAt) {
        setUpdatedAt(updatedAt);
        return this;
    }

    /**
     * <p>
     * The user ID of the user that most recently updated the resource.
     * </p>
     * 
     * @param updatedBy
     *        The user ID of the user that most recently updated the resource.
     */

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }

    /**
     * <p>
     * The user ID of the user that most recently updated the resource.
     * </p>
     * 
     * @return The user ID of the user that most recently updated the resource.
     */

    public String getUpdatedBy() {
        return this.updatedBy;
    }

    /**
     * <p>
     * The user ID of the user that most recently updated the resource.
     * </p>
     * 
     * @param updatedBy
     *        The user ID of the user that most recently updated the resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StreamingSession withUpdatedBy(String updatedBy) {
        setUpdatedBy(updatedBy);
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
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getCreatedAt() != null)
            sb.append("CreatedAt: ").append(getCreatedAt()).append(",");
        if (getCreatedBy() != null)
            sb.append("CreatedBy: ").append(getCreatedBy()).append(",");
        if (getEc2InstanceType() != null)
            sb.append("Ec2InstanceType: ").append(getEc2InstanceType()).append(",");
        if (getLaunchProfileId() != null)
            sb.append("LaunchProfileId: ").append(getLaunchProfileId()).append(",");
        if (getSessionId() != null)
            sb.append("SessionId: ").append(getSessionId()).append(",");
        if (getState() != null)
            sb.append("State: ").append(getState()).append(",");
        if (getStatusCode() != null)
            sb.append("StatusCode: ").append(getStatusCode()).append(",");
        if (getStatusMessage() != null)
            sb.append("StatusMessage: ").append(getStatusMessage()).append(",");
        if (getStreamingImageId() != null)
            sb.append("StreamingImageId: ").append(getStreamingImageId()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
        if (getTerminateAt() != null)
            sb.append("TerminateAt: ").append(getTerminateAt()).append(",");
        if (getUpdatedAt() != null)
            sb.append("UpdatedAt: ").append(getUpdatedAt()).append(",");
        if (getUpdatedBy() != null)
            sb.append("UpdatedBy: ").append(getUpdatedBy());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StreamingSession == false)
            return false;
        StreamingSession other = (StreamingSession) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        if (other.getCreatedBy() == null ^ this.getCreatedBy() == null)
            return false;
        if (other.getCreatedBy() != null && other.getCreatedBy().equals(this.getCreatedBy()) == false)
            return false;
        if (other.getEc2InstanceType() == null ^ this.getEc2InstanceType() == null)
            return false;
        if (other.getEc2InstanceType() != null && other.getEc2InstanceType().equals(this.getEc2InstanceType()) == false)
            return false;
        if (other.getLaunchProfileId() == null ^ this.getLaunchProfileId() == null)
            return false;
        if (other.getLaunchProfileId() != null && other.getLaunchProfileId().equals(this.getLaunchProfileId()) == false)
            return false;
        if (other.getSessionId() == null ^ this.getSessionId() == null)
            return false;
        if (other.getSessionId() != null && other.getSessionId().equals(this.getSessionId()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        if (other.getStatusCode() == null ^ this.getStatusCode() == null)
            return false;
        if (other.getStatusCode() != null && other.getStatusCode().equals(this.getStatusCode()) == false)
            return false;
        if (other.getStatusMessage() == null ^ this.getStatusMessage() == null)
            return false;
        if (other.getStatusMessage() != null && other.getStatusMessage().equals(this.getStatusMessage()) == false)
            return false;
        if (other.getStreamingImageId() == null ^ this.getStreamingImageId() == null)
            return false;
        if (other.getStreamingImageId() != null && other.getStreamingImageId().equals(this.getStreamingImageId()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getTerminateAt() == null ^ this.getTerminateAt() == null)
            return false;
        if (other.getTerminateAt() != null && other.getTerminateAt().equals(this.getTerminateAt()) == false)
            return false;
        if (other.getUpdatedAt() == null ^ this.getUpdatedAt() == null)
            return false;
        if (other.getUpdatedAt() != null && other.getUpdatedAt().equals(this.getUpdatedAt()) == false)
            return false;
        if (other.getUpdatedBy() == null ^ this.getUpdatedBy() == null)
            return false;
        if (other.getUpdatedBy() != null && other.getUpdatedBy().equals(this.getUpdatedBy()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getCreatedBy() == null) ? 0 : getCreatedBy().hashCode());
        hashCode = prime * hashCode + ((getEc2InstanceType() == null) ? 0 : getEc2InstanceType().hashCode());
        hashCode = prime * hashCode + ((getLaunchProfileId() == null) ? 0 : getLaunchProfileId().hashCode());
        hashCode = prime * hashCode + ((getSessionId() == null) ? 0 : getSessionId().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode + ((getStatusCode() == null) ? 0 : getStatusCode().hashCode());
        hashCode = prime * hashCode + ((getStatusMessage() == null) ? 0 : getStatusMessage().hashCode());
        hashCode = prime * hashCode + ((getStreamingImageId() == null) ? 0 : getStreamingImageId().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getTerminateAt() == null) ? 0 : getTerminateAt().hashCode());
        hashCode = prime * hashCode + ((getUpdatedAt() == null) ? 0 : getUpdatedAt().hashCode());
        hashCode = prime * hashCode + ((getUpdatedBy() == null) ? 0 : getUpdatedBy().hashCode());
        return hashCode;
    }

    @Override
    public StreamingSession clone() {
        try {
            return (StreamingSession) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.nimblestudio.model.transform.StreamingSessionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
