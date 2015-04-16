/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.cognitosync.model;

import java.io.Serializable;

/**
 * <p>
 * Configuration options for configure Cognito streams.
 * </p>
 */
public class CognitoStreams implements Serializable, Cloneable {

    /**
     * The name of the Cognito stream to receive updates. This stream must be
     * in the developers account and in the same region as the identity pool.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     */
    private String streamName;

    /**
     * The ARN of the role Amazon Cognito can assume in order to publish to
     * the stream. This role must grant access to Amazon Cognito
     * (cognito-sync) to invoke PutRecord on your Cognito stream.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     * <b>Pattern: </b>arn:aws:iam::\d+:role/.*<br/>
     */
    private String roleArn;

    /**
     * Status of the Cognito streams. Valid values are: <p>ENABLED -
     * Streaming of updates to identity pool is enabled. <p>DISABLED -
     * Streaming of updates to identity pool is disabled. Bulk publish will
     * also fail if StreamingStatus is DISABLED.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENABLED, DISABLED
     */
    private String streamingStatus;

    /**
     * The name of the Cognito stream to receive updates. This stream must be
     * in the developers account and in the same region as the identity pool.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     *
     * @return The name of the Cognito stream to receive updates. This stream must be
     *         in the developers account and in the same region as the identity pool.
     */
    public String getStreamName() {
        return streamName;
    }
    
    /**
     * The name of the Cognito stream to receive updates. This stream must be
     * in the developers account and in the same region as the identity pool.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     *
     * @param streamName The name of the Cognito stream to receive updates. This stream must be
     *         in the developers account and in the same region as the identity pool.
     */
    public void setStreamName(String streamName) {
        this.streamName = streamName;
    }
    
    /**
     * The name of the Cognito stream to receive updates. This stream must be
     * in the developers account and in the same region as the identity pool.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     *
     * @param streamName The name of the Cognito stream to receive updates. This stream must be
     *         in the developers account and in the same region as the identity pool.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CognitoStreams withStreamName(String streamName) {
        this.streamName = streamName;
        return this;
    }

    /**
     * The ARN of the role Amazon Cognito can assume in order to publish to
     * the stream. This role must grant access to Amazon Cognito
     * (cognito-sync) to invoke PutRecord on your Cognito stream.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     * <b>Pattern: </b>arn:aws:iam::\d+:role/.*<br/>
     *
     * @return The ARN of the role Amazon Cognito can assume in order to publish to
     *         the stream. This role must grant access to Amazon Cognito
     *         (cognito-sync) to invoke PutRecord on your Cognito stream.
     */
    public String getRoleArn() {
        return roleArn;
    }
    
    /**
     * The ARN of the role Amazon Cognito can assume in order to publish to
     * the stream. This role must grant access to Amazon Cognito
     * (cognito-sync) to invoke PutRecord on your Cognito stream.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     * <b>Pattern: </b>arn:aws:iam::\d+:role/.*<br/>
     *
     * @param roleArn The ARN of the role Amazon Cognito can assume in order to publish to
     *         the stream. This role must grant access to Amazon Cognito
     *         (cognito-sync) to invoke PutRecord on your Cognito stream.
     */
    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }
    
    /**
     * The ARN of the role Amazon Cognito can assume in order to publish to
     * the stream. This role must grant access to Amazon Cognito
     * (cognito-sync) to invoke PutRecord on your Cognito stream.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     * <b>Pattern: </b>arn:aws:iam::\d+:role/.*<br/>
     *
     * @param roleArn The ARN of the role Amazon Cognito can assume in order to publish to
     *         the stream. This role must grant access to Amazon Cognito
     *         (cognito-sync) to invoke PutRecord on your Cognito stream.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CognitoStreams withRoleArn(String roleArn) {
        this.roleArn = roleArn;
        return this;
    }

    /**
     * Status of the Cognito streams. Valid values are: <p>ENABLED -
     * Streaming of updates to identity pool is enabled. <p>DISABLED -
     * Streaming of updates to identity pool is disabled. Bulk publish will
     * also fail if StreamingStatus is DISABLED.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENABLED, DISABLED
     *
     * @return Status of the Cognito streams. Valid values are: <p>ENABLED -
     *         Streaming of updates to identity pool is enabled. <p>DISABLED -
     *         Streaming of updates to identity pool is disabled. Bulk publish will
     *         also fail if StreamingStatus is DISABLED.
     *
     * @see StreamingStatus
     */
    public String getStreamingStatus() {
        return streamingStatus;
    }
    
    /**
     * Status of the Cognito streams. Valid values are: <p>ENABLED -
     * Streaming of updates to identity pool is enabled. <p>DISABLED -
     * Streaming of updates to identity pool is disabled. Bulk publish will
     * also fail if StreamingStatus is DISABLED.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENABLED, DISABLED
     *
     * @param streamingStatus Status of the Cognito streams. Valid values are: <p>ENABLED -
     *         Streaming of updates to identity pool is enabled. <p>DISABLED -
     *         Streaming of updates to identity pool is disabled. Bulk publish will
     *         also fail if StreamingStatus is DISABLED.
     *
     * @see StreamingStatus
     */
    public void setStreamingStatus(String streamingStatus) {
        this.streamingStatus = streamingStatus;
    }
    
    /**
     * Status of the Cognito streams. Valid values are: <p>ENABLED -
     * Streaming of updates to identity pool is enabled. <p>DISABLED -
     * Streaming of updates to identity pool is disabled. Bulk publish will
     * also fail if StreamingStatus is DISABLED.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENABLED, DISABLED
     *
     * @param streamingStatus Status of the Cognito streams. Valid values are: <p>ENABLED -
     *         Streaming of updates to identity pool is enabled. <p>DISABLED -
     *         Streaming of updates to identity pool is disabled. Bulk publish will
     *         also fail if StreamingStatus is DISABLED.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see StreamingStatus
     */
    public CognitoStreams withStreamingStatus(String streamingStatus) {
        this.streamingStatus = streamingStatus;
        return this;
    }

    /**
     * Status of the Cognito streams. Valid values are: <p>ENABLED -
     * Streaming of updates to identity pool is enabled. <p>DISABLED -
     * Streaming of updates to identity pool is disabled. Bulk publish will
     * also fail if StreamingStatus is DISABLED.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENABLED, DISABLED
     *
     * @param streamingStatus Status of the Cognito streams. Valid values are: <p>ENABLED -
     *         Streaming of updates to identity pool is enabled. <p>DISABLED -
     *         Streaming of updates to identity pool is disabled. Bulk publish will
     *         also fail if StreamingStatus is DISABLED.
     *
     * @see StreamingStatus
     */
    public void setStreamingStatus(StreamingStatus streamingStatus) {
        this.streamingStatus = streamingStatus.toString();
    }
    
    /**
     * Status of the Cognito streams. Valid values are: <p>ENABLED -
     * Streaming of updates to identity pool is enabled. <p>DISABLED -
     * Streaming of updates to identity pool is disabled. Bulk publish will
     * also fail if StreamingStatus is DISABLED.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENABLED, DISABLED
     *
     * @param streamingStatus Status of the Cognito streams. Valid values are: <p>ENABLED -
     *         Streaming of updates to identity pool is enabled. <p>DISABLED -
     *         Streaming of updates to identity pool is disabled. Bulk publish will
     *         also fail if StreamingStatus is DISABLED.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see StreamingStatus
     */
    public CognitoStreams withStreamingStatus(StreamingStatus streamingStatus) {
        this.streamingStatus = streamingStatus.toString();
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
        if (getStreamName() != null) sb.append("StreamName: " + getStreamName() + ",");
        if (getRoleArn() != null) sb.append("RoleArn: " + getRoleArn() + ",");
        if (getStreamingStatus() != null) sb.append("StreamingStatus: " + getStreamingStatus() );
        sb.append("}");
        return sb.toString();
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
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof CognitoStreams == false) return false;
        CognitoStreams other = (CognitoStreams)obj;
        
        if (other.getStreamName() == null ^ this.getStreamName() == null) return false;
        if (other.getStreamName() != null && other.getStreamName().equals(this.getStreamName()) == false) return false; 
        if (other.getRoleArn() == null ^ this.getRoleArn() == null) return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false) return false; 
        if (other.getStreamingStatus() == null ^ this.getStreamingStatus() == null) return false;
        if (other.getStreamingStatus() != null && other.getStreamingStatus().equals(this.getStreamingStatus()) == false) return false; 
        return true;
    }
    
    @Override
    public CognitoStreams clone() {
        try {
            return (CognitoStreams) super.clone();
        
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                    + "even though we're Cloneable!",
                    e);
        }
        
    }

}
    