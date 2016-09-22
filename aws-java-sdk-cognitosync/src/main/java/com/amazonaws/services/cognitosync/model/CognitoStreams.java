/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.cognitosync.model;

import java.io.Serializable;

/**
 * Configuration options for configure Cognito streams.
 */
public class CognitoStreams implements Serializable, Cloneable {

    /**
     * The name of the Cognito stream to receive updates. This stream must be in the developers account and in the same
     * region as the identity pool.
     */
    private String streamName;
    /**
     * The ARN of the role Amazon Cognito can assume in order to publish to the stream. This role must grant access to
     * Amazon Cognito (cognito-sync) to invoke PutRecord on your Cognito stream.
     */
    private String roleArn;
    /**
     * Status of the Cognito streams. Valid values are:
     * <p>
     * ENABLED - Streaming of updates to identity pool is enabled.
     * </p>
     * <p>
     * DISABLED - Streaming of updates to identity pool is disabled. Bulk publish will also fail if StreamingStatus is
     * DISABLED.
     * </p>
     */
    private String streamingStatus;

    /**
     * The name of the Cognito stream to receive updates. This stream must be in the developers account and in the same
     * region as the identity pool.
     * 
     * @param streamName
     *        The name of the Cognito stream to receive updates. This stream must be in the developers account and in
     *        the same region as the identity pool.
     */

    public void setStreamName(String streamName) {
        this.streamName = streamName;
    }

    /**
     * The name of the Cognito stream to receive updates. This stream must be in the developers account and in the same
     * region as the identity pool.
     * 
     * @return The name of the Cognito stream to receive updates. This stream must be in the developers account and in
     *         the same region as the identity pool.
     */

    public String getStreamName() {
        return this.streamName;
    }

    /**
     * The name of the Cognito stream to receive updates. This stream must be in the developers account and in the same
     * region as the identity pool.
     * 
     * @param streamName
     *        The name of the Cognito stream to receive updates. This stream must be in the developers account and in
     *        the same region as the identity pool.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CognitoStreams withStreamName(String streamName) {
        setStreamName(streamName);
        return this;
    }

    /**
     * The ARN of the role Amazon Cognito can assume in order to publish to the stream. This role must grant access to
     * Amazon Cognito (cognito-sync) to invoke PutRecord on your Cognito stream.
     * 
     * @param roleArn
     *        The ARN of the role Amazon Cognito can assume in order to publish to the stream. This role must grant
     *        access to Amazon Cognito (cognito-sync) to invoke PutRecord on your Cognito stream.
     */

    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * The ARN of the role Amazon Cognito can assume in order to publish to the stream. This role must grant access to
     * Amazon Cognito (cognito-sync) to invoke PutRecord on your Cognito stream.
     * 
     * @return The ARN of the role Amazon Cognito can assume in order to publish to the stream. This role must grant
     *         access to Amazon Cognito (cognito-sync) to invoke PutRecord on your Cognito stream.
     */

    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * The ARN of the role Amazon Cognito can assume in order to publish to the stream. This role must grant access to
     * Amazon Cognito (cognito-sync) to invoke PutRecord on your Cognito stream.
     * 
     * @param roleArn
     *        The ARN of the role Amazon Cognito can assume in order to publish to the stream. This role must grant
     *        access to Amazon Cognito (cognito-sync) to invoke PutRecord on your Cognito stream.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CognitoStreams withRoleArn(String roleArn) {
        setRoleArn(roleArn);
        return this;
    }

    /**
     * Status of the Cognito streams. Valid values are:
     * <p>
     * ENABLED - Streaming of updates to identity pool is enabled.
     * </p>
     * <p>
     * DISABLED - Streaming of updates to identity pool is disabled. Bulk publish will also fail if StreamingStatus is
     * DISABLED.
     * </p>
     * 
     * @param streamingStatus
     *        Status of the Cognito streams. Valid values are:
     *        <p>
     *        ENABLED - Streaming of updates to identity pool is enabled.
     *        </p>
     *        <p>
     *        DISABLED - Streaming of updates to identity pool is disabled. Bulk publish will also fail if
     *        StreamingStatus is DISABLED.
     *        </p>
     * @see StreamingStatus
     */

    public void setStreamingStatus(String streamingStatus) {
        this.streamingStatus = streamingStatus;
    }

    /**
     * Status of the Cognito streams. Valid values are:
     * <p>
     * ENABLED - Streaming of updates to identity pool is enabled.
     * </p>
     * <p>
     * DISABLED - Streaming of updates to identity pool is disabled. Bulk publish will also fail if StreamingStatus is
     * DISABLED.
     * </p>
     * 
     * @return Status of the Cognito streams. Valid values are:
     *         <p>
     *         ENABLED - Streaming of updates to identity pool is enabled.
     *         </p>
     *         <p>
     *         DISABLED - Streaming of updates to identity pool is disabled. Bulk publish will also fail if
     *         StreamingStatus is DISABLED.
     *         </p>
     * @see StreamingStatus
     */

    public String getStreamingStatus() {
        return this.streamingStatus;
    }

    /**
     * Status of the Cognito streams. Valid values are:
     * <p>
     * ENABLED - Streaming of updates to identity pool is enabled.
     * </p>
     * <p>
     * DISABLED - Streaming of updates to identity pool is disabled. Bulk publish will also fail if StreamingStatus is
     * DISABLED.
     * </p>
     * 
     * @param streamingStatus
     *        Status of the Cognito streams. Valid values are:
     *        <p>
     *        ENABLED - Streaming of updates to identity pool is enabled.
     *        </p>
     *        <p>
     *        DISABLED - Streaming of updates to identity pool is disabled. Bulk publish will also fail if
     *        StreamingStatus is DISABLED.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StreamingStatus
     */

    public CognitoStreams withStreamingStatus(String streamingStatus) {
        setStreamingStatus(streamingStatus);
        return this;
    }

    /**
     * Status of the Cognito streams. Valid values are:
     * <p>
     * ENABLED - Streaming of updates to identity pool is enabled.
     * </p>
     * <p>
     * DISABLED - Streaming of updates to identity pool is disabled. Bulk publish will also fail if StreamingStatus is
     * DISABLED.
     * </p>
     * 
     * @param streamingStatus
     *        Status of the Cognito streams. Valid values are:
     *        <p>
     *        ENABLED - Streaming of updates to identity pool is enabled.
     *        </p>
     *        <p>
     *        DISABLED - Streaming of updates to identity pool is disabled. Bulk publish will also fail if
     *        StreamingStatus is DISABLED.
     *        </p>
     * @see StreamingStatus
     */

    public void setStreamingStatus(StreamingStatus streamingStatus) {
        this.streamingStatus = streamingStatus.toString();
    }

    /**
     * Status of the Cognito streams. Valid values are:
     * <p>
     * ENABLED - Streaming of updates to identity pool is enabled.
     * </p>
     * <p>
     * DISABLED - Streaming of updates to identity pool is disabled. Bulk publish will also fail if StreamingStatus is
     * DISABLED.
     * </p>
     * 
     * @param streamingStatus
     *        Status of the Cognito streams. Valid values are:
     *        <p>
     *        ENABLED - Streaming of updates to identity pool is enabled.
     *        </p>
     *        <p>
     *        DISABLED - Streaming of updates to identity pool is disabled. Bulk publish will also fail if
     *        StreamingStatus is DISABLED.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StreamingStatus
     */

    public CognitoStreams withStreamingStatus(StreamingStatus streamingStatus) {
        setStreamingStatus(streamingStatus);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
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
            sb.append("StreamName: " + getStreamName() + ",");
        if (getRoleArn() != null)
            sb.append("RoleArn: " + getRoleArn() + ",");
        if (getStreamingStatus() != null)
            sb.append("StreamingStatus: " + getStreamingStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CognitoStreams == false)
            return false;
        CognitoStreams other = (CognitoStreams) obj;
        if (other.getStreamName() == null ^ this.getStreamName() == null)
            return false;
        if (other.getStreamName() != null && other.getStreamName().equals(this.getStreamName()) == false)
            return false;
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        if (other.getStreamingStatus() == null ^ this.getStreamingStatus() == null)
            return false;
        if (other.getStreamingStatus() != null && other.getStreamingStatus().equals(this.getStreamingStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStreamName() == null) ? 0 : getStreamName().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        hashCode = prime * hashCode + ((getStreamingStatus() == null) ? 0 : getStreamingStatus().hashCode());
        return hashCode;
    }

    @Override
    public CognitoStreams clone() {
        try {
            return (CognitoStreams) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
